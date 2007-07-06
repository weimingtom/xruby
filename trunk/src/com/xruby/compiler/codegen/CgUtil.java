package com.xruby.compiler.codegen;

public class CgUtil {
	public static String getInternalName(Class klass) {
		return klass.getName().replace(".", "/");
	}
}
