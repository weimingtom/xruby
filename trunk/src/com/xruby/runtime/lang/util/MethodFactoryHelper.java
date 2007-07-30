/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;

import com.xruby.compiler.codegen.Types;

class MethodFactoryHelper {
	private Type superType;
	private RunMethodHelper[] helpers;
	
	private MethodFactoryHelper(Type superType, RunMethodHelper... helpers) {
		this.superType = superType;
		this.helpers = helpers;
	}
	
	public Type getSuperType() {
		return this.superType;
	}
	
	public void createRunMethod(ClassVisitor cv, Class klass, String name, 
			boolean staticMethod, boolean block) throws Exception {
		for (RunMethodHelper helper : this.helpers) {
			helper.createRunMethod(cv, klass, name, staticMethod, block);
		}
	}

	private static final MethodFactoryHelper NO_ARG_HELPER =
		new MethodFactoryHelper(Types.RUBY_NOARGMETHOD_TYPE, new NoArgRunMethodHelper());	
	private static final MethodFactoryHelper ONE_ARG_HELPER =
		new MethodFactoryHelper(Types.RUBY_ONEARGMETHOD_TYPE, new OneArgRunMethodHelper());
	private static final MethodFactoryHelper NO_OR_ONE_ARG_HELPER = 
		new MethodFactoryHelper(Types.RUBY_NOORONEARGMETHOD_TYPE, 
				new NoArgRunMethodHelper(),	new OneArgRunMethodHelper());
	private static final MethodFactoryHelper TWO_ARG_HELPER = 
		new MethodFactoryHelper(Types.RUBY_TWOARGMETHOD_TYPE, new TwoArgRunMethodHelper());
	private static final MethodFactoryHelper ONE_OR_TWO_ARG_HELPER = 
		new MethodFactoryHelper(Types.RUBY_ONEORTWOARGMETHOD_TYPE, 
				new OneArgRunMethodHelper(), new TwoArgRunMethodHelper());
	private static final MethodFactoryHelper DEFAULT_ARG_HELPER = 
		new MethodFactoryHelper(Types.RUBY_VARARGMETHOD_TYPE, new VarArgRunMethodHelper());
	
	public static final MethodFactoryHelper getHelper(MethodType type) {
		switch (type) {
		case NO_ARG:
			return NO_ARG_HELPER;
		case ONE_ARG:
			return ONE_ARG_HELPER;
		case NO_OR_ONE_ARG:
			return NO_OR_ONE_ARG_HELPER;
		case TWO_ARG:
			return TWO_ARG_HELPER;
		case ONE_OR_TWO_ARG:
			return ONE_OR_TWO_ARG_HELPER;
		default:
			return DEFAULT_ARG_HELPER;
		}
	}
}