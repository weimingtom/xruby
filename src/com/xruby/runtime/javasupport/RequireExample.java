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
                //call overloaded methods
                "puts r.nextInt\n" +
                "puts r.nextInt(3)\n" +
                //call methods inherited superclass(for example:Object)
                "puts r.toString\n" +
                
                
                //call static methods and fields
                "import 'java.lang.Math'\n"+
                "puts JMath.PI\n"+
                "puts JMath.cos(0)\n"+
                
                
                //access Java constant variables
                "import 'java.lang.System'\n"+
                "out = System::out\n"+
                "out.println('ok!')\n"+
                
                
                //escape from name collision
                "import 'java.lang.Object'\n"+
                "o = JObject.new\n" +
                "puts o.toString\n" +
                
                
                //implement a Java interface
                "require_java 'java.lang.Runnable'\n"+
                "require_java 'java.lang.Thread'\n"+
                "class MyRunnable < Runnable\n"+
                "   def run\n"+
                "       puts 'ok'\n"+
                "   end\n"+
                "end\n"+
                "r = MyRunnable.new\n"+
                "thread = JThread.new(r)\n"+
                "thread.start()\n"+

                "array = ArrayList.new\n" +
                "array.add 1\n" +
                "array.add 2\n" +
                "array.add 3\n" +
                "for i in 1 ... 3\n" +
                "    puts array.get(i)\n" +
                "end\n"+
                
                //JavaBean support
                "import 'javax.swing.JFrame'\n"+
                "f = JFrame.new('hello')\n"+
                //calls setVisible
                "f.visible= true\n"+
                //calls getTitle
                "puts f.title\n"+
                "\n";
        
        RubyCompiler compiler = new RubyCompiler(null, false);
		CompilationResults codes = compiler.compile(new StringReader(program_text));
		RubyProgram p = codes.getRubyProgram();

		RubyRuntime.init(args);
		p.invoke();
		RubyRuntime.fini();

    }
}


