/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyTwoArgMethod;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyThread;

/**
 * Implement ruby thread in native thread,not green thread.As you 
 * know,YARV will make use of native thread too.
 * 
 * Current implementation is not accurate.If you find any question,
 * please don't hesitate to inform us.
 */

class Thread_join extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        long timeout = 0; 
        if(args != null){
            if(args.size() == 1)
                timeout = RubyTypesUtil.convertToJavaLong(args.get(0))*1000; 
        }
       
        RubyThread t = (RubyThread) receiver;
        if(t.isCurrentThread()){
            throw new RubyException(RubyRuntime.ThreadErrorClass,"Thread tried to join itself!");
        }        
        if(RubyThread.criticalLock.isHeldByCurrentThread()){
            t.getNativeThread().interrupt();
        }        
        t.join(timeout);
        return t;
    }
}

class Thread_new extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return ObjectFactory.createThread(block);
    }
}

class Thread_current extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyThread.current();
    }
}

//c ruby does not have this method, but since we wrapped java's Thread, can no longer use java's == operator
class Thread_equal extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (receiver.equals(arg)) {
            return ObjectFactory.TRUE_VALUE;
        } else {
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class Thread_array_access extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String s = RubyTypesUtil.convertToJavaString(arg);
        RubyThread rt = (RubyThread)receiver;
        return rt.getVariable(s);
    }
}

class Thread_array_set extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        String s = RubyTypesUtil.convertToJavaString(arg1);
        RubyThread rt = (RubyThread)receiver;
        return rt.setVariable(s, arg2);
    }
}

class Thread_list extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        List list = RubyThread.getThreadList();
        Iterator iter = list.iterator();
        RubyArray result = new RubyArray(0);
        while(iter.hasNext()){
            RubyThread rt = (RubyThread)iter.next();
            if(rt.getNativeThread().isAlive())
                result.add(rt);
        }
        return result;
    }
}

class Thread_main extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyThread.getMainThread();
    }
}

class Thread_is_alive extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        if(((RubyThread)receiver).getNativeThread().isAlive()){
            return ObjectFactory.TRUE_VALUE;
        }else{
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class Thread_pass extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        boolean critical = RubyThread.criticalLock.isHeldByCurrentThread();
        RubyThread.setCritical(false);
        Thread.yield();
        RubyThread.setCritical(critical);
        return ObjectFactory.NIL_VALUE;
    }
}

/*
 * It is different from ruby impl.Default value is not zero,and it
 * depends on OS.
 */
class Thread_priority extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createFixnum(((RubyThread)receiver).getNativeThread().getPriority());
    }
}

class Thread_set_priority extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        int val = arg.toInt();
        if (val < Thread.MIN_PRIORITY) {
            val = Thread.MIN_PRIORITY;
        } else if (val > Thread.MAX_PRIORITY) {
            val = Thread.MAX_PRIORITY;
        }
        ((RubyThread)receiver).getNativeThread().setPriority(val);
        return receiver;
    }
}

class Thread_inspect extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        StringBuffer sb = new StringBuffer();
        sb.append("#<");
        sb.append(receiver.getRubyClass().getRealClass().getName());
        sb.append(":0x");
        int hash = receiver.hashCode();
        sb.append(Integer.toHexString(hash));
        
        sb.append(" ");
        RubyThread rt = (RubyThread)receiver;
        if(rt.getNativeThread().isAlive()){
            if(rt.getKilled()){
                sb.append("dead");
            }else{
                sb.append("run");
            }            
        }else{
            sb.append("dead");
        }
        sb.append(">");
        return ObjectFactory.createString(sb.toString());
    }
}

class Thread_group extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        return rt.getThreadGroup();
    }
}

/**
 * Directly invoke native thread's destory method is not 
 * valid because this method is not implemented in JDK.
 * 
 * Killing one thread leave its locks and resources in an 
 * unpredictable state is not advisable.It would be deadlock-prone.
 * If the target thread held a lock protecting a critical system 
 * resource when it was killed, no thread could ever access this 
 * resource again.If another thread ever attempted to lock this 
 * resource, deadlock would result.
 * 
 * Implements this by setting a kill flag on the target thread and 
 * waiting for it to die.Charles Nutter has discussed this question.
 */
