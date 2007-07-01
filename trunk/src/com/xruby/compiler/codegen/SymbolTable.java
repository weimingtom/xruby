/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import org.objectweb.asm.Label;

import java.util.*;

class SymbolTable {
    private final Map<String, Integer> local_variables_ = new HashMap<String, Integer>();
    private final Map<String, Label> localVariableRange = new HashMap<String, Label>();
    private final List<String> declarationSeq = new ArrayList<String>();
    private final ArrayList<String> method_parameters_;
    private final Map<String, Integer> asterisk_or_block_method_parameter_ = new HashMap<String, Integer>();

    private static final String NAME_FOR_INTERNAL_BLOCK_VAR = "block$";
    static final String NAME_FOR_INTERNAL_BINDING_VAR = "binding$";
    static final String NAME_FOR_INTERNAL_TMP_VAR = "tmp$";

    // SymbolTable may have preloaded values (eval, commandline etc)
    public SymbolTable(ArrayList<String> binging) {
        if (null == binging) {
            method_parameters_ = new ArrayList<String>();
        } else {
            method_parameters_ = binging;
        }
    }

    public void setInternalBlockVar(int i) {
        addLocalVariable(NAME_FOR_INTERNAL_BLOCK_VAR, i);
    }

    public int getInternalBlockVar() {
        return getLocalVariable(NAME_FOR_INTERNAL_BLOCK_VAR);
    }

    public void setInternalBindingVar(int i) {
        addLocalVariable(NAME_FOR_INTERNAL_BINDING_VAR, i);
    }

    public int getInternalBindingVar() {
        return getLocalVariable(NAME_FOR_INTERNAL_BINDING_VAR);
    }

    public Collection<String> getLocalVariables() {
        Collection<String> r = local_variables_.keySet();
        r.remove(NAME_FOR_INTERNAL_BLOCK_VAR);
        r.remove(NAME_FOR_INTERNAL_BINDING_VAR);
        r.remove(NAME_FOR_INTERNAL_TMP_VAR);
        return r;
    }

    public Collection<String> getParameters() {
        return method_parameters_;
    }

    public void addLocalVariable(String name, int i) {
        local_variables_.put(name, i);
        localVariableRange.put(name, null);
    }

    public void addAsteriskOrBlockMethodParameter(String name, int i) {
        asterisk_or_block_method_parameter_.put(name, i);
    }

    public int getLocalVariable(String name) {
        Integer i = local_variables_.get(name);
        if (null == i) {
            return -1;
        } else {
            return i.intValue();
        }
    }

    public int getAsteriskOrBlockMethodParameter(String name) {
        Integer i = asterisk_or_block_method_parameter_.get(name);
        if (null == i) {
            return -1;
        } else {
            return i.intValue();
        }
    }

    public void addMethodParameter(String name) {
        method_parameters_.add(name);
    }

    public int getMethodParameter(String name) {
        return method_parameters_.indexOf(name);
    }

    public boolean isDefinedInCurrentScope(String name) {
        if (getLocalVariable(name) >= 0) {
            return true;
        } else if (getAsteriskOrBlockMethodParameter(name) >= 0) {
            return true;
        } else if (getMethodParameter(name) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNewLocalVar(String var) {
        return localVariableRange.get(var) == null;
    }

    public void setVarLineNumberInfo(String var, Label label) {
        localVariableRange.put(var, label);
        declarationSeq.add(var);
    }

    public Map<String, Label> getLocalVariableRange() {
        return localVariableRange;
    }

    public List<String> getDeclarationSeq() {
        return declarationSeq;
    }
}


class SymbolTableForBlock extends SymbolTable {
    private SymbolTable owner_;

    public SymbolTableForBlock(ArrayList<String> binding, SymbolTable owner) {
        super(binding);
        owner_ = owner;
    }

    public boolean isDefinedInCurrentScope(String s) {
        if (super.isDefinedInCurrentScope(s)) {
            return true;
        } else {
            return owner_.isDefinedInCurrentScope(s);
        }
    }

    public boolean isDefinedInOwnerScope(String s) {
        return owner_.isDefinedInCurrentScope(s);
    }
}

