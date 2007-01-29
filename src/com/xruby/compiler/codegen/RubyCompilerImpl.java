/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;
import java.math.BigInteger;
import java.util.*;
import com.xruby.compiler.codedom.*;
import com.xruby.runtime.lang.RubyBinding;

public class RubyCompilerImpl implements CodeVisitor {
	
	private ClassGenerator cg_;
	private Stack<ClassGenerator> suspended_cgs_ = new Stack<ClassGenerator>();
	private CompilationResults compilation_results_ = new CompilationResults();
	private String script_name_;
	private LabelManager labelManager_ = new LabelManager();
	private EnsureLabelManager ensureLabelManager_ = new EnsureLabelManager();
	private RubyBinding binding_;
	
	public RubyCompilerImpl(String script_name) {
		script_name_ = script_name;
	}
	
	private boolean isInGlobalScope() {
		return suspended_cgs_.empty() && !cg_.isInClassBuilder();
	}

	private boolean isInBlock() {
		return (cg_ instanceof ClassGeneratorForRubyBlock);
	}
	
	private boolean isInSingletonMethod() {
		if (cg_ instanceof ClassGeneratorForRubyMethod) {
			return ((ClassGeneratorForRubyMethod)cg_).isSingletonMethod();
		}
		
		return false;
	}
	
	public CompilationResults compile(Program program, RubyBinding binding) throws CompilerException {
		binding_ = binding;
		
		cg_ = new ClassGeneratorForRubyProgram(NameFactory.createClassName(script_name_, null), binding);
		program.accept(this);

		cg_.getMethodGenerator().endMethod();
		cg_.visitEnd();
		compilation_results_.add(cg_.getCompilationResult());
		return compilation_results_;
	}

	public void visitClassDefination1(String className) {

		cg_.getMethodGenerator().loadThis();

		if (isInGlobalScope()) {
			cg_.getMethodGenerator().RubyRuntime_GlobalScope();
		} else {
			cg_.getMethodGenerator().loadArg(1);
		}

		if (!cg_.getMethodGenerator().RubyRuntime_getBuiltinClass(className)) {
			cg_.getMethodGenerator().push(className);
		}
		//super class will be pushed next, then visitSuperClass() will be called
	}

