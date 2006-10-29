package com.xruby;

import com.xruby.compiler.*;
import com.xruby.compiler.codegen.*;
import com.xruby.runtime.lang.*;
import java.io.*;

//This file serves as an example of running Ruby program in Java
public class Test {

	public static void main(String[] args) throws Exception {
		RubyCompiler compiler = new RubyCompiler();
		String program_text = 
			"def fibonacci(n)\n" +
			"    if n == 1 or n == 0\n" +
			"        n\n" +
			"    else\n" +
			"        fibonacci(n - 1) + fibonacci(n - 2)\n" +
			"    end    \n" +
			"end\n" +
			"\n" +
			"pre_time = Time.new.to_f\n" +
			"puts pre_time\n" +
			"puts fibonacci(30)\n" +
			"puts Time.new.to_f\n" +
			"puts Time.new.to_f - pre_time";
		
		CompilationResults codes = compiler.compile(new StringReader(program_text));
		
		RubyRuntime.initBuiltin();
		codes.run();
	}

}
