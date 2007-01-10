/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import java.io.*;
import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.compiler.parser.RubyParser;
import com.xruby.compiler.codegen.*;
import com.xruby.runtime.lang.*;

public class RubyCompiler {

	public static final String VERSION = "0.1.0";

	private RubyBinding binding_;

	public RubyCompiler() {
		binding_ = null;
	}

	public RubyCompiler(RubyBinding binding) {
		binding_ = binding;
	}

	public CompilationResults compile(String filename) throws FileNotFoundException,
		RecognitionException, TokenStreamException, CompilerException {
		Reader reader;
		if (null != filename) {
			reader = new FileReader(new File(filename));
		} else {
			reader = new InputStreamReader(System.in);
		}
		
		return compile(filename, new BufferedReader(reader));
	}
	
	public CompilationResults compile(Reader reader)
		throws RecognitionException, TokenStreamException,
		CompilerException {
		return compile(null, reader);
	}

	public CompilationResults compile(String filename, Reader reader)
		throws RecognitionException, TokenStreamException,
		CompilerException {
		String [] pre_defined = (null == binding_) ? null : binding_.getVariableNames().toArray(new String[] {});
		RubyParser parser = new RubyParser(reader, pre_defined);
		RubyCompilerImpl compiler = new RubyCompilerImpl(filename);
		return compiler.compile(parser.parse(filename), binding_);
	}
}
