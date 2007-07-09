/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.xruby.runtime.lang.*;

public class RubyTime extends RubyBasic {
	private final Date date_;
	
	RubyTime(Date date){
		super(RubyRuntime.TimeClass);
		date_ = date;
	}
	
	RubyTime() {
		super(RubyRuntime.TimeClass);
		date_ = new Date();
	}
	
	public long getTime() {
		return date_.getTime();
	}
    
    public int getUsec() {
        long t = getTime();
        
        if (t > 0 && t < 1000) {
            return (int) (t * 1000);
        }
        
        float t1 = ((float)t / 1000);
        float t2 = (long)t1;
        return (int)((t1 - t2) * 1000000);
    }
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy");
		return sdf.format(date_);
	}
   
}
