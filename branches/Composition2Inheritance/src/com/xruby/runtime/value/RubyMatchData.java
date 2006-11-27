package com.xruby.runtime.value;

import java.util.regex.Matcher;
import com.xruby.runtime.lang.*;

public class RubyMatchData extends RubyBasic {
	private Matcher matcher;
	
	RubyMatchData(Matcher m) {
		super(RubyRuntime.MatchDataClass);
		matcher = m;
	}
	
	public String to_s() {
		return matcher.group();
	}
}
