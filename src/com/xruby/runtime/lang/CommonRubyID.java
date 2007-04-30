/**
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class CommonRubyID {
    public static final RubyID initializeId = StringMap.intern("initialize");

    public static RubyID inspectID = StringMap.intern("inspect");

    public static RubyID toSID = StringMap.intern("to_s");
    public static RubyID toIID = StringMap.intern("to_i");
    public static RubyID toFID = StringMap.intern("to_f");

    public static RubyID eachID = StringMap.intern("each");

    public static RubyID lengthID = StringMap.intern("length");

    public static RubyID plusID = StringMap.intern("+");
    public static RubyID subID = StringMap.intern("-");

    public static RubyID matchID = StringMap.intern("=~");

    public static RubyID equalID = StringMap.intern("==");
    public static RubyID longEqualID = StringMap.intern("===");
    public static RubyID unequalID = StringMap.intern("<=>");
    public static RubyID lessID = StringMap.intern("<");

    public static RubyID writeID = StringMap.intern("write");

    public static RubyID extendObjectID = StringMap.intern("extend_object");

    public static RubyID methodMissingId = StringMap.intern("method_missing");

    static RubyID attachedID = StringMap.intern("__attached__");

    private CommonRubyID() {
    }
}
