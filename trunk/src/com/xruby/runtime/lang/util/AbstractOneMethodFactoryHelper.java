package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.compiler.codegen.CgUtil;

public abstract class AbstractOneMethodFactoryHelper extends MethodFactoryHelper {
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
}
