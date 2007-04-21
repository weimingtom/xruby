/**
 * Copyright 2005-2007 Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyDir extends RubyBasic{
    private File dir_;
    private boolean isOpen = true;
    private int curPos;
    private List<String> list = new ArrayList<String>();
    
    public RubyDir(String path){
        super(RubyRuntime.DirClass);
        dir_ = new File(path);
        
        list.add(".");
        list.add("..");
        String[] contents = dir_.list();
        if(contents != null){
            for(int i=0;i<contents.length;i++){
                list.add(contents[i]);
            }
        }
        curPos = 0;
    }
    
    public boolean isDirectory(){
        return dir_.isDirectory();
    }
    
    public void close(){
        isOpen = false;
    }
    
    public boolean isOpen(){
        return isOpen;
    }
    
    public String read(){
        if(curPos >= list.size())
            return null;
        
        String tmp = list.get(curPos);
        curPos++;
        return tmp;
    }
    
    public void setPos(int pos){
        curPos = pos;
    }
    
    public int getPos(){
        return curPos;
    }
    
    public RubyValue each(RubyValue receiver,RubyBlock block){
        for (String item : list) {
            RubyValue v = block.invoke(receiver, new RubyArray(ObjectFactory.createString(item)));
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }
}
