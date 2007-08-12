/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyKernel {
    private static int RDWR = 2;
    private static int CREAT = 256;
    private static int EXCL = 1024;

    public static RubyValue open(RubyValue receiver, RubyArray args, RubyBlock block) {
        String filename = args.get(0).toStr();
        RubyIO io;
        if (args.size() <= 1) {
            io = ObjectFactory.createFile(filename, "r");
        } else if (args.get(1) instanceof RubyFixnum) {
            String mode = "r";
            int i = ((RubyFixnum)args.get(1)).toInt();
            if ((i & RDWR) != 0) {
                mode = mode + "w";
            }
            io = ObjectFactory.createFile(filename, mode);
        } else {
            RubyString mode = (RubyString) args.get(1);
            io = ObjectFactory.createFile(filename, mode.toString());
        }

        if (null == block) {
            return io;
        } else {
            RubyValue v = block.invoke(receiver, io);
            io.close();
            return v;
        }
    }

    public static Object[] buildFormatArg(RubyArray args, int start) {
        Object[] raw_args = new Object[args.size() - start];
        for (int i = 0; i < args.size() - start; ++i) {
            Object v = args.get(i + start);
            if (v instanceof RubyFixnum) {
                raw_args[i] = new Integer(((RubyFixnum) v).toInt());
            } else if (v instanceof RubyFloat) {
                raw_args[i] = new Double(((RubyFloat) v).doubleValue());
            } else {
                raw_args[i] = v;
            }
        }
        return raw_args;
    }
}
