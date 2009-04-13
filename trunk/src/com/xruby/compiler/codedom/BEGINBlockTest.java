/**
 * Copyright 2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class BEGINBlockTest extends TestingAstTestCase {
    public void test_BEGIN_END() {
        String program_text = "2;END{3};BEGIN {1}";

        String expected_result =
"1\n;\n" +
"2\n;\n" +
"3\n" +
"EOF";
        assertAstOutput(program_text, expected_result);
    }
}
