/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Jie Li, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.util.MethodFactory;
import com.xruby.runtime.value.*;

class Array_slice_danger extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray value = (RubyArray) receiver;

        if (1 == args.size()) {
            Object argValue = args.get(0);
            if (argValue instanceof RubyFixnum) {
                RubyFixnum index = (RubyFixnum) argValue;
                return value.delete_at(index.intValue());
            } else if (args.get(0) instanceof RubyRange) {
                int begin = ((RubyFixnum) ((RubyRange) args.get(0)).getLeft()).intValue();
                int end = ((RubyFixnum) ((RubyRange) args.get(0)).getRight()).intValue();
                if (begin < 0) {
                    begin = value.size() + begin;
                }
                if (end < 0) {
                    end = value.size() + end;
                }

                if (!((RubyRange) args.get(0)).isExcludeEnd()) {
                    ++end;
                }

                RubyArray resultValue = value.delete_at(begin, end - begin);
                return (null == resultValue ? ObjectFactory.NIL_VALUE : resultValue);
            }
        } else if (2 == args.size()) {
            Object arg0Value = args.get(0);
            Object arg1Value = args.get(1);
            if (arg0Value instanceof RubyFixnum && arg1Value instanceof RubyFixnum) {
                int begin = ((RubyFixnum) arg0Value).intValue();
                int length = ((RubyFixnum) arg1Value).intValue();
                RubyArray resultValue = value.delete_at(begin, length);
                return (null == resultValue ? ObjectFactory.NIL_VALUE : resultValue);
            }
        }

        //TODO
        throw new RubyException("not implemented");
    }
}

class Array_array_set extends RubyVarArgMethod {
	private int getRealIndex(int size,int i) {
        int index = i;
        if (index < 0) {
            index = size + index;
        }

        if (index < 0) {
            throw new RubyException(RubyRuntime.IndexErrorClass, "index " + i + " out of array");
        }

        return index;
    }
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray value = (RubyArray) receiver;
        
        if (2 == args.size()) {
        	if (args.get(0) instanceof RubyRange) {
        		RubyRange range = (RubyRange) args.get(0);
        		RubyFixnum left = (RubyFixnum)range.getLeft();
        		RubyFixnum right = (RubyFixnum)range.getRight();
        		int l_index = getRealIndex(value.size(), left.intValue());
        		int r_index = getRealIndex(value.size(), right.intValue());
        		int length = r_index-l_index+1;
        		return value.replace(l_index, length, args.get(1));
        	} else {
        		RubyFixnum index = (RubyFixnum) args.get(0);
        		return value.set(index.intValue(), args.get(1));
        	}
        } else if (3 == args.size()) {
        	RubyFixnum index = (RubyFixnum) args.get(0);
            RubyFixnum length = (RubyFixnum) args.get(1);
            return value.replace(index.intValue(), length.intValue(), args.get(2));
        }

        throw new RubyException("not implemented");
    }
}

class Array_concat extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray left = (RubyArray) receiver;
        left.concat(arg);
        return receiver;
    }
}

class Array_times extends RubyOneArgMethod {
    private RubyID joinID = RubyID.intern("join");

    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        if (arg instanceof RubyFixnum) {
            RubyFixnum times = (RubyFixnum) arg;
            return array.times(times.intValue());
        } else if (arg instanceof RubyString) {

            return RubyAPI.callOneArgMethod(receiver, arg, block, joinID);
        }

        throw new RubyException(RubyRuntime.TypeErrorClass, "no implicit conversion from " + arg + " to integer");
    }
}

class Array_insert extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyFixnum index = (RubyFixnum) args.get(0);
        int start = index.intValue();
        if (start < 0) {
        	start+=array.size()+1;
        }
        return array.insert(start, args.subarray(1, args.size()-1));
    }
}

class Array_delete_if extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.delete_if(block);
    }
}

class Array_delete extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyValue return_value = array.delete(arg);
        if (null != block && return_value == ObjectFactory.NIL_VALUE) {
        	return block.invoke(receiver, arg);
        } else {
        	return return_value;
        }
    }
}

class Array_include extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        if (array.include(arg)) {
            return ObjectFactory.TRUE_VALUE;
        } else {
            return ObjectFactory.FALSE_VALUE;
        }
    }
}

class Array_each extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.each(receiver, block);
    }
}

class Array_each_index extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.each_index(receiver, block);
    }
}


class Array_reverse_each extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.reverse_each(receiver, block);
    }
}

class Array_unshift extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.unshift(args);
    }
}

