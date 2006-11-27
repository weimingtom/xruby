package com.xruby.runtime.value;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import com.xruby.runtime.lang.RubyRuntime;

public class RubyFile extends RubyIO {
	private static int fileno = 3;
	
	private InputStream is;
	private PrintStream os;	
	
	public RubyFile() {
		super(fileno++);
		this.setRubyClass(RubyRuntime.fileClass);
	}
	
	public RubyFile(InputStream is, OutputStream os, int fileno) {
		super(fileno);
		this.is = is;
		if (os != null) {
			if (os instanceof PrintStream) {
				this.os = (PrintStream)os;
			} else {
				this.os = new PrintStream(os);
			}
		}
		
		this.setRubyClass(RubyRuntime.fileClass);
	}

	protected int rawWrite(String text) {
		// FIXME: check writable
		
		this.os.print(text);
		return text.length();
	}

	protected void flush() {
		this.os.flush();
	}
}
