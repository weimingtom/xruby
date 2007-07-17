package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Node;

import java.util.ArrayList;
import java.util.List;

public class BlockStaticScope extends StaticScope {
    private static final long serialVersionUID = -3882063260379968149L;

    public BlockStaticScope(StaticScope parentScope) {
        super(parentScope);
    }

    public BlockStaticScope(StaticScope parentScope, String[] names) {
        super(parentScope, names);
    }

    public StaticScope getLocalScope() {
        return getEnclosingScope().getLocalScope();
    }

    public int isDefined(String name, int depth) {
        int slot = exists(name);
        if (slot >= 0) return (depth << 16) | exists(name);

        return getEnclosingScope().isDefined(name, depth + 1);
    }


    public String[] getAllNamesInScope(DynamicScope dynamicScope) {
        String[] variables = getEnclosingScope().getAllNamesInScope(dynamicScope.getNextCapturedScope());
        String[] ourVariables = getVariables();
        List resultList = new ArrayList();

        // We have no names to add to existing list
        if (ourVariables == null) return variables;

        for (int i = 0; i < ourVariables.length; i++) {
            if (dynamicScope.getValue(i, 0) != null) resultList.add(ourVariables[i]);
        }
        int localNamesSize = resultList.size();

        String[] ourNames = new String[localNamesSize];
        resultList.toArray(ourNames);

        // we know variables cannot be null since localstaticscope will create a 0 length one.
        int newSize = variables.length + resultList.size();
        String[] names = new String[newSize];

        System.arraycopy(variables, 0, names, 0, variables.length);
        System.arraycopy(ourNames, 0, names, variables.length, ourNames.length);

        return names;
    }

    protected AssignableNode assign(ISourcePosition position, String name, Node value,
            StaticScope topScope, int depth) {
        int slot = exists(name);

        if (slot >= 0) {
            return new DAsgnNode(position, name, ((depth << 16) | slot), value);
        }

        return getEnclosingScope().assign(position, name, value, topScope, depth + 1);
    }

    public AssignableNode addAssign(ISourcePosition position, String name, Node value) {
        int slot = addVariable(name);

        // No bit math to store level since we know level is zero for this case
        return new DAsgnNode(position, name, slot, value);
    }

    public Node declare(ISourcePosition position, String name, int depth) {
        int slot = exists(name);

        if (slot >= 0) {
            return new DVarNode(position, ((depth << 16) | slot), name);
        }

        return getEnclosingScope().declare(position, name, depth + 1);
    }
}