class Array_new extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray a;
        if (null == args) {
            a = new RubyArray();
        } else if (null == block) {
        	if (args.get(0) instanceof RubyArray) {
        		a = (RubyArray)args.get(0).clone();
        	} else {
        		RubyFixnum size = (RubyFixnum) args.get(0);
                RubyValue default_value = args.get(1);
                a = ObjectFactory.createArray(size.intValue(), default_value);
        	}
        } else {
        	RubyFixnum size = (RubyFixnum) args.get(0);
        	a  = new RubyArray();
        	for (int i=0; i<size.intValue(); i++) {
        		RubyValue return_value = block.invoke(receiver, ObjectFactory.createFixnum(i));
        		a.add(return_value);
        	}
        }
        a.setRubyClass((RubyClass) receiver);
        return a;
    }
}

class Array_new_with_given_objects extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray a;
        if (null == args) {
            a = new RubyArray();
        } else {
            a = args.copy();
        }
        a.setRubyClass((RubyClass) receiver);
        return a;
    }
}

class Array_shift extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.delete_at(0);
    }
}

class Array_sort_dangers extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        if (null == block) {
            array.sort();
        } else {
            array.sort(block);
        }
        return array;
    }
}

class Array_sort extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = ((RubyArray) receiver).copy();
        if (null == block) {
            array.sort();
        } else {
            array.sort(block);
        }
        return array;
    }
}

class Array_hash extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return ObjectFactory.createFixnum(array.hash());
    }
}

class Array_compact_danger extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.compact() ? array : ObjectFactory.NIL_VALUE;
    }
}

class Array_compact extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = ((RubyArray) receiver).copy();
        return array.compact() ? array : ObjectFactory.NIL_VALUE;
    }
}

class Array_uniq_danger extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        return array.uniq() ? array : ObjectFactory.NIL_VALUE;
    }
}

class Array_uniq extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = ((RubyArray) receiver).copy();
        return array.uniq() ? array : ObjectFactory.NIL_VALUE;
    }
}

class Array_reverse_danger extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        array.reverse();
        return array;
    }
}

class Array_reverse extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = ((RubyArray) receiver).copy();
        array.reverse();
        return array;
    }
}

class Array_pack extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        String format = ((RubyString) arg).toString();
        return ObjectFactory.createString(ArrayPacker.pack(array, format));
    }
}

class Array_index extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        for(int i=0; i<array.size(); i++){
            if(array.get(i).equals(arg))
                return ObjectFactory.createFixnum(i);
        }
        return ObjectFactory.NIL_VALUE;
    }
}

class Array_rindex extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        for(int i=array.size()-1; i>=0; i--){
            if(array.get(i).equals(arg))
                return ObjectFactory.createFixnum(i);
        }
        return ObjectFactory.NIL_VALUE;
    }
}

class Array_replace extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyArray anotherArray = (RubyArray)arg;
        if(array == anotherArray)
            return array;
        
        array.clear();
        for(int i=0;i<anotherArray.size();i++){
            array.add(anotherArray.get(i));
        }
        return array;
    }
}

class Array_indexes extends RubyVarArgMethod {
    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyArray array = (RubyArray)receiver;
        RubyArray a = new RubyArray(args.size());
        for(int i=0;i<args.size();i++){
            RubyFixnum n = (RubyFixnum) args.get(i);
            a.add(array.get(n.intValue()));
        }
        return a;
    }
}

class Array_nitems extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        int n = 0;
        for(int i=0;i<array.size();i++){
            if(array.get(i) != ObjectFactory.NIL_VALUE)
                n++;
        }
        return ObjectFactory.createFixnum(n);
    }
}

class Array_flatten extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyArray a = new RubyArray();
        recursiveAdd(a,array);
        return a;
    }
    
    private void recursiveAdd(RubyArray receiver,RubyArray array){
        for(int i=0;i<array.size();i++){
            RubyValue val = array.get(i);
            if(val instanceof RubyArray){
                recursiveAdd(receiver,(RubyArray)val);
            }else{
                receiver.add(val);
            }
        }
    }
}

class Array_flatten_danger extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyArray copy = array.copy();
        array.clear();
        boolean hasModified = recursiveAdd(array,copy);
        if(hasModified){
            return array;
        }else{
            return ObjectFactory.NIL_VALUE;
        }
    }
    
    private boolean recursiveAdd(RubyArray receiver,RubyArray array){
        boolean flag = false;
        for(int i=0;i<array.size();i++){
            RubyValue val = array.get(i);
            if(val instanceof RubyArray){
                flag = true;
                recursiveAdd(receiver,(RubyArray)val);
            }else{
                receiver.add(val);
            }
        }
        return flag;
    }
}

class Array_collect_danger extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyArray a = (RubyArray)RubyAPI.callPublicMethod(receiver, null, block, RubyID.intern("collect"));
        RubyArray array = (RubyArray) receiver;        
        array.clear();
        for(int i=0;i<a.size();i++){
            array.add(a.get(i));
        }
        return array;
    }
}

class Array_assoc extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyValue val = null;
        for(int i=0;i<array.size();i++){
            val = array.get(i);
            if(val instanceof RubyArray){
                if(((RubyArray)val).size() > 0){
                    RubyValue tmp = ((RubyArray)val).get(0);
                    if(arg.equals(tmp)){
                        return val;
                    }
                }                
            }
        }

       return ObjectFactory.NIL_VALUE;
    }
}


