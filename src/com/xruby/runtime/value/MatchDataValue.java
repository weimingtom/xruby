package com.xruby.runtime.value;

import java.util.regex.*;

public class MatchDataValue {
	private Matcher matcher_;
	
	public MatchDataValue(Matcher matcher) {
		matcher_ = matcher;
	}
	
	public String to_s() {
		return matcher_.group();
	}
}
