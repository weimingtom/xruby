package com.xruby.compiler.codegen;

import com.xruby.runtime.lang.*;

/*
 * This class is created to control the dependency between "compiler" and "runtime" package
 * */
public class Types {
	public static Class RubyBlockClass = RubyBlock.class;
	public static Class RubyValueClass = RubyValue.class;
	public static Class RubyMethodClass = RubyMethod.class;
}
