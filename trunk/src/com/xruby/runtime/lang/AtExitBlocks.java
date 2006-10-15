package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

public class AtExitBlocks {
	private static ArrayList<RubyBlock> registgered_blocks_ = new ArrayList<RubyBlock>();
	
	public static void registerBlock(RubyBlock block) {
		registgered_blocks_.add(0, block);
	}
	
	public static void invokeAll() throws RubyException {
		for (RubyBlock block : registgered_blocks_) {
			block.invoke(ObjectFactory.topLevelSelfValue, null);
		}
	}
}
