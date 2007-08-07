package com.xruby.runtime.lang.annotation;

public enum MethodType {
	UNKNOWN(-1),
	NO_ARG(1), 
	ONE_ARG(2), 
	NO_OR_ONE_ARG(3),
	TWO_ARG(4), 
	ONE_OR_TWO_ARG(6),
	VAR_ARG(8);
	
	private int value;
	
	MethodType(int value) {
		this.value = value;
	}
	
	public int value() {
		return this.value;
	}
	
	public static MethodType valueOf(int value) {
		switch(value) {
		case -1:
			return UNKNOWN;
		case 1:
			return NO_ARG;
		case 2:
			return ONE_ARG;
		case 3:
			return NO_OR_ONE_ARG;
		case 4:
			return TWO_ARG;
		case 6:
			return ONE_OR_TWO_ARG;
		case 8:
			return VAR_ARG;
		default:
			return VAR_ARG;
		}
	}
}
