/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

public class RubyRuntime {
    public static RubyClass ObjectClass;
    public static RubyClass ModuleClass;
    public static RubyClass ClassClass;
    public static RubyModule KernelModule;
    public static RubyModule ComparableModule;
    public static RubyModule EnumerableModule;
    public static RubyModule ErrnoModule;
    public static RubyModule FileTestModule;
    public static RubyModule GCModule;
    public static RubyModule MarshalModule;
    public static RubyModule MathModule;
    public static RubyModule ObjectSpaceModule;
    public static RubyModule ProcessModule;
    public static RubyClass BingingClass;
    public static RubyClass NilClassClass;
    public static RubyClass TrueClassClass;
    public static RubyClass FalseClassClass;
    public static RubyClass NumericClass;
    public static RubyClass IntegerClass;
    public static RubyClass FixnumClass;
    public static RubyClass BignumClass;
    public static RubyClass StringClass;
    public static RubyClass FloatClass;
    public static RubyClass ArrayClass;
    public static RubyClass HashClass;
    public static RubyClass SymbolClass;
    public static RubyClass IOClass;
    public static RubyClass ProcClass;
    public static RubyClass RangeClass;
    public static RubyClass RegexpClass;
    public static RubyClass FileClass;
    public static RubyClass MethodClass;
    public static RubyClass TimeClass;
    public static RubyClass MatchDataClass;
    public static RubyClass DirClass;
    public static RubyClass StructClass;
    public static RubyClass ThreadGroupClass;
    public static RubyClass ThreadClass;
	public static RubyClass UnboundMethodClass;

    public static RubyClass ExceptionClass;
    public static RubyClass StandardErrorClass;
    public static RubyClass TypeErrorClass;
    public static RubyClass ArgumentErrorClass;
    public static RubyClass IndexErrorClass;
    public static RubyClass RangeErrorClass;
    public static RubyClass NameErrorClass;
    public static RubyClass ThreadErrorClass;
    public static RubyClass NoMethodErrorClass;
    public static RubyClass IOErrorClass;
    public static RubyClass RuntimeErrorClass;
    public static RubyClass LocalJumpErrorClass;
    public static RubyClass SystemCallErrorClass;

    public static RubyClass ScriptErrorClass;
    public static RubyClass SyntaxErrorClass;
    public static RubyClass LoadErrorClass;
    public static RubyClass NotImplementedErrorClass;
    
    public static boolean running = false;

