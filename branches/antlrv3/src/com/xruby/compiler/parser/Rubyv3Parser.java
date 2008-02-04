// $ANTLR 3.0.1 D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-04 10:58:21

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "SYMBOL", "STAR_ID", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING_SIMPLE", "SINGLE_QUOTE_STRING_COMPLEX", "SINGLE_STRING_CHAR", "DOUBLE_QUOTE_STRING_SIMPLE", "DOUBLE_QUOTE_STRING_COMPLEX", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "SYMBOL_NAME", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined?'", "'expression0'", "'expression1'"
    };
    public static final int CASE_EQUAL=45;
    public static final int STAR=54;
    public static final int EMPTY_ARRAY=118;
    public static final int MOD=29;
    public static final int REST_UNUSE=27;
    public static final int MOD_ASSIGN=57;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=121;
    public static final int SINGLE_QUOTE_STRING_SIMPLE=101;
    public static final int REGEX=84;
    public static final int LEFT_SHIFT_ASSIGN=64;
    public static final int NOT=81;
    public static final int UNTIL_MODIFIER=35;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=59;
    public static final int LOGICAL_AND=74;
    public static final int STATEMENT=5;
    public static final int RPAREN=115;
    public static final int HEX_PART=95;
    public static final int DOUBLE_QUOTE_STRING_SIMPLE=104;
    public static final int ARG=10;
    public static final int NESTED_LHS=24;
    public static final int NOT_EQUAL=75;
    public static final int SYMBOL_NAME=112;
    public static final int WHILE_MODIFIER=34;
    public static final int BODY=9;
    public static final int COMMENT=122;
    public static final int ARRAY=83;
    public static final int RBRACK=117;
    public static final int HEREDOC_BEGIN=109;
    public static final int UNLESS_MODIFIER=33;
    public static final int INCLUSIVE_RANGE=71;
    public static final int SYMBOL=30;
    public static final int MINUS_ASSIGN=60;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=105;
    public static final int POWER=55;
    public static final int LCURLY=107;
    public static final int MATCH=46;
    public static final int INT=82;
    public static final int GLOBAL_VARIABLE=94;
    public static final int ESCAPE_INT_PART=98;
    public static final int LINE_BREAK=38;
    public static final int WS=39;
    public static final int VARIABLE=16;
    public static final int INSTANCE_VARIABLE=92;
    public static final int LESS_THAN=49;
    public static final int OCTAL=85;
    public static final int SINGLETON_METHOD=25;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=76;
    public static final int BNOT=80;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=111;
    public static final int NON_LEADING0_NUMBER=100;
    public static final int STAR_ID=31;
    public static final int CONTROL_PART=96;
    public static final int LBRACK=116;
    public static final int IF_MODIFIER=32;
    public static final int BXOR_ASSIGN=113;
    public static final int GREATER_OR_EQUAL=48;
    public static final int FLOAT=13;
    public static final int BLOCK_ARG=21;
    public static final int HEREDOC_STRING=12;
    public static final int ID=42;
    public static final int LPAREN=114;
    public static final int IF=7;
    public static final int EXP_PART=89;
    public static final int RESCUE_MODIFIER=36;
    public static final int SINGLE_QUOTE_STRING_COMPLEX=102;
    public static final int BOR_ASSIGN=62;
    public static final int LEADING0_NUMBER=90;
    public static final int COMMA=119;
    public static final int HEX=86;
    public static final int EQUAL=44;
    public static final int BOR=78;
    public static final int RIGHT_SHIFT=51;
    public static final int RIGHT_SHIFT_ASSIGN=65;
    public static final int LOGICAL_OR=73;
    public static final int COMPARE=43;
    public static final int PLUS=52;
    public static final int BXOR=77;
    public static final int DOT=40;
    public static final int EXCLUSIVE_RANGE=72;
    public static final int COLON2=41;
    public static final int MRHS=23;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=91;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int GREATER_THAN=47;
    public static final int LOGICAL_AND_ASSIGN=67;
    public static final int LEADING_MARK_DECIMAL=88;
    public static final int DOUBLE_STRING_CHAR=106;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
    public static final int LESS_OR_EQUAL=50;
    public static final int SINGLE_STRING_CHAR=103;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=53;
    public static final int BAND=79;
    public static final int META_PART=97;
    public static final int SEMI=37;
    public static final int STAR_ASSIGN=66;
    public static final int LOGICAL_OR_ASSIGN=68;
    public static final int COLON=120;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=63;
    public static final int CLASS_VARIABLE=93;
    public static final int QUESTION=70;
    public static final int ESCAPE_INT=99;
    public static final int BLOCK=18;
    public static final int RCURLY=108;
    public static final int ASSIGN=56;
    public static final int PLUS_ASSIGN=61;
    public static final int POWER_ASSIGN=69;
    public static final int COMPLEMENT_ASSIGN=58;
    public static final int DIV=28;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int BINARY=87;
    public static final int HEREDOC_INDENT_BEGIN=110;
    public static final int STRING=26;
    
        public Rubyv3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[77+1];
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:17: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);
            
            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||LA3_0==STAR||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING_SIMPLE && LA3_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA3_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA3_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA3_0==LCURLY||LA3_0==LPAREN||LA3_0==COLON||LA3_0==123||(LA3_0>=125 && LA3_0<=127)||(LA3_0>=131 && LA3_0<=132)||(LA3_0>=136 && LA3_0<=139)) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("275:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);
            
                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);
                        
                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }
                        
                    
                        switch (alt1) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program265);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_program269);
                    statement_list2=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list2.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);
                        
                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }
                        
                    
                        switch (alt2) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program271);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:280:3: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:11: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list296);
            statement4=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(statement4.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:21: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:22: ( terminal )+ statement
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:22: ( terminal )+
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
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:22: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list299);
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

            	    pushFollow(FOLLOW_statement_in_statement_list302);
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
            // 281:44: -> ^( STATEMENT_LIST ( statement )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:47: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:64: ( statement )*
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;
        

        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:2: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement332);
            expression7=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression7.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                
                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }
                
            
                switch (alt6) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement335);
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
            // elements: modifier_line, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:59: ( modifier_line )*
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;
        

        Object set9_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:2: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line375);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                
                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }
                
            
                switch (alt7) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line389);
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

            pushFollow(FOLLOW_expression_in_modifier_line393);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:1: block_expression : 'begin' body 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:2: ( 'begin' body 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal12=(Token)input.LT(1);
            match(input,123,FOLLOW_123_in_block_expression468); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);
            }
            pushFollow(FOLLOW_body_in_block_expression470);
            body13=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,124,FOLLOW_124_in_block_expression472); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;
        

        Object SEMI15_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:6: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);
            
            if ( (LA10_0==SEMI||LA10_0==124||(LA10_0>=128 && LA10_0<=129)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||LA10_0==STAR||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING_SIMPLE && LA10_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA10_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA10_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA10_0==LCURLY||LA10_0==LPAREN||LA10_0==COLON||LA10_0==123||(LA10_0>=125 && LA10_0<=127)||(LA10_0>=131 && LA10_0<=132)||(LA10_0>=136 && LA10_0<=139)) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("314:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);
            
                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);
                        
                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }
                        
                    
                        switch (alt8) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body479); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_body483);
                    statement_list16=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list16.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);
                        
                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }
                        
                    
                        switch (alt9) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body485);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set18=null;

        Object set18_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:2: ( 'false' | 'nil' | 'true' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=125 && input.LA(1)<=127) ) {
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:2: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression508); if (failed) return retval;
            if ( backtracking==0 ) stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression513);
            e0=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression515);
            seperator20=seperator();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression528);
            body0=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_body.add(body0.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:319:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);
                
                if ( (LA11_0==128) ) {
                    alt11=1;
                }
                
            
                switch (alt11) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:319:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,128,FOLLOW_128_in_if_expression531); if (failed) return retval;
            	    if ( backtracking==0 ) stream_128.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression535);
            	    e1=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression537);
            	    seperator22=seperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression541);
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

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);
            
            if ( (LA12_0==129) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_if_expression555); if (failed) return retval;
                    if ( backtracking==0 ) stream_129.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression559);
                    body2=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_body.add(body2.getTree());
                    
                    }
                    break;
            
            }

            string_literal24=(Token)input.LT(1);
            match(input,124,FOLLOW_124_in_if_expression572); if (failed) return retval;
            if ( backtracking==0 ) stream_124.add(string_literal24);


            // AST REWRITE
            // elements: body0, body2, body1, e1, e0
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
            // 321:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:321:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:321:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:321:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:321:48: ( $body2)?
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:2: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:3: ( LINE_BREAK )+
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator624); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator627); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        
                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }
                        
                    
                        switch (alt14) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator629); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);
                        
                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }
                        
                    
                        switch (alt15) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator634); if (failed) return retval;
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
                    match(input,130,FOLLOW_130_in_seperator637); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);
                        
                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }
                        
                    
                        switch (alt16) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator639); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:2: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression649); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);
            }
            pushFollow(FOLLOW_boolean_expression_in_unless_expression651);
            boolean_expression32=boolean_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression32.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 130:
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
                    new NoViableAltException("327:32: ( 'then' | ':' | line_break )", 18, 0, input);
            
                throw nvae;
            }
            
            switch (alt18) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,130,FOLLOW_130_in_unless_expression654); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression656); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression658);
                    line_break35=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break35.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_body_in_unless_expression670);
            body36=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body36.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            
            if ( (LA19_0==129) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_unless_expression683); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);
                    }
                    pushFollow(FOLLOW_body_in_unless_expression685);
                    body38=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, body38.getTree());
                    
                    }
                    break;
            
            }

            string_literal39=(Token)input.LT(1);
            match(input,124,FOLLOW_124_in_unless_expression698); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI40=null;
        line_break_return line_break41 = null;
        

        Object SEMI40_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:9: ( SEMI | line_break )
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
                    new NoViableAltException("331:1: terminal : ( SEMI | line_break );", 20, 0, input);
            
                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal704); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_line_break_in_terminal707);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:2: ( LINE_BREAK )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();
            
            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break717); if (failed) return retval;
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:2: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt21=1;
                }
                break;
            case HEREDOC_STRING:
            case FLOAT:
            case IF_MODIFIER:
            case UNLESS_MODIFIER:
            case ID:
            case STAR:
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
            case 123:
            case 125:
            case 126:
            case 127:
            case 136:
            case 137:
            case 138:
            case 139:
                {
                alt21=2;
                }
                break;
            case 132:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("365:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);
            
                throw nvae;
            }
            
            switch (alt21) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal43=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_expression762); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
                    }
                    pushFollow(FOLLOW_fitem_in_expression765);
                    fitem44=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression767);
                    fitem45=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem45.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_andorExpression_in_expression769);
                    andorExpression46=andorExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, andorExpression46.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_primaryExpression_in_expression771);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodDefinition_return methodDefinition48 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:2: ( methodDefinition )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_methodDefinition_in_primaryExpression779);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:2: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal49=(Token)input.LT(1);
            match(input,132,FOLLOW_132_in_methodDefinition787); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);
                
                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }
                
            
                switch (alt22) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition791); if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:26: ( singleton dot_or_colon )?
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition797);
                    singleton51=singleton();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition799);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dot_or_colon52.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_methodName_in_methodDefinition803);
            methodName53=methodName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodName53.getTree());
            if ( backtracking==0 ) {
              enterScope();
            }
            pushFollow(FOLLOW_f_arglist_in_methodDefinition807);
            f_arglist54=f_arglist();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f_arglist54.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:89: ( terminal )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition810);
            	    terminal55=terminal();
            	    _fsp--;
            	    if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);
            
            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||LA25_0==STAR||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING_SIMPLE && LA25_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA25_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA25_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA25_0==LCURLY||LA25_0==LPAREN||LA25_0==COLON||LA25_0==123||(LA25_0>=125 && LA25_0<=127)||(LA25_0>=131 && LA25_0<=132)||(LA25_0>=136 && LA25_0<=139)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition816);
                    bodyStatement56=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement56.getTree());
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);
                
                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }
                
            
                switch (alt26) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition820);
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
            match(input,124,FOLLOW_124_in_methodDefinition825); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:371:1: singleton : ( variable | '(' expression opt_nl ')' );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:2: ( variable | '(' expression opt_nl ')' )
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
                    new NoViableAltException("371:1: singleton : ( variable | '(' expression opt_nl ')' );", 27, 0, input);
            
                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:4: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_singleton836);
                    variable59=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable59.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton838); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_singleton841);
                    expression61=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton843);
                    opt_nl62=opt_nl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton845); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:15: ( | LINE_BREAK )
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
                    new NoViableAltException("373:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);
            
                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:28: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl864); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set65=null;

        Object set65_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:2: ( DOT | COLON2 )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set66=null;

        Object set66_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:2: ( ID | CONSTANT | FID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:2: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
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
                    new NoViableAltException("379:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);
            
                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist902); if (failed) return retval;
                    if ( backtracking==0 ) stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist904);
                    f_args68=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_f_args.add(f_args68.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);
                        
                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }
                        
                    
                        switch (alt29) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist908); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK69);

                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist912); if (failed) return retval;
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
                    // 380:34: -> ^( ARG f_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:37: ^( ARG f_args )
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_args_in_f_arglist931);
                    f_args71=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist933);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:8: ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
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
                            new NoViableAltException("382:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 5, input);
                    
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
                        new NoViableAltException("382:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 1, input);
                
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
                    new NoViableAltException("382:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 0, input);
            
                throw nvae;
            }
            
            switch (alt33) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args941);
                    f_norm_args73=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args73.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:24: f_norm_args ',' f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args945);
                    f_norm_args74=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args947); if (failed) return retval;
                    pushFollow(FOLLOW_f_opt_args_in_f_args950);
                    f_opt_args76=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args76.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:52: ( ',' f_rest_arg )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);
                    
                    if ( (LA31_0==COMMA) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:53: ',' f_rest_arg
                            {
                            char_literal77=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args953); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args956);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:2: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:4: f_norm_args ',' f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args966);
                    f_norm_args79=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args79.getTree());
                    char_literal80=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args968); if (failed) return retval;
                    pushFollow(FOLLOW_f_rest_arg_in_f_args971);
                    f_rest_arg81=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg81.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_opt_args_in_f_args982);
                    f_opt_args82=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args82.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:21: ( ',' f_rest_arg )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);
                    
                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:22: ',' f_rest_arg
                            {
                            char_literal83=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args985); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args988);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_rest_arg_in_f_args995);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID86=null;

        Object ID86_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:2: ( ID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:2: ID
            {
            root_0 = (Object)adaptor.nil();
            
            ID86=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args1026); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:2: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
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
                        new NoViableAltException("393:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("393:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 0, input);
            
                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal87=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1036); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
                    }
                    ID88=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg1039); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:38: '*'
                    {
                    char_literal89=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1044); if (failed) return retval;
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
                    // 394:42: -> ^( '*' REST_UNUSE )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:45: ^( '*' REST_UNUSE )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:1: f_opt_args : ID '=' arg ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:2: ( ID '=' arg )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();
            
            ID90=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args1060); if (failed) return retval;
            if ( backtracking==0 ) {
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);
            }
            char_literal91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args1062); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal91_tree = (Object)adaptor.create(char_literal91);
            root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);
            }
            pushFollow(FOLLOW_arg_in_f_opt_args1065);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        statement_list_return statement_list93 = null;
        

        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:2: ( statement_list -> ^( BODY statement_list ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1077);
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
            // 399:19: -> ^( BODY statement_list )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:22: ^( BODY statement_list )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        fname_return fname94 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:7: ( fname )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:9: fname
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_fname_in_fitem1095);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:1: fname : ( ID | CONSTANT | FID | op );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:7: ( ID | CONSTANT | FID | op )
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
            case 133:
                {
                alt35=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("403:1: fname : ( ID | CONSTANT | FID | op );", 35, 0, input);
            
                throw nvae;
            }
            
            switch (alt35) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:9: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID95=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1102); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID95_tree = (Object)adaptor.create(ID95);
                    adaptor.addChild(root_0, ID95_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT96=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1104); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT96_tree = (Object)adaptor.create(CONSTANT96);
                    adaptor.addChild(root_0, CONSTANT96_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:21: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID97=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1106); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID97_tree = (Object)adaptor.create(FID97);
                    adaptor.addChild(root_0, FID97_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:25: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_fname1108);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set99=null;

        Object set99_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:15: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set99=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==133 ) {
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:3: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_notExpression_in_andorExpression1269);
            notExpression100=notExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, notExpression100.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);
                
                if ( ((LA39_0>=134 && LA39_0<=135)) ) {
                    alt39=1;
                }
                
            
                switch (alt39) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);
            	    
            	    if ( (LA38_0==134) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==135) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("417:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 38, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal101=(Token)input.LT(1);
            	            match(input,134,FOLLOW_134_in_andorExpression1279); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal101_tree = (Object)adaptor.create(string_literal101);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:15: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);
            	                
            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }
            	                
            	            
            	                switch (alt36) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK102=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1284); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal103=(Token)input.LT(1);
            	            match(input,135,FOLLOW_135_in_andorExpression1295); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal103_tree = (Object)adaptor.create(string_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:14: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);
            	                
            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }
            	                
            	            
            	                switch (alt37) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK104=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1300); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1315);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:3: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);
            
            if ( (LA41_0==136) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=HEREDOC_STRING && LA41_0<=FLOAT)||(LA41_0>=IF_MODIFIER && LA41_0<=UNLESS_MODIFIER)||LA41_0==ID||LA41_0==STAR||(LA41_0>=BNOT && LA41_0<=REGEX)||(LA41_0>=SINGLE_QUOTE_STRING_SIMPLE && LA41_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA41_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA41_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA41_0==LCURLY||LA41_0==LPAREN||LA41_0==COLON||LA41_0==123||(LA41_0>=125 && LA41_0<=127)||(LA41_0>=137 && LA41_0<=139)) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("423:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 41, 0, input);
            
                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal106=(Token)input.LT(1);
                    match(input,136,FOLLOW_136_in_notExpression1333); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal106_tree = (Object)adaptor.create(string_literal106);
                    root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:425:4: ( LINE_BREAK )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);
                        
                        if ( (LA40_0==LINE_BREAK) ) {
                            alt40=1;
                        }
                        
                    
                        switch (alt40) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:425:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK107=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1340); if (failed) return retval;
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1348);
                    notExpression108=notExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, notExpression108.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_definedExpression_in_notExpression1354);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:1: definedExpression : ( 'defined?' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal110=null;
        assignmentExpression_return assignmentExpression111 = null;

        assignmentExpression_return assignmentExpression112 = null;
        

        Object string_literal110_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:2: ( 'defined?' assignmentExpression | assignmentExpression )
            int alt42=2;
            int LA42_0 = input.LA(1);
            
            if ( (LA42_0==137) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||LA42_0==ID||LA42_0==STAR||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING_SIMPLE && LA42_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA42_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA42_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA42_0==LCURLY||LA42_0==LPAREN||LA42_0==COLON||LA42_0==123||(LA42_0>=125 && LA42_0<=127)||(LA42_0>=138 && LA42_0<=139)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("429:1: definedExpression : ( 'defined?' assignmentExpression | assignmentExpression );", 42, 0, input);
            
                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:4: 'defined?' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal110=(Token)input.LT(1);
                    match(input,137,FOLLOW_137_in_definedExpression1365); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal110_tree = (Object)adaptor.create(string_literal110);
                    root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                    }
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1368);
                    assignmentExpression111=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression111.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1379);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ASSIGN114=null;
        Token set118=null;
        mlhs_return mlhs113 = null;

        mrhs_return mrhs115 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression116 = null;

        lhs_return lhs117 = null;

        definedExpression_return definedExpression119 = null;
        

        Object ASSIGN114_tree=null;
        Object set118_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:2: ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression )
            int alt43=3;
            int LA43_0 = input.LA(1);
            
            if ( (LA43_0==ID) ) {
                int LA43_1 = input.LA(2);
                
                if ( (LA43_1==EOF||(LA43_1>=LEFT_SHIFT && LA43_1<=FLOAT)||(LA43_1>=DIV && LA43_1<=MOD)||(LA43_1>=IF_MODIFIER && LA43_1<=LINE_BREAK)||LA43_1==DOT||(LA43_1>=ID && LA43_1<=POWER)||(LA43_1>=QUESTION && LA43_1<=REGEX)||(LA43_1>=SINGLE_QUOTE_STRING_SIMPLE && LA43_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA43_1>=LCURLY && LA43_1<=RCURLY)||LA43_1==ASSOC||(LA43_1>=LPAREN && LA43_1<=RPAREN)||LA43_1==COLON||(LA43_1>=123 && LA43_1<=130)||(LA43_1>=134 && LA43_1<=135)||(LA43_1>=137 && LA43_1<=139)) ) {
                    alt43=2;
                }
                else if ( (LA43_1==COMMA) ) {
                    switch ( input.LA(3) ) {
                    case HEREDOC_STRING:
                    case FLOAT:
                    case IF_MODIFIER:
                    case UNLESS_MODIFIER:
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
                    case RCURLY:
                    case LPAREN:
                    case COLON:
                    case 123:
                    case 125:
                    case 126:
                    case 127:
                    case 137:
                    case 138:
                    case 139:
                        {
                        alt43=2;
                        }
                        break;
                    case ID:
                        {
                        int LA43_7 = input.LA(4);
                        
                        if ( (synpred1()) ) {
                            alt43=1;
                        }
                        else if ( ((isDefinedVar(tokenStream.LT(1).getText())||!isDefinedVar(tokenStream.LT(1).getText()))) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );", 43, 7, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case STAR:
                        {
                        int LA43_8 = input.LA(4);
                        
                        if ( (LA43_8==ID) ) {
                            int LA43_9 = input.LA(5);
                            
                            if ( (synpred1()) ) {
                                alt43=1;
                            }
                            else if ( ((isDefinedVar(tokenStream.LT(1).getText())||!isDefinedVar(tokenStream.LT(1).getText()))) ) {
                                alt43=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );", 43, 9, input);
                            
                                throw nvae;
                            }
                        }
                        else if ( ((LA43_8>=SEMI && LA43_8<=LINE_BREAK)||LA43_8==RPAREN) ) {
                            alt43=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );", 43, 8, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );", 43, 4, input);
                    
                        throw nvae;
                    }
                
                }
                else if ( ((LA43_1>=MOD_ASSIGN && LA43_1<=POWER_ASSIGN)) ) {
                    alt43=3;
                }
                else if ( (LA43_1==ASSIGN) && (synpred1())) {
                    alt43=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );", 43, 1, input);
                
                    throw nvae;
                }
            }
            else if ( (LA43_0==STAR) && (synpred1())) {
                alt43=1;
            }
            else if ( ((LA43_0>=HEREDOC_STRING && LA43_0<=FLOAT)||(LA43_0>=IF_MODIFIER && LA43_0<=UNLESS_MODIFIER)||(LA43_0>=BNOT && LA43_0<=REGEX)||(LA43_0>=SINGLE_QUOTE_STRING_SIMPLE && LA43_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_0==LCURLY||LA43_0==LPAREN||LA43_0==COLON||LA43_0==123||(LA43_0>=125 && LA43_0<=127)||(LA43_0>=138 && LA43_0<=139)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("439:1: assignmentExpression : ( ( mlhs )=> mlhs ASSIGN mrhs | ternaryIfThenElseExpression | lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression );", 43, 0, input);
            
                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:4: ( mlhs )=> mlhs ASSIGN mrhs
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_mlhs_in_assignmentExpression1399);
                    mlhs113=mlhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mlhs113.getTree());
                    ASSIGN114=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1401); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN114_tree = (Object)adaptor.create(ASSIGN114);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN114_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1404);
                    mrhs115=mrhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs115.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:35: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1409);
                    ternaryIfThenElseExpression116=ternaryIfThenElseExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression116.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:13: lhs ( MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_lhs_in_assignmentExpression1423);
                    lhs117=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs117.getTree());
                    set118=(Token)input.LT(1);
                    if ( (input.LA(1)>=MOD_ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(adaptor.create(set118), root_0);
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1425);    throw mse;
                    }

                    pushFollow(FOLLOW_definedExpression_in_assignmentExpression1467);
                    definedExpression119=definedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression119.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(lhs117.start,lhs117.stop));
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

    public static class mlhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start mlhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );
    public final mlhs_return mlhs() throws RecognitionException {
        mlhs_return retval = new mlhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal120=null;
        Token char_literal121=null;
        lhs_return t0 = null;

        lhs_return t = null;

        star_lhs_return star_lhs122 = null;

        star_lhs_return star_lhs123 = null;
        

        Object char_literal120_tree=null;
        Object char_literal121_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:9: (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs )
            int alt46=2;
            int LA46_0 = input.LA(1);
            
            if ( (LA46_0==ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==STAR) ) {
                alt46=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("444:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );", 46, 0, input);
            
                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:16: t0= lhs ( ',' t= lhs )* ( ',' star_lhs )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_lhs_in_mlhs1499);
                    t0=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, t0.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(t0.start,t0.stop));
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:48: ( ',' t= lhs )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);
                        
                        if ( (LA44_0==COMMA) ) {
                            int LA44_1 = input.LA(2);
                            
                            if ( (LA44_1==ID) ) {
                                alt44=1;
                            }
                            
                        
                        }
                        
                    
                        switch (alt44) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:49: ',' t= lhs
                    	    {
                    	    char_literal120=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_mlhs1504); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal120_tree = (Object)adaptor.create(char_literal120);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal120_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_lhs_in_mlhs1509);
                    	    t=lhs();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, t.getTree());
                    	    if ( backtracking==0 ) {
                    	      addVariable(input.toString(t.start,t.stop));
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:86: ( ',' star_lhs )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);
                    
                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:87: ',' star_lhs
                            {
                            char_literal121=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_mlhs1516); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal121_tree = (Object)adaptor.create(char_literal121);
                            root_0 = (Object)adaptor.becomeRoot(char_literal121_tree, root_0);
                            }
                            pushFollow(FOLLOW_star_lhs_in_mlhs1519);
                            star_lhs122=star_lhs();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, star_lhs122.getTree());
                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:104: star_lhs
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_star_lhs_in_mlhs1524);
                    star_lhs123=star_lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, star_lhs123.getTree());
                    
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
    // $ANTLR end mlhs

    public static class star_lhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start star_lhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:1: star_lhs : STAR lhs -> ^( STAR_ID lhs ) ;
    public final star_lhs_return star_lhs() throws RecognitionException {
        star_lhs_return retval = new star_lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token STAR124=null;
        lhs_return lhs125 = null;
        

        Object STAR124_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:2: ( STAR lhs -> ^( STAR_ID lhs ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:9: STAR lhs
            {
            STAR124=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_lhs1540); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR124);

            pushFollow(FOLLOW_lhs_in_star_lhs1542);
            lhs125=lhs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_lhs.add(lhs125.getTree());

            // AST REWRITE
            // elements: lhs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 447:18: -> ^( STAR_ID lhs )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:21: ^( STAR_ID lhs )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STAR_ID, "STAR_ID"), root_1);

                adaptor.addChild(root_1, stream_lhs.next());

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
    // $ANTLR end star_lhs

    public static class mrhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start mrhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:1: mrhs : definedExpression ( ',' definedExpression )* ;
    public final mrhs_return mrhs() throws RecognitionException {
        mrhs_return retval = new mrhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal127=null;
        definedExpression_return definedExpression126 = null;

        definedExpression_return definedExpression128 = null;
        

        Object char_literal127_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:9: ( definedExpression ( ',' definedExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:16: definedExpression ( ',' definedExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_definedExpression_in_mrhs1570);
            definedExpression126=definedExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression126.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:34: ( ',' definedExpression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);
                
                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }
                
            
                switch (alt47) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:35: ',' definedExpression
            	    {
            	    char_literal127=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_mrhs1573); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal127_tree = (Object)adaptor.create(char_literal127);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal127_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_definedExpression_in_mrhs1576);
            	    definedExpression128=definedExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression128.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop47;
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
    // $ANTLR end mrhs

    public static class ternaryIfThenElseExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start ternaryIfThenElseExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token QUESTION129=null;
        Token char_literal131=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression130 = null;

        rangeExpression_return rangeExpression132 = null;
        

        Object QUESTION129_tree=null;
        Object char_literal131_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:3: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1592);
            r=rangeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt48=2;
            int LA48_0 = input.LA(1);
            
            if ( (LA48_0==QUESTION) ) {
                alt48=1;
            }
            else if ( (LA48_0==EOF||LA48_0==LEFT_SHIFT||(LA48_0>=DIV && LA48_0<=MOD)||(LA48_0>=IF_MODIFIER && LA48_0<=LINE_BREAK)||LA48_0==DOT||(LA48_0>=COMPARE && LA48_0<=POWER)||(LA48_0>=INCLUSIVE_RANGE && LA48_0<=BAND)||LA48_0==RCURLY||LA48_0==ASSOC||LA48_0==RPAREN||(LA48_0>=COMMA && LA48_0<=COLON)||LA48_0==124||(LA48_0>=128 && LA48_0<=130)||(LA48_0>=134 && LA48_0<=135)) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("457:23: ( QUESTION rangeExpression ':' rangeExpression | )", 48, 0, input);
            
                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION129=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1596); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION129_tree = (Object)adaptor.create(QUESTION129);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION129_tree, root_0);
                    }
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1599);
                    rangeExpression130=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression130.getTree());
                    char_literal131=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1601); if (failed) return retval;
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1604);
                    rangeExpression132=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression132.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:73: 
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INCLUSIVE_RANGE134=null;
        Token LINE_BREAK135=null;
        Token EXCLUSIVE_RANGE136=null;
        Token LINE_BREAK137=null;
        logicalOrExpression_return logicalOrExpression133 = null;

        logicalOrExpression_return logicalOrExpression138 = null;
        

        Object INCLUSIVE_RANGE134_tree=null;
        Object LINE_BREAK135_tree=null;
        Object EXCLUSIVE_RANGE136_tree=null;
        Object LINE_BREAK137_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:3: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1621);
            logicalOrExpression133=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression133.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);
                
                if ( (LA52_0==INCLUSIVE_RANGE) ) {
                    alt52=1;
                }
                else if ( (LA52_0==EXCLUSIVE_RANGE) ) {
                    alt52=1;
                }
                
            
                switch (alt52) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);
            	    
            	    if ( (LA51_0==INCLUSIVE_RANGE) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==EXCLUSIVE_RANGE) ) {
            	        alt51=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("464:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 51, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE134=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1640); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            INCLUSIVE_RANGE134_tree = (Object)adaptor.create(INCLUSIVE_RANGE134);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE134_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:24: ( LINE_BREAK )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);
            	                
            	                if ( (LA49_0==LINE_BREAK) ) {
            	                    alt49=1;
            	                }
            	                
            	            
            	                switch (alt49) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK135=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1644); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE136=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1655); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EXCLUSIVE_RANGE136_tree = (Object)adaptor.create(EXCLUSIVE_RANGE136);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE136_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:24: ( LINE_BREAK )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);
            	                
            	                if ( (LA50_0==LINE_BREAK) ) {
            	                    alt50=1;
            	                }
            	                
            	            
            	                switch (alt50) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1659); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1674);
            	    logicalOrExpression138=logicalOrExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression138.getTree());
            	    
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
    // $ANTLR end rangeExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start logicalOrExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LOGICAL_OR140=null;
        Token LINE_BREAK141=null;
        logicalAndExpression_return logicalAndExpression139 = null;

        logicalAndExpression_return logicalAndExpression142 = null;
        

        Object LOGICAL_OR140_tree=null;
        Object LINE_BREAK141_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:3: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1694);
            logicalAndExpression139=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression139.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);
                
                if ( (LA54_0==LOGICAL_OR) ) {
                    alt54=1;
                }
                
            
                switch (alt54) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR140=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1726); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_OR140_tree = (Object)adaptor.create(LOGICAL_OR140);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR140_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:18: ( LINE_BREAK )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);
            	        
            	        if ( (LA53_0==LINE_BREAK) ) {
            	            alt53=1;
            	        }
            	        
            	    
            	        switch (alt53) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK141=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1731); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1740);
            	    logicalAndExpression142=logicalAndExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression142.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop54;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LOGICAL_AND144=null;
        Token LINE_BREAK145=null;
        equalityExpression_return equalityExpression143 = null;

        equalityExpression_return equalityExpression146 = null;
        

        Object LOGICAL_AND144_tree=null;
        Object LINE_BREAK145_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:3: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1760);
            equalityExpression143=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression143.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);
                
                if ( (LA56_0==LOGICAL_AND) ) {
                    alt56=1;
                }
                
            
                switch (alt56) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND144=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1792); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_AND144_tree = (Object)adaptor.create(LOGICAL_AND144);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND144_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:19: ( LINE_BREAK )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);
            	        
            	        if ( (LA55_0==LINE_BREAK) ) {
            	            alt55=1;
            	        }
            	        
            	    
            	        switch (alt55) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK145=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1797); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop55;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1806);
            	    equalityExpression146=equalityExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression146.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop56;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token COMPARE148=null;
        Token LINE_BREAK149=null;
        Token EQUAL150=null;
        Token LINE_BREAK151=null;
        Token CASE_EQUAL152=null;
        Token LINE_BREAK153=null;
        Token NOT_EQUAL154=null;
        Token LINE_BREAK155=null;
        Token MATCH156=null;
        Token LINE_BREAK157=null;
        Token NOT_MATCH158=null;
        Token LINE_BREAK159=null;
        relationalExpression_return relationalExpression147 = null;

        relationalExpression_return relationalExpression160 = null;
        

        Object COMPARE148_tree=null;
        Object LINE_BREAK149_tree=null;
        Object EQUAL150_tree=null;
        Object LINE_BREAK151_tree=null;
        Object CASE_EQUAL152_tree=null;
        Object LINE_BREAK153_tree=null;
        Object NOT_EQUAL154_tree=null;
        Object LINE_BREAK155_tree=null;
        Object MATCH156_tree=null;
        Object LINE_BREAK157_tree=null;
        Object NOT_MATCH158_tree=null;
        Object LINE_BREAK159_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:3: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1826);
            relationalExpression147=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression147.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop64:
            do {
                int alt64=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt64=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt64=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt64=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt64=1;
                    }
                    break;
                case MATCH:
                    {
                    alt64=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt64=1;
                    }
                    break;
                
                }
            
                switch (alt64) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt63=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt63=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt63=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt63=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt63=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt63=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt63=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("493:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 63, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt63) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE148=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1860); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            COMPARE148_tree = (Object)adaptor.create(COMPARE148);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE148_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:17: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);
            	                
            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }
            	                
            	            
            	                switch (alt57) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK149=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1865); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL150=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1876); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQUAL150_tree = (Object)adaptor.create(EQUAL150);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL150_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:16: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);
            	                
            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }
            	                
            	            
            	                switch (alt58) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK151=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1882); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL152=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1893); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            CASE_EQUAL152_tree = (Object)adaptor.create(CASE_EQUAL152);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL152_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:19: ( LINE_BREAK )*
            	            loop59:
            	            do {
            	                int alt59=2;
            	                int LA59_0 = input.LA(1);
            	                
            	                if ( (LA59_0==LINE_BREAK) ) {
            	                    alt59=1;
            	                }
            	                
            	            
            	                switch (alt59) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK153=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1897); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop59;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL154=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1908); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_EQUAL154_tree = (Object)adaptor.create(NOT_EQUAL154);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL154_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:19: ( LINE_BREAK )*
            	            loop60:
            	            do {
            	                int alt60=2;
            	                int LA60_0 = input.LA(1);
            	                
            	                if ( (LA60_0==LINE_BREAK) ) {
            	                    alt60=1;
            	                }
            	                
            	            
            	                switch (alt60) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK155=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1913); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop60;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 5 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH156=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1924); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MATCH156_tree = (Object)adaptor.create(MATCH156);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH156_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:16: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);
            	                
            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }
            	                
            	            
            	                switch (alt61) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1930); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 6 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH158=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1941); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_MATCH158_tree = (Object)adaptor.create(NOT_MATCH158);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH158_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:19: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);
            	                
            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }
            	                
            	            
            	                switch (alt62) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK159=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1946); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1961);
            	    relationalExpression160=relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression160.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop64;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LESS_THAN162=null;
        Token LINE_BREAK163=null;
        Token GREATER_THAN164=null;
        Token LINE_BREAK165=null;
        Token LESS_OR_EQUAL166=null;
        Token LINE_BREAK167=null;
        Token GREATER_OR_EQUAL168=null;
        Token LINE_BREAK169=null;
        orExpression_return orExpression161 = null;

        orExpression_return orExpression170 = null;
        

        Object LESS_THAN162_tree=null;
        Object LINE_BREAK163_tree=null;
        Object GREATER_THAN164_tree=null;
        Object LINE_BREAK165_tree=null;
        Object LESS_OR_EQUAL166_tree=null;
        Object LINE_BREAK167_tree=null;
        Object GREATER_OR_EQUAL168_tree=null;
        Object LINE_BREAK169_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:3: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_orExpression_in_relationalExpression1982);
            orExpression161=orExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpression161.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop70:
            do {
                int alt70=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt70=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt70=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt70=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt70=1;
                    }
                    break;
                
                }
            
                switch (alt70) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt69=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt69=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt69=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt69=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt69=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("509:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 69, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt69) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN162=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression2016); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_THAN162_tree = (Object)adaptor.create(LESS_THAN162);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN162_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:20: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);
            	                
            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }
            	                
            	            
            	                switch (alt65) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK163=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2022); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN164=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression2033); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_THAN164_tree = (Object)adaptor.create(GREATER_THAN164);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN164_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:22: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);
            	                
            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }
            	                
            	            
            	                switch (alt66) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK165=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2038); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL166=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression2049); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_OR_EQUAL166_tree = (Object)adaptor.create(LESS_OR_EQUAL166);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL166_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:23: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);
            	                
            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }
            	                
            	            
            	                switch (alt67) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK167=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2054); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL168=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2065); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_OR_EQUAL168_tree = (Object)adaptor.create(GREATER_OR_EQUAL168);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL168_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:25: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);
            	                
            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }
            	                
            	            
            	                switch (alt68) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK169=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2069); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression2084);
            	    orExpression170=orExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, orExpression170.getTree());
            	    
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
    // $ANTLR end relationalExpression

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start orExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BXOR172=null;
        Token LINE_BREAK173=null;
        Token BOR174=null;
        Token LINE_BREAK175=null;
        andExpression_return andExpression171 = null;

        andExpression_return andExpression176 = null;
        

        Object BXOR172_tree=null;
        Object LINE_BREAK173_tree=null;
        Object BOR174_tree=null;
        Object LINE_BREAK175_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:3: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_andExpression_in_orExpression2104);
            andExpression171=andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpression171.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);
                
                if ( (LA74_0==BXOR) ) {
                    alt74=1;
                }
                else if ( (LA74_0==BOR) ) {
                    alt74=1;
                }
                
            
                switch (alt74) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);
            	    
            	    if ( (LA73_0==BXOR) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==BOR) ) {
            	        alt73=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("522:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 73, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR172=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression2138); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BXOR172_tree = (Object)adaptor.create(BXOR172);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR172_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:15: ( LINE_BREAK )*
            	            loop71:
            	            do {
            	                int alt71=2;
            	                int LA71_0 = input.LA(1);
            	                
            	                if ( (LA71_0==LINE_BREAK) ) {
            	                    alt71=1;
            	                }
            	                
            	            
            	                switch (alt71) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK173=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2144); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop71;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR174=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression2155); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BOR174_tree = (Object)adaptor.create(BOR174);
            	            root_0 = (Object)adaptor.becomeRoot(BOR174_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:14: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);
            	                
            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }
            	                
            	            
            	                switch (alt72) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK175=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2161); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2176);
            	    andExpression176=andExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, andExpression176.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop74;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BAND178=null;
        Token LINE_BREAK179=null;
        shiftExpression_return shiftExpression177 = null;

        shiftExpression_return shiftExpression180 = null;
        

        Object BAND178_tree=null;
        Object LINE_BREAK179_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:3: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_shiftExpression_in_andExpression2196);
            shiftExpression177=shiftExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression177.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);
                
                if ( (LA76_0==BAND) ) {
                    alt76=1;
                }
                
            
                switch (alt76) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND178=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2228); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BAND178_tree = (Object)adaptor.create(BAND178);
            	    root_0 = (Object)adaptor.becomeRoot(BAND178_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:13: ( LINE_BREAK )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);
            	        
            	        if ( (LA75_0==LINE_BREAK) ) {
            	            alt75=1;
            	        }
            	        
            	    
            	        switch (alt75) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK179=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2234); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2243);
            	    shiftExpression180=shiftExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression180.getTree());
            	    
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
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start shiftExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LEFT_SHIFT182=null;
        Token LINE_BREAK183=null;
        Token RIGHT_SHIFT184=null;
        Token LINE_BREAK185=null;
        additiveExpression_return additiveExpression181 = null;

        additiveExpression_return additiveExpression186 = null;
        

        Object LEFT_SHIFT182_tree=null;
        Object LINE_BREAK183_tree=null;
        Object RIGHT_SHIFT184_tree=null;
        Object LINE_BREAK185_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:3: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2265);
            additiveExpression181=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression181.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);
                
                if ( (LA80_0==LEFT_SHIFT) ) {
                    alt80=1;
                }
                else if ( (LA80_0==RIGHT_SHIFT) ) {
                    alt80=1;
                }
                
            
                switch (alt80) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);
            	    
            	    if ( (LA79_0==LEFT_SHIFT) ) {
            	        alt79=1;
            	    }
            	    else if ( (LA79_0==RIGHT_SHIFT) ) {
            	        alt79=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("544:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 79, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT182=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2299); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LEFT_SHIFT182_tree = (Object)adaptor.create(LEFT_SHIFT182);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT182_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:20: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);
            	                
            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }
            	                
            	            
            	                switch (alt77) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK183=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2304); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT184=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2315); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            RIGHT_SHIFT184_tree = (Object)adaptor.create(RIGHT_SHIFT184);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT184_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:20: ( LINE_BREAK )*
            	            loop78:
            	            do {
            	                int alt78=2;
            	                int LA78_0 = input.LA(1);
            	                
            	                if ( (LA78_0==LINE_BREAK) ) {
            	                    alt78=1;
            	                }
            	                
            	            
            	                switch (alt78) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK185=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2319); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop78;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2334);
            	    additiveExpression186=additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression186.getTree());
            	    
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
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start additiveExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token PLUS188=null;
        Token LINE_BREAK189=null;
        Token MINUS190=null;
        Token LINE_BREAK191=null;
        multiplicativeExpression_return multiplicativeExpression187 = null;

        multiplicativeExpression_return multiplicativeExpression192 = null;
        

        Object PLUS188_tree=null;
        Object LINE_BREAK189_tree=null;
        Object MINUS190_tree=null;
        Object LINE_BREAK191_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:3: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2356);
            multiplicativeExpression187=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression187.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);
                
                if ( (LA84_0==PLUS) ) {
                    alt84=1;
                }
                else if ( (LA84_0==MINUS) ) {
                    alt84=1;
                }
                
            
                switch (alt84) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);
            	    
            	    if ( (LA83_0==PLUS) ) {
            	        alt83=1;
            	    }
            	    else if ( (LA83_0==MINUS) ) {
            	        alt83=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("557:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 83, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS188=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2390); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS188_tree = (Object)adaptor.create(PLUS188);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS188_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:16: ( LINE_BREAK )*
            	            loop81:
            	            do {
            	                int alt81=2;
            	                int LA81_0 = input.LA(1);
            	                
            	                if ( (LA81_0==LINE_BREAK) ) {
            	                    alt81=1;
            	                }
            	                
            	            
            	                switch (alt81) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK189=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2397); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop81;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS190=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2408); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS190_tree = (Object)adaptor.create(MINUS190);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS190_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:17: ( LINE_BREAK )*
            	            loop82:
            	            do {
            	                int alt82=2;
            	                int LA82_0 = input.LA(1);
            	                
            	                if ( (LA82_0==LINE_BREAK) ) {
            	                    alt82=1;
            	                }
            	                
            	            
            	                switch (alt82) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK191=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2415); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop82;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2430);
            	    multiplicativeExpression192=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression192.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop84;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token STAR194=null;
        Token LINE_BREAK195=null;
        Token DIV196=null;
        Token LINE_BREAK197=null;
        Token MOD198=null;
        Token LINE_BREAK199=null;
        powerExpression_return powerExpression193 = null;

        powerExpression_return powerExpression200 = null;
        

        Object STAR194_tree=null;
        Object LINE_BREAK195_tree=null;
        Object DIV196_tree=null;
        Object LINE_BREAK197_tree=null;
        Object MOD198_tree=null;
        Object LINE_BREAK199_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:3: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2450);
            powerExpression193=powerExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression193.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop89:
            do {
                int alt89=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt89=1;
                    }
                    break;
                case DIV:
                    {
                    alt89=1;
                    }
                    break;
                case MOD:
                    {
                    alt89=1;
                    }
                    break;
                
                }
            
                switch (alt89) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt88=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt88=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt88=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt88=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("568:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 88, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt88) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR194=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2484); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            STAR194_tree = (Object)adaptor.create(STAR194);
            	            root_0 = (Object)adaptor.becomeRoot(STAR194_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:15: ( LINE_BREAK )*
            	            loop85:
            	            do {
            	                int alt85=2;
            	                int LA85_0 = input.LA(1);
            	                
            	                if ( (LA85_0==LINE_BREAK) ) {
            	                    alt85=1;
            	                }
            	                
            	            
            	                switch (alt85) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK195=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2490); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop85;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV196=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2501); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV196_tree = (Object)adaptor.create(DIV196);
            	            root_0 = (Object)adaptor.becomeRoot(DIV196_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:14: ( LINE_BREAK )*
            	            loop86:
            	            do {
            	                int alt86=2;
            	                int LA86_0 = input.LA(1);
            	                
            	                if ( (LA86_0==LINE_BREAK) ) {
            	                    alt86=1;
            	                }
            	                
            	            
            	                switch (alt86) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK197=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2507); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop86;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD198=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2518); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD198_tree = (Object)adaptor.create(MOD198);
            	            root_0 = (Object)adaptor.becomeRoot(MOD198_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:14: ( LINE_BREAK )*
            	            loop87:
            	            do {
            	                int alt87=2;
            	                int LA87_0 = input.LA(1);
            	                
            	                if ( (LA87_0==LINE_BREAK) ) {
            	                    alt87=1;
            	                }
            	                
            	            
            	                switch (alt87) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK199=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2524); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop87;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2539);
            	    powerExpression200=powerExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression200.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop89;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token POWER202=null;
        Token LINE_BREAK203=null;
        bnotExpression_return bnotExpression201 = null;

        bnotExpression_return bnotExpression204 = null;
        

        Object POWER202_tree=null;
        Object LINE_BREAK203_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:3: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_bnotExpression_in_powerExpression2560);
            bnotExpression201=bnotExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression201.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);
                
                if ( (LA91_0==POWER) ) {
                    alt91=1;
                }
                
            
                switch (alt91) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER202=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2595); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    POWER202_tree = (Object)adaptor.create(POWER202);
            	    root_0 = (Object)adaptor.becomeRoot(POWER202_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:14: ( LINE_BREAK )*
            	    loop90:
            	    do {
            	        int alt90=2;
            	        int LA90_0 = input.LA(1);
            	        
            	        if ( (LA90_0==LINE_BREAK) ) {
            	            alt90=1;
            	        }
            	        
            	    
            	        switch (alt90) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK203=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2601); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop90;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2610);
            	    bnotExpression204=bnotExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression204.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop91;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BNOT205=null;
        Token LINE_BREAK206=null;
        Token NOT207=null;
        Token LINE_BREAK208=null;
        command_return command209 = null;
        

        Object BNOT205_tree=null;
        Object LINE_BREAK206_tree=null;
        Object NOT207_tree=null;
        Object LINE_BREAK208_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:3: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop94:
            do {
                int alt94=3;
                int LA94_0 = input.LA(1);
                
                if ( (LA94_0==BNOT) ) {
                    alt94=1;
                }
                else if ( (LA94_0==NOT) ) {
                    alt94=2;
                }
                
            
                switch (alt94) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT205=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2632); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BNOT205_tree = (Object)adaptor.create(BNOT205);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT205_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:15: ( LINE_BREAK )*
            	    loop92:
            	    do {
            	        int alt92=2;
            	        int LA92_0 = input.LA(1);
            	        
            	        if ( (LA92_0==LINE_BREAK) ) {
            	            alt92=1;
            	        }
            	        
            	    
            	        switch (alt92) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK206=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2638); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop92;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            	case 2 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT207=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2648); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT207_tree = (Object)adaptor.create(NOT207);
            	    root_0 = (Object)adaptor.becomeRoot(NOT207_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:13: ( LINE_BREAK )*
            	    loop93:
            	    do {
            	        int alt93=2;
            	        int LA93_0 = input.LA(1);
            	        
            	        if ( (LA93_0==LINE_BREAK) ) {
            	            alt93=1;
            	        }
            	        
            	    
            	        switch (alt93) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK208=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2654); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop93;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            
            	default :
            	    break loop94;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2668);
            command209=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command209.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal210=null;
        Token string_literal211=null;
        Token char_literal218=null;
        Token char_literal220=null;
        Token DOT221=null;
        literal_return literal212 = null;

        boolean_expression_return boolean_expression213 = null;

        block_expression_return block_expression214 = null;

        if_expression_return if_expression215 = null;

        unless_expression_return unless_expression216 = null;

        atom_return atom217 = null;

        expression_return expression219 = null;

        method_return method222 = null;
        

        Object string_literal210_tree=null;
        Object string_literal211_tree=null;
        Object char_literal218_tree=null;
        Object char_literal220_tree=null;
        Object DOT221_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:2: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )
            int alt95=9;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt95=1;
                }
                break;
            case 139:
                {
                alt95=2;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt95=3;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt95=3;
                }
                break;
            case HEREDOC_STRING:
            case ARRAY:
            case REGEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt95=3;
                }
                break;
            case COLON:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt95=3;
                    }
                    break;
                case SINGLE_QUOTE_STRING_SIMPLE:
                case SINGLE_QUOTE_STRING_COMPLEX:
                    {
                    alt95=3;
                    }
                    break;
                case DOUBLE_QUOTE_STRING_SIMPLE:
                case DOUBLE_QUOTE_STRING_COMPLEX:
                    {
                    alt95=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("595:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 95, 6, input);
                
                    throw nvae;
                }
            
                }
                break;
            case 125:
            case 126:
            case 127:
                {
                alt95=4;
                }
                break;
            case 123:
                {
                alt95=5;
                }
                break;
            case IF_MODIFIER:
                {
                alt95=6;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt95=7;
                }
                break;
            case ID:
            case LCURLY:
                {
                alt95=8;
                }
                break;
            case LPAREN:
                {
                alt95=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("595:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 95, 0, input);
            
                throw nvae;
            }
            
            switch (alt95) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:4: 'expression0'
                    {
                    string_literal210=(Token)input.LT(1);
                    match(input,138,FOLLOW_138_in_command2683); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal210_tree = (Object)adaptor.create(string_literal210);
                    adaptor.addChild(root_0, string_literal210_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:20: 'expression1'
                    {
                    string_literal211=(Token)input.LT(1);
                    match(input,139,FOLLOW_139_in_command2687); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal211_tree = (Object)adaptor.create(string_literal211);
                    adaptor.addChild(root_0, string_literal211_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2690);
                    literal212=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal212.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2692);
                    boolean_expression213=boolean_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression213.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2695);
                    block_expression214=block_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_expression214.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2697);
                    if_expression215=if_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, if_expression215.getTree());
                    
                    }
                    break;
                case 7 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2699);
                    unless_expression216=unless_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unless_expression216.getTree());
                    
                    }
                    break;
                case 8 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2701);
                    atom217=atom(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atom217.getTree());
                    
                    }
                    break;
                case 9 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:125: '(' expression ')'
                    {
                    char_literal218=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_command2706); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal218_tree = (Object)adaptor.create(char_literal218);
                    adaptor.addChild(root_0, char_literal218_tree);
                    }
                    pushFollow(FOLLOW_expression_in_command2708);
                    expression219=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression219.getTree());
                    char_literal220=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_command2710); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal220_tree = (Object)adaptor.create(char_literal220);
                    adaptor.addChild(root_0, char_literal220_tree);
                    }
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:146: ( DOT method[false] )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);
                
                if ( (LA96_0==DOT) ) {
                    alt96=1;
                }
                
            
                switch (alt96) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:147: DOT method[false]
            	    {
            	    DOT221=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2715); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOT221_tree = (Object)adaptor.create(DOT221);
            	    root_0 = (Object)adaptor.becomeRoot(DOT221_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_method_in_command2718);
            	    method222=method(false);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, method222.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop96;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:1: atom[boolean topLevel] : ( methodExpression[topLevel] | hash | single_quote_string | double_quote_string | symbol );
    public final atom_return atom(boolean topLevel) throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodExpression_return methodExpression223 = null;

        hash_return hash224 = null;

        single_quote_string_return single_quote_string225 = null;

        double_quote_string_return double_quote_string226 = null;

        symbol_return symbol227 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:24: ( methodExpression[topLevel] | hash | single_quote_string | double_quote_string | symbol )
            int alt97=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt97=1;
                }
                break;
            case LCURLY:
                {
                alt97=2;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt97=3;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt97=4;
                }
                break;
            case COLON:
                {
                alt97=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("597:1: atom[boolean topLevel] : ( methodExpression[topLevel] | hash | single_quote_string | double_quote_string | symbol );", 97, 0, input);
            
                throw nvae;
            }
            
            switch (alt97) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:26: methodExpression[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_methodExpression_in_atom2732);
                    methodExpression223=methodExpression(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, methodExpression223.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:53: hash
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_hash_in_atom2735);
                    hash224=hash();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, hash224.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:58: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_single_quote_string_in_atom2737);
                    single_quote_string225=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string225.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:78: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_double_quote_string_in_atom2739);
                    double_quote_string226=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string226.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:597:98: symbol
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_in_atom2741);
                    symbol227=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol227.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:598:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        variable_return variable228 = null;

        method_return method229 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:2: ( variable | method[topLevel] )
            int alt98=2;
            int LA98_0 = input.LA(1);
            
            if ( (LA98_0==ID) ) {
                int LA98_1 = input.LA(2);
                
                if ( (isDefinedVar(tokenStream.LT(1).getText())) ) {
                    alt98=1;
                }
                else if ( (true) ) {
                    alt98=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("598:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 98, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("598:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 98, 0, input);
            
                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:9: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_methodExpression2755);
                    variable228=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable228.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:18: method[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_method_in_methodExpression2757);
                    method229=method(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, method229.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID230=null;

        Object ID230_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:9: ({...}? ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:11: {...}? ID
            {
            if ( !(isDefinedVar(tokenStream.LT(1).getText())) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "variable", "isDefinedVar(tokenStream.LT(1).getText())");
            }
            ID230=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2766); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID230);


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
            // 600:59: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:62: ^( VARIABLE ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID231=null;
        Token ID232=null;
        open_args_return open_args233 = null;
        

        Object ID231_tree=null;
        Object ID232_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:26: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt99=2;
            alt99 = dfa99.predict(input);
            switch (alt99) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:28: {...}? ID
                    {
                    if ( !(!isDefinedVar(tokenStream.LT(1).getText())) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(tokenStream.LT(1).getText())");
                    }
                    ID231=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2784); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID231);


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
                    // 601:77: -> ^( CALL ID )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:80: ^( CALL ID )
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:17: ID open_args
                    {
                    ID232=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2810); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID232);

                    pushFollow(FOLLOW_open_args_in_method2812);
                    open_args233=open_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_open_args.add(open_args233.getTree());

                    // AST REWRITE
                    // elements: ID, open_args
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 602:30: -> ^( CALL ID open_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:33: ^( CALL ID open_args )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal234=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        call_args_return call_args235 = null;

        call_args_return call_args239 = null;
        

        Object char_literal234_tree=null;
        Object char_literal236_tree=null;
        Object char_literal237_tree=null;
        Object char_literal238_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:2: ( '(' call_args ')' | '(' ')' | call_args )
            int alt100=3;
            int LA100_0 = input.LA(1);
            
            if ( (LA100_0==LPAREN) ) {
                int LA100_1 = input.LA(2);
                
                if ( (synpred2()) ) {
                    alt100=1;
                }
                else if ( (synpred3()) ) {
                    alt100=2;
                }
                else if ( (true) ) {
                    alt100=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("616:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 100, 1, input);
                
                    throw nvae;
                }
            }
            else if ( ((LA100_0>=HEREDOC_STRING && LA100_0<=FLOAT)||(LA100_0>=IF_MODIFIER && LA100_0<=UNLESS_MODIFIER)||LA100_0==ID||LA100_0==STAR||(LA100_0>=BNOT && LA100_0<=REGEX)||(LA100_0>=SINGLE_QUOTE_STRING_SIMPLE && LA100_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA100_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA100_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA100_0==LCURLY||LA100_0==COLON||LA100_0==123||(LA100_0>=125 && LA100_0<=127)||(LA100_0>=137 && LA100_0<=139)) ) {
                alt100=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("616:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 100, 0, input);
            
                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:4: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal234=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2850); if (failed) return retval;
                    pushFollow(FOLLOW_call_args_in_open_args2853);
                    call_args235=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args235.getTree());
                    char_literal236=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2855); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:4: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal237=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2861); if (failed) return retval;
                    char_literal238=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2864); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_call_args_in_open_args2870);
                    call_args239=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args239.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        args_return args240 = null;
        

        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:2: ( args -> ^( ARG args ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2898);
            args240=args();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_args.add(args240.getTree());

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
            // 630:10: -> ^( ARG args )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:13: ^( ARG args )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal242=null;
        arg_return arg241 = null;

        arg_return arg243 = null;
        

        Object char_literal242_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:6: ( arg ( ',' arg )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_arg_in_args2916);
            arg241=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg241.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:12: ( ',' arg )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);
                
                if ( (LA101_0==COMMA) ) {
                    alt101=1;
                }
                
            
                switch (alt101) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:13: ',' arg
            	    {
            	    char_literal242=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2919); if (failed) return retval;
            	    pushFollow(FOLLOW_arg_in_args2922);
            	    arg243=arg();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, arg243.getTree());
            	    
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
    // $ANTLR end args

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start arg
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        definedExpression_return definedExpression244 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:5: ( definedExpression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_definedExpression_in_arg2933);
            definedExpression244=definedExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression244.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set245=null;

        Object set245_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:16: ( ID | CONSTANT | FID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set245=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set245));
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID246=null;
        Token CONSTANT247=null;
        Token FID248=null;
        op_return op249 = null;
        

        Object ID246_tree=null;
        Object CONSTANT247_tree=null;
        Object FID248_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:15: ( ID | CONSTANT | FID | op )
            int alt102=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt102=1;
                }
                break;
            case CONSTANT:
                {
                alt102=2;
                }
                break;
            case FID:
                {
                alt102=3;
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
            case 133:
                {
                alt102=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("641:1: operation2 : ( ID | CONSTANT | FID | op );", 102, 0, input);
            
                throw nvae;
            }
            
            switch (alt102) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID246=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22971); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID246_tree = (Object)adaptor.create(ID246);
                    adaptor.addChild(root_0, ID246_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT247=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22975); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT247_tree = (Object)adaptor.create(CONSTANT247);
                    adaptor.addChild(root_0, CONSTANT247_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:33: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID248=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22979); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID248_tree = (Object)adaptor.create(FID248);
                    adaptor.addChild(root_0, FID248_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:39: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation22983);
                    op249=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op249.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID250=null;
        Token FID251=null;
        op_return op252 = null;
        

        Object ID250_tree=null;
        Object FID251_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:15: ( ID | FID | op )
            int alt103=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt103=1;
                }
                break;
            case FID:
                {
                alt103=2;
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
            case 133:
                {
                alt103=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("644:1: operation3 : ( ID | FID | op );", 103, 0, input);
            
                throw nvae;
            }
            
            switch (alt103) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID250=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32999); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID250_tree = (Object)adaptor.create(ID250);
                    adaptor.addChild(root_0, ID250_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:22: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID251=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation33003); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID251_tree = (Object)adaptor.create(FID251);
                    adaptor.addChild(root_0, FID251_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:28: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation33007);
                    op252=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op252.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID253=null;

        Object ID253_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:5: ( ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:7: ID
            {
            ID253=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs3021); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID253);


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
            // 647:10: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:13: ^( VARIABLE ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression254 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:5: ( expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:7: expression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_expression_in_rhs3037);
            expression254=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression254.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:1: literal : ( INT | FLOAT | string | ARRAY | symbol | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INT255=null;
        Token FLOAT256=null;
        Token ARRAY258=null;
        Token REGEX260=null;
        string_return string257 = null;

        symbol_return symbol259 = null;
        

        Object INT255_tree=null;
        Object FLOAT256_tree=null;
        Object ARRAY258_tree=null;
        Object REGEX260_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:9: ( INT | FLOAT | string | ARRAY | symbol | REGEX )
            int alt104=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt104=1;
                }
                break;
            case FLOAT:
                {
                alt104=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt104=3;
                }
                break;
            case ARRAY:
                {
                alt104=4;
                }
                break;
            case COLON:
                {
                alt104=5;
                }
                break;
            case REGEX:
                {
                alt104=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("652:1: literal : ( INT | FLOAT | string | ARRAY | symbol | REGEX );", 104, 0, input);
            
                throw nvae;
            }
            
            switch (alt104) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:11: INT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    INT255=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal3047); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT255_tree = (Object)adaptor.create(INT255);
                    adaptor.addChild(root_0, INT255_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FLOAT256=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal3049); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT256_tree = (Object)adaptor.create(FLOAT256);
                    adaptor.addChild(root_0, FLOAT256_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:21: string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_string_in_literal3051);
                    string257=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string257.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ARRAY258=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal3053); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ARRAY258_tree = (Object)adaptor.create(ARRAY258);
                    adaptor.addChild(root_0, ARRAY258_tree);
                    }
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:34: symbol
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_in_literal3055);
                    symbol259=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol259.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:652:41: REGEX
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    REGEX260=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal3057); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REGEX260_tree = (Object)adaptor.create(REGEX260);
                    adaptor.addChild(root_0, REGEX260_tree);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token HEREDOC_STRING263=null;
        single_quote_string_return single_quote_string261 = null;

        double_quote_string_return double_quote_string262 = null;
        

        Object HEREDOC_STRING263_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:8: ( single_quote_string | double_quote_string | HEREDOC_STRING )
            int alt105=3;
            switch ( input.LA(1) ) {
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt105=1;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt105=2;
                }
                break;
            case HEREDOC_STRING:
                {
                alt105=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("720:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );", 105, 0, input);
            
                throw nvae;
            }
            
            switch (alt105) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:10: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_single_quote_string_in_string3645);
                    single_quote_string261=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string261.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:30: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_double_quote_string_in_string3647);
                    double_quote_string262=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string262.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:50: HEREDOC_STRING
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    HEREDOC_STRING263=(Token)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_string3649); if (failed) return retval;
                    if ( backtracking==0 ) {
                    HEREDOC_STRING263_tree = (Object)adaptor.create(HEREDOC_STRING263);
                    adaptor.addChild(root_0, HEREDOC_STRING263_tree);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:1: single_quote_string : ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX );
    public final single_quote_string_return single_quote_string() throws RecognitionException {
        single_quote_string_return retval = new single_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set264=null;

        Object set264_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:2: ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set264=(Token)input.LT(1);
            if ( (input.LA(1)>=SINGLE_QUOTE_STRING_SIMPLE && input.LA(1)<=SINGLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set264));
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:770:1: double_quote_string : ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX );
    public final double_quote_string_return double_quote_string() throws RecognitionException {
        double_quote_string_return retval = new double_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set265=null;

        Object set265_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:2: ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set265=(Token)input.LT(1);
            if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_SIMPLE && input.LA(1)<=DOUBLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set265));
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:811:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal266=null;
        Token char_literal268=null;
        assoc_list_return assoc_list267 = null;
        

        Object char_literal266_tree=null;
        Object char_literal268_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:811:6: ( '{' assoc_list '}' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:811:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal266=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash4063); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal266_tree = (Object)adaptor.create(char_literal266);
            root_0 = (Object)adaptor.becomeRoot(char_literal266_tree, root_0);
            }
            pushFollow(FOLLOW_assoc_list_in_hash4066);
            assoc_list267=assoc_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc_list267.getTree());
            char_literal268=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash4068); if (failed) return retval;
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        assocs_return assocs269 = null;

        trailer_return trailer270 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:2: ( assocs trailer )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assocs_in_assoc_list4077);
            assocs269=assocs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assocs269.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list4079);
            trailer270=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer270.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal272=null;
        assoc_return assoc271 = null;

        assoc_return assoc273 = null;
        

        Object char_literal272_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:8: ( assoc ( ',' assoc )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assoc_in_assocs4088);
            assoc271=assoc();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc271.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:16: ( ',' assoc )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);
                
                if ( (LA106_0==COMMA) ) {
                    int LA106_2 = input.LA(2);
                    
                    if ( ((LA106_2>=HEREDOC_STRING && LA106_2<=FLOAT)||(LA106_2>=IF_MODIFIER && LA106_2<=UNLESS_MODIFIER)||LA106_2==ID||LA106_2==STAR||(LA106_2>=BNOT && LA106_2<=REGEX)||(LA106_2>=SINGLE_QUOTE_STRING_SIMPLE && LA106_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA106_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA106_2==LCURLY||LA106_2==LPAREN||LA106_2==COLON||LA106_2==123||(LA106_2>=125 && LA106_2<=127)||(LA106_2>=137 && LA106_2<=139)) ) {
                        alt106=1;
                    }
                    
                
                }
                
            
                switch (alt106) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:18: ',' assoc
            	    {
            	    char_literal272=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs4092); if (failed) return retval;
            	    pushFollow(FOLLOW_assoc_in_assocs4095);
            	    assoc273=assoc();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assoc273.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop106;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal275=null;
        Token set278=null;
        symbol_name_in_assoc_return symbol_name_in_assoc274 = null;

        arg_return arg276 = null;

        arg_return arg277 = null;

        arg_return arg279 = null;
        

        Object char_literal275_tree=null;
        Object set278_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:15: ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg )
            int alt107=2;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:17: ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_name_in_assoc_in_assoc4122);
                    symbol_name_in_assoc274=symbol_name_in_assoc();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol_name_in_assoc274.getTree());
                    char_literal275=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_assoc4124); if (failed) return retval;
                    pushFollow(FOLLOW_arg_in_assoc4127);
                    arg276=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg276.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:82: arg ( ASSOC | ',' ) arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_arg_in_assoc4131);
                    arg277=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg277.getTree());
                    set278=(Token)input.LT(1);
                    if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc4133);    throw mse;
                    }

                    pushFollow(FOLLOW_arg_in_assoc4140);
                    arg279=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg279.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:818:1: symbol_name_in_assoc : ID -> ^( SYMBOL ID ) ;
    public final symbol_name_in_assoc_return symbol_name_in_assoc() throws RecognitionException {
        symbol_name_in_assoc_return retval = new symbol_name_in_assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID280=null;

        Object ID280_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:819:2: ( ID -> ^( SYMBOL ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:819:4: ID
            {
            ID280=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_symbol_name_in_assoc4150); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID280);


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
            // 819:7: -> ^( SYMBOL ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:819:10: ^( SYMBOL ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:824:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK281=null;
        Token char_literal282=null;

        Object LINE_BREAK281_tree=null;
        Object char_literal282_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:824:16: ( | LINE_BREAK | ',' )
            int alt108=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt108=1;
                }
                break;
            case LINE_BREAK:
                {
                alt108=2;
                }
                break;
            case COMMA:
                {
                alt108=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("824:1: trailer : ( | LINE_BREAK | ',' );", 108, 0, input);
            
                throw nvae;
            }
            
            switch (alt108) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:824:29: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:824:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK281=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer4181); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:824:45: ','
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal282=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer4186); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:1: symbol : ':' ( ID | single_quote_string | double_quote_string ) ;
    public final symbol_return symbol() throws RecognitionException {
        symbol_return retval = new symbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal283=null;
        Token ID284=null;
        single_quote_string_return single_quote_string285 = null;

        double_quote_string_return double_quote_string286 = null;
        

        Object char_literal283_tree=null;
        Object ID284_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:8: ( ':' ( ID | single_quote_string | double_quote_string ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:10: ':' ( ID | single_quote_string | double_quote_string )
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal283=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_symbol4202); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal283_tree = (Object)adaptor.create(char_literal283);
            root_0 = (Object)adaptor.becomeRoot(char_literal283_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:15: ( ID | single_quote_string | double_quote_string )
            int alt109=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt109=1;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt109=2;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt109=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("827:15: ( ID | single_quote_string | double_quote_string )", 109, 0, input);
            
                throw nvae;
            }
            
            switch (alt109) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:16: ID
                    {
                    ID284=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_symbol4206); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID284_tree = (Object)adaptor.create(ID284);
                    adaptor.addChild(root_0, ID284_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:21: single_quote_string
                    {
                    pushFollow(FOLLOW_single_quote_string_in_symbol4210);
                    single_quote_string285=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string285.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:43: double_quote_string
                    {
                    pushFollow(FOLLOW_double_quote_string_in_symbol4214);
                    double_quote_string286=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string286.getTree());
                    
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
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:4: ( mlhs )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:5: mlhs
        {
        pushFollow(FOLLOW_mlhs_in_synpred11394);
        mlhs();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:4: ( '(' call_args ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:4: '(' call_args ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred22850); if (failed) return ;
        pushFollow(FOLLOW_call_args_in_synpred22853);
        call_args();
        _fsp--;
        if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred22855); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:4: ( '(' ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:4: '(' ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred32861); if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred32864); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:17: ( symbol_name_in_assoc ':' arg )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:18: symbol_name_in_assoc ':' arg
        {
        pushFollow(FOLLOW_symbol_name_in_assoc_in_synpred44114);
        symbol_name_in_assoc();
        _fsp--;
        if (failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred44116); if (failed) return ;
        pushFollow(FOLLOW_arg_in_synpred44118);
        arg();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred4

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
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
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
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA107 dfa107 = new DFA107(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\45\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\u0081\2\u008b\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\125\uffff\1\3\3\uffff\2\3",
            "\2\4\22\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\5\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\5\uffff\1\4\2\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4\3\uffff\4\4",
            "\2\4\22\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\5\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\5\uffff\1\4\2\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4\3\uffff\4\4",
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
            return "()* loopback of 281:21: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\46\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\u0082\1\u008b\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\121\uffff\1\2\11\uffff\1\3",
            "\2\4\22\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\5\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\5\uffff\1\4\2\uffff\7\4\1\3\2\4\3\uffff\4\4",
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
            return "324:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA99_eotS =
        "\110\uffff";
    static final String DFA99_eofS =
        "\1\uffff\1\2\16\uffff\2\2\66\uffff";
    static final String DFA99_minS =
        "\1\52\1\13\1\uffff\3\14\1\uffff\1\14\1\0\1\13\3\0\1\52\2\0\2\13"+
        "\66\0";
    static final String DFA99_maxS =
        "\1\52\1\u008b\1\uffff\3\u008b\1\uffff\1\u008b\1\0\1\u0085\3\0\1"+
        "\52\2\0\2\u0087\66\0";
    static final String DFA99_acceptS =
        "\2\uffff\1\1\3\uffff\1\2\101\uffff";
    static final String DFA99_specialS =
        "\10\uffff\1\1\1\uffff\1\4\1\2\1\0\1\uffff\1\3\1\5\70\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\1",
            "\1\2\2\6\16\uffff\2\2\2\uffff\1\4\1\7\5\2\1\uffff\1\2\1\uffff"+
            "\1\6\13\2\1\3\1\2\16\uffff\12\2\5\6\20\uffff\2\6\1\uffff\2\6"+
            "\1\uffff\1\6\1\2\2\uffff\1\2\2\uffff\1\6\1\2\3\uffff\1\2\1\5"+
            "\2\uffff\1\6\1\2\3\6\3\2\3\uffff\2\2\1\uffff\3\6",
            "",
            "\2\2\22\uffff\2\2\4\uffff\1\2\3\uffff\1\10\45\uffff\5\2\20\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\5\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\3\2\12\uffff\2\2",
            "\1\26\1\23\22\uffff\1\34\1\35\4\uffff\1\2\3\uffff\1\14\13\uffff"+
            "\1\15\31\uffff\1\16\1\17\1\22\1\27\1\31\20\uffff\2\24\1\uffff"+
            "\2\25\1\uffff\1\36\6\uffff\1\37\5\uffff\1\30\2\uffff\1\33\1"+
            "\uffff\3\32\3\uffff\1\11\1\40\3\uffff\1\12\1\13\1\20\1\21",
            "\2\2\22\uffff\2\2\3\uffff\2\2\3\uffff\1\41\13\uffff\1\2\31\uffff"+
            "\5\2\20\uffff\2\42\1\uffff\2\43\1\uffff\1\2\6\uffff\1\2\5\uffff"+
            "\1\2\2\uffff\7\2\1\uffff\2\2\3\uffff\4\2",
            "",
            "\2\2\22\uffff\2\2\4\uffff\1\2\3\uffff\1\2\13\uffff\1\2\31\uffff"+
            "\5\2\20\uffff\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\5\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\3\44\3\uffff\2\2\3\uffff\4\2",
            "\1\uffff",
            "\1\50\2\uffff\1\46\1\47\14\uffff\2\50\14\uffff\1\45\15\50\25"+
            "\uffff\4\50\45\uffff\1\50\16\uffff\1\50",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\51",
            "\1\uffff",
            "\1\uffff",
            "\1\61\20\uffff\1\55\1\56\2\uffff\6\2\1\107\1\uffff\1\52\2\uffff"+
            "\1\72\1\73\1\74\1\76\1\67\1\71\1\66\1\70\1\62\1\57\1\60\1\54"+
            "\1\53\16\uffff\1\104\1\102\1\103\1\101\1\100\1\75\1\77\1\64"+
            "\1\65\1\63\50\uffff\1\6\3\uffff\1\2\3\uffff\2\2\1\6\3\uffff"+
            "\1\105\1\106",
            "\1\61\20\uffff\1\55\1\56\2\uffff\6\2\1\107\1\uffff\1\52\2\uffff"+
            "\1\72\1\73\1\74\1\76\1\67\1\71\1\66\1\70\1\62\1\57\1\60\1\54"+
            "\1\53\16\uffff\1\104\1\102\1\103\1\101\1\100\1\75\1\77\1\64"+
            "\1\65\1\63\50\uffff\1\6\3\uffff\1\2\3\uffff\2\2\1\6\3\uffff"+
            "\1\105\1\106",
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
    
    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;
    
    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }
    
    class DFA99 extends DFA {
    
        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "601:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {

                    case 0 : 
                        int LA99_12 = input.LA(1);
                        
                         
                        int index99_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {s = 2;}

                        else if ( (true) ) {s = 6;}
                        
                         
                        input.seek(index99_12);
                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA99_8 = input.LA(1);
                        
                         
                        int index99_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {s = 2;}

                        else if ( (true) ) {s = 6;}
                        
                         
                        input.seek(index99_8);
                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA99_11 = input.LA(1);
                        
                         
                        int index99_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {s = 2;}

                        else if ( (true) ) {s = 6;}
                        
                         
                        input.seek(index99_11);
                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA99_14 = input.LA(1);
                        
                         
                        int index99_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {s = 2;}

                        else if ( (true) ) {s = 6;}
                        
                         
                        input.seek(index99_14);
                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA99_10 = input.LA(1);
                        
                         
                        int index99_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {s = 2;}

                        else if ( (true) ) {s = 6;}
                        
                         
                        input.seek(index99_10);
                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA99_15 = input.LA(1);
                        
                         
                        int index99_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {s = 2;}

                        else if ( (true) ) {s = 6;}
                        
                         
                        input.seek(index99_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 99, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA107_eotS =
        "\67\uffff";
    static final String DFA107_eofS =
        "\67\uffff";
    static final String DFA107_minS =
        "\1\14\1\13\1\uffff\1\14\1\uffff\1\0\7\uffff\2\13\12\uffff\34\0\2"+
        "\uffff";
    static final String DFA107_maxS =
        "\2\u008b\1\uffff\1\u008b\1\uffff\1\0\7\uffff\2\167\12\uffff\34\0"+
        "\2\uffff";
    static final String DFA107_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff\7\1\2\uffff\12\1\34\uffff\2\1";
    static final String DFA107_specialS =
        "\3\uffff\1\1\1\uffff\1\0\7\uffff\1\3\1\2\50\uffff}>";
    static final String[] DFA107_transitionS = {
            "\2\2\22\uffff\2\2\10\uffff\1\1\13\uffff\1\2\31\uffff\5\2\20"+
            "\uffff\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\5\uffff\1\2\2"+
            "\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "\3\2\16\uffff\2\2\2\uffff\2\2\6\uffff\1\2\1\uffff\53\2\20\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\3\2\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "",
            "\1\17\1\14\22\uffff\1\25\1\26\10\uffff\1\5\13\uffff\1\6\31\uffff"+
            "\1\7\1\10\1\13\1\20\1\22\20\uffff\2\15\1\uffff\2\16\1\uffff"+
            "\1\27\6\uffff\1\30\5\uffff\1\21\2\uffff\1\24\1\uffff\3\23\11"+
            "\uffff\1\4\1\11\1\12",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\20\uffff\1\34\1\35\10\uffff\1\66\1\uffff\1\31\2\uffff"+
            "\1\51\1\52\1\53\1\55\1\46\1\50\1\45\1\47\1\41\1\36\1\37\1\33"+
            "\1\32\16\uffff\1\63\1\61\1\62\1\60\1\57\1\54\1\56\1\43\1\44"+
            "\1\42\34\uffff\1\65\2\uffff\1\2\7\uffff\1\64",
            "\1\40\20\uffff\1\34\1\35\10\uffff\1\66\1\uffff\1\31\2\uffff"+
            "\1\51\1\52\1\53\1\55\1\46\1\50\1\45\1\47\1\41\1\36\1\37\1\33"+
            "\1\32\16\uffff\1\63\1\61\1\62\1\60\1\57\1\54\1\56\1\43\1\44"+
            "\1\42\34\uffff\1\65\2\uffff\1\2\7\uffff\1\64",
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
    
    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;
    
    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }
    
    class DFA107 extends DFA {
    
        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "816:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {

                    case 0 : 
                        int LA107_5 = input.LA(1);
                        
                         
                        int index107_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}
                        
                         
                        input.seek(index107_5);
                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA107_3 = input.LA(1);
                        
                         
                        int index107_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA107_3==137) && (synpred4())) {s = 4;}

                        else if ( (LA107_3==ID) ) {s = 5;}

                        else if ( (LA107_3==STAR) && (synpred4())) {s = 6;}

                        else if ( (LA107_3==BNOT) && (synpred4())) {s = 7;}

                        else if ( (LA107_3==NOT) && (synpred4())) {s = 8;}

                        else if ( (LA107_3==138) && (synpred4())) {s = 9;}

                        else if ( (LA107_3==139) && (synpred4())) {s = 10;}

                        else if ( (LA107_3==INT) && (synpred4())) {s = 11;}

                        else if ( (LA107_3==FLOAT) && (synpred4())) {s = 12;}

                        else if ( ((LA107_3>=SINGLE_QUOTE_STRING_SIMPLE && LA107_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 13;}

                        else if ( ((LA107_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA107_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 14;}

                        else if ( (LA107_3==HEREDOC_STRING) && (synpred4())) {s = 15;}

                        else if ( (LA107_3==ARRAY) && (synpred4())) {s = 16;}

                        else if ( (LA107_3==COLON) && (synpred4())) {s = 17;}

                        else if ( (LA107_3==REGEX) && (synpred4())) {s = 18;}

                        else if ( ((LA107_3>=125 && LA107_3<=127)) && (synpred4())) {s = 19;}

                        else if ( (LA107_3==123) && (synpred4())) {s = 20;}

                        else if ( (LA107_3==IF_MODIFIER) && (synpred4())) {s = 21;}

                        else if ( (LA107_3==UNLESS_MODIFIER) && (synpred4())) {s = 22;}

                        else if ( (LA107_3==LCURLY) && (synpred4())) {s = 23;}

                        else if ( (LA107_3==LPAREN) && (synpred4())) {s = 24;}
                        
                         
                        input.seek(index107_3);
                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA107_14 = input.LA(1);
                        
                         
                        int index107_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA107_14==DOT) ) {s = 25;}

                        else if ( (LA107_14==POWER) ) {s = 26;}

                        else if ( (LA107_14==STAR) ) {s = 27;}

                        else if ( (LA107_14==DIV) ) {s = 28;}

                        else if ( (LA107_14==MOD) ) {s = 29;}

                        else if ( (LA107_14==PLUS) ) {s = 30;}

                        else if ( (LA107_14==MINUS) ) {s = 31;}

                        else if ( (LA107_14==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA107_14==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA107_14==BAND) ) {s = 34;}

                        else if ( (LA107_14==BXOR) ) {s = 35;}

                        else if ( (LA107_14==BOR) ) {s = 36;}

                        else if ( (LA107_14==LESS_THAN) ) {s = 37;}

                        else if ( (LA107_14==GREATER_THAN) ) {s = 38;}

                        else if ( (LA107_14==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA107_14==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA107_14==COMPARE) ) {s = 41;}

                        else if ( (LA107_14==EQUAL) ) {s = 42;}

                        else if ( (LA107_14==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA107_14==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA107_14==MATCH) ) {s = 45;}

                        else if ( (LA107_14==NOT_MATCH) ) {s = 46;}

                        else if ( (LA107_14==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA107_14==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA107_14==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA107_14==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA107_14==QUESTION) ) {s = 51;}

                        else if ( (LA107_14==COMMA) ) {s = 52;}

                        else if ( (LA107_14==ASSOC) ) {s = 2;}

                        else if ( (LA107_14==RCURLY) && (synpred4())) {s = 53;}

                        else if ( (LA107_14==LINE_BREAK) && (synpred4())) {s = 54;}
                        
                         
                        input.seek(index107_14);
                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA107_13 = input.LA(1);
                        
                         
                        int index107_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA107_13==DOT) ) {s = 25;}

                        else if ( (LA107_13==POWER) ) {s = 26;}

                        else if ( (LA107_13==STAR) ) {s = 27;}

                        else if ( (LA107_13==DIV) ) {s = 28;}

                        else if ( (LA107_13==MOD) ) {s = 29;}

                        else if ( (LA107_13==PLUS) ) {s = 30;}

                        else if ( (LA107_13==MINUS) ) {s = 31;}

                        else if ( (LA107_13==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA107_13==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA107_13==BAND) ) {s = 34;}

                        else if ( (LA107_13==BXOR) ) {s = 35;}

                        else if ( (LA107_13==BOR) ) {s = 36;}

                        else if ( (LA107_13==LESS_THAN) ) {s = 37;}

                        else if ( (LA107_13==GREATER_THAN) ) {s = 38;}

                        else if ( (LA107_13==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA107_13==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA107_13==COMPARE) ) {s = 41;}

                        else if ( (LA107_13==EQUAL) ) {s = 42;}

                        else if ( (LA107_13==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA107_13==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA107_13==MATCH) ) {s = 45;}

                        else if ( (LA107_13==NOT_MATCH) ) {s = 46;}

                        else if ( (LA107_13==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA107_13==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA107_13==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA107_13==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA107_13==QUESTION) ) {s = 51;}

                        else if ( (LA107_13==COMMA) ) {s = 52;}

                        else if ( (LA107_13==RCURLY) && (synpred4())) {s = 53;}

                        else if ( (LA107_13==LINE_BREAK) && (synpred4())) {s = 54;}

                        else if ( (LA107_13==ASSOC) ) {s = 2;}
                        
                         
                        input.seek(index107_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 107, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program265 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_statement_list_in_program269 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_terminal_in_program271 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list296 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list299 = new BitSet(new long[]{0x0040046300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_statement_in_statement_list302 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_expression_in_statement332 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement335 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_set_in_modifier_line375 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_line_break_in_modifier_line389 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_modifier_line393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_block_expression468 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_body_in_block_expression470 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_block_expression472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body479 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_list_in_body483 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_terminal_in_body485 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression508 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_if_expression513 = new BitSet(new long[]{0x0000004000000000L,0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_seperator_in_if_expression515 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F1BL});
    public static final BitSet FOLLOW_body_in_if_expression528 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_if_expression531 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_if_expression535 = new BitSet(new long[]{0x0000004000000000L,0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_seperator_in_if_expression537 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F1BL});
    public static final BitSet FOLLOW_body_in_if_expression541 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_129_in_if_expression555 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_body_in_if_expression559 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_if_expression572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator624 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator627 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator629 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator634 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_seperator637 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator639 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression649 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression651 = new BitSet(new long[]{0x0000004000000000L,0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_unless_expression654 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F1AL});
    public static final BitSet FOLLOW_COLON_in_unless_expression656 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F1AL});
    public static final BitSet FOLLOW_line_break_in_unless_expression658 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F1AL});
    public static final BitSet FOLLOW_body_in_unless_expression670 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_unless_expression683 = new BitSet(new long[]{0x0040042300003000L,0xF9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_body_in_unless_expression685 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_unless_expression698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_expression762 = new BitSet(new long[]{0x00FFFC003000C800L,0x004000000001E000L,0x0000000000000020L});
    public static final BitSet FOLLOW_fitem_in_expression765 = new BitSet(new long[]{0x00FFFC003000C800L,0x004000000001E000L,0x0000000000000020L});
    public static final BitSet FOLLOW_fitem_in_expression767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_methodDefinition787 = new BitSet(new long[]{0x000004400000C000L,0x0004000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition791 = new BitSet(new long[]{0x000004400000C000L,0x0004000000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition797 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition799 = new BitSet(new long[]{0x000004000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition803 = new BitSet(new long[]{0x0040046000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition807 = new BitSet(new long[]{0x0040046300003000L,0xF9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition810 = new BitSet(new long[]{0x0040046300003000L,0xF9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition816 = new BitSet(new long[]{0x0000006000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition820 = new BitSet(new long[]{0x0000006000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_methodDefinition825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton838 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_singleton841 = new BitSet(new long[]{0x0000004000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton843 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist902 = new BitSet(new long[]{0x0040044000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist904 = new BitSet(new long[]{0x0000004000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist908 = new BitSet(new long[]{0x0000004000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist931 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args945 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args947 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args950 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args953 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args966 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args968 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args982 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args985 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1036 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args1060 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args1062 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_f_opt_args1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1269 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_andorExpression1279 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1284 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_135_in_andorExpression1295 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1300 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_136_in_notExpression1333 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1340 = new BitSet(new long[]{0x0040044300003000L,0xE9040B60001F0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_definedExpression1365 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_assignmentExpression1399 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1401 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1423 = new BitSet(new long[]{0xFE00000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_set_in_assignmentExpression1425 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_definedExpression_in_assignmentExpression1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_mlhs1499 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1504 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_lhs_in_mlhs1509 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1516 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_lhs1540 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_lhs_in_star_lhs1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_mrhs1570 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1573 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_definedExpression_in_mrhs1576 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1596 = new BitSet(new long[]{0x0000040300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1599 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1601 = new BitSet(new long[]{0x0000040300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1640 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1644 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1655 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1659 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1726 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1731 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1792 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1797 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1826 = new BitSet(new long[]{0x0000780000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1860 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1865 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1876 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1882 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1893 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1897 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1908 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1913 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1924 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1930 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1941 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1946 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1961 = new BitSet(new long[]{0x0000780000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1982 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression2016 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2022 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression2033 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2038 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression2049 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2054 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2065 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2069 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2084 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression2138 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2144 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_BOR_in_orExpression2155 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2161 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2228 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2234 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2265 = new BitSet(new long[]{0x0008000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2299 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2304 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2315 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2319 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2334 = new BitSet(new long[]{0x0008000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2356 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2390 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2397 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2408 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2415 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2430 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2450 = new BitSet(new long[]{0x0040000030000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2484 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2490 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2501 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2507 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2518 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2524 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2539 = new BitSet(new long[]{0x0040000030000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2560 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2595 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2601 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2610 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2632 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2638 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2648 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2654 = new BitSet(new long[]{0x0000044300003000L,0xE9040B60001F0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_command_in_bnotExpression2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_command2683 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_139_in_command2687 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_literal_in_command2690 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2692 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2695 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2697 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2699 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_atom_in_command2701 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_LPAREN_in_command2706 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_command2708 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_command2710 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_DOT_in_command2715 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_method_in_command2718 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_atom2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_atom2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_atom2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_atom2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2810 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_open_args_in_method2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2850 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_call_args_in_open_args2853 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2861 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2916 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2919 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_args2922 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation33003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation33007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_literal3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_string3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_string3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_string3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_single_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_double_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash4063 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_assoc_list_in_hash4066 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list4077 = new BitSet(new long[]{0x0000004000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs4088 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs4092 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_assoc_in_assocs4095 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_assoc4122 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_assoc4124 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_assoc4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_assoc4131 = new BitSet(new long[]{0x0000000000000000L,0x0080800000000000L});
    public static final BitSet FOLLOW_set_in_assoc4133 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_assoc4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_symbol_name_in_assoc4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_symbol4202 = new BitSet(new long[]{0x0000040000000000L,0x0000036000000000L});
    public static final BitSet FOLLOW_ID_in_symbol4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_symbol4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_symbol4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_synpred11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred22850 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_call_args_in_synpred22853 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred22855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred32861 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred32864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_synpred44114 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred44116 = new BitSet(new long[]{0x0040040300003000L,0xE9040B60001F0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_synpred44118 = new BitSet(new long[]{0x0000000000000002L});

}