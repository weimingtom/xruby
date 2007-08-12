/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.math.BigInteger;
import java.util.Formatter;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyAllocMethod;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

@RubyLevelClass(name="String")
public class RubyString extends RubyBasic {
    private StringBuilder sb_;

    RubyString(RubyClass c, String s) {
        super(c);
        sb_ = new StringBuilder(s);
    }

    RubyString(String s) {
        super(RubyRuntime.StringClass);
        sb_ = new StringBuilder(s);
    }

    RubyString(StringBuilder sb) {
        super(RubyRuntime.StringClass);
        sb_ = sb;
    }

    @RubyAllocMethod
    public static RubyString alloc(RubyValue receiver) {
        return ObjectFactory.createString((RubyClass)receiver, "");
    }

    @RubyLevelMethod(name="initialize", alias="initialize_copy")
    public RubyString initialize(RubyValue v) {
        this.setString(v.toStr());
        return this;
    }

    @RubyLevelMethod(name="initialize", alias="initialize_copy")
    public RubyString initialize() {
        return this;
    }

    public RubyString clone() {
        RubyString s = (RubyString)super.clone();
        s.sb_ = new StringBuilder(sb_);
        return s;
    }

    public String toString() {
        return sb_.toString();
    }

    public int toInt() {
        return Integer.valueOf(sb_.toString());
    }

    public double toFloat() {
        return Double.parseDouble(this.sb_.toString());
    }

    public RubyString toRubyString() {
        return this;
    }

    public String toStr() {
        return this.sb_.toString();
    }

