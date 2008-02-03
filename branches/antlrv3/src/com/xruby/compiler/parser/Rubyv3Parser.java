// $ANTLR 3.0.1 D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-03 12:23:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "SYMBOL", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING_SIMPLE", "SINGLE_QUOTE_STRING_COMPLEX", "SINGLE_STRING_CHAR", "DOUBLE_QUOTE_STRING_SIMPLE", "DOUBLE_QUOTE_STRING_COMPLEX", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "SYMBOL_NAME", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'"
    };
    public static final int CASE_EQUAL=44;
    public static final int STAR=53;
    public static final int EMPTY_ARRAY=117;
    public static final int MOD=29;
    public static final int REST_UNUSE=27;
    public static final int MOD_ASSIGN=56;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=120;
    public static final int SINGLE_QUOTE_STRING_SIMPLE=100;
    public static final int REGEX=83;
    public static final int LEFT_SHIFT_ASSIGN=63;
    public static final int NOT=80;
    public static final int UNTIL_MODIFIER=34;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=58;
    public static final int LOGICAL_AND=73;
    public static final int STATEMENT=5;
    public static final int RPAREN=114;
    public static final int HEX_PART=94;
    public static final int DOUBLE_QUOTE_STRING_SIMPLE=103;
    public static final int ARG=10;
    public static final int NESTED_LHS=24;
    public static final int NOT_EQUAL=74;
    public static final int SYMBOL_NAME=111;
    public static final int WHILE_MODIFIER=33;
    public static final int BODY=9;
    public static final int COMMENT=121;
    public static final int ARRAY=82;
    public static final int RBRACK=116;
    public static final int HEREDOC_BEGIN=108;
    public static final int UNLESS_MODIFIER=32;
    public static final int INCLUSIVE_RANGE=70;
    public static final int SYMBOL=30;
    public static final int MINUS_ASSIGN=59;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=104;
    public static final int POWER=54;
    public static final int LCURLY=106;
    public static final int MATCH=45;
    public static final int INT=81;
    public static final int GLOBAL_VARIABLE=93;
    public static final int ESCAPE_INT_PART=97;
    public static final int LINE_BREAK=37;
    public static final int WS=38;
    public static final int VARIABLE=16;
    public static final int INSTANCE_VARIABLE=91;
    public static final int LESS_THAN=48;
    public static final int OCTAL=84;
    public static final int SINGLETON_METHOD=25;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=75;
    public static final int BNOT=79;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=110;
    public static final int NON_LEADING0_NUMBER=99;
    public static final int CONTROL_PART=95;
    public static final int LBRACK=115;
    public static final int IF_MODIFIER=31;
    public static final int BXOR_ASSIGN=112;
    public static final int GREATER_OR_EQUAL=47;
    public static final int FLOAT=13;
    public static final int BLOCK_ARG=21;
    public static final int HEREDOC_STRING=12;
    public static final int ID=41;
    public static final int LPAREN=113;
    public static final int IF=7;
    public static final int EXP_PART=88;
    public static final int RESCUE_MODIFIER=35;
    public static final int SINGLE_QUOTE_STRING_COMPLEX=101;
    public static final int BOR_ASSIGN=61;
    public static final int LEADING0_NUMBER=89;
    public static final int COMMA=118;
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
    public static final int MRHS=23;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=90;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int GREATER_THAN=46;
    public static final int LOGICAL_AND_ASSIGN=66;
    public static final int LEADING_MARK_DECIMAL=87;
    public static final int DOUBLE_STRING_CHAR=105;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
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
    public static final int COLON=119;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=62;
    public static final int CLASS_VARIABLE=92;
    public static final int QUESTION=69;
    public static final int ESCAPE_INT=98;
    public static final int BLOCK=18;
    public static final int RCURLY=107;
    public static final int ASSIGN=55;
    public static final int PLUS_ASSIGN=60;
    public static final int POWER_ASSIGN=68;
    public static final int COMPLEMENT_ASSIGN=57;
    public static final int DIV=28;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int BINARY=86;
    public static final int HEREDOC_INDENT_BEGIN=109;
    public static final int STRING=26;
    
        public Rubyv3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[73+1];
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:17: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);
            
            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING_SIMPLE && LA3_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA3_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA3_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA3_0==LCURLY||LA3_0==LPAREN||LA3_0==COLON||LA3_0==122||(LA3_0>=124 && LA3_0<=126)||(LA3_0>=130 && LA3_0<=131)||(LA3_0>=135 && LA3_0<=138)) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("274:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);
            
                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);
                        
                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }
                        
                    
                        switch (alt1) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program261);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_program265);
                    statement_list2=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list2.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);
                        
                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }
                        
                    
                        switch (alt2) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program267);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:3: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list281);
            statement4=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(statement4.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:16: ( terminal )+ statement
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:16: ( terminal )+
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
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list284);
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

            	    pushFollow(FOLLOW_statement_in_statement_list287);
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
            // 279:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:58: ( statement )*
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:286:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;
        

        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:2: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement313);
            expression7=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression7.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                
                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }
                
            
                switch (alt6) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement316);
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
            // 287:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:59: ( modifier_line )*
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;
        

        Object set9_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:2: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line356);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                
                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }
                
            
                switch (alt7) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line370);
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

            pushFollow(FOLLOW_expression_in_modifier_line374);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:1: block_expression : 'begin' body 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:2: ( 'begin' body 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal12=(Token)input.LT(1);
            match(input,122,FOLLOW_122_in_block_expression449); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);
            }
            pushFollow(FOLLOW_body_in_block_expression451);
            body13=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,123,FOLLOW_123_in_block_expression453); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;
        

        Object SEMI15_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:6: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);
            
            if ( (LA10_0==SEMI||LA10_0==123||(LA10_0>=127 && LA10_0<=128)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING_SIMPLE && LA10_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA10_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA10_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA10_0==LCURLY||LA10_0==LPAREN||LA10_0==COLON||LA10_0==122||(LA10_0>=124 && LA10_0<=126)||(LA10_0>=130 && LA10_0<=131)||(LA10_0>=135 && LA10_0<=138)) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("311:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);
            
                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);
                        
                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }
                        
                    
                        switch (alt8) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body460); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_body464);
                    statement_list16=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list16.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);
                        
                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }
                        
                    
                        switch (alt9) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body466);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set18=null;

        Object set18_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:2: ( 'false' | 'nil' | 'true' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=124 && input.LA(1)<=126) ) {
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:2: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression489); if (failed) return retval;
            if ( backtracking==0 ) stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression494);
            e0=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression496);
            seperator20=seperator();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression509);
            body0=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_body.add(body0.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);
                
                if ( (LA11_0==127) ) {
                    alt11=1;
                }
                
            
                switch (alt11) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,127,FOLLOW_127_in_if_expression512); if (failed) return retval;
            	    if ( backtracking==0 ) stream_127.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression516);
            	    e1=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression518);
            	    seperator22=seperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression522);
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

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);
            
            if ( (LA12_0==128) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_if_expression536); if (failed) return retval;
                    if ( backtracking==0 ) stream_128.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression540);
                    body2=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_body.add(body2.getTree());
                    
                    }
                    break;
            
            }

            string_literal24=(Token)input.LT(1);
            match(input,123,FOLLOW_123_in_if_expression553); if (failed) return retval;
            if ( backtracking==0 ) stream_123.add(string_literal24);


            // AST REWRITE
            // elements: e1, body1, body2, body0, e0
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
            // 318:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:48: ( $body2)?
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:321:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:2: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:3: ( LINE_BREAK )+
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator605); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator608); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        
                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }
                        
                    
                        switch (alt14) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator610); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);
                        
                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }
                        
                    
                        switch (alt15) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator615); if (failed) return retval;
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
                    match(input,129,FOLLOW_129_in_seperator618); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);
                        
                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }
                        
                    
                        switch (alt16) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:322:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator620); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:323:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:2: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression630); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);
            }
            pushFollow(FOLLOW_boolean_expression_in_unless_expression632);
            boolean_expression32=boolean_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression32.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 129:
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
                    new NoViableAltException("324:32: ( 'then' | ':' | line_break )", 18, 0, input);
            
                throw nvae;
            }
            
            switch (alt18) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_unless_expression635); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression637); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression639);
                    line_break35=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break35.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_body_in_unless_expression651);
            body36=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body36.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            
            if ( (LA19_0==128) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_unless_expression664); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);
                    }
                    pushFollow(FOLLOW_body_in_unless_expression666);
                    body38=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, body38.getTree());
                    
                    }
                    break;
            
            }

            string_literal39=(Token)input.LT(1);
            match(input,123,FOLLOW_123_in_unless_expression679); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI40=null;
        line_break_return line_break41 = null;
        

        Object SEMI40_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:9: ( SEMI | line_break )
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
                    new NoViableAltException("328:1: terminal : ( SEMI | line_break );", 20, 0, input);
            
                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal685); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_line_break_in_terminal688);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:2: ( LINE_BREAK )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();
            
            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break698); if (failed) return retval;
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:2: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt21=1;
                }
                break;
            case HEREDOC_STRING:
            case FLOAT:
            case IF_MODIFIER:
            case UNLESS_MODIFIER:
            case ID:
            case BNOT:
            case NOT:
            case INT:
            case ARRAY:
            case REGEX:
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
            case LCURLY:
            case LPAREN:
            case COLON:
            case 122:
            case 124:
            case 125:
            case 126:
            case 135:
            case 136:
            case 137:
            case 138:
                {
                alt21=2;
                }
                break;
            case 131:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("362:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);
            
                throw nvae;
            }
            
            switch (alt21) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal43=(Token)input.LT(1);
                    match(input,130,FOLLOW_130_in_expression743); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
                    }
                    pushFollow(FOLLOW_fitem_in_expression746);
                    fitem44=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression748);
                    fitem45=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem45.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_andorExpression_in_expression750);
                    andorExpression46=andorExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, andorExpression46.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_primaryExpression_in_expression752);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodDefinition_return methodDefinition48 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:2: ( methodDefinition )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_methodDefinition_in_primaryExpression760);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:2: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal49=(Token)input.LT(1);
            match(input,131,FOLLOW_131_in_methodDefinition768); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);
                
                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }
                
            
                switch (alt22) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition772); if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:26: ( singleton dot_or_colon )?
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition778);
                    singleton51=singleton();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition780);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dot_or_colon52.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_methodName_in_methodDefinition784);
            methodName53=methodName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodName53.getTree());
            if ( backtracking==0 ) {
              enterScope();
            }
            pushFollow(FOLLOW_f_arglist_in_methodDefinition788);
            f_arglist54=f_arglist();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f_arglist54.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:89: ( terminal )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition791);
            	    terminal55=terminal();
            	    _fsp--;
            	    if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);
            
            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING_SIMPLE && LA25_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA25_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA25_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA25_0==LCURLY||LA25_0==LPAREN||LA25_0==COLON||LA25_0==122||(LA25_0>=124 && LA25_0<=126)||(LA25_0>=130 && LA25_0<=131)||(LA25_0>=135 && LA25_0<=138)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition797);
                    bodyStatement56=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement56.getTree());
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);
                
                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }
                
            
                switch (alt26) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition801);
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
            match(input,123,FOLLOW_123_in_methodDefinition806); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:1: singleton : ( variable | '(' expression opt_nl ')' );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:2: ( variable | '(' expression opt_nl ')' )
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
                    new NoViableAltException("368:1: singleton : ( variable | '(' expression opt_nl ')' );", 27, 0, input);
            
                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:4: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_singleton817);
                    variable59=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable59.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton819); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_singleton822);
                    expression61=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton824);
                    opt_nl62=opt_nl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton826); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:15: ( | LINE_BREAK )
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
                    new NoViableAltException("370:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);
            
                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:28: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl845); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set65=null;

        Object set65_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:2: ( DOT | COLON2 )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set66=null;

        Object set66_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:2: ( ID | CONSTANT | FID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:2: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
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
                    new NoViableAltException("376:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);
            
                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist883); if (failed) return retval;
                    if ( backtracking==0 ) stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist885);
                    f_args68=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_f_args.add(f_args68.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);
                        
                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }
                        
                    
                        switch (alt29) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist889); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK69);

                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist893); if (failed) return retval;
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
                    // 377:34: -> ^( ARG f_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:37: ^( ARG f_args )
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_args_in_f_arglist912);
                    f_args71=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist914);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:8: ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
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
                    
                    if ( (LA33_5==STAR) ) {
                        alt33=4;
                    }
                    else if ( (LA33_5==ID) ) {
                        alt33=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("379:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 5, input);
                    
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
                        new NoViableAltException("379:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 1, input);
                
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
                    new NoViableAltException("379:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 0, input);
            
                throw nvae;
            }
            
            switch (alt33) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args922);
                    f_norm_args73=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args73.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:24: f_norm_args ',' f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args926);
                    f_norm_args74=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args928); if (failed) return retval;
                    pushFollow(FOLLOW_f_opt_args_in_f_args931);
                    f_opt_args76=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args76.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:52: ( ',' f_rest_arg )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);
                    
                    if ( (LA31_0==COMMA) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:53: ',' f_rest_arg
                            {
                            char_literal77=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args934); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args937);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:2: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:4: f_norm_args ',' f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args947);
                    f_norm_args79=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args79.getTree());
                    char_literal80=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args949); if (failed) return retval;
                    pushFollow(FOLLOW_f_rest_arg_in_f_args952);
                    f_rest_arg81=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg81.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_opt_args_in_f_args963);
                    f_opt_args82=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args82.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:21: ( ',' f_rest_arg )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);
                    
                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:22: ',' f_rest_arg
                            {
                            char_literal83=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args966); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args969);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_rest_arg_in_f_args976);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID86=null;

        Object ID86_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:2: ( ID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:2: ID
            {
            root_0 = (Object)adaptor.nil();
            
            ID86=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args1007); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:2: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
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
                        new NoViableAltException("390:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("390:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 0, input);
            
                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal87=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1017); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
                    }
                    ID88=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg1020); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:38: '*'
                    {
                    char_literal89=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1025); if (failed) return retval;
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
                    // 391:42: -> ^( '*' REST_UNUSE )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:45: ^( '*' REST_UNUSE )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:1: f_opt_args : ID '=' arg ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:2: ( ID '=' arg )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();
            
            ID90=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args1041); if (failed) return retval;
            if ( backtracking==0 ) {
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);
            }
            char_literal91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args1043); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal91_tree = (Object)adaptor.create(char_literal91);
            root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);
            }
            pushFollow(FOLLOW_arg_in_f_opt_args1046);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        statement_list_return statement_list93 = null;
        

        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:2: ( statement_list -> ^( BODY statement_list ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1058);
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
            // 396:19: -> ^( BODY statement_list )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:22: ^( BODY statement_list )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        fname_return fname94 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:7: ( fname )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:9: fname
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_fname_in_fitem1076);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:1: fname : ( ID | CONSTANT | FID | op );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:7: ( ID | CONSTANT | FID | op )
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
            case 132:
                {
                alt35=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("400:1: fname : ( ID | CONSTANT | FID | op );", 35, 0, input);
            
                throw nvae;
            }
            
            switch (alt35) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:9: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID95=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1083); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID95_tree = (Object)adaptor.create(ID95);
                    adaptor.addChild(root_0, ID95_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT96=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1085); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT96_tree = (Object)adaptor.create(CONSTANT96);
                    adaptor.addChild(root_0, CONSTANT96_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:21: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID97=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1087); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID97_tree = (Object)adaptor.create(FID97);
                    adaptor.addChild(root_0, FID97_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:25: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_fname1089);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set99=null;

        Object set99_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:15: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set99=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==132 ) {
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:3: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_notExpression_in_andorExpression1250);
            notExpression100=notExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, notExpression100.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);
                
                if ( ((LA39_0>=133 && LA39_0<=134)) ) {
                    alt39=1;
                }
                
            
                switch (alt39) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);
            	    
            	    if ( (LA38_0==133) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==134) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("414:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 38, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal101=(Token)input.LT(1);
            	            match(input,133,FOLLOW_133_in_andorExpression1260); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal101_tree = (Object)adaptor.create(string_literal101);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:15: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);
            	                
            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }
            	                
            	            
            	                switch (alt36) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK102=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1265); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal103=(Token)input.LT(1);
            	            match(input,134,FOLLOW_134_in_andorExpression1276); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal103_tree = (Object)adaptor.create(string_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:14: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);
            	                
            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }
            	                
            	            
            	                switch (alt37) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK104=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1281); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1296);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:3: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);
            
            if ( (LA41_0==135) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=HEREDOC_STRING && LA41_0<=FLOAT)||(LA41_0>=IF_MODIFIER && LA41_0<=UNLESS_MODIFIER)||LA41_0==ID||(LA41_0>=BNOT && LA41_0<=REGEX)||(LA41_0>=SINGLE_QUOTE_STRING_SIMPLE && LA41_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA41_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA41_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA41_0==LCURLY||LA41_0==LPAREN||LA41_0==COLON||LA41_0==122||(LA41_0>=124 && LA41_0<=126)||(LA41_0>=136 && LA41_0<=138)) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("420:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 41, 0, input);
            
                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal106=(Token)input.LT(1);
                    match(input,135,FOLLOW_135_in_notExpression1314); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal106_tree = (Object)adaptor.create(string_literal106);
                    root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:4: ( LINE_BREAK )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);
                        
                        if ( (LA40_0==LINE_BREAK) ) {
                            alt40=1;
                        }
                        
                    
                        switch (alt40) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK107=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1321); if (failed) return retval;
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1329);
                    notExpression108=notExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, notExpression108.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_definedExpression_in_notExpression1335);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal110=null;
        assignmentExpression_return assignmentExpression111 = null;

        assignmentExpression_return assignmentExpression112 = null;
        

        Object string_literal110_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:2: ( 'defined' assignmentExpression | assignmentExpression )
            int alt42=2;
            int LA42_0 = input.LA(1);
            
            if ( (LA42_0==136) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||LA42_0==ID||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING_SIMPLE && LA42_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA42_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA42_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA42_0==LCURLY||LA42_0==LPAREN||LA42_0==COLON||LA42_0==122||(LA42_0>=124 && LA42_0<=126)||(LA42_0>=137 && LA42_0<=138)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("426:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );", 42, 0, input);
            
                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:4: 'defined' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal110=(Token)input.LT(1);
                    match(input,136,FOLLOW_136_in_definedExpression1346); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal110_tree = (Object)adaptor.create(string_literal110);
                    adaptor.addChild(root_0, string_literal110_tree);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1348);
                    assignmentExpression111=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression111.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1359);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:2: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);
            
            if ( ((LA43_0>=HEREDOC_STRING && LA43_0<=FLOAT)||(LA43_0>=IF_MODIFIER && LA43_0<=UNLESS_MODIFIER)||(LA43_0>=BNOT && LA43_0<=REGEX)||(LA43_0>=SINGLE_QUOTE_STRING_SIMPLE && LA43_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_0==LCURLY||LA43_0==LPAREN||LA43_0==COLON||LA43_0==122||(LA43_0>=124 && LA43_0<=126)||(LA43_0>=137 && LA43_0<=138)) ) {
                alt43=1;
            }
            else if ( (LA43_0==ID) ) {
                int LA43_2 = input.LA(2);
                
                if ( (LA43_2==EOF||(LA43_2>=LEFT_SHIFT && LA43_2<=FLOAT)||(LA43_2>=DIV && LA43_2<=MOD)||(LA43_2>=IF_MODIFIER && LA43_2<=LINE_BREAK)||LA43_2==DOT||(LA43_2>=ID && LA43_2<=POWER)||(LA43_2>=QUESTION && LA43_2<=REGEX)||(LA43_2>=SINGLE_QUOTE_STRING_SIMPLE && LA43_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_2<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA43_2>=LCURLY && LA43_2<=RCURLY)||LA43_2==ASSOC||(LA43_2>=LPAREN && LA43_2<=RPAREN)||(LA43_2>=COMMA && LA43_2<=COLON)||(LA43_2>=122 && LA43_2<=129)||(LA43_2>=133 && LA43_2<=134)||(LA43_2>=136 && LA43_2<=138)) ) {
                    alt43=1;
                }
                else if ( ((LA43_2>=ASSIGN && LA43_2<=POWER_ASSIGN)) ) {
                    alt43=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("436:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );", 43, 2, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("436:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );", 43, 0, input);
            
                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1373);
                    ternaryIfThenElseExpression113=ternaryIfThenElseExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression113.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_lhs_in_assignmentExpression1387);
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1389);    throw mse;
                    }

                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1433);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:3: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1447);
            r=rangeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt44=2;
            int LA44_0 = input.LA(1);
            
            if ( (LA44_0==QUESTION) ) {
                alt44=1;
            }
            else if ( (LA44_0==EOF||LA44_0==LEFT_SHIFT||(LA44_0>=DIV && LA44_0<=MOD)||(LA44_0>=IF_MODIFIER && LA44_0<=LINE_BREAK)||LA44_0==DOT||(LA44_0>=COMPARE && LA44_0<=POWER)||(LA44_0>=INCLUSIVE_RANGE && LA44_0<=BAND)||LA44_0==RCURLY||LA44_0==ASSOC||LA44_0==RPAREN||(LA44_0>=COMMA && LA44_0<=COLON)||LA44_0==123||(LA44_0>=127 && LA44_0<=129)||(LA44_0>=133 && LA44_0<=134)) ) {
                alt44=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("442:23: ( QUESTION rangeExpression ':' rangeExpression | )", 44, 0, input);
            
                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION117=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1451); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION117_tree = (Object)adaptor.create(QUESTION117);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION117_tree, root_0);
                    }
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1454);
                    rangeExpression118=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression118.getTree());
                    char_literal119=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1456); if (failed) return retval;
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1459);
                    rangeExpression120=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression120.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:73: 
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:3: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1476);
            logicalOrExpression121=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression121.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
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
            	            new NoViableAltException("449:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 47, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE122=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1495); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            INCLUSIVE_RANGE122_tree = (Object)adaptor.create(INCLUSIVE_RANGE122);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE122_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:24: ( LINE_BREAK )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);
            	                
            	                if ( (LA45_0==LINE_BREAK) ) {
            	                    alt45=1;
            	                }
            	                
            	            
            	                switch (alt45) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK123=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1499); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE124=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1510); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EXCLUSIVE_RANGE124_tree = (Object)adaptor.create(EXCLUSIVE_RANGE124);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE124_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:24: ( LINE_BREAK )*
            	            loop46:
            	            do {
            	                int alt46=2;
            	                int LA46_0 = input.LA(1);
            	                
            	                if ( (LA46_0==LINE_BREAK) ) {
            	                    alt46=1;
            	                }
            	                
            	            
            	                switch (alt46) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1514); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop46;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1529);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:3: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1549);
            logicalAndExpression127=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression127.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:459:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);
                
                if ( (LA50_0==LOGICAL_OR) ) {
                    alt50=1;
                }
                
            
                switch (alt50) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR128=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1581); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_OR128_tree = (Object)adaptor.create(LOGICAL_OR128);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR128_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:18: ( LINE_BREAK )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);
            	        
            	        if ( (LA49_0==LINE_BREAK) ) {
            	            alt49=1;
            	        }
            	        
            	    
            	        switch (alt49) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK129=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1586); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1595);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:467:3: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:467:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1615);
            equalityExpression131=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression131.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);
                
                if ( (LA52_0==LOGICAL_AND) ) {
                    alt52=1;
                }
                
            
                switch (alt52) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:469:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND132=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1647); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_AND132_tree = (Object)adaptor.create(LOGICAL_AND132);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND132_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:469:19: ( LINE_BREAK )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);
            	        
            	        if ( (LA51_0==LINE_BREAK) ) {
            	            alt51=1;
            	        }
            	        
            	    
            	        switch (alt51) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:469:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK133=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1652); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1661);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:3: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1681);
            relationalExpression135=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression135.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
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
            	            new NoViableAltException("478:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 59, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt59) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE136=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1715); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            COMPARE136_tree = (Object)adaptor.create(COMPARE136);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE136_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:17: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);
            	                
            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }
            	                
            	            
            	                switch (alt53) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1720); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL138=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1731); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQUAL138_tree = (Object)adaptor.create(EQUAL138);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL138_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:16: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);
            	                
            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }
            	                
            	            
            	                switch (alt54) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK139=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1737); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL140=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1748); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            CASE_EQUAL140_tree = (Object)adaptor.create(CASE_EQUAL140);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL140_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:19: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);
            	                
            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }
            	                
            	            
            	                switch (alt55) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK141=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1752); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL142=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1763); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_EQUAL142_tree = (Object)adaptor.create(NOT_EQUAL142);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL142_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:19: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);
            	                
            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }
            	                
            	            
            	                switch (alt56) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK143=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1768); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 5 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH144=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1779); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MATCH144_tree = (Object)adaptor.create(MATCH144);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH144_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:16: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);
            	                
            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }
            	                
            	            
            	                switch (alt57) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK145=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1785); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 6 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH146=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1796); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_MATCH146_tree = (Object)adaptor.create(NOT_MATCH146);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH146_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:19: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);
            	                
            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }
            	                
            	            
            	                switch (alt58) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1801); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1816);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:3: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_orExpression_in_relationalExpression1837);
            orExpression149=orExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpression149.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
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
            	            new NoViableAltException("494:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 65, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt65) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN150=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1871); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_THAN150_tree = (Object)adaptor.create(LESS_THAN150);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN150_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:20: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);
            	                
            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }
            	                
            	            
            	                switch (alt61) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK151=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1877); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN152=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1888); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_THAN152_tree = (Object)adaptor.create(GREATER_THAN152);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN152_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:22: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);
            	                
            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }
            	                
            	            
            	                switch (alt62) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK153=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1893); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL154=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1904); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_OR_EQUAL154_tree = (Object)adaptor.create(LESS_OR_EQUAL154);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL154_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:23: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);
            	                
            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }
            	                
            	            
            	                switch (alt63) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK155=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1909); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL156=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1920); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_OR_EQUAL156_tree = (Object)adaptor.create(GREATER_OR_EQUAL156);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL156_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:25: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);
            	                
            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }
            	                
            	            
            	                switch (alt64) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1924); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1939);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:504:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:3: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_andExpression_in_orExpression1959);
            andExpression159=andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpression159.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
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
            	            new NoViableAltException("507:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 69, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR160=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1993); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BXOR160_tree = (Object)adaptor.create(BXOR160);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR160_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:15: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);
            	                
            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }
            	                
            	            
            	                switch (alt67) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1999); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR162=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression2010); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BOR162_tree = (Object)adaptor.create(BOR162);
            	            root_0 = (Object)adaptor.becomeRoot(BOR162_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:14: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);
            	                
            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }
            	                
            	            
            	                switch (alt68) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK163=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2016); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2031);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:3: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_shiftExpression_in_andExpression2051);
            shiftExpression165=shiftExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression165.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);
                
                if ( (LA72_0==BAND) ) {
                    alt72=1;
                }
                
            
                switch (alt72) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND166=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2083); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BAND166_tree = (Object)adaptor.create(BAND166);
            	    root_0 = (Object)adaptor.becomeRoot(BAND166_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:13: ( LINE_BREAK )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);
            	        
            	        if ( (LA71_0==LINE_BREAK) ) {
            	            alt71=1;
            	        }
            	        
            	    
            	        switch (alt71) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK167=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2089); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2098);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:3: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2120);
            additiveExpression169=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression169.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
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
            	            new NoViableAltException("529:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 75, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT170=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2154); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LEFT_SHIFT170_tree = (Object)adaptor.create(LEFT_SHIFT170);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT170_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:20: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);
            	                
            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }
            	                
            	            
            	                switch (alt73) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK171=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2159); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT172=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2170); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            RIGHT_SHIFT172_tree = (Object)adaptor.create(RIGHT_SHIFT172);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT172_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:20: ( LINE_BREAK )*
            	            loop74:
            	            do {
            	                int alt74=2;
            	                int LA74_0 = input.LA(1);
            	                
            	                if ( (LA74_0==LINE_BREAK) ) {
            	                    alt74=1;
            	                }
            	                
            	            
            	                switch (alt74) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK173=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2174); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop74;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2189);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:3: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2211);
            multiplicativeExpression175=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression175.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
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
            	            new NoViableAltException("542:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 79, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS176=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2245); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS176_tree = (Object)adaptor.create(PLUS176);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS176_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:16: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);
            	                
            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }
            	                
            	            
            	                switch (alt77) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK177=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2252); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS178=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2263); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS178_tree = (Object)adaptor.create(MINUS178);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS178_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:17: ( LINE_BREAK )*
            	            loop78:
            	            do {
            	                int alt78=2;
            	                int LA78_0 = input.LA(1);
            	                
            	                if ( (LA78_0==LINE_BREAK) ) {
            	                    alt78=1;
            	                }
            	                
            	            
            	                switch (alt78) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK179=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2270); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop78;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2285);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:550:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:3: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2305);
            powerExpression181=powerExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression181.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
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
            	            new NoViableAltException("553:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 84, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt84) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR182=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2339); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            STAR182_tree = (Object)adaptor.create(STAR182);
            	            root_0 = (Object)adaptor.becomeRoot(STAR182_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:15: ( LINE_BREAK )*
            	            loop81:
            	            do {
            	                int alt81=2;
            	                int LA81_0 = input.LA(1);
            	                
            	                if ( (LA81_0==LINE_BREAK) ) {
            	                    alt81=1;
            	                }
            	                
            	            
            	                switch (alt81) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK183=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2345); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop81;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV184=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2356); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV184_tree = (Object)adaptor.create(DIV184);
            	            root_0 = (Object)adaptor.becomeRoot(DIV184_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:14: ( LINE_BREAK )*
            	            loop82:
            	            do {
            	                int alt82=2;
            	                int LA82_0 = input.LA(1);
            	                
            	                if ( (LA82_0==LINE_BREAK) ) {
            	                    alt82=1;
            	                }
            	                
            	            
            	                switch (alt82) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK185=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2362); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop82;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD186=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2373); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD186_tree = (Object)adaptor.create(MOD186);
            	            root_0 = (Object)adaptor.becomeRoot(MOD186_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:14: ( LINE_BREAK )*
            	            loop83:
            	            do {
            	                int alt83=2;
            	                int LA83_0 = input.LA(1);
            	                
            	                if ( (LA83_0==LINE_BREAK) ) {
            	                    alt83=1;
            	                }
            	                
            	            
            	                switch (alt83) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK187=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2379); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop83;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2394);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:3: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_bnotExpression_in_powerExpression2415);
            bnotExpression189=bnotExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression189.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);
                
                if ( (LA87_0==POWER) ) {
                    alt87=1;
                }
                
            
                switch (alt87) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER190=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2450); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    POWER190_tree = (Object)adaptor.create(POWER190);
            	    root_0 = (Object)adaptor.becomeRoot(POWER190_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:14: ( LINE_BREAK )*
            	    loop86:
            	    do {
            	        int alt86=2;
            	        int LA86_0 = input.LA(1);
            	        
            	        if ( (LA86_0==LINE_BREAK) ) {
            	            alt86=1;
            	        }
            	        
            	    
            	        switch (alt86) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK191=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2456); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop86;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2465);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:572:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:3: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT193=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2487); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BNOT193_tree = (Object)adaptor.create(BNOT193);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT193_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:15: ( LINE_BREAK )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);
            	        
            	        if ( (LA88_0==LINE_BREAK) ) {
            	            alt88=1;
            	        }
            	        
            	    
            	        switch (alt88) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK194=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2493); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop88;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            	case 2 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT195=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2503); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT195_tree = (Object)adaptor.create(NOT195);
            	    root_0 = (Object)adaptor.becomeRoot(NOT195_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:13: ( LINE_BREAK )*
            	    loop89:
            	    do {
            	        int alt89=2;
            	        int LA89_0 = input.LA(1);
            	        
            	        if ( (LA89_0==LINE_BREAK) ) {
            	            alt89=1;
            	        }
            	        
            	    
            	        switch (alt89) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK196=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2509); if (failed) return retval;
            	    	    
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

            pushFollow(FOLLOW_command_in_bnotExpression2523);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:2: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )
            int alt91=9;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt91=1;
                }
                break;
            case 138:
                {
                alt91=2;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt91=3;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt91=3;
                }
                break;
            case HEREDOC_STRING:
            case ARRAY:
            case REGEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt91=3;
                }
                break;
            case COLON:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt91=3;
                    }
                    break;
                case SINGLE_QUOTE_STRING_SIMPLE:
                case SINGLE_QUOTE_STRING_COMPLEX:
                    {
                    alt91=3;
                    }
                    break;
                case DOUBLE_QUOTE_STRING_SIMPLE:
                case DOUBLE_QUOTE_STRING_COMPLEX:
                    {
                    alt91=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("580:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 91, 6, input);
                
                    throw nvae;
                }
            
                }
                break;
            case 124:
            case 125:
            case 126:
                {
                alt91=4;
                }
                break;
            case 122:
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
                    new NoViableAltException("580:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 91, 0, input);
            
                throw nvae;
            }
            
            switch (alt91) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:4: 'expression0'
                    {
                    string_literal198=(Token)input.LT(1);
                    match(input,137,FOLLOW_137_in_command2538); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal198_tree = (Object)adaptor.create(string_literal198);
                    adaptor.addChild(root_0, string_literal198_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:20: 'expression1'
                    {
                    string_literal199=(Token)input.LT(1);
                    match(input,138,FOLLOW_138_in_command2542); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal199_tree = (Object)adaptor.create(string_literal199);
                    adaptor.addChild(root_0, string_literal199_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2545);
                    literal200=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal200.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2547);
                    boolean_expression201=boolean_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression201.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2550);
                    block_expression202=block_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_expression202.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2552);
                    if_expression203=if_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, if_expression203.getTree());
                    
                    }
                    break;
                case 7 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2554);
                    unless_expression204=unless_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unless_expression204.getTree());
                    
                    }
                    break;
                case 8 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2556);
                    atom205=atom(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atom205.getTree());
                    
                    }
                    break;
                case 9 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:125: '(' expression ')'
                    {
                    char_literal206=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_command2561); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal206_tree = (Object)adaptor.create(char_literal206);
                    adaptor.addChild(root_0, char_literal206_tree);
                    }
                    pushFollow(FOLLOW_expression_in_command2563);
                    expression207=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression207.getTree());
                    char_literal208=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_command2565); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal208_tree = (Object)adaptor.create(char_literal208);
                    adaptor.addChild(root_0, char_literal208_tree);
                    }
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:146: ( DOT method[false] )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);
                
                if ( (LA92_0==DOT) ) {
                    alt92=1;
                }
                
            
                switch (alt92) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:147: DOT method[false]
            	    {
            	    DOT209=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2570); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOT209_tree = (Object)adaptor.create(DOT209);
            	    root_0 = (Object)adaptor.becomeRoot(DOT209_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_method_in_command2573);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:1: atom[boolean topLevel] : ( methodExpression[topLevel] | hash | single_quote_string | double_quote_string | symbol );
    public final atom_return atom(boolean topLevel) throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodExpression_return methodExpression211 = null;

        hash_return hash212 = null;

        single_quote_string_return single_quote_string213 = null;

        double_quote_string_return double_quote_string214 = null;

        symbol_return symbol215 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:24: ( methodExpression[topLevel] | hash | single_quote_string | double_quote_string | symbol )
            int alt93=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt93=1;
                }
                break;
            case LCURLY:
                {
                alt93=2;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt93=3;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt93=4;
                }
                break;
            case COLON:
                {
                alt93=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("582:1: atom[boolean topLevel] : ( methodExpression[topLevel] | hash | single_quote_string | double_quote_string | symbol );", 93, 0, input);
            
                throw nvae;
            }
            
            switch (alt93) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:26: methodExpression[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_methodExpression_in_atom2587);
                    methodExpression211=methodExpression(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, methodExpression211.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:53: hash
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_hash_in_atom2590);
                    hash212=hash();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, hash212.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:58: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_single_quote_string_in_atom2592);
                    single_quote_string213=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string213.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:78: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_double_quote_string_in_atom2594);
                    double_quote_string214=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string214.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:98: symbol
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_in_atom2596);
                    symbol215=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol215.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:583:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        variable_return variable216 = null;

        method_return method217 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:2: ( variable | method[topLevel] )
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
                        new NoViableAltException("583:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 94, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("583:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 94, 0, input);
            
                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:9: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_methodExpression2610);
                    variable216=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable216.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:18: method[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_method_in_methodExpression2612);
                    method217=method(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, method217.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:585:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID218=null;

        Object ID218_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:585:9: ({...}? ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:585:11: {...}? ID
            {
            if ( !(isDefinedVar(input.LT(1).getText())) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "variable", "isDefinedVar(input.LT(1).getText())");
            }
            ID218=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2621); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID218);


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
            // 585:53: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:585:56: ^( VARIABLE ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID219=null;
        Token ID220=null;
        open_args_return open_args221 = null;
        

        Object ID219_tree=null;
        Object ID220_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:26: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:28: {...}? ID
                    {
                    if ( !(!isDefinedVar(input.LT(1).getText())) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(input.LT(1).getText())");
                    }
                    ID219=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2639); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID219);


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
                    // 586:71: -> ^( CALL ID )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:74: ^( CALL ID )
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:17: ID open_args
                    {
                    ID220=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2665); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID220);

                    pushFollow(FOLLOW_open_args_in_method2667);
                    open_args221=open_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_open_args.add(open_args221.getTree());

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
                    // 587:30: -> ^( CALL ID open_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:33: ^( CALL ID open_args )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal222=null;
        Token char_literal224=null;
        Token char_literal225=null;
        Token char_literal226=null;
        call_args_return call_args223 = null;

        call_args_return call_args227 = null;
        

        Object char_literal222_tree=null;
        Object char_literal224_tree=null;
        Object char_literal225_tree=null;
        Object char_literal226_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:2: ( '(' call_args ')' | '(' ')' | call_args )
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
                        new NoViableAltException("601:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 96, 1, input);
                
                    throw nvae;
                }
            }
            else if ( ((LA96_0>=HEREDOC_STRING && LA96_0<=FLOAT)||(LA96_0>=IF_MODIFIER && LA96_0<=UNLESS_MODIFIER)||LA96_0==ID||(LA96_0>=BNOT && LA96_0<=REGEX)||(LA96_0>=SINGLE_QUOTE_STRING_SIMPLE && LA96_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA96_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA96_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA96_0==LCURLY||LA96_0==COLON||LA96_0==122||(LA96_0>=124 && LA96_0<=126)||(LA96_0>=136 && LA96_0<=138)) ) {
                alt96=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("601:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 96, 0, input);
            
                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:4: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal222=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2705); if (failed) return retval;
                    pushFollow(FOLLOW_call_args_in_open_args2708);
                    call_args223=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args223.getTree());
                    char_literal224=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2710); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:4: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal225=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2716); if (failed) return retval;
                    char_literal226=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2719); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_call_args_in_open_args2725);
                    call_args227=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args227.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:614:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        args_return args228 = null;
        

        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:2: ( args -> ^( ARG args ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2753);
            args228=args();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_args.add(args228.getTree());

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
            // 615:10: -> ^( ARG args )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:13: ^( ARG args )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal230=null;
        arg_return arg229 = null;

        arg_return arg231 = null;
        

        Object char_literal230_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:6: ( arg ( ',' arg )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_arg_in_args2771);
            arg229=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg229.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:12: ( ',' arg )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);
                
                if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }
                
            
                switch (alt97) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:13: ',' arg
            	    {
            	    char_literal230=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2774); if (failed) return retval;
            	    pushFollow(FOLLOW_arg_in_args2777);
            	    arg231=arg();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, arg231.getTree());
            	    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        definedExpression_return definedExpression232 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:5: ( definedExpression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_definedExpression_in_arg2788);
            definedExpression232=definedExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression232.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set233=null;

        Object set233_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:16: ( ID | CONSTANT | FID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set233=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set233));
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID234=null;
        Token CONSTANT235=null;
        Token FID236=null;
        op_return op237 = null;
        

        Object ID234_tree=null;
        Object CONSTANT235_tree=null;
        Object FID236_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:15: ( ID | CONSTANT | FID | op )
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
            case 132:
                {
                alt98=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("626:1: operation2 : ( ID | CONSTANT | FID | op );", 98, 0, input);
            
                throw nvae;
            }
            
            switch (alt98) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID234=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22826); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID234_tree = (Object)adaptor.create(ID234);
                    adaptor.addChild(root_0, ID234_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT235=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22830); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT235_tree = (Object)adaptor.create(CONSTANT235);
                    adaptor.addChild(root_0, CONSTANT235_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:33: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID236=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22834); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID236_tree = (Object)adaptor.create(FID236);
                    adaptor.addChild(root_0, FID236_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:39: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation22838);
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
    // $ANTLR end operation2

    public static class operation3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start operation3
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID238=null;
        Token FID239=null;
        op_return op240 = null;
        

        Object ID238_tree=null;
        Object FID239_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:15: ( ID | FID | op )
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
            case 132:
                {
                alt99=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("629:1: operation3 : ( ID | FID | op );", 99, 0, input);
            
                throw nvae;
            }
            
            switch (alt99) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID238=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32854); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID238_tree = (Object)adaptor.create(ID238);
                    adaptor.addChild(root_0, ID238_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:22: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID239=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation32858); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID239_tree = (Object)adaptor.create(FID239);
                    adaptor.addChild(root_0, FID239_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:28: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation32862);
                    op240=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op240.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID241=null;

        Object ID241_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:5: ( ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:7: ID
            {
            ID241=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2876); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID241);


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
            // 632:10: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:13: ^( VARIABLE ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression242 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:5: ( expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:7: expression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_expression_in_rhs2892);
            expression242=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression242.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:1: literal : ( INT | FLOAT | string | ARRAY | symbol | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INT243=null;
        Token FLOAT244=null;
        Token ARRAY246=null;
        Token REGEX248=null;
        string_return string245 = null;

        symbol_return symbol247 = null;
        

        Object INT243_tree=null;
        Object FLOAT244_tree=null;
        Object ARRAY246_tree=null;
        Object REGEX248_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:9: ( INT | FLOAT | string | ARRAY | symbol | REGEX )
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
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt100=3;
                }
                break;
            case ARRAY:
                {
                alt100=4;
                }
                break;
            case COLON:
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
                    new NoViableAltException("637:1: literal : ( INT | FLOAT | string | ARRAY | symbol | REGEX );", 100, 0, input);
            
                throw nvae;
            }
            
            switch (alt100) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:11: INT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    INT243=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2902); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT243_tree = (Object)adaptor.create(INT243);
                    adaptor.addChild(root_0, INT243_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FLOAT244=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2904); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT244_tree = (Object)adaptor.create(FLOAT244);
                    adaptor.addChild(root_0, FLOAT244_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:21: string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_string_in_literal2906);
                    string245=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string245.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ARRAY246=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2908); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ARRAY246_tree = (Object)adaptor.create(ARRAY246);
                    adaptor.addChild(root_0, ARRAY246_tree);
                    }
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:34: symbol
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_in_literal2910);
                    symbol247=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol247.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:41: REGEX
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    REGEX248=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2912); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REGEX248_tree = (Object)adaptor.create(REGEX248);
                    adaptor.addChild(root_0, REGEX248_tree);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:705:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token HEREDOC_STRING251=null;
        single_quote_string_return single_quote_string249 = null;

        double_quote_string_return double_quote_string250 = null;
        

        Object HEREDOC_STRING251_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:705:8: ( single_quote_string | double_quote_string | HEREDOC_STRING )
            int alt101=3;
            switch ( input.LA(1) ) {
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt101=1;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt101=2;
                }
                break;
            case HEREDOC_STRING:
                {
                alt101=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("705:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );", 101, 0, input);
            
                throw nvae;
            }
            
            switch (alt101) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:705:10: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_single_quote_string_in_string3500);
                    single_quote_string249=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string249.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:705:30: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_double_quote_string_in_string3502);
                    double_quote_string250=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string250.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:705:50: HEREDOC_STRING
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    HEREDOC_STRING251=(Token)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_string3504); if (failed) return retval;
                    if ( backtracking==0 ) {
                    HEREDOC_STRING251_tree = (Object)adaptor.create(HEREDOC_STRING251);
                    adaptor.addChild(root_0, HEREDOC_STRING251_tree);
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
    // $ANTLR end string

    public static class single_quote_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start single_quote_string
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:707:1: single_quote_string : ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX );
    public final single_quote_string_return single_quote_string() throws RecognitionException {
        single_quote_string_return retval = new single_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set252=null;

        Object set252_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:708:2: ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set252=(Token)input.LT(1);
            if ( (input.LA(1)>=SINGLE_QUOTE_STRING_SIMPLE && input.LA(1)<=SINGLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set252));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_single_quote_string0);    throw mse;
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
    // $ANTLR end single_quote_string

    public static class double_quote_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start double_quote_string
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:1: double_quote_string : ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX );
    public final double_quote_string_return double_quote_string() throws RecognitionException {
        double_quote_string_return retval = new double_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set253=null;

        Object set253_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:756:2: ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set253=(Token)input.LT(1);
            if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_SIMPLE && input.LA(1)<=DOUBLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set253));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_double_quote_string0);    throw mse;
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
    // $ANTLR end double_quote_string

    public static class hash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start hash
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:796:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal254=null;
        Token char_literal256=null;
        assoc_list_return assoc_list255 = null;
        

        Object char_literal254_tree=null;
        Object char_literal256_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:796:6: ( '{' assoc_list '}' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:796:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal254=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3918); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal254_tree = (Object)adaptor.create(char_literal254);
            root_0 = (Object)adaptor.becomeRoot(char_literal254_tree, root_0);
            }
            pushFollow(FOLLOW_assoc_list_in_hash3921);
            assoc_list255=assoc_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc_list255.getTree());
            char_literal256=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3923); if (failed) return retval;
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:797:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        assocs_return assocs257 = null;

        trailer_return trailer258 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:798:2: ( assocs trailer )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:798:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assocs_in_assoc_list3932);
            assocs257=assocs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assocs257.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3934);
            trailer258=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer258.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal260=null;
        assoc_return assoc259 = null;

        assoc_return assoc261 = null;
        

        Object char_literal260_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:8: ( assoc ( ',' assoc )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assoc_in_assocs3943);
            assoc259=assoc();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc259.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:16: ( ',' assoc )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);
                
                if ( (LA102_0==COMMA) ) {
                    int LA102_2 = input.LA(2);
                    
                    if ( ((LA102_2>=HEREDOC_STRING && LA102_2<=FLOAT)||(LA102_2>=IF_MODIFIER && LA102_2<=UNLESS_MODIFIER)||LA102_2==ID||(LA102_2>=BNOT && LA102_2<=REGEX)||(LA102_2>=SINGLE_QUOTE_STRING_SIMPLE && LA102_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA102_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA102_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA102_2==LCURLY||LA102_2==LPAREN||LA102_2==COLON||LA102_2==122||(LA102_2>=124 && LA102_2<=126)||(LA102_2>=136 && LA102_2<=138)) ) {
                        alt102=1;
                    }
                    
                
                }
                
            
                switch (alt102) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:18: ',' assoc
            	    {
            	    char_literal260=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3947); if (failed) return retval;
            	    pushFollow(FOLLOW_assoc_in_assocs3950);
            	    assoc261=assoc();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assoc261.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop102;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal263=null;
        Token set266=null;
        symbol_name_in_assoc_return symbol_name_in_assoc262 = null;

        arg_return arg264 = null;

        arg_return arg265 = null;

        arg_return arg267 = null;
        

        Object char_literal263_tree=null;
        Object set266_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:15: ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:17: ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_name_in_assoc_in_assoc3977);
                    symbol_name_in_assoc262=symbol_name_in_assoc();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol_name_in_assoc262.getTree());
                    char_literal263=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_assoc3979); if (failed) return retval;
                    pushFollow(FOLLOW_arg_in_assoc3982);
                    arg264=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg264.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:82: arg ( ASSOC | ',' ) arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_arg_in_assoc3986);
                    arg265=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg265.getTree());
                    set266=(Token)input.LT(1);
                    if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3988);    throw mse;
                    }

                    pushFollow(FOLLOW_arg_in_assoc3995);
                    arg267=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg267.getTree());
                    
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

    public static class symbol_name_in_assoc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start symbol_name_in_assoc
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:803:1: symbol_name_in_assoc : ID -> ^( SYMBOL ID ) ;
    public final symbol_name_in_assoc_return symbol_name_in_assoc() throws RecognitionException {
        symbol_name_in_assoc_return retval = new symbol_name_in_assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID268=null;

        Object ID268_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:2: ( ID -> ^( SYMBOL ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:4: ID
            {
            ID268=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_symbol_name_in_assoc4005); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID268);


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
            // 804:7: -> ^( SYMBOL ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:10: ^( SYMBOL ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SYMBOL, "SYMBOL"), root_1);

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
    // $ANTLR end symbol_name_in_assoc

    public static class trailer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start trailer
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK269=null;
        Token char_literal270=null;

        Object LINE_BREAK269_tree=null;
        Object char_literal270_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:16: ( | LINE_BREAK | ',' )
            int alt104=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt104=1;
                }
                break;
            case LINE_BREAK:
                {
                alt104=2;
                }
                break;
            case COMMA:
                {
                alt104=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("809:1: trailer : ( | LINE_BREAK | ',' );", 104, 0, input);
            
                throw nvae;
            }
            
            switch (alt104) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:29: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK269=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer4036); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:45: ','
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal270=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer4041); if (failed) return retval;
                    
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

    public static class symbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start symbol
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:1: symbol : ':' ( ID | single_quote_string | double_quote_string ) ;
    public final symbol_return symbol() throws RecognitionException {
        symbol_return retval = new symbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal271=null;
        Token ID272=null;
        single_quote_string_return single_quote_string273 = null;

        double_quote_string_return double_quote_string274 = null;
        

        Object char_literal271_tree=null;
        Object ID272_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:8: ( ':' ( ID | single_quote_string | double_quote_string ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:10: ':' ( ID | single_quote_string | double_quote_string )
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal271=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_symbol4057); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal271_tree = (Object)adaptor.create(char_literal271);
            root_0 = (Object)adaptor.becomeRoot(char_literal271_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:15: ( ID | single_quote_string | double_quote_string )
            int alt105=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt105=1;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt105=2;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt105=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("812:15: ( ID | single_quote_string | double_quote_string )", 105, 0, input);
            
                throw nvae;
            }
            
            switch (alt105) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:16: ID
                    {
                    ID272=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_symbol4061); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID272_tree = (Object)adaptor.create(ID272);
                    adaptor.addChild(root_0, ID272_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:21: single_quote_string
                    {
                    pushFollow(FOLLOW_single_quote_string_in_symbol4065);
                    single_quote_string273=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string273.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:43: double_quote_string
                    {
                    pushFollow(FOLLOW_double_quote_string_in_symbol4069);
                    double_quote_string274=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string274.getTree());
                    
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
    // $ANTLR end symbol

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:4: ( '(' call_args ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:4: '(' call_args ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred12705); if (failed) return ;
        pushFollow(FOLLOW_call_args_in_synpred12708);
        call_args();
        _fsp--;
        if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred12710); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:4: ( '(' ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:4: '(' ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred22716); if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred22719); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:17: ( symbol_name_in_assoc ':' arg )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:18: symbol_name_in_assoc ':' arg
        {
        pushFollow(FOLLOW_symbol_name_in_assoc_in_synpred33969);
        symbol_name_in_assoc();
        _fsp--;
        if (failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred33971); if (failed) return ;
        pushFollow(FOLLOW_arg_in_synpred33973);
        arg();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred3

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
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
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
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\44\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\u0080\2\u008a\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\125\uffff\1\3\3\uffff\2\3",
            "\2\4\21\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45\uffff\5\4\20"+
            "\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4\5\uffff\1\4\2"+
            "\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4\3\uffff\4\4",
            "\2\4\21\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45\uffff\5\4\20"+
            "\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4\5\uffff\1\4\2"+
            "\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4\3\uffff\4\4",
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
            return "()* loopback of 279:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\45\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\u0081\1\u008a\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\121\uffff\1\2\11\uffff\1\3",
            "\2\4\21\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\45\uffff\5\4\20"+
            "\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4\5\uffff\1\4\2"+
            "\uffff\7\4\1\3\2\4\3\uffff\4\4",
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
            return "321:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA95_eotS =
        "\124\uffff";
    static final String DFA95_eofS =
        "\1\uffff\1\2\122\uffff";
    static final String DFA95_minS =
        "\1\51\1\13\1\uffff\2\14\1\uffff\1\14\1\13\3\14\111\0";
    static final String DFA95_maxS =
        "\1\51\1\u008a\1\uffff\2\u008a\1\uffff\1\u008a\1\u0084\3\u008a\111"+
        "\0";
    static final String DFA95_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\116\uffff";
    static final String DFA95_specialS =
        "\124\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1",
            "\1\2\2\5\16\uffff\2\2\1\uffff\1\3\1\6\5\2\1\uffff\1\2\1\uffff"+
            "\1\5\15\2\16\uffff\12\2\5\5\20\uffff\2\5\1\uffff\2\5\1\uffff"+
            "\1\5\1\2\2\uffff\1\2\2\uffff\1\5\1\2\3\uffff\1\2\1\4\2\uffff"+
            "\1\5\1\2\3\5\3\2\3\uffff\2\2\1\uffff\3\5",
            "",
            "\1\22\1\17\21\uffff\1\30\1\31\4\uffff\1\2\3\uffff\1\32\45\uffff"+
            "\1\12\1\13\1\16\1\23\1\25\20\uffff\2\20\1\uffff\2\21\1\uffff"+
            "\1\33\6\uffff\1\34\5\uffff\1\24\2\uffff\1\27\1\uffff\3\26\3"+
            "\uffff\1\7\1\35\3\uffff\1\10\1\11\1\14\1\15",
            "\2\2\21\uffff\2\2\3\uffff\2\2\3\uffff\1\40\45\uffff\5\2\20\uffff"+
            "\2\36\1\uffff\2\37\1\uffff\1\2\6\uffff\1\2\5\uffff\1\2\2\uffff"+
            "\7\2\1\uffff\2\2\3\uffff\4\2",
            "",
            "\2\2\21\uffff\2\2\4\uffff\1\2\3\uffff\1\2\45\uffff\5\2\20\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\5\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\3\41\3\uffff\2\2\3\uffff\4\2",
            "\1\45\2\uffff\1\43\1\44\14\uffff\2\45\13\uffff\1\42\15\45\25"+
            "\uffff\4\45\45\uffff\1\45\16\uffff\1\45",
            "\1\61\1\56\21\uffff\1\67\1\70\4\uffff\1\46\3\uffff\1\71\45\uffff"+
            "\1\51\1\52\1\55\1\62\1\64\20\uffff\2\57\1\uffff\2\60\1\uffff"+
            "\1\72\6\uffff\1\73\5\uffff\1\63\2\uffff\1\66\1\uffff\3\65\10"+
            "\uffff\1\47\1\50\1\53\1\54",
            "\1\104\1\101\21\uffff\1\112\1\113\10\uffff\1\114\45\uffff\1"+
            "\74\1\75\1\100\1\105\1\107\20\uffff\2\102\1\uffff\2\103\1\uffff"+
            "\1\115\6\uffff\1\116\5\uffff\1\106\2\uffff\1\111\1\uffff\3\110"+
            "\12\uffff\1\76\1\77",
            "\1\22\1\17\21\uffff\1\30\1\31\4\uffff\1\117\3\uffff\1\121\45"+
            "\uffff\1\122\1\123\1\16\1\23\1\25\20\uffff\2\20\1\uffff\2\21"+
            "\1\uffff\1\33\6\uffff\1\34\5\uffff\1\24\2\uffff\1\120\1\uffff"+
            "\3\26\12\uffff\1\14\1\15",
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
            return "586:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
    }
    static final String DFA103_eotS =
        "\66\uffff";
    static final String DFA103_eofS =
        "\66\uffff";
    static final String DFA103_minS =
        "\1\14\1\13\1\uffff\1\14\1\0\2\13\21\uffff\34\0\2\uffff";
    static final String DFA103_maxS =
        "\2\u008a\1\uffff\1\u008a\1\0\2\166\21\uffff\34\0\2\uffff";
    static final String DFA103_acceptS =
        "\2\uffff\1\2\4\uffff\21\1\34\uffff\2\1";
    static final String DFA103_specialS =
        "\3\uffff\1\2\1\0\1\1\1\3\57\uffff}>";
    static final String[] DFA103_transitionS = {
            "\2\2\21\uffff\2\2\10\uffff\1\1\45\uffff\5\2\20\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\6\uffff\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\3\2\11\uffff\3\2",
            "\3\2\16\uffff\2\2\1\uffff\2\2\6\uffff\1\2\1\uffff\53\2\20\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\3\2\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "",
            "\1\16\1\15\21\uffff\1\24\1\25\10\uffff\1\4\45\uffff\1\10\1\11"+
            "\1\14\1\17\1\21\20\uffff\2\5\1\uffff\2\6\1\uffff\1\26\6\uffff"+
            "\1\27\5\uffff\1\20\2\uffff\1\23\1\uffff\3\22\11\uffff\1\7\1"+
            "\12\1\13",
            "\1\uffff",
            "\1\37\20\uffff\1\33\1\34\7\uffff\1\65\1\uffff\1\30\2\uffff\1"+
            "\50\1\51\1\52\1\54\1\45\1\47\1\44\1\46\1\40\1\35\1\36\1\32\1"+
            "\31\16\uffff\1\62\1\60\1\61\1\57\1\56\1\53\1\55\1\42\1\43\1"+
            "\41\34\uffff\1\64\2\uffff\1\2\7\uffff\1\63",
            "\1\37\20\uffff\1\33\1\34\7\uffff\1\65\1\uffff\1\30\2\uffff\1"+
            "\50\1\51\1\52\1\54\1\45\1\47\1\44\1\46\1\40\1\35\1\36\1\32\1"+
            "\31\16\uffff\1\62\1\60\1\61\1\57\1\56\1\53\1\55\1\42\1\43\1"+
            "\41\34\uffff\1\64\2\uffff\1\2\7\uffff\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            ""
    };
    
    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;
    
    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }
    
    class DFA103 extends DFA {
    
        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "801:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {

                    case 0 : 
                        int LA103_4 = input.LA(1);
                        
                         
                        int index103_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}
                        
                         
                        input.seek(index103_4);
                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA103_5 = input.LA(1);
                        
                         
                        int index103_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA103_5==DOT) ) {s = 24;}

                        else if ( (LA103_5==POWER) ) {s = 25;}

                        else if ( (LA103_5==STAR) ) {s = 26;}

                        else if ( (LA103_5==DIV) ) {s = 27;}

                        else if ( (LA103_5==MOD) ) {s = 28;}

                        else if ( (LA103_5==PLUS) ) {s = 29;}

                        else if ( (LA103_5==MINUS) ) {s = 30;}

                        else if ( (LA103_5==LEFT_SHIFT) ) {s = 31;}

                        else if ( (LA103_5==RIGHT_SHIFT) ) {s = 32;}

                        else if ( (LA103_5==BAND) ) {s = 33;}

                        else if ( (LA103_5==BXOR) ) {s = 34;}

                        else if ( (LA103_5==BOR) ) {s = 35;}

                        else if ( (LA103_5==LESS_THAN) ) {s = 36;}

                        else if ( (LA103_5==GREATER_THAN) ) {s = 37;}

                        else if ( (LA103_5==LESS_OR_EQUAL) ) {s = 38;}

                        else if ( (LA103_5==GREATER_OR_EQUAL) ) {s = 39;}

                        else if ( (LA103_5==COMPARE) ) {s = 40;}

                        else if ( (LA103_5==EQUAL) ) {s = 41;}

                        else if ( (LA103_5==CASE_EQUAL) ) {s = 42;}

                        else if ( (LA103_5==NOT_EQUAL) ) {s = 43;}

                        else if ( (LA103_5==MATCH) ) {s = 44;}

                        else if ( (LA103_5==NOT_MATCH) ) {s = 45;}

                        else if ( (LA103_5==LOGICAL_AND) ) {s = 46;}

                        else if ( (LA103_5==LOGICAL_OR) ) {s = 47;}

                        else if ( (LA103_5==INCLUSIVE_RANGE) ) {s = 48;}

                        else if ( (LA103_5==EXCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA103_5==QUESTION) ) {s = 50;}

                        else if ( (LA103_5==COMMA) ) {s = 51;}

                        else if ( (LA103_5==ASSOC) ) {s = 2;}

                        else if ( (LA103_5==RCURLY) && (synpred3())) {s = 52;}

                        else if ( (LA103_5==LINE_BREAK) && (synpred3())) {s = 53;}
                        
                         
                        input.seek(index103_5);
                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA103_3 = input.LA(1);
                        
                         
                        int index103_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA103_3==ID) ) {s = 4;}

                        else if ( ((LA103_3>=SINGLE_QUOTE_STRING_SIMPLE && LA103_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 5;}

                        else if ( ((LA103_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA103_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 6;}

                        else if ( (LA103_3==136) && (synpred3())) {s = 7;}

                        else if ( (LA103_3==BNOT) && (synpred3())) {s = 8;}

                        else if ( (LA103_3==NOT) && (synpred3())) {s = 9;}

                        else if ( (LA103_3==137) && (synpred3())) {s = 10;}

                        else if ( (LA103_3==138) && (synpred3())) {s = 11;}

                        else if ( (LA103_3==INT) && (synpred3())) {s = 12;}

                        else if ( (LA103_3==FLOAT) && (synpred3())) {s = 13;}

                        else if ( (LA103_3==HEREDOC_STRING) && (synpred3())) {s = 14;}

                        else if ( (LA103_3==ARRAY) && (synpred3())) {s = 15;}

                        else if ( (LA103_3==COLON) && (synpred3())) {s = 16;}

                        else if ( (LA103_3==REGEX) && (synpred3())) {s = 17;}

                        else if ( ((LA103_3>=124 && LA103_3<=126)) && (synpred3())) {s = 18;}

                        else if ( (LA103_3==122) && (synpred3())) {s = 19;}

                        else if ( (LA103_3==IF_MODIFIER) && (synpred3())) {s = 20;}

                        else if ( (LA103_3==UNLESS_MODIFIER) && (synpred3())) {s = 21;}

                        else if ( (LA103_3==LCURLY) && (synpred3())) {s = 22;}

                        else if ( (LA103_3==LPAREN) && (synpred3())) {s = 23;}
                        
                         
                        input.seek(index103_3);
                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA103_6 = input.LA(1);
                        
                         
                        int index103_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA103_6==DOT) ) {s = 24;}

                        else if ( (LA103_6==POWER) ) {s = 25;}

                        else if ( (LA103_6==STAR) ) {s = 26;}

                        else if ( (LA103_6==DIV) ) {s = 27;}

                        else if ( (LA103_6==MOD) ) {s = 28;}

                        else if ( (LA103_6==PLUS) ) {s = 29;}

                        else if ( (LA103_6==MINUS) ) {s = 30;}

                        else if ( (LA103_6==LEFT_SHIFT) ) {s = 31;}

                        else if ( (LA103_6==RIGHT_SHIFT) ) {s = 32;}

                        else if ( (LA103_6==BAND) ) {s = 33;}

                        else if ( (LA103_6==BXOR) ) {s = 34;}

                        else if ( (LA103_6==BOR) ) {s = 35;}

                        else if ( (LA103_6==LESS_THAN) ) {s = 36;}

                        else if ( (LA103_6==GREATER_THAN) ) {s = 37;}

                        else if ( (LA103_6==LESS_OR_EQUAL) ) {s = 38;}

                        else if ( (LA103_6==GREATER_OR_EQUAL) ) {s = 39;}

                        else if ( (LA103_6==COMPARE) ) {s = 40;}

                        else if ( (LA103_6==EQUAL) ) {s = 41;}

                        else if ( (LA103_6==CASE_EQUAL) ) {s = 42;}

                        else if ( (LA103_6==NOT_EQUAL) ) {s = 43;}

                        else if ( (LA103_6==MATCH) ) {s = 44;}

                        else if ( (LA103_6==NOT_MATCH) ) {s = 45;}

                        else if ( (LA103_6==LOGICAL_AND) ) {s = 46;}

                        else if ( (LA103_6==LOGICAL_OR) ) {s = 47;}

                        else if ( (LA103_6==INCLUSIVE_RANGE) ) {s = 48;}

                        else if ( (LA103_6==EXCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA103_6==QUESTION) ) {s = 50;}

                        else if ( (LA103_6==COMMA) ) {s = 51;}

                        else if ( (LA103_6==ASSOC) ) {s = 2;}

                        else if ( (LA103_6==RCURLY) && (synpred3())) {s = 52;}

                        else if ( (LA103_6==LINE_BREAK) && (synpred3())) {s = 53;}
                        
                         
                        input.seek(index103_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program261 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_statement_list_in_program265 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_program267 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list281 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list284 = new BitSet(new long[]{0x0000023180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_statement_in_statement_list287 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_expression_in_statement313 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement316 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_set_in_modifier_line356 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_line_break_in_modifier_line370 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_expression_in_modifier_line374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_block_expression449 = new BitSet(new long[]{0x0000021180003000L,0x7C8205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_body_in_block_expression451 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_block_expression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body460 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_statement_list_in_body464 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_body466 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression489 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_expression_in_if_expression494 = new BitSet(new long[]{0x0000002000000000L,0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_seperator_in_if_expression496 = new BitSet(new long[]{0x0000021180003000L,0xFC8205B0000F8000L,0x000000000000078DL});
    public static final BitSet FOLLOW_body_in_if_expression509 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_127_in_if_expression512 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_expression_in_if_expression516 = new BitSet(new long[]{0x0000002000000000L,0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_seperator_in_if_expression518 = new BitSet(new long[]{0x0000021180003000L,0xFC8205B0000F8000L,0x000000000000078DL});
    public static final BitSet FOLLOW_body_in_if_expression522 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_if_expression536 = new BitSet(new long[]{0x0000021180003000L,0x7C8205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_body_in_if_expression540 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_if_expression553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator605 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator608 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator610 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator615 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_seperator618 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator620 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression630 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression632 = new BitSet(new long[]{0x0000002000000000L,0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_unless_expression635 = new BitSet(new long[]{0x0000021180003000L,0x7C8205B0000F8000L,0x000000000000078DL});
    public static final BitSet FOLLOW_COLON_in_unless_expression637 = new BitSet(new long[]{0x0000021180003000L,0x7C8205B0000F8000L,0x000000000000078DL});
    public static final BitSet FOLLOW_line_break_in_unless_expression639 = new BitSet(new long[]{0x0000021180003000L,0x7C8205B0000F8000L,0x000000000000078DL});
    public static final BitSet FOLLOW_body_in_unless_expression651 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_unless_expression664 = new BitSet(new long[]{0x0000021180003000L,0x7C8205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_body_in_unless_expression666 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_unless_expression679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_expression743 = new BitSet(new long[]{0x007FFE003000C800L,0x002000000000F000L,0x0000000000000010L});
    public static final BitSet FOLLOW_fitem_in_expression746 = new BitSet(new long[]{0x007FFE003000C800L,0x002000000000F000L,0x0000000000000010L});
    public static final BitSet FOLLOW_fitem_in_expression748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_methodDefinition768 = new BitSet(new long[]{0x000002200000C000L,0x0002000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition772 = new BitSet(new long[]{0x000002200000C000L,0x0002000000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition778 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition780 = new BitSet(new long[]{0x000002000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition784 = new BitSet(new long[]{0x0020023000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition788 = new BitSet(new long[]{0x0000023180003000L,0x7C8205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_terminal_in_methodDefinition791 = new BitSet(new long[]{0x0000023180003000L,0x7C8205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition797 = new BitSet(new long[]{0x0000003000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition801 = new BitSet(new long[]{0x0000003000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_methodDefinition806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton819 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_expression_in_singleton822 = new BitSet(new long[]{0x0000002000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton824 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist883 = new BitSet(new long[]{0x0020022000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist885 = new BitSet(new long[]{0x0000002000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist889 = new BitSet(new long[]{0x0000002000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist912 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args926 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args928 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args931 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args934 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args947 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args949 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args963 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args966 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1017 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args1041 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args1043 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arg_in_f_opt_args1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_133_in_andorExpression1260 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000780L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1265 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000780L});
    public static final BitSet FOLLOW_134_in_andorExpression1276 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000780L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1281 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000780L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_135_in_notExpression1314 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000780L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1321 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000780L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_definedExpression1346 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1387 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_set_in_assignmentExpression1389 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1451 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1454 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1456 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1476 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1495 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1499 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1510 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1514 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1529 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1581 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1586 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1615 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1647 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1652 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1681 = new BitSet(new long[]{0x00003C0000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1715 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1720 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1731 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1737 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1748 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1752 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1763 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1768 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1779 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1785 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1796 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1801 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1816 = new BitSet(new long[]{0x00003C0000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1837 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1871 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1877 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1888 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1893 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1904 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1909 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1920 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1924 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1939 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1993 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1999 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_BOR_in_orExpression2010 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2016 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2083 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2089 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2098 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2120 = new BitSet(new long[]{0x0004000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2154 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2159 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2170 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2174 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2189 = new BitSet(new long[]{0x0004000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2211 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2245 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2252 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2263 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2270 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2285 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2305 = new BitSet(new long[]{0x0020000030000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2339 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2345 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2356 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2362 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2373 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2379 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2394 = new BitSet(new long[]{0x0020000030000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2415 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2450 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2456 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2465 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2487 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2493 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2503 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2509 = new BitSet(new long[]{0x0000022180003000L,0x748205B0000F8000L,0x0000000000000600L});
    public static final BitSet FOLLOW_command_in_bnotExpression2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_command2538 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_138_in_command2542 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_literal_in_command2545 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2547 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2550 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2552 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2554 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_atom_in_command2556 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_LPAREN_in_command2561 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x000000000000078CL});
    public static final BitSet FOLLOW_expression_in_command2563 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_command2565 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_DOT_in_command2570 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_method_in_command2573 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_atom2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_atom2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_atom2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_atom2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2665 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_open_args_in_method2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2705 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_call_args_in_open_args2708 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2716 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2771 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2774 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arg_in_args2777 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation32858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation32862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_literal2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_string3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_string3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_string3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_single_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_double_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3918 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_assoc_list_in_hash3921 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3932 = new BitSet(new long[]{0x0000002000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3943 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3947 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_assoc_in_assocs3950 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_assoc3977 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COLON_in_assoc3979 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arg_in_assoc3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_assoc3986 = new BitSet(new long[]{0x0000000000000000L,0x0040400000000000L});
    public static final BitSet FOLLOW_set_in_assoc3988 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arg_in_assoc3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_symbol_name_in_assoc4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_symbol4057 = new BitSet(new long[]{0x0000020000000000L,0x000001B000000000L});
    public static final BitSet FOLLOW_ID_in_symbol4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_symbol4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_symbol4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred12705 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_call_args_in_synpred12708 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred12710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred22716 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred22719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_synpred33969 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred33971 = new BitSet(new long[]{0x0000020180003000L,0x748205B0000F8000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arg_in_synpred33973 = new BitSet(new long[]{0x0000000000000002L});

}