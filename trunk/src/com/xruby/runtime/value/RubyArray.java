/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RubyLevelClass(name="Array", modules="Enumerable")
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

    public RubyArray toAry() {
        return this;
    }

    @RubyLevelMethod(name="to_s")
    public RubyValue to_s() {
        RubyString r = ObjectFactory.createString();

        for (RubyValue v : array_) {
            r.appendString(v);

            // TODO: The output of to_s is not as the same as cruby, we should solve this issue
            // TODO: and change the corresponding testcases in RubyCompilerTest, such as test_array_expand.
        }

        return r;
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

    @RubyLevelMethod(name="length")
    public RubyFixnum length() {
        return ObjectFactory.createFixnum(this.array_.size());
    }

    @RubyLevelMethod(name="clear")
    public RubyArray clear() {
        array_.clear();
        return this;
    }

    public RubyValue aref(RubyValue arg) {
        if (arg instanceof RubyFixnum) {
            return this.get(arg.toInt());
        }

        if (arg instanceof RubySymbol) {
            throw new RubyException(RubyRuntime.TypeErrorClass, "Symbol as array index");
        }

        if (arg instanceof RubyRange) {
            RubyRange range = (RubyRange)arg;
            int begin = range.getLeft().toInt();
            int end = range.getRight().toInt();
            if (begin < 0) {
                begin = this.size() + begin;
            }
            if (end < 0) {
                end = this.size() + end;
            }

            if (!range.isExcludeEnd()) {
                ++end;
            }

            RubyArray resultValue = this.subarray(begin, end - begin);
            return (null == resultValue ? ObjectFactory.NIL_VALUE : resultValue);
        }

        return this.get(arg.toInt());
    }

    public RubyValue aref(RubyValue begin, RubyValue length) {
        if (begin instanceof RubySymbol) {
            throw new RubyException(RubyRuntime.TypeErrorClass, "Symbol as array index");
        }

        RubyArray resultValue = this.subarray(begin.toInt(), length.toInt());
        return (null == resultValue ? ObjectFactory.NIL_VALUE : resultValue);
    }

    @RubyLevelMethod(name="insert")
    public RubyArray insert(RubyArray ary) {
        int argc = ary.size();
        if (argc == 1) {
            return this;
        }

        if (argc < 1) {
            throw new RubyException(RubyRuntime.ArgumentErrorClass,  "wrong number of arguments (at least 1)");
        }

        int pos = ary.get(0).toInt();
        if (pos < 0) {
            pos += this.array_.size() + 1;
        }

        return this.insert(pos, ary.subarray(1, ary.size() - 1));
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

    @RubyLevelMethod(name="at")
    public RubyValue at(RubyValue value) {
        return this.get(value.toInt());
    }

    @RubyLevelMethod(name="<<")
    public RubyArray push(RubyValue v) {
        this.array_.add(v);
        return this;
    }

    @RubyLevelMethod(name="push")
    public RubyArray multiPush(RubyArray args) {
        if (null != args) {
            for (RubyValue v : args) {
                this.array_.add(v);
            }
        }
        return this;
    }

    @RubyLevelMethod(name="pop")
    public RubyValue pop() {
        int size = this.array_.size();
        if (0 == size) {
            return ObjectFactory.NIL_VALUE;
        }
        return this.array_.remove(size - 1);
    }

    @RubyLevelMethod(name="delete_at")
    public RubyValue deleteAt(RubyValue v) {
        return this.delete_at(v.toInt());
    }

    @RubyLevelMethod(name="shift")
    public RubyValue shift() {
        return this.delete_at(0);
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

    @RubyLevelMethod(name="delete_if")
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

    @RubyLevelMethod(name="delete")
    public RubyValue delete(RubyValue item, RubyBlock block) {
        boolean found = false;
        while (array_.remove(item)) {
            found = true;
        }

        if (block != null && !found) {
            return block.invoke(item);
        } else {
            return found ? item : RubyConstant.QNIL;
        }
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

    public RubyValue compare(RubyValue v) {
        return this.compare(v.toAry());
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
            return ObjectFactory.FIXNUM_NEGATIVE_ONE;
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

    @RubyLevelMethod(name="==", alias="eql?")
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

    @RubyLevelMethod(name="concat")
    public RubyArray concat(RubyValue v) {
        RubyArray ary = v.toAry();
        array_.addAll(ary.array_);
        return this;
    }

    @RubyLevelMethod(name="+")
    public RubyArray plus(RubyValue v) {
        return this.plus(v.toAry());
    }

    private RubyArray plus(RubyArray v) {
        int size = array_.size() + v.size();
        RubyArray resultArray = new RubyArray(size);
        resultArray.array_.addAll(array_);
        resultArray.array_.addAll(v.array_);
        return resultArray;
    }

    @RubyLevelMethod(name="-")
    public RubyArray minus(RubyValue v) {
        return this.minus(v.toAry());
    }

    private RubyArray minus(RubyArray other) {
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

    @RubyLevelMethod(name="each")
    public RubyValue each(RubyBlock block) {
        for (RubyValue item : array_) {
            RubyValue v = block.invoke(this, item);
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }

    @RubyLevelMethod(name="each_index")
    public RubyValue each_index(RubyBlock block) {
        for (int i=0;i<size();i++) {
            RubyValue v = block.invoke(this, new RubyFixnum(i));
            if (block.breakedOrReturned()) {
                return v;
            }
        }
        return this;
    }

    @RubyLevelMethod(name="reverse_each")
    public RubyValue reverse_each(RubyBlock block) {
        ListIterator<RubyValue> ite = array_.listIterator(array_.size());
        while (ite.hasPrevious()) {
            RubyValue v = block.invoke(this, ite.previous());
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
                return ((RubyFixnum) v).toInt();
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
                return ((RubyFixnum) v).toInt();
            }
        }
        );
    }

    public int hash() {
        return array_.hashCode();
    }

    @RubyLevelMethod(name="&")
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

    @RubyLevelMethod(name="|")
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

    @RubyLevelMethod(name="reverse")
    public RubyArray reverse() {
        RubyArray array = this.copy();
        Collections.reverse(array.array_);
        return array;
    }

    @RubyLevelMethod(name="reverse!")
    public RubyArray reverseBang() {
        Collections.reverse(array_);
        return this;
    }
}

