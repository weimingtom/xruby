/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyValue;

public abstract class RunMethodHelper {
	protected abstract String getRunName();
	protected abstract void loadBlock(GeneratorAdapter mg);
	protected abstract void loadArgs(GeneratorAdapter mg);
	protected abstract Class[] getParams(boolean block);
	
	public void createRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception {
		Type type = Type.getType(klass);
		Class[] params = getParams(block);
		Class returnClass = klass.getMethod(name, params).getReturnType();
		String methodName = CgUtil.getMethodName(name, returnClass, params);
		GeneratorAdapter mg = startRun(getRunName(), cv);
		loadReceiver(mg, type);	
		loadArgs(mg);
		
		if (block) {	
			this.loadBlock(mg);
		}
		mg.invokeVirtual(type, Method.getMethod(methodName));
		endRun(mg);
	}
	
	protected GeneratorAdapter startRun(String runName, ClassVisitor cv) {
		Method m = Method.getMethod(runName);
		GeneratorAdapter mg = new GeneratorAdapter(Opcodes.ACC_PROTECTED,
	            m, null, null, cv);
		mg.visitCode();		
		return mg;
	}

	protected void loadReceiver(GeneratorAdapter mg, Type type) {
		mg.loadArg(0);
		
		if (!Type.getType(RubyValue.class).equals(type)) {
			mg.checkCast(type);
		}
	}

	protected void endRun(GeneratorAdapter mg) {
		mg.returnValue();
		mg.endMethod();	
	}
}
