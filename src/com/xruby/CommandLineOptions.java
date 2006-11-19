/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */


package com.xruby;

import java.util.ArrayList;


class CommandLineOptions {
	private boolean compileOnly_ = false;
	private boolean help_ = false;
	private ArrayList<String> files_ = new ArrayList<String>();

	public boolean isCompileOnly() {
		return compileOnly_;
	}

	public boolean isHelp() {
		return help_;
	}

	public ArrayList<String> getFiles() {
		return files_;
	}
	
	public CommandLineOptions(String[] args) {
		if (null == args) {
			return;
		}
		
		for (String arg : args) {
			if (null == arg) {
				continue;
			} else if (arg.equals("-c")) {
				compileOnly_ = true;
			} else if (arg.equals("-h")) {
				help_ = true;
			} else if (arg.length() > 0){
				files_.add(arg);
			}
		}
	}
}
