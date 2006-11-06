package com.xruby.runtime.value;

import java.io.*;

import com.xruby.runtime.lang.*;

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
			if (mode.equals("w")) {
				file_.setLength(0);
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			file_ = null;
			return false;
		}
	}
	
	public boolean eof() throws RubyException {
		try {
			return file_.length() == file_.getFilePointer();
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
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
	
	public boolean print(String s) throws RubyException {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try {
			file_.writeBytes(s);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private StringValue readsTheEntireContents() throws IOException {
		int size = (int)file_.length();//TODO converted long to int
		byte[] buffer = new byte[size];
		file_.read(buffer);
		return new StringValue(new String(buffer));
	}

	private StringValue readUntilSeperator(String separator) throws IOException {
		//FIXME This is cheating, should read until separator
		return new StringValue(file_.readLine());
	}
	
	public RubyValue gets(RubyValue separator) throws RubyException {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}

		try {
			if (ObjectFactory.nilValue == separator) {
				return ObjectFactory.createString(readsTheEntireContents());
			}

			if (separator.getRubyClass() != RubyRuntime.StringClass) {
				throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + separator.getRubyClass().getName() + " into String");
			}

			StringValue s = (StringValue)separator.getValue();
			return ObjectFactory.createString(readUntilSeperator(s.toString()));
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
}
