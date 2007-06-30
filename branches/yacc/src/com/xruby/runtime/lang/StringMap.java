/** 
 * Copyright 2005-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.Map;
import java.util.concurrent.*;

public class StringMap {
	private static Map<String, RubyID> symbolMap = new ConcurrentHashMap<String, RubyID>();
	
	public static RubyID intern(String name) {
		RubyID id = symbolMap.get(name);
		if (id != null) {
			return id;
		}
		
		// FIXME: set id flag;
		
		id = RubyIDGenerator.nextId(name);
		
		symbolMap.put(name, id);
		return id;
	}
	
	private StringMap() {		
	}
}
