package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.KernelMethod;
import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyDelegateMethod;
import com.xruby.newruntime.lang.RubyID;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubySymbol;
import com.xruby.newruntime.lang.RubyUtil;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.lang.StringMap;
import com.xruby.newruntime.value.RubyString;

public class SymbolBuilder {
	private RubyClass symbolClass;
	
	public SymbolBuilder() {
		initialize();
	}
	
	public RubyClass getArrayClass() {
		return this.symbolClass;
	}
	
	private void initialize() {
		this.symbolClass = RubyRuntime.defineClass("Symbol", RubyRuntime.objectClass);
		
		RubyUtil.classof(this.symbolClass).undefMethod("new");
		
		/*
	    rb_define_singleton_method(rb_cSymbol, "all_symbols", 
				       rb_sym_all_symbols, 0); // in parse.y
	    */
		
		this.symbolClass.defineMethod("to_i", SymbolMethod.toI, 0);
		this.symbolClass.defineMethod("to_int", SymbolMethod.toInt, 0);

	    /*
	    rb_define_method(rb_cSymbol, "inspect", sym_inspect, 0);
	    */
		
		this.symbolClass.defineMethod("to_s", SymbolMethod.toS, 0);
		this.symbolClass.defineMethod("id2name", SymbolMethod.toS, 0);
		this.symbolClass.defineMethod("to_sym", SymbolMethod.toSym, 0);
		this.symbolClass.defineMethod("===", KernelMethod.objectEqual, 1);
	}
}

class SymbolMethod {
	public static RubyMethod toI = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyID id = ((RubySymbol)receiver).toID();
			return id.toFixnum();
		}		
	};
	
	// FIXME: warning
	public static RubyMethod toInt = new RubyDelegateMethod(toI); 
	
	public static RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyID id = ((RubySymbol)receiver).toID();
			String name = StringMap.id2name(id);
			return RubyString.newString(name);
		}
	};
	
	public static RubyMethod toSym = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return receiver;
		}
	};
}
