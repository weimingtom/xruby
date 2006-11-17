package com.xruby.runtime.lang;

import java.util.HashMap;
import java.util.Map;

import com.xruby.runtime.value.*;

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
		RubyClass metaClass = RubyAPI.classof(this);
		metaClass.addMethod(RubyID.ID_ALLOCATOR, method, -1, RubyMethodAttr.PRIVATE);
	}
	
	public void defineMethod(String name, RubyMethod method, int argc) {
		RubyID id = StringMap.intern(name);
		this.addMethod(id, method, argc, RubyMethodAttr.PUBLIC);
	}	
	
	public void undefAllocMethod() {
		RubyClass metaClass = RubyAPI.classof(this);
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
					result.add(ObjectFactory.createString(methodName));
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
			RubyAPI.raise(RubyRuntime.argumentError, "wrong number of arguments (%d for %d)", args.length(), argc);
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
			RubyAPI.raise(RubyRuntime.typeError, "allocator undefined for %s", obj.getRubyClassName().getString());
		}
		
		// FIXME: invoke method missing
		
		RubyAPI.raise(RubyRuntime.noMethodError, "undefined method `%s' for %s", StringMap.id2name(id), obj.getRubyClassName());
		
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
		return RubyAPI.classof(value) == this;
	}
	
	public boolean isKindOf(RubyValue value) {
		RubyClass klass = RubyAPI.classof(value);
		while (klass != null) {
			if (klass == this || klass.methodTable == this.methodTable) {
				return true;
			}
			
			klass = klass.superclass;
		}
		
		return false;
	}
	
	// class path
	private static RubyID classpathID = StringMap.intern("__classpath__");
	private static RubyID tmpClasspathID = StringMap.intern("__tmp_classpath__");
	
	public RubyString getName() {
		RubyClassModuleBase realClass = this.realClass();
		return realClass.getClasspath();
	}
	
	RubyClassModuleBase realClass() {
		RubyClassModuleBase klass = this;
		
		while (klass.isSingleton() || klass instanceof RubyIncludeClass) {
			klass = klass.superclass;
		}
		
		return klass;
	}
	
	static class FindClasspathResult {
		RubyID name;
		RubyString path;
		RubyClassModuleBase track;
		FindClasspathResult prev;
	}
	
	private String getFindClasspath(RubyID id, FindClasspathResult result) {
		String path = StringMap.id2name(id);
		while (result != null) {
			if (result.track == RubyRuntime.objectClass) {
				break;
			}
			
			RubyValue classpath = result.track.getIvar(classpathID);
			if (classpath != null) {
				RubyString cpStr = (RubyString)classpath;
				return cpStr.getString() + "::" + path;
			}
			
			path = StringMap.id2name(result.name) + "::" + path;
			
			result = result.prev;
		}
		
		return path;
	}	
	
	private boolean searchClasspath(RubyID id, RubyValue value, FindClasspathResult result) {
		if (value == this) {
			String path = getFindClasspath(id, result);			
			result.path = ObjectFactory.createString(path);
			
			return true;
		}
		
		if (value instanceof RubyClass || value instanceof RubyModule) {
			RubyClassModuleBase base = (RubyClassModuleBase)value;
			if (base.ivTable == null) {
				return false;
			}
			
			FindClasspathResult arg = new FindClasspathResult();
			arg.name = id;
			arg.track = base;
			arg.prev = result;
			if (searchClasspathInTable(base.ivTable, arg)) {
				result.path = arg.path;
				return true;
			}
		}
		
		return false;
	}

	
	
	private boolean searchClasspathInTable(Map<RubyID, RubyValue> table, FindClasspathResult result) {
		FindClasspathResult arg = new FindClasspathResult();
		arg.name = null;
		arg.prev = null;
		arg.track = RubyRuntime.objectClass;
		
		for (Map.Entry<RubyID, RubyValue> e : table.entrySet()) {
			RubyID id = e.getKey();
			RubyValue value = e.getValue();
			if (searchClasspath(id, value, arg)) {
				result.path = arg.path;
				return true;
			}
		}
		
		return false;
	}
	
	private RubyString findClasspath() {
		FindClasspathResult result = new FindClasspathResult();
		
		if (RubyRuntime.objectClass.ivTable != null) {
			searchClasspathInTable(RubyRuntime.objectClass.ivTable, result);
		}
		
		if (result.path == null) {
			// FIXME:search class table
		}
		
		if (result.path != null) {
			this.setIvar(classpathID, result.path);
			this.removeIvar(tmpClasspathID);
			return result.path;
		}
		
		return null;
	}
	
	private RubyString className() {
		if (this.ivTable != null) {
			RubyValue value = this.getIvar(classpathID);			
			if (value == null) {
				RubyID classID = StringMap.intern("__classid__");
				value = this.getIvar(classID);
				if (value == null) {
					// FIXME: find class path
					return findClasspath();
				}
				
				RubyID foundClassID = ((RubySymbol)value).toID();
				value = ObjectFactory.createString(StringMap.id2name(foundClassID));
				
				this.setIvar(classpathID, value);
				this.removeIvar(classID);
			}
			
			// FIXME: class cast exception :rb_bug("class path is not set properly");			
			return (RubyString)value;
		}
		
		// FIXME: find class path
		return findClasspath();
	}
	
	void setClasspath(RubyClassModuleBase outter, String name) {
		String path;
		if (outter == RubyRuntime.objectClass) {
			path = name;
		} else {
			path = outter.getClasspath().getString() + "::" + name;
		}
		
		this.setIvar(classpathID, ObjectFactory.createString(path));		
	}
	
	RubyString getClasspath() {
		RubyString name = this.className();
		
		if (name != null) {
			return name;
		}
		
		RubyValue path = this.getIvar(tmpClasspathID);
		if (path != null && path instanceof RubyString) {
			return (RubyString)path;
		}
		
		// FIXME: look up
		
		return null;
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