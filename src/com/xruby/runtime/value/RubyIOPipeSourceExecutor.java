/**
 * Copyright 2007 Michael Chen
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe.SourceChannel;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyIOPipeSourceExecutor implements RubyIOExecutor {

    private static final int BUFFER_SIZE = 1024;

    private final SourceChannel source;

    private boolean avaliable = true;

    public RubyIOPipeSourceExecutor(SourceChannel source) {
        this.source = source;
    }

    public void close() {
        try {
            this.source.close();
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public boolean eof() {
        return !this.avaliable;
    }

    public void flush() {
        throw notAllowed();
    }

    private RubyException notAllowed() {
        return new RubyException(RubyRuntime.IOErrorClass, "not opened for writing");
    }

    public RubyValue gets(RubyValue separator) {
        StringBuffer result = new StringBuffer();
        ByteBuffer buffer;
        if (ObjectFactory.NIL_VALUE == separator) {
            buffer = ByteBuffer.allocate(BUFFER_SIZE);
        } else {
            buffer = ByteBuffer.allocate(1);
        }

        try {
            while (avaliable = (source.read(buffer) != -1)) {
                String string = new String(buffer.array(), 0, buffer.position());
                result.append(string);
                buffer.clear();

                if (ObjectFactory.NIL_VALUE == separator) {
                    continue;
                }

                if (result.toString().endsWith(separator.toString())) {
                    break;
                }
            }
            return ObjectFactory.createString(result.toString());
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public void print(String s) {
        throw notAllowed();
    }

    public RubyValue read() {
        return gets(ObjectFactory.NIL_VALUE);
    }

    public RubyValue read(long length) {
        ByteBuffer buffer = ByteBuffer.allocate((int) length);
        try {
            avaliable = source.read(buffer) != -1;
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
        return ObjectFactory.createString(new String(buffer.array()));
    }

    public RubyValue read(int length, int offset) {
        ByteBuffer buffer = ByteBuffer.allocate(offset);
        try {
            avaliable = source.read(buffer) != -1;
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
        return read(length);
    }

    public int write(String s) {
        throw notAllowed();
    }

}
