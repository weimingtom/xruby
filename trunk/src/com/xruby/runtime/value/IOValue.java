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
	
	public boolean eof() {
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
	
	public boolean print(String s) {
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

	private RubyValue readsTheEntireContents() throws IOException {
		int size = (int)file_.length();//TODO converted long to int
		byte[] buffer = new byte[size];
		file_.read(buffer);
		return ObjectFactory.createString(new String(buffer));
	}

	private RubyValue readUntilSeperator(String separator) throws IOException {
		//FIXME This is cheating, should read until separator
		String s = file_.readLine();
		if (null == s) {
			return ObjectFactory.nilValue;
		} else {
			return ObjectFactory.createString(s + "\n");
		}
	}
	
	public RubyValue gets(RubyValue separator) {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}

		try {
			if (ObjectFactory.nilValue == separator) {
				return readsTheEntireContents();
			}

			if (separator.getRubyClass() != RubyRuntime.StringClass) {
				throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + separator.getRubyClass().getName() + " into String");
			}

			RubyString s = (RubyString)separator.getValue();
			
			return readUntilSeperator(s.toString());
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public RubyValue read() {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try{
			return readsTheEntireContents();
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public RubyValue read(long length) {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try{
			long size = file_.length();
			size = Math.min(length, size);
			byte[] buffer = new byte[(int)size];
			file_.read(buffer);
			return ObjectFactory.createString(new String(buffer));
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public RubyValue read(int length, int offset) {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try{
			file_.seek(offset);
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
		
		return read(length);
	}
}
