/**
 * Copyright 2007 Michael Chen
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;

import com.xruby.runtime.lang.RubyException;

import junit.framework.TestCase;

public class RubyIOPipeSinkExecutorTest extends TestCase {

    private SinkChannel sink;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Pipe p = Pipe.open();
        sink = p.sink();
    }

    public void testShouldNotAllowReadingRelatedOperations() throws Exception {
        final RubyIOPipeSinkExecutor executor = new RubyIOPipeSinkExecutor(sink);

        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.eof();
            }
        });

        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.gets(null);
            }
        });

        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.read();
            }
        });

        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.read(1);
            }
        });

        assertNotAllow(new Function() {
            public void run() throws RuntimeException {
                executor.read(1, 1);
            }
        });

    }

    private void assertNotAllow(Function f) {
        try {
            f.run();
            fail();
        } catch (RubyException ex) {
            assertEquals("not opened for reading", ex.toString());
        }
    }

}

interface Function {
    void run() throws RuntimeException;
}