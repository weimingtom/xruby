package com.xruby.runtime.lang.util;

import java.lang.annotation.Annotation;

import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.compiler.codegen.CgUtil;
import com.xruby.compiler.codegen.Types;
import com.xruby.runtime.lang.RubyObject;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelObject;

public class RubyObjectFactory extends RubyTypeFactory {
	RubyObjectFactory(Class klass) {
		super(klass);
	}
	
	protected boolean isModule() {
		return false;
	}

	protected Class getTypeAnnotationClass() {
		return RubyLevelObject.class;
	}
	
	protected String getBuilderName(Class klass) {
		return CgUtil.getInternalName(klass.getName() + "$ObjectBuilder");
	}
	
	protected Class getInterface() {
		return RubyObjectBuilder.class;
	}
	
	protected Method getBuilderMethod() {
		return Method.getMethod(CgUtil.getMethodName("createRubyObject", RubyObject.class));
	}

	protected int createRubyType(GeneratorAdapter mg, Annotation annotation) {
		RubyLevelObject objectAnnotation = (RubyLevelObject)annotation;
		
		mg.newInstance(Types.RUBY_OBJECT_TYPE);
		mg.dup();
		loadRubyClass(mg, objectAnnotation.objectClass());
		
		mg.invokeConstructor(Types.RUBY_OBJECT_TYPE, 
				Method.getMethod("void <init> (com.xruby.runtime.lang.RubyClass)"));//, Void.TYPE, RubyObject.class)));
		
		int rubyTypeIdx = mg.newLocal(Types.RUBY_OBJECT_TYPE);
		mg.storeLocal(rubyTypeIdx);
		
		String name = objectAnnotation.name();
		if (name != null && name.length() != 0) {
			mg.loadLocal(rubyTypeIdx);
			mg.push(name);
			mg.invokeStatic(Types.RUBY_API_TYPE, 
					Method.getMethod(CgUtil.getMethodName("setTopLevelConstant", RubyValue.class, RubyValue.class, String.class)));
		}
		
		return rubyTypeIdx;
	}
}
