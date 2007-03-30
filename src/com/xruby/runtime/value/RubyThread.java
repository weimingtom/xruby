/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import java.util.HashMap;

public class RubyThread extends RubyValue {

    private final Thread thread_;
    private static ThreadLocal<HashMap<String, RubyValue>> thread_local_variables_ =
            new ThreadLocal<HashMap<String, RubyValue>>() {
                protected synchronized HashMap<String, RubyValue> initialValue() {
                    return new HashMap<String, RubyValue>();
                }
            };

    public RubyThread(final RubyBlock block) {
        super(RubyRuntime.ThreadClass);
        thread_ = new Thread(new Runnable() {
            public void run() {
                block.invoke(null, null);
            }
        });
        thread_.start();
    }

    private RubyThread(Thread thread) {
        super(RubyRuntime.ThreadClass);
        thread_ = thread;
    }

    public boolean equals(Object o) {
        if (null == o) {
            return false;
        } else if (o instanceof RubyThread) {
            return thread_ == ((RubyThread) o).thread_;
        } else {
            return false;
        }
    }

    public void join() {
        try {
            thread_.join();
        } catch (InterruptedException e) {
            throw new Error(e);
        }
    }

    public static RubyThread current() {
        return new RubyThread(Thread.currentThread());
    }

    public static RubyValue getVariable(String name) {
        RubyValue v = thread_local_variables_.get().get(name);
        if (null == v) {
            return ObjectFactory.NIL_VALUE;
        }

        return v;
    }

    public static RubyValue setVariable(String name, RubyValue value) {
        thread_local_variables_.get().put(name, value);
        return value;
    }

}
