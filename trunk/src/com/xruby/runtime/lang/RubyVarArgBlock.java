/** 
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyVarArgBlock extends RubyBlock {
	public RubyVarArgBlock(RubyBlock block, RubyValue self, RubyBlock owner, RubyModule scope) {
		super(-1, false, 0, block, self, owner, scope);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args) {
		return this.run(receiver);
	}

	protected RubyValue run(RubyValue receiver, RubyValue arg) {
		return this.run(receiver);
	}
	
	protected RubyValue run(RubyValue receiver, RubyValue arg0, RubyValue arg1) {
		return this.run(receiver);
	}

	protected abstract RubyValue run(RubyValue receiver);	
}
