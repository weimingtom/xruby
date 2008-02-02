// $ANTLR 3.0.1 D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-02 15:46:23

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "SYMBOL_NAME", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'"
    };
    public static final int CASE_EQUAL=44;
    public static final int STAR=53;
    public static final int EMPTY_ARRAY=115;
    public static final int MOD=30;
    public static final int REST_UNUSE=28;
    public static final int MOD_ASSIGN=56;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=118;
    public static final int REGEX=83;
    public static final int LEFT_SHIFT_ASSIGN=63;
    public static final int NOT=80;
    public static final int UNTIL_MODIFIER=34;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=58;
    public static final int LOGICAL_AND=73;
    public static final int STATEMENT=5;
    public static final int RPAREN=112;
    public static final int SINGLE_QUOTE_STRING=100;
    public static final int HEX_PART=94;
    public static final int ARG=10;
    public static final int NESTED_LHS=25;
    public static final int NOT_EQUAL=74;
    public static final int SYMBOL_NAME=109;
    public static final int WHILE_MODIFIER=33;
    public static final int BODY=9;
    public static final int COMMENT=119;
    public static final int ARRAY=82;
    public static final int RBRACK=114;
    public static final int HEREDOC_BEGIN=106;
    public static final int UNLESS_MODIFIER=32;
    public static final int INCLUSIVE_RANGE=70;
    public static final int SYMBOL=18;
    public static final int MINUS_ASSIGN=59;
    public static final int POWER=54;
    public static final int LCURLY=104;
    public static final int MATCH=45;
    public static final int INT=81;
    public static final int GLOBAL_VARIABLE=93;
    public static final int ESCAPE_INT_PART=97;
    public static final int LINE_BREAK=37;
    public static final int WS=38;
    public static final int VARIABLE=16;
    public static final int DOUBLE_QUOTE_STRING=101;
    public static final int INSTANCE_VARIABLE=91;
    public static final int LESS_THAN=48;
    public static final int OCTAL=84;
    public static final int SINGLETON_METHOD=26;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=75;
    public static final int BNOT=79;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=108;
    public static final int NON_LEADING0_NUMBER=99;
    public static final int CONTROL_PART=95;
    public static final int LBRACK=113;
    public static final int IF_MODIFIER=31;
    public static final int BXOR_ASSIGN=110;
    public static final int GREATER_OR_EQUAL=47;
    public static final int FLOAT=13;
    public static final int BLOCK_ARG=22;
    public static final int HEREDOC_STRING=12;
    public static final int ID=41;
    public static final int LPAREN=111;
    public static final int IF=7;
    public static final int EXP_PART=88;
    public static final int RESCUE_MODIFIER=35;
    public static final int BOR_ASSIGN=61;
    public static final int LEADING0_NUMBER=89;
    public static final int COMMA=116;
    public static final int HEX=85;
    public static final int EQUAL=43;
    public static final int BOR=77;
    public static final int RIGHT_SHIFT=50;
    public static final int RIGHT_SHIFT_ASSIGN=64;
    public static final int LOGICAL_OR=72;
    public static final int COMPARE=42;
    public static final int PLUS=51;
    public static final int BXOR=76;
    public static final int DOT=39;
    public static final int EXCLUSIVE_RANGE=71;
    public static final int COLON2=40;
    public static final int MRHS=24;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=90;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int GREATER_THAN=46;
    public static final int LOGICAL_AND_ASSIGN=66;
    public static final int LEADING_MARK_DECIMAL=87;
    public static final int DOUBLE_STRING_CHAR=103;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int LESS_OR_EQUAL=49;
    public static final int SINGLE_STRING_CHAR=102;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=52;
    public static final int BAND=78;
    public static final int META_PART=96;
    public static final int SEMI=36;
    public static final int STAR_ASSIGN=65;
    public static final int LOGICAL_OR_ASSIGN=67;
    public static final int COLON=117;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=62;
    public static final int CLASS_VARIABLE=92;
    public static final int QUESTION=69;
    public static final int ESCAPE_INT=98;
    public static final int BLOCK=19;
    public static final int RCURLY=105;
    public static final int ASSIGN=55;
    public static final int PLUS_ASSIGN=60;
    public static final int POWER_ASSIGN=68;
    public static final int COMPLEMENT_ASSIGN=57;
    public static final int DIV=29;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int BINARY=86;
    public static final int HEREDOC_INDENT_BEGIN=107;
    public static final int STRING=27;
    
        public Rubyv3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[68+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    
      private Rubyv3Parser parent = null;
      private SymbolTableManager stm = new SymbolTableManager(null);
      private Rubyv3Lexer lexer;
      private BaseTokenStream tokenStream;
      /*public boolean just_seen_var() {
              Token token = input.LT(1);
              if(token != null) {
                return stm.isDefinedInCurrentScope(token.getText());
              }
              return false;
      }*/
      public boolean isDefinedVar(String text) {
            boolean result = false;
            if(parent != null) {
              result = parent.isDefinedVar(text);
            } else {
              return stm.isDefinedInCurrentScope(text);
            }
            if(result) {
              return true;
            } else {
              return false;
            }
            
      }
      public void addVariable(String s) {
            if(parent != null) {
               parent.addVariable(s);
               return;
            }
            stm.addVariable(s);
      }
      
      protected void enterScope() {
            stm.enterScope();
      }
    
    	//protected void enterBlockScope() {
    	//	lexer_.getSymbolTableManager().enterBlockScope();
    	//}
    	
      protected void leaveScope() {
           stm.leaveScope();
      }
    		
      public Rubyv3Parser(TokenStream input, Rubyv3Parser parent) {
                super(input);
                ((Rubyv3Lexer) input.getTokenSource()).setParser(this);
                this.parent = parent;
                this.lexer = (Rubyv3Lexer)input.getTokenSource();
                this.tokenStream = (BaseTokenStream)input;
      }
      /*public void init() {
        ((Rubyv3Lexer) input.getTokenSource()).setParser(this);
      }*/
      


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start program
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:17: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);
            
            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==LCURLY||LA3_0==LPAREN||LA3_0==120||(LA3_0>=122 && LA3_0<=124)||(LA3_0>=128 && LA3_0<=129)||(LA3_0>=133 && LA3_0<=136)) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("270:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);
            
                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);
                        
                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }
                        
                    
                        switch (alt1) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program253);
                    	    terminal1=terminal();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, terminal1.getTree());
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_program257);
                    statement_list2=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list2.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);
                        
                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }
                        
                    
                        switch (alt2) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program259);
                    	    terminal3=terminal();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, terminal3.getTree());
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class statement_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start statement_list
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
    public final statement_list_return statement_list() throws RecognitionException {
        statement_list_return retval = new statement_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        statement_return statement4 = null;

        terminal_return terminal5 = null;

        statement_return statement6 = null;
        

        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_terminal=new RewriteRuleSubtreeStream(adaptor,"rule terminal");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:3: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list273);
            statement4=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(statement4.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:16: ( terminal )+ statement
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:16: ( terminal )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);
            	        
            	        if ( ((LA4_0>=SEMI && LA4_0<=LINE_BREAK)) ) {
            	            alt4=1;
            	        }
            	        
            	    
            	        switch (alt4) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list276);
            	    	    terminal5=terminal();
            	    	    _fsp--;
            	    	    if (failed) return retval;
            	    	    if ( backtracking==0 ) stream_terminal.add(terminal5.getTree());
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	    	    if (backtracking>0) {failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	    pushFollow(FOLLOW_statement_in_statement_list279);
            	    statement6=statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_statement.add(statement6.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 275:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:58: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement_list

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start statement
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;
        

        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:2: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement305);
            expression7=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression7.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                
                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }
                
            
                switch (alt6) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement308);
            	    modifier_line8=modifier_line();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_modifier_line.add(modifier_line8.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: expression, modifier_line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:59: ( modifier_line )*
                while ( stream_modifier_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier_line.next());

                }
                stream_modifier_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class modifier_line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start modifier_line
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:286:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;
        

        Object set9_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:2: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
            {
            root_0 = (Object)adaptor.nil();
            
            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=IF_MODIFIER && input.LA(1)<=RESCUE_MODIFIER) ) {
                input.consume();
                if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(adaptor.create(set9), root_0);
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line348);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                
                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }
                
            
                switch (alt7) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line362);
            	    line_break10=line_break();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, line_break10.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_modifier_line366);
            expression11=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression11.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end modifier_line

    public static class block_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start block_expression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:1: block_expression : 'begin' body 'end' ;
    public final block_expression_return block_expression() throws RecognitionException {
        block_expression_return retval = new block_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal12=null;
        Token string_literal14=null;
        body_return body13 = null;
        

        Object string_literal12_tree=null;
        Object string_literal14_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:306:2: ( 'begin' body 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:306:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal12=(Token)input.LT(1);
            match(input,120,FOLLOW_120_in_block_expression441); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);
            }
            pushFollow(FOLLOW_body_in_block_expression443);
            body13=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,121,FOLLOW_121_in_block_expression445); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);
            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block_expression

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start body
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;
        

        Object SEMI15_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:6: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);
            
            if ( (LA10_0==SEMI||LA10_0==121||(LA10_0>=125 && LA10_0<=126)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==LCURLY||LA10_0==LPAREN||LA10_0==120||(LA10_0>=122 && LA10_0<=124)||(LA10_0>=128 && LA10_0<=129)||(LA10_0>=133 && LA10_0<=136)) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("307:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);
            
                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);
                        
                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }
                        
                    
                        switch (alt8) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body452); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    SEMI15_tree = (Object)adaptor.create(SEMI15);
                    	    adaptor.addChild(root_0, SEMI15_tree);
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_body456);
                    statement_list16=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list16.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);
                        
                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }
                        
                    
                        switch (alt9) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body458);
                    	    terminal17=terminal();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, terminal17.getTree());
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end body

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start boolean_expression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set18=null;

        Object set18_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:2: ( 'false' | 'nil' | 'true' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=122 && input.LA(1)<=124) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set18));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boolean_expression0);    throw mse;
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end boolean_expression

    public static class if_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start if_expression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
    public final if_expression_return if_expression() throws RecognitionException {
        if_expression_return retval = new if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal19=null;
        Token string_literal21=null;
        Token string_literal23=null;
        Token string_literal24=null;
        List list_body1=null;
        expression_return e0 = null;

        body_return body0 = null;

        expression_return e1 = null;

        body_return body2 = null;

        seperator_return seperator20 = null;

        seperator_return seperator22 = null;
        
        RuleReturnScope body1 = null;
        Object string_literal19_tree=null;
        Object string_literal21_tree=null;
        Object string_literal23_tree=null;
        Object string_literal24_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:2: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression481); if (failed) return retval;
            if ( backtracking==0 ) stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression486);
            e0=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression488);
            seperator20=seperator();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression501);
            body0=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_body.add(body0.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);
                
                if ( (LA11_0==125) ) {
                    alt11=1;
                }
                
            
                switch (alt11) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,125,FOLLOW_125_in_if_expression504); if (failed) return retval;
            	    if ( backtracking==0 ) stream_125.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression508);
            	    e1=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression510);
            	    seperator22=seperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression514);
            	    body1=body();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_body.add(body1.getTree());
            	    if (list_body1==null) list_body1=new ArrayList();
            	    list_body1.add(body1);

            	    
            	    }
            	    break;
            
            	default :
            	    break loop11;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);
            
            if ( (LA12_0==126) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_if_expression528); if (failed) return retval;
                    if ( backtracking==0 ) stream_126.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression532);
                    body2=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_body.add(body2.getTree());
                    
                    }
                    break;
            
            }

            string_literal24=(Token)input.LT(1);
            match(input,121,FOLLOW_121_in_if_expression545); if (failed) return retval;
            if ( backtracking==0 ) stream_121.add(string_literal24);


            // AST REWRITE
            // elements: body1, body0, e1, body2, e0
            // token labels: 
            // rule labels: body2, retval, e1, e0, body0
            // token list labels: 
            // rule list labels: body1
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_body2=new RewriteRuleSubtreeStream(adaptor,"token body2",body2!=null?body2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e0=new RewriteRuleSubtreeStream(adaptor,"token e0",e0!=null?e0.tree:null);
            RewriteRuleSubtreeStream stream_body0=new RewriteRuleSubtreeStream(adaptor,"token body0",body0!=null?body0.tree:null);
            RewriteRuleSubtreeStream stream_body1=new RewriteRuleSubtreeStream(adaptor,"token body1",list_body1);
            root_0 = (Object)adaptor.nil();
            // 314:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:48: ( $body2)?
                if ( stream_body2.hasNext() ) {
                    adaptor.addChild(root_1, stream_body2.next());

                }
                stream_body2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end if_expression

    public static class seperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start seperator
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
    public final seperator_return seperator() throws RecognitionException {
        seperator_return retval = new seperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK25=null;
        Token char_literal26=null;
        Token LINE_BREAK27=null;
        Token LINE_BREAK28=null;
        Token string_literal29=null;
        Token LINE_BREAK30=null;

        Object LINE_BREAK25_tree=null;
        Object char_literal26_tree=null;
        Object LINE_BREAK27_tree=null;
        Object LINE_BREAK28_tree=null;
        Object string_literal29_tree=null;
        Object LINE_BREAK30_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:2: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: ( LINE_BREAK )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);
                        
                        if ( (LA13_0==LINE_BREAK) ) {
                            alt13=1;
                        }
                        
                    
                        switch (alt13) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator597); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK25_tree = (Object)adaptor.create(LINE_BREAK25);
                    	    adaptor.addChild(root_0, LINE_BREAK25_tree);
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator600); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        
                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }
                        
                    
                        switch (alt14) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator602); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK27_tree = (Object)adaptor.create(LINE_BREAK27);
                    	    adaptor.addChild(root_0, LINE_BREAK27_tree);
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);
                        
                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }
                        
                    
                        switch (alt15) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator607); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK28_tree = (Object)adaptor.create(LINE_BREAK28);
                    	    adaptor.addChild(root_0, LINE_BREAK28_tree);
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    string_literal29=(Token)input.LT(1);
                    match(input,127,FOLLOW_127_in_seperator610); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);
                        
                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }
                        
                    
                        switch (alt16) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator612); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK30_tree = (Object)adaptor.create(LINE_BREAK30);
                    	    adaptor.addChild(root_0, LINE_BREAK30_tree);
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end seperator

    public static class unless_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start unless_expression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:319:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
    public final unless_expression_return unless_expression() throws RecognitionException {
        unless_expression_return retval = new unless_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal31=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token string_literal37=null;
        Token string_literal39=null;
        boolean_expression_return boolean_expression32 = null;

        line_break_return line_break35 = null;

        body_return body36 = null;

        body_return body38 = null;
        

        Object string_literal31_tree=null;
        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object string_literal37_tree=null;
        Object string_literal39_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:2: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression622); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);
            }
            pushFollow(FOLLOW_boolean_expression_in_unless_expression624);
            boolean_expression32=boolean_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression32.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt18=1;
                }
                break;
            case COLON:
                {
                alt18=2;
                }
                break;
            case LINE_BREAK:
                {
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("320:32: ( 'then' | ':' | line_break )", 18, 0, input);
            
                throw nvae;
            }
            
            switch (alt18) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,127,FOLLOW_127_in_unless_expression627); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression629); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression631);
                    line_break35=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break35.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_body_in_unless_expression643);
            body36=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body36.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            
            if ( (LA19_0==126) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_unless_expression656); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);
                    }
                    pushFollow(FOLLOW_body_in_unless_expression658);
                    body38=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, body38.getTree());
                    
                    }
                    break;
            
            }

            string_literal39=(Token)input.LT(1);
            match(input,121,FOLLOW_121_in_unless_expression671); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal39_tree = (Object)adaptor.create(string_literal39);
            adaptor.addChild(root_0, string_literal39_tree);
            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unless_expression

    public static class terminal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start terminal
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI40=null;
        line_break_return line_break41 = null;
        

        Object SEMI40_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:9: ( SEMI | line_break )
            int alt20=2;
            int LA20_0 = input.LA(1);
            
            if ( (LA20_0==SEMI) ) {
                alt20=1;
            }
            else if ( (LA20_0==LINE_BREAK) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("324:1: terminal : ( SEMI | line_break );", 20, 0, input);
            
                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal677); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_line_break_in_terminal680);
                    line_break41=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break41.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end terminal

    public static class line_break_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start line_break
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:2: ( LINE_BREAK )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();
            
            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break690); if (failed) return retval;
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end line_break

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start expression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal43=null;
        fitem_return fitem44 = null;

        fitem_return fitem45 = null;

        andorExpression_return andorExpression46 = null;

        primaryExpression_return primaryExpression47 = null;
        

        Object string_literal43_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:2: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt21=1;
                }
                break;
            case HEREDOC_STRING:
            case FLOAT:
            case SYMBOL:
            case IF_MODIFIER:
            case UNLESS_MODIFIER:
            case ID:
            case BNOT:
            case NOT:
            case INT:
            case ARRAY:
            case REGEX:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
            case LCURLY:
            case LPAREN:
            case 120:
            case 122:
            case 123:
            case 124:
            case 133:
            case 134:
            case 135:
            case 136:
                {
                alt21=2;
                }
                break;
            case 129:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("358:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);
            
                throw nvae;
            }
            
            switch (alt21) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal43=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_expression735); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
                    }
                    pushFollow(FOLLOW_fitem_in_expression738);
                    fitem44=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression740);
                    fitem45=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem45.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_andorExpression_in_expression742);
                    andorExpression46=andorExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, andorExpression46.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_primaryExpression_in_expression744);
                    primaryExpression47=primaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primaryExpression47.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start primaryExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodDefinition_return methodDefinition48 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:2: ( methodDefinition )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_methodDefinition_in_primaryExpression752);
            methodDefinition48=methodDefinition();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodDefinition48.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end primaryExpression

    public static class methodDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start methodDefinition
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
    public final methodDefinition_return methodDefinition() throws RecognitionException {
        methodDefinition_return retval = new methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal49=null;
        Token LINE_BREAK50=null;
        Token string_literal58=null;
        singleton_return singleton51 = null;

        dot_or_colon_return dot_or_colon52 = null;

        methodName_return methodName53 = null;

        f_arglist_return f_arglist54 = null;

        terminal_return terminal55 = null;

        bodyStatement_return bodyStatement56 = null;

        terminal_return terminal57 = null;
        

        Object string_literal49_tree=null;
        Object LINE_BREAK50_tree=null;
        Object string_literal58_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:2: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal49=(Token)input.LT(1);
            match(input,129,FOLLOW_129_in_methodDefinition760); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);
                
                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }
                
            
                switch (alt22) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition764); if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:26: ( singleton dot_or_colon )?
            int alt23=2;
            int LA23_0 = input.LA(1);
            
            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);
                
                if ( ((LA23_1>=DOT && LA23_1<=COLON2)) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==LPAREN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition770);
                    singleton51=singleton();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition772);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dot_or_colon52.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_methodName_in_methodDefinition776);
            methodName53=methodName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodName53.getTree());
            if ( backtracking==0 ) {
              enterScope();
            }
            pushFollow(FOLLOW_f_arglist_in_methodDefinition780);
            f_arglist54=f_arglist();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f_arglist54.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:89: ( terminal )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);
                
                if ( (LA24_0==SEMI) ) {
                    alt24=1;
                }
                else if ( (LA24_0==LINE_BREAK) ) {
                    alt24=1;
                }
                
            
                switch (alt24) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition783);
            	    terminal55=terminal();
            	    _fsp--;
            	    if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);
            
            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||LA25_0==SYMBOL||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING && LA25_0<=DOUBLE_QUOTE_STRING)||LA25_0==LCURLY||LA25_0==LPAREN||LA25_0==120||(LA25_0>=122 && LA25_0<=124)||(LA25_0>=128 && LA25_0<=129)||(LA25_0>=133 && LA25_0<=136)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition789);
                    bodyStatement56=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement56.getTree());
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);
                
                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }
                
            
                switch (alt26) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition793);
            	    terminal57=terminal();
            	    _fsp--;
            	    if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop26;
                }
            } while (true);

            string_literal58=(Token)input.LT(1);
            match(input,121,FOLLOW_121_in_methodDefinition798); if (failed) return retval;
            if ( backtracking==0 ) {
              leaveScope();
            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end methodDefinition

    public static class singleton_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start singleton
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:1: singleton : ( variable | '(' expression opt_nl ')' );
    public final singleton_return singleton() throws RecognitionException {
        singleton_return retval = new singleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal60=null;
        Token char_literal63=null;
        variable_return variable59 = null;

        expression_return expression61 = null;

        opt_nl_return opt_nl62 = null;
        

        Object char_literal60_tree=null;
        Object char_literal63_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:2: ( variable | '(' expression opt_nl ')' )
            int alt27=2;
            int LA27_0 = input.LA(1);
            
            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==LPAREN) ) {
                alt27=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("364:1: singleton : ( variable | '(' expression opt_nl ')' );", 27, 0, input);
            
                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:4: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_singleton809);
                    variable59=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable59.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton811); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_singleton814);
                    expression61=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton816);
                    opt_nl62=opt_nl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton818); if (failed) return retval;
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end singleton

    public static class opt_nl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start opt_nl
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:15: ( | LINE_BREAK )
            int alt28=2;
            int LA28_0 = input.LA(1);
            
            if ( (LA28_0==RPAREN) ) {
                alt28=1;
            }
            else if ( (LA28_0==LINE_BREAK) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("366:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);
            
                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:28: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl837); if (failed) return retval;
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end opt_nl

    public static class dot_or_colon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start dot_or_colon
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set65=null;

        Object set65_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:2: ( DOT | COLON2 )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set65=(Token)input.LT(1);
            if ( (input.LA(1)>=DOT && input.LA(1)<=COLON2) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set65));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_dot_or_colon0);    throw mse;
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end dot_or_colon

    public static class methodName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start methodName
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set66=null;

        Object set66_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:371:2: ( ID | CONSTANT | FID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set66=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set66));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_methodName0);    throw mse;
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end methodName

    public static class f_arglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start f_arglist
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
    public final f_arglist_return f_arglist() throws RecognitionException {
        f_arglist_return retval = new f_arglist_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal67=null;
        Token LINE_BREAK69=null;
        Token char_literal70=null;
        f_args_return f_args68 = null;

        f_args_return f_args71 = null;

        terminal_return terminal72 = null;
        

        Object char_literal67_tree=null;
        Object LINE_BREAK69_tree=null;
        Object char_literal70_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LINE_BREAK=new RewriteRuleTokenStream(adaptor,"token LINE_BREAK");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_f_args=new RewriteRuleSubtreeStream(adaptor,"rule f_args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:2: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
            int alt30=2;
            int LA30_0 = input.LA(1);
            
            if ( (LA30_0==LPAREN) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=SEMI && LA30_0<=LINE_BREAK)||LA30_0==ID||LA30_0==STAR) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("372:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);
            
                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist875); if (failed) return retval;
                    if ( backtracking==0 ) stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist877);
                    f_args68=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_f_args.add(f_args68.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);
                        
                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }
                        
                    
                        switch (alt29) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist881); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK69);

                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist885); if (failed) return retval;
                    if ( backtracking==0 ) stream_RPAREN.add(char_literal70);


                    // AST REWRITE
                    // elements: f_args
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:34: -> ^( ARG f_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:37: ^( ARG f_args )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARG, "ARG"), root_1);

                        adaptor.addChild(root_1, stream_f_args.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_args_in_f_arglist904);
                    f_args71=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist906);
                    terminal72=terminal();
                    _fsp--;
                    if (failed) return retval;
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end f_arglist

    public static class f_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start f_args
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );
    public final f_args_return f_args() throws RecognitionException {
        f_args_return retval = new f_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal80=null;
        Token char_literal83=null;
        f_norm_args_return f_norm_args73 = null;

        f_norm_args_return f_norm_args74 = null;

        f_opt_args_return f_opt_args76 = null;

        f_rest_arg_return f_rest_arg78 = null;

        f_norm_args_return f_norm_args79 = null;

        f_rest_arg_return f_rest_arg81 = null;

        f_opt_args_return f_opt_args82 = null;

        f_rest_arg_return f_rest_arg84 = null;

        f_rest_arg_return f_rest_arg85 = null;
        

        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        Object char_literal80_tree=null;
        Object char_literal83_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:8: ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
            int alt33=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case ASSIGN:
                    {
                    alt33=5;
                    }
                    break;
                case COMMA:
                    {
                    int LA33_5 = input.LA(3);
                    
                    if ( (LA33_5==ID) ) {
                        alt33=2;
                    }
                    else if ( (LA33_5==STAR) ) {
                        alt33=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("375:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 5, input);
                    
                        throw nvae;
                    }
                    }
                    break;
                case SEMI:
                case LINE_BREAK:
                case RPAREN:
                    {
                    alt33=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("375:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 1, input);
                
                    throw nvae;
                }
            
                }
                break;
            case SEMI:
            case LINE_BREAK:
            case RPAREN:
                {
                alt33=3;
                }
                break;
            case STAR:
                {
                alt33=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("375:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 0, input);
            
                throw nvae;
            }
            
            switch (alt33) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args914);
                    f_norm_args73=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args73.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:24: f_norm_args ',' f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args918);
                    f_norm_args74=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args920); if (failed) return retval;
                    pushFollow(FOLLOW_f_opt_args_in_f_args923);
                    f_opt_args76=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args76.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:52: ( ',' f_rest_arg )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);
                    
                    if ( (LA31_0==COMMA) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:53: ',' f_rest_arg
                            {
                            char_literal77=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args926); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args929);
                            f_rest_arg78=f_rest_arg();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg78.getTree());
                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:2: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:4: f_norm_args ',' f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args939);
                    f_norm_args79=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args79.getTree());
                    char_literal80=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args941); if (failed) return retval;
                    pushFollow(FOLLOW_f_rest_arg_in_f_args944);
                    f_rest_arg81=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg81.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_opt_args_in_f_args955);
                    f_opt_args82=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args82.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:21: ( ',' f_rest_arg )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);
                    
                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:22: ',' f_rest_arg
                            {
                            char_literal83=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args958); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args961);
                            f_rest_arg84=f_rest_arg();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg84.getTree());
                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_rest_arg_in_f_args968);
                    f_rest_arg85=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg85.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end f_args

    public static class f_norm_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start f_norm_args
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID86=null;

        Object ID86_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:2: ( ID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:2: ID
            {
            root_0 = (Object)adaptor.nil();
            
            ID86=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args999); if (failed) return retval;
            if ( backtracking==0 ) {
            ID86_tree = (Object)adaptor.create(ID86);
            adaptor.addChild(root_0, ID86_tree);
            }
            if ( backtracking==0 ) {
              addVariable(ID86.getText());
            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end f_norm_args

    public static class f_rest_arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start f_rest_arg
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );
    public final f_rest_arg_return f_rest_arg() throws RecognitionException {
        f_rest_arg_return retval = new f_rest_arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal87=null;
        Token ID88=null;
        Token char_literal89=null;

        Object char_literal87_tree=null;
        Object ID88_tree=null;
        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:2: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
            int alt34=2;
            int LA34_0 = input.LA(1);
            
            if ( (LA34_0==STAR) ) {
                int LA34_1 = input.LA(2);
                
                if ( (LA34_1==ID) ) {
                    alt34=1;
                }
                else if ( ((LA34_1>=SEMI && LA34_1<=LINE_BREAK)||LA34_1==RPAREN) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("386:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 0, input);
            
                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal87=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1009); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
                    }
                    ID88=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg1012); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID88_tree = (Object)adaptor.create(ID88);
                    adaptor.addChild(root_0, ID88_tree);
                    }
                    if ( backtracking==0 ) {
                      addVariable(ID88.getText());
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:38: '*'
                    {
                    char_literal89=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1017); if (failed) return retval;
                    if ( backtracking==0 ) stream_STAR.add(char_literal89);


                    // AST REWRITE
                    // elements: STAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 387:42: -> ^( '*' REST_UNUSE )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:45: ^( '*' REST_UNUSE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STAR.next(), root_1);

                        adaptor.addChild(root_1, adaptor.create(REST_UNUSE, "REST_UNUSE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end f_rest_arg

    public static class f_opt_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start f_opt_args
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:1: f_opt_args : ID '=' arg ;
    public final f_opt_args_return f_opt_args() throws RecognitionException {
        f_opt_args_return retval = new f_opt_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID90=null;
        Token char_literal91=null;
        arg_return arg92 = null;
        

        Object ID90_tree=null;
        Object char_literal91_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:2: ( ID '=' arg )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();
            
            ID90=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args1033); if (failed) return retval;
            if ( backtracking==0 ) {
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);
            }
            char_literal91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args1035); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal91_tree = (Object)adaptor.create(char_literal91);
            root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);
            }
            pushFollow(FOLLOW_arg_in_f_opt_args1038);
            arg92=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg92.getTree());
            if ( backtracking==0 ) {
              addVariable(ID90.getText());
            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end f_opt_args

    public static class bodyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start bodyStatement
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        statement_list_return statement_list93 = null;
        

        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:2: ( statement_list -> ^( BODY statement_list ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1050);
            statement_list93=statement_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement_list.add(statement_list93.getTree());

            // AST REWRITE
            // elements: statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 392:19: -> ^( BODY statement_list )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:22: ^( BODY statement_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_statement_list.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bodyStatement

    public static class fitem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start fitem
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        fname_return fname94 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:7: ( fname )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:9: fname
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_fname_in_fitem1068);
            fname94=fname();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fname94.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fitem

    public static class fname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start fname
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID95=null;
        Token CONSTANT96=null;
        Token FID97=null;
        op_return op98 = null;
        

        Object ID95_tree=null;
        Object CONSTANT96_tree=null;
        Object FID97_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:7: ( ID | CONSTANT | FID | op )
            int alt35=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt35=1;
                }
                break;
            case CONSTANT:
                {
                alt35=2;
                }
                break;
            case FID:
                {
                alt35=3;
                }
                break;
            case LEFT_SHIFT:
            case DIV:
            case MOD:
            case COMPARE:
            case EQUAL:
            case CASE_EQUAL:
            case MATCH:
            case GREATER_THAN:
            case GREATER_OR_EQUAL:
            case LESS_THAN:
            case LESS_OR_EQUAL:
            case RIGHT_SHIFT:
            case PLUS:
            case MINUS:
            case STAR:
            case POWER:
            case BXOR:
            case BOR:
            case BAND:
            case BNOT:
            case EMPTY_ARRAY:
            case 130:
                {
                alt35=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("396:1: fname : ( ID | CONSTANT | FID | op );", 35, 0, input);
            
                throw nvae;
            }
            
            switch (alt35) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:9: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID95=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1075); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID95_tree = (Object)adaptor.create(ID95);
                    adaptor.addChild(root_0, ID95_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT96=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1077); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT96_tree = (Object)adaptor.create(CONSTANT96);
                    adaptor.addChild(root_0, CONSTANT96_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:21: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID97=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1079); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID97_tree = (Object)adaptor.create(FID97);
                    adaptor.addChild(root_0, FID97_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:25: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_fname1081);
                    op98=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op98.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fname

    public static class op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start op
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set99=null;

        Object set99_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:15: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set99=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==130 ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set99));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_op0);    throw mse;
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end op

    public static class andorExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start andorExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal101=null;
        Token LINE_BREAK102=null;
        Token string_literal103=null;
        Token LINE_BREAK104=null;
        notExpression_return notExpression100 = null;

        notExpression_return notExpression105 = null;
        

        Object string_literal101_tree=null;
        Object LINE_BREAK102_tree=null;
        Object string_literal103_tree=null;
        Object LINE_BREAK104_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:3: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_notExpression_in_andorExpression1242);
            notExpression100=notExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, notExpression100.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);
                
                if ( ((LA39_0>=131 && LA39_0<=132)) ) {
                    alt39=1;
                }
                
            
                switch (alt39) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);
            	    
            	    if ( (LA38_0==131) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==132) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("410:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 38, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal101=(Token)input.LT(1);
            	            match(input,131,FOLLOW_131_in_andorExpression1252); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal101_tree = (Object)adaptor.create(string_literal101);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:15: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);
            	                
            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }
            	                
            	            
            	                switch (alt36) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK102=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1257); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal103=(Token)input.LT(1);
            	            match(input,132,FOLLOW_132_in_andorExpression1268); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal103_tree = (Object)adaptor.create(string_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:14: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);
            	                
            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }
            	                
            	            
            	                switch (alt37) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK104=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1273); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1288);
            	    notExpression105=notExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, notExpression105.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop39;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end andorExpression

    public static class notExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start notExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal106=null;
        Token LINE_BREAK107=null;
        notExpression_return notExpression108 = null;

        definedExpression_return definedExpression109 = null;
        

        Object string_literal106_tree=null;
        Object LINE_BREAK107_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:3: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);
            
            if ( (LA41_0==133) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=HEREDOC_STRING && LA41_0<=FLOAT)||LA41_0==SYMBOL||(LA41_0>=IF_MODIFIER && LA41_0<=UNLESS_MODIFIER)||LA41_0==ID||(LA41_0>=BNOT && LA41_0<=REGEX)||(LA41_0>=SINGLE_QUOTE_STRING && LA41_0<=DOUBLE_QUOTE_STRING)||LA41_0==LCURLY||LA41_0==LPAREN||LA41_0==120||(LA41_0>=122 && LA41_0<=124)||(LA41_0>=134 && LA41_0<=136)) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("416:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 41, 0, input);
            
                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal106=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_notExpression1306); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal106_tree = (Object)adaptor.create(string_literal106);
                    root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:4: ( LINE_BREAK )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);
                        
                        if ( (LA40_0==LINE_BREAK) ) {
                            alt40=1;
                        }
                        
                    
                        switch (alt40) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK107=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1313); if (failed) return retval;
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1321);
                    notExpression108=notExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, notExpression108.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_definedExpression_in_notExpression1327);
                    definedExpression109=definedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression109.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end notExpression

    public static class definedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start definedExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal110=null;
        assignmentExpression_return assignmentExpression111 = null;

        assignmentExpression_return assignmentExpression112 = null;
        

        Object string_literal110_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:2: ( 'defined' assignmentExpression | assignmentExpression )
            int alt42=2;
            int LA42_0 = input.LA(1);
            
            if ( (LA42_0==134) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||LA42_0==SYMBOL||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||LA42_0==ID||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING && LA42_0<=DOUBLE_QUOTE_STRING)||LA42_0==LCURLY||LA42_0==LPAREN||LA42_0==120||(LA42_0>=122 && LA42_0<=124)||(LA42_0>=135 && LA42_0<=136)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("422:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );", 42, 0, input);
            
                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:4: 'defined' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal110=(Token)input.LT(1);
                    match(input,134,FOLLOW_134_in_definedExpression1338); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal110_tree = (Object)adaptor.create(string_literal110);
                    adaptor.addChild(root_0, string_literal110_tree);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1340);
                    assignmentExpression111=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression111.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1351);
                    assignmentExpression112=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression112.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end definedExpression

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start assignmentExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:432:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set115=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression113 = null;

        lhs_return lhs114 = null;

        assignmentExpression_return assignmentExpression116 = null;
        

        Object set115_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:433:2: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);
            
            if ( ((LA43_0>=HEREDOC_STRING && LA43_0<=FLOAT)||LA43_0==SYMBOL||(LA43_0>=IF_MODIFIER && LA43_0<=UNLESS_MODIFIER)||(LA43_0>=BNOT && LA43_0<=REGEX)||(LA43_0>=SINGLE_QUOTE_STRING && LA43_0<=DOUBLE_QUOTE_STRING)||LA43_0==LCURLY||LA43_0==LPAREN||LA43_0==120||(LA43_0>=122 && LA43_0<=124)||(LA43_0>=135 && LA43_0<=136)) ) {
                alt43=1;
            }
            else if ( (LA43_0==ID) ) {
                int LA43_2 = input.LA(2);
                
                if ( (LA43_2==EOF||(LA43_2>=LEFT_SHIFT && LA43_2<=FLOAT)||LA43_2==SYMBOL||(LA43_2>=DIV && LA43_2<=LINE_BREAK)||LA43_2==DOT||(LA43_2>=ID && LA43_2<=POWER)||(LA43_2>=QUESTION && LA43_2<=REGEX)||(LA43_2>=SINGLE_QUOTE_STRING && LA43_2<=DOUBLE_QUOTE_STRING)||(LA43_2>=LCURLY && LA43_2<=RCURLY)||LA43_2==ASSOC||(LA43_2>=LPAREN && LA43_2<=RPAREN)||(LA43_2>=COMMA && LA43_2<=COLON)||(LA43_2>=120 && LA43_2<=127)||(LA43_2>=131 && LA43_2<=132)||(LA43_2>=134 && LA43_2<=136)) ) {
                    alt43=1;
                }
                else if ( ((LA43_2>=ASSIGN && LA43_2<=POWER_ASSIGN)) ) {
                    alt43=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("432:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );", 43, 2, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("432:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );", 43, 0, input);
            
                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:433:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1365);
                    ternaryIfThenElseExpression113=ternaryIfThenElseExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression113.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_lhs_in_assignmentExpression1379);
                    lhs114=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs114.getTree());
                    set115=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(adaptor.create(set115), root_0);
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1381);    throw mse;
                    }

                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1425);
                    assignmentExpression116=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression116.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(lhs114.start,lhs114.stop));
                    }
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentExpression

    public static class ternaryIfThenElseExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start ternaryIfThenElseExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token QUESTION117=null;
        Token char_literal119=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression118 = null;

        rangeExpression_return rangeExpression120 = null;
        

        Object QUESTION117_tree=null;
        Object char_literal119_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:3: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1439);
            r=rangeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt44=2;
            int LA44_0 = input.LA(1);
            
            if ( (LA44_0==QUESTION) ) {
                alt44=1;
            }
            else if ( (LA44_0==EOF||LA44_0==LEFT_SHIFT||(LA44_0>=DIV && LA44_0<=LINE_BREAK)||LA44_0==DOT||(LA44_0>=COMPARE && LA44_0<=POWER)||(LA44_0>=INCLUSIVE_RANGE && LA44_0<=BAND)||LA44_0==RCURLY||LA44_0==ASSOC||LA44_0==RPAREN||(LA44_0>=COMMA && LA44_0<=COLON)||LA44_0==121||(LA44_0>=125 && LA44_0<=127)||(LA44_0>=131 && LA44_0<=132)) ) {
                alt44=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("438:23: ( QUESTION rangeExpression ':' rangeExpression | )", 44, 0, input);
            
                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION117=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1443); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION117_tree = (Object)adaptor.create(QUESTION117);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION117_tree, root_0);
                    }
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1446);
                    rangeExpression118=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression118.getTree());
                    char_literal119=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1448); if (failed) return retval;
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1451);
                    rangeExpression120=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression120.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:73: 
                    {
                    }
                    break;
            
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ternaryIfThenElseExpression

    public static class rangeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start rangeExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INCLUSIVE_RANGE122=null;
        Token LINE_BREAK123=null;
        Token EXCLUSIVE_RANGE124=null;
        Token LINE_BREAK125=null;
        logicalOrExpression_return logicalOrExpression121 = null;

        logicalOrExpression_return logicalOrExpression126 = null;
        

        Object INCLUSIVE_RANGE122_tree=null;
        Object LINE_BREAK123_tree=null;
        Object EXCLUSIVE_RANGE124_tree=null;
        Object LINE_BREAK125_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:3: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1468);
            logicalOrExpression121=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression121.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);
                
                if ( (LA48_0==INCLUSIVE_RANGE) ) {
                    alt48=1;
                }
                else if ( (LA48_0==EXCLUSIVE_RANGE) ) {
                    alt48=1;
                }
                
            
                switch (alt48) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);
            	    
            	    if ( (LA47_0==INCLUSIVE_RANGE) ) {
            	        alt47=1;
            	    }
            	    else if ( (LA47_0==EXCLUSIVE_RANGE) ) {
            	        alt47=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("445:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 47, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE122=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1487); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            INCLUSIVE_RANGE122_tree = (Object)adaptor.create(INCLUSIVE_RANGE122);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE122_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:24: ( LINE_BREAK )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);
            	                
            	                if ( (LA45_0==LINE_BREAK) ) {
            	                    alt45=1;
            	                }
            	                
            	            
            	                switch (alt45) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK123=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1491); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE124=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1502); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EXCLUSIVE_RANGE124_tree = (Object)adaptor.create(EXCLUSIVE_RANGE124);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE124_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:24: ( LINE_BREAK )*
            	            loop46:
            	            do {
            	                int alt46=2;
            	                int LA46_0 = input.LA(1);
            	                
            	                if ( (LA46_0==LINE_BREAK) ) {
            	                    alt46=1;
            	                }
            	                
            	            
            	                switch (alt46) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1506); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop46;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1521);
            	    logicalOrExpression126=logicalOrExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression126.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop48;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rangeExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start logicalOrExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LOGICAL_OR128=null;
        Token LINE_BREAK129=null;
        logicalAndExpression_return logicalAndExpression127 = null;

        logicalAndExpression_return logicalAndExpression130 = null;
        

        Object LOGICAL_OR128_tree=null;
        Object LINE_BREAK129_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:3: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1541);
            logicalAndExpression127=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression127.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:455:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);
                
                if ( (LA50_0==LOGICAL_OR) ) {
                    alt50=1;
                }
                
            
                switch (alt50) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR128=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1573); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_OR128_tree = (Object)adaptor.create(LOGICAL_OR128);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR128_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:18: ( LINE_BREAK )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);
            	        
            	        if ( (LA49_0==LINE_BREAK) ) {
            	            alt49=1;
            	        }
            	        
            	    
            	        switch (alt49) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK129=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1578); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1587);
            	    logicalAndExpression130=logicalAndExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression130.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop50;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start logicalAndExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LOGICAL_AND132=null;
        Token LINE_BREAK133=null;
        equalityExpression_return equalityExpression131 = null;

        equalityExpression_return equalityExpression134 = null;
        

        Object LOGICAL_AND132_tree=null;
        Object LINE_BREAK133_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:3: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1607);
            equalityExpression131=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression131.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);
                
                if ( (LA52_0==LOGICAL_AND) ) {
                    alt52=1;
                }
                
            
                switch (alt52) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND132=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1639); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_AND132_tree = (Object)adaptor.create(LOGICAL_AND132);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND132_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:19: ( LINE_BREAK )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);
            	        
            	        if ( (LA51_0==LINE_BREAK) ) {
            	            alt51=1;
            	        }
            	        
            	    
            	        switch (alt51) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK133=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1644); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1653);
            	    equalityExpression134=equalityExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression134.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop52;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start equalityExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:471:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token COMPARE136=null;
        Token LINE_BREAK137=null;
        Token EQUAL138=null;
        Token LINE_BREAK139=null;
        Token CASE_EQUAL140=null;
        Token LINE_BREAK141=null;
        Token NOT_EQUAL142=null;
        Token LINE_BREAK143=null;
        Token MATCH144=null;
        Token LINE_BREAK145=null;
        Token NOT_MATCH146=null;
        Token LINE_BREAK147=null;
        relationalExpression_return relationalExpression135 = null;

        relationalExpression_return relationalExpression148 = null;
        

        Object COMPARE136_tree=null;
        Object LINE_BREAK137_tree=null;
        Object EQUAL138_tree=null;
        Object LINE_BREAK139_tree=null;
        Object CASE_EQUAL140_tree=null;
        Object LINE_BREAK141_tree=null;
        Object NOT_EQUAL142_tree=null;
        Object LINE_BREAK143_tree=null;
        Object MATCH144_tree=null;
        Object LINE_BREAK145_tree=null;
        Object NOT_MATCH146_tree=null;
        Object LINE_BREAK147_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:3: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1673);
            relationalExpression135=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression135.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop60:
            do {
                int alt60=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt60=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt60=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt60=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt60=1;
                    }
                    break;
                case MATCH:
                    {
                    alt60=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt60=1;
                    }
                    break;
                
                }
            
                switch (alt60) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt59=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt59=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt59=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt59=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("474:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 59, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt59) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE136=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1707); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            COMPARE136_tree = (Object)adaptor.create(COMPARE136);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE136_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:17: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);
            	                
            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }
            	                
            	            
            	                switch (alt53) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1712); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL138=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1723); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQUAL138_tree = (Object)adaptor.create(EQUAL138);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL138_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:16: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);
            	                
            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }
            	                
            	            
            	                switch (alt54) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK139=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1729); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL140=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1740); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            CASE_EQUAL140_tree = (Object)adaptor.create(CASE_EQUAL140);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL140_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:19: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);
            	                
            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }
            	                
            	            
            	                switch (alt55) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK141=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1744); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL142=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1755); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_EQUAL142_tree = (Object)adaptor.create(NOT_EQUAL142);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL142_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:19: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);
            	                
            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }
            	                
            	            
            	                switch (alt56) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK143=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1760); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 5 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH144=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1771); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MATCH144_tree = (Object)adaptor.create(MATCH144);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH144_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:16: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);
            	                
            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }
            	                
            	            
            	                switch (alt57) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK145=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1777); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 6 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH146=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1788); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_MATCH146_tree = (Object)adaptor.create(NOT_MATCH146);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH146_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:19: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);
            	                
            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }
            	                
            	            
            	                switch (alt58) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1793); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1808);
            	    relationalExpression148=relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression148.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop60;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start relationalExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LESS_THAN150=null;
        Token LINE_BREAK151=null;
        Token GREATER_THAN152=null;
        Token LINE_BREAK153=null;
        Token LESS_OR_EQUAL154=null;
        Token LINE_BREAK155=null;
        Token GREATER_OR_EQUAL156=null;
        Token LINE_BREAK157=null;
        orExpression_return orExpression149 = null;

        orExpression_return orExpression158 = null;
        

        Object LESS_THAN150_tree=null;
        Object LINE_BREAK151_tree=null;
        Object GREATER_THAN152_tree=null;
        Object LINE_BREAK153_tree=null;
        Object LESS_OR_EQUAL154_tree=null;
        Object LINE_BREAK155_tree=null;
        Object GREATER_OR_EQUAL156_tree=null;
        Object LINE_BREAK157_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:3: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_orExpression_in_relationalExpression1829);
            orExpression149=orExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpression149.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop66:
            do {
                int alt66=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt66=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt66=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt66=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt66=1;
                    }
                    break;
                
                }
            
                switch (alt66) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt65=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt65=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt65=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt65=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt65=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("490:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 65, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt65) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN150=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1863); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_THAN150_tree = (Object)adaptor.create(LESS_THAN150);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN150_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:20: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);
            	                
            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }
            	                
            	            
            	                switch (alt61) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK151=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1869); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN152=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1880); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_THAN152_tree = (Object)adaptor.create(GREATER_THAN152);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN152_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:22: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);
            	                
            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }
            	                
            	            
            	                switch (alt62) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK153=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1885); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL154=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1896); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_OR_EQUAL154_tree = (Object)adaptor.create(LESS_OR_EQUAL154);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL154_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:23: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);
            	                
            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }
            	                
            	            
            	                switch (alt63) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK155=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1901); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL156=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1912); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_OR_EQUAL156_tree = (Object)adaptor.create(GREATER_OR_EQUAL156);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL156_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:25: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);
            	                
            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }
            	                
            	            
            	                switch (alt64) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1916); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1931);
            	    orExpression158=orExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, orExpression158.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop66;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpression

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start orExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:500:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BXOR160=null;
        Token LINE_BREAK161=null;
        Token BOR162=null;
        Token LINE_BREAK163=null;
        andExpression_return andExpression159 = null;

        andExpression_return andExpression164 = null;
        

        Object BXOR160_tree=null;
        Object LINE_BREAK161_tree=null;
        Object BOR162_tree=null;
        Object LINE_BREAK163_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:3: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_andExpression_in_orExpression1951);
            andExpression159=andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpression159.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:502:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);
                
                if ( (LA70_0==BXOR) ) {
                    alt70=1;
                }
                else if ( (LA70_0==BOR) ) {
                    alt70=1;
                }
                
            
                switch (alt70) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);
            	    
            	    if ( (LA69_0==BXOR) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==BOR) ) {
            	        alt69=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("503:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 69, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR160=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1985); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BXOR160_tree = (Object)adaptor.create(BXOR160);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR160_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:15: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);
            	                
            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }
            	                
            	            
            	                switch (alt67) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1991); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:504:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR162=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression2002); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BOR162_tree = (Object)adaptor.create(BOR162);
            	            root_0 = (Object)adaptor.becomeRoot(BOR162_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:504:14: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);
            	                
            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }
            	                
            	            
            	                switch (alt68) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:504:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK163=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2008); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2023);
            	    andExpression164=andExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, andExpression164.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop70;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start andExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BAND166=null;
        Token LINE_BREAK167=null;
        shiftExpression_return shiftExpression165 = null;

        shiftExpression_return shiftExpression168 = null;
        

        Object BAND166_tree=null;
        Object LINE_BREAK167_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:3: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_shiftExpression_in_andExpression2043);
            shiftExpression165=shiftExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression165.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);
                
                if ( (LA72_0==BAND) ) {
                    alt72=1;
                }
                
            
                switch (alt72) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND166=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2075); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BAND166_tree = (Object)adaptor.create(BAND166);
            	    root_0 = (Object)adaptor.becomeRoot(BAND166_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:13: ( LINE_BREAK )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);
            	        
            	        if ( (LA71_0==LINE_BREAK) ) {
            	            alt71=1;
            	        }
            	        
            	    
            	        switch (alt71) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK167=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2081); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2090);
            	    shiftExpression168=shiftExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression168.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop72;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start shiftExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LEFT_SHIFT170=null;
        Token LINE_BREAK171=null;
        Token RIGHT_SHIFT172=null;
        Token LINE_BREAK173=null;
        additiveExpression_return additiveExpression169 = null;

        additiveExpression_return additiveExpression174 = null;
        

        Object LEFT_SHIFT170_tree=null;
        Object LINE_BREAK171_tree=null;
        Object RIGHT_SHIFT172_tree=null;
        Object LINE_BREAK173_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:3: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2112);
            additiveExpression169=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression169.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);
                
                if ( (LA76_0==LEFT_SHIFT) ) {
                    alt76=1;
                }
                else if ( (LA76_0==RIGHT_SHIFT) ) {
                    alt76=1;
                }
                
            
                switch (alt76) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);
            	    
            	    if ( (LA75_0==LEFT_SHIFT) ) {
            	        alt75=1;
            	    }
            	    else if ( (LA75_0==RIGHT_SHIFT) ) {
            	        alt75=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("525:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 75, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT170=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2146); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LEFT_SHIFT170_tree = (Object)adaptor.create(LEFT_SHIFT170);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT170_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:20: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);
            	                
            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }
            	                
            	            
            	                switch (alt73) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK171=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2151); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT172=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2162); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            RIGHT_SHIFT172_tree = (Object)adaptor.create(RIGHT_SHIFT172);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT172_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:20: ( LINE_BREAK )*
            	            loop74:
            	            do {
            	                int alt74=2;
            	                int LA74_0 = input.LA(1);
            	                
            	                if ( (LA74_0==LINE_BREAK) ) {
            	                    alt74=1;
            	                }
            	                
            	            
            	                switch (alt74) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK173=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2166); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop74;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2181);
            	    additiveExpression174=additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression174.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop76;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start additiveExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token PLUS176=null;
        Token LINE_BREAK177=null;
        Token MINUS178=null;
        Token LINE_BREAK179=null;
        multiplicativeExpression_return multiplicativeExpression175 = null;

        multiplicativeExpression_return multiplicativeExpression180 = null;
        

        Object PLUS176_tree=null;
        Object LINE_BREAK177_tree=null;
        Object MINUS178_tree=null;
        Object LINE_BREAK179_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:3: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2203);
            multiplicativeExpression175=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression175.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:537:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);
                
                if ( (LA80_0==PLUS) ) {
                    alt80=1;
                }
                else if ( (LA80_0==MINUS) ) {
                    alt80=1;
                }
                
            
                switch (alt80) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);
            	    
            	    if ( (LA79_0==PLUS) ) {
            	        alt79=1;
            	    }
            	    else if ( (LA79_0==MINUS) ) {
            	        alt79=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("538:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 79, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS176=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2237); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS176_tree = (Object)adaptor.create(PLUS176);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS176_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:16: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);
            	                
            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }
            	                
            	            
            	                switch (alt77) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK177=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2244); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS178=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2255); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS178_tree = (Object)adaptor.create(MINUS178);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS178_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:17: ( LINE_BREAK )*
            	            loop78:
            	            do {
            	                int alt78=2;
            	                int LA78_0 = input.LA(1);
            	                
            	                if ( (LA78_0==LINE_BREAK) ) {
            	                    alt78=1;
            	                }
            	                
            	            
            	                switch (alt78) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK179=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2262); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop78;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2277);
            	    multiplicativeExpression180=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression180.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop80;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start multiplicativeExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token STAR182=null;
        Token LINE_BREAK183=null;
        Token DIV184=null;
        Token LINE_BREAK185=null;
        Token MOD186=null;
        Token LINE_BREAK187=null;
        powerExpression_return powerExpression181 = null;

        powerExpression_return powerExpression188 = null;
        

        Object STAR182_tree=null;
        Object LINE_BREAK183_tree=null;
        Object DIV184_tree=null;
        Object LINE_BREAK185_tree=null;
        Object MOD186_tree=null;
        Object LINE_BREAK187_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:547:3: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:547:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2297);
            powerExpression181=powerExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression181.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop85:
            do {
                int alt85=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt85=1;
                    }
                    break;
                case DIV:
                    {
                    alt85=1;
                    }
                    break;
                case MOD:
                    {
                    alt85=1;
                    }
                    break;
                
                }
            
                switch (alt85) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt84=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt84=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt84=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt84=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("549:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 84, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt84) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR182=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2331); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            STAR182_tree = (Object)adaptor.create(STAR182);
            	            root_0 = (Object)adaptor.becomeRoot(STAR182_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:15: ( LINE_BREAK )*
            	            loop81:
            	            do {
            	                int alt81=2;
            	                int LA81_0 = input.LA(1);
            	                
            	                if ( (LA81_0==LINE_BREAK) ) {
            	                    alt81=1;
            	                }
            	                
            	            
            	                switch (alt81) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK183=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2337); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop81;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:550:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV184=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2348); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV184_tree = (Object)adaptor.create(DIV184);
            	            root_0 = (Object)adaptor.becomeRoot(DIV184_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:550:14: ( LINE_BREAK )*
            	            loop82:
            	            do {
            	                int alt82=2;
            	                int LA82_0 = input.LA(1);
            	                
            	                if ( (LA82_0==LINE_BREAK) ) {
            	                    alt82=1;
            	                }
            	                
            	            
            	                switch (alt82) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:550:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK185=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2354); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop82;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD186=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2365); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD186_tree = (Object)adaptor.create(MOD186);
            	            root_0 = (Object)adaptor.becomeRoot(MOD186_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:14: ( LINE_BREAK )*
            	            loop83:
            	            do {
            	                int alt83=2;
            	                int LA83_0 = input.LA(1);
            	                
            	                if ( (LA83_0==LINE_BREAK) ) {
            	                    alt83=1;
            	                }
            	                
            	            
            	                switch (alt83) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK187=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2371); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop83;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2386);
            	    powerExpression188=powerExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression188.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop85;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start powerExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token POWER190=null;
        Token LINE_BREAK191=null;
        bnotExpression_return bnotExpression189 = null;

        bnotExpression_return bnotExpression192 = null;
        

        Object POWER190_tree=null;
        Object LINE_BREAK191_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:560:3: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:560:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_bnotExpression_in_powerExpression2407);
            bnotExpression189=bnotExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression189.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);
                
                if ( (LA87_0==POWER) ) {
                    alt87=1;
                }
                
            
                switch (alt87) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER190=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2442); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    POWER190_tree = (Object)adaptor.create(POWER190);
            	    root_0 = (Object)adaptor.becomeRoot(POWER190_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:14: ( LINE_BREAK )*
            	    loop86:
            	    do {
            	        int alt86=2;
            	        int LA86_0 = input.LA(1);
            	        
            	        if ( (LA86_0==LINE_BREAK) ) {
            	            alt86=1;
            	        }
            	        
            	    
            	        switch (alt86) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK191=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2448); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop86;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2457);
            	    bnotExpression192=bnotExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression192.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop87;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end powerExpression

    public static class bnotExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start bnotExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BNOT193=null;
        Token LINE_BREAK194=null;
        Token NOT195=null;
        Token LINE_BREAK196=null;
        command_return command197 = null;
        

        Object BNOT193_tree=null;
        Object LINE_BREAK194_tree=null;
        Object NOT195_tree=null;
        Object LINE_BREAK196_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:3: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop90:
            do {
                int alt90=3;
                int LA90_0 = input.LA(1);
                
                if ( (LA90_0==BNOT) ) {
                    alt90=1;
                }
                else if ( (LA90_0==NOT) ) {
                    alt90=2;
                }
                
            
                switch (alt90) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT193=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2479); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BNOT193_tree = (Object)adaptor.create(BNOT193);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT193_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:15: ( LINE_BREAK )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);
            	        
            	        if ( (LA88_0==LINE_BREAK) ) {
            	            alt88=1;
            	        }
            	        
            	    
            	        switch (alt88) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK194=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2485); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop88;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            	case 2 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT195=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2495); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT195_tree = (Object)adaptor.create(NOT195);
            	    root_0 = (Object)adaptor.becomeRoot(NOT195_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:13: ( LINE_BREAK )*
            	    loop89:
            	    do {
            	        int alt89=2;
            	        int LA89_0 = input.LA(1);
            	        
            	        if ( (LA89_0==LINE_BREAK) ) {
            	            alt89=1;
            	        }
            	        
            	    
            	        switch (alt89) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK196=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2501); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop89;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            
            	default :
            	    break loop90;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2515);
            command197=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command197.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bnotExpression

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start command
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal198=null;
        Token string_literal199=null;
        Token char_literal206=null;
        Token char_literal208=null;
        Token DOT209=null;
        literal_return literal200 = null;

        boolean_expression_return boolean_expression201 = null;

        block_expression_return block_expression202 = null;

        if_expression_return if_expression203 = null;

        unless_expression_return unless_expression204 = null;

        atom_return atom205 = null;

        expression_return expression207 = null;

        method_return method210 = null;
        

        Object string_literal198_tree=null;
        Object string_literal199_tree=null;
        Object char_literal206_tree=null;
        Object char_literal208_tree=null;
        Object DOT209_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:2: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )
            int alt91=9;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt91=1;
                }
                break;
            case 136:
                {
                alt91=2;
                }
                break;
            case HEREDOC_STRING:
            case FLOAT:
            case SYMBOL:
            case INT:
            case ARRAY:
            case REGEX:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt91=3;
                }
                break;
            case 122:
            case 123:
            case 124:
                {
                alt91=4;
                }
                break;
            case 120:
                {
                alt91=5;
                }
                break;
            case IF_MODIFIER:
                {
                alt91=6;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt91=7;
                }
                break;
            case ID:
            case LCURLY:
                {
                alt91=8;
                }
                break;
            case LPAREN:
                {
                alt91=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("576:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 91, 0, input);
            
                throw nvae;
            }
            
            switch (alt91) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:4: 'expression0'
                    {
                    string_literal198=(Token)input.LT(1);
                    match(input,135,FOLLOW_135_in_command2530); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal198_tree = (Object)adaptor.create(string_literal198);
                    adaptor.addChild(root_0, string_literal198_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:20: 'expression1'
                    {
                    string_literal199=(Token)input.LT(1);
                    match(input,136,FOLLOW_136_in_command2534); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal199_tree = (Object)adaptor.create(string_literal199);
                    adaptor.addChild(root_0, string_literal199_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2537);
                    literal200=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal200.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2539);
                    boolean_expression201=boolean_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression201.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2542);
                    block_expression202=block_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_expression202.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2544);
                    if_expression203=if_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, if_expression203.getTree());
                    
                    }
                    break;
                case 7 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2546);
                    unless_expression204=unless_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unless_expression204.getTree());
                    
                    }
                    break;
                case 8 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2548);
                    atom205=atom(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atom205.getTree());
                    
                    }
                    break;
                case 9 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:125: '(' expression ')'
                    {
                    char_literal206=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_command2553); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal206_tree = (Object)adaptor.create(char_literal206);
                    adaptor.addChild(root_0, char_literal206_tree);
                    }
                    pushFollow(FOLLOW_expression_in_command2555);
                    expression207=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression207.getTree());
                    char_literal208=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_command2557); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal208_tree = (Object)adaptor.create(char_literal208);
                    adaptor.addChild(root_0, char_literal208_tree);
                    }
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:146: ( DOT method[false] )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);
                
                if ( (LA92_0==DOT) ) {
                    alt92=1;
                }
                
            
                switch (alt92) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:147: DOT method[false]
            	    {
            	    DOT209=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2562); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOT209_tree = (Object)adaptor.create(DOT209);
            	    root_0 = (Object)adaptor.becomeRoot(DOT209_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_method_in_command2565);
            	    method210=method(false);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, method210.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop92;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( backtracking==0 ) {
              System.out.println("add virtual Token EXPR_END");tokenStream.addVirtualToken(((Token)retval.stop).getTokenIndex(), VirtualToken.EXPR_END);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start atom
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:1: atom[boolean topLevel] : ( methodExpression[topLevel] | hash );
    public final atom_return atom(boolean topLevel) throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodExpression_return methodExpression211 = null;

        hash_return hash212 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:24: ( methodExpression[topLevel] | hash )
            int alt93=2;
            int LA93_0 = input.LA(1);
            
            if ( (LA93_0==ID) ) {
                alt93=1;
            }
            else if ( (LA93_0==LCURLY) ) {
                alt93=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("578:1: atom[boolean topLevel] : ( methodExpression[topLevel] | hash );", 93, 0, input);
            
                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:26: methodExpression[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_methodExpression_in_atom2579);
                    methodExpression211=methodExpression(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, methodExpression211.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:53: hash
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_hash_in_atom2582);
                    hash212=hash();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, hash212.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end atom

    public static class methodExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start methodExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        variable_return variable213 = null;

        method_return method214 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:2: ( variable | method[topLevel] )
            int alt94=2;
            int LA94_0 = input.LA(1);
            
            if ( (LA94_0==ID) ) {
                int LA94_1 = input.LA(2);
                
                if ( (isDefinedVar(input.LT(1).getText())) ) {
                    alt94=1;
                }
                else if ( (true) ) {
                    alt94=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("579:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 94, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("579:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 94, 0, input);
            
                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:9: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_methodExpression2596);
                    variable213=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable213.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:18: method[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_method_in_methodExpression2598);
                    method214=method(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, method214.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end methodExpression

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start variable
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID215=null;

        Object ID215_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:9: ({...}? ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:11: {...}? ID
            {
            if ( !(isDefinedVar(input.LT(1).getText())) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "variable", "isDefinedVar(input.LT(1).getText())");
            }
            ID215=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2607); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID215);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 581:53: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:56: ^( VARIABLE ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variable

    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start method
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID216=null;
        Token ID217=null;
        open_args_return open_args218 = null;
        

        Object ID216_tree=null;
        Object ID217_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:26: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:28: {...}? ID
                    {
                    if ( !(!isDefinedVar(input.LT(1).getText())) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(input.LT(1).getText())");
                    }
                    ID216=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2625); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID216);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 582:71: -> ^( CALL ID )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:74: ^( CALL ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:583:17: ID open_args
                    {
                    ID217=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2651); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID217);

                    pushFollow(FOLLOW_open_args_in_method2653);
                    open_args218=open_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_open_args.add(open_args218.getTree());

                    // AST REWRITE
                    // elements: open_args, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 583:30: -> ^( CALL ID open_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:583:33: ^( CALL ID open_args )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        adaptor.addChild(root_1, stream_open_args.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end method

    public static class open_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start open_args
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal219=null;
        Token char_literal221=null;
        Token char_literal222=null;
        Token char_literal223=null;
        call_args_return call_args220 = null;

        call_args_return call_args224 = null;
        

        Object char_literal219_tree=null;
        Object char_literal221_tree=null;
        Object char_literal222_tree=null;
        Object char_literal223_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:598:2: ( '(' call_args ')' | '(' ')' | call_args )
            int alt96=3;
            int LA96_0 = input.LA(1);
            
            if ( (LA96_0==LPAREN) ) {
                int LA96_1 = input.LA(2);
                
                if ( (synpred1()) ) {
                    alt96=1;
                }
                else if ( (synpred2()) ) {
                    alt96=2;
                }
                else if ( (true) ) {
                    alt96=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("597:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 96, 1, input);
                
                    throw nvae;
                }
            }
            else if ( ((LA96_0>=HEREDOC_STRING && LA96_0<=FLOAT)||LA96_0==SYMBOL||(LA96_0>=IF_MODIFIER && LA96_0<=UNLESS_MODIFIER)||LA96_0==ID||(LA96_0>=BNOT && LA96_0<=REGEX)||(LA96_0>=SINGLE_QUOTE_STRING && LA96_0<=DOUBLE_QUOTE_STRING)||LA96_0==LCURLY||LA96_0==120||(LA96_0>=122 && LA96_0<=124)||(LA96_0>=134 && LA96_0<=136)) ) {
                alt96=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("597:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 96, 0, input);
            
                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:598:4: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal219=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2691); if (failed) return retval;
                    pushFollow(FOLLOW_call_args_in_open_args2694);
                    call_args220=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args220.getTree());
                    char_literal221=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2696); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:4: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal222=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2702); if (failed) return retval;
                    char_literal223=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2705); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_call_args_in_open_args2711);
                    call_args224=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args224.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end open_args

    public static class call_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start call_args
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        args_return args225 = null;
        

        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:2: ( args -> ^( ARG args ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2739);
            args225=args();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_args.add(args225.getTree());

            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 611:10: -> ^( ARG args )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:13: ^( ARG args )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARG, "ARG"), root_1);

                adaptor.addChild(root_1, stream_args.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end call_args

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start args
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal227=null;
        arg_return arg226 = null;

        arg_return arg228 = null;
        

        Object char_literal227_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:6: ( arg ( ',' arg )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_arg_in_args2757);
            arg226=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg226.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:12: ( ',' arg )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);
                
                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }
                
            
                switch (alt97) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:13: ',' arg
            	    {
            	    char_literal227=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2760); if (failed) return retval;
            	    pushFollow(FOLLOW_arg_in_args2763);
            	    arg228=arg();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, arg228.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop97;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end args

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start arg
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        definedExpression_return definedExpression229 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:5: ( definedExpression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_definedExpression_in_arg2774);
            definedExpression229=definedExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression229.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arg

    public static class operation1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start operation1
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set230=null;

        Object set230_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:16: ( ID | CONSTANT | FID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set230=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set230));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_operation10);    throw mse;
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end operation1

    public static class operation2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start operation2
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID231=null;
        Token CONSTANT232=null;
        Token FID233=null;
        op_return op234 = null;
        

        Object ID231_tree=null;
        Object CONSTANT232_tree=null;
        Object FID233_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:15: ( ID | CONSTANT | FID | op )
            int alt98=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt98=1;
                }
                break;
            case CONSTANT:
                {
                alt98=2;
                }
                break;
            case FID:
                {
                alt98=3;
                }
                break;
            case LEFT_SHIFT:
            case DIV:
            case MOD:
            case COMPARE:
            case EQUAL:
            case CASE_EQUAL:
            case MATCH:
            case GREATER_THAN:
            case GREATER_OR_EQUAL:
            case LESS_THAN:
            case LESS_OR_EQUAL:
            case RIGHT_SHIFT:
            case PLUS:
            case MINUS:
            case STAR:
            case POWER:
            case BXOR:
            case BOR:
            case BAND:
            case BNOT:
            case EMPTY_ARRAY:
            case 130:
                {
                alt98=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("622:1: operation2 : ( ID | CONSTANT | FID | op );", 98, 0, input);
            
                throw nvae;
            }
            
            switch (alt98) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID231=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22812); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID231_tree = (Object)adaptor.create(ID231);
                    adaptor.addChild(root_0, ID231_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT232=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22816); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT232_tree = (Object)adaptor.create(CONSTANT232);
                    adaptor.addChild(root_0, CONSTANT232_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:33: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID233=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22820); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID233_tree = (Object)adaptor.create(FID233);
                    adaptor.addChild(root_0, FID233_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:39: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation22824);
                    op234=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op234.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end operation2

    public static class operation3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start operation3
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID235=null;
        Token FID236=null;
        op_return op237 = null;
        

        Object ID235_tree=null;
        Object FID236_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:15: ( ID | FID | op )
            int alt99=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt99=1;
                }
                break;
            case FID:
                {
                alt99=2;
                }
                break;
            case LEFT_SHIFT:
            case DIV:
            case MOD:
            case COMPARE:
            case EQUAL:
            case CASE_EQUAL:
            case MATCH:
            case GREATER_THAN:
            case GREATER_OR_EQUAL:
            case LESS_THAN:
            case LESS_OR_EQUAL:
            case RIGHT_SHIFT:
            case PLUS:
            case MINUS:
            case STAR:
            case POWER:
            case BXOR:
            case BOR:
            case BAND:
            case BNOT:
            case EMPTY_ARRAY:
            case 130:
                {
                alt99=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("625:1: operation3 : ( ID | FID | op );", 99, 0, input);
            
                throw nvae;
            }
            
            switch (alt99) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID235=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32840); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID235_tree = (Object)adaptor.create(ID235);
                    adaptor.addChild(root_0, ID235_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:22: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID236=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation32844); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID236_tree = (Object)adaptor.create(FID236);
                    adaptor.addChild(root_0, FID236_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:28: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation32848);
                    op237=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op237.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end operation3

    public static class lhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start lhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID238=null;

        Object ID238_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:5: ( ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:7: ID
            {
            ID238=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2862); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID238);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 628:10: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:13: ^( VARIABLE ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs

    public static class rhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start rhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression239 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:5: ( expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:7: expression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_expression_in_rhs2878);
            expression239=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression239.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rhs

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start literal
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:1: literal : ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INT240=null;
        Token FLOAT241=null;
        Token ARRAY243=null;
        Token SYMBOL244=null;
        Token REGEX245=null;
        string_return string242 = null;
        

        Object INT240_tree=null;
        Object FLOAT241_tree=null;
        Object ARRAY243_tree=null;
        Object SYMBOL244_tree=null;
        Object REGEX245_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:9: ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX )
            int alt100=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt100=1;
                }
                break;
            case FLOAT:
                {
                alt100=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt100=3;
                }
                break;
            case ARRAY:
                {
                alt100=4;
                }
                break;
            case SYMBOL:
                {
                alt100=5;
                }
                break;
            case REGEX:
                {
                alt100=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("633:1: literal : ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX );", 100, 0, input);
            
                throw nvae;
            }
            
            switch (alt100) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:11: INT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    INT240=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2888); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT240_tree = (Object)adaptor.create(INT240);
                    adaptor.addChild(root_0, INT240_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FLOAT241=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2890); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT241_tree = (Object)adaptor.create(FLOAT241);
                    adaptor.addChild(root_0, FLOAT241_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:21: string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_string_in_literal2892);
                    string242=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string242.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ARRAY243=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2894); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ARRAY243_tree = (Object)adaptor.create(ARRAY243);
                    adaptor.addChild(root_0, ARRAY243_tree);
                    }
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:34: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    SYMBOL244=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2896); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SYMBOL244_tree = (Object)adaptor.create(SYMBOL244);
                    adaptor.addChild(root_0, SYMBOL244_tree);
                    }
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:41: REGEX
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    REGEX245=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2898); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REGEX245_tree = (Object)adaptor.create(REGEX245);
                    adaptor.addChild(root_0, REGEX245_tree);
                    }
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start string
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set246=null;

        Object set246_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:8: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set246=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set246));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_string0);    throw mse;
            }

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end string

    public static class hash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start hash
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:772:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal247=null;
        Token char_literal249=null;
        assoc_list_return assoc_list248 = null;
        

        Object char_literal247_tree=null;
        Object char_literal249_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:772:6: ( '{' assoc_list '}' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:772:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal247=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3848); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal247_tree = (Object)adaptor.create(char_literal247);
            root_0 = (Object)adaptor.becomeRoot(char_literal247_tree, root_0);
            }
            pushFollow(FOLLOW_assoc_list_in_hash3851);
            assoc_list248=assoc_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc_list248.getTree());
            char_literal249=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3853); if (failed) return retval;
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end hash

    public static class assoc_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start assoc_list
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:773:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        assocs_return assocs250 = null;

        trailer_return trailer251 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:774:2: ( assocs trailer )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:774:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assocs_in_assoc_list3862);
            assocs250=assocs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assocs250.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3864);
            trailer251=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer251.getTree());
            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assoc_list

    public static class assocs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start assocs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal253=null;
        assoc_return assoc252 = null;

        assoc_return assoc254 = null;
        

        Object char_literal253_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:8: ( assoc ( ',' assoc )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assoc_in_assocs3873);
            assoc252=assoc();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc252.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:16: ( ',' assoc )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);
                
                if ( (LA101_0==COMMA) ) {
                    int LA101_2 = input.LA(2);
                    
                    if ( ((LA101_2>=HEREDOC_STRING && LA101_2<=FLOAT)||LA101_2==SYMBOL||(LA101_2>=IF_MODIFIER && LA101_2<=UNLESS_MODIFIER)||LA101_2==ID||(LA101_2>=BNOT && LA101_2<=REGEX)||(LA101_2>=SINGLE_QUOTE_STRING && LA101_2<=DOUBLE_QUOTE_STRING)||LA101_2==LCURLY||LA101_2==SYMBOL_NAME||LA101_2==LPAREN||LA101_2==120||(LA101_2>=122 && LA101_2<=124)||(LA101_2>=134 && LA101_2<=136)) ) {
                        alt101=1;
                    }
                    
                
                }
                
            
                switch (alt101) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:18: ',' assoc
            	    {
            	    char_literal253=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3877); if (failed) return retval;
            	    pushFollow(FOLLOW_assoc_in_assocs3880);
            	    assoc254=assoc();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assoc254.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop101;
                }
            } while (true);

            
            }
    
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assocs

    public static class assoc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start assoc
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:777:1: assoc : ( arg ( ASSOC | ',' ) arg | SYMBOL_NAME ':' arg );
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set256=null;
        Token SYMBOL_NAME258=null;
        Token char_literal259=null;
        arg_return arg255 = null;

        arg_return arg257 = null;

        arg_return arg260 = null;
        

        Object set256_tree=null;
        Object SYMBOL_NAME258_tree=null;
        Object char_literal259_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:777:15: ( arg ( ASSOC | ',' ) arg | SYMBOL_NAME ':' arg )
            int alt102=2;
            int LA102_0 = input.LA(1);
            
            if ( ((LA102_0>=HEREDOC_STRING && LA102_0<=FLOAT)||LA102_0==SYMBOL||(LA102_0>=IF_MODIFIER && LA102_0<=UNLESS_MODIFIER)||LA102_0==ID||(LA102_0>=BNOT && LA102_0<=REGEX)||(LA102_0>=SINGLE_QUOTE_STRING && LA102_0<=DOUBLE_QUOTE_STRING)||LA102_0==LCURLY||LA102_0==LPAREN||LA102_0==120||(LA102_0>=122 && LA102_0<=124)||(LA102_0>=134 && LA102_0<=136)) ) {
                alt102=1;
            }
            else if ( (LA102_0==SYMBOL_NAME) ) {
                alt102=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("777:1: assoc : ( arg ( ASSOC | ',' ) arg | SYMBOL_NAME ':' arg );", 102, 0, input);
            
                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:777:17: arg ( ASSOC | ',' ) arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_arg_in_assoc3898);
                    arg255=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg255.getTree());
                    set256=(Token)input.LT(1);
                    if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3900);    throw mse;
                    }

                    pushFollow(FOLLOW_arg_in_assoc3907);
                    arg257=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg257.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:777:40: SYMBOL_NAME ':' arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    SYMBOL_NAME258=(Token)input.LT(1);
                    match(input,SYMBOL_NAME,FOLLOW_SYMBOL_NAME_in_assoc3911); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SYMBOL_NAME258_tree = (Object)adaptor.create(SYMBOL_NAME258);
                    adaptor.addChild(root_0, SYMBOL_NAME258_tree);
                    }
                    char_literal259=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_assoc3913); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal259_tree = (Object)adaptor.create(char_literal259);
                    adaptor.addChild(root_0, char_literal259_tree);
                    }
                    pushFollow(FOLLOW_arg_in_assoc3915);
                    arg260=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg260.getTree());
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assoc

    public static class trailer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start trailer
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK261=null;
        Token char_literal262=null;

        Object LINE_BREAK261_tree=null;
        Object char_literal262_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:16: ( | LINE_BREAK | ',' )
            int alt103=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt103=1;
                }
                break;
            case LINE_BREAK:
                {
                alt103=2;
                }
                break;
            case COMMA:
                {
                alt103=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("781:1: trailer : ( | LINE_BREAK | ',' );", 103, 0, input);
            
                throw nvae;
            }
            
            switch (alt103) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:29: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK261=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer3936); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:45: ','
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal262=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer3941); if (failed) return retval;
                    
                    }
                    break;
            
            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end trailer

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:598:4: ( '(' call_args ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:598:4: '(' call_args ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred12691); if (failed) return ;
        pushFollow(FOLLOW_call_args_in_synpred12694);
        call_args();
        _fsp--;
        if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred12696); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:4: ( '(' ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:4: '(' ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred22702); if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred22705); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred2

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\44\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\176\2\u0088\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\123\uffff\1\3\3\uffff\2\3",
            "\2\4\4\uffff\1\4\14\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\6\uffff\1\4\10\uffff\1\4"+
            "\1\3\3\4\2\3\1\uffff\2\4\3\uffff\4\4",
            "\2\4\4\uffff\1\4\14\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\6\uffff\1\4\10\uffff\1\4"+
            "\1\3\3\4\2\3\1\uffff\2\4\3\uffff\4\4",
            "",
            ""
    };
    
    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;
    
    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }
    
    class DFA5 extends DFA {
    
        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 275:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\45\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\177\1\u0088\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\117\uffff\1\2\11\uffff\1\3",
            "\2\4\4\uffff\1\4\14\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\6\uffff\1\4\10\uffff\7\4"+
            "\1\3\2\4\3\uffff\4\4",
            "",
            "",
            ""
    };
    
    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;
    
    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }
    
    class DFA17 extends DFA {
    
        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "317:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA95_eotS =
        "\112\uffff";
    static final String DFA95_eofS =
        "\1\uffff\1\2\110\uffff";
    static final String DFA95_minS =
        "\1\51\1\13\1\uffff\1\14\1\uffff\1\14\1\13\3\14\100\0";
    static final String DFA95_maxS =
        "\1\51\1\u0088\1\uffff\1\u0088\1\uffff\1\u0088\1\u0082\3\u0088\100"+
        "\0";
    static final String DFA95_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\105\uffff";
    static final String DFA95_specialS =
        "\112\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1",
            "\1\2\2\4\4\uffff\1\4\12\uffff\2\2\1\3\1\5\5\2\1\uffff\1\2\1"+
            "\uffff\1\4\15\2\16\uffff\12\2\5\4\20\uffff\2\4\2\uffff\1\4\1"+
            "\2\2\uffff\1\2\2\uffff\1\4\1\2\3\uffff\2\2\2\uffff\1\4\1\2\3"+
            "\4\3\2\3\uffff\2\2\1\uffff\3\4",
            "",
            "\1\17\1\16\4\uffff\1\21\14\uffff\1\25\1\26\4\uffff\1\2\3\uffff"+
            "\1\27\45\uffff\1\11\1\12\1\15\1\20\1\22\20\uffff\2\17\2\uffff"+
            "\1\30\6\uffff\1\31\10\uffff\1\24\1\uffff\3\23\3\uffff\1\6\1"+
            "\32\3\uffff\1\7\1\10\1\13\1\14",
            "",
            "\2\2\4\uffff\1\2\14\uffff\2\2\4\uffff\1\2\3\uffff\1\2\45\uffff"+
            "\5\2\20\uffff\2\2\2\uffff\1\2\6\uffff\1\2\10\uffff\1\2\1\uffff"+
            "\3\33\3\uffff\2\2\3\uffff\4\2",
            "\1\37\2\uffff\1\35\1\36\15\uffff\2\37\12\uffff\1\34\15\37\25"+
            "\uffff\4\37\43\uffff\1\37\16\uffff\1\37",
            "\1\51\1\50\4\uffff\1\53\14\uffff\1\57\1\60\4\uffff\1\40\3\uffff"+
            "\1\61\45\uffff\1\43\1\44\1\47\1\52\1\54\20\uffff\2\51\2\uffff"+
            "\1\62\6\uffff\1\63\10\uffff\1\56\1\uffff\3\55\10\uffff\1\41"+
            "\1\42\1\45\1\46",
            "\1\72\1\71\4\uffff\1\74\14\uffff\1\100\1\101\10\uffff\1\102"+
            "\45\uffff\1\64\1\65\1\70\1\73\1\75\20\uffff\2\72\2\uffff\1\103"+
            "\6\uffff\1\104\10\uffff\1\77\1\uffff\3\76\12\uffff\1\66\1\67",
            "\1\17\1\16\4\uffff\1\21\14\uffff\1\25\1\26\4\uffff\1\105\3\uffff"+
            "\1\107\45\uffff\1\110\1\111\1\15\1\20\1\22\20\uffff\2\17\2\uffff"+
            "\1\30\6\uffff\1\31\10\uffff\1\106\1\uffff\3\23\12\uffff\1\13"+
            "\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };
    
    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;
    
    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }
    
    class DFA95 extends DFA {
    
        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "582:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program253 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_statement_list_in_program257 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_program259 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list273 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list276 = new BitSet(new long[]{0x0000023180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_statement_in_statement_list279 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_expression_in_statement305 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement308 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_set_in_modifier_line348 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_line_break_in_modifier_line362 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_expression_in_modifier_line366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_block_expression441 = new BitSet(new long[]{0x0000021180043000L,0x1F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_body_in_block_expression443 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_block_expression445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body452 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_statement_list_in_body456 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_body458 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression481 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_expression_in_if_expression486 = new BitSet(new long[]{0x0000002000000000L,0x8020000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression488 = new BitSet(new long[]{0x0000021180043000L,0x7F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_body_in_if_expression501 = new BitSet(new long[]{0x0000000000000000L,0x6200000000000000L});
    public static final BitSet FOLLOW_125_in_if_expression504 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_expression_in_if_expression508 = new BitSet(new long[]{0x0000002000000000L,0x8020000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression510 = new BitSet(new long[]{0x0000021180043000L,0x7F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_body_in_if_expression514 = new BitSet(new long[]{0x0000000000000000L,0x6200000000000000L});
    public static final BitSet FOLLOW_126_in_if_expression528 = new BitSet(new long[]{0x0000021180043000L,0x1F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_body_in_if_expression532 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_if_expression545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator597 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator600 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator602 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator607 = new BitSet(new long[]{0x0000002000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_seperator610 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator612 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression622 = new BitSet(new long[]{0x0000000000000000L,0x1C00000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression624 = new BitSet(new long[]{0x0000002000000000L,0x8020000000000000L});
    public static final BitSet FOLLOW_127_in_unless_expression627 = new BitSet(new long[]{0x0000021180043000L,0x5F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_COLON_in_unless_expression629 = new BitSet(new long[]{0x0000021180043000L,0x5F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_line_break_in_unless_expression631 = new BitSet(new long[]{0x0000021180043000L,0x5F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_body_in_unless_expression643 = new BitSet(new long[]{0x0000000000000000L,0x4200000000000000L});
    public static final BitSet FOLLOW_126_in_unless_expression656 = new BitSet(new long[]{0x0000021180043000L,0x1F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_body_in_unless_expression658 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_unless_expression671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_expression735 = new BitSet(new long[]{0x007FFE006000C800L,0x000800000000F000L,0x0000000000000004L});
    public static final BitSet FOLLOW_fitem_in_expression738 = new BitSet(new long[]{0x007FFE006000C800L,0x000800000000F000L,0x0000000000000004L});
    public static final BitSet FOLLOW_fitem_in_expression740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_methodDefinition760 = new BitSet(new long[]{0x000002200000C000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition764 = new BitSet(new long[]{0x000002200000C000L,0x0000800000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition770 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition772 = new BitSet(new long[]{0x000002000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition776 = new BitSet(new long[]{0x0020023000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition780 = new BitSet(new long[]{0x0000023180043000L,0x1F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition783 = new BitSet(new long[]{0x0000023180043000L,0x1F008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition789 = new BitSet(new long[]{0x0000003000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition793 = new BitSet(new long[]{0x0000003000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_methodDefinition798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton811 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_expression_in_singleton814 = new BitSet(new long[]{0x0000002000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton816 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist875 = new BitSet(new long[]{0x0020022000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist877 = new BitSet(new long[]{0x0000002000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist881 = new BitSet(new long[]{0x0000002000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist904 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args918 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args920 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args923 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args926 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args939 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args941 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args955 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args958 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1009 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args1033 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args1035 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_arg_in_f_opt_args1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_131_in_andorExpression1252 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1257 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_132_in_andorExpression1268 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1273 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1288 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_133_in_notExpression1306 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1313 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_definedExpression1338 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1379 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_set_in_assignmentExpression1381 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1443 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1446 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1448 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1468 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1487 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1491 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1502 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1506 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1521 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1573 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1578 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1639 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1644 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1673 = new BitSet(new long[]{0x00003C0000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1707 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1712 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1723 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1729 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1740 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1744 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1755 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1760 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1771 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1777 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1788 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1793 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1808 = new BitSet(new long[]{0x00003C0000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1829 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1863 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1869 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1880 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1885 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1896 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1901 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1912 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1916 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1931 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1951 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1985 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1991 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_BOR_in_orExpression2002 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2008 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2075 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2081 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2112 = new BitSet(new long[]{0x0004000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2146 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2151 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2162 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2166 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2181 = new BitSet(new long[]{0x0004000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2203 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2237 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2244 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2255 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2262 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2277 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2297 = new BitSet(new long[]{0x0020000060000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2331 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2337 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2348 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2354 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2365 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2371 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2386 = new BitSet(new long[]{0x0020000060000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2407 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2442 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2448 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2457 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2479 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2485 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2495 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2501 = new BitSet(new long[]{0x0000022180043000L,0x1D008130000F8000L,0x0000000000000180L});
    public static final BitSet FOLLOW_command_in_bnotExpression2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_command2530 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_136_in_command2534 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_literal_in_command2537 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2539 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2542 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2544 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2546 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_atom_in_command2548 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_LPAREN_in_command2553 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001E3L});
    public static final BitSet FOLLOW_expression_in_command2555 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_command2557 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_DOT_in_command2562 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_method_in_command2565 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_atom2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2651 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_open_args_in_method2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2691 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_call_args_in_open_args2694 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2702 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2757 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2760 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_arg_in_args2763 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation32844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation32848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3848 = new BitSet(new long[]{0x0000020180043000L,0x1D00A130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_assoc_list_in_hash3851 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3862 = new BitSet(new long[]{0x0000002000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3873 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3877 = new BitSet(new long[]{0x0000020180043000L,0x1D00A130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_assoc_in_assocs3880 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_arg_in_assoc3898 = new BitSet(new long[]{0x0000000000000000L,0x0010100000000000L});
    public static final BitSet FOLLOW_set_in_assoc3900 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_arg_in_assoc3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_NAME_in_assoc3911 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_COLON_in_assoc3913 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_arg_in_assoc3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred12691 = new BitSet(new long[]{0x0000020180043000L,0x1D008130000F8000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_call_args_in_synpred12694 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred12696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred22702 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred22705 = new BitSet(new long[]{0x0000000000000002L});

}