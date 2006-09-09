/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

public class Program implements Visitable {
	
	private CompoundStatement compoundStatement_;
	
	public Program(CompoundStatement compoundStatement) {
		compoundStatement_ = compoundStatement;
	}

	public void accept(CodeVisitor visitor) {
		compoundStatement_.accept(visitor);
		visitor.visitEof(compoundStatement_.last_statement_has_return_value());
	}
}
