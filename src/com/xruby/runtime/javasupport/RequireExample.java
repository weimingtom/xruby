/** 
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.javasupport;

import com.xruby.compiler.RubyCompiler;
import com.xruby.compiler.codegen.CompilationResults;
import com.xruby.runtime.lang.*;
import java.io.StringReader;

/**
 *
 */
public class RequireExample {
	public static void main(String[] args) throws Exception {

        String program_text = "" +
                "require_java 'org.beanworms.test.Talker'\n" +
                "require_java 'java.util.Random'\n" +
                "require_java 'java.util.ArrayList'\n" +
                "\n" +
                "t = Talker.new\n" +
                "t.talk \"XRuby\"\n" +
                "t.talk \"Mr.\", \"XRuby\"" + "\n" +
                "t.talk \"XRuby\"\n" +
                "r = Random.new 259" + "\n" +
                "puts r.nextInt\n" +
                "puts r.nextInt(2)\n" +
                "array = ArrayList.new\n" +
                "array.add 1\n" +
                "array.add 2\n" +
                "array.add 3\n" +
                "for i in 1 ... 3\n" +
                "    puts array.get(i)\n" +
                "end";

        // TODO: Is it necessary to make java's container classes support each method?


        RubyCompiler compiler = new RubyCompiler(null, false);
		CompilationResults codes = compiler.compile(new StringReader(program_text));
		RubyProgram p = (RubyProgram)codes.getRubyProgram();

		RubyRuntime.init(args);
		p.run();
		RubyRuntime.fini();
	}
}


