/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.math.BigInteger;
import java.util.ArrayList;

public class IntegerExpression extends Expression {
    private BigInteger value_;
    private static final BigInteger FIXNUM_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger FIXNUM_MIN = BigInteger.valueOf(Integer.MIN_VALUE);

    public IntegerExpression(BigInteger value) {
        value_ = value;
    }

    public IntegerExpression(int value) {
        value_ = BigInteger.valueOf(value);
    }

    public IntegerExpression(String value, int radix) {
        try {
            value_ = new BigInteger(value, radix);
        } catch (NumberFormatException e) {
            throw e; //todo
            //throw new RecognitionException(e.toString());
        }
    }

    //for v3
    //todo: optimize later: for fixnum, just hold int value directly
    //only hold BigInteger for Bignum.
    public static IntegerExpression parseIntegerExpression(String text) {
        text = text.replaceAll("_", "");
        int index = 0;
        boolean negate = false;
        if (text.startsWith("-")) {
            negate = true;
            index += 1;
        }
        BigInteger value = null;
        if (text.length() == index + 1) { //just one digit, convert directly
            value = new BigInteger(text.substring(index));
        } else if (text.startsWith("0b", index)) { //BINARY
            value = new BigInteger(text.substring(index + 2), 2);
        } else if (text.startsWith("0x", index)) { //HEX
            value = new BigInteger(text.substring(index + 2), 16);
        } else if (text.startsWith("0d", index)) { //DECIMAL
            value = new BigInteger(text.substring(index + 2), 10);
        } else if (text.startsWith("0", index)) { //OCTAL
            value = new BigInteger(text, 8);
        } else if (text.startsWith("?", index)) {  //todo : consider ?a, ?\M-c etc.
            boolean meta_escape = false;
            boolean control_escape = false;
            if (text.indexOf("\\M-", index) > -1) {
                text = text.replaceAll("\\\\M-", "");
                meta_escape = true;
            }
            if (text.indexOf("\\C-", index) > -1) {
                text = text.replaceAll("\\\\C-", "");
                control_escape = true;
            }
            if (text.indexOf("\\c", index) > -1) {
                text = text.replaceAll("\\\\c", "");
                control_escape = true;
            }
            int asciiValue = 0;
            asciiValue = read_value(text, index);
            if (control_escape) {
                asciiValue = asciiValue & 0x9f;
            }
            if (meta_escape) {
                asciiValue = asciiValue | 0x80;
            }
            value = new BigInteger(String.valueOf(asciiValue));
        } else {
            value = new BigInteger(text, 10);
        }
        if (negate) {
            value = value.negate();
        }
        return new IntegerExpression(value);
    }

    private static int read_value(String text, int index) {
        int asciiValue;
        if (text.charAt(index + 1) == '\\') {
            switch (text.charAt(index + 2)) {
                case 'n':
                    asciiValue = '\n';
                    break;
                case 'r':
                    asciiValue = '\r';
                    break;
                case '\\': // backslash
                    asciiValue = '\\';
                    break;
                case 't': // horizontal tab
                    asciiValue = '\t';
                    break;
                case 'f': // form feed
                    asciiValue = '\f';
                    break;
                case 'v': // vertical tab
                    asciiValue = '\u0013';
                    break;
                case 'a': // alarm(bell)
                    asciiValue = '\u0007';
                    break;
                case 'e': // escape
                    asciiValue = '\u0033';
                    break;
                case 'b': // backspace
                    asciiValue = '\010';
                    break;
                case 's': // space
                    asciiValue = ' ';
                    break;
                case '0':
                case '1':
                case '2':
                case '3': // octal constant
                case '4':
                case '5':
                case '6':
                case '7':
                    asciiValue = Integer.parseInt(text.substring(index + 2), 8);
                    if (asciiValue > 255) {
                        asciiValue = 255;
                    }
                    break;
                case 'x':
                    asciiValue = Integer.parseInt(text.substring(index + 3), 16);
                    break;
                default:
                    asciiValue = text.charAt(index + 2);
                    break;

            }
        } else {
            asciiValue = text.charAt(index + 1);
        }
        return asciiValue;
    }

    public void accept(CodeVisitor visitor) {
        if (value_.compareTo(FIXNUM_MIN) >= 0 && value_.compareTo(FIXNUM_MAX) <= 0) {
            visitor.visitFixnumExpression(value_.intValue());
        } else {
            visitor.visitBignumExpression(value_);
        }
    }

    public void getFrequentlyUsedIntegers(ArrayList<Integer> result) {
        if (value_.compareTo(FIXNUM_MIN) >= 0 && value_.compareTo(FIXNUM_MAX) <= 0) {
            result.add(value_.intValue());
        }
    }
}
