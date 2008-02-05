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
        assert_parse("7", "(STATEMENT_LIST (STATEMENT 7))");
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

    public void test_heredoc() throws Exception {
        //assert_parse("x=1;y=2;x <<1;", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) 1)) (STATEMENT (<< (VARIABLE x) 1)))");

        //assert_parse("%Q{a#{x=1}b}; x <<1;", "(STATEMENT_LIST (STATEMENT %Q{a#{x=1}b}) (STATEMENT (<< (VARIABLE x) 1)))");
        //assert_parse("%Q{a#{x=1}b}; x <<1;", "(STATEMENT_LIST (STATEMENT %Q{a#{x=1}b}) (STATEMENT (<< (VARIABLE x) 1)))");

    }

    public void test_multiple_assignment() throws Exception {
        assert_parse("a,b=1", "(STATEMENT_LIST (STATEMENT (= (, (VARIABLE a) (VARIABLE b)) 1)))");
        assert_parse("a,b,c=1", "(STATEMENT_LIST (STATEMENT (= (, (, (VARIABLE a) (VARIABLE b)) (VARIABLE c)) 1)))");
        assert_parse("a=1,2", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) (, 1 2))))");
        assert_parse("a,b=1,2", "(STATEMENT_LIST (STATEMENT (= (, (VARIABLE a) (VARIABLE b)) (, 1 2))))");

        assert_parse("a,*b=1,2", "(STATEMENT_LIST (STATEMENT (= (, (VARIABLE a) (STAR_ID (VARIABLE b))) (, 1 2))))");
        assert_parse("*b=1,2", "(STATEMENT_LIST (STATEMENT (= (STAR_ID (VARIABLE b)) (, 1 2))))");

        assert_parse("a=b=1,2,3", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) (, (, (= (VARIABLE b) 1) 2) 3))))");
        assert_parse("a=*b=1", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) (STAR_ID (= (VARIABLE b) 1)))))");
        //assert_parse("a=*b=1,2,3", "");

    }

    public void test_assignment() throws Exception {
        assert_parse("x=1;", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) 1)))");


        assert_parse("x=y=1", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) (= (VARIABLE y) 1))))");


        assert_parse("a = \"cat\"", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) \"cat\")))");
        assert_parse("a = 'cat'", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) 'cat')))");

        assert_parse("a+=2", "(STATEMENT_LIST (STATEMENT (+= (VARIABLE a) 2)))");
        assert_parse("a=\"\";a+=defined? a;p a", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) \"\")) (STATEMENT (+= (VARIABLE a) (defined? (VARIABLE a)))) (STATEMENT (CALL p (ARG (VARIABLE a)))))");

        assert_parse("%Q{a#{x=1}b #{x}}", "(STATEMENT_LIST (STATEMENT %Q{a#{x=1}b #{x}}))");

        assert_parse("a=5?3:2;a", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) (? 5 3 2))) (STATEMENT (VARIABLE a)))");

        assert_parse("a=1;a+=5?3:2;a", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) 1)) (STATEMENT (+= (VARIABLE a) (? 5 3 2))) (STATEMENT (VARIABLE a)))");

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
        assert_parse("{1,2,3,4}", "(STATEMENT_LIST (STATEMENT ({ 1 2 3 4)))");

        assert_parse("{1=>2}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");
        assert_parse("{1=>2,3=>4}", "(STATEMENT_LIST (STATEMENT ({ 1 2 3 4)))");

        assert_parse("{1,2,}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");
        assert_parse("{1=>2,}", "(STATEMENT_LIST (STATEMENT ({ 1 2)))");

        assert_parse("{x:3}", "(STATEMENT_LIST (STATEMENT ({ (SYMBOL x) 3)))");
        //assert_parse("{1}", "");
    }

    public void test_symbol() throws Exception {
        assert_parse(":abc", "(STATEMENT_LIST (STATEMENT (: abc)))");
        assert_parse(":my_variable", "(STATEMENT_LIST (STATEMENT (: my_variable)))");
        assert_parse(":'catsup'", "(STATEMENT_LIST (STATEMENT (: 'catsup')))");
        //assert_parse("a = \"cat\";", "");
        assert_parse("a = \"cat\";:\"#{a}sup\"", "(STATEMENT_LIST (STATEMENT (= (VARIABLE a) \"cat\")) (STATEMENT (: \"#{a}sup\")))"); //regconize, leave semantic interpetation to the Expression tree
        assert_parse(":'#{a}sup'", "(STATEMENT_LIST (STATEMENT (: '#{a}sup')))");
        //assert_parse(":\"Ruby rules\"", "");
    }

    public void test_def_method() throws Exception {

        assert_parse("def test3(x)\n" +
                " p x \n" +
                "end\n",  "(STATEMENT_LIST (STATEMENT (def test3 (ARG x) (BODY (STATEMENT_LIST (STATEMENT (CALL p (ARG (VARIABLE x)))))))))");

        assert_parse("def test3(x)\n" +
                " p x ;;;" +
                "end\n", "(STATEMENT_LIST (STATEMENT (def test3 (ARG x) (BODY (STATEMENT_LIST (STATEMENT (CALL p (ARG (VARIABLE x)))))))))");

        assert_parse("def test \n end", "(STATEMENT_LIST (STATEMENT (def test)))");
        assert_parse("obj=1;def obj.test \n end", "(STATEMENT_LIST (STATEMENT (= (VARIABLE obj) 1)) (STATEMENT (def (VARIABLE obj) . test)))");
        assert_parse("def (1.class).test \n end", "(STATEMENT_LIST (STATEMENT (def (. 1 (CALL class)) . test)))");

        //all combination
        assert_parse("def test(x, y=1, *args)\n" +
                " p x\n" +
                "end", "(STATEMENT_LIST (STATEMENT (def test (ARG x (= y 1) (* args)) (BODY (STATEMENT_LIST (STATEMENT (CALL p (ARG (VARIABLE x)))))))))");

    }
    public void test_defined_expression() throws Exception {
        assert_parse("defined? 1", "(STATEMENT_LIST (STATEMENT (defined? 1)))"); //expression
        assert_parse("defined? dummy", "(STATEMENT_LIST (STATEMENT (defined? (CALL dummy))))"); //nil
        assert_parse("defined? printf", "(STATEMENT_LIST (STATEMENT (defined? (CALL printf))))"); //method
        //assert_parse("defined? String", "(STATEMENT_LIST (STATEMENT (defined? (CALL printf))))"); //constant
        //assert_parse("defined? $_", "(STATEMENT_LIST (STATEMENT (defined? (CALL printf))))"); //globalvariable
        //assert_parse("defined? Math::PI", "(STATEMENT_LIST (STATEMENT (defined? (CALL printf))))"); //constant
        assert_parse("defined? a=1", "(STATEMENT_LIST (STATEMENT (defined? (= (VARIABLE a) 1))))"); //assignment
        assert_parse("defined? 42.abs", "(STATEMENT_LIST (STATEMENT (defined? (. 42 (CALL abs)))))"); //assignment

        assert_parse("defined? defined? x", "(STATEMENT_LIST (STATEMENT (defined? (defined? (CALL x)))))");
        assert_parse("defined? defined? defined? x", "(STATEMENT_LIST (STATEMENT (defined? (defined? (defined? (CALL x))))))");
        assert_parse("defined? defined? defined? defined? x", "(STATEMENT_LIST (STATEMENT (defined? (defined? (defined? (defined? (CALL x)))))))");
        //these shouldn't passed
        //assert_parse("defined? a,b=1", "");


    }

    public void test_method() throws Exception {
        //assert_parse("x", "(STATEMENT_LIST (STATEMENT (CALL x)))");
        //DFA.debug = true;
        //assert_parse("5 ? 3 : 2", "(STATEMENT_LIST (STATEMENT (? 5 3 2)))");
        //assert_parse("x ? 3 : 2", "(STATEMENT_LIST (STATEMENT (? (CALL x) 3 2)))");

        assert_parse("test (1)", "(STATEMENT_LIST (STATEMENT (CALL test (ARG 1))))");

        assert_parse("test", "(STATEMENT_LIST (STATEMENT (CALL test)))");
        assert_parse("1.test1.test2", "(STATEMENT_LIST (STATEMENT (. (. 1 (CALL test1)) (CALL test2))))");
        assert_parse("1.class", "(STATEMENT_LIST (STATEMENT (. 1 (CALL class))))");
        assert_parse("1.class 3", "(STATEMENT_LIST (STATEMENT (. 1 (CALL class (ARG 3)))))");
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
        assert_parse("1.class.class.test 1,2.class", "(STATEMENT_LIST (STATEMENT (. (. (. 1 (CALL class)) (CALL class)) (CALL test (ARG 1 (. 2 (CALL class)))))))");
        assert_parse("test a=1", "(STATEMENT_LIST (STATEMENT (CALL test (ARG (= (VARIABLE a) 1)))))");
        assert_parse("test 5, test 2,3", "(STATEMENT_LIST (STATEMENT (CALL test (ARG 5 (CALL test (ARG 2 3))))))");

        assert_parse("3*2", "(STATEMENT_LIST (STATEMENT (* 3 2)))");
        //assert_parse("test*2", "(STATEMENT_LIST (STATEMENT (* (CALL test) 2)))");

        //assert_parse("test*a", "(STATEMENT_LIST (STATEMENT (* (CALL test) (CALL a))))");
        //assert_parse("test*abc;x=5", "(STATEMENT_LIST (STATEMENT (* (CALL test) (CALL abc))) (STATEMENT (= (VARIABLE x) 5)))");

    }

    public void test_array_ref_call() throws Exception {
        assert_parse(
                "x=1;x [3]", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) 1)) (STATEMENT ([ (VARIABLE x) 3 ])))");
        assert_parse(
                "x=1;x [3][2]", "(STATEMENT_LIST (STATEMENT (= (VARIABLE x) 1)) (STATEMENT ([ ([ (VARIABLE x) 3 ]) 2 ])))");

        assert_parse("x [3]", "(STATEMENT_LIST (STATEMENT (CALL x (ARG ([ 3)))))");
        assert_parse("p x [3]", "(STATEMENT_LIST (STATEMENT (CALL p (ARG (CALL x (ARG ([ 3)))))))");
        //assert_parse("x 3", "");
    }

    public void test_global_variable() throws Exception {
        assert_parse("$:", "(STATEMENT_LIST (STATEMENT (VARIABLE $:)))");
        assert_parse("$sitedir", "(STATEMENT_LIST (STATEMENT (VARIABLE $sitedir)))");
    }

    public void test_block() throws Exception {
       assert_parse("test() do |x| x end", "(STATEMENT_LIST (STATEMENT (CALL test do | x (BODY (STATEMENT_LIST (STATEMENT (CALL x)))) end)))");
       assert_parse("test(1) do |x| x end", "(STATEMENT_LIST (STATEMENT (CALL test (ARG 1) do | x (BODY (STATEMENT_LIST (STATEMENT (CALL x)))) end)))");
       assert_parse("test(1,2) do |x| x end", "(STATEMENT_LIST (STATEMENT (CALL test (ARG 1 2) do | x (BODY (STATEMENT_LIST (STATEMENT (CALL x)))) end)))");

        assert_parse("test ", "(STATEMENT_LIST (STATEMENT (CALL test)))");
        assert_parse("test do |x| x end", "(STATEMENT_LIST (STATEMENT (CALL test do | x (BODY (STATEMENT_LIST (STATEMENT (CALL x)))) end)))");
    }

    public void test_smoke() throws Exception {






        //assertEquals(expectedTree, ((CommonTree) result.tree).toStringTree());

        //assert_parse("$:.find {|x| puts 3 }", "(STATEMENT_LIST (STATEMENT (CALL p (ARG (CALL x (ARG ([ 3)))))))");
    }

    public void test_smoke_block() throws Exception {
        String text = "|x| puts 3 ";

        ANTLRStringStream input =
                new ANTLRStringStream(text);

        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        BaseTokenStream tokens = new BaseTokenStream(lexer);
        Rubyv3Parser parser = new Rubyv3Parser(tokens, null);
        Rubyv3Parser.block_content_return result = null;

        result = parser.block_content(); //this line may produce RecognitionException

        text = "x,y";

         input =
                new ANTLRStringStream(text);

         lexer = new Rubyv3Lexer(input);
         tokens = new BaseTokenStream(lexer);
         parser = new Rubyv3Parser(tokens, null);
        Rubyv3Parser.block_param_return result1 = null;

        result1 = parser.block_param(); //this line may produce RecognitionException

        text = "do |x| puts 3  end";

         input =
                new ANTLRStringStream(text);

         lexer = new Rubyv3Lexer(input);
         tokens = new BaseTokenStream(lexer);
         parser = new Rubyv3Parser(tokens, null);
        Rubyv3Parser.block_return result2 = null;

        result2 = parser.block(); //this line may produce RecognitionException

        //assertEquals(expectedTree, ((CommonTree) result.tree).toStringTree());

        //assert_parse("$:.find {|x| puts 3 }", "(STATEMENT_LIST (STATEMENT (CALL p (ARG (CALL x (ARG ([ 3)))))))");
    }


    public void test_new_call_syntax() throws Exception {
        //assert_parse("a.(1,2)", "");
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
