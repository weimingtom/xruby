/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.compiler.codedom;

public class WhileExpressionTest extends TestingAstTestCase {
    public void test_while() {
        String program_text = "while true\n true end";

        String expected_result =
            "while condition:false\n" +
            "end while condition\n" +
            "true\n" +
            "end while\n" +
            "EOF";
        assertAstOutput(program_text, expected_result);
    }

    public void test_do_while() {
        String program_text = "begin; true; end while false";

        String expected_result =
            "while condition:true\n" +
            "false\n" +
            "end while condition\n" +
            "true\n" +
            "end while\n" +
            "EOF";
        assertAstOutput(program_text, expected_result);
    }

    public void test_do_while2() {
        String program_text = "true while false";

        String expected_result =
            "EOF";
        assertAstOutput(program_text, expected_result);
    }

    public void test_optimazation() {
        String program_text = "while false\n true end";

        String expected_result =
"EOF";
        assertAstOutput(program_text, expected_result);
    }

    public void test_while_more() {
        String program_text =
                "a = 2\n" +
                "while a > 1\n" +
                "true\n" +
                "end";

        String expected_result =
            "2\n" +
            "a =\n" +
            ";\n" +
            "while condition:false\n" +
            "a\n" +
            "1\n" +
            ">\n" +
            "end while condition\n" +
            "true\n" +
            "end while\n" +
            "EOF";
        assertAstOutput(program_text, expected_result);
    }

}
