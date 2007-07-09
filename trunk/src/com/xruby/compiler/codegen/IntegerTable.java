/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import java.util.*;

//Used to reduce the number of calls to ObjectFactory.createFixnum()
class IntegerTable {
    private final Map<Integer, Integer> integers_ = new HashMap<Integer, Integer>();

    public Integer getInteger(int k) {
        return integers_.get(k);
    }

    public void addInteger(int k, int v) {
        integers_.put(k, v);
    }
}
