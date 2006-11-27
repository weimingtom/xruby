package com.xruby.runtime.value;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RubyTime {
	private Date date_;
	
	public RubyTime(Date date){
		date_ = date;
	}
	
	public RubyTime() {
		date_ = new Date();
	}
	
	public long getTime() {
		return date_.getTime();
	}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy");
		return sdf.format(date_);
	}
}
