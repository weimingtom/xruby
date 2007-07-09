package com.xruby.compiler.codegen;

public class CgUtil {
	public static String getInternalName(Class klass) {
		return klass.getName().replace(".", "/");
	}
	
	public static String getInternalName(String name) {
		return name.replace(".", "/");
	}
	
	public static String getMethodName(String method, Class returnType) {
		StringBuilder sb = new StringBuilder();
		sb.append(returnType.getName());
		sb.append(" ");
		sb.append(method);
		sb.append("(");		
		sb.append(")");
		
		return sb.toString();
	}
	
	public static String getMethodName(String method, Class returnType, Class param) {
		StringBuilder sb = new StringBuilder();
		sb.append(returnType.getName());
		sb.append(" ");
		sb.append(method);
		sb.append("(");
		sb.append(param.getName());
		sb.append(")");
		
		return sb.toString();
	}
	
	public static String getMethodName(String method, Class returnType, Class param0, Class param1) {
		StringBuilder sb = new StringBuilder();
		sb.append(returnType.getName());
		sb.append(" ");
		sb.append(method);
		sb.append("(");
		sb.append(param0.getName());
		sb.append(", ");
		sb.append(param1.getName());
		sb.append(")");
		
		return sb.toString();
	}
	
	public static String getMethodName(String method, Class returnType, Class param0, Class param1, Class param2) {
		StringBuilder sb = new StringBuilder();
		sb.append(returnType.getName());
		sb.append(" ");
		sb.append(method);
		sb.append("(");
		sb.append(param0.getName());
		sb.append(", ");
		sb.append(param1.getName());
		sb.append(", ");
		sb.append(param2.getName());
		sb.append(")");
		
		return sb.toString();
	}
	
	public static String getMethodName(String method, Class returnType, Class[] params) {
		StringBuilder sb = new StringBuilder();
		sb.append(returnType.getName());
		sb.append(" ");
		sb.append(method);
		sb.append("(");
		for (int i = 0; i < params.length; i++) {
			sb.append(params[i].getName());
			if (i != params.length - 1) {
				sb.append(", ");
			}
		}
		sb.append(")");
		
		return sb.toString();
	}
}
