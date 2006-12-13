/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.concurrent.*;
import java.util.*;
import com.xruby.runtime.value.*;

class MultipleMap<T> {
	private ConcurrentMap<String, Vector<T>> values_ = new ConcurrentHashMap<String, Vector<T>>();

	public void put(String s, T proc) {
		if (!values_.containsKey(s)) {
			values_.put(s, new Vector<T>());
		}
		
		Vector<T> set = values_.get(s);
		set.add(0, proc);
	}

	public List<T> get(String name) {
		return values_.get(name);
	}
	
	public void remove(String s, T proc) {
		Vector<T> set = values_.get(s);
		if (null == set) {
			return;
		}
		
		set.remove(proc);
	}
	
	public void removeAll(String s) {
		Vector<T> set = values_.get(s);
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
	private static MultipleMap<RubyProc> traces_procs_ = new MultipleMap<RubyProc>();

	private static boolean in_tracing_ = false;//TODO should this be global or per variable?

	static {
		values_.put("$stdout", new RubyObject(RubyRuntime.IOClass));
		values_.put("$/", ObjectFactory.createString("\n"));
		values_.put("$$",ObjectFactory.fixnum0);//no way to get pid in java
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

		if (!in_tracing_) {
			in_tracing_ = true;

			try {
				List<RubyProc> set = traces_procs_.get(name);
				if (null != set) {
					for (RubyProc p : set) {
						p.getValue().invoke(value, new RubyArray(value));//TODO What the receiver should be?
					}
				}
			} finally {
				in_tracing_ = false;
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

