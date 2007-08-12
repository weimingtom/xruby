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
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

@RubyLevelClass(name="Dir", modules="Enumerable")
public class RubyDir extends RubyBasic {
    private File dir_;
    private boolean isOpen = true;
    private int curPos;
    private String path;
    private List<String> list = new ArrayList<String>();

    public RubyDir(String path){
        super(RubyRuntime.DirClass);
        this.path = path;
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

    @RubyLevelMethod(name="close")
    public RubyValue close(){
        isOpen = false;
        return ObjectFactory.NIL_VALUE;
    }

    @RubyLevelMethod(name="rewind")
    public RubyValue rewind() {
        setPos(0);
        return ObjectFactory.NIL_VALUE;
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

    @RubyLevelMethod(name="path")
    public RubyString getPath(){
        return ObjectFactory.createString(path);
    }

    @RubyLevelMethod(name="each")
    public RubyValue each(RubyBlock block){
        for (String item : list) {
            RubyValue v = block.invoke(this, ObjectFactory.createString(item));
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }
}
