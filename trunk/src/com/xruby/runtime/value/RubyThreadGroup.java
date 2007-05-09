/**
 * Copyright 2005-2007 Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.util.Vector;
import java.util.List;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyRuntime;

public class RubyThreadGroup extends RubyBasic{
    
    private List<RubyThread> threads_ = new Vector<RubyThread>();
    
    public static RubyThreadGroup defaultThreadGroup = new RubyThreadGroup();   
    
    public RubyThreadGroup(){
        super(RubyRuntime.ThreadGroupClass);
    }
    
    public void add(RubyThread thread){
        if(thread.getThreadGroup() != ObjectFactory.NIL_VALUE){
            RubyThreadGroup group = (RubyThreadGroup)thread.getThreadGroup();
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

}
