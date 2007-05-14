/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.*;

class ArrayPacker {
    private static String uv_to_utf8(char[] str) {
        throw new RubyException("Not implemented");
    }

    private static String qpencode(String str, int len) {
        throw new RubyException("Not implemented");
    }

    private static String encodes(String str, int todo, char type) {
        throw new RubyException("Not implemented");
    }

    public static RubyArray unpack(String str, String format) {
        int len;
        int star;
        int s = 0;
        char type;
        final int send = str.length();

        RubyArray ary = new RubyArray();

        int p = 0;
        while (p < format.length()) {
            type = format.charAt(p++);

            if (type == ' ') continue;

            if (format.indexOf(p) == '#') {
                while (p < format.length() && format.charAt(p) != '\n') {
                    p++;
                }
                continue;
            }

            char t;
            if (p >= format.length())
                t = 0;
            else
                t = format.charAt(p);

            star = 0;
            if (t == '_' || t == '!') {
                final String natstr = "sSiIlL";
                if (natstr.indexOf(type) >= 0) {
                    p++;
                } else {
                    throw new RubyException(RubyRuntime.ArgumentErrorClass, String.format("'%c' allowed only after types %s", type, natstr));
                }
            }

            if (p > format.length()) {
                len = 1;
            } else if (t == '*') {
                star = 1;
                len = send - s;
                p++;
            } else if (Character.isDigit(t)) {
                int end = p;
                while (end < format.length() - 1 && Character.isDigit(format.indexOf(end + 1))) {
                    end++;
                }
                len = Integer.parseInt(format.substring(p, end + 1), 10);
            } else {
                len = (type != '@') ? 1 : 0;
            }

            switch (type) {
                case'%':
                    throw new RubyException(RubyRuntime.ArgumentErrorClass, "%% is not supported");

                case'a':
                    if (len > send - s) len = send - s;
                    ary.add(ObjectFactory.createString(str.substring(s, s + len)));
                    s += len;
                    break;

                case'c':
                    while (len-- > 0) {
                        int c = str.charAt(s++);
                        if (c > 127)
                            c -= 256;
                        ary.add(ObjectFactory.createFixnum(c));
                    }
                    break;

                case'C':
                    while (len-- > 0) {
                        char c = str.charAt(s++);
                        ary.add(ObjectFactory.createFixnum(c));
                    }
                    break;

                case's':
                    while (len-- > 0) {
                        short tmp = 0;
                        for (int j = 0; j < Short.SIZE / Byte.SIZE; ++j) {
                            char c = str.charAt(s++);
                            tmp += (c << (j * 8));
                        }
                        ary.add(ObjectFactory.createFixnum(tmp));
                    }

                    break;

                case'i':
                case'l':
                    while (len-- > 0) {
                        int tmp = 0;
                        for (int j = 0; j < Integer.SIZE / Byte.SIZE; ++j) {
                            char c = str.charAt(s++);
                            tmp += (c << (j * 8));
                        }
                        ary.add(ObjectFactory.createFixnum(tmp));
                    }

                    break;

                case'q':
                    if (str.length() < Long.SIZE / Byte.SIZE) {
                        ary.add(ObjectFactory.NIL_VALUE);
                    } else {
                        long l = 0;
                        for (int j = 0; j < Long.SIZE / Byte.SIZE; ++j) {
                            long c = str.charAt(s++);
                            l += (c << (j * 8));
                        }
                        ary.add(ObjectFactory.createFixnum((int) l));
                    }
                    break;

                case'x':
                    if (len > send - s)
                        throw new RubyException(RubyRuntime.ArgumentErrorClass, "x outside of string");
                    s += len;
                    break;

                case'D':
                case'd':
                    while (len-- > 0) {
                        long tmp = 0;
                        for (int j = 0; j < Long.SIZE / Byte.SIZE; ++j) {
                            long c = str.charAt(s++);
                            tmp += (c << (j * 8));
                        }
                        ary.add(ObjectFactory.createFloat(Double.longBitsToDouble(tmp)));
                    }
                    break;

                default:
                    break;
            }
        }

        return ary;
    }