    static {
        //Note: order is important: should creare parent classes first!

        ObjectClass = ClassFactory.defineBootClass("Object", null);
        ModuleClass = ClassFactory.defineBootClass("Module", RubyRuntime.ObjectClass);
        ClassClass = ClassFactory.defineBootClass("Class", RubyRuntime.ModuleClass);

        RubySingletonClass metaClass = new RubySingletonClass(ObjectClass, ClassClass);
        metaClass = new RubySingletonClass(ModuleClass, metaClass);
        metaClass = new RubySingletonClass(ClassClass, metaClass);

        KernelModule = RubyAPI.defineModule("Kernel");

        ComparableModule = RubyAPI.defineModule("Comparable");
        EnumerableModule = RubyAPI.defineModule("Enumerable");
        ErrnoModule = RubyAPI.defineModule("Errno");
        FileTestModule = RubyAPI.defineModule("FileTest");
        GCModule = RubyAPI.defineModule("GC");
        MarshalModule = RubyAPI.defineModule("Marshal");
        MathModule = RubyAPI.defineModule("Math");
        ObjectSpaceModule = RubyAPI.defineModule("ObjectSpace");
        ProcessModule = RubyAPI.defineModule("Process");

        BingingClass = RubyAPI.defineClass("Binding", RubyRuntime.ObjectClass);
        NilClassClass = RubyAPI.defineClass("NilClass", RubyRuntime.ObjectClass);
        TrueClassClass = RubyAPI.defineClass("TrueClass", RubyRuntime.ObjectClass);
        FalseClassClass = RubyAPI.defineClass("FalseClass", RubyRuntime.ObjectClass);
        NumericClass = RubyAPI.defineClass("Numeric", RubyRuntime.ObjectClass);
        IntegerClass = RubyAPI.defineClass("Integer", RubyRuntime.NumericClass);
        FixnumClass = RubyAPI.defineClass("Fixnum", RubyRuntime.IntegerClass);
        BignumClass = RubyAPI.defineClass("Bignum", RubyRuntime.IntegerClass);
        StringClass = RubyAPI.defineClass("String", RubyRuntime.ObjectClass);
        FloatClass = RubyAPI.defineClass("Float", RubyRuntime.NumericClass);
        ArrayClass = RubyAPI.defineClass("Array", RubyRuntime.ObjectClass);
        HashClass = RubyAPI.defineClass("Hash", RubyRuntime.ObjectClass);
        SymbolClass = RubyAPI.defineClass("Symbol", RubyRuntime.ObjectClass);
        IOClass = RubyAPI.defineClass("IO", RubyRuntime.ObjectClass);
        ProcClass = RubyAPI.defineClass("Proc", RubyRuntime.ObjectClass);
        RangeClass = RubyAPI.defineClass("Range", RubyRuntime.ObjectClass);
        RegexpClass = RubyAPI.defineClass("Regexp", RubyRuntime.ObjectClass);
        FileClass = RubyAPI.defineClass("File", RubyRuntime.IOClass);
        MethodClass = RubyAPI.defineClass("Method", RubyRuntime.ObjectClass);
        TimeClass = RubyAPI.defineClass("Time", RubyRuntime.ObjectClass);
        MatchDataClass = RubyAPI.defineClass("MatchData", RubyRuntime.ObjectClass);
        DirClass = RubyAPI.defineClass("Dir", RubyRuntime.ObjectClass);
        StructClass = RubyAPI.defineClass("Struct", RubyRuntime.ObjectClass);
        ThreadGroupClass = RubyAPI.defineClass("ThreadGroup", RubyRuntime.ObjectClass);
        ThreadClass = RubyAPI.defineClass("Thread", RubyRuntime.ObjectClass);
		UnboundMethodClass = RubyAPI.defineClass("UnboundMethod", RubyRuntime.ObjectClass);

        ExceptionClass = RubyAPI.defineClass("Exception", RubyRuntime.ObjectClass);
        StandardErrorClass = RubyAPI.defineClass("StandardError", ExceptionClass);
        TypeErrorClass = RubyAPI.defineClass("TypeError", StandardErrorClass);
        ArgumentErrorClass = RubyAPI.defineClass("ArgumentError", StandardErrorClass);
        IndexErrorClass = RubyAPI.defineClass("IndexError", StandardErrorClass);
        RangeErrorClass = RubyAPI.defineClass("RangeError", StandardErrorClass);
        NameErrorClass = RubyAPI.defineClass("NameError", StandardErrorClass);
        ThreadErrorClass = RubyAPI.defineClass("ThreadError", StandardErrorClass);
        NoMethodErrorClass = RubyAPI.defineClass("NoMethodError", NameErrorClass);
        IOErrorClass = RubyAPI.defineClass("IOError", StandardErrorClass);
        RuntimeErrorClass = RubyAPI.defineClass("RuntimeError", StandardErrorClass);
        LocalJumpErrorClass = RubyAPI.defineClass("LocalJumpError", StandardErrorClass);
        SystemCallErrorClass = RubyAPI.defineClass("SystemCallError", StandardErrorClass);

        ScriptErrorClass = RubyAPI.defineClass("ScriptError", ExceptionClass);
        SyntaxErrorClass = RubyAPI.defineClass("SyntaxError", ScriptErrorClass);
        LoadErrorClass = RubyAPI.defineClass("LoadError", ScriptErrorClass);
        NotImplementedErrorClass = RubyAPI.defineClass("NotImplementedError", ScriptErrorClass);

        ObjectClassBuilder.initialize();
        ModuleClassBuilder.initialize();
        ClassClassBuilder.initialize();
        KernelModuleBuilder.initialize();
        GCModuleBuilder.initialize();
        MarshalModuleBuilder.initialize();
        MathModuleBuilder.initialize();
        ErrnoModuleBuilder.initialize();
        NumericClassBuilder.initialize();
        IntegerClassBuilder.initialize();
        FixnumClassBuilder.initialize();
        BignumClassBuilder.initialize();
        StringClassBuilder.initialize();
        FloatClassBuilder.initialize();
        ArrayClassBuilder.initialize();
        HashClassBuilder.initialize();
        SymbolClassBuilder.initialize();
        IOClassBuilder.initialize();
        ProcClassBuilder.initialize();
        RangeClassBuilder.initialize();
        RegexpClassBuilder.initialize();
        FileClassBuilder.initialize();
        MethodClassBuilder.initialize();
        TimeClassBuilder.initialize();
		UnboundMethodClassBuilder.initialize();
        MatchDataClassBuilder.initialize();
        DirClassBuilder.initialize();
        StructClassBuilder.initialize();
        ExceptionClassBuilder.initialize();
        ThreadClassBuilder.initialize();
        ThreadGroupClassBuilder.initialize();
        FileTestModuleBuilder.initialize();
        ObjectSpaceModuleBuilder.initialize();
    }

