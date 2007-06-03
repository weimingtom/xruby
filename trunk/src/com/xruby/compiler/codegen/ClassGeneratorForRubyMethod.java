/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Method;

class ClassGeneratorForRubyMethod extends ClassGenerator {

    private final String method_name_;//this name is saved for 'super'
    private final boolean is_singleton_method_;
    private final boolean has_only_one_arg_;

    public ClassGeneratorForRubyMethod(String method_name, String fileName, String name, int argc, boolean has_asterisk_parameter, int default_argc, boolean is_singleton_method) {
        super(name);
        method_name_ = method_name;
        is_singleton_method_ = is_singleton_method;
        has_only_one_arg_ = ((1 == argc) && !has_asterisk_parameter && (0 == default_argc));
        if (has_only_one_arg_) {
            mg_for_run_method_ = visitRubyOneArgMethod();
        } else {
            mg_for_run_method_ = visitRubyVarArgMethod(argc, has_asterisk_parameter, default_argc);
        }

        // set source file's name, for debug
        if (null != fileName) {
            cv_.visitSource(fileName, null);
        }


    }

    public boolean hasOnlyOneArg() {
        return has_only_one_arg_;
    }

    public void loadMethodPrameter(int index) {
        //signatiure:
        //run(RubyValue reciever, RubyArray args, RubyBlock block)
        //or
        //run(RubyValue reciever, RubyValue arg, RubyBlock block)
        if (has_only_one_arg_) {
            assert(0 == index);
            getMethodGenerator().loadArg(1);
        } else {
            super.loadMethodPrameter(index);
        }
    }

    public void storeMethodParameter(int index) {
        if (has_only_one_arg_) {
            assert(0 == index);
            getMethodGenerator().storeArg(1);
        } else {
            super.storeMethodParameter(index);
        }
    }

    String getMethodName() {
        return method_name_;
    }

    boolean isSingletonMethod() {
        return is_singleton_method_;
    }

    protected Class getCurrentType() {
        return Types.RubyMethodClass;
    }

    private MethodGenerator visitRubyVarArgMethod(int argc, boolean has_asterisk_parameter, int default_argc) {
        cv_.visit(Opcodes.V1_5,
                0,		//No modifier
                name_,
                null,								// signature
                "com/xruby/runtime/lang/RubyVarArgMethod",	// superName
                null								// interface
                );

        createConstructorOfRubyVarArgMethod(argc, has_asterisk_parameter, default_argc);

        return new MethodGenerator(Opcodes.ACC_PROTECTED,
                Method.getMethod("com.xruby.runtime.lang.RubyValue run(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock)"),
                cv_,
                null,
                null,
                false);
    }

    private MethodGenerator visitRubyOneArgMethod() {
                cv_.visit(Opcodes.V1_5,
                0,		//No modifier
                name_,
                null,								// signature
                "com/xruby/runtime/lang/RubyOneArgMethod",	// superName
                null								// interface
                );

        createConstructorOfRubyOneArgMethod();

        return new MethodGenerator(Opcodes.ACC_PROTECTED,
                Method.getMethod("com.xruby.runtime.lang.RubyValue run(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock)"),
                cv_,
                null,
                null,
                false);
    }

    private void createConstructorOfRubyVarArgMethod(int argc, boolean has_asterisk_parameter, int default_argc) {
        MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
                Method.getMethod("void <init> ()"),
                cv_,
                null,
                null,
                false);
        mg.loadThis();
        mg.push(argc);
        mg.push(has_asterisk_parameter);
        mg.push(default_argc);
        mg.invokeConstructor(Type.getType(Types.RubyVarArgMethodClass),
                        Method.getMethod("void <init> (int, boolean, int)"));
        mg.returnValue();
        mg.endMethod();
    }

    private void createConstructorOfRubyOneArgMethod() {
        MethodGenerator mg = new MethodGenerator(Opcodes.ACC_PUBLIC,
                Method.getMethod("void <init> ()"),
                cv_,
                null,
                null,
                false);
        mg.loadThis();
        mg.invokeConstructor(Type.getType(Types.RubyOneArgMethodClass),
                        Method.getMethod("void <init> ()"));
        mg.returnValue();
        mg.endMethod();
    }

}