class Array_rassoc extends RubyOneArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
        RubyArray array = (RubyArray) receiver;
        RubyValue val = null;
        for(int i=0;i<array.size();i++){
            val = array.get(i);
            if(val instanceof RubyArray){
                if(((RubyArray)val).size() > 1){
                    RubyValue tmp = ((RubyArray)val).get(1);
                    if(arg.equals(tmp)){
                        return val;
                    }
                }                
            }
        }

       return ObjectFactory.NIL_VALUE;
    }
}

public class ArrayClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.ArrayClass;
        MethodFactory factory = MethodFactory.createMethodFactory(RubyArray.class);
        
        c.getSingletonClass().defineMethod("new", new Array_new());
        c.getSingletonClass().defineMethod("[]", new Array_new_with_given_objects());
        
        c.defineMethod("length", factory.getMethod("length", MethodFactory.NO_ARG));
        c.defineMethod("clear", factory.getMethod("clear", MethodFactory.NO_ARG));
        c.defineMethod(RubyID.toSID, factory.getMethod("to_s", MethodFactory.NO_ARG));        
        
        c.defineMethod("[]", factory.getMethod("aref", MethodFactory.ONE_OR_TWO_ARG));
        
        c.defineMethod("first", factory.getMethod("first", MethodFactory.NO_OR_ONE_ARG));
        c.defineMethod("last", factory.getMethod("last", MethodFactory.NO_OR_ONE_ARG));
        c.defineMethod("at", factory.getMethod("at", MethodFactory.ONE_ARG));
        c.defineMethod("[]=", new Array_array_set());
        c.defineMethod("==", factory.getMethod("opEquals", MethodFactory.ONE_ARG));
        c.defineMethod("<=>", factory.getMethod("compare", MethodFactory.ONE_ARG));
        c.defineMethod("<<", factory.getMethod("push", MethodFactory.ONE_ARG));
        c.defineMethod("concat", new Array_concat());
        c.defineMethod(RubyID.plusID, factory.getMethod("plus", MethodFactory.ONE_ARG));
        c.defineMethod(RubyID.subID, factory.getMethod("minus", MethodFactory.ONE_ARG));
        c.defineMethod("*", new Array_times());
        c.defineMethod("&", factory.getMethod("and", MethodFactory.ONE_ARG));
        c.defineMethod("|", factory.getMethod("or", MethodFactory.ONE_ARG));
        c.defineMethod("insert", new Array_insert());
        c.defineMethod("push", factory.getMethod("multiPush", MethodFactory.VAR_ARG));
        c.defineMethod("pop", factory.getMethod("pop", MethodFactory.NO_ARG));
        c.defineMethod("delete", new Array_delete());
        c.defineMethod("delete_at", factory.getMethod("deleteAt", MethodFactory.ONE_ARG));
        c.defineMethod("delete_if", new Array_delete_if());
        c.defineMethod("include?", new Array_include());
        c.defineMethod("unshift", new Array_unshift());
        c.defineMethod("each", new Array_each());
        c.defineMethod("reverse_each", new Array_reverse_each());
        c.defineMethod("pack", new Array_pack());
        c.defineMethod("shift", new Array_shift());
        c.defineMethod("sort!", new Array_sort_dangers());
        c.defineMethod("sort", new Array_sort());
        c.defineMethod("hash", new Array_hash());
        c.defineMethod("compact!", new Array_compact_danger());
        c.defineMethod("compact", new Array_compact());
        c.defineMethod("uniq!", new Array_uniq_danger());
        c.defineMethod("uniq", new Array_uniq());
        c.defineMethod("reverse!", new Array_reverse_danger());
        c.defineMethod("reverse", new Array_reverse());
        c.defineMethod("slice", factory.getMethod("aref", MethodFactory.ONE_OR_TWO_ARG));
        c.defineMethod("slice!", new Array_slice_danger());
        c.defineMethod("index",new Array_index());
        c.defineMethod("rindex",new Array_rindex());
        c.defineMethod("replace", new Array_replace());
        c.defineMethod("eql?", factory.getMethod("opEquals", MethodFactory.ONE_ARG));
        c.defineMethod("indexes", new Array_indexes());
        c.defineMethod("indices", new Array_indexes());
        c.defineMethod("nitems",new Array_nitems());
        c.defineMethod("flatten", new Array_flatten());
        c.defineMethod("flatten!", new Array_flatten_danger());
        c.defineMethod("each_index", new Array_each_index());
        c.defineMethod("collect!", new Array_collect_danger());
        c.defineMethod("assoc", new Array_assoc());
        c.defineMethod("rassoc", new Array_rassoc());
        
        c.includeModule(RubyRuntime.EnumerableModule);
    }
}