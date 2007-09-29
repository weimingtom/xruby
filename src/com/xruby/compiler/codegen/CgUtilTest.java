package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class CgUtilTest extends TestCase {
	public void testGetClassInternalName() {
		assertEquals("com/xruby/compiler/codegen/CgUtil", CgUtil.getInternalName(CgUtil.class));
	}
}
