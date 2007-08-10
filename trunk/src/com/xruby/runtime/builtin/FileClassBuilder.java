/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class FileClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.FileClass;
        c.getSingletonClass().defineMethod("open", new Kernel_open());//TODO normal methods in Kernel should be singleton method automaticlly
    }

}
