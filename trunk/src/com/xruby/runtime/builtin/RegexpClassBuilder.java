/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyMatchData;
import com.xruby.runtime.value.RubyRegexp;
import com.xruby.runtime.value.RubyString;


class Regexp_case_equal extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyString)) {
            //not comparable
            return ObjectFactory.FALSE_VALUE;
        }

        RubyRegexp r = (RubyRegexp) receiver;
        if (r.caseEqual(((RubyString) arg).toString())) {
            return ObjectFactory.TRUE_VALUE;
        } else {
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class Regexp_match extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyString)) {
            //not comparable
            return ObjectFactory.FALSE_VALUE;
        }

        RubyRegexp r = (RubyRegexp) receiver;
        RubyMatchData m = r.match(((RubyString) arg).toString());
        if (null == m) {
            return ObjectFactory.NIL_VALUE;
        } else {
            return m;
        }
    }
}

class Regexp_match_operator extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyString)) {
            //not comparable
            return ObjectFactory.FALSE_VALUE;
        }

        RubyRegexp r = (RubyRegexp) receiver;
        int p = r.matchPosition(((RubyString) arg).toString());
        if (p < 0) {
            return ObjectFactory.NIL_VALUE;
        } else {
            return ObjectFactory.createFixnum(p);
        }
    }
}

class Regexp_new extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createRegexp();
    }
}

class Regexp_quote extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyString s = (RubyString) arg;
        return ObjectFactory.createString(RubyRegexp.quote(s.toString()));
    }
}

public class RegexpClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.RegexpClass;
        c.defineMethod("===", new Regexp_case_equal());
        c.defineMethod("match", new Regexp_match());
        c.defineMethod("=~", new Regexp_match_operator());
        RubyMethod quote = new Regexp_quote();
        c.getSingletonClass().defineMethod("escape", quote);
        c.getSingletonClass().defineMethod("quote", quote);
        c.defineAllocMethod(new Regexp_new());
    }
}