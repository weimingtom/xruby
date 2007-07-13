package com.xruby.runtime.lang.util;

import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyValue;

class OneArgMethodFactoryHelper extends AbstractOneMethodFactoryHelper {
	public Type getSuperType() {
		return Type.getType(RubyOneArgMethod.class);
	}
	
	protected String getRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyValue.class, RubyBlock.class);
	}
	
	protected void loadBlock(GeneratorAdapter mg) {
		mg.loadArg(2);
	}
	
	protected Class[] getParams(boolean block) {
		return block ? new Class[] {RubyValue.class, RubyBlock.class} : new Class[] {RubyValue.class};
	}
	
	protected void loadArgs(GeneratorAdapter mg) {
		mg.loadArg(1);
	}
}
