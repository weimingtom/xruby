/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.io.File;

import org.apache.oro.io.GlobFilenameFilter;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyDir;
import com.xruby.runtime.value.RubyFixnum;

class Dir_chdir extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String dir = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(dir);
        if (!file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No a directory - " + dir);
        }
        System.setProperty("user.dir", file.getAbsolutePath());
        return ObjectFactory.FIXNUM0;
    }
}

class Dir_getwd extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createString(System.getProperty("user.dir"));
    }
}
//TODO deal with dir permission!
class Dir_mkdir extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String dir = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(dir);
        if (file.mkdir()) {
            return ObjectFactory.FIXNUM0;
        }
        throw new RubyException(RubyRuntime.RuntimeErrorClass, "Can't create directory - " + dir);
    }
}

class Dir_rmdir extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String dir = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(dir);
        if (!file.isDirectory()) {
            throw new RubyException((RubyClass)RubyRuntime.ErrnoModule.getConstant("ENOENT"), "Not a directory - " + dir);
        }
        if (file.delete()) {
            return ObjectFactory.FIXNUM0;
        }
        throw new RubyException((RubyClass)RubyRuntime.ErrnoModule.getConstant("ENOENT"), "Can't delete directory - " + dir);
    }
}

class Dir_entries extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String dir = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(dir);
        if (!file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "Not a directory - " + dir);
        }

        RubyArray files = new RubyArray();
        for (String f : file.list()) {
            files.add(ObjectFactory.createString(f));
        }

        return files;
    }
}

class Dir_array_access extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        return Dir_glob.glob(receiver, arg);
    }
}

class Dir_glob extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (null == block) {
            return glob(receiver, arg);
        } else {
            return glob(receiver, arg, block);
        }
    }

    static RubyValue glob(RubyValue receiver, RubyValue arg) {
        String s = RubyTypesUtil.convertToString(arg).toString();
        String dir;
        String pattern;
        int index = s.lastIndexOf('/');
        if (index < 0) {
            dir = ".";
            pattern = s;

        } else {
            dir = s.substring(0, index);
            pattern = s.substring(index + 1);
        }

        RubyArray a = new RubyArray();
        File file = new File(dir);
        String[] files = file.list(new GlobFilenameFilter(pattern));
        if (null != files) {
            for (String f : files) {
                a.add(ObjectFactory.createString(dir + "/" + f));
            }
        }
        return a;
    }

    static RubyValue glob(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String s = RubyTypesUtil.convertToString(arg).toString();
        String dir;
        String pattern;
        int index = s.lastIndexOf('/');
        if (index < 0) {
            dir = ".";
            pattern = s;

        } else {
            dir = s.substring(0, index);
            pattern = s.substring(index + 1);
        }

        File file = new File(dir);
        String[] files = file.list(new GlobFilenameFilter(pattern));
        if (null != files) {
            for (String f : files) {
                block.invoke(receiver, ObjectFactory.createString(dir + "/" + f));
            }
        }
        return ObjectFactory.NIL_VALUE;
    }
}

class Dir_new extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String path = RubyTypesUtil.convertToString(arg).toString();
        RubyDir dir = new RubyDir(path);
        if (!dir.isDirectory()) {
            throw new RubyException((RubyClass)RubyRuntime.ErrnoModule.getConstant("ENOENT"), "No such directory - " + path);
        }
        dir.setRubyClass((RubyClass)receiver);
        return dir;
    }
}

class Dir_close extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        ((RubyDir)receiver).close();
        return ObjectFactory.NIL_VALUE;
    }
}

class Dir_read extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        if(!dir.isOpen()){
            throw new RubyException(RubyRuntime.IOErrorClass,"closed directory");
        }
        
        String str = dir.read();
        if(str == null)
            return ObjectFactory.NIL_VALUE;
        else
            return ObjectFactory.createString(str);
    }
}

class Dir_rewind extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        dir.setPos(0);
        return ObjectFactory.NIL_VALUE;
    }
}

class Dir_tell extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        return ObjectFactory.createFixnum(dir.getPos());
    }
}

class Dir_seek extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        RubyFixnum pos = (RubyFixnum)arg;
        dir.setPos(pos.intValue());
        return dir;
    }
}

class Dir_pos_eq extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        RubyFixnum pos = (RubyFixnum)arg;
        dir.setPos(pos.intValue());
        return pos;
    }
}

class Dir_each extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        return dir.each(block);
    }
}

class Dir_foreach extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String path = RubyTypesUtil.convertToString(arg).toString();
        RubyDir dir = new RubyDir(path);
        return dir.each(block);
    }
}

class Dir_path extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyDir dir = (RubyDir)receiver;
        return ObjectFactory.createString(dir.getPath());
    }
}

class Dir_open extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String path = RubyTypesUtil.convertToString(arg).toString();
        RubyDir dir = new RubyDir(path);
        if (!dir.isDirectory()) {
            throw new RubyException((RubyClass)RubyRuntime.ErrnoModule.getConstant("ENOENT"), "No such directory - " + path);
        }
        dir.setRubyClass((RubyClass)receiver);

        if (null == block) {
            return dir;
        } else {
            RubyValue v = block.invoke(receiver, dir);
            dir.close();
            return v;
        }
    }
}

public class DirClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.DirClass;

        c.getSingletonClass().defineMethod("new",new Dir_new());     
        c.getSingletonClass().defineMethod("foreach",new Dir_foreach());
        c.getSingletonClass().defineMethod("chdir", new Dir_chdir());
        RubyMethod getwd = new Dir_getwd();
        c.getSingletonClass().defineMethod("getwd", getwd);
        c.getSingletonClass().defineMethod("pwd", getwd);
        c.getSingletonClass().defineMethod("mkdir", new Dir_mkdir());
        RubyMethod rmdir = new Dir_rmdir();
        c.getSingletonClass().defineMethod("rmdir", rmdir);
        c.getSingletonClass().defineMethod("delete", rmdir);
        c.getSingletonClass().defineMethod("unlink", rmdir);
        c.getSingletonClass().defineMethod("entries", new Dir_entries());
        c.getSingletonClass().defineMethod("[]", new Dir_array_access());
        c.getSingletonClass().defineMethod("glob", new Dir_glob());
        c.getSingletonClass().defineMethod("open", new Dir_open());
        
        c.defineMethod("close", new Dir_close());
        c.defineMethod("read", new Dir_read());
        c.defineMethod("rewind", new Dir_rewind());
        c.defineMethod("tell", new Dir_tell());
        c.defineMethod("pos", new Dir_tell());
        c.defineMethod("seek", new Dir_seek());
        c.defineMethod("pos=", new Dir_pos_eq());
        c.defineMethod("each", new Dir_each());
        c.defineMethod("path", new Dir_path());
        
        c.includeModule(RubyRuntime.EnumerableModule);
    }
}
