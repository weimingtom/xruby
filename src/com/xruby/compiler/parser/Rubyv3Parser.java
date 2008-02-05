// $ANTLR 3.0.1 D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-05 14:15:29

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "SYMBOL", "STAR_ID", "ARRAY_REF_CALL", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING_SIMPLE", "SINGLE_QUOTE_STRING_COMPLEX", "SINGLE_STRING_CHAR", "DOUBLE_QUOTE_STRING_SIMPLE", "DOUBLE_QUOTE_STRING_COMPLEX", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "SYMBOL_NAME", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined?'", "'expression0'", "'expression1'"
    };
    public static final int CASE_EQUAL=46;
    public static final int STAR=55;
    public static final int EMPTY_ARRAY=118;
    public static final int MOD=29;
    public static final int REST_UNUSE=27;
    public static final int MOD_ASSIGN=58;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=121;
    public static final int SINGLE_QUOTE_STRING_SIMPLE=101;
    public static final int REGEX=84;
    public static final int LEFT_SHIFT_ASSIGN=65;
    public static final int NOT=82;
    public static final int UNTIL_MODIFIER=36;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=60;
    public static final int LOGICAL_AND=75;
    public static final int STATEMENT=5;
    public static final int RPAREN=115;
    public static final int HEX_PART=95;
    public static final int DOUBLE_QUOTE_STRING_SIMPLE=104;
    public static final int ARG=10;
    public static final int NESTED_LHS=24;
    public static final int NOT_EQUAL=76;
    public static final int SYMBOL_NAME=112;
    public static final int WHILE_MODIFIER=35;
    public static final int BODY=9;
    public static final int COMMENT=122;
    public static final int RBRACK=117;
    public static final int HEREDOC_BEGIN=109;
    public static final int UNLESS_MODIFIER=34;
    public static final int INCLUSIVE_RANGE=72;
    public static final int SYMBOL=30;
    public static final int MINUS_ASSIGN=61;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=105;
    public static final int POWER=56;
    public static final int LCURLY=107;
    public static final int MATCH=47;
    public static final int INT=83;
    public static final int GLOBAL_VARIABLE=94;
    public static final int ESCAPE_INT_PART=98;
    public static final int LINE_BREAK=39;
    public static final int WS=40;
    public static final int VARIABLE=16;
    public static final int INSTANCE_VARIABLE=92;
    public static final int LESS_THAN=50;
    public static final int OCTAL=85;
    public static final int SINGLETON_METHOD=25;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=77;
    public static final int BNOT=81;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=111;
    public static final int ARRAY_REF_CALL=32;
    public static final int NON_LEADING0_NUMBER=100;
    public static final int STAR_ID=31;
    public static final int CONTROL_PART=96;
    public static final int LBRACK=116;
    public static final int IF_MODIFIER=33;
    public static final int BXOR_ASSIGN=113;
    public static final int GREATER_OR_EQUAL=49;
    public static final int FLOAT=13;
    public static final int BLOCK_ARG=21;
    public static final int HEREDOC_STRING=12;
    public static final int ID=43;
    public static final int LPAREN=114;
    public static final int IF=7;
    public static final int EXP_PART=89;
    public static final int RESCUE_MODIFIER=37;
    public static final int SINGLE_QUOTE_STRING_COMPLEX=102;
    public static final int BOR_ASSIGN=63;
    public static final int LEADING0_NUMBER=90;
    public static final int COMMA=119;
    public static final int HEX=86;
    public static final int EQUAL=45;
    public static final int BOR=79;
    public static final int RIGHT_SHIFT=52;
    public static final int RIGHT_SHIFT_ASSIGN=66;
    public static final int LOGICAL_OR=74;
    public static final int COMPARE=44;
    public static final int PLUS=53;
    public static final int BXOR=78;
    public static final int DOT=41;
    public static final int EXCLUSIVE_RANGE=73;
    public static final int COLON2=42;
    public static final int MRHS=23;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=91;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int GREATER_THAN=48;
    public static final int LOGICAL_AND_ASSIGN=68;
    public static final int LEADING_MARK_DECIMAL=88;
    public static final int DOUBLE_STRING_CHAR=106;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
    public static final int LESS_OR_EQUAL=51;
    public static final int SINGLE_STRING_CHAR=103;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=54;
    public static final int BAND=80;
    public static final int META_PART=97;
    public static final int SEMI=38;
    public static final int STAR_ASSIGN=67;
    public static final int LOGICAL_OR_ASSIGN=69;
    public static final int COLON=120;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=64;
    public static final int CLASS_VARIABLE=93;
    public static final int QUESTION=71;
    public static final int ESCAPE_INT=99;
    public static final int BLOCK=18;
    public static final int RCURLY=108;
    public static final int ASSIGN=57;
    public static final int PLUS_ASSIGN=62;
    public static final int POWER_ASSIGN=70;
    public static final int COMPLEMENT_ASSIGN=59;
    public static final int DIV=28;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int BINARY=87;
    public static final int HEREDOC_INDENT_BEGIN=110;
    public static final int STRING=26;
    
        public Rubyv3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[85+1];
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
            if(isGlobalVar(text) || isConstant(text)) {
                    return true;
            }
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
      public boolean isGlobalVar(String text) {
              return text.charAt(0) == '$';
      }
      public boolean isConstant(String text) {
              char capital = text.charAt(0);
              return capital >= 'A' && capital <= 'Z';
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:286:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:17: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);
            
            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||LA3_0==STAR||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING_SIMPLE && LA3_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA3_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA3_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA3_0==LCURLY||LA3_0==LPAREN||LA3_0==LBRACK||LA3_0==COLON||LA3_0==123||(LA3_0>=125 && LA3_0<=127)||(LA3_0>=131 && LA3_0<=132)||(LA3_0>=136 && LA3_0<=139)) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("286:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);
            
                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);
                        
                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }
                        
                    
                        switch (alt1) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program269);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_program273);
                    statement_list2=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list2.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);
                        
                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }
                        
                    
                        switch (alt2) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program275);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:3: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:11: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list300);
            statement4=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(statement4.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:21: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:22: ( terminal )+ statement
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:22: ( terminal )+
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
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:22: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list303);
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

            	    pushFollow(FOLLOW_statement_in_statement_list306);
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
            // 292:44: -> ^( STATEMENT_LIST ( statement )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:47: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:64: ( statement )*
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;
        

        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:2: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement336);
            expression7=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression7.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                
                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }
                
            
                switch (alt6) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement339);
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
            // 301:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:59: ( modifier_line )*
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;
        

        Object set9_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:2: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line379);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                
                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }
                
            
                switch (alt7) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line393);
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

            pushFollow(FOLLOW_expression_in_modifier_line397);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:323:1: block_expression : 'begin' body 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:2: ( 'begin' body 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal12=(Token)input.LT(1);
            match(input,123,FOLLOW_123_in_block_expression472); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);
            }
            pushFollow(FOLLOW_body_in_block_expression474);
            body13=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,124,FOLLOW_124_in_block_expression476); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;
        

        Object SEMI15_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:6: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);
            
            if ( (LA10_0==SEMI||LA10_0==124||(LA10_0>=128 && LA10_0<=129)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||LA10_0==STAR||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING_SIMPLE && LA10_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA10_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA10_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA10_0==LCURLY||LA10_0==LPAREN||LA10_0==LBRACK||LA10_0==COLON||LA10_0==123||(LA10_0>=125 && LA10_0<=127)||(LA10_0>=131 && LA10_0<=132)||(LA10_0>=136 && LA10_0<=139)) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("325:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);
            
                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);
                        
                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }
                        
                    
                        switch (alt8) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body483); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_statement_list_in_body487);
                    statement_list16=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list16.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);
                        
                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }
                        
                    
                        switch (alt9) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body489);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set18=null;

        Object set18_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:2: ( 'false' | 'nil' | 'true' )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:2: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression512); if (failed) return retval;
            if ( backtracking==0 ) stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression517);
            e0=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression519);
            seperator20=seperator();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression532);
            body0=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_body.add(body0.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);
                
                if ( (LA11_0==128) ) {
                    alt11=1;
                }
                
            
                switch (alt11) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,128,FOLLOW_128_in_if_expression535); if (failed) return retval;
            	    if ( backtracking==0 ) stream_128.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression539);
            	    e1=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression541);
            	    seperator22=seperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression545);
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

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);
            
            if ( (LA12_0==129) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_if_expression559); if (failed) return retval;
                    if ( backtracking==0 ) stream_129.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression563);
                    body2=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_body.add(body2.getTree());
                    
                    }
                    break;
            
            }

            string_literal24=(Token)input.LT(1);
            match(input,124,FOLLOW_124_in_if_expression576); if (failed) return retval;
            if ( backtracking==0 ) stream_124.add(string_literal24);


            // AST REWRITE
            // elements: body2, e0, body0, e1, body1
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
            // 332:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:48: ( $body2)?
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:2: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:3: ( LINE_BREAK )+
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator628); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator631); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        
                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }
                        
                    
                        switch (alt14) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator633); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);
                        
                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }
                        
                    
                        switch (alt15) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator638); if (failed) return retval;
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
                    match(input,130,FOLLOW_130_in_seperator641); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);
                        
                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }
                        
                    
                        switch (alt16) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator643); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:337:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:2: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression653); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);
            }
            pushFollow(FOLLOW_boolean_expression_in_unless_expression655);
            boolean_expression32=boolean_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression32.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:32: ( 'then' | ':' | line_break )
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
                    new NoViableAltException("338:32: ( 'then' | ':' | line_break )", 18, 0, input);
            
                throw nvae;
            }
            
            switch (alt18) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,130,FOLLOW_130_in_unless_expression658); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression660); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression662);
                    line_break35=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break35.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_body_in_unless_expression674);
            body36=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body36.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            
            if ( (LA19_0==129) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_unless_expression687); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);
                    }
                    pushFollow(FOLLOW_body_in_unless_expression689);
                    body38=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, body38.getTree());
                    
                    }
                    break;
            
            }

            string_literal39=(Token)input.LT(1);
            match(input,124,FOLLOW_124_in_unless_expression702); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token SEMI40=null;
        line_break_return line_break41 = null;
        

        Object SEMI40_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:9: ( SEMI | line_break )
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
                    new NoViableAltException("342:1: terminal : ( SEMI | line_break );", 20, 0, input);
            
                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal708); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_line_break_in_terminal711);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:343:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:2: ( LINE_BREAK )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();
            
            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break721); if (failed) return retval;
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:2: ( 'alias' fitem fitem | andorExpression | primaryExpression )
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
            case REGEX:
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
            case LCURLY:
            case LPAREN:
            case LBRACK:
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
                    new NoViableAltException("376:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);
            
                throw nvae;
            }
            
            switch (alt21) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal43=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_expression766); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
                    }
                    pushFollow(FOLLOW_fitem_in_expression769);
                    fitem44=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression771);
                    fitem45=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem45.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_andorExpression_in_expression773);
                    andorExpression46=andorExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, andorExpression46.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_primaryExpression_in_expression775);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        methodDefinition_return methodDefinition48 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:2: ( methodDefinition )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_methodDefinition_in_primaryExpression783);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:2: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();
            
            string_literal49=(Token)input.LT(1);
            match(input,132,FOLLOW_132_in_methodDefinition791); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);
                
                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }
                
            
                switch (alt22) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition795); if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:26: ( singleton dot_or_colon )?
            int alt23=2;
            int LA23_0 = input.LA(1);
            
            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);
                
                if ( ((LA23_1>=DOT && LA23_1<=COLON2)||LA23_1==LBRACK) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==LPAREN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition801);
                    singleton51=singleton();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition803);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dot_or_colon52.getTree());
                    
                    }
                    break;
            
            }

            pushFollow(FOLLOW_methodName_in_methodDefinition807);
            methodName53=methodName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodName53.getTree());
            if ( backtracking==0 ) {
              enterScope();
            }
            pushFollow(FOLLOW_f_arglist_in_methodDefinition811);
            f_arglist54=f_arglist();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f_arglist54.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:89: ( terminal )*
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition814);
            	    terminal55=terminal();
            	    _fsp--;
            	    if (failed) return retval;
            	    
            	    }
            	    break;
            
            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);
            
            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||LA25_0==STAR||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING_SIMPLE && LA25_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA25_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA25_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA25_0==LCURLY||LA25_0==LPAREN||LA25_0==LBRACK||LA25_0==COLON||LA25_0==123||(LA25_0>=125 && LA25_0<=127)||(LA25_0>=131 && LA25_0<=132)||(LA25_0>=136 && LA25_0<=139)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition820);
                    bodyStatement56=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement56.getTree());
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);
                
                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }
                
            
                switch (alt26) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition824);
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
            match(input,124,FOLLOW_124_in_methodDefinition829); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:1: singleton : ( variable | '(' expression opt_nl ')' );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:2: ( variable | '(' expression opt_nl ')' )
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
                    new NoViableAltException("382:1: singleton : ( variable | '(' expression opt_nl ')' );", 27, 0, input);
            
                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:4: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_singleton840);
                    variable59=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable59.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton842); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_singleton845);
                    expression61=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton847);
                    opt_nl62=opt_nl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton849); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:15: ( | LINE_BREAK )
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
                    new NoViableAltException("384:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);
            
                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:28: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl868); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set65=null;

        Object set65_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:2: ( DOT | COLON2 )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set66=null;

        Object set66_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:2: ( ID | CONSTANT | FID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:2: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
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
                    new NoViableAltException("390:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);
            
                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist906); if (failed) return retval;
                    if ( backtracking==0 ) stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist908);
                    f_args68=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_f_args.add(f_args68.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);
                        
                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }
                        
                    
                        switch (alt29) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist912); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK69);

                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist916); if (failed) return retval;
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
                    // 391:34: -> ^( ARG f_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:37: ^( ARG f_args )
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_args_in_f_arglist935);
                    f_args71=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist937);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:8: ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
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
                case SEMI:
                case LINE_BREAK:
                case RPAREN:
                    {
                    alt33=1;
                    }
                    break;
                case COMMA:
                    {
                    int LA33_6 = input.LA(3);
                    
                    if ( (LA33_6==ID) ) {
                        alt33=2;
                    }
                    else if ( (LA33_6==STAR) ) {
                        alt33=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("393:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 6, input);
                    
                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("393:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 1, input);
                
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
                    new NoViableAltException("393:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 0, input);
            
                throw nvae;
            }
            
            switch (alt33) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args945);
                    f_norm_args73=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args73.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:24: f_norm_args ',' f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args949);
                    f_norm_args74=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args951); if (failed) return retval;
                    pushFollow(FOLLOW_f_opt_args_in_f_args954);
                    f_opt_args76=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args76.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:52: ( ',' f_rest_arg )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);
                    
                    if ( (LA31_0==COMMA) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:53: ',' f_rest_arg
                            {
                            char_literal77=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args957); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args960);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:2: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:4: f_norm_args ',' f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_norm_args_in_f_args970);
                    f_norm_args79=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args79.getTree());
                    char_literal80=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args972); if (failed) return retval;
                    pushFollow(FOLLOW_f_rest_arg_in_f_args975);
                    f_rest_arg81=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg81.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_opt_args_in_f_args986);
                    f_opt_args82=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args82.getTree());
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:21: ( ',' f_rest_arg )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);
                    
                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:22: ',' f_rest_arg
                            {
                            char_literal83=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args989); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args992);
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_f_rest_arg_in_f_args999);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID86=null;

        Object ID86_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:2: ( ID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:2: ID
            {
            root_0 = (Object)adaptor.nil();
            
            ID86=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args1030); if (failed) return retval;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:2: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
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
                        new NoViableAltException("404:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("404:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 0, input);
            
                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal87=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1040); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
                    }
                    ID88=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg1043); if (failed) return retval;
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:38: '*'
                    {
                    char_literal89=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1048); if (failed) return retval;
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
                    // 405:42: -> ^( '*' REST_UNUSE )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:45: ^( '*' REST_UNUSE )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:1: f_opt_args : ID '=' arg ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:2: ( ID '=' arg )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();
            
            ID90=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args1064); if (failed) return retval;
            if ( backtracking==0 ) {
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);
            }
            char_literal91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args1066); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal91_tree = (Object)adaptor.create(char_literal91);
            root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);
            }
            pushFollow(FOLLOW_arg_in_f_opt_args1069);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        statement_list_return statement_list93 = null;
        

        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:2: ( statement_list -> ^( BODY statement_list ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1081);
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
            // 410:19: -> ^( BODY statement_list )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:22: ^( BODY statement_list )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        fname_return fname94 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:7: ( fname )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:9: fname
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_fname_in_fitem1099);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:1: fname : ( ID | CONSTANT | FID | op );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:7: ( ID | CONSTANT | FID | op )
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
                    new NoViableAltException("414:1: fname : ( ID | CONSTANT | FID | op );", 35, 0, input);
            
                throw nvae;
            }
            
            switch (alt35) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:9: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID95=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1106); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID95_tree = (Object)adaptor.create(ID95);
                    adaptor.addChild(root_0, ID95_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT96=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1108); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT96_tree = (Object)adaptor.create(CONSTANT96);
                    adaptor.addChild(root_0, CONSTANT96_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:21: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID97=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1110); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID97_tree = (Object)adaptor.create(FID97);
                    adaptor.addChild(root_0, FID97_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:25: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_fname1112);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set99=null;

        Object set99_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:15: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:3: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_notExpression_in_andorExpression1273);
            notExpression100=notExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, notExpression100.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);
                
                if ( ((LA39_0>=134 && LA39_0<=135)) ) {
                    alt39=1;
                }
                
            
                switch (alt39) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
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
            	            new NoViableAltException("428:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 38, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal101=(Token)input.LT(1);
            	            match(input,134,FOLLOW_134_in_andorExpression1283); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal101_tree = (Object)adaptor.create(string_literal101);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:15: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);
            	                
            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }
            	                
            	            
            	                switch (alt36) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK102=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1288); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal103=(Token)input.LT(1);
            	            match(input,135,FOLLOW_135_in_andorExpression1299); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal103_tree = (Object)adaptor.create(string_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:14: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);
            	                
            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }
            	                
            	            
            	                switch (alt37) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK104=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1304); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1319);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression[true] );
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:3: ( 'not' ( LINE_BREAK )* notExpression | definedExpression[true] )
            int alt41=2;
            int LA41_0 = input.LA(1);
            
            if ( (LA41_0==136) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=HEREDOC_STRING && LA41_0<=FLOAT)||(LA41_0>=IF_MODIFIER && LA41_0<=UNLESS_MODIFIER)||LA41_0==ID||LA41_0==STAR||(LA41_0>=BNOT && LA41_0<=REGEX)||(LA41_0>=SINGLE_QUOTE_STRING_SIMPLE && LA41_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA41_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA41_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA41_0==LCURLY||LA41_0==LPAREN||LA41_0==LBRACK||LA41_0==COLON||LA41_0==123||(LA41_0>=125 && LA41_0<=127)||(LA41_0>=137 && LA41_0<=139)) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("434:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression[true] );", 41, 0, input);
            
                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    string_literal106=(Token)input.LT(1);
                    match(input,136,FOLLOW_136_in_notExpression1337); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal106_tree = (Object)adaptor.create(string_literal106);
                    root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:4: ( LINE_BREAK )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);
                        
                        if ( (LA40_0==LINE_BREAK) ) {
                            alt40=1;
                        }
                        
                    
                        switch (alt40) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK107=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1344); if (failed) return retval;
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1352);
                    notExpression108=notExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, notExpression108.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:5: definedExpression[true]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_definedExpression_in_notExpression1358);
                    definedExpression109=definedExpression(true);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:1: definedExpression[boolean allowsMrhsInSingleAssignment] : ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] );
    public final definedExpression_return definedExpression(boolean allowsMrhsInSingleAssignment) throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal110=null;
        definedExpression_return definedExpression111 = null;

        assignmentExpression_return assignmentExpression112 = null;
        

        Object string_literal110_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:2: ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] )
            int alt42=2;
            int LA42_0 = input.LA(1);
            
            if ( (LA42_0==137) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||LA42_0==ID||LA42_0==STAR||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING_SIMPLE && LA42_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA42_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA42_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA42_0==LCURLY||LA42_0==LPAREN||LA42_0==LBRACK||LA42_0==COLON||LA42_0==123||(LA42_0>=125 && LA42_0<=127)||(LA42_0>=138 && LA42_0<=139)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("440:1: definedExpression[boolean allowsMrhsInSingleAssignment] : ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] );", 42, 0, input);
            
                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:4: ( 'defined?' ) definedExpression[false]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:4: ( 'defined?' )
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:5: 'defined?'
                    {
                    string_literal110=(Token)input.LT(1);
                    match(input,137,FOLLOW_137_in_definedExpression1374); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal110_tree = (Object)adaptor.create(string_literal110);
                    root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                    }
                    
                    }

                    pushFollow(FOLLOW_definedExpression_in_definedExpression1378);
                    definedExpression111=definedExpression(false);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression111.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:10: assignmentExpression[allowsMrhsInSingleAssignment]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1390);
                    assignmentExpression112=assignmentExpression(allowsMrhsInSingleAssignment);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression(boolean allowsMrhsInSingleAssignment) throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ASSIGN114=null;
        Token ASSIGN118=null;
        lhs_return lhs113 = null;

        mrhs_return mrhs115 = null;

        simple_assignment_expression_return simple_assignment_expression116 = null;

        mlhs_return mlhs117 = null;

        mrhs_return mrhs119 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression120 = null;
        

        Object ASSIGN114_tree=null;
        Object ASSIGN118_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:2: ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression )
            int alt43=4;
            int LA43_0 = input.LA(1);
            
            if ( (LA43_0==ID) ) {
                int LA43_1 = input.LA(2);
                
                if ( (LA43_1==COMMA) ) {
                    switch ( input.LA(3) ) {
                    case HEREDOC_STRING:
                    case FLOAT:
                    case IF_MODIFIER:
                    case UNLESS_MODIFIER:
                    case BNOT:
                    case NOT:
                    case INT:
                    case REGEX:
                    case SINGLE_QUOTE_STRING_SIMPLE:
                    case SINGLE_QUOTE_STRING_COMPLEX:
                    case DOUBLE_QUOTE_STRING_SIMPLE:
                    case DOUBLE_QUOTE_STRING_COMPLEX:
                    case LCURLY:
                    case RCURLY:
                    case LPAREN:
                    case LBRACK:
                    case RBRACK:
                    case COLON:
                    case 123:
                    case 125:
                    case 126:
                    case 127:
                    case 137:
                    case 138:
                    case 139:
                        {
                        alt43=4;
                        }
                        break;
                    case ID:
                        {
                        int LA43_7 = input.LA(4);
                        
                        if ( (synpred2()) ) {
                            alt43=3;
                        }
                        else if ( (true) ) {
                            alt43=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 7, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case STAR:
                        {
                        int LA43_8 = input.LA(4);
                        
                        if ( (LA43_8==ID) ) {
                            int LA43_10 = input.LA(5);
                            
                            if ( (synpred2()) ) {
                                alt43=3;
                            }
                            else if ( (true) ) {
                                alt43=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 10, input);
                            
                                throw nvae;
                            }
                        }
                        else if ( ((LA43_8>=HEREDOC_STRING && LA43_8<=FLOAT)||(LA43_8>=IF_MODIFIER && LA43_8<=UNLESS_MODIFIER)||(LA43_8>=SEMI && LA43_8<=LINE_BREAK)||LA43_8==STAR||(LA43_8>=BNOT && LA43_8<=REGEX)||(LA43_8>=SINGLE_QUOTE_STRING_SIMPLE && LA43_8<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_8>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_8<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_8==LCURLY||(LA43_8>=LPAREN && LA43_8<=LBRACK)||LA43_8==COLON||LA43_8==123||(LA43_8>=125 && LA43_8<=127)||(LA43_8>=137 && LA43_8<=139)) ) {
                            alt43=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 8, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 4, input);
                    
                        throw nvae;
                    }
                
                }
                else if ( (LA43_1==ASSIGN) && (true)) {
                    int LA43_5 = input.LA(3);
                    
                    if ( (true) ) {
                        alt43=1;
                    }
                    else if ( (synpred1()) ) {
                        alt43=2;
                    }
                    else if ( (synpred2()) ) {
                        alt43=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 5, input);
                    
                        throw nvae;
                    }
                }
                else if ( ((LA43_1>=MOD_ASSIGN && LA43_1<=POWER_ASSIGN)) && (synpred1())) {
                    alt43=2;
                }
                else if ( (LA43_1==EOF||(LA43_1>=LEFT_SHIFT && LA43_1<=FLOAT)||(LA43_1>=DIV && LA43_1<=MOD)||(LA43_1>=IF_MODIFIER && LA43_1<=LINE_BREAK)||LA43_1==DOT||(LA43_1>=ID && LA43_1<=POWER)||(LA43_1>=QUESTION && LA43_1<=REGEX)||(LA43_1>=SINGLE_QUOTE_STRING_SIMPLE && LA43_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA43_1>=LCURLY && LA43_1<=RCURLY)||LA43_1==ASSOC||(LA43_1>=LPAREN && LA43_1<=RBRACK)||LA43_1==COLON||(LA43_1>=123 && LA43_1<=130)||(LA43_1>=134 && LA43_1<=135)||(LA43_1>=137 && LA43_1<=139)) ) {
                    alt43=4;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 1, input);
                
                    throw nvae;
                }
            }
            else if ( (LA43_0==STAR) && (synpred2())) {
                alt43=3;
            }
            else if ( ((LA43_0>=HEREDOC_STRING && LA43_0<=FLOAT)||(LA43_0>=IF_MODIFIER && LA43_0<=UNLESS_MODIFIER)||(LA43_0>=BNOT && LA43_0<=REGEX)||(LA43_0>=SINGLE_QUOTE_STRING_SIMPLE && LA43_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_0==LCURLY||LA43_0==LPAREN||LA43_0==LBRACK||LA43_0==COLON||LA43_0==123||(LA43_0>=125 && LA43_0<=127)||(LA43_0>=138 && LA43_0<=139)) ) {
                alt43=4;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("450:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 0, input);
            
                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:4: {...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentExpression", "true");
                    }
                    pushFollow(FOLLOW_lhs_in_assignmentExpression1411);
                    lhs113=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs113.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(lhs113.start,lhs113.stop));
                    }
                    ASSIGN114=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1415); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN114_tree = (Object)adaptor.create(ASSIGN114);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN114_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1418);
                    mrhs115=mrhs(allowsMrhsInSingleAssignment);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs115.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:90: ( simple_assignment_expression )=> simple_assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_simple_assignment_expression_in_assignmentExpression1428);
                    simple_assignment_expression116=simple_assignment_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression116.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:154: ( mlhs )=> mlhs ASSIGN mrhs[true]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_mlhs_in_assignmentExpression1438);
                    mlhs117=mlhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mlhs117.getTree());
                    ASSIGN118=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1440); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN118_tree = (Object)adaptor.create(ASSIGN118);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN118_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1443);
                    mrhs119=mrhs(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs119.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:191: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1449);
                    ternaryIfThenElseExpression120=ternaryIfThenElseExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression120.getTree());
                    
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

    public static class simple_assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start simple_assignment_expression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:455:1: simple_assignment_expression : lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false] ;
    public final simple_assignment_expression_return simple_assignment_expression() throws RecognitionException {
        simple_assignment_expression_return retval = new simple_assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set122=null;
        lhs_return lhs121 = null;

        definedExpression_return definedExpression123 = null;
        

        Object set122_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:2: ( lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false] )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:4: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false]
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_lhs_in_simple_assignment_expression1483);
            lhs121=lhs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, lhs121.getTree());
            set122=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                input.consume();
                if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(adaptor.create(set122), root_0);
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_simple_assignment_expression1485);    throw mse;
            }

            pushFollow(FOLLOW_definedExpression_in_simple_assignment_expression1530);
            definedExpression123=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression123.getTree());
            if ( backtracking==0 ) {
              addVariable(input.toString(lhs121.start,lhs121.stop));
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
    // $ANTLR end simple_assignment_expression

    public static class mlhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start mlhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );
    public final mlhs_return mlhs() throws RecognitionException {
        mlhs_return retval = new mlhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal124=null;
        Token char_literal125=null;
        lhs_return t0 = null;

        lhs_return t = null;

        star_lhs_return star_lhs126 = null;

        star_lhs_return star_lhs127 = null;
        

        Object char_literal124_tree=null;
        Object char_literal125_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:9: (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs )
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
                    new NoViableAltException("460:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );", 46, 0, input);
            
                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:16: t0= lhs ( ',' t= lhs )* ( ',' star_lhs )?
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_lhs_in_mlhs1553);
                    t0=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, t0.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(t0.start,t0.stop));
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:48: ( ',' t= lhs )*
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:49: ',' t= lhs
                    	    {
                    	    char_literal124=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_mlhs1558); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal124_tree = (Object)adaptor.create(char_literal124);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal124_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_lhs_in_mlhs1563);
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

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:86: ( ',' star_lhs )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);
                    
                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:87: ',' star_lhs
                            {
                            char_literal125=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_mlhs1570); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal125_tree = (Object)adaptor.create(char_literal125);
                            root_0 = (Object)adaptor.becomeRoot(char_literal125_tree, root_0);
                            }
                            pushFollow(FOLLOW_star_lhs_in_mlhs1573);
                            star_lhs126=star_lhs();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, star_lhs126.getTree());
                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:104: star_lhs
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_star_lhs_in_mlhs1578);
                    star_lhs127=star_lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, star_lhs127.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:1: star_lhs : STAR lhs -> ^( STAR_ID lhs ) ;
    public final star_lhs_return star_lhs() throws RecognitionException {
        star_lhs_return retval = new star_lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token STAR128=null;
        lhs_return lhs129 = null;
        

        Object STAR128_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:2: ( STAR lhs -> ^( STAR_ID lhs ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:9: STAR lhs
            {
            STAR128=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_lhs1594); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR128);

            pushFollow(FOLLOW_lhs_in_star_lhs1596);
            lhs129=lhs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_lhs.add(lhs129.getTree());

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
            // 463:18: -> ^( STAR_ID lhs )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:21: ^( STAR_ID lhs )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:1: mrhs[boolean reallyMrhs] : ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs );
    public final mrhs_return mrhs(boolean reallyMrhs) throws RecognitionException {
        mrhs_return retval = new mrhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal132=null;
        Token char_literal135=null;
        simple_assignment_expression_return simple_assignment_expression130 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression131 = null;

        simple_assignment_expression_return simple_assignment_expression133 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression134 = null;

        star_rhs_return star_rhs136 = null;

        star_rhs_return star_rhs137 = null;
        

        Object char_literal132_tree=null;
        Object char_literal135_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:29: ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs )
            int alt52=2;
            int LA52_0 = input.LA(1);
            
            if ( ((LA52_0>=HEREDOC_STRING && LA52_0<=FLOAT)||(LA52_0>=IF_MODIFIER && LA52_0<=UNLESS_MODIFIER)||LA52_0==ID||(LA52_0>=BNOT && LA52_0<=REGEX)||(LA52_0>=SINGLE_QUOTE_STRING_SIMPLE && LA52_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA52_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA52_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA52_0==LCURLY||LA52_0==LPAREN||LA52_0==LBRACK||LA52_0==COLON||LA52_0==123||(LA52_0>=125 && LA52_0<=127)||(LA52_0>=138 && LA52_0<=139)) ) {
                alt52=1;
            }
            else if ( (LA52_0==STAR) && (reallyMrhs)) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("468:1: mrhs[boolean reallyMrhs] : ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs );", 52, 0, input);
            
                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:36: ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:36: ( simple_assignment_expression | ternaryIfThenElseExpression )
                    int alt47=2;
                    int LA47_0 = input.LA(1);
                    
                    if ( (LA47_0==ID) ) {
                        int LA47_1 = input.LA(2);
                        
                        if ( (LA47_1==EOF||(LA47_1>=LEFT_SHIFT && LA47_1<=FLOAT)||(LA47_1>=DIV && LA47_1<=MOD)||(LA47_1>=IF_MODIFIER && LA47_1<=LINE_BREAK)||LA47_1==DOT||(LA47_1>=ID && LA47_1<=POWER)||(LA47_1>=QUESTION && LA47_1<=REGEX)||(LA47_1>=SINGLE_QUOTE_STRING_SIMPLE && LA47_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA47_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA47_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA47_1>=LCURLY && LA47_1<=RCURLY)||LA47_1==ASSOC||(LA47_1>=LPAREN && LA47_1<=RBRACK)||(LA47_1>=COMMA && LA47_1<=COLON)||(LA47_1>=123 && LA47_1<=130)||(LA47_1>=134 && LA47_1<=135)||(LA47_1>=137 && LA47_1<=139)) ) {
                            alt47=2;
                        }
                        else if ( ((LA47_1>=ASSIGN && LA47_1<=POWER_ASSIGN)) ) {
                            alt47=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:36: ( simple_assignment_expression | ternaryIfThenElseExpression )", 47, 1, input);
                        
                            throw nvae;
                        }
                    }
                    else if ( ((LA47_0>=HEREDOC_STRING && LA47_0<=FLOAT)||(LA47_0>=IF_MODIFIER && LA47_0<=UNLESS_MODIFIER)||(LA47_0>=BNOT && LA47_0<=REGEX)||(LA47_0>=SINGLE_QUOTE_STRING_SIMPLE && LA47_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA47_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA47_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA47_0==LCURLY||LA47_0==LPAREN||LA47_0==LBRACK||LA47_0==COLON||LA47_0==123||(LA47_0>=125 && LA47_0<=127)||(LA47_0>=138 && LA47_0<=139)) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("468:36: ( simple_assignment_expression | ternaryIfThenElseExpression )", 47, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:37: simple_assignment_expression
                            {
                            pushFollow(FOLLOW_simple_assignment_expression_in_mrhs1626);
                            simple_assignment_expression130=simple_assignment_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression130.getTree());
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:66: ternaryIfThenElseExpression
                            {
                            pushFollow(FOLLOW_ternaryIfThenElseExpression_in_mrhs1628);
                            ternaryIfThenElseExpression131=ternaryIfThenElseExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression131.getTree());
                            
                            }
                            break;
                    
                    }

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )
                    int alt51=2;
                    switch ( input.LA(1) ) {
                    case 134:
                        {
                        int LA51_1 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 1, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case 135:
                        {
                        int LA51_2 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 2, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case IF_MODIFIER:
                    case UNLESS_MODIFIER:
                    case WHILE_MODIFIER:
                    case UNTIL_MODIFIER:
                    case RESCUE_MODIFIER:
                        {
                        int LA51_3 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 3, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case SEMI:
                        {
                        int LA51_4 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 4, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case LINE_BREAK:
                        {
                        int LA51_5 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 5, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA51_6 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 6, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case 124:
                        {
                        int LA51_7 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 7, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case 128:
                        {
                        int LA51_8 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 8, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case 129:
                        {
                        int LA51_9 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 9, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case COLON:
                        {
                        int LA51_10 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 10, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case 130:
                        {
                        int LA51_11 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 11, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA51_12 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 12, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case COMMA:
                        {
                        int LA51_13 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 13, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case POWER:
                        {
                        int LA51_14 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 14, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case STAR:
                        {
                        int LA51_15 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 15, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case DIV:
                        {
                        int LA51_16 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 16, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case MOD:
                        {
                        int LA51_17 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 17, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA51_18 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 18, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                        {
                        int LA51_19 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 19, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case LEFT_SHIFT:
                        {
                        int LA51_20 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 20, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case RIGHT_SHIFT:
                        {
                        int LA51_21 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 21, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case BAND:
                        {
                        int LA51_22 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 22, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case BXOR:
                        {
                        int LA51_23 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 23, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case BOR:
                        {
                        int LA51_24 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 24, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case LESS_THAN:
                        {
                        int LA51_25 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 25, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case GREATER_THAN:
                        {
                        int LA51_26 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 26, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case LESS_OR_EQUAL:
                        {
                        int LA51_27 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 27, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case GREATER_OR_EQUAL:
                        {
                        int LA51_28 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 28, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case COMPARE:
                        {
                        int LA51_29 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 29, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case EQUAL:
                        {
                        int LA51_30 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 30, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case CASE_EQUAL:
                        {
                        int LA51_31 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 31, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        int LA51_32 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 32, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case MATCH:
                        {
                        int LA51_33 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 33, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case NOT_MATCH:
                        {
                        int LA51_34 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 34, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case LOGICAL_AND:
                        {
                        int LA51_35 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 35, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case LOGICAL_OR:
                        {
                        int LA51_36 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 36, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case INCLUSIVE_RANGE:
                        {
                        int LA51_37 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 37, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case EXCLUSIVE_RANGE:
                        {
                        int LA51_38 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 38, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case QUESTION:
                        {
                        int LA51_39 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 39, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case RBRACK:
                        {
                        int LA51_40 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 40, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case DOT:
                        {
                        int LA51_41 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 41, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case RCURLY:
                        {
                        int LA51_42 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 42, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    case ASSOC:
                        {
                        int LA51_43 = input.LA(2);
                        
                        if ( (!(reallyMrhs)) ) {
                            alt51=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt51=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 43, input);
                        
                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("468:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 0, input);
                    
                        throw nvae;
                    }
                    
                    switch (alt51) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:96: 
                            {
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:97: {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )?
                            {
                            if ( !(reallyMrhs) ) {
                                if (backtracking>0) {failed=true; return retval;}
                                throw new FailedPredicateException(input, "mrhs", "reallyMrhs");
                            }
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:114: ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);
                                
                                if ( (LA49_0==COMMA) ) {
                                    alt49=1;
                                }
                                
                            
                                switch (alt49) {
                            	case 1 :
                            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:115: ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )
                            	    {
                            	    char_literal132=(Token)input.LT(1);
                            	    match(input,COMMA,FOLLOW_COMMA_in_mrhs1638); if (failed) return retval;
                            	    if ( backtracking==0 ) {
                            	    char_literal132_tree = (Object)adaptor.create(char_literal132);
                            	    root_0 = (Object)adaptor.becomeRoot(char_literal132_tree, root_0);
                            	    }
                            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )
                            	    int alt48=2;
                            	    int LA48_0 = input.LA(1);
                            	    
                            	    if ( (LA48_0==ID) ) {
                            	        int LA48_1 = input.LA(2);
                            	        
                            	        if ( (LA48_1==EOF||(LA48_1>=LEFT_SHIFT && LA48_1<=FLOAT)||(LA48_1>=DIV && LA48_1<=MOD)||(LA48_1>=IF_MODIFIER && LA48_1<=LINE_BREAK)||LA48_1==DOT||(LA48_1>=ID && LA48_1<=POWER)||(LA48_1>=QUESTION && LA48_1<=REGEX)||(LA48_1>=SINGLE_QUOTE_STRING_SIMPLE && LA48_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA48_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA48_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA48_1>=LCURLY && LA48_1<=RCURLY)||LA48_1==ASSOC||(LA48_1>=LPAREN && LA48_1<=RBRACK)||(LA48_1>=COMMA && LA48_1<=COLON)||(LA48_1>=123 && LA48_1<=130)||(LA48_1>=134 && LA48_1<=135)||(LA48_1>=137 && LA48_1<=139)) ) {
                            	            alt48=2;
                            	        }
                            	        else if ( ((LA48_1>=ASSIGN && LA48_1<=POWER_ASSIGN)) && (synpred3())) {
                            	            alt48=1;
                            	        }
                            	        else {
                            	            if (backtracking>0) {failed=true; return retval;}
                            	            NoViableAltException nvae =
                            	                new NoViableAltException("468:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )", 48, 1, input);
                            	        
                            	            throw nvae;
                            	        }
                            	    }
                            	    else if ( ((LA48_0>=HEREDOC_STRING && LA48_0<=FLOAT)||(LA48_0>=IF_MODIFIER && LA48_0<=UNLESS_MODIFIER)||(LA48_0>=BNOT && LA48_0<=REGEX)||(LA48_0>=SINGLE_QUOTE_STRING_SIMPLE && LA48_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA48_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA48_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA48_0==LCURLY||LA48_0==LPAREN||LA48_0==LBRACK||LA48_0==COLON||LA48_0==123||(LA48_0>=125 && LA48_0<=127)||(LA48_0>=138 && LA48_0<=139)) ) {
                            	        alt48=2;
                            	    }
                            	    else {
                            	        if (backtracking>0) {failed=true; return retval;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("468:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )", 48, 0, input);
                            	    
                            	        throw nvae;
                            	    }
                            	    switch (alt48) {
                            	        case 1 :
                            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:121: ( simple_assignment_expression )=> simple_assignment_expression
                            	            {
                            	            pushFollow(FOLLOW_simple_assignment_expression_in_mrhs1648);
                            	            simple_assignment_expression133=simple_assignment_expression();
                            	            _fsp--;
                            	            if (failed) return retval;
                            	            if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression133.getTree());
                            	            
                            	            }
                            	            break;
                            	        case 2 :
                            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:184: ternaryIfThenElseExpression
                            	            {
                            	            pushFollow(FOLLOW_ternaryIfThenElseExpression_in_mrhs1650);
                            	            ternaryIfThenElseExpression134=ternaryIfThenElseExpression();
                            	            _fsp--;
                            	            if (failed) return retval;
                            	            if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression134.getTree());
                            	            
                            	            }
                            	            break;
                            	    
                            	    }

                            	    
                            	    }
                            	    break;
                            
                            	default :
                            	    break loop49;
                                }
                            } while (true);

                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:215: ( ',' star_rhs )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);
                            
                            if ( (LA50_0==COMMA) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:216: ',' star_rhs
                                    {
                                    char_literal135=(Token)input.LT(1);
                                    match(input,COMMA,FOLLOW_COMMA_in_mrhs1656); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal135_tree = (Object)adaptor.create(char_literal135);
                                    root_0 = (Object)adaptor.becomeRoot(char_literal135_tree, root_0);
                                    }
                                    pushFollow(FOLLOW_star_rhs_in_mrhs1659);
                                    star_rhs136=star_rhs();
                                    _fsp--;
                                    if (failed) return retval;
                                    if ( backtracking==0 ) adaptor.addChild(root_0, star_rhs136.getTree());
                                    
                                    }
                                    break;
                            
                            }

                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:469:15: {...}? => star_rhs
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    if ( !(reallyMrhs) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "mrhs", "reallyMrhs");
                    }
                    pushFollow(FOLLOW_star_rhs_in_mrhs1683);
                    star_rhs137=star_rhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, star_rhs137.getTree());
                    
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
    // $ANTLR end mrhs

    public static class star_rhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start star_rhs
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:1: star_rhs : STAR definedExpression[false] -> ^( STAR_ID definedExpression ) ;
    public final star_rhs_return star_rhs() throws RecognitionException {
        star_rhs_return retval = new star_rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token STAR138=null;
        definedExpression_return definedExpression139 = null;
        

        Object STAR138_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_definedExpression=new RewriteRuleSubtreeStream(adaptor,"rule definedExpression");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:10: ( STAR definedExpression[false] -> ^( STAR_ID definedExpression ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:16: STAR definedExpression[false]
            {
            STAR138=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_rhs1697); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR138);

            pushFollow(FOLLOW_definedExpression_in_star_rhs1699);
            definedExpression139=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_definedExpression.add(definedExpression139.getTree());

            // AST REWRITE
            // elements: definedExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 472:46: -> ^( STAR_ID definedExpression )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:49: ^( STAR_ID definedExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STAR_ID, "STAR_ID"), root_1);

                adaptor.addChild(root_1, stream_definedExpression.next());

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
    // $ANTLR end star_rhs

    public static class ternaryIfThenElseExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start ternaryIfThenElseExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token QUESTION140=null;
        Token char_literal142=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression141 = null;

        rangeExpression_return rangeExpression143 = null;
        

        Object QUESTION140_tree=null;
        Object char_literal142_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:3: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1723);
            r=rangeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt53=2;
            int LA53_0 = input.LA(1);
            
            if ( (LA53_0==QUESTION) ) {
                alt53=1;
            }
            else if ( (LA53_0==EOF||LA53_0==LEFT_SHIFT||(LA53_0>=DIV && LA53_0<=MOD)||(LA53_0>=IF_MODIFIER && LA53_0<=LINE_BREAK)||LA53_0==DOT||(LA53_0>=COMPARE && LA53_0<=POWER)||(LA53_0>=INCLUSIVE_RANGE && LA53_0<=BAND)||LA53_0==RCURLY||LA53_0==ASSOC||LA53_0==RPAREN||LA53_0==RBRACK||(LA53_0>=COMMA && LA53_0<=COLON)||LA53_0==124||(LA53_0>=128 && LA53_0<=130)||(LA53_0>=134 && LA53_0<=135)) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("478:23: ( QUESTION rangeExpression ':' rangeExpression | )", 53, 0, input);
            
                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION140=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1727); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION140_tree = (Object)adaptor.create(QUESTION140);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION140_tree, root_0);
                    }
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1730);
                    rangeExpression141=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression141.getTree());
                    char_literal142=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1732); if (failed) return retval;
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1735);
                    rangeExpression143=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression143.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:73: 
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INCLUSIVE_RANGE145=null;
        Token LINE_BREAK146=null;
        Token EXCLUSIVE_RANGE147=null;
        Token LINE_BREAK148=null;
        logicalOrExpression_return logicalOrExpression144 = null;

        logicalOrExpression_return logicalOrExpression149 = null;
        

        Object INCLUSIVE_RANGE145_tree=null;
        Object LINE_BREAK146_tree=null;
        Object EXCLUSIVE_RANGE147_tree=null;
        Object LINE_BREAK148_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:3: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1752);
            logicalOrExpression144=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression144.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);
                
                if ( (LA57_0==INCLUSIVE_RANGE) ) {
                    alt57=1;
                }
                else if ( (LA57_0==EXCLUSIVE_RANGE) ) {
                    alt57=1;
                }
                
            
                switch (alt57) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);
            	    
            	    if ( (LA56_0==INCLUSIVE_RANGE) ) {
            	        alt56=1;
            	    }
            	    else if ( (LA56_0==EXCLUSIVE_RANGE) ) {
            	        alt56=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("485:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 56, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE145=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1771); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            INCLUSIVE_RANGE145_tree = (Object)adaptor.create(INCLUSIVE_RANGE145);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE145_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:24: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);
            	                
            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }
            	                
            	            
            	                switch (alt54) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK146=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1775); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE147=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1786); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EXCLUSIVE_RANGE147_tree = (Object)adaptor.create(EXCLUSIVE_RANGE147);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE147_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:24: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);
            	                
            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }
            	                
            	            
            	                switch (alt55) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK148=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1790); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1805);
            	    logicalOrExpression149=logicalOrExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression149.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop57;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LOGICAL_OR151=null;
        Token LINE_BREAK152=null;
        logicalAndExpression_return logicalAndExpression150 = null;

        logicalAndExpression_return logicalAndExpression153 = null;
        

        Object LOGICAL_OR151_tree=null;
        Object LINE_BREAK152_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:3: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1825);
            logicalAndExpression150=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression150.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);
                
                if ( (LA59_0==LOGICAL_OR) ) {
                    alt59=1;
                }
                
            
                switch (alt59) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR151=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1857); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_OR151_tree = (Object)adaptor.create(LOGICAL_OR151);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR151_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:18: ( LINE_BREAK )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);
            	        
            	        if ( (LA58_0==LINE_BREAK) ) {
            	            alt58=1;
            	        }
            	        
            	    
            	        switch (alt58) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK152=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1862); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1871);
            	    logicalAndExpression153=logicalAndExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression153.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop59;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:502:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LOGICAL_AND155=null;
        Token LINE_BREAK156=null;
        equalityExpression_return equalityExpression154 = null;

        equalityExpression_return equalityExpression157 = null;
        

        Object LOGICAL_AND155_tree=null;
        Object LINE_BREAK156_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:3: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1891);
            equalityExpression154=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression154.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:504:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);
                
                if ( (LA61_0==LOGICAL_AND) ) {
                    alt61=1;
                }
                
            
                switch (alt61) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND155=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1923); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_AND155_tree = (Object)adaptor.create(LOGICAL_AND155);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND155_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:19: ( LINE_BREAK )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);
            	        
            	        if ( (LA60_0==LINE_BREAK) ) {
            	            alt60=1;
            	        }
            	        
            	    
            	        switch (alt60) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK156=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1928); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop60;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1937);
            	    equalityExpression157=equalityExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression157.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop61;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token COMPARE159=null;
        Token LINE_BREAK160=null;
        Token EQUAL161=null;
        Token LINE_BREAK162=null;
        Token CASE_EQUAL163=null;
        Token LINE_BREAK164=null;
        Token NOT_EQUAL165=null;
        Token LINE_BREAK166=null;
        Token MATCH167=null;
        Token LINE_BREAK168=null;
        Token NOT_MATCH169=null;
        Token LINE_BREAK170=null;
        relationalExpression_return relationalExpression158 = null;

        relationalExpression_return relationalExpression171 = null;
        

        Object COMPARE159_tree=null;
        Object LINE_BREAK160_tree=null;
        Object EQUAL161_tree=null;
        Object LINE_BREAK162_tree=null;
        Object CASE_EQUAL163_tree=null;
        Object LINE_BREAK164_tree=null;
        Object NOT_EQUAL165_tree=null;
        Object LINE_BREAK166_tree=null;
        Object MATCH167_tree=null;
        Object LINE_BREAK168_tree=null;
        Object NOT_MATCH169_tree=null;
        Object LINE_BREAK170_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:3: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1957);
            relationalExpression158=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression158.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop69:
            do {
                int alt69=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt69=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt69=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt69=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt69=1;
                    }
                    break;
                case MATCH:
                    {
                    alt69=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt69=1;
                    }
                    break;
                
                }
            
                switch (alt69) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt68=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt68=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt68=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt68=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt68=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt68=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt68=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("514:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 68, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt68) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE159=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1991); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            COMPARE159_tree = (Object)adaptor.create(COMPARE159);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE159_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:17: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);
            	                
            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }
            	                
            	            
            	                switch (alt62) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK160=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1996); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL161=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression2007); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQUAL161_tree = (Object)adaptor.create(EQUAL161);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL161_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:16: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);
            	                
            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }
            	                
            	            
            	                switch (alt63) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK162=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2013); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL163=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression2024); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            CASE_EQUAL163_tree = (Object)adaptor.create(CASE_EQUAL163);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL163_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:19: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);
            	                
            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }
            	                
            	            
            	                switch (alt64) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK164=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2028); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL165=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression2039); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_EQUAL165_tree = (Object)adaptor.create(NOT_EQUAL165);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL165_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:19: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);
            	                
            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }
            	                
            	            
            	                switch (alt65) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK166=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2044); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 5 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH167=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression2055); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MATCH167_tree = (Object)adaptor.create(MATCH167);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH167_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:16: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);
            	                
            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }
            	                
            	            
            	                switch (alt66) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK168=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2061); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 6 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH169=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression2072); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_MATCH169_tree = (Object)adaptor.create(NOT_MATCH169);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH169_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:19: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);
            	                
            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }
            	                
            	            
            	                switch (alt67) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK170=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2077); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2092);
            	    relationalExpression171=relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression171.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop69;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LESS_THAN173=null;
        Token LINE_BREAK174=null;
        Token GREATER_THAN175=null;
        Token LINE_BREAK176=null;
        Token LESS_OR_EQUAL177=null;
        Token LINE_BREAK178=null;
        Token GREATER_OR_EQUAL179=null;
        Token LINE_BREAK180=null;
        orExpression_return orExpression172 = null;

        orExpression_return orExpression181 = null;
        

        Object LESS_THAN173_tree=null;
        Object LINE_BREAK174_tree=null;
        Object GREATER_THAN175_tree=null;
        Object LINE_BREAK176_tree=null;
        Object LESS_OR_EQUAL177_tree=null;
        Object LINE_BREAK178_tree=null;
        Object GREATER_OR_EQUAL179_tree=null;
        Object LINE_BREAK180_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:3: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_orExpression_in_relationalExpression2113);
            orExpression172=orExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpression172.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop75:
            do {
                int alt75=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt75=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt75=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt75=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt75=1;
                    }
                    break;
                
                }
            
                switch (alt75) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt74=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt74=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt74=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt74=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt74=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("530:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 74, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt74) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN173=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression2147); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_THAN173_tree = (Object)adaptor.create(LESS_THAN173);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN173_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:20: ( LINE_BREAK )*
            	            loop70:
            	            do {
            	                int alt70=2;
            	                int LA70_0 = input.LA(1);
            	                
            	                if ( (LA70_0==LINE_BREAK) ) {
            	                    alt70=1;
            	                }
            	                
            	            
            	                switch (alt70) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK174=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2153); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop70;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN175=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression2164); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_THAN175_tree = (Object)adaptor.create(GREATER_THAN175);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN175_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:22: ( LINE_BREAK )*
            	            loop71:
            	            do {
            	                int alt71=2;
            	                int LA71_0 = input.LA(1);
            	                
            	                if ( (LA71_0==LINE_BREAK) ) {
            	                    alt71=1;
            	                }
            	                
            	            
            	                switch (alt71) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK176=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2169); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop71;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL177=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression2180); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_OR_EQUAL177_tree = (Object)adaptor.create(LESS_OR_EQUAL177);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL177_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:23: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);
            	                
            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }
            	                
            	            
            	                switch (alt72) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK178=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2185); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 4 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL179=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2196); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_OR_EQUAL179_tree = (Object)adaptor.create(GREATER_OR_EQUAL179);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL179_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:25: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);
            	                
            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }
            	                
            	            
            	                switch (alt73) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK180=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2200); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression2215);
            	    orExpression181=orExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, orExpression181.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop75;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BXOR183=null;
        Token LINE_BREAK184=null;
        Token BOR185=null;
        Token LINE_BREAK186=null;
        andExpression_return andExpression182 = null;

        andExpression_return andExpression187 = null;
        

        Object BXOR183_tree=null;
        Object LINE_BREAK184_tree=null;
        Object BOR185_tree=null;
        Object LINE_BREAK186_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:3: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_andExpression_in_orExpression2235);
            andExpression182=andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpression182.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);
                
                if ( (LA79_0==BXOR) ) {
                    alt79=1;
                }
                else if ( (LA79_0==BOR) ) {
                    alt79=1;
                }
                
            
                switch (alt79) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);
            	    
            	    if ( (LA78_0==BXOR) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==BOR) ) {
            	        alt78=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("543:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 78, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR183=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression2269); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BXOR183_tree = (Object)adaptor.create(BXOR183);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR183_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:15: ( LINE_BREAK )*
            	            loop76:
            	            do {
            	                int alt76=2;
            	                int LA76_0 = input.LA(1);
            	                
            	                if ( (LA76_0==LINE_BREAK) ) {
            	                    alt76=1;
            	                }
            	                
            	            
            	                switch (alt76) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK184=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2275); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop76;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR185=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression2286); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BOR185_tree = (Object)adaptor.create(BOR185);
            	            root_0 = (Object)adaptor.becomeRoot(BOR185_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:14: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);
            	                
            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }
            	                
            	            
            	                switch (alt77) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK186=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2292); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2307);
            	    andExpression187=andExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, andExpression187.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop79;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BAND189=null;
        Token LINE_BREAK190=null;
        shiftExpression_return shiftExpression188 = null;

        shiftExpression_return shiftExpression191 = null;
        

        Object BAND189_tree=null;
        Object LINE_BREAK190_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:3: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_shiftExpression_in_andExpression2327);
            shiftExpression188=shiftExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression188.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);
                
                if ( (LA81_0==BAND) ) {
                    alt81=1;
                }
                
            
                switch (alt81) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND189=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2359); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BAND189_tree = (Object)adaptor.create(BAND189);
            	    root_0 = (Object)adaptor.becomeRoot(BAND189_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:13: ( LINE_BREAK )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);
            	        
            	        if ( (LA80_0==LINE_BREAK) ) {
            	            alt80=1;
            	        }
            	        
            	    
            	        switch (alt80) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK190=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2365); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2374);
            	    shiftExpression191=shiftExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression191.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop81;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LEFT_SHIFT193=null;
        Token LINE_BREAK194=null;
        Token RIGHT_SHIFT195=null;
        Token LINE_BREAK196=null;
        additiveExpression_return additiveExpression192 = null;

        additiveExpression_return additiveExpression197 = null;
        

        Object LEFT_SHIFT193_tree=null;
        Object LINE_BREAK194_tree=null;
        Object RIGHT_SHIFT195_tree=null;
        Object LINE_BREAK196_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:3: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2396);
            additiveExpression192=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression192.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);
                
                if ( (LA85_0==LEFT_SHIFT) ) {
                    alt85=1;
                }
                else if ( (LA85_0==RIGHT_SHIFT) ) {
                    alt85=1;
                }
                
            
                switch (alt85) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);
            	    
            	    if ( (LA84_0==LEFT_SHIFT) ) {
            	        alt84=1;
            	    }
            	    else if ( (LA84_0==RIGHT_SHIFT) ) {
            	        alt84=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("565:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 84, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT193=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2430); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LEFT_SHIFT193_tree = (Object)adaptor.create(LEFT_SHIFT193);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT193_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:20: ( LINE_BREAK )*
            	            loop82:
            	            do {
            	                int alt82=2;
            	                int LA82_0 = input.LA(1);
            	                
            	                if ( (LA82_0==LINE_BREAK) ) {
            	                    alt82=1;
            	                }
            	                
            	            
            	                switch (alt82) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK194=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2435); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop82;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT195=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2446); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            RIGHT_SHIFT195_tree = (Object)adaptor.create(RIGHT_SHIFT195);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT195_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:20: ( LINE_BREAK )*
            	            loop83:
            	            do {
            	                int alt83=2;
            	                int LA83_0 = input.LA(1);
            	                
            	                if ( (LA83_0==LINE_BREAK) ) {
            	                    alt83=1;
            	                }
            	                
            	            
            	                switch (alt83) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK196=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2450); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop83;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2465);
            	    additiveExpression197=additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression197.getTree());
            	    
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
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start additiveExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:575:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token PLUS199=null;
        Token LINE_BREAK200=null;
        Token MINUS201=null;
        Token LINE_BREAK202=null;
        multiplicativeExpression_return multiplicativeExpression198 = null;

        multiplicativeExpression_return multiplicativeExpression203 = null;
        

        Object PLUS199_tree=null;
        Object LINE_BREAK200_tree=null;
        Object MINUS201_tree=null;
        Object LINE_BREAK202_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:3: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2487);
            multiplicativeExpression198=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression198.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:577:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);
                
                if ( (LA89_0==PLUS) ) {
                    alt89=1;
                }
                else if ( (LA89_0==MINUS) ) {
                    alt89=1;
                }
                
            
                switch (alt89) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);
            	    
            	    if ( (LA88_0==PLUS) ) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==MINUS) ) {
            	        alt88=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("578:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 88, 0, input);
            	    
            	        throw nvae;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS199=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2521); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS199_tree = (Object)adaptor.create(PLUS199);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS199_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:16: ( LINE_BREAK )*
            	            loop86:
            	            do {
            	                int alt86=2;
            	                int LA86_0 = input.LA(1);
            	                
            	                if ( (LA86_0==LINE_BREAK) ) {
            	                    alt86=1;
            	                }
            	                
            	            
            	                switch (alt86) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK200=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2528); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop86;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS201=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2539); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS201_tree = (Object)adaptor.create(MINUS201);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS201_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:17: ( LINE_BREAK )*
            	            loop87:
            	            do {
            	                int alt87=2;
            	                int LA87_0 = input.LA(1);
            	                
            	                if ( (LA87_0==LINE_BREAK) ) {
            	                    alt87=1;
            	                }
            	                
            	            
            	                switch (alt87) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK202=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2546); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop87;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2561);
            	    multiplicativeExpression203=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression203.getTree());
            	    
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
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start multiplicativeExpression
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token STAR205=null;
        Token LINE_BREAK206=null;
        Token DIV207=null;
        Token LINE_BREAK208=null;
        Token MOD209=null;
        Token LINE_BREAK210=null;
        powerExpression_return powerExpression204 = null;

        powerExpression_return powerExpression211 = null;
        

        Object STAR205_tree=null;
        Object LINE_BREAK206_tree=null;
        Object DIV207_tree=null;
        Object LINE_BREAK208_tree=null;
        Object MOD209_tree=null;
        Object LINE_BREAK210_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:3: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2581);
            powerExpression204=powerExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression204.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop94:
            do {
                int alt94=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt94=1;
                    }
                    break;
                case DIV:
                    {
                    alt94=1;
                    }
                    break;
                case MOD:
                    {
                    alt94=1;
                    }
                    break;
                
                }
            
                switch (alt94) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt93=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt93=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt93=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt93=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("589:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 93, 0, input);
            	    
            	        throw nvae;
            	    }
            	    
            	    switch (alt93) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR205=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2615); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            STAR205_tree = (Object)adaptor.create(STAR205);
            	            root_0 = (Object)adaptor.becomeRoot(STAR205_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:15: ( LINE_BREAK )*
            	            loop90:
            	            do {
            	                int alt90=2;
            	                int LA90_0 = input.LA(1);
            	                
            	                if ( (LA90_0==LINE_BREAK) ) {
            	                    alt90=1;
            	                }
            	                
            	            
            	                switch (alt90) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK206=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2621); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop90;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 2 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV207=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2632); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV207_tree = (Object)adaptor.create(DIV207);
            	            root_0 = (Object)adaptor.becomeRoot(DIV207_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:14: ( LINE_BREAK )*
            	            loop91:
            	            do {
            	                int alt91=2;
            	                int LA91_0 = input.LA(1);
            	                
            	                if ( (LA91_0==LINE_BREAK) ) {
            	                    alt91=1;
            	                }
            	                
            	            
            	                switch (alt91) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK208=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2638); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop91;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	        case 3 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD209=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2649); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD209_tree = (Object)adaptor.create(MOD209);
            	            root_0 = (Object)adaptor.becomeRoot(MOD209_tree, root_0);
            	            }
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:14: ( LINE_BREAK )*
            	            loop92:
            	            do {
            	                int alt92=2;
            	                int LA92_0 = input.LA(1);
            	                
            	                if ( (LA92_0==LINE_BREAK) ) {
            	                    alt92=1;
            	                }
            	                
            	            
            	                switch (alt92) {
            	            	case 1 :
            	            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK210=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2655); if (failed) return retval;
            	            	    
            	            	    }
            	            	    break;
            	            
            	            	default :
            	            	    break loop92;
            	                }
            	            } while (true);

            	            
            	            }
            	            break;
            	    
            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2670);
            	    powerExpression211=powerExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression211.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop94;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token POWER213=null;
        Token LINE_BREAK214=null;
        bnotExpression_return bnotExpression212 = null;

        bnotExpression_return bnotExpression215 = null;
        

        Object POWER213_tree=null;
        Object LINE_BREAK214_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:3: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_bnotExpression_in_powerExpression2691);
            bnotExpression212=bnotExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression212.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);
                
                if ( (LA96_0==POWER) ) {
                    alt96=1;
                }
                
            
                switch (alt96) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER213=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2726); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    POWER213_tree = (Object)adaptor.create(POWER213);
            	    root_0 = (Object)adaptor.becomeRoot(POWER213_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:14: ( LINE_BREAK )*
            	    loop95:
            	    do {
            	        int alt95=2;
            	        int LA95_0 = input.LA(1);
            	        
            	        if ( (LA95_0==LINE_BREAK) ) {
            	            alt95=1;
            	        }
            	        
            	    
            	        switch (alt95) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK214=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2732); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop95;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2741);
            	    bnotExpression215=bnotExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression215.getTree());
            	    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token BNOT216=null;
        Token LINE_BREAK217=null;
        Token NOT218=null;
        Token LINE_BREAK219=null;
        command_return command220 = null;
        

        Object BNOT216_tree=null;
        Object LINE_BREAK217_tree=null;
        Object NOT218_tree=null;
        Object LINE_BREAK219_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:3: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop99:
            do {
                int alt99=3;
                int LA99_0 = input.LA(1);
                
                if ( (LA99_0==BNOT) ) {
                    alt99=1;
                }
                else if ( (LA99_0==NOT) ) {
                    alt99=2;
                }
                
            
                switch (alt99) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT216=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2763); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BNOT216_tree = (Object)adaptor.create(BNOT216);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT216_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:15: ( LINE_BREAK )*
            	    loop97:
            	    do {
            	        int alt97=2;
            	        int LA97_0 = input.LA(1);
            	        
            	        if ( (LA97_0==LINE_BREAK) ) {
            	            alt97=1;
            	        }
            	        
            	    
            	        switch (alt97) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK217=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2769); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop97;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            	case 2 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT218=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2779); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT218_tree = (Object)adaptor.create(NOT218);
            	    root_0 = (Object)adaptor.becomeRoot(NOT218_tree, root_0);
            	    }
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:13: ( LINE_BREAK )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);
            	        
            	        if ( (LA98_0==LINE_BREAK) ) {
            	            alt98=1;
            	        }
            	        
            	    
            	        switch (alt98) {
            	    	case 1 :
            	    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK219=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2785); if (failed) return retval;
            	    	    
            	    	    }
            	    	    break;
            	    
            	    	default :
            	    	    break loop98;
            	        }
            	    } while (true);

            	    
            	    }
            	    break;
            
            	default :
            	    break loop99;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2799);
            command220=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command220.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token string_literal221=null;
        Token string_literal222=null;
        Token char_literal229=null;
        Token char_literal231=null;
        Token DOT232=null;
        literal_return literal223 = null;

        boolean_expression_return boolean_expression224 = null;

        block_expression_return block_expression225 = null;

        if_expression_return if_expression226 = null;

        unless_expression_return unless_expression227 = null;

        atom_return atom228 = null;

        expression_return expression230 = null;

        method_return method233 = null;
        

        Object string_literal221_tree=null;
        Object string_literal222_tree=null;
        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        Object DOT232_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:2: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();
            
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )
            int alt100=9;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt100=1;
                }
                break;
            case 139:
                {
                alt100=2;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt100=3;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt100=3;
                }
                break;
            case HEREDOC_STRING:
            case REGEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt100=3;
                }
                break;
            case COLON:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt100=3;
                    }
                    break;
                case SINGLE_QUOTE_STRING_SIMPLE:
                case SINGLE_QUOTE_STRING_COMPLEX:
                    {
                    alt100=3;
                    }
                    break;
                case DOUBLE_QUOTE_STRING_SIMPLE:
                case DOUBLE_QUOTE_STRING_COMPLEX:
                    {
                    alt100=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("618:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 100, 6, input);
                
                    throw nvae;
                }
            
                }
                break;
            case 125:
            case 126:
            case 127:
                {
                alt100=4;
                }
                break;
            case 123:
                {
                alt100=5;
                }
                break;
            case IF_MODIFIER:
                {
                alt100=6;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt100=7;
                }
                break;
            case ID:
            case LCURLY:
            case LBRACK:
                {
                alt100=8;
                }
                break;
            case LPAREN:
                {
                alt100=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("618:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 100, 0, input);
            
                throw nvae;
            }
            
            switch (alt100) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:4: 'expression0'
                    {
                    string_literal221=(Token)input.LT(1);
                    match(input,138,FOLLOW_138_in_command2818); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal221_tree = (Object)adaptor.create(string_literal221);
                    adaptor.addChild(root_0, string_literal221_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:20: 'expression1'
                    {
                    string_literal222=(Token)input.LT(1);
                    match(input,139,FOLLOW_139_in_command2822); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal222_tree = (Object)adaptor.create(string_literal222);
                    adaptor.addChild(root_0, string_literal222_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2825);
                    literal223=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal223.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2827);
                    boolean_expression224=boolean_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression224.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2830);
                    block_expression225=block_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_expression225.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2832);
                    if_expression226=if_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, if_expression226.getTree());
                    
                    }
                    break;
                case 7 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2834);
                    unless_expression227=unless_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unless_expression227.getTree());
                    
                    }
                    break;
                case 8 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2836);
                    atom228=atom(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atom228.getTree());
                    
                    }
                    break;
                case 9 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:125: '(' expression ')'
                    {
                    char_literal229=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_command2841); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal229_tree = (Object)adaptor.create(char_literal229);
                    adaptor.addChild(root_0, char_literal229_tree);
                    }
                    pushFollow(FOLLOW_expression_in_command2843);
                    expression230=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression230.getTree());
                    char_literal231=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_command2845); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal231_tree = (Object)adaptor.create(char_literal231);
                    adaptor.addChild(root_0, char_literal231_tree);
                    }
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:146: ( DOT method[false] )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);
                
                if ( (LA101_0==DOT) ) {
                    alt101=1;
                }
                
            
                switch (alt101) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:147: DOT method[false]
            	    {
            	    DOT232=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2850); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOT232_tree = (Object)adaptor.create(DOT232);
            	    root_0 = (Object)adaptor.becomeRoot(DOT232_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_method_in_command2853);
            	    method233=method(false);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, method233.getTree());
            	    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:1: atom[boolean topLevel] : ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] );
    public final atom_return atom(boolean topLevel) throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        array_return array234 = null;

        hash_return hash235 = null;

        single_quote_string_return single_quote_string236 = null;

        double_quote_string_return double_quote_string237 = null;

        symbol_return symbol238 = null;

        methodExpression_return methodExpression239 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:24: ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] )
            int alt102=6;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt102=1;
                }
                break;
            case LCURLY:
                {
                alt102=2;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt102=3;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt102=4;
                }
                break;
            case COLON:
                {
                alt102=5;
                }
                break;
            case ID:
                {
                alt102=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("621:1: atom[boolean topLevel] : ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] );", 102, 0, input);
            
                throw nvae;
            }
            
            switch (alt102) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:58: array
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_array_in_atom2873);
                    array234=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, array234.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:64: hash
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_hash_in_atom2875);
                    hash235=hash();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, hash235.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:69: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_single_quote_string_in_atom2877);
                    single_quote_string236=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string236.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:89: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_double_quote_string_in_atom2879);
                    double_quote_string237=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string237.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:109: symbol
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_in_atom2881);
                    symbol238=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol238.getTree());
                    
                    }
                    break;
                case 6 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:118: methodExpression[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_methodExpression_in_atom2885);
                    methodExpression239=methodExpression(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, methodExpression239.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        variable_return variable240 = null;

        method_return method241 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:2: ( variable | method[topLevel] )
            int alt103=2;
            int LA103_0 = input.LA(1);
            
            if ( (LA103_0==ID) ) {
                int LA103_1 = input.LA(2);
                
                if ( (isDefinedVar(tokenStream.LT(1).getText())) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("622:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 103, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("622:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 103, 0, input);
            
                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:9: variable
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_variable_in_methodExpression2901);
                    variable240=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variable240.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:18: method[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_method_in_methodExpression2903);
                    method241=method(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, method241.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:1: variable : {...}? ( simple_variable ( '[' array_items ']' )* ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal243=null;
        Token char_literal245=null;
        simple_variable_return simple_variable242 = null;

        array_items_return array_items244 = null;
        

        Object char_literal243_tree=null;
        Object char_literal245_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:9: ({...}? ( simple_variable ( '[' array_items ']' )* ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:11: {...}? ( simple_variable ( '[' array_items ']' )* )
            {
            root_0 = (Object)adaptor.nil();
            
            if ( !(isDefinedVar(tokenStream.LT(1).getText())) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "variable", "isDefinedVar(tokenStream.LT(1).getText())");
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:56: ( simple_variable ( '[' array_items ']' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:57: simple_variable ( '[' array_items ']' )*
            {
            pushFollow(FOLLOW_simple_variable_in_variable2913);
            simple_variable242=simple_variable();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(simple_variable242.getTree(), root_0);
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:74: ( '[' array_items ']' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);
                
                if ( (LA104_0==LBRACK) ) {
                    alt104=1;
                }
                
            
                switch (alt104) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:75: '[' array_items ']'
            	    {
            	    char_literal243=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_variable2917); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal243_tree = (Object)adaptor.create(char_literal243);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal243_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_array_items_in_variable2920);
            	    array_items244=array_items();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, array_items244.getTree());
            	    char_literal245=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_variable2922); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal245_tree = (Object)adaptor.create(char_literal245);
            	    adaptor.addChild(root_0, char_literal245_tree);
            	    }
            	    
            	    }
            	    break;
            
            	default :
            	    break loop104;
                }
            } while (true);

            
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

    public static class simple_variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start simple_variable
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:1: simple_variable : ID -> ^( VARIABLE ID ) ;
    public final simple_variable_return simple_variable() throws RecognitionException {
        simple_variable_return retval = new simple_variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID246=null;

        Object ID246_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:2: ( ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:4: ID
            {
            ID246=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_simple_variable2934); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID246);


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
            // 627:7: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:10: ^( VARIABLE ID )
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
    // $ANTLR end simple_variable

    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start method
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID ( '[' array_items ']' )* | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID247=null;
        Token ID248=null;
        Token char_literal249=null;
        Token char_literal251=null;
        Token ID252=null;
        array_items_return array_items250 = null;

        open_args_return open_args253 = null;
        

        Object ID247_tree=null;
        Object ID248_tree=null;
        Object char_literal249_tree=null;
        Object char_literal251_tree=null;
        Object ID252_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:26: ({...}? ID -> ^( CALL ID ) | ID ( '[' array_items ']' )* | ID open_args -> ^( CALL ID open_args ) )
            int alt106=3;
            int LA106_0 = input.LA(1);
            
            if ( (LA106_0==ID) ) {
                int LA106_1 = input.LA(2);
                
                if ( ((LA106_1>=HEREDOC_STRING && LA106_1<=FLOAT)||(LA106_1>=IF_MODIFIER && LA106_1<=UNLESS_MODIFIER)||LA106_1==ID||LA106_1==STAR||(LA106_1>=BNOT && LA106_1<=REGEX)||(LA106_1>=SINGLE_QUOTE_STRING_SIMPLE && LA106_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA106_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_1<=DOUBLE_QUOTE_STRING_COMPLEX)||LA106_1==LCURLY||LA106_1==LPAREN||LA106_1==LBRACK||LA106_1==COLON||LA106_1==123||(LA106_1>=125 && LA106_1<=127)||(LA106_1>=137 && LA106_1<=139)) ) {
                    alt106=3;
                }
                else if ( (!isDefinedVar(tokenStream.LT(1).getText())) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("630:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID ( '[' array_items ']' )* | ID open_args -> ^( CALL ID open_args ) );", 106, 1, input);
                
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("630:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID ( '[' array_items ']' )* | ID open_args -> ^( CALL ID open_args ) );", 106, 0, input);
            
                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:28: {...}? ID
                    {
                    if ( !(!isDefinedVar(tokenStream.LT(1).getText())) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(tokenStream.LT(1).getText())");
                    }
                    ID247=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2955); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID247);


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
                    // 630:77: -> ^( CALL ID )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:80: ^( CALL ID )
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:4: ID ( '[' array_items ']' )*
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID248=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2968); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID248_tree = (Object)adaptor.create(ID248);
                    adaptor.addChild(root_0, ID248_tree);
                    }
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:7: ( '[' array_items ']' )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);
                        
                        if ( (LA105_0==LBRACK) ) {
                            alt105=1;
                        }
                        
                    
                        switch (alt105) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:8: '[' array_items ']'
                    	    {
                    	    char_literal249=(Token)input.LT(1);
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_method2971); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal249_tree = (Object)adaptor.create(char_literal249);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal249_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_array_items_in_method2974);
                    	    array_items250=array_items();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, array_items250.getTree());
                    	    char_literal251=(Token)input.LT(1);
                    	    match(input,RBRACK,FOLLOW_RBRACK_in_method2976); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal251_tree = (Object)adaptor.create(char_literal251);
                    	    adaptor.addChild(root_0, char_literal251_tree);
                    	    }
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:17: ID open_args
                    {
                    ID252=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2996); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID252);

                    pushFollow(FOLLOW_open_args_in_method2998);
                    open_args253=open_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_open_args.add(open_args253.getTree());

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
                    // 632:30: -> ^( CALL ID open_args )
                    {
                        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:33: ^( CALL ID open_args )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:646:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal254=null;
        Token char_literal256=null;
        Token char_literal257=null;
        Token char_literal258=null;
        call_args_return call_args255 = null;

        call_args_return call_args259 = null;
        

        Object char_literal254_tree=null;
        Object char_literal256_tree=null;
        Object char_literal257_tree=null;
        Object char_literal258_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:2: ( '(' call_args ')' | '(' ')' | call_args )
            int alt107=3;
            int LA107_0 = input.LA(1);
            
            if ( (LA107_0==LPAREN) ) {
                int LA107_1 = input.LA(2);
                
                if ( (synpred4()) ) {
                    alt107=1;
                }
                else if ( (synpred5()) ) {
                    alt107=2;
                }
                else if ( (true) ) {
                    alt107=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("646:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 107, 1, input);
                
                    throw nvae;
                }
            }
            else if ( ((LA107_0>=HEREDOC_STRING && LA107_0<=FLOAT)||(LA107_0>=IF_MODIFIER && LA107_0<=UNLESS_MODIFIER)||LA107_0==ID||LA107_0==STAR||(LA107_0>=BNOT && LA107_0<=REGEX)||(LA107_0>=SINGLE_QUOTE_STRING_SIMPLE && LA107_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA107_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA107_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA107_0==LCURLY||LA107_0==LBRACK||LA107_0==COLON||LA107_0==123||(LA107_0>=125 && LA107_0<=127)||(LA107_0>=137 && LA107_0<=139)) ) {
                alt107=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("646:1: open_args options {backtrack=true; } : ( '(' call_args ')' | '(' ')' | call_args );", 107, 0, input);
            
                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:4: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal254=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args3036); if (failed) return retval;
                    pushFollow(FOLLOW_call_args_in_open_args3039);
                    call_args255=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args255.getTree());
                    char_literal256=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args3041); if (failed) return retval;
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:4: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal257=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args3047); if (failed) return retval;
                    char_literal258=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args3050); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:649:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_call_args_in_open_args3056);
                    call_args259=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args259.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        args_return args260 = null;
        

        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:2: ( args -> ^( ARG args ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:4: args
            {
            pushFollow(FOLLOW_args_in_call_args3084);
            args260=args();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_args.add(args260.getTree());

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
            // 660:10: -> ^( ARG args )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:13: ^( ARG args )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal262=null;
        arg_return arg261 = null;

        arg_return arg263 = null;
        

        Object char_literal262_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:6: ( arg ( ',' arg )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_arg_in_args3102);
            arg261=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg261.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:12: ( ',' arg )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);
                
                if ( (LA108_0==COMMA) ) {
                    alt108=1;
                }
                
            
                switch (alt108) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:13: ',' arg
            	    {
            	    char_literal262=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args3105); if (failed) return retval;
            	    pushFollow(FOLLOW_arg_in_args3108);
            	    arg263=arg();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, arg263.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop108;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:1: arg : definedExpression[false] ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        definedExpression_return definedExpression264 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:5: ( definedExpression[false] )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:7: definedExpression[false]
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_definedExpression_in_arg3119);
            definedExpression264=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression264.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:668:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set265=null;

        Object set265_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:668:16: ( ID | CONSTANT | FID )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set265=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set265));
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID266=null;
        Token CONSTANT267=null;
        Token FID268=null;
        op_return op269 = null;
        

        Object ID266_tree=null;
        Object CONSTANT267_tree=null;
        Object FID268_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:15: ( ID | CONSTANT | FID | op )
            int alt109=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt109=1;
                }
                break;
            case CONSTANT:
                {
                alt109=2;
                }
                break;
            case FID:
                {
                alt109=3;
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
                alt109=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("671:1: operation2 : ( ID | CONSTANT | FID | op );", 109, 0, input);
            
                throw nvae;
            }
            
            switch (alt109) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID266=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation23158); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID266_tree = (Object)adaptor.create(ID266);
                    adaptor.addChild(root_0, ID266_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    CONSTANT267=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation23162); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT267_tree = (Object)adaptor.create(CONSTANT267);
                    adaptor.addChild(root_0, CONSTANT267_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:33: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID268=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation23166); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID268_tree = (Object)adaptor.create(FID268);
                    adaptor.addChild(root_0, FID268_tree);
                    }
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:39: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation23170);
                    op269=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op269.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID270=null;
        Token FID271=null;
        op_return op272 = null;
        

        Object ID270_tree=null;
        Object FID271_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:15: ( ID | FID | op )
            int alt110=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt110=1;
                }
                break;
            case FID:
                {
                alt110=2;
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
                alt110=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("674:1: operation3 : ( ID | FID | op );", 110, 0, input);
            
                throw nvae;
            }
            
            switch (alt110) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:17: ID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    ID270=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation33186); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID270_tree = (Object)adaptor.create(ID270);
                    adaptor.addChild(root_0, ID270_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:22: FID
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FID271=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation33190); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID271_tree = (Object)adaptor.create(FID271);
                    adaptor.addChild(root_0, FID271_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:28: op
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_op_in_operation33194);
                    op272=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op272.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID273=null;

        Object ID273_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:5: ( ID -> ^( VARIABLE ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:7: ID
            {
            ID273=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs3208); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID273);


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
            // 677:10: -> ^( VARIABLE ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:13: ^( VARIABLE ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:678:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        expression_return expression274 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:678:5: ( expression )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:678:7: expression
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_expression_in_rhs3224);
            expression274=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression274.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:1: literal : ( INT | FLOAT | string | symbol | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token INT275=null;
        Token FLOAT276=null;
        Token REGEX279=null;
        string_return string277 = null;

        symbol_return symbol278 = null;
        

        Object INT275_tree=null;
        Object FLOAT276_tree=null;
        Object REGEX279_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:9: ( INT | FLOAT | string | symbol | REGEX )
            int alt111=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt111=1;
                }
                break;
            case FLOAT:
                {
                alt111=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt111=3;
                }
                break;
            case COLON:
                {
                alt111=4;
                }
                break;
            case REGEX:
                {
                alt111=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("682:1: literal : ( INT | FLOAT | string | symbol | REGEX );", 111, 0, input);
            
                throw nvae;
            }
            
            switch (alt111) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:11: INT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    INT275=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal3234); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT275_tree = (Object)adaptor.create(INT275);
                    adaptor.addChild(root_0, INT275_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    FLOAT276=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal3236); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT276_tree = (Object)adaptor.create(FLOAT276);
                    adaptor.addChild(root_0, FLOAT276_tree);
                    }
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:21: string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_string_in_literal3238);
                    string277=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string277.getTree());
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:28: symbol
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_in_literal3240);
                    symbol278=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol278.getTree());
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:35: REGEX
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    REGEX279=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal3242); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REGEX279_tree = (Object)adaptor.create(REGEX279);
                    adaptor.addChild(root_0, REGEX279_tree);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:753:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token HEREDOC_STRING282=null;
        single_quote_string_return single_quote_string280 = null;

        double_quote_string_return double_quote_string281 = null;
        

        Object HEREDOC_STRING282_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:753:8: ( single_quote_string | double_quote_string | HEREDOC_STRING )
            int alt112=3;
            switch ( input.LA(1) ) {
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt112=1;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt112=2;
                }
                break;
            case HEREDOC_STRING:
                {
                alt112=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("753:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );", 112, 0, input);
            
                throw nvae;
            }
            
            switch (alt112) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:753:10: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_single_quote_string_in_string3972);
                    single_quote_string280=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string280.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:753:30: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_double_quote_string_in_string3974);
                    double_quote_string281=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string281.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:753:50: HEREDOC_STRING
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    HEREDOC_STRING282=(Token)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_string3976); if (failed) return retval;
                    if ( backtracking==0 ) {
                    HEREDOC_STRING282_tree = (Object)adaptor.create(HEREDOC_STRING282);
                    adaptor.addChild(root_0, HEREDOC_STRING282_tree);
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:1: single_quote_string : ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX );
    public final single_quote_string_return single_quote_string() throws RecognitionException {
        single_quote_string_return retval = new single_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set283=null;

        Object set283_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:756:2: ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set283=(Token)input.LT(1);
            if ( (input.LA(1)>=SINGLE_QUOTE_STRING_SIMPLE && input.LA(1)<=SINGLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set283));
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:803:1: double_quote_string : ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX );
    public final double_quote_string_return double_quote_string() throws RecognitionException {
        double_quote_string_return retval = new double_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token set284=null;

        Object set284_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:2: ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();
            
            set284=(Token)input.LT(1);
            if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_SIMPLE && input.LA(1)<=DOUBLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set284));
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

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start array
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:843:1: array : '[' array_items ']' ;
    public final array_return array() throws RecognitionException {
        array_return retval = new array_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal285=null;
        Token char_literal287=null;
        array_items_return array_items286 = null;
        

        Object char_literal285_tree=null;
        Object char_literal287_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:843:7: ( '[' array_items ']' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:843:9: '[' array_items ']'
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal285=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_array4383); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal285_tree = (Object)adaptor.create(char_literal285);
            root_0 = (Object)adaptor.becomeRoot(char_literal285_tree, root_0);
            }
            pushFollow(FOLLOW_array_items_in_array4386);
            array_items286=array_items();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, array_items286.getTree());
            char_literal287=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_array4388); if (failed) return retval;
            
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
    // $ANTLR end array

    public static class array_items_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start array_items
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:844:1: array_items : array_item ( ',' array_item )* trailer ;
    public final array_items_return array_items() throws RecognitionException {
        array_items_return retval = new array_items_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal289=null;
        array_item_return array_item288 = null;

        array_item_return array_item290 = null;

        trailer_return trailer291 = null;
        

        Object char_literal289_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:844:13: ( array_item ( ',' array_item )* trailer )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:844:19: array_item ( ',' array_item )* trailer
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_array_item_in_array_items4400);
            array_item288=array_item();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, array_item288.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:844:30: ( ',' array_item )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);
                
                if ( (LA113_0==COMMA) ) {
                    int LA113_2 = input.LA(2);
                    
                    if ( ((LA113_2>=HEREDOC_STRING && LA113_2<=FLOAT)||(LA113_2>=IF_MODIFIER && LA113_2<=UNLESS_MODIFIER)||LA113_2==ID||(LA113_2>=INT && LA113_2<=REGEX)||(LA113_2>=SINGLE_QUOTE_STRING_SIMPLE && LA113_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA113_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA113_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA113_2==LCURLY||LA113_2==LPAREN||LA113_2==LBRACK||LA113_2==COLON||LA113_2==123||(LA113_2>=125 && LA113_2<=127)||(LA113_2>=138 && LA113_2<=139)) ) {
                        alt113=1;
                    }
                    
                
                }
                
            
                switch (alt113) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:844:31: ',' array_item
            	    {
            	    char_literal289=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_array_items4403); if (failed) return retval;
            	    pushFollow(FOLLOW_array_item_in_array_items4406);
            	    array_item290=array_item();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, array_item290.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop113;
                }
            } while (true);

            pushFollow(FOLLOW_trailer_in_array_items4410);
            trailer291=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer291.getTree());
            
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
    // $ANTLR end array_items

    public static class array_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start array_item
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:845:1: array_item : command ;
    public final array_item_return array_item() throws RecognitionException {
        array_item_return retval = new array_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        command_return command292 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:845:13: ( command )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:845:19: command
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_command_in_array_item4422);
            command292=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command292.getTree());
            
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
    // $ANTLR end array_item

    public static class hash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };
    
    // $ANTLR start hash
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal293=null;
        Token char_literal295=null;
        assoc_list_return assoc_list294 = null;
        

        Object char_literal293_tree=null;
        Object char_literal295_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:6: ( '{' assoc_list '}' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal293=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash4429); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal293_tree = (Object)adaptor.create(char_literal293);
            root_0 = (Object)adaptor.becomeRoot(char_literal293_tree, root_0);
            }
            pushFollow(FOLLOW_assoc_list_in_hash4432);
            assoc_list294=assoc_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc_list294.getTree());
            char_literal295=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash4434); if (failed) return retval;
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:847:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        assocs_return assocs296 = null;

        trailer_return trailer297 = null;
        

    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:848:2: ( assocs trailer )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:848:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assocs_in_assoc_list4443);
            assocs296=assocs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assocs296.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list4445);
            trailer297=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer297.getTree());
            
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal299=null;
        assoc_return assoc298 = null;

        assoc_return assoc300 = null;
        

        Object char_literal299_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:8: ( assoc ( ',' assoc )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();
            
            pushFollow(FOLLOW_assoc_in_assocs4454);
            assoc298=assoc();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc298.getTree());
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:16: ( ',' assoc )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);
                
                if ( (LA114_0==COMMA) ) {
                    int LA114_2 = input.LA(2);
                    
                    if ( ((LA114_2>=HEREDOC_STRING && LA114_2<=FLOAT)||(LA114_2>=IF_MODIFIER && LA114_2<=UNLESS_MODIFIER)||LA114_2==ID||LA114_2==STAR||(LA114_2>=BNOT && LA114_2<=REGEX)||(LA114_2>=SINGLE_QUOTE_STRING_SIMPLE && LA114_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA114_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA114_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA114_2==LCURLY||LA114_2==LPAREN||LA114_2==LBRACK||LA114_2==COLON||LA114_2==123||(LA114_2>=125 && LA114_2<=127)||(LA114_2>=137 && LA114_2<=139)) ) {
                        alt114=1;
                    }
                    
                
                }
                
            
                switch (alt114) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:18: ',' assoc
            	    {
            	    char_literal299=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs4458); if (failed) return retval;
            	    pushFollow(FOLLOW_assoc_in_assocs4461);
            	    assoc300=assoc();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assoc300.getTree());
            	    
            	    }
            	    break;
            
            	default :
            	    break loop114;
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal302=null;
        Token set305=null;
        symbol_name_in_assoc_return symbol_name_in_assoc301 = null;

        arg_return arg303 = null;

        arg_return arg304 = null;

        arg_return arg306 = null;
        

        Object char_literal302_tree=null;
        Object set305_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:15: ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg )
            int alt115=2;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:17: ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_symbol_name_in_assoc_in_assoc4488);
                    symbol_name_in_assoc301=symbol_name_in_assoc();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol_name_in_assoc301.getTree());
                    char_literal302=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_assoc4490); if (failed) return retval;
                    pushFollow(FOLLOW_arg_in_assoc4493);
                    arg303=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg303.getTree());
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:82: arg ( ASSOC | ',' ) arg
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    pushFollow(FOLLOW_arg_in_assoc4497);
                    arg304=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg304.getTree());
                    set305=(Token)input.LT(1);
                    if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc4499);    throw mse;
                    }

                    pushFollow(FOLLOW_arg_in_assoc4506);
                    arg306=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg306.getTree());
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:853:1: symbol_name_in_assoc : ID -> ^( SYMBOL ID ) ;
    public final symbol_name_in_assoc_return symbol_name_in_assoc() throws RecognitionException {
        symbol_name_in_assoc_return retval = new symbol_name_in_assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token ID307=null;

        Object ID307_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:2: ( ID -> ^( SYMBOL ID ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:4: ID
            {
            ID307=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_symbol_name_in_assoc4516); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID307);


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
            // 854:7: -> ^( SYMBOL ID )
            {
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:10: ^( SYMBOL ID )
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token LINE_BREAK308=null;
        Token char_literal309=null;

        Object LINE_BREAK308_tree=null;
        Object char_literal309_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:16: ( | LINE_BREAK | ',' )
            int alt116=3;
            switch ( input.LA(1) ) {
            case RCURLY:
            case RBRACK:
                {
                alt116=1;
                }
                break;
            case LINE_BREAK:
                {
                alt116=2;
                }
                break;
            case COMMA:
                {
                alt116=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("859:1: trailer : ( | LINE_BREAK | ',' );", 116, 0, input);
            
                throw nvae;
            }
            
            switch (alt116) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:29: 
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    LINE_BREAK308=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer4547); if (failed) return retval;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:45: ','
                    {
                    root_0 = (Object)adaptor.nil();
                    
                    char_literal309=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer4552); if (failed) return retval;
                    
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
    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:1: symbol : ':' ( ID | single_quote_string | double_quote_string ) ;
    public final symbol_return symbol() throws RecognitionException {
        symbol_return retval = new symbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;
    
        Token char_literal310=null;
        Token ID311=null;
        single_quote_string_return single_quote_string312 = null;

        double_quote_string_return double_quote_string313 = null;
        

        Object char_literal310_tree=null;
        Object ID311_tree=null;
    
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:8: ( ':' ( ID | single_quote_string | double_quote_string ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:10: ':' ( ID | single_quote_string | double_quote_string )
            {
            root_0 = (Object)adaptor.nil();
            
            char_literal310=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_symbol4568); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal310_tree = (Object)adaptor.create(char_literal310);
            root_0 = (Object)adaptor.becomeRoot(char_literal310_tree, root_0);
            }
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:15: ( ID | single_quote_string | double_quote_string )
            int alt117=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt117=1;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt117=2;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt117=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("862:15: ( ID | single_quote_string | double_quote_string )", 117, 0, input);
            
                throw nvae;
            }
            
            switch (alt117) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:16: ID
                    {
                    ID311=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_symbol4572); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID311_tree = (Object)adaptor.create(ID311);
                    adaptor.addChild(root_0, ID311_tree);
                    }
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:21: single_quote_string
                    {
                    pushFollow(FOLLOW_single_quote_string_in_symbol4576);
                    single_quote_string312=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string312.getTree());
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:43: double_quote_string
                    {
                    pushFollow(FOLLOW_double_quote_string_in_symbol4580);
                    double_quote_string313=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string313.getTree());
                    
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
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:90: ( simple_assignment_expression )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:91: simple_assignment_expression
        {
        pushFollow(FOLLOW_simple_assignment_expression_in_synpred11424);
        simple_assignment_expression();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:154: ( mlhs )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:155: mlhs
        {
        pushFollow(FOLLOW_mlhs_in_synpred21433);
        mlhs();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:121: ( simple_assignment_expression )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:122: simple_assignment_expression
        {
        pushFollow(FOLLOW_simple_assignment_expression_in_synpred31643);
        simple_assignment_expression();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:4: ( '(' call_args ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:647:4: '(' call_args ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred43036); if (failed) return ;
        pushFollow(FOLLOW_call_args_in_synpred43039);
        call_args();
        _fsp--;
        if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred43041); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:4: ( '(' ')' )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:4: '(' ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred53047); if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred53050); if (failed) return ;
        
        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:17: ( symbol_name_in_assoc ':' arg )
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:18: symbol_name_in_assoc ':' arg
        {
        pushFollow(FOLLOW_symbol_name_in_assoc_in_synpred64480);
        symbol_name_in_assoc();
        _fsp--;
        if (failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred64482); if (failed) return ;
        pushFollow(FOLLOW_arg_in_synpred64484);
        arg();
        _fsp--;
        if (failed) return ;
        
        }
    }
    // $ANTLR end synpred6

    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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
    protected DFA115 dfa115 = new DFA115(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\46\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\u0081\2\u008b\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\124\uffff\1\3\3\uffff\2\3",
            "\2\4\23\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\4\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
            "\3\uffff\4\4",
            "\2\4\23\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\4\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
            "\3\uffff\4\4",
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
            return "()* loopback of 292:21: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\47\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\u0082\1\u008b\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\120\uffff\1\2\11\uffff\1\3",
            "\2\4\23\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\4\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\2\uffff\7\4\1\3\2\4\3\uffff\4\4",
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
            return "335:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA115_eotS =
        "\67\uffff";
    static final String DFA115_eofS =
        "\67\uffff";
    static final String DFA115_minS =
        "\1\14\1\13\1\uffff\1\14\1\0\2\13\22\uffff\34\0\2\uffff";
    static final String DFA115_maxS =
        "\2\u008b\1\uffff\1\u008b\1\0\2\167\22\uffff\34\0\2\uffff";
    static final String DFA115_acceptS =
        "\2\uffff\1\2\4\uffff\22\1\34\uffff\2\1";
    static final String DFA115_specialS =
        "\3\uffff\1\2\1\3\1\0\1\1\60\uffff}>";
    static final String[] DFA115_transitionS = {
            "\2\2\23\uffff\2\2\10\uffff\1\1\13\uffff\1\2\31\uffff\4\2\20"+
            "\uffff\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\2\2\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "\3\2\16\uffff\2\2\3\uffff\2\2\6\uffff\1\2\1\uffff\52\2\20\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\2\1\3\2\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "",
            "\1\17\1\16\23\uffff\1\24\1\25\10\uffff\1\4\13\uffff\1\10\31"+
            "\uffff\1\11\1\12\1\15\1\21\20\uffff\2\5\1\uffff\2\6\1\uffff"+
            "\1\27\6\uffff\1\30\1\uffff\1\26\3\uffff\1\20\2\uffff\1\23\1"+
            "\uffff\3\22\11\uffff\1\7\1\13\1\14",
            "\1\uffff",
            "\1\40\20\uffff\1\34\1\35\11\uffff\1\66\1\uffff\1\31\2\uffff"+
            "\1\51\1\52\1\53\1\55\1\46\1\50\1\45\1\47\1\41\1\36\1\37\1\33"+
            "\1\32\16\uffff\1\63\1\61\1\62\1\60\1\57\1\54\1\56\1\43\1\44"+
            "\1\42\33\uffff\1\65\2\uffff\1\2\7\uffff\1\64",
            "\1\40\20\uffff\1\34\1\35\11\uffff\1\66\1\uffff\1\31\2\uffff"+
            "\1\51\1\52\1\53\1\55\1\46\1\50\1\45\1\47\1\41\1\36\1\37\1\33"+
            "\1\32\16\uffff\1\63\1\61\1\62\1\60\1\57\1\54\1\56\1\43\1\44"+
            "\1\42\33\uffff\1\65\2\uffff\1\2\7\uffff\1\64",
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
    
    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;
    
    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }
    
    class DFA115 extends DFA {
    
        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "851:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {

                    case 0 : 
                        int LA115_5 = input.LA(1);
                        
                         
                        int index115_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA115_5==DOT) ) {s = 25;}

                        else if ( (LA115_5==POWER) ) {s = 26;}

                        else if ( (LA115_5==STAR) ) {s = 27;}

                        else if ( (LA115_5==DIV) ) {s = 28;}

                        else if ( (LA115_5==MOD) ) {s = 29;}

                        else if ( (LA115_5==PLUS) ) {s = 30;}

                        else if ( (LA115_5==MINUS) ) {s = 31;}

                        else if ( (LA115_5==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA115_5==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA115_5==BAND) ) {s = 34;}

                        else if ( (LA115_5==BXOR) ) {s = 35;}

                        else if ( (LA115_5==BOR) ) {s = 36;}

                        else if ( (LA115_5==LESS_THAN) ) {s = 37;}

                        else if ( (LA115_5==GREATER_THAN) ) {s = 38;}

                        else if ( (LA115_5==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA115_5==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA115_5==COMPARE) ) {s = 41;}

                        else if ( (LA115_5==EQUAL) ) {s = 42;}

                        else if ( (LA115_5==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA115_5==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA115_5==MATCH) ) {s = 45;}

                        else if ( (LA115_5==NOT_MATCH) ) {s = 46;}

                        else if ( (LA115_5==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA115_5==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA115_5==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA115_5==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA115_5==QUESTION) ) {s = 51;}

                        else if ( (LA115_5==COMMA) ) {s = 52;}

                        else if ( (LA115_5==ASSOC) ) {s = 2;}

                        else if ( (LA115_5==RCURLY) && (synpred6())) {s = 53;}

                        else if ( (LA115_5==LINE_BREAK) && (synpred6())) {s = 54;}
                        
                         
                        input.seek(index115_5);
                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA115_6 = input.LA(1);
                        
                         
                        int index115_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA115_6==DOT) ) {s = 25;}

                        else if ( (LA115_6==POWER) ) {s = 26;}

                        else if ( (LA115_6==STAR) ) {s = 27;}

                        else if ( (LA115_6==DIV) ) {s = 28;}

                        else if ( (LA115_6==MOD) ) {s = 29;}

                        else if ( (LA115_6==PLUS) ) {s = 30;}

                        else if ( (LA115_6==MINUS) ) {s = 31;}

                        else if ( (LA115_6==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA115_6==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA115_6==BAND) ) {s = 34;}

                        else if ( (LA115_6==BXOR) ) {s = 35;}

                        else if ( (LA115_6==BOR) ) {s = 36;}

                        else if ( (LA115_6==LESS_THAN) ) {s = 37;}

                        else if ( (LA115_6==GREATER_THAN) ) {s = 38;}

                        else if ( (LA115_6==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA115_6==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA115_6==COMPARE) ) {s = 41;}

                        else if ( (LA115_6==EQUAL) ) {s = 42;}

                        else if ( (LA115_6==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA115_6==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA115_6==MATCH) ) {s = 45;}

                        else if ( (LA115_6==NOT_MATCH) ) {s = 46;}

                        else if ( (LA115_6==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA115_6==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA115_6==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA115_6==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA115_6==QUESTION) ) {s = 51;}

                        else if ( (LA115_6==COMMA) ) {s = 52;}

                        else if ( (LA115_6==RCURLY) && (synpred6())) {s = 53;}

                        else if ( (LA115_6==LINE_BREAK) && (synpred6())) {s = 54;}

                        else if ( (LA115_6==ASSOC) ) {s = 2;}
                        
                         
                        input.seek(index115_6);
                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA115_3 = input.LA(1);
                        
                         
                        int index115_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA115_3==ID) ) {s = 4;}

                        else if ( ((LA115_3>=SINGLE_QUOTE_STRING_SIMPLE && LA115_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 5;}

                        else if ( ((LA115_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA115_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 6;}

                        else if ( (LA115_3==137) && (synpred6())) {s = 7;}

                        else if ( (LA115_3==STAR) && (synpred6())) {s = 8;}

                        else if ( (LA115_3==BNOT) && (synpred6())) {s = 9;}

                        else if ( (LA115_3==NOT) && (synpred6())) {s = 10;}

                        else if ( (LA115_3==138) && (synpred6())) {s = 11;}

                        else if ( (LA115_3==139) && (synpred6())) {s = 12;}

                        else if ( (LA115_3==INT) && (synpred6())) {s = 13;}

                        else if ( (LA115_3==FLOAT) && (synpred6())) {s = 14;}

                        else if ( (LA115_3==HEREDOC_STRING) && (synpred6())) {s = 15;}

                        else if ( (LA115_3==COLON) && (synpred6())) {s = 16;}

                        else if ( (LA115_3==REGEX) && (synpred6())) {s = 17;}

                        else if ( ((LA115_3>=125 && LA115_3<=127)) && (synpred6())) {s = 18;}

                        else if ( (LA115_3==123) && (synpred6())) {s = 19;}

                        else if ( (LA115_3==IF_MODIFIER) && (synpred6())) {s = 20;}

                        else if ( (LA115_3==UNLESS_MODIFIER) && (synpred6())) {s = 21;}

                        else if ( (LA115_3==LBRACK) && (synpred6())) {s = 22;}

                        else if ( (LA115_3==LCURLY) && (synpred6())) {s = 23;}

                        else if ( (LA115_3==LPAREN) && (synpred6())) {s = 24;}
                        
                         
                        input.seek(index115_3);
                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA115_4 = input.LA(1);
                        
                         
                        int index115_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}
                        
                         
                        input.seek(index115_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program269 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_statement_list_in_program273 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_terminal_in_program275 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list300 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list303 = new BitSet(new long[]{0x008008C600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_statement_in_statement_list306 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_expression_in_statement336 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement339 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_set_in_modifier_line379 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_line_break_in_modifier_line393 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_modifier_line397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_block_expression472 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_body_in_block_expression474 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_block_expression476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body483 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_statement_list_in_body487 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_terminal_in_body489 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression512 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_if_expression517 = new BitSet(new long[]{0x0000008000000000L,0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_seperator_in_if_expression519 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F1BL});
    public static final BitSet FOLLOW_body_in_if_expression532 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_if_expression535 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_if_expression539 = new BitSet(new long[]{0x0000008000000000L,0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_seperator_in_if_expression541 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F1BL});
    public static final BitSet FOLLOW_body_in_if_expression545 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_129_in_if_expression559 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_body_in_if_expression563 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_if_expression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator628 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator631 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator633 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator638 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_seperator641 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator643 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression653 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression655 = new BitSet(new long[]{0x0000008000000000L,0x0100000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_unless_expression658 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F1AL});
    public static final BitSet FOLLOW_COLON_in_unless_expression660 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F1AL});
    public static final BitSet FOLLOW_line_break_in_unless_expression662 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F1AL});
    public static final BitSet FOLLOW_body_in_unless_expression674 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_unless_expression687 = new BitSet(new long[]{0x0080084600003000L,0xF9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_body_in_unless_expression689 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_unless_expression702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_expression766 = new BitSet(new long[]{0x01FFF8003000C800L,0x004000000003C000L,0x0000000000000020L});
    public static final BitSet FOLLOW_fitem_in_expression769 = new BitSet(new long[]{0x01FFF8003000C800L,0x004000000003C000L,0x0000000000000020L});
    public static final BitSet FOLLOW_fitem_in_expression771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_methodDefinition791 = new BitSet(new long[]{0x000008800000C000L,0x0004000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition795 = new BitSet(new long[]{0x000008800000C000L,0x0004000000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition801 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition803 = new BitSet(new long[]{0x000008000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition807 = new BitSet(new long[]{0x008008C000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition811 = new BitSet(new long[]{0x008008C600003000L,0xF9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition814 = new BitSet(new long[]{0x008008C600003000L,0xF9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition820 = new BitSet(new long[]{0x000000C000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition824 = new BitSet(new long[]{0x000000C000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_methodDefinition829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton842 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_singleton845 = new BitSet(new long[]{0x0000008000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton847 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist906 = new BitSet(new long[]{0x0080088000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist908 = new BitSet(new long[]{0x0000008000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist912 = new BitSet(new long[]{0x0000008000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist935 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args949 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args951 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args954 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args957 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args970 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args972 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args986 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args989 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1040 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args1064 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args1066 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_f_opt_args1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_andorExpression1283 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1288 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_135_in_andorExpression1299 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1304 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_136_in_notExpression1337 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1344 = new BitSet(new long[]{0x0080088600003000L,0xE9140B60001E0000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_definedExpression1374 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_definedExpression_in_definedExpression1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1411 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1415 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_assignmentExpression1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_assignmentExpression1438 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1440 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_simple_assignment_expression1483 = new BitSet(new long[]{0xFE00000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_set_in_simple_assignment_expression1485 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_definedExpression_in_simple_assignment_expression1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_mlhs1553 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1558 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_lhs_in_mlhs1563 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1570 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_lhs1594 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_lhs_in_star_lhs1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_mrhs1626 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_mrhs1628 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1638 = new BitSet(new long[]{0x0000080600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_mrhs1648 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_mrhs1650 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1656 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_star_rhs_in_mrhs1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_rhs_in_mrhs1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_rhs1697 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_definedExpression_in_star_rhs1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1727 = new BitSet(new long[]{0x0000080600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1730 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1732 = new BitSet(new long[]{0x0000080600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1771 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1775 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1786 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1790 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1857 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1862 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1923 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1928 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1957 = new BitSet(new long[]{0x0000F00000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1991 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1996 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression2007 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2013 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression2024 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2028 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression2039 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2044 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression2055 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2061 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression2072 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2077 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2092 = new BitSet(new long[]{0x0000F00000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2113 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression2147 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2153 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression2164 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2169 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression2180 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2185 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2196 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2200 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2215 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2235 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression2269 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2275 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_BOR_in_orExpression2286 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2292 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2307 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2359 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2365 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2396 = new BitSet(new long[]{0x0010000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2430 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2435 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2446 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2450 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2465 = new BitSet(new long[]{0x0010000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2487 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2521 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2528 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2539 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2546 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2561 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2581 = new BitSet(new long[]{0x0080000030000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2615 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2621 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2632 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2638 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2649 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2655 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2670 = new BitSet(new long[]{0x0080000030000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2691 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2726 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2732 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2741 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2763 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2769 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2779 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2785 = new BitSet(new long[]{0x0000088600003000L,0xE9140B60001E0000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_command_in_bnotExpression2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_command2818 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_139_in_command2822 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_literal_in_command2825 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2827 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2830 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2832 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2834 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_atom_in_command2836 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LPAREN_in_command2841 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000F18L});
    public static final BitSet FOLLOW_expression_in_command2843 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_command2845 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DOT_in_command2850 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_method_in_command2853 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_array_in_atom2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_atom2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_atom2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_atom2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_atom2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_variable_in_variable2913 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_variable2917 = new BitSet(new long[]{0x0000080600003000L,0xE9140B6000180000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_array_items_in_variable2920 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_variable2922 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_simple_variable2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2968 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_method2971 = new BitSet(new long[]{0x0000080600003000L,0xE9140B6000180000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_array_items_in_method2974 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_method2976 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_method2996 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_open_args_in_method2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args3036 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_call_args_in_open_args3039 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args3047 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args3102 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args3105 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_args3108 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation23158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation23162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation23166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation23170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation33186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation33190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation33194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_literal3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_string3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_string3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_string3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_single_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_double_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array4383 = new BitSet(new long[]{0x0000080600003000L,0xE9140B6000180000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_array_items_in_array4386 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_item_in_array_items4400 = new BitSet(new long[]{0x0000008000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array_items4403 = new BitSet(new long[]{0x0000080600003000L,0xE9140B6000180000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_array_item_in_array_items4406 = new BitSet(new long[]{0x0000008000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_trailer_in_array_items4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_array_item4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash4429 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_assoc_list_in_hash4432 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list4443 = new BitSet(new long[]{0x0000008000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs4454 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs4458 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_assoc_in_assocs4461 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_assoc4488 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_assoc4490 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_assoc4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_assoc4497 = new BitSet(new long[]{0x0000000000000000L,0x0080800000000000L});
    public static final BitSet FOLLOW_set_in_assoc4499 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_assoc4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_symbol_name_in_assoc4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_symbol4568 = new BitSet(new long[]{0x0000080000000000L,0x0000036000000000L});
    public static final BitSet FOLLOW_ID_in_symbol4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_symbol4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_symbol4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_synpred11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_synpred21433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_synpred31643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred43036 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_call_args_in_synpred43039 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred43041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred53047 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred53050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_synpred64480 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred64482 = new BitSet(new long[]{0x0080080600003000L,0xE9140B60001E0000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_arg_in_synpred64484 = new BitSet(new long[]{0x0000000000000002L});

}