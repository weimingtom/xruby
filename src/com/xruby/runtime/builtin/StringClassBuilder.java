/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;


class String_operator_star extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String string = ((RubyString) receiver).toString();
        int count = arg.toInt();
        if (count < 0) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "negative argument");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            result.append(string);
        }
        return ObjectFactory.createString(result);
    }
}

class String_each_byte extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        String string = ((RubyString) receiver).toString();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            block.invoke(receiver, ObjectFactory.createFixnum((int) c));
        }
        return receiver;
    }
}

class String_reverse_danger extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyString string = (RubyString) receiver;
        string.reverse();
        return string;
    }
}

class String_reverse extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyString string = ObjectFactory.createString(((RubyString) receiver).toString());
        string.reverse();
        return string;
    }
}

class String_chomp extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString string = ObjectFactory.createString(((RubyString) receiver).toString());
        RubyValue separator = (null != args) ? args.get(0) : GlobalVariables.get("$/");
        string.chomp(((RubyString) separator).toString());
        return string;
    }
}

class String_chomp_danger extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString string = (RubyString) receiver;
        RubyValue separator = (null == args) ? GlobalVariables.get("$/") : args.get(0);
        string.chomp(((RubyString) separator).toString());
        return string;
    }
}

class String_scan extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyString string = (RubyString) receiver;
        RubyRegexp regex = (RubyRegexp) arg;
        return string.scan(regex);
    }
}

class String_tr_danger extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        RubyString string = (RubyString) receiver;
        RubyString from = (RubyString) arg1;
        RubyString to = (RubyString) arg2;
        return string.tr(from.toString(), to.toString()) ? string : ObjectFactory.NIL_VALUE;
    }
}

class String_tr extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        RubyString string = ObjectFactory.createString(((RubyString) receiver).toString());
        RubyString from = (RubyString) arg1;
        RubyString to = (RubyString) arg2;
        string.tr(from.toString(), to.toString());
        return string;
    }
}

class String_tr_s_danger extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        RubyString string = (RubyString) receiver;
        RubyString from = (RubyString) arg1;
        RubyString to = (RubyString) arg2;
        return string.tr_s(from.toString(), to.toString()) ? string : ObjectFactory.NIL_VALUE;
    }
}

class String_tr_s extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        RubyString string = ObjectFactory.createString(((RubyString) receiver).toString());
        RubyString from = (RubyString) arg1;
        RubyString to = (RubyString) arg2;
        string.tr_s(from.toString(), to.toString());
        return string;
    }
}

class String_squeeze_danger extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString string = (RubyString) receiver;
        String arg = ((null == args) ? null : ((RubyString) args.get(0)).toString());
        return string.squeeze(arg) ? string : ObjectFactory.NIL_VALUE;
    }
}

class String_squeeze extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString string = ObjectFactory.createString(((RubyString) receiver).toString());
        String arg = ((null == args) ? null : ((RubyString) args.get(0)).toString());
        string.squeeze(arg);
        return string;
    }
}

class String_delete_danger extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments");
        }

        RubyString string = (RubyString) receiver;
        String arg = ((RubyString) args.get(0)).toString();
        return string.delete(arg) ? string : ObjectFactory.NIL_VALUE;
    }
}

class String_delete extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments");
        }

        RubyString string = ObjectFactory.createString(((RubyString) receiver).toString());
        String arg = ((RubyString) args.get(0)).toString();
        string.delete(arg);
        return string;
    }
}

class String_unpack extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyString s = (RubyString) receiver;
        RubyString format = ((RubyString) arg);
        return ArrayPacker.unpack(s.toString(), format.toString());
    }
}

class String_count extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString s = (RubyString) receiver;
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments");
        }

        //TODO incomplete
        int n = 0;
        for (RubyValue v : args) {
            RubyString other_str = (RubyString) v;
            n += s.count(other_str.toString());
        }
        return ObjectFactory.createFixnum(n);
    }
}

public class StringClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.StringClass;
        c.defineMethod("*", new String_operator_star());
        c.defineMethod("each_byte", new String_each_byte());
        c.defineMethod("reverse!", new String_reverse_danger());
        c.defineMethod("reverse", new String_reverse());
        c.defineMethod("chomp", new String_chomp());
        c.defineMethod("chomp!", new String_chomp_danger());
        c.defineMethod("scan", new String_scan());
        c.defineMethod("tr!", new String_tr_danger());
        c.defineMethod("tr", new String_tr());
        c.defineMethod("tr_s!", new String_tr_s_danger());
        c.defineMethod("tr_s", new String_tr_s());
        c.defineMethod("squeeze!", new String_squeeze_danger());
        c.defineMethod("squeeze", new String_squeeze());
        c.defineMethod("delete!", new String_delete_danger());
        c.defineMethod("delete", new String_delete());
        c.defineMethod("unpack", new String_unpack());
        c.defineMethod("count", new String_count());
    }
}


