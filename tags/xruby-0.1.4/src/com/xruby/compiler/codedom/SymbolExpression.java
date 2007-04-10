/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class SymbolExpression extends Expression {
	private final String value_;

	public SymbolExpression(String value) {
		value_ = value;
	}

	public String getValue() {
		return value_;
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitSymbolExpression(value_.toString());
	}
}
