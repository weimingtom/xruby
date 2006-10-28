package com.xruby.runtime.value;

import java.util.Date;

public class TimeValue {
	private Date date_;
	
	public TimeValue() {
		date_ = new Date();
	}
	
	public long getTime() {
		return date_.getTime() / 1000;
	}
}
