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

import org.apache.oro.text.perl.Perl5Util;
import org.apache.oro.text.regex.*;

/*
 * TODO:
 * Regexp and global variables:
 *   $& receives the part of the string that was matched by the pattern
 *   $` receives the part of the string that preceded the match
 *   $' receives the string after the match
 *   $~ is a MatchData object that holds everything you may want to know about the match
 *   $1, and so on, hold the values of parts of the match
 */
@RubyLevelClass(name="Regexp")
public class RubyRegexp extends RubyBasic {

    private Pattern pattern_;

    RubyRegexp(String v) {
        super(RubyRuntime.RegexpClass);
        setValue(v);
    }

    RubyRegexp() {
        super(RubyRuntime.RegexpClass);
    }

    private void setValue(String v) {
        PatternCompiler compiler = new Perl5Compiler();

        //'\z' works for ruby, but ORO only supports '\Z'
        v = v.replace("\\z", "\\Z");

        try {
            pattern_ = compiler.compile(v, Perl5Compiler.MULTILINE_MASK);
        } catch (MalformedPatternException e) {
            throw new Error(e);
        }
    }

    private void setValue(String v, int mode) {
        //TODO mode
        setValue(v);
    }

    @RubyAllocMethod
    public static RubyRegexp alloc(RubyValue receiver) {
        return ObjectFactory.createRegexp();
    }

    @RubyLevelMethod(name="initialize")
    public RubyValue initialize(RubyValue arg) {
        RubyValue pattern = arg;
        if (pattern instanceof RubyRegexp) {
            pattern_ = ((RubyRegexp)pattern).pattern_;
        } else {
            setValue(pattern.toStr());
        }

        return this;
    }

    @RubyLevelMethod(name="initialize")
    public RubyValue initialize(RubyValue pattern, RubyValue mode) {
        if (pattern instanceof RubyRegexp) {
            pattern_ = ((RubyRegexp)pattern).pattern_;
        } else {
            setValue(pattern.toStr(), getFlag(mode));
        }

        return this;
    }

    @RubyLevelMethod(name="initialize")
    public RubyValue initialize(RubyArray args) {
        //TODO right now we just ignore the third parameter
        return initialize(args.get(0), args.get(1));
    }

    private static final int RE_OPTION_IGNORECASE = 1;

    private int getFlag(RubyValue mode) {
        if (mode instanceof RubyFixnum) {
            return mode.toInt();
        }

        // 0 is default flag
        // TODO: RTEST
        return (mode != RubyConstant.QNIL && mode != RubyConstant.QFALSE) ? RE_OPTION_IGNORECASE : 0;
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
        return ObjectFactory.createString(Perl5Compiler.quotemeta(arg.toStr()));
    }

    boolean caseEqual(String v) {
        return match(v) != null;
    }

    public RubyMatchData match(String input) {
        PatternMatcher m = new Perl5Matcher();
        if (m.contains(input, pattern_)) {
            MatchResult r = m.getMatch();
            GlobalVariables.set(r.group(1) == null ? RubyConstant.QNIL : ObjectFactory.createString(r.group(1)), "$1");
            GlobalVariables.set(ObjectFactory.createString(r.group(0)), "$&");
            return ObjectFactory.createMatchData(r);
        } else {
            GlobalVariables.set(RubyConstant.QNIL, "$1");
            GlobalVariables.set(RubyConstant.QNIL, "$&");
            return null;
        }
    }

    public RubyArray scan(String str) {
        RubyArray a = new RubyArray();

        PatternMatcherInput input = new PatternMatcherInput(str);
        PatternMatcher m = new Perl5Matcher();
        while (m.contains(input, pattern_)) {
            MatchResult r = m.getMatch();
            if (r.groups() == 1) {
                a.add(ObjectFactory.createString(r.group(0)));
            } else {
                RubyArray subarray = new RubyArray();
                for (int i = 1; i < r.groups(); ++i) {
                    subarray.add(ObjectFactory.createString(r.group(i)));
                }
                a.add(subarray);
            }
        }

        return a;
    }

