package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyValue;

public interface RubyIOExecutor {

    int write(String s);

    boolean eof();

    void close();

    void flush();

    void print(String s);

    RubyValue gets(RubyValue seperator);

    RubyValue read();

    RubyValue read(long length);

    RubyValue read(int length, int offset);

}
