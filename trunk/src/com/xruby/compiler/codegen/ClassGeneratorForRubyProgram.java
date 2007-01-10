package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.Method;
import com.xruby.runtime.lang.RubyBinding;

class ClassGeneratorForRubyProgram extends ClassGenerator {
	public ClassGeneratorForRubyProgram(String name, RubyBinding binding) {
		super(name);
		mg_for_run_method_ = visitRubyProgram(binding);
	}
	
	protected Class getType() {
		assert(false);
		return null;
	}

	private MethodGenerator visitRubyProgram(RubyBinding binding) {
		cv_.visit(Opcodes.V1_5,
				Opcodes.ACC_PUBLIC,
				name_,
				null,										// signature
				"com/xruby/runtime/lang/RubyProgram",		// superName
				null										// interface
				);

		createImplicitConstructor(cv_);
		createStaticVoidMain(cv_);
		
		//Implement RubyProgram
		return new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("com.xruby.runtime.lang.RubyValue run(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock)"),
				null,
				null,
				cv_,
				binding);
	}

	private void createImplicitConstructor(ClassVisitor cw) {
		Method m = Method.getMethod("void <init> ()");
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
				m,
				null,
				null,
				cw);
		mg.loadThis();
		mg.invokeConstructor(Type.getType(Types.RubyProgramClass), m);
		mg.returnValue();
		mg.endMethod();
	}

	private void createStaticVoidMain(ClassVisitor cv) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
				Method.getMethod("void main (String[])"),
				null,
				null,
				cv);

		mg.loadArg(0);
		mg.invokeStatic(Type.getType(Types.RubyRuntimeClass),
				Method.getMethod("void initBuiltin(String[])"));

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

