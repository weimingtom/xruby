package com.xruby.newruntime.lang;

import com.xruby.newruntime.builtin.ArrayBuilder;
import com.xruby.newruntime.builtin.BignumBuilder;
import com.xruby.newruntime.builtin.BindingBuilder;
import com.xruby.newruntime.builtin.ComparableBuilder;
import com.xruby.newruntime.builtin.DataBuilder;
import com.xruby.newruntime.builtin.DirBuilder;
import com.xruby.newruntime.builtin.EnumBuilder;
import com.xruby.newruntime.builtin.ExceptionBuilder;
import com.xruby.newruntime.builtin.FalseBuilder;
import com.xruby.newruntime.builtin.FileBuilder;
import com.xruby.newruntime.builtin.FixnumBuilder;
import com.xruby.newruntime.builtin.FloatBuilder;
import com.xruby.newruntime.builtin.GlobalBuilder;
import com.xruby.newruntime.builtin.HashBuilder;
import com.xruby.newruntime.builtin.IOBuilder;
import com.xruby.newruntime.builtin.IntegerBuilder;
import com.xruby.newruntime.builtin.KernelBuilder;
import com.xruby.newruntime.builtin.MarshalBuilder;
import com.xruby.newruntime.builtin.MathBuilder;
import com.xruby.newruntime.builtin.MethodBuilder;
import com.xruby.newruntime.builtin.NilBuilder;
import com.xruby.newruntime.builtin.NumericBuilder;
import com.xruby.newruntime.builtin.PrecisionBuilder;
import com.xruby.newruntime.builtin.ProcBuilder;
import com.xruby.newruntime.builtin.ProcessBuilder;
import com.xruby.newruntime.builtin.RangeBuilder;
import com.xruby.newruntime.builtin.RegexpBuilder;
import com.xruby.newruntime.builtin.StructBuilder;
import com.xruby.newruntime.builtin.ThreadBuilder;
import com.xruby.newruntime.builtin.TimeBuilder;
import com.xruby.newruntime.builtin.TopSelfBuilder;
import com.xruby.newruntime.builtin.TrueBuilder;

public class RubyRuntime {
	public static RubyClass objectClass;
	public static RubyClass moduleClass;
	public static RubyClass classClass;
	public static RubyModule kernelModule;
	
	public static RubyClass dataClass;
	
	public static RubyValue topSelf;
	
	public static RubyClass trueClass;
	public static RubyClass falseClass;
	public static RubyClass nilClass;	
	
	public static RubyModule comparableModule;
	
	public static RubyModule enumerableModule;
	
	public static RubyModule precisionModule;
	
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
	public static RubyClass noMethodError;
	public static RubyClass localJumpError;
	
	public static RubyClass scriptError;
	public static RubyClass syntaxError;
	public static RubyClass loadError;
	public static RubyClass notImplementedError;
	
	public static RubyClass runtimeError;
	public static RubyClass securityError;
	public static RubyClass noMemoryError;
	
	public static RubyClass systemCallError;
	public static RubyModule errnoModule;
	
	public static RubyClass threadError;
	public static RubyClass threadClass;
	public static RubyClass continuationClass;
	public static RubyClass threadGroupClass;

	public static RubyClass zeroDivError;
	public static RubyClass floatDomainError;
	public static RubyClass numericClass;
	public static RubyClass integerClass;
	public static RubyClass fixnumClass;
	public static RubyClass floatClass;
	public static RubyClass bignumClass;
	
	public static RubyClass arrayClass;
	
	public static RubyClass hashClass;
	
	public static RubyClass structClass;
	
	public static RubyClass regexpError;
	public static RubyClass regexpClass;
	public static RubyClass matchClass;
	
	public static RubyClass rangeClass;
	
	public static RubyClass ioError;
	public static RubyClass eofError;
	public static RubyClass ioClass;
	public static RubyClass fileClass;
	public static RubyModule fileTestModule;
	
	public static RubyClass dirClass;
	
