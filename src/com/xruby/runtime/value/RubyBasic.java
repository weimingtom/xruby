/** 
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

//TODO some stuffs in RubyValue should be moved into here.
class RubyBasic extends RubyValue {
	private RubyClass klass;
	
	public RubyBasic(RubyClass c) {
		super(c);
		this.klass = c;
	}
	
	public RubyClass getRubyClass() {
    	return this.klass;
    }
}
