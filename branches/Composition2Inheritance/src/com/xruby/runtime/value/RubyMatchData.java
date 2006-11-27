package com.xruby.runtime.value;

import java.util.regex.*;

public class RubyMatchData {
	private Matcher matcher;
	
	public RubyMatchData(Matcher m) {
		matcher = m;
	}
	
	public String to_s() {
		return matcher.group();
	}
}
