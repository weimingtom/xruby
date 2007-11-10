package com.xruby.runtime.builtin;

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
	private static final long MATRIX_A = 0x9908b0dfL;
	private static final long UMASK = 0x80000000L;
	private static final long LMASK = 0x7fffffffL;
	private static long state[] = new long[N];
	private static int left = 1;
	private static int initf = 0;
	private static int state_idx; 

	private static boolean first = true;
	private static RubyValue saved_seed = new RubyFixnum(0); 
	
    private final static long multiplier = 0x5DEECE66DL;
    private final static long mask = (1 << 48) - 1;
    private static volatile long seedUniquifier = 8682522807148012L;
    
	private static long MIXBITS(long u, long v) { 
		return ((u) & UMASK) | ((v) & LMASK); 
	}
	
	private static long TWIST(long u, long v) {
		return (MIXBITS(u,v) >>> 1) ^ (((v&1) == 1) ? MATRIX_A : 0);
	}

	private static void init_genrand(long s) {
		int j;
		state[0] = s & 0xffffffffL;
		for (j=1; j<N; j++) {
			state[j] = (1812433253L * (state[j-1] ^ (state[j-1] >>> 30)) + j);
	        /* See Knuth TAOCP Vol2. 3rd Ed. P.106 for multiplier. */
	        /* In the previous versions, MSBs of the seed affect   */
	        /* only MSBs of the array state[].                        */
	        /* 2002/01/09 modified by Makoto Matsumoto             */
	        state[j] &= 0xffffffffL;  /* for >32 bit machines */
		}
		left = 1;
		initf = 1;
	}
	
	private static void init_by_array(long init_key[], int key_length) {
	    int i = 1, j = 0, k = (N>key_length ? N : key_length);
	    init_genrand(19650218L);
	    for (; k > 0; k--) {
	        state[i] = (state[i] ^ ((state[i-1] ^ (state[i-1] >>> 30)) * 1664525L))
	          + init_key[j] + j; /* non linear */
	        state[i] &= 0xffffffffL; /* for WORDSIZE > 32 machines */
	        i++; j++;
	        if (i>=N) { state[0] = state[N-1]; i=1; }
	        if (j>=key_length) j=0;
	    }
	    for (k=N-1; k > 0; k--) {
	        state[i] = (state[i] ^ ((state[i-1] ^ (state[i-1] >>> 30)) * 1566083941L))
	          - i; /* non linear */
	        state[i] &= 0xffffffffL; /* for WORDSIZE > 32 machines */
	        i++;
	        if (i>=N) { state[0] = state[N-1]; i=1; }
	    }

	    state[0] = 0x80000000L; /* MSB is 1; assuring non-zero initial array */
	    left = 1;
	    initf = 1;
	}
	
	private static void next_state() {
	    int j;
	    int pi = 0;
	    
	    /* if init_genrand() has not been called, */
	    /* a default initial seed is used         */
	    if (initf==0) { 
	    	init_genrand(5489L);
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
	private static long genrand_int32() {
	    long y;

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
		long buf[];
		
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
		buf = new long[len];
		Arrays.fill(buf, 0);
		
		if (seed instanceof RubyFixnum) {
			RubyFixnum s = (RubyFixnum)seed;
			buf[0] = s.toInt() & 0xffffffff;
		} else if (seed instanceof RubyBignum) {
			int i;
			byte[] bytearray = ((RubyBignum)seed).getInternal().toByteArray();
			for (i = bytearray.length-1; 0 <= i; i--) {
				buf[i] |= bytearray[i]; 
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
		for (int i = 0; 0 <= i; i--) {
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
	
    @RubyLevelMethod(name="srand")
    public static RubyValue srand(RubyValue receiver) {
    	RubyValue seed = random_seed();
    	RubyValue old = rand_init(seed);
        return old;
    }
    
    @RubyLevelMethod(name="srand")
    public static RubyValue srand(RubyValue receiver, RubyValue arg) {
        RubyValue old = rand_init(arg);
        return old;
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
}
