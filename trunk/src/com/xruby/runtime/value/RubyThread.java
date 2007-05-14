/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyThread extends RubyBasic {

    private final Thread thread_;
    private ThreadLocal<HashMap<String, RubyValue>> thread_local_variables_ =
            new ThreadLocal<HashMap<String, RubyValue>>() {
                protected synchronized HashMap<String, RubyValue> initialValue() {
                    return new HashMap<String, RubyValue>();
                }
            };
    private RubyThreadGroup threadGroup;
    private static List<RubyThread> activeThreads = new Vector<RubyThread>();
    private static Map<Thread, RubyThread> threadMapper = new HashMap<Thread, RubyThread>();
    private static RubyThread mainThread;
    
    private ReentrantLock lock = new ReentrantLock();
    private volatile boolean killed = false;
    private static volatile boolean stoped = false;
    
    public static final Object stopLock = new Object();
    public static final ReentrantLock criticalLock = new ReentrantLock();
    
    private RubyValue result = ObjectFactory.NIL_VALUE;
    
    RubyThread(final RubyBlock block) {
        super(RubyRuntime.ThreadClass);
        thread_ = new Thread(new Runnable() {
            public void run() {
                RubyThreadGroup.defaultThreadGroup.add(RubyThread.this);
                activeThreads.add(RubyThread.this);
                result = block.invoke(null, null);
                activeThreads.remove(RubyThread.this);
                RubyThreadGroup.defaultThreadGroup.add(RubyThread.this);
                threadMapper.remove(RubyThread.this.thread_);
            }
        });
        thread_.setDaemon(true);
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

    public void join(long timeout) {
        try {
            thread_.join(timeout);
        } catch (InterruptedException e) {
            throw new Error(e);
        }
    }
    
    public boolean isCurrentThread(){
        return thread_ == Thread.currentThread();
    }

    public static RubyThread current() {
        return threadMapper.get(Thread.currentThread());
    }

    public RubyValue getVariable(String name) {
        RubyValue v = thread_local_variables_.get().get(name);
        if (null == v) {
            return ObjectFactory.NIL_VALUE;
        }

        return v;
    }

    public RubyValue setVariable(String name, RubyValue value) {
        thread_local_variables_.get().put(name, value);
        return value;
    }
    
    public Set getVariables(){
        return thread_local_variables_.get().keySet();
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
    
    public static RubyValue getMainThread(){
        return mainThread;
    }
    
    public Thread getNativeThread(){
        return thread_;
    }
    
    public void setKilled(){
        lock.lock();        
        try{
            killed = true;
        }finally{
            lock.unlock();
        }        
    }
    
    public boolean getKilled(){
        return killed;
    }
    
    public static void setStoped(boolean value){
        stoped = value;
    }
    
    public boolean getStoped(){
        return stoped;
    }
    
    public static void setCritical(boolean critical){
        if (RubyThread.criticalLock.isHeldByCurrentThread()) {
            if (!critical) {
                RubyThread.criticalLock.unlock();
            }
        } else {
            if (critical) {
                RubyThread.criticalLock.lock();
            }
        }
    }
    
    public RubyValue getResult(){
        return result;
    }
    
    //Invoked by KernelModuleBuilder's sleep.
    public static void sleep(long milliseconds){
        synchronized(stopLock){
            stoped = true;
            try {
                stopLock.wait(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally{
                stoped = false;
            }
        }
    }
    
}
