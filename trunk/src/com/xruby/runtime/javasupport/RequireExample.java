package com.xruby.runtime.javasupport;

import com.xruby.compiler.RubyCompiler;
import com.xruby.compiler.codegen.CompilationResults;
import com.xruby.runtime.lang.RubyProgram;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.AtExitBlocks;

import java.io.StringReader;

/**
 *
 */
public class RequireExample {
	public static void main(String[] args) throws Exception {

        String program_text = "" +
                "require_java 'org.beanworms.test.Talker'\n" +
                "require_java 'java.util.Random'\n" +
                "\n" +
                "t = Talker.new\n" +
                "t.talk \"XRuby\"\n" +
                "t.talk \"Mr.\", \"XRuby\"" + "\n" +
                "r = Random.new 259" + "\n" +
                "puts r.nextInt";

		RubyCompiler compiler = new RubyCompiler();
		CompilationResults codes = compiler.compile(new StringReader(program_text));
		RubyProgram p = (RubyProgram)codes.getRubyProgram();

		RubyRuntime.initBuiltin(args);
		p.run();
		AtExitBlocks.invokeAll();
	}
}


