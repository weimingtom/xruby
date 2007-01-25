/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */


package com.xruby;

import java.io.*;
import java.util.*;
import org.apache.commons.cli.*;

class CommandLineOptions {
	private boolean compileOnly_ = false;
	private boolean help_ = false;
	private boolean eval_one_line_ = false;
	private boolean verbose_ = false;
	private boolean switch_ = false;
	private boolean strip_ = false;
	private String eval_script_ = "";
	private String file_ = null;
	private ArrayList<String> vars_ = new ArrayList<String>();
	private ArrayList<String> args_ = new ArrayList<String>();

	public boolean isCompileOnly() {
		return compileOnly_;
	}

	public boolean isHelp() {
		return help_;
	}

	public boolean isEvalOneLine() {
		return eval_one_line_;
	}
	
	public boolean isVerbose() {
		return verbose_;
	}

	public boolean isStrip() {
		return strip_;
	}
	
	public String getEvalScript() {
		return eval_script_;
	}

	public String getFilename() {
		return file_;
	}
	
	public String[] getVars() {
		return vars_.toArray(new String[]{});
	}
	
	public String[] getArgs() {
		return args_.toArray(new String[]{});
	}
	
	private String getRidOfQuote(String s) {
		if (s.charAt(0) == '\"' || s.charAt(0) == '\'') {
			return s.substring(1, s.length() - 1);
		} else {
			return s;
		}
	}
	
	//ruby supports single quote in the command line, while common-cli can not do that.
	//e.g. ruby -e 'print "hello"'
	private String[] preProcessSingleQuote(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		boolean find_single_quote = false;
		String temp = null;
		for (String s : args) {
			if (find_single_quote) {
				if (s.charAt(s.length() - 1) == '\'') {
					a.add(getRidOfQuote(temp + " " + s));
					find_single_quote = false;
				} else {
					temp = temp + " " + s;
				}
			} else if (s.charAt(0) == '\'') {
				if (s.charAt(s.length() - 1) == '\'') {
					a.add(getRidOfQuote(s));
				} else {
					temp = s;
					find_single_quote = true;
				}
			} else {
				a.add(s);
			}
		}
		
		return a.toArray(new String[] {});
	}
		
	@SuppressWarnings("unchecked")
	public CommandLineOptions(String[] args) {
		if (null == args) {
			return;
		}
		
		args = preProcessSingleQuote(args);

		CommandLineParser parser = new PosixParser();
		Options options = new Options();
		options.addOption("h", false, "display help");
		options.addOption("c", false, "compiler only");
		options.addOption("e", true, "eval one line");
		options.addOption("v", false, "print version number, then turn on verbose mode");
		options.addOption("s", false, "enable some switch parsing for switches after script name");
		options.addOption("x", false, "strip off text before #!ruby line");
		
		CommandLine line;
		try {
			line = parser.parse(options, args, true);
		} catch (ParseException e) {
			throw new Error(e.toString());
		}
		
		if (line.hasOption("c")) {
			compileOnly_ = true;
		} else if (line.hasOption("h")) {
			help_ = true;
		} else if (line.hasOption("v")) {
			verbose_ = true;
		} else if (line.hasOption("e")) {
			eval_one_line_ = true;
			eval_script_ = line.getOptionValue("e");
		} else if (line.hasOption("s")) {
			switch_ = true;
		} else if (line.hasOption("x")) {
			strip_ = true;
		}
		
		if (line.getArgList().size() > 0) {
			file_ = (String)line.getArgList().remove(0);
			args_.addAll(line.getArgList());
			if (switch_) {
				moveArgsToVars();
			}
		}
	}
	
	public void parseOptionsFromFile(String filename) {
		String s = readOptionsFromFile(filename);
		if (null == s) {
			return;
		}
		
		if (s.equals("-s")) {
			moveArgsToVars();
		}
	}
	
	private void moveArgsToVars() {
		for (int i = 0; i < args_.size();) {
			String s = args_.get(i);
			if (s.charAt(0) == '-') {
				vars_.add(s.substring(1));
				args_.remove(i);
			} else {
				++i;
			}
		}
	}
	
	private String readOptionsFromFile(String filename) {
		//e.g. #! /usr/local/bin/ruby -s\n
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			return null;
		}
		
		try {
			do {
				String s = reader.readLine();
				if (s != null && s.length() > "#! ruby".length()) {
					if (s.charAt(0) == '#' && s.charAt(1) == '!') {
						int i = s.indexOf("ruby");
						if (i > 0) {
							return s.substring(i + 4).trim();
						}
					}
				}
			} while (strip_);
		} catch (IOException e) {
			return null;
		}
		
		
		
		return null;
	}
}
