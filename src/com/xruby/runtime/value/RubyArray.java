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
import java.util.List;
import java.util.ListIterator;

/**
 * @breif Internal representation of a ruby array
 */
public class RubyArray extends RubyBasic implements Iterable<RubyValue> {
    private List<RubyValue> array_;

    //MRHS will be converted to a RubyArray, but its original form need to be saved
    //to handle multiple assignment
    private final int rhs_size_;
    private final boolean has_single_asterisk_or_lambda_call_;

    public RubyArray() {
        this(0);
    }

    public RubyArray(int size) {
        this(size, 0, false);
    }

    public RubyArray(RubyValue v) {
        this(1);
        this.array_.add(v);
    }

    public RubyArray(RubyValue value1, RubyValue value2) {
        this(2);
        this.array_.add(value1);
        this.array_.add(value2);
    }

    RubyArray(int size, RubyValue default_value) {
        this(size);
        for (int i = 0; i < size; ++i) {
            array_.add(default_value);
        }
    }

    RubyArray(int size, int rhs_size, boolean has_single_asterisk_or_lambda_call) {
        super(RubyRuntime.ArrayClass);
        array_ = new ArrayList<RubyValue>(size);

        rhs_size_ = rhs_size;
        has_single_asterisk_or_lambda_call_ = has_single_asterisk_or_lambda_call;
    }

    private RubyArray(List<RubyValue> array) {
        super(RubyRuntime.ArrayClass);
        this.array_ = array;

        rhs_size_ = 0;
        has_single_asterisk_or_lambda_call_ = false;
    }

    @SuppressWarnings("unchecked")
    public RubyArray clone() {
        RubyArray v = (RubyArray) super.clone();
        v.array_ = new ArrayList<RubyValue>(this.array_);
        return v;
    }

    public boolean isSingleAsterisk() {
        return (0 == rhs_size_) && has_single_asterisk_or_lambda_call_;
    }

    public boolean isSingleRhs() {
        return (rhs_size_ <= 1) && !has_single_asterisk_or_lambda_call_;
    }

    public RubyArray add(RubyValue v) {
        array_.add(v);
        return this;
    }

    public RubyFixnum length() {
        return ObjectFactory.createFixnum(this.array_.size());
    }

    public RubyArray clear() {
        array_.clear();
        return this;
    }

    public RubyArray insert(int index, RubyArray a) {
        for (int i = array_.size(); i < index; ++i) {
            array_.add(ObjectFactory.NIL_VALUE);
        }
        array_.addAll(index, a.array_);
        return this;
    }

    public RubyArray insert(int index, RubyValue v) {
        array_.add(index, v);
        return this;
    }

    public int size() {
        return array_.size();
    }

    public RubyValue first() {
        if (this.array_.size() == 0) {
            return RubyConstant.QNIL;
        } else {
            return this.array_.get(0);
        }
    }

    public RubyValue first(RubyValue v) {
        int n = v.toInt();
        int size = this.array_.size();
        if (n > size) {
            n = size;
        }

        return new RubyArray(this.array_.subList(0, n));
    }

    public RubyValue last() {
        if (this.array_.size() == 0) {
            return RubyConstant.QNIL;
        } else {
            return this.array_.get(this.size() - 1);
        }
    }

    public RubyValue last(RubyValue v) {
        int n = v.toInt();
        int size = this.array_.size();
        if (n > size) {
            n = size;
        }

        return new RubyArray(this.array_.subList(size - n, size));
    }

    public RubyValue at(RubyValue value) {
        return this.get(value.toInt());
    }

    public RubyArray push(RubyArray args) {
        if (null != args) {
            for (RubyValue v : args) {
                this.array_.add(v);
            }
        }
        return this;
    }

    public RubyValue pop() {
        int size = this.array_.size();
        return this.array_.remove(size - 1);
    }

    public RubyValue deleteAt(RubyValue v) {
        return this.delete_at(v.toInt());
    }

    public RubyValue delete_at(int index) {
        if (index >= size()) {
            return ObjectFactory.NIL_VALUE;
        }

        if(index < 0){
            index += size();
        }

        if(index < 0){
            return ObjectFactory.NIL_VALUE;
        }

        return array_.remove(index);
    }

    public RubyArray delete_at(int begin, int length) {
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

        while(length > 0){
            array_.remove(begin);
            length--;
        }

        return this;
    }

