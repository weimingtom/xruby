package com.xruby.compiler.codedom;

import com.xruby.compiler.codegen.RubyCompilerImpl;
import com.xruby.runtime.lang.RubyProgram;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class BignumNodeTest extends TestCase {
    public void test_bignum() throws Exception {
        BignumNode bignumNode = new BignumNode(null, new BigInteger("3"));
        RubyCompilerImpl rubyCompiler = new RubyCompilerImpl("abc");
        RubyProgram program = rubyCompiler.compile2(bignumNode, null).getRubyProgram();
        RubyValue result = program.invoke();
        assertEquals(ObjectFactory.createBignum("3"), result);


        //rubyCompiler.compile()
        //rubyCompiler.getCg_().getCompilationResult();
    }
}