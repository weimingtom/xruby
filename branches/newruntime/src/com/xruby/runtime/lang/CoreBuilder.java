package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.ExtensionBuilder;

public class CoreBuilder implements ExtensionBuilder {	
	private RubyClass objectClass;
	private RubyClass moduleClass;
	private RubyClass classClass;
	private RubyModule kernelModule;
	
	public RubyClass getObjectClass() {
		return this.objectClass;
	}
	
	public RubyClass getModuleClass() {
		return this.moduleClass;
	}
	
	public RubyClass getClassClass() {
		return this.classClass;
	}
	
	public RubyModule getKernelModule() {
		return this.kernelModule;
	}

	public void initialize() {
		this.objectClass = defineBootClass("Object", null);
		this.moduleClass = defineBootClass("Module", this.objectClass);
		this.classClass = defineBootClass("Class", this.moduleClass);
		
		RubyClass metaClass = createMetaClass(this.objectClass, this.classClass);
		metaClass = createMetaClass(this.moduleClass, metaClass);
		metaClass = createMetaClass(this.classClass, metaClass);
		
		this.kernelModule = defineModule("Kernel");
		this.objectClass.includeModule(this.kernelModule);
		this.objectClass.defineAllocMethod(ClassMethod.alloc);
		
		this.objectClass.definePrivateMethod("initialize", RubyMethod.DUMMY_METHOD, 0);
		this.classClass.definePrivateMethod("inherited", RubyMethod.DUMMY_METHOD, 1);
		this.moduleClass.definePrivateMethod("included", RubyMethod.DUMMY_METHOD, 1);
		this.moduleClass.definePrivateMethod("extended", RubyMethod.DUMMY_METHOD, 1);
		this.moduleClass.definePrivateMethod("method_added", RubyMethod.DUMMY_METHOD, 1);
		this.moduleClass.definePrivateMethod("method_removed", RubyMethod.DUMMY_METHOD, 1);
		this.moduleClass.definePrivateMethod("method_undefined", RubyMethod.DUMMY_METHOD, 1);
		
		this.kernelModule.defineMethod("nil?", RubyMethod.FALSE_METHOD, 0);
		
		
		this.kernelModule.defineMethod("==", KernelMethod.objectEqual, 1);
		this.kernelModule.defineMethod("equal?", KernelMethod.objectEqual, 1);
		this.kernelModule.defineMethod("===", KernelMethod.equal, 1);
		//kernelModule.defineMethod("=~", new ObjectPatternMatch(), 1);
		
		this.kernelModule.defineMethod("eql?", KernelMethod.objectEqual, 1);
		//this.rbKernelModule.defineMethod("id", new ObjIdObsoleteMethod(), 0);
		//this.rbKernelModule.defineMethod("type", new ObjTypeMethod(), 0);
	    this.kernelModule.defineMethod("class", KernelMethod.objectClass, 0);
		
		//rb_define_method(rb_mKernel, "clone", rb_obj_clone, 0);
	    //rb_define_method(rb_mKernel, "dup", rb_obj_dup, 0);
	    //rb_define_method(rb_mKernel, "initialize_copy", rb_obj_init_copy, 1);
		
		/*
		rb_define_method(rb_mKernel, "taint", rb_obj_taint, 0);
	    rb_define_method(rb_mKernel, "tainted?", rb_obj_tainted, 0);
	    rb_define_method(rb_mKernel, "untaint", rb_obj_untaint, 0);
	    rb_define_method(rb_mKernel, "freeze", rb_obj_freeze, 0);
	    rb_define_method(rb_mKernel, "frozen?", rb_obj_frozen_p, 0);

	    rb_define_method(rb_mKernel, "to_a", rb_any_to_a, 0); // to be removed
	    */
	    this.kernelModule.defineMethod("to_s", KernelMethod.anyToS, 0);
	    this.kernelModule.defineMethod("inspect", KernelMethod.objectInspect, 0);
	    this.kernelModule.defineMethod("methods", KernelMethod.methods, -1);
	    /*
	    rb_define_method(rb_mKernel, "singleton_methods", 
			     rb_obj_singleton_methods, -1); // in class.c 
	    rb_define_method(rb_mKernel, "protected_methods", 
			     rb_obj_protected_methods, -1);
	    rb_define_method(rb_mKernel, "private_methods", rb_obj_private_methods, -1);
	    rb_define_method(rb_mKernel, "public_methods", rb_obj_public_methods, -1);
	    rb_define_method(rb_mKernel, "instance_variables", 
			     rb_obj_instance_variables, 0); // in variable.c
	    rb_define_method(rb_mKernel, "instance_variable_get", rb_obj_ivar_get, 1);
	    rb_define_method(rb_mKernel, "instance_variable_set", rb_obj_ivar_set, 2);
	    rb_define_private_method(rb_mKernel, "remove_instance_variable",
				     rb_obj_remove_instance_variable, 1); // in variable.c
		*/

	    this.kernelModule.defineMethod("instance_of?", KernelMethod.isInstanceOf, 1);
	    this.kernelModule.defineMethod("kind_of?", KernelMethod.isKindOf, 1);
	    this.kernelModule.defineMethod("is_a?", KernelMethod.isKindOf, 1);
	    
	    /*
	    rb_define_private_method(rb_mKernel, "singleton_method_added", rb_obj_dummy, 1);
	    rb_define_private_method(rb_mKernel, "singleton_method_removed", rb_obj_dummy, 1);
	    rb_define_private_method(rb_mKernel, "singleton_method_undefined", rb_obj_dummy, 1);

	    rb_define_global_function("sprintf", rb_f_sprintf, -1); // in sprintf.c
	    rb_define_global_function("format", rb_f_sprintf, -1);  // in sprintf.c
	    rb_define_global_function("Integer", rb_f_integer, 1);
	    rb_define_global_function("Float", rb_f_float, 1);

	    rb_define_global_function("String", rb_f_string, 1);
	    rb_define_global_function("Array", rb_f_array, 1);

	    rb_define_method(rb_cModule, "freeze", rb_mod_freeze, 0);
	    rb_define_method(rb_cModule, "===", rb_mod_eqq, 1);
	    */
	    this.moduleClass.defineMethod("==", KernelMethod.objectEqual, 1);
	    /*
	    rb_define_method(rb_cModule, "<=>",  rb_mod_cmp, 1);
	    rb_define_method(rb_cModule, "<",  rb_mod_lt, 1);
	    rb_define_method(rb_cModule, "<=", rb_class_inherited_p, 1);
	    rb_define_method(rb_cModule, ">",  rb_mod_gt, 1);
	    rb_define_method(rb_cModule, ">=", rb_mod_ge, 1);
	    rb_define_method(rb_cModule, "initialize_copy", rb_mod_init_copy, 1); // in class.c
	    rb_define_method(rb_cModule, "to_s", rb_mod_to_s, 0);
	    rb_define_method(rb_cModule, "included_modules", 
			     rb_mod_included_modules, 0); // in class.c
	    rb_define_method(rb_cModule, "include?", rb_mod_include_p, 1); // in class.c
	    rb_define_method(rb_cModule, "name", rb_mod_name, 0);  // in variable.c
	    rb_define_method(rb_cModule, "ancestors", rb_mod_ancestors, 0); // in class.c

	    rb_define_private_method(rb_cModule, "attr", rb_mod_attr, -1);
	    rb_define_private_method(rb_cModule, "attr_reader", rb_mod_attr_reader, -1);
	    rb_define_private_method(rb_cModule, "attr_writer", rb_mod_attr_writer, -1);
	    rb_define_private_method(rb_cModule, "attr_accessor", rb_mod_attr_accessor, -1);

	    rb_define_alloc_func(rb_cModule, rb_module_s_alloc);
	    rb_define_method(rb_cModule, "initialize", rb_mod_initialize, 0);
	    rb_define_method(rb_cModule, "instance_methods", 
			     rb_class_instance_methods, -1);           // in class.c
	    rb_define_method(rb_cModule, "public_instance_methods", 
			     rb_class_public_instance_methods, -1);    // in class.c
	    rb_define_method(rb_cModule, "protected_instance_methods", 
			     rb_class_protected_instance_methods, -1); // in class.c
	    rb_define_method(rb_cModule, "private_instance_methods", 
			     rb_class_private_instance_methods, -1);   // in class.c

	    rb_define_method(rb_cModule, "constants", rb_mod_constants, 0); // in variable.c
	    rb_define_method(rb_cModule, "const_get", rb_mod_const_get, 1);
	    rb_define_method(rb_cModule, "const_set", rb_mod_const_set, 2);
	    rb_define_method(rb_cModule, "const_defined?", rb_mod_const_defined, 1);
	    rb_define_private_method(rb_cModule, "remove_const", 
				     rb_mod_remove_const, 1); // in variable.c
	    rb_define_method(rb_cModule, "const_missing", 
			     rb_mod_const_missing, 1); // in variable.c
	    rb_define_method(rb_cModule, "class_variables", 
			     rb_mod_class_variables, 0); // in variable.c
	    rb_define_private_method(rb_cModule, "remove_class_variable", 
				     rb_mod_remove_cvar, 1); // in variable.c
	    rb_define_private_method(rb_cModule, "class_variable_get", rb_mod_cvar_get, 1);
	    rb_define_private_method(rb_cModule, "class_variable_set", rb_mod_cvar_set, 2);

	    rb_define_method(rb_cClass, "allocate", rb_obj_alloc, 0);
	    */
		
		this.classClass.defineMethod("new", ClassMethod.newInstance, -1);
	    
	    /*
	    rb_define_method(rb_cClass, "initialize", rb_class_initialize, -1);
	    rb_define_method(rb_cClass, "initialize_copy", rb_class_init_copy, 1); // in class.c
	    rb_define_method(rb_cClass, "superclass", rb_class_superclass, 0);
	    rb_define_alloc_func(rb_cClass, rb_class_s_alloc);
	    rb_undef_method(rb_cClass, "extend_object");
	    rb_undef_method(rb_cClass, "append_features");

	    rb_cData = rb_define_class("Data", rb_cObject);
	    rb_undef_alloc_func(rb_cData);
	    */

	    
	    /*
	    id_eq = rb_intern("==");
	    id_eql = rb_intern("eql?");
	    id_inspect = rb_intern("inspect");
	    id_init_copy = rb_intern("initialize_copy");
	    */
	}
	
