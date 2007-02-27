/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler;

import java.io.*;
import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.compiler.parser.RubyParser;
import com.xruby.compiler.codegen.*;
import com.xruby.runtime.lang.*;

public class RubyCompiler {

	public static final String VERSION = "0.1.1";

	private RubyBinding binding_;
	private boolean strip_;

	public RubyCompiler(RubyBinding binding, boolean strip) {
		binding_ = binding;
		strip_ = strip;
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
		RubyParser parser = new RubyParser(reader, pre_defined, strip_);
		RubyCompilerImpl compiler = new RubyCompilerImpl(filename);
		return compiler.compile(parser.parse(filename), binding_);
	}
}
