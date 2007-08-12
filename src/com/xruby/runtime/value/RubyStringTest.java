/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyValue;

import junit.framework.TestCase;

public class RubyStringTest extends TestCase {
    public void testStrip() {
        this.doTestStrip(" a ", "a");
        this.doTestStrip("  ", "");
    }

    private void doTestStrip(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyString result = receiver.strip();
        assertNotSame(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    public void testStripBang() {
        this.doTestStripBang(" a ", "a");
        this.doTestStripBang(" ", "");
        this.doTestStripBang("a");
        this.doTestStripBang("");
    }

    private void doTestStripBang(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.stripBang();
        assertEquals(result, receiver);
        assertEquals(resultStr, receiver.toString());
    }

    private void doTestStripBang(String receiverStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.stripBang();
        assertEquals(RubyConstant.QNIL, result);
        assertEquals(receiverStr, receiver.toString());
    }

    public void testCapitalize() {
        this.doTestCapitalize("hello", "Hello");
        this.doTestCapitalize("HELLO", "Hello");
        this.doTestCapitalize("123ABC", "123abc");
        this.doTestCapitalize("a", "A");
        this.doTestCapitalize("", "");
    }

    private void doTestCapitalize(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyString result = receiver.capitalize();
        assertNotSame(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    public void testCapitalizeBang() {
        this.doTestCapitalizeBang("hello", "Hello");
        this.doTestCapitalizeBang("");
    }

    private void doTestCapitalizeBang(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.capitalizeBang();
        assertEquals(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    private void doTestCapitalizeBang(String receiverStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.capitalizeBang();
        assertEquals(RubyConstant.QNIL, result);
        assertEquals(receiverStr, receiver.toString());
    }

    public void testUpcase() {
        this.doTestUpcase("hELLO", "HELLO");
        this.doTestUpcase("", "");
    }

    private void doTestUpcase(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyString result = receiver.upcase();
        assertNotSame(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    public void testUpcaseBang() {
        this.doTestUpcaseBang("hELLO", "HELLO");
        this.doTestUpcaseBang("");
    }

    private void doTestUpcaseBang(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.upcaseBang();
        assertEquals(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    private void doTestUpcaseBang(String receiverStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.upcaseBang();
        assertEquals(RubyConstant.QNIL, result);
        assertEquals(receiverStr, receiver.toString());
    }

    public void testDowncase() {
        this.doTestDowncase("hELLO", "hello");
        this.doTestDowncase("", "");
    }

    private void doTestDowncase(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyString result = receiver.downcase();
        assertNotSame(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    public void testDowncaseBang() {
        this.doTestDowncaseBang("hELLO", "hello");
        this.doTestDowncaseBang("");
    }

    private void doTestDowncaseBang(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.downcaseBang();
        assertEquals(receiver, result);
        assertEquals(resultStr, receiver.toString());
    }

    private void doTestDowncaseBang(String receiverStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.downcaseBang();
        assertEquals(RubyConstant.QNIL, result);
        assertEquals(receiverStr, receiver.toString());
    }

    public void testSwapCase() {
        this.doTestSwapCase("Hello", "hELLO");
        this.doTestSwapCase("", "");
    }

    private void doTestSwapCase(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyString result = receiver.swapcase();
        assertNotSame(receiver, result);
        assertEquals(resultStr, result.toString());
    }

    public void testSwapcaseBang() {
        this.doTestSwapcaseBang("hELLO", "Hello");
        this.doTestSwapcaseBang("");
        this.doTestSwapcaseBang("123");
    }

    private void doTestSwapcaseBang(String receiverStr, String resultStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.swapcaseBang();
        assertEquals(receiver, result);
        assertEquals(resultStr, receiver.toString());
    }

    private void doTestSwapcaseBang(String receiverStr) {
        RubyString receiver = ObjectFactory.createString(receiverStr);
        RubyValue result = receiver.swapcaseBang();
        assertEquals(RubyConstant.QNIL, result);
        assertEquals(receiverStr, receiver.toString());
    }

    public void testPlus() {
        RubyString receiver = ObjectFactory.createString("hello");
        RubyString other = receiver.plus(ObjectFactory.createString(" world"));
        assertEquals("hello world", other.toString());
    }

    public void testConcat() {
        RubyString receiver = ObjectFactory.createString("hello ");
        RubyString other = receiver.concat(ObjectFactory.createString("world"));
        assertEquals("hello world", other.toString());
        RubyString next = other.concat(ObjectFactory.createFixnum(33));
        assertEquals("hello world!", next.toString());
    }

    public void testFailToConcat() {
        RubyString receiver = ObjectFactory.createString("hello");

        try {
            receiver.concat(ObjectFactory.createFixnum(257));
        } catch (RubyException e) {
        }
    }

    public void test_equal() {
        RubyString a = new RubyString("xxx");
        RubyString b = new RubyString("xxx");
        RubyString c = new RubyString("yyy");
        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertTrue(!a.equals(c));
    }

    public void testToInt() {
        RubyString a = new RubyString("5");
        assertEquals(5, a.toInt());
    }

    public void test_chop() {
        RubyString x = new RubyString("x");
        x.chopBang();
        assertEquals("", x.toString());

        RubyString y = new RubyString("xyz");
        y.chopBang();
        assertEquals("xy", y.toString());

        RubyString z = new RubyString("xy\r\n");
        z.chopBang();
        assertEquals("xy", z.toString());
    }

    public void test_dump() {
        RubyString s = new RubyString("abc");
        assertEquals("\"abc\"", s.dump());

        s = new RubyString("123");
        assertEquals("\"123\"", s.dump());

        s = new RubyString("a\r\n");
        assertEquals("\"a\\r\\n\"", s.dump());
    }

    private RubyID upcaseID = RubyID.intern("upcase");
    private RubyID dangerousUpcaseID = RubyID.intern("upcase!");
    private RubyID downcaseID = RubyID.intern("downcase");
    private RubyID dangerousDowncaseID = RubyID.intern("downcase!");
    private RubyID capitalizeID = RubyID.intern("capitalize");

    public void test_to_i() {
        RubyValue str = ObjectFactory.createString("1234");
        RubyString value = (RubyString) str;
        assertEquals("1234", value.toString());
        RubyValue result = RubyAPI.callMethod(str, null, null, RubyID.toIID);
        RubyFixnum result_value = (RubyFixnum) result;
        assertEquals(1234, result_value.toInt());
    }

    public void test_to_f() {
        RubyValue str = ObjectFactory.createString("0.1234");
        RubyString value = (RubyString) str;
        assertEquals("0.1234", value.toString());
        RubyValue result = RubyAPI.callMethod(str, null, null, RubyID.toFID);
        RubyFloat result_value = (RubyFloat) result;
        assertEquals((double) 0.1234, result_value.doubleValue());
    }

    public void test_upcase() {
        RubyValue str = ObjectFactory.createString("abcDe");
        RubyString value = (RubyString) str;
        assertEquals(value.toString(), "abcDe");
        RubyValue result = RubyAPI.callMethod(str, null, null, upcaseID);
        assertTrue(result != str);
        assertEquals("abcDe", value.toString());
        RubyString result_value = (RubyString) result;
        assertEquals("ABCDE", result_value.toString());

        str = ObjectFactory.createString("abcDe");
        value = (RubyString) str;
        assertEquals(value.toString(), "abcDe");
        result = RubyAPI.callMethod(str, null, null, upcaseID);
        assertTrue(result != str);
        assertEquals("abcDe", value.toString());
        result_value = (RubyString) result;
        assertEquals("ABCDE", result_value.toString());
    }

    public void test_upcase_dangers() {
        RubyValue str = ObjectFactory.createString("abcDe");
        RubyString value = (RubyString) str;
        assertEquals("abcDe", value.toString());
        RubyValue result = RubyAPI.callMethod(str, null, null, dangerousUpcaseID);
        assertTrue(result == str);
        RubyString result_value = (RubyString) result;
        assertEquals("ABCDE", result_value.toString());

        str = ObjectFactory.createString("ABC");
        value = (RubyString) str;
        assertEquals("ABC", value.toString());
        result = RubyAPI.callMethod(str, null, null, dangerousUpcaseID);
        assertEquals("ABC", value.toString());
        assertEquals(ObjectFactory.NIL_VALUE, result);
    }

    public void test_downcase() {
        RubyValue str = ObjectFactory.createString("abcDe");
        RubyString value = (RubyString) str;
        assertEquals(value.toString(), "abcDe");
        RubyValue result = RubyAPI.callMethod(str, null, null, downcaseID);
        assertTrue(result != str);
        assertEquals("abcDe", value.toString());
        RubyString result_value = (RubyString) result;
        assertEquals("abcde", result_value.toString());

        str = ObjectFactory.createString("abcDe");
        value = (RubyString) str;
        assertEquals(value.toString(), "abcDe");
        result = RubyAPI.callMethod(str, null, null, downcaseID);
        assertTrue(result != str);
        assertEquals("abcDe", value.toString());
        result_value = (RubyString) result;
        assertEquals("abcde", result_value.toString());
    }

    public void test_downcase_dangers() {
        RubyValue str = ObjectFactory.createString("abcDe");
        RubyString value = (RubyString) str;
        assertEquals("abcDe", value.toString());
        RubyValue result = RubyAPI.callMethod(str, null, null, dangerousDowncaseID);
        assertTrue(result == str);
        RubyString result_value = (RubyString) result;
        assertEquals("abcde", result_value.toString());

        str = ObjectFactory.createString("abc");
        value = (RubyString) str;
        assertEquals("abc", value.toString());
        result = RubyAPI.callMethod(str, null, null, dangerousDowncaseID);
        assertEquals("abc", value.toString());
        assertEquals(ObjectFactory.NIL_VALUE, result);
    }

    public void test_capitalize() {
        RubyValue str = ObjectFactory.createString("abc");
        RubyValue result = RubyAPI.callMethod(str, null, null, capitalizeID);
        assertTrue(result != str);
        assertEquals("Abc", ((RubyString) result).toString());

        str = ObjectFactory.createString("HELLO");
        result = RubyAPI.callMethod(str, null, null, capitalizeID);
        assertTrue(result != str);
        assertEquals("Hello", ((RubyString) result).toString());

        str = ObjectFactory.createString("123ABC");
        result = RubyAPI.callMethod(str, null, null, capitalizeID);
        assertTrue(result != str);
        assertEquals("123abc", ((RubyString) result).toString());

        str = ObjectFactory.createString("Hello");
        result = RubyAPI.callMethod(str, null, null, capitalizeID);
        assertTrue(result != str);
        assertEquals("Hello", ((RubyString) result).toString());
    }

    private RubyID dangerousCapitalizeID = RubyID.intern("capitalize!");

    public void test_capitalize_danger() {

        RubyValue str = ObjectFactory.createString("abc");
        RubyValue result = RubyAPI.callMethod(str, null, null, dangerousCapitalizeID);
        assertTrue(result == str);
        assertEquals("Abc", ((RubyString) result).toString());

        str = ObjectFactory.createString("HELLO");
        result = RubyAPI.callMethod(str, null, null, dangerousCapitalizeID);
        assertTrue(result == str);
        assertEquals("Hello", ((RubyString) result).toString());

        str = ObjectFactory.createString("123ABC");
        result = RubyAPI.callMethod(str, null, null, dangerousCapitalizeID);
        assertTrue(result == str);
        assertEquals("123abc", ((RubyString) result).toString());

        str = ObjectFactory.createString("Hello");
        result = RubyAPI.callMethod(str, null, null, dangerousCapitalizeID);
        assertEquals(ObjectFactory.NIL_VALUE, result);
        assertEquals("Hello", ((RubyString) str).toString());
    }

    public void test_operator_compare() {
        RubyValue str1 = ObjectFactory.createString("abc");
        RubyValue str2 = ObjectFactory.createString("abd");
        RubyValue result = RubyAPI.callOneArgMethod(str1, str2, null, RubyID.unequalID);
        assertEquals(result, ObjectFactory.FIXNUM_NEGATIVE_ONE);

        str2 = ObjectFactory.createString("abb");
        result = RubyAPI.callOneArgMethod(str1, str2, null, RubyID.unequalID);
        assertEquals(result, ObjectFactory.FIXNUM1);

        str2 = ObjectFactory.createString("abc");
        result = RubyAPI.callOneArgMethod(str1, str2, null, RubyID.unequalID);
        assertEquals(result, ObjectFactory.FIXNUM0);

        str2 = ObjectFactory.createString("a");
        result = RubyAPI.callOneArgMethod(str1, str2, null, RubyID.unequalID);
        assertEquals(result, ObjectFactory.FIXNUM1);

        str2 = ObjectFactory.createString("b");
        result = RubyAPI.callOneArgMethod(str1, str2, null, RubyID.unequalID);
        assertEquals(result, ObjectFactory.FIXNUM_NEGATIVE_ONE);

        result = RubyAPI.callOneArgMethod(str1, ObjectFactory.FIXNUM1, null, RubyID.unequalID);
        assertTrue(result == ObjectFactory.NIL_VALUE);
    }
}
