package com.xruby.compiler.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Rubyv3LexerTest extends TestCaseExtend {
    private static final int ANY = -2; //doesn't care what this lex type is

    public void test_INT() throws Exception {
        //Token token = lex_one("12345");

        //assertEquals(12345, ((IntToken) token).getValue());
        //assert_lex("123456", Rubyv3Lexer.INT);
        //assert_lex("123_456", Rubyv3Lexer.INT);
        assert_lex("0d123456", Rubyv3Lexer.INT);
        assert_lex("-543", Rubyv3Lexer.INT);
        assert_lex("-0d543", Rubyv3Lexer.INT);
        assert_lex("0x123456", Rubyv3Lexer.INT);

        assert_lex("123_456_789_123_456_789", Rubyv3Lexer.INT);

        //assert_parse("_1_2","INT"); //todo:this is var
        try {
            assert_lex("1_2_", new int[0]); //trailing `_' in number
            //lex("0dff");
            assert_lex("0b123456", Rubyv3Lexer.INT);
            //fail("should fail");
        } catch (RecognitionException e) {

        }

        assert_lex("?a", Rubyv3Lexer.INT);
        assert_lex("?\\C-x", Rubyv3Lexer.INT);
        assert_lex("?\\cx", Rubyv3Lexer.INT);
        assert_lex("?\\M-x", Rubyv3Lexer.INT);
        try {
            assert_lex("?\\mx", new int[]{Rubyv3Lexer.INT, Rubyv3Lexer.INT}); //trailing `_' in number
            //fail("should fail");
        } catch (Error e) {

        }
        assert_lex("?\\M-\\C-x", Rubyv3Lexer.INT);
        assert_lex("?\\C-\\M-x", Rubyv3Lexer.INT);
        assert_lex("?\\C-\\M-\\M-\\C-x", Rubyv3Lexer.INT);
    }


    public void test_FLOAT() throws Exception {
        assert_lex("12.345", Rubyv3Lexer.FLOAT);
        assert_lex("-12.345", Rubyv3Lexer.FLOAT);
        assert_lex("100.345", Rubyv3Lexer.FLOAT);

        assert_lex("0.1", Rubyv3Lexer.FLOAT);
        assert_lex("1.0", Rubyv3Lexer.FLOAT);
        assert_lex("1.01", Rubyv3Lexer.FLOAT);
        assert_lex("1.00", Rubyv3Lexer.FLOAT);

        /*try {
            //assert_lex("1.", Rubyv3Lexer.FLOAT);
            //assert_lex("-0d12.345", Rubyv3Lexer.FLOAT);
            //assert_lex("00.1", Rubyv3Lexer.FLOAT); //no .<digit> floating literal anymore; put 0 before dot
            //assert_lex(".1", Rubyv3Lexer.FLOAT);
            //assert_lex("1.e2", Rubyv3Lexer.FLOAT);
            //assert_lex("001e2", Rubyv3Lexer.FLOAT);
            fail("should fail");
        } catch (RecognitionException e) {

        }*/


        assert_lex("1e-2", Rubyv3Lexer.FLOAT);
        assert_lex("1.07e2", Rubyv3Lexer.FLOAT);

    }

    public void test_STRING() throws Exception {
        //assert_lex("'abc'", Rubyv3Lexer.SINGLE_QUOTE_STRING);
        //assert_lex("%q{abc}", Rubyv3Lexer.STRING);
        //assert_lex("%q{abc}d",new int[] {Rubyv3Lexer.STRING, Rubyv3Lexer.ID});
        TokenStream tokens = lex("%q{abc}d");
        //assertTrue("tokens.size()>1", tokens.size() > 1);
        assertEquals(Rubyv3Lexer.SINGLE_QUOTE_STRING, tokens.get(0).getType());

        assert_lex("\"abc\"", Rubyv3Lexer.DOUBLE_QUOTE_STRING);
        assert_lex("%Q{abc}", Rubyv3Lexer.DOUBLE_QUOTE_STRING);

        tokens = lex("%Q{abc}");

        assert_lex("%Q((abc))", Rubyv3Lexer.DOUBLE_QUOTE_STRING);

    }

    public void test_HEREDOC_STRING() throws Exception {
        assert_lex("<<HERE\n" +
                "Double quoted \n" +
                "here document.\n" +
                "It is #{Time.now}\n" +
                "HERE", Rubyv3Lexer.HEREDOC_BEGIN);
        assert_lex("var<<HERE\n" +
                "Double quoted \n" +
                "here document.\n" +
                "It is #{Time.now}\n" +
                "HERE", new int[]{ANY, Rubyv3Lexer.SHIFT});
    }

    private TokenStream lex(String text) throws IOException {
        ANTLRStringStream input =
                new ANTLRStringStream(text);
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        BaseTokenStream tokens = new BaseTokenStream(lexer);
        return tokens;
    }

    private Token lex_one(String text) throws IOException, RecognitionException {
        ANTLRStringStream input =
                new ANTLRStringStream(text);
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        BaseTokenStream tokens = new BaseTokenStream(lexer);

        return tokens.get(0);
    }

    private void assert_lex(String text, int expectedTypes) throws IOException, RecognitionException {
        ANTLRStringStream input =
                new ANTLRStringStream(text);
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        BaseTokenStream tokens = new BaseTokenStream(lexer);

        assertTokenTypeEquals(expectedTypes, tokens.get(0).getType());

        //assertTokenTypeEquals(-1, lexer.nextToken().getType());
    }

    private void assert_lex(String text, int[] expectedTypes) throws IOException, RecognitionException {
        ANTLRStringStream input =
                new ANTLRStringStream(text);
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        BaseTokenStream tokens = new BaseTokenStream(lexer);
        //assertEquals("tokens.size should be " + expectedTypes.length + ",", expectedTypes.length, tokens.size());
        for (int i = 0; i < expectedTypes.length; i++) {
            int expectedType = expectedTypes[i];
            assertTokenTypeEquals(expectedType, tokens.get(i).getType());
        }

        //assertEquals(-1, lexer.nextToken().getType());
    }

    private void assertTokenTypeEquals(int expectedTypes, int type) {
        if (expectedTypes == ANY) {
            return; //we don't care what type this is
        }
        assertEquals("expected:" + typeToFriendlyName.get(expectedTypes) +
                " but was:" + typeToFriendlyName.get(type) +
                "", expectedTypes, type);
    }

    Properties prop;
    Map typeToFriendlyName;

    protected void setUp() throws Exception {
        prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        typeToFriendlyName = new HashMap();
        Enumeration<Object> keys = prop.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            try {
                typeToFriendlyName.put(Integer.parseInt(prop.get(key).toString()), key);
            } catch (NumberFormatException e) {
                System.out.println("warning: can't convert " + key + "=" + prop.get(key));
                //System.out.println(prop.get(key));
            }
        }
    }


}
