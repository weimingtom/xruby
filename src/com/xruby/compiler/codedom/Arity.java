package com.xruby.compiler.codedom;

import java.util.HashMap;
import java.util.Map;

/**
 * User: user
 * Date: 2007-7-28
 */
public class Arity {

    private static final long serialVersionUID = 1L;
    private static final Map arities = new HashMap();
    private final int value;

    public final static Arity NO_ARGUMENTS = newArity(0);
    public final static Arity ONE_ARGUMENT = newArity(1);
    public final static Arity TWO_ARGUMENTS = newArity(2);
    public final static Arity THREE_ARGUMENTS = newArity(3);
    public final static Arity OPTIONAL = newArity(-1);
    public final static Arity ONE_REQUIRED = newArity(-2);
    public final static Arity TWO_REQUIRED = newArity(-3);
    public final static Arity THREE_REQUIRED = newArity(-3);

    private Arity(int value) {
        this.value = value;
    }

    private static Arity newArity(int value) {
        Integer integerValue = new Integer(value);
        Arity result;
        synchronized (arities) {
            result = (Arity) arities.get(integerValue);
            if (result == null) {
                result = new Arity(value);
                arities.put(integerValue, result);
            }
        }
        return result;
    }

    public static Arity createArity(int value) {
        switch (value) {
        case -4:
            return THREE_REQUIRED;
        case -3:
            return TWO_REQUIRED;
        case -2:
            return ONE_REQUIRED;
        case -1:
            return OPTIONAL;
        case 0:
            return NO_ARGUMENTS;
        case 1:
            return ONE_ARGUMENT;
        case 2:
            return TWO_ARGUMENTS;
        case 3:
            return THREE_ARGUMENTS;
        }
        return newArity(value);
    }

    public static Arity fixed(int arity) {
        assert arity >= 0;
        return createArity(arity);
    }

    public static Arity required(int minimum) {
        assert minimum >= 0;
        return createArity(-(1 + minimum));
    }

    public static Arity noArguments() {
        return NO_ARGUMENTS;
    }

    public static Arity singleArgument() {
        return ONE_ARGUMENT;
    }

    public static Arity twoArguments() {
        return TWO_ARGUMENTS;
    }
    //todo: add others in jruby, but we just need the Arity class as a placeholder here, don't we?
}
