package com.xruby.runtime.lang.util;

import com.xruby.runtime.lang.annotation.MethodType;

class CgMethodItem {
	public String name;
	public String javaName;
	public MethodType type;
	public boolean block;
	public boolean singleton;
	public String[] alias;
}
