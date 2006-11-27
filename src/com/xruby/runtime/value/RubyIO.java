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
	
	private static RubyID writeId = StringMap.intern("write");
	
	public int write(RubyValue value) {
		return this.rawWrite(value.toString());
	}
	
	private static String DEFAULTE_RS = "\n";
	
	public static RubyValue puts(RubyIO io, RubyArray args) {
		if (args == null || args.size() == 0) {
			io.rawWrite(DEFAULTE_RS);
			return RubyConstant.QNIL;
		}
		
		for (RubyValue value : args) {
			String line = value.toString();
			io.rawWrite(line);
			
			int len = line.length();
			if (len == 0 || line.charAt(len - 1) != '\n') {
				io.rawWrite(DEFAULTE_RS);
			}
		}
		
		return RubyConstant.QNIL;
	}
	
	public static RubyValue print(RubyIO io, RubyArray args) {
		if (args == null || args.size() == 0) {
			// FIXME:if no argument given, print `$_'
		}
		
		int len = args.size();
		for (int i = 0; i < len; i++) {
			io.write(args.get(i));
		}
		
		return RubyConstant.QNIL;
	}
	
	private static void p(RubyIO io, RubyValue arg) {
		io.rawWrite(arg.inspect());
		io.rawWrite(DEFAULTE_RS);
	}
	
	public static RubyValue p(RubyIO io, RubyArray args) {
		for (RubyValue value : args) {
			p(io, value);
		}
		
		if (io instanceof RubyFile) {
			((RubyFile)io).flush();
		}
		
		return RubyConstant.QNIL;
	}
}
