package com.xruby.newruntime.lang;

import java.util.Arrays;

class MethodCache {
	private static int CACHE_SIZE = 0x800;
	private static int CACHE_MASK = 0x7ff;
	
	private CacheEntry[] cache = clearCache();
	
	private CacheEntry[] clearCache() {
		CacheEntry[] cache = new CacheEntry[CACHE_SIZE];
		Arrays.fill(cache, null);
		
		return cache;
	}
	
	private int cacheIndex(RubyClassModuleBase c, RubyID id) {
		return (((c.objectAddress() >> 3) ^ ((int)id.getId())) & CACHE_MASK);
	}
	
	public CacheEntry getMethod(RubyClassModuleBase c, RubyID id) {
		int index = cacheIndex(c, id);
		return cache[index];
	}
	
	public void putMethod(RubyClassModuleBase c, RubyID id, RubyMethodWrapper m) {
		int index = cacheIndex(c, id);
		
		cache[index].klass = c;
		cache[index].mid = id;
		cache[index].method = m;
	}
	
	static class CacheEntry {
		public RubyClassModuleBase klass;
		public RubyID mid;
		public RubyMethodWrapper method;
	}
}
