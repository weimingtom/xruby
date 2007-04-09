/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @breif Internal representation of a ruby array
 */
public class RubyArray extends RubyBasic implements Iterable<RubyValue> {
    private ArrayList<RubyValue> array_;

    //MRHS will be converted to a RubyArray, but its original form need to be saved
    //to handle multiple assignment
    private final int rhs_size_;
    private final boolean has_single_asterisk_or_call_;

    public RubyArray() {
        this(0);
    }

    public RubyArray(int size) {
        this(size, 0, false);
    }

    public RubyArray(RubyValue v) {
        this(1);
        add(v);
    }

    public RubyArray(RubyValue value1, RubyValue value2) {
        this(2);
        add(value1);
        add(value2);
    }

    public RubyArray(int size, RubyValue default_value) {
        this(size);
        for (int i = 0; i < size; ++i) {
            array_.add(default_value);
        }
    }

    public RubyArray(int size, int rhs_size, boolean has_single_asterisk_or_call) {
        super(RubyRuntime.ArrayClass);
        array_ = new ArrayList<RubyValue>(size);

        rhs_size_ = rhs_size;
        has_single_asterisk_or_call_ = has_single_asterisk_or_call;
    }

    @SuppressWarnings("unchecked")
    public RubyArray clone() {
        RubyArray v = (RubyArray) super.clone();
        v.array_ = (ArrayList<RubyValue>) array_.clone();
        return v;
    }

    public boolean isSingleAsterisk() {
        return (0 == rhs_size_) && has_single_asterisk_or_call_;
    }

    public boolean isSingleRhs() {
        return (rhs_size_ <= 1) && !has_single_asterisk_or_call_;
    }

    public RubyArray add(RubyValue v) {
        array_.add(v);
        return this;
    }

    public RubyArray clear() {
        array_.clear();
        return this;
    }

    public RubyArray insert(int index, RubyValue v) {
        array_.add(index, v);
        return this;
    }

    public int size() {
        return array_.size();
    }

    public RubyValue delete_at(int index) {
        if (index < 0 || index > size()) {
            return ObjectFactory.NIL_VALUE;
        }

        return array_.remove(index);
    }

    public RubyValue delete_if(RubyBlock block) {
        for (int i = 0; i < array_.size();) {
            RubyValue r = block.invoke(this, new RubyArray(array_.get(i)));
            if (RubyAPI.testTrueFalse(r)) {
                array_.remove(i);
            } else {
            	++i;
            }
        }
        return this;
    }

    public RubyValue delete(RubyValue arg) {
        boolean found = false;
        while (array_.remove(arg)) {
            found = true;
        }

        return found ? arg : ObjectFactory.NIL_VALUE;
    }

    public Iterator<RubyValue> iterator() {
        return array_.iterator();
    }

    private int getRealIndex(int i) {
        int index = i;
        if (index < 0) {
            index = array_.size() + index;
        }

        if (index < 0) {
            throw new RubyException(RubyRuntime.IndexErrorClass, "index " + i + " out of array");
        }

        return index;
    }

    public RubyValue set(int start, RubyValue value) {
        int index = getRealIndex(start);

        if (index < array_.size()) {
            array_.set(index, value);
        } else {
            array_.ensureCapacity(index + 1);
            for (int i = array_.size(); i < index; ++i) {
                array_.add(ObjectFactory.NIL_VALUE);
            }
            array_.add(value);
        }

        return value;
    }

    public RubyValue replace(int start, int length, RubyValue value) {
        int index = getRealIndex(start);

        if (length < 0) {
            throw new RubyException(RubyRuntime.IndexErrorClass, "negative length (" + length + ")");
        } else if (0 == length) {
            if (value instanceof RubyArray) {
                array_.addAll(index, ((RubyArray) value).getInternal());
            } else {
                array_.add(index, value);
            }
        } else {
            for (int i = 0; i < length - 1; ++i) {
                array_.remove(index);
            }

            //TODO should we use addAll if value is RubyArray?
            array_.set(index, value);
        }
        return value;
    }

    public RubyValue get(int index) {
        if (index < 0) {
            index = array_.size() + index;
        }

        if (index < 0 || index >= size()) {
            return ObjectFactory.NIL_VALUE;
        } else {
            return array_.get(index);
        }
    }

    public RubyArray copy() {
        RubyArray resultArray = new RubyArray(array_.size());
        for (RubyValue v : array_) {
            resultArray.add(v);
        }

        return resultArray;
    }

    public RubyValue compare(RubyArray other_array) {
        int length = (size() <= other_array.size()) ? size() : other_array.size();
        for (int i = 0; i < length; ++i) {
            RubyValue v = RubyAPI.callPublicOneArgMethod(get(i), other_array.get(i), null, CommonRubyID.unequalID);
            if (!RubyAPI.testEqual(v, ObjectFactory.FIXNUM0)) {
                return v;
            }
        }

        if (size() == other_array.size()) {
            return ObjectFactory.FIXNUM0;
        } else if (size() > other_array.size()) {
            return ObjectFactory.FIXNUM1;
        } else {
            return ObjectFactory.createFixnum(-1);
        }
    }

    public RubyArray subarray(int begin, int length) {
        final int arraySize = array_.size();
        if (begin > arraySize) {
            return null;
        }

        if (length < 0) {
            return null;
        }

        if (begin < 0) {
            begin += arraySize;
        }

        if (begin + length > arraySize) {
            length = arraySize - begin;
            if (length < 0) {
                length = 0;
            }
        }

        if (length == 0) {
            return new RubyArray(0);
        }

        RubyArray resultArray = new RubyArray(length);
        int last = begin + length;
        for (int i = begin; i < last; i++) {
            resultArray.add(array_.get(i));
        }

        return resultArray;
    }

