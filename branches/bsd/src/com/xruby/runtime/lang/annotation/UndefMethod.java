/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.annotation;

public @interface UndefMethod {
	String name();
	boolean classMethod() default false;
}
