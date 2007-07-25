package com.xruby.compiler.parser;

import java.io.StringReader;

import junit.framework.TestCase;

import org.antlr.runtime.*;



public class Rubyv3LexerTest extends TestCase {


    private void assert_type(String[] program_texts, int expected_type, String[] expected_texts) {
        assertEquals("Length mismatch, setup expected_texts properly!", program_texts.length, expected_texts.length);

        for (int i = 0; i < program_texts.length; ++i) {

                Rubyv3Lexer lexer = new Rubyv3Lexer(new ANTLRStringStream(program_texts[i]));
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

            Rubyv3Lexer lexer = new Rubyv3Lexer(new ANTLRStringStream(program_text));

            for (int i = 0; i < tokens.length; ++i) {
                Token token = lexer.nextToken();
                assertEquals(i + " " + token.getText() + " has wrong type!", tokens[i].getType(), token.getType());
                assertEquals(i + " " + token.getText() + " has wrong text!", tokens[i].getText(), token.getText());
                //assertEquals(i + " " + token.getText() + " has wrong position!", tokens[i].getLine(), token.getLine());
            }

            Token token = lexer.nextToken();
            assertEquals("should have no token left!", token.getType(), Token.EOF);

    }

    public void test_token_stream1() {
        String program_text = "puts \"hello\";";
        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "puts"),
                            new CommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "\"hello\""),
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream2() {
        String program_text = "0.step";
        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.INTEGER, "0"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            //to do, change type to FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "step"),
        };

