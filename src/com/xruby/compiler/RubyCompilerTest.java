/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import com.xruby.compiler.codegen.CompilationResults;
import com.xruby.runtime.builtin.ObjectFactory;
import com.xruby.runtime.builtin.RubyFixnum;
import com.xruby.runtime.builtin.RubyIO;
import com.xruby.runtime.builtin.RubyString;
import com.xruby.runtime.lang.*;
import junit.framework.TestCase;

import java.io.*;

class CompilerTestCase extends TestCase {
    protected void compile_run_and_compare_result(String[] program_texts, int[] results) {
        assertEquals("the number of 'results' should match 'program_texts'",
                program_texts.length, results.length);

        for (int i = 0; i < program_texts.length; ++i) {
            RubyCompiler compiler = new RubyCompiler();

            try {
                CompilationResults codes = compiler.compileString(program_texts[i]);
                assertNotNull(codes);
                RubyProgram p = codes.getRubyProgram();
                RubyValue v = p.invoke();
                RubyFixnum r = (RubyFixnum)v;
                assertEquals(results[i], r.toInt());
            } catch (RubyException e) {
                assertTrue("RubyException at " + i + ": " + e.toString(), false);
            } catch (RecognitionException e) {
                assertTrue("RecognitionException at " + i + ": " + e.toString(), false);
            } catch (TokenStreamException e) {
                assertTrue("TokenStreamException at " + i + ": " + e.toString(), false);
            } catch (InstantiationException e) {
                assertTrue("InstantiationException at " + i + ": " + e.toString(), false);
            } catch (IllegalAccessException e) {
                assertTrue("IllegalAccessException at " + i + ": " + e.toString(), false);
            } catch (VerifyError e) {
                assertTrue("VerifyError at " + i + ": " + e.toString(), false);
            } /*catch (NullPointerException e) {
                assertTrue("NullPointerException at " + i + ": " + e.toString(), false);
            }*/
        }
    }

    protected void compile_run_and_compare_result(String[] program_texts, String[] results) {
        assertEquals("the number of 'results' should match 'program_texts'",
                program_texts.length, results.length);

        for (int i = 0; i < program_texts.length; ++i) {
            RubyCompiler compiler = new RubyCompiler();

            try {
                CompilationResults codes = compiler.compileString(program_texts[i]);
                assertNotNull(codes);
                RubyProgram p = codes.getRubyProgram();
                RubyValue v = p.invoke();
                RubyString r = (RubyString) v;
                assertEquals(results[i], r.toString());
            } catch (RubyException e) {
                assertTrue("RubyException at " + i + ": " + e.toString(), false);
            } catch (RecognitionException e) {
                assertTrue("RecognitionException at " + i + ": " + e.toString(), false);
            } catch (TokenStreamException e) {
                assertTrue("TokenStreamException at " + i + ": " + e.toString(), false);
            } catch (InstantiationException e) {
                assertTrue("InstantiationException at " + i + ": " + e.toString(), false);
            } catch (IllegalAccessException e) {
                assertTrue("IllegalAccessException at " + i + ": " + e.toString(), false);
            } catch (VerifyError e) {
                assertTrue("VerifyError at " + i + ": " + e.toString(), false);
            }
        }
    }

    protected void compile_run_and_compare_result(String[] program_texts, RubyValue[] results) {
        assertEquals("the number of 'results' should match 'program_texts'",
                program_texts.length, results.length);

        for (int i = 0; i < program_texts.length; ++i) {
            RubyCompiler compiler = new RubyCompiler();

            try {
                CompilationResults codes = compiler.compileString(program_texts[i]);
                assertNotNull(codes);
                RubyProgram p = codes.getRubyProgram();
                RubyValue v = p.invoke();
                assertEquals(results[i], v);
            } catch (RubyException e) {
                assertTrue("RubyException at " + i + ": " + e.toString(), false);
            } catch (RecognitionException e) {
                assertTrue("RecognitionException at " + i + ": " + e.toString(), false);
            } catch (TokenStreamException e) {
                assertTrue("TokenStreamException at " + i + ": " + e.toString(), false);
            } catch (InstantiationException e) {
                assertTrue("InstantiationException at " + i + ": " + e.toString(), false);
            } catch (IllegalAccessException e) {
                assertTrue("IllegalAccessException at " + i + ": " + e.toString(), false);
            } catch (VerifyError e) {
                assertTrue("VerifyError at " + i + ": " + e.toString(), false);
            } /*catch (NullPointerException e) {
                assertTrue("NullPointerException at " + i + ": " + e.toString(), false);
            }*/
        }
    }

    protected void compile_run_and_catch_exception(String[] program_texts, RubyException[] exceptions) {
        assertEquals("the number of 'exception' should match 'program_texts'",
                program_texts.length, exceptions.length);

        for (int i = 0; i < program_texts.length; ++i) {
            RubyCompiler compiler = new RubyCompiler();

            try {
                CompilationResults codes = compiler.compileString(program_texts[i]);
                assertNotNull(codes);
                RubyProgram p = codes.getRubyProgram();
                p.invoke();
                fail("Error at " + i + ": should throw RubyException");
            } catch (RubyException e) {
                RubyValue v1 = RubyAPI.convertRubyException2RubyValue(exceptions[i]);
                RubyValue v2 = RubyAPI.convertRubyException2RubyValue(e);
                if (v1.toString() != null) {
                    assertEquals("Exception message mismatch at " + i, v1.toString(), v2.toString());
                }
                assertEquals("Exception type mismatch at " + i, v1.getRubyClass().getName(), v2.getRubyClass().getName());
                continue;
            } catch (RecognitionException e) {
                assertTrue("RecognitionException at " + i + ": " + e.toString(), false);
            } catch (TokenStreamException e) {
                assertTrue("TokenStreamException at " + i + ": " + e.toString(), false);
            } catch (InstantiationException e) {
                assertTrue("InstantiationException at " + i + ": " + e.toString(), false);
            } catch (IllegalAccessException e) {
                assertTrue("IllegalAccessException at " + i + ": " + e.toString(), false);
            } catch (VerifyError e) {
                assertTrue("VerifyError at " + i + ": " + e.toString(), false);
            }
        }
    }

    protected void compile_run_and_compare_output(String[] program_texts, String[] outputs) {
        assertEquals("the number of 'outputs' should match 'program_texts'",
                program_texts.length, outputs.length);

        for (int i = 0; i < program_texts.length; ++i) {
            // FIXME: temp code here
            RubyClass.resetCache();

            RubyCompiler compiler = new RubyCompiler();

            try {
                CompilationResults codes = compiler.compileString(program_texts[i]);
                assertNotNull(codes);
                RubyProgram p = codes.getRubyProgram();

                ByteArrayOutputStream output = new ByteArrayOutputStream();
                PrintStream original = System.out;
                RubyRuntime.setStdout(output);

                p.invoke();

                RubyRuntime.setStdout(original);

                assertEquals("Failed at " + i, outputs[i], output.toString());
            } catch (RubyException e) {
                throw e;
                //fail("RubyException at " + i + ": " + e.toString());
            } catch (RecognitionException e) {
                fail("RecognitionException at " + i + ": " + e.toString());
            } catch (TokenStreamException e) {
                fail("TokenStreamException at " + i + ": " + e.toString());
            } catch (InstantiationException e) {
                fail("InstantiationException at " + i + ": " + e.toString());
            } catch (IllegalAccessException e) {
                fail("IllegalAccessException at " + i + ": " + e.toString());
            } catch (VerifyError e) {
                fail("VerifyError at " + i + ": " + e.toString());
            } catch (NoSuchFieldError e) {
                fail("NoSuchFieldError at " + i + ": " + e.toString());
            } /*catch (NullPointerException e) {
                assertTrue("NullPointerException at " + i + ": " + e.toString(), false);
            }*/
        }
    }

};

public class RubyCompilerTest extends CompilerTestCase {

    public void setUp() {
        RubyRuntime.init(new String[] {"my_arg"});
    }

    public void test_raise() throws RecognitionException, TokenStreamException, InstantiationException, IllegalAccessException {
        String program_texts = "raise 'test'";
        RubyCompiler compiler = new RubyCompiler();
        CompilationResults codes = compiler.compileString(program_texts);
        assertTrue(null != codes);
        RubyProgram p = codes.getRubyProgram();
        try {
            p.invoke();
        } catch (RubyException e) {
            RubyValue v = RubyAPI.convertRubyException2RubyValue(e);
            assertEquals(v.getRubyClass(), RubyRuntime.RuntimeErrorClass);
            String s = v.toString();
            assertEquals("test", s);
            return;
        }

        assertTrue("You should not reach here!", false);
    }