    public RubyValue delete_if(RubyBlock block) {
        for (int i = 0; i < array_.size();) {
            RubyValue r = block.invoke(this, array_.get(i));
            if (r.isTrue()) {
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
            for (int i = array_.size(); i < index; ++i) {
                array_.add(ObjectFactory.NIL_VALUE);
            }
            array_.add(value);
        }

        return value;
    }

    public RubyValue replace(int start, int length, RubyValue value) {
        int index = getRealIndex(start);
        if (value == ObjectFactory.NIL_VALUE) {
            for(int i=0;i<length;i++) {
                array_.remove(index);
            }
            return value;
        }
        if (length < 0) {
            throw new RubyException(RubyRuntime.IndexErrorClass, "negative length (" + length + ")");
        } else if (0 == length) {
            if (value instanceof RubyArray) {
                array_.addAll(index, ((RubyArray) value).array_);
            } else {
                array_.add(index, value);
            }
        } else {
            for (int i = 0; i < length -1; ++i) {
                array_.remove(index);
            }
            if (value instanceof RubyArray) {
                array_.remove(index);
                array_.addAll(index, ((RubyArray) value).array_);
            } else {
                array_.set(index, value);
            }
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
            RubyValue v = RubyAPI.callPublicOneArgMethod(get(i), other_array.get(i), null, RubyID.unequalID);
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

        return new RubyArray(array_.subList(begin, begin + length));
    }

    public RubyValue opEquals(RubyValue v) {
        return ObjectFactory.createBoolean(equals(v));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof RubyArray) {
            RubyArray that = (RubyArray)o;
            int size = array_.size();
            if (size != that.size()) {
                return false;
            }

            for (int i = 0; i < size; ++i) {
                if (!this.get(i).equals(that.get(i))) {
                    return false;
                }
            }

            return true;
        } else if (o instanceof RubyValue) {
            RubyValue v = (RubyValue)o;
            if (!v.respondTo(RubyID.toAryID)) {
                return false;
            } else {
                return v.equals(this);
            }
        } else {
            return false;
        }
    }

    public RubyArray toAry() {
        return this;
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

    public void concat(RubyValue v) {
        if (!(v instanceof RubyArray)) {
            throw new RubyException(RubyRuntime.TypeErrorClass,
                    "can't convert " + v.getRubyClass().toString() + " into Array");
        }

        array_.addAll(((RubyArray) v).array_);
    }

    public RubyArray plus(RubyValue v) {
        return this.plus(v.toAry());
    }

    public RubyArray plus(RubyArray v) {
        int size = array_.size() + v.size();
        RubyArray resultArray = new RubyArray(size);
        resultArray.array_.addAll(array_);
        resultArray.array_.addAll(v.array_);
        return resultArray;
    }

    public RubyArray minus(RubyValue v) {
        return this.minus(v.toAry());
    }

    public RubyArray minus(RubyArray other) {
        RubyArray a = this.copy();
        for (RubyValue v : other) {
            a.remove(v);
        }
        return a;
    }

    private boolean remove(RubyValue v) {
        boolean r = false;
        while (array_.remove(v)) {
            r = true;
        }
        return r;
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
            RubyValue v = block.invoke(receiver, item);
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }

    public RubyValue each_index(RubyValue receiver, RubyBlock block) {
        for (int i=0;i<size();i++) {
            RubyValue v = block.invoke(receiver, new RubyFixnum(i));
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }

    public RubyValue reverse_each(RubyValue receiver, RubyBlock block) {
        ListIterator<RubyValue> ite = array_.listIterator(array_.size());
        while (ite.hasPrevious()) {
            RubyValue v = block.invoke(receiver, ite.previous());
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }

    public RubyArray expand(RubyValue v) {
        if (v instanceof RubyArray) {
            //[5,6,*[1, 2]]
            array_.addAll(((RubyArray) v).array_);
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
        array_.addAll(0, value.array_);
        return this;
    }

    public void sort() {
        Collections.sort(array_, new Comparator<RubyValue>() {
            public int compare(RubyValue arg0, RubyValue arg1) {
                RubyValue v = RubyAPI.callPublicOneArgMethod(arg0, arg1, null, RubyID.unequalID);
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
                RubyValue v = block.invoke(self, arg0, arg1);
                return ((RubyFixnum) v).intValue();
            }
        }
        );
    }

    public int hash() {
        return array_.hashCode();
    }

    public RubyArray and(RubyValue value) {
        RubyArray other = value.toAry();

        RubyArray a = new RubyArray();
        for (RubyValue v : array_) {
            if (other.include(v) && !a.include(v)) {
                a.add(v);
            }
        }
        return a;
    }

    public RubyArray or(RubyValue value) {
        RubyArray other = value.toAry();
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

