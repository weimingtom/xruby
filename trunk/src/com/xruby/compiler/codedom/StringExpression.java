/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class StringExpression extends Expression {
	private final StringBuilder value_ = new StringBuilder();

	public String getValue() {
		return value_.toString();
	}

	private void appendDoubleQuoteString(String value) {
		for (int i = 0; i < value.length(); ++i) {
			if (value.charAt(i) != '\\') {
				value_.append(value.charAt(i));
				continue;
			}
			
			if (i == value.length() - 1) {
				//'\\' is the last char
				value_.append('\\');
				break;
			}

			char next_char = value.charAt(i + 1);
			switch (next_char) {
			case 'n':
				value_.append('\n');
				++i;
				break;
			case 't':
				value_.append('\t');
				++i;
				break;
			case 'r':
				value_.append('\r');
				++i;
				break;
			case '\\':
				value_.append('\\');
				++i;
				break;
			case 'b':
				value_.append('\b');
				++i;
				break;
			case 'f':
				value_.append('\f');
				++i;
				break;
			case '\"':
				value_.append('\"');
				++i;
				break;
			case '\'':
				value_.append('\'');
				++i;
				break;
			default:
				value_.append('\\');
			}
		}
	}
	
	public void appendString(String value, boolean double_quote) {
		if (double_quote) {
			appendDoubleQuoteString(value);
		} else {
			value_.append(value);
		}
	}

	public StringExpression(String value, boolean double_quote) {
		appendString(value, double_quote);
	}

	public void accept(CodeVisitor visitor) {
		visitor.visitStringExpression(value_.toString());
	}
}
