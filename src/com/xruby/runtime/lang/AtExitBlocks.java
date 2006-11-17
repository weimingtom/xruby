package com.xruby.runtime.lang;

import java.util.*;

/**
 * Manage blocks registerted by at_exit()
 */
public class AtExitBlocks {
	private static ArrayList<RubyBlock> registgered_blocks_ = new ArrayList<RubyBlock>();
	
	public static void registerBlock(RubyBlock block) {
		registgered_blocks_.add(0, block);
	}
	
	public static void invokeAll() {
		for (RubyBlock block : registgered_blocks_) {
			block.invoke(RubyRuntime.topSelf, null);
		}
	}
}

