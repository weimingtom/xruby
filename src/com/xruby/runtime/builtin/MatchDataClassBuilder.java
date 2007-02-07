/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class MatchData_to_s extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyMatchData matchdata = (RubyMatchData)receiver;
		return ObjectFactory.createString(matchdata.to_s());
	}
}

public class MatchDataClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.MatchDataClass;
		c.defineMethod("to_s", new MatchData_to_s());
	}
}
