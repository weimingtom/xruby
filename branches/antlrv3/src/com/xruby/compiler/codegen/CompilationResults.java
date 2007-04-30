/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import java.io.*;
import java.util.*;
import java.util.jar.*;

import com.xruby.compiler.*;
import com.xruby.compiler.codedom.BlockFarm;
import com.xruby.runtime.lang.RubyProgram;

class CompilationResultLoader extends ClassLoader {
	public Class load(String name, byte[] b) {
		return defineClass(NameFactory.convertSlashToDot(name), b, 0, b.length);
	}
}

class CompilationResult {

    private final String name_;
	private final byte[] code_;

	public CompilationResult(String name, byte[] code) {
		name_ = name;
		code_ = code;
	}

	public void save(JarOutputStream jarstream) throws FileNotFoundException, IOException {
		String filename_to_save = NameFactory.createClassFileName(name_);
		System.out.println("Added " + filename_to_save);

		jarstream.putNextEntry(new JarEntry(filename_to_save));
		jarstream.write(code_);
	}

	public Class load(CompilationResultLoader loader) {
		return loader.load(name_, code_);
	}
}

public class CompilationResults {

    private static final String SMAP_SUFFIX = ".smap";

    private final ArrayList<CompilationResult> results_ = new ArrayList<CompilationResult>();

	public void add(CompilationResult result) {
		results_.add(result);
	}

	public int size() {
		return results_.size();
	}

	public void save(String script_name) throws FileNotFoundException, IOException {

		/*if (null != script_name) {
			File save_location = NameFactory.createSaveLocation(script_name);
			save_location.mkdir();
		}*/

		File tarfilename = NameFactory.createJarFileName(script_name);
		FileOutputStream fstream = new FileOutputStream(tarfilename);
		JarOutputStream jarstream = new JarOutputStream(fstream, createManifest(script_name));

		for (CompilationResult result : results_) {
			result.save(jarstream);
		}

        // Write Block Info
        // TODO: Add debug check here
        // TODO: We need a loop statement to support multiple files
        // if(is_debug?) {...}
        String smap = BlockFarm.getMapByName(script_name);
        if(smap == null) {
            smap = "0\n";
        }

        String entryName =
                NameFactory.getNameWithoutSufix(script_name) + "/" + script_name + SMAP_SUFFIX;
        jarstream.putNextEntry(new JarEntry(entryName));
        jarstream.write(smap.getBytes());

        jarstream.close();
		System.out.println("Generated " + tarfilename.toString());
	}

    private String combine(Map<String, int[]> blockMap, Map<String, int[]> methodMap) {
        StringBuffer smap = new StringBuffer();
        ArrayList list = new ArrayList<String>();

        return smap.toString();
    }

    private Manifest createManifest(String script_name) {
		Manifest manifest = new Manifest();
		Attributes attrs = manifest.getMainAttributes();
		attrs.putValue("Manifest-Version", "1.0");
		attrs.putValue("Created-By", RubyCompiler.VERSION + " (XRuby)");
		attrs.putValue("Main-Class", NameFactory.createMainClass(script_name));
		//If use -jar on the java.exe command line, java.exe will quietly ignore
		//the set environment classpath and any -classpath or -cp command line options.
		//So have to mention them in the Class-Path manifest entry
		attrs.putValue("Class-Path", "xruby-"+ RubyCompiler.VERSION + ".jar");
		return manifest;
	}

	/*
	 * @return an instance of RubyProgram.
	 */
	public RubyProgram getRubyProgram() throws InstantiationException, IllegalAccessException {

		CompilationResultLoader loader = new CompilationResultLoader();
		Class classToRun = null;
		for (CompilationResult result : results_) {
			classToRun = result.load(loader);
		}

		//The "main program" is always the last one.
		return (RubyProgram)classToRun.newInstance();
	}
}
