/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyString;
import com.xruby.runtime.value.RubyProc;

class Module_AccessControl {
    static void run(int access, RubyModule c, RubyArray args, RubyBlock block) {
        if (null == args) {
            c.setAccessMode(access);
            return;
        }

        for (RubyValue arg : args) {
            String method_name;
            if (arg instanceof RubyString) {
                method_name = arg.toString();
            } else if (arg instanceof RubySymbol) {
                method_name = arg.toString();
            } else {
                throw new RubyException(RubyRuntime.TypeErrorClass, arg.toString() + " is not a symbol");
            }

            RubyID mid = RubyID.intern(method_name);

            if (c.setAccess(mid, access) == null) {
                throw new RubyException(RubyRuntime.NameErrorClass, "undefined method '" + method_name + "' for " + c.getName());
            }
        }
    }
}

class Module_public extends RubyVarArgMethod {
    public Module_public() {
        setAccess(PRIVATE);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        Module_AccessControl.run(PUBLIC, (RubyModule) receiver, args, block);
        return receiver;
    }
}

class Module_protected extends RubyVarArgMethod {
    public Module_protected() {
        setAccess(PRIVATE);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        Module_AccessControl.run(PROTECTED, (RubyModule) receiver, args, block);
        return receiver;
    }
}

class Module_private extends RubyVarArgMethod {
    public Module_private() {
        setAccess(PRIVATE);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        Module_AccessControl.run(PRIVATE, (RubyModule) receiver, args, block);
        return receiver;
    }
}

class Module_private_class_method extends RubyVarArgMethod {
    public Module_private_class_method() {
        setAccess(PRIVATE);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        Module_AccessControl.run(PRIVATE, receiver.getRubyClass(), args, block);
        return receiver;
    }
}

class Module_name extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyModule m = (RubyModule) receiver;
        RubyString s = ObjectFactory.createString();
        m.to_s(s);
        return s;
    }
}

class Module_inspect extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return RubyAPI.callPublicMethod(receiver, args, block, RubyID.toSID);
    }
}

class Module_attr_reader extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule m = (RubyModule) receiver;

        for (RubyValue v : args) {
            String s = convertToString(v);
            m.defineMethod(s, new AttrReader(s));
        }

        return ObjectFactory.NIL_VALUE;
    }
}

class Module_attr_writer extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule m = (RubyModule) receiver;

        for (RubyValue v : args) {
            String s = convertToString(v);
            m.defineMethod(s + "=", new AttrWriter(s));
        }

        return ObjectFactory.NIL_VALUE;
    }
}

class Module_attr_accessor extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule m = (RubyModule) receiver;

        for (RubyValue v : args) {
            String s = convertToString(v);
            m.defineMethod(s, new AttrReader(s));
            m.defineMethod(s + "=", new AttrWriter(s));
        }

        return ObjectFactory.NIL_VALUE;
    }
}

class Module_attr extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule m = (RubyModule) receiver;

        String s = convertToString(args.get(0));
        m.defineMethod(s, new AttrReader(s));

        if (args.get(1) == ObjectFactory.TRUE_VALUE) {
            m.defineMethod(s + "=", new AttrWriter(s));
        }

        return ObjectFactory.NIL_VALUE;
    }
}

class Module_include extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule module = (RubyModule) receiver;
        if (args != null) {
            for (RubyValue m : args) {
                module.includeModule((RubyModule) m);
            }
        }

        return receiver;
    }
}

class Module_extend_object extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        arg.getSingletonClass().includeModule((RubyModule) receiver);
        return arg;
    }
}

class Module_ancestors extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyModule module = (RubyModule) receiver;
        RubyArray r = new RubyArray();
        module.collectIncludedModuleNames(r);
        return r;
    }
}

class Module_operator_less_than extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyModule)) {
            throw new RubyException(RubyRuntime.TypeErrorClass, "compared with non class/module");
        }

        return Module_operator_less_than.compareModule(receiver, arg);
    }

    static RubyValue compareModule(RubyValue module, RubyValue other_module) {
        if (module == other_module) {
           return ObjectFactory.FALSE_VALUE;
        }

        if (module instanceof RubyClass && other_module instanceof RubyClass) {
            RubyClass c1 = (RubyClass) module;
            RubyClass c2 = (RubyClass) other_module;
            if (c1.isKindOf(c2)) {
                return ObjectFactory.TRUE_VALUE;
            } else if (c2.isKindOf(c1)) {
                return ObjectFactory.FALSE_VALUE;
            }
        }

        return ObjectFactory.NIL_VALUE;

    }
}

class Module_operator_greater_than extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyModule)) {
            throw new RubyException(RubyRuntime.TypeErrorClass, "compared with non class/module");
        }

        return Module_operator_less_than.compareModule(arg, receiver);
    }
}

class Module_operator_greater_or_equal extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (!(arg instanceof RubyModule)) {
            throw new RubyException(RubyRuntime.TypeErrorClass, "compared with non class/module");
        }

        if (arg == receiver) {
           return ObjectFactory.TRUE_VALUE;
        }

        return Module_operator_less_than.compareModule(arg, receiver);
    }
}

class Module_operator_compare extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (receiver == arg) {
            return ObjectFactory.FIXNUM0;
        }

        if (!(arg instanceof RubyModule)) {
            return ObjectFactory.NIL_VALUE;
        }

        RubyModule module = (RubyModule) receiver;
        RubyModule other_module = (RubyModule) arg;

        if (module instanceof RubyClass && other_module instanceof RubyClass) {
            RubyClass c1 = (RubyClass) module;
            RubyClass c2 = (RubyClass) other_module;
            if (c1.isKindOf(c2)) {
                return ObjectFactory.FIXNUM_NEGATIVE_ONE;
            } else if (c2.isKindOf(c1)) {
                return ObjectFactory.FIXNUM1;
            }
        }

        return ObjectFactory.NIL_VALUE;
    }
}

