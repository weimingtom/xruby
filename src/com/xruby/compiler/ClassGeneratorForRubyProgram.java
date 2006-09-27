package com.xruby.compiler;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Method;

import com.xruby.core.lang.RubyException;

class ClassGeneratorForRubyProgram extends ClassGenerator {
	public ClassGeneratorForRubyProgram(String name) {
		super(name);
		mg_for_run_method_ = visitRubyProgram();
	}
	
	protected Class getType() {
		assert(false);
		return null;
	}

	private MethodGenerator visitRubyProgram() {
		cw_.visit(Opcodes.V1_5,
				Opcodes.ACC_PUBLIC,
				name_,
				null,										// signature
				"java/lang/Object",							// superName
				new String[] { "com/xruby/core/lang/RubyProgram" }	// interface
				);

		createImplicitConstructor(cw_);
		createStaticVoidMain(cw_);
		
		//Implement RubyProgram
		return new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("com.xruby.core.lang.RubyValue run()"),
				null,// signature
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw_);
	}

	private void createStaticVoidMain(ClassWriter cw) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
				Method.getMethod("void main (String[])"),
				null,
				new Type[] {Type.getType(RubyException.class)},// Type[] exceptions
				cw);

		Type program = Type.getType("L" + name_ + ";");
		mg.newInstance(program);
		mg.dup();
		mg.invokeConstructor(program,
				Method.getMethod("void <init> ()"));
		mg.invokeVirtual(program,
				Method.getMethod("com.xruby.core.lang.RubyValue run()"));
		mg.pop();
		
		mg.returnValue();
		mg.endMethod();
	}
	
}

