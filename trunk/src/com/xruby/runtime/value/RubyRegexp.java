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
		return match(v) != null;
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
		String replace_string = repl.toString();
		Matcher m = regex.matcher(str.toString());
		
		//java uses $1, $2, ruby uses \1, \2
		replace_string = replace_string.replace("\\&", "$0");
		final int n = m.groupCount();
		for (int i = 1; i <= n; ++i) {
			replace_string = replace_string.replace("\\" + i, "$" + i);
		}
		for (int i = n + 1; i < 10; ++i) {
			replace_string = replace_string.replace("\\" + i, "");
		}
		
		return m.replaceAll(replace_string);
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
		return regex.split(input, limit);
	}
}
