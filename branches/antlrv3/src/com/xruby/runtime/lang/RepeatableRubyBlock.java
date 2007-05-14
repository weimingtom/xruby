/** 
 * Copyright 2005-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

/**
 *
 */
public class RepeatableRubyBlock extends RubyBlock {
    private RubyArray array;

    public RepeatableRubyBlock(RubyBlock block, RubyValue self, RubyModule scope) {
        super(block.argc_, block.has_asterisk_parameter_, block.default_argc_, block, self, null, scope);

        array = new RubyArray();
    }

    public RubyArray getRetValue() {
        return array;
    }

    protected RubyValue run(RubyValue receiver, RubyArray args) {
        RubyValue retValue =  blockOfCurrentMethod_.run(receiver, args);
        array.add(retValue);

        return retValue;
    }
}
