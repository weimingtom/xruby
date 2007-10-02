/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyAllocMethod;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.oro.text.perl.Perl5Util;

@RubyLevelClass(name="Regexp")
public class RubyRegexp extends RubyBasic {

    private Pattern regex_;

    RubyRegexp(String v) {
        super(RubyRuntime.RegexpClass);
        setValue(v);
    }

    RubyRegexp() {
        super(RubyRuntime.RegexpClass);
    }

    private void setValue(String v) {
        regex_ = Pattern.compile(v, Pattern.MULTILINE);
    }

    private void setValue(String v, RubyValue mode) {
        int flags = Pattern.MULTILINE;
        //TODO int mode = mode.toInt();
        regex_ = Pattern.compile(v, flags);
    }

    @RubyAllocMethod
    public static RubyRegexp alloc(RubyValue receiver) {
        return ObjectFactory.createRegexp();
    }

    @RubyLevelMethod(name="initialize")
    public RubyValue initialize(RubyValue arg) {
        RubyValue pattern = arg;
        if (pattern instanceof RubyRegexp) {
            regex_ = ((RubyRegexp)pattern).regex_;
        } else {
            setValue(pattern.toStr());
        }

        return this;
    }

    @RubyLevelMethod(name="initialize")
    public RubyValue initialize(RubyArray args) {
        RubyValue pattern = args.get(0);
        RubyValue mode = args.get(1);
        if (pattern instanceof RubyRegexp) {
            regex_ = ((RubyRegexp)pattern).regex_;
        } else {
            setValue(pattern.toStr(), mode);
        }

        return this;
    }

    @RubyLevelMethod(name="===")
    public RubyValue caseEqual(RubyValue arg) {
        if (!(arg instanceof RubyString)) {
            //not comparable
            return RubyConstant.QFALSE;
        }

        if (this.caseEqual(arg.toStr())) {
            return RubyConstant.QTRUE;
        } else {
            return RubyConstant.QFALSE;
        }
    }

    @RubyLevelMethod(name="match")
    public RubyValue match(RubyValue arg) {
        if (!(arg instanceof RubyString)) {
            //not comparable
            return RubyConstant.QFALSE;
        }

        RubyMatchData m = this.match(arg.toStr());
        if (null == m) {
            return RubyConstant.QNIL;
        } else {
            return m;
        }
    }

    @RubyLevelMethod(name="=~")
    public RubyValue opMatch(RubyValue arg) {
        if (!(arg instanceof RubyString)) {
            //not comparable
            return RubyConstant.QFALSE;
        }

        int p = this.matchPosition(arg.toStr());
        if (p < 0) {
            return RubyConstant.QNIL;
        } else {
            return ObjectFactory.createFixnum(p);
        }
    }

    @RubyLevelMethod(name="escape", alias="quote")
    public static RubyString quote(RubyValue receiver, RubyValue arg) {
        return ObjectFactory.createString(quote(arg.toStr()));
    }

    private static String quote(String s) {
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
            GlobalVariables.set(RubyConstant.QNIL, "$&");
            return null;
        }
    }

    int matchPosition(String v) {
        if (v.length() == 0) {
            v = "\n"; //TODO a hack to handle "" =~ /^$/, need a better solution
        }

        Matcher m = regex_.matcher(v);
        if (m.find()) {
            GlobalVariables.set(ObjectFactory.createString(m.group()), "$&");
            return m.start();
        } else {
            GlobalVariables.set(RubyConstant.QNIL, "$&");
            return -1;
        }
    }

    private String getReplaceString(String replace_string) {
        //java and oro uses $1, $2, ruby uses \1, \2
        replace_string = replace_string.replace("\\&", "$0");

        //%q{location:1 in 'l'}.sub(/\A(.+:\d+).*/, ' [\\1]') is as same as
        //%q{location:1 in 'l'}.sub(/\A(.+:\d+).*/, ' [\1]')
        for (int i = 1; i < 10; ++i) {
            replace_string = replace_string.replace("\\\\" + i, "$" + i);
            replace_string = replace_string.replace("\\" + i, "$" + i);
        }

        return replace_string;
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
            RubyValue v = block.invoke(this, match);
            r.appendString(v);
        }

        if (end >= 0 && end < s.length()) {
            r.appendString(s.toString().substring(end, s.length()));
        }

        return r;
    }

    public String gsub(RubyString str, RubyString repl) {
        Perl5Util util = new Perl5Util();
        String replace_String = getReplaceString(repl.toString());
        String regexp= "s/" + regex_.toString() + "/" + replace_String + "/g";
        return util.substitute(regexp, str.toString());
    }

    public String sub(RubyString str, RubyString repl) {
        Perl5Util util = new Perl5Util();
        String replace_String = getReplaceString(repl.toString());
        String regexp= "s/" + regex_.toString() + "/" + replace_String + "/";
        return util.substitute(regexp, str.toString());
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
            RubyValue v = block.invoke(this, match);
            r.appendString(v);
        }

        //append unmatched
        if (end >= 0 && end < s.length()) {
            r.appendString(s.toString().substring(end, s.length()));
        }

        return r;
    }

    public String[] split(String input, int limit) {
        //java's Pattern.split has different behavior with c ruby, so we used  Jakarta-ORO
        Perl5Util util = new Perl5Util();
        Collection<String> result = new ArrayList<String>();
        util.split(result, "/" + regex_.toString() + "/", input, limit);
        return result.toArray(new String[result.size()]);
    }

    @RubyLevelMethod(name="source")
    public RubyString source() {
        return ObjectFactory.createString(regex_.toString());
    }
}
