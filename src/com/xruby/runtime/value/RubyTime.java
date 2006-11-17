package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBasic;
import java.util.Date;

public class RubyTime extends RubyBasic {
	private Date date;
	
	public RubyTime() {
		date = new Date();
	}
	
	public long getTime() {
		return date.getTime() / 1000;
	}
}