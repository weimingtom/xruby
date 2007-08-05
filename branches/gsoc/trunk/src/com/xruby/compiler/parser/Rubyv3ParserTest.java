package com.xruby.compiler.parser;

import java.lang.reflect.*;
import junit.framework.TestCase;
import org.antlr.runtime.*;

public class Rubyv3ParserTest  extends TestCase {
//	/ @param[in]e	Can be null
    private String build_error_string(String program_text, Exception exception) {
        assert(null != program_text);

        //Dump text and exception(if any)
        StringBuilder debug_message = new StringBuilder();
        debug_message.append("\"");
        debug_message.append(program_text);
        debug_message.append("\" ");
        if (null != exception) {
            debug_message.append(exception.toString());
        }

        //Dump token streams;
        SymbolTableManager stm = new SymbolTableManager(null);
        Rubyv3Lexer lexter = new Rubyv3Lexer(new ANTLRStringStream(program_text), stm, false);
        debug_message.append("\nToken stream is:");

        Token token = lexter.nextToken();
        while (Rubyv3Lexer.EOF != token.getType()) {
            debug_message.append(token.getText());
            debug_message.append("(");
            debug_message.append(token.getType());
            debug_message.append(")\t");

            token = lexter.nextToken();
        }

        debug_message.append("\n");

        return debug_message.toString();
    }

    private void invoke_method_with_reflection(String program_text, String method_name) throws RecognitionException {
        assert(null != program_text);
        assert(null != method_name);

        TokenStream stm = new Rubyv3Lexer(new ANTLRStringStream(program_text), null, false);
        Rubyv3Parser parser = new Rubyv3Parser(stm);
        Class c = parser.getClass();

        Method method = null;
        try {
            method = c.getMethod(method_name);
        } catch (NoSuchMethodException e) {
            assertTrue("No such method: " + method_name, false);
        }

        try {
            method.invoke(parser);
        } catch (IllegalAccessException e) {
            assertTrue(false);
        } catch (IllegalArgumentException e) {
            assertTrue(false);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RecognitionException) {
                throw (RecognitionException)cause;
            } else {
                cause.printStackTrace();
                assertTrue(cause.toString(), false);
            }
        }

        //Ensure there are no more tokens left
        assertEquals(program_text + " There are tokens left: " + stm.LT(1).toString() + ", ",
                Rubyv3Lexer.EOF, stm.LT(1).getType());
    }

    private void parse(String[] program_texts, String method_name) {
        for (int i = 0; i < program_texts.length; ++i) {
            try {
                invoke_method_with_reflection(program_texts[i], method_name);
            } catch (RecognitionException e) {
                assertTrue(build_error_string(program_texts[i], e), false);
            }
        }
    }

    public void test_terminal() {
        String[] program_texts = {
            ";",
            //";;;;;;;;;;;",
            //"\n\n\n\n;;;;;;;;;;;",
            //"\n",
        };

        parse(program_texts, "terminal");
    }
}
