/** 
 * Copyright 2006-2007 Yu Su, Yu Zhang
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
                "import 'java.util.*'\n" +
                "r = Random.new" + "\n" +
                "puts r.nextInt\n" +
                "puts r.nextInt(3)\n" +
                "array = ArrayList.new\n" +
                "array.add 1\n" +
                "array.add 2\n" +
                "array.add 3\n" +
                "for i in 1 ... 3\n" +
                "    puts array.get(i)\n" +
                "end";
        
        RubyCompiler compiler = new RubyCompiler(null, false);
		CompilationResults codes = compiler.compile(new StringReader(program_text));
		RubyProgram p = codes.getRubyProgram();

		RubyRuntime.init(args);
		p.invoke();
		RubyRuntime.fini();

    }
}


