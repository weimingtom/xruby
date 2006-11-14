package com.xruby.compiler.codegen;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Method;

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
				new String[] { "com/xruby/runtime/lang/RubyProgram" }	// interface
				);

		createImplicitConstructor(cw_);
		createStaticVoidMain(cw_);
		
		//Implement RubyProgram
		return new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("com.xruby.runtime.lang.RubyValue run()"),
				null,
				null,
				cw_);
	}

	private void createStaticVoidMain(ClassWriter cw) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
				Method.getMethod("void main (String[])"),
				null,
				null,
				cw);

		mg.invokeStatic(Type.getType(Types.RubyRuntimeClass),
				Method.getMethod("void initBuiltin()"));

		Type program = Type.getType("L" + name_ + ";");
		mg.newInstance(program);
		mg.dup();
		mg.invokeConstructor(program,
				Method.getMethod("void <init> ()"));
		mg.invokeVirtual(program,
				Method.getMethod("com.xruby.runtime.lang.RubyValue run()"));
		mg.pop();

		mg.invokeStatic(Type.getType(Types.AtExitBlocksClass),
				Method.getMethod("void invokeAll()"));
		
		mg.returnValue();
		mg.endMethod();
	}
	
}