class Module_case_equal extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        if (receiver instanceof RubyClass) {
            return RubyAPI.isKindOf(receiver, arg) ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
        } else {
            //TODO does not work as expected
            RubyModule module = (RubyModule) receiver;
            RubyArray a = new RubyArray();
            module.collectIncludedModuleNames(a);
            return a.include(arg.getRubyClass()) ? ObjectFactory.TRUE_VALUE : ObjectFactory.FALSE_VALUE;
        }
    }
}

class Module_module_function extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule module = (RubyModule) receiver;
        if (args != null) {
            for (RubyValue v : args) {
                RubySymbol s = (RubySymbol) v;
                module.module_function(s.toString());
            }
        }

        return receiver;
    }
}

class Module_public_instance_methods extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return get_instance_methods(receiver, args, block, RubyMethod.PUBLIC);
    }

    RubyValue get_instance_methods(RubyValue receiver, RubyArray args, RubyBlock block, int mode) {
        boolean include_super = false;
        if (args != null && args.get(0).isTrue()) {
            include_super = true;
        }

        RubyArray a = new RubyArray();
        if (include_super) {
            ((RubyClass)receiver).collectClassMethodNames(a, mode);
        } else {
            ((RubyModule)receiver).collectOwnMethodNames(a, mode);
        }
        return a;
    }
}

class Module_protected_instance_methods extends Module_public_instance_methods {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return get_instance_methods(receiver, args, block, RubyMethod.PROTECTED);
    }
}

class Module_private_instance_methods extends Module_public_instance_methods {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return get_instance_methods(receiver, args, block, RubyMethod.PRIVATE);
    }
}

class Module_module_eval extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        //TODO duplicated code: instance_eval
        if (null == args && null == block) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "block not supplied");
        }

        if (null != args) {
            RubyString program_text = (RubyString) args.get(0);
            RubyBinding binding = new RubyBinding();
            binding.setScope((RubyModule)receiver);
            binding.setSelf(receiver);
            return Kernel_eval.eval(program_text, binding, null);
        } else {
            block.setScope((RubyModule)receiver);
            block.setSelf(receiver);
            return block.invoke(receiver);
        }
    }
}

class Module_define_method extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {

        final RubyBlock b;
        if (null != args && args.size() == 1 && null != block) {
            b = block;
        } else {
            b = ((RubyProc)args.get(1)).getBlock();
        }

        String name = RubyTypesUtil.convertToJavaString(args.get(0));
        RubyModule m = (RubyModule)receiver;
        RubyMethod method = new RubyVarArgMethod() {
            protected RubyValue run(RubyValue _receiver, RubyArray _args, RubyBlock _block) {
                b.setArgsOfCurrentMethod(_args);
                return b.invoke(_receiver, _args);
            }
        };

        b.setCurrentMethod(method);
        return m.defineMethod(name, method);
    }
}

class Module_remove_method extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyModule m = (RubyModule)receiver;
        for (RubyValue arg : args) {
            String method_name = RubyTypesUtil.convertToJavaString(arg);
            m.undefMethod(method_name);
        }

        return receiver;
    }
}

class Module_const_get extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubySymbol s = RubyTypesUtil.convertToSymbol(arg);
        return RubyAPI.getConstant(receiver, s.toString());
    }
}

class Module_const_set extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        RubySymbol s = RubyTypesUtil.convertToSymbol(arg1);
        return RubyAPI.setConstant(arg2, receiver, s.toString());
    }
}

class Module_singleton_new extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyAPI.defineModule("");
    }
}

public class ModuleClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.ModuleClass;
        c.defineMethod("public", new Module_public());
        c.defineMethod("protected", new Module_protected());
        c.defineMethod("private", new Module_private());
        c.defineMethod("private_class_method", new Module_private_class_method());
        RubyMethod name = new Module_name();
        c.defineMethod(RubyID.toSID, name);
        c.defineMethod("name", name);
        c.defineMethod("inspect", new Module_inspect());
        c.defineMethod("include", new Module_include());
        c.defineMethod("extend_object", new Module_extend_object());
        c.defineMethod("<=>", new Module_operator_compare());
        c.defineMethod("<", new Module_operator_less_than());
        c.defineMethod(">", new Module_operator_greater_than());
        c.defineMethod(">=", new Module_operator_greater_or_equal());
        c.defineMethod("===", new Module_case_equal());
        c.defineMethod("ancestors", new Module_ancestors());
        c.defineMethod("public_instance_methods", new Module_public_instance_methods());
        c.defineMethod("private_instance_methods", new Module_private_instance_methods());
        c.defineMethod("protected_instance_methods", new Module_protected_instance_methods());
        c.defineMethod("module_function", new Module_module_function());
        RubyMethod module_eval = new Module_module_eval();
        c.defineMethod("module_eval", module_eval);
        c.defineMethod("class_eval", module_eval);
        c.defineMethod("const_get", new Module_const_get());
        c.defineMethod("const_set", new Module_const_set());
        c.defineMethod("define_method", new Module_define_method());
        c.defineMethod("remove_method", new Module_remove_method());

        c.setAccessPrivate();
        c.defineMethod("method_added", EmptyMethod.INSTANCE);
        c.defineMethod("attr_reader", new Module_attr_reader());
        c.defineMethod("attr_writer", new Module_attr_writer());
        c.defineMethod("attr_accessor", new Module_attr_accessor());
        c.defineMethod("attr", new Module_attr());
        c.setAccessPublic();

        c.getSingletonClass().defineMethod("new", new Module_singleton_new());
    }
}
