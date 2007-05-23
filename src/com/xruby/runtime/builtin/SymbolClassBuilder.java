/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;


import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Symbol_toI extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyID id = ((RubySymbol)receiver).toID();
		return id.toFixnum();
	}
}

class Symbol_inspect extends RubyNoArgMethod {
	private int getChar(String name, int index) {
		if (index >= name.length()) {
			return -1;
		}
		
		return name.charAt(index);
	}
	
	private boolean isUpper(int c) {
		return c >= 'A' && c <= 'Z';
	}
	
	private boolean isAlpha(int c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}
	
	private boolean isDigit(int c) {
		return c >= '0' && c <= '9';
	}
	
	private boolean isAlnum(int c) {
		return isAlpha(c) || isDigit(c);
	}
	
	// FIXME: TO BE COMPLETED
	private boolean isIdentChar(int c) {
		return isAlnum(c) || c == '_';
	}
	
	private boolean isSpecialGlobalName(String name) {
		int current = 0;
		switch (getChar(name, current)) {
		case '~': case '*': case '$': case '?': case '!': case '@':
		case '/': case '\\': case ';': case ',': case '.': case '=':
		case ':': case '<': case '>': case '\"':
		case '&': case '`': case '\'': case '+':
		case '0':
			current++;
			break;
		case '-':
			current++;
			// FIXME: TO BE COMPLETED
			// if (is_identchar(*m)) m += mbclen(*m);
			break;
		default:
			if (!isDigit(getChar(name, current))) {
				return false;
			}
			
			do {
				current++;
			} while (isDigit(getChar(name, current)));
		}
		
		return getChar(name, current) <= 0;
	}

	private boolean isSymname(String name) {
		if (name == null) {
			return false;
		}
		
		int current = 0;
		boolean id = false;
		boolean localid = false;
		
		switch(getChar(name, current)) {
		case '\0':
			return false;
		case '$':
			if (isSpecialGlobalName(name.substring(++current))) {
				return true;
			}
			id = true;
			break;
		case '@':
			current++;
			if (getChar(name, current) == '@') {
				current++;
			}			
			id = true;
		case '<':
			current++;
			switch (getChar(name, current)) {
			case '<': 
				current++;
				break;
			case '=':
				current++;
				if (getChar(name, current) == '>') {
					current++;
				}
				break;
			}
			break;
		case '>':
			current++;
			switch (getChar(name, current)) {
			case '>':
			case '=':
				current++;
				break;
			}
			break;
		case '=':
			current++;
			switch (getChar(name, current)) {
			case '~':
				current++;
				break;
			case '=':
				current++;
				if (getChar(name, current) == '=') {
					current++;
				}
				break;
			default:
				return false;
			}
		case '*':
			current++;
			if (getChar(name, current) == '*') {
				current++;
			}			
			break;
		case '+':
		case '-':
			current++;
			if (getChar(name, current) == '@') {
				current++;
			}
			break;
		case '|': 
		case '^': 
		case '&': 
		case '/': 
		case '%': 
		case '~': 
		case '`':
	        current++;
	        break;
		case '[':
			current++;
			if (getChar(name, current) != ']') {
				return false;
			}
			
			current++;			
			if (getChar(name, current) == '=') {
				current++;
			}
			break;
		default:
			localid = !isUpper(getChar(name, current));
		    id = true;
			break;
		}
		
		if (id) {
			// FIXME: TO BE COMPLETE
			int c = getChar(name, current);			
			if (c != '_' && !isAlpha(c)) {
				return false;
			}
			// FIXME: TO BE COMPLETE
			while (isIdentChar(getChar(name, current))) {
				current++;
			}
			
			if (localid) {
				switch (getChar(name, current)) {
				case '!': 
				case '?': 
				case '=': 
					current++;
				}
			}
		}
		
		return getChar(name, current) <= 0;
	}
	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		RubyString str = ObjectFactory.createString(":" + value);
		if (!isSymname(value)) {
			String s = str.dump();
			s = ":\"" + s.substring(2);
			str = ObjectFactory.createString(s); 
		}
		
		return str;
	}
}

class Symbol_toS extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(value);
	}
}

class Symbol_id2name extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(value);
	}
}

class Symbol_toSym extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return receiver;
	}
}

public class SymbolClassBuilder {	
	public static void initialize() {
		RubyClass c = RubyRuntime.SymbolClass;

		c.defineMethod("to_i", new Symbol_toI());
		c.defineMethod("to_int", new Symbol_toI());
		c.defineMethod("inspect", new Symbol_inspect());
		c.defineMethod("to_s", new Symbol_toS());
		c.defineMethod("id2name", new Symbol_id2name());
		c.defineMethod("to_sym", new Symbol_toSym());
	}
}
