package com.xruby.compiler;

import junit.framework.TestCase;

public class ClassGeneratorForRubyBlockTest extends TestCase {
	public void test_buildContructorSignature() {
		assertEquals("void <init> ()", ClassGeneratorForRubyBlock.buildContructorSignature(0));
		assertEquals("void <init> (com.xruby.core.lang.RubyValue)", ClassGeneratorForRubyBlock.buildContructorSignature(1));
		assertEquals("void <init> (com.xruby.core.lang.RubyValue, com.xruby.core.lang.RubyValue)",
				ClassGeneratorForRubyBlock.buildContructorSignature(2));
	}
}
