/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.StringMap;

public class RubyIDClassGenerator {
	private static String DEFAULT_RUBY_ID_CLASS_NAME = "RubyIDContainer"; 
	public static String RubyIDClassName = DEFAULT_RUBY_ID_CLASS_NAME;
	private static String RubyIDClassDescriptor = "L" + DEFAULT_RUBY_ID_CLASS_NAME + ";";
	private static Map<String, String> idMap = new HashMap<String, String>();
	
	private static boolean isAlphabeta(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
	
	private static boolean isNumber(char c) {
		return c >= '0' && c <= '9';
	}
	
	private static boolean isValidJavaID(String s) {
		char firstChar = s.charAt(0);
		if ((firstChar == '_') || isAlphabeta(firstChar)) {
			int len = s.length();
			for (int i = 1; i < len; i++) {
				char currentChar = s.charAt(i);
				if (!((currentChar == '_') || isAlphabeta(currentChar) || isNumber(currentChar))) {
					return false;
				}
			}
			
			return true;
		}
		
		return false;
	}
	
	private static long counter = 0;
	
	private static String nextID() {
		return "ID" + counter++;
	}
	
	private static String getNameWithoutSufix(String script_name) {
		File file = new File(script_name);
		String name = file.getName();
		int position_of_first_dot = name.indexOf('.');
		if (position_of_first_dot >= 0) {
			name = name.substring(0, position_of_first_dot);
		}
		
		return name.replace('-', '$');//'-' is not allowed for java
	}
	
	public static void initScript(String script) {
		if (null == script) {
			script = "STDIN";
		}

		String packageName = getNameWithoutSufix(script);
		
		RubyIDClassName = packageName + "/" + DEFAULT_RUBY_ID_CLASS_NAME;
		RubyIDClassDescriptor = "L" + RubyIDClassName + ";" ;
	}
	
	public static void clear() {
		idMap.clear();
	}
	
	public static void getField(GeneratorAdapter mg, String s) {
		String id = idMap.get(s);
		if (id == null) {
			if (isValidJavaID(s)) {
				id = s + "ID";
			} else {
				id = nextID();
			}
			
			idMap.put(s, id);
		}
		
		try {
            mg.getStatic(Type.getType(RubyIDClassDescriptor), id, Type.getType(RubyID.class));
		} catch (RuntimeException e) {
			System.out.println(s);
			throw e;
		}
	}
	
	private static byte[] visitEnd() {
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		cw.visit(Opcodes.V1_1, Opcodes.ACC_PUBLIC, RubyIDClassName, null, "java/lang/Object", null);
		Method staticBlock = Method.getMethod("void <clinit> ()V");
		GeneratorAdapter staticBlockMg = new GeneratorAdapter(Opcodes.ACC_STATIC, staticBlock, null, null, cw);
		
		for (Map.Entry<String, String> e : idMap.entrySet()) {
			cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, e.getValue(), 
					Type.getType(RubyID.class).getDescriptor(), null, null);
			
			staticBlockMg.push(e.getKey());
			staticBlockMg.invokeStatic(Type.getType(StringMap.class),
					Method.getMethod("com.xruby.runtime.lang.RubyID intern(String)"));
			staticBlockMg.putStatic(Type.getType(RubyIDClassDescriptor), e.getValue(), Type.getType(RubyID.class));
		}
		
		staticBlockMg.returnValue();
		staticBlockMg.endMethod();
		cw.visitEnd();
		
		return cw.toByteArray();
	}
	
	public static CompilationResult getCompilationResult() {
		return new CompilationResult(RubyIDClassName, visitEnd());
	}
}
