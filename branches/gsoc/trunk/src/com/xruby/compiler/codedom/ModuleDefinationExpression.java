/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class ModuleDefinationExpression extends Expression {
    private Expression exp_;
    private String moduleName_;
    private BodyStatement bodyStatement_;

    public ModuleDefinationExpression(Expression exp, String moduleName, BodyStatement bodyStatement) {
        exp_ = exp;
        moduleName_ = moduleName;
        bodyStatement_ = bodyStatement;
    }

    public void accept(CodeVisitor visitor) {
        if (null != exp_) {
            exp_.accept(visitor);
        }

        visitor.visitModuleDefination(moduleName_, null != exp_);

        if (null != bodyStatement_) {
            bodyStatement_.accept(visitor);
        }

        visitor.visitModuleDefinationEnd((null == bodyStatement_) ? false : bodyStatement_.lastStatementHasReturnValue());
    }

}
