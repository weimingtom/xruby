/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.xruby.runtime.lang.*;
import com.xruby.compiler.*;
import com.xruby.compiler.codegen.*;
import com.xruby.runtime.value.*;
import com.xruby.runtime.javasupport.JavaClass;

import java.io.*;
import java.util.jar.*;
import java.util.*;
import java.util.regex.Pattern;

//TODO imcomplete
class Kernel_eval extends RubyVarArgMethod {

	static RubyValue eval(RubyString program_text, RubyBinding binding) {
		RubyCompiler compiler = new RubyCompiler(binding, false);
		try {
			CompilationResults codes = compiler.compile(new StringReader(program_text.toString()));
			RubyProgram p = codes.getRubyProgram();
			if (null != binding) {
				return p.invoke(binding.getSelf(), binding.getVariables(), binding.getBlock(), binding.getScope());
			} else {
				return p.invoke();
			}
		} catch (RecognitionException e) {
			throw new RubyException(e.toString());
		} catch (TokenStreamException e) {
			throw new RubyException(e.toString());
		} catch (CompilerException e) {
			throw new RubyException(e.toString());
		} catch (InstantiationException e) {
			throw new RubyException(e.toString());
		} catch (IllegalAccessException e) {
			throw new RubyException(e.toString());
		}
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		
		RubyString program_text = (RubyString)args.get(0);

		RubyBinding binding = null;
		if (args.get(1) instanceof RubyBinding) {
			binding = (RubyBinding)args.get(1);
		}
		
		return eval(program_text, binding);
	}
}

class Kernel_binding extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		//compiler will do the magic and insert Binding object
		return args.get(0);
	}
}

class Kernel_puts extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		for (RubyValue arg : args) {
			if (ObjectFactory.nilValue == arg) {
				System.out.println("nil");
			} else if (arg instanceof RubyString){
				RubyString value = (RubyString)arg;
				System.out.println(value.toString());
			} else {
				RubyValue str = RubyAPI.callPublicMethod(arg, null, null, "to_s");
				RubyString value = (RubyString)str;
				System.out.println(value.toString());
			}
		}
		return ObjectFactory.nilValue;
	}
}

class Kernel_print extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return _run(GlobalVariables.get("$stdout"), args, block);
	}
	
	protected RubyValue _run(RubyValue receiver, RubyArray args, RubyBlock block) {
		// if no argument given, print `$_'
		if (null == args) {
			args = new RubyArray(GlobalVariables.get("$_"));
		}
		
		for (int i = 0; i < args.size(); ++i) {
			// insert the output field separator($,) if not nil
			if (i > 0 && GlobalVariables.get("$,") != ObjectFactory.nilValue) {
				RubyAPI.callPublicMethod(receiver, GlobalVariables.get("$,"), "write");
			}
			
			if (args.get(i) == ObjectFactory.nilValue) {
				RubyAPI.callPublicMethod(receiver, ObjectFactory.createString("nil"), "write");
			} else {
				RubyAPI.callPublicMethod(receiver, args.get(i), "write");
			}
		}
		
		// if the output record separator($\) is not nil, it will be appended to the output.
		if ( GlobalVariables.get("$\\") != ObjectFactory.nilValue) {
			RubyAPI.callPublicMethod(receiver, GlobalVariables.get("$\\"), "write");
		}

		return ObjectFactory.nilValue;
	}
}

class Kernel_printf extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		Object[] raw_args = new Object[args.size() - 1];
		for (int i = 1; i < args.size(); ++i) {
			Object v = args.get(i);
			if (v instanceof RubyFixnum) {
				raw_args[i - 1] = new Integer(((RubyFixnum)v).intValue());
			} else if (args.get(i) instanceof RubyString) {
				raw_args[i - 1] = args.get(i);
			} else {
				raw_args[i - 1] = v;
			}
		}

		String fmt = ((RubyString)args.get(0)).toString();
		System.out.printf(fmt, raw_args);
		return ObjectFactory.nilValue;
	}
}

class Kernel_p extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (null != args) {
			for (RubyValue arg : args) {
				RubyValue str = RubyAPI.callPublicMethod(arg, null, null, "inspect");
				RubyString value = (RubyString)str;
				System.out.print(value.toString());
			}
		}
		return ObjectFactory.nilValue;
	}
}

class Kernel_class extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return receiver.getRubyClass();
	}
}

class Kernel_operator_case_equal extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (receiver == arg) {
			return ObjectFactory.trueValue;
		} else {
			return RubyAPI.callPublicMethod(receiver, new RubyArray(arg), block, "==");
		}
	}
}