	public void visitClassDefination2(String className) {
		cg_.getMethodGenerator().RubyModule_defineClass(className);

		//The class body may refer the constant, so save it before class builder starts.
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().storeLocal(cg_.getMethodGenerator().getLocalVariable(className));
		
		cg_.getMethodGenerator().dup();
		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(className);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder, false);
	}

	public void visitSingletonClassDefination1() {
		cg_.getMethodGenerator().loadThis();
	}

	public void visitSingletonClassDefination2() {
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().RubyValue_getSingletonClass();
		
		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder("SIGLETON");
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder, true);
	}

	public void visitClassDefinationEnd(boolean last_statement_has_return_value) {
		cg_.endClassBuilderMethod(last_statement_has_return_value);
	}

	public void visitModuleDefination(String moduleName) {
		cg_.getMethodGenerator().loadThis();

		if (!cg_.getMethodGenerator().RubyRuntime_getBuiltinModule(moduleName)) {
			if (isInGlobalScope()) {
				cg_.getMethodGenerator().RubyRuntime_GlobalScope();
			} else {
				cg_.getMethodGenerator().loadArg(1);
			}

			cg_.getMethodGenerator().RubyModule_defineModule(moduleName);
		}
		
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().storeLocal(cg_.getMethodGenerator().getLocalVariable(moduleName));

		cg_.getMethodGenerator().dup();
		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(moduleName);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder, false);
	}

	public void visitModuleDefinationEnd(boolean last_statement_has_return_value) {
		visitClassDefinationEnd(last_statement_has_return_value);//TODO
	}

	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_singleton_method) {

		String uniqueMethodName = NameFactory.createClassName(script_name_, methodName);

		cg_.getMethodGenerator().RubyModule_defineMethod(methodName, uniqueMethodName, is_singleton_method);

		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyMethod(methodName,
								uniqueMethodName,
								num_of_args,
								has_asterisk_parameter,
								num_of_default_args,
								is_singleton_method || (cg_.isInClassBuilder() && ((MethodGeneratorForClassBuilder)cg_.getMethodGenerator()).isSingleton()));
	}

	public String visitBlock(int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_for_in_expression) {
		String uniqueBlockName = NameFactory.createClassNameForBlock(script_name_);
		
		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyBlock(uniqueBlockName,
					num_of_args,
					has_asterisk_parameter,
					num_of_default_args,
					cg_.getSymbolTable(),
					is_for_in_expression,
					binding_);
		return uniqueBlockName;
	}

	public String[] visitBlockEnd(String uniqueBlockName, boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().ObjectFactory_nilValue();
		}

		cg_.getMethodGenerator().returnValue();
		cg_.getMethodGenerator().endMethod();
		
		String[] commons = ((ClassGeneratorForRubyBlock)cg_).createFieldsAndConstructorOfRubyBlock();
		String[] assigned_commons = ((ClassGeneratorForRubyBlock)cg_).getAssignedFields();
		
		cg_.visitEnd();
		compilation_results_.add(cg_.getCompilationResult());
		cg_ = suspended_cgs_.pop();
		
		cg_.getMethodGenerator().new_BlockClass(cg_.getType(), uniqueBlockName, commons, isInGlobalScope(), isInBlock());

		cg_.getMethodGenerator().storeBlockForFutureRestoreAndCheckReturned();

		return assigned_commons;
	}
	
	public void visitMethodDefinationParameter(String name) {
		cg_.addParameter(name);
	}

	public void visitMethodDefinationAsteriskParameter(String name) {
		cg_.setAsteriskParameter(name);
	}

	public void visitMethodDefinationBlockParameter(String name) {
		cg_.setBlockParameter(name);
	}

	public void visitMethodDefinationEnd(boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().ObjectFactory_nilValue();
		}

		cg_.getMethodGenerator().returnValue();
		cg_.getMethodGenerator().endMethod();
		cg_.visitEnd();
		
		compilation_results_.add(cg_.getCompilationResult());
		cg_ = suspended_cgs_.pop();
	}

	public Object visitMethodDefinationDefaultParameterBegin(int index) {
		Label next_label = new Label();

		cg_.getMethodGenerator().loadMethodPrameterLength();
		cg_.getMethodGenerator().push(index);
		cg_.getMethodGenerator().ifICmp(GeneratorAdapter.GT, next_label);

		cg_.getMethodGenerator().loadArg(1);
		
		return next_label;
	}

	public void visitMethodDefinationDefaultParameterEnd(Object next_label) {
		cg_.getMethodGenerator().RubyArray_add(false);
		cg_.getMethodGenerator().pop();
		cg_.getMethodGenerator().mark((Label)next_label);
	}

	public void visitNoParameter() {
		cg_.getMethodGenerator().pushNull();
	}

	public void visitNoParameterForSuper() {
		cg_.getMethodGenerator().loadArg(1);
	}

	public void visitNoBlock(boolean is_in_super) {
		if (is_in_super) {
			if (isInGlobalScope()) {
				cg_.getMethodGenerator().pushNull();
			} else {
				cg_.getMethodGenerator().loadArg(2);
			}
		} else {
			cg_.getMethodGenerator().pushNull();
		}
	}

	public void visitNoSuperClass() {
		cg_.getMethodGenerator().pushNull();
	}

	public void visitBlockArgument() {
		cg_.getMethodGenerator().RubyAPI_convertRubyValue2RubyBlock();
	}

	public void visitMethodCallBegin() {
		cg_.getMethodGenerator().addCurrentVariablesOnStack(Types.RubyValueClass);
	}

	private void transferValueFromBlock(String blockName, String[] assignedCommons) {
		if (null != assignedCommons) {
			for (String name : assignedCommons) {
				cg_.getMethodGenerator().restoreLocalVariableFromBlock(blockName, name);
			}
		}
	}
	
	public void visitMethodCallEnd(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName, boolean single_arg_no_block) {	
		cg_.getMethodGenerator().removeCurrentVariablesOnStack();

		if (hasReceiver) {
			if (single_arg_no_block) {
				cg_.getMethodGenerator().RubyAPI_callPublicMethod_OneArgNoBlcok(methodName);
			} else {
				cg_.getMethodGenerator().RubyAPI_callPublicMethod(methodName);
			}
		} else {
			if (single_arg_no_block) {
				cg_.getMethodGenerator().RubyAPI_callMethod_OneArgNoBlcok(methodName);
			} else {
				cg_.getMethodGenerator().RubyAPI_callMethod(methodName);
			}
		}

		transferValueFromBlock(blockName, assignedCommons);

		cg_.getMethodGenerator().returnIfBlockReturned();
	}

	public void visitBinaryOperator(String operator) {
		if (operator.equals("!=")) {
			cg_.getMethodGenerator().RubyAPI_callPublicMethod_OneArgNoBlcok("==");
			cg_.getMethodGenerator().RubyAPI_operatorNot();
		} else if (operator.equals("!~")) {
			cg_.getMethodGenerator().RubyAPI_callPublicMethod_OneArgNoBlcok("=~");
			cg_.getMethodGenerator().RubyAPI_operatorNot();
		} else {
			//operator as method call
			cg_.getMethodGenerator().RubyAPI_callPublicMethod_OneArgNoBlcok(operator);
		}
	}
	
	public Object visitAndBinaryOperatorLeft() {
		//The and and && operators evaluate their first operand. If false,
		//the expression returns false; otherwise, the expression returns
		//the value of the second operand. 
		cg_.getMethodGenerator().dup();
		Label label = (Label)visitAfterIfCondition();
		cg_.getMethodGenerator().pop();//discard the current value;
		return label;
	}

	public void visitAndBinaryOperatorRight(Object label) {
		cg_.getMethodGenerator().mark((Label)label);
	}

	public Object visitOrBinaryOperatorLeft() {
		//The or and || operators evaluate their first operand. If true, 
		//the expression returns true; otherwise, the expression returns
		//the value of the second operand. 
		cg_.getMethodGenerator().dup();
		Label label = (Label)visitAfterUnlessCondition();
		cg_.getMethodGenerator().pop();//discard the current value;
		return label;
	}

	public void visitOrBinaryOperatorRight(Object label) {
		visitAndBinaryOperatorRight(label);
	}

	public void visitUnaryOperator(String operator) {
		if (operator.equals("!")) {
			cg_.getMethodGenerator().RubyAPI_operatorNot();
		} else {
			cg_.getMethodGenerator().pushNull();
			cg_.getMethodGenerator().RubyAPI_callPublicMethod_OneArgNoBlcok(operator);
		}
	}
	
	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
		}
		cg_.getMethodGenerator().GlobalVatiables_set(var);
	}

	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
		}
		if (!is_multiple_assign) {
			cg_.getMethodGenerator().dup();//do not pop off empty stack
		}

		cg_.storeVariable(var);
	}

	public void visitFloatExpression(double value) {
		cg_.getMethodGenerator().ObjectFactory_createFloat(value);
	}

	public void visitFixnumExpression(int value) {
		cg_.getMethodGenerator().ObjectFactory_createFixnum(value);
	}

	public void visitBignumExpression(BigInteger value) {
		cg_.getMethodGenerator().ObjectFactory_createBignum(value);
	}

	public void visitStringExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createString(value);
	}
	
	public void visitStringExpressionWithExpressionSubstitutionBegin() {
		cg_.getMethodGenerator().ObjectFactory_createString();
	}
	
	public void visitStringExpressionWithExpressionSubstitution(String value) {
		cg_.getMethodGenerator().RubyString_append(value);
	}

	public void visitStringExpressionWithExpressionSubstitution() {
		cg_.getMethodGenerator().RubyString_append();
	}
	
	public void visitStringExpressionWithExpressionSubstitutionEnd() {
	}
	
	public void visitRegexpExpressionWithExpressionSubstitutionEnd() {
		cg_.getMethodGenerator().ObjectFactory_createRegexp();
	}

	public void visitCommandOutputExpressionWithExpressionSubstitutionEnd() {
		cg_.getMethodGenerator().RubyAPI_runCommandAndCaptureOutput();
	}
	
	public void visitRegexpExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createRegexp(value);
	}

	public void visitSymbolExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createSymbol(value);
	}
	
	public void visitTerminal() {
		cg_.getMethodGenerator().pop();
	}
	
	public void visitEof(boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().ObjectFactory_nilValue();
		}
		cg_.getMethodGenerator().returnValue();
	}

	public void visitLocalVariableExpression(String value) {
		cg_.loadVariable(value);
	}

	public void visitNilExpression() {
		cg_.getMethodGenerator().ObjectFactory_nilValue();
	}

	public Object visitAfterIfCondition() {
		cg_.getMethodGenerator().RubyAPI_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);
		return label;
	}

	public void visitWhileConditionBegin() {
		labelManager_.openNewScope();
		cg_.getMethodGenerator().mark(labelManager_.getCurrentNext());
	}

	public void visitWhileConditionEnd(boolean is_until) {		
		cg_.getMethodGenerator().RubyAPI_testTrueFalse();
		if (is_until) {
			cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, labelManager_.getCurrentX());
		} else {
			cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, labelManager_.getCurrentX());
		}

		cg_.getMethodGenerator().mark(labelManager_.getCurrentRedo());
	}

	public void visitWhileBodyEnd(boolean has_body) {
		if (has_body) {
			cg_.getMethodGenerator().pop();
		}
		
		cg_.getMethodGenerator().goTo(labelManager_.getCurrentNext());

		cg_.getMethodGenerator().mark(labelManager_.getCurrentX());
		visitNilExpression();//this is the value of while expression if no break is called.
		
		cg_.getMethodGenerator().mark(labelManager_.getCurrentBreak());
		labelManager_.closeCurrentScope();
	}

	public Object visitAfterIfBody(Object next_label, Object end_label) {
		if (null == end_label) {
			end_label = new Label();
		}
		
		if (null != next_label) {
			cg_.getMethodGenerator().goTo((Label)end_label);
			cg_.getMethodGenerator().mark((Label)next_label);
		} else {
			cg_.getMethodGenerator().mark((Label)end_label);
		}

		return end_label;
	}

	public Object visitAfterCaseCondition() {
		int i = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(i);
		return i;
	}

	public Object visitAfterWhenCondition(Object case_value) {
		int i = (Integer)case_value;
		cg_.getMethodGenerator().loadLocal(i);
		cg_.getMethodGenerator().RubyAPI_testCaseEqual();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);
		return label;
	}

	public Object visitAfterWhenBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}

	public void visitTrueExpression() {
		cg_.getMethodGenerator().ObjectFactory_trueValue();
	}

	public void visitFalseExpression() {
		cg_.getMethodGenerator().ObjectFactory_falseValue();
	}

	public Object visitAfterUnlessCondition() {
		cg_.getMethodGenerator().RubyAPI_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, label);
		return label;
	}

	public Object visitAfterUnlessBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}

	public Object visitBodyBegin(boolean has_ensure) {
		//once exceptio is thrown, everything already on the stack will be destoried. so if we have begin..end
		//in the method parameter. e.g. f(..., begin ..end, ...), the method receiver and parameter is already on the list.
		cg_.getMethodGenerator().saveCurrentVariablesOnStack();
		
		ensureLabelManager_.openNewScope();
		if (has_ensure) {
			ensureLabelManager_.setCurrentFinally(new Label());
		}
		cg_.getMethodGenerator().mark(ensureLabelManager_.getCurrentRetry());
		return ensureLabelManager_.getCurrentRetry();
	}

	public Object visitBodyAfter() {
		return cg_.getMethodGenerator().mark();
	}

	public void visitBodyEnd(Object label) {
		cg_.getMethodGenerator().mark((Label)label);
		ensureLabelManager_.closeCurrentScope();

		cg_.getMethodGenerator().restoreCurrentVariablesOnStack();
	}

	public int visitEnsureBodyBegin() {
		cg_.getMethodGenerator().mark(ensureLabelManager_.getCurrentFinally());
		int var = cg_.getMethodGenerator().newLocal(Type.getType(Object.class));
		cg_.getMethodGenerator().storeLocal(var);
		return var;
	}

	public void visitEnsureBodyEnd(int var) {
		cg_.getMethodGenerator().pop();
		cg_.getMethodGenerator().ret(var);
	}
		
	public Object visitPrepareEnsure1() {
		Label label = new Label();
		cg_.getMethodGenerator().visitJumpInsn(Opcodes.JSR, ensureLabelManager_.getCurrentFinally());
		return label;
	}

	public void visitEnsure(int exception_var) {
		if (exception_var >= 0) {
			Label l = ensureLabelManager_.getCurrentFinally();
			if (null != l) {
				cg_.getMethodGenerator().visitJumpInsn(Opcodes.JSR, l);
			}
			cg_.getMethodGenerator().loadLocal(exception_var);
			cg_.getMethodGenerator().throwException();
		} else {
			invokeFinallyIfExist();
		}
	}
	
	public Object visitPrepareEnsure() {
		Label after_exception = new Label();
		cg_.getMethodGenerator().goTo(after_exception);
		return after_exception;
	}

	public int visitRescueBegin(Object begin, Object end) {
		
		cg_.getMethodGenerator().catchRubyException((Label)begin, (Label)end);

		int exception_variable = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(exception_variable);
	
		return exception_variable;
	}

	public void visitRescueEnd(int exception_variable, boolean has_ensure) {
		if (!has_ensure) {
			cg_.getMethodGenerator().loadLocal(exception_variable);
			cg_.getMethodGenerator().throwException();
		}
	}

	public Object visitRescueVariable(String name, int exception_variable) {
		cg_.getMethodGenerator().loadLocal(exception_variable);
		cg_.getMethodGenerator().RubyAPI_testExceptionType();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);

		if (null != name) {
			cg_.getMethodGenerator().loadLocal(exception_variable);
			cg_.getMethodGenerator().RubyAPI_convertRubyException2RubyValue();
			cg_.getMethodGenerator().storeVariable(name);
		}

		return label;
	}
	
	public void visitAfterRescueBody(Object next_label, Object end_label) {
		cg_.getMethodGenerator().goTo((Label)end_label);
		cg_.getMethodGenerator().mark((Label)next_label);
	}
	
	public void visitArrayBegin(int size, boolean notSingleAsterisk) {
		cg_.getMethodGenerator().ObjectFactory_createArray(size, notSingleAsterisk);
		cg_.getMethodGenerator().addCurrentVariablesOnStack(Types.RubyArrayClass);
	}
	
	public void visitHashBegin() {
		//TODO use addCurrentVariablesOnStack/removeCurrentVariablesOnStack
		cg_.getMethodGenerator().ObjectFactory_createHash();
	}
	
	public void visitArrayElement(boolean asterisk, boolean is_method_call) {
		if (asterisk) {
			cg_.getMethodGenerator().RubyArray_expand(is_method_call);
		} else {
			cg_.getMethodGenerator().RubyArray_add(is_method_call);
		}
	}

	public void visitBinding() {
		cg_.createBinding(isInSingletonMethod(), isInGlobalScope(), isInBlock());
		cg_.getMethodGenerator().RubyArray_add(false);
	}
	
	public void visitHashElement() {
		cg_.getMethodGenerator().RubyHash_addValue();
	}
	
	public void visitArrayEnd() {
		cg_.getMethodGenerator().removeCurrentVariablesOnStack();
	}
	
	public void visitHashEnd() {
	}

	public void visitYieldBegin() {
		cg_.getMethodGenerator().loadBlock(isInBlock());
		cg_.getMethodGenerator().dup();//will be used to call breakOrReturned().
		visitSelfExpression();
	}

	public void visitYieldEnd() {
		cg_.getMethodGenerator().RubyBlock_invoke(isInBlock());
		cg_.getMethodGenerator().checkBreakedOrReturned(isInBlock());
	}

	public void visitSuperBegin() {
		cg_.getMethodGenerator().loadArg(0);//TODO error checking: super called outside of method (NoMethodError)
	}

	public void visitSuperEnd() {
		cg_.getMethodGenerator().RubyAPI_callSuperMethod(((ClassGeneratorForRubyMethod)cg_).getMethodName());
	}

	public void visitGlobalVariableExpression(String value) {
		cg_.getMethodGenerator().GlobalVatiables_get(value);
	}

	public void visitCommandOutputExpression(String value) {
		cg_.getMethodGenerator().RubyAPI_runCommandAndCaptureOutput(value);
	}

	private void invokeFinallyIfExist() {
		Label l = ensureLabelManager_.getCurrentFinally();
		if (null != l) {
			int tmp = cg_.getAnonymousLocalVariable();
			cg_.getMethodGenerator().storeLocal(tmp);//store then load to make stack size always equals 1
			cg_.getMethodGenerator().visitJumpInsn(Opcodes.JSR, l);
			cg_.getMethodGenerator().loadLocal(tmp);
		}
	}

	public void visitReturn() {
		if (isInBlock()) {
			invokeFinallyIfExist();
			cg_.getMethodGenerator().returnFromBlock();
		} else {
			invokeFinallyIfExist();
			cg_.getMethodGenerator().returnValue();
		}
	}

	public void visitAliasGlobalVariable(String newName, String oldName) {
		cg_.getMethodGenerator().GlobalVariables_alias(newName, oldName);
	}

	public void visitAliasMethod(String newName, String oldName) {
		cg_.getMethodGenerator().RubyModule_aliasMethod(newName, oldName);	
	}

	public void visitUndef(String name) {
		cg_.getMethodGenerator().RubyModule_undefMethod(name);
	}
	
	public void visitSelfExpression() {
		cg_.getMethodGenerator().loadSelf(isInBlock());
	}

	public void visitClassVariableExpression(String name) {
		cg_.getMethodGenerator().loadCurrentClass(cg_.isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
		cg_.getMethodGenerator().RubyModule_getClassVariable(name);
	}

	public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().saveRubyValueAsLocalVariable();

		cg_.getMethodGenerator().loadCurrentClass(cg_.isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().RubyModule_setClassVariable(name);
	}
	
	public void visitInstanceVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGenerator().RubyValue_getInstanceVariable(name);
	}

	public void visitInstanceVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().saveRubyValueAsLocalVariable();
		visitSelfExpression();
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().RubyValue_setInstanceVariable(name);
	}
	
	public void visitMrhs(int var, int index, boolean asterisk) {
		cg_.getMethodGenerator().loadLocal(var);
		if (asterisk) {
			cg_.getMethodGenerator().RubyArray_collect(index);
		} else {
			cg_.getMethodGenerator().RubyArray_get(index);
		}
	}

	public int visitMultipleAssignmentBegin(boolean single_lhs, boolean single_rhs) {
		if (single_lhs) {
			cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue2();
			return 0;
		} else {
			if (single_rhs) {
				cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsOnlyOneRubyArray();
			}
			return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
		}
	}

	public void visitMultipleAssignmentEnd() {
		//do nothing
	}
	
	public int visitNestedVariableBegin(boolean single_lhs) {
		if (single_lhs) {
			return 0;
		} else {
			cg_.getMethodGenerator().RubyAPI_convertToArrayIfNotYet();
			return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
		}
	}
	
	public void visitNestedVariableEnd() {
		//do nothing
	}

	public void visitBreak() {
		if (isInBlock()) {
			invokeFinallyIfExist();
			cg_.getMethodGenerator().breakFromBlock();
		} else {
			invokeFinallyIfExist();
			cg_.getMethodGenerator().goTo(labelManager_.getCurrentBreak());
		}
	}

	public void visitNext() {
		if (isInBlock()) {
			cg_.getMethodGenerator().returnValue();
		} else {
			cg_.getMethodGenerator().pop();
			cg_.getMethodGenerator().goTo(labelManager_.getCurrentNext());
		}
	}

	public void visitRedo() {
		if (isInBlock()) {
			cg_.getMethodGenerator().pushNull();
			cg_.getMethodGenerator().redoFromBlock();
		} else {
			cg_.getMethodGenerator().goTo(labelManager_.getCurrentRedo());
		}
	}
	
	public void visitRetry() {
		if (isInBlock()) {
			cg_.getMethodGenerator().pushNull();
			cg_.getMethodGenerator().redoFromBlock();
		} else {
			cg_.getMethodGenerator().goTo(ensureLabelManager_.getCurrentRetry());
		}
	}

	public void visitExclusiveRangeOperator() {
		cg_.getMethodGenerator().push(true);
		cg_.getMethodGenerator().ObjectFactory_createRange();
	}

	public void visitInclusiveRangeOperator() {
		cg_.getMethodGenerator().push(false);
		cg_.getMethodGenerator().ObjectFactory_createRange();
	}

	public void visitCurrentNamespaceConstant(String name) {
		if (isInGlobalScope()) {
			visitTopLevelConstant(name);
			return;
		}

		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadCurrentClass();
		} else {
			visitSelfExpression();
			cg_.getMethodGenerator().RubyValue_getRubyClass();
		}

		cg_.getMethodGenerator().RubyModule_getCurrentNamespaceConstant(name);
	}

	public void visitConstant(String name) {
		cg_.getMethodGenerator().RubyAPI_getConstant(name);
	}

	public void visitTopLevelConstant(String name) {
		//quick access for builtin
		if (cg_.getMethodGenerator().RubyRuntime_getBuiltinClass(name)) {
			return;
		} else if (cg_.getMethodGenerator().RubyRuntime_getBuiltinModule(name)) {
			return;
		} else if (isInGlobalScope()) {
			cg_.getMethodGenerator().loadArg(3);
			cg_.getMethodGenerator().RubyAPI_getCurrentNamespaceConstant(name);
		} else {
			cg_.getMethodGenerator().RubyRuntime_GlobalScope();
			cg_.getMethodGenerator().RubyAPI_getCurrentNamespaceConstant(name);
		}
	}

	public void visitCurrentNamespaceConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (isInGlobalScope()) {
			visitTopLevelConstantAssignmentOperator(name, rhs_is_method_call, is_multiple_assign);
			return;
		}
		
		visitSelfExpression();
		visitConstantAssignmentOperator(name, rhs_is_method_call, is_multiple_assign);
	}
	
	public void visitConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		//TODO handle rhs_is_method_call and is_multiple_assignment
		cg_.getMethodGenerator().RubyAPI_setConstant(name);
	}

	public void visitTopLevelConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assignment) {
		//TODO handle rhs_is_method_call and is_multiple_assignment
		//TODO work with eval/binding
		cg_.getMethodGenerator().RubyAPI_setTopLevelConstant(name);
	}

	public void visitDefinedPublicMethod(String name) {
		cg_.getMethodGenerator().loadCurrentClass(cg_.isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
		cg_.getMethodGenerator().RubyAPI_isDefinedPublicMethod(name);
	}

	public void visitDefinedMethod(String name) {
		cg_.getMethodGenerator().RubyAPI_isDefinedMethod(name);
	}

	public void visitDefinedSuperMethod() {	
		if (cg_ instanceof ClassGeneratorForRubyMethod) {
			visitSelfExpression();
			cg_.getMethodGenerator().RubyAPI_isDefinedSuperMethod(((ClassGeneratorForRubyMethod)cg_).getMethodName());
		} else {
			visitNilExpression();
		}
	}

	public void visitDefinedLocalVariable(String name) {
		if (cg_.getSymbolTable().isDefinedInCurrentScope(name)) {
			visitStringExpression("local-variable");
		} else {
			visitNilExpression();
		}
	}

	public void visitDefinedYield() {
		if (cg_ instanceof ClassGeneratorForRubyMethod) {
			cg_.getMethodGenerator().loadArg(2);
			cg_.getMethodGenerator().RubyAPI_isDefinedYield();
		} else {
			visitNilExpression();
		}
	}

	public boolean isDefinedInCurrentScope(String name) {
		return cg_.isDefinedInCurrentScope(name);
	}

	public void visitSpecialLambdaCallBegin() {
		visitSelfExpression();
	}

	public void visitSpecialLambdaCallEnd(String blockName, String[] assignedCommons) {
		cg_.getMethodGenerator().RubyBlock_invoke(isInBlock());
		transferValueFromBlock(blockName, assignedCommons);
	}

	public void visitPotentialProcCall() {
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().instanceOf(Type.getType(Types.RubyProcClass));

		Label label1 = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label1);
		
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().checkCast(Type.getType(Types.RubyProcClass));

		//check if in the right context
		//TODO have not considered all the situations
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().RubyProc_isDefinedInAnotherBlock();
		Label label2 = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, label2);
		
		cg_.addVariableToBinding();//TODO should we use updateBinding()?
		cg_.getMethodGenerator().mark(label2);
		cg_.getMethodGenerator().pop();

		cg_.getMethodGenerator().mark(label1);
	}
	
}
