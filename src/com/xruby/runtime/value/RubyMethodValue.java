/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.util.MethodType;

@RubyLevelClass(name="UnboundMethod")
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
    	return method_.invoke(receiver_, args, block);
    }

    public RubyProc convertToRubyProc() {
        return ObjectFactory.createProc(method_.convertToRubyBolck(receiver_));
    }

    public int arity() {
        return method_.arity();
    }

    @RubyLevelMethod(name="bind", type=MethodType.ONE_ARG)
    public RubyMethodValue bind(RubyValue receiver) {
		if (receiver.getRubyClass() != receiver_.getRubyClass()) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "bind argument must be an instance of " + receiver_.getRubyClass().getName());
		}
		RubyMethodValue m = new RubyMethodValue(receiver, name_, method_);
		return m;
    }

    public RubyMethodValue unbind() {
		RubyMethodValue m = new RubyMethodValue(receiver_, name_, method_);
        m.setRubyClass(RubyRuntime.UnboundMethodClass);
		return m;
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