class Kernel_method_missing extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubySymbol method_name = (RubySymbol)args.get(0);
		throw new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method '" +  method_name.toString()+ "' for " + receiver.getRubyClass().getName());
	}
}

class Kernel_raise extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (null == args) {
			//With no arguments, raises the exception in $! or raises a RuntimeError if $! is nil.
			RubyValue v = GlobalVariables.get("$!");
			if (ObjectFactory.nilValue != v) {
				throw new RubyException((RubyClass)v, ""); 
			} else {
				throw new RubyException(RubyRuntime.RuntimeErrorClass, "");
			}
		} else if (1 == args.size() && (args.get(0) instanceof RubyString)) {
			//With a single String argument, raises a RuntimeError with the string as a message.
			throw new RubyException(RubyRuntime.RuntimeErrorClass, ((RubyString)args.get(0)).toString());
		} else if (args.get(0) instanceof RubyExceptionValue) {
			//Otherwise, the first parameter should be the name of an Exception class
			//(or an object that returns an Exception when sent exception). The optional second
			//parameter sets the message associated with the exception, and the third parameter
			//is an array of callback information.
			RubyExceptionValue v = (RubyExceptionValue)args.get(0);
			v.setMessage(1 == args.size() ? "" : ((RubyString)args.get(1)).toString());
			throw new RubyException(v);
		} else {
			RubyClass v = (RubyClass)args.get(0);
			throw new RubyException(v, 1 == args.size() ? "" : ((RubyString)args.get(1)).toString());
		}
	}
}

class JarLoader extends ClassLoader {
	public RubyProgram load(File filename) {
		JarFile jar = null;

		try {
			jar = new JarFile(filename);
			return _load(jar);
		} catch (IOException e) {
			return null;
		} catch (InstantiationException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		} finally {
			if (null != jar) {
				try {
					jar.close();
				} catch (IOException e) {
				}
			}
		}
	}

	private RubyProgram _load(JarFile jar) throws IOException, InstantiationException, IllegalAccessException {
		RubyProgram p = null;

		for (Enumeration<JarEntry> e = jar.entries(); e.hasMoreElements();) {
			JarEntry entry = e.nextElement();
			if (!entry.getName().endsWith(".class")) {
				continue;
			}

			BufferedInputStream stream = new BufferedInputStream(jar.getInputStream(entry));
			byte[] buffer = new byte[(int)entry.getSize()];
			stream.read(buffer);
			Class c = defineClass(NameFactory.filename2classname(entry.getName()), buffer, 0, buffer.length);
		
			if (entry.getName().endsWith("main.class")) {//FIXME better error checking
				p = (RubyProgram)c.newInstance();
			}
		}
		
		return p;
	}
}

class Kernel_require extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyString required_file = (RubyString)arg;
		File filename = NameFactory.find_corresponding_jar_file(required_file.toString(), null);//TODO search $:
		if (null == filename) {
			throw new RubyException(RubyRuntime.LoadErrorClass, "no such file to load -- " + required_file);
		}
		
		JarLoader jarloader = new JarLoader();
		RubyProgram p = jarloader.load(filename);
		if (null == p) {
			throw new RubyException(RubyRuntime.LoadErrorClass, "no such file to load -- " + required_file);
		}
	
		p.invoke();
		return ObjectFactory.trueValue;
	}
}

class Kernel_require_java extends RubyOneArgMethod {
    private static Pattern packagePattern = Pattern.compile("\\.");

	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyString className = (RubyString)arg;

        try {
            Class clazz = Class.forName(className.toString());
            String[] names = packagePattern.split(className.toString());
            String name = names[names.length - 1];

            JavaClass jClazz = new JavaClass(clazz);

            //TODO: The naming mechanism is not quite appropriate
            RubyAPI.setTopLevelConstant(jClazz, name);
            RubyAPI.setTopLevelConstant(jClazz, className.toString());
            
        } catch (ClassNotFoundException e) {
            throw new RubyException("Couldn't find class " + className.toString());
        }

        return ObjectFactory.trueValue;
	}
}

class Kernel_load extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		throw new RubyException("not implemented!");
		/*
		 * Loads and executes the Ruby program in the file aFileName.
		 * If the filename does not resolve to an absolute path, the
		 * file is searched for in the library directories listed in $:.
		 * If the optional wrap parameter is true, the loaded script will
		 * be executed under an anonymous module, protecting the calling
		 * program's global namespace. Any local variables in the loaded
		 * file will not be propagated to the loading environment. 
		 */
	}
}

