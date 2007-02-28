package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.*;
import com.xruby.runtime.builtin.ProcessBuilder;

public class RubyRuntime {
	public static RubyClass objectClass;
	public static RubyClass moduleClass;
	public static RubyClass classClass;
	public static RubyModule kernelModule;
	
	public static RubyClass symbolClass;
	public static RubyClass dataClass;
	
	public static RubyValue topSelf;
	
	public static RubyClass trueClass;
	public static RubyClass falseClass;
	public static RubyClass nilClass;
	
	public static RubyClass stringClass;
	
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
	public static RubyClass fileStatClass;
	
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
		
		StringClassBuilder.initialize();
		
		//FIXME enable the following line after compiler works with runtime
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
		
		KernelBuilder kernelBuilder = new KernelBuilder();
		kernelBuilder.initialize();
		
		SymbolBuilder symbolBuilder = new SymbolBuilder();
		symbolClass = symbolBuilder.getSymbolClass();
		
		DataBuilder dataClassBuilder = new DataBuilder();
		dataClassBuilder.initialize();
		dataClass = dataClassBuilder.getDataClass();
		
		TopSelfBuilder topSelfBuilder = new TopSelfBuilder();
		topSelfBuilder.initialize();
		topSelf = topSelfBuilder.getTopSelf();
		
		TrueBuilder trueClassBuilder = new TrueBuilder();
		trueClassBuilder.initialize();
		trueClass = trueClassBuilder.getTrueClass();
		RubyAPI.defineGlobalConst("TRUE", RubyConstant.QTRUE);
		
		FalseBuilder falseClassBuilder = new FalseBuilder();
		falseClassBuilder.initialize();		
		falseClass = falseClassBuilder.getFalseClass();
		RubyAPI.defineGlobalConst("FALSE", RubyConstant.QFALSE);
		
		NilBuilder nilClassBuilder = new NilBuilder();
		nilClassBuilder.initialize();
		nilClass = nilClassBuilder.getNilClass();
		RubyAPI.defineGlobalConst("NIL", RubyConstant.QNIL);
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
		fileStatClass = fileClassBuilder.getFileStatClass();
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

	private RubyRuntime() {		
	}
}