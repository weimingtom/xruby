package com.xruby.runtime.builtin;

import java.io.File;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.StringValue;

class File_is_file extends RubyMethod {
	public File_is_file() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		StringValue fileName = (StringValue)args.get(0).getValue();
		File file = new File(fileName.toString());
		if (file.isFile()){
			return ObjectFactory.trueValue;
		}
		return ObjectFactory.falseValue;
	}
}

public class FileClassBuilder {

	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("File", RubyRuntime.IOClass);
		//c.defineMethod("id2name", new Symbol_id2name());
		return c;
	}
	
	public static void initSingletonMethods() {
		ObjectFactory.FileClassValue.defineMethod("file?", new File_is_file());
	}
}
