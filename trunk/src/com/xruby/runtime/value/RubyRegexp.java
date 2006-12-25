package com.xruby.runtime.value;

import java.util.regex.*;
import com.xruby.runtime.lang.*;

public class RubyRegexp extends RubyBasic {

	private Pattern regex;
	
	RubyRegexp(String v) {
		super(RubyRuntime.RegexpClass);
		regex = Pattern.compile(v, Pattern.MULTILINE);
	}

	RubyRegexp() {
		super(RubyRuntime.RegexpClass);
	}

	public void setValue(String v) {
		regex = Pattern.compile(v);
	}
	
	public boolean caseEqual(String v) {
		Matcher m = regex.matcher(v);
		return m.find();
	}
	
	public RubyMatchData match(String v) {
		Matcher m = regex.matcher(v);
		if (m.find()) {
			GlobalVariables.set(ObjectFactory.createString(m.toString()), "$&");
			return ObjectFactory.createMatchData(m);
		} else {
			GlobalVariables.set(ObjectFactory.nilValue, "$&");
			return null;
		}
	}
	
	public int matchPosition(String v) {
		if (v.length() == 0) {
			v = "\n"; //TODO a hack to handle "" =~ /^$/, need a better solution
		}
		
		Matcher m = regex.matcher(v);
		if (m.find()) {
			GlobalVariables.set(ObjectFactory.createString(m.group()), "$&");
			return m.start();
		} else {
			GlobalVariables.set(ObjectFactory.nilValue, "$&");
			return -1;
		}
	}
	
	public String gsub(RubyString str, RubyString repl) {
		return regex.matcher(str.toString()).replaceAll(repl.toString());
	}

	public RubyValue gsub(RubyString s, RubyBlock block) {
		Matcher m = regex.matcher(s.toString());
		RubyString r = new RubyString("");
		while (m.find()) {
			RubyString match = new RubyString(m.group());
			RubyValue v = block.invoke(this, new RubyArray(match));
			r.appendString(v);	
		}
		
		return r;
	}
	
	public String[] split(String input, int limit) {
		String[] s = regex.split(input, limit);
		if (regex.pattern().equals("")) {
			//To conform ruby's behavior, discard the first element if regex is //
			String[] new_s = new String[s.length - 1];
			for (int i = 1; i < s.length; ++i) {
				new_s[i - 1] = s[i]; 
			}
			return new_s;
		} else {
			return s;
		}
	}
}
