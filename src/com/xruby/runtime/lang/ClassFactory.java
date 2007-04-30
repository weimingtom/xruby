/**
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

class ClassFactory {
    private static boolean isValidDefinedClass(RubyClass klass, RubyClass superclass) {
        RubyClass realSuperClass = klass.getSuperClass().getRealClass();
        if (realSuperClass == superclass) {
            return true;
        }

        if (superclass == null && realSuperClass == RubyRuntime.ObjectClass) {
            return true;
        }

        return klass == RubyRuntime.ObjectClass && superclass == null;
    }

    public static RubyClass defineClass(String name, RubyClass superclass) {
        if (superclass == null) {
          superclass = RubyRuntime.ObjectClass;
        } else {
            if (superclass.getName().equals("Class")){
                throw new RubyException(RubyRuntime.TypeErrorClass,"can't make subclass of Class");
            }
        }

        RubyValue value = RubyRuntime.ObjectClass.getConstant(name);
        if (value != null) {
            if (!(value instanceof RubyClass)) {
                throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a class");
            }

            RubyClass klass = (RubyClass)value;

            if (!isValidDefinedClass(klass, superclass)) {
                throw new RubyException(RubyRuntime.NameErrorClass, name + " is already defined");
            }

            // FIXME: remove this method
            klass.setAccessPublic();

            ObjectSpace.add(klass);
            return klass;
        }

//        if (superclass == null) {
//            superclass = RubyRuntime.ObjectClass;
//        }

        RubyClass klass = createRubyClass(name, superclass);
        new RubySingletonClass(klass, superclass.getRubyClass());
        RubyRuntime.ObjectClass.setConstant(name, klass);

        inheritedBy(klass,superclass);

        ObjectSpace.add(klass);
        return klass;
    }

    public static RubyModule defineModule(String name) {
        RubyValue value = RubyRuntime.ObjectClass.getConstant(name);
        if (value != null) {
            if (value instanceof RubyModule) {
                RubyModule module = ((RubyModule)value);
                if (module.isRealModule()) {
                    return module;
                }
            }

            throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a module");
        }

        RubyModule module = createRubyModule(name);
        RubyRuntime.ObjectClass.setConstant(name, module);

        ObjectSpace.add(module);
        return module;
    }

    /**
     * Define a boot class.
     *
     * name, the name of the boot class to be defined.
     * superclass, the super class of the boot class to be defined.
     */
    static RubyClass defineBootClass(String name, RubyClass superclass) {
        RubyClass obj = createRubyClass(name, superclass);
        RubyClass constObj = (RubyRuntime.ObjectClass != null) ? RubyRuntime.ObjectClass : obj;
        constObj.setConstant(name, obj);
        return obj;
    }

    private static RubyClass createRubyClass(String name, RubyClass superclass) {
        RubyClass klass = new RubyClass(name, superclass, null);
        klass.setName(name);
        klass.setRubyClass(RubyRuntime.ClassClass);
        return klass;
    }

    private static RubyModule createRubyModule(String name) {
        RubyModule module = new RubyModule(name, null);
        module.setName(name);
        module.setRubyClass(RubyRuntime.ModuleClass);
        return module;
    }

    private static void inheritedBy(RubyClass klass,RubyClass superclass){
        if(!RubyRuntime.isBuiltinClass(klass.getName())){
            RubyID mid = StringMap.intern("inherited");
            RubyAPI.callOneArgMethod(superclass, klass, null, mid);
        }
    }

    private ClassFactory() {
    }
}
