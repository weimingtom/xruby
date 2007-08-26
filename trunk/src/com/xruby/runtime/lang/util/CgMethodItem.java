/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

class CgMethodItem {
	public String name;
	public String javaName;
	public MethodType type;
	public boolean block;
	public boolean singleton;
	public String[] alias;
	public boolean moduleMethod;
}
