package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

public class ListNode extends Node {
    private static final long serialVersionUID = 1L;

    private Node[] list;

    /**
     * Create a new ListNode.
     *
     * @param id type of listnode
     * @param firstNode first element of the list
     */
    public ListNode(ISourcePosition position, int id, Node firstNode) {
        this(position, id);

        list = new Node[] {firstNode};
    }

    public ListNode(ISourcePosition position, int id) {
        super(position, id);
    }

    public ListNode(ISourcePosition position) {
        super(position, NodeTypes.LISTNODE);
    }

    public ListNode add(Node node) {
        // Ruby Grammar productions return plenty of nulls.
        if (node == null) return this;
        if (list == null) {
            list = new Node[1];
        } else {
            Node[] newList = new Node[list.length + 1];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }

        list[list.length - 1] = node;

        if (getPosition() == null) {
            setPosition(node.getPosition());
        } else {
            setPosition(getPosition().union(node.getPosition()));
        }

        return this;
    }

    public ListNode prepend(Node node) {
        // Ruby Grammar productions return plenty of nulls.
        if (node == null) return this;
        if (list == null) {
            list = new Node[1];
        } else {
            Node[] newList = new Node[list.length + 1];
            System.arraycopy(list, 0, newList, 1, list.length);
            list = newList;
        }

        list[0] = node;
        setPosition(getPosition().union(node.getPosition()));
        return this;
    }

    public int size() {
        return list == null ? 0 : list.length;
    }


    /**
     * Add all elements in other list to this list node.
     *
     * @param other list which has elements
     * @return this instance for method chaining
     */
    public ListNode addAll(ListNode other) {
        if (other != null && other.size() > 0) {
            if (list == null) {
                list = new Node[other.size()];
                System.arraycopy(other.list, 0, list, 0, other.list.length);
            } else {
                Node[] newList = new Node[list.length + other.size()];
                System.arraycopy(list, 0, newList, 0, list.length);
                System.arraycopy(other.list, 0, newList, list.length, other.list.length);
                list = newList;
            }

            setPosition(getPosition().union(getLast().getPosition()));
        }
        return this;
    }

    /**
     * Add other element to this list
     *
     * @param other list which has elements
     * @return this instance for method chaining
     */
    public ListNode addAll(Node other) {
        return add(other);
    }

    public Node getLast() {
    	return list == null ? null : list[list.length - 1];
    }

    public String toString() {
        String string = super.toString();
    	if (list == null) {
    		return string + ": {}";
    	}
    	StringBuffer b = new StringBuffer();
    	for (int i = 0; i < list.length; i++) {
    		b.append(list[i]);
            if (i + 1 < list.length) {
                b.append(", ");
            }
    	}
    	return string + ": {" + b.toString() + "}";
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    public Node get(int idx) {
        return list[idx];
    }
}
