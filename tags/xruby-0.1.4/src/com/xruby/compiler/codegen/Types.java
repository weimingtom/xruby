/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyData;
import com.xruby.runtime.value.RubyHash;
import com.xruby.runtime.value.RubyProc;

/*
 * This class is created to control the dependency between "compiler" and "runtime" package
 * This is still an ongoing process in very early stage. The goal is to make
 * other classes in 'codegen' package decoupled from the runtime, so that the
 * changes in 'runtime' package can have minimal impact on the 'codegen'.
 *
 * for example, in codegen, you can either use Types.RubyProgramClass, or use RubyProgram.class directly.
 * If you use the last one, than your code depends on runtime directly. The first one add a thin layer.
 * It is really nothing for know, but later we are going to more more to there, like method signatures
 * */
public class Types {
    public static Class RubyProgramClass = RubyProgram.class;
    public static Class RubyBlockClass = RubyBlock.class;
    public static Class RubyValueClass = RubyValue.class;
    public static Class RubyClassClass = RubyClass.class;
    public static Class RubyModuleClass = RubyModule.class;
    public static Class RubyDataClass = RubyData.class;
    public static Class RubyMethodClass = RubyMethod.class;
    public static Class RubyVarArgMethodClass = RubyVarArgMethod.class;
    public static Class RubyOneArgMethodClass = RubyOneArgMethod.class;
    public static Class RubyRuntimeClass = RubyRuntime.class;
    public static Class RubyArrayClass = RubyArray.class;
    public static Class RubyHashClass = RubyHash.class;
    public static Class RubyBindingClass = RubyBinding.class;
    public static Class RubyProcClass = RubyProc.class;
}
