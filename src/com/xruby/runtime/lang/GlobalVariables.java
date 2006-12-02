/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.concurrent.*;
import com.xruby.runtime.value.*;

/*
$* $ARGV
$" $LOADED_FEATURES
$? $CHILD_STATUS 
$& $MATCH
$< $DEFAULT_INPUT 
$. $NR
$> $DEFAULT_OUTPUT 
$, $OFS
$! $ERROR_INFO 
$\ $ORS
$@ $ERROR_POSITION 
$, $OUTPUT_FIELD_SEPARATOR
$; $FIELD_SEPARATOR 
$\ $OUTPUT_RECORD_SEPARATOR
$; $FS 
$$ $PID
$= $IGNORECASE 
$' $POSTMATCH
$. $INPUT_LINE_NUMBER 
$` $PREMATCH
$/ $INPUT_RECORD_SEPARATOR 
$$ $PROCESS_ID
$~ $LAST_MATCH_INFO 
$0 $PROGRAM_NAME
$+ $LAST_PAREN_MATCH 
$/ $RS
$_ $LAST_READ_LINE
*/
public class GlobalVariables {
	
	private static ConcurrentHashMap<String, RubyValue> values_ = new ConcurrentHashMap<String, RubyValue>();
	
	public static RubyValue STDOUT = new RubyObject(RubyRuntime.IOClass);
	public static RubyValue LAST_READ_LINE = ObjectFactory.nilValue;
	public static RubyValue OUTPUT_FIELD_SEPARATOR = ObjectFactory.nilValue;
	public static RubyValue OUTPUT_RECORD_SEPARATOR = ObjectFactory.nilValue;
	public static RubyValue INPUT_RECORD_SEPARATOR = ObjectFactory.createString("\n");
	public static RubyValue PROCESS_ID = ObjectFactory.createFixnum(0);//no way to get pid in java
	
	public static String translatePredefined(final String name) {
		if (name.equals("$stdout")) {
			return "STDOUT";
		} else if (name.equals("$_")) {
			return "LAST_READ_LINE";
		} else if (name.equals("$,")) {
			return "OUTPUT_FIELD_SEPARATOR";
		} else if (name.equals("$\\")) {
			return "OUTPUT_RECORD_SEPARATOR";
		} else if (name.equals("$/")) {
			return "INPUT_RECORD_SEPARATOR";
		} else if (name.equals("$$")) {
			return "PROCESS_ID";
		} else {
			return null;
		}
	}
	
	public static RubyValue get(String name) {
		assert('$' == name.charAt(0));

		RubyValue v = values_.get(name);
		if (null != v) {
			return v;
		} else {
			return ObjectFactory.nilValue;
		}
	}
	
	public static RubyValue set(RubyValue value, String name) {
		assert('$' == name.charAt(0));

		values_.put(name, value);
		return value;
	}
	
	public static void alias(String newName, String oldName) {
		assert('$' == newName.charAt(0));
		assert('$' == oldName.charAt(0));

		RubyValue v = values_.get(oldName);
		if (null != v) {
			values_.put(newName, v);
		}
	}
}
