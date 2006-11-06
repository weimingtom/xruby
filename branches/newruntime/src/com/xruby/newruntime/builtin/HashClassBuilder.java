package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyBlock;
import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyOneArgMethod;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyFixnum;
import com.xruby.newruntime.value.RubyHash;

public class HashClassBuilder implements ClassBuilder {
	private RubyClass hashClass;
	
	public RubyClass getHashClass() {
		return this.hashClass;
	}
	
	public void initialize() {
		this.hashClass = RubyRuntime.defineClass("Hash", RubyRuntime.objectClass);
		this.hashClass.includeModule(RubyRuntime.enumerableModule);
		this.hashClass.defineAllocMethod(HashMethod.alloc);
		/*
		 rb_define_alloc_func(rb_cHash, hash_alloc);
    rb_define_singleton_method(rb_cHash, "[]", rb_hash_s_create, -1);
    rb_define_method(rb_cHash,"initialize", rb_hash_initialize, -1);
    rb_define_method(rb_cHash,"initialize_copy", rb_hash_replace, 1);
    rb_define_method(rb_cHash,"rehash", rb_hash_rehash, 0);

    rb_define_method(rb_cHash,"to_hash", rb_hash_to_hash, 0);
    rb_define_method(rb_cHash,"to_a", rb_hash_to_a, 0);
    rb_define_method(rb_cHash,"to_s", rb_hash_to_s, 0);
    rb_define_method(rb_cHash,"inspect", rb_hash_inspect, 0);

    rb_define_method(rb_cHash,"==", rb_hash_equal, 1);
    */
		this.hashClass.defineMethod("[]", HashMethod.aref, 1);
	/*
    rb_define_method(rb_cHash,"fetch", rb_hash_fetch, -1);
    */
		this.hashClass.defineMethod("[]=", HashMethod.aset, 2);
		/*
    rb_define_method(rb_cHash,"[]=", rb_hash_aset, 2);
    rb_define_method(rb_cHash,"store", rb_hash_aset, 2);
    rb_define_method(rb_cHash,"default", rb_hash_default, -1);
    rb_define_method(rb_cHash,"default=", rb_hash_set_default, 1);
    rb_define_method(rb_cHash,"default_proc", rb_hash_default_proc, 0);
    rb_define_method(rb_cHash,"index", rb_hash_index, 1);
    rb_define_method(rb_cHash,"indexes", rb_hash_indexes, -1);
    rb_define_method(rb_cHash,"indices", rb_hash_indexes, -1);
    */
		this.hashClass.defineMethod("size", HashMethod.length, 0);
		this.hashClass.defineMethod("length", HashMethod.length, 0);
		this.hashClass.defineMethod("empty?", HashMethod.empty, 0);
		/*
    rb_define_method(rb_cHash,"each", rb_hash_each, 0);
    rb_define_method(rb_cHash,"each_value", rb_hash_each_value, 0);
    rb_define_method(rb_cHash,"each_key", rb_hash_each_key, 0);
    rb_define_method(rb_cHash,"each_pair", rb_hash_each_pair, 0);
    rb_define_method(rb_cHash,"sort", rb_hash_sort, 0);

    rb_define_method(rb_cHash,"keys", rb_hash_keys, 0);
    rb_define_method(rb_cHash,"values", rb_hash_values, 0);
    rb_define_method(rb_cHash,"values_at", rb_hash_values_at, -1);

    rb_define_method(rb_cHash,"shift", rb_hash_shift, 0);
    rb_define_method(rb_cHash,"delete", rb_hash_delete, 1);
    rb_define_method(rb_cHash,"delete_if", rb_hash_delete_if, 0);
    rb_define_method(rb_cHash,"select", rb_hash_select, -1);
    rb_define_method(rb_cHash,"reject", rb_hash_reject, 0);
    rb_define_method(rb_cHash,"reject!", rb_hash_reject_bang, 0);
    rb_define_method(rb_cHash,"clear", rb_hash_clear, 0);
    rb_define_method(rb_cHash,"invert", rb_hash_invert, 0);
    rb_define_method(rb_cHash,"update", rb_hash_update, 1);
    rb_define_method(rb_cHash,"replace", rb_hash_replace, 1);
    rb_define_method(rb_cHash,"merge!", rb_hash_update, 1);
    rb_define_method(rb_cHash,"merge", rb_hash_merge, 1);

    rb_define_method(rb_cHash,"include?", rb_hash_has_key, 1);
    rb_define_method(rb_cHash,"member?", rb_hash_has_key, 1);
    rb_define_method(rb_cHash,"has_key?", rb_hash_has_key, 1);
    rb_define_method(rb_cHash,"has_value?", rb_hash_has_value, 1);
    rb_define_method(rb_cHash,"key?", rb_hash_has_key, 1);
    rb_define_method(rb_cHash,"value?", rb_hash_has_value, 1);

#ifndef __MACOS__ // environment variables nothing on MacOS.
    origenviron = environ;
    envtbl = rb_obj_alloc(rb_cObject);
    rb_extend_object(envtbl, rb_mEnumerable);

    rb_define_singleton_method(envtbl,"[]", rb_f_getenv, 1);
    rb_define_singleton_method(envtbl,"fetch", env_fetch, -1);
    rb_define_singleton_method(envtbl,"[]=", env_aset, 2);
    rb_define_singleton_method(envtbl,"store", env_aset, 2);
    rb_define_singleton_method(envtbl,"each", env_each, 0);
    rb_define_singleton_method(envtbl,"each_pair", env_each_pair, 0);
    rb_define_singleton_method(envtbl,"each_key", env_each_key, 0);
    rb_define_singleton_method(envtbl,"each_value", env_each_value, 0);
    rb_define_singleton_method(envtbl,"delete", env_delete_m, 1);
    rb_define_singleton_method(envtbl,"delete_if", env_delete_if, 0);
    rb_define_singleton_method(envtbl,"clear", env_clear, 0);
    rb_define_singleton_method(envtbl,"reject", env_reject, 0);
    rb_define_singleton_method(envtbl,"reject!", env_reject_bang, 0);
    rb_define_singleton_method(envtbl,"select", env_select, -1);
    rb_define_singleton_method(envtbl,"shift", env_shift, 0);
    rb_define_singleton_method(envtbl,"invert", env_invert, 0);
    rb_define_singleton_method(envtbl,"replace", env_replace, 1);
    rb_define_singleton_method(envtbl,"update", env_update, 1);
    rb_define_singleton_method(envtbl,"inspect", env_inspect, 0);
    rb_define_singleton_method(envtbl,"rehash", env_none, 0);
    rb_define_singleton_method(envtbl,"to_a", env_to_a, 0);
    rb_define_singleton_method(envtbl,"to_s", env_to_s, 0);
    rb_define_singleton_method(envtbl,"index", env_index, 1);
    rb_define_singleton_method(envtbl,"indexes", env_indexes, -1);
    rb_define_singleton_method(envtbl,"indices", env_indexes, -1);
    rb_define_singleton_method(envtbl,"size", env_size, 0);
    rb_define_singleton_method(envtbl,"length", env_size, 0);
    rb_define_singleton_method(envtbl,"empty?", env_empty_p, 0);
    rb_define_singleton_method(envtbl,"keys", env_keys, 0);
    rb_define_singleton_method(envtbl,"values", env_values, 0);
    rb_define_singleton_method(envtbl,"values_at", env_values_at, -1);
    rb_define_singleton_method(envtbl,"include?", env_has_key, 1);
    rb_define_singleton_method(envtbl,"member?", env_has_key, 1);
    rb_define_singleton_method(envtbl,"has_key?", env_has_key, 1);
    rb_define_singleton_method(envtbl,"has_value?", env_has_value, 1);
    rb_define_singleton_method(envtbl,"key?", env_has_key, 1);
    rb_define_singleton_method(envtbl,"value?", env_has_value, 1);
    rb_define_singleton_method(envtbl,"to_hash", env_to_hash, 0);

    rb_define_global_const("ENV", envtbl);
		 */
	}
}

class HashMethod {
	public static RubyMethod alloc = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args,
				RubyBlock block) {
			return new RubyHash();
		}		
	};
	
	public static RubyMethod length = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyHash hash = (RubyHash)receiver;
			return RubyFixnum.int2Fix(hash.size());
		}
	};
	
	public static RubyMethod empty = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyHash hash = (RubyHash)receiver;
			return RubyUtil.test(hash.isEmpty());
		}
	};
	
	public static RubyMethod aref = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyHash hash = (RubyHash)receiver;			
			return hash.get(arg);
		}		
	};
	
	public static RubyMethod aset = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args,
				RubyBlock block) {
			RubyHash hash = (RubyHash)receiver;
			if (args.length == 2) {
				return hash.put(args[0], args[1]);
			}
			
			// FIXME: throws exception
			return null;
		}
		
	};
}
