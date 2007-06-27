/**
 * Copyright 2005-2007 Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.Iterator;
import java.util.List;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyThread;
import com.xruby.runtime.value.RubyThreadGroup;

class ThreadGroup_list extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThreadGroup group = (RubyThreadGroup)receiver;
        List list = group.list();
        Iterator iter = list.iterator();
        RubyArray result = new RubyArray(0);
        while(iter.hasNext()){
            result.add((RubyThread)iter.next());
        }
        return result;
    }
}

class ThreadGroup_new extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return new RubyThreadGroup();
    }
}

class ThreadGroup_add extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyThread thread = (RubyThread)arg;
        ((RubyThreadGroup)receiver).add(thread);
        return receiver;
    }
}

class ThreadGroup_enclose extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThreadGroup group = (RubyThreadGroup)receiver;
        group.enclose();
        return group;
    }
}

class ThreadGroup_is_enclosed extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThreadGroup group = (RubyThreadGroup)receiver;
        return ObjectFactory.createBoolean(group.isEnclosed());
    }
}

public class ThreadGroupClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.ThreadGroupClass;             
        c.defineMethod("add", new ThreadGroup_add());
        c.defineMethod("list", new ThreadGroup_list());  
        c.defineMethod("enclose", new ThreadGroup_enclose());
        c.defineMethod("enclosed?", new ThreadGroup_is_enclosed());
        
        c.setConstant("Default",RubyThreadGroup.defaultThreadGroup);
        c.getSingletonClass().defineMethod("new", new ThreadGroup_new());
    }
}
