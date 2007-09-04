/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng Michael Chen
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.io.IOException;
import java.nio.channels.Pipe;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.value.*;

class IO_write extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyString value;
        if (arg instanceof RubyString) {
            value = (RubyString) arg;
        } else {
            RubyValue str = RubyAPI.callPublicNoArgMethod(arg, null, RubyID.toSID);
            value = (RubyString) str;
        }

        if (receiver instanceof RubyIO) {
            ((RubyIO) receiver).print(value.toString());
        } else {
            System.out.print(value.toString());//TODO this is a hack, better create a new class to represent STDOUT
        }
        return value.rubyLength();
    }
}

class IO_print extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyKernelModule._print(receiver);
    }
	
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return RubyKernelModule._print(receiver, args);
    }
}

class IO_puts extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return RubyKernelModule._puts(receiver);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return RubyKernelModule._puts(receiver, args);
    }
}

class IO_close extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        if (receiver instanceof RubyIO) {
            //not stdout, stderr, stdin
            ((RubyIO) receiver).close();
        }
        return ObjectFactory.NIL_VALUE;
    }
}

class IO_flush extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        if (receiver instanceof RubyIO) {
            //not stdout, stderr, stdin
            ((RubyIO) receiver).flush();
        }
        return ObjectFactory.NIL_VALUE;
    }
}

class IO_gets extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (receiver instanceof RubyIO) {
            RubyValue seperator = (null == args) ? GlobalVariables.get("$/") : args.get(0);
            String s = ((RubyIO) receiver).gets(seperator);
            RubyValue v = (null == s) ? ObjectFactory.NIL_VALUE : ObjectFactory.createString(s);
            GlobalVariables.set(v, "$_");
        } else {
            //TODO stdout, stderr, stdin
            GlobalVariables.set(ObjectFactory.NIL_VALUE, "$_");
        }

        return GlobalVariables.get("$_");
    }
}

class IO_eof extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyIO io = (RubyIO) receiver;
        if (io.eof()) {
            return ObjectFactory.TRUE_VALUE;
        } else {
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class IO_closed_question extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyIO io = (RubyIO) receiver;
        if (io.isClosed()) {
            return ObjectFactory.TRUE_VALUE;
        } else {
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class IO_seek extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyIO io = (RubyIO) receiver;
        long pos = RubyTypesUtil.convertToJavaLong(args.get(0));
        io.seek(pos);
        return ObjectFactory.FIXNUM0;
    }
}

class IO_read extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyIO io = (RubyIO) receiver;

        RubyString buffer = null;
        if (null != args && args.size() > 1) {
            buffer = (RubyString)args.get(1);
        }

        if ((null == args) || (ObjectFactory.NIL_VALUE == args.get(0))) {
            return buildResult(io.read(), buffer);
        } else {
            return buildResult(io.read(((RubyFixnum) args.get(0)).toInt()), buffer);
        }
    }

    static RubyValue buildResult(String s, RubyString buffer) {
        if (null == s) {
            if (null != buffer) {
                buffer.setString("");
            }
            return ObjectFactory.NIL_VALUE;
        } else if (null != buffer) {
            buffer.setString(s);
            return buffer;
        } else {
            return ObjectFactory.createString(s);
        }
    }
}

class IO_readpartial extends IO_read {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyValue v = super.run(receiver, args, block);
        RubyIO io = (RubyIO) receiver;
        if (io.eof()) {
            throw new RubyException(RubyRuntime.EOFErrorClass, "end of file reached");
        }
        return v;
    }
}

class IO_read_singleton extends RubyVarArgMethod {
    public IO_read_singleton() {
        super(3, false, 2);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString fileName = (RubyString) args.get(0);
        RubyIO io = ObjectFactory.createFile(fileName.toString(), "r");
        int offset;
        int length;

        RubyValue r;
        if (args.size() == 1) {
            r = IO_read.buildResult(io.read(), null);
        } else {
            length = ((RubyFixnum) args.get(1)).toInt();
            if (args.size() == 2) {
                r = IO_read.buildResult(io.read(length), null);
            } else {
                offset = ((RubyFixnum) args.get(2)).toInt();
                r = IO_read.buildResult(io.read(length, offset), null);
            }
        }

        io.close();
        return r;
    }
}

class IO_pipe_singleton extends RubyNoArgMethod{

    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = new RubyArray(2);
        try {
            Pipe pipe = Pipe.open();
            RubyIO r = new RubyIO(new RubyIOPipeSourceExecutor(pipe.source()));
            RubyIO w = new RubyIO(new RubyIOPipeSinkExecutor(pipe.sink()));
            array.add(r);
            array.add(w);
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }

        return array;
    }

}

public class IOClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.IOClass;
        c.defineMethod("write", new IO_write());
        c.defineMethod("print", new IO_print());
        c.defineMethod("puts", new IO_puts());
        c.defineMethod("gets", new IO_gets());
        c.defineMethod("close", new IO_close());
        c.defineMethod("flush", new IO_flush());
        c.defineMethod("seek", new IO_seek());
        RubyMethod eof = new IO_eof();
        c.defineMethod("eof", eof);
        c.defineMethod("eof?", eof);
        c.defineMethod("closed?", new IO_closed_question());
        c.defineMethod("read", new IO_read());
        c.defineMethod("readpartial", new IO_readpartial());

        c.getSingletonClass().defineMethod("read", new IO_read_singleton());
        c.getSingletonClass().defineMethod("pipe", new IO_pipe_singleton());

    }
}
