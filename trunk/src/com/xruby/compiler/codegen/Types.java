/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyHash;
import com.xruby.runtime.value.RubyProc;
import org.objectweb.asm.Type;

/*
 * This class is created to control the dependency between "compiler" and "runtime" package
 * This is still an ongoing process in very early stage. The goal is to make
 * other classes in 'codegen' package decoupled from the runtime, so that the
 * changes in 'runtime' package can have minimal impact on the 'codegen'.
 *
 * for example, in codegen, you can either use Types.RubyValueClass, or use RubyValue.class directly.
 * If you use the last one, than your code depends on runtime directly. The first one add a thin layer.
 * It is really nothing for know, but later we are going to more more to there, like method signatures
 * */
interface Types {
    static final Class RUBY_ARRAY_CLASS = RubyArray.class;
    static final Class RUBY_VALUE_CLASS = RubyValue.class;

    static final Type RUBY_NOARGMETHOD_TYPE = Type.getType(RubyNoArgMethod.class);
    static final Type RUBY_ONEARGMETHOD_TYPE = Type.getType(RubyOneArgMethod.class);
    static final Type RUBY_VARARGMETHOD_TYPE = Type.getType(RubyVarArgMethod.class);

    static final Type RUBY_NOARGBLOCK_TYPE = Type.getType(RubyNoArgBlock.class);
    static final Type RUBY_ONEARGBLOCK_TYPE = Type.getType(RubyOneArgBlock.class);
    static final Type RUBY_VARARGBLOCK_TYPE = Type.getType(RubyVarArgBlock.class);

    static final Type RUBY_RUNTIME_TYPE = Type.getType(RubyRuntime.class);
    static final Type RUBY_PROGRAM_TYPE = Type.getType(RubyProgram.class);
    static final Type RUBY_BLOCK_TYPE = Type.getType(RubyBlock.class);
    static final Type RUBY_CLASS_TYPE = Type.getType(RubyClass.class);
    static final Type RUBY_MODULE_TYPE = Type.getType(RubyModule.class);
    static final Type RUBY_METHOD_TYPE = Type.getType(RubyMethod.class);
    static final Type RUBY_ARRAY_TYPE = Type.getType(RubyArray.class);
    static final Type RUBY_VALUE_TYPE = Type.getType(RubyValue.class);
    static final Type RUBY_PROC_TYPE = Type.getType(RubyProc.class);
    static final Type RUBY_BINDING_TYPE = Type.getType(RubyBinding.class);
    static final Type RUBY_HASH_TYPE = Type.getType(RubyHash.class);
}
