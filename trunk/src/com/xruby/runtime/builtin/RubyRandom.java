package com.xruby.runtime.builtin;

import java.math.BigInteger;
import java.util.Arrays;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelModule;

@RubyLevelModule(name="Kernel")
public class RubyRandom {
	private static final int N = 624;
	private static final int M = 397;
	private static final int MATRIX_A = 0x9908b0df;
	private static final int UMASK = 0x80000000;
	private static final int LMASK = 0x7fffffff;
	private static int state[] = new int[N];
	private static int left = 1;
	private static int initf = 0;
	private static int state_idx; 

	private static boolean first = true;
	private static RubyValue saved_seed = new RubyFixnum(0); 
	
    private final static long multiplier = 0x5DEECE66DL;
    private final static long mask = (1 << 48) - 1;
    private static volatile long seedUniquifier = 8682522807148012L;
    
	private static int MIXBITS(int u, int v) { 
		return ((u) & UMASK) | ((v) & LMASK); 
	}
	
	private static int TWIST(int u, int v) {
		return (MIXBITS(u,v) >>> 1) ^ (((v&1) == 1) ? MATRIX_A : 0);
	}

	private static void init_genrand(int s) {
		int j;
		state[0] = s & 0xffffffff;
		for (j=1; j<N; j++) {
			state[j] = (1812433253 * (state[j-1] ^ (state[j-1] >>> 30)) + j);
	        /* See Knuth TAOCP Vol2. 3rd Ed. P.106 for multiplier. */
	        /* In the previous versions, MSBs of the seed affect   */
	        /* only MSBs of the array state[].                        */
	        /* 2002/01/09 modified by Makoto Matsumoto             */
	        state[j] &= 0xffffffff;  /* for >32 bit machines */
		}
		left = 1;
		initf = 1;
	}
	
	private static void init_by_array(int init_key[], int key_length) {
	    int i = 1, j = 0, k = (N>key_length ? N : key_length);
	    init_genrand(19650218);
	    for (; k > 0; k--) {
	        state[i] = (state[i] ^ ((state[i-1] ^ (state[i-1] >>> 30)) * 1664525))
	          + init_key[j] + j; /* non linear */
	        state[i] &= 0xffffffffL; /* for WORDSIZE > 32 machines */
	        i++; j++;
	        if (i>=N) { state[0] = state[N-1]; i=1; }
	        if (j>=key_length) j=0;
	    }
	    for (k=N-1; k > 0; k--) {
	        state[i] = (state[i] ^ ((state[i-1] ^ (state[i-1] >>> 30)) * 1566083941))
	          - i; /* non linear */
	        state[i] &= 0xffffffff; /* for WORDSIZE > 32 machines */
	        i++;
	        if (i>=N) { state[0] = state[N-1]; i=1; }
	    }

	    state[0] = 0x80000000; /* MSB is 1; assuring non-zero initial array */
	    left = 1;
	    initf = 1;
	}
	
	private static void next_state() {
	    int j;
	    int pi = 0;
	    
	    /* if init_genrand() has not been called, */
	    /* a default initial seed is used         */
	    if (initf==0) { 
	    	init_genrand(5489);
	    }

	    left = N;
	    state_idx = 0;
	    
	    for (j=N-M+1; --j > 0; pi++) 
	        state[pi] = state[pi+M] ^ TWIST(state[pi], state[pi+1]);

	    for (j=M; --j > 0; pi++) 
	        state[pi] = state[pi+M-N] ^ TWIST(state[pi], state[pi+1]);

	    state[pi] = state[pi+M-N] ^ TWIST(state[pi], state[0]);
	}

	/* generates a random number on [0,0xffffffff]-interval */
	private static int genrand_int32() {
	    int y;

	    if (--left == 0) next_state();
	    y = state[state_idx++];

	    /* Tempering */
	    y ^= (y >>> 11);
	    y ^= (y << 7) & 0x9d2c5680L;
	    y ^= (y << 15) & 0xefc60000L;
	    y ^= (y >>> 18);

	    return y;
	}

	/* generates a random number on [0,1) with 53-bit resolution*/
	private static double genrand_real() 
	{ 
	    long a=genrand_int32()>>>5, b=genrand_int32()>>>6; 
	    return(a*67108864.0+b)*(1.0/9007199254740992.0); 
	} 

	private static RubyValue rand_init(RubyValue vseed) {
		RubyValue seed, old;
		int len;
		int buf[];
		
		seed = vseed.toRubyInteger();
		
		if (seed instanceof RubyFixnum) {
			len = 4;
		} else if (seed instanceof RubyBignum) {
			len = ((RubyBignum)seed).size();
			if (len == 0)
				len = 4;
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, "failed to convert " + vseed.getRubyClass().getName() + " into Integer");
		}
		len = (len+3)/4;	
		buf = new int[len];
		Arrays.fill(buf, 0);
		
		if (seed instanceof RubyFixnum) {
			RubyFixnum s = (RubyFixnum)seed;
			buf[0] = s.toInt() >>> 1 & 0xffffffff;
		} else if (seed instanceof RubyBignum) {
			int i;
			int[] magarray = tointarray(((RubyBignum)seed).getInternal().toByteArray());
			for (i = magarray.length-1; 0 <= i; i--) {
				buf[i] |= magarray[i]; 
			}
		}
		
		while (1 < len && buf[len-1] == 0) {
			len--;
		}
		if (len <= 1) {
			init_genrand(buf[0]);
		} else {
			if (buf[len-1] == 1) {
				len--;
			}
			init_by_array(buf, len);
		}
			
