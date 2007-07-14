/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import com.xruby.compiler.codedom.CodeVisitor;
import com.xruby.compiler.codedom.Program;
import com.xruby.runtime.lang.RubyBinding;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.math.BigInteger;
import java.util.Stack;

public class RubyCompilerImpl implements CodeVisitor {

    private ClassGenerator cg_;
    private final Stack<ClassGenerator> suspended_cgs_ = new Stack<ClassGenerator>();
    private final CompilationResults compilation_results_ = new CompilationResults();
    private final String script_name_;
    private RubyBinding binding_;

    private Label currentLineLabel;
    private boolean enableDebug = false;

    public RubyCompilerImpl(String script_name) {
        script_name_ = script_name;
    }

    private boolean isInGlobalScope() {
        return suspended_cgs_.empty() && !isInClassBuilder();
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

    private boolean isInClassBuilder() {
        return (cg_ instanceof ClassGeneratorForClassModuleBuilder);
    }

    public void enableDebug() {
        enableDebug = true;
    }

    private void switchToNewClassGenerator(ClassGenerator cg) {
        suspended_cgs_.push(cg_);
        cg_ = cg;
    }

    private void switchToPreviousClassGenerator(boolean last_statement_has_return_value) {
        if (!last_statement_has_return_value) {
            cg_.getMethodGenerator().ObjectFactory_nilValue();
        }

        cg_.getMethodGenerator().returnValue();
        cg_.getMethodGenerator().endMethod();
        cg_.visitEnd();

        compilation_results_.add(cg_.getCompilationResult());
        cg_ = suspended_cgs_.pop();
    }

    public CompilationResults compile(Program program, RubyBinding binding) {
        binding_ = binding;
        RubyIDClassGenerator.initScript(script_name_);
        String className = NameFactory.createClassName(script_name_, null);
        cg_ = new ClassGeneratorForRubyProgram(className, script_name_, binding, true, false);
        MethodGenerator mg = cg_.getMethodGenerator();

        // Start compiling
        program.accept(this);

        // Record the local variables' range, if user enables debug
        if (enableDebug) {
            mg.writeLocalVariableInfo();
        }

        mg.endMethod();
        cg_.visitEnd();
        compilation_results_.add(RubyIDClassGenerator.getCompilationResult());
//		RubyIDClassGenerator.clear();
        compilation_results_.add(cg_.getCompilationResult());
        return compilation_results_;
    }

    public void visitClassDefination1(String className) {

        if (!isInGlobalScope()) {
            cg_.getMethodGenerator().loadArg(3);
        }

        cg_.getMethodGenerator().push(className);
        //super class will be pushed next, then visitSuperClass() will be called
    }

    public void visitClassDefination2(String className) {
        //TODO optimizing aceess to builtin class (use them directly)
        if (isInGlobalScope()) {
            cg_.getMethodGenerator().RubyAPI_defineClass();
        } else {
            cg_.getMethodGenerator().RubyModule_defineClass();
        }

        //The class body may refer the constant, so save it before class builder starts.
        callClassModuleBuilder(className, false);
    }

    private void callClassModuleBuilder(String name, boolean is_singleton) {
        int i = cg_.getMethodGenerator().newLocal(Types.RUBY_VALUE_TYPE);
        cg_.getMethodGenerator().storeLocal(i);

        String uniqueName = NameFactory.createClassnameForClassModuleBuilder(script_name_, name);
        Type builder = Type.getType("L" + uniqueName + ";");
        cg_.getMethodGenerator().newInstance(builder);
        cg_.getMethodGenerator().dup();
        cg_.getMethodGenerator().invokeConstructor(builder,
                Method.getMethod("void <init> ()"));
        cg_.getMethodGenerator().loadLocal(i);
        cg_.getMethodGenerator().pushNull();
        cg_.getMethodGenerator().pushNull();
        cg_.getMethodGenerator().loadLocal(i);
        cg_.getMethodGenerator().invokeVirtual(builder,
                Method.getMethod("com.xruby.runtime.lang.RubyValue invoke(com.xruby.runtime.lang.RubyValue, com.xruby.runtime.value.RubyArray, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule)"));

        switchToNewClassGenerator(new ClassGeneratorForClassModuleBuilder(uniqueName, script_name_, null, is_singleton));
    }

    public void visitSingletonClassDefination() {
        cg_.getMethodGenerator().RubyValue_getSingletonClass();
        callClassModuleBuilder("SINGLETON", true);
    }

    public void visitClassDefinationEnd(boolean last_statement_has_return_value) {
        switchToPreviousClassGenerator(last_statement_has_return_value);
    }

    public void visitModuleDefination(String moduleName, boolean has_scope) {
        if (!cg_.getMethodGenerator().RubyRuntime_getBuiltinModule(moduleName)) {
            if (has_scope) {
                cg_.getMethodGenerator().checkCast(Types.RUBY_MODULE_TYPE);
                cg_.getMethodGenerator().RubyModule_defineModule(moduleName);
            } else if (isInGlobalScope()) {
                cg_.getMethodGenerator().RubyAPI_defineModule(moduleName);
            } else {
                cg_.getMethodGenerator().loadArg(3);
                cg_.getMethodGenerator().RubyModule_defineModule(moduleName);
            }
        }

        callClassModuleBuilder(moduleName, false);
    }

    public void visitModuleDefinationEnd(boolean last_statement_has_return_value) {
        switchToPreviousClassGenerator(last_statement_has_return_value);
    }

    public String visitBlock(int argc,
            boolean has_asterisk_parameter,
            int num_of_default_args,
            boolean is_for_in_expression,
            boolean has_extra_comma,
            boolean has_body) {
        String method_name = (cg_ instanceof ClassGeneratorForRubyMethod) ? ((ClassGeneratorForRubyMethod)cg_).getMethodName() : null;
        String uniqueBlockName = NameFactory.createClassNameForBlock(script_name_, method_name);

        //Save the current state and sart a new class file to write.
        switchToNewClassGenerator(new ClassGeneratorForRubyBlock(uniqueBlockName, script_name_,
                    argc,
                    has_asterisk_parameter,
                    num_of_default_args,
                    cg_,
                    is_for_in_expression,
                    has_extra_comma,
                    binding_));
        if (has_body) {
            if (argc >= 1 || has_asterisk_parameter || is_for_in_expression) {
                // has_extra_comma == (argc >= 1)
                cg_.getMethodGenerator().loadArg(1);
            } else {
                cg_.getMethodGenerator().ObjectFactory_nilValue();
            }
        }
        return uniqueBlockName;
    }

    public String[] visitBlockEnd(String uniqueBlockName, boolean last_statement_has_return_value) {

        ClassGeneratorForRubyBlock block_cg = (ClassGeneratorForRubyBlock)cg_;
        String[] commons = block_cg.createFieldsAndConstructorOfRubyBlock();
        String[] assigned_commons = block_cg.getAssignedFields();

        switchToPreviousClassGenerator(last_statement_has_return_value);

        cg_.getMethodGenerator().new_BlockClass(cg_, uniqueBlockName, commons, isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        cg_.getMethodGenerator().storeBlockForFutureRestoreAndCheckReturned();

        return assigned_commons;
    }

    public String visitMethodDefination(String methodName, int num_of_args, boolean has_asterisk_parameter, int num_of_default_args, boolean is_singleton_method) {

        String uniqueMethodName = NameFactory.createClassName(script_name_, methodName);

        if (!is_singleton_method) {
            cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        } else {
            cg_.getMethodGenerator().RubyValue_getSingletonClass();
        }

        cg_.getMethodGenerator().RubyModule_defineMethod(methodName, uniqueMethodName);

        //Save the current state and sart a new class file to write.
        switchToNewClassGenerator(ClassGeneratorForRubyMethodFactory.createClassGeneratorForRubyMethod(methodName,
                                script_name_,
                                uniqueMethodName,
                                num_of_args,
                                has_asterisk_parameter,
                                num_of_default_args,
                                is_singleton_method || cg_.getMethodGenerator().isSingleton()));

        return uniqueMethodName;
    }

    public void visitMethodDefinationParameter(String name) {
        cg_.addParameter(name);
    }

    public void visitMethodDefinationAsteriskParameter(String name, int argc) {
        cg_.setAsteriskParameter(name, argc);
    }

    public void visitMethodDefinationBlockParameter(String name) {
        cg_.setBlockParameter(name);
    }

    public void visitMethodDefinationEnd(boolean last_statement_has_return_value) {
        switchToPreviousClassGenerator(last_statement_has_return_value);
    }

    public void visitMethodDefinationDefaultParameters(int size) {
        assert(size > 0);
        //create a empty array if arg is null (avoid null reference)
        cg_.getMethodGenerator().loadArg(1);
        Label label = new Label();
        cg_.getMethodGenerator().ifNonNull(label);
        cg_.getMethodGenerator().ObjectFactory_createArray(size, 0, false);
        cg_.getMethodGenerator().storeArg(1);
        cg_.getMethodGenerator().mark(label);
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
        if (cg_ instanceof ClassGeneratorForRubyBlock) {
            ((ClassGeneratorForRubyBlock)cg_).loadNoParameterForSuper();
        } else {
            cg_.getMethodGenerator().loadMethodArg();
        }
    }

    public void visitNoBlock(boolean is_super_or_block_given_call) {
        if (is_super_or_block_given_call) {
            if (isInGlobalScope()) {
                cg_.getMethodGenerator().pushNull();
            } else {
                cg_.getMethodGenerator().loadBlock(isInBlock());
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
        cg_.getMethodGenerator().addCurrentVariablesOnStack(Types.RUBY_VALUE_CLASS);
    }

    private void transferValueFromBlock(String blockName, String[] assignedCommons) {
        if (null != assignedCommons) {
            for (String name : assignedCommons) {
                cg_.restoreLocalVariableFromBlock(blockName, name);
            }
        }
    }

    public void visitMethodCallEnd(String methodName, boolean hasReceiver,
            String[] assignedCommons, String blockName, int argc) {
        cg_.getMethodGenerator().removeCurrentVariablesOnStack();

        if (hasReceiver) {
            switch (argc) {
            case 0:
                cg_.getMethodGenerator().RubyAPI_callPublicNoArgMethod(methodName);
                break;
            case 1:
                cg_.getMethodGenerator().RubyAPI_callPublicOneArgMethod(methodName);
                break;
            default:
                cg_.getMethodGenerator().RubyAPI_callPublicMethod(methodName);
                break;
            }
        } else {
            switch (argc) {
            case 0:
                cg_.getMethodGenerator().RubyAPI_callNoArgMethod(methodName);
                break;
            case 1:
                cg_.getMethodGenerator().RubyAPI_callOneArgMethod(methodName);
                break;
            default:
                cg_.getMethodGenerator().RubyAPI_callMethod(methodName);
                break;
            }
        }

        transferValueFromBlock(blockName, assignedCommons);

        cg_.getMethodGenerator().returnIfBlockReturned();
    }

    public void visitBinaryOperator(String operator) {
        cg_.getMethodGenerator().pushNull();
        if (operator.equals("!=")) {
            cg_.getMethodGenerator().RubyAPI_callPublicOneArgMethod("==");
            cg_.getMethodGenerator().RubyAPI_operatorNot();
        } else if (operator.equals("!~")) {
            cg_.getMethodGenerator().RubyAPI_callPublicOneArgMethod("=~");
            cg_.getMethodGenerator().RubyAPI_operatorNot();
        } else {
            //operator as method call
            cg_.getMethodGenerator().RubyAPI_callPublicOneArgMethod(operator);
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
            cg_.getMethodGenerator().pushNull();
            cg_.getMethodGenerator().RubyAPI_callPublicMethod(operator);
        }
    }

    public void visitGlobalVariableAssignmentOperator(String var, boolean rhs_is_method_call) {
        if (rhs_is_method_call) {
            cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
        }
        cg_.getMethodGenerator().GlobalVatiables_set(var);
    }

    public void visitLocalVariableAssignmentOperator(String var, boolean rhs_is_method_call, boolean is_multiple_assign) {
        MethodGenerator mg = cg_.getMethodGenerator();
        if (rhs_is_method_call) {
            mg.RubyAPI_expandArrayIfThereIsZeroOrOneValue();
        }
        if (!is_multiple_assign) {
            mg.dup();//do not pop off empty stack
        }

        cg_.storeVariable(var);
        SymbolTable table = mg.getSymbolTable();

        // Record the start label of this variable
        if(enableDebug && table.isNewLocalVar(var)) {
            table.setVarLineNumberInfo(var, currentLineLabel);
        }
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

    public void visitFrequentlyUsedInteger(int i) {
        cg_.getMethodGenerator().createFrequentlyUsedInteger(i);
    }

    public void visitWhileConditionBegin() {
        cg_.getMethodGenerator().getLabelManager().openNewScope();
        cg_.getMethodGenerator().mark(cg_.getMethodGenerator().getLabelManager().getCurrentNext());
    }

    public void visitWhileConditionEnd(boolean always_true, boolean is_until) {
        if (always_true) {
            cg_.getMethodGenerator().push(true);
        } else {
            cg_.getMethodGenerator().RubyAPI_testTrueFalse();
        }

        if (is_until) {
            cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.NE, cg_.getMethodGenerator().getLabelManager().getCurrentX());
        } else {
            cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, cg_.getMethodGenerator().getLabelManager().getCurrentX());
        }

        cg_.getMethodGenerator().mark(cg_.getMethodGenerator().getLabelManager().getCurrentRedo());
    }

    public void visitWhileBodyEnd(boolean has_body) {
        if (has_body) {
            cg_.getMethodGenerator().pop();
        }

        cg_.getMethodGenerator().goTo(cg_.getMethodGenerator().getLabelManager().getCurrentNext());

        cg_.getMethodGenerator().mark(cg_.getMethodGenerator().getLabelManager().getCurrentX());
        visitNilExpression();//this is the value of while expression if no break is called.

        cg_.getMethodGenerator().mark(cg_.getMethodGenerator().getLabelManager().getCurrentBreak());
        cg_.getMethodGenerator().getLabelManager().closeCurrentScope();
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

    public Object visitAfterWhenCondition(Object case_value, boolean asterisk) {
        if (asterisk) {
            cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsOnlyOneRubyArray2();
        }

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

        cg_.getMethodGenerator().getEnsureLabelManager().openNewScope();
        if (has_ensure) {
            cg_.getMethodGenerator().getEnsureLabelManager().setCurrentFinally(new Label());
        }
        cg_.getMethodGenerator().mark(cg_.getMethodGenerator().getEnsureLabelManager().getCurrentRetry());
        return cg_.getMethodGenerator().getEnsureLabelManager().getCurrentRetry();
    }

    public Object visitBodyAfter() {
        return cg_.getMethodGenerator().mark();
    }

    public void visitBodyEnd(Object label) {
        cg_.getMethodGenerator().mark((Label)label);
        cg_.getMethodGenerator().getEnsureLabelManager().closeCurrentScope();

        cg_.getMethodGenerator().restoreCurrentVariablesOnStack();
    }

    public int visitEnsureBodyBegin() {
        cg_.getMethodGenerator().mark(cg_.getMethodGenerator().getEnsureLabelManager().getCurrentFinally());
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
        cg_.getMethodGenerator().visitJumpInsn(Opcodes.JSR, cg_.getMethodGenerator().getEnsureLabelManager().getCurrentFinally());
        return label;
    }

    public void visitEnsure(int exception_var) {
        if (exception_var >= 0) {
            Label l = cg_.getMethodGenerator().getEnsureLabelManager().getCurrentFinally();
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
            cg_.storeVariable(name);
        }

        return label;
    }

    public void visitAfterRescueBody(Object next_label, Object end_label) {
        cg_.getMethodGenerator().goTo((Label)end_label);
        cg_.getMethodGenerator().mark((Label)next_label);
    }

    public void visitArrayBegin(int size, int rhs_size, boolean has_single_asterisk) {
        cg_.getMethodGenerator().ObjectFactory_createArray(size, rhs_size, has_single_asterisk);
        cg_.getMethodGenerator().addCurrentVariablesOnStack(Types.RUBY_ARRAY_CLASS);
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

    public void visitBinding(boolean single_arg) {
        cg_.createBinding(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        if (!single_arg) {
            cg_.getMethodGenerator().RubyArray_add(false);
        }
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

    public void visitYieldEnd(int argc) {
        switch (argc) {
        case 0:
            cg_.getMethodGenerator().RubyBlock_invokeNoArg(isInBlock());
            break;
        case 1:
            cg_.getMethodGenerator().RubyBlock_invokeOneArg(isInBlock());
            break;
        default:
            cg_.getMethodGenerator().RubyBlock_invoke(isInBlock());
            break;
        }

        cg_.getMethodGenerator().checkBreakedOrReturned(isInBlock());
    }

    public void visitSuperBegin() {
        cg_.getMethodGenerator().loadArg(0);//TODO error checking: super called outside of method (NoMethodError)
    }

    public void visitSuperEnd(boolean has_no_arg, boolean has_one_arg) {
        if (cg_ instanceof ClassGeneratorForRubyMethod) {
            ((ClassGeneratorForRubyMethod)cg_).callSuperMethod(has_no_arg, has_one_arg);
        } else {
            ((ClassGeneratorForRubyBlock)cg_).callSuperMethod(has_no_arg, has_one_arg);
        }
    }

    public void visitGlobalVariableExpression(String value) {
        cg_.getMethodGenerator().GlobalVatiables_get(value);
    }

    public void visitCommandOutputExpression(String value) {
        cg_.getMethodGenerator().RubyAPI_runCommandAndCaptureOutput(value);
    }

    private void invokeFinallyIfExist() {
        Label l = cg_.getMethodGenerator().getEnsureLabelManager().getCurrentFinally();
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
            cg_.getMethodGenerator().RubyBlock__return__();
            cg_.getMethodGenerator().returnValue();
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
        cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        cg_.getMethodGenerator().RubyModule_getClassVariable(name);
    }

    public void visitClassVariableAssignmentOperator(String name, boolean rhs_is_method_call) {
        if (rhs_is_method_call) {
            cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue();
        }
        int value = cg_.getMethodGenerator().saveRubyValueAsLocalVariable();

        cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
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

    public int visitMultipleAssignment(boolean single_lhs, boolean has_mlhs, boolean has_mrhs) {
        cg_.getMethodGenerator().dup();

        if (single_lhs && !has_mrhs) {
            return 0;
        }

        if (single_lhs) {
            cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsZeroOrOneValue2();
            return 0;
        } else if (has_mlhs) {
            cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsOnlyOneRubyArray();
            return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
        } else {
            return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
        }
    }

    public int visitNestedVariable(boolean single_lhs, boolean has_mlhs) {
        if (single_lhs) {
            return 0;
        } else {
            cg_.getMethodGenerator().RubyAPI_convertToArrayIfNotYet();
            if (has_mlhs) {
                cg_.getMethodGenerator().RubyAPI_expandArrayIfThereIsOnlyOneRubyArray();
            }
            return cg_.getMethodGenerator().saveRubyArrayAsLocalVariable();
        }
    }

    public void visitBreak() {
        if (isInBlock() && cg_.getMethodGenerator().getLabelManager().isEmpty()) {
            invokeFinallyIfExist();
            cg_.getMethodGenerator().RubyBlock__break__();
            cg_.getMethodGenerator().returnValue();
        } else {
            invokeFinallyIfExist();
            cg_.getMethodGenerator().goTo(cg_.getMethodGenerator().getLabelManager().getCurrentBreak());
        }
    }

    public void visitNext() {
        if (isInBlock() && cg_.getMethodGenerator().getLabelManager().isEmpty()) {
            cg_.getMethodGenerator().returnValue();
        } else {
            cg_.getMethodGenerator().pop();
            cg_.getMethodGenerator().goTo(cg_.getMethodGenerator().getLabelManager().getCurrentNext());
        }
    }

    public void visitRedo() {
        if (isInBlock() && cg_.getMethodGenerator().getLabelManager().isEmpty()) {
            cg_.getMethodGenerator().RubyBlock__redo__();
            cg_.getMethodGenerator().ObjectFactory_nilValue();
            cg_.getMethodGenerator().returnValue();
        } else {
            cg_.getMethodGenerator().goTo(cg_.getMethodGenerator().getLabelManager().getCurrentRedo());
        }
    }

    public void visitRetry() {
        if (isInBlock() && cg_.getMethodGenerator().getLabelManager().isEmpty()) {
            cg_.getMethodGenerator().RubyBlock__redo__();
            cg_.getMethodGenerator().ObjectFactory_nilValue();
            cg_.getMethodGenerator().returnValue();
        } else {
            cg_.getMethodGenerator().goTo(cg_.getMethodGenerator().getEnsureLabelManager().getCurrentRetry());
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

        cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        cg_.getMethodGenerator().RubyAPI_getCurrentNamespaceConstant(name);
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
        }

        loadTopScope();
        cg_.getMethodGenerator().RubyAPI_getCurrentNamespaceConstant(name);
    }

    private void loadTopScope() {
        if (isInGlobalScope()) {
            cg_.getMethodGenerator().loadCurrentClass();
        } else {
            cg_.getMethodGenerator().RubyRuntime_GlobalScope();
        }
    }

    public void visitCurrentNamespaceConstantAssignmentOperator(String name, boolean rhs_is_method_call, boolean is_multiple_assign) {
        if (isInGlobalScope()) {
            visitTopLevelConstantAssignmentOperator(name, rhs_is_method_call, is_multiple_assign);
            return;
        }

        cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
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
        cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        cg_.getMethodGenerator().RubyAPI_isDefinedPublicMethod(name);
    }

    public void visitDefinedCurrentNamespaceConstant(String name) {
        if (Types.isBuiltinClass(name) || Types.isBuiltinModule(name)) {
            visitStringExpression("constant");
            return;
        }

        cg_.getMethodGenerator().loadCurrentScope(isInClassBuilder(), isInSingletonMethod(), isInGlobalScope(), isInBlock());
        cg_.getMethodGenerator().RubyAPI_isDefinedCurrentNamespaceConstant(name);
    }

    public void visitDefinedTopLevelConstant(String name) {
        if (Types.isBuiltinClass(name) || Types.isBuiltinModule(name)) {
            visitStringExpression("constant");
            return;
        }

        loadTopScope();
        cg_.getMethodGenerator().RubyAPI_isDefinedCurrentNamespaceConstant(name);
    }

    public void visitDefinedConstant(String name) {
        cg_.getMethodGenerator().RubyAPI_isDefinedCurrentNamespaceConstant(name);
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
            cg_.getMethodGenerator().loadCurrentBlock();//.loadArg(2);
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
        cg_.getMethodGenerator().instanceOf(Types.RUBY_PROC_TYPE);

        Label label1 = new Label();
        cg_.getMethodGenerator().ifZCmp(GeneratorAdapter.EQ, label1);

        cg_.getMethodGenerator().dup();
        cg_.getMethodGenerator().checkCast(Types.RUBY_PROC_TYPE);

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

    public void visitMultipleArrayAssign() {
        cg_.getMethodGenerator().RubyAPI_callArraySet();
    }

    // ---------------------------
    //   Interfaces for debugger
    // ---------------------------
    public Label visitLineLabel(int lineNumber) {
        if(enableDebug) {
            // store the current line, if debug is enabled
            currentLineLabel = cg_.getMethodGenerator().mark();
            cg_.getMethodGenerator().visitLineNumber(lineNumber, currentLineLabel);

            return currentLineLabel;
        }

        return null;
    }

}
