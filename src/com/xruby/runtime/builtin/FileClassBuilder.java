/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

import java.io.File;

class File_basename extends RubyVarArgMethod {
    public File_basename() {
        super(2, false, 1);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(args.get(0)).toString();
        String basename;
        if ("".equals(fileName)) {
            basename = "";
        } else {
            basename = new File(fileName).getName();
            if (0 == basename.length()) {
                basename = "/";
            }
        }

        if (args.size() == 1) {
            return ObjectFactory.createString(basename);
        }

        String suffix = RubyTypesUtil.convertToString(args.get(1)).toString();
        if (suffix.equals(".*")) {
            int dot_position = basename.lastIndexOf('.');
            if (dot_position < 0) {
                return ObjectFactory.createString(basename);
            } else {
                return ObjectFactory.createString(basename.substring(0, dot_position));
            }
        }
        if (basename.endsWith(suffix)) {
            return ObjectFactory.createString(basename.substring(0, basename.length() - suffix.length()));
        } else {
            return ObjectFactory.createString(basename);
        }
    }
}

class File_delete extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        int deleted = 0;
        if (args != null) {
            for (int i = 0; i < args.size(); ++i) {
                String fileName = RubyTypesUtil.convertToString(args.get(i)).toString();
                File file = new File(fileName);
                if (file.isDirectory()) {
                    throw new RubyException(RubyRuntime.RuntimeErrorClass, "Is a directory - " + fileName);
                } else if (file.isFile()) {
                    file.delete();
                    ++deleted;
                } else {
                    throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + fileName);
                }
            }
        }
        return ObjectFactory.createFixnum(deleted);
    }
}

class File_separator extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createString(File.separator);
    }
}

public class FileClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.FileClass;
        RubyMethod delete = new File_delete();
        c.getSingletonClass().defineMethod("delete", delete);
        c.getSingletonClass().defineMethod("unlink", delete);
        c.getSingletonClass().defineMethod("basename", new File_basename());
        c.getSingletonClass().defineMethod("separator", new File_separator());
        c.getSingletonClass().defineMethod("open", new Kernel_open());//TODO normal methods in Kernel should be singleton method automaticlly

    }

}