class Thread_kill extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        Thread t = rt.getNativeThread();
        
        rt.setKilled();
        //make the thread escaping from wait or block status
        t.interrupt();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rt;
    }
}

class Thread_is_stop extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        return ObjectFactory.createBoolean(rt.getStoped());        
    }
}

class Thread_stop extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        synchronized(RubyThread.stopLock){
            RubyThread.setStoped(true);
            try {
                RubyThread.setCritical(false);
                RubyThread.stopLock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        RubyThread.setStoped(false);
        return ObjectFactory.NIL_VALUE;
    }
}

class Thread_run extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        synchronized(RubyThread.stopLock){
            RubyThread.setStoped(false);
            RubyThread.stopLock.notifyAll();
        }
        return receiver;
    }
}

class Thread_wakeup extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        synchronized(RubyThread.stopLock){
            RubyThread.setStoped(false);
            RubyThread.stopLock.notifyAll();
        }
        return receiver;
    }
}

class Thread_status extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        
        if(rt.getStoped()){
            return ObjectFactory.createString("sleep");
        }else if(rt.getKilled()){
            return ObjectFactory.FALSE_VALUE;
        }else{
            return ObjectFactory.createString("run");
        }
    }
}

class Thread_critical extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createBoolean(RubyThread.criticalLock.isHeldByCurrentThread());
    }
}

class Thread_set_critical extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        boolean critical = false;
        if(arg == ObjectFactory.TRUE_VALUE){
            critical = true;
        }
        RubyThread.setCritical(critical);
        return arg;
    }
}

class Thread_value extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        rt.join(0);
        return rt.getResult();
    }
}

class Thread_keys extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        Set set = rt.getVariables();
        Iterator iter = set.iterator();
        RubyArray result = new RubyArray(0);
        while(iter.hasNext()){
            result.add(ObjectFactory.createString((String)iter.next()));
        }
        return result;
    }
}

class Thread_is_key extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyThread rt = (RubyThread)receiver;
        String key = RubyTypesUtil.convertToJavaString(arg);
        return ObjectFactory.createBoolean(rt.getVariables().contains(key));
    }
}


public class ThreadClassBuilder {
    public static void initialize() {
        RubyThread.init();
        
        RubyClass c = RubyRuntime.ThreadClass;
        c.defineMethod("join", new Thread_join());
        c.defineMethod("[]", new Thread_array_access());
        c.defineMethod("[]=", new Thread_array_set());
        c.defineMethod("==", new Thread_equal());
        c.defineMethod("alive?", new Thread_is_alive());
        c.defineMethod("priority", new Thread_priority());
        c.defineMethod("priority=", new Thread_set_priority());
        c.defineMethod("inspect", new Thread_inspect());
        c.defineMethod("group", new Thread_group());
        c.defineMethod("kill", new Thread_kill());
        c.defineMethod("exit", new Thread_kill());
        c.defineMethod("stop?", new Thread_is_stop());
        c.defineMethod("run", new Thread_run());
        c.defineMethod("status", new Thread_status());
        c.defineMethod("wakeup", new Thread_wakeup());
        c.defineMethod("value", new Thread_value());
        c.defineMethod("key?", new Thread_is_key());
        c.defineMethod("keys", new Thread_keys());
        
        c.getSingletonClass().defineMethod("main", new Thread_main());
        c.getSingletonClass().defineMethod("list", new Thread_list());
        c.getSingletonClass().defineMethod("current", new Thread_current());
        c.getSingletonClass().defineMethod("new", new Thread_new());
        c.getSingletonClass().defineMethod("fork", new Thread_new());
        c.getSingletonClass().defineMethod("pass", new Thread_pass());
        //c.getSingletonClass().defineMethod("kill", new Thread_kill());
        //c.getSingletonClass().defineMethod("exit", new Thread_kill());
        c.getSingletonClass().defineMethod("stop", new Thread_stop());
        c.getSingletonClass().defineMethod("critical", new Thread_critical());
        c.getSingletonClass().defineMethod("critical=", new Thread_set_critical());
    }
}
