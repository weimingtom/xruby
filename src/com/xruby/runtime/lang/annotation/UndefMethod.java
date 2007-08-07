package com.xruby.runtime.lang.annotation;

public @interface UndefMethod {
	String name();
	boolean classMethod() default false;
}