    int matchPosition(String input) {
        PatternMatcher m = new Perl5Matcher();
        if (m.contains(input, pattern_)) {
            MatchResult r = m.getMatch();
            GlobalVariables.set(ObjectFactory.createString(r.group(0)), "$&");
            return r.beginOffset(0);
        } else {
            GlobalVariables.set(RubyConstant.QNIL, "$&");
            return -1;
        }
    }

    private String getReplaceString(String replace_string) {
        //java and oro use $1, $2, ruby uses \1, \2
        replace_string = replace_string.replace("\\&", "$0");

        //%q{location:1 in 'l'}.sub(/\A(.+:\d+).*/, ' [\\1]') is as same as
        //%q{location:1 in 'l'}.sub(/\A(.+:\d+).*/, ' [\1]')
        for (int i = 1; i < 10; ++i) {
            replace_string = replace_string.replace("\\\\" + i, "$" + i);
            replace_string = replace_string.replace("\\" + i, "$" + i);
        }

        return replace_string;
    }

    public RubyString sub(RubyString input, RubyBlock block) {
        return sub(input.toString(), block, 0);
    }

    public RubyString gsub(RubyString input, RubyBlock block) {
        return sub(input.toString(), block, -1);
    }

    private RubyString sub(String str, RubyBlock block, int limit) {
        RubyString r = new RubyString("");
        PatternMatcherInput input = new PatternMatcherInput(str);
        PatternMatcher matcher = new Perl5Matcher();
        int end = 0;
        while (matcher.contains(input, pattern_)) {
            MatchResult m = matcher.getMatch();

            String g = m.group(0);
            GlobalVariables.set(ObjectFactory.createString(g), "$&");

            for (int i = 1; i < m.groups(); ++i) {
                GlobalVariables.set(ObjectFactory.createString(m.group(i)), "$" + i);
            }

            int begin = m.beginOffset(0);
            if (begin > end) {
                //append unmatched
                r.appendString(str.substring(end, begin));
            }

            end = m.endOffset(0);

            RubyString match = new RubyString(g);
            RubyValue v = block.invoke(this, match);
            r.appendString(v.toString());

            if (0 == limit) {
                break;
            }
        }

        //append unmatched
        if (end < str.length()) {
            r.appendString(str.substring(end, str.length()));
        }

        return r;
    }

    public String gsub(RubyString input, RubyString sub) {
        return sub(input.toString(), getReplaceString(sub.toString()), Util.SUBSTITUTE_ALL);
    }

    public String sub(RubyString input, RubyString sub) {
        return sub(input.toString(), getReplaceString(sub.toString()), 1);
    }

    private String sub(String input, String sub, int limit) {
        String result = Util.substitute(new Perl5Matcher(),
                pattern_,
                new Perl5Substitution(sub, Perl5Substitution.INTERPOLATE_ALL) {
                    public void appendSubstitution(java.lang.StringBuffer appendBuffer,
                        MatchResult match,
                        int substitutionCount,
                        PatternMatcherInput originalInput,
                        PatternMatcher matcher,
                        Pattern pattern) {
                        super.appendSubstitution(appendBuffer, match, substitutionCount, originalInput, matcher, pattern);

                        for (int i = 1; i < match.groups(); ++i) {
                            GlobalVariables.set(ObjectFactory.createString(match.group(i)), "$" + i);
                        }

                        GlobalVariables.set(ObjectFactory.createString(match.group(0)), "$&");
                    }
                },
                input,
                limit);
        return result;
    }

    public Collection<String> split(String input, int limit) {
        Perl5Util util = new Perl5Util();
        Collection<String> result = new ArrayList<String>();
        String regx = "/" + pattern_.getPattern() + "/";
        util.split(result, regx, input, limit);
        return result;
    }

    @RubyLevelMethod(name="source")
    public RubyString source() {
        return ObjectFactory.createString(pattern_.getPattern());
    }
}
