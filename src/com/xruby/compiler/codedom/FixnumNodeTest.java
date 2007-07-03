package com.xruby.compiler.codedom;

import com.xruby.compiler.codegen.RubyCompilerImpl;
import com.xruby.runtime.lang.RubyProgram;
import com.xruby.runtime.lang.RubyValue;
import junit.framework.TestCase;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class FixnumNodeTest extends TestCase {
    public void test_fixnum() throws Exception {
        FixnumNode fixnumNode = new FixnumNode(3);
        RubyCompilerImpl rubyCompiler = new RubyCompilerImpl("abc");
        RubyProgram program = rubyCompiler.compile2(fixnumNode, null).getRubyProgram();
        RubyValue result = program.invoke();
        System.out.println(result);

        //rubyCompiler.compile()
        //rubyCompiler.getCg_().getCompilationResult();
    }
}
