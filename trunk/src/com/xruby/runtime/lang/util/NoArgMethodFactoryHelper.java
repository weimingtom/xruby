package com.xruby.runtime.lang.util;

import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyValue;

class NoArgMethodFactoryHelper extends AbstractOneMethodFactoryHelper {
	public Type getSuperType() {
		return Type.getType(RubyNoArgMethod.class);
	}
	
	protected String getRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyBlock.class);
	}
	
	protected void loadBlock(GeneratorAdapter mg) {
		mg.loadArg(1);
	}
	
	protected Class[] getParams(boolean block) {
		return block ? new Class[] {RubyBlock.class} : new Class[0];
	}

	protected void loadArgs(GeneratorAdapter mg) {
	}
}
