/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyThread extends RubyBasic {

    private final Thread thread_;
    private static ThreadLocal<HashMap<String, RubyValue>> thread_local_variables_ =
            new ThreadLocal<HashMap<String, RubyValue>>() {
                protected synchronized HashMap<String, RubyValue> initialValue() {
                    return new HashMap<String, RubyValue>();
                }
            };
    private RubyThreadGroup threadGroup;
    private static List<RubyThread> activeThreads = new Vector<RubyThread>();
    private static Map<Thread, RubyThread> threadMapper = new HashMap();
    private static RubyThread mainThread;
    
    RubyThread(final RubyBlock block) {
        super(RubyRuntime.ThreadClass);
        thread_ = new Thread(new Runnable() {
            public void run() {
                RubyThreadGroup.defaultThreadGroup.add(RubyThread.this);
                activeThreads.add(RubyThread.this);
                block.invoke(null, null);
                activeThreads.remove(RubyThread.this);
                RubyThreadGroup.defaultThreadGroup.add(RubyThread.this);
                threadMapper.remove(RubyThread.this.thread_);
            }
        });
        thread_.start();
        threadMapper.put(thread_, this);
    }
    
    private RubyThread(Thread thread) {
        super(RubyRuntime.ThreadClass);
        thread_ = thread;
        threadMapper.put(thread_, this);
    }
    
    //Only called from <code>ThreadClassBuilder</code> to add main thread.
    public static void init(){
        //Assume that this method is called from main thread
        mainThread = new RubyThread(Thread.currentThread());
        activeThreads.add(mainThread);
        RubyThreadGroup.defaultThreadGroup.add(mainThread);
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
        return threadMapper.get(Thread.currentThread());
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
    
    public RubyValue getThreadGroup(){
        if(threadGroup == null)
            return ObjectFactory.NIL_VALUE;
        else
            return threadGroup;
    }
    
    public void setThreadGroup(RubyThreadGroup group){
        threadGroup = group;
    }  
    
    public static List getThreadList(){
        return activeThreads;
    }
    
    public boolean isAlive(){
        return thread_.isAlive();
    }
    
    public static RubyValue getMainThread(){
        return mainThread;
    }
}
