package com.xruby.runtime.value;

import java.io.*;
import com.xruby.runtime.lang.*;

public class RubyIO extends RubyBasic {
	private RandomAccessFile file = null;

	RubyIO(String filename, String mode) {
		super(RubyRuntime.FileClass);//FIXME create a new class for file
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
		assert(null == file);
		try {
			file = new RandomAccessFile(filename, translateMode(mode));
			if (mode.equals("w")) {
				file.setLength(0);
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			file = null;
			return false;
		}
	}
	
	public boolean eof() {
		try {
			return file.length() == file.getFilePointer();
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public void close() {
		if (null != file) {
			try {
				file.close();
				file = null;
			} catch (IOException e) {
				//Do not care
			}
		}
	}
	
	public boolean print(String s) {
		if (null == file) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try {
			file.writeBytes(s);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private RubyValue readsTheEntireContents() throws IOException {
		int size = (int)file.length();//TODO converted long to int
		byte[] buffer = new byte[size];
		file.read(buffer);
		return ObjectFactory.createString(new String(buffer));
	}

	private RubyValue readUntilSeperator(String separator) throws IOException {
		//FIXME This is cheating, should read until separator
		String s = file.readLine();
		if (null == s) {
			return ObjectFactory.nilValue;
		} else {
			return ObjectFactory.createString(s + "\n");
		}
	}
	
	public RubyValue gets(RubyValue separator) {
		if (null == file) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}

		try {
			if (ObjectFactory.nilValue == separator) {
				return readsTheEntireContents();
			}

			if (!(separator instanceof RubyString)) {
				throw new RubyException(RubyRuntime.TypeErrorClass, "can't convert " + separator.getRubyClass().getName() + " into String");
			}

			RubyString s = (RubyString)separator;
			
			return readUntilSeperator(s.toString());
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public RubyValue read() {
		if (null == file) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try{
			return readsTheEntireContents();
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public RubyValue read(long length) {
		if (null == file) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try{
			long size = file.length();
			size = Math.min(length, size);
			byte[] buffer = new byte[(int)size];
			file.read(buffer);
			return ObjectFactory.createString(new String(buffer));
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
	}
	
	public RubyValue read(int length, int offset) {
		if (null == file) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try{
			file.seek(offset);
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.IOErrorClass, e.toString());
		}
		
		return read(length);
	}
}
