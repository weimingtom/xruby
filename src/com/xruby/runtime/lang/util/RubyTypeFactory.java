/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.util.CheckClassAdapter;

import com.xruby.compiler.XRubyClassLoader;
import com.xruby.compiler.codegen.CgConfig;
import com.xruby.compiler.codegen.CgUtil;
import com.xruby.compiler.codegen.ClassDumper;
import com.xruby.compiler.codegen.Types;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyAllocMethod;
import com.xruby.runtime.lang.annotation.RubyLevelConstant;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.value.RubyArray;

public abstract class RubyTypeFactory {
	public static RubyClass getClass(Class klass) {	
		Class loadClass = new RubyClassFactory(klass).loadClass();
		if (loadClass == null) { 
			return null; 
		}
		
		return loadRubyClassBuilder(loadClass).createRubyClass();
	}

	private static RubyClassBuilder loadRubyClassBuilder(Class loadClass) {
		try {
			return (RubyClassBuilder)loadClass.newInstance();
		} catch (InstantiationException ie) {
			throw new RuntimeException("fail to create Ruby class", ie);
		} catch (IllegalAccessException iae) {
			throw new RuntimeException("fail to create Ruby class", iae);
		}
	}
	
	public static RubyModule getModule(Class klass) {
		Class loadClass = new RubyModuleFactory(klass).loadClass();
		if (loadClass == null) { 
			return null; 
		}
		
		return loadRubyModuleBuilder(loadClass).createRubyModule();
	}
	
	private static RubyModuleBuilder loadRubyModuleBuilder(Class loadClass) {
		try {
			return (RubyModuleBuilder)loadClass.newInstance();
		} catch (InstantiationException ie) {
			throw new RuntimeException("fail to create Ruby class", ie);
		} catch (IllegalAccessException iae) {
			throw new RuntimeException("fail to create Ruby class", iae);
		}
	}
	
	Class loadClass() {
		String name = getBuilderName(klass);
		Class klass = tryClass(name);
		if (klass == null) {
			return createClass(name);
		}
		
		return klass;
	}

	private Class createClass(String name) {
		Annotation annotation = klass.getAnnotation(this.getTypeAnnotationClass());
		if (annotation == null) {
			throw new RuntimeException("no annotation class:" + klass);
		}
		
		startBuilder(name);
		createBuilderMethod(annotation);
		endClassBuilder();
		
		return loadBuidlerClass(name);
	}
	
	private Class loadBuidlerClass(String name) {
		byte[] content = cw.toByteArray();
        dupmer.dump(name, content);
		return cl.load(name, content);
	}
	
	private Class tryClass(String name) {
		try {
			return cl.load(name);
		} catch (Exception e) {
			return null;
		}
	}
	
	private static final Type methodFactoryType = Type.getType(MethodFactory.class);
	private static final XRubyClassLoader cl = new XRubyClassLoader();
	private static ClassDumper dupmer = new ClassDumper();
	private static final Type OBJECT_TYPE = Type.getType(Object.class);
	
	private Class klass;
	private ClassWriter cw;
	private ClassVisitor cv;
	
	RubyTypeFactory(Class klass) {
		this.klass = klass;
		this.cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		this.cv = new CheckClassAdapter(cw);
	}
	
	protected abstract Class getTypeAnnotationClass();
	protected abstract String getBuilderName(Class klass);
	protected abstract Class getInterface();
	protected abstract Method getBuilderMethod();
	protected abstract int createRubyType(GeneratorAdapter mg, Annotation annotation);
	protected abstract String createMethodFactoryName();
	protected abstract boolean isModule();
	
	private void startBuilder(String name) {
		this.cv.visit(CgConfig.TARGET_VERSION, Opcodes.ACC_PUBLIC, name, 
				null, CgUtil.getInternalName(Object.class), new String[] { CgUtil.getInternalName(getInterface())});
		
		
		CgUtil.createImplicitConstructor(this.cv, OBJECT_TYPE);
	}
	
