/**
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import com.xruby.compiler.codegen.CompilationResults;
import com.xruby.compiler.codegen.RubyCompilerImpl;
import com.xruby.compiler.parser.RubyParser;
import com.xruby.runtime.lang.RubyBinding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class RubyCompiler {

    public static final String VERSION = "0.3.0";

    private RubyBinding binding_;
    private boolean strip_;
    private boolean enableDebug = false;
    private CompilationResults compilation_results_ = new CompilationResults();

    public RubyCompiler(RubyBinding binding, boolean strip) {
        binding_ = binding;
        strip_ = strip;
    }

    public CompilationResults compile(String filename) throws FileNotFoundException,
        RecognitionException, TokenStreamException {

        if (null == filename) {
            Reader reader = new InputStreamReader(System.in);
            return compile(null, new BufferedReader(reader));
        } else {
            File f = new File(filename);
            if (f.isDirectory()) {
                for (String file : f.list()) {
                    if (file.charAt(0) != '.' &&
                        file.endsWith(".rb")) {
                        compile(filename + "/" + file);
                    }
                }
                return compilation_results_;
            } else {
                Reader reader = new FileReader(new File(filename));
                return compile(filename, new BufferedReader(reader));
            }
        }
    }

    public CompilationResults compile(Reader reader)
        throws RecognitionException, TokenStreamException {
        return compile(null, reader);
    }

    public CompilationResults compile(String filename, Reader reader)
        throws RecognitionException, TokenStreamException {
        String [] pre_defined = (null == binding_) ? null : binding_.getVariableNames().toArray(new String[] {});
        RubyParser parser = new RubyParser(reader, pre_defined, strip_);
        RubyCompilerImpl compiler = new RubyCompilerImpl(filename, compilation_results_);

        // Enable debug or not
        if (enableDebug) {
            compiler.enableDebug();
        }

        compiler.compile(parser.parse(filename), binding_);
        return compilation_results_;
    }

    public void enableDebug() {
        enableDebug = true;
    }
}
