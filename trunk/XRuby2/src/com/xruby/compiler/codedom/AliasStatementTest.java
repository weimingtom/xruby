/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the Apache License
 */

package com.xruby.compiler.codedom;

public class AliasStatementTest extends TestingAstTestCase {
	public void test() {
		String program_text = "alias $a $b";
		
		String expected_result = 
"alias $a $b\n" +
"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_operator() {
		String program_text = "alias ** rpower";
		
		String expected_result = 
"alias ** rpower\n" +
"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
	
	public void test_assignment() {
		String program_text = "alias g f=";
		
		String expected_result = 
"alias g f=\n" +
"EOF";
		
		assertAstOutput(program_text, expected_result);
	}
}
