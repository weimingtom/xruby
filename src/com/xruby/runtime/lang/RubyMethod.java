/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyMethod extends MethodBlockBase {
    private int access_;
    private RubyID id_; //its own id, saved to build better error message

    public static final int PUBLIC = 0;
    public static final int PROTECTED = 1;
    public static final int PRIVATE = 2;
    public static final int ALL = 3;

    protected RubyMethod(int argc, boolean has_asterisk_parameter, int default_argc) {
        super(argc, has_asterisk_parameter, default_argc);
        access_ = PUBLIC;
    }

    void setID(RubyID id) {
        id_ = id;
    }

    String getName() {
        return id_.toString();
    }

    public RubyBlock convertToRubyBolck(RubyValue self) {
        final RubyMethod m = this;
        return new RubyBlock(argc_, has_asterisk_parameter_, default_argc_, self, null, null, null, getScope(), false) {
            protected RubyValue run(RubyValue receiver, RubyArray args) {
                return m.invoke(receiver, args, null);
            }
        };
    }

    int getAccess() {
        return access_;
    }

    public void setAccess(int access) {
        access_ = access;
    }

    protected void assertArgNumberAtLeast(RubyArray args, int expected_argc) {
        assert(expected_argc > 0);
        if (null == args || args.size() < expected_argc) {
            int actual_argc = (null == args ) ? 0 : args.size();
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + actual_argc + " for " + expected_argc + ")");
        }
    }

    protected void assertArgNumberEqual(RubyArray args, int expected_argc) {
        assert(expected_argc > 0);
        if (null == args || args.size() != expected_argc) {
            int actual_argc = (null == args ) ? 0 : args.size();
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + actual_argc + " for " + expected_argc + ")");
        }
    }

    protected static String convertToString(RubyValue v) {
        if (v instanceof RubyString) {
            return ((RubyString)v).toString();
        } else if (v instanceof RubySymbol) {
            return ((RubySymbol)v).toString();
        } else {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, inspect(v) + " is not a symbol");
        }
    }

    private static String inspect(RubyValue value) {
        RubyValue v = RubyAPI.callPublicMethod(value, null, null, CommonRubyID.inspectID);
        return ((RubyString)v).toString();
    }

    // multi arg invocation
    public RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block) {
        //TODO parameter checking with 'has_asterisk_parameter_' maybe incorrect
        if (argc_ >= 0) {
            final int args_length = (null != args) ? args.size() : 0;
            if (0 == default_argc_ && !has_asterisk_parameter_ && args_length != argc_) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + args_length + " for " + argc_ + ")");
            } else if (args_length < (argc_ - default_argc_)) {
                //number of arguments falls short anyway
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + args_length + " for " + (argc_ - default_argc_) + ")");
            }
        }

        RubyValue v = run(receiver, args, block);
        if (null != block) {
            v.setReturnedInBlock(block.returned(), block.breakedOrReturned(), false);
        } else {
            v.setReturnedInBlock(false, false, false);
        }
        return v;
    }

    protected abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block);

    // no arg invocation
    public RubyValue invoke(RubyValue receiver, RubyBlock block) {
//		TODO parameter checking with 'has_asterisk_parameter_' maybe incorrect
        if (argc_ >= 0) {
            final int args_length = 0;
            if (0 == default_argc_ && !has_asterisk_parameter_ && args_length != argc_) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + args_length + " for " + argc_ + ")");
            } else if (args_length < (argc_ - default_argc_)) {
                //number of arguments falls short anyway
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + args_length + " for " + (argc_ - default_argc_) + ")");
            }
        }

        RubyValue v = run(receiver, block);
        if (null != block) {
            v.setReturnedInBlock(block.returned(), block.breakedOrReturned(), false);
        } else {
            v.setReturnedInBlock(false, false, false);
        }
        return v;
    }

    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return this.run(receiver, new RubyArray(), block);
    }

    // one arg invocation
    public RubyValue invoke(RubyValue receiver, RubyValue arg, RubyBlock block) {
//		TODO parameter checking with 'has_asterisk_parameter_' maybe incorrect
        if (argc_ >= 0) {
            final int args_length = 1;
            if (0 == default_argc_ && !has_asterisk_parameter_ && args_length != argc_) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + args_length + " for " + argc_ + ")");
            } else if (args_length < (argc_ - default_argc_)) {
                //number of arguments falls short anyway
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + id_.toString() + "': wrong number of arguments (" + args_length + " for " + (argc_ - default_argc_) + ")");
            }
        }

        RubyValue v = run(receiver, arg, block);
        if (null != block) {
            v.setReturnedInBlock(block.returned(), block.breakedOrReturned(), false);
        } else {
            v.setReturnedInBlock(false, false, false);
        }
        return v;
    }

    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        return this.run(receiver, new RubyArray(arg), block);
    }
}

/**
 * Represent a method removed by 'undef'
 * When a method is 'undef'ed, it can not be simply removed, instead, a UndefMethod::getInstance()
 * should be inserted to the method table.
 */
class UndefMethod extends RubyVarArgMethod {

    private static UndefMethod instance_ = new UndefMethod();

    private UndefMethod() {
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        throw new Error("should not reach here!");
    }

    static RubyMethod getInstance() {
        return instance_;
    }

    static boolean isUndef(RubyMethod m) {
        return m == instance_;
    }

}