	private GeneratorAdapter startBuilderMethod() {
		GeneratorAdapter mg = new GeneratorAdapter(Opcodes.ACC_PUBLIC,
                getBuilderMethod(), null, null, this.cv);
		mg.visitCode();
		return mg;
	}
	
	private void endClassBuilder() {
		cv.visitEnd();
	}
	
	private void createBuilderMethod(Annotation annotation) {	
		GeneratorAdapter mg = startBuilderMethod();
		int rubyTypeIdx = createRubyType(mg, annotation);
		generateMethod(mg, rubyTypeIdx);
		generateConstant(mg, rubyTypeIdx);
		
		mg.loadLocal(rubyTypeIdx);		
        mg.returnValue();
        mg.endMethod();
	}
	
	private void generateConstant(GeneratorAdapter mg, int rubyTypeIdx) {
		for (Field field : klass.getFields()) {
			int modifier = field.getModifiers();
			if (!(Modifier.isStatic(modifier) || Modifier.isPublic(modifier))) {
				continue;
			}
			
			Annotation rawFieldAnnotation = field.getAnnotation(RubyLevelConstant.class);
			if (rawFieldAnnotation == null) {
				continue;
			}
			
			defineRubyConstant(mg, field, (RubyLevelConstant)rawFieldAnnotation, rubyTypeIdx);
		}
	}

	private void defineRubyConstant(GeneratorAdapter mg, Field field, 
			RubyLevelConstant constant, int rubyTypeIdx) {
		mg.loadLocal(rubyTypeIdx);
		mg.push(constant.name());
		mg.getStatic(Type.getType(this.klass), field.getName(), Type.getType(field.getType()));
		mg.invokeVirtual(Types.RUBY_MODULE_TYPE, Method.getMethod(
				CgUtil.getMethodName("setConstant", RubyValue.class, String.class, RubyValue.class)));
	}

	private void generateMethod(GeneratorAdapter mg, int rubyTypeIdx) {
		int factoryIdx = createLocalMethodFactory(mg);
		
		Map<String, CgMethodItem> methodMap = new HashMap<String, CgMethodItem> ();
		CgMethodItem allocItem = null;
		
		for (java.lang.reflect.Method method : klass.getMethods()) {
			Annotation rawMethodAnnotation = method.getAnnotation(RubyLevelMethod.class);
			if (rawMethodAnnotation != null) {
				CgMethodItem newItem = createMethodItem((RubyLevelMethod)rawMethodAnnotation, method);
				CgMethodItem item = methodMap.get(getItemName(newItem));
				if (item != null) {
					item.type = MethodType.valueOf((item.type.value() | newItem.type.value()));
				} else {
					methodMap.put(getItemName(newItem), newItem);
				}
				
				continue;
			}
			
			Annotation allocMethodAnnotation = method.getAnnotation(RubyAllocMethod.class);
			if (allocMethodAnnotation != null) {
				CgMethodItem item = createAllocItem((RubyAllocMethod)allocMethodAnnotation, method);
				if (allocItem != null) {
					allocItem.type = MethodType.valueOf(allocItem.type.value() | (item.type.value()));
				} else {
					allocItem = createAllocItem((RubyAllocMethod)allocMethodAnnotation, method);
				}
				continue;
			}
		}
		
		for (CgMethodItem item : methodMap.values()) {	
			defineRubyMethod(mg, rubyTypeIdx, factoryIdx, item);
		}
		
		if (allocItem != null) {
			defineAllocMethod(mg, rubyTypeIdx, factoryIdx, allocItem);
		}
		
		for (Class innerClass : klass.getClasses()) {
			Annotation rawMethodAnnotation = innerClass.getAnnotation(RubyLevelMethod.class);
			if (rawMethodAnnotation != null) {
				if (!RubyMethod.class.isAssignableFrom(innerClass)) {
					throw new RuntimeException(innerClass.getName() + " should be subclasss of RubyMethod");
				}
				
				CgMethodItem item = createMethodItem((RubyLevelMethod)rawMethodAnnotation, innerClass);
				defineRubyMethodWithClass(mg, rubyTypeIdx, factoryIdx, innerClass, item);
			}
		}
	}

