package com.xruby.compiler;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Method;

import com.xruby.core.lang.RubyException;
import com.xruby.core.lang.RubyMethod;

class ClassGeneratorForRubyMethod extends ClassGenerator {
	public ClassGeneratorForRubyMethod(String name, int argc, boolean has_asterisk_parameter) {
		super(name);
		mg_for_run_method_ = visitRubyMethod(argc, has_asterisk_parameter);
	}
	
	protected Class getType() {
		return RubyMethod.class;
	}

	private MethodGenerator visitRubyMethod(int argc, boolean has_asterisk_parameter) {
		cw_.visit(Opcodes.V1_5,
				0,		//No modifier
				name_,	
				null,								// signature
				"com/xruby/core/lang/RubyMethod",	// superName
				null								// interface
				);
		
		createConstructorOfRubyMethod(argc, has_asterisk_parameter);
		
		return new MethodGenerator(Opcodes.ACC_PROTECTED,
				Method.getMethod("com.xruby.core.lang.RubyValue run(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyBlock)"),
				null,// signature
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw_);
	}

	private void createConstructorOfRubyMethod(int argc, boolean has_asterisk_parameter) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("void <init> ()"),
				null,
				null,
				cw_);
		mg.loadThis();
		mg.push(argc);
		mg.push(has_asterisk_parameter);
		mg.invokeConstructor(Type.getType(RubyMethod.class),
						Method.getMethod("void <init> (int, boolean)"));
		mg.returnValue();
		mg.endMethod();
	}
}

