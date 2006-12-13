package com.xruby.runtime.builtin;

import java.io.File;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Dir_chdir extends RubyMethod {
	public Dir_chdir() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String dir = RubyTypesUtil.convertToString(args.get(0)).toString();
		File file = new File(dir);
		if (!file.isDirectory()){
			throw new RubyException(RubyRuntime.RuntimeErrorClass, "No a directory - " + dir);
		}
		System.setProperty("user.dir", file.getAbsolutePath());
		return ObjectFactory.fixnum0;		
	}
}

class Dir_getwd extends RubyMethod {
	public Dir_getwd() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createString(System.getProperty("user.dir"));	
	}
}

class Dir_mkdir extends RubyMethod {
	public Dir_mkdir() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String dir = RubyTypesUtil.convertToString(args.get(0)).toString();
		File file = new File(dir);
		if (file.mkdir()){
			return ObjectFactory.fixnum0;
		}
		throw new RubyException(RubyRuntime.RuntimeErrorClass, "Can't create directory - " + dir);
	}
}

class Dir_rmdir extends RubyMethod {
	public Dir_rmdir() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String dir = RubyTypesUtil.convertToString(args.get(0)).toString();
		File file = new File(dir);
		if (!file.isDirectory()){
			throw new RubyException(RubyRuntime.RuntimeErrorClass, "Not a directory - " + dir);
		}
		if (file.delete()){
			return ObjectFactory.fixnum0;
		}
		throw new RubyException(RubyRuntime.RuntimeErrorClass, "Can't delete directory - " + dir);
	}
}

class Dir_entries extends RubyMethod {
	public Dir_entries() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String dir = RubyTypesUtil.convertToString(args.get(0)).toString();
		File file = new File(dir);
		if (!file.isDirectory()){
			throw new RubyException(RubyRuntime.RuntimeErrorClass, "Not a directory - " + dir);
		}
		RubyArray files = new RubyArray();
		for (String f: file.list()){
			files.add(ObjectFactory.createString(f));
		}
		return files;
	}
}


public class DirClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.DirClass;
		
		c.getSingletonClass().defineMethod("chdir", new Dir_chdir());
		RubyMethod getwd = new Dir_getwd();
		c.getSingletonClass().defineMethod("getwd", getwd);
		c.getSingletonClass().defineMethod("pwd", getwd);
		c.defineMethod("mkdir", new Dir_mkdir());
		RubyMethod rmdir = new Dir_rmdir();
		c.getSingletonClass().defineMethod("rmdir", rmdir);
		c.getSingletonClass().defineMethod("delete", rmdir);
		c.getSingletonClass().defineMethod("unlink", rmdir);
		c.getSingletonClass().defineMethod("entries", new Dir_entries());
	
	}
	
}
