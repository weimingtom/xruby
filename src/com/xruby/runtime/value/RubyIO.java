package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public abstract class RubyIO extends RubyBasic {	
	protected int fileno;
	
	protected RubyIO(int fileno) {
		this.fileno = fileno;
	}
	
	public int getFileno() {
		return this.fileno;
	}
	
	protected abstract int rawWrite(String text);
	
	public void print(String s) {
		//FIXME should not use stdout all the time
		System.out.print(s);
	}
}
