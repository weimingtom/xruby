package com.xruby.compiler.parser;

import junit.framework.TestCase;
import org.antlr.runtime.*;

class TestingCommonToken extends CommonToken {
    public TestingCommonToken(int t, String txt) {
        super(t, txt);
        setLine(1);
    }

    public TestingCommonToken(int t, String txt, int line) {
        super(t, txt);
        setLine(line);
    }
}

public class Rubyv3LexerTest extends TestCase {


    private void assert_type(String[] program_texts, int expected_type, String[] expected_texts) {
        assertEquals("Length mismatch, setup expected_texts properly!", program_texts.length, expected_texts.length);

        for (int i = 0; i < program_texts.length; ++i) {
                SymbolTableManager stm = new SymbolTableManager(null);
                Rubyv3Lexer lexer = new Rubyv3Lexer(new ANTLRStringStream(program_texts[i]), stm, false);
                Token token = lexer.nextToken();
                assertEquals(program_texts[i], expected_type, token.getType());

                assertEquals(program_texts[i], expected_texts[i], token.getText());

                // should contain only one token
                if (Rubyv3Lexer.EOF == token.getType()) {
                    Token next_token = lexer.nextToken();
                    assertEquals(program_texts[i] + "contains multiple tokens!", Rubyv3Lexer.EOF, next_token.getType());
                }

        }
    }

    private void assert_type(String[] program_texts, int expected_type) {
        assert_type(program_texts, expected_type, program_texts);
    }

    private void assert_type(String program_text, CommonToken[] tokens) {
            SymbolTableManager stm = new SymbolTableManager(null);
            Rubyv3Lexer lexer = new Rubyv3Lexer(new ANTLRStringStream(program_text), stm, false);

            for (int i = 0; i < tokens.length; ++i) {
                Token token = lexer.nextToken();
                assertEquals(i + " " + token.getText() + " has wrong type!", tokens[i].getType(), token.getType());
                assertEquals(i + " " + token.getText() + " has wrong text!", tokens[i].getText(), token.getText());
                assertEquals(i + " " + token.getText() + " has wrong position!", tokens[i].getLine(), token.getLine());
            }

            Token token = lexer.nextToken();
            assertEquals("should have no token left!", token.getType(), Token.EOF);

    }

    private void assert_type(String program_text, int expected_type) {
        assert_type(new String[]{program_text}, expected_type);
    }

