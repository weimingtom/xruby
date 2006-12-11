/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.concurrent.*;
import java.util.*;
import com.xruby.runtime.value.*;

class MultipleMap<T> {
	private ConcurrentMap<String, HashSet<T>> values_ = new ConcurrentHashMap<String, HashSet<T>>();

	public void put(String s, T proc) {
		if (!values_.containsKey(s)) {
			values_.put(s, new HashSet<T>());
		}
		
		HashSet<T> set = values_.get(s);
		set.add(proc);
	}

	public Set<T> get(String name) {
		return values_.get(name);
	}
	
	public void remove(String s, T proc) {
		HashSet<T> set = values_.get(s);
		if (null == set) {
			return;
		}
		
		set.remove(proc);
	}
	
	public void removeAll(String s) {
		HashSet<T> set = values_.get(s);
		if (null != set) {
			set.clear();
		}
	}
}

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
	public static RubyValue MATCH = ObjectFactory.nilValue;
	public static RubyValue LAST_READ_LINE = ObjectFactory.nilValue;
	public static RubyValue OUTPUT_FIELD_SEPARATOR = ObjectFactory.nilValue;
	public static RubyValue OUTPUT_RECORD_SEPARATOR = ObjectFactory.nilValue;
	public static RubyValue INPUT_RECORD_SEPARATOR = ObjectFactory.createString("\n");
	public static RubyValue PROCESS_ID = ObjectFactory.createFixnum(0);//no way to get pid in java
	
	private static MultipleMap<RubyProc> traces_procs_ = new MultipleMap<RubyProc>();
	
	public static String translatePredefined(final String name) {
		if (name.equals("$stdout")) {
			return "STDOUT";
		} else if (name.equals("$&")) {
			return "MATCH";
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
	
	public static boolean isReadOnly(String name) {
		if (name.equals("$$")) {
			return true;
		}
		
		//TODO more
		
		return false;
	}
	
	public static void throwNameError(String name) {
		throw new RubyException(RubyRuntime.NameErrorClass, name + " is a read-only variable");
	}
	
	public static RubyValue set(RubyValue value, String name) {
		assert('$' == name.charAt(0));
		values_.put(name, value);

		Set<RubyProc> set = traces_procs_.get(name);
		if (null != set) {
			for (RubyProc p : set) {
				p.getValue().invoke(null, new RubyArray(value));//TODO receiver should not be null
			}
		}
		
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

	private static boolean isDefined(String name) {
		if (translatePredefined(name) != null) {
			return true;
		}

		return (values_.get(name) != null);
	}

	public static void addTraceProc(String name, RubyProc proc) {
		traces_procs_.put(name, proc);
	}

	public static void removeTraceProc(String name, RubyProc proc) {
		if (!isDefined(name)) {
			throw new RubyException(RubyRuntime.NameErrorClass, "undefined global variable " + name);
		}
		
		traces_procs_.remove(name, proc);
	}
	
	public static void removeAllTraceProc(String name) {
		if (!isDefined(name)) {
			throw new RubyException(RubyRuntime.NameErrorClass, "undefined global variable " + name);
		}
		
		traces_procs_.removeAll(name);
	}
}

