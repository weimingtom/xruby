package com.xruby.compiler.parser;

import java.io.PrintStream;

/**
 * Copyright 2005-2007 femto
 * Distributed under the GNU General Public License 2.0
 */
public class JayGenerator {
    public static void main(String[] args) throws Exception {
        //System.out.println(System.getProperty("user.dir"));
        //System.setProperty("user.dir", "C:\\toolset\\ruby\\xruby-trunk\\");
        System.setOut(new PrintStream("src\\com\\xruby\\compiler\\parser\\RubyJay.java"));
        args = new String[] {"-v", /*"-t", debug*/ "-b", "output1", "src\\com\\xruby\\compiler\\parser\\jay.y"};
        jay.Main.main(args);
    }
}
