package com.xruby.newruntime.lang;

import java.util.HashMap;
import java.util.Map;

import com.xruby.newruntime.value.RubyArray;
import com.xruby.newruntime.value.RubyString;

public abstract class RubyClassModuleBase extends RubyIvBase {
	private static MethodCache cache = new MethodCache();
	
	protected RubyClass superclass;	
	protected Map<RubyID, RubyMethodWrapper> methodTable;
	
	public RubyClassModuleBase() {
		this.methodTable = new HashMap<RubyID, RubyMethodWrapper>();
	}
	
	// super
	public void setSuper(RubyClass superclass) {
		this.superclass = superclass;		
	}
	
	public RubyClass getSuper() {
		return this.superclass;
	}
	
	// method
	public void defineAllocMethod(RubyMethod method) {
		RubyClass metaClass = RubyUtil.classof(this);
		metaClass.addMethod(RubyID.ID_ALLOCATOR, method, -1, RubyMethodAttr.PRIVATE);
	}
	
	public void defineMethod(String name, RubyMethod method, int argc) {
		RubyID id = StringMap.intern(name);
		this.addMethod(id, method, argc, RubyMethodAttr.PUBLIC);
	}	
	
	public void undefAllocMethod() {
		RubyClass metaClass = RubyUtil.classof(this);
		metaClass.addMethod(RubyID.ID_ALLOCATOR, null, 0, RubyMethodAttr.PRIVATE);
	}
	
	public void undefMethod(String name) {
		// FIXME: check existence
		RubyID id = StringMap.intern(name);
		this.addMethod(id, null, 0, RubyMethodAttr.UNDEF);
	}
	
	public void aliasMethod(String newName, String oldName) {
		RubyID newId = StringMap.intern(newName);
		RubyID oldId = StringMap.intern(oldName);
		this.aliasMethod(newId, oldId);
	}
	
	// package access
	void definePrivateMethod(String name, RubyMethod method, int argc) {
		RubyID id = StringMap.intern(name);
		this.addMethod(id, method, argc, RubyMethodAttr.PRIVATE);
	}
	
	public RubyArray instanceMethod(boolean recursion) {
		return this.methodList(recursion, defaultFilter);
	}
	
	private RubyArray methodList(boolean recursion, MethodFilter filter) {
		RubyArray result = new RubyArray();
		
		RubyClassModuleBase base = (RubyClassModuleBase)this;
		for (; base != null; base = base.superclass) {
			for (Map.Entry<RubyID, RubyMethodWrapper> entry :base.methodTable.entrySet()) {
				RubyMethodWrapper wrapper = entry.getValue();
				RubyID id = entry.getKey();
				
				if (id != RubyID.ID_ALLOCATOR && wrapper != null && filter.accept(id, wrapper)) {
					String methodName = StringMap.id2name(id);
					result.add(RubyString.newString(methodName));
				}
			}
			
			if (base instanceof RubyIncludeClass || base.isSingleton()) {
				continue;
			}
			
			if (!recursion) {
				break;
			}
		}
		
		return result;
	}	
	
	protected void addMethod(RubyID id, RubyMethod method, int argc, RubyMethodAttr attr) {	
		RubyMethodWrapper wrapper = new RubyMethodWrapper(method, argc, attr);
		this.methodTable.put(id, wrapper);
	}
	
	private void aliasMethod(RubyID newId, RubyID oldId) {
		RubyMethodWrapper method = this.methodTable.get(oldId);
		if (method == null) {
			// FIXME: throw exception
		}
		
		this.methodTable.put(newId, method);
	}
	
	// FIXME: move to class?
	RubyValue callMethod(RubyValue receiver, RubyID mid, RubyArray args, RubyBlock block) {
		RubyMethodWrapper wrapper = this.findMethod(mid);
		if (wrapper == null) {
			return this.methodMissing(receiver, mid);
		}
		
		int argc = wrapper.getArgc();
		if (argc >= 0 && args != null && args.length() != argc) {
			RubyRuntime.raise(RubyRuntime.argumentError, "wrong number of arguments (%d for %d)", args.length(), argc);
		}
		
		RubyMethod method = wrapper.getMethod();
		if (method == null) {
			return this.methodMissing(receiver, mid);
		}
		
		return method.invoke(receiver, args);
	}
	
	private RubyMethodWrapper findMethod(RubyID mid) {
		// find method in cache
		MethodCache.CacheEntry entry = cache.getMethod(this, mid);
		if (entry != null && entry.klass == this && entry.mid == mid) {
			if (entry.method == null) {
				return null;
			} else {
				return entry.method;
			}
		}
		
		RubyMethodWrapper wrapper = searchMethod(mid);
		
		// put method in cache
		if (entry == null) {
			entry = new MethodCache.CacheEntry();
		}
		
		entry.klass = this;
		entry.mid = mid;
		entry.method = wrapper;
	
		return wrapper;		
	}

