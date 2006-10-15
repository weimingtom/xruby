package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class ClassGeneratorForRubyBlockTest extends TestCase {
	public void test_buildContructorSignature() {
		assertEquals("void <init> ()", ClassGeneratorForRubyBlock.buildContructorSignature(0));
		assertEquals("void <init> (com.xruby.runtime.lang.RubyValue)", ClassGeneratorForRubyBlock.buildContructorSignature(1));
		assertEquals("void <init> (com.xruby.runtime.lang.RubyValue, com.xruby.runtime.lang.RubyValue)",
				ClassGeneratorForRubyBlock.buildContructorSignature(2));
	}
}