class Kernel_to_s extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String className = receiver.getRubyClass().getName();
		return ObjectFactory.createString("#<" + className + ":0x" + Integer.toHexString(receiver.hashCode()) + "x>");
	}
}

class Kernel_lambda extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		block.setCreatedByLambda();
		return ObjectFactory.createProc(block);
	}
}

class Kernel_loop extends RubyMethod {
	public Kernel_loop() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (null == block) {
			throw new RubyException(RubyRuntime.LocalJumpErrorClass, "in `loop': no block given");
		}

		for (;;) {
			RubyValue v = block.invoke(receiver, args);
			if (block.breakedOrReturned()) {
				return v;
			}
		}
	}
}

class Kernel_open extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString filename = (RubyString)args.get(0);
		if (args.size() <= 1) {
			return ObjectFactory.createFile(filename.toString(), "r");
		} else {
			RubyString mode = (RubyString)args.get(1);
			return ObjectFactory.createFile(filename.toString(), mode.toString());
		}
	}
}

class Kernel_kind_of extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (RubyAPI.isKindOf(arg, receiver)) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Kernel_instance_of extends RubyOneArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (RubyAPI.isInstanceOf(arg, receiver)) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Kernel_respond_to extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		assertArgNumberAtLeast(args, 1);

		boolean include_private = (ObjectFactory.trueValue == args.get(1));
		if (hasMethod(receiver, convertToString(args.get(0)), include_private)) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}

	private boolean hasMethod(RubyValue receiver, String method_name, boolean include_private) {
		if (include_private) {
			return (null != receiver.findMethod(method_name));
		} else {
			return (null != receiver.findPublicMethod(method_name));
		}
	}
}

class Kernel_send extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (args.size() < 1) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "no method name given");
		}

		RubyValue method_name = args.remove(0);
		return RubyAPI.callMethod(receiver, args, block, convertToString(method_name));
	}
}

class Kernel_method extends RubyOneArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		String method_name = convertToString(arg);
		RubyMethod  m = receiver.findMethod(method_name);
		if (null == m) {
			throw new RubyException(RubyRuntime.NameErrorClass, "public method '" +  method_name + "' can not be found in '" + receiver.getRubyClass().getName() + "'");
		}
		return ObjectFactory.createMethod(receiver, method_name, m);
	}
}

class Kernel_methods extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray a = new RubyArray();
		receiver.collectMethodNames(a);
		return a;
	}
}

class Kernel_caller extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		int skip = 1;
		if (null != args) {
			skip = ((RubyFixnum)args.get(0)).intValue();
		}
		
		return FrameManager.caller(skip);
	}
}

class Kernel_at_exit extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		if (null == block) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "called without a block");
		}
		
		AtExitBlocks.registerBlock(block);
		return ObjectFactory.createProc(block);
	}
}

class Kernel_gsub extends String_gsub {

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(GlobalVariables.get("$_") instanceof RubyString)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "$_ value need to be String (" + GlobalVariables.get("$LAST_READ_LINE").getRubyClass().getName() + " given)");
		}

		GlobalVariables.set(super.run(GlobalVariables.get("$_"), args, block), "$_");
		return GlobalVariables.get("$_");
	}
}

class Kernel_gsub_danger extends String_gsub_danger {

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(GlobalVariables.get("$_") instanceof RubyString)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "$_ value need to be String (" + GlobalVariables.get("$_").getRubyClass().getName() + " given)");
		}

		RubyValue r = super.run(GlobalVariables.get("$_"), args, block);
		if (r != ObjectFactory.nilValue) {
			GlobalVariables.set(r, "$_");
		}
		return r;
	}
}

class Kernel_throw extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		assertArgNumberAtLeast(args, 1);
		
		if (!(args.get(0) instanceof RubySymbol)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, args.get(0).toString() + " is not a symbol");
		}
		
		RubySymbol s = (RubySymbol)args.get(0);
		RubyExceptionValueForThrow e = new RubyExceptionValueForThrow(s, args.get(1));
		throw new RubyException(e);
	}
}

class Kernel_catch extends RubyOneArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (!(arg instanceof RubySymbol)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, arg.toString() + " is not a symbol");
		}
		
		try {
			block.invoke(receiver, null);
		} catch (RubyException e) {
			Object ev = e.getRubyValue();
			if (ev instanceof RubyExceptionValueForThrow) {
				RubyExceptionValueForThrow v = (RubyExceptionValueForThrow)ev;
				if (v.isSameSymbol((RubySymbol)arg)) {
					return v.getReturnValue();
				}
			}
			throw e;
		}
		
		return ObjectFactory.nilValue;
	}
}