    public void test_token_stream1() {
        String program_text = "puts \"hello\";";
        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "puts"),
                            new TestingCommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "hello"),
                            new TestingCommonToken(Rubyv3Lexer.SEMI, ";"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream2() {
        String program_text = "0.step";
        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "0"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "step"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream3() {
        String program_text = "$?/256";
        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.GLOBAL_VARIABLE , "$?"),
                            new TestingCommonToken(Rubyv3Lexer.DIV, "/"),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "256"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream4() {
        String program_text = " def /(item)";
        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            new TestingCommonToken(Rubyv3Lexer.DIV, "/"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "item"),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream5() {
        String program_text = "def -@(); end";
        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            new TestingCommonToken(Rubyv3Lexer.UNARY_PLUS_MINUS_METHOD_NAME, "-@"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
                            new TestingCommonToken(Rubyv3Lexer.SEMI, ";"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_end, "end"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream9() {
        String program_text = "\n\n\nunless /{$1}\\z/o =~ s";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n", 1),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_unless, "unless", 4),
                            new TestingCommonToken(Rubyv3Lexer.REGEX, "{$1}\\z", 4),
                            new TestingCommonToken(Rubyv3Lexer.MATCH, "=~", 4),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "s", 4),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream10() {
        String program_text = "  when /^#/" +
"    raise \"unknown node type: '{ntype}'\"";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_when, "when"),
                            new TestingCommonToken(Rubyv3Lexer.REGEX, "^#"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "raise"),
                            new TestingCommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "unknown node type: '{ntype}'"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream12() {
        String program_text = "1%200";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new TestingCommonToken(Rubyv3Lexer.MOD, "%"),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "200"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream13() {
        String program_text = "; ;\t   ;";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.SEMI, ";"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream14() {
        String program_text = "a =1;a\n\n\n;;;;";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            new TestingCommonToken(Rubyv3Lexer.ASSIGN, "="),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new TestingCommonToken(Rubyv3Lexer.SEMI, ";"),
                            new TestingCommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            //new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n", 1),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream16() {
        String program_text = "sprintf(\"Rational(%s, %s)\", @numerator.inspect, @denominator.inspect)";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "sprintf"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "Rational(%s, %s)"),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ","),
                            new TestingCommonToken(Rubyv3Lexer.INSTANCE_VARIABLE, "@numerator"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "inspect"),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ","),
                            new TestingCommonToken(Rubyv3Lexer.INSTANCE_VARIABLE, "@denominator"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "inspect"),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream17() {
        String program_text = "subj.gsub! /\\n/, \"\"\n";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "subj"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "gsub!"),
                            new TestingCommonToken(Rubyv3Lexer.REGEX, "\\n"),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ","),
                            new TestingCommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, ""),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream18() {
        String program_text = "self / Rational.new!(a, 1)";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_self, "self"),
                            new TestingCommonToken(Rubyv3Lexer.DIV, "/"),
                            new TestingCommonToken(Rubyv3Lexer.CONSTANT, "Rational"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "new!"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ","),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream19() {
        String program_text = "session['key'].class";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "session"),
                            new TestingCommonToken(Rubyv3Lexer.LBRACK_ARRAY_ACCESS, "["),
                            new TestingCommonToken(Rubyv3Lexer.SINGLE_QUOTE_STRING, "key"),
                            new TestingCommonToken(Rubyv3Lexer.RBRACK, "]"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.IDENTIFIER, "class"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream21() {
        String program_text = "def check_response_auth( res )\n" +
"raise POPAuthenticationError, res unless /\\A\\+OK/i === res\n" +
"res\n" +
"end";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "check_response_auth"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "res"),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "raise", 2),
                            new TestingCommonToken(Rubyv3Lexer.CONSTANT, "POPAuthenticationError", 2),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ",", 2),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "res", 2),
                            new TestingCommonToken(Rubyv3Lexer.UNLESS_MODIFIER, "unless", 2),
                            new TestingCommonToken(Rubyv3Lexer.REGEX, "\\A\\+OK", 2),
                            new TestingCommonToken(Rubyv3Lexer.CASE_EQUAL, "===", 2),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "res", 2),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n", 2),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "res", 3),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n", 3),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_end, "end", 4),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream22() {
        String program_text = "res.split(/ /)[1]";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "res"),
                            new TestingCommonToken(Rubyv3Lexer.DOT, "."),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "split"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.REGEX, " "),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
                            new TestingCommonToken(Rubyv3Lexer.LBRACK_ARRAY_ACCESS, "["),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new TestingCommonToken(Rubyv3Lexer.RBRACK, "]"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream23() {
        String program_text = "f(*a)";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "f"),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new TestingCommonToken(Rubyv3Lexer.REST_ARG_PREFIX, "*"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "a"),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream24() {
        String program_text = "puts puts = 1";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "puts"),
                            new TestingCommonToken(Rubyv3Lexer.IDENTIFIER, "puts"),
                            new TestingCommonToken(Rubyv3Lexer.ASSIGN, "="),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
        };

        assert_type(program_text, token_types);
    }

    /*
    public void test_token_stream25() {
        String program_text = "def a; f do |element|\n"	+
"          klass.module_eval(<<-EOC, __FILE__, __LINE__)\n"	+
"          EOC\n"	+
"         end\n"	+
"     end";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "a"),
                            new TestingCommonToken(Rubyv3Lexer.SEMI, ";"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "f"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_do, "do"),
                            new TestingCommonToken(Rubyv3Lexer.BOR, "|"),
                            new TestingCommonToken(Rubyv3Lexer.IDENTIFIER, "element"),
                            new TestingCommonToken(Rubyv3Lexer.BOR, "|"),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "klass", 2),
                            new TestingCommonToken(Rubyv3Lexer.DOT, ".", 2),
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "module_eval", 2),
                            new TestingCommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "(", 2),
                            new TestingCommonToken(Rubyv3Lexer.HERE_DOC_BEGIN, "-EOC", 2),
                            new TestingCommonToken(Rubyv3Lexer.HERE_DOC_CONTENT, "", 2),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ",", 3),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL___FILE__, "__FILE__", 3),
                            new TestingCommonToken(Rubyv3Lexer.COMMA, ",", 3),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL___LINE__, "__LINE__", 3),
                            new TestingCommonToken(Rubyv3Lexer.RPAREN, ")", 3),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n", 3),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_end, "end", 4),
                            new TestingCommonToken(Rubyv3Lexer.LINE_BREAK, "\n", 4),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_end, "end", 5),
        };

        assert_type(program_text, token_types);
    }*/


    public void test_token_stream26() {
        String program_text = ";if true then end";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.SEMI, ";"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_if, "if"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_true, "true"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_then, "then"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_end, "end"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream28() {
        String program_text = "1...3";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new TestingCommonToken(Rubyv3Lexer.EXCLUSIVE_RANGE, "..."),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "3"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream29() {
        String program_text = "puts 1 rescue true";

        TestingCommonToken[] token_types =  {
                            new TestingCommonToken(Rubyv3Lexer.FUNCTION, "puts"),
                            new TestingCommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new TestingCommonToken(Rubyv3Lexer.RESCUE_MODIFIER, "rescue"),
                            new TestingCommonToken(Rubyv3Lexer.LITERAL_true, "true"),
        };

        assert_type(program_text, token_types);
    }

    public void test_REGEX() {
        String[] program_texts = {
            "/\\r\\n\\r\\n/s",
            "/^#/",
            "/^Ruby the OOPL/",
            "/ruby/i",
            "/test|test/x",
            "/([\\300-\\367])/n",
        };

        String[] expected_texts = {
            "\\r\\n\\r\\n",
            "^#",
            "^Ruby the OOPL",
            "ruby",
            "test|test",
            "([\\300-\\367])",
        };

        assert_type(program_texts, Rubyv3Lexer.REGEX, expected_texts);
    }

    public void test_QUESTION() {
        String program_text = "?";
        assert_type(program_text, Rubyv3Lexer.QUESTION);
    }

    public void test_LPAREN() {
        String program_text = "(";
        assert_type(program_text, Rubyv3Lexer.LPAREN);
    }

    public void test_RPAREN() {
        String program_text = ")";
        assert_type(program_text, Rubyv3Lexer.RPAREN);
    }

    public void test_LBRACK() {
        String program_text = "[";
        assert_type(program_text, Rubyv3Lexer.LBRACK);
    }

    public void test_RBRACK() {
        String program_text = "]";
        assert_type(program_text, Rubyv3Lexer.RBRACK);
    }

    public void test_LCURLY() {
        String program_text = "{";
        assert_type(program_text, Rubyv3Lexer.LCURLY_HASH);
    }

    public void test_RCURLY() {
        String program_text = "}";
        assert_type(program_text, Rubyv3Lexer.RCURLY);
    }

    public void test_COLON() {
        String program_text = ":";
        assert_type(program_text, Rubyv3Lexer.COLON_WITH_NO_FOLLOWING_SPACE);
    }

    public void test_COMMA() {
        String[] program_texts = {
            ",",
            ", ",
            ",\n",
            ",   \n\n     \n",
        };

        String[] expected_texts = {
            ",",
            ",",
            ",",
            ",",
        };

        assert_type(program_texts, Rubyv3Lexer.COMMA, expected_texts);
    }

    public void test_ASSIGN() {
        String program_text = "=";
        assert_type(program_text, Rubyv3Lexer.ASSIGN);
    }

    public void test_PLUS_ASSIGN() {
        String program_text = "+=";
        assert_type(program_text, Rubyv3Lexer.PLUS_ASSIGN);
    }

    public void test_MINUS_ASSIGN() {
        String program_text = "-=";
        assert_type(program_text, Rubyv3Lexer.MINUS_ASSIGN);
    }

    public void test_STAR_ASSIGN() {
        String program_text = "*=";
        assert_type(program_text, Rubyv3Lexer.STAR_ASSIGN);
    }

    /*
    public void test_DIV_ASSIGN() {
        String program_text = "/=";
        assert_type(program_text, Rubyv3Lexer.DIV_ASSIGN);
    }
    */

    public void test_MOD_ASSIGN() {
        String program_text = "%=";
        assert_type(program_text, Rubyv3Lexer.MOD_ASSIGN);
    }

    public void test_POWER_ASSIGN() {
        String program_text = "**=";
        assert_type(program_text, Rubyv3Lexer.POWER_ASSIGN);
    }

    public void test_BAND_ASSIGN() {
        String program_text = "&=";
        assert_type(program_text, Rubyv3Lexer.BAND_ASSIGN);
    }

    public void test_BXOR_ASSIGNN() {
        String program_text = "^=";
        assert_type(program_text, Rubyv3Lexer.BXOR_ASSIGN);
    }

    public void test_BOR_ASSIGNN() {
        String program_text = "|=";
        assert_type(program_text, Rubyv3Lexer.BOR_ASSIGN);
    }

    /*
    public void test_LEFT_SHIFT_ASSIGN() {
        String program_text = "<<=";
        assert_type(program_text, Rubyv3Lexer.LEFT_SHIFT_ASSIGN);
    }
    */

    public void test_RIGHT_SHIFT_ASSIGN() {
        String program_text = ">>=";
        assert_type(program_text, Rubyv3Lexer.RIGHT_SHIFT_ASSIGN);
    }

    public void test_LOGICAL_AND_ASSIGN() {
        String program_text = "&&=";
        assert_type(program_text, Rubyv3Lexer.LOGICAL_AND_ASSIGN);
    }

    public void test_LOGICAL_OR_ASSIGN() {
        String program_text = "||=";
        assert_type(program_text, Rubyv3Lexer.LOGICAL_OR_ASSIGN);
    }

    public void test_NOT() {
        String program_text = "!";
        assert_type(program_text, Rubyv3Lexer.NOT);
    }

    public void test_BNOT() {
        String program_text = "~";
        assert_type(program_text, Rubyv3Lexer.BNOT);
    }

    public void test_DIV() {
        String program_text = "/";
        assert_type(program_text, Rubyv3Lexer.DIV);
    }

    public void test_PLUS() {
        String program_text = "+";
        assert_type(program_text, Rubyv3Lexer.UNARY_PLUS);
    }

    /*
    public void test_MOD() {
        String program_text = "%";
        assert_type(program_text, Rubyv3Lexer.MOD);
    }
    */

    public void test_MINUS() {
        String program_text = "-";
        assert_type(program_text, Rubyv3Lexer.UNARY_MINUS);
    }

    public void test_STAR() {
        String program_text = "*";
        assert_type(program_text, Rubyv3Lexer.REST_ARG_PREFIX);
    }

    public void test_LESS_THAN() {
        String program_text = "<";
        assert_type(program_text, Rubyv3Lexer.LESS_THAN);
    }

    public void test_GREATER_THAN() {
        String program_text = ">";
        assert_type(program_text, Rubyv3Lexer.GREATER_THAN);
    }

    public void test_BXOR() {
        String program_text = "^";
        assert_type(program_text, Rubyv3Lexer.BXOR);
    }

    public void test_BOR() {
        String program_text = "|";
        assert_type(program_text, Rubyv3Lexer.BOR);
    }

    public void test_LOGICAL_OR() {
        String program_text = "||";
        assert_type(program_text, Rubyv3Lexer.LOGICAL_OR);
    }

    public void test_LOGICAL_AND() {
        String program_text = "&&";
        assert_type(program_text, Rubyv3Lexer.LOGICAL_AND);
    }

    public void test_BAND() {
        String program_text = "&";
        assert_type(program_text, Rubyv3Lexer.BLOCK_ARG_PREFIX);
    }

    public void test_SEMI() {
        String[] program_texts = {
            ";",
            ";;;",
        };

        String[] expected_texts = {
            ";",
            ";",
        };

        assert_type(program_texts, Rubyv3Lexer.SEMI, expected_texts);
    }

    public void test_SEMI_as_LINEBREAK() {
        String[] program_texts = {
            "\n  \n\t\n\n;\n;",
            ";\n\n\n",
            ";;  ;;\n;;\n\n;;",
        };

        String[] expected_texts = {
            "\n",
            ";",
            ";",
        };

        assert_type(program_texts, Rubyv3Lexer.LINE_BREAK, expected_texts);
    }

    public void test_ASSOC() {
        String program_text = "=>";
        assert_type(program_text, Rubyv3Lexer.ASSOC);
    }

    public void test_INCLUSIVE_RANGE() {
        String program_text = "..";
        assert_type(program_text, Rubyv3Lexer.INCLUSIVE_RANGE);
    }

    public void test_EXCLUSIVE_RANGE() {
        String program_text = "...";
        assert_type(program_text, Rubyv3Lexer.EXCLUSIVE_RANGE);
    }

    public void test_POWER() {
        String program_text = "**";
        assert_type(program_text, Rubyv3Lexer.POWER);
    }

    public void test_COMPARE() {
        String program_text = "<=>";
        assert_type(program_text, Rubyv3Lexer.COMPARE);
    }

    public void test_GREATER_OR_EQUAL() {
        String program_text = ">=";
        assert_type(program_text, Rubyv3Lexer.GREATER_OR_EQUAL);
    }

    public void test_LESS_OR_EQUAL() {
        String program_text = "<=";
        assert_type(program_text, Rubyv3Lexer.LESS_OR_EQUAL);
    }

    public void test_EQUAL() {
        String program_text = "==";
        assert_type(program_text, Rubyv3Lexer.EQUAL);
    }

    public void test_CASE_EQUAL() {
        String program_text = "===";
        assert_type(program_text, Rubyv3Lexer.CASE_EQUAL);
    }

    public void test_NOT_EQUAL() {
        String program_text = "!=";
        assert_type(program_text, Rubyv3Lexer.NOT_EQUAL);
    }

    public void test_MATCH() {
        String program_text = "=~";
        assert_type(program_text, Rubyv3Lexer.MATCH);
    }

    public void test_NOT_MATCH() {
        String program_text = "!~";
        assert_type(program_text, Rubyv3Lexer.NOT_MATCH);
    }

    public void test_LEFT_SHIFT() {
        String program_text = "<<";
        assert_type(program_text, Rubyv3Lexer.LEFT_SHIFT);
    }

    public void test_RIGHT_SHIFT() {
        String program_text = ">>";
        assert_type(program_text, Rubyv3Lexer.RIGHT_SHIFT);
    }

    public void test_COLON2() {
        String program_text = "::";
        assert_type(program_text, Rubyv3Lexer.LEADING_COLON2);
    }

    public void test_LINE_BREAK() {
        String[] program_texts = {
            "\r",
            "\n",
            "\r\n",
            "\n\n\n\n\n",
            "\r\n\n\r\n\n\n\r\n\r\n",
        };

        String[] expected_texts = {
            "",
            "\n",
            "\n",
            "\n",
            "\n",
        };

        assert_type(program_texts, Rubyv3Lexer.LINE_BREAK, expected_texts);
    }

    public void test_FUNCTION() {
        String[] program_texts = {
            "puts",
            "print",
        };

        assert_type(program_texts, Rubyv3Lexer.FUNCTION);
    }

    public void test_IDENTIFIER  () {
        String[] program_texts = {
            "hey",
            "_",
            "_1",
            "_a",
            "abc123",
            "_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000",
            "_ab1",
        };

        assert_type(program_texts, Rubyv3Lexer.FUNCTION);
    }

    public void test_PREDICATE_FUNCTION() {
        String[] program_texts = {
            "hey?",
            "_?",
            "_1?",
            "_a?",
            "_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000?",
            "_2b2abC?",
        };

        assert_type(program_texts, Rubyv3Lexer.FUNCTION);
    }

    public void test_DESTRUCTIVE_FUNCTION() {
        String[] program_texts = {
            "hey!",
            "_!",
            "_1!",
            "_a!",
            "_________aaaaaaa11111111111____________ZZZZZZZZZ00000000000!",
            "_1abC!",
        };

        assert_type(program_texts, Rubyv3Lexer.FUNCTION);
    }

    public void test_GLOBAL_VARIABLE () {
        String[] program_texts = {
            "$-#",
            "$-",
            "$-a",
            "$-K",
            "$A",
            "$a",
            "$aBC12_",
            "$_",
            "$__",
            "$a234",

            "$&",
            "$`",
            "$\\",
            "$+",

            "$1",
            "$2",
            "$3",
            "$4",
            "$5",
            "$6",
            "$7",
            "$8",
            "$9",
            "$123456",
        };

        assert_type(program_texts, Rubyv3Lexer.GLOBAL_VARIABLE );
    }

    public void test_INSTANCE_VARIABLE() {
        String[] program_texts = {
            "@A",
            "@a",
            "@aBC12_",
            "@_",
        };

        assert_type(program_texts, Rubyv3Lexer.INSTANCE_VARIABLE);
    }

    public void test_CLASS_VARIABLE() {
        String[] program_texts = {
            "@@A",
            "@@a",
            "@@aBC12_",
            "@@_",
        };

        assert_type(program_texts, Rubyv3Lexer.CLASS_VARIABLE);
    }

    public void test_CONSTANT() {
        String[] program_texts = {
            "A",
            "Z",
            "A_",
            "Abc",
            "B2",
            "PI",
            "MyClass3",
        };

        assert_type(program_texts, Rubyv3Lexer.CONSTANT);
    }


    public void test_INTEGER() {
        String[] program_texts = {
            "123456",
            "1",
            "543",
            "0",
            //"123_456",
            //"123_456_789_123_345_789",
        };

        String[] expected_texts = {
            "123456",
            "1",
            "543",
            "0",
            //"123456",
            //"123456789123345789",
        };

        assert_type(program_texts, Rubyv3Lexer.INTEGER, expected_texts);
    }

    public void test_HEX() {
        String[] program_texts = {
            "0xaabbC",
            "0X0abb1",
        };

        String[] expected_texts = {
            "0xaabbC",
            "0X0abb1",
        };

        assert_type(program_texts, Rubyv3Lexer.HEX, expected_texts);
    }

    public void test_OCTAL() {
        String[] program_texts = {
            "0377",
        };

        String[] expected_texts = {
            "0377",
        };

        assert_type(program_texts, Rubyv3Lexer.OCTAL, expected_texts);
    }

    public void test_BINARY() {
        String[] program_texts = {
            "0b1010",
            "0B0100",
            //"0b001_001",
        };

        String[] expected_texts = {
           "0b1010",
            "0B0100",
            //"0b001001",
        };

        assert_type(program_texts, Rubyv3Lexer.BINARY, expected_texts);
    }

    public void test_ASCII_VALUE() {
        String[] program_texts = {
                "?&",
                "?a",
                "?\"",
                "?\\n",
                "?\\s",
                "?\\C-a",
                "?\\M-a",
                "?\\M-\\C-a",
                "?\\C-?",
            };

            assert_type(program_texts, Rubyv3Lexer.ASCII_VALUE);
    }

    public void test_FLOAT() {
        String[] program_texts = {
            ".1",
            ".00",
            "12.34",
            "12.0",
            "0.2E2",
            ".1234E2",
            ".0234E+2",
            ".1234e-2",
            "1234e-2",
            "1234E-21",
            "0.0",
            "1e3",
            "2e18",
            "2E-18",
        };

        assert_type(program_texts, Rubyv3Lexer.FLOAT);
    }

    public void test_DOT() {
        String[] program_texts = {"."};

        assert_type(program_texts, Rubyv3Lexer.DOT);
    }

    public void test_DOUBLE_QUOTE_STRING_LITERAL() {

        String[] program_texts = {
            "\"Rational(%s, %s)\"",
            "\"%Y-%m-%d %H:%M:%S\"",
            "\"\"",
            "\" \"",
            "\"string\"",
            "\"hello\"",
            "\" this is a string \"",
            "\"2\"",
            "\"\\\\\"",
            "\"\\n\"",
            "\"/usr/local\"",
            "\"\\360\"",
            "\"hello\n    world\"",
        };

        String[] expected_texts = {
                "Rational(%s, %s)",
                "%Y-%m-%d %H:%M:%S",
                "",
                " ",
                "string",
                "hello",
                " this is a string ",
                "2",
                "\\\\",
                "\\n",
                "/usr/local",
                "\\360",
                "hello\n    world",
        };

        assert_type(program_texts, Rubyv3Lexer.DOUBLE_QUOTE_STRING, expected_texts);
    }

    public void test_COMMAND_OUTPUT() {

        String[] program_texts = {
            "``",
            "` `",
            "`command`",
            "` this is a command `",
            "`2`",
            "`\\\\`",
            "`\\n`",
        };

        String[] expected_texts = {
                "",
                " ",
                "command",
                " this is a command ",
                "2",
                "\\\\",
                "\\n",
        };

        assert_type(program_texts, Rubyv3Lexer.COMMAND_OUTPUT, expected_texts);
    }

    /*TODO
    public void test_X_COMMAND_OUTPUT() {
        String[] program_texts = {
            "%x/^Ruby the OOPL/",
            "%x|ruby|",
            "%x/test|test/",
            "%x{test|test}",
            "%x(test|test)",
            "%x[test|test]",
        };

        String[] expected_texts = {
            "^Ruby the OOPL",
            "ruby",
            "test|test",
            "test|test",
            "test|test",
            "test|test",
        };

        assert_type(program_texts, Rubyv3Lexer.COMMAND_OUTPUT, expected_texts);
    }*/

    public void test_SINGLE_QUOTE_STRING_LITERAL() {

        String[] program_texts = {
            "\'\'",
            "\' \'",
            "\'string\'",
            "\' this is a #@string \'",
            "\'2\'",
            "\'\\\\\'",
            "\'\\n\'",
            "\'hello\n    #{world}\'",
        };

        String[] expected_texts = {
                "",
                " ",
                "string",
                " this is a #@string ",
                "2",
                "\\\\",
                "\\n",
                "hello\n    #{world}",
        };

        assert_type(program_texts, Rubyv3Lexer.SINGLE_QUOTE_STRING, expected_texts);
    }


    public void test_q_STRING() {
        String[] program_texts = {
            "%q!test string!",
            "%q//",
            "%q# #",
            "%q$string$",
            "%q^ this is a string ^",
        };


        assert_type(program_texts, Rubyv3Lexer.SINGLE_QUOTE_STRING);
    }

    /*
    public void test_Q_STRING() {
        String[] program_texts = {
            TODO "%/test string/",
            "%Q/test string/",
            "%Q\ntest string\n",
            "%Q*2*",
            "%Q(\\\\)",
            "%Q{\\\\}",
            "%Q[\\\\]",
            "%Q]\\\\]",
            "%Q}\\\\}",
            "%Q)\\\\)",
            "%Q!\\n!",
        };

        String[] expected_texts = {
            "test string",
            "test string",
            "test string",
            "2",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\n",
        };

        assert_type(program_texts, Rubyv3Lexer.DOUBLE_QUOTE_STRING, expected_texts);
    }*/

    public void test_COMMENT() {
        String[] program_texts = {
            "#",
            "# ",
            "#             ",
            "#12424scvdsfv",
            "#4r fgr rt",
            "#winClicker",
        };

        String[] expected_texts = {
            null,
            null,
            null,
            null,
            null,
            null,
        };

        assert_type(program_texts, Rubyv3Lexer.EOF, expected_texts);
    }

    public void test_WHITE_SPACE() {
        String[] program_texts = {
            " ",
            "\t",
            "            ",
            "\t\t\t\t\t",
            " \t\t         \t",
        };

        String[] expected_texts = {
            null,
            null,
            null,
            null,
            null,
        };

        assert_type(program_texts, Rubyv3Lexer.EOF, expected_texts);
    }

    public void test_LINE_CONTINUATION() {
        String[] program_texts = {
            "\\\n",
        };

        String[] expected_texts = {
            null,
        };

        assert_type(program_texts, Rubyv3Lexer.EOF, expected_texts);
    }

    public void test_RDOC() {
        String[] program_texts = {
            "=begin\n=end",
            "=begin\nwhatever\n=end",
            "=begin\nwha\n\n%^$%^$%$^&$%\n\n&tever\n=end",
        };

        String[] expected_texts = {
            null,
            null,
            null,
        };

        assert_type(program_texts, Rubyv3Lexer.EOF, expected_texts);
    }


    public void test_W_ARRAY() {
        String[] program_texts = {
            "%w(folder openfold)",
            "%w/test string/",
            "%W!test string!",
            "%w\ntest string\n",
            "%W&Seconds/day: #{24*60*60}&",

            "%w//",
            "%w# #",
            "%w$string$",
            "%W^ this is a string ^",
            "%W*2*",
            "%W(\\\\)",
            "%w{\\\\}",
            "%w[\\\\]",
            "%w]\\\\]",
            "%w}\\\\}",
            "%w)\\\\)",
            "%W!\\n!",
        };

        String[] expected_texts = {
            "folder openfold",
            "test string",
            "test string",
            "test string",
            "Seconds/day: #{24*60*60}",

            "",
            " ",
            "string",
            " this is a string ",
            "2",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\\\",
            "\\n",
        };

        assert_type(program_texts, Rubyv3Lexer.W_ARRAY);
    }

    public void test_END_OF_FILE() {
        String[] program_texts = {
            "\0",
            "\004",
            "\032",
            "\u0000",
            "\u0004",
            "\u001a",
        };

        assert_type(program_texts, Rubyv3Lexer.EOF);
    }

    public void test_EMPTY_ARRAY() {
        String[] program_texts = {
            "[]",
        };

        assert_type(program_texts, Rubyv3Lexer.EMPTY_ARRAY);
    }

}
