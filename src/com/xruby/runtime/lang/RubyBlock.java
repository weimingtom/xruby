/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class MethodBlockBase {
    protected int argc_;
    protected boolean has_asterisk_parameter_;
    protected int default_argc_;
    protected RubyValue[] default_values_ = null;

    //TODO we can just just use regular local variables for these two
    protected RubyValue asterisk_parameter_;
    protected RubyValue block_parameter_;

    protected MethodBlockBase(int argc, boolean has_asterisk_parameter, int default_argc) {
        argc_ = argc;
        has_asterisk_parameter_ = has_asterisk_parameter;
        default_argc_ = default_argc;
    }

    public int arity() {
        if (has_asterisk_parameter_ || default_argc_ > 0) {
            return -(argc_ - default_argc_) - 1;
        } else {
            return argc_;
        }
    }

    protected RubyValue initializeAsteriskParameter(RubyArray args) {
        if (null == args) {
            asterisk_parameter_ = new RubyArray();
        } else {
            asterisk_parameter_ = args.collect(argc_);
        }

        return asterisk_parameter_;
    }

    protected RubyValue initializeBlockParameter(RubyBlock block) {
        if (null == block) {
            block_parameter_ = ObjectFactory.NIL_VALUE;
        } else {
            block_parameter_ = ObjectFactory.createProc(block);
        }

        return block_parameter_;
    }

}

public abstract class RubyBlock extends MethodBlockBase {

    // if run finished, and __break__ is not true, it indicated break happend
    //e.g.
    // loop do
    //      break 'xxx'
    // end
    protected boolean __break__ = false;
    protected boolean __return__ = false;
    protected boolean __redo__ = false;
    protected RubyBlock blockOfCurrentMethod_;

    //consider MethodValue: it has a 'receiver' field to remember the the receivre should be.
    //we we convert Method to Proc, need to keep the 'receiver' -- that what selfOfCurrentMethod_ is for.
    //TODO can we just remove the 'receiver' parameter of invoke() method???
    protected RubyValue selfOfCurrentMethod_;
    private RubyBlock owner_;//not null if defined in another block
    protected RubyModule scopeOfCurrentMethod_;

    private boolean created_by_lambda_ = false;

    public RubyBlock(int argc, boolean has_asterisk_parameter, int default_argc, RubyBlock block, RubyValue self, RubyBlock owner, RubyModule scope) {
        super(argc, has_asterisk_parameter, default_argc);
        blockOfCurrentMethod_ = block;
        selfOfCurrentMethod_ = self;
        owner_ = owner;
        scopeOfCurrentMethod_ = scope;
    }

	public void setScope(RubyModule m) {
        scopeOfCurrentMethod_ = m;
    }
	
    public void setSelf(RubyValue v) {
        selfOfCurrentMethod_ = v;
    }

    public RubyValue getSelf() {
        return selfOfCurrentMethod_;
    }

    public boolean isDefinedInAnotherBlock() {
        return null != owner_;
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
        created_by_lambda_ = true;
    }

    public boolean createdByLambda() {
        return created_by_lambda_;
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
        if (created_by_lambda_) {
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
}

