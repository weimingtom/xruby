/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.ArrayList;

class When {
	
	private final Expression condition_;
	private final boolean asterisk_;// when *[[1]]
	final CompoundStatement body_;
	
	When(Expression condition, boolean asterisk, CompoundStatement body) {
		condition_ = condition;
		asterisk_ = asterisk;
		body_ = body;
	}

	public Object accept(CodeVisitor visitor, Object var, Object end_label) {
		condition_.accept(visitor);
		Object next_label = visitor.visitAfterWhenCondition(var, asterisk_);
		if (null != body_) {
			body_.accept(visitor);
		} else {
			visitor.visitNilExpression();
		}
		return visitor.visitAfterWhenBody(next_label, end_label);
	}

    void pullBlock(ArrayList<Block> result) {
        condition_.pullBlock(result);
        if (null != body_) {
            body_.pullBlock(result);
        }
    }
    
    void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
        condition_.getNewlyAssignedVariables(symboltable, result);
        if (null != body_) {
            body_.getNewlyAssignedVariables(symboltable, result);
        }
    }
}

public class CaseExpression extends Expression {
	private final Expression condition_;
	private ArrayList<When> whens_ = new ArrayList<When>();
	private CompoundStatement else_body_;
	
	public CaseExpression(Expression condition) {
		condition_ = condition;
	}

	public void addWhen(Expression condition, boolean asterisk, CompoundStatement body) {
		whens_.add(new When(condition, asterisk, body));
	}

	public void addElse(CompoundStatement body) {
		else_body_ = body;
	}

	private void ensureElseBodyIsNotEmpty() {
		if (null == else_body_) {
			else_body_ = new CompoundStatement();
			else_body_.addStatement(new ExpressionStatement(new NilExpression()));
		}
	}

	public void accept(CodeVisitor visitor) {
		ensureElseBodyIsNotEmpty();

		for (When when : whens_) {
			if (null != when.body_) {
				when.body_.ensureVariablesAreInitialized(visitor);
			}
		}
		else_body_.ensureVariablesAreInitialized(visitor);

        ArrayList<Block> pulled_blocks = new ArrayList<Block>();
        for (When when : whens_) {
			if (null != when.body_) {
                when.body_.pullBlock(pulled_blocks);
			}
        }
        else_body_.pullBlock(pulled_blocks);
        for (Block block : pulled_blocks) {
            block.acceptAsPulled(visitor);
        }

		if (null == condition_) {
			visitor.visitTrueExpression();
		} else {
			condition_.accept(visitor);
		}
		Object var = visitor.visitAfterCaseCondition();

		Object end_label = null;
		for (When when : whens_) {
			end_label = when.accept(visitor, var, end_label);
		}
		
		else_body_.accept(visitor);
		visitor.visitAfterWhenBody(null, end_label);
	}

    void pullBlock(ArrayList<Block> result) {
        if (null != condition_) {
            condition_.pullBlock(result);
        }
        for (When when : whens_) {
            when.pullBlock(result);
        }
        if (null != else_body_) {
            else_body_.pullBlock(result);
        }
    }

    void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
        if (null != condition_) {
            condition_.getNewlyAssignedVariables(symboltable, result);
        }
        for (When when : whens_) {
            when.getNewlyAssignedVariables(symboltable, result);
        }
        if (null != else_body_) {
            else_body_.getNewlyAssignedVariables(symboltable, result);
        }
    }
}
