package com.xruby.newruntime.lang;

import junit.framework.TestCase;

public class CoreTest extends TestCase {	
	public void testInitialize() {
		/*
		 * Builtin class
		 */ 
		RubyClass objectClass = RubyRuntime.objectClass;		
		RubyClass moduleClass = RubyRuntime.moduleClass;
		RubyClass classClass = RubyRuntime.classClass;
		
		assertNotNull(objectClass);
		assertNotNull(moduleClass);				
		assertNotNull(classClass);
		
		// Meta class
		RubyClass objectMetaClass = objectClass.getRubyClass();
		RubyClass moduleMetaClass = moduleClass.getRubyClass();
		RubyClass classMetaClass = classClass.getRubyClass();
		
		assertNotNull(objectMetaClass);		
		assertNotNull(moduleMetaClass);		
		assertNotNull(classMetaClass);
		
		assertTrue(objectMetaClass.isSingleton());
		assertTrue(moduleMetaClass.isSingleton());
		assertTrue(classMetaClass.isSingleton());
		
		// Super class
		// Object's super class is an include class which includes kernel module 
		//assertEquals(null, objectClass.getSuper());
		assertEquals(objectClass, moduleClass.getSuper());
		assertEquals(moduleClass, classClass.getSuper());
		assertEquals(classClass, objectMetaClass.getSuper());
		assertEquals(objectMetaClass, moduleMetaClass.getSuper());
		assertEquals(moduleMetaClass, classMetaClass.getSuper());
		
		/*
		 * Builtin module
		 */
		RubyModule kernelModule = RubyRuntime.kernelModule;
		assertNotNull(kernelModule);
		RubyClass kernelMetaClass = kernelModule.getRubyClass();
		
		assertEquals(moduleClass, kernelMetaClass.realClass());
	}
	
	public void testDefineClass() {
		RubyClass testClass = RubyRuntime.defineClass("TestClass", RubyRuntime.objectClass);
		assertNotNull(testClass);
		assertEquals(RubyRuntime.objectClass, testClass.getSuper());
		
		try {
			RubyRuntime.defineClass("NoSuperClass", null);
		} catch (RubyException e) {
			assertEquals(RubyRuntime.typeError, RubyUtil.classof(e.getRubyException()));
		}
	}
	
	public void testDefineDefinedClass() {
		RubyClass objectClass = RubyRuntime.defineClass("Object", null);
		assertNotNull(objectClass);
		assertEquals(RubyRuntime.objectClass, objectClass);
	}
	
	public void testDefineUnderClass() {
		RubyClass outterClass = RubyRuntime.defineClass("OutterClass", RubyRuntime.objectClass);
		RubyClass innerClass = RubyRuntime.defineClassUnder(outterClass, "InnerClass", RubyRuntime.objectClass);
		assertNotNull(innerClass);
		assertEquals("OutterClass::InnerClass", innerClass.getName().getString());
		
		// defined
		RubyClass definedClass = RubyRuntime.defineClassUnder(outterClass, "InnerClass", RubyRuntime.objectClass);
		assertEquals(innerClass, definedClass);
	}
	
	public void testDefinedUnderModule() {
		RubyModule outterMoudle = RubyRuntime.defineModule("OutterModule");
		RubyModule innerModule = RubyRuntime.defineModuleUnder(outterMoudle, "InnerModule");
		assertNotNull(innerModule);
		RubyModule inner2Module = RubyRuntime.defineModuleUnder(innerModule, "Inner2Module");
		assertNotNull(inner2Module);
		assertEquals("OutterModule::InnerModule::Inner2Module", inner2Module.getName().getString());
		assertEquals("OutterModule::InnerModule", innerModule.getName().getString());
	}
}