	// Class API
	public RubyClass defineClass(String name, RubyClass superclass) {
		RubyID id = StringMap.intern(name);		
		
		if (this.objectClass.isDefinedConst(id)) {
			RubyValue klassObj = this.objectClass.getConst(id);
			try {
				return (RubyClass)klassObj;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s is not a class", name);
			}
		}
		
		if (superclass == null) {
			RubyAPI.warn("no super class for `%s', Object assumed", name);
		}
		
		RubyClass klass = defineIDClass(id, superclass);
		klass.setName(id);
		
		// FIXME: insert class to class table
		
		this.objectClass.setConst(id, klass);
		
		// FIXME: set inherited relation
		
		return klass;
	}
	
	public RubyClass defineClassUnder(RubyClassModuleBase outter, String name, RubyClass superclass) {
		RubyID id = StringMap.intern(name);
		if (outter.isDefinedConst(id)) {
			RubyValue value = outter.getConst(id);
			try {
				RubyClass klass = (RubyClass)value;
				if (klass.getSuper().realClass() != superclass) {
					RubyInternalUtil.nameError(id, "%s is already defined", name);
				}
				
				return klass;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s is not a class", name);
			}
		}
		
		if (superclass == null) {
			// FIXME: warn
		}
		
		RubyClass klass = this.defineIDClass(id, superclass);
		klass.setClasspath(outter, name);
		outter.setConst(id, klass);
		// FIXME: inherited
		
		return klass;
	}
	
