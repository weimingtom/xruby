package com.xruby.newruntime.lang;

public class RubyFlag {
	private static long FL_USHIFT = 11; 
	private static long FL_USER0 = (1<<(FL_USHIFT+0));
	
	public static RubyFlag FL_SINGLETON = new RubyFlag(FL_USER0);
	
	private long mask;
	
	private RubyFlag(long mask) {
		this.mask = mask;
	}
	
	public long getMask() {
		return this.mask;
	}
}