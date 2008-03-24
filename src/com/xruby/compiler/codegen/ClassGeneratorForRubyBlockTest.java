/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the BSD License
 */

package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class ClassGeneratorForRubyBlockTest extends TestCase {
    public void test_buildContructorSignature() {
        assertEquals("void <init> (com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.builtin.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule, com.xruby.runtime.lang.RubyMethod, boolean)", ClassGeneratorForRubyBlock.buildContructorSignature());
    }

    public void test_variableAssignment() {
        /*
         The same call sequence as compiling the following ruby program:

         first = 1;
         other = 2;
         f { first = 3; second = 4}
         */
        ClassGeneratorForRubyProgram p = new ClassGeneratorForRubyProgram("test", "", null, true, false);
        p.storeVariable("first");
        p.storeVariable("other");

        ClassGeneratorForRubyBlock cg = new ClassGeneratorForRubyBlock(
                "BLOCK$0", //name,
                "", // File Name
                0, //argc,
                false, //has_asterisk_parameter,
                0, //default_argc,
                p, //owner,
                false, //is_for_in_expression,
                false,
                null //binding
                );

        cg.loadVariable("first");
        String[] fields = cg.getAssignedFields();
        assertEquals(0, fields.length);

        cg.storeVariable("first");
        fields = cg.getAssignedFields();
        assertEquals(1, fields.length);
        assertEquals("first", fields[0]);

        cg.storeVariable("second");
        fields = cg.getAssignedFields();
        assertEquals(1, fields.length);
        assertEquals("first", fields[0]);
    }

    public void test_parameterAssignment() {
        /*
         The same call sequence as compiling the following ruby program:

         x = 1
         1.times {|x|}
         */
        ClassGeneratorForRubyProgram p = new ClassGeneratorForRubyProgram("test", "", null, true, false);
        p.storeVariable("x");

        ClassGeneratorForRubyBlock cg = new ClassGeneratorForRubyBlock(
                "BLOCK$0", //name,
                "",
                1, //argc,
                false, //has_asterisk_parameter,
                0, //default_argc,
                p, //owner,
                false, //is_for_in_expression,
                false,// has_extra_comma
                null //binding
                );

        //the compiler will generate this call automaticall to assinment block parameter
        cg.storeVariable("x");

        String[] fields = cg.getAssignedFields();
        assertEquals(1, fields.length);
        assertEquals("x", fields[0]);
    }

    public void test_parameterNoAssignment() {
        /*
         The same call sequence as compiling the following ruby program:

         1.times {|x|}
         */
        ClassGeneratorForRubyProgram p = new ClassGeneratorForRubyProgram("test", "", null, true, false);

        ClassGeneratorForRubyBlock cg = new ClassGeneratorForRubyBlock(
                "BLOCK$0", //name,
                "",
                1, //argc,
                false, //has_asterisk_parameter,
                0, //default_argc,
                p, //owner,
                false, //is_for_in_expression,
                false, // has_extra_comma
                null //binding
                );

        //the compiler will generate this call automaticall to assinment block parameter
        cg.storeVariable("x");

        String[] fields = cg.getAssignedFields();
        assertEquals(0, fields.length);
    }

    public void test_blockInBlock() {
        /*
         The same call sequence as compiling the following ruby program:

         1.times {|var| 1.times {|var|}}
         */
        ClassGeneratorForRubyProgram p = new ClassGeneratorForRubyProgram("test", "", null, true, false);

        ClassGeneratorForRubyBlock cg1 = new ClassGeneratorForRubyBlock(
                "BLOCK$0", //name,
                "",
                1, //argc,
                false, //has_asterisk_parameter,
                0, //default_argc,
                p, //owner,
                false, //is_for_in_expression,
                false, // has_extra_comma
                null //binding
                );

        //the compiler will generate this call automaticall to assinment block parameter
        cg1.storeVariable("var");

        ClassGeneratorForRubyBlock cg2 = new ClassGeneratorForRubyBlock(
                "BLOCK$1", //name,
                "",
                1, //argc,
                false, //has_asterisk_parameter,
                0, //default_argc,
                cg1, //owner,
                false, //is_for_in_expression,
                false, // has_extra_comma
                null //binding
                );

        //the compiler will generate this call automaticall to assinment block parameter
        cg2.storeVariable("var");

        String[] fields = cg2.getAssignedFields();
        assertEquals(1, fields.length);
        assertEquals("var", fields[0]);

        fields = cg1.getAssignedFields();
        assertEquals(0, fields.length);
    }
}
