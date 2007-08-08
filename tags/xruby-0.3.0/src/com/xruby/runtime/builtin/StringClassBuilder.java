/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.util.MethodFactory;
import com.xruby.runtime.lang.util.MethodType;
import com.xruby.runtime.value.*;

import java.math.BigInteger;
import java.util.StringTokenizer;

class String_hex extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyString value = (RubyString) receiver;
        String s = value.toString();
        if (s.startsWith("0x")) {
            s = s.substring("0x".length());
        }

        try {
            return ObjectFactory.createFixnum(Integer.valueOf(s, 16));
        } catch (NumberFormatException e) {
            return ObjectFactory.FIXNUM0;
        }

    }
}

class String_to_i extends RubyVarArgMethod {
    public String_to_i() {
        super(1, false, 1);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        String value = ((RubyString) receiver).toString();

        value = value.replaceAll("[^+\\-a-zA-Z0-9]", "");
        int end = value.indexOf('+', 1);
        int end1 = value.indexOf('-', 1);

        if (end < 0) {
            if (end1 < 0) {
                end = value.length();
            } else {
                end = end1;
            }
        } else {
            if (end1 >= 0) {
                end = Math.min(end, end1);
            }
        }

        value = value.substring(0, end);

        int radix = 10;
        if (null != args) {
            radix = ((RubyFixnum) args.get(0)).toInt();
        }

        if (radix >= 2 && radix <= 36) {
            BigInteger bigint;
            try {
                bigint = new BigInteger(value, radix);
            } catch (NumberFormatException e) {
                return ObjectFactory.FIXNUM0;
            }
            return RubyBignum.bignorm(bigint);
        }
        throw new RubyException(RubyRuntime.ArgumentErrorClass, "illegal radix " + radix);

    }
}

class String_sub extends RubyVarArgMethod {

    String sub(RubyString g, RubyArray args) {
        assertArgNumberEqual(args, 2);

        if (!(args.get(1) instanceof RubyString)) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "can't convert " + args.get(1).getRubyClass().getName() + " into String");
        }

        RubyString s = (RubyString) args.get(1);

        if (args.get(0) instanceof RubyRegexp) {
            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.sub(g, s);
        } else if (args.get(0) instanceof RubyString) {
            RubyString r = (RubyString) args.get(0);
            return g.toString().replaceFirst(r.toString(), s.toString());
        } else {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
        }
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString g = (RubyString) receiver;

        if (null == block) {
            return ObjectFactory.createString(sub(g, args));
        } else {
            assertArgNumberEqual(args, 1);
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.sub(g, block);
        }
    }
}

class String_sub_danger extends String_sub {

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString g = (RubyString) receiver;

        if (null == block) {
            String result = sub(g, args);
            if (g.toString().equals(result)) {
                return ObjectFactory.NIL_VALUE;
            } else {
                return g.setString(result);
            }
        } else {
            assertArgNumberEqual(args, 1);
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return g.setString(r.sub(g, block).toString());
        }
    }
}

class String_gsub extends RubyVarArgMethod {

    String gsub(RubyString g, RubyArray args) {
        assertArgNumberEqual(args, 2);

        if (!(args.get(1) instanceof RubyString)) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "can't convert " + args.get(1).getRubyClass().getName() + " into String");
        }

        RubyString s = (RubyString) args.get(1);

        if (args.get(0) instanceof RubyRegexp) {
            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.gsub(g, s);
        } else if (args.get(0) instanceof RubyString) {
            RubyString r = (RubyString) args.get(0);
            return g.toString().replaceAll(r.toString(), s.toString());
        } else {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
        }
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString g = (RubyString) receiver;

        if (null == block) {
            return ObjectFactory.createString(gsub(g, args));
        } else {
            assertArgNumberEqual(args, 1);
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.gsub(g, block);
        }
    }
}

class String_gsub_danger extends String_gsub {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString g = (RubyString) receiver;

        if (null == block) {
            String result = gsub(g, args);

            if (g.toString().equals(result)) {
                return ObjectFactory.NIL_VALUE;
            } else {
                return g.setString(result);
            }
        } else {
            assertArgNumberEqual(args, 1);
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return g.setString(r.gsub(g, block).toString());
        }
    }
}

class String_split extends RubyVarArgMethod {
    public String_split() {
        super(2, false, 2);
    }

    private String[] split(RubyString s, String delimiter) {
        StringTokenizer t = new StringTokenizer(s.toString(), delimiter);
        int total = t.countTokens();
        String[] r = new String[total];
        for (int i = 0; i < total; ++i) {
            r[i] = t.nextToken();
        }
        return r;
    }

    private String[] split(RubyString g, RubyRegexp r, RubyArray args) {
        if (args.size() <= 1) {
            return r.split(g.toString(), 0);
        } else {
            RubyFixnum i = (RubyFixnum) args.get(1);
            return r.split(g.toString(), i.toInt());
        }
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyString g = (RubyString) receiver;
        RubyValue r = (null == args) ? GlobalVariables.get("$;") : args.get(0);

        String[] splitResult;
        if (r == ObjectFactory.NIL_VALUE) {
            splitResult = split(g, " ");
        } else if (r instanceof RubyRegexp) {
            splitResult = split(g, (RubyRegexp) r, args);
        } else if (r instanceof RubyString) {
            splitResult = split(g, ((RubyString) r).toString());
        } else {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + r.getRubyClass() + " (expected Regexp)");
        }

