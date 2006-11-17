package com.xruby.runtime.lang;

class RubyMethodAttr {
	public static RubyMethodAttr PUBLIC = new RubyMethodAttr(0);
	private static RubyMethodAttr NOSUPER = new RubyMethodAttr(1);
	public static RubyMethodAttr PRIVATE = new RubyMethodAttr(2);
	public static RubyMethodAttr PROTECTED = new RubyMethodAttr(4);
	public static RubyMethodAttr UNDEF = NOSUPER; 
	
	private int value;
	
	private RubyMethodAttr(int value) {
		this.value = value;
	}
}

/*
enum RubyMethodAttr {
	PULBIC, NOSUPER, PRIVATE, PROTECTED, UNDEF=NOSUPER
}
*/
