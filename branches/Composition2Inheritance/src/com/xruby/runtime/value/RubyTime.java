package com.xruby.runtime.value;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.xruby.runtime.lang.*;

public class RubyTime extends RubyBasic {
	private Date date_;
	
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
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy");
		return sdf.format(date_);
	}
}
