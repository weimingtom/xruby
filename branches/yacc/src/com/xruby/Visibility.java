package com.xruby;

import java.io.Serializable;

/**
 * This class represents two concepts: method visibility and a mask for
 * determining a set of valid method visibilities.  The first concept can only
 * be a single value: PUBLIC, PRIVATE, PROTECTED, and MODULE_FUNCTION (see
 * RubyModule#module_function).  It is used to adorn a method with a _SINGLE_
 * visibility.  Some functions (see RubyModule#instance_methods) want to be
 * able to see methods of multiple visibilities.  The second concept allows
 * making a vibility which is basically a mask (see
 * Visibility.PUBLIC_PROTECTED).  The method 'is' can then be used to see if a
 * method visibility is in the mask.
 *
 * @author jpetersen
 */
public final class Visibility implements Serializable {
	private static final short PUBLIC_VALUE = (short) 1;
	private static final short PROTECTED_VALUE = (short) 2;
	private static final short PRIVATE_VALUE = (short) 4;
	private static final short MODULE_FUNCTION_VALUE = (short) 8;
    public static final Visibility PUBLIC = new Visibility(PUBLIC_VALUE);
    public static final Visibility PROTECTED = new Visibility(PROTECTED_VALUE);
    public static final Visibility PRIVATE = new Visibility(PRIVATE_VALUE);
    public static final Visibility MODULE_FUNCTION = new Visibility(MODULE_FUNCTION_VALUE);
    public static final Visibility PUBLIC_PROTECTED =
    	new Visibility((short) (PUBLIC_VALUE | PROTECTED_VALUE));

    private final short restore;

    static final long serialVersionUID = 2002102900L;

    /**
     * Constructor for MethodScope.
     */
    private Visibility(short restore) {
        this.restore = restore;
    }

    public boolean isPublic() {
        return (restore & PUBLIC_VALUE) != 0;
    }

    public boolean isProtected() {
        return (restore & PROTECTED_VALUE) != 0;
    }

    public boolean isPrivate() {
        return (restore & PRIVATE_VALUE) != 0;
    }

    public boolean isModuleFunction() {
        return (restore & MODULE_FUNCTION_VALUE) != 0;
    }

    public boolean is(Visibility other) {
    	return (restore & other.restore) != 0;
    }

    public String toString() {
    	// XXXEnebo: will only print out actual visibilities
    	// and not masks
        switch (restore) {
            case 1:
                return "public";
            case 2:
                return "protected";
            case 4:
                return "private";
            case 8:
                return "module_function";
            default:
                return "mixed mask: " + restore;
        }
    }
}
