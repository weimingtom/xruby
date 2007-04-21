/**
 * Copyright 2005-2007 Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.io.File;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyRuntime;

public class RubyDir extends RubyBasic{
    private File dir_;
    
    public RubyDir(String path){
        super(RubyRuntime.DirClass);
        dir_ = new File(path);
    }
    
    public boolean isDirectory(){
        return dir_.isDirectory();
    }
    
}
