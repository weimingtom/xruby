package com.xruby.compiler.codegen;

import java.util.*;

class SymbolTable {
	private final Map<String, Integer> local_variables_ = new HashMap<String, Integer>();
	private final ArrayList<String> method_parameters_;
	private String asterisk_parameters_ = null;
	private String block_parameters_ = null;
	private int asterisk_parameters_access_counter_ = 0;
	private int block_parameters_access_counter_ = 0;

	private static final String NAME_FOR_INTERNAL_BLOCK_VAR = "block$";
	private static final String NAME_FOR_INTERNAL_BINDING_VAR = "binding$";

	public SymbolTable() {
		this(null);
	}
	
	// SymbolTable may have preloaded values (eval, commandline etc)
	public SymbolTable(ArrayList<String> binging) {
		if (null == binging) {
			method_parameters_ = new ArrayList<String>();
		} else {
			method_parameters_ = binging;
		}
	}

	public void setInternalBlockVar(int i) {
		addLocalVariable(NAME_FOR_INTERNAL_BLOCK_VAR, i);
	}

	public int getInternalBlockVar() {
		return getLocalVariable(NAME_FOR_INTERNAL_BLOCK_VAR);
	}

	public void setInternalBindingVar(int i) {
		addLocalVariable(NAME_FOR_INTERNAL_BINDING_VAR, i);
	}

	public int getInternalBindingVar() {
		return getLocalVariable(NAME_FOR_INTERNAL_BINDING_VAR);
	}

	public Collection<String> getLocalVariables() {
		Collection<String> r = local_variables_.keySet();
		r.remove(NAME_FOR_INTERNAL_BLOCK_VAR);
		return r;
	}

	public Collection<String> getParameters() {
		return method_parameters_;
	}
	
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
	
	public void addMethodParameter(String name) {
		method_parameters_.add(name);
	}

	public void setMethodAsteriskParameter(String name) {
		assert(null == asterisk_parameters_);
		asterisk_parameters_ = name;
	}

	public void setMethodBlockParameter(String name) {
		assert(null == block_parameters_);
		block_parameters_ = name;
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
			return asterisk_parameters_access_counter_++;
		}
	}

	public int getMethodBlockParameter(String name) {
		if (null == block_parameters_) {
			return -1;
		} else if (!block_parameters_.equals(name)) {
			return -1;
		} else {
			return block_parameters_access_counter_++;
		}
	}

	public boolean isDefinedInCurrentScope(String name) {
		if (getLocalVariable(name) >= 0) {
			return true;
		} else if (getMethodParameter(name) >= 0) {
			return true;
		} else if (null != asterisk_parameters_ && asterisk_parameters_.equals(name)) {
			return true;
		} else if (null != block_parameters_ && block_parameters_.equals(name)) {
			return true;
		} else {
			return false;
		}
	}

}