class Kernel_untrace_var extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		assertArgNumberAtLeast(args, 1);
		
		if (!(args.get(0) instanceof RubySymbol)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, args.get(0).toString() + " is not a symbol");
		}
		
		String name = ((RubySymbol)args.get(0)).toString();
		
		RubyValue v = args.get(1);
		if (v == ObjectFactory.nilValue) {
			GlobalVariables.removeAllTraceProc(name);
		} else if (v instanceof RubyProc) {
			GlobalVariables.removeTraceProc(name, (RubyProc)v);
		}
		
		return ObjectFactory.nilValue;
	}
}

class Kernel_trace_var extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		assertArgNumberAtLeast(args, 1);
		
		if (!(args.get(0) instanceof RubySymbol)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, args.get(0).toString() + " is not a symbol");
		}
		
		String name = ((RubySymbol)args.get(0)).toString();
		
		RubyValue v = args.get(1);
		if (v instanceof RubyProc) {
			GlobalVariables.addTraceProc(name, (RubyProc)v);
		} else if (null != block) {
			GlobalVariables.addTraceProc(name, ObjectFactory.createProc(block));
		} else {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "tried to create Proc object without a block");
		}
		
		return ObjectFactory.nilValue;
	}
}

class Kernel_block_given extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		if (null == block) {
			return ObjectFactory.falseValue;
		} else {
			return ObjectFactory.trueValue;
		}
	}
}

class Kernel_gets extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		try {
			s = in.readLine();
		} catch (IOException e) {
		}
		GlobalVariables.set((null == s ? ObjectFactory.nilValue : ObjectFactory.createString(s)), "$_");
		return GlobalVariables.get("$_");
	}
}

class Kernel_Float extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		return RubyTypesUtil.convertToFloat(arg);
	}
}

class Kernel_Integer extends RubyOneArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		return RubyTypesUtil.convertToFixnum(arg);
	}
}

public class KernelModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.KernelModule;
		m.defineMethod("class", new Kernel_class());
		m.defineMethod("raise", new Kernel_raise());
		m.defineMethod("===", new Kernel_operator_case_equal());
		m.defineMethod("to_s", new Kernel_to_s());
		m.defineMethod("loop", new Kernel_loop());
		m.defineMethod("open", new Kernel_open());
		m.defineMethod("kind_of?", new Kernel_kind_of());
		m.defineMethod("instance_of?", new Kernel_instance_of());
		m.defineMethod("respond_to?", new Kernel_respond_to());
		RubyMethod send = new Kernel_send();
		m.defineMethod("send", send);
		m.defineMethod("__send__", send);
		m.defineMethod("method", new Kernel_method());
		m.defineMethod("methods", new Kernel_methods());
		m.defineMethod("caller", new Kernel_caller());
		m.defineMethod("throw", new Kernel_throw());
		m.defineMethod("catch", new Kernel_catch());
		m.defineMethod("untrace_var", new Kernel_untrace_var());
		m.defineMethod("trace_var", new Kernel_trace_var());
		RubyMethod block_given = new Kernel_block_given();
		m.defineMethod("iterator?", block_given);
		m.defineMethod("block_given?", block_given);
		m.defineMethod("Float", new Kernel_Float());
		m.defineMethod("Integer", new Kernel_Integer());

		m.defineModuleMethod("puts", new Kernel_puts());
		m.defineModuleMethod("print", new Kernel_print());
		m.defineModuleMethod("printf", new Kernel_printf());
		m.defineModuleMethod("p", new Kernel_p());
		m.defineModuleMethod("gets", new Kernel_gets());
		
		m.setAccessPrivate();
		m.defineMethod("binding", new Kernel_binding());
		m.defineMethod("method_missing", new Kernel_method_missing());
		m.defineMethod("eval", new Kernel_eval());
		m.defineMethod("require", new Kernel_require());
		m.defineMethod("require_java", new Kernel_require_java());
		m.defineMethod("load", new Kernel_load());
		RubyMethod lambda = new Kernel_lambda();
		m.defineMethod("lambda", lambda);
		m.defineMethod("proc", lambda);
		m.defineMethod("at_exit", new Kernel_at_exit());
		m.defineMethod("gsub", new Kernel_gsub());
		m.defineMethod("gsub!", new Kernel_gsub_danger());
		m.defineMethod("sub", new Kernel_gsub());//TODO sub != gsub
		m.setAccessPublic();

		RubyRuntime.ObjectClass.includeModule(m);
	}
}
