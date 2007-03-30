/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RubyIO extends RubyBasic {
    private RandomAccessFile file_ = null;

    RubyIO(String filename, String mode) {
        super(RubyRuntime.FileClass);//FIXME create a new class for file
        open(filename, mode);
    }

    private String translateMode(String mode) {
        //TODO mode of RandomAccessFile is not as same as fopen()
        if (mode.equals("w")) {
            return "rw";
        } else if (mode.equals("rb")) {
            return "r";
        } else {
            return mode;
        }
    }

    private boolean open(String filename, String mode) {
        assert(null == file_);
        try {
            file_ = new RandomAccessFile(filename, translateMode(mode));
            if (mode.equals("w")) {
                file_.setLength(0);
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            file_ = null;
            return false;
        }
    }

    public boolean eof() {
        try {
            return file_.length() == file_.getFilePointer();
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public void close() {
        if (null != file_) {
            try {
                file_.close();
                file_ = null;
            } catch (IOException e) {
                //Do not care
            }
        }
    }

    public boolean print(String s) {
        if (null == file_) {
            throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
        }

        try {
            file_.writeBytes(s);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private RubyValue readsTheEntireContents() throws IOException {
        int size = (int) file_.length();//TODO converted long to int
        byte[] buffer = new byte[size];
        if (file_.read(buffer) < 0) {
            return ObjectFactory.createString("");
        } else {
            return ObjectFactory.createString(new String(buffer));
        }
    }

    private RubyValue readUntilSeperator(String separator) throws IOException {
        //FIXME This is cheating, should read until separator
        String s = file_.readLine();
        if (null == s) {
            return ObjectFactory.NIL_VALUE;
        } else {
            return ObjectFactory.createString(s + "\n");
        }
    }

    public RubyValue gets(RubyValue separator) {
        if (null == file_) {
            throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
        }

        try {
            if (ObjectFactory.NIL_VALUE == separator) {
                return readsTheEntireContents();
            }

            if (!(separator instanceof RubyString)) {
                throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + separator.getRubyClass().getName() + " into String");
            }

            RubyString s = (RubyString) separator;

            return readUntilSeperator(s.toString());
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public RubyValue read() {
        if (null == file_) {
            throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
        }

        try {
            return readsTheEntireContents();
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public RubyValue read(long length) {
        if (null == file_) {
            throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
        }

        try {
            long size = file_.length();
            size = Math.min(length, size);
            byte[] buffer = new byte[(int) size];
            if (file_.read(buffer) < 0) {
                return ObjectFactory.NIL_VALUE;
            } else {
                return ObjectFactory.createString(new String(buffer));
            }
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public RubyValue read(int length, int offset) {
        if (null == file_) {
            throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
        }

        try {
            file_.seek(offset);
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }

        return read(length);
    }
}
