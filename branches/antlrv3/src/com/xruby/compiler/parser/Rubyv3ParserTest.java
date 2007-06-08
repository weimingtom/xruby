package com.xruby.compiler.parser;

import junit.framework.TestCase;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import java.io.IOException;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class Rubyv3ParserTest extends TestCase {
    public void test_parse() throws Exception {
        assert_parse("", "nil");
        assert_parse(";", "nil");
        assert_parse("  ", "nil");
        assert_parse(";\n;\n;\n;\n", "nil");
        assert_parse("expression0 \tif expression1 if expression2; ", "(STATEMENT_LIST (STATEMENT expression0 (if expression1) (if expression2)))");
        assert_parse("expression0 \tif\nexpression1 if expression2;", "(STATEMENT_LIST (STATEMENT expression0 (if expression1) (if expression2)))");
        assert_parse("expression0 \tif\nexpression1 if expression2", "(STATEMENT_LIST (STATEMENT expression0 (if expression1) (if expression2)))");
        assert_parse("expression0 \tif expression1 if expression2\n expression0", "(STATEMENT_LIST (STATEMENT expression0 (if expression1) (if expression2)) (STATEMENT expression0))");
        assert_parse("expression0 \tif expression1 if expression2; expression0", "(STATEMENT_LIST (STATEMENT expression0 (if expression1) (if expression2)) (STATEMENT expression0))");
        assert_parse("expression0 \tif expression1 if expression2;; expression0", "(STATEMENT_LIST (STATEMENT expression0 (if expression1) (if expression2)) (STATEMENT expression0))");

        try {
            assert_parse("if expression1; ", "");
            fail("should fail");
        } catch (RecognitionException e) {
            //ignore
        }

        //todo: assert_parse("puts 3", "");
    }

    public void test_parse_simple() throws Exception {
        assert_parse("expression0;", "(STATEMENT_LIST (STATEMENT expression0))");
        assert_parse("expression0\n;", "(STATEMENT_LIST (STATEMENT expression0))");
    }

    public void test_parse_complex() throws Exception {
        assert_parse("if true then true end;", "(STATEMENT_LIST (STATEMENT (IF true (STATEMENT_LIST (STATEMENT true)))))");
        assert_parse("if true : true end", "(STATEMENT_LIST (STATEMENT (IF true (STATEMENT_LIST (STATEMENT true)))))");
        try {
            assert_parse("if true true end", "");
            fail("should fail");
        } catch (RecognitionException e) {
            //ignore
        }

        assert_parse("if false \ntrue end;", "(STATEMENT_LIST (STATEMENT (IF false (STATEMENT_LIST (STATEMENT true)))))");
        assert_parse("if true \n\n true end", "(STATEMENT_LIST (STATEMENT (IF true (STATEMENT_LIST (STATEMENT true)))))");
        assert_parse("if if 7 then\n" +
                " 31\n" +
                "end  \n" +
                "then\n" +
                " 11\n" +
                "end", "(STATEMENT_LIST (STATEMENT (IF (IF 7 (STATEMENT_LIST (STATEMENT 31))) (STATEMENT_LIST (STATEMENT 11)))))");
        try {
            assert_parse("if if 7 then\n" +
                    " 31\n" +
                    "end if nil  \n" +
                    "then\n" +
                    " puts 11\n" +
                    "end", "");
            fail("should fail");
        } catch (RecognitionException e) {
            //ignore.
        }
        assert_parse("if if 7 then\n" +
                " 31\n" +
                "end \n" +
                "then\n" +
                " 11\n" +
                "end if nil", "(STATEMENT_LIST (STATEMENT (IF (IF 7 (STATEMENT_LIST (STATEMENT 31))) (STATEMENT_LIST (STATEMENT 11))) (if nil)))");
    }



    public void test_heredoc_string() throws Exception {
        //assert_parse("<<HERE\ntest\nHERE", "(STATEMENT_LIST (STATEMENT <<HERE\ntest\nHERE))");
        //assert_parse("<<'HERE'\ntest\nHERE", "(STATEMENT_LIST (STATEMENT <<'HERE'\ntest\nHERE))");
        //assert_parse("<<'HERE'\ntest\nHERE\n", "(STATEMENT_LIST (STATEMENT <<'HERE'\ntest\nHERE))");
        //assert_parse("<<HERE\ntest\nHERE\n3", "(STATEMENT_LIST (STATEMENT <<HERE\ntest\nHERE) (STATEMENT 3))");
    }

    public void test_value() throws Exception {
        assert_parse("3 and false", "(STATEMENT_LIST (STATEMENT (and 3 false)))");
        assert_parse("3 and \n false", "(STATEMENT_LIST (STATEMENT (and 3 false)))");
    }

    public void test_fixnum() throws Exception {
        assert_parse("7;", "(STATEMENT_LIST (STATEMENT 7))");
        //assert_parse("09;", "(STATEMENT_LIST (STATEMENT 09))");

        assert_parse("0d099", "(STATEMENT_LIST (STATEMENT 0d099))");
        assert_parse("1;?a;", "(STATEMENT_LIST (STATEMENT 1) (STATEMENT ?a))");

        assert_parse("? ", "(STATEMENT_LIST (STATEMENT ? ))");
    }
    public void test_tenary_if_expression() throws Exception {
        //assert_parse("5?3:2", "(STATEMENT_LIST (STATEMENT (? 5 3 2)))");
        //assert_parse("5**3?3:2", "(STATEMENT_LIST (STATEMENT (? (** 5 3) 3 2)))");
        //assert_parse("x", "(STATEMENT_LIST (STATEMENT (CALL x)))");
        assert_parse("x ? 3 : 2", "(STATEMENT_LIST (STATEMENT (? (CALL x) 3 2)))");
    }
    public void test_assignment() throws Exception {
        assert_parse("x=1;", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) 1)))");
        assert_parse("x=1;x <<1;", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) 1)) (STATEMENT (<< (VARIABLE x) 1)))");

        assert_parse("%Q{a#{x=1}b}; x <<1;", "(STATEMENT_LIST (STATEMENT %Q{a#{x=1}b}) (STATEMENT (<< (VARIABLE x) 1)))");

        /*assert_parse("%Q{a#{x=1}b}; x <<1;", "(STATEMENT_LIST (STATEMENT %Q{a#{x=1}b}) (STATEMENT (<< x 1)))");

        assert_parse("%Q{a#{x=1}b #{x}}", "(STATEMENT_LIST (STATEMENT %Q{a#{x=1}b #{x}}))");

        assert_parse("a=5?3:2;a", "(STATEMENT_LIST (STATEMENT (= a (? 5 3 2))) (STATEMENT a))");

        assert_parse("a=1;a+=5?3:2;a", "(STATEMENT_LIST (STATEMENT (= a 1)) (STATEMENT (+= a (? 5 3 2))) (STATEMENT a))");*/
        //assert_parse("x <<1;", "(STATEMENT_LIST (STATEMENT (= x 1)) (STATEMENT (<< x 1)))");
        /*assert_parse("x <<1\n" +
                "\n"
                , "");*/
    }
    public void test_power() throws Exception {
        assert_parse("3**2;", "(STATEMENT_LIST (STATEMENT (** 3 2)))");
    }
    public void test_range_expression() throws Exception {
        assert_parse("2..3;", "(STATEMENT_LIST (STATEMENT (.. 2 3)))");
        assert_parse("2...3", "(STATEMENT_LIST (STATEMENT (... 2 3)))");
        //assert_parse("2.sayhello", "");
    }

    public void test_alias() throws Exception {
        assert_parse("alias test1 test", "(STATEMENT_LIST (STATEMENT (alias test1 test)))");
    }

    public void test_hash() throws Exception {
        assert_parse("{1,2}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");
        /*assert_parse("{1,2,3,4}", "(STATEMENT_LIST (STATEMENT ({ 1 2 3 4)))");

        assert_parse("{1=>2}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");
        assert_parse("{1=>2,3=>4}", "(STATEMENT_LIST (STATEMENT ({ 1 2 3 4)))");

        assert_parse("{1,2,}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");
        assert_parse("{1=>2,}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");*/
        //assert_parse("{1}", "");
    }

    public void test_def_method() throws Exception {
        //assert_parse("def test \n end", "(STATEMENT_LIST (STATEMENT (def test)))");

    }
    public void test_method() throws Exception {
        //assert_parse("test", "(STATEMENT_LIST (STATEMENT (CALL test)))");
        //assert_parse("def test\n 3 end \ntest", "(STATEMENT_LIST (STATEMENT (def test (BODY (STATEMENT_LIST (STATEMENT 3))))) (STATEMENT (CALL test)))");
        //assert_parse("def test\n 3 end;test", "(STATEMENT_LIST (STATEMENT (def test (BODY (STATEMENT_LIST (STATEMENT 3))))) (STATEMENT (CALL test)))");

        //assert_parse("def test(A)\n 3 end", ""); //error
        //assert_parse("def test(@x)\n 3 end", ""); //error
        //assert_parse("def test(@@x)\n 3 end", ""); //error
        //assert_parse("def test(x)\n 3 end", "(STATEMENT_LIST (STATEMENT (def test x (BODY (STATEMENT_LIST (STATEMENT 3))))))");
        //assert_parse("puts(3)", "(STATEMENT_LIST (STATEMENT (CALL puts (ARG 3))))");

        //assert_parse("test 2**3", "(STATEMENT_LIST (STATEMENT (CALL test (ARG (** 2 3)))))");
//        assert_parse("test 5?3:2", "(STATEMENT_LIST (STATEMENT (CALL test (ARG (** 2 3)))))");
        //assert_parse("puts \"abc\"?3:5", "");
        assert_parse("test a=1", "(STATEMENT_LIST (STATEMENT (CALL test (ARG (= (VARIABLE a) 1)))))");


    }
    
    public void assert_parse(String text, String expectedTree) throws IOException, RecognitionException

    {
        ANTLRStringStream input =
                new ANTLRStringStream(text);

        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        BaseTokenStream tokens = new BaseTokenStream(lexer);
        Rubyv3Parser parser = new Rubyv3Parser(tokens, null);
        Rubyv3Parser.program_return result = null;

        result = parser.program(); //this line may produce RecognitionException

        assertEquals(expectedTree, ((CommonTree) result.tree).toStringTree());
        //System.out.println("tree:" + ((CommonTree)result.tree).toStringTree());
    }


}
