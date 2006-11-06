package com.xruby.newruntime.value;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import com.xruby.newruntime.lang.RubyRuntime;

public class RubyFile extends RubyIO {
	private static int fileno = 3;
	
	private InputStream is;
	private PrintStream os;
	
	
	public RubyFile() {
		super(fileno++);
		this.setRubyClass(RubyRuntime.fileClass);
	}
	
	RubyFile(InputStream is, OutputStream os, int fileno) {
		super(fileno);
		this.is = is;
		if (os != null) {
			this.os = new PrintStream(os);
		}
		
		this.setRubyClass(RubyRuntime.fileClass);
	}

	protected int rawWrite(String text) {
		// FIXME: check writable
		
		this.os.print(text);
		return text.length();
	}
}
