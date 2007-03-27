/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class ClassGeneratorForRubyBlockTest extends TestCase {
	public void test_buildContructorSignature() {
		assertEquals("void <init> (com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule)", ClassGeneratorForRubyBlock.buildContructorSignature(0));
		assertEquals("void <init> (com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule, com.xruby.runtime.lang.RubyValue)", ClassGeneratorForRubyBlock.buildContructorSignature(1));
		assertEquals("void <init> (com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyBlock, com.xruby.runtime.lang.RubyModule, com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)",
				ClassGeneratorForRubyBlock.buildContructorSignature(2));
	}
}
