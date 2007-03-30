/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;


public class RubyRange extends RubyBasic {
    private RubyValue begin_;
    private RubyValue end_;
    private boolean exclude_end_;

    RubyRange() {
        super(RubyRuntime.RangeClass);
    }

    public void setValue(RubyValue left, RubyValue right, boolean isExclusive) {
        try {
            RubyValue result = RubyAPI.callOneArgMethod(left, right, null, CommonRubyID.unequalID);
            if (result == ObjectFactory.NIL_VALUE) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
            }
        } catch (RubyException exception) {
            if (exception.getRubyValue().getRubyClass() == RubyRuntime.ArgumentErrorClass) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range");
            }
            throw exception;
        }

        begin_ = left;
        end_ = right;
        exclude_end_ = isExclusive;
    }

    public RubyValue getLeft() {
        return begin_;
    }

    public RubyValue getRight() {
        return end_;
    }

    public boolean isExcludeEnd() {
        return exclude_end_;
    }

    public RubyArray to_a() {
        //TODO may not be RubyFixnum
        int left = ((RubyFixnum) begin_).intValue();
        int right = ((RubyFixnum) end_).intValue();
        if (!exclude_end_) {
            ++right;
        }

        RubyArray a = new RubyArray(right - left);
        for (int i = left; i < right; ++i) {
            a.add(ObjectFactory.createFixnum(i));
        }
        return a;
    }
}