    private static void initARGV(String[] args) {
        RubyArray argv = new RubyArray();
        if (args != null) {
            for (String arg : args) {
                argv.add(ObjectFactory.createString(arg));
            }
        }

        RubyAPI.setTopLevelConstant(argv, "ARGV");
    }

    private static void loadBuildinDotRb() {
        try {
            Class c = Class.forName("builtin.main");
            Object o = c.newInstance();
            RubyProgram p = (RubyProgram) o;
            p.invoke();
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
            throw new Error(e);
        }
    }

    public static void init(String[] args) {
        if (RubyRuntime.running) {
            return;
        }

        initARGV(args);

        RubyAPI.setTopLevelConstant(new RubyObject(RubyRuntime.ObjectClass), "ENV");
        RubyAPI.setTopLevelConstant(new RubyObject(RubyRuntime.IOClass), "STDOUT");
        RubyAPI.setTopLevelConstant(RubyAPI.isWindows() ? ObjectFactory.createString("mswin32") : ObjectFactory.createString("java"), "RUBY_PLATFORM");
        
        TopLevelSelfInitializer.initialize();
        GlobalVariables.initialize();

        loadBuildinDotRb();
        RubyRuntime.running = true;
    }

    public static void fini() {
        AtExitBlocks.invokeAll();
    }

    public static boolean isBuiltinClass(String name) {
        final String[] builtin_classes = {
                "Array", "Bignum", "Binding", "Class",
                //"Continuation",
                "Dir", "Exception",
                //"File::Stat",
                "FalseClass", "File", "Fixnum", "Float", "Hash", "Integer", "IO", "MatchData", "Method",
                "Module", "NilClass", "Numeric", "Object", "Proc", "Range", "Regexp", "String", "Struct",
                //"Struct::Tms"
                "Symbol", "ThreadGroup", "Thread", "ArgumentError",
                "Time", "TrueClass", "UnboundMethod",

                "Exception", "StandardError", "TypeError", "IndexError", "RangeError", "NameError", "NoMethodError", "IOError", "RuntimeError", "LocalJumpError","SystemCallError", 
                "ScriptError", "SyntaxError", "LoadError", "NotImplementedError","ThreadError",
        };

        for (String s : builtin_classes) {
            if (s.equals(name)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isBuiltinModule(String name) {
        final String[] builtin_classes = {
                "Comparable",
                "Enumerable",
                "Errno",
                "FileTest",
                "GC",
                "Kernel",
                "Marshal",
                "Math",
                "ObjectSpace",
                "Process ",
        };

        for (String s : builtin_classes) {
            if (s.equals(name)) {
                return true;
            }
        }

        return false;
    }
    
    private static boolean supported;
    public static boolean javaIsSupported(){
        return supported;
    }
    
    public static void setJavaSupported(boolean val){
        supported = val;
    }
}
