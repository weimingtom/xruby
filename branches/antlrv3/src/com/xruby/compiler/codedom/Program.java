/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class Program extends Expression implements Visitable {

    private CompoundStatement compoundStatement_;
    private StatementList statementList;

    public Program(CompoundStatement compoundStatement) {
        compoundStatement_ = compoundStatement;
    }

    //for v3
    public Program() {
    }

    public Program(StatementList statementList) {
        this.statementList = statementList;
        this.compoundStatement_ = statementList;
    }

    public CompoundStatement getCompoundStatement() {
        return compoundStatement_;
    }

    public void accept(CodeVisitor visitor) {
        if (null == compoundStatement_) {
            visitor.visitEof(false);
            return;
        }

        compoundStatement_.accept(visitor);
        visitor.visitEof(compoundStatement_.lastStatementHasReturnValue());
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }
}
