/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import java.io.*;
import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.parser.RubyParser;

public class RubyCompiler {

	public static final String VERSION = "0.1.0";

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
		RubyParser parser = new RubyParser(reader);
		RubyCompilerImpl compiler = new RubyCompilerImpl(filename);
		return compiler.compile(parser.parse(filename));
	}
}
