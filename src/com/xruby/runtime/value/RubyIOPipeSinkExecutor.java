package com.xruby.runtime.value;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe.SinkChannel;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyIOPipeSinkExecutor implements RubyIOExecutor {

    private final SinkChannel sink;

    public RubyIOPipeSinkExecutor(SinkChannel sink) {
        this.sink = sink;
    }

    public void close() {
        try {
            this.sink.close();
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public boolean eof() {
        throw notAllowed();
    }

    private RubyException notAllowed() {
        return new RubyException(RubyRuntime.IOErrorClass, "not opened for reading");
    }

    public void flush() {
        // TODO: I don't know how to dear with this
    }

    public RubyValue gets(RubyValue seperator) {
        throw notAllowed();
    }

    public void print(String s) {
        ByteBuffer bytebuffer = ByteBuffer.wrap(s.getBytes());
        try {
            this.sink.write(bytebuffer);
        } catch (IOException e) {
            throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
        }
    }

    public RubyValue read() {
        throw notAllowed();
    }

    public RubyValue read(long length) {
        throw notAllowed();
    }

    public RubyValue read(int length, int offset) {
        throw notAllowed();
    }

    public int write(String s) {
        print(s);
        return s.length();
    }

}
