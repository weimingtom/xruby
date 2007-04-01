/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.GlobalVariables;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RubyRegexp extends RubyBasic {

    private Pattern regex_;

    RubyRegexp(String v) {
        super(RubyRuntime.RegexpClass);
        setValue(v);
    }

    RubyRegexp() {
        super(RubyRuntime.RegexpClass);
    }

    public void setValue(String v) {
        regex_ = Pattern.compile(v, Pattern.MULTILINE);
    }

    public static String quote(String s) {
        String r = Pattern.quote(s);
        r = r.replace("(", "\\(");
        r = r.replace(")", "\\)");
        r = r.replace("[", "\\[");
        r = r.replace("]", "\\]");
        r = r.replace("{", "\\{");
        r = r.replace("}", "\\}");
        r = r.replace("+", "\\+");
        r = r.replace("*", "\\*");
        r = r.replace("?", "\\?");
        r = r.replace("|", "\\|");
        return r.substring(2, r.length() - 2);
    }

    public boolean caseEqual(String v) {
        return match(v) != null;
    }

    public RubyMatchData match(String v) {
        Matcher m = regex_.matcher(v);
        int i = 0;
        if (m.find()) {
            ++i;
            GlobalVariables.set(ObjectFactory.createString(m.toString()), "$" + i);
            GlobalVariables.set(ObjectFactory.createString(m.toString()), "$&");
            return ObjectFactory.createMatchData(m);
        } else {
            GlobalVariables.set(ObjectFactory.createString(m.toString()), "$1");
            GlobalVariables.set(ObjectFactory.NIL_VALUE, "$&");
            return null;
        }
    }

    public int matchPosition(String v) {
        if (v.length() == 0) {
            v = "\n"; //TODO a hack to handle "" =~ /^$/, need a better solution
        }

        Matcher m = regex_.matcher(v);
        if (m.find()) {
            GlobalVariables.set(ObjectFactory.createString(m.group()), "$&");
            return m.start();
        } else {
            GlobalVariables.set(ObjectFactory.NIL_VALUE, "$&");
            return -1;
        }
    }

    private String getReplaceString(String replace_string, Matcher m) {
        //java uses $1, $2, ruby uses \1, \2
        replace_string = replace_string.replace("\\&", "$0");
        final int n = m.groupCount();
        for (int i = 1; i <= n; ++i) {
            replace_string = replace_string.replace("\\" + i, "$" + i);
        }
        for (int i = n + 1; i < 10; ++i) {
            replace_string = replace_string.replace("\\" + i, "");
        }

        return replace_string;
    }

    public String sub(RubyString str, RubyString repl) {
        Matcher m = regex_.matcher(str.toString());
        String replace_String = getReplaceString(repl.toString(), m);
        return m.replaceFirst(replace_String);
    }

    public RubyString sub(RubyString s, RubyBlock block) {
        Matcher m = regex_.matcher(s.toString());
        int end = -1;
        final int groupcount = m.groupCount();
        RubyString r = new RubyString("");
        if (m.find()) {
            for (int i = 1; i <= groupcount; ++i) {
                String sg = m.group(i);
                GlobalVariables.set(ObjectFactory.createString(sg), "$" + i);
            }
            String g = m.group();
            end = m.end();
            GlobalVariables.set(ObjectFactory.createString(g), "$&");
            RubyString match = new RubyString(g);
            RubyValue v = block.invoke(this, new RubyArray(match));
            r.appendString(v);
        }

        if (end >= 0 && end < s.length()) {
            r.appendString(s.toString().substring(end, s.length()));
        }

        return r;
    }

    public String gsub(RubyString str, RubyString repl) {
        Matcher m = regex_.matcher(str.toString());
        String replace_string = getReplaceString(repl.toString(), m);
        return m.replaceAll(replace_string);
    }

    public RubyString gsub(RubyString s, RubyBlock block) {
        Matcher m = regex_.matcher(s.toString());
        final int groupcount = m.groupCount();
        RubyString r = new RubyString("");
        int end = -1;
        while (m.find()) {
            for (int i = 1; i <= groupcount; ++i) {
                String sg = m.group(i);
                GlobalVariables.set(ObjectFactory.createString(sg), "$" + i);
            }
            String g = m.group();
            end = m.end();
            GlobalVariables.set(ObjectFactory.createString(g), "$&");
            RubyString match = new RubyString(g);
            RubyValue v = block.invoke(this, new RubyArray(match));
            r.appendString(v);
        }

        //append unmatched
        if (end >= 0 && end < s.length()) {
            r.appendString(s.toString().substring(end, s.length()));
        }

        return r;
    }

    public String[] split(String input, int limit) {
        return regex_.split(input, limit);
    }

    public RubyString inspect() {
        RubyString s = ObjectFactory.createString("/");
        s.appendString(regex_.toString());
        s.appendString("/");
        return s;
    }
}
