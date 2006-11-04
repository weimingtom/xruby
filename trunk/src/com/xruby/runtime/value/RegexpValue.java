package com.xruby.runtime.value;

import java.util.regex.*;

public class RegexpValue {

	private Pattern regex_;
	
	public RegexpValue(String v) {
		regex_ = Pattern.compile(v);
	}
	
	public boolean caseEqual(String v) {
		Matcher m = regex_.matcher(v);
		return m.find();
	}
	
	public MatchDataValue match(String v) {
		Matcher m = regex_.matcher(v);
		if (m.find()) {
			return new MatchDataValue(m);
		} else {
			return null;
		}
	}
	
	public int matchPosition(String v) {
		Matcher m = regex_.matcher(v);
		if (m.find()) {
			return m.start();
		} else {
			return -1;
		}
	}
}
