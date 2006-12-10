/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;

import java.util.*;

import com.xruby.compiler.codedom.*;

public class RubyCompilerImpl implements CodeVisitor {
	
	private ClassGenerator cg_;
	private Stack<ClassGenerator> suspended_cgs_ = new Stack<ClassGenerator>();
	private CompilationResults compilation_results_ = new CompilationResults();
	private String script_name_;
	private LabelManager labelManager_ = new LabelManager();
	
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
	
	public CompilationResults compile(Program program)
			throws CompilerException {

		cg_ = new ClassGeneratorForRubyProgram(NameFactory.createClassName(script_name_, null));
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

	public String visitBlock(int num_of_args, boolean has_asterisk_parameter, int num_of_default_args) {
		String uniqueBlockName = NameFactory.createClassNameForBlock(script_name_);
		
		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyBlock(uniqueBlockName,
					num_of_args,
					has_asterisk_parameter,
					num_of_default_args,
					cg_.getSymbolTable());
		return uniqueBlockName;
	}

	public String[] visitBlockEnd(String uniqueBlockName, boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGenerator().ObjectFactory_nilValue();
		}

		cg_.getMethodGenerator().returnValue();
		cg_.getMethodGenerator().endMethod();
		cg_.visitEnd();

		String[] commons = ((ClassGeneratorForRubyBlock)cg_).createFieldsAndConstructorOfRubyBlock();
		String[] assigned_commons = ((ClassGeneratorForRubyBlock)cg_).getAssignedFields();
		
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
		cg_.getMethodGenerator().mark((Label)next_label);
	}

	public void visitNoParameter() {
		cg_.getMethodGenerator().pushNull();
	}

