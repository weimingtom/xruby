/** 
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

public class ClassGeneratorForOneArgRubyMethod extends ClassGeneratorForRubyMethod {
	public ClassGeneratorForOneArgRubyMethod(String method_name, String fileName, String name, int argc, boolean has_asterisk_parameter, int default_argc, boolean is_singleton_method) {
		super(method_name, fileName, name, argc, has_asterisk_parameter, default_argc,
				is_singleton_method);
	}
	
	public String getSuperName() {
		return "com/xruby/runtime/lang/RubyOneArgMethod";
	}
	
	public String getRunMethodName() {
		return "com.xruby.runtime.lang.RubyValue run(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock)";
	}
	
	public Class getSuperClass() {
		return Types.RubyOneArgMethodClass;
	}

	public String getSuperCtorName() {
		return "void <init> ()";
	}

	public void pushBasciArgForSuperArg(MethodGenerator mg, int argc, boolean has_asterisk_parameter, int default_argc) {		
	}

	public void loadMethodPrameter(int index) {
		assert(0 == index);
		getMethodGenerator().loadArg(1);
	}

	public void storeMethodParameter(int index) {
		assert(0 == index);
		getMethodGenerator().storeArg(1);
	}
	
	public void callSuperMethod() {
		this.getMethodGenerator().RubyAPI_callSuperOneArgMethod(this.getMethodName());
	}
}