	private void defineRubyMethodWithClass(GeneratorAdapter mg, int rubyTypeIdx, int factoryIdx, Class innerClass, CgMethodItem item) {
		loadRubyType(mg, rubyTypeIdx, item);
		mg.push(item.name);
		Type type = Type.getType(innerClass);
		mg.newInstance(type);
		mg.dup();
		mg.invokeConstructor(type, CgUtil.CONSTRUCTOR);
		defineMethod(mg, item);
		defineAlias(mg, factoryIdx, rubyTypeIdx, item);
	}
	
	private String getItemName(CgMethodItem item) {
		return (item.singleton) ? item.name + "Single" : item.name;
	}
	
	private CgMethodItem createMethodItem(RubyLevelMethod annotation, Class klass) {
		CgMethodItem item = new CgMethodItem();
		item.javaName = klass.getName();
		makeGenneralItem(annotation, item);
		return item;
	}
	
	private CgMethodItem createMethodItem(RubyLevelMethod annotation, java.lang.reflect.Method method) {
		CgMethodItem item = makeMethodItemPros(method);
		item.javaName = method.getName();
		makeGenneralItem(annotation, item);
		return item;
	}

private void makeGenneralItem(RubyLevelMethod annotation, CgMethodItem item) {
	item.name = annotation.name();
	item.alias = annotation.alias();
	
	if (annotation.singleton()) {
		item.singleton = true;
	}
	
	if (annotation.module()) {
		item.moduleMethod = true;
	}
	
	if (annotation.privateMethod()) {
		item.privateMethod = true;
	}
}
	
	private CgMethodItem createAllocItem(RubyAllocMethod annotation, java.lang.reflect.Method method) {
		CgMethodItem item = makeMethodItemPros(method);
		item.name = null;
		item.javaName = method.getName();
		item.alias = null;
		
		return item;
	}

	private CgMethodItem makeMethodItemPros(java.lang.reflect.Method method) {
		CgMethodItem item = new CgMethodItem();
		item.singleton = false;
		Class[] paramTypes = method.getParameterTypes();
		int start = 0;
		int end = paramTypes.length - 1;
		if (Modifier.isStatic(method.getModifiers())) {
			if (paramTypes[0] != RubyValue.class) {
				throw new IllegalArgumentException("unknown Ruby method specification:" + method);
			}
			
			if (!isModule()) {
				item.singleton = true;
			}
			
			start++;
		}
		
		item.block = false;
		if (paramTypes.length > 0 && paramTypes[paramTypes.length - 1] == RubyBlock.class) {
			item.block = true;
			end--;
		}
		
		item.type = getMethodType(paramTypes, start, end);
		if (item.type == MethodType.UNKNOWN) {
			throw new IllegalArgumentException("unknown Ruby method specification:" + method);
		}
		
		return item;
	}

	private MethodType getMethodType(Class[] paramTypes, int start, int end) {
		int argSize = end - start;
		if (argSize < 0) {
			return MethodType.NO_ARG;
		} else if (argSize == 0) {
			if (paramTypes[start] == RubyValue.class) {
				return MethodType.ONE_ARG;
			} else if (paramTypes[start] == RubyArray.class) {
				return MethodType.VAR_ARG;
			}
		} else if (argSize == 1) {
			if (paramTypes[start] == RubyValue.class && paramTypes[end] == RubyValue.class) {
				return MethodType.TWO_ARG;
			}
		}

		return MethodType.UNKNOWN;
	}
	
	private void defineAllocMethod(GeneratorAdapter mg, int rubyTypeIdx, int factoryIdx, CgMethodItem item) {
		mg.loadLocal(rubyTypeIdx);
		mg.loadLocal(factoryIdx);
		
		getMethod(mg, item.javaName, item.type, true, item.block);
		mg.invokeVirtual(Types.RUBY_CLASS_TYPE, 
				Method.getMethod(CgUtil.getMethodName("defineAllocMethod", Void.TYPE, RubyMethod.class)));
	}
	