		first = false;
		old = saved_seed;
		saved_seed = seed;
		return old;
	}

	private static RubyValue random_seed() {
		// TODO: improve the random seed
		// seeds the generator using a combination of the time, the process id, and a sequence number.
		long seed = ((++seedUniquifier + System.nanoTime()) ^ multiplier) & mask;
		return RubyBignum.bignorm(seed);
	}

	private static long make_mask(long x) {
	    x = x | x >>> 1;
	    x = x | x >>> 2;
	    x = x | x >>> 4;
	    x = x | x >>> 8;
	    x = x | x >>> 16;
	    return x;
	}
	
	private static long limited_rand(long limit) {
		long mask = make_mask(limit);
		long val = 0;
		for (int i = 0; i >= 0; i--) {
			if (mask >>> (i * 32) != 0) {
				val |= genrand_int32() << (i * 32);
				val &= mask;
				if (limit < val) {
					i = 1; 
					val = 0;
				}
			}
		}
		return val;
	}
    
	private static RubyValue limited_big_rand(RubyBignum limit) {
		long mask = 0, lim;
		int rnd;
		boolean boundary = true;
		int len = (limit.size() + 3)/4;

		int[] magarray = tointarray(limit.getInternal().toByteArray());
		int[] valmagarray = magarray.clone();
		
		for (int i = len-1; i >= 0; i--) {
			boolean set = true;
			lim = magarray[i];
	        mask = (mask!=0) ? 0xffffffff : make_mask(lim);
	        if (mask != 0) {
	            rnd = (int)(genrand_int32() & mask);
	            if (boundary) {
	                if (lim < rnd) {
	                	mask = 0;
	                	boundary = true;
	                	i = len;
	                	set = false;
	                }
	                if (rnd < lim)
	                    boundary = false;
	            }
	        } else {
                rnd = 0;
            }
	        if (set)
	        	valmagarray[i] = rnd;
		}
        byte[] b = new byte[4*valmagarray.length];
        for (int j = 0; j < valmagarray.length; j++) {
        	long value = valmagarray[j];
        	for (int i = 0; i < 4; i++) {
        		int offset = (3 - i) * 8;
        		b[4*j + i] = (byte) ((value >>> offset) & 0xFF);
        	}
        }
		return RubyBignum.bignorm(new BigInteger(1, b));
	}
	
    @RubyLevelMethod(name="srand")
    public static RubyValue srand(RubyValue receiver) {
        return srand(receiver, random_seed());
    }
    
    @RubyLevelMethod(name="srand")
    public static RubyValue srand(RubyValue receiver, RubyValue arg) {
        return rand_init(arg);
    }
	
	@RubyLevelMethod(name="rand")
	public static RubyValue rand(RubyValue receiver) {
		if (first) {
			rand_init(random_seed());
		}
        return new RubyFloat(genrand_real());
    }
	
	@RubyLevelMethod(name="rand")
	public static RubyValue rand(RubyValue receiver, RubyValue arg) {
		long val, max = 0;
		
		if (first) {
			rand_init(random_seed());
		}
		
		if (arg instanceof RubyFloat) {
			RubyFloat vmax = (RubyFloat)arg;
			if (vmax.doubleValue() <= Long.MAX_VALUE && vmax.doubleValue() >= Long.MIN_VALUE) {
				RubyValue tmp = vmax.floor();
				if (tmp instanceof RubyFixnum) {
					max = ((RubyFixnum)tmp).toInt();
				} else if (tmp instanceof RubyBignum) {
					max = ((RubyBignum)tmp).longValue();
				}
			} else {
				if (vmax.doubleValue() < 0) {
					arg = RubyBignum.bignorm((long)-vmax.doubleValue());
				} else {
					arg = RubyBignum.bignorm((long)vmax.doubleValue());
				}
			}
		} else if (arg == RubyConstant.QNIL) {
			max = 0;
		} else {
			arg = arg.toRubyInteger();
			max = arg.toInt();
		}
		
		if (arg instanceof RubyBignum) {
			RubyBignum vmax = (RubyBignum)arg;
			if (!vmax.sign()) {
				vmax = vmax.uminus();
			}
			RubyValue limit = RubyBignum.bignorm(vmax.op_sub(new RubyFixnum(1)));
			if (limit instanceof RubyFixnum) {
				max = limit.toInt() + 1;
			} else {
	            return limited_big_rand((RubyBignum)limit);
			}
		}

		if (max == 0) {
			return new RubyFloat(genrand_real());
		}
		
		if (max < 0) {
			max = -max;
		}
	    val = limited_rand(max-1);
	    if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
	    	return new RubyFixnum((int)val);
	    } else {
	    	return RubyBignum.bignorm(val);
	    }
    }
	
	private static int[] tointarray(byte[] bytearray) {
		int keep;

		// Find first nonzero byte
		for (keep=0; keep<bytearray.length && bytearray[keep]==0; keep++)
		    ;
		
        int byteLength = bytearray.length;

        // Allocate new array and copy relevant part of input array
        int intLength = (byteLength - keep + 3)/4;
        int[] result = new int[intLength];
        int b = byteLength - 1;
        for (int i = intLength-1; i >= 0; i--) {
            result[i] = bytearray[b--] & 0xff;
            int bytesRemaining = b - keep + 1;
            int bytesToTransfer = Math.min(3, bytesRemaining);
            for (int j=8; j <= 8*bytesToTransfer; j += 8)
                result[i] |= ((bytearray[b--] & 0xff) << j);
        }
        return result;
    }
}
