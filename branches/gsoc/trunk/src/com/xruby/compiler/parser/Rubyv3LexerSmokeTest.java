/***
 * Excerpted from "The Definitive ANTLR Reference"
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr for more book information.
***/
package com.xruby.compiler.parser;
import java.io.StringReader;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Rubyv3LexerSmokeTest {
    public static void main(String[] args) throws Exception {
       //ANTLRInputStream input = new ANTLRInputStream(System.in);
        Rubyv3Lexer lexer = new Rubyv3Lexer(new ANTLRStringStream("\"a12323asdfc_asdf\" 1 /aaa/ 2 `cccc` 3 1.1 a 0.4 1.step  /= "));
        Token token = lexer.nextToken();
        System.out.print(token.getText()+"("+token.getType()+")");
        for(int i=0; i<15;i++)
        {
        	token = lexer.nextToken();
        	System.out.print(token.getText()+"("+token.getType()+")");
        }
     
    }
}
