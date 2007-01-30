/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby;

import java.io.*;
import java.nio.channels.FileChannel;
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
			if (options.getBackupExtension() != null && options.getFilename() != null) {
				copyFile(options.getFilename(), options.getFilename() + options.getBackupExtension());
			}
			RubyCompiler compiler = new RubyCompiler(null, options.isStrip());
			CompilationResults results = compiler.compile(new StringReader(options.getEvalScript()));
			if (options.isPe()) {
				redirectStdinout(options.getFilename());
			}
			
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
	
	private static void redirectStdinout(String filename) throws IOException {
		//count line number
		BufferedReader r = new BufferedReader(new FileReader(filename));
		int line = 0;
		StringBuilder sb = new StringBuilder();
		while (r.readLine()!= null) {
			++line;
			sb.append(line);
			sb.append("\n");
		}
		r.close();
		
		//redirect stdin
		InputStream s = new ByteArrayInputStream(sb.toString().getBytes());
		System.setIn(s);
		
		//redirect stdout
		//TODO how does ruby do it? only with "-i" option?
		OutputStream output = new FileOutputStream(filename);
		System.setOut(new PrintStream(output));
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

	//TODO move to a separated class
	private static void copyFile(String from, String to) {
		try {
			FileChannel srcChannel = new FileInputStream(from).getChannel();
			FileChannel dstChannel = new FileOutputStream(to).getChannel();
			
			dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
			
			srcChannel.close();
			dstChannel.close();
		} catch (IOException e) {
			throw new Error(e);
		}
	}
}
