package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyValue;

public abstract class RubyIO extends RubyBasic {
	public static RubyIO STDIN = new RubyFile(System.in, null, 0);
	public static RubyIO STDOUT = new RubyFile(null, System.out, 1);
	public static RubyIO STDERR = new RubyFile(null, System.err, 2);
	
	protected int fileno;
	
	protected RubyIO(int fileno) {
		this.fileno = fileno;
	}
	
	public int getFileno() {
		return this.fileno;
	}
	
	protected abstract int rawWrite(String text);
	
	public int write(RubyValue value) {
		if (!(value instanceof RubyString)) {
			// FIXME: converto string
		}
		
		RubyString str = (RubyString)value;
		if (str.length() == 0) {
			return 0;
		}
		
		return rawWrite(str.getString());
	}
}
