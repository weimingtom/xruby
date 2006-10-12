/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.util.*;

import com.xruby.codedom.*;
import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class RubyCompilerImpl implements CodeVisitor {
	
	private ClassGenerator cg_;
	private Stack<ClassGenerator> suspended_cgs_ = new Stack<ClassGenerator>();
	private CompilationResults compilation_results_ = new CompilationResults();
	private String script_name_;
	
	public RubyCompilerImpl(String script_name) {
		script_name_ = script_name;
	}
	
	private boolean isInGlobalScope() {
		return suspended_cgs_.empty() && !cg_.isInClassBuilder();
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
			cg_.getMethodGenerator().getStatic(Type.getType(RubyRuntime.class),
					"GlobalScope",
					Type.getType(RubyModule.class));
		} else {
			cg_.getMethodGenerator().loadArg(1);
		}

		cg_.getMethodGenerator().push(className);
		//super class will be pushed next, then visitSuperClass() will be called
	}

	public void visitClassDefination2(String className) {
		cg_.getMethodGenerator().RubyModule_defineClass();

		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().storeLocal(cg_.getLocalVariable(className));
		
		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("Object getValue()"));
		cg_.getMethodGenerator().checkCast(Type.getType(RubyModule.class));

		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(className);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder);
	}

	public void visitClassDefinationEnd(boolean last_statement_has_return_value) {
		cg_.endClassBuilderMethod(last_statement_has_return_value);
	}

	public void visitModuleDefination(String moduleName) {
		visitClassDefination1(moduleName);
		cg_.getMethodGenerator().RubyModule_defineModule();

		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().storeLocal(cg_.getLocalVariable(moduleName));

		cg_.getMethodGenerator().dup();
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("Object getValue()"));
		cg_.getMethodGenerator().checkCast(Type.getType(RubyModule.class));

		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(moduleName);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder);
	}

	public void visitModuleDefinationEnd(boolean last_statement_has_return_value) {
		visitClassDefinationEnd(last_statement_has_return_value);//TODO
	}

	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args) {

		String uniqueMethodName = NameFactory.createClassName(script_name_, methodName);

		cg_.getMethodGenerator().MethodCollection_defineMethod(methodName, uniqueMethodName);

		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyMethod(uniqueMethodName, num_of_args, has_asterisk_parameter, num_of_default_args);
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
		
		cg_.getMethodGenerator().new_BlockClass(uniqueBlockName, commons);

		if (assigned_commons.length > 0) {
			cg_.getMethodGenerator().saveBlockForFutureRestore();
		}
		return assigned_commons;
	}
	
	public void visitMethodDefinationParameter(String name) {
		cg_.addParameter(name);
	}

	public void visitMethodDefinationAsteriskParameter(String name) {
		cg_.setAsteriskParameter(name);
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
		cg_.getMethodGenerator().ArrayValue_add(false);
		cg_.getMethodGenerator().mark((Label)next_label);
	}

	public void visitNoParameter() {
		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
	}

	public void visitNoBlock() {
		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
	}
	
	public void visitMethodCall(String methodName, boolean hasReceiver, String[] assignedCommons, String blockName) {	
		if (hasReceiver) {	
			cg_.getMethodGenerator().push(methodName);
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyBlock, String)"));
		} else {
			cg_.getMethodGenerator().push(methodName);
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callMethod(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyBlock, String)"));
		}

		if (null != assignedCommons && assignedCommons.length > 0) {
			cg_.getMethodGenerator().dup();
			for (String name : assignedCommons) {
				cg_.getMethodGenerator().restoreLocalVariableFromBlock(blockName, name);
			}
		}
	}

	public void visitBinaryOperator(String operator) {
		if (operator.equals("!=")) {
			cg_.getMethodGenerator().push("==");
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue, String)"));
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue operatorNot(com.xruby.core.lang.RubyValue)"));
		} else {
			//operator as method call
			cg_.getMethodGenerator().push(operator);
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue, String)"));
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
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue operatorNot(com.xruby.core.lang.RubyValue)"));
		} else {
			cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
			cg_.getMethodGenerator().push(operator);
			cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue, String)"));
		}
	}

	private void expandArrayIfThereIsZeroOrOneValue() {
		cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.core.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.core.lang.RubyValue)"));
	}
	
	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		cg_.getMethodGenerator().GlobalVatiables_set(var);
	}

	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		if (!is_multiple_assign) {
			cg_.getMethodGenerator().dup();//do not pop off empty stack
		}

		cg_.storeVariable(var);
	}

	public void visitTopLevelConstantAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
		//FIXME
		visitLocalVariableAssignmentOperator(var, rhs_is_method_call, is_multiple_assign);
	}
	
	public void visitFloatExpression(float value) {
		cg_.getMethodGenerator().ObjectFactory_createFloat(value);
	}

	public void visitIntegerExpression(int value) {
		cg_.getMethodGenerator().ObjectFactory_createFixnum(value);
	}

	public void visitStringExpression(String value) {
		cg_.getMethodGenerator().ObjectFactory_createString(value);
	}
	
	public void visitStringExpressionWithExpressionSubstitutionBegin() {
		cg_.getMethodGenerator().new_StringValue();
	}
	
	public void visitStringExpressionWithExpressionSubstitution(String value) {
		cg_.getMethodGenerator().StringValue_append(value);
	}

	public void visitStringExpressionWithExpressionSubstitution() {
		cg_.getMethodGenerator().StringValue_append();
	}
	
	public void visitStringExpressionWithExpressionSubstitutionEnd() {
		cg_.getMethodGenerator().invokeStatic(Type.getType(ObjectFactory.class),
                Method.getMethod("com.xruby.core.lang.RubyValue createString(com.xruby.core.value.StringValue)"));
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
			cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);
		}
		cg_.getMethodGenerator().returnValue();
	}

	public void visitLocalVariableExpression(String value) {
		cg_.loadVariable(value);
	}

	public void visitTopLevelConstant(String value) {
		//FIXME
		visitLocalVariableExpression(value);
	}

	public void visitNilExpression() {
		cg_.getMethodGenerator().ObjectFactory_nilValue();
	}

	public Object visitAfterIfCondition() {
		cg_.getMethodGenerator().RubyRuntime_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);
		return label;
	}

	class Pair<T1, T2> {
		T1 first;
		T2 second;

		Pair(T1 first, T2 second) {
			this.first = first;
			this.second = second;
		}
	}

	public Object visitWhileBody() {
		Label condition_label = new Label();
		cg_.getMethodGenerator().goTo(condition_label);
		Label body_label = new Label();
		cg_.getMethodGenerator().mark(body_label);
		return new Pair<Label, Label>(body_label, condition_label);
	}

	public void visitWhileConditionBegin(Object label_pair) {
		cg_.getMethodGenerator().pop();
		cg_.getMethodGenerator().mark(((Pair<Label, Label>)label_pair).second);
	}

	public void visitWhileConditionEnd(Object label_pair, boolean is_until) {
		cg_.getMethodGenerator().RubyRuntime_testTrueFalse();
		if (is_until) {
			cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, ((Pair<Label, Label>)label_pair).first);
		} else {
			cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, ((Pair<Label, Label>)label_pair).first);
		}
		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);//TODO should push the value of the while expression
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
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testEqual(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue)"));
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
		cg_.getMethodGenerator().RubyRuntime_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, label);
		return label;
	}

	public Object visitAfterUnlessBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}

	public Object visitPrepareRescueBegin() {
		return cg_.getMethodGenerator().mark();
	}

	public Object visitPrepareRescueEnd(Object start) {
		Label end = cg_.getMethodGenerator().mark();

		Label after_exception = new Label();
		cg_.getMethodGenerator().goTo(after_exception);
		
		cg_.getMethodGenerator().catchException((Label)start,
				end,
				Type.getType(RubyException.class));

		int exception_variable = cg_.getAnonymousLocalVariable();
		cg_.getMethodGenerator().storeLocal(exception_variable);

		cg_.getMethodGenerator().visitInsn(Opcodes.ACONST_NULL);//hack???
		
		return new Pair<Integer, Label>(exception_variable, after_exception);
	}

	public void visitRescueEnd(Object var, Object end_label) {
		cg_.getMethodGenerator().mark((Label)end_label);
		Label after_exception = ((Pair<Integer, Label>)var).second;
		cg_.getMethodGenerator().mark(after_exception);
	}

	public Object visitRescueVariable(String name, Object var) {
		int exception_variable = ((Pair<Integer, Label>)var).first;
		cg_.getMethodGenerator().loadLocal(exception_variable);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testExceptionType(com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyException)"));
		
		Label label = new Label();
		cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label);

		cg_.getMethodGenerator().pop();//hack???
		
		return label;
	}
	
	public Object visitAfterRescueBody(Object next_label, Object end_label) {
		return visitAfterIfBody(next_label, end_label);
	}
	
	public void visitArrayBegin(int size, boolean notSingleAsterisk) {
		cg_.getMethodGenerator().new_ArrayValue(size, notSingleAsterisk);
	}
	
	public void visitHashBegin() {
		cg_.getMethodGenerator().new_HashValue();
	}

	public void visitArrayElementBegin() {
		cg_.getMethodGenerator().dup();
	}

	public void visitHashElementBegin() {
		cg_.getMethodGenerator().dup();
	}
	
	public void visitArrayElementEnd(boolean asterisk, boolean is_method_call) {
		if (asterisk) {
			cg_.getMethodGenerator().ArrayValue_expand(is_method_call);
		} else {
			cg_.getMethodGenerator().ArrayValue_add(is_method_call);
		}
	}
	
	public void visitHashElementEnd() {
		cg_.getMethodGenerator().HashValue_addValue();
	}
	
	public void visitArrayEnd() {
		cg_.getMethodGenerator().ObjectFactory_createArray();
	}
	
	public void visitHashEnd() {
		cg_.getMethodGenerator().ObjectFactory_createHash();
	}

	public void visitYieldBegin() {
		cg_.getMethodGenerator().loadArg(2);//TODO error checking: make sure yield is called in the right context
		visitSelfExpression();
	}

	public void visitYieldEnd(boolean single_rhs) { 
		/*if (single_rhs) {
			cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
						Method.getMethod("com.xruby.core.value.ArrayValue expandArrayIfThereIsOnlyOneArrayValue(com.xruby.core.value.ArrayValue)"));
		}*/
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyBlock.class),
				Method.getMethod("com.xruby.core.lang.RubyValue invoke(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue)"));
	}

	public void visitGlobalVariableExpression(String value) {
		cg_.getMethodGenerator().GlobalVatiables_get(value);
	}

	public void visitCommandOutputExpression(String value) {
		cg_.getMethodGenerator().runCommandAndCaptureOutput(value);
	}

	public void visitReturn() {
		cg_.getMethodGenerator().returnValue();
	}

	public void visitAliasGlobalVariable(String newName, String oldName) {
		cg_.getMethodGenerator().GlobalVatiables_alias(newName, oldName);
	}

	public void visitAliasMethod(String newName, String oldName) {
		cg_.getMethodGenerator().MethodCollection_aliasMethod(newName, oldName);	
	}

	public void visitUndef(String name) {
		cg_.getMethodGenerator().MethodCollection_undefMethod(name);
	}
	
	public void visitSuperExpression() {
	}

	public void visitSelfExpression() {
		if (!isInGlobalScope()) {
			cg_.getMethodGenerator().loadArg(0);
		} else {
			cg_.getMethodGenerator().ObjectFactory_topLevelSelfValue();
		}
	}

	public void visitClassVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyClass getRubyClass()"));
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.core.lang.RubyValue getClassVariable(String)"));
	}

	public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().newLocal(Type.getType(RubyValue.class));
		cg_.getMethodGenerator().storeLocal(value);

		if (cg_.isInClassBuilder()) {
			cg_.getMethodGenerator().loadArg(1);
		} else {
			visitSelfExpression();
			cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
					Method.getMethod("com.xruby.core.lang.RubyClass getRubyClass()"));
		}
		
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyModule.class),
				Method.getMethod("com.xruby.core.lang.RubyValue setClassVariable(com.xruby.core.lang.RubyValue, String)"));
	}
	
	public void visitInstanceVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyValue getInstanceVariable(String)"));
	}

	public void visitInstanceVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGenerator().newLocal(Type.getType(RubyValue.class));
		cg_.getMethodGenerator().storeLocal(value);
		visitSelfExpression();
		cg_.getMethodGenerator().loadLocal(value);
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyValue setInstanceVariable(com.xruby.core.lang.RubyValue, String)"));
	}
	
	public void visitMrhs(int var, int index, boolean asterisk) {
		cg_.getMethodGenerator().loadLocal(var);
		if (asterisk) {
			cg_.getMethodGenerator().ArrayValue_collect(index);
		} else {
			cg_.getMethodGenerator().ArrayValue_get(index);
		}
	}

	public int visitMultipleAssignmentBegin(boolean single_lhs, boolean single_rhs) {
		if (single_lhs) {
			cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.core.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.core.value.ArrayValue)"));
			return 0;
		} else {
			if (single_rhs) {
				cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
						Method.getMethod("com.xruby.core.value.ArrayValue expandArrayIfThereIsOnlyOneArrayValue(com.xruby.core.value.ArrayValue)"));
			}
			int var = cg_.getMethodGenerator().newLocal(Type.getType(ArrayValue.class));
			cg_.getMethodGenerator().storeLocal(var);
			return var;
		}
	}

	public void visitMultipleAssignmentEnd() {
		//do nothing
	}
	
	public int visitNestedVariableBegin(boolean single_lhs) {
		if (single_lhs) {
			return 0;
		} else {
			cg_.getMethodGenerator().invokeStatic(Type.getType(ArrayValue.class),
							Method.getMethod("com.xruby.core.value.ArrayValue convertToArrayIfNotYet(com.xruby.core.lang.RubyValue)"));
			int var = cg_.getMethodGenerator().newLocal(Type.getType(ArrayValue.class));
			cg_.getMethodGenerator().storeLocal(var);
			return var;
		}
	}
	
	public void visitNestedVariableEnd() {
		//do nothing
	}

	public void visitBreakBegin() {
		if (cg_ instanceof ClassGeneratorForRubyBlock) {
			cg_.getMethodGenerator().loadThis();
		}
		//TODO
	}

	public void visitBreakEnd() {
		if (cg_ instanceof ClassGeneratorForRubyBlock) {
			cg_.getMethodGenerator().breakBlock();
		}
		//TODO
	}

	public void visitNextBegin() {
	}

	public void visitNextEnd() {
		if (cg_ instanceof ClassGeneratorForRubyBlock) {
			visitReturn();
		}
		//TODO
	}

	public void visitExclusiveRangeOperator() {
		cg_.getMethodGenerator().push(true);
		cg_.getMethodGenerator().ObjectFactory_createRange();
	}

	public void visitInclusiveRangeOperator() {
		cg_.getMethodGenerator().push(false);
		cg_.getMethodGenerator().ObjectFactory_createRange();
	}

	public void visitConstant(String name) {
		cg_.getMethodGenerator().push(name);
		cg_.getMethodGenerator().invokeStatic(Type.getType(RubyModule.class),
			Method.getMethod("com.xruby.core.lang.RubyValue getConstant(com.xruby.core.lang.RubyValue, String)"));
	}
}