        assert_type(program_text, token_types);
    }

    //to do, need to add expectOperator(2) to Rubyv3Lexer, with last token etc
    public void test_token_stream3() {
        String program_text = "/";//"$?/256";
        CommonToken[] token_types =  {
                            //new CommonToken(Rubyv3Lexer.GLOBAL_VARIABLE , "$?"),
                            new CommonToken(Rubyv3Lexer.DIV, "/"),
                            //new CommonToken(Rubyv3Lexer.INTEGER, "256"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream4() {
        String program_text = " def a(item)";//def /(item), need to fix the current REGEX
        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "item"),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream5() {
        String program_text = "def -@(); end";
        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            new CommonToken(Rubyv3Lexer.UNARY_PLUS_MINUS_METHOD_NAME, "-@"),
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
                            new CommonToken(Rubyv3Lexer.LITERAL_end, "end"),
        };

        assert_type(program_text, token_types);
    }

    //to do : treat multiple \n as one and the REGEX_MODIFIER
    public void test_token_stream9() {
        String program_text = "\n\n\nunless /{$1}\\z/o =~ s";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new CommonToken(Rubyv3Lexer.UNLESS_MODIFIER, "unless"),
                            new CommonToken(Rubyv3Lexer.REGEX, "/{$1}\\z/"),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "o"),
                            new CommonToken(Rubyv3Lexer.MATCH, "=~"),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "s"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream10() {
        String program_text = "  when /^#/" +
"    raise \"unknown node type: '{ntype}'\"";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.LITERAL_when, "when"),
                            new CommonToken(Rubyv3Lexer.REGEX, "/^#/"),
                            //change to FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "raise"),
                            new CommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "\"unknown node type: '{ntype}'\""),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream12() {
        String program_text = "1%200";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new CommonToken(Rubyv3Lexer.MOD, "%"),
                            new CommonToken(Rubyv3Lexer.INTEGER, "200"),
        };

        assert_type(program_text, token_types);
    }

    //to do, treat multiple semi as one
    public void test_token_stream13() {
        String program_text = "; ;\t   ;";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream14() {
        String program_text = "a =1;a\n;";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            // to do, change this to ASSIGN
                            new CommonToken(Rubyv3Lexer.ASSIGN_WITH_NO_LEADING_SPACE, "="),
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream16() {
        String program_text = "sprintf(\"Rational(%s, %s)\", @numerator.inspect, @denominator.inspect)";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "sprintf"),
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new CommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "\"Rational(%s, %s)\""),
                            new CommonToken(Rubyv3Lexer.COMMA, ","),
                            new CommonToken(Rubyv3Lexer.INSTANCE_VARIABLE, "@numerator"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "inspect"),
                            new CommonToken(Rubyv3Lexer.COMMA, ","),
                            new CommonToken(Rubyv3Lexer.INSTANCE_VARIABLE, "@denominator"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "inspect"),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream17() {
        String program_text = "subj.gsub! /\\n/, \"\"\n";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "subj"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            new CommonToken(Rubyv3Lexer.FUNCTION, "gsub!"),
                            new CommonToken(Rubyv3Lexer.REGEX, "/\\n/"),
                            new CommonToken(Rubyv3Lexer.COMMA, ","),
                            new CommonToken(Rubyv3Lexer.DOUBLE_QUOTE_STRING, "\"\""),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream18() {
        String program_text = "self * Rational.new!(a, 1)"; // to do /

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.LITERAL_self, "self"),
                            //to do /
                            new CommonToken(Rubyv3Lexer.REST_ARG_PREFIX, "*"),
                            new CommonToken(Rubyv3Lexer.CONSTANT, "Rational"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            new CommonToken(Rubyv3Lexer.FUNCTION, "new!"),
                            //to do
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            new CommonToken(Rubyv3Lexer.COMMA, ","),
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream19() {
        String program_text = "session['key'].class";

        CommonToken[] token_types =  {
                            //todo  FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "session"),
                            //todo LBRACK_ARRAY_ACCESS
                            new CommonToken(Rubyv3Lexer.LBRACK, "["),
                            new CommonToken(Rubyv3Lexer.SINGLE_QUOTE_STRING, "\'key\'"),
                            new CommonToken(Rubyv3Lexer.RBRACK, "]"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            //to do IDENTIFIER
                            new CommonToken(Rubyv3Lexer.LITERAL_class, "class"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream21() {
        String program_text = "def check_response_auth( res )\n" +
"raise POPAuthenticationError, res unless /\\A\\+OK/i === res\n" +
"res\n" +
"end";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.LITERAL_def, "def"),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "check_response_auth"),
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "res"),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "raise"),
                            new CommonToken(Rubyv3Lexer.CONSTANT, "POPAuthenticationError"),
                            new CommonToken(Rubyv3Lexer.COMMA, ","),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "res"),
                            new CommonToken(Rubyv3Lexer.UNLESS_MODIFIER, "unless"),
                            new CommonToken(Rubyv3Lexer.REGEX, "/\\A\\+OK/"),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "i"),
                            new CommonToken(Rubyv3Lexer.CASE_EQUAL, "==="),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "res"),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "res"),
                            new CommonToken(Rubyv3Lexer.LINE_BREAK, "\n"),
                            new CommonToken(Rubyv3Lexer.LITERAL_end, "end"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream22() {
        String program_text = "res.split(/ /)[1]";

        CommonToken[] token_types =  {
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "res"),
                            new CommonToken(Rubyv3Lexer.DOT, "."),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "split"),
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new CommonToken(Rubyv3Lexer.REGEX, "/ /"),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
                            //todo LABRACK_ARRAY_ACCESS
                            new CommonToken(Rubyv3Lexer.LBRACK, "["),
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new CommonToken(Rubyv3Lexer.RBRACK, "]"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream23() {
        String program_text = "f(*a)";

        CommonToken[] token_types =  {
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "f"),
                            new CommonToken(Rubyv3Lexer.LPAREN_WITH_NO_LEADING_SPACE, "("),
                            new CommonToken(Rubyv3Lexer.REST_ARG_PREFIX, "*"),
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "a"),
                            new CommonToken(Rubyv3Lexer.RPAREN, ")"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream24() {
        String program_text = "puts puts = 1";

        CommonToken[] token_types =  {
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "puts"),
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "puts"),
                            //todo ASSIGN
                            new CommonToken(Rubyv3Lexer.ASSIGN_WITH_NO_LEADING_SPACE, "="),
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream26() {
        String program_text = ";if true then end";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.SEMI, ";"),
                            new CommonToken(Rubyv3Lexer.IF_MODIFIER, "if"),
                            new CommonToken(Rubyv3Lexer.LITERAL_true, "true"),
                            new CommonToken(Rubyv3Lexer.LITERAL_then, "then"),
                            new CommonToken(Rubyv3Lexer.LITERAL_end, "end"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream28() {
        String program_text = "1...3";

        CommonToken[] token_types =  {
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new CommonToken(Rubyv3Lexer.EXCLUSIVE_RANGE, "..."),
                            new CommonToken(Rubyv3Lexer.INTEGER, "3"),
        };

        assert_type(program_text, token_types);
    }

    public void test_token_stream29() {
        String program_text = "puts 1 rescue true";

        CommonToken[] token_types =  {
                            //todo FUNCTION
                            new CommonToken(Rubyv3Lexer.IDENTIFIER, "puts"),
                            new CommonToken(Rubyv3Lexer.INTEGER, "1"),
                            new CommonToken(Rubyv3Lexer.RESCUE_MODIFIER, "rescue"),
                            new CommonToken(Rubyv3Lexer.LITERAL_true, "true"),
        };

        assert_type(program_text, token_types);
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

        assert_type(program_texts, Rubyv3Lexer.DOUBLE_QUOTE_STRING);
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

        assert_type(program_texts, Rubyv3Lexer.COMMAND_OUTPUT);
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

        assert_type(program_texts, Rubyv3Lexer.SINGLE_QUOTE_STRING);
    }

   
    public void test_q_STRING() {
        String[] program_texts = {
            "%q!test string!",
            "%q//",
            "%q# #",
            "%q$string$",
            "%q^ this is a string ^",
        };

        String[] expected_texts = {
            "%q!test string!",
            "%q//",
            "%q# #",
            "%q$string$",
            "%q^ this is a string ^",
        };

        assert_type(program_texts, Rubyv3Lexer.SINGLE_QUOTE_STRING, expected_texts);
    }
    /*TODO
    public void test_Q_STRING() {
        String[] program_texts = {
            "%/test string/",
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
    }
*/
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



        assert_type(program_texts, Rubyv3Lexer.W_ARRAY);
    }
    

    /*public void test_END_OF_FILE() {
        String[] program_texts = {
            "\0",
            "\004",
            "\032",
        };

        assert_type(program_texts, Rubyv3Lexer.EOF);
    }*/

    public void test_EMPTY_ARRAY() {
        String[] program_texts = {
            "[]",
        };

        assert_type(program_texts, Rubyv3Lexer.EMPTY_ARRAY);
    }

}