    public boolean equals(RubyArray that) {
        if (array_.size() != that.size()) {
            return false;
        }

        for (int i = 0; i < array_.size(); ++i) {
            if (!RubyAPI.testEqual(this.get(i), that.get(i))) {
                return false;
            }
        }

        return true;
    }

    public RubyValue to_s() {
        RubyString r = ObjectFactory.createString();

        for (RubyValue v : array_) {
            r.appendString(v);

            // TODO: The output of to_s is not as the same as cruby, we should solve this issue
            // TODO: and change the corresponding testcases in RubyCompilerTest, such as test_array_expand.
        }

        return r;
    }

    ArrayList<RubyValue> getInternal() {
        return array_;
    }

    public void concat(RubyValue v) {
        if (!(v instanceof RubyArray)) {
            throw new RubyException(RubyRuntime.TypeErrorClass,
                    "can't convert " + v.getRubyClass().toString() + " into Array");
        }

        array_.addAll(((RubyArray) v).getInternal());
    }

    public RubyArray plus(RubyArray v) {
        int size = array_.size() + v.size();
        RubyArray resultArray = new RubyArray(size);
        resultArray.array_.addAll(array_);
        resultArray.array_.addAll(v.array_);
        return resultArray;
    }

    private boolean remove(RubyValue v) {
        boolean r = false;
        while (array_.remove(v)) {
            r = true;
        }
        return r;
    }

    public RubyArray minus(RubyArray other) {
        RubyArray a = this.copy();
        for (RubyValue v : other) {
            a.remove(v);
        }
        return a;
    }

    public RubyArray times(int times) {
        if (times < 0) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass, "negative argument");
        }

        int size = array_.size() * times;
        RubyArray resultArray = new RubyArray(size);
        for (int i = 0; i < times; i++) {
            resultArray.array_.addAll(array_);
        }

        return resultArray;
    }

    /// Returns true if the given object is present
    public boolean include(RubyValue v) {
        for (RubyValue value : array_) {
            if (RubyAPI.testEqual(value, v)) {
                return true;
            }
        }

        return false;
    }

    public RubyValue each(RubyValue receiver, RubyBlock block) {
        for (RubyValue item : array_) {
            RubyValue v = block.invoke(receiver, new RubyArray(item));
		    if (block.breakedOrReturned()) {
			    return v;
		    }
        }
        return this;
    }

    public RubyValue reverse_each(RubyValue receiver, RubyBlock block) {
    	ListIterator<RubyValue> ite = array_.listIterator(array_.size());
        while (ite.hasPrevious()) {
            RubyValue v = block.invoke(receiver, new RubyArray(ite.previous()));
		    if (block.breakedOrReturned()) {
			    return v;
		    }
        }
        return this;
    }

    public RubyArray expand(RubyValue v) {
        if (v instanceof RubyArray) {
            //[5,6,*[1, 2]]
            array_.addAll(((RubyArray) v).getInternal());
        } else {
            //[5,6,*1], [5,6,*nil]
            array_.add(v);
        }

        return this;
    }

    //create a new Array containing every element from index to the end
    public RubyValue collect(int index) {
        assert(index >= 0);

        final int size = array_.size() - index;
        if (size < 0) {
            return new RubyArray();
        }

        RubyArray a = new RubyArray(size);
        for (int i = index; i < array_.size(); ++i) {
            a.add(array_.get(i));
        }

        return a;
    }

    public RubyArray unshift(RubyValue value) {
        array_.add(0, value);
        return this;
    }

    public RubyArray unshift(RubyArray value) {
        array_.addAll(0, value.getInternal());
        return this;
    }

    public void sort() {
        Collections.sort(array_, new Comparator<RubyValue>() {
            public int compare(RubyValue arg0, RubyValue arg1) {
                RubyValue v = RubyAPI.callPublicOneArgMethod(arg0, arg1, null, CommonRubyID.unequalID);
                return ((RubyFixnum) v).intValue();
            }
        }
        );
    }

    public void sort(final RubyBlock block) {
        final RubyArray self = this;
        Collections.sort(array_, new Comparator<RubyValue>() {

            public int compare(RubyValue arg0, RubyValue arg1) {
                //TODO can not check if block return/break occured.
                RubyValue v = block.invoke(self, new RubyArray(arg0, arg1));
                return ((RubyFixnum) v).intValue();
            }
        }
        );
    }

    public int hash() {
        return array_.hashCode();
    }

    public RubyArray and(RubyArray other) {
        RubyArray a = new RubyArray();
        for (RubyValue v : array_) {
            if (other.include(v) && !a.include(v)) {
                a.add(v);
            }
        }
        return a;
    }

    public RubyArray or(RubyArray other) {
        RubyArray a = new RubyArray();
        for (RubyValue v : array_) {
            if (!a.include(v)) {
                a.add(v);
            }
        }
        for (RubyValue v : other) {
            if (!a.include(v)) {
                a.add(v);
            }
        }
        return a;
    }

    public boolean compact() {
        return remove(ObjectFactory.NIL_VALUE);
    }

    public boolean uniq() {
        boolean b = false;
        for (int i = 0; i < array_.size(); ++i) {
            for (int j = i + 1; j < array_.size();) {
                if (RubyAPI.testEqual(array_.get(i), array_.get(j))) {
                    array_.remove(j);
                    b = true;
                } else {
                    ++j;
                }
            }
        }
        return b;
    }

    public void reverse() {
        Collections.reverse(array_);
    }
}

