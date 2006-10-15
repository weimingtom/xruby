package com.xruby.compiler;

import java.util.*;

class SymbolTable {
	private final Map<String, Integer> local_variables_ = new HashMap<String, Integer>();
	private final ArrayList<String> method_parameters_ = new ArrayList<String>();
	private String asterisk_parameters_ = null;
	private int access_counter_ = 0;
	
	public void addLocalVariable(String name, int i) {
		local_variables_.put(name, i);
	}
	
	public int getLocalVariable(String name) {
		Integer i = local_variables_.get(name);
		if (null == i) {
			return -1;
		} else {
			return i.intValue();
		}
	}
	
	public void addMethodParameters(String name) {
		method_parameters_.add(name);
	}

	public void setMethodAsteriskParameters(String name) {
		assert(null == asterisk_parameters_);
		asterisk_parameters_ = name;
	}
	
	public int getMethodParameter(String name) {
		return method_parameters_.indexOf(name);
	}

	public int getMethodAsteriskParameter(String name) {
		if (null == asterisk_parameters_) {
			return -1;
		} else if (!asterisk_parameters_.equals(name)) {
			return -1;
		} else {
			return access_counter_++;
		}
	}

}
