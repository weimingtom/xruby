package com.xruby.runtime.lang;

import java.io.InputStream;
import java.io.PrintStream;
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
	
	public static RubyIO STDIN = new RubyFile(System.in, null, 0);
	public static RubyIO STDOUT = new RubyFile(null, System.out, 1);
	public static RubyIO STDERR = new RubyFile(null, System.err, 2);
	
	public static void setIn(InputStream in) {
		System.setIn(in);
		STDIN = new RubyFile(System.in, null, 0);
	}
	
	public static void setOut(PrintStream out) {
		System.setOut(out);
		STDOUT = new RubyFile(null, System.out, 1);
	}
	
	public static void setErr(PrintStream err) {
		System.setErr(err);
		STDERR = new RubyFile(null, System.err, 2);
	}
	
	public static RubyValue LAST_READ_LINE = RubyConstant.QNIL;
	public static RubyValue OUTPUT_FIELD_SEPARATOR = RubyConstant.QNIL;
	public static RubyValue OUTPUT_RECORD_SEPARATOR = RubyConstant.QNIL;
	public static RubyValue INPUT_RECORD_SEPARATOR = ObjectFactory.createString("\n");
	
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
			return RubyConstant.QNIL;
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