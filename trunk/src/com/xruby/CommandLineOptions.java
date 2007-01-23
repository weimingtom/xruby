/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */


package com.xruby;

import java.util.ArrayList;
import org.apache.commons.cli.*;

class CommandLineOptions {
	private boolean compileOnly_ = false;
	private boolean help_ = false;
	private boolean eval_one_line_ = false;
	private String eval_script_ = "";
	private ArrayList<String> files_ = new ArrayList<String>();
	private ArrayList<String> vars_ = new ArrayList<String>();

	public boolean isCompileOnly() {
		return compileOnly_;
	}

	public boolean isHelp() {
		return help_;
	}

	public boolean isEvalOneLine() {
		return eval_one_line_;
	}

	public String getEvalScript() {
		return eval_script_;
	}

	public ArrayList<String> getFiles() {
		return files_;
	}
	
	public ArrayList<String> getVars() {
		return vars_;
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
	
	//e.g. ruby -s filenams -zzz
	private String[] preProcessDashS(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		boolean seen_dash_s = false;
		for (String s : args) {
			if (seen_dash_s) {
				if (s.charAt(0) == '-') {
					vars_.add(s.substring(1));
				} else {
					a.add(s);
				}
			} else if (s.equals("-s")) {
				seen_dash_s = true;
			} else {
				//has not seen '-s'
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
		
		args = preProcessDashS(args);
		args = preProcessSingleQuote(args);

		CommandLineParser parser = new PosixParser();
		Options options = new Options();
		options.addOption("h", false, "display help");
		options.addOption("c", false, "compiler only");
		options.addOption("e", true, "eval one line");
		options.addOption("s", false, "enable some switch parsing for switches after script name");
		
		CommandLine line;
		try {
			line = parser.parse(options, args);
		} catch (ParseException e) {
			throw new Error(e.toString());
		}
		
		if (line.hasOption("c")) {
			compileOnly_ = true;
		} else if (line.hasOption("h")) {
			help_ = true;
		} else if (line.hasOption("e")) {
			eval_one_line_ = true;
			eval_script_ = line.getOptionValue("e");
		}
		
		files_.addAll(line.getArgList());
	}
}
