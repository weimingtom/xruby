/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import java.lang.annotation.Annotation;

import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.compiler.codegen.Types;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.annotation.RubyLevelModule;

class RubyModuleFactory extends RubyTypeFactory {
	RubyModuleFactory(Class klass) {
		super(klass);
	}
	
	protected boolean isModule() {
		return true;
	}
	
	protected Class getTypeAnnotationClass() {
		return RubyLevelModule.class;
	}
	
	protected String getBuilderName(Class klass) {
		return CgUtil.getInternalName(klass.getName() + "$ModuleBuilder");
	}

	protected Class getInterface() {
		return RubyModuleBuilder.class;
	}
	
	protected Method getBuilderMethod() {
		return Method.getMethod(CgUtil.getMethodName("createRubyModule", RubyModule.class));
	}
	
	protected int createRubyType(GeneratorAdapter mg, Annotation annotation) {
		RubyLevelModule moduleAnnotation = (RubyLevelModule)annotation;
		mg.push(moduleAnnotation.name());
		mg.invokeStatic(Types.RUBY_API_TYPE, 
				Method.getMethod(CgUtil.getMethodName("defineModule", RubyModule.class, 
						String.class)));
		
		int rubyTypeIdx = mg.newLocal(Types.RUBY_MODULE_TYPE);
		mg.storeLocal(rubyTypeIdx);
		
		return rubyTypeIdx;
	}
}
