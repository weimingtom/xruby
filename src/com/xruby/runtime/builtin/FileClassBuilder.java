/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.value.RubyFile;
import com.xruby.runtime.value.RubyTime;

import java.io.File;
import java.math.BigInteger;
import java.util.Date;


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

class File_file_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        return file.isFile() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class File_writable_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        return file.canWrite() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class File_readable_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        return file.canRead() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class File_exist_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        return file.exists() ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
    }
}

class File_directory_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        return file.isFile() ? ObjectFactory.FALSE_VALUE : ObjectFactory.TRUE_VALUE;
    }
}

class File_executable_question extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        return ObjectFactory.TRUE_VALUE;
    }
}

class File_expand_path extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (null == args) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (0 for 1)");
        }

        String file_name = RubyTypesUtil.convertToString(args.get(0)).toString();

        if (file_name.equals(".")) {
            file_name = "";
        }

        if (args.size() == 1) {
            File file = new File(file_name);
            return ObjectFactory.createString(file.getAbsolutePath().replace('\\', '/'));
        } else {
            if (file_name.startsWith("/")) {
                file_name = ".." + file_name;
            }
            StringBuilder dir_string = new StringBuilder(RubyTypesUtil.convertToString(args.get(1)).toString());
            if (dir_string.toString().equals("/")) {
                dir_string = new StringBuilder((new File("/")).getAbsolutePath().replace('\\', '/'));
            }

            while (file_name.startsWith("../")) {
                int i = dir_string.lastIndexOf("/");
                if (i >= 0) {
                    dir_string.delete(i, dir_string.length());
                }
                file_name = file_name.substring(3, file_name.length());
            }
            if (file_name.length() > 0 || dir_string.toString().endsWith(":")) {
                if (!dir_string.toString().endsWith("/")) {
                    dir_string.append("/");
                }
                dir_string.append(file_name);
            }
            return ObjectFactory.createString(dir_string.toString().replace('\\', '/'));
        }
    }
}

class File_dirname extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        String parent = file.getParent();
        if (parent == null) {
            return ObjectFactory.createString(fileName.matches("\\/+") ? "/" : ".");
        }

        //Java's File.getParent() always converts '/' to '\\' on windows. This is not
        //what we want, so here we hack the result with replace().
        return ObjectFactory.createString(parent.replace('\\', '/'));
    }
}

class File_mtime extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        if (!file.isFile() && !file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + fileName);
        }
        return ObjectFactory.createTime(new Date(file.lastModified()));
    }
}

class File_size extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        String fileName = RubyTypesUtil.convertToString(arg).toString();
        File file = new File(fileName);
        if (!file.isFile() && !file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + fileName);
        }
        return RubyBignum.bignorm(BigInteger.valueOf(file.length()));
    }
}

class File_rename extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        String file1 = RubyTypesUtil.convertToString(arg1).toString();
        String file2 = RubyTypesUtil.convertToString(arg2).toString();
        File file = new File(file1);
        if (!file.isFile() && !file.isDirectory()) {
            throw new RubyException(RubyRuntime.RuntimeErrorClass, "No such file or directory - " + file1);
        }
        return ObjectFactory.createBoolean(file.renameTo(new File(file2)));
    }
}

class File_truncate extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyFile f = (RubyFile)receiver;
        int length = RubyTypesUtil.convertToJavaInt(arg);
        f.truncate(length);
        return ObjectFactory.FIXNUM0;
    }
}

class File_utime extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        if (args.size() < 3) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + args.length() + " for 2)");
        }

        //RubyTime atime = (RubyTime)args.get(0);
        RubyTime mtime = (RubyTime)args.get(1);
        for (int i = 2; i < args.size(); ++i) {
            String filename = RubyTypesUtil.convertToJavaString(args.get(i));
            File f = new File(filename);
            f.setLastModified(mtime.getTime());
        }

        return ObjectFactory.createFixnum(args.size() - 2);
    }
}

public class FileClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.FileClass;
        //c.defineMethod("id2name", new Symbol_id2name());

        c.defineMethod("truncate", new File_truncate());
        c.getSingletonClass().defineMethod("file?", new File_file_question());
        c.getSingletonClass().defineMethod("writable?", new File_writable_question());
        c.getSingletonClass().defineMethod("readable?", new File_readable_question());
        c.getSingletonClass().defineMethod("exist?", new File_exist_question());
        c.getSingletonClass().defineMethod("directory?", new File_directory_question());
        c.getSingletonClass().defineMethod("executable?", new File_executable_question());
        c.getSingletonClass().defineMethod("expand_path", new File_expand_path());
        c.getSingletonClass().defineMethod("dirname", new File_dirname());
        RubyMethod delete = new File_delete();
        c.getSingletonClass().defineMethod("delete", delete);
        c.getSingletonClass().defineMethod("unlink", delete);
        c.getSingletonClass().defineMethod("basename", new File_basename());
        c.getSingletonClass().defineMethod("separator", new File_separator());
        c.getSingletonClass().defineMethod("mtime", new File_mtime());
        c.getSingletonClass().defineMethod("size", new File_size());
        c.getSingletonClass().defineMethod("open", new Kernel_open());//TODO normal methods in Kernel should be singleton method automaticlly
        c.getSingletonClass().defineMethod("rename", new File_rename());
        c.getSingletonClass().defineMethod("utime", new File_utime());
    }

}
