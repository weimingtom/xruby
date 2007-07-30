/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import org.objectweb.asm.commons.GeneratorAdapter;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyValue;

class NoArgRunMethodHelper extends RunMethodHelper {
	protected String getRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyBlock.class);
	}
	
	protected void loadBlock(GeneratorAdapter mg) {
		mg.loadArg(1);
	}
	
	protected int rubyArgSize() {
		return 0;
	}

	protected void loadArgs(GeneratorAdapter mg) {
	}
}
