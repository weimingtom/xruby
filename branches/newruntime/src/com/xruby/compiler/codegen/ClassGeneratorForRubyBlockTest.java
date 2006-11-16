package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class ClassGeneratorForRubyBlockTest extends TestCase {
	public void test_buildContructorSignature() {
		assertEquals("void <init> (com.xruby.newruntime.lang.RubyBlock)", ClassGeneratorForRubyBlock.buildContructorSignature(0));
		assertEquals("void <init> (com.xruby.newruntime.lang.RubyBlock, com.xruby.newruntime.lang.RubyValue)", ClassGeneratorForRubyBlock.buildContructorSignature(1));
		assertEquals("void <init> (com.xruby.newruntime.lang.RubyBlock, com.xruby.newruntime.lang.RubyValue, com.xruby.newruntime.lang.RubyValue)",
				ClassGeneratorForRubyBlock.buildContructorSignature(2));
	}
}
