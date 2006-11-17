package com.xruby.runtime.lang;

public class RubyMethodWrapper {
	private RubyMethod method;
	private int argc;
	private RubyMethodAttr attr;
	
	public RubyMethodWrapper(RubyMethod method, int argc, RubyMethodAttr attr) {
		this.method = method;
		this.argc = argc;
		this.attr = attr;
	}
	
	public RubyMethod getMethod() {
		return method;
	}
	
	public void setMethod(RubyMethod method) {
		this.method = method;
	}
	
	public int getArgc() {
		return argc;
	}
	
	public void setArgc(int argc) {
		this.argc = argc;
	}
	
	public RubyMethodAttr getAttr() {
		return attr;
	}
	
	public void setAttr(RubyMethodAttr attr) {
		this.attr = attr;
	}	
}
