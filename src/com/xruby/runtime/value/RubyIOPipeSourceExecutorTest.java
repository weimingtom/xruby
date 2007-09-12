/**
 * Copyright 2007 Michael Chen
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;

import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyException;

import junit.framework.TestCase;

public class RubyIOPipeSourceExecutorTest extends TestCase {
    private SourceChannel source;
    private SinkChannel sink;
    private RubyIOPipeSourceExecutor executor;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Pipe p = Pipe.open();
        source = p.source();
        sink = p.sink();
        executor = new RubyIOPipeSourceExecutor(source);
    }


    public void testGetsWithNilParamShouldReturnAllContents() throws Exception {
        sink.write(ByteBuffer.wrap("testdata".getBytes()));
        sink.close();
        assertEquals("testdata", executor.gets(RubyConstant.QNIL).toString());
    }

    public void testGetsWithSeparatorWillReturnPartial() throws Exception {
        sink.write(ByteBuffer.wrap("testdata".getBytes()));
        sink.close();
        assertEquals("t", executor.gets(ObjectFactory.createString("t")).toString());
        assertEquals("est", executor.gets(ObjectFactory.createString("t")).toString());
        assertFalse(executor.eof());
        assertEquals("data", executor.gets(RubyConstant.QNIL).toString());
        assertTrue(executor.eof());
    }

    public void testShouldNotAllowReadingRelatedOperations() throws Exception {
        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.flush();
            }
        });
        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.write("");
            }
        });
        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.print("");
            }
        });
    }

    private void assertNotAllow(Function f) {
        try {
            f.run();
            fail();
        } catch (RubyException ex) {
            assertEquals("not opened for writing", ex.toString());
        }
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        executor.close();
    }

}
