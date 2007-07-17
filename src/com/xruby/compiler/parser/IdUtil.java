package com.xruby.compiler.parser;

public final class IdUtil {
    public static final int CONSTANT = 0;
    public static final int INSTANCE_VAR = 1;
    public static final int CLASS_VAR = 2;
    public static final int GLOBAL_VAR = 4;
    public static final int LOCAL_VAR = 8;

    /**
     * Get type of variable based on Ruby naming conventions.  This is useful when you know
     * you are going to want to know what type it is.  It should in theory be cheaper than
     * calling all the isFoo methods seperately.  It also should be faster than isLocal.
     *
     * @param id the name to determine its type from
     * @return value representing the type.
     */
    public static int getVarType(String id) {
        char c = id.charAt(0);

        switch (c) {
        case '@':
            return id.charAt(1) == '@' ? CLASS_VAR : INSTANCE_VAR;
        case '$':
            return GLOBAL_VAR;
        }

        return Character.isUpperCase(c) ? CONSTANT : LOCAL_VAR;
    }

    /**
     * rb_is_const_id and is_const_id
     */
	public static boolean isConstant(String id) {
	    return Character.isUpperCase(id.charAt(0));
    }

    /**
     * rb_is_class_id and is_class_id
     */
	public static boolean isClassVariable(String id) {
	    return id.length()>1 && id.charAt(0) == '@' && id.charAt(1) == '@';
    }

    /**
     * rb_is_instance_id and is_instance_id
     */
	public static boolean isInstanceVariable(String id) {
	    return id.length()>0 && id.charAt(0) == '@' && (id.length() < 2 || id.charAt(1) != '@');
    }

    /**
     * rb_is_global_id and is_global_id
     */
    public static boolean isGlobal(String id) {
        return id.length()>0 && id.charAt(0) == '$';
    }

    /**
     * rb_is_local_id and is_local_id
     */
	public static boolean isLocal(String id) {
	    return !isGlobal(id) && !isClassVariable(id) && !isInstanceVariable(id) && !isConstant(id);
    }

	public static boolean isAttrSet(String id) {
	    return id.endsWith("=");
	}
}
