package com.xruby.runtime.value;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class IOValue {
	private RandomAccessFile file_ = null;

	public IOValue(String filename, String mode) {
		open(filename, mode);
	}
	
	private String translateMode(String mode) {
		//TODO mode of RandomAccessFile is not as same as fopen()
		if (mode.equals("w")) {
			return "rw";
		} else {
			return mode;
		}
	}
	
	private boolean open(String filename, String mode) {
		assert(null == file_);
		try {
			file_ = new RandomAccessFile(filename, translateMode(mode));
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
	
	public void close() {
		if (null != file_) {
			try {
				file_.close();
				file_ = null;
			} catch (IOException e) {
				//Do not care
			}
		}
	}
	
	public boolean print(String s) {
		try {
			file_.writeChars(s);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
