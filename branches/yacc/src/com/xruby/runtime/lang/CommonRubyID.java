/**
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class CommonRubyID {
    public static final RubyID initializeId = StringMap.intern("initialize");

    public static final RubyID inspectID = StringMap.intern("inspect");

    public static final RubyID toSID = StringMap.intern("to_s");
    public static final RubyID toIID = StringMap.intern("to_i");
    public static final RubyID toFID = StringMap.intern("to_f");

    public static final RubyID eachID = StringMap.intern("each");

    public static final RubyID lengthID = StringMap.intern("length");

    public static final RubyID plusID = StringMap.intern("+");
    public static final RubyID subID = StringMap.intern("-");

    public static final RubyID matchID = StringMap.intern("=~");

    public static final RubyID equalID = StringMap.intern("==");
    public static final RubyID longEqualID = StringMap.intern("===");
    public static final RubyID unequalID = StringMap.intern("<=>");
    public static final RubyID lessID = StringMap.intern("<");

    public static final RubyID writeID = StringMap.intern("write");

    public static final RubyID extendObjectID = StringMap.intern("extend_object");

    public static final RubyID methodMissingId = StringMap.intern("method_missing");
    public static final RubyID inheritedID = StringMap.intern("inherited");
    public static final RubyID methodAddedID = StringMap.intern("method_added");

    static final RubyID attachedID = StringMap.intern("__attached__");
    static final RubyID classidID = StringMap.intern("__classid__");

    //used by the compiler to use common ruby id
    static String name2Field(String name) {
        //TODO resue more
        if (name.equals("+")) {
            return "plusID";
        } else  if (name.equals("-")) {
            return "subID";
        } else {
            return null;
        }
    }

    private CommonRubyID() {
    }
}
