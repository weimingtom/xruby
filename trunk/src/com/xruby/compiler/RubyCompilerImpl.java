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

		cg_.getMethodGeneratorForRunMethod().endMethod();
		cg_.visitEnd();
		compilation_results_.add(cg_.getCompilationResult());
		return compilation_results_;
	}

	public void visitClassDefination(String className, String superClassName) {

		cg_.getMethodGeneratorForRunMethod().loadThis();

		if (isInGlobalScope()) {
			cg_.getMethodGeneratorForRunMethod().getStatic(Type.getType(RubyRuntime.class),
					"GlobalScope",
					Type.getType(RubyModule.class));
		} else {
			//FIXME
		}
		
		cg_.getMethodGeneratorForRunMethod().defineClass(className, superClassName);
		cg_.getMethodGeneratorForRunMethod().dup();
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyClass.class), Method.getMethod("void setAccessPublic()"));
		cg_.getMethodGeneratorForRunMethod().dup();
		int var_as_ruby_class = cg_.getMethodGeneratorForRunMethod().newLocal(Type.getType(RubyClass.class));
		cg_.getMethodGeneratorForRunMethod().storeLocal(var_as_ruby_class);
		cg_.getMethodGeneratorForRunMethod().saveCurrentClassAsRubyValueThenLoad(cg_.getLocalVariable(className));
		cg_.getMethodGeneratorForRunMethod().loadLocal(var_as_ruby_class);

		String method_name_for_class_builder = NameFactory.createMethodnameForClassBuilder(className);
		cg_.callClassBuilderMethod(method_name_for_class_builder);
		cg_.startClassBuilderMethod(method_name_for_class_builder);
	}

	public void visitClassDefinationEnd(String className, boolean last_statement_has_return_value) {
		cg_.endClassBuilderMethod(last_statement_has_return_value);
	}

	public void visitModuleDefination(String className) {
		// TODO Auto-generated method stub
	}

	public void visitModuleDefinationEnd(String moduleName, boolean last_statement_has_return_value) {
		cg_.loadVariable(moduleName);
	}

	public void visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter) {

		String uniqueMethodName = NameFactory.createClassName(script_name_, methodName);

		cg_.getMethodGeneratorForRunMethod().defineMethod(methodName, uniqueMethodName);

		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyMethod(uniqueMethodName, num_of_args, has_asterisk_parameter);
	}

	public void visitBlock(int num_of_args, boolean has_asterisk_parameter) {
		String uniqueBlockName = NameFactory.createClassNameForBlock(script_name_);
		
		cg_.getMethodGeneratorForRunMethod().new_MethodClass(uniqueBlockName);

		//Save the current state and sart a new class file to write.
		suspended_cgs_.push(cg_);
		cg_ = new ClassGeneratorForRubyBlock(uniqueBlockName, num_of_args, has_asterisk_parameter);
	}

	public void visitBlockEnd(boolean last_statement_has_return_value) {
		visitMethodDefinationEnd(last_statement_has_return_value);
	}
	
	public void visitMethodDefinationParameter(String name) {
		cg_.addParameter(name);
	}

	public void visitMethodDefinationAsteriskParameter(String name) {
		cg_.setAsteriskParameter(name);
	}

	public void visitMethodDefinationEnd(boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGeneratorForRunMethod().ObjectFactory_nilValue();
		}

		cg_.getMethodGeneratorForRunMethod().returnValue();
		cg_.getMethodGeneratorForRunMethod().endMethod();
		cg_.visitEnd();
		
		compilation_results_.add(cg_.getCompilationResult());
		cg_ = suspended_cgs_.pop();
	}

	public void visitNoParameter() {
		cg_.getMethodGeneratorForRunMethod().visitInsn(Opcodes.ACONST_NULL);
	}

	public void visitNoBlock() {
		cg_.getMethodGeneratorForRunMethod().visitInsn(Opcodes.ACONST_NULL);
	}
	
	public void visitMethodCall(String methodName, boolean hasReceiver) {	
		if (hasReceiver) {	
			cg_.getMethodGeneratorForRunMethod().push(methodName);
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyBlock, String)"));
		} else {
			cg_.getMethodGeneratorForRunMethod().push(methodName);
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callMethod(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyBlock, String)"));
		}
	}

	public void visitBinaryOperator(String operator) {
		if (operator.equals("&&")) {
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
					Method.getMethod("com.xruby.core.lang.RubyValue operatorAnd(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue)"));
		} else if (operator.equals("||")) {
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
					Method.getMethod("com.xruby.core.lang.RubyValue operatorOr(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue)"));
		} else if (operator.equals("!=")) {
			cg_.getMethodGeneratorForRunMethod().push("==");
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue, String)"));
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue operatorNot(com.xruby.core.lang.RubyValue)"));
		} else {
			//operator as method call
			cg_.getMethodGeneratorForRunMethod().push(operator);
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue, String)"));
		}
	}

	public void visitUnaryOperator(String operator) {
		if (operator.equals("!")) {
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue operatorNot(com.xruby.core.lang.RubyValue)"));
		} else {
			cg_.getMethodGeneratorForRunMethod().visitInsn(Opcodes.ACONST_NULL);
			cg_.getMethodGeneratorForRunMethod().push(operator);
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("com.xruby.core.lang.RubyValue callPublicMethod(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue, String)"));
		}
	}

	private void expandArrayIfThereIsZeroOrOneValue() {
		cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.core.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.core.lang.RubyValue)"));
	}
	
	public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		cg_.getMethodGeneratorForRunMethod().GlobalVatiables_set(var);
	}

	public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		if (!is_multiple_assign) {
			cg_.getMethodGeneratorForRunMethod().dup();//do not pop off empty stack
		}
		cg_.getMethodGeneratorForRunMethod().storeLocal(cg_.getLocalVariable(var));
	}
	
	public void visitFloatExpression(float value) {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_createFloat(value);
	}

	public void visitIntegerExpression(int value) {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_createFixnum(value);
	}

	public void visitStringExpression(String value) {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_createString(value);
	}

	public void visitSymbolExpression(String value) {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_createSymbol(value);
	}
	
	public void visitTerminal() {
		cg_.getMethodGeneratorForRunMethod().pop();
	}
	
	public void visitEof(boolean last_statement_has_return_value) {
		if (!last_statement_has_return_value) {
			cg_.getMethodGeneratorForRunMethod().visitInsn(Opcodes.ACONST_NULL);
		}
		cg_.getMethodGeneratorForRunMethod().returnValue();
	}

	public void visitLocalVariableExpression(String value) {
		cg_.loadVariable(value);
	}

	public void visitNilExpression() {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_nilValue();
	}

	public Object visitAfterIfCondition() {
		cg_.getMethodGeneratorForRunMethod().RubyRuntime_testTrueFalse();
		Label label = new Label();
		cg_.getMethodGeneratorForRunMethod().ifZCmp(GeneratorAdapter.EQ, label);
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
		cg_.getMethodGeneratorForRunMethod().goTo(condition_label);
		Label body_label = new Label();
		cg_.getMethodGeneratorForRunMethod().mark(body_label);
		return new Pair<Label, Label>(body_label, condition_label);
	}

	public void visitWhileConditionBegin(Object label_pair) {
		cg_.getMethodGeneratorForRunMethod().pop();
		cg_.getMethodGeneratorForRunMethod().mark(((Pair<Label, Label>)label_pair).second);
	}

	public void visitWhileConditionEnd(Object label_pair, boolean is_until) {
		cg_.getMethodGeneratorForRunMethod().RubyRuntime_testTrueFalse();
		if (is_until) {
			cg_.getMethodGeneratorForRunMethod().ifZCmp(GeneratorAdapter.EQ, ((Pair<Label, Label>)label_pair).first);
		} else {
			cg_.getMethodGeneratorForRunMethod().ifZCmp(GeneratorAdapter.NE, ((Pair<Label, Label>)label_pair).first);
		}
		cg_.getMethodGeneratorForRunMethod().visitInsn(Opcodes.ACONST_NULL);//TODO should push the value of the while expression
	}

	public Object visitAfterIfBody(Object next_label, Object end_label, boolean is_last) {
		if (null == end_label) {
			end_label = new Label();
		}
		
		if (is_last) {
			cg_.getMethodGeneratorForRunMethod().mark((Label)end_label);
		}
		else {
			cg_.getMethodGeneratorForRunMethod().goTo((Label)end_label);
			cg_.getMethodGeneratorForRunMethod().mark((Label)next_label);
		}
		
		if (null != next_label) {
			cg_.getMethodGeneratorForRunMethod().mark((Label)next_label);
		}

		return end_label;
	}

	public Object visitAfterCaseCondition() {
		int i = cg_.getAnonymousLocalVariable();
		cg_.getMethodGeneratorForRunMethod().storeLocal(i);
		return i;
	}

	public Object visitAfterWhenCondition(Object case_value) {
		int i = (Integer)case_value;
		cg_.getMethodGeneratorForRunMethod().loadLocal(i);
		cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testEqual(com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue)"));
		Label label = new Label();
		cg_.getMethodGeneratorForRunMethod().ifZCmp(GeneratorAdapter.EQ, label);
		return label;
	}

	public Object visitAfterWhenBody(Object next_label, Object end_label, boolean is_last) {
		return visitAfterIfBody(next_label, end_label, is_last);
	}

	public void visitTrueExpression() {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_trueValue();
	}

	public void visitFalseExpression() {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_falseValue();
	}

	public Object visitAfterUnlessCondition() {
		cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testTrueFalse(com.xruby.core.lang.RubyValue)"));
		Label label = new Label();
		cg_.getMethodGeneratorForRunMethod().ifZCmp(GeneratorAdapter.NE, label);
		return label;
	}

	public Object visitAfterUnlessBody(Object next_label, Object end_label, boolean is_last) {
		return visitAfterIfBody(next_label, end_label, is_last);
	}

	public Object visitPrepareRescueBegin() {
		return cg_.getMethodGeneratorForRunMethod().mark();
	}

	public Object visitPrepareRescueEnd(Object start) {
		Label end = cg_.getMethodGeneratorForRunMethod().mark();

		Label after_exception = new Label();
		cg_.getMethodGeneratorForRunMethod().goTo(after_exception);
		
		cg_.getMethodGeneratorForRunMethod().catchException((Label)start,
				end,
				Type.getType(RubyException.class));

		int exception_variable = cg_.getAnonymousLocalVariable();
		cg_.getMethodGeneratorForRunMethod().storeLocal(exception_variable);

		cg_.getMethodGeneratorForRunMethod().visitInsn(Opcodes.ACONST_NULL);//hack???
		
		return new Pair<Integer, Label>(exception_variable, after_exception);
	}

	public void visitRescueEnd(Object var) {
		Label after_exception = ((Pair<Integer, Label>)var).second;
		cg_.getMethodGeneratorForRunMethod().mark(after_exception);
	}

	public Object visitRescueVariable(String name, Object var) {
		int exception_variable = ((Pair<Integer, Label>)var).first;
		cg_.getMethodGeneratorForRunMethod().loadLocal(exception_variable);
		cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(RubyRuntime.class),
				Method.getMethod("boolean testExceptionType(com.xruby.core.value.ArrayValue, com.xruby.core.lang.RubyException)"));
		
		Label label = new Label();
		cg_.getMethodGeneratorForRunMethod().ifZCmp(GeneratorAdapter.EQ, label);

		cg_.getMethodGeneratorForRunMethod().pop();//hack???
		
		return label;
	}
	
	public Object visitAfterRescueBody(Object next_label, Object end_label, boolean is_last) {
		return visitAfterIfBody(next_label, end_label, is_last);
	}
	
	public void visitArrayBegin(int size, boolean notSingleAsterisk) {
		cg_.getMethodGeneratorForRunMethod().new_ArrayValue(size, notSingleAsterisk);
	}
	
	public void visitHashBegin() {
		cg_.getMethodGeneratorForRunMethod().new_HashValue();
	}

	public void visitArrayElementBegin() {
		cg_.getMethodGeneratorForRunMethod().dup();
	}

	public void visitHashElementBegin() {
		cg_.getMethodGeneratorForRunMethod().dup();
	}
	
	public void visitArrayElementEnd(boolean asterisk, boolean is_method_call) {
		if (asterisk) {
			cg_.getMethodGeneratorForRunMethod().ArrayValue_expand(is_method_call);
		} else {
			cg_.getMethodGeneratorForRunMethod().ArrayValue_add(is_method_call);
		}
	}
	
	public void visitHashElementEnd() {
		cg_.getMethodGeneratorForRunMethod().HashValue_addValue();
	}
	
	public void visitArrayEnd() {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_createArray();
	}
	
	public void visitHashEnd() {
		cg_.getMethodGeneratorForRunMethod().ObjectFactory_createHash();
	}

	public void visitYieldBegin() {
		cg_.getMethodGeneratorForRunMethod().loadArg(2);//TODO error checking: make sure yield is called in the right context
		visitSelfExpression();
	}

	public void visitYieldEnd(boolean single_rhs) { 
		/*if (single_rhs) {
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(ArrayValue.class),
						Method.getMethod("com.xruby.core.value.ArrayValue expandArrayIfThereIsOnlyOneArrayValue(com.xruby.core.value.ArrayValue)"));
		}*/
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyBlock.class),
				Method.getMethod("com.xruby.core.lang.RubyValue invoke(com.xruby.core.lang.RubyValue, com.xruby.core.value.ArrayValue)"));
	}

	public void visitGlobalVariableExpression(String value) {
		cg_.getMethodGeneratorForRunMethod().GlobalVatiables_get(value);
	}

	public void visitCommandOutputExpression(String value) {
		cg_.getMethodGeneratorForRunMethod().runCommandAndCaptureOutput(value);
	}

	public void visitReturn() {
		cg_.getMethodGeneratorForRunMethod().returnValue();
	}

	public void visitAliasGlobalVariable(String newName, String oldName) {
		cg_.getMethodGeneratorForRunMethod().GlobalVatiables_alias(newName, oldName);
	}

	public void visitAliasMethod(String newName, String oldName) {
		cg_.getMethodGeneratorForRunMethod().RubyClass_aliasMethod(newName, oldName);	
	}

	public void visitUndef(String name) {
		cg_.getMethodGeneratorForRunMethod().RubyClass_undefMethod(name);
	}
	
	public void visitSuperExpression() {
	}

	public void visitSelfExpression() {
		if (!isInGlobalScope()) {
			cg_.getMethodGeneratorForRunMethod().loadArg(0);
		} else {
			cg_.getMethodGeneratorForRunMethod().ObjectFactory_topLevelSelfValue();
		}
	}

	public void visitClassVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyClass getRubyClass()"));
		cg_.getMethodGeneratorForRunMethod().push(name);
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyClass.class),
				Method.getMethod("com.xruby.core.lang.RubyValue getClassVariable(String)"));
	}

	public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGeneratorForRunMethod().newLocal(Type.getType(RubyValue.class));
		cg_.getMethodGeneratorForRunMethod().storeLocal(value);
		visitSelfExpression();
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyClass getRubyClass()"));
		cg_.getMethodGeneratorForRunMethod().loadLocal(value);
		cg_.getMethodGeneratorForRunMethod().push(name);
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyClass.class),
				Method.getMethod("com.xruby.core.lang.RubyValue setClassVariable(com.xruby.core.lang.RubyValue, String)"));
	}
	
	public void visitInstanceVariableExpression(String name) {
		visitSelfExpression();
		cg_.getMethodGeneratorForRunMethod().push(name);
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyValue getInstanceVariable(String)"));
	}

	public void visitInstanceVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
		if (rhs_is_method_call) {
			expandArrayIfThereIsZeroOrOneValue();
		}
		int value = cg_.getMethodGeneratorForRunMethod().newLocal(Type.getType(RubyValue.class));
		cg_.getMethodGeneratorForRunMethod().storeLocal(value);
		visitSelfExpression();
		cg_.getMethodGeneratorForRunMethod().loadLocal(value);
		cg_.getMethodGeneratorForRunMethod().push(name);
		cg_.getMethodGeneratorForRunMethod().invokeVirtual(Type.getType(RubyValue.class),
				Method.getMethod("com.xruby.core.lang.RubyValue setInstanceVariable(com.xruby.core.lang.RubyValue, String)"));
	}
	
	public void visitMrhs(int var, int index, boolean asterisk) {
		cg_.getMethodGeneratorForRunMethod().loadLocal(var);
		if (asterisk) {
			cg_.getMethodGeneratorForRunMethod().ArrayValue_collect(index);
		} else {
			cg_.getMethodGeneratorForRunMethod().ArrayValue_get(index);
		}
	}

	public int visitMultipleAssignmentBegin(boolean single_lhs, boolean single_rhs) {
		if (single_lhs) {
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(ArrayValue.class),
					Method.getMethod("com.xruby.core.lang.RubyValue expandArrayIfThereIsZeroOrOneValue(com.xruby.core.value.ArrayValue)"));
			return 0;
		} else {
			if (single_rhs) {
				cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(ArrayValue.class),
						Method.getMethod("com.xruby.core.value.ArrayValue expandArrayIfThereIsOnlyOneArrayValue(com.xruby.core.value.ArrayValue)"));
			}
			int var = cg_.getMethodGeneratorForRunMethod().newLocal(Type.getType(ArrayValue.class));
			cg_.getMethodGeneratorForRunMethod().storeLocal(var);
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
			cg_.getMethodGeneratorForRunMethod().invokeStatic(Type.getType(ArrayValue.class),
							Method.getMethod("com.xruby.core.value.ArrayValue convertToArrayIfNotYet(com.xruby.core.lang.RubyValue)"));
			int var = cg_.getMethodGeneratorForRunMethod().newLocal(Type.getType(ArrayValue.class));
			cg_.getMethodGeneratorForRunMethod().storeLocal(var);
			return var;
		}
	}
	
	public void visitNestedVariableEnd() {
		//do nothing
	}

	public void visitBreakBegin() {
		if (cg_ instanceof ClassGeneratorForRubyBlock) {
			cg_.getMethodGeneratorForRunMethod().loadThis();
		}
		//TODO
	}

	public void visitBreakEnd() {
		if (cg_ instanceof ClassGeneratorForRubyBlock) {
			cg_.getMethodGeneratorForRunMethod().breakBlock();
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
}
