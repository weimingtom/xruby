/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import java.io.*;
import junit.framework.TestCase;

public class NameFactoryTest extends TestCase {

    public void setUp() {
        NameFactory.reset();
    }

    public void test_createClassName() {
        assertEquals("xruby/STDIN/main", NameFactory.createClassName(null, null, null));
        assertEquals("xruby/test/main", NameFactory.createClassName(null, "test.rb", null));
        assertEquals("xruby/test/test$0", NameFactory.createClassName(null, "test.rb", "test"));
        assertEquals("xruby/builtin/test$1", NameFactory.createClassName("src", "src/builtin.rb", "test"));
        assertEquals("xruby/builtin/test$2", NameFactory.createClassName(null, "src/builtin.rb", "test"));
        assertEquals("xruby/builtin/test$3", NameFactory.createClassName("src/", "src//builtin.rb", "test"));
        assertEquals("xruby/subdir/test/xxx$4", NameFactory.createClassName("dir", "dir/subdir/test.rb", "xxx"));
        assertEquals("xruby/test/xxx$5", NameFactory.createClassName("ruby/1.8/", "ruby/1.8//test.rb", "xxx"));
    }

    public void test_createMainClassName() {
        assertEquals("test.main", NameFactory.createMainClassName("test"));
        assertEquals("test.main", NameFactory.createMainClassName("test.rb"));
        assertEquals("test1.test2.main", NameFactory.createMainClassName("test1/test2"));
    }

    public void test_createClassNameForBlock() {
        assertEquals("xruby/test/BLOCK$0", NameFactory.createClassNameForBlock(null, "test.rb", null));
        assertEquals("xruby/test/BLOCK$1", NameFactory.createClassNameForBlock(null, "test.rb", null));
    }

    public void test_createClassFileName () {
        assertEquals("main.class", NameFactory.createClassFileName("main"));
        assertEquals("to_s$1234.class", NameFactory.createClassFileName("to_s$1234"));
        assertEquals("empty?$4.class", NameFactory.createClassFileName("empty?$4"));
    }

    public void test_createJarFileName() {
        assertEquals((new File("test.jar")).toString(), NameFactory.createJarFileName("test.rb.bak").toString());
        assertEquals((new File("STDIN.jar")).toString(), NameFactory.createJarFileName(null).toString());
        assertEquals(new File("test.jar").toString(), NameFactory.createJarFileName("c:/ruby/lib/test.rb").toString());
    }

    public void test_createMainClass() {
        assertEquals("xruby.test.main", NameFactory.createMainClass("test.rb"));
        assertEquals("xruby.builtin.main", NameFactory.createMainClass("src/builtin.rb"));
    }

    public void test_convertSlashToDot() {
        assertEquals("test.main", NameFactory.convertSlashToDot("test/main"));
        assertEquals("xruby.test.main", NameFactory.convertSlashToDot("xruby/test/main"));
    }

    public void test_filename2classname() {
        assertEquals("test.main", NameFactory.filename2classname("test/main.class"));
    }

    public void test_Character_isJavaIdentifierPart() {
        assertFalse(Character.isJavaIdentifierPart('?'));
        assertFalse(Character.isJavaIdentifierPart('!'));
    }
}
