/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Type;

import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyNoOrOneArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyOneOrTwoArgMethod;
import com.xruby.runtime.lang.RubyTwoArgMethod;
import com.xruby.runtime.lang.RubyVarArgMethod;

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
	
	public void createRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception {
		for (RunMethodHelper helper : this.helpers) {
			helper.createRunMethod(cv, klass, name, block);
		}
	}

	private static final MethodFactoryHelper NO_ARG_HELPER =
		new MethodFactoryHelper(Type.getType(RubyNoArgMethod.class), new NoArgRunMethodHelper());	
	private static final MethodFactoryHelper ONE_ARG_HELPER =
		new MethodFactoryHelper(Type.getType(RubyOneArgMethod.class), new OneArgRunMethodHelper());
	private static final MethodFactoryHelper NO_OR_ONE_ARG_HELPER = 
		new MethodFactoryHelper(Type.getType(RubyNoOrOneArgMethod.class), 
				new NoArgRunMethodHelper(),	new OneArgRunMethodHelper());
	private static final MethodFactoryHelper TWO_ARG_HELPER = 
		new MethodFactoryHelper(Type.getType(RubyTwoArgMethod.class), new TwoArgRunMethodHelper());
	private static final MethodFactoryHelper ONE_OR_TWO_ARG_HELPER = 
		new MethodFactoryHelper(Type.getType(RubyOneOrTwoArgMethod.class), 
				new OneArgRunMethodHelper(), new TwoArgRunMethodHelper());
	private static final MethodFactoryHelper DEFAULT_ARG_HELPER = 
		new MethodFactoryHelper(Type.getType(RubyVarArgMethod.class), new VarArgRunMethodHelper());
	
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