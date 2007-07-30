package com.xruby.runtime.lang.util;

import java.lang.annotation.Annotation;

import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.compiler.codegen.Types;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelClass;

class RubyClassFactory extends RubyTypeFactory {
	RubyClassFactory(Class klass) {
		super(klass);
	}

	protected Class getTypeAnnotationClass() {
		return RubyLevelClass.class;
	}

	protected String getBuilderName(Class klass) {
		return CgUtil.getInternalName(klass.getName() + "$ClassBuilder");
	}

	protected Class getInterface() {
		return RubyClassBuilder.class;
	}

	protected Method getBuilderMethod() {
		return Method.getMethod(CgUtil.getMethodName("createRubyClass", RubyClass.class));
	}
	
	protected String createMethodFactoryName() {
		return "createMethodFactory";
	}

	protected int createRubyType(GeneratorAdapter mg, Annotation annotation) {
		RubyLevelClass klassAnnotation = (RubyLevelClass)annotation;
		mg.push(klassAnnotation.name());
		loadSuperClass(mg, klassAnnotation.superclass());
		mg.invokeStatic(Types.RUBY_API_TYPE, 
				Method.getMethod(CgUtil.getMethodName("defineClass", RubyClass.class, 
						String.class, RubyClass.class)));

		int rubyTypeIdx = mg.newLocal(Types.RUBY_CLASS_TYPE);
		mg.storeLocal(rubyTypeIdx);

		for (String moduleName : klassAnnotation.modules()) {
			mg.loadLocal(rubyTypeIdx);
			loadModule(mg, moduleName, rubyTypeIdx);
			mg.invokeVirtual(Types.RUBY_MODULE_TYPE, Method.getMethod(
					CgUtil.getMethodName("includeModule", Void.TYPE, RubyModule.class)));
		}

		return rubyTypeIdx;
	}

	private static void loadSuperClass(GeneratorAdapter mg, String superclass) {
		if (Types.isBuiltinClass(superclass)) {
			mg.getStatic(Types.RUBY_RUNTIME_TYPE, 
					superclass + "Class", Types.RUBY_CLASS_TYPE);
		} else {
			// FIXME: 
		}
	}
	
	private void loadModule(GeneratorAdapter mg, String module, int rubyTypeIdx) {
		if (Types.isBuiltinModule(module)) {
			mg.getStatic(Types.RUBY_RUNTIME_TYPE, 
					module + "Module", Types.RUBY_MODULE_TYPE);
		} else {
			mg.loadLocal(rubyTypeIdx);
			mg.push(module);
			mg.invokeStatic(Types.RUBY_API_TYPE, Method.getMethod(
					CgUtil.getMethodName("getCurrentNamespaceConstant", RubyValue.class, RubyModule.class, String.class)));
			mg.checkCast(Types.RUBY_MODULE_TYPE);
		}
	}
}
