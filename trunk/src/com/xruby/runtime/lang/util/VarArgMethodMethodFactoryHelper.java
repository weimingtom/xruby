package com.xruby.runtime.lang.util;

import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.value.RubyArray;

public class VarArgMethodMethodFactoryHelper extends AbstractOneMethodFactoryHelper {
	public Type getSuperType() {
		return Type.getType(RubyVarArgMethod.class);
	}
	
	protected String getRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyArray.class, RubyBlock.class);
	}
	
	protected void loadBlock(GeneratorAdapter mg) {
		mg.loadArg(2);
	}
	
	protected Class[] getParams(boolean block) {
		return block ? new Class[] {RubyArray.class, RubyBlock.class} : new Class[] {RubyArray.class};
	}

	protected void loadArgs(GeneratorAdapter mg) {
		mg.loadArg(1);
	}

}