    public static StringBuilder pack(RubyArray array, String format) {
        int len = 0;
        int items = array.size();
        int idx = 0;
        int plen;
        String ptr;
        RubyValue from;

        StringBuilder result = new StringBuilder();

        int p = 0;
        while (p < format.length()) {
            char type = format.charAt(p++);

            if (type == ' ') continue;

            if (format.indexOf(p) == '#') {
                while (p < format.length() && format.charAt(p) != '\n') {
                    p++;
                }
                continue;
            }

            char t;
            if (p >= format.length())
                t = 0;
            else
                t = format.charAt(p);

            if (t == '_' || t == '!') {
                final String natstr = "sSiIlL";
                if (natstr.indexOf(type) >= 0) {
                    p++;
                } else {
                    throw new RubyException(RubyRuntime.ArgumentErrorClass, String.format("'%c' allowed only after types %s", type, natstr));
                }
            }

            if (t == '*') {
                len = "@Xxu".indexOf(t) >= 0 ? 0 : items;
                p++;
            } else if (Character.isDigit(t)) {
                int end = p;
                while (end < format.length() - 1 && Character.isDigit(format.indexOf(end + 1))) {
                    end++;
                }
                len = Integer.parseInt(format.substring(p, end + 1), 10);
            } else {
                len = 1;
            }

            switch (type) {
                case'A':
                case'a':
                case'Z':
                case'B':
                case'b':
                case'H':
                case'h':
                    if (items-- > 0)
                        from = array.get(idx++);
                    else
                        throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                    if (from == ObjectFactory.NIL_VALUE) {
                        ptr = "";
                        plen = 0;
                    } else {
                        ptr = ((RubyString) from).toString();
                        plen = ptr.length();
                    }

                    if (format.charAt(p - 1) == '*') {
                        len = plen;
                    }

                    switch (type) {
                        case'a':
                        case'A':
                        case'Z': {
                            if (plen >= len) {
                                result.append(ptr.substring(0, len));
                                if (format.charAt(p - 1) == '*' && type == 'Z')
                                    result.append('\0');
                            } else {
                                result.append(ptr.substring(0, plen));
                                len -= plen;
                                while (len-- > 0) {
                                    result.append(' ');
                                }
                            }
                        }
                        break;

                        case'b': {
                            int byte_ = 0;
                            int i, j = 0;

                            if (len > plen) {
                                j = (len - plen + 1) / 2;
                                len = plen;
                            }

                            int pos1 = 0;
                            for (i = 0; i++ < len; pos1++) {
                                if ((ptr.charAt(pos1) & 1) != 0) {
                                    byte_ |= 128;
                                }

                                if ((i & 7) != 0) {
                                    byte_ >>= 1;
                                } else {
                                    char c = (char) (byte_ & 0xff);
                                    result.append(c);
                                    byte_ = 0;
                                }

                                if ((len & 7) != 0) {
                                    char c;
                                    byte_ >>= 7 - (len & 7);
                                    c = (char) (byte_ & 0xff);
                                    result.append(c);
                                }
                                len = j;
                                while (len-- > 0) {
                                    result.append('\0');
                                }
                            }
                        }
                        break;

                        case'B': {
                            int byte_ = 0;
                            int i, j = 0;

                            if (len > plen) {
                                j = (len - plen + 1) / 2;
                                len = plen;
                            }

                            int pos1 = 0;
                            for (i = 0; i++ < len; pos1++) {
                                byte_ |= (ptr.charAt(pos1) & 1);
                                if ((i & 7) != 0)
                                    byte_ <<= 1;
                                else {
                                    char c = (char) (byte_ & 0xff);
                                    result.append(c);
                                    byte_ = 0;
                                }
                            }

                            if ((len & 7) != 0) {
                                char c;
                                byte_ <<= 7 - (len & 7);
                                c = (char) (byte_ & 0xff);
                                result.append(c);
                            }

                            len = j;
                            while (len-- > 0) {
                                result.append('\0');
                            }
                        }
                        break;

                        case'h': {
                            int byte_ = 0;
                            int i, j = 0;
                            if (len > plen) {
                                j = (len - plen + 1) / 2;
                                len = plen;
                            }

                            int pos1 = 0;
                            for (i = 0; i++ < len; pos1++) {
                                if (Character.isLetter(ptr.charAt(pos1))) {
                                    byte_ |= (((ptr.charAt(pos1) & 15) + 9) & 15) << 4;
                                } else {
                                    byte_ |= (ptr.charAt(pos1) & 15) << 4;
                                }

                                if ((i & 1) != 0) {
                                    byte_ >>= 4;
                                } else {
                                    char c = (char) (byte_ & 0xff);
                                    result.append(c);
                                    byte_ = 0;
                                }
                            }

                            if ((len & 1) != 0) {
                                char c = (char) (byte_ & 0xff);
                                result.append(c);
                            }

                            len = j;
                            while (len-- > 0) {
                                result.append('\0');
                            }
                        }
                        break;

                        case'H': {
                            int byte_ = 0;
                            int i, j = 0;

                            if (len > plen) {
                                j = (len - plen + 1) / 2;
                                len = plen;
                            }

                            int pos1 = 0;
                            for (i = 0; i++ < len; pos1++) {
                                if (Character.isLetter(ptr.charAt(pos1))) {
                                    byte_ |= ((ptr.charAt(pos1) & 15) + 9) & 15;
                                } else {
                                    byte_ |= ptr.charAt(pos1) & 15;
                                }

                                if ((i & 1) != 0) {
                                    byte_ <<= 4;
                                } else {
                                    char c = (char) (byte_ & 0xff);
                                    result.append(c);
                                    byte_ = 0;
                                }
                            }

                            if ((len & 1) != 0) {
                                char c = (char) (byte_ & 0xff);
                                result.append(c);
                            }

                            len = j;
                            while (len-- > 0) {
                                result.append('\0');
                            }
                        }
                        break;
                    }
                    break;

                case'c':
                case'C':
                    while (len-- > 0) {
                        if (items-- > 0)
                            from = array.get(idx++);
                        else
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                        int i = RubyTypesUtil.convertToJavaInt(from);
                        result.append((char) (i & 0xff));
                    }
                    break;

                case's':
                case'S':
                    while (len-- > 0) {


                        if (items-- > 0)
                            from = array.get(idx++);
                        else
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                        int i = RubyTypesUtil.convertToJavaInt(from);
                        for (int j = 0; j < Short.SIZE / Byte.SIZE; ++j) {
                            result.append((char) ((i >> (j * 8) & 0xff)));
                        }
                    }
                    break;

                case'i':
                case'I':
                case'l':
                case'L':
                    while (len-- > 0) {
                        if (items-- > 0)
                            from = array.get(idx++);
                        else
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                        int i = RubyTypesUtil.convertToJavaInt(from);
                        for (int j = 0; j < Integer.SIZE / Byte.SIZE; ++j) {
                            result.append((char) ((i >> (j * 8) & 0xff)));
                        }
                    }
                    break;

                case'q':
                case'Q':
                    while (len-- > 0) {
                        if (items-- > 0)
                            from = array.get(idx++);
                        else
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                        long l = RubyTypesUtil.convertToJavaLong(from);

                        for (int i = 0; i < Long.SIZE / Byte.SIZE; ++i) {
                            result.append((char) ((l >> (i * 8) & 0xff)));
                        }
                    }
                    break;

                case'n': // short (network byte-order)
                    break;

                case'N': // int (network byte-order)
                    break;

                case'v': // short (VAX byte-order)
                    break;

                case'V': // long (VAX byte-order)
                    break;

                case'f':
                case'F':
                    while (len-- > 0) {
                        float f;

                        if (items-- > 0)
                            from = array.get(idx++);
                        else
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                        if (from instanceof RubyFixnum) {
                            f = (long) (((RubyFixnum) from).intValue() & 0xffffffff);
                        } else if (from instanceof RubyFloat) {
                            f = ((long) ((RubyFloat) from).doubleValue() & 0xffffffffffffffffL);
                        } else if (from instanceof RubyBignum) {
                            f = (((RubyBignum) from).getInternal().longValue() & 0xffffffffffffffffL);
                        } else {
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, String.format("can't convert %s into Integer", from.getRubyClass().getName()));
                        }

                        int bits = Float.floatToIntBits(f);
                        for (int i = 0; i < Integer.SIZE / Byte.SIZE; ++i) {
                            result.append((char) ((bits >> (i * 8) & 0xff)));
                        }
                    }
                    break;

                case'e': // single precision float in VAX byte-order
                    break;

                case'E': // double precision float in VAX byte-order
                    break;

                case'd':
                case'D':
                    while (len-- > 0) {
                        if (items-- > 0)
                            from = array.get(idx++);
                        else
                            throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few for type " + type); // #TODO: message

                        double d = RubyTypesUtil.convertToJavaDouble(from);

                        long bits = Double.doubleToLongBits(d);

                        for (int i = 0; i < Long.SIZE / Byte.SIZE; ++i) {
                            result.append((char) ((bits >> (i * 8) & 0xff)));
                        }
                    }
                    break;

                case'g': // single precision float in network byte-order
                    break;

                case'G': // double precision float in network byte-order
                    break;

                case'x': // null byte
                    while (len-- > 0) {
                        result.append('\0');
                    }
                    break;

                case'X': // back up byte
                    plen = result.length();
                    if (plen < len) {
                        throw new RubyException(RubyRuntime.ArgumentErrorClass, "X outside of string");
                    }
                    result.delete(plen - len, plen);
                    break;

                case'@':
                    len -= result.length();
                    if (len > 0) {
                        while (len-- > 0) {
                            result.append('\0');
                        }
                    }

                    len = -len;
                    if (len > 0) {
                        plen = result.length();
                        if (plen < len) {
                            throw new RubyException(RubyRuntime.ArgumentErrorClass, "X outside of string");
                        }
                        result.delete(plen - len, plen);
                    }
                    break;

                case'%':
                    throw new RubyException(RubyRuntime.ArgumentErrorClass, "% is not supported");

                case'U':
                    while (len-- > 0) {
                        char[] buf = new char[8];

                        from = array.get(idx++);
                        int l = RubyTypesUtil.convertToJavaInt(from);
                        if (l < 0) {
                            throw new RubyException(RubyRuntime.RangeErrorClass, "pack(U): value (" + from + ") out of range");
                        }
                        result.append(uv_to_utf8(buf));
                    }
                    break;

                case'u': // uuencoded string
                case'm': // base64 encoded string
                    from = array.get(idx++);
                    ptr = from.toString();
                    plen = ptr.length();

                    if (len <= 2) {
                        len = 45;
                    } else {
                        len = len / 3 * 3;
                    }

                    while (plen > 0) {
                        int todo;
                        if (plen > len) {
                            todo = len;
                        } else {
                            todo = plen;
                        }

                        result.append(encodes(ptr, todo, type));
                        plen -= todo;
                        ptr += todo;
                    }
                    break;

                case'M': // quoted-printable encoded string
                {
                    String str = ((RubyString) array.get(idx++)).toString();
                    if (len <= 1) {
                        len = 72;
                    }

                    result.append(qpencode(str, len));
                }
                break;

                case'P': // pointer to packed byte string
                case'p': // pointer to string
                    throw new RubyException("Not implemented");

                case'w': // BER compressed integer
                    break;

                default:
                    break;
            }
        }

        return result;
    }
}
