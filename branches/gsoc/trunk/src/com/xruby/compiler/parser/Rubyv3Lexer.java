package com.xruby.compiler.parser;

import java.util.Stack;
import java.io.Reader;

import org.antlr.runtime.*;



public class Rubyv3Lexer extends Rubyv3BaseLexer {
	
	public Rubyv3Lexer(ANTLRInputStream input){
		super(input);
	}
	
	public Rubyv3Lexer(ANTLRStringStream input){
		super(input);
	}
	
	protected boolean isAsciiValueTerminator(char value) {
		switch (value) {
		case '\t':
		case ' ':
		case '\f':
		case '\13':
		case '\r':
		case '\n':
		case (char)Rubyv3Lexer.EOF:
		case ')': // while(ARGV[0] && ARGV[0][0] == ?-)
		case ',': // [?d, ?s, :date]
		case ']': // [?a]
		case ';': // $state[n*2] = ?|;
		case '.': // unless (?A..?Z) === klass[0]
			return true;
		default:
			return false;
		}
	}
	
	protected int trackDelimiterCount(char next_char, char delimeter, int delimeter_count) {
		if (delimeter == translateDelimiter(delimeter)) {
			if (delimeter == next_char) {
				--delimeter_count;
				assert (delimeter_count >= 0);
			}
		} else {
			if (delimeter == next_char) {
				++delimeter_count;
			} else if (next_char == translateDelimiter(delimeter)) {
				--delimeter_count;
				assert (delimeter_count >= 0);
			}
		}

		return delimeter_count;
	}

	private char translateDelimiter(char in) {
		switch (in) {
		case '{':
			return '}';
		case '[':
			return ']';
		case '(':
			return ')';
		case '<':
			return '>';
		default:
			return in;
		}
	}
	
	
	
	
}
