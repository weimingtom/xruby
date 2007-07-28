package com.xruby.compiler.codedom;

/**
 * arguments for a function.
 *  this is used both in the function definition
 * and in actual function calls
 * <ul>
 * <li>
 * u1 ==&gt; optNode (BlockNode) Optional argument description
 * </li>
 * <li>
 * u2 ==&gt; rest (int) index of the rest argument (the array arg with a * in front
 * </li>
 * <li>
 * u3 ==&gt; count (int) number of arguments
 * </li>
 * </ul>
 *
 * @author  jpetersen
 */
public class ArgsNode extends Node {
    static final long serialVersionUID = 3709437716296564785L;

    private final ListNode arguments;
    private final ListNode optArgs;
    private final ArgumentNode restArgNode;
    private final int restArg;
    private final BlockArgNode blockArgNode;
    private final Arity arity;

    /**
     *
     * @param optionalArguments  Node describing the optional arguments
     * 				This Block will contain assignments to locals (LAsgnNode)
     * @param restArguments  index of the rest argument in the local table
     * 				(the array argument prefixed by a * which collects
     * 				all additional params)
     * 				or -1 if there is none.
     * @param argsCount number of regular arguments
     * @param restArgNode The rest argument (*args).
     * @param blockArgNode An optional block argument (&amp;arg).
     **/
    public ArgsNode(ISourcePosition position, ListNode arguments, ListNode optionalArguments,
            int restArguments, ArgumentNode restArgNode, BlockArgNode blockArgNode) {
        super(position, NodeTypes.ARGSNODE);

        this.arguments = arguments;
        this.optArgs = optionalArguments;
        this.restArg = restArguments;
        this.restArgNode = restArgNode;
        this.blockArgNode = blockArgNode;

        if (getRestArg() == -2) {
            arity = Arity.optional();
        } else if (getOptArgs() != null || getRestArg() >= 0) {
            arity = Arity.required(getArgsCount());
        } else {
            arity = Arity.createArity(getArgsCount());
        }
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public Instruction accept(NodeVisitor iVisitor) {
        return iVisitor.visitArgsNode(this);
    }

    /**
     * Gets main arguments (as Tokens)
     */
    public ListNode getArgs() {
        return arguments;
    }

    public Arity getArity() {
        return arity;
    }

    public int getArgsCount() {
        return arguments == null ? 0 : arguments.size();
    }

    /**
     * Gets the optArgs.
     * @return Returns a ListNode
     */
    public ListNode getOptArgs() {
        return optArgs;
    }

    /**
     * Gets the restArg.
     * @return Returns a int
     */
    public int getRestArg() {
        return restArg;
    }

    /**
     * Gets the restArgNode.
     * @return Returns an ArgumentNode
     */
    public ArgumentNode getRestArgNode() {
        return restArgNode;
    }

    /**
     * Gets the blockArgNode.
     * @return Returns a BlockArgNode
     */
    public BlockArgNode getBlockArgNode() {
        return blockArgNode;
    }

}
