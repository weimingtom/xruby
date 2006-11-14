/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby;

import com.xruby.compiler.*;
import com.xruby.compiler.codegen.*;
import com.xruby.runtime.lang.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("XRuby v" + RubyCompiler.VERSION + ". Copyright 2005-2006 Xue Yong Zhi");

		CommandLineOptions options = new CommandLineOptions(args);
		if (options.isHelp()) {
			help();
			return;
		}
		
		if (options.getFiles().size() == 0) {
			compile(null, options.isCompileOnly(), null);
		} else {
			if (options.isCompileOnly()){
				for (String filename : options.getFiles()) {
					compile(filename, options.isCompileOnly(), null);
				}
			}else{
				String filename = args[0];
				String[] newArgs = new String[args.length - 1];
				for(int i=1; i<args.length; ++i){
					newArgs[i - 1] = args[i];
				}
				compile(filename, false, newArgs);
			}
		}
	}

	private static void help() {
		System.out.println("Usage: xruby [-c] filename1, filename2, ...");
	}

	private static void compile(String filename, boolean compileOnly, String[] args) {

		try {
			System.out.println("Compilation of " + filename + " strarted");

			RubyCompiler compiler = new RubyCompiler();
			CompilationResults results = compiler.compile(filename);

			System.out.println("Compilation of " + filename + " finished successfully");

			if (compileOnly) {
				results.save(filename);
			} else {
				System.out.println("Executing " + filename + "...");
				RubyProgram p = (RubyProgram)results.getRubyProgram();
				RubyRuntime.initBuiltin(args);
				p.run();
				AtExitBlocks.invokeAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
