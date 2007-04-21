package com.xruby.compiler.parser;

import junit.framework.TestCase;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.math.BigInteger;
import java.util.Properties;

public class Rubyv3LexerTest extends TestCase {
    public void test_tmp() throws Exception {
        new BigInteger("b11", 2);
    }

    public void test_INT() throws Exception {
        Token token = lex_one("12345");
        System.out.println(token);
        assertEquals(12345, ((IntToken) token).getValue());
        assert_lex("0d123456", Rubyv3Lexer.INT);
        assert_lex("123_456", Rubyv3Lexer.INT);
        assert_lex("-543", Rubyv3Lexer.INT);
        assert_lex("-0d543", Rubyv3Lexer.INT);
        assert_lex("0x123456", Rubyv3Lexer.INT);
        assert_lex("0b123456", Rubyv3Lexer.INT);
        assert_lex("123_456_789_123_456_789", Rubyv3Lexer.INT);

        //assert_parse("_1_2","INT"); //todo:this is var
        try {
            assert_lex("1_2_", new int[0]); //trailing `_' in number
            //fail("should fail");
        } catch (RecognitionException e) {

        }

        assert_lex("?a", Rubyv3Lexer.INT);
        assert_lex("?\\C-x", Rubyv3Lexer.INT);
        assert_lex("?\\cx", Rubyv3Lexer.INT);
        assert_lex("?\\M-x", Rubyv3Lexer.INT);
        /*try {
            assert_lex("?\\mx", new int[] {Rubyv3Lexer.INT, Rubyv3Lexer.INT}); //trailing `_' in number
            //fail("should fail");
        } catch (RecognitionException e) {

        }*/
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
        assert_lex("'abc'", Rubyv3Lexer.STRING);
        //assert_lex("%q{abc}", Rubyv3Lexer.STRING);
        //assert_lex("%q{abc}d",new int[] {Rubyv3Lexer.STRING, Rubyv3Lexer.ID});
        CommonTokenStream tokens = lex("%q{abc}d");
        assertTrue("tokens.size()>1", tokens.size() > 1);
        assertEquals(Rubyv3Lexer.STRING, tokens.get(0).getType());

        assert_lex("\"abc\"", Rubyv3Lexer.STRING);
        assert_lex("%Q{abc}", Rubyv3Lexer.STRING);

        tokens = lex("%Q{abc}");
        assertTrue("tokens.get(0) instanceof StringToken", tokens.get(0) instanceof StringToken);
    }

    private CommonTokenStream lex(String text) throws IOException {
        ANTLRInputStream input =
                new ANTLRInputStream(new StringBufferInputStream(text));
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.LT(1);
        return tokens;
    }

    private Token lex_one(String text) throws IOException {
        ANTLRInputStream input =
                new ANTLRInputStream(new StringBufferInputStream(text));
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.LT(1);
        assertEquals("tokens.size shoud be 1 in lex_one", 1, tokens.size());
        return tokens.get(0);
    }

    private void assert_lex(String text, int expectedTypes) throws IOException, RecognitionException {
        ANTLRInputStream input =
                new ANTLRInputStream(new StringBufferInputStream(text));
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.LT(1);
        assertEquals(1, tokens.size());
        assertEquals(expectedTypes, tokens.get(0).getType());

        //assertEquals(-1, lexer.nextToken().getType());
    }

    private void assert_lex(String text, int[] expectedTypes) throws IOException, RecognitionException {
        ANTLRInputStream input =
                new ANTLRInputStream(new StringBufferInputStream(text));
        Properties prop = new Properties();
        prop.load(new FileInputStream(".\\src\\com\\xruby\\compiler\\parser\\Rubyv3.tokens")); //hard code here and only init once.
        Rubyv3Lexer lexer = new Rubyv3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.LT(1);
        assertEquals(expectedTypes.length, tokens.size());
        for (int i = 0; i < expectedTypes.length; i++) {
            int expectedType = expectedTypes[i];
            assertEquals(expectedType, tokens.get(i).getType());
        }

        //assertEquals(-1, lexer.nextToken().getType());
    }

}
