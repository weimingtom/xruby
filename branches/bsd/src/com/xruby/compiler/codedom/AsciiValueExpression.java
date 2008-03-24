/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class AsciiValueExpression extends Expression {
	private int value_;
	
	public AsciiValueExpression(String value) {

		if (value.startsWith("?\\M-\\C-")) {
			value_ = (int)(value.charAt(7) & 0x9f | 0x80);
			return;
		} else if (value.startsWith("?\\C-")) {
			value_ = (int)(value.charAt(4) & 0x9f);
			return;
		} else if (value.startsWith("?\\M-")) {
			value_ = (int)(value.charAt(4) | 0x80);
			return;
		} else if (value.charAt(1) == '\\') {
			switch (value.charAt(2)) {
			case 'n':
				value_ = '\n';
				return;
			case 'r':
				value_ = '\r';
				return;
			default:
				//TODO more escped value
				value_ = (int)value.charAt(2);
				return;
				
			}
		} else {
			value_ = (int)value.charAt(1);
			return;
		}
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitFixnumExpression(value_);
	}
}
