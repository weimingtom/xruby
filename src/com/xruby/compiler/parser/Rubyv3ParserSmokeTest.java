/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.parser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

import java.io.*;

public class Rubyv3ParserSmokeTest {
    private int numberOfFiles = 0;

    private int numberOfFails = 0;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Need to spefic a dir name!");
            return;
        }

        Rubyv3ParserSmokeTest test = new Rubyv3ParserSmokeTest();

        for (int i = 0; i < args.length; ++i) {
            test.run(new File(args[i]));
        }

        System.out.println(test.getNumberOfFiles() + " ruby programs have been parsed, " + test.getNumberOfFails()
                + " failed.");
    }

    public int getNumberOfFiles() {
        return numberOfFiles;
    }

    public int getNumberOfFails() {
        return numberOfFails;
    }

    public void run(File f) {
        // If this is a directory, walk each file/dir in that directory
        if (f.isDirectory()) {
            String files[] = f.list();
            for (int i = 0; i < files.length; i++) {
                run(new File(f, files[i]));
            }
        } else if ((f.getName().length() > 3) && f.getName().substring(f.getName().length() - 3).equals(".rb")) {
            ++numberOfFiles;
            parseFile(f);
        }
    }

    private void parseFile(File f) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));

            try {
                ANTLRFileStream input =
                        new ANTLRFileStream(f.getAbsolutePath());
                Rubyv3Lexer lexer = new Rubyv3Lexer(input);
                BaseTokenStream tokens = new BaseTokenStream(lexer);
                Rubyv3Parser parser = new Rubyv3Parser(tokens);
                parser.program();
            } catch (RecognitionException e) {
                System.out.println("parser exception for " + f.getPath() + ": " + e);
                ++numberOfFails;
            } finally {
                reader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can not open" + f.getPath());
            ++numberOfFails;
        } catch (IOException e) {
            System.out.println("Can not close" + f.getPath());
        }
    }
}