	public void visitNoBlock(boolean is_in_super) {
		if (is_in_super) {
			cg_.getMethodGenerator().loadArg(2);
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
	
	public void visitMethodCall(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName) {	
		if (hasReceiver) {
			cg_.getMethodGenerator().RubyAPI_callPublicMethod(methodName);
		} else {
			cg_.getMethodGenerator().RubyAPI_callMethod(methodName);
		}

		if (null != assignedCommons && assignedCommons.length > 0) {
			cg_.getMethodGenerator().dup();
			for (String name : assignedCommons) {
				cg_.getMethodGenerator().restoreLocalVariableFromBlock(blockName, name);
			}
		}

		if (null != blockName) {
			cg_.getMethodGenerator().returnIfBlockReturned();
		}
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

	public void visitIntegerExpression(String value, int radix) {
		cg_.getMethodGenerator().ObjectFactory_createInteger(value, radix);
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

	private class Pair<T1, T2> {
		T1 first;
		T2 second;

		Pair(T1 first, T2 second) {
			this.first = first;
			this.second = second;
		}
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

	public void visitWhileBodyEnd() {
		cg_.getMethodGenerator().pop();
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
	
	public Object visitPrepareEnsure() {
		Label before_ensure = new Label();
		cg_.getMethodGenerator().visitJumpInsn(Opcodes.JSR, before_ensure);
		Label after_ensure = new Label();
		cg_.getMethodGenerator().goTo(after_ensure);
		return new Pair<Label, Label>(before_ensure, after_ensure);
	}
	
	@SuppressWarnings("unchecked")
	public int visitEnsureBodyBegin(Object labels) {
		cg_.getMethodGenerator().mark(((Pair<Label, Label>)labels).first);
		int var = cg_.getMethodGenerator().newLocal(Type.getType(Object.class));
		cg_.getMethodGenerator().storeLocal(var);
		return var;
	}

	@SuppressWarnings("unchecked")
	public void visitEnsureBodyEnd(Object labels, int var) {
		cg_.getMethodGenerator().ret(var);
		cg_.getMethodGenerator().mark(((Pair<Label, Label>)labels).second);
	}

	public Object visitPrepareRescueBegin() {
		return cg_.getMethodGenerator().mark();
	}

	public Object visitPrepareRescueEnd(Object start) {
		Label end = cg_.getMethodGenerator().mark();

		Label after_exception = new Label();
		cg_.getMethodGenerator().goTo(after_exception);
		
		cg_.getMethodGenerator().catchRubyException((Label)start, end);

		int exception_variable = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(exception_variable);

		cg_.getMethodGenerator().pushNull();//hack???
		
		return new Pair<Integer, Label>(exception_variable, after_exception);
	}

	@SuppressWarnings("unchecked")
	public void visitRescueEnd(Object var, Object end_label) {
		cg_.getMethodGenerator().mark((Label)end_label);
		Label after_exception = ((Pair<Integer, Label>)var).second;
		cg_.getMethodGenerator().mark(after_exception);
	}

	@SuppressWarnings("unchecked")
	public Object visitRescueVariable(String name, Object var) {
		int exception_variable = ((Pair<Integer, Label>)var).first;
		
		cg_.getMethodGenerator().loadLocal(exception_variable);
		cg_.getMethodGenerator().RubyAPI_testExceptionType();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);
		cg_.getMethodGenerator().pop();//hack???

		if (null != name) {
			cg_.getMethodGenerator().loadLocal(exception_variable);
			cg_.getMethodGenerator().RubyAPI_convertRubyException2RubyValue();
			cg_.getMethodGenerator().storeVariable(name);
		}

		return label;
	}
	
	public Object visitAfterRescueBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}
	
	public void visitArrayBegin(int size, boolean notSingleAsterisk) {
		cg_.getMethodGenerator().ObjectFactory_createArray(size, notSingleAsterisk);
	}
	
	public void visitHashBegin() {
		cg_.getMethodGenerator().ObjectFactory_createHash();
	}

	public void visitArrayElementBegin() {
		cg_.getMethodGenerator().dup();
	}

	public void visitHashElementBegin() {
		cg_.getMethodGenerator().dup();
	}
	
	public void visitArrayElementEnd(boolean asterisk, boolean is_method_call) {
		if (asterisk) {
			cg_.getMethodGenerator().RubyArray_expand(is_method_call);
		} else {
			cg_.getMethodGenerator().RubyArray_add(is_method_call);
		}
	}
	
	public void visitHashElementEnd() {
		cg_.getMethodGenerator().HashValue_addValue();
	}
	
	public void visitArrayEnd() {
	}
	
	public void visitHashEnd() {
	}

	public void visitYieldBegin() {
		if (isInBlock()) {
			cg_.getMethodGenerator().loadBlockOfCurrentMethod();
		} else {
			cg_.getMethodGenerator().loadArg(2);//TODO error checking: make sure yield is called in the right context
		}
		cg_.getMethodGenerator().dup();//will be used to call breaked().
		visitSelfExpression();
	}

	public void visitYieldEnd() {
		cg_.getMethodGenerator().RubyBlock_invoke();
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

	public void visitReturn() {
		if (isInBlock()) {
			cg_.getMethodGenerator().returnFromBlock();
		} else {
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
		cg_.getMethodGenerator().loadSelf(isInGlobalScope(), isInBlock());
	}

	public void visitClassVariableExpression(String name) {
		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadCurrentClass();
		} else if (isInSingletonMethod()) {
			visitSelfExpression();
			cg_.getMethodGenerator().checkCast(Type.getType(Types.RubyClassClass));
		} else if (isInGlobalScope()) {
			visitSelfExpression();
			cg_.getMethodGenerator().RubyValue_getRubyClass();
		} else {
			cg_.getMethodGenerator().loadThis();
			cg_.getMethodGenerator().RubyMethod_getOwner();
		}
		
		cg_.getMethodGenerator().RubyModule_getClassVariable(name);
	}

	public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().saveRubyValueAsLocalVariable();

		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadCurrentClass();
		} else if (isInSingletonMethod()) {
			visitSelfExpression();
			cg_.getMethodGenerator().checkCast(Type.getType(Types.RubyClassClass));
		} else if (isInGlobalScope()) {
			visitSelfExpression();
			cg_.getMethodGenerator().RubyValue_getRubyClass();
		} else {
			cg_.getMethodGenerator().loadThis();
			cg_.getMethodGenerator().RubyMethod_getOwner();
		}
		
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
			cg_.getMethodGenerator().breakFromBlock();
		} else {
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
		cg_.getMethodGenerator().goTo(labelManager_.getCurrentRedo());
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
		} else {
			cg_.getMethodGenerator().RubyAPI_getTopLevelConstant(name);
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
		cg_.getMethodGenerator().RubyAPI_setTopLevelConstant(name);
	}

	public void visitDefinedPublicMethod(String name) {
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
			visitStringExpression("nil");
		}
	}

	public void visitDefinedYield() {
		if (cg_ instanceof ClassGeneratorForRubyMethod) {
			cg_.getMethodGenerator().loadArg(2);
			cg_.getMethodGenerator().RubyAPI_isDefinedYield();
		} else {
			visitStringExpression("nil");
		}
	}
}
