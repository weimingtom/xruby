/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyRuntime;

public class RubyFile extends RubyIO {

    public RubyFile(String filename, String mode) {
        super(new RubyIOFileExecutor(filename, mode));
        setRubyClass(RubyRuntime.FileClass);
    }

}
