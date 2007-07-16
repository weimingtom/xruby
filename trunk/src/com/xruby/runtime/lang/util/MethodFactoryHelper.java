package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.runtime.lang.RubyValue;

abstract class MethodFactoryHelper {
	public abstract Type getSuperType();
	public abstract void createRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception;
	
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

	private static final MethodFactoryHelper NO_ARG_HELPER = new NoArgMethodFactoryHelper();
	private static final MethodFactoryHelper ONE_ARG_HELPER = new OneArgMethodFactoryHelper();
	private static final MethodFactoryHelper NO_OR_ONE_ARG_HELPER = new NoOrOneArgMethodFactoryHelper();
	private static final MethodFactoryHelper DEFAULT_ARG_HELPER = new VarArgMethodMethodFactoryHelper();
	
	public static final MethodFactoryHelper getHelper(int argc) {
		switch (argc) {
		case MethodFactory.NO_ARG:
			return NO_ARG_HELPER;
		case MethodFactory.ONE_ARG:
			return ONE_ARG_HELPER;
		case MethodFactory.NO_OR_ONE_ARG:
			return NO_OR_ONE_ARG_HELPER;
		default:
			return DEFAULT_ARG_HELPER;
		}
	}
}