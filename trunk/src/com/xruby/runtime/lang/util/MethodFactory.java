/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.util.CheckClassAdapter;

import com.xruby.compiler.XRubyClassLoader;
import com.xruby.compiler.codegen.CgUtil;
import com.xruby.compiler.codegen.ClassDumper;
import com.xruby.runtime.lang.RubyMethod;

public class MethodFactory {
	private static final XRubyClassLoader cl = new XRubyClassLoader();
	private static final ClassDumper dumper = new ClassDumper();
	
	private Class klass;
	private boolean module;
	
	public static MethodFactory createMethodFactory(Class klass) {
		return new MethodFactory(klass, false);
	}
	
	public static MethodFactory createModuleMethodFactory(Class klass) {
		return new MethodFactory(klass, true);
	}
	
	private MethodFactory(Class klass, boolean module) {
		this.klass = klass;
		this.module = module;
	}
	
	public RubyMethod getMethod(String name, MethodType type, boolean singleton, boolean block) {
		return loadMethod(name, type, singleton, block);
	}
	
	public RubyMethod getMethod(String name, MethodType type) {
		return loadMethod(name, type, false, false);
	}
	
	public RubyMethod getMethodWithBlock(String name, MethodType type) {
		return loadMethod(name, type, false, true);
	}
	
	public RubyMethod getSingletonMethod(String name, MethodType type) {
		return loadMethod(name, type, true, false);
	}
	
	public RubyMethod getSingletonMethodWithBlock(String name, MethodType type) {
		return loadMethod(name, type, true, true);
	} 

	private RubyMethod loadMethod(String name, MethodType type, boolean singleton, boolean block) {
		String invokerName = getInvokerName(name, block);
		Class klass = tryClass(invokerName);
		try {
			if (klass == null) {
				klass = createMethodClass(invokerName, name, type, singleton, block);
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

	private Class createMethodClass(String invokerName, String name, MethodType type, 
			boolean singleton, boolean block) throws Exception {
		MethodFactoryHelper helper = MethodFactoryHelper.getHelper(type);		
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		ClassVisitor cv = new CheckClassAdapter(cw);
		
		startInvoker(cv, helper, invokerName);
		helper.createRunMethod(cv, this.klass, name, (singleton | this.module), block);
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
		CgUtil.createImplicitConstructor(cv, helper.getSuperType());
	}
	
	private void endInvoker(ClassVisitor cv) {
		cv.visitEnd();
	}
	
	private Class loadClass(String invokerName, ClassWriter cw) {
		dumper.dump(invokerName, cw.toByteArray());
		return cl.load(invokerName, cw.toByteArray());
	}
}
