/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
		visitor.visitEof(compoundStatement_.lastStatementHasReturnValue());
	}
}
