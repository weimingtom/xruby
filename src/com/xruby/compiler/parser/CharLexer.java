// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\char.g 2007-04-28 22:20:53
package com.xruby.compiler.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;

public class CharLexer extends BaseLexer {
    public static final int Tokens=5;
    public static final int C=4;
    public static final int EOF=-1;
    public CharLexer() {;}
    public CharLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\char.g"; }

    // $ANTLR start C
    public final void mC() throws RecognitionException {
        try {
            int _type = C;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\char.g:5:5: ( . )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\char.g:5:5: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end C

    public void mTokens() throws RecognitionException {
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\char.g:1:10: ( C )
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\char.g:1:10: C
        {
        mC(); 

        }


    }


 

}