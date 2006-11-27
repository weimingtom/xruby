package com.xruby.runtime.value;

import java.util.regex.*;

public class RubyRegexp {

	private Pattern regex;
	
	public RubyRegexp(String v) {
		regex = Pattern.compile(v);
	}
	
	public boolean caseEqual(String v) {
		Matcher m = regex.matcher(v);
		return m.find();
	}
	
	public RubyMatchData match(String v) {
		Matcher m = regex.matcher(v);
		if (m.find()) {
			return new RubyMatchData(m);
		} else {
			return null;
		}
	}
	
	public int matchPosition(String v) {
		Matcher m = regex.matcher(v);
		if (m.find()) {
			return m.start();
		} else {
			return -1;
		}
	}
	
	public String gsub(RubyString str, RubyString repl) {
		return regex.matcher(str.toString()).replaceAll(repl.toString());
	}
	
	public Pattern getValue() {
		return regex;
	}
}
