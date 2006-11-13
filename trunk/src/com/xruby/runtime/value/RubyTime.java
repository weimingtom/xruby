package com.xruby.runtime.value;

import java.util.Date;

public class RubyTime {
	private Date date_;
	
	public RubyTime() {
		date_ = new Date();
	}
	
	public long getTime() {
		return date_.getTime();
	}
}
