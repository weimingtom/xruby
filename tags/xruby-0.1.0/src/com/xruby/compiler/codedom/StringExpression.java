/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

public class StringExpression extends Expression {
	private final StringBuilder value_ = new StringBuilder();

	public StringExpression(String value, boolean double_quote) {
		appendString(value, double_quote);
	}

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
			case '#':
				value_.append('#');
				++i;
				break;
			case 'x':
				//e.g. "\x63"
				String hex = value.substring(i + 2, i + 4);
				char h = (char)Integer.parseInt(hex, 16);
				value_.append(h);
				i += 3;
				break;
			default:
				if (Character.isDigit(next_char)) {
					//e,g. "\142"
					String oct = value.substring(i + 1, i + 4);
					char o = (char)Integer.parseInt(oct, 8);
					value_.append(o);
					i += 3;
				} else {
					value_.append('\\');
				}
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

	public void accept(CodeVisitor visitor) {
		visitor.visitStringExpression(value_.toString());
	}
}