	// Moudle API
	public RubyModule defineModule(String name) {
		RubyID id = StringMap.intern(name);	
		
		if (this.objectClass.isDefinedConst(id)) {			
			RubyValue moduleObj = this.objectClass.getConst(id);
			
			// FIXME: Catch type cast exception			
			return (RubyModule)moduleObj;	
		}
		
		RubyModule module = defineIDModule(id);
		
		// FIXME: insert module to class table
		
		this.objectClass.setConst(id, module);
		
		return module;
	}
	
	public RubyModule defineModuleUnder(RubyClassModuleBase outter, String name) {
		RubyID id = StringMap.intern(name);
		if (outter.isDefinedConst(id)) {
			RubyValue value = outter.getConst(id);
			try {
				RubyModule module = (RubyModule)value;				
				return module;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s::%s is not a module", outter.getName(), value.getRubyClassName());
			}			
		}
		
		RubyModule module = defineIDModule(id);
		outter.setConst(id, module);
		module.setClasspath(outter, name);
		
		return module;
	}
	
	private RubyClass defineBootClass(String name, RubyClass superclass) {
		RubyClass obj = createBootClass(superclass);
		
		RubyID id = StringMap.intern(name);
		obj.setName(id);
		
		//FIXME: insert class to class table
		
		// set class as const
		RubyClass constObj = (this.objectClass != null) ? this.objectClass : obj;
		
		constObj.setConst(id, obj);
		
		return obj;
	}
	
	private RubyClass createBootClass(RubyClass superclass) {
		RubyClass klass = new RubyClass();	
		klass.setRubyClass(this.classClass);		
		klass.setSuper(superclass);
		
		// FIXME: set iv table and method table
		
		return klass;
	}
	
	RubyClass createMetaClass(RubyBasic obj, RubyClass superclass) {
		RubyClass klass = createBootClass(superclass);
		klass.setSingleton();
		obj.setRubyClass(klass);
		klass.attachSingletonClass(obj);		
		
		return klass;
	}
	
	private RubyClass defineIDClass(RubyID id, RubyClass superclass) {
		if (superclass == null ) {
			superclass = this.objectClass;
		}
		
		RubyClass klass = createClass(superclass);
		createMetaClass(klass, ((RubyBasic)superclass).getRubyClass());
		
		return klass;
	}
	
	private RubyClass createClass(RubyClass superclass) {
		return createBootClass(superclass);
	}
	
	private RubyModule defineIDModule(RubyID id) {
		RubyModule module = new RubyModule();
		module.setRubyClass(this.moduleClass);
		return module;
	}
}