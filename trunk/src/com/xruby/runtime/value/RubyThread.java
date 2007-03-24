/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyThread extends RubyValue {

	private final Thread thread_;
	
	public RubyThread(final RubyBlock block) {
		super(RubyRuntime.ThreadClass);
		thread_ = new Thread(new Runnable() {
			public void run() {block.invoke(null, null);}
		});
		thread_.start();
	}

	private RubyThread(Thread thread) {
		super(RubyRuntime.ThreadClass);
		thread_ = thread;
	}

	public void join() {
		try {
			thread_.join();
		} catch (InterruptedException e) {
			throw new Error(e);
		}
	}

	public static RubyThread current() {
		return new RubyThread(Thread.currentThread());
	}
	
}
