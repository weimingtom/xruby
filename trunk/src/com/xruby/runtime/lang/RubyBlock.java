/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyBlock extends MethodBlockBase {

    // if run finished, and __break__ is not true, it indicated break happend
    //e.g.
    // loop do
    //      break 'xxx'
    // end
    protected boolean __break__ = false;
    protected boolean __return__ = false;
    protected boolean __redo__ = false;

    // Normally RubyBlock was created in one place, invoked(yield) later in another
    // place. The block needs to keep the context of its creator(self, arg, block arg,
    // scope etc).
    protected RubyValue selfOfCurrentMethod_;//need this for {self} TODO why do we need 'receiver' for run method?
    protected final RubyArray argsOfCurrentMethod_;//need this for {super}
    protected final RubyValue argOfCurrentMethod_;//need this for {super}
    protected final RubyBlock blockOfCurrentMethod_;//need this for {yield}

    private final boolean definedInAnotherBlock_;//not null if defined in another block

    private boolean createdByLambda_ = false;

    public RubyBlock(int argc,
                        boolean has_asterisk_parameter,
                        int default_argc,
                        RubyValue self,
                        RubyValue arg,//not null for one arg method
                        RubyArray args,//not null for var arg method
                        RubyBlock block,
                        RubyModule scope,
                        boolean definedInAnotherBlock) {
        super(argc, has_asterisk_parameter, default_argc);
        selfOfCurrentMethod_ = self;
        argOfCurrentMethod_ = arg;
        argsOfCurrentMethod_ = args;
        blockOfCurrentMethod_ = block;
        setScope(scope);
        definedInAnotherBlock_ = definedInAnotherBlock;
    }

    public void setSelf(RubyValue v) {
        selfOfCurrentMethod_ = v;
    }

    public RubyValue getSelf() {
        return selfOfCurrentMethod_;
    }

    public boolean isDefinedInAnotherBlock() {
        return definedInAnotherBlock_;
    }

    public boolean breakedOrReturned() {
        return __break__ || __return__;
    }

    public boolean returned() {
        return __return__;
    }

    public boolean shouldRedo() {
        return __redo__;
    }

    public void setCreatedByLambda() {
        createdByLambda_ = true;
    }

    public boolean createdByLambda() {
        return createdByLambda_;
    }

    private void validateParameterForProcCall(RubyArray args) {
        if (argc_ >= 0 && !has_asterisk_parameter_) {
            int actual_args_length = (null == args) ? 0 : args.size();
            int required_args_length = argc_ - default_argc_;
            if (actual_args_length != required_args_length) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + actual_args_length + " for " + required_args_length + ")");
            }
        }
    }

    public RubyValue invoke(RubyValue receiver, RubyArray args) {
        if (createdByLambda_) {
            validateParameterForProcCall(args);
        }

        __break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver, null != args ? args : new RubyArray(0));
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }

    protected abstract RubyValue run(RubyValue receiver, RubyArray args);

    // no arg invocation
    public RubyValue invoke(RubyValue receiver) {
        __break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver);
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }

    // no arg run
    protected RubyValue run(RubyValue receiver) {
        return this.run(receiver, new RubyArray(0));
    }

    // one arg invocation
    public RubyValue invoke(RubyValue receiver, RubyValue arg) {
        __break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver, arg);
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }

    // one arg run
    protected RubyValue run(RubyValue receiver, RubyValue arg) {
        return this.run(receiver, new RubyArray(arg));
    }

    // two args invocation
    public RubyValue invoke(RubyValue receiver, RubyValue arg1, RubyValue arg2) {
        __break__ = false;
        __return__ = false;
        __redo__ = false;

        RubyValue v = run(receiver, arg1, arg2);
        //TODO Maybe we can just use the fields in BlockCallStatus, remove the
        //__break__, __return__, __redo__ here
        if (v.returnedInBlock()) {
            __return__ = true;
        }
        return v;
    }

    // two args run
    protected RubyValue run(RubyValue receiver, RubyValue arg0, RubyValue arg1) {
        return this.run(receiver, new RubyArray(arg0, arg1));
    }
}

