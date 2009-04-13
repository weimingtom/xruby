/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class TypesTest extends TestCase {
    public void test_isBuiltinClass() {
        assertTrue(Types.isBuiltinClass("Binding"));
        assertTrue(Types.isBuiltinClass("Class"));
        assertTrue(!Types.isBuiltinClass("XXXX"));
        assertTrue(!Types.isBuiltinClass("class"));
    }
}