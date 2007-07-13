package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyNoOrOneArgMethod;
import com.xruby.runtime.lang.RubyValue;

public class NoOrOneArgMethodFactoryHelper extends MethodFactoryHelper {
	public Type getSuperType() {
		return Type.getType(RubyNoOrOneArgMethod.class);
	}
	
	public void createRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception {
		createNoArgRunMethod(cv, klass, name, block);
		createOneArgRunMethod(cv, klass, name, block);
	}

	private void createNoArgRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception {
		Type type = Type.getType(klass);
		Class[] params = getNoArgParams(block);
		Class returnClass = klass.getMethod(name, params).getReturnType();
		String methodName = CgUtil.getMethodName(name, returnClass, params);
		GeneratorAdapter mg = startRun(getNoArgRunName(), cv);
		loadReceiver(mg, type);
		
		if (block) {	
			this.loadNoArgBlock(mg);
		}
		mg.invokeVirtual(type, Method.getMethod(methodName));
		endRun(mg);
	}
	
	private void createOneArgRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception {
		Type type = Type.getType(klass);
		Class[] params = getOneArgParams(block);
		Class returnClass = klass.getMethod(name, params).getReturnType();
		String methodName = CgUtil.getMethodName(name, returnClass, params);
		GeneratorAdapter mg = startRun(getOneArgRunName(), cv);
		loadReceiver(mg, type);
		loadOneArg(mg);
		
		if (block) {	
			this.loadOneArgBlock(mg);
		}
		mg.invokeVirtual(type, Method.getMethod(methodName));
		endRun(mg);
	}
	
	private Class[] getNoArgParams(boolean block) {
		return block ? new Class[] {RubyBlock.class} : new Class[0];
	}
	
	private String getNoArgRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyBlock.class);
	}
	
	private void loadNoArgBlock(GeneratorAdapter mg) {
		mg.loadArg(1);
	}
	
	protected Class[] getOneArgParams(boolean block) {
		return block ? new Class[] {RubyValue.class, RubyBlock.class} : new Class[] {RubyValue.class};
	}
	
	protected String getOneArgRunName() {
		return CgUtil.getMethodName("run", RubyValue.class, 
				RubyValue.class, RubyValue.class, RubyBlock.class);
	}
	
	protected void loadOneArg(GeneratorAdapter mg) {
		mg.loadArg(1);
	}
	
	protected void loadOneArgBlock(GeneratorAdapter mg) {
		mg.loadArg(2);
	}
}
