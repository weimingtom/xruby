/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

import java.util.*;

class Pair {
	String name;
	String[] value;
} 

public class Block {
    // TODO: fix this cache(map), maybe it has a naming conflict in multiple files compile
    private static Map<String, Map<String, int[]>> blockMap =
            new HashMap<String, Map<String, int[]>>();

    private CompoundStatement bodyStatement_ = null;
	private ArrayList<ParameterVariableExpression> parameters_ = new ArrayList<ParameterVariableExpression>();
	private ParameterVariableExpression asterisk_parameter_ = null;
	private ArrayList<Expression> default_parameters_ = new ArrayList<Expression>();
	private boolean should_validate_argument_length_ = false;
	private boolean is_for_in_expression_ = false;
	private boolean has_extra_comma_ = false;

    private String name;
    private int startPosition;
    private int endPosition;

    public void setHasExtraComma() {
		has_extra_comma_ = true;
	}
	
	public void initAllParametersToNil(CodeVisitor visitor) {
		for (ParameterVariableExpression var : parameters_) {
			var.acceptAsInitializeToNil(visitor);
		}
		
		if (null != asterisk_parameter_) {
			asterisk_parameter_.acceptAsInitializeToNil(visitor);
		}
	}
	
	public void getNewlyAssignedVariables(ISymbolTable symboltable, ArrayList<String> result) {
		for (ParameterVariableExpression var : parameters_) {
			var.getNewlyAssignedVariables(symboltable, result);
		}
		
		if (null != asterisk_parameter_) {
			asterisk_parameter_.getNewlyAssignedVariables(symboltable, result);
		}
	}
	
	public void setBody(CompoundStatement bodyStatement) {
		bodyStatement_ = bodyStatement;
	}
	
	public void addParameter(ParameterVariableExpression name, Expression default_value) {
		parameters_.add(name);
		if (null != default_value) {
			default_parameters_.add(default_value);
		}
	}

	void setIsForInExpression() {
		is_for_in_expression_ = true;
	}

	//{||} -> true
	//{|x,...|} -> true
	//{} -> false
	public void setShouldValidateArgumentLength() {
		should_validate_argument_length_ = true;
	}

	public void setAsteriskParameter(ParameterVariableExpression name) {
		assert(null == asterisk_parameter_);
		asterisk_parameter_ = name;
	}

	private ArrayList<Expression> buildLhs() {
		ArrayList<Expression> mlhs = new ArrayList<Expression>();
		for (ParameterVariableExpression var : parameters_) {
			mlhs.add(var);
		}
		return mlhs;
	}

	public Pair accept(CodeVisitor visitor) {
		name = visitor.visitBlock((should_validate_argument_length_ ? parameters_.size() : -1),
									(null != asterisk_parameter_),
									default_parameters_.size(),
									is_for_in_expression_);

		MultipleAssignmentStatement.acceptMLhs(visitor, buildLhs(), asterisk_parameter_, has_extra_comma_);
		
		//TODO support default_value

		if (null != bodyStatement_) {
			bodyStatement_.accept(visitor);
            setEndPosition(bodyStatement_.getLastLine());
        }
        else {
            setEndPosition(startPosition);
        }

        Pair p = new Pair();
		p.name = name;
		p.value = visitor.visitBlockEnd(name, (null != bodyStatement_) ?
										bodyStatement_.lastStatementHasReturnValue() : false);
        Block.markBlock(this);
        return p;
	}


    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public String getName() {
        return name;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }

    /**
     * Return the block description for all blocks
     *
     * e.g.
     * 2                       # Number of files
     * a_script.rb             # script's file name
     * 2                       # Number of blocks
     * BLOCK$0 2 10            # block name start end
     * BLOCK$1 22 30
     * b_script.rb
     * 2
     * BLOCK$0 2 10
     * BLOCK$1 22 30
     *
     * @return block description
     */
    public static String getBlockMap() {
        StringBuffer description = new StringBuffer();
        Set<String> files = blockMap.keySet();
        description.append(files.size()).append("\n"); // Number of files

        for(String scriptName: files) {
            Map<String, int[]> map = blockMap.get(scriptName);
            description.append(scriptName).append("\n"); // script's file name
            description.append(map.size());  // Number of blocks

            Set<String> blocks = map.keySet();
            for(String blockName: blocks) {
                int[] range = map.get(blockName);
                String line = String.format("%s %d %d\n", blockName, range[0], range[1]);
                description.append(line);
            }
        }

        return description.toString();
    }

    /**
     * 2                       # Number of blocks
     * BLOCK$0 2 10            # block name start end
     * BLOCK$1 22 30
     * b_script.rb
     *
     * @param scriptName script file's name
     * @return block map, string form
     */
    public static String getBlockMapByName(String scriptName) {
        Set<String> files = blockMap.keySet();
        if (!files.contains(scriptName)) {
            return null;
        } else {
            StringBuffer description = new StringBuffer();
            Map<String, int[]> map = blockMap.get(scriptName);
            description.append(map.size()).append("\n");  // Number of blocks

            Set<String> blocks = map.keySet();
            for (String blockName : blocks) {
                int[] range = map.get(blockName);
                String line = String.format("%s %d %d\n", blockName, range[0], range[1]);
                description.append(line);
            }

            return description.toString();
        }
    }

    protected static void markBlock(Block block) {
        String blockName = block.getName();
        String name = extractBlockName(blockName);
        String scriptName = extractScriptName(blockName);

        Map<String, int[]> map = blockMap.get(scriptName);

        // First block in this file
        if(map == null) {
            map = new HashMap<String, int[]>();
            blockMap.put(scriptName, map);
        }

        int start = block.getStartPosition();
        int end = block.getEndPosition();
        int[] range = new int[] {start, end};
        map.put(name, range);
    }

    private static String extractScriptName(String blockName) {
        StringTokenizer st = new StringTokenizer(blockName, "/");

        // TODO: maybe we need create a global variable to keep current script name
        // TODO: Add a new global helper method getCurrentScriptName(). We need fix this in the feature.
        if(st.hasMoreTokens()) {
            return st.nextToken() + ".rb";
        } else {
            return null;
        }
    }

    private static String extractBlockName(String name) {
        StringTokenizer st = new StringTokenizer(name, "/");
        String blockName = null;
        while(st.hasMoreTokens()) {
            blockName = st.nextToken();
        }

        return blockName;
    }
}
