package com.xruby.newruntime.lang;

import com.xruby.newruntime.builtin.ArrayClassBuilder;
import com.xruby.newruntime.builtin.EnumModuleBuilder;
import com.xruby.newruntime.builtin.ExceptionBuilder;
import com.xruby.newruntime.builtin.FalseClassBuilder;
import com.xruby.newruntime.builtin.FileClassBuilder;
import com.xruby.newruntime.builtin.FixnumClassBuilder;
import com.xruby.newruntime.builtin.FloatClassBuilder;
import com.xruby.newruntime.builtin.HashClassBuilder;
import com.xruby.newruntime.builtin.IOClassBuilder;
import com.xruby.newruntime.builtin.IntegerClassBuilder;
import com.xruby.newruntime.builtin.NilClassBuilder;
import com.xruby.newruntime.builtin.NumericClassBuilder;
import com.xruby.newruntime.builtin.TopSelfBuilder;
import com.xruby.newruntime.builtin.TrueClassBuilder;

public class RubyRuntime {
	public static RubyClass objectClass;
	public static RubyClass moduleClass;
	public static RubyClass classClass;
	public static RubyModule kernelModule;
	
	public static RubyValue topSelf;
	
	public static RubyClass trueClass;
	public static RubyClass falseClass;
	public static RubyClass nilClass;	
	
	public static RubyModule enumerableModule;
	
	public static RubyClass exceptionException;
	public static RubyClass systemExitException;
	public static RubyClass fatalException;
	public static RubyClass signalException;
	public static RubyClass interruptException;
	
	public static RubyClass standardError;
	public static RubyClass typeError;
	public static RubyClass argumentError;
	public static RubyClass indexError;
	public static RubyClass rangeError;
	public static RubyClass nameError;
	
	public static RubyClass scriptError;
	public static RubyClass syntaxError;
	public static RubyClass loadError;
	public static RubyClass notImplementedError;
	
	public static RubyClass runtimeError;
	public static RubyClass securityError;
	public static RubyClass noMemoryError;
	
	public static RubyClass systemCallError;
	public static RubyModule errnoModule;
	
	public static RubyClass numericClass;
	public static RubyClass integerClass;
	public static RubyClass fixnumClass;
	public static RubyClass floatClass;
	
	public static RubyClass arrayClass;
	
	public static RubyClass hashClass;
	
	public static RubyClass ioError;
	public static RubyClass eofError;
	public static RubyClass ioClass;
	public static RubyClass fileClass;
	
	static CoreBuilder coreBuilder;
	
	static {
		initRuntime();
	}

	private static void initRuntime() {
		initObject();		
		initEnum();	
		initException();
		initNumeric();
		initArray();		
		initHash();
		initIO();
	}

	private static void initObject() {
		// init object
		coreBuilder = new CoreBuilder();
		coreBuilder.initialize();
		
		objectClass = coreBuilder.getObjectClass();
		moduleClass = coreBuilder.getModuleClass();
		classClass = coreBuilder.getClassClass();
		kernelModule = coreBuilder.getKernelModule();
		
		TopSelfBuilder topSelfBuilder = new TopSelfBuilder();
		topSelfBuilder.initialize();
		topSelf = topSelfBuilder.getTopSelf();
		
		TrueClassBuilder trueClassBuilder = new TrueClassBuilder();
		trueClassBuilder.initialize();
		trueClass = trueClassBuilder.getTrueClass();
		defineGlobalConst("TRUE", RubyConstant.QTRUE);
		
		FalseClassBuilder falseClassBuilder = new FalseClassBuilder();
		falseClassBuilder.initialize();		
		falseClass = falseClassBuilder.getFalseClass();
		defineGlobalConst("FALSE", RubyConstant.QFALSE);
		
		NilClassBuilder nilClassBuilder = new NilClassBuilder();
		nilClassBuilder.initialize();
		nilClass = nilClassBuilder.getNilClass();
		defineGlobalConst("NIL", RubyConstant.QNIL);
	}
	
