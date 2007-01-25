/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby;

import java.io.*;
import com.xruby.compiler.*;
import com.xruby.compiler.codegen.*;
import com.xruby.runtime.lang.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		CommandLineOptions options = new CommandLineOptions(args);
		if (options.isHelp()) {
			help();
			return;
		}
		
		if (options.isEvalOneLine()) {
			//eval string
			RubyCompiler compiler = new RubyCompiler(null, options.isStrip());
			CompilationResults results = compiler.compile(new StringReader(options.getEvalScript()));
			run(results, null);
		} else if (options.getFilename() == null) {
			//eval STDIN 
			CompilationResults results = compile(null, options.isStrip(), options.isVerbose());
			run(results, null);
		} else if (options.isCompileOnly()){
			//compile and just save the result
			String filename = options.getFilename();
			CompilationResults results = compile(filename, options.isStrip(), options.isVerbose());
			results.save(filename);
		} else {
			//eval file
			String filename = options.getFilename();
			CompilationResults results = compile(filename, options.isStrip(), options.isVerbose());
			options.parseOptionsFromFile(filename);
			GlobalVariables.setProgramName(filename);
			GlobalVariables.importValuesFromCommandLine(options.getVars());
			run(results, options.getArgs());
		}
	}
	
	private static void help() {
		System.out.println("Usage: xruby [-c] filename1, filename2, ...");
	}

	private static CompilationResults compile(String filename, boolean strip, boolean verbose) throws Exception {
		if (verbose) {
			System.out.println("Compilation of " + filename + " strarted");
		}
		
		RubyCompiler compiler = new RubyCompiler(null, strip);
		CompilationResults results = compiler.compile(filename);
		
		if (verbose) {
			System.out.println("Compilation of " + filename + " finished successfully");
		}
		
		return results;
	}
	
	private static void run(CompilationResults results, String[] args) throws Exception {		
		RubyProgram p = (RubyProgram)results.getRubyProgram();
		RubyRuntime.initBuiltin(args);
		p.run();
		AtExitBlocks.invokeAll();
	}

}
