package com.xruby.core.value;

import java.util.regex.*;

public class RegexpValue {

	private Pattern regex_;
	
	public RegexpValue(String v) {
		regex_ = Pattern.compile(v);
	}
	
	public boolean match(String v) {
		Matcher m = regex_.matcher(v);
		return m.matches();
	}
}