    @RubyLevelMethod(name="to_f")
    public RubyFloat toRubyFloat() {
        double d;
        try {
            d = this.toFloat();
        } catch (NumberFormatException e) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, e.toString());
        }
        return ObjectFactory.createFloat(d);
    }

    @RubyLevelMethod(name="to_s")
    public RubyString to_s() {
        return ObjectFactory.createString(this.sb_.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj instanceof RubyString) {
            RubyString s = (RubyString)obj;
            return this.sb_.toString().equals(s.sb_.toString());
        } else {
            return super.equals(obj);
        }
    }

    public int hashCode() {
        return sb_.toString().hashCode();
    }

    @RubyLevelMethod(name="length")
    public RubyFixnum rubyLength() {
        return ObjectFactory.createFixnum(sb_.length());
    }

    public int length() {
        return sb_.length();
    }

    @RubyLevelMethod(name="intern", alias="to_sym")
    public RubySymbol intern() {
        if (this.sb_.length() <= 0) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "interning empty string");
        }

        RubyID id = RubyID.intern(this.sb_.toString());
        return id.toSymbol();
    }

    @RubyLevelMethod(name="+")
    public RubyString plus(RubyValue v) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.sb_);
        sb.append(v.toRubyString().sb_);
        return ObjectFactory.createString(sb);
    }

    public RubyString appendString(String v) {
        sb_.append(v);
        return this;
    }

    private RubyString appendString(RubyString v) {
        sb_.append(v.sb_);
        return this;
    }

    public RubyString appendString(RubyValue v) {
        if (v instanceof RubyString) {
            return appendString((RubyString)v);
        } else {
            RubyValue r = RubyAPI.callPublicMethod(v, null, null, RubyID.toSID);
            return appendString((RubyString)r);
        }
    }

    @RubyLevelMethod(name="concat", alias="<<")
    public RubyString concat(RubyValue v) {
        if (v instanceof RubyFixnum) {
            int i = v.toInt();
            if (i >= 0 && i <= 0xff) {
                this.sb_.append((char)i);
                return this;
            }
        }

        this.sb_.append(v.toRubyString().sb_);
        return this;
    }

    public RubyString setString(String s) {
        sb_.replace(0, sb_.length(), s);
        return this;
    }

    @RubyLevelMethod(name="==")
    public RubyValue opEqual(RubyValue v) {
        if (this == v) {
            return RubyConstant.QTRUE;
        }

        if (v instanceof RubyString) {
            RubyString str = ((RubyString)v);
            if ((this.sb_.length() == str.sb_.length() && this.cmp(str) == 0)) {
                return RubyConstant.QTRUE;
            } else {
                return RubyConstant.QFALSE;
            }
        }

        if (v.respondTo(RubyID.toStrID)) {
            return ObjectFactory.createBoolean(v.equals(this));
        } else {
            return RubyConstant.QFALSE;
        }
    }

    private int cmp(RubyString s) {
        int result = this.sb_.toString().compareTo(s.sb_.toString());
        if (result == 0) {
            return 0;
        } else if (result > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @RubyLevelMethod(name="strip")
    public RubyString strip() {
        return ObjectFactory.createString(sb_.toString().trim());
    }

    @RubyLevelMethod(name="strip!")
    public RubyValue stripBang() {
        String str = this.sb_.toString();
        int orgSize = str.length();
        str = str.trim();
        this.sb_ = new StringBuilder(str);
        if (str.length() == orgSize) {
            return RubyConstant.QNIL;
        }

        return this;
    }

    @RubyLevelMethod(name="capitalize")
    public RubyString capitalize() {
        int length = this.sb_.length();
        if (length == 0) {
            return ObjectFactory.createString();
        }

        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);

        ca[0] = Character.toUpperCase(ca[0]);
        for (int i = 1; i < length; i++) {
            ca[i] = Character.toLowerCase(ca[i]);
        }

        return ObjectFactory.createString(new StringBuilder().append(ca));
    }

    @RubyLevelMethod(name="capitalize!")
    public RubyValue capitalizeBang() {
        int length = this.sb_.length();
        if (length == 0) {
            return RubyConstant.QNIL;
        }

        boolean modify = false;
        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);

        if (Character.isLowerCase(ca[0])) {
            ca[0] = Character.toUpperCase(ca[0]);
            modify = true;
        }

        for (int i = 1; i < ca.length; i++) {
            char c = ca[i];
            if (Character.isUpperCase(c)) {
                ca[i] = Character.toLowerCase(c);
                modify = true;
            }
        }

        this.sb_.delete(0, ca.length).append(ca);
        return modify ? this : RubyConstant.QNIL;
    }

    @RubyLevelMethod(name="upcase")
    public RubyString upcase() {
        int length = this.sb_.length();
        if (length == 0) {
            return ObjectFactory.createString();
        }

        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);

        for (int i = 0; i < ca.length; i++) {
            ca[i] = Character.toUpperCase(ca[i]);
        }

        return ObjectFactory.createString(new StringBuilder().append(ca));
    }

    @RubyLevelMethod(name="upcase!")
    public RubyValue upcaseBang() {
        boolean modify = false;

        int length = this.sb_.length();
        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);

        for (int i = 0; i < length; i++) {
            char c = ca[i];
            if (Character.isLowerCase(c)) {
                ca[i] = Character.toUpperCase(c);
                modify = true;
            }
        }
        this.sb_.delete(0, ca.length).append(ca);
        return modify ? this : RubyConstant.QNIL;
    }

    @RubyLevelMethod(name="downcase")
    public RubyString downcase() {
        int length = this.sb_.length();
        if (length == 0) {
            return ObjectFactory.createString();
        }

        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);

        for (int i = 0; i < ca.length; i++) {
            ca[i] = Character.toLowerCase(ca[i]);
        }

        return ObjectFactory.createString(new StringBuilder().append(ca));
    }

    @RubyLevelMethod(name="downcase!")
    public RubyValue downcaseBang() {
        boolean modify = false;
        int length = this.sb_.length();
        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);
        for (int i = 0; i < ca.length; i++) {
            char c = ca[i];
            if (Character.isUpperCase(c)) {
                ca[i] = Character.toLowerCase(c);
                modify = true;
            }
        }
        this.sb_.delete(0, ca.length).append(ca);
        return modify ? this : RubyConstant.QNIL;
    }

    public void reverse() {
        sb_.reverse();
    }

    public void chomp(String seperator) {
        if (!sb_.toString().endsWith(seperator)) {
            return;
        }

        int start = sb_.length() - seperator.length();
        int end = sb_.length();
        sb_.delete(start, end);
    }

    public RubyArray scan(RubyRegexp regex) {
        RubyMatchData match = regex.match(sb_.toString());
        if (null != match) {
            return match.toArray();
        } else {
            return new RubyArray();
        }
    }

    /// @return false if no change made
    // TODO handle more situations
    private boolean transform(String from, String to, boolean remove_duplicate) {
        String oldString = sb_.toString();

        if (from.length() == 3 && to.length() == 3 && from.charAt(1) == '-' && to.charAt(1) == '-') {
            char from_start = from.charAt(0);
            char from_end = from.charAt(2);
            char to_start = to.charAt(0);
            char to_end = to.charAt(2);

            char last_char = 0;
            for (int i = 0; i < sb_.length(); ++i) {
                char current_char = sb_.charAt(i);
                if (current_char >= from_start && current_char <= from_end) {
                    if (remove_duplicate && last_char == current_char) {
                        sb_.deleteCharAt(i);
                        --i;
                    } else {
                        int replace_char = (current_char - from_start) + to_start;
                        sb_.setCharAt(i, replace_char < to_end ? (char)replace_char : to_end);
                        last_char = current_char;
                    }
                }
            }
        }else {
            char last_char = 0;
            for (int i = 0; i < sb_.length(); ++i) {
                char current_char = sb_.charAt(i);
                int index = from.indexOf(current_char);
                if (index >= 0) {
                    if (remove_duplicate && last_char == current_char) {
                            sb_.deleteCharAt(i);
                            --i;
                        } else {
                            char replace_char = to.charAt(index < to.length() ? index : to.length());
                            sb_.setCharAt(i, replace_char);
                            last_char = current_char;
                        }
                }
            }
        }

        return !oldString.equals(sb_.toString());
    }

    public boolean tr(String from, String to) {
        return transform(from, to, false);
    }

    public boolean tr_s(String from, String to) {
        return transform(from, to, true);
    }

    public boolean squeeze(String from) {
        if (null != from && from.length() == 3 && from.charAt(1) == '-' ) {
            char from_start = from.charAt(0);
            char from_end = from.charAt(2);
            char last_char = 0;
            for (int i = 0; i < sb_.length(); ++i) {
                char current_char = sb_.charAt(i);
                if (current_char >= from_start && current_char <= from_end) {
                    if (last_char == current_char) {
                        sb_.deleteCharAt(i);
                        --i;
                    } else {
                        last_char = current_char;
                    }
                }
            }
            return true;
        }

        //TODO handle more situations
        return false;
    }

    public boolean delete(String from) {
        if (null != from && from.length() == 3 && from.charAt(1) == '-' ) {
            char from_start = from.charAt(0);
            char from_end = from.charAt(2);
            for (int i = 0; i < sb_.length(); ++i) {
                char current_char = sb_.charAt(i);
                if (current_char >= from_start && current_char <= from_end) {
                    sb_.deleteCharAt(i);
                    --i;
                }
            }
            return true;
        } else {
            int index = sb_.indexOf(from);
            if (index < 0) {
                return false;
            }

            sb_.delete(index, index + from.length());
            return true;
        }
    }

    public int count(String s) {
        int n = 0;
        for (int i = 0; i < sb_.length(); ++i) {
            if (s.indexOf(sb_.charAt(i)) >= 0) {
                ++n;
            }
        }
        return n;
    }

    @RubyLevelMethod(name="swapcase")
    public RubyString swapcase() {
        int length = this.sb_.length();
        if (length == 0) {
            return ObjectFactory.createString();
        }

        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);

        for (int i = 0; i < length; i++) {
            char c = ca[i];
            if (Character.isUpperCase(c)) {
                ca[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                ca[i] = Character.toUpperCase(c);
            }
        }

        return ObjectFactory.createString(new StringBuilder().append(ca));
    }

    @RubyLevelMethod(name="swapcase!")
    public RubyValue swapcaseBang() {
        int length = this.sb_.length();
        if (length == 0) {
            return RubyConstant.QNIL;
        }

        char[] ca = new char[length];
        this.sb_.getChars(0, length, ca, 0);
        boolean modify = false;

        for (int i = 0; i < length; i++) {
            char c = ca[i];
            if (Character.isUpperCase(c)) {
                ca[i] = Character.toLowerCase(c);
                modify = true;
            } else if (Character.isLowerCase(c)) {
                ca[i] = Character.toUpperCase(c);
                modify = true;
            }
        }

        this.sb_.delete(0, ca.length).append(ca);
        return modify ? this : RubyConstant.QNIL;
    }

    @RubyLevelMethod(name="chop")
    public RubyValue chop() {
        RubyString rs = this.clone();
        rs.chopBang();
        return rs;
    }

    @RubyLevelMethod(name="chop!")
    public RubyValue chopBang() {
        int length = this.sb_.length();
        if (length > 0) {
            int orgLength = length;
            length--;
            if (this.sb_.charAt(length) == '\n') {
                if (length > 0 && this.sb_.charAt(length - 1) == '\r') {
                    length--;
                }
            }

            this.sb_.delete(length, orgLength);
        }

        return RubyConstant.QNIL;
    }

    private boolean isEvstr(char c, int current, int end) {
        return (current < end) && (c == '$') && (c == '@') && (c == '{');
    }

    private boolean isAscii(char c) {
        return c <= 0x7F;
    }

    private boolean isPrint(char c) {
        return isAscii(c) && c > 0x1F;
    }

    private static Formatter formatter;

    private String formatForDump(String format, char c) {
        if (RubyString.formatter == null) {
            RubyString.formatter = new Formatter();
        }

        return RubyString.formatter.format(format, c).toString();
    }

    public String dump() {
        int length = this.sb_.length();
        StringBuilder buf = new StringBuilder();
        buf.append('"');

        for (int i = 0; i < length; i++) {
            char c = this.sb_.charAt(i);

            if (c == '"' || c == '\\') {
                buf.append('\\');
                buf.append(c);
            } else if (c == '#') {
                if (isEvstr(c, i, length - 1)) {
                    buf.append('\\');
                }
                buf.append('#');
            } else if (isPrint(c)) {
                buf.append(c);
            } else if (c == '\n') {
                buf.append('\\');
                buf.append('n');
            } else if (c == '\r') {
                buf.append('\\');
                buf.append('r');
            } else if (c == '\t') {
                buf.append('\\');
                buf.append('t');
            } else if (c == '\f') {
                buf.append('\\');
                buf.append('f');
            } else if (c == '\013') {
                buf.append('\\');
                buf.append('v');
            } else if (c == '\010') {
                buf.append('\\');
                buf.append('b');
            } else if (c == '\007') {
                buf.append('\\');
                buf.append('a');
            } else if (c == '\033') {
                buf.append('\\');
                buf.append('e');
            } else {
                buf.append('\\');
                buf.append(formatForDump("%03o", c));
            }
        }

        buf.append('"');

        return buf.toString();
    }

    @RubyLevelMethod(name="dump")
    public RubyString rubyDump() {
        return ObjectFactory.createString(this.dump());
    }

    @RubyLevelMethod(name="each", alias="each_line")
    public RubyValue each(RubyBlock block) {
        // FIXME: for each line
        block.invoke(this, this);
        return this;
    }

    @RubyLevelMethod(name="to_i")
    public RubyValue to_i(RubyArray args) {
        String value = toString();

        value = value.replaceAll("[^+\\-a-zA-Z0-9]", "");
        int end = value.indexOf('+', 1);
        int end1 = value.indexOf('-', 1);

        if (end < 0) {
            if (end1 < 0) {
                end = value.length();
            } else {
                end = end1;
            }
        } else {
            if (end1 >= 0) {
                end = Math.min(end, end1);
            }
        }

        value = value.substring(0, end);

        int radix = 10;
        if (null != args) {
            radix = ((RubyFixnum) args.get(0)).toInt();
        }

        if (radix >= 2 && radix <= 36) {
            BigInteger bigint;
            try {
                bigint = new BigInteger(value, radix);
            } catch (NumberFormatException e) {
                return ObjectFactory.FIXNUM0;
            }
            return RubyBignum.bignorm(bigint);
        }
        throw new RubyException(RubyRuntime.ArgumentErrorClass, "illegal radix " + radix);

    }

    @RubyLevelMethod(name="hex")
    public RubyValue hex() {
        String s = toString();
        if (s.startsWith("0x")) {
            s = s.substring("0x".length());
        }

        try {
            return ObjectFactory.createFixnum(Integer.valueOf(s, 16));
        } catch (NumberFormatException e) {
            return ObjectFactory.FIXNUM0;
        }

    }

    @RubyLevelMethod(name="gsub")
    public RubyValue gsub(RubyArray args, RubyBlock block) {
        if (null == block) {
            return ObjectFactory.createString(gsub(this, args));
        } else {
            if (null == args || args.size() != 1) {
                int actual_argc = (null == args ) ? 0 : args.size();
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `gsub': wrong number of arguments (" + actual_argc + " for 1)");
            }
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.gsub(this, block);
        }
    }

    @RubyLevelMethod(name="gsub!")
    public RubyValue gsub_danger(RubyArray args, RubyBlock block) {
        if (null == block) {
            String result = gsub(this, args);

            if (toString().equals(result)) {
                return ObjectFactory.NIL_VALUE;
            } else {
                return setString(result);
            }
        } else {
            if (null == args || args.size() != 1) {
                int actual_argc = (null == args ) ? 0 : args.size();
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `gsub!': wrong number of arguments (" + actual_argc + " for 1)");
            }
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return setString(r.gsub(this, block).toString());
        }
    }

    @RubyLevelMethod(name="sub")
    public RubyValue sub(RubyArray args, RubyBlock block) {
        if (null == block) {
            return ObjectFactory.createString(sub(this, args));
        } else {
            if (null == args || args.size() != 1) {
                int actual_argc = (null == args ) ? 0 : args.size();
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `sub': wrong number of arguments (" + actual_argc + " for 1)");
            }
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.sub(this, block);
        }
    }

    @RubyLevelMethod(name="sub!")
    public RubyValue sub_danger(RubyArray args, RubyBlock block) {
        if (null == block) {
            String result = sub(this, args);
            if (toString().equals(result)) {
                return ObjectFactory.NIL_VALUE;
            } else {
                return setString(result);
            }
        } else {
            if (null == args || args.size() != 1) {
                int actual_argc = (null == args ) ? 0 : args.size();
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `sub!': wrong number of arguments (" + actual_argc + " for 1)");
            }
            if (!(args.get(0) instanceof RubyRegexp)) {
                throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
            }

            RubyRegexp r = (RubyRegexp) args.get(0);
            return setString(r.sub(this, block).toString());
        }
    }

    private String gsub(RubyString g, RubyArray args) {
        if (null == args || args.size() != 2) {
            int actual_argc = (null == args ) ? 0 : args.size();
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `gsub': wrong number of arguments (" + actual_argc + " for 2)");
        }

        if (!(args.get(1) instanceof RubyString)) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "can't convert " + args.get(1).getRubyClass().getName() + " into String");
        }

        RubyString s = (RubyString) args.get(1);

        if (args.get(0) instanceof RubyRegexp) {
            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.gsub(g, s);
        } else if (args.get(0) instanceof RubyString) {
            RubyString r = (RubyString) args.get(0);
            return g.toString().replaceAll(r.toString(), s.toString());
        } else {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
        }
    }

    private String sub(RubyString g, RubyArray args) {
        if (null == args || args.size() != 2) {
            int actual_argc = (null == args ) ? 0 : args.size();
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `sub': wrong number of arguments (" + actual_argc + " for 2)");
        }

        if (!(args.get(1) instanceof RubyString)) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "can't convert " + args.get(1).getRubyClass().getName() + " into String");
        }

        RubyString s = (RubyString) args.get(1);

        if (args.get(0) instanceof RubyRegexp) {
            RubyRegexp r = (RubyRegexp) args.get(0);
            return r.sub(g, s);
        } else if (args.get(0) instanceof RubyString) {
            RubyString r = (RubyString) args.get(0);
            return g.toString().replaceFirst(r.toString(), s.toString());
        } else {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
        }
    }


}
