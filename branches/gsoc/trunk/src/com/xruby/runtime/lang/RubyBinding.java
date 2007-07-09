/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;
import java.util.*;

public class RubyBinding extends RubyBasic {
	private RubyModule scope_;
	private RubyValue self_;
	private RubyBlock block_;
	private RubyArray variables_ = new RubyArray();
	private ArrayList<String> names_ = new ArrayList<String>();
	
	public RubyBinding(RubyClass c) {
		super(c);
	}
	
	public RubyBinding() {
		super(RubyRuntime.BingingClass);
	}

	public boolean hasName(String name) {
		return names_.indexOf(name) >= 0;
	}

	public RubyBinding setScope(RubyModule scope) {
		scope_ = scope;
		return this;
	}

	public RubyBinding setSelf(RubyValue self) {
		self_ = self;
		return this;
	}

	public RubyValue getSelf() {
		return self_;
	}

	public RubyBinding setBlock(RubyBlock block) {
		block_ = block;
		return this;
	}

	public RubyBlock getBlock() {
		return block_;
	}

	public RubyModule getScope() {
		return scope_;
	}

	public void addVariableName(String name) {
		if (names_.indexOf(name) < 0) {
			names_.add(name);
		}
	}

	public RubyBinding addVariable(String name, RubyValue value) {
		int i = names_.indexOf(name);
		if (i < 0) {
			names_.add(name);
			variables_.add(value);
		} else {
			variables_.set(i, value);
		}
		return this;
	}

	public RubyArray getVariables() {
		return variables_;
	}

	public ArrayList<String> getVariableNames() {
		return names_;
	}
	
	protected RubyValue getVariable(String name) {
		int i = names_.indexOf(name);
		if (i < 0) {
			return null;
		} else {
			return variables_.get(i);
		}
		
	}
}
