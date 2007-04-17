/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

import java.math.BigInteger;
import java.util.Date;
import java.util.regex.Matcher;

public class ObjectFactory {

    public static final RubyValue TRUE_VALUE = new RubyObject(RubyRuntime.TrueClassClass);
    public static final RubyValue FALSE_VALUE = new RubyObject(RubyRuntime.FalseClassClass);
    public static final RubyValue NIL_VALUE = new RubyObject(RubyRuntime.NilClassClass);
    public static final RubyValue TOP_LEVEL_SELF_VALUE = new RubyObject(RubyRuntime.ObjectClass);

    //For preformance reason, some frequently used numbers are predefined here.
    public static final RubyFixnum FIXNUM_NEGATIVE_ONE = new RubyFixnum(-1);
    public static final RubyFixnum FIXNUM0 = new RubyFixnum(0);
    public static final RubyFixnum FIXNUM1 = new RubyFixnum(1);
    public static final RubyFixnum FIXNUM2 = new RubyFixnum(2);
    public static final RubyFixnum FIXNUM3 = new RubyFixnum(3);
    public static final RubyFixnum FIXNUM4 = new RubyFixnum(4);
    public static final RubyFixnum FIXNUM5 = new RubyFixnum(5);
    public static final RubyFixnum FIXNUM6 = new RubyFixnum(6);
    public static final RubyFixnum FIXNUM7 = new RubyFixnum(7);
    public static final RubyFixnum FIXNUM8 = new RubyFixnum(8);
    public static final RubyFixnum FIXNUM9 = new RubyFixnum(9);
    public static final RubyFixnum FIXNUM10 = new RubyFixnum(10);

    private static final int CACHE_SIZE = 1024;/*cache 0...CACHE_SIZE*/

    private static class FixnumCache {
        private FixnumCache() {
        }

        static final RubyFixnum cache[] = new RubyFixnum[CACHE_SIZE];

        static {
            for (int i = 0; i < CACHE_SIZE; i++) {
                cache[i] = new RubyFixnum(i);
            }
        }
    }

    public static RubyFixnum createFixnum(int value) {
        if (value >= 0 && value < CACHE_SIZE) {
            return FixnumCache.cache[value];
        }

        return new RubyFixnum(value);
    }

    public static RubyString createString(String value) {
        return new RubyString(value);
    }

    public static RubyString createString() {
        return new RubyString("");
    }

    public static RubyString createString(StringBuilder value) {
        return new RubyString(value);
    }

    public static RubyRegexp createRegexp(String value) {
        return new RubyRegexp(value);
    }

    public static RubyRegexp createRegexp() {
        return new RubyRegexp();
    }

    public static RubySymbol createSymbol(String value) {
        return new RubySymbol(value);
    }

    public static RubyFloat createFloat(double value) {
        return new RubyFloat(value);
    }

    public static RubyArray createArray(int size, int rhs_size, boolean has_single_asteriskor_or_call) {
        return new RubyArray(size, rhs_size, has_single_asteriskor_or_call);
    }

    public static RubyHash createHash() {
        return new RubyHash();
    }

    public static RubyIO createFile(String filename, String mode) {
        return new RubyIO(filename, mode);
    }

    public static MethodValue createMethod(RubyValue r, String s, RubyMethod m) {
        return new MethodValue(r, s, m);
    }

    public static RubyProc createProc(RubyBlock block) {
        return new RubyProc(block);
    }

    public static RubyTime createTime(Date v) {
        return new RubyTime(v);
    }

    public static RubyTime createTime() {
        return new RubyTime();
    }

    public static RubyRange createRange() {
        return new RubyRange();
    }

    public static RubyRange createRange(RubyValue left, RubyValue right, boolean isExclusive) {
        RubyRange r = new RubyRange();
        r.setValue(left, right, isExclusive);
        return r;
    }

    public static RubyMatchData createMatchData(Matcher m) {
        return new RubyMatchData(m);
    }

    public static RubyBignum createBignum(BigInteger value) {
        return new RubyBignum(value);
    }

    public static RubyBignum createBignum(String value) {
        return new RubyBignum(new BigInteger(value));
    }

    public static RubyValue createBoolean(boolean value) {
        if (value) {
            return TRUE_VALUE;
        }
        return FALSE_VALUE;
    }
}