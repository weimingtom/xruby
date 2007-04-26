/** 
 * Copyright 2005-2007 Xue Yong Zhi, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Pair {
	String name;
	String[] value;
}

public class Block {

	private CompoundStatement bodyStatement_ = null;
	private ArrayList<ParameterVariableExpression> parameters_ = new ArrayList<ParameterVariableExpression>();
	private ParameterVariableExpression asterisk_parameter_ = null;
	private ArrayList<Expression> default_parameters_ = new ArrayList<Expression>();
	private boolean should_validate_argument_length_ = false;
	private boolean is_for_in_expression_ = false;
	private boolean has_extra_comma_ = false;

    private String name;
    private int startPosition;
    private int endPosition;

	public void setHasExtraComma() {
		has_extra_comma_ = true;
	}
	
	public void initAllParametersToNil(CodeVisitor visitor) {
		for (ParameterVariableExpression var : parameters_) {
			var.acceptAsInitializeToNil(visitor);
		}
		
		if (null != asterisk_parameter_) {
			asterisk_parameter_.acceptAsInitializeToNil(visitor);
		}
	}
	
	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		for (ParameterVariableExpression var : parameters_) {
			var.getNewlyAssignedVariables(symboltable, result);
		}
		
		if (null != asterisk_parameter_) {
			asterisk_parameter_.getNewlyAssignedVariables(symboltable, result);
		}
	}
	
	public void setBody(CompoundStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}
	
	public void addParameter(ParameterVariableExpression name, Expression default_value) {
		parameters_.add(name);
		if (null != default_value) {
			default_parameters_.add(default_value);
		}
	}

	void setIsForInExpression() {
		is_for_in_expression_ = true;
	}

	//{||} -> true
	//{|x,...|} -> true
	//{} -> false
	public void setShouldValidateArgumentLength() {
		should_validate_argument_length_ = true;
	}

	public void setAsteriskParameter(ParameterVariableExpression name) {
		assert(null == asterisk_parameter_);
		asterisk_parameter_ = name;
	}

	private ArrayList<Expression> buildLhs() {
		ArrayList<Expression> mlhs = new ArrayList<Expression>();
		for (ParameterVariableExpression var : parameters_) {
			mlhs.add(var);
		}
		return mlhs;
	}

	public Pair accept(CodeVisitor visitor) {
		name = visitor.visitBlock((should_validate_argument_length_ ? parameters_.size() : -1),
									(null != asterisk_parameter_),
									default_parameters_.size(),
									is_for_in_expression_);

		MultipleAssignmentStatement.acceptMLhs(visitor, buildLhs(), asterisk_parameter_, has_extra_comma_);
		visitor.visitTerminal();
		
		//TODO support default_value

		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
            setEndPosition(bodyStatement_.getLastLine());
        }
        else {
            setEndPosition(startPosition);
        }

		Pair p = new Pair();
		p.name = name;
		p.value = visitor.visitBlockEnd(name, (null != bodyStatement_) ?
										bodyStatement_.lastStatementHasReturnValue() : false);
		if(name != null) {
            BlockFarm.markBlock(this);
        }
        return p;
	}


    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public String getName() {
        return name;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }
}
