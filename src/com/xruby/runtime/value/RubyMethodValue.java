/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyMethodValue extends RubyBasic {

    private RubyValue receiver_;
    private String name_;
    private RubyMethod method_;

    RubyMethodValue(RubyValue receiver, String name, RubyMethod method) {
        super(RubyRuntime.MethodClass);
        receiver_ = receiver;
        name_ = name;
        method_ = method;
    }

    public RubyValue call(RubyArray args, RubyBlock block) {
        if (null != args && args.size() == 1) {
            return method_.invoke(receiver_, args.get(0), null, block);
        } else {
            return method_.invoke(receiver_, null, args, block);
        }
    }

    public RubyProc convertToRubyProc() {
        return ObjectFactory.createProc(method_.convertToRubyBolck(receiver_));
    }

    public int arity() {
        return method_.arity();
    }

    public RubyMethodValue bind(RubyValue receiver) {
		if (receiver.getRubyClass() != receiver_.getRubyClass()) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "bind argument must be an instance of " + receiver_.getRubyClass().getName());
		}
        receiver_ = receiver;
		setRubyClass(RubyRuntime.MethodClass);
		return this;//TODO It looks like we should return a copy, not the original
    }

    public RubyMethodValue unbind() {
        setRubyClass(RubyRuntime.UnboundMethodClass);
		return this;//TODO It looks like we should return a copy, not the original
    }

    public String toString() {
        StringBuilder s = new StringBuilder("#<Method: ");
        s.append(receiver_.getRubyClass().getName());
        s.append("#");
        s.append(name_);
        s.append(">");
        return s.toString();
    }
}
