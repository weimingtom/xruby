/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyIO extends RubyBasic {

    private final RubyIOExecutor executor;

    public RubyIO(RubyIOExecutor executor) {
        super(RubyRuntime.IOClass);
        this.executor = executor;
    }

    public void close() {
        executor.close();
    }

    public boolean eof() {
        return executor.eof();
    }

    public void flush() {
        executor.flush();
    }

    public RubyValue gets(RubyValue seperator) {
        return executor.gets(seperator);
    }

    public void print(String s) {
        executor.print(s);
    }

    public RubyValue read() {
        return executor.read();
    }

    public RubyValue read(int length, int offset) {
        return executor.read(length, offset);
    }

    public RubyValue read(long length) {
        return executor.read(length);
    }

    public int write(String s) {
        return executor.write(s);
    }

}