	private static void initEnum() {
		// init enum
		EnumModuleBuilder builder = new EnumModuleBuilder();
		builder.initialize();
		enumerableModule = builder.getEnumModule();
	}
	
	private static void initException() {
		ExceptionBuilder builder = new ExceptionBuilder();
		builder.initialize();
		
		exceptionException = builder.getExceptionException();
		systemExitException = builder.getSystemExitException();
		fatalException = builder.getFatalException();
		signalException = builder.getSignalException();
		interruptException = builder.getInterruptException();
		
		standardError = builder.getStandardError();
		typeError = builder.getTypeError();
		argumentError = builder.getArgumentError();
		indexError =  builder.getIndexError();
		rangeError = builder.getRangeError();
		nameError = builder.getNameError();
		
		scriptError = builder.getScriptError();
		syntaxError =  builder.getSyntaxError();
		loadError = builder.getLoadError();
		notImplementedError = builder.getNotImplementedError();
		
		runtimeError = builder.getRuntimeError();
		securityError = builder.getSecurityError();
		noMemoryError = builder.getNoMemoryError();
		
		systemCallError = builder.getSystemCallError();
		errnoModule = builder.getErrnoModule();
	}
	
	private static void initNumeric() {
		// init numeric
		NumericClassBuilder numericClassBuilder = new NumericClassBuilder();
		numericClassBuilder.initialize();
		numericClass = numericClassBuilder.getNumericClass();
		
		IntegerClassBuilder integerClassBuilder = new IntegerClassBuilder();
		integerClassBuilder.initialize();		
		integerClass = integerClassBuilder.getIntegerClass();
		
		FixnumClassBuilder fixnumClassBuilder = new FixnumClassBuilder();
		fixnumClassBuilder.initialize();
		fixnumClass = fixnumClassBuilder.getFixnumClass();
		
		FloatClassBuilder floatClassBuilder = new FloatClassBuilder();
		floatClassBuilder.initialize();
		floatClass = floatClassBuilder.getFloatClass();
	}
	
	private static void initArray() {
		// init array
		ArrayClassBuilder builder = new ArrayClassBuilder();
		builder.initialize();
		arrayClass = builder.getArrayClass();
	}
	
	private static void initHash() {
		// init hash
		HashClassBuilder builder = new HashClassBuilder();
		builder.initialize();
		hashClass = builder.getHashClass();
	}
	
	private static void initIO() {
		IOClassBuilder builder = new IOClassBuilder();
		builder.initialize();
		ioError = builder.getIoError();
		eofError = builder.getEofError();
		ioClass = builder.getIoClass();
		
		FileClassBuilder fileClassBuilder = new FileClassBuilder();
		fileClassBuilder.initialize();
		fileClass = fileClassBuilder.getFileClass();
	}
	
	// API: Defining Classes
	public static RubyClass defineClass(String name, RubyClass superclass) throws RubyException {
		return coreBuilder.defineClass(name, superclass);
	}
	
	public static RubyModule defineModule(String name) throws RubyException {
		return coreBuilder.defineModule(name);
	}
	
	// API: Global
	public static void defineGlobalConst(String name, RubyValue value) {
		objectClass.defineConst(name, value);
	}
	
	public static void setGv(String name, RubyValue value) {		
	}
	
	public static RubyValue getGv(String name) {
		return null;
	}
	
	// API: Exception
	public static void raise(RubyClass exception, String fmt, Object... args) {
		String msg = String.format(fmt, args);
		RubyValue e = exception.newInstance();
		throw new RubyException(e, msg);
	}
	
	// API: log
	public static void warn(String fmt, Object... args) {
		
	}
	
	public static void warning(String fmt, Object... args) {
		
	}
	
	public static void exit(int status) {
		System.exit(status);
	}
	
	private RubyRuntime() {		
	}
}