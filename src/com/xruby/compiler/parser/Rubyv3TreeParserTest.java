package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Program;
import com.xruby.compiler.codegen.CompilationResults;
import com.xruby.compiler.codegen.CompilerException;
import com.xruby.compiler.codegen.RubyCompilerImpl;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import junit.framework.TestCase;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class Rubyv3TreeParserTest extends TestCase {
    private void compile_run_and_compare_result(RubyValue expectedResult, String text) throws RecognitionException, CompilerException, InstantiationException, IllegalAccessException {
        ANTLRStringStream input =
                new ANTLRStringStream(text);

        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        //BaseTokenStream tokens = new BaseTokenStream(lexer);
        BaseTokenStream tokens = new BaseTokenStream(lexer);
        Rubyv3Parser parser = new Rubyv3Parser(tokens);
        Rubyv3Parser.program_return result = null;

        result = parser.program(); //this line may produce RecognitionException

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(result.getTree());
        System.out.println(((CommonTree) result.getTree()).toStringTree());
// AST nodes have payloads that point into token stream
        nodes.setTokenStream(tokens);
        Rubyv3TreeParser treeParser = new Rubyv3TreeParser(nodes);
        Program program = treeParser.program();
        //System.out.println(program.getStatementList());
        CompilationResults results = new RubyCompilerImpl("abc").compile(program, null);
        RubyValue value = results.getRubyProgram().invoke();
        assertEquals(expectedResult, value);
    }

    public void test_fixnum() throws Exception {
        compile_run_and_compare_result(ObjectFactory.createFixnum(7), "7;");
        compile_run_and_compare_result(ObjectFactory.createFixnum(77), "7_7;");
        compile_run_and_compare_result(ObjectFactory.createFixnum(9), "011;");
        compile_run_and_compare_result(ObjectFactory.createFixnum(10), "0xa");
        compile_run_and_compare_result(ObjectFactory.createFixnum(97), "?a");
        compile_run_and_compare_result(ObjectFactory.createFixnum(1), "?\\C-a");
        compile_run_and_compare_result(ObjectFactory.createFixnum(225), "?\\M-a");
        compile_run_and_compare_result(ObjectFactory.createFixnum(129), "?\\M-\\C-a");
        compile_run_and_compare_result(ObjectFactory.createFixnum(-7), "-7;");
        compile_run_and_compare_result(ObjectFactory.createFixnum(-97), "-?a");
        compile_run_and_compare_result(ObjectFactory.createFixnum(-129), "-?\\M-\\C-a");
        //todo: why is ?\C-? -> 127, ?? & 0x9f ( 63 & 0x9f = 31)


        compile_run_and_compare_result(ObjectFactory.createFixnum(1), "?\\1");
        compile_run_and_compare_result(ObjectFactory.createFixnum(9), "?\\11");
        compile_run_and_compare_result(ObjectFactory.createFixnum(73), "?\\111");
        compile_run_and_compare_result(ObjectFactory.createFixnum(255), "?\\777");
        compile_run_and_compare_result(ObjectFactory.createFixnum(10), "?\\xa");
        compile_run_and_compare_result(ObjectFactory.createFixnum(255), "?\\xff");
        compile_run_and_compare_result(ObjectFactory.createFixnum(10), "?\\n");
        compile_run_and_compare_result(ObjectFactory.createFixnum(100), "?\\d");
        compile_run_and_compare_result(ObjectFactory.createFixnum(138), "?\\M-\\n");
        compile_run_and_compare_result(ObjectFactory.createFixnum(228), "?\\M-\\d");
    }

    public void test_string() throws Exception {
        compile_run_and_compare_result(ObjectFactory.createString("abc"), "'abc';");
        compile_run_and_compare_result(ObjectFactory.createString("abc"), "%q|abc|;");
        compile_run_and_compare_result(ObjectFactory.createString("1(abc)2"), "%q(1(abc)2)");
        compile_run_and_compare_result(ObjectFactory.createString("abc"), "\"abc\"");

        compile_run_and_compare_result(ObjectFactory.createString("abc"), "%Q|abc|;");
        compile_run_and_compare_result(ObjectFactory.createString("abc"), "%Q(abc);");
        compile_run_and_compare_result(ObjectFactory.createString("1(abc)2"), "%Q(1(abc)2)");

    }

    public void test_string_escape() throws Exception {

        compile_run_and_compare_result(ObjectFactory.createString("a#"), "\"a#\"");
        /*try {
            compile_run_and_compare_result(ObjectFactory.createString("\\"), "'\\';");
            fail("should fail");
        } catch (SyntaxException e) {
            //ignore
        }*/
        compile_run_and_compare_result(ObjectFactory.createString("\\"), "'\\\\';");
        compile_run_and_compare_result(ObjectFactory.createString("\\\""), "'\\\"'");

        compile_run_and_compare_result(ObjectFactory.createString("'"), "'\\''");

        compile_run_and_compare_result(ObjectFactory.createString("\""), "\"\\\"\"");
        compile_run_and_compare_result(ObjectFactory.createString("'"), "\"'\"");


        compile_run_and_compare_result(ObjectFactory.createString("\\d"), "'\\d'");

        compile_run_and_compare_result(ObjectFactory.createString("\n"), "\"\\n\"");
        compile_run_and_compare_result(ObjectFactory.createString("\r"), "\"\\r\"");
        compile_run_and_compare_result(ObjectFactory.createString("\1"), "\"\\1\"");
        compile_run_and_compare_result(ObjectFactory.createString("\11"), "\"\\11\"");
        compile_run_and_compare_result(ObjectFactory.createString("\111"), "\"\\111\"");
        compile_run_and_compare_result(ObjectFactory.createString("\u00ff"), "\"\\777\"");

        compile_run_and_compare_result(ObjectFactory.createString("\12"), "\"\\xa\"");
        compile_run_and_compare_result(ObjectFactory.createString("\u00ff"), "\"\\xff\"");
    }

    public void test_string_substitution() throws Exception {
        //compile_run_and_compare_result(ObjectFactory.createString("1"), "\"#{x=1;}\"");
    }

    public void test_assignment() throws Exception {
        //compile_run_and_compare_result(ObjectFactory.createFixnum(1), "a=1;");

        //System.out.println(new Double("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111119999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.233"));
        //System.out.println(new Double("1e-9999"));
        //System.out.println(new Double("1.111111111111111111111111111111111"));
    }


}
