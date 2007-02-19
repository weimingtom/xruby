/** 
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class IO_write extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyString value;
		if (arg instanceof RubyString) {
			value = (RubyString)arg;
		} else {
			RubyValue str = RubyAPI.callPublicMethod(arg, null, null, "to_s");
			value = (RubyString) str;
		}
		
		if (receiver instanceof RubyIO) {
			((RubyIO)receiver).print(value.toString());
		} else {
			System.out.print(value.toString());//TODO this is a hack, better create a new class to represent STDOUT
		}
		return ObjectFactory.createFixnum(value.length());
	}
}

class IO_print extends Kernel_print {
	public IO_print() {
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return _run(receiver, args, block);
	}
}

class IO_close extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		if (receiver instanceof RubyIO) {
			//not stdout, stderr, stdin
			((RubyIO)receiver).close();
		}
		return ObjectFactory.nilValue;
	}
}

class IO_gets extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (receiver instanceof RubyIO) {
			RubyValue seperator = (null == args) ?  GlobalVariables.get("$/") : args.get(0);
			GlobalVariables.set(((RubyIO)receiver).gets(seperator), "$_");
		} else {
			//TODO stdout, stderr, stdin
			GlobalVariables.set(ObjectFactory.nilValue, "$_");
		}

		return GlobalVariables.get("$_");
	}
}

class IO_eof extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyIO io = (RubyIO)receiver;
		if (io.eof()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class IO_read extends RubyMethod {
	public IO_read() {
		super(3, false, 2);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString fileName = (RubyString)args.get(0);
		RubyIO io = ObjectFactory.createFile(fileName.toString(), "r");
		int offset;
		int length;
		if (args.size() == 1){
			return io.read();
		}else{
			length = ((RubyFixnum)args.get(1)).intValue();
			if(args.size() == 2){			
				return io.read(length);
			}else{
				offset = ((RubyFixnum)args.get(2)).intValue();
				return io.read(length, offset);
			}
		}
	}
}

public class IOClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.IOClass;
		c.defineMethod("write", new IO_write());
		c.defineMethod("print", new IO_print());
		c.defineMethod("gets", new IO_gets());
		c.defineMethod("close", new IO_close());
		RubyMethod eof = new IO_eof();
		c.defineMethod("eof", eof);
		c.defineMethod("eof?", eof);
		
		c.getSingletonClass().defineMethod("read", new IO_read());
		
	}
}
