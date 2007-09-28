/**
 * Copyright 2007 Michael Chen
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyValue;

interface RubyIOExecutor {

    int write(String s);

    boolean eof();

    void close();

    void flush();

    void print(String s);

    String gets(RubyValue seperator);

    String read();

    String read(long length);

    String read(int length, int offset);

    void truncate(int length);

    void seek(long pos);

}