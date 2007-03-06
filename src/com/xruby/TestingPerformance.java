/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby;

import java.util.*;
import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

/*
 * A simple console program that test XRuby runtime's performance 
 */
public class TestingPerformance {

	private static final int LOOP = 30000000;
	
	private static long test_createFixnum() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			ObjectFactory.createFixnum(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_createString() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			ObjectFactory.createString("xxxxx");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_createArray() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			new RubyArray(ObjectFactory.fixnum1);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_arrayAccess() {
		RubyArray a = new RubyArray(ObjectFactory.fixnum1);
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			a.get(0);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_javaArrayAccess() {
		RubyValue[] a = new RubyValue[]{ObjectFactory.fixnum1};
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			@SuppressWarnings("unused")
			RubyValue b = a[0];
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_createJavaArray() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			@SuppressWarnings("unused")
			RubyValue[] a = new RubyValue[]{ObjectFactory.fixnum1};
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_cast() {
		RubyValue v = new RubyArray(ObjectFactory.fixnum1);
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			@SuppressWarnings("unused")
			RubyArray a = (RubyArray)v;
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_instanceof() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			@SuppressWarnings("unused")
			boolean b = (ObjectFactory.fixnum1 instanceof RubyFixnum);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_nothing() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			//Do nothing
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_hashMapLookup() {
		Map<String, RubyMethod> m = new HashMap<String, RubyMethod>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			m.get("+");//will return null (find nothing)
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_iteratingEmptyArrayList() {
		ArrayList<RubyModule> a = new ArrayList<RubyModule>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			for (@SuppressWarnings("unused")
			RubyModule module : a) {
				//DO nothing
			}
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_iteratorCreation() {
		ArrayList<RubyModule> a = new ArrayList<RubyModule>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			a.iterator();
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_StringBuilder_append1() {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder('x');
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			s1.append(s2);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_ArrayList_isEmpty() {
		ArrayList<RubyModule> a = new ArrayList<RubyModule>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			a.isEmpty();
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_StringBuilder_append2() {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder('x');
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			s1.append(s2.toString());
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_searchEmptySingletonClass() {
		RubySingletonClass c = new RubySingletonClass();
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			c.findOwnMethod("+");//will return null (find nothing)
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_findMethodForFixnum() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			ObjectFactory.fixnum1.findMethod("+");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_findMethodForString() {
		RubyString s = ObjectFactory.createString("xxx");
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			s.findMethod("+");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_invokeMethod() {
		RubyMethod m = ObjectFactory.fixnum1.findMethod("+");
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOP; ++i) {
			m.invoke(ObjectFactory.fixnum1, ObjectFactory.fixnum1, null, null);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_callMethodForFixnum() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 30000000; ++i) {
			RubyAPI.callPublicOneArgMethod(ObjectFactory.fixnum1, ObjectFactory.fixnum1, null, "+");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long test_callMethodForString() {
		RubyString s = ObjectFactory.createString("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 30000000; ++i) {
			RubyAPI.callPublicMethod(s, null, null, "length");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	/* Sample result:
	Fixnum Creation: 1036
	String Creation: 3737
	Array Creation: 3122
	Array Access: 682
	Java Array Creation: 971
	Java Array Access: 61
	Type Casting: 94
	instanceof: 113
	Do Nothing: 27
	HashMap Lookup: 870
	Iterating Empty ArrayList: 2272
	Iterator Creation: 1145
	ArrayList.isEmpty: 59
	Search Empty SingletonClass: 1012
	Method Finding for Fixnum: 1020
	Method Finding for String: 2619
	Method Invoking: 1176
	Method Calling: 2605
	*/
	public static void main(String[] args) {
		System.out.println("Fixnum Creation: " + test_createFixnum());
		System.out.println("String Creation: " + test_createString());
		System.out.println("Array Creation: " + test_createArray());
		System.out.println("Array Access: " + test_arrayAccess());
		System.out.println("Java Array Creation: " + test_createJavaArray());
		System.out.println("Java Array Access: " + test_javaArrayAccess());
		System.out.println("Type Casting: " + test_cast());
		System.out.println("instanceof: " + test_instanceof());
		System.out.println("Do Nothing: " + test_nothing());
		System.out.println("HashMap Lookup: " + test_hashMapLookup());
		System.out.println("Iterating Empty ArrayList: " + test_iteratingEmptyArrayList());
		System.out.println("Iterator Creation: " + test_iteratorCreation());
		System.out.println("ArrayList.isEmpty: " + test_ArrayList_isEmpty());
		System.out.println("StringBuilder append StringBuilder: " + test_StringBuilder_append1());
		System.out.println("StringBuilder append String: " + test_StringBuilder_append2());
		System.out.println("Search Empty SingletonClass: " + test_searchEmptySingletonClass());
		System.out.println("Method Finding for Fixnum: " + test_findMethodForFixnum());
		System.out.println("Method Finding for String: " + test_findMethodForString());
		System.out.println("Method Invoking: " + test_invokeMethod());
		System.out.println("Method Calling for Fixnum: " + test_callMethodForFixnum());
		System.out.println("Method Calling for String: " + test_callMethodForString());
	}

}