    public void test_simple_integer() {
        String[] program_texts = { "2", "0", "123456", "0b1100110", "0xFF",
                "070", "+9", "-100"};
        int[] results = { 2, 0, 123456, 102, 255, 56, 9, -100};

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_ascii_value() {
        String[] program_texts = { "?a", "?A", "?\\n", "?\\r", "?\\C-a", "?\\M-a", "?\\M-\\C-a"};
        int[] results = {97, 65, 10, 13, 1, 225, 129};

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_Fixnum_misc() {
        String[] program_texts = {
                "print (-7).div(4)",
                "print 4.quo(2)",

                "print 1.to_f",
                "print 3.to_f",
                //"print 1.to_f / 3"
        };

        String[] outputs = {
                "-2",
                "2.0",

                "1.0",
                "3.0",
                //"0.333333333333333"
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Numeric_Coerce() {
        String[] program_texts = {
                "class A\n"
                + "def coerce other\n"
                + "if Integer === other\n"
                + "[other, 5]\n"
                + "else\n"
                + "[Float(other), 5.0]\n"
                + "end\n"
                + "end\n"
                + "end\n"
                + "\n\n"
                + "o = A.new\n"
                + "print 1 + o\n"
                + "print 1.0 + o\n"
                + "print 5 - o\n"
                + "print 5.0 - o\n"
                + "print 1 * o\n"
                + "print 1.0 * o\n"
                + "print 1 / o\n"
                + "print 1.0 / o\n"
        };

        String[] outputs = {
                "66.000.055.000.2"
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Float_Integer() {
        String[] program_texts = {
                "print Integer('1')",
                "print Float(2)",
                "print Integer(2)",
                "print Float(4.2).to_i",
        };

        String[] outputs = {
                "1",
                "2.0",
                "2",
                "4",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Bignum() {
        String[] program_texts = {
                //TODO"print 1234567890.class",
                "print 0x123456789abcdef0",
                "print (1 << 40)",
                "print ((1 << 40) >> 30)",
                "print (0x123456789abcdef0 <=> 0x123456789abcdef0)",
                "print ((1 << 600) <=> ((1 << 600) + 1))",
                "print (0xabcdef0123456789 * 0x123456789abcdef0)"
        };

        String[] outputs = {
                //"Bignum",
                "1311768467463790320",
                "1099511627776",
                "1024",
                "0",
                "-1",
                "16239449295734013608292442272905420400"
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_BinaryOperatorExpression() {
        String[] program_texts = { "2+2", "0 + 100", "0 + 0", "654321 + 9999",
                "0xFF + 1", "3 - 5", "3 * 5 * 2", "100/2", "4%2", "7%3",
                "1 + 2 + 3 -0 + 100", "6- 5 *2 + 100 - 6", "4.div 2", };
        int[] results = { 4, 100, 0, 664320, 256, -2, 30, 50, 0, 1, 106, 90, 2};

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_BinaryOperatorExpression2() {
        String[] program_texts = {
                "print 2 > 1",
                "print 2 == 1",
                "print 1 >= 0",
                "print 1 <=> 0",
                "print 9 <=> 9",
                "print 1 <=> 2",
                "print 1 <= 2",
        };

        String[] outputs = {
                "true",
                "false",
                "true",
                "1",
                "0",
                "-1",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_simple_methodcall() {
        String[] program_texts = {
                "1.to_i",
                "0.to_int",
                "123.to_i.to_int.to_i",
                "\"500\".to_i",
        };

        int[] results = {
                1,
                0,
                123,
                500,
        };

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_double_quote_string() {
        String[] program_texts = {
                "print \"\\56\"",
                "print \"\\x63\"",
                "print \"\\142\"",
                "print \"\\142\\102\"",
        };

        String[] outputs = {
                ".",
                "c",
                "b",
                "bB",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Method_Proc_arity() {
        String[] program_texts = {
                "def f(a,b,c); end; method(:f).arity",

                "Proc.new {||}.arity",
                "Proc.new {|a|}.arity",
                "Proc.new {|a,b|}.arity",
                "Proc.new {|*a|}.arity",
                "Proc.new {|a,*b|}.arity",
        };

        int[] results = {
                3,
                0,
                1,
                2,
                -1,
                -2,
        };

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_String_index() {
        String[] program_texts = {"\"hello\".index('e')"};
        int[] results = {
                1
        };
        compile_run_and_compare_result(program_texts, results);

        program_texts = new String[]{"\"hello\".index('lo')"};
        results = new int[]{
                3
        };
        compile_run_and_compare_result(program_texts, results);

        program_texts = new String[]{"\"hello\".index('a')"};
        RubyValue[] res = {RubyConstant.QNIL};

        compile_run_and_compare_result(program_texts, res);

        program_texts = new String[]{"\"hello\".index(101)"};
        results = new int[]{1};

        compile_run_and_compare_result(program_texts, results);

        program_texts = new String[]{"\"helle\".index('e', 3)"};
        results = new int[]{4};
        compile_run_and_compare_result(program_texts, results);


        program_texts = new String[]{"\"helle\".index('e', -3)"};
        results = new int[]{4};
        compile_run_and_compare_result(program_texts, results);

        program_texts = new String[]{"\"hello\".index(/[aeiou]/, -3)"};
        res = new RubyValue[]{ObjectFactory.FIXNUM4};
        compile_run_and_compare_result(program_texts, res);

        program_texts = new String[]{"\"hll\".index(/[aeiou]/, -3)"};
        res = new RubyValue[]{RubyConstant.QNIL};
        compile_run_and_compare_result(program_texts, res);
    }

    public void test_String_succ() {
        String[] program_texts = {
                "a = 'a'; print a.succ!, a",
                "a = 'a'; print a.succ, a",
                "print ''.succ",
        };

        String[] results = {
                "bb",
                "ba",
                "",
        };
        compile_run_and_compare_output(program_texts, results);
    }

    public void test_array() {
        String[] program_texts = { "[1, 'xxx', 1.2].length", "[].length",};
        int[] results = { 3, 0,};

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_array_access() {
        String[] program_texts = {
                "[1.8, 24, 55][-1]",
                "[123][0]",
                "[1.8, 24, 35][2]",
                "a = [0, 9];a[1]",

                "a = [1,2,3]; a.[](0)",
        };
        int[] results = {
                55,
                123,
                35,
                9,

                1,
        };

        compile_run_and_compare_result(program_texts, results);
    }

    public void test_array_assignment() {
        String[] program_texts = {
                "a = [1, 2, 3];  a[0] = 9; print a[0]",
        };

        String[] outputs = {
                "9",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_array_expand() {
        String[] program_texts = {
                "a = [5,6,[1, 2]]; print a, a.length",
                "a = [5,6,*[1, 2]]; print a, a.length",
                "a = [5,6,*1]; print a, a.length ",
                "a = [5,6,*nil]; print a, a.length",
                "a = [*nil]; print a, '|', a.length, a[0].class",
                "a = [*[1, 2]]; print a, '|', a.length, a[0].class",
        };

        String[] outputs = {
                "56123",
                "56124",
                "5613",
                "563",
                "|1NilClass",
                "12|2Fixnum",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_join() {
        String[] program_texts = {
                "print [ 'a', 'b', 'c'].join",
                "print [ 'a', 'b', 'c'].join('-')",
        };

        String[] outputs = {
                "abc",
                "a-b-c",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_sort() {
        String[] program_texts = {
                "a = [ 3, 2, 1]; print a.sort!, a",
                "print [ 4, 6, 5].sort! {|x, y| x <=> y}",
                "print [ 4, 6, 5].sort! {|x, y| 0}",
                "a = [ 3, 2, 1]; print a.sort, a",
        };

        String[] outputs = {
                "123123",
                "456",
                "465",
                "123321",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_misc() {
        String[] program_texts = {
                "p [1,2,3].reject {|x| x==2}",
                "a=[]; a.insert 2, 3, 4; p a",
                "print [ 11, 22, 33, 44 ].fetch(1)",
                "a = [1, 2, 1, 3]; a.delete_if {|x| true if x == 1}; p a",
                "[1, 2, 3].reverse_each {|x| print x}",
                "print %w$a b c $[1..-1]",
                "p [1,2].clear",
                "p Array.new(3, 0)",
                "p Array.new(3)",

                "print [3, 4].first, [].first, [5, 6, 7].first(2)",
                "print [3, 4].last, [].last, [5, 6, 7].last(2)",
                "print [1, 3].at(1)",
                "a = [1, 2]; b = a.dup; b.shift; p a, b",
                "print [1, 3].delete(2)",
                "print [1, 2, 3].delete(2)",
                "a = [1, 2, 3, 2]; a.delete(2); p a",
                "p [] << 1",
                "p [] << [1, 2]",
                "p [].push(1, 2)",
                "p [2, 3].insert(0, 1)",
                "p [1, 2, 3][1..2]",
                "p [1, 2, 3][1...2]",
                "print [].empty?",
                "a = [1,2,3]; a[1,0] = [1,2,3]; print a, a.size",

                "print [ 1, 2, 3 ] * \",\"",
                "print [1, 2].hash == [1, 2].hash",
                "print [ 1, 1, 3, 5 ] & [ 1, 2, 3 ]",
                "print [ 1, 1, 3, 5 ] | [ 1, 2, 3 ]",
                "print [ 1, 1, 2, 2, 3, 3, 4, 5 ] - [ 1, 2, 4 ]",
                "a = [4,5,6]; a[1,2] = 9; print a",
                "a = [4,5,6]; a[1,0] = 9; print a",
                "a = [nil, 4,5, nil, 6]; a.compact!; print a",
                "a = [nil, 4, 4,6, nil, 6]; a.uniq!; print a",
                "a = [4,5, 6]; a.reverse!; print a",
                "a = [4,5, 6,7]; a.reverse!; print a",
        };

        String[] outputs = {
                "[1, 3]\n",
                "[nil, nil, 3, 4]\n",
                "22",
                "[2, 3]\n",
                "321",
                "bc",
                "[]\n",
                "[0, 0, 0]\n",
                "[nil, nil, nil]\n",

                "3nil56",
                "4nil67",
                "3",
                "[1, 2]\n[2]\n",
                "nil",
                "2",
                "[1, 3]\n",
                "[1]\n",
                "[[1, 2]]\n",
                "[1, 2]\n",
                "[1, 2, 3]\n",
                "[2, 3]\n",
                "[2]\n",
                "true",
                "1123236",

                "1,2,3",
                "true",
                "13",
                "1352",
                "335",
                "49",
                "4956",
                "456",
                "46",
                "654",
                "7654",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_compare() {
        String[] program_texts = {
                "print [ 4, 6, 5] <=> [ 4, 6, 5]",
                "print [ 4, 6, 5] <=> [ 4, 6]",
                "print [ 4, 6] <=> [ 4, 6, 5]",

        };

        String[] outputs = {
                "0",
                "1",
                "-1",

        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_populate() {
        String[] program_texts = {
                "a = Array[ 4, 6, 5];print a[1]",
                "a = Array.[](4, 6, 5);print a[2]",
        };

        String[] outputs = {
                "6",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_index_rindex(){
        String[] program_texts = {
                "a = [ \"a\", \"b\", \"c\" ];print a.index(\"b\") ",
                "a = [ \"a\", \"b\", \"c\" ];print a.index(\"z\") ",
                "a = [ \"a\", \"b\", \"c\" ];print a.rindex(\"a\") ",
                "a = [ \"a\", \"b\", \"c\" ];print a.index(\"c\") ",
                "a = [ \"a\", \"b\", \"c\" ];print a.rindex(\"z\") ",
        };

        String[] outputs = {
                "1",
                "nil",
                "0",
                "2",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);

    }

    public void test_UNARY_PLUS_MINUS_METHOD_NAME() {
        String[] program_texts = {
                "print 1.-@",
                "print 2.-@ {}",
                "print -3.to_s",
        };

        String[] outputs = {
                "-1",
                "-2",
                "-3",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_p() {
        String[] program_texts = {
                "p 1.234",
                "p [1, [3,4], 2]",
        };

        String[] outputs = {
                "1.234\n",
                "[1, [3, 4], 2]\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_print() {
        String[] program_texts = {
                "print \"hello, world!\"",
                "print 2*3*10",
                "print 'x', 'y', 123",

                "print",
                "$_ = 'hello';   print;    $_ = nil",
                "$, = '|';    print 1,2,3;   $, = nil",
                "$\\ = '!';    print 1,2,3;   $\\ = nil",

                "print [5,6,7]",
                "print [ nil ]",
                "print [ nil ][0];",

                "Kernel.print 123",
        };

        String[] outputs = {
                "hello, world!",
                "60",
                "xy123",

                "nil",
                "hello",
                "1|2|3",
                "123!",

                "567",
                "",
                "nil",

                "123",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_method_compile() {
        String program_texts =
            "def f\n" +
            "	print 123\n" +
            "end\n" +
            "f";
        RubyCompiler compiler = new RubyCompiler();

        try {
            CompilationResults codes = compiler.compileString(program_texts);
            assertEquals(3, codes.size());
        } catch (Exception e) {
            assertTrue("Error : " + e.toString(), false);
        }
    }

    public void test_duplicate_method_run() {
        String[] program_texts = {
                "def f\n" +
                "	print 123\n" +
                "end\n" +
                "def f\n" +
                "	print 456\n" +
                "end\n" +
                "f",
        };

        String[] outputs = {
                "456",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_method_return() {
        String[] program_texts = {
                "def f\n" +
                " 123\n" +
                "end\n" +
                "print f()",

                "def f1\n" +
                " 456\n" +
                "end\n" +
                "print f1",

                "def f2\n" +
                "	return 'xxx'\n" +
                "end\n" +
                "print f2",

                "def r; return; end; a = r(); print a",

                "def f\n" +
                " return 1, 2, 3\n" +
                "end\n" +
                "print f()",

                "def f(a); a; end; print f('yyy')",
        };

        String[] outputs = {
                "123",
                "456",
                "xxx",
                "nil",
                "123",
                "yyy",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_asterisk_parameter() {
        String[] program_texts = {
                "def f a; print 1; end; def f *a; print 2; end; f 3",

                "def a *; print 'ok'; end; a 1, 2, 3",

                "def my_print(*a)\n" +
                "	print a\n" +
                "end\n" +
                "my_print ':)', 5634 , 888",

                "def my_print(a, *b)\n" +
                "	print b, a\n" +
                "end\n" +
                "my_print ':)', 5634 , 888",

                "def my_print(*a)\n" +
                "	print a, a\n" +
                "end\n" +
                "my_print ':)', 5634 , 888",
        };

        String[] outputs = {
                "2",
                "ok",
                ":)5634888",
                "5634888:)",
                ":)5634888:)5634888",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_method_run() {
        String[] program_texts = {
                "def (1.class).fred; print 'x'; end;   Fixnum.fred ",
                "def a; 6; end; print(a)",
                "a = 5;  def a; 6; end;  print(a)",

                "def my_print(a, b, c)\n" +
                "	print c\n" +
                "	print a\n" +
                "end\n" +
                "my_print ':)', 5634 , 888",

                "def f\n" +
                "	print 123\n" +
                "end\n" +
                "f",

                "def my_print(a)\n" +
                "	print a\n" +
                "end\n" +
                "my_print ':)'",

                "def f(a); a = 1; end;  x = 100; f(x); print x",
                "def f(x); x= 5; print x; end; f(4)",
        };

        String[] outputs = {
                "x",
                "6",
                "5",
                "888:)",
                "123",
                ":)",
                "100",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Class_superclass() {
        String[] program_texts = {
                "print Class.new.superclass",
                "print String.superclass",
                "print Class.superclass",
                "print Object.superclass",
        };

        String[] outputs = {
                "Object",
                "Object",
                "Module",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_class() {
        String[] program_texts = {
                "1.times {class ClassInBlock; end};",

                "class C\n" +
                "	def f\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "end\n" +
                "C.new.f",

                "class C1\n" +
                "	def f\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "	def f\n" +
                "		print \"!!!\"\n" +
                "	end\n" +
                "end\n" +
                "C1.new.f",

                "class C2\n" +
                "	def f\n" +
                "		print \"????\"\n" +
                "	end\n" +
                "end\n" +
                "class C2\n" +
                "	def f2\n" +
                "		print \"*****\"\n" +
                "	end\n" +
                "end\n" +
                "C2.new.f2",

                "class C3\n" +
                "	def f1\n" +
                "		print \"????\"\n" +
                "	end\n" +
                "end\n" +
                "class C3\n" +
                "	def f2\n" +
                "		print \"*****\"\n" +
                "	end\n" +
                "end\n" +
                "C3.new.f1",
        };

        String[] outputs = {
                "",
                "~~~~",
                "!!!",
                "*****",
                "????",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_inheritence() {
        String[] program_texts = {
            "class B\n" +
            "	def say\n" +
            "		print 7654\n" +
            "	end\n" +
            "end\n" +
            "\n" +
            "class S < B\n" +
            "end\n" +
            "\n" +
            "S.new.say",

            "def B\n" +
            "	print 999\n" +
            "end\n" +
            "\n" +
            "class B\n" +
            "	def hello\n" +
            "		print 7654\n" +
            "	end\n" +
            "end\n" +
            "\n" +
            "class S < B\n" +
            "end\n" +
            "\n" +
            "S.new.hello\n" +
            "B()",

            "def B\n" +
            "	print 999\n" +
            "end\n" +
            "\n" +
            "class B\n" +
            "	def hello\n" +
            "		print 4567\n" +
            "	end\n" +
            "end\n" +
            "\n" +
            "class S < B\n" +
            "end\n" +
            "\n" +
            "S.new.hello\n" +
            "B",    //<-- B should resolved as class B, not method B()

        };



        String[] outputs = {
                "7654",
                "7654999",
                "4567",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_class_inheritence_exception() {
        String[] program_texts = {
                "B = 1\n" +
                "class S < B\n" +
                "end\n" +
                "\n" +
                "S.new.hello",

                "class C;end; class C < String;end",

                "class D < Class;end",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (Fixnum given)"),
            new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class C"),
            new RubyException(RubyRuntime.TypeErrorClass,"can't make subclass of Class"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_class_inherited(){
        String[] program_texts = {
                "class Top\n"+
                "   def Top.inherited(sub)\n"+
                "       print sub\n"+
                "   end\n"+
                "end\n"+
                "class Middle < Top\n"+
                "end\n",
        };

        String[] outputs = {
                "Middle",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_define_method(){
        String[] program_texts = {
                "class TestDefineMethod;end\n" +
                "class <<TestDefineMethod\n" +
                "    TestDefineMethodConstant = proc do\n" +
                "        print self\n" +
                "    end\n" +
                "    define_method(:test_define_method, TestDefineMethodConstant)\n" +
                "end\n" +
                "TestDefineMethod.test_define_method",
        };

        String[] outputs = {
                "TestDefineMethod",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_dot_class_method() {
        String[] program_texts = {
                "print 1.class\n",
                "print 0.1.class\n",
                "print 'hello'.class\n",
                "print true.class\n",
                "print false.class\n",
                "print nil.class\n",
                "print String.class",
                "print 1.class.class",
                "print Kernel.class",
                "print Comparable.class",//Comparable is defined in builtin.rb
        };

        String[] outputs = {
                "Fixnum",
                "Float",
                "String",
                "TrueClass",
                "FalseClass",
                "NilClass",
                "Class",
                "Class",
                "Module",
                "Module",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_assign() {
        String[] program_texts = {
                "a = true ? 1 : 2; print a",
                "a = b = 12\n" +
                "print a\n",

                //"a = b = 'xxx'\n" +
                //"print b\n",

                "a = 999\n" +
                "print a\n",

                "a = b = 888\n" +
                "print a, b\n",

                "a = 777\n" +
                "a = 666\n" +
                "print a\n",

                "a = 555\n" +
                "b = a\n" +
                "print b\n",

                "a=5; a+=6; print a",
                "a = b = 1 + 2 + 3; print a, b ",
                "a = (b = 1 + 2) + 3; print a, b ",
        };

        String[] outputs = {
                "1",
                "12",
                //"xxx",
                "999",
                "888888",
                "666",
                "555",
                "11",
                "66",
                "63",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_if() {
        String[] program_texts = {
                "buf=\"\"\n" +
                "option = true\n" +
                "if option\n" +
                "    if option\n" +
                "        1.times{|y| buf += \"x\" }\n" +
                "    end\n" +
                "end\n" +
                "print buf",

                "a=true\n" +
                "if a\n" +
                "elsif a\n" +
                "    x=2\n" +
                "end\n" +
                "\n" +
                "print x",

                "if false;print 1; else; end",

                "if true\n" +
                "	print 1\n" +
                "else\n" +
                "	print 2\n" +
                "end",

                "if false\n" +
                "	print 1\n" +
                "else\n" +
                "	print 2\n" +
                "end",

                "if true\n" +
                "	print 'xxx'\n" +
                "end",

                "if false then" +
                "	print 1\n" +
                "elsif true\n" +
                "	print 2\n" +
                "else\n" +
                "	print 3\n" +
                "end",
        };

        String[] outputs = {
                "x",
                "nil",
                "",
                "1",
                "2",
                "xxx",
                "2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_ternaryIfThenElseExpression() {
        String[] program_texts = {
                "print true ? 1: 2",
                "print false ? 1 : 2",
        };

        String[] outputs = {
                "1",
                "2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_case() {
        String[] program_texts = {
                "case \"xxx\"\n" +
                "when \"yyy\", \"xxx\"\n" +
                "    print true\n" +
                "else\n" +
                "    print false\n" +
                "end ",

                "case; when true; print 1; else; print 2; end",

                "b = proc {print 0}; case 1; when 2; a = 3, 4; else b.call; end",

                "class C; end; def C.f; [5]; end\n" +
                "case 5;when *C.f; print 123; end",

                "case [1, 2]; when *[[1, 2]]; print 'ok'; end",

                "case 1; when 1; end",

                "print case 1\n" +
                "	when 1\n" +
                "		1234\n" +
                "	else\n" +
                "		2345\n" +
                "end",

                "print case 100\n" +
                "	when 1\n" +
                "		123\n" +
                "	when 2\n" +
                "		234\n" +
                "	when 3\n" +
                "		34\n" +
                "	else\n" +
                "		2245\n" +
                "end",

                "print case 3\n" +
                "	when 1\n" +
                "		123\n" +
                "	when 2\n" +
                "		234\n" +
                "	when 3\n" +
                "		34\n" +
                "	else\n" +
                "		2245\n" +
                "end",
        };

        String[] outputs = {
                "true",
                "1",
                "0",
                "123",
                "ok",
                "",
                "1234",
                "2245",
                "34",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_unless() {
        String[] program_texts = {
                "a = 1 unless 1==2; print a",

                "a =unless false\n" +
                "	111\n" +
                "else\n" +
                "	222\n" +
                "end\n" +
                "\n" +
                "print a",

                "a =unless true then" +
                "	111\n" +
                "else\n" +
                "	222\n" +
                "end\n" +
                "\n" +
                "print a",

                "$bad = false; unless $x == $x; $bad = true; end; print $bad"
        };

        String[] outputs = {
                "1",

                "111",
                "222",

                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_ensure() {
        String[] program_texts = {
                "def f;print 1;ensure; print 2;return; end; f",

                "while true\n" +
                "  begin\n" +
                "    break\n" +
                "  ensure\n" +
                "    print \"break\"\n" +
                "  end\n" +
                "end",

                "print begin;  end",
                "begin; print 'xxx'; ensure; print 'ensure'; end",
                "begin; ensure; print 'ensure'; end",

                "begin\n" +
                "	raise \"!!!!\"\n" +
                "rescue RuntimeError\n" +
                "	print \"xxx\"\n" +
                "ensure\n" +
                "	print \"yyy\"\n" +
                "end",

                "begin\n" +
                "rescue NoMethodError\n" +
                "	print \"xxx\"\n" +
                "else\n" +
                "	print \"zzz\"\n" +
                "ensure\n" +
                "	print \"yyy\"\n" +
                "end",

                "begin\n" +
                " 1\n" +
                "rescue NoMethodError\n" +
                "	print \"333\"\n" +
                "else\n" +
                "	print \"444\"\n" +
                "ensure\n" +
                "	print \"555\"\n" +
                "end",

                "begin\n" +
                "	raise \"!!!\"\n" +
                "rescue RuntimeError\n" +
                "	print \"333\"\n" +
                "else\n" +
                "	print \"444\"\n" +
                "ensure\n" +
                "	print \"555\"\n" +
                "end",

                "begin\n" +
                "  begin\n" +
                "    raise \"this must be handled no.5\"\n" +
                "  ensure\n" +
                "    print \"ok\"\n" +
                "  end\n" +
                "rescue\n" +
                "  print \"catch\"\n" +
                "end",

                "begin\n" +
                "  begin\n" +
                "    raise \"this must be handled\"\n" +
                "  ensure\n" +
                "    print \"ok\"\n" +
                "  end\n" +
                "rescue\n" +
                "end",
        };

        String[] outputs = {
                "12",
                "break",
                "nil",
                "xxxensure",
                "ensure",
                "xxxyyy",
                "zzzyyy",
                "444555",
                "333555",
                "okcatch",
                "ok",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_stack_depth_consistency_in_begin_end() {
        String[] program_texts = {
                "begin; true; rescue; false; end; begin; true; rescue; false; end",
                "a = [ begin; 1; rescue; 2; end]; print a",
                "print begin; true; rescue; false; end",
        };

        String[] outputs = {
                "",
                "1",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_exception() {
        String[] program_texts = {
                "if ((a=5) == 5 rescue false);b= a;end;print b",
                "if ((a=4) == 4 rescue false);print a;end",
                "if ((a=3) rescue false);print a;end",

                "begin; require 'XXXXX'; rescue LoadError; end;   print $!",

                "begin\n" +
                "eval(\"def foo; BEGIN {}; end\")\n" +
                "rescue SyntaxError=>e\n" +
                "print e.class\n" +
                "end",

                "begin; throw TypeError;rescue Exception =>e; print e; end",

                "def f\n" +
                "  begin\n" +
                "    a=1\n" +
                "    raise '!'\n" +
                "  end\n" +
                "  rescue\n" +
                "    print a\n" +
                "end\n" +
                "f",

                "begin; raise 'www'; rescue; print $!; end",
                "begin; throw 'vvv'; rescue; print $!; end",

                "def f(a); end; begin; f; rescue; print 55 ; end",

                "begin\n" +
                "	raise \"!!!!\"\n" +
                "rescue RuntimeError\n" +
                "	print \"xxx\"\n" +
                "end",

                "begin\n" +
                "	raise \"!!!!\"\n" +
                "rescue\n" +
                "	print \"yyy\"\n" +
                "end",

                "begin\n" +
                "	raise \"!!!!\"\n" +
                "rescue RuntimeError\n" +
                "	print \"aaa\"\n" +
                "end\n" +
                "print 'bbb'",

                "begin\n" +
                "	print 'zzz'\n" +
                "rescue RuntimeError\n" +
                "	print \"ccc\"\n" +
                "end\n" +
                "print 'ddd'",

                "begin\n" +
                "	raise \"!!!!\"\n" +
                "rescue RuntimeError\n" +
                "	print \"111\"\n" +
                "rescue RuntimeError\n" +
                "	print \"222\"\n" +
                "end",

                "begin\n" +
                "	raise \"!!!!\"\n" +
                "	rescue RuntimeError => e\n" +
                "		print e\n" +
                "end",

                "begin\n" +
                "  raise \"test\"\n" +
                "rescue => e\n" +
                "  print e\n" +
                "end",

                "begin\n" +
                "  begin\n" +
                "    raise \"this must be handled no.5\"\n" +
                "  end\n" +
                "rescue\n" +
                "  print \"catch\"\n" +
                "end",

                "begin raise Exception.new, 'zzz'\n" +
                "rescue Exception=> e; print e; end",

                "begin raise Exception, 'ooo'\n" +
                "rescue Exception=> e; print e; end",
        };

        String[] outputs = {
                "5",
                "4",
                "3",

                "nil",
                "SyntaxError",
                "TypeError is not a symbol",
                "1",
                "www",
                "uncaught throw `vvv'",
                "55",
                "xxx",
                "yyy",
                "aaabbb",
                "zzzddd",
                "111",
                "!!!!",
                "test",
                "catch",
                "zzz",
                "ooo",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_binding() {
        String[] program_texts = {
                "p = binding; eval 'foo11 = 1', p; print eval('foo11')",
                "x = binding; eval('for i6 in 1..1; j6=3; end', x); eval('print defined?(j6)', x)",
                "x = proc{}; x = binding; print x.class",

                "x = binding; eval 'i = 1', x;  print(eval('i', x))",

                "module TestBinding\n" +
                "  A = 6\n" +
                "  $x = binding\n" +
                "end\n" +
                "\n" +
                "print eval(\"A\", $x)",

                "def getBinding(x); lambda {return binding}.call; end\n" +
                "b = getBinding(666)\n" +
                "print eval(\"x\", b)",

                "def getBinding(param); return binding; end\n" +
                "b = getBinding(\"hello\")\n" +
                "print eval(\"param\", b) ",

                "def getBinding(param); x = 5; return binding; end\n" +
                "b = getBinding(\"hello\")\n" +
                "print eval(\"x\", b) ",
        };

        String[] outputs = {
                "1",
                "local-variable",
                "Binding",
                "1",
                "6",
                "666",
                "hello",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_eval() {
        String[] program_texts = {
                "eval('print 7', nil,'(erb)')",

                //TODO remove the 'binding;' the test will fail in xruby
                "binding;begin;eval '';rescue;end\n" +
                "i = 5;print(eval('i'))",

                "b = binding; eval('test_eval2 = 6', b); eval('print test_eval2')",
                "eval('print nil'); test_eval1 = 5; eval('print test_eval1')",

                "eval('print 123', nil)",
                "x = proc{}; eval('test_eval = 2', x); print eval('test_eval', x);",
                "TestEval = 5; print eval('TestEval')",
                "a = 1; eval('print a')",
                "print eval('')",
                "eval('print 54321')",
        };

        String[] outputs = {
                "7",

                "5",
                "6",
                "nil5",

                "123",
                "2",
                "5",
                "1",
                "nil",
                "54321",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_not_equal() {
        String[] program_texts = {
                "print 'abc'!=123",
                "print 'abc'!='abc'",
        };

        String[] outputs = {
                "true",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_equal() {
        String[] program_texts = {
                "print 1.equal?(1)",
                "print 'ab' 'cd'=='abcd'",
                "print 'abc'==123",
                "print 'abc'=='abc'",
                "print 'abc'=='abcd'",
                "a = 'xxx'; b = 'xxx'; print a==b",
                "print nil==nil",
                "print 1==1",
                "print []==[]",
                "print [1, 2, 3]==[1, 2, 3]",
                "print [1, 2, 3]==[1, 2, 3, 4]",
                "a = nil; print a==nil",
                "$x = '0'; print $x == $x",
                //"print :s == :s",
        };

        String[] outputs = {
                "true",
                "true",
                "false",
                "true",
                "false",
                "true",
                "true",
                "true",
                "true",
                "true",
                "false",
                "true",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_precedence() {
        String[] program_texts = {
        		"print nil && nil || 'a'",
                "false || b = 2;print b",
                //TODO"x=1;print(x << y = 2);print y",
                //TODO"x=1;print(x + y = 2);print y",
        };

        String[] outputs = {
        		"a",
                "2",
                //"42",
                //"32",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_and_or() {
        String[] program_texts = {

                "false or a = 1; print a",
                "print nil and 'xxx'",
                "print true && 'xxx'",
                "print 1 or 'yyyy'",
                "print false || 5678",
                "true && (print 'xxx')",
                "false && (print 'xxx')",
                "false || (print 'xxx')",
                "true || (print 'xxx')",
        };

        String[] outputs = {
                "1",
                "nil",
                "xxx",
                "1",
                "5678",
                "xxx",
                "",
                "xxx",
                "",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_not() {
        String[] program_texts = {
                "print !!true",
                "print !true",
                "print !false",
                "def f; false; end; print 33 if !f",
        };

        String[] outputs = {
                "true",
                "false",
                "true",
                "33",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_symbol() {
        String[] program_texts = {
                "print :self",
                "print :\"#{1}\"",
                "print :[]=",
                "print :\"!\"",
                "print :'='",
                "print :hello1.id2name",
                "print :hello2.to_a",
                "print :fred.inspect",
                "print :next.to_a",
                "print :<<",
                "print :eql?",
                "print :test.to_s",
                "print :test.to_sym"
        };

        String[] outputs = {
                "self",
                "1",
                "[]=",
                "!",
                "=",
                "hello1",
                "hello2",
                ":fred",
                "next",
                "<<",
                "eql?",
                "test",
                "test"
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_global_variable() {
        String[] program_texts = {
                "$a = 1234; print $a",
                "$B = 'xyz'; print $B",
                "print $NO_SUCH_VARIABLE",
                "print $a0 = 'xxx'",

                "def f\n" +
                "	$G = 123\n" +
                "end\n" +
                "f\n" +
                "print $G",

                "def f\n" +
                "	$F0 = 123\n" +
                "end\n" +
                "print $F0",

                "print $$.instance_of?(Fixnum)",
        };

        String[] outputs = {
                "1234",
                "xyz",
                "nil",
                "xxx",
                "123",
                "nil",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_assign_read_only_global_variable() {
        String[] program_texts = {
                "$$ = 1",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.NameErrorClass, "$$ is a read-only variable"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_command_output() {
        String[] program_texts = {
                "print `echo xxx`",
        };

        String[] outputs = {
                "xxx\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_require_exception() {
        String[] program_texts = {
                "require 'no_such_file_xxx'",
        };

        RubyException[] exceptions = {
                new RubyException(RubyRuntime.LoadErrorClass, "no such file to load -- no_such_file_xxx"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_require() throws FileNotFoundException {
        String program_text = "print 'xxxxx'";
        File file = new File("test_require.rb");
        file.delete();
        PrintStream fstm = new PrintStream(file);
        fstm.print(program_text);
        fstm.close();
        assertTrue(file.exists());

        try {
            String[] program_texts = {
                    "require 'test_require'",
            };

            String[] outputs = {
                    "xxxxx",
            };

            compile_run_and_compare_output(program_texts, outputs);
        } finally {
            assertTrue(file.delete());
        }
    }

    public void test_require_2_files() throws FileNotFoundException {
        String program_text1 = "print 'xxxxx'; REQUIRE_2_FILES = 1";
        File file1 = new File("test_require1.rb");
        file1.delete();
        PrintStream fstm1 = new PrintStream(file1);
        fstm1.print(program_text1);
        fstm1.close();
        assertTrue(file1.exists());

        String program_text2 = "print 'yyyyy', REQUIRE_2_FILES";
        File file2 = new File("test_require2.rb");
        file2.delete();
        PrintStream fstm2 = new PrintStream(file2);
        fstm2.print(program_text2);
        fstm2.close();
        assertTrue(file2.exists());

        try {
            String[] program_texts = {
                    "require 'test_require1';  require 'test_require2'",
            };

            String[] outputs = {
                    "xxxxxyyyyy1",
            };

            compile_run_and_compare_output(program_texts, outputs);
        } finally {
            assertTrue(file1.delete());
            assertTrue(file2.delete());
        }
    }

    public void test_require_2_files_with_global() throws FileNotFoundException {
        String program_text1 = "$G010 = 'cccc'";
        File file1 = new File("test_require3.rb");
        file1.delete();
        PrintStream fstm1 = new PrintStream(file1);
        fstm1.print(program_text1);
        fstm1.close();
        assertTrue(file1.exists());

        String program_text2 = "print $G010";
        File file2 = new File("test_require4.rb");
        file2.delete();
        PrintStream fstm2 = new PrintStream(file2);
        fstm2.print(program_text2);
        fstm2.close();
        assertTrue(file2.exists());

        try {
            String[] program_texts = {
                    "require 'test_require3';  require 'test_require4'",
            };

            String[] outputs = {
                    "cccc",
            };

            compile_run_and_compare_output(program_texts, outputs);
        } finally {
            assertTrue(file1.delete());
            assertTrue(file2.delete());
        }
    }

    public void test_yield() {
        String[] program_texts = {
                "def f; yield [], *[]; end; f {|x, | p x}",

                "def f; yield [1,2,3,4] end;f {|w,x,y,z| print w,9,x,9,y,9,z}",
                "def f; yield [1, 2], 3; end; f {|(x, y), z| print x, y, z}",

                "def f; yield *[[]]; end; f {|a| print a.class, a.length}",//a == []
                "def f; yield [[]]; end; f {|a| print a.class, a.length}",
                "def f; yield [[]]; end; f {|a,b,*c| print a,'!',b,'!',c}",
                "def f; yield *[[]]; end; f {|a,b,*c| print a,'|',b,'|',c}",//a == []

                "def f; yield []; end; f {|a,b,*c| print a, b, c, 3}",
                "def f; yield []; end; f {|a| print a, a.class}",
                "def f; yield []; end; f {|*a| print a, a.class, a.length, a[0].class}", //a == [[]]
                "def f; yield; end; f {|*a| print a}",
                "def f; yield; end; f {|a,b,*c| print a, b, c, 1}",
                "def f; yield nil; end; f {|a,b,*c| print a, b, c, 2}",
                "def f; ar = [1, 2,3,4]; yield ar; end; f {|a,b,*c| print c}",

                "def f; yield 1, 2; end; f {|a| print a, a.class}",
                "def f; yield 1, 2; end; f {|a, b| print a, b}",
                "def f; yield *[3, 4]; end; f {|a, b| print a, b}",
                "def f; yield [1]; end; f {|a| print a, a.class}",

                "def f; yield [nil]; end; f {|a| print a, a.class, '|', a.length}",
                "def f; yield nil; end; f {|a| print a}",
                "def f; yield *nil; end; f {|a| print a, a.class}",
        };

        String[] outputs = {
                "[]\n",

                "1929394",
                "123",

                "Array0",
                "Array1",
                "!nil!",
                "|nil|",

                "nilnil3",
                "Array",
                "Array1Array",
                "",
                "nilnil1",
                "nilnil2",
                "34",

                "12Array",
                "12",
                "34",
                "1Array",

                "Array|1",
                "nil",
                "nilNilClass",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_block() {
        String[] program_texts = {
                "[1].each do \n" +
                "  |test| print test; end",

                "a= true\n" +
                "1.times {|var| 1.times {|var|}} if a\n" +
                "1.times {|var| 1.times {|var|}}",

                "module TestPrintModuleInBlock; 1.times {print TestPrintModuleInBlock}; end",

                "def a\n" +
                "	yield(\"haha\")\n" +
                "end\n" +
                "a {|x| print x}",

                "3.times {print 'Ho!'}",

                "5.times do |i|\n" +
                "  print i\n" +
                "end",

                "def a\n" +
                "	print yield(5)\n" +
                "end\n" +
                "a {|x| print x}",

                "def a\n" +
                "	print yield(66)\n" +
                "end\n" +
                "a {|x| print x; 99}",

                "3.times {|x, y| print x, y}",
        };

        String[] outputs = {
                "1",
                "",
                "TestPrintModuleInBlock",
                "haha",
                "Ho!Ho!Ho!",
                "01234",
                "5nil",
                "6699",
                "0nil1nil2nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_yield_in_block() {
        String[] program_texts = {
                "def f; 2.times {yield} ; end;   f {print '5'}",
                "def f; 2.times { 3.times {yield}} ; end;   f {print '5'}",
        };

        String[] outputs = {
                "55",
                "555555",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_No_VerifyError() {
        String[] program_texts = {
                "    def f(sock, f)\n" +
                "      if chunked?\n" +
                "        while s = f.read(1024)\n" +
                "          sock\n" +
                "        end\n" +
                "      else\n" +
                "        while s = f.read(1024)\n" +
                "          sock\n" +
                "        end\n" +
                "      end\n" +
                "    end",

                "x=1\n" +
                "if x\n" +
                "    s = 1.times {|s|  2}\n" +
                "end\n" +
                "s",

                "a=1\n" +
                "if a\n" +
                "    x=1\n" +
                "    1.times {x=2}\n" +
                "else\n" +
                "    1.times {x=3}\n" +
                "end",

                "arg = nil\n" +
                "nonopt ||= proc {|arg| arg}\n" +
                "arg = nil",
        };

        String[] outputs = {
                "",
                "",
                "",
                "",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_block_binding_scope() {
        String[] program_texts = {
                "a = 1; print self, a; 1.times {print self, a; 1.times {print self, a}}",

                "a=1;   4.times {print a}",
                "def f(a); 1.times {print a} end; f 101",
                "a = 1; 5.times {|a| print a;}; print a",
                "5.times {b = 3; print b;}",
                "a=1;   4.times {a=2; print a};  print a",
                "a = 1; 5.times {a = 9}; print a",
                "a = 1; 5.times {|a| a = 9; print a;}; print a",
                "a = 1; 5.times {|a| print a; a = 9; print a;}; print a",
                "a = 1; 5.times {|a| print a; if false; a = 9; end; print a;}; print a",
                "a = 1; 5.times {|*a| print a}; print a",
                "a = 1; 4.times {|*a| a = 6; print a}; print a",

                "def f(x); 1.times { x = 5} ; print x;  end;   f(1)",
                "def f(&x); x.call;  end;   f {print 555}",

                "class TestBlockBindingScope\n" +
                "    def initialize(num)\n" +
                "        @num = num\n" +
                "    end\n" +
                "    \n" +
                "    def each(&block)\n" +
                "        for i in 0 .. @num \n" +
                "            block.call(i) \n" +
                "        end         \n" +
                "    end\n" +
                "    \n" +
                "end\n" +
                "\n" +
                "te = TestBlockBindingScope.new(10)\n" +
                "te.each {|item| print item}",

                "class Array\n" +
                "    def test_self_in_block\n" +
                "        self.length.times do |index|\n" +
                "            print self[index]\n" +
                "        end\n" +
                "    end\n" +
                "end\n" +
                "\n" +
                "foo = [4,5,6]\n" +
                "foo.test_self_in_block",
        };

        String[] outputs = {
                "main1main1main1",

                "1111",
                "101",
                "012344",
                "33333",
                "22222",
                "9",
                "999999",
                "09192939499",
                "00112233444",
                "012344",
                "66666",

                "5",
                "555",

                "012345678910",

                "456",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_alias_global_variable() {
        String[] program_texts = {
                "$A = 1234; alias $B $A; print $A",
                "$A = 'xyz'; alias $B $A; print $B",
                "$A = 'xyz'; alias $B $A; print $C",
                "$A = 'abcd'; alias $B $A; alias $C $B; print $C",
                "$X = 1234; alias $Y $X; $X = 2345; print $X",
                "$X = 1234; alias $Y $X; $X = 2345; print $Y",
        };

        String[] outputs = {
                "1234",
                "xyz",
                "nil",
                "abcd",
                "2345",
                "2345",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_alias_method() {
        String[] program_texts = {
                "1.times {alias :aliased_print :print};aliased_print 6",

                "class Test_alias_method\n" +
                "def a; print 34; end; alias_method :b, :a ;\n" +
                "end\n" +
                "Test_alias_method.new.b",

                "module M; alias fail2 fail; end",

                "def F_alias; print 22 ; end;alias G_alias F_alias; G_alias()",

                "def f= x; print x;end; alias test_alias f=; test_alias 5",

                "unless 1 == 1; alias :b :print; end",
                "print(if true; alias :b :print; end)",

                "def a; print 'qqq'; end; alias b a ; a",
                "def c; print 'aaa'; end; alias d c ; d",
                "def e; print 'bbb'; end; alias :f :e ; f",

                "class TestAliasMethod\n" +
                "	def f\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "	alias g f\n" +
                "end\n" +
                "TestAliasMethod.new.f",

                "class TestAliasMethod2\n" +
                "	def f\n" +
                "		print \"3333\"\n" +
                "	end\n" +
                "	alias g f\n" +
                "end\n" +
                "TestAliasMethod2.new.g",

                "class Alias0;  def foo;  print \"foo\" end;  end\n" +
                "class Alias1<Alias0;  alias bar foo;  end\n" +
                "Alias1.new.foo",
        };

        String[] outputs = {
                "6",
                "34",

                "",

                "22",

                "5",
                "",
                "nil",

                "qqq",
                "aaa",
                "bbb",
                "~~~~",
                "3333",
                "foo",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_undef_should_not_remove_methods_from_super_class() {
        String[] program_texts = {
                "module TestUndef3; def test_undef_f; print 3;end; end\n" +
                "module TestUndef4; include TestUndef3; undef :test_undef_f; end\n" +
                "class TestUndef5; include TestUndef3; end\n" +
                "TestUndef5.new.test_undef_f",

                "class TestUndef1;  def f; print 9898; end;   end\n" +
                "class TestUndef2 < TestUndef1;	undef f; end\n" +
                "TestUndef1.new.f",
        };

        String[] outputs = {
                "3",
                "9898",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_undef_method() {
        String[] program_texts = {
                "def a; print 'qqq'; end; undef a; a",
                "def b; print 'qqq'; end; undef :b; b",

                "class CTest\n" +
                "	def f123\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "	undef f123\n" +
                "end\n" +
                "CTest.new.f123",

                "class CUndef\n" +
                "	def f12\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "	undef_method :f12\n" +
                "end\n" +
                "CUndef.new.f12",

                "class TestUndef1;  def f; print 9898; end;   end\n" +
                "class TestUndef2 < TestUndef1;	undef f; end\n" +
                "TestUndef2.new.f",

        };

        RubyException[] exceptions = {
            //TODO exception type is not correct
            new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'a' for Object"),
            new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'b' for Object"),

            new RubyException(RubyRuntime.NoMethodErrorClass, null),
            new RubyException(RubyRuntime.NoMethodErrorClass, null),
            new RubyException(RubyRuntime.NoMethodErrorClass, null),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_Enumerable() {
        String[] program_texts = {
                "a = [1, 3, 2].sort_by {|x| print x; 1};p a\n"+
                "a = %w{apple pear fig }; b = a.sort_by {|word| word.length}; p a, b\n",

                "p (1..10).sort {|a,b| b <=> a}\n",

                "a = (1..10).detect  {|i| i % 5 == 0 and i % 7 == 0 }; print a",
                "a = (1..100).detect {|i| i % 5 == 0 and i % 7 == 0 }; print a",

                "[1,2,3].each_with_index{|x, y| print x,y}",

                "p (1..10).find_all {|i|  i % 3 == 0 }",
                "p [1, 2, 3, 4].find_all {|i|  i % 3 == 0 }",

                "p (5..10).inject {|sum, n| sum + n }\n"+
                "p (5..10).inject(1) {|product, n| product * n }",

                "class Two\n"+
                "       include Comparable\n"+

                "       attr :str\n"+

                "       def <=>(other)\n"+
                "           if !other.kind_of? Two\n"+
                "               return false\n"+
                "           end\n"+
                "           @str.size <=>other.str.size\n"+
                "       end\n"+

                "       def initialize(str)\n"+
                "           @str = str\n"+
                "       end\n"+

                "       def inspect\n"+
                "           @str\n"+
                "       end\n"+

                "       def add(other)\n"+
                "           Two.new(@str + other.str)\n"+
                "       end\n" +

                "end\n"+

                "class One\n"+
                "       include Enumerable\n"+

                "       def initialize\n"+
                "           t1 = Two.new(\"1\")\n"+
                "           t2 = Two.new(\"bc\")\n"+
                "           t3 = Two.new(\"567\")\n"+
                "           t4 = Two.new(\"0000\")\n"+
                "           @data = [t1,t2,t3,t4]\n"+
                "       end\n"+

                "       def each\n"+
                "           i = 0\n"+
                "           n = @data.size\n"+
                "           while   i < n\n"+
                "               yield(@data[i])\n"+
                "               i += 1\n"+
                "           end \n"+
                "           #@data.each{|i|yield(i)}\n"+
                "       end\n"+

                "       def One.test\n"+
                "           o = One.new\n"+
                "           p o.member?(\"2\")\n"+
                "           p o.include?(Two.new(\"bc\"))\n"+
                "           p o.to_a\n"+
                "           p o.entries\n"+
                "           p o.inject{|sum,element|sum.add(element)}\n"+
                "           p o.inject(Two.new(\"begin\")){|sum,element|sum.add(element)}\n"+
                "           p o.max\n"+
                "           p o.min\n"+
                "       end\n"+
                "end\n"+

                "One.test\n",

                "p [ nil, true, 99 ].any? \n"+
                "p [ 2, true, 99 ].all? \n"+
                "p [ nil, true, 99 ].all? \n"+
                "p %w{ ant bear cat}.all? {|word| word.length >= 3}\n",

                "p (1..4).collect {|i| i*i }\n"+
                "p (1..4).map { \"cat\"  }\n",

                "p (1..6).partition {|i| (i&1).zero?}\n",

                "p (1..100).grep 38..44\n"+
                "c= [\"SEK_END\", \"SEEK_SET\", \"SEEK_CUR\"]\n"+
                "p c.grep(/SEEK/)\n",

                "a = [ 4, 5 ]\n"+
                "b = [ 7, 8, 9 ]\n"+
                "p (1..3).zip(a, b)\n"+
                "p (1..3).zip\n",

        };

        String[] outputs = {
                "132[1, 3, 2]\n[\"apple\", \"pear\", \"fig\"]\n[\"fig\", \"pear\", \"apple\"]\n",
                "[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]\n",
                "nil",
                "35",
                "102132",
                "[3, 6, 9]\n",
                "[3]\n",

                "45\n151200\n",
                "false\ntrue\n[1, bc, 567, 0000]\n[1, bc, 567, 0000]\n1bc5670000\nbegin1bc5670000\n0000\n1\n",
                "true\ntrue\nfalse\ntrue\n",
                "[1, 4, 9, 16]\n[\"cat\", \"cat\", \"cat\", \"cat\"]\n",
                "[[2, 4, 6], [1, 3, 5]]\n",
                "[38, 39, 40, 41, 42, 43, 44]\n[\"SEEK_SET\", \"SEEK_CUR\"]\n",
                "[[1, 4, 7], [2, 5, 8], [3, nil, 9]]\n[[1], [2], [3]]\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_default() {
        String[] program_texts = {
                "h = Hash.new {print 4;3}; print h[2]",
                "h = Hash.new(1); print h[2]",
                "h = {}; def h.default(x); print 'x'; x; end; print h[1], h[2]",
                "h = { 'a' => 100, 'b' => 200 }; print h.default",
                "h = { 'a' => 100, 'b' => 200 };h.default = 'Go fish'; print h['a'], h['z'] ",
                "h = Hash.new() {1}; h.default=5; print h[33]",
        };

        String[] outputs = {
                "43",
                "1",
                "xx12",
                "nil",
                "100Go fish",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_misc() {
        String[] program_texts = {
                "p({1=>2, 4=>3, 2=>3}.delete_if {|x, y| x < y})",
                "{6=>'x'}.each_key {|k| print k}",
                "h={[1] => 1};print h[[1]]",
                "h = {1=>2}; print h.delete(1); print h.delete(4); print h.size",
                "a = {:s => 9}; print a[:s], a['s']",
                "a = {1=>2}; a[1] = 3; p a",
//                "p({1 => 2, 3 => 4}.merge!({3 =>7, 4=>6}))", // Different Hash Implementation
                "p({1 => 2, 3 => 4})",

                "print({1 =>3}.fetch(1))",
                "print({1 =>4}.fetch(2, 5))",
                "{1 =>4}.fetch(2) {|x| print x}",

                "a = {1, 2}; b = a.dup; b.shift; print a, b",

                "print {}",

                "h1 = Hash.new { |hash1, key1| hash1[key1] = 'xx' }; print h1[123]",
                "a = Hash.new{|h, k|k}; print a[99], a[88]",
                "a = Hash.new{print 2; 1}; print a[99], a[88]",
                "a = Hash.new{print 2; 1}; print a[99]",
                "h4 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h4.length",
                "h3 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h3['NO_SUCH_THING']",
                "h2 = {'a' => 'xxxx', 'b' => 'yyyy'}; print h2['a']",
                "h5 = {'a' => 'xxxx', 1 => 'yyyy'}; print h5[1]",
                "h6 = {'a' => 'xxxx', 1 => 'yyyy'}; h6['a'] = 'zzz'; print h6['a']",
                "h7 = {}; h7['c'] = 1234; print h7['c']",

                "a = {1, 2}; print a[1]",
        };

        String[] outputs = {
                "{4=>3}\n",
                "6",
                "1",
                "2nil0",
                "9nil",
                "{1=>3}\n",
//                "{1=>2, 3=>7, 4=>6}\n",
                "{1=>2, 3=>4}\n",
                "3",
                "5",
                "2",

                "12",

                "nil",

                "xx",
                "9988",
                "2211",
                "21",
                "2",
                "nil",
                "xxxx",
                "yyyy",
                "zzz",
                "1234",

                "2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_each() {
        String[] program_texts = {
                "{1=>2}.each {|x, y| print x, y}",
        };

        String[] outputs = {
                "12",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_hash_key_has_value() {
        String[] program_texts = {
                "a = {1=> 2}; print a.has_key?(1), a.has_key?(2)",
                "a = {1=> 2}; print a.has_value?(1), a.has_value?(2)",
        };

        String[] outputs = {
                "truefalse",
                "falsetrue",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_values_at() {
        String[] program_texts = {
                "a = {1=> 2, 3 =>4}; print a.values_at(0)",
                "a = {1=> 2, 3 =>4}; print a.values_at(1, 3)",
                "a = {1=> 2, 3 =>4}; print a.values_at()",
        };

        String[] outputs = {
                "",
                "24",
                "",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_equal() {
        String[] program_texts = {
                "print ({1=> 2, 3 =>4} == {1=> 2, 3 =>4})",
                "print ({1=> 2, 3 =>4} == {1=> 2})",
                "print ({1=> 2, 3 =>4} == { 3 =>4, 1=> 2})",
        };

        String[] outputs = {
                "true",
                "false",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_keys_values() {
        String[] program_texts = {
                "h = {'a' => 100, 'b' => 200, 'c' => 300, 'd' => 400}; print h.keys.sort",
                "h = {'a' => 100, 'b' => 200, 'c' => 300, 'd' => 400}; print h.values.sort",
        };

        String[] outputs = {
                "abcd",
                "100200300400",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Hash_shift() {
        String[] program_texts = {
                "h = {'a' => 100}; print h.shift, h.size",
                "h = {}; print h.shift, h.size",
        };

        String[] outputs = {
                "a1000",
                "nil0",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_while_until() {

        String[] program_texts = {
                "print 7 while false",
                "begin; print 5; end while false",
                "begin; print 6; end until true",

                "i = 0\n" +
                "while i<20; i+=1; result = i; end\n" +
                "print result",

                "i = 0\n" +
                "while i<3; i+=1; result = i; end\n" +
                "print result",

                "i = 1 ;while i < 1 ; end; print i",
                "while false; print 'xxx'; end",
                "until true; print 'xxx'; end",

                "a = 0\n" +
                "while a > 1\n" +
                "    print 'xxx'\n" +
                "    a = 1\n" +
                "end",

                "a = 2\n" +
                "while a > 1\n" +
                "    print 'xxx'\n" +
                "    a = 1\n" +
                "end",
        };

        String[] outputs = {
                "",
                "5",
                "6",
                "20",
                "3",
                "1",
                "",
                "",
                "",
                "xxx",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_break_in_while() {
        String[] program_texts = {
                "i = 0; while i < 5; i = i + 1; print i; break if i == 3; end",
                "print (while true; break 66; end)",
                "print (while true; break; end)",
        };

        String[] outputs = {
                "123",
                "66",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_break_in_block() {
        String[] program_texts = {
                "3.times {|x| print x;while true; break;end}",

                "i =0\n" +
                "def f\n" +
                "  1.upto(10) {|i|\n" +
                "    yield i\n" +
                "  }\n" +
                "end\n" +
                "f{|i| break if i == 5}\n" +
                "\n" +
                "print i",
        };

        String[] outputs = {
                "012",

                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_redo_in_while() {
        String[] program_texts = {
                "i = 0; while i < 5;  i = i+1; redo if i == 3; print i; end",
        };

        String[] outputs = {
                "1245",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_redo_in_block() {
        String[] program_texts = {
                "done = false\n" +
                "loop {\n" +
                "  print \"in loop\"\n" +
                "  break if done\n" +
                "  done = true\n" +
                "  redo\n" +
                "}",

                "count = 1;\n" +
                "for i in 1..9\n" +
                "	print i\n" +
                "	break if count == 4\n" +
                "	count = count + 1\n" +
                "	redo\n" +
                "end",
        };

        String[] outputs = {
                "in loopin loop",
                "1111",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_retry_in_begin_end() {
        String[] program_texts = {
                "$bad = true\n" +
                "begin\n" +
                "  raise \"this will be handled\"\n" +
                "rescue\n" +
                "  if $bad\n" +
                "    $bad = false\n" +
                "    retry\n" +
                "    print \"you should not see this\"\n" +
                "  end\n" +
                "end",
        };

        String[] outputs = {
                "",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_retry() {
        String[] program_texts = {
                "  sum=0\n" +
                "    for i in 1..10\n" +
                "      sum += i\n" +
                "      i -= 1\n" +
                "      print i\n" +
                "      if i > 0 && sum < 5\n" +
                "        retry\n" +
                "      end\n" +
                "  end",

                "count = 1;\n" +
                "for i in 1..9\n" +
                "	print i\n" +
                "	break if count == 4\n" +
                "	count = count + 1\n" +
                "	retry\n" +
                "end",
        };

        String[] outputs = {
                "010123456789",
                "1111",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_next_in_while() {
        String[] program_texts = {
                "i = 0; while i < 5; i = i + 1; next; print i; end",
                "i = 0; while i < 5; i = i + 1; next if i == 3; print i; end",
                "i = 0; while i < 5; i = i + 1; next (print 'x') if i ==3; print i; end",
        };

        String[] outputs = {
                "",
                "1245",
                "12x45",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_local_variable_assigned_in_whille_condition() {
        String[] program_texts = {
            "$TestWhile = 0\n" +
            "def f\n" +
            "	$TestWhile = $TestWhile + 1 \n" +
            "end\n" +
            "\n" +
            "while i = f(); break if i > 5; print i; end ",
        };

        String[] outputs = {
                "12345",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_self() {
        String[] program_texts = {
                "print 1.next",
                "print 2.next.next",
                "print self.class",

                "class A\n" +
                "	print self.class\n" +
                "end",

                "print self",
        };

        String[] outputs = {
                "2",
                "4",
                "Object",
                "Class",
                "main",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_printf() {
        String[] program_texts = {
                "printf '%d %d %s', 1, 2, 'vvv'",
                "printf '###'",
                "printf '\\n'",
                "printf \"\\n\"",
        };

        String[] outputs = {
                "1 2 vvv",
                "###",
                "\\n",
                "\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_to_a() {
        String[] program_texts = {
                "print 1.to_a.class",
                "print 1.to_a",
                "print [1, 2, 3].to_a",
                "print nil.to_a.length",
        };

        String[] outputs = {
                "Array",
                "1",
                "123",
                "0",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_scope() {
        String[] program_texts = {
                "x=0;1.times {x = 1};1.times {x = 2};print x",
                "b = 1; 1.times {1.times {b=6}}; print b",
                "a = 5; 1.times {1.times {print a}}",

                "begin   \n" +
                "     for k,v in true\n" +
                "     end\n" +
                "rescue\n" +
                "end\n" +
                "   \n" +
                "print k",

                "if false; test_scope_1 = 1; end; print test_scope_1",
                "case 4; when 1; test_scope_2 = 1; end; print test_scope_2",

                "a = 5\n" +
                "class A\n" +
                "	a=9\n" +
                "	print a\n" +
                "end\n" +
                "print a",

        };

        String[] outputs = {
                "2",
                "6",
                "5",

                "nil",
                "nil",
                "nil",

                "95",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_public() {
        String[] program_texts = {
                "module M; public :fail; end",

                "class TestPublic1\n" +
                "	public\n" +
                "	def f\n" +
                "		print \"1111\"\n" +
                "	end\n" +
                "end\n" +
                "TestPublic1.new.f",

                "class TestPublic2\n" +
                "	private\n" +
                "	def f\n" +
                "		print \"2222\"\n" +
                "	end\n" +
                "	public :f\n" +
                "end\n" +
                "TestPublic2.new.f",

                "class TestPublic3\n" +
                "	private\n" +
                "	def f\n" +
                "		print \"3333\"\n" +
                "	end\n" +
                "	public 'f'\n" +
                "end\n" +
                "TestPublic3.new.f",
        };

        String[] outputs = {
                "",
                "1111",
                "2222",
                "3333",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_protected() {
        String[] program_texts = {
                "class C\n" +
                "  def test_protected1; end\n" +
                "  protected :test_protected1  \n" +
                "  def test_protected2(x);  defined?(x.test_protected1) ;end\n" +
                "end\n" +
                "\n" +
                "a = C.new; print a.test_protected2(a)",
        };

        String[] outputs = {
                "method",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_private_class_method() {
        String[] program_texts = {
                "module MAfterSingleton; class << self; private; end; end\n" +
                "module MAfterSingleton; class << self; def f_after_singleton; print 3; end; end; end\n" +
                "MAfterSingleton.f_after_singleton",

                "class TestPCMB; def TestPCMB.f; print 1;end; end\n" +
                "class TestPCMC < TestPCMB;private_class_method :f;end\n" +
                "TestPCMB.f",
        };

        String[] outputs = {
                "3",
                "1",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_private_protected() {
        String[] bad_program_texts = {

                "class TestPrivateProtected1\n" +
                "	private\n" +
                "	def f\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "end\n" +
                "TestPrivateProtected1.new.pf",

                "class TestPrivateProtected2\n" +
                "	protected\n" +
                "	def test_private_protected2\n" +
                "		print \"~~~~\"\n" +
                "	end\n" +
                "end\n" +
                "TestPrivateProtected2.new.test_private_protected2",

                "class TestPrivateProtected3\n" +
                "	def tpp1\n" +
                "		print \"1111\"\n" +
                "	end\n" +
                "	private :tpp1\n" +
                "end\n" +
                "TestPrivateProtected3.new.tpp1",

                "class TestPrivateProtected4\n" +
                "	def test_private_protected4\n" +
                "		print \"1111\"\n" +
                "	end\n" +
                "	private :no_such_method\n" +
                "end\n",

                "def test_private_protected5; end\n" +
                "Object.new.test_private_protected5",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'pf' for TestPrivateProtected1"),
            new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'test_private_protected2' for TestPrivateProtected2"),
            new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'tpp1' for TestPrivateProtected3"),
            new RubyException(RubyRuntime.NameErrorClass, "undefined method 'no_such_method' for TestPrivateProtected4"),
            new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'test_private_protected5' for Object"),
        };

        compile_run_and_catch_exception(bad_program_texts, exceptions);
    }

    public void test_defined() {
        String[] program_texts = {
                "print defined?(Kernel.print), defined?(Object.print)",
                "test_defined_scope1 = 1; print defined?(test_defined_scope1)",
                "1.times {test_defined_scope0 = 1}; print defined?(test_defined_scope0)",

                "print defined?(yield)",

                "def defined_test\n" +
                "  print defined?(yield)\n" +
                "end\n" +
                "\n" +
                "defined_test\n" +
                "defined_test {print 333}",

                "print defined? yield",

                "class C; def C.g; print 456; end; end\n" +
                "def f; print 123;   C;   end\n" +
                "print defined?(f().g)",

                "$x=1; print defined?($x)",
                "print defined?(Array)",
                "print defined?(::Kernel)",
                "print defined?(NO_SUCH_CONSTANT_XXX)",
                "print defined?(Kernel::NO_SUCH_CONSTANT_XXX)",
                "print defined?(1 == 2)",

                "print defined? nil",
                "print defined? 123",
                "print defined? no_such_method",
                "print defined? no_such_method(1, 2, 3)",
                "print defined? to_s",
                "def test_defined1(x); 'xxx'; end;  print defined? test_defined1(1, 2)",
                "def test_defined; end;    undef test_defined;   print defined? test_defined",

                "print defined? super",
                "class C; print defined? super; end",

                "class TestDefined0; end\n" +
                "class TestDefined2 < TestDefined0; def test_define; print defined? super end; end\n" +
                "TestDefined2.new.test_define",

                "class TestDefined0; def test_define; end;  end\n" +
                "class TestDefined2 < TestDefined0; def test_define; print defined? super end; end\n" +
                "TestDefined2.new.test_define",
        };

        String[] outputs = {
                "methodnil",
                "local-variable",
                "nil",

                "nil",

                "nilyield",
                "nil",

                "123method",

                "global-variable",
                "constant",
                "constant",
                "nil",
                "nil",
                "method",

                "nil",
                "expression",
                "nil",
                "nil",
                "method",
                "method",
                "nil",

                "nil",
                "nil",

                "nil",

                "super",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Array_concat() {
        String[] program_texts = {
                "x = [ 'a', 'b' ].concat( ['c', 'd'] ); print x, x.length",
        };

        String[] outputs = {
                "abcd4",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_instance_variable() {
        String[] program_texts = {
                "print @a",
                "@a= 234; print @a",

                "class TestInstanceVariable\n" +
                "	def f\n" +
                "		@a = 123\n" +
                "	end\n" +
                "	\n" +
                "	def display\n" +
                "		print @a\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "a = TestInstanceVariable.new\n" +
                "a.f\n" +
                "a.display",

                " class MyClass\n" +
                "   @one = 1\n" +
                "   def do_something\n" +
                "     @one = 2\n" +
                "   end\n" +
                "   def output\n" +
                "     print @one\n" +
                "   end\n" +
                " end\n" +
                " instance = MyClass.new\n" +
                " instance.output\n" +
                " instance.do_something\n" +
                " instance.output",
        };

        String[] outputs = {
                "nil",
                "234",
                "123",
                "nil2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Class_name() {
        String[] program_texts = {
                "class Kernel::KC1 < Object;end;print Kernel::KC1",
                "module TestClassName3; class TestClassName4; print name; end; end",
                "class TestClassName2; attr_reader :name, :tests; print name; end",
                "class TestClassName; print name; end",
        };

        String[] outputs = {
                "Kernel::KC1",
                "TestClassName3::TestClassName4",
                "TestClassName2",
                "TestClassName",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Object_extend() {
        String[] program_texts = {
                "a = 'x'; print a.frozen?; a.freeze; print a.frozen?",

                "module Mod; def hello; \"Mod\"; end; end\n" +
                "class Klass; def hello; \"Klass\"; end; end\n" +
                "k = Klass.new; print k.hello; k.extend(Mod);print k.hello",
        };

        String[] outputs = {
                "falsetrue",
                "KlassMod",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_class_variable() {
        String[] program_texts = {
                "class TestClassVariableB1\n" +
                "	@@var__1 = 777\n" +
                "	def TestClassVariableB1.f\n" +
                "		@@var__1\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "module TestClassVariableM1\n" +
                "	@@var__1 = 666\n" +
                "end\n" +
                "\n" +
                "class TestClassVariableC1 < TestClassVariableB1\n" +
                "	include TestClassVariableM1\n" +
                "	\n" +
                "end\n" +
                "\n" +
                "print TestClassVariableC1.f",

                "class TestClassVariable2\n" +
                "	@@test_class_variable = \"xxx\"\n" +
                "	def test_class_variable1\n" +
                "		@@test_class_variable\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestClassVariable3 < TestClassVariable2\n" +
                "end\n" +
                "\n" +
                "print TestClassVariable3.new.test_class_variable1",

                "@@a= 567; print @@a",

                "class TestClassVariable\n" +
                "	def f\n" +
                "		@@a = 123\n" +
                "	end\n" +
                "	\n" +
                "	def display\n" +
                "		print @@a\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "a = TestClassVariable.new\n" +
                "a.f\n" +
                "a.display",

                " class MyClass\n" +
                "   @@value = 1\n" +
                "   def add_one\n" +
                "     @@value= @@value + 1\n" +
                "   end\n" +
                "   \n" +
                "   def value\n" +
                "     @@value\n" +
                "   end\n" +
                " end\n" +
                " instanceOne = MyClass.new\n" +
                " instanceTwo = MyClass.new\n" +
                " print instanceOne.value\n" +
                " instanceOne.add_one\n" +
                " print instanceOne.value\n" +
                " print instanceTwo.value",

                "class TestClassVariable0\n" +
                "	@@test_class_variable = \"xxx\"\n" +
                "	def f\n" +
                "		@@test_class_variable\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestClassVariable1 < TestClassVariable0\n" +
                "	@@test_class_variable = \"yyy\"\n" +
                "end\n" +
                "\n" +
                "print TestClassVariable0.new.f",

                "class TestClassVariable4\n" +
                "	@@test_class_variable = \"000\"\n" +
                "	print @@test_class_variable\n" +
                "end\n",

                "class TestClassVariable5\n" +
                "	@@test_class_variable = \"zzz\"\n" +
                "	def TestClassVariable5.f\n" +
                "		@@test_class_variable\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestClassVariable5.f",

                "class TestClassVariable6\n" +
                "	@@test_class_variable = \"ppp\"\n" +
                "	class <<self\n" +
                "		def f\n" +
                "			@@test_class_variable\n" +
                "		end\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestClassVariable6.f",

                "module TestClassVariableM\n" +
                "	@@var = 999\n" +
                "end\n" +
                "\n" +
                "class TestClassVariableC\n" +
                "	include TestClassVariableM\n" +
                "	def f\n" +
                "		@@var\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestClassVariableC.new.f",

                "class TestClassVariableB2\n" +
                "	@@var = 777\n" +
                "	def g1\n" +
                "		@@var\n" +
                "	end\n" +
                "	\n" +
                "end\n" +
                "\n" +
                "module TestClassVariableM2\n" +
                "	@@var = 999\n" +
                "	def g2\n" +
                "		@@var\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestClassVariableC2 < TestClassVariableB2\n" +
                "	include TestClassVariableM2\n" +
                "end\n" +
                "\n" +
                "a = TestClassVariableC2.new\n" +
                "print a.g1, a.g2 ",
        };

        String[] outputs = {
                "777",
                "xxx",
                "567",
                "123",
                "122",

                "yyy",
                "000",
                "zzz",
                "ppp",
                "999",

                "777999",
        };

        compile_run_and_compare_output(program_texts, outputs);

        String[] bad_program_texts = {
                "print @@no_scuh_variable",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.NameErrorClass, "uninitialized class variable @@no_scuh_variable in Object"),
        };

        compile_run_and_catch_exception(bad_program_texts, exceptions);
    }

	public void test_multiple_assignment_parenthesis() {
        String[] program_texts = {
                "(a,), b , c = 1,2; print a, b, c",
        };

        String[] outputs = {
                "12nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }
	
    public void test_multiple_assignment_non_local_variable() {
        String[] program_texts = {
                "@x,@y=1, 2; print @x, @y",
        };

        String[] outputs = {
                "12",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_multiple_assignment_no_asterisk() {
        String[] program_texts = {
                "a = true; if a; x = (a,b=1,2); p x; end",

                "a = []; a[0], a [2] = 3, 9; p a",

                "w,x,y,z = [1,2,3,4];print w,9,x,9,y,9,z",
                "c = (a,b=1,2); p c",

                "a, = 1,2; print a",

                "a, b = 3, 4; print a, b",
                "a = 1; b = 2;   a, b = b, a; print a, b",
                "a = 1; b = 2; c = 3;   a, b, c = b, a; print a, b, c",
                "a = 1; b = 2;   a, b = b, a, print(3); print a, b",

                "a = 1, 2, 3; print a.class, a",
                "a = 1, 2.5; print a",
        };

        String[] outputs = {
                "[1, 2]\n",

                "[3, nil, 9]\n",

                "1929394",
                "[1, 2]\n",
                "1",
                "34",
                "21",
                "21nil",
                "321",
                "Array123",
                "12.5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_multiple_assignment_asterisk_only_on_the_left() {
        String[] program_texts = {
                "a, b, * = [1, 2, 3]; print a, b",
                "*a = nil; print a.class, a.length, a[0]",
                "a, b, *c = 1, 2, 3, 4, 5; print a, b, c.class, c",
                "a,b,*c = nil; print a, b, c, c.class, c.length",
                "*a = 1, 2, 3, 4, 5; print a",
                "a, *b = 88, 99; print a, b, b.class",

                "a,b,*c = []; print a, '|', b, '|', c",
                "a,b,*c = [1, 2, 3]; print a, '|', b, '|', c",
                "*a = []; print a[0].class",
        };

        String[] outputs = {
                "12",
                "Array1nil",
                "12Array345",
                "nilnilArray0",
                "12345",
                "8899Array",
                "nil|nil|",
                "1|2|3",
                "Array",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_multiple_assignment_asterisk_only_on_the_right() {
        String[] program_texts = {
                "a = *nil; print a",
                "a = *123; print a",
                "a = 1; b = *a; print b",
                "a = []; b = *a; print b, b.class",

                "x = [1, 2, 3]; a, b, c = *x; print a, ',', b, ',', c",
                "x = [1, 2, 3]; a, b = *x; print a, ',', b",
                "x = [1, 2, 3]; a = *x; print a, a.class, a.length",

                "x = [1, 2, 3]; a, b = 99, *x; print a, ',', b",
                "x = [1, 2, 3]; a, b = 88, 99, *x; print a, ',', b",

                "a,=*[1]; print a, a.class",
        };

        String[] outputs = {
                "nil",
                "123",
                "1",
                "nilNilClass",

                "1,2,3",
                "1,2",
                "123Array3",

                "99,1",
                "88,99",

                "1Fixnum",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_multiple_assignment_asterisk_on_both_sides() {
        String[] program_texts = {
                "a, *b = 1, *[2, 3]; print a, ',', b",
                "a, *b = 1, *2; print a, ',', b, b.class",
                "*a = *1; print a, a.class",
                "*a = *nil; print a, a.class",

                "*a = 1, 2, *[3, 4]; print a, '|', a.length",
                "a, *b = 1, 2, *[3, 4]; print a, '|', b, '|', b.length",

                "a, b, *c = 1, *[2, 3]; print a, '|', b, '|', c",
                "a, b, *c = 1, *[2, 3, 4]; print a, '|', b, '|', c",

                "a,b,*c = *[[]]; print a, b, c",
        };

        String[] outputs = {
                "1,23",
                "1,2Array",
                "1Array",
                "Array",

                "1234|4",
                "1|234|3",

                "1|2|3",
                "1|2|34",

                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_nested_assignment() {
        String[] program_texts = {
                "b, (c, d), e = 1,2,3,4; print b, c, d, e",
                "b, (c, d), e = 1,[2,3,4],5; print b, c, d, e",
                "b, (c,*d), e = 1,[2,3,4],5; print b, c, d, d.class, e",
        };

        String[] outputs = {
                "12nil3",
                "1235",
                "1234Array5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_return() {
        String[] program_texts = {
                "def r; return 1;  end; a = r(); print 1",
                "def r; return *1; end; a = r(); print a, a.class",
                "def r; return []; end; a = r(); print a, a.class",
                "def r; return [*[]]; end; a = r(); print a, a.class, '*'",
                "def r; return *[[]]; end; a = *r(); print a",
                "def r; return *nil; end; *a = r(); print a.class, a.length, a[0]",	//a == [nil]
        };

        String[] outputs = {
                "1",
                "1Fixnum",
                "Array",
                "Array*",
                "nil",
                "Array1nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_lamda_proc() {
        String[] program_texts = {
                "f = lambda{|x,| x}; p f.call([42])",
                "def f; print 1; end; lambda(&method(:f)).call",
                "a = lambda {print 'xxx'}; a.call",
                "a = lambda {|x| print x}; a.call('yyy')",
                "a = proc {|x, y| print x, y}; a.call(1, 2)",
                "a = lambda {print self}; a.call",
        };

        String[] outputs = {
                "[42]\n",
                "1",
                "xxx",
                "yyy",
                "12",
                "main",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_loop_no_block_given() {
        String[] program_texts = {
                "loop",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.LocalJumpErrorClass, "in `loop': no block given"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_loop() {
        String[] program_texts = {
                "a = loop do break; end; print a",
                "a = loop do break 123; end; print a",
        };

        String[] outputs = {
                "nil",
                "123",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_return_break_next_in_block() {
        String[] program_texts = {
                "def f &block; 1.times {block.call}; print 'yyy'; end\n" +
                "def test_return2; f {print 'xxx';return}; end\n" +
                "test_return2",

                "def f; [1, 2].each {|x| print x; return 4}; end; print(f)",

                "def test()\n" +
                "    3.times do |index|\n" +
                "        print index\n" +
                "        return\n" +
                "    end\n" +
                "end\n" +
                "\n" +
                "test()",

                "def test()\n" +
                "    3.times do |index|\n" +
                "        print index\n" +
                "        break\n" +
                "    end\n" +
                "end\n" +
                "\n" +
                "test()",

                "def test()\n" +
                "    3.times do |index|\n" +
                "        print index\n" +
                "        next\n" +
                "    end\n" +
                "end\n" +
                "\n" +
                "test()",

                "def f()\n" +
                "    3.times do |index|\n" +
                "        return 123\n" +
                "    end\n" +
                "    print 456\n" +
                "end\n" +
                "\n" +
                "print f()",
        };

        String[] outputs = {
                "xxx",
                "14",

                "0",
                "0",
                "012",
                "123",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_next_in_block() {
        String[] program_texts = {
                "def f; a= yield; print a; end; f {next 1}",
                "def f; a= yield; print a, a.class; end; f {next *nil}",

                "count = 1;\n" +
                "for i in 1..9\n" +
                "	print i\n" +
                "	break if count == 4\n" +
                "	count = count + 1\n" +
                "	next\n" +
                "end",
        };

        String[] outputs = {
                "1",
                "nilNilClass",
                "1234",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_range_exception() {
        String[] program_texts = {
                "1 .. 'x'",
                "'x' ... 3",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "bad value for range"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_range_equal() {
        String[] program_texts = {
                "print (1..2) == (1..2), (1..2) == (1...3)",

                "a = 1..3; print a === 0",
                "a = 1..3; print a === 1",
                "a = 1..3; print a === 2",
                "a = 1..3; print a === 3",
                "a = 1..3; print a === 4",

                "a = 1...3; print a === 3",

                "a = 1...3; print a === 'x'",
                "print 'abcd' === 'abcd'",

        };

        String[] outputs = {
                "truefalse",

                "false",
                "true",
                "true",
                "true",
                "false",

                "false",

                "false",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Range_to_a() {
        String[] program_texts = {
                "print((1...1).to_a)",
                "print ((1..7).to_a)",
        };

        String[] outputs = {
                "",
                "1234567",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_regex_case_equal() {
        String[] program_texts = {
                "print /^f.*r$/ === 'foobar'",
                "print /hello/ === '1234'",

        };

        String[] outputs = {
                "true",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_regex_match() {
        String[] program_texts = {
                "print(/\\A\\w:\\/\\z/ =~ 'C:/')",
                "print /(.)(.)(\\d+)(\\d)/.match(\"THX1138.\")",
                "print /(.)(.)(\\d+)(\\d)/.match(\"THX.\")",
                "print /(.)(.)(\\d)+(\\d)/ =~  \"THX1138.\"",
                "print /(.)(.)(\\d+)(\\d)/ =~ \"THX.\"",
        };

        String[] outputs = {
                "0",
                "HX1138",
                "nil",
                "1",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_MatchData() {
        String[] program_texts = {
                "m = /(.)(.)(\\d+)(\\d)/.match('THX1138.'); print m[0]",
        };

        String[] outputs = {
                "HX1138",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Regex_quote() {
        String[] program_texts = {
                "print Regexp.quote('ABCD')",
                "print Regexp.quote('(AB)CD')",
                "print Regexp.quote('[AB]CD')",
                "print Regexp.quote('{AB}CD')",
                "print Regexp.quote('*+?|')",
                "print Regexp.quote('=!><~')",
        };

        String[] outputs = {
                "ABCD",
                "\\(AB\\)CD",
                "\\[AB\\]CD",
                "\\{AB\\}CD",
                "\\*\\+\\?\\|",
                "=!><~",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_RegexpExpressionSubstitution() {
        String [] program_texts = {
                "print /^f#{}.*r#{   }$/ === 'foobar'",
                "a = 'f.*r'; print /^#{a}$/ === 'foobar'",
        };

        String[] outputs = {
                "true",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }


    public void test__FILE__() {
        String [] program_texts = {
                "print __FILE__",
        };

        String[] outputs = {
                "-",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test__LINE__() {
        String [] program_texts = {
                "print __LINE__  \n print __LINE__   \n\n   print __LINE__",
        };

        String[] outputs = {
                "124",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_StringExpressionSubstitution() {
        String [] program_texts = {
                "print \"\\n#{1}\\n\"",
                "print \"#{1}\" \"3\" \"#{2}\" ",
                "print \"abc#{}opq#{   }xyz\"",
                "$a=1;$b= 2;print \"abc#$a opq#$b xyz\"",
                "a=3;b= 4;print \"abc#{a}opq#{  b }xyz\"",
                "a=1;print \"abc#{a=a+1}\"; print a",
        };

        String[] outputs = {
                "\n1\n",
                "132",
                "abcopqxyz",
                "abc1 opq2 xyz",
                "abc3opq4xyz",
                "abc22",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_File() {
        File file = new File("test_File.txt");
        file.delete();
        assert(!file.exists());

        String [] program_texts = {
                "f = open('test_File.txt', 'w'); print f.class; print f.close",
        };

        String[] outputs = {
                "Filenil",
        };

        compile_run_and_compare_output(program_texts, outputs);

        assertTrue(file.exists());
        assertTrue(file.delete());
    }

    public void test_File_misc() {
        String [] program_texts = {
                "print File::SEPARATOR",
                "print File.join('usr', 'mail', 'gumby')",

                "print File.expand_path('sub', '//')",
                "print File.expand_path('/', 'c:/sub')",
                "print File.expand_path('/dir', '//machine/share/sub')",
                "print File.expand_path('../../bin', '/tmp/x')",
                "print File.expand_path('/', '//machine/share/sub')",
                "print File.expand_path('.', '//')",
                "print File.dirname('/')",
                "print File.basename('abc.rb', '.*')",
                "print File.basename('/')",
                "print File.dirname('/abc/def')",
                //Windows only "print File.expand_path('a', '/')",
        };

        String[] outputs = {
                "/",
                "usr/mail/gumby",
                "//sub",
                "c:/",
                "//machine/share/dir",
                "/bin",
                "//machine/share",
                "//",
                "/",
                "abc",
                "/",
                "/abc",
                //"C:/a",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_wrong_number_of_arguments() {
        String[] program_texts = {
                "def f(a = 0) end; f 5, 6, 7",
                "def f(a) end; f 1, 2",
                "def f() end; f 1",
                "def f(a) end; f",
                "def f(a, b, c) end; f(1)",
                "def f(a, b, c=2) end; f(1)",

                "def f(b); b.call(1);end;  f(lambda {||})",
                "def f(b); b.call(1, 2);end;  f(lambda {|x, y, z|})",
                "def f(b); b.call(1, 2);end;  f(lambda {|x, |})",

                "def getblock(&b); b; end;  res = getblock(&lambda{||});  res.call(1, 2)",

                "def f= x; print x;end;  alias test_wrong_number_of_arguments f=\n" +
                "module M; def test_wrong_number_of_arguments; end;end;  include M\n" +
                "test_wrong_number_of_arguments",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f': wrong number of arguments (3 for 1)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f': wrong number of arguments (2 for 1)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f': wrong number of arguments (1 for 0)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f': wrong number of arguments (0 for 1)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f': wrong number of arguments (1 for 3)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f': wrong number of arguments (1 for 2)"),

            new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (1 for 0)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (2 for 3)"),
            new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (2 for 1)"),

            new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (2 for 0)"),

            new RubyException(RubyRuntime.ArgumentErrorClass, "in `f=': wrong number of arguments (0 for 1)"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_default_argument() {
        String [] program_texts = {
                "def f(a = 5432) print a; end; f 666",
                "def f(a = 5432) print a; end; f",
                "def f(a = 111, b = 222) print a, b; end; f",
                "def f(a = 111, b = 222) print a, b; end; f 333",
                "def f(a = 111, b = 222) print a, b; end; f 333, 444",
                "def x; 99; end;  def f(a=x()) print a; end; f",
                "def f(a=x()) print a; end; print 'hi'; def x; print 'x';99; end;  f",
                "def f(a=x()) print a; end; print 'hi'; def x; print 'x';99; end;  f 88",
        };

        String[] outputs = {
                "666",
                "5432",
                "111222",
                "333222",
                "333444",
                "99",
                "hix99",
                "hi88",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_module() {
        String [] program_texts = {
                "module TestModule10;end\n" +
                "class TestModule10::TestModule11;end\n" +
                "print TestModule10::TestModule11",

                "module Kernel::A;end;print Kernel::A",
                "module M1;end; module M1::M2;print self;end",
                "module Kernel::M2;print self;end",
                "module TestModule; end; print TestModule.class",
                "module TestModule; end; print TestModule",
        };

        String[] outputs = {
                "TestModule10::TestModule11",

                "Kernel::A",
                "M1::M2",
                "Kernel::M2",
                "Module",
                "TestModule",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_include_module() {
        String [] program_texts = {
                "module Test1; module Test2; def test_include_3; print Test2; end; end; end\n" +
                "include Test1::Test2; test_include_3",

                "module TEST_CONSTANT_M; TEST_CONSTANT = 5; end\n" +
                "print(include(TEST_CONSTANT_M))\n" +
                "print TEST_CONSTANT",

                "module TestTopLevelIncludeModule\n" +
                "	def test_top_level_include_module\n" +
                "		print 77777\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "include TestTopLevelIncludeModule\n" +
                "test_top_level_include_module",

                "module TestTopLevelIncludeModule\n" +
                "	@@var = 100\n" +
                "	\n" +
                "	def test_top_level_include_module\n" +
                "		print @@var\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "include TestTopLevelIncludeModule\n" +
                "test_top_level_include_module",

                "module TestTopLevelIncludeModule1\n" +
                "	def g\n" +
                "		print \"B1\"\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "module TestTopLevelIncludeModule2\n" +
                "	def g\n" +
                "		print \"B2\"\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "include TestTopLevelIncludeModule1\n" +
                "include TestTopLevelIncludeModule2\n" +
                "g",

                "module TestTopLevelIncludeModule3\n" +
                "end\n" +
                "\n" +
                "include TestTopLevelIncludeModule3\n" +
                "\n" +
                "module TestTopLevelIncludeModule3\n" +
                "	def test_top_level_include_module2\n" +
                "		print 8765\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "test_top_level_include_module2",

                "module TestIncludeM; def f; print 7654; end; end\n" +
                "class TestIncludeC;  include TestIncludeM;  end\n" +
                "TestIncludeC.new.f",

                "module TestIncludeM2; def f; print 1234; end; end\n" +
                "class TestIncludeC2;  include TestIncludeM2; alias :g :f; end\n" +
                "TestIncludeC2.new.g",
        };

        String[] outputs = {
                "Test1::Test2",
                "Object5",
                "77777",
                "100",
                "B2",
                "8765",
                "7654",
                "1234",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_break_LocalJumpError() {
        String[] program_texts = {
                "a = Proc.new {break}; a.call",

                "def getblock(&b); b; end\n" +
                "res = getblock { break }\n" +
                "res.call",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.LocalJumpErrorClass, "break from proc-closure"),
            new RubyException(RubyRuntime.LocalJumpErrorClass, "break from proc-closure"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_include_wrong_type() {
        String[] program_texts = {
                "include 'x'",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type String (expected Module)"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_class_and_module_name_conflict() {
        String[] program_texts = {
                "module TestNameConflict;end; class  TestNameConflict;end",
                "class  TestNameConflict2;end; module TestNameConflict2;end;",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.TypeErrorClass, "TestNameConflict is not a class"),
            new RubyException(RubyRuntime.TypeErrorClass, "TestNameConflict2 is not a module"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_class_module_in_class_module() {
        String [] program_texts = {
                "module M; class Object; print 'another object'; end; end",

                "module ConstantInModule\n" +
                "	class C\n" +
                "		def f\n" +
                "			print \"MCf\"\n" +
                "		end\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "ConstantInModule::C.new.f",

                "class ConstantInModule2\n" +
                "	class C\n" +
                "		def f\n" +
                "			print \"MCf2\"\n" +
                "		end\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "ConstantInModule2::C.new.f",

                "TestM0 = 0\n" +
                "\n" +
                "module TestM1\n" +
                "  module TestM2\n" +
                "    module TestM3\n" +
                "     TestM4 = 1\n" +
                "     print TestM0,TestM1, TestM2, TestM3, TestM4\n" +
                "    end\n" +
                "  end\n" +
                "end",

                "module TestConst1\n" +
                "  module TestConst2\n" +
                "  end\n" +
                "end\n" +
                "\n" +
                "module TestConst1\n" +
                "  class TestConst3\n" +
                "    print TestConst2\n" +
                "  end\n" +
                "end",
        };

        String[] outputs = {
                "another object",
                "MCf",
                "MCf2",
                "0TestM1TestM1::TestM2TestM1::TestM2::TestM31",
                "TestConst1::TestConst2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_colon2_as_method_call() {
        String [] program_texts = {
                "module M; def M.colon2_as_method_call2 x; print x; end; end\n" +
                "M::colon2_as_method_call2 345",

                "def Object.test_colon2_as_method_call; print 'xxx'; end\n" +
                "Object::test_colon2_as_method_call",
        };

        String[] outputs = {
                "345",
                "xxx",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_constant_in_singletonmethod() {
        String [] program_texts = {
                "module M; N = 4; end\n" +
                "class << M\n" +
                "    N = 3\n" +
                "    print N\n" +
                "    def f\n" +
                "        print N\n" +
                "    end\n" +
                "end\n" +
                "M.f",

                "module M;end\n" +
                "class << M\n" +
                "    N = 3\n" +
                "    print N\n" +
                "end",

                "a='x';def a.f;print String;end;a.f",
        };

        String[] outputs = {
                "33",
                "3",
                "String",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_constant_in_class_module() {
        String [] program_texts = {
                "module TestConstant20; end\n" +
                "class << TestConstant20\n" +
                "    N =2\n" +
                "    def f(klass)\n" +
                "        class << klass\n" +
                "            print N\n" +
                "        end\n" +
                "    end\n" +
                "end\n" +
                "\n" +
                "module TestConstant21;end\n" +
                "TestConstant20.f TestConstant21",

                "TestConstant10=3\n" +
                "class TestConstant11\n" +
                "    TestConstant10=4\n" +
                "    def TestConstant11.f\n" +
                "        print TestConstant10\n" +
                "    end\n" +
                "end\n" +
                "TestConstant11.f",

                "module ConstantInModule; C6 = 6; def ConstantInModule.f; print C6; end; end; ConstantInModule.f",
                "print Object::Kernel",
                "TestConstant = 1999; print ::TestConstant",
                "::TestConstant0 = 9991; print ::TestConstant0",
                "module ConstantInModule; ABC = 123; end; print ConstantInModule::ABC",
                "C1 = 9;module TestConstant1;C1 = 10;print C1;end",
                "C2 = 9;module TestConstant2;C2 = 10;print ::C2;end",
                "C3 = 9;module TestConstant3;C3 = 11;print self::C3;end",
                "C4 = 8;module TestConstant4;print C4;end",

                "C5 = 5\n" +
                "class TestConstant5\n" +
                "	def f\n" +
                "		print C5\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "TestConstant5.new.f",
        };

        String[] outputs = {
                "2",
                "4",
                "6",
                "Kernel",
                "1999",
                "9991",
                "123",
                "10",
                "9",
                "11",
                "8",

                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_constant_in_module_exception() {
        String[] program_texts = {
                "Object::CONSTANT_IN_MODULE_EXCEPTION_YYY",
                "CONSTANT_IN_MODULE_EXCEPTION_XXX",
                "module ConstantInModuleException; end; ConstantInModuleException::NO_SUCH_CONST_XXX",
                "a=1; a::B",
                "ConstantInModuleException2=9; ConstantInModuleException2::B",
        };

        RubyException[] exceptions = {
                new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant CONSTANT_IN_MODULE_EXCEPTION_YYY"),
                new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant CONSTANT_IN_MODULE_EXCEPTION_XXX"),
                new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant ConstantInModuleException::NO_SUCH_CONST_XXX"),
                new RubyException(RubyRuntime.TypeErrorClass, "1 is not a class/module"),
                new RubyException(RubyRuntime.TypeErrorClass, "9 is not a class/module"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_initialize() {
        String [] program_texts = {
                "class TestInitialize\n" +
                "	def initialize\n" +
                "		print \"in initialize\"\n" +
                "	end\n" +
                "end\n" +
                "	\n" +
                "TestInitialize.new",

                "print String.new('xxx')",

                "class TestInitializeString < String; end; print TestInitializeString.new('yyy')",
        };

        String[] outputs = {
                "in initialize",

                "xxx",
                "yyy",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_attr() {
        String [] program_texts = {
                "class TestAttr; attr  :size, true; end; c = TestAttr.new; c.size= 5; print c.size",
        };

        String[] outputs = {
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_attr_reader() {
        String [] program_texts = {
                "class TestAttrReader\n" +
                "	attr_reader :a\n" +
                "\n" +
                "	def initialize\n" +
                "		@a = 5\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestAttrReader.new.a",

                "class TestAttrReader2\n" +
                "	attr_reader 'b'\n" +
                "\n" +
                "	def initialize\n" +
                "		@b = 6\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestAttrReader2.new.b",
        };

        String[] outputs = {
                "5",
                "6",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_attr_reader_exception() {
        String[] program_texts = {
                "module AttrReaderException; attr_reader 1; end",
        };

        RubyException[] exceptions = {
            new RubyException(RubyRuntime.TypeErrorClass, "1 is not a symbol"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_assignment_method() {
        String [] program_texts = {
                "class TestAssignmetMethod\n" +
                "	def a=(x)\n" +
                "		print \"fff\"\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "TestAssignmetMethod.new.a=4",
        };

        String[] outputs = {
                "fff",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_assignment_parameter() {
        String [] program_texts = {
                "def f x\n" +
                "	while x > 0\n" +
                "		x -= 1\n" +
                "		print x\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "f(5)",
        };

        String[] outputs = {
                "43210",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_attr_writer() {
        String [] program_texts = {
                "class TestAttrWriter\n" +
                "	attr_writer :a\n" +
                "\n" +
                "	def get_a\n" +
                "		@a\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "x = TestAttrWriter.new; x.a = 5; print x.get_a",
        };

        String[] outputs = {
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_attr_accessor() {
        String [] program_texts = {
                " class TestSingletonAttrAccessor\n" +
                "	@use_pp = true\n" +
                "	class << self; attr_accessor :use_pp; end\n" +
                "end\n" +
                "print TestSingletonAttrAccessor.use_pp",

                "class TestAttrAccessor\n" +
                "	attr_accessor :a\n" +
                "end\n" +
                "\n" +
                "x = TestAttrAccessor.new; x.a = 5; print x.a",
        };

        String[] outputs = {
                "true",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_kind_of() {
        String [] program_texts = {
                "print Kernel.kind_of?(Kernel)",
                "print(1.kind_of?(Object))",
                "print(1.kind_of?(Fixnum))",
                "print(1.kind_of?(Numeric))",
                "print(1.kind_of?(String))",
        };

        String[] outputs = {
                "true",
                "true",
                "true",
                "true",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_instance_of() {
        String [] program_texts = {
                "print(1.instance_of?(Object))",
                "print(1.instance_of?(Fixnum))",
                "print(1.instance_of?(Numeric))",
                "print(1.instance_of?(String))",
        };

        String[] outputs = {
                "false",
                "true",
                "false",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_respond_to() {
        String [] program_texts = {
                "print 1.respond_to?('to_s')",
                "print 1.respond_to?(:to_s)",
                "print 1.respond_to?('no_such_method_xxx')",
                "print 1.respond_to?(:no_such_method_xxx)",
                "print 1.respond_to?(:lambda, true)",
                "print 1.respond_to?(:lambda)",
        };

        String[] outputs = {
                "true",
                "true",
                "false",
                "false",
                "true",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_singleton_method() {
        String [] program_texts = {
                "module TestSingleton10;end\n" +
                "module TestSingleton11; end\n" +
                "class << TestSingleton11\n" +
                "    TestSingleton12=2\n" +
                "    def f\n" +
                "        class <<TestSingleton10\n" +
                "            print TestSingleton12\n" +
                "        end\n" +
                "    end\n" +
                "end\n" +
                "TestSingleton11.f",

                "module M; def M::colon2_singleton; print 'ppp'; end; end\n" +
                "M.colon2_singleton",

                "module M; def M.f x; print x; end end; M::f(77)",

                "class TestSingleton0;\n" +
                "	def TestSingleton0.test_singleton;  123;  end\n" +
                "end\n" +
                "\n" +
                "class TestSingleton1 < TestSingleton0; end\n" +
                "\n" +
                "print TestSingleton1.test_singleton",

                "a = 'x'; def a.ffff; print 9521 end; a.ffff",

                "class TestSingletonClass; end\n" +
                "def TestSingletonClass.new_method;print 4321;end\n" +
                "TestSingletonClass.new_method\n",

                "class Class < Module\n" +
                "	def test_meta\n" +
                "		print \"Test meta\"\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "Module.test_meta",
        };

        String[] outputs = {
                "2",
                "ppp",
                "77",
                "123",
                "9521",
                "4321",
                "Test meta",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_singleton_method_exception() {
        String [] program_texts = {
                "class TestSingleton2; end\n" +
                "class TestSingleton3 < TestSingleton2;\n" +
                "	def TestSingleton3.f;  123;  end\n" +
                "end\n" +
                "\n" +
                "print TestSingleton2.f",
        };

        RubyException[] exceptions = {
                //TODO message should be "undefined method `f' for TestSingleton2:Class"
                new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'f' for Class"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_if_unless_modifier() {
        String [] program_texts = {
                "print 123 if true",
                "print 123 if false",
                "print 456 unless false",
                "print 456 unless true",
                "print 1 if true if true",
        };

        String[] outputs = {
                "123",
                "",
                "456",
                "",
                "1",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_send() {
        String [] program_texts = {
                "print 'xx'.send(:length)",
                "print 1.__send__('+', 2)",
        };

        String[] outputs = {
                "2",
                "3",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_method_parameter_assignment() {
        String [] program_texts = {
                "def f x=1; x = 4; print x;end; f",
                "def f x; x = 3; print x;end; f 1",
        };

        String[] outputs = {
                "4",
                "3",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_method_and_call() {
        String [] program_texts = {
                "m = 'xx'.method(:length); print m.call",
                "m = 1.method('+'); print m.call(2)",
                "m = 1.method('+'); print m",

                "1.times {def f; print self; end}; f ",
        };

        String[] outputs = {
                "2",
                "3",
                "#<Method: Fixnum#+>",

                "main",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Kernel_methods() {
        String [] program_texts = {
                "print 1.methods.include?('methods')",
                "print 1.methods.include?('no_such_method_xxxx')",
        };

        String[] outputs = {
                "true",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_implicit_hash() {
        String [] program_texts = {
                "def f a; print a.class, a['a'], a['b']; end\n" +
                "f 'a' => 1, 'b' => 2",
        };

        String[] outputs = {
                "Hash12",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_block_arg() {
        String [] program_texts = {
                "def bar(&blk); blk.call([:key, :value]);end\n" +
                "bar{|k,v| print k, v}",

                "def f(x, &block); if x; block = 1; end;   print block;  end;  f true",

                "def f(x); x; end;  print f(33, &nil)",

                "def f; yield; end\n" +
                "def g1 &arg; f &arg; end\n" +
                "g1 {print 321}",

                "def f\n" +
                "	yield 222, 333\n" +
                "end\n" +
                "\n" +
                "def g2 &arg\n" +
                "	f &arg\n" +
                "end\n" +
                "\n" +
                "g2 {|x, y| print x, y}",

                "def f &arg; print arg.class; end;   f {}",
                "def f &arg; print arg.class; end;   f",
                "def f(&arg); arg.call; end;   f {print 123}",
                "def f(&arg); arg.call(345); end;   f {|x| print x}",


        };

        String[] outputs = {
                "keyvalue",

                "1",
                "33",

                "321",
                "222333",

                "Proc",
                "NilClass",
                "123",
                "345",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_super() {
        String [] program_texts = {
        		"class TestSuper31; def f; 9; end; end\n" +
        		"class TestSuper32 < TestSuper31; def f; super.to_i; end; end\n" +
        		"print TestSuper32.new.f",
        		
                "class TestSuper21;def f x, y;print x + y; end;end\n" +
                "class TestSuper22 < TestSuper21; def f(x, y); super x, y;end; end\n" +
                "TestSuper22.new.f 3, 2",

                "def f(x, y); super x;end",

                "class TestSuper11;def f x;print x; end;end\n" +
                "class TestSuper12 < TestSuper11; def f(); super 1;end; end\n" +
                "TestSuper12.new.f",

                "class TestSuper1; def f; 2 end; end\n" +
                "class TestSuper2 < TestSuper1; def f; 1.times {return super} end end\n" +
                "print TestSuper2.new.f",

                "class TestSuper1; def f x; x end; end\n" +
                "class TestSuper2 < TestSuper1; def f x; 1.times {return super} end end\n" +
                "print TestSuper2.new.f(3)",

                "def f *x; print x; end\n" +
                "class TestSuper3;def f *x; 1.times {super} ; end;end\n" +
                "TestSuper3.new.f 2, 3",

                "class C; def initialize x = 1; super(); print x; end; end; C.new",

                "class TestSuperSingleton;  def TestSuperSingleton.f x; print x; end;  end\n" +
                "class TestSuperSingleton2 < TestSuperSingleton;  def TestSuperSingleton2.f x; super; end;  end\n" +
                "TestSuperSingleton2.f 456",

                "class TestSuperImplicitParameter\n" +
                "  def print x\n" +
                "    super\n" +
                "  end\n" +
                "end\n" +
                "\n" +
                "TestSuperImplicitParameter.new.print 333",

                "class TestSuper8\n" +
                "	def test_super\n" +
                "		print 123\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestSuper9 < TestSuper8\n" +
                "	def test_super\n" +
                "		super\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestSuper10 < TestSuper9\n" +
                "end\n" +
                "\n" +
                "TestSuper10.new.test_super",

                "class MyString < String\n" +
                "	def to_s\n" +
                "		super\n" +
                "	end\n" +
                "end\n" +
                "print MyString.new(\"xxx\").to_s",

                "class TestSuper1\n" +
                "	def f\n" +
                "		yield\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestSuper2 < TestSuper1\n" +
                "	def f\n" +
                "		super\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "TestSuper2.new.f {print \"yyy\"}",

                "class TestSuper3\n" +
                "	def f\n" +
                "		yield\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestSuper4 < TestSuper3\n" +
                "	def f\n" +
                "		super {print \"zzz\"}\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "TestSuper4.new.f",

                "class TestSuper5\n" +
                "	def f\n" +
                "		print 321\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "class TestSuper6 < TestSuper5\n" +
                "end\n" +
                "\n" +
                "class TestSuper7 < TestSuper6\n" +
                "	def f\n" +
                "		super\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "TestSuper7.new.f",

        };

        String[] outputs = {
        		"9",
                "5",
                "",
                "1",
                "2",
                "3",
                "23",
                "1",
                "456",
                "333",
                "123",
                "xxx",
                "yyy",
                "zzz",
                "321",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_heredoc_expression_substitution() {
        String [] program_texts = {
                "print <<EOF\n" +
                "x#{456}y\n" +
                "EOF\n",

                "print <<EOF, 9\n" +
                "x#{456}y\n" +
                "EOF\n",

                "print <<EOF, 9\n" +
                "x#{456}y\n" +
                "EOF\n" +
                "print 8\n",

                /*TODO
                "print 1, <<EOF1, 2, <<EOF2, 3\n" +
                "#{print 2}\n" +
                "EOF1\n" +
                "#{print 5}\n" +
                "EOF2\n",
                */
        };

        String[] outputs = {
                "x456y\n",
                "x456y\n9",
                "x456y\n98",

                //"251\n2\n3\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_heredoc() {
        String [] program_texts = {
                "print <<EOF\n" +
                "A\\#{\n" +
                "EOF\n",

                "print <<END;\n" +
                "ABCD\n" +
                "END\n",

                "print <<EOF\n" +
                "hey\n" +
                "EOF\n",

                "print <<EOF\n" +
                "  hey\n" +
                "EOF\n",

                "print <<-EOF\n" +
                "   hey\n" +
                " EOF\n",

                "print <<-EOF + 'xxx'\n" +
                "  hey\n" +
                " EOF\n",

                "print(<<EOF)\n" +
                " eee\n" +
                "EOF\n",

                "print <<-EOF + \"#{'yyy'}\"\n" +
                "  hey\n" +
                " EOF\n",
        };

        String[] outputs = {
                "A#{\n",
                "ABCD\n",

                "hey\n",
                "  hey\n",
                "   hey\n",

                "  hey\n" +
                "xxx",

                " eee\n",

                "  hey\n" +
                "yyy",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_multiple_heredoc() {
        String [] program_texts = {
                "print <<EOF, 99, <<EOA\n" +
                " hey\n" +
                "EOF\n" +
                " there\n" +
                "EOA\n",

                "print <<-EOF, 99, <<-EOA\n" +
                " hello\n" +
                "  EOF\n" +
                " there\n" +
                "  EOA\n",

                "print <<-EOF + 'xxx' + <<-EOA\n" +
                " hello\n" +
                "  EOF\n" +
                " there\n" +
                "  EOA\n",

                "print <<-EOF + String.new('yyy') + <<-EOA\n" +
                " hello\n" +
                "  EOF\n" +
                " there\n" +
                "  EOA\n",
        };

        String[] outputs = {
                " hey\n" +
                "99 there\n",

                " hello\n" +
                "99 there\n",

                " hello\n" +
                "xxx there\n",

                " hello\n" +
                "yyy there\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_class_left_shift() {
        String [] program_texts = {
                "a = \"\"\n" +
                "class <<a\n" +
                "	def f\n" +
                "		99\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print a.f",

                "class TestClassLeftShift\n" +
                "	class << self\n" +
                "		def f\n" +
                "			88\n" +
                "		end\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestClassLeftShift.f",

                "class TestClassLeftShift\n" +
                "	class << TestClassLeftShift\n" +
                "		def f\n" +
                "			77\n" +
                "		end\n" +
                "	end\n" +
                "end\n" +
                "\n" +
                "print TestClassLeftShift.f",
        };

        String[] outputs = {
                "99",
                "88",
                "77",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_IO_gets() {

        RubyIO out = ObjectFactory.createFile("test_IO_gets.txt", "w");
        out.print("line 1\n");
        out.print("line 2");
        out.close();

        String [] program_texts = {
                "f = open(\"test_IO_gets.txt\"); print f.gets(nil); f.close",
                "f = open(\"test_IO_gets.txt\"); print f.gets; f.close",
                "f = open(\"test_IO_gets.txt\"); print f.gets; print f.gets; print f.gets; f.close",

                "f = open(\"test_IO_gets.txt\"); print f.gets; print $_; f.close",
        };

        String[] outputs = {
                "line 1\nline 2",
                "line 1\n",
                "line 1\nline 2\nnil",//TODO should be "line 1\nline 2nil", IO#gets should be fixed

                "line 1\nline 1\n",
        };

        compile_run_and_compare_output(program_texts, outputs);

        File f = new File("test_IO_gets.txt");
        assertTrue(f.delete());
    }

    public void test_IO_eof() throws IOException {
        File f = new File("test_IO_eof.txt");
        PrintWriter out = new PrintWriter(new FileWriter(f));
        out.print("line 1\n");
        out.print("line 2");
        out.close();

        String [] program_texts = {
                "f = open(\"test_IO_eof.txt\"); f.gets(nil); print f.eof?; f.close",
                "f = open(\"test_IO_eof.txt\"); print f.eof; f.close",
        };

        String[] outputs = {
                "true",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);

        assertTrue(f.delete());
    }

    public void test_IO_misc() {
        String [] program_texts = {
                "$stdout << 'Hello ' << 'world!'",
        };

        String[] outputs = {
                "Hello world!",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_string_match() {
        String [] program_texts = {
                "\"abcabc\" =~ /.*a/; print $&, $&.class",
                "print \"\" =~ /^$/",
                "print \"a\\n\\n\" =~ /^$/",
                "print '123' !~ 123",
                "print '123' =~ 123",
                "print \"cat o' 9 tails\" =~ /\\d/",
                "print \"cat o' 9 tails\" =~ /abc/",
        };

        String[] outputs = {
                "abcaString",
                "0",
                "2",
                "true",
                "false",
                "7",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_W_ARRAY() {
        String [] program_texts = {
                "p %w$a b c$",
                "p %w{ a b c }",
        };

        String[] outputs = {
                "[\"a\", \"b\", \"c\"]\n",
                "[\"a\", \"b\", \"c\"]\n",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_String_misc() {
        String [] program_texts = {
        		"print 'xyz'.to_f",
                "print('a'.sub!(/#{'a'}/i, 'b'))",
                "print 'Tuesday, July'.gsub!(/[^-+',.\\/:0-9@a-z\\x80-\\xff]+/i, ' ')",

                "'cruel world'.scan(/\\w+/) {|w| print \"<<#{w}>>\"}",
                "'cruel world'.scan(/(.)(.)/) {|x,y| print y, x }",
                "'cruel world'.scan(/(.)(.)/) {|x,y| print $&}",

                "print('%27Stop%21%27'.gsub(/((?:%[0-9a-fA-F]{2})+)/n) {'x'})",
                "print '%21%27'.delete('%')",
                "print 'aaBBcc'.delete!('a-z')",
                "print '  abcd  '.lstrip!",
                "print %q{location:1 in 'l'}.sub(/\\A(.+:\\d+).*/, ' [\\\\1]')",
                "print 'a.gif'.sub(/.*\\.([^\\.]+)$/, '<\\&>')",
                "print 'a.gif'.sub(/.*\\.([^\\.]+)$/, 'a\\2b')",
                "print 'a.gif'.sub(/.*\\.([^\\.]+)$/, '\\1')",

                "print '%05d' % 123",
                "print '%s:%s' % [ 'a', 'b' ]",
                "print '0x0a'.hex",
                "print 'xxxx'.hex",
                "print 'pp'[-3..-1]",
                "print 'hello  world'.count('lo')",
                "print 'abaca'.tr('a', 'z')",
                "print \"\\na\\nb\\n\".tr(\"\\n\", ' ')",
                "print 'xxx'.strip, 'xxx'.strip!, ' xxx '.strip, 'yyy '.strip!",
                "a = 'a'; print a << 'b', a",
                "print 'complex.rb'[-3..-1]",
                "print 'complex.rb'[-3, -1]",
                "print 'yyy'.inspect",
                "p 'xxx'",

                "print ''.empty?, 'x'.empty?",
                "print 'x'[-1]",
                "print 'x'[2]",
                "print \"\\#\".length",

                "print 'abcd'.delete('bc')",

                "print 'abcc'.squeeze!('a-z')",

                "print 'aaaabbcddd'.tr_s!('a-z', 'A-Z')",

                "print 'abc'.tr!('a-z', 'A-Z')",
                "print 'hello'.tr('a-y', 'b-z')",

                "print 'stressed'.reverse",
                "print 'stressed'.reverse!",
        };

        String[] outputs = {
        		"0.0",
                "b",
                "Tuesday, July",

                "<<cruel>><<world>>",
                "rceu lowlr",
                "cruel worl",

                "xStopx",
                "2127",
                "BB",
                "abcd  ",
                " [location:1]",
                "<a.gif>",
                "ab",
                "gif",

                "00123",
                "a:b",
                "10",
                "0",
                "nil",
                "5",
                "zbzcz",
                " a b ",
                "xxxnilxxxyyy",
                "abab",
                ".rb",
                "nil",
                "\"yyy\"",
                "\"xxx\"\n",

                "truefalse",
                "120",
                "nil",
                "1",

                "ad",

                "abc",

                "ABCD",

                "ABC",
                "ifmmp",

                "desserts",
                "desserts",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_gsub() {
        String [] program_texts = {
                "print 'abca'.gsub('a', 'c')",
                "print 'abca'.sub('a', 'c')",

                "$_ = 'quick brown fox'; gsub /[aeiou]/, '*'; print $_",
                "$_ = 'quick brown fox'; print gsub /[aeiou]/, '&'",
                "$_ = 'quick brown fox'; print $_.gsub /[aeiou]/, '-'",
                "$_ = 'quick brown fox'; print gsub! /cat/, '*'; print $_",
                "$_ = 'quick brown fox'; print($_.gsub!(/cat/, '-')); print $_",

                "print 'ABCD\nABCDE'.gsub!(/((.|\n)*?)B((.|\n)*?)D/){$3}",
                "'hello'.gsub(/./) {|s| print s + ','}",
                "print 'hello'.gsub(/./) {|s| s + ' '}",
        };

        String[] outputs = {
                "cbcc",
                "cbca",

                "q**ck br*wn f*x",
                "q&&ck br&wn f&x",
                "q--ck br-wn f-x",
                "nilquick brown fox",
                "nilquick brown fox",

                "CCE",
                "h,e,l,l,o,",
                "h e l l o ",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_String_scan() {
        String [] program_texts = {
                "p 'cruel world'.scan(/\\w+/) ",
                "print 'cruel world'.scan(/(..)(..)/) == [['cr', 'ue'], ['l ', 'wo']]",
                "print '1a2b3c'.scan(/(\\d.)/) == [['1a'], ['2b'], ['3c']]",
        };

        String[] outputs = {
                "[\"cruel\", \"world\"]\n",
                "true",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_String_chmop() {
        String [] program_texts = {
                "print 'hello\n'.chomp",
                "print 'hello'.chomp!('llo')",
                "print 'a'.chomp!('=')",
                "print 'a'.chomp('=')",
        };

        String[] outputs = {
                "hello",
                "he",
                "nil",
                "a",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_String_split() {
        String [] program_texts = {
                "a = ' a  b c   '.split(' '); print a, a.size",
                "a = ' a  b c   d'.split; print a, a.size",
                "a = ' the time'.split(//); print a, a.size",
                "print (' the time'.split)",

                "print ('abc de b,sf cde'.split(/ /).length)",
                "print ('abc de b,sf cde'.split(/ /, 2).length)",
                "print ('abc de b,sf cde'.split(/ ,/).length)",
                "print ('abc de b,sf cde'.split(/ ,/, 2).length)",
                "print ('abc de b,sf cde'.split(/[ ,]/).length)",
                "print ('abc de b,sf cde'.split(/[ ,]/, 2).length)"
        };

        String[] outputs = {
                "abc3",
                "abcd4",
                " the time9",
                "thetime",

                "4",
                "2",
                "1",
                "1",
                "5",
                "2"
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_for_in() {
        String [] program_texts = {
                "   sum=0\n" +
                "    for i in 1..10\n" +
                "      sum += i\n" +
                "      i -= 1\n" +
                "      print i\n" +
                "      if i > 0\n" +
                "        redo\n" +
                "      end\n" +
                "  end",

                "for x, (y, z) in [1, [2, [3, 4]]]; print x,y,z; end",

                "for i_test_for_in in 1..1; j_test_for_in=3; end; print i_test_for_in, j_test_for_in",

                "for i in 1..5 do print i end",
                "for i in 1..5 do print i end; print i",

                "for x, y in {1=>2} do print x, y end",
        };

        String[] outputs = {
                "0102103210432105432106543210765432108765432109876543210",
                "1nilnil234",

                "13",

                "12345",
                "123455",

                "12",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Marshal() {
        String [] program_texts = {
                "StrClone=String.clone; print Marshal.load(Marshal.dump(StrClone.new('abc'))).class",
                "StrClone=String.clone; print Marshal.dump(StrClone.new('abc')) == \"\004\\bC:\\rStrClone\\\"\\babc\"",
                "print Marshal.load(Marshal.dump(:hello))",
                "print Marshal.load(Marshal.dump(265252859812191058636308480000000))",
                "print Marshal.load(Marshal.dump(12345678900))",

                "str = Marshal.dump('thing'); print str.class",
                "str = Marshal.dump('thing'); print str[0], str[1]",
                "str = Marshal.dump(0); print str.length, str[3]",
                "str = Marshal.dump(5); print str.length, str[3]",
                "str = Marshal.dump('thing'); print str == \"\\x04\\x08\\\"\\nthing\"",
                "str = Marshal.dump([1, 3]); print str == \"\\x04\\x08[\\x07i\\x06i\\x08\"",
                "str = Marshal.dump({1 => 3}); print str == \"\\x04\\x08{\\x06i\\x06i\\x08\"",
                "str = Marshal.dump(0x99_99_99_99_99_99); print str[2], '|', str[3], '|', str[4]",

                "print Marshal.load(Marshal.dump(nil))",
                "print Marshal.load(Marshal.dump(true))",
                "print Marshal.load(Marshal.dump(false))",
                "print Marshal.load(Marshal.dump(0))",
                "print Marshal.load(Marshal.dump(1))",
                "print Marshal.load(Marshal.dump('hello'))",
                "print Marshal.load(Marshal.dump([0, 1, 2]))",
                "print Marshal.load(Marshal.dump({4 => 5}))",
                "print Marshal.load(Marshal.dump(2.5))",
        };

        String[] outputs = {
                "StrClone",
                "true",
                "hello",
                "265252859812191058636308480000000",
                "12345678900",

                "String",
                "48",
                "40",
                "410",
                "true",
                "true",
                "true",
                "108|43|8",

                "nil",
                "true",
                "false",
                "0",
                "1",
                "hello",
                "012",
                "45",
                "2.5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Math() {
        String [] program_texts = {
                "print Math.exp(1).class",
                "print Math.exp(1.1).class",
                "print Math.sqrt(4)",
                "print Math.sqrt(9)",
        };

        String[] outputs = {
                "Float",
                "Float",
                "2.0",
                "3.0",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_ARGV() {
        String [] program_texts = {
                "print ARGV[0], ARGV[1]",
        };

        String[] outputs = {
                "my_argnil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_compare() {
        String [] program_texts = {
                "print String >= String, String >= Object, Object >= String",

                "print String < Module",
                "print Object < String",
                "print String < Object",
                //TODO"print String < Kernel",
                //TODO"print Kernel < String",

                "print String <=> 123",
                "print String <=> String",
                "print String <=> Object",
                "print Object <=> String",
                "print Array <=> String",
        };

        String[] outputs = {
                "truefalsetrue",
                "nil",
                "false",
                "true",
                //"true",
                //"false",

                "nil",
                "0",
                "-1",
                "1",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_module_eval() {
        String [] program_texts = {
                "class TestModuleEval; end\n" +
                "TestModuleEval.module_eval(%q{def test_module_eval() 123 end})\n" +
                "print TestModuleEval.new.test_module_eval",

                "class TestModuleEval2; end\n" +
                "TestModuleEval2.module_eval('print self')",
        };

        String[] outputs = {
                "123",
                "TestModuleEval2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_class_eval() {
        String [] program_texts = {
                "class TestClassEval; def f() 1 end end\n" +
                "TestClassEval.class_eval do def f() 2 end end\n" +
                "print TestClassEval.new.f",
        };

        String[] outputs = {
                "2",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Kernel_instance_eval() {
        String [] program_texts = {
                "'x'.instance_eval { print self }",
        };

        String[] outputs = {
                "x",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_const_set_get() {
        String [] program_texts = {
                "module M end\n" +
                "print M.const_set(:TEST_CONSTANT1, 1)\n" +
                "print M::TEST_CONSTANT1\n" +
                "print M.const_get(:TEST_CONSTANT1)\n" +
                "print M.const_set('TEST_CONSTANT2', 2)\n" +
                "print M::TEST_CONSTANT2",
        };

        String[] outputs = {
                "11122",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_misc() {
        String [] program_texts = {
                "class TestInstanceMethods; protected; def test_instance_methods; end; private; def x; end; end\n" +
                "a = TestInstanceMethods.instance_methods(false)\n" +
                "p a",

                "class TestProtectedInstanceMethods; protected; def test_protected_instance_methods; end; end\n" +
                "a = TestProtectedInstanceMethods.protected_instance_methods(false)\n" +
                "p a",

                "class TestPrivateInstanceMethods; private; def test_private_instance_methods; end; end\n" +
                "a = TestPrivateInstanceMethods.private_instance_methods(false)\n" +
                "p a",

                "class TestPublicInstanceMethods; def test_public_instance_methods; end; end\n" +
                "a = TestPublicInstanceMethods.public_instance_methods(false)\n" +
                "p a",

                "class TestPublicInstanceMethods2; def test_public_instance_methods2; end; end\n" +
                "a = TestPublicInstanceMethods2.public_instance_methods(true)\n" +
                "print a.include?('test_public_instance_methods2')",

                "module TestModuleFunction\n" +
                "  def test_module_function; print 123; end\n" +
                "  module_function :test_module_function\n" +
                "end\n" +
                "TestModuleFunction.test_module_function",
        };

        String[] outputs = {
                "[\"test_instance_methods\"]\n",
                "[\"test_protected_instance_methods\"]\n",
                "[\"test_private_instance_methods\"]\n",
                "[\"test_public_instance_methods\"]\n",
                "true",
                "123",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_ancestors() {
        String [] program_texts = {
                "module Testancestors; end; print Testancestors.ancestors",
                "module Testancestors0; end; print Testancestors0.ancestors[0].class",
                "module Testancestors1; end; module Testancestors2; include Testancestors1; end; print Testancestors2.ancestors",
                "module TA1; end; module TA2; include TA1; end; module TA3; include TA2; end; print TA3.ancestors",
        };

        String[] outputs = {
                "Testancestors",
                "Module",
                "Testancestors2Testancestors1",
                "TA3TA2TA1",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_clone_dup() {
        String [] program_texts = {
                "b ='b'; c= b.dup; c[0]='c'; print b, c",

                "StrClone=String.clone; print StrClone.class, StrClone == String, StrClone.new('abc').class",

                "a = Object.new\n" +
                "def a.test_clone\n" +
                "	print \"clone\"\n" +
                "end\n" +
                "b = a.clone\n" +
                "b.test_clone",
        };

        String[] outputs = {
                "bc",
                "ClassfalseStrClone",
                "clone",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_clone_exception() {
        String [] program_texts = {
                "a = Object.new\n" +
                "b = a.clone\n" +
                "def b.test_clone_exception\n" +
                "	print \"clone\"\n" +
                "end\n" +
                "a.test_clone_exception",
        };

        RubyException[] exceptions = {
                new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method 'test_clone_exception' for Object"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_TRUE_FALSE_NIL() {
        String [] program_texts = {
                "print TRUE, FALSE, NIL",
        };

        String[] outputs = {
                "truefalsenil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Kernel_throw() {
        String [] program_texts = {
                "throw\n",
                "throw 123\n",
                "throw :test_throw",

                "print catch(:test_cacth) {throw :xxx, 5; print 2}",
        };

        RubyException[] exceptions = {
                new RubyException(RubyRuntime.ArgumentErrorClass, "in `throw': wrong number of arguments (0 for 1)"),
                new RubyException(RubyRuntime.ArgumentErrorClass, "123 is not a symbol"),
                new RubyException(RubyRuntime.NameErrorClass, "uncaught throw `test_throw'"),
                new RubyException(RubyRuntime.NameErrorClass, "uncaught throw `xxx'"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_Kernel_catch() {
        String [] program_texts = {
                "print catch(:test_cacth) {}",
                "print catch(:test_cacth) {print 2}",
                "print catch(:test_cacth) {throw :test_cacth; print 2}",
                "print catch(:test_cacth) {throw :test_cacth, 5; print 2}",
        };

        String[] outputs = {
                "nil",
                "2nil",
                "nil",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_trace_var_exception() {
        String [] program_texts = {
                "untrace_var\n",
                "untrace_var 123\n",
                "untrace_var :test_untrace_var",
                "untrace_var :$test_untrace_var",

                "trace_var :$test_untrace_var",
        };

        RubyException[] exceptions = {
                new RubyException(RubyRuntime.ArgumentErrorClass, "in `untrace_var': wrong number of arguments (0 for 1)"),
                new RubyException(RubyRuntime.ArgumentErrorClass, "123 is not a symbol"),
                new RubyException(RubyRuntime.NameErrorClass, "undefined global variable test_untrace_var"),
                new RubyException(RubyRuntime.NameErrorClass, "undefined global variable $test_untrace_var"),

                new RubyException(RubyRuntime.ArgumentErrorClass, "tried to create Proc object without a block"),
        };

        compile_run_and_catch_exception(program_texts, exceptions);
    }

    public void test_trace_var() {
        String [] program_texts = {
                "trace_var (:$test_trace_var1) {print $test_trace_var1;}; $test_trace_var1 = 5",
                "trace_var (:$test_untrace_var2) {print $test_untrace_var2;}; trace_var (:$test_untrace_var2) {print 2;};$test_untrace_var2 = 5",
                "trace_var (:$test_untrace_var3) {|x| print x}; $test_untrace_var3 = 6; untrace_var :$test_untrace_var3; $test_untrace_var3 = 7",
                "trace_var(:$test_trace_var4) {$test_trace_var4 = 9}; $test_trace_var4 = 8;  print $test_trace_var4",
        };

        String[] outputs = {
                "5",
                "25",
                "6",
                "9",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_block_given() {
        String [] program_texts = {
                "def f; 1.times {print block_given?}; end; f {}",

                "def f; print block_given?; end; f &nil",

                "def try\n" +
                "	if block_given?\n" +
                "		print true\n" +
                "	else\n" +
                "		print false\n" +
                "	end\n" +
                "end\n" +
                "try\n" +
                "try { \"hello\" }\n" +
                "try do \"hello\" end",

                "print iterator?",
        };

        String[] outputs = {
                "true",
                "false",
                "falsetruetrue",
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Method_to_proc() {
        String [] program_texts = {
                "method(:print).to_proc.call(\"xxx\")",

                "class TestToProc; def test_to_proc; print self.class; end; end\n" +
                "TestToProc.new.method(:test_to_proc).to_proc.call",
        };

        String[] outputs = {
                "xxx",
                "TestToProc",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Module_case_equal() {
        String [] program_texts = {
                "print NilClass === true",
                "print NilClass === nil",
                "print Object === true",
                "print Math === nil",
                "print Kernel === nil",
        };

        String[] outputs = {
                "false",
                "true",
                "true",
                "false",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_new() {
        String [] program_texts = {
            "class MyString < String; end;print MyString.new.class",
            "class MyHash < Hash; end;print MyHash.new.class",
            "class MyArray < Array; end;print MyArray.new.class",
        };

        String[] outputs = {
            "MyString",
            "MyHash",
            "MyArray",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Struct_new() {
        String [] program_texts = {
                "Customer = Struct.new(:name, :address);a = Customer.new('Dave', '123 Main');print a.class,a.name",
                "Struct.new('TestStructNew6', :name); a = Struct::TestStructNew6.new('ppp'); a[0] = 'ooo'; print a.name",
                "Struct.new('TestStructNew5', :name); a = Struct::TestStructNew5.new('zzz'); print a.to_a, a.to_a.class",
                "Struct.new('TestStructNew4', :name); a = Struct::TestStructNew4.new('yyy'); print a[0]",
                "Struct.new('TestStructNew3', :name); a = Struct::TestStructNew3.new('xxx'); print a.class",
                "Struct.new('TestStructNew2', :name); a = Struct::TestStructNew2.new('xxx'); print a.name",
                "c= Struct.new('TestStructNew0'); print c.class",
                "Struct.new('TestStructNew1'); print Struct::TestStructNew1",

        };

        String[] outputs = {
                "CustomerDave",
                "ooo",
                "zzzArray",
                "yyy",
                "Struct::TestStructNew3",
                "xxx",
                "Class",
                "Struct::TestStructNew1",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Proc_new() {
        String [] program_texts = {
                "p = proc{test_proc = 0; proc{test_proc}}.call; test_proc=7; print p.call",
                "test_proc4 = 0; p = proc{test_proc4}; test_proc4=7; print p.call",

                "test_proc5 = 6; p=proc{test_proc5=77}; p.call; print test_proc5",
                "test_proc3 = 6; proc{test_proc3=55}.call; print test_proc3",
                "p = proc{test_proc2=55}; test_proc2 = 6;  p.call; print test_proc2",

                "x = []; (0..9).each{|i5| x[i5] = proc{i5*2}}; print x[4].call",

                "def f\n" +
                "  Proc.new{return 1}.call()\n" +
                "  print 2\n" +
                "end\n" +
                "\n" +
                "print f",

                "def f\n" +
                "  lambda{return 1}.call()\n" +
                "  print 2\n" +
                "end\n" +
                "\n" +
                "print f",

                "print Proc.new{|a,| a}.call(4,5,6)",

                "class Proc\n" +
                "  alias :callxxx :call\n" +
                "end\n" +
                "\n" +
                "def f\n" +
                "  Proc.new{return 5}.callxxx\n" +
                "  print 2\n" +
                "end\n" +
                "\n" +
                "print f",
        };

        String[] outputs = {
                "0",
                "7",

                "77",
                "55",
                "6",
                "8",
                "1",
                "2nil",
                "4",
                "5",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_return_value_of_def() {
        String [] program_texts = {
                "a = def f; end; print a",
                "print eval('def f; end')",
        };

        String[] outputs = {
                "nil",
                "nil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_pack() {
        String [] program_texts = {
                "print [97, 98].pack('UU')",
                "print [\"abcd\"].pack('x3a4').length",
                "print [-1].pack('s_')[0]",
                "print [-32767].pack('s_')[1]",
                "print [-123456].pack('l_')[0]",
                "print [987.654321098 / 100.0].pack('i1')[0]",
                "print [987].pack('d')[5]",
                "print [32767].pack('s')[0]",
                "print [-100].pack('c')[0]",
                "print [128].pack('C')[0]",
                "print ['abcdef'].pack('a6')",
                "print [127,128].pack('CC') == \"\177\200\"",
        };

        String[] outputs = {
                "ab",
                "7",
                "255",
                "128",
                "192",
                "9",
                "216",
                "255",
                "156",
                "128",
                "abcdef",
                "true",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_unpack() {
        String [] program_texts = {
                "print \"\377\377\377\377\".unpack('N*')",
                "print 'ab'.unpack('UU')",
                "print \">a\221E\312\300\\#@\".unpack('d')",
                "print \"\000\000\000abcd\".unpack('x3a4')",
                "print \"90\000\000\".unpack('i')",
                "print \"@\342\001\000\".unpack('l')",
                "print \"\001\200\".unpack('s_')",
                "print \"\300\035\376\377\".unpack('l_')",
                "print \"abcdef\".unpack('a6')",
                "print \"\000\000\000\000\000\".unpack('x5')",
                "print \"\001\234\".unpack('c2')",
                "print \"\200\".unpack('C')",
        };

        String[] outputs = {
                "4294967295",
                "9798",
                "9.87654321098",
                "abcd",
                "12345",
                "123456",
                "-32767",
                "-123456",
                "abcdef",
                "",
                "1-100",
                "128",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_method_missing() {
        String[] program_texts = {
                "alias old_method_missing method_missing\n" +
                "def method_missing a, *arg; print a; end\n" +
                "no_such_method_xxx\n" +
                "alias method_missing old_method_missing",

                "alias old_method_missing method_missing\n" +
                "def method_missing a, *arg; print a.class, arg; end\n" +
                "no_such_method_xxx 1, 2\n" +
                "alias method_missing old_method_missing",
        };

        String[] outputs = {
                "no_such_method_xxx",
                "Symbol12",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_ENV() {
        String[] program_texts = {
                "print ENV, ENV.class",
                "ENV['a'] = 'b';print ENV['a']\n" +
                "ENV.delete 'a';print ENV['a']",
        };

        String[] outputs = {
                "ENVObject",
                "bnil",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Numeric_step() {
        String[] program_texts = {
                "1.step(10, 2) { |i| print i }",
                "4.step(0,-1) {|x| print x}",
        };

        String[] outputs = {
                "13579",
                "43210",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Thread() {
        String[] program_texts = {
                "Thread.current[\"name\"] = \"A\";\n" +
                "print Thread.current[\"name\"]\n" +
                "print Thread.current[\"name2\"]\n" +
                "print Thread.current[:name]",

                "print Thread.current == Thread.current",

                "a = Thread.new {print 33}; a.join",
                "print Thread.current.class",
        };

        String[] outputs = {
                "AnilA",
                "true",
                "33",
                "Thread",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_FileTest() {
        String[] program_texts = {
                "print FileTest.exist?('no_such_file_xxx')",
        };

        String[] outputs = {
                "false",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    public void test_Time() {
        String[] program_texts = {
                "t = Time.gm(2000,2,1,20,15,6);print t.year, t.month, t.day",
                "print Time.gm(2000, 2, 1, 20, 15, 1).zone",
                "t = Time.gm(2000, 2, 1, 20, 15, 1); print  t.gmt?",
                "print Time.gm(2000, 1, 2, 3, 4, 5)"
        };

        String[] outputs = {
                "200021",
                "UTC",
                "true",
                "Sun Jan 02 03:04:05 UTC 2000"
        };

        compile_run_and_compare_output(program_texts, outputs);
    }

    /*
    TODO does not work with exception
    TODO wrong format, should fix the implementation
    public void test_Kernel_caller() {
        String[] program_texts = {
                "def f;	p caller(); end; def g;	f; end;  g",
                "def f;	p caller(0); end; def g;	f; end;  g",
                "def f;	p caller(2); end; def g;	f; end;  g",

        };

        String[] outputs = {
                "[g]",	//TODO should be: ["test.rb:1:in `g'", "test.rb:1"]
                "[f, g]",
                "[]",
        };

        compile_run_and_compare_output(program_texts, outputs);
    }*/

}