	private RubyMethodWrapper searchMethod(RubyID mid) {
		// find method in method table
		RubyClassModuleBase klass = this;
		
		while (klass != null) {	
			RubyMethodWrapper method = klass.methodTable.get(mid);
			
			if (method != null) {
				return method;
			}
			
			klass = klass.superclass;
		} 
		
		return null;
	}
	
	private RubyValue methodMissing(RubyValue obj, RubyID id) {
		if (id == RubyID.ID_ALLOCATOR) {
			RubyRuntime.raise(RubyRuntime.typeError, "allocator undefined for %s", obj.getRubyClassName().getString());
		}
		
		// FIXME: invoke method missing
		
		RubyRuntime.raise(RubyRuntime.noMethodError, "undefined method `%s' for %s", StringMap.id2name(id), obj.getRubyClassName());
		
		// unable reach here
		return null;
	}
	
	// const
	public void defineConst(String name, RubyValue value) {
		RubyID id = StringMap.intern(name);
		// FIXME: check validity
		this.setConst(id, value);
	}
	
	public void setConst(RubyID id, RubyValue value) {
		ensureIvTableNotNull();
		
		RubyValue innerValue = this.ivTable.get(id);
		if (innerValue != null) {
			// FIXME: add handler for undef
		}
		
		this.ivTable.put(id, value);
	}
	
	public boolean isDefinedConst(RubyID id) {
		RubyClassModuleBase tempClass = this;
		
		while (tempClass != null) {
			if (this.ivTable != null && this.ivTable.containsKey(id)) {
				// FIXME: add judgement for nil && undef etc.
				
				return true;
			}
			
			// FIXME: add judegement for recursion and object
			
			tempClass = tempClass.superclass;
		}
		
		// FIXME: add judgement for retry
		
		return false;
	}
	
	public RubyValue getConst(RubyID id) {
		RubyClassModuleBase tempClass = this;
		RubyValue value;
		
		while (tempClass != null) {
			if (this.ivTable != null && ((value = this.ivTable.get(id)) != null)) {
				// FIXME: add judgement for nil && undef etc.				
				
				return value;
			}
			
			// FIXME: add judegement for recursion and object
			
			tempClass = tempClass.superclass;
		}
		
		// FIXME: add judgement for retry
		
		// FIXME: call const_missing
		return RubyConstant.QNIL;		
	}
	
	// instance variable
		
	// module
	private RubyClass newIncludeClass(RubyModule module, RubyClass superclass) {
		RubyIncludeClass klass = new RubyIncludeClass();
		klass.superclass = superclass;
		klass.ivTable = module.ivTable;
		klass.methodTable = module.methodTable;
		klass.superclass = superclass;
		return klass;
	}
	
	public void includeModule(RubyModule module) {
		if (RubyConstant.isNil(module)) {
			return;
		}
		
		RubyClassModuleBase c = this;
		
		// ignore if the module included already in superclasses
		
		// include module
		RubyClass includeClass = newIncludeClass(module, c.superclass);
		c.superclass = includeClass;
	}
	
	// instance
	public boolean isInstanceOf(RubyValue value) {
		return RubyUtil.classof(value) == this;
	}
	
	public boolean isKindOf(RubyValue value) {
		RubyClass klass = RubyUtil.classof(value);
		while (klass != null) {
			if (klass == this || klass.methodTable == this.methodTable) {
				return true;
			}
			
			klass = klass.superclass;
		}
		
		return false;
	}
	
	private static interface MethodFilter {
		boolean accept(RubyID methodNameId, RubyMethodWrapper method);
	}
	
	private static MethodFilter defaultFilter = new MethodFilter() {
		public boolean accept(RubyID methodNameId, RubyMethodWrapper method) {
			return method.getAttr() != RubyMethodAttr.PRIVATE;
		}		
	};
	
	private static MethodFilter privateFilter = new MethodFilter() {
		public boolean accept(RubyID methodNameId, RubyMethodWrapper method) {
			return method.getAttr() == RubyMethodAttr.PRIVATE;
		}		
	};
	
	private static MethodFilter protectedFilter = new MethodFilter() {
		public boolean accept(RubyID methodNameId, RubyMethodWrapper method) {
			return method.getAttr() == RubyMethodAttr.PRIVATE;
		}		
	};
	
	private static MethodFilter publicFilter = new MethodFilter() {
		public boolean accept(RubyID methodNameId, RubyMethodWrapper method) {
			return method.getAttr() == RubyMethodAttr.PRIVATE;
		}		
	};
}