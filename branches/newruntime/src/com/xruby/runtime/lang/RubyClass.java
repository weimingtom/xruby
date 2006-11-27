package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyClass extends RubyClassModuleBase {	
	public abstract boolean isSingleton();
	
	public RubyValue newInstance() {
		return this.newInstance(RubyMethod.NULL_ARG);
	}

	public RubyValue newInstance(RubyArray args) {
		return this.callMethod("new", args);
	}
	
	public void setName(RubyID id) {
		this.setInstanceVariable("__classid__", id.toSymbol());
	}
	
	// inherited class
	public RubyValue setInheritedClass(RubyClass klass) {
		return this.callMethod("inherited", klass);
	}
	
	// method invocation	
	public RubyValue callMethod(RubyValue receiver, RubyID mid, RubyArray args, RubyBlock block) {
		return invokeMethod(receiver, mid, args, RubyMethodScope.ALL);
	}
	
	public RubyValue callPublicMethod(RubyValue receiver, RubyID mid, RubyArray args, RubyBlock block) {
		return invokeMethod(receiver, mid, args, RubyMethodScope.ALL);
	}
	
	public RubyValue callSuperMethod(RubyValue receiver, RubyID mid, RubyArray args, RubyBlock block) {
		RubyClass base = this.getSuper();
		return base.invokeMethod(receiver, mid, args, RubyMethodScope.SUPER);
	}

	private RubyValue invokeMethod(RubyValue receiver, RubyID mid, RubyArray args, RubyMethodScope scope) {
		RubyMethodWrapper wrapper = this.findMethod(mid);
		if (wrapper == null) {
			return this.methodMissing(receiver, mid);
		}
		
		switch (scope) {
		case ALL:
			break;
		case PUBLIC:
			if (wrapper.getAttr() != RubyMethodAttr.PUBLIC) {
				return this.methodMissing(receiver, mid);
			}
		case PROTECTED:
			break;
		case PRIVATE:
			break;
		case SUPER:
			break;
		}
		
		int argc = wrapper.getArgc();
		if (argc >= 0 && args != null && args.size() != argc) {
			RubyAPI.raise(RubyRuntime.argumentError, "wrong number of arguments (%d for %d)", args.size(), argc);
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
			RubyAPI.raise(RubyRuntime.typeError, "allocator undefined for %s", obj.getRubyClass().getName());
		}
		
		// FIXME: invoke method missing
		
		RubyAPI.raise(RubyRuntime.noMethodError, "undefined method `%s' for %s", StringMap.id2name(id), obj.getRubyClass().getName());
		
		// unable reach here
		return null;
	}
}
