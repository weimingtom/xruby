/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class CommandOutputExpression extends Expression {
	private final StringBuilder value_;

	public CommandOutputExpression(String value) {
		value_ = new StringBuilder(value);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitCommandOutputExpression(value_.toString());
	}
}
