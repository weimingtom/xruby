package com.xruby.runtime.value;

import java.util.regex.Matcher;
import com.xruby.runtime.lang.*;

public class RubyMatchData extends RubyBasic {
	private Matcher matcher_;
	
	RubyMatchData(Matcher m) {
		super(RubyRuntime.MatchDataClass);
		matcher_ = m;
	}
	
	public String to_s() {
		return matcher_.group();
	}
	
	public RubyArray toArray() {
		RubyArray a = new RubyArray();

		if (matcher_.groupCount() == 0) {
			do {
				//we called find() before, so use "do while".
				a.add(ObjectFactory.createString(matcher_.group()));
			} while (matcher_.find());
		} else {
			final int groupcount = matcher_.groupCount();
			do {
				RubyArray subarray = new RubyArray();
				a.add(subarray);
				for (int i = 1; i <= groupcount; ++i) {
					subarray.add(ObjectFactory.createString(matcher_.group(i)));
				}
			} while (matcher_.find());
		}
		return a;
	}
}
