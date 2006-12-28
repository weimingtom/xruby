package com.xruby.compiler.codegen;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

/*
 * This class is created to control the dependency between "compiler" and "runtime" package
 * */
public class Types {
	public static Class RubyBlockClass = RubyBlock.class;
	public static Class RubyValueClass = RubyValue.class;
	public static Class RubyClassClass = RubyClass.class;
	public static Class RubyModuleClass = RubyModule.class;
	public static Class RubyDataClass = RubyData.class;
	public static Class RubyMethodClass = RubyMethod.class;
	public static Class RubyRuntimeClass = RubyRuntime.class;
	public static Class AtExitBlocksClass = AtExitBlocks.class;
	public static Class RubyArrayClass = RubyArray.class;
	public static Class RubyHashClass = RubyHash.class;
}
