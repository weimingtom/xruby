package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;
import java.util.*;

public class RubyBinding extends RubyValue {

	private RubyValue self_;
	private RubyBlock block_;
	private RubyArray variables_ = new RubyArray();
	private ArrayList<String> names_ = new ArrayList<String>();
	
	public RubyBinding() {
		super(RubyRuntime.BingingClass);
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

	public RubyBinding addVariable(String name, RubyValue value) {
		names_.add(name);
		variables_.add(value);
		return this;
	}

	public RubyArray getVariables() {
		return variables_;
	}

	public ArrayList<String> getVariableNames() {
		return names_;
	}
}
