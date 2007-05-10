/**
 * Copyright 2005-2007 Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.util.List;
import java.util.Vector;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;

public class RubyThreadGroup extends RubyBasic{
    
    private boolean enclosed = false;
    private List<RubyThread> threads_ = new Vector<RubyThread>();
    
    public static RubyThreadGroup defaultThreadGroup = new RubyThreadGroup();   
    
    public RubyThreadGroup(){
        super(RubyRuntime.ThreadGroupClass);
    }
    
    public void add(RubyThread thread){
        if(thread.getThreadGroup() != ObjectFactory.NIL_VALUE){
            RubyThreadGroup group = (RubyThreadGroup)thread.getThreadGroup();
            if(group.isEnclosed())
                throw new RubyException(RubyRuntime.ThreadErrorClass,"can't move from the enclosed thread group");
            group.threads_.remove(thread);
        }
        thread.setThreadGroup(this);
        threads_.add(thread);
    }
    
    //When a thread terminates,remove it from this group.
    public void remove(RubyThread thread){
        thread.setThreadGroup(null);
        threads_.remove(thread);
    }
    
    public List list(){
        return threads_;
    }
    
    public void enclose(){
        enclosed = true;
    }
    
    public boolean isEnclosed(){
        return enclosed;
    }
}
