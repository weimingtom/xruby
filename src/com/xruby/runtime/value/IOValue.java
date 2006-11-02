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
	
	public boolean print(String s) throws RubyException {
		if (null == file_) {
			throw new RubyException(RubyRuntime.IOErrorClass, "file is not opened");
		}
		
		try {
			file_.writeChars(s);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private StringValue readsTheEntireContents() throws IOException {
		StringValue r = new StringValue();
		String s;
		while ((s = file_.readLine()) != null) {
			r.appendString(s);
			r.appendString("\n");//Line-terminating characters are discarded by readLine
		}
		return r;
	}

	private StringValue readUntilSeperator(String separator) throws IOException {
		//FIXME
		return null;
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
