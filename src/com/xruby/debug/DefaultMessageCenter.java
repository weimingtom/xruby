/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * Output all the message to the stdout/err
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class DefaultMessageCenter implements MessageCenter {

    public void emitMessage(String msg) {
        out.println(msg);
    }

    public void emitMessage(String format, Object... args) {
        out.println(String.format(format, args));
    }
}
