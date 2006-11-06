/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

public class Program implements Visitable {
	
	private CompoundStatement compoundStatement_;
	
	public Program(CompoundStatement compoundStatement) {
		compoundStatement_ = compoundStatement;
	}

	public void accept(CodeVisitor visitor) {
		if (null == compoundStatement_) {
			visitor.visitEof(false);
			return;
		}

		compoundStatement_.accept(visitor);
		visitor.visitEof(compoundStatement_.last_statement_has_return_value());
	}
}
