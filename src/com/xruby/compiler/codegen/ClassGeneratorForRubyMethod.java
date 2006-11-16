package com.xruby.compiler.codegen;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Method;

//import com.xruby.newruntime.lang.RubyMethod;

class ClassGeneratorForRubyMethod extends ClassGenerator {

	private String methodName_;//this name is saved for 'super'
	
	public ClassGeneratorForRubyMethod(String methodName, String name, int argc, boolean has_asterisk_parameter, int default_argc) {
		super(name);
		methodName_ = methodName;
		mg_for_run_method_ = visitRubyMethod(argc, has_asterisk_parameter, default_argc);
	}

	String getMethodName() {
		return methodName_;
	}
	
	protected Class getType() {
		return Types.RubyMethodClass;
	}

	private MethodGenerator visitRubyMethod(int argc, boolean has_asterisk_parameter, int default_argc) {
		cw_.visit(Opcodes.V1_5,
				0,		//No modifier
				name_,	
				null,								// signature
				"com/xruby/newruntime/lang/RubyMethod",	// superName
				null								// interface
				);
		
		createConstructorOfRubyMethod(argc, has_asterisk_parameter, default_argc);
		
		return new MethodGenerator(Opcodes.ACC_PROTECTED,
				Method.getMethod("com.xruby.newruntime.lang.RubyValue run(com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.value.RubyArray, com.xruby.newruntime.lang.RubyBlock)"),
				null,
				null,
				cw_);
	}

	private void createConstructorOfRubyMethod(int argc, boolean has_asterisk_parameter, int default_argc) {
		MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
				Method.getMethod("void <init> ()"),
				null,
				null,
				cw_);
		mg.loadThis();
		mg.push(argc);
		mg.push(has_asterisk_parameter);
		mg.push(default_argc);
		mg.invokeConstructor(Type.getType(Types.RubyMethodClass),
						Method.getMethod("void <init> (int, boolean, int)"));
		mg.returnValue();
		mg.endMethod();
	}
}

