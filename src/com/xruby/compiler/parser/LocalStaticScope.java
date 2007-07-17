package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Node;

import java.util.ArrayList;
import java.util.List;

public class LocalStaticScope extends StaticScope {
    private static final long serialVersionUID = 2204064248888411628L;

    public LocalStaticScope(StaticScope enclosingScope) {
        super(enclosingScope);

        addVariable("$~");
        addVariable("$_");
    }

    public LocalStaticScope(StaticScope enclosingScope, String[] names) {
        super(enclosingScope, names);
    }

    public StaticScope getLocalScope() {
        return this;
    }

    public int isDefined(String name, int depth) {
        return (depth << 16) | exists(name);
    }

    
    public String[] getAllNamesInScope(DynamicScope dynamicScope) {
        String[] variables = getVariables();
        List resultList = new ArrayList();

        // We start at two since we know $_ and $~ are there and they are special and not
        // what Ruby considers a local name.  BTW- We always add $~ and $_ so we know variables
        // cannot be null.
        for (int i = 2; i < variables.length; i++) {
            if (dynamicScope.getValue(i, 0) != null) resultList.add(variables[i]);
        }
        int localNamesSize = resultList.size();

        String[] names = new String[localNamesSize];
        resultList.toArray(names);

        return names;
    }

    public AssignableNode assign(ISourcePosition position, String name, Node value,
            StaticScope topScope, int depth) {
        int slot = exists(name);

        // We can assign if we already have variable of that name here or we are the only
        // scope in the chain (which Local scopes always are).
        if (slot >= 0) {
            //System.out.println("LASGN1: " + name + ", l: " + depth + ", i: " + slot);

            return new LocalAsgnNode(position, name, ((depth << 16) | slot), value);
        } else if (topScope == this) {
            slot = addVariable(name);
            //System.out.println("LASGN2: " + name + ", l: " + depth + ", i: " + slot);

            return new LocalAsgnNode(position, name, slot , value);
        }

        // We know this is a block scope because a local scope cannot be within a local scope
        // If topScope was itself it would have created a LocalAsgnNode above.
        return ((BlockStaticScope) topScope).addAssign(position, name, value);
    }

    public Node declare(ISourcePosition position, String name, int depth) {
        int slot = exists(name);

        if (slot >= 0) {
            //System.out.println("LVAR: " + name + ", l: " + depth + ", i: " + slot);
            return new LocalVarNode(position, ((depth << 16) | slot), name);
        }

        return new VCallNode(position, name);
    }

}
