/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class MethodBlockBase {
    protected int argc_;
    protected boolean has_asterisk_parameter_;
    protected int default_argc_;
    protected RubyValue[] default_values_ = null;
    private RubyModule scopeOfCurrentMethod_;

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

    public RubyModule getScope() {
        return scopeOfCurrentMethod_;
    }

    public void setScope(RubyModule m) {
        scopeOfCurrentMethod_ = m;
    }
}