	public static RubyClass timeClass;
	
	public static RubyModule processModule;
	
	public static RubyClass procClass;
	public static RubyClass methodClass;
	public static RubyClass unboundMethodClass;
	
	public static RubyClass bindingClass; 
	
	public static RubyModule mathModule;
	
	static CoreBuilder coreBuilder;
	
	static {
		initRuntime();
	}

	private static void initRuntime() {
		initObject();		
		initComparable();
		initEnum();	
		initPrecision();
		initException();
		initThread();
		initNumeric();
		initBignum();
		initArray();		
		initHash();
		initStruct();
		initRegexp();
		initRange();
		initIO();
		initDir();
		initTime();
		initProcess();
		initProc();
		initBinding();
		initMath();
		initMarshal();
		initGlobal();
		
		//FIXME enable the following line after compiler works with newruntime
		//initBuiltin();
	}
	
	//Load classes/modules implemented in builtin.rb
	private static void initBuiltin() {
		try {
			Class c = Class.forName("builtin.main");
			Object o = c.newInstance();
			RubyProgram p = (RubyProgram)o;
			p.run();
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (RubyException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	private static void initGlobal() {
		GlobalBuilder builder = new GlobalBuilder();
		builder.initialize();
	}

	private static void initObject() {
		// init object
		coreBuilder = new CoreBuilder();
		coreBuilder.initialize();
		
		objectClass = coreBuilder.getObjectClass();
		moduleClass = coreBuilder.getModuleClass();
		classClass = coreBuilder.getClassClass();
		kernelModule = coreBuilder.getKernelModule();
		
		KernelBuilder kernelBuilder = new KernelBuilder();
		kernelBuilder.initialize();
		
		DataBuilder dataClassBuilder = new DataBuilder();
		dataClassBuilder.initialize();
		dataClass = dataClassBuilder.getDataClass();
		
		TopSelfBuilder topSelfBuilder = new TopSelfBuilder();
		topSelfBuilder.initialize();
		topSelf = topSelfBuilder.getTopSelf();
		
		TrueBuilder trueClassBuilder = new TrueBuilder();
		trueClassBuilder.initialize();
		trueClass = trueClassBuilder.getTrueClass();
		defineGlobalConst("TRUE", RubyConstant.QTRUE);
		
		FalseBuilder falseClassBuilder = new FalseBuilder();
		falseClassBuilder.initialize();		
		falseClass = falseClassBuilder.getFalseClass();
		defineGlobalConst("FALSE", RubyConstant.QFALSE);
		
		NilBuilder nilClassBuilder = new NilBuilder();
		nilClassBuilder.initialize();
		nilClass = nilClassBuilder.getNilClass();
		defineGlobalConst("NIL", RubyConstant.QNIL);
	}
	
	private static void initComparable() {
		ComparableBuilder builder = new ComparableBuilder();
		builder.initialize();
		comparableModule = builder.getComparableModule();
	}
	
	private static void initEnum() {
		// init enum
		EnumBuilder builder = new EnumBuilder();
		builder.initialize();
		enumerableModule = builder.getEnumModule();
	}
	
	private static void initPrecision() {
		PrecisionBuilder builder = new PrecisionBuilder();
		builder.initialize();
		precisionModule = builder.getPrecisionModule();
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
		noMethodError = builder.getNoMethodError();
		
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
	
	private static void initThread() {
		ThreadBuilder builder = new ThreadBuilder();
		builder.initialize();
		threadError = builder.getThreadError();
		threadClass = builder.getThreadClass();
		continuationClass = builder.getContinuationClass();
		threadGroupClass = builder.getThreadGroupClass();
	}
	
	private static void initNumeric() {
		// init numeric
		NumericBuilder numericClassBuilder = new NumericBuilder();
		numericClassBuilder.initialize();
		zeroDivError = numericClassBuilder.getZeroDivError();
		floatDomainError = numericClassBuilder.getFloatDomainError();
		numericClass = numericClassBuilder.getNumericClass();
		
		IntegerBuilder integerClassBuilder = new IntegerBuilder();
		integerClassBuilder.initialize();		
		integerClass = integerClassBuilder.getIntegerClass();
		
		FixnumBuilder fixnumClassBuilder = new FixnumBuilder();
		fixnumClassBuilder.initialize();
		fixnumClass = fixnumClassBuilder.getFixnumClass();
		
		FloatBuilder floatClassBuilder = new FloatBuilder();
		floatClassBuilder.initialize();
		floatClass = floatClassBuilder.getFloatClass();
	}
	
	private static void initBignum() {
		BignumBuilder builder = new BignumBuilder();
		builder.initialize();
		bignumClass = builder.getBignumClass();
	}
	
	private static void initArray() {
		// init array
		ArrayBuilder builder = new ArrayBuilder();
		builder.initialize();
		arrayClass = builder.getArrayClass();
	}
	
	private static void initHash() {
		// init hash
		HashBuilder builder = new HashBuilder();
		builder.initialize();
		hashClass = builder.getHashClass();
	}
	
	private static void initStruct() {
		StructBuilder builder = new StructBuilder();
		builder.initialize();
		structClass = builder.getStructClass();		
	}
	
	private static void initRegexp() {
		RegexpBuilder builder = new RegexpBuilder();
		builder.initialize();
		regexpError = builder.getRegexpError();
		regexpClass = builder.getRegexpClass();
		matchClass = builder.getMatchClass();
	}
	
	private static void initRange() {
		RangeBuilder builder = new RangeBuilder();
		builder.initialize();
		rangeClass = builder.getRangeClass();
	}
	
	private static void initIO() {
		IOBuilder builder = new IOBuilder();
		builder.initialize();
		ioError = builder.getIoError();
		eofError = builder.getEofError();
		ioClass = builder.getIoClass();
		
		FileBuilder fileClassBuilder = new FileBuilder();
		fileClassBuilder.initialize();
		fileClass = fileClassBuilder.getFileClass();
		fileTestModule = fileClassBuilder.getFileTestModule();
	}
	
	private static void initDir() {
		DirBuilder builder = new DirBuilder();
		builder.initialize();
		dirClass = builder.getDirClass();
	}
	
	private static void initTime() {
		TimeBuilder builder = new TimeBuilder();
		builder.initialize();
		timeClass = builder.getTimeClass();
	}
	
	private static void initProcess() {
		ProcessBuilder builder = new ProcessBuilder();
		builder.initialize();
		processModule = builder.getProcessModule();
	}
	
	private static void initProc() {
		ProcBuilder procClassBuilder = new ProcBuilder();
		procClassBuilder.initialize();		
		procClass = procClassBuilder.getProcClass();
		
		MethodBuilder methodClassBuilder = new MethodBuilder();
		methodClassBuilder.initialize();
		methodClass = methodClassBuilder.getMethodClass();
		unboundMethodClass = methodClassBuilder.getUnboundMethodClass();
	}
	
	private static void initBinding() {
		BindingBuilder builder = new BindingBuilder();
		builder.initialize();
		bindingClass = builder.getBindingClass(); 
	}
	
	private static void initMath() {
		MathBuilder builder = new MathBuilder();
		builder.initialize();
		mathModule = builder.getMathModule();
	}
	
	private static void initMarshal() {
		MarshalBuilder builder = new MarshalBuilder();
		builder.initialize();
	}
	
	// API: Defining Classes
	public static RubyClass defineClass(String name, RubyClass superclass) throws RubyException {
		return coreBuilder.defineClass(name, superclass);
	}
	
	public static RubyModule defineModule(String name) throws RubyException {
		return coreBuilder.defineModule(name);
	}
	
	// API: Global
	public static void defineGlobalMethod(String name, RubyMethod method, int argc) {
		kernelModule.defineModuleMethod(name, method, argc);
	}
	
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