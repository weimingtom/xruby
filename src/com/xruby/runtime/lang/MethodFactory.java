/**
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

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
import com.xruby.runtime.value.RubyArray;

public class MethodFactory {
	private static final XRubyClassLoader cl = new XRubyClassLoader();
	private static boolean dump;
	private static String dumpPath;
	private static ClassFileWriter cfw;
	
	public static final int NO_ARG = 1;
	public static final int ONE_ARG = 2;
	public static final int TWO_ARG = 4;
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

	public RubyMethod getMethod(String name, int argc) {
		return loadMethod(name, argc, false);
	}
	
	public RubyMethod getMethodWithBlock(String name, int argc) {
		return loadMethod(name, argc, true);
	}

	private RubyMethod loadMethod(String name, int argc, boolean block) {
		String invokerName = getInvokerName(name, block);
		Class klass = tryClass(invokerName);
		try {
			if (klass == null) {
				klass = createMethodClass(invokerName, name, argc, block);
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

	private Class createMethodClass(String invokerName, String name, int argc, boolean block) throws Exception {
		MethodFactoryHelper helper = MethodFactoryHelper.getHelper(argc);		
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
	
	private static abstract class MethodFactoryHelper {
		public abstract Type getSuperType();
		protected abstract String getRunName();
		protected abstract void loadBlock(GeneratorAdapter mg);
		protected abstract void loadArgs(GeneratorAdapter mg);
		protected abstract Class[] getParams(boolean block);
		
		public void createRunMethod(ClassVisitor cv, Class klass, String name, boolean block) throws Exception {
			Type type = Type.getType(klass);
			Class[] params = getParams(block);
			Class returnClass = klass.getMethod(name, params).getReturnType();
			String methodName = CgUtil.getMethodName(name, returnClass, params);
			GeneratorAdapter mg = startRun(getRunName(), cv);
			loadReceiver(mg, type);	
			loadArgs(mg);
			
			if (block) {	
				this.loadBlock(mg);
			}
			mg.invokeVirtual(type, Method.getMethod(methodName));
			endRun(mg);
		}
		
		private GeneratorAdapter startRun(String runName, ClassVisitor cv) {
			Method m = Method.getMethod(runName);
			GeneratorAdapter mg = new GeneratorAdapter(Opcodes.ACC_PROTECTED,
	                m, null, null, cv);
			mg.visitCode();		
			return mg;
		}
		
		private void loadReceiver(GeneratorAdapter mg, Type type) {
			mg.loadArg(0);
			mg.checkCast(type);
		}
		
		private void endRun(GeneratorAdapter mg) {
			mg.returnValue();
			mg.endMethod();	
		}
		
		private static final MethodFactoryHelper NO_ARG_HELPER = new MethodFactoryHelper() {
			public Type getSuperType() {
				return Type.getType(RubyNoArgMethod.class);
			}
			
			protected String getRunName() {
				return CgUtil.getMethodName("run", RubyValue.class, 
						RubyValue.class, RubyBlock.class);
			}
			
			protected void loadBlock(GeneratorAdapter mg) {
				mg.loadArg(1);
			}
			
			protected Class[] getParams(boolean block) {
				return block ? new Class[] {RubyBlock.class} : new Class[0];
			}

			protected void loadArgs(GeneratorAdapter mg) {
			}
		};
		
		private static final MethodFactoryHelper ONE_ARG_HELPER = new MethodFactoryHelper() {
			public Type getSuperType() {
				return Type.getType(RubyOneArgMethod.class);
			}
			
			protected String getRunName() {
				return CgUtil.getMethodName("run", RubyValue.class, 
						RubyValue.class, RubyValue.class, RubyBlock.class);
			}
			
			protected void loadBlock(GeneratorAdapter mg) {
				mg.loadArg(2);
			}
			
			protected Class[] getParams(boolean block) {
				return block ? new Class[] {RubyValue.class, RubyBlock.class} : new Class[] {RubyValue.class};
			}
			
			protected void loadArgs(GeneratorAdapter mg) {
				mg.loadArg(1);
			}
		};
		
		private static final MethodFactoryHelper DEFAULT_ARG_HELPER = new MethodFactoryHelper() {
			public Type getSuperType() {
				return Type.getType(RubyVarArgMethod.class);
			}
			
			protected String getRunName() {
				return CgUtil.getMethodName("run", RubyValue.class, 
						RubyValue.class, RubyArray.class, RubyBlock.class);
			}
			
			protected void loadBlock(GeneratorAdapter mg) {
				mg.loadArg(2);
			}
			
			protected Class[] getParams(boolean block) {
				return block ? new Class[] {RubyArray.class, RubyBlock.class} : new Class[] {RubyArray.class};
			}

			protected void loadArgs(GeneratorAdapter mg) {
				mg.loadArg(1);
			}
		};
		
		public static final MethodFactoryHelper getHelper(int argc) {
			switch (argc) {
			case NO_ARG:
				return NO_ARG_HELPER;
			case ONE_ARG:
				return ONE_ARG_HELPER;
			default:
				return DEFAULT_ARG_HELPER;
			}
		}
	}
}