	private int createLocalMethodFactory(GeneratorAdapter mg) {
		createMehtodFactory(mg, klass);
		int factoryIdx = mg.newLocal(methodFactoryType);
		mg.storeLocal(factoryIdx);
		return factoryIdx;
	}
	
	private void loadRubyType(GeneratorAdapter mg, int rubyTypeIdx, CgMethodItem item) {
		mg.loadLocal(rubyTypeIdx);
		if (item.singleton) {
			mg.invokeVirtual(Types.RUBY_MODULE_TYPE, 
					Method.getMethod(CgUtil.getMethodName("getSingletonClass", RubyClass.class)));
		}
	}
	
	private void defineRubyMethod(GeneratorAdapter mg, int rubyTypeIdx, 
			int factoryIdx, CgMethodItem item) {
		loadRubyType(mg, rubyTypeIdx, item);
		
		String rubyName = item.name;
		defineMethod(mg, factoryIdx, rubyName, item);
		defineAlias(mg, factoryIdx, rubyTypeIdx, item);
	}

	private void defineMethod(GeneratorAdapter mg, int factoryIdx, String rubyName, CgMethodItem item) {
		mg.push(rubyName);
		mg.loadLocal(factoryIdx);
		getMethod(mg, item);
		
		defineMethod(mg, item);
	}

	private void defineMethod(GeneratorAdapter mg, CgMethodItem item) {
		if (item.moduleMethod) {
			mg.invokeVirtual(Types.RUBY_MODULE_TYPE, 
					Method.getMethod(CgUtil.getMethodName("defineModuleMethod", Void.TYPE, String.class, RubyMethod.class)));
		} else if (item.privateMethod) {
			mg.invokeVirtual(Types.RUBY_MODULE_TYPE, 
					Method.getMethod(CgUtil.getMethodName("definePrivateMethod", RubyValue.class, String.class, RubyMethod.class)));
		} else {
			mg.invokeVirtual(Types.RUBY_MODULE_TYPE, 
					Method.getMethod(CgUtil.getMethodName("defineMethod", RubyValue.class, String.class, RubyMethod.class)));
		}
	}

	private void defineAlias(GeneratorAdapter mg, int factoryIdx, int rubyTypeIdx, CgMethodItem item) {
		String oldName = item.name;
		String[] aliases = item.alias;
		boolean singleton = item.singleton;
		
		for (String alias : aliases) {
			mg.loadLocal(rubyTypeIdx);
			if (singleton) {
				mg.invokeVirtual(Types.RUBY_MODULE_TYPE, 
						Method.getMethod(CgUtil.getMethodName("getSingletonClass", RubyClass.class)));
			}
			
			if (item.moduleMethod) {
				defineMethod(mg, factoryIdx, alias, item);
			} else {
				mg.push(alias);
				mg.push(oldName);
				mg.invokeVirtual(Types.RUBY_MODULE_TYPE, Method
						.getMethod(CgUtil.getMethodName("aliasMethod",
								Void.TYPE, String.class, String.class)));
			}
		}
	}
	
	private void getMethod(GeneratorAdapter mg, CgMethodItem item) {
		getMethod(mg, item.javaName, item.type, item.singleton, item.block);
	}
	
	private void getMethod(GeneratorAdapter mg, String methodName, MethodType type, boolean singleton, boolean block) {
		mg.push(methodName);
		type.generateMethodType(mg);
		mg.push(singleton);
		mg.push(block);
		mg.invokeVirtual(methodFactoryType, Method.getMethod(
				CgUtil.getMethodName("getMethod", RubyMethod.class, String.class, MethodType.class, Boolean.TYPE, Boolean.TYPE)));
	}

	private void createMehtodFactory(GeneratorAdapter mg, Class klass) {
		mg.push(Type.getType(klass));		
		mg.invokeStatic(methodFactoryType, 
				Method.getMethod(
						CgUtil.getMethodName(createMethodFactoryName(), MethodFactory.class, Class.class)));
	}
}
