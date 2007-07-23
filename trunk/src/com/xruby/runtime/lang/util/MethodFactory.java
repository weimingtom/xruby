/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.util.CheckClassAdapter;

import com.xruby.compiler.XRubyClassLoader;
import com.xruby.compiler.codegen.CgUtil;
import com.xruby.compiler.codegen.ClassFileWriter;
import com.xruby.runtime.lang.RubyMethod;

public class MethodFactory {
	private static final XRubyClassLoader cl = new XRubyClassLoader();
	private static boolean dump;
	private static String dumpPath;
	private static ClassFileWriter cfw;
	
	public static final int NO_ARG = 1;
	public static final int ONE_ARG = 2;
	public static final int NO_OR_ONE_ARG = 3;
	public static final int TWO_ARG = 4;
	public static final int ONE_OR_TWO_ARG = 6;
	public static final int VAR_ARG = 8;
	
	static {
		dump = Boolean.getBoolean("xruby.method.dump");
		if (dump) {
			dumpPath = System.getProperty("xruby.method.dump_path");
			cfw = new ClassFileWriter();
		}
	}
	
	private Class klass;
	
	public static MethodFactory createMethodFactory(Class klass) {
		return new MethodFactory(klass);
	}
	
	private MethodFactory(Class klass) {
		this.klass = klass;
	}	

	public RubyMethod getMethod(String name, int type) {
		return loadMethod(name, type, false);
	}
	
	public RubyMethod getMethodWithBlock(String name, int type) {
		return loadMethod(name, type, true);
	}

	private RubyMethod loadMethod(String name, int type, boolean block) {
		String invokerName = getInvokerName(name, block);
		Class klass = tryClass(invokerName);
		try {
			if (klass == null) {
				klass = createMethodClass(invokerName, name, type, block);
			}
			
			return (RubyMethod)klass.newInstance();
		} catch (Exception e) {
			return null;
		}
	}
	
	private Class tryClass(String name) {
		try {
			return cl.load(name);
		} catch (Exception e) {
			return null;
		}
	}

	private Class createMethodClass(String invokerName, String name, int type, boolean block) throws Exception {
		MethodFactoryHelper helper = MethodFactoryHelper.getHelper(type);		
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		ClassVisitor cv = new CheckClassAdapter(cw);
		
		startInvoker(cv, helper, invokerName);
		helper.createRunMethod(cv, this.klass, name, block);
		endInvoker(cv);
		
		return loadClass(invokerName, cw);
	}

	private String getInvokerName(String name, boolean block) {
		StringBuilder sb = new StringBuilder();
		sb.append(klass.getName());
		sb.append("$");
		sb.append(name);
		if (block) {
			sb.append("WithBlock");
		}
		sb.append("$Invoker");
		return CgUtil.getInternalName(sb.toString());
	}

	private void startInvoker(ClassVisitor cv, MethodFactoryHelper helper, String invokerName) {
		cv.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC, invokerName, 
				null, helper.getSuperType().getInternalName(), null);		
		createImplicitConstructor(cv, helper.getSuperType());
	}
	
	private void endInvoker(ClassVisitor cv) {
		cv.visitEnd();
	}
	
	private Class loadClass(String invokerName, ClassWriter cw) {
		if (dump) {
			try {
				String separator = System.getProperty("file.separator");
				if (!dumpPath.endsWith(separator)) {
					dumpPath += separator;
				}
				String filename = dumpPath + invokerName + ".class";
				cfw.write(filename, cw.toByteArray());
			} catch (Exception e) {
			}
		}
		return cl.load(invokerName, cw.toByteArray());
	}
	
	private void createImplicitConstructor(ClassVisitor cv, Type superType) {
        Method m = Method.getMethod("void <init> ()");
		GeneratorAdapter mg = new GeneratorAdapter(Opcodes.ACC_PUBLIC,
                m, null, null, cv);
		mg.visitCode();
        mg.loadThis();
        mg.invokeConstructor(superType, m);
        mg.returnValue();
        mg.endMethod();
    }
}