        RubyArray a = new RubyArray(splitResult.length);
        int i = 0;
        for (String str : splitResult) {
            if (0 != i || !str.equals("")) {
                //To conform ruby's behavior, discard the first empty element
                a.add(ObjectFactory.createString(str));
            }
            ++i;
        }
        return a;
    }
}

class String_operator_compare extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyString)) {
            return ObjectFactory.NIL_VALUE;
        }

        RubyString value1 = (RubyString) receiver;
        RubyString value2 = (RubyString) arg;
        int compare = value1.toString().compareTo(value2.toString());
        if (compare > 0) {
            compare = 1;
        } else if (compare < 0) {
            compare = -1;
        }
        return ObjectFactory.createFixnum(compare);
    }
}

class String_casecmp extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyString)) {
            return ObjectFactory.NIL_VALUE;
        }
        RubyString value1 = (RubyString) receiver;
        RubyString value2 = (RubyString) arg;
        int compare = value1.toString().toUpperCase().compareTo(value2.toString().toUpperCase());
        if (compare > 0) {
            compare = 1;
        } else if (compare < 0) {
            compare = -1;
        }
        return ObjectFactory.createFixnum(compare);
    }
}

class String_operator_match extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (arg instanceof RubyRegexp) {
            RubyRegexp reg = (RubyRegexp) arg;
            int p = reg.matchPosition(((RubyString) receiver).toString());
            if (p >= 0) {
                return ObjectFactory.createFixnum(p);
            } else {
                return ObjectFactory.NIL_VALUE;
            }
        } else {
            return RubyAPI.callPublicOneArgMethod(arg, receiver, null, RubyID.matchID);
        }
    }
}

class String_format extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String format = ((RubyString) receiver).toString();
        String s;
        if (arg instanceof RubyArray) {
            s = String.format(format, Kernel_printf.buildFormatArg((RubyArray)arg, 0));
        } else {
            s = String.format(format, Kernel_printf.buildFormatArg(new RubyArray(arg), 0));
        }
        return ObjectFactory.createString(s);
    }
}

class String_access extends RubyVarArgMethod {
    public String_access() {
        super(2, false, 1);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        String string = ((RubyString) receiver).toString();
        if (args.size() == 1) {
            RubyValue arg = args.get(0);
            if (arg instanceof RubyString) {
                String str = ((RubyString) arg).toString();
                if (string.indexOf(str) >= 0) {
                    return ObjectFactory.createString(str);
                } else {
                    return ObjectFactory.NIL_VALUE;
                }
            } else if (arg instanceof RubyRange) {
                RubyRange range = (RubyRange) arg;
                int start = range.getLeft().toInt();
                int end = range.getRight().toInt();
                return substring(string, start, end, range.isExcludeEnd());
            } else if (arg instanceof RubyRegexp) {
                RubyRegexp regexp = (RubyRegexp) arg;
                RubyMatchData match = regexp.match(string);
                if (match != null) {
                    return ObjectFactory.createString(match.toString());
                } else {
                    return ObjectFactory.NIL_VALUE;
                }
            } else {
                int index = arg.toInt();
                if (index < 0) {
                    index = string.length() + index;
                }

                if (index < 0 || index >= string.length()) {
                    return ObjectFactory.NIL_VALUE;
                } else {
                    return ObjectFactory.createFixnum(string.charAt(index));
                }
            }
        } else {
            int start = args.get(0).toInt();
            int length = args.get(1).toInt() - 1;

            return substring(string, start, start + length, false);
        }
    }

    private RubyValue substring(String string, int begin, int end, boolean isExcludeEnd) {

        if (begin < 0) {
            begin = string.length() + begin;
        }

        if (end < 0) {
            end = string.length() + end;
        }

        if (!isExcludeEnd) {
            ++end;
        }

        if (begin < 0 || end < 0 || begin > end || begin > string.length() || end > string.length()) {
            return ObjectFactory.NIL_VALUE;
        }

        return ObjectFactory.createString(string.substring(begin, end));
    }
}

class String_access_set extends RubyVarArgMethod {
    public String_access_set() {
        super(3, false, 2);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        String string = ((RubyString) receiver).toString();
        String replacement;

        int start, end;

        if (args.size() == 2) {
            RubyValue arg = args.get(0);
            replacement = ((RubyString) args.get(1)).toString();

            if (arg instanceof RubyString) {
                String str = ((RubyString) arg).toString();
                start = string.indexOf(str);
                if (start >= 0) {
                    end = start + str.length();
                } else {
                    throw new RubyException(RubyRuntime.IndexErrorClass, "string not matched");
                }
            } else if (arg instanceof RubyRange) {
                RubyRange range = (RubyRange) arg;
                start = range.getLeft().toInt();
                end = range.getRight().toInt();
                if (start >= string.length()) {
                    throw new RubyException(RubyRuntime.RangeClass, range.toString() + " out of range");
                }
            } else if (arg instanceof RubyRegexp) {
                RubyRegexp regexp = (RubyRegexp) arg;
                RubyMatchData match = regexp.match(string);
                if (match != null) {
                    String matched = match.toString();
                    start = string.indexOf(matched);
                    end = matched.length() + start;
                } else {
                    throw new RubyException(RubyRuntime.IndexErrorClass, "regexp not matched");
                }
            } else {
                start = arg.toInt();
                end = start + 1;
            }
        } else {
            replacement = ((RubyString) args.get(2)).toString();

            start = args.get(0).toInt();
            end = args.get(1).toInt() + start;
            if (start >= string.length()) {
                throw new RubyException(RubyRuntime.RangeClass, String.format("index %d out of string", start));
            }
        }
        ((RubyString) receiver).setString(replace(string, start, end, replacement));
        return ObjectFactory.createString(replacement);
    }

    private String replace(String source, int start, int end, String replacement) {
        assert(start <= source.length() - 1);

        if (end < start) {
            end = start + 1;
        }

        StringBuffer result = new StringBuffer(source.substring(0, start));
        result.append(replacement);
        result.append(source.substring(end));
        return result.toString();
    }
}

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
        MethodFactory factory = MethodFactory.createMethodFactory(RubyString.class);
        c.defineMethod("strip", factory.getMethod("strip", MethodType.NO_ARG));
        c.defineMethod("strip!", factory.getMethod("stripBang", MethodType.NO_ARG));
        c.defineMethod("==", factory.getMethod("opEqual", MethodType.ONE_ARG));
        c.defineMethod("capitalize", factory.getMethod("capitalize", MethodType.NO_ARG));
        c.defineMethod("capitalize!", factory.getMethod("capitalizeBang", MethodType.NO_ARG));
        c.defineMethod("upcase", factory.getMethod("upcase", MethodType.NO_ARG));
        c.defineMethod("upcase!", factory.getMethod("upcaseBang", MethodType.NO_ARG));
        c.defineMethod("downcase", factory.getMethod("downcase", MethodType.NO_ARG));
        c.defineMethod("downcase!", factory.getMethod("downcaseBang", MethodType.NO_ARG));
        c.defineMethod("swapcase", factory.getMethod("swapcase", MethodType.NO_ARG));
        c.defineMethod("swapcase!", factory.getMethod("swapcaseBang", MethodType.NO_ARG));
        c.defineMethod("to_f", factory.getMethod("toRubyFloat", MethodType.NO_ARG));
        c.defineMethod("to_i", new String_to_i());
        c.defineMethod("hex", new String_hex());
        c.defineMethod(RubyID.toSID, factory.getMethod("to_s", MethodType.NO_ARG));
        c.defineMethod("length", factory.getMethod("rubyLength", MethodType.NO_ARG));
        c.defineMethod("initialize_copy", factory.getMethod("initialize", MethodType.NO_OR_ONE_ARG));
        c.defineMethod("initialize", factory.getMethod("initialize", MethodType.NO_OR_ONE_ARG));
        c.defineMethod(RubyID.plusID, factory.getMethod("plus", MethodType.ONE_ARG));
        c.defineMethod("gsub", new String_gsub());
        c.defineMethod("gsub!", new String_gsub_danger());
        c.defineMethod("sub", new String_sub());
        c.defineMethod("sub!", new String_sub_danger());
        c.defineMethod("split", new String_split());
        c.defineMethod("<=>", new String_operator_compare());
        c.defineMethod("casecmp", new String_casecmp());
        c.defineMethod("=~", new String_operator_match());
        c.defineMethod("[]", new String_access());
        c.defineMethod("%", new String_format());
        c.defineMethod("[]=", new String_access_set());
        c.defineMethod("*", new String_operator_star());
        RubyMethod each = factory.getMethodWithBlock("each", MethodType.NO_ARG);
        c.defineMethod("each", each);
        c.defineMethod("each_line", each);
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
        c.defineMethod("concat", factory.getMethod("concat", MethodType.ONE_ARG));
        c.defineMethod("<<", factory.getMethod("concat", MethodType.ONE_ARG));
        c.defineMethod("count", new String_count());
        c.defineMethod("chop", factory.getMethod("chop", MethodType.NO_ARG));
        c.defineMethod("chop!", factory.getMethod("chopBang", MethodType.NO_ARG));
        c.defineMethod("intern", factory.getMethod("intern", MethodType.NO_ARG));
        c.defineMethod("to_sym", factory.getMethod("intern", MethodType.NO_ARG));
        c.defineMethod("dump", factory.getMethod("rubyDump", MethodType.NO_ARG));
        c.defineAllocMethod(factory.getSingletonMethod("alloc", MethodType.NO_ARG));
    }
}


