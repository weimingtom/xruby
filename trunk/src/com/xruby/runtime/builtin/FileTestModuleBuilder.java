/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.io.File;
import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class FileTest_exist extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyString s = (RubyString)arg;
		File f = new File(s.toString());
		return ObjectFactory.createBoolean(f.exists());
	}
}

public class FileTestModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.FileTestModule;
		m.getSingletonClass().defineMethod("exist?", new FileTest_exist());
	}
}
