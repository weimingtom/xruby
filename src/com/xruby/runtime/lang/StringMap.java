package com.xruby.runtime.lang;

import java.util.HashMap;
import java.util.Map;

public class StringMap {
	private static Map<String, RubyID> symbolMap = new HashMap<String, RubyID>();
	private static Map<RubyID, String> symbolReceiverMap = new HashMap<RubyID, String>();
	
	public static RubyID intern(String name) {
		RubyID id = symbolMap.get(name);
		if (id != null) {
			return id;
		}
		
		// FIXME: set id flag;
		
		id = new RubyID();
		id.setId(RubyIDGenerator.nextId());
		
		symbolMap.put(name, id);
		symbolReceiverMap.put(id, name);
		return id;
	}
	
	public static String id2name(RubyID id) {
		return symbolReceiverMap.get(id);
	}
	
	private StringMap() {		
	}
}
