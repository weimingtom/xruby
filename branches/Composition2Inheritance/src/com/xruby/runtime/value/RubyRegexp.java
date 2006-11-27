package com.xruby.runtime.value;

import java.util.regex.*;
import com.xruby.runtime.lang.*;

public class RubyRegexp extends RubyBasic {

	private Pattern regex;
	
	RubyRegexp(String v) {
		super(RubyRuntime.RegexpClass);
		regex = Pattern.compile(v);
	}

	RubyRegexp() {
		super(RubyRuntime.RegexpClass);
	}

	public void setValue(String v) {
		regex = Pattern.compile(v);
	}
	
	public boolean caseEqual(String v) {
		Matcher m = regex.matcher(v);
		return m.find();
	}
	
	public RubyMatchData match(String v) {
		Matcher m = regex.matcher(v);
		if (m.find()) {
			return ObjectFactory.createMatchData(m);
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
	
	public Pattern getPattern() {
		return regex;
	}
}
