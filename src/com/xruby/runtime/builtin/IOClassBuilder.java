/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class IO_write extends RubyMethod {
	public IO_write() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		StringValue value;
		if (RubyRuntime.StringClass == args.get(0).getRubyClass()) {
			value = (StringValue)args.get(0).getValue();
		} else {
			RubyValue str = RubyRuntime.callPublicMethod(args.get(0), null, "to_s");
			value = (StringValue) str.getValue();
		}
		
		IOValue io = (IOValue)receiver.getValue();
		if (null == io) {
			System.out.print(value.toString());
		} else {
			io.print(value.toString());
		}
		return ObjectFactory.createFixnum(value.length());
	}
}

class IO_print extends Kernel_print {
	public IO_print() {
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		return _run(receiver, args, block);
	}
}

class IO_close extends RubyMethod {
	public IO_close() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		IOValue io = (IOValue)receiver.getValue();
		if (null != io) {
			//not stdout, stderr, stdin
			io.close();
		}
		return ObjectFactory.nilValue;
	}
}

class IO_gets extends RubyMethod {
	public IO_gets() {
		super(-1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		IOValue io = (IOValue)receiver.getValue();
		if (null != io) {
			RubyValue seperator = (null == args) ?  GlobalVariables.INPUT_RECORD_SEPARATOR : args.get(0);
			GlobalVariables.LAST_READ_LINE = io.gets(seperator);
		} else {
			//TODO stdout, stderr, stdin
			GlobalVariables.LAST_READ_LINE = ObjectFactory.nilValue;
		}

		return GlobalVariables.LAST_READ_LINE;
	}
}

class IO_eof extends RubyMethod {
	public IO_eof() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		IOValue io = (IOValue)receiver.getValue();
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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		StringValue fileName = (StringValue)args.get(0).getValue();
		IOValue io = new IOValue(fileName.toString(), "r");
		int offset;
		int length;
		if (args.size() == 1){
			return io.read();
		}else{
			length = ((IntegerValue)args.get(1).getValue()).intValue();
			if(args.size() == 2){			
				return io.read(length);
			}else{
				offset = ((IntegerValue)args.get(2).getValue()).intValue();
				return io.read(length, offset);
			}
		}
	}
}

public class IOClassBuilder {

	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("IO",
				RubyRuntime.ObjectClass);
		c.defineMethod("write", new IO_write());
		c.defineMethod("print", new IO_print());
		c.defineMethod("gets", new IO_gets());
		c.defineMethod("close", new IO_close());
		RubyMethod eof = new IO_eof();
		c.defineMethod("eof", eof);
		c.defineMethod("eof?", eof);
		return c;
	}
	
	public static void initSingletonMethods() {
		ObjectFactory.IOClassValue.defineMethod("read", new IO_read());
	}
}
