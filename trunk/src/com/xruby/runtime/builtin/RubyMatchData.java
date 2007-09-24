/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.util.regex.Matcher;
import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

@RubyLevelClass(name="MatchData")
public class RubyMatchData extends RubyBasic {
	private Matcher matcher_;
	
	RubyMatchData(Matcher m) {
		super(RubyRuntime.MatchDataClass);
		matcher_ = m;
	}
	
	@RubyLevelMethod(name="to_s")
	public RubyString to_s() {
		return ObjectFactory.createString(this.matcher_.group());
	}
	
	public String toString() {
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
