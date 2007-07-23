package com.xruby.runtime.lang.util;

import org.objectweb.asm.commons.GeneratorAdapter;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyValue;

public class TwoArgRunMethodHelper extends RunMethodHelper {
	protected String getRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyValue.class, RubyValue.class, RubyBlock.class);
	}
	
	protected void loadBlock(GeneratorAdapter mg) {
		mg.loadArg(3);
	}
	
	protected Class[] getParams(boolean block) {
		return block ? new Class[] {RubyValue.class, RubyValue.class, RubyBlock.class} 
		: new Class[] {RubyValue.class, RubyValue.class};
	}
	
	protected void loadArgs(GeneratorAdapter mg) {
		mg.loadArg(1);
		mg.loadArg(2);
	}

}
