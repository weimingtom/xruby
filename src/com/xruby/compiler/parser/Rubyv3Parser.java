// $ANTLR 3.0.1 F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-05 20:26:11

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "VARIABLE_OR_METHOD", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "SYMBOL", "STAR_ID", "ARRAY_REF_CALL", "BLOCK_ID", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING_SIMPLE", "SINGLE_QUOTE_STRING_COMPLEX", "SINGLE_STRING_CHAR", "DOUBLE_QUOTE_STRING_SIMPLE", "DOUBLE_QUOTE_STRING_COMPLEX", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "SYMBOL_NAME", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined?'", "'expression0'", "'expression1'", "'do'"
    };
    public static final int CASE_EQUAL=48;
    public static final int STAR=57;
    public static final int EMPTY_ARRAY=120;
    public static final int MOD=30;
    public static final int REST_UNUSE=28;
    public static final int MOD_ASSIGN=60;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=123;
    public static final int SINGLE_QUOTE_STRING_SIMPLE=103;
    public static final int REGEX=86;
    public static final int LEFT_SHIFT_ASSIGN=67;
    public static final int NOT=84;
    public static final int UNTIL_MODIFIER=38;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=62;
    public static final int LOGICAL_AND=77;
    public static final int STATEMENT=5;
    public static final int RPAREN=117;
    public static final int HEX_PART=97;
    public static final int DOUBLE_QUOTE_STRING_SIMPLE=106;
    public static final int ARG=10;
    public static final int NESTED_LHS=25;
    public static final int NOT_EQUAL=78;
    public static final int SYMBOL_NAME=114;
    public static final int WHILE_MODIFIER=37;
    public static final int BODY=9;
    public static final int COMMENT=124;
    public static final int RBRACK=119;
    public static final int VARIABLE_OR_METHOD=18;
    public static final int HEREDOC_BEGIN=111;
    public static final int UNLESS_MODIFIER=36;
    public static final int INCLUSIVE_RANGE=74;
    public static final int SYMBOL=31;
    public static final int MINUS_ASSIGN=63;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=107;
    public static final int POWER=58;
    public static final int LCURLY=109;
    public static final int MATCH=49;
    public static final int INT=85;
    public static final int GLOBAL_VARIABLE=96;
    public static final int ESCAPE_INT_PART=100;
    public static final int LINE_BREAK=41;
    public static final int WS=42;
    public static final int VARIABLE=16;
    public static final int INSTANCE_VARIABLE=94;
    public static final int LESS_THAN=52;
    public static final int OCTAL=87;
    public static final int SINGLETON_METHOD=26;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=79;
    public static final int BNOT=83;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=113;
    public static final int ARRAY_REF_CALL=33;
    public static final int NON_LEADING0_NUMBER=102;
    public static final int STAR_ID=32;
    public static final int CONTROL_PART=98;
    public static final int LBRACK=118;
    public static final int IF_MODIFIER=35;
    public static final int BXOR_ASSIGN=115;
    public static final int GREATER_OR_EQUAL=51;
    public static final int FLOAT=13;
    public static final int BLOCK_ID=34;
    public static final int BLOCK_ARG=22;
    public static final int HEREDOC_STRING=12;
    public static final int ID=45;
    public static final int LPAREN=116;
    public static final int IF=7;
    public static final int EXP_PART=91;
    public static final int RESCUE_MODIFIER=39;
    public static final int SINGLE_QUOTE_STRING_COMPLEX=104;
    public static final int BOR_ASSIGN=65;
    public static final int LEADING0_NUMBER=92;
    public static final int COMMA=121;
    public static final int HEX=88;
    public static final int EQUAL=47;
    public static final int BOR=81;
    public static final int RIGHT_SHIFT=54;
    public static final int RIGHT_SHIFT_ASSIGN=68;
    public static final int LOGICAL_OR=76;
    public static final int COMPARE=46;
    public static final int PLUS=55;
    public static final int BXOR=80;
    public static final int DOT=43;
    public static final int EXCLUSIVE_RANGE=75;
    public static final int COLON2=44;
    public static final int MRHS=24;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=93;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int GREATER_THAN=50;
    public static final int LOGICAL_AND_ASSIGN=70;
    public static final int LEADING_MARK_DECIMAL=90;
    public static final int DOUBLE_STRING_CHAR=108;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int LESS_OR_EQUAL=53;
    public static final int SINGLE_STRING_CHAR=105;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=56;
    public static final int BAND=82;
    public static final int META_PART=99;
    public static final int SEMI=40;
    public static final int STAR_ASSIGN=69;
    public static final int LOGICAL_OR_ASSIGN=71;
    public static final int COLON=122;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=66;
    public static final int CLASS_VARIABLE=95;
    public static final int QUESTION=73;
    public static final int ESCAPE_INT=101;
    public static final int BLOCK=19;
    public static final int RCURLY=110;
    public static final int ASSIGN=59;
    public static final int PLUS_ASSIGN=64;
    public static final int POWER_ASSIGN=72;
    public static final int COMPLEMENT_ASSIGN=61;
    public static final int DIV=29;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int BINARY=89;
    public static final int HEREDOC_INDENT_BEGIN=112;
    public static final int STRING=27;

        public Rubyv3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[90+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:17: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||LA3_0==STAR||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING_SIMPLE && LA3_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA3_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA3_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA3_0==LCURLY||LA3_0==LPAREN||LA3_0==LBRACK||LA3_0==COLON||LA3_0==125||(LA3_0>=127 && LA3_0<=129)||(LA3_0>=133 && LA3_0<=134)||(LA3_0>=138 && LA3_0<=141)) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("288:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program277);
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program281);
                    statement_list2=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list2.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program283);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:11: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list308);
            statement4=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(statement4.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:21: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:22: ( terminal )+ statement
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:22: ( terminal )+
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
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:22: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list311);
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

            	    pushFollow(FOLLOW_statement_in_statement_list314);
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
            // 294:44: -> ^( STATEMENT_LIST ( statement )* )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:47: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:64: ( statement )*
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:2: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement344);
            expression7=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression7.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement347);
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
            // 303:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:59: ( modifier_line )*
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:306:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:2: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line387);    throw mse;
            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line401);
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

            pushFollow(FOLLOW_expression_in_modifier_line405);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:1: block_expression : 'begin' body 'end' ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:2: ( 'begin' body 'end' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)input.LT(1);
            match(input,125,FOLLOW_125_in_block_expression480); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);
            }
            pushFollow(FOLLOW_body_in_block_expression482);
            body13=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_block_expression484); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:6: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==126||(LA10_0>=130 && LA10_0<=131)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||LA10_0==STAR||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING_SIMPLE && LA10_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA10_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA10_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA10_0==LCURLY||LA10_0==LPAREN||LA10_0==LBRACK||LA10_0==COLON||LA10_0==125||(LA10_0>=127 && LA10_0<=129)||(LA10_0>=133 && LA10_0<=134)||(LA10_0>=138 && LA10_0<=141)) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("327:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body491); if (failed) return retval;
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body495);
                    statement_list16=statement_list();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_list16.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body497);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:2: ( 'false' | 'nil' | 'true' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=127 && input.LA(1)<=129) ) {
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:2: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression520); if (failed) return retval;
            if ( backtracking==0 ) stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression525);
            e0=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression527);
            seperator20=seperator();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression540);
            body0=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_body.add(body0.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==130) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,130,FOLLOW_130_in_if_expression543); if (failed) return retval;
            	    if ( backtracking==0 ) stream_130.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression547);
            	    e1=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression549);
            	    seperator22=seperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression553);
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

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==131) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_if_expression567); if (failed) return retval;
                    if ( backtracking==0 ) stream_131.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression571);
                    body2=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_if_expression584); if (failed) return retval;
            if ( backtracking==0 ) stream_126.add(string_literal24);


            // AST REWRITE
            // elements: body2, e1, body1, body0, e0
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
            // 334:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:334:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:334:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:334:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:334:48: ( $body2)?
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:337:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:2: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:3: ( LINE_BREAK )+
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator636); if (failed) return retval;
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator639); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator641); if (failed) return retval;
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator646); if (failed) return retval;
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
                    match(input,132,FOLLOW_132_in_seperator649); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator651); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:339:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:2: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression661); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);
            }
            pushFollow(FOLLOW_boolean_expression_in_unless_expression663);
            boolean_expression32=boolean_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression32.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 132:
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
                    new NoViableAltException("340:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_unless_expression666); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression668); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression670);
                    line_break35=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression682);
            body36=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body36.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==131) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_unless_expression695); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);
                    }
                    pushFollow(FOLLOW_body_in_unless_expression697);
                    body38=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

            }

            string_literal39=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_unless_expression710); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:9: ( SEMI | line_break )
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
                    new NoViableAltException("344:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal716); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal719);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:2: ( LINE_BREAK )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break729); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:2: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 133:
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
            case 125:
            case 127:
            case 128:
            case 129:
            case 138:
            case 139:
            case 140:
            case 141:
                {
                alt21=2;
                }
                break;
            case 134:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("378:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_expression774); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);
                    }
                    pushFollow(FOLLOW_fitem_in_expression777);
                    fitem44=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression779);
                    fitem45=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem45.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression781);
                    andorExpression46=andorExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, andorExpression46.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_expression783);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodDefinition_return methodDefinition48 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:2: ( methodDefinition )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodDefinition_in_primaryExpression791);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:2: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,134,FOLLOW_134_in_methodDefinition799); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition803); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:26: ( singleton dot_or_colon )?
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition809);
                    singleton51=singleton();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition811);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dot_or_colon52.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_methodName_in_methodDefinition815);
            methodName53=methodName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodName53.getTree());
            if ( backtracking==0 ) {
              enterScope();
            }
            pushFollow(FOLLOW_f_arglist_in_methodDefinition819);
            f_arglist54=f_arglist();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f_arglist54.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:89: ( terminal )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition822);
            	    terminal55=terminal();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||LA25_0==STAR||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING_SIMPLE && LA25_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA25_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA25_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA25_0==LCURLY||LA25_0==LPAREN||LA25_0==LBRACK||LA25_0==COLON||LA25_0==125||(LA25_0>=127 && LA25_0<=129)||(LA25_0>=133 && LA25_0<=134)||(LA25_0>=138 && LA25_0<=141)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition828);
                    bodyStatement56=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement56.getTree());

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition832);
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
            match(input,126,FOLLOW_126_in_methodDefinition837); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:1: singleton : ( simple_variable | '(' expression opt_nl ')' );
    public final singleton_return singleton() throws RecognitionException {
        singleton_return retval = new singleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        Token char_literal63=null;
        simple_variable_return simple_variable59 = null;

        expression_return expression61 = null;

        opt_nl_return opt_nl62 = null;


        Object char_literal60_tree=null;
        Object char_literal63_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:2: ( simple_variable | '(' expression opt_nl ')' )
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
                    new NoViableAltException("384:1: singleton : ( simple_variable | '(' expression opt_nl ')' );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:4: simple_variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_variable_in_singleton848);
                    simple_variable59=simple_variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, simple_variable59.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:20: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton850); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_singleton853);
                    expression61=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton855);
                    opt_nl62=opt_nl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton857); if (failed) return retval;

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:15: ( | LINE_BREAK )
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
                    new NoViableAltException("386:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:28: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl876); if (failed) return retval;

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65=null;

        Object set65_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:2: ( DOT | COLON2 )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set66=null;

        Object set66_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:2: ( ID | CONSTANT | FID )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:2: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
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
                    new NoViableAltException("392:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist914); if (failed) return retval;
                    if ( backtracking==0 ) stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist916);
                    f_args68=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_f_args.add(f_args68.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist920); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK69);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist924); if (failed) return retval;
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
                    // 393:34: -> ^( ARG f_args )
                    {
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:37: ^( ARG f_args )
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_args_in_f_arglist943);
                    f_args71=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist945);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:8: ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
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

                    if ( (LA33_6==STAR) ) {
                        alt33=4;
                    }
                    else if ( (LA33_6==ID) ) {
                        alt33=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 1, input);

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
                    new NoViableAltException("395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args953);
                    f_norm_args73=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args73.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:24: f_norm_args ',' f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args957);
                    f_norm_args74=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args959); if (failed) return retval;
                    pushFollow(FOLLOW_f_opt_args_in_f_args962);
                    f_opt_args76=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args76.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:52: ( ',' f_rest_arg )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==COMMA) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:53: ',' f_rest_arg
                            {
                            char_literal77=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args965); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args968);
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:4: f_norm_args ',' f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args978);
                    f_norm_args79=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args79.getTree());
                    char_literal80=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args980); if (failed) return retval;
                    pushFollow(FOLLOW_f_rest_arg_in_f_args983);
                    f_rest_arg81=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg81.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_opt_args_in_f_args994);
                    f_opt_args82=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args82.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:21: ( ',' f_rest_arg )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:22: ',' f_rest_arg
                            {
                            char_literal83=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args997); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args1000);
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_rest_arg_in_f_args1007);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID86=null;

        Object ID86_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:2: ( ID )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:2: ID
            {
            root_0 = (Object)adaptor.nil();

            ID86=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args1038); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:2: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
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
                        new NoViableAltException("406:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("406:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal87=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1048); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    root_0 = (Object)adaptor.becomeRoot(char_literal87_tree, root_0);
                    }
                    ID88=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg1051); if (failed) return retval;
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:38: '*'
                    {
                    char_literal89=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1056); if (failed) return retval;
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
                    // 407:42: -> ^( '*' REST_UNUSE )
                    {
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:45: ^( '*' REST_UNUSE )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:1: f_opt_args : ID '=' arg ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:2: ( ID '=' arg )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();

            ID90=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args1072); if (failed) return retval;
            if ( backtracking==0 ) {
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);
            }
            char_literal91=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args1074); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal91_tree = (Object)adaptor.create(char_literal91);
            root_0 = (Object)adaptor.becomeRoot(char_literal91_tree, root_0);
            }
            pushFollow(FOLLOW_arg_in_f_opt_args1077);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list93 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:2: ( statement_list -> ^( BODY statement_list ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1089);
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
            // 412:19: -> ^( BODY statement_list )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:22: ^( BODY statement_list )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname94 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:7: ( fname )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem1107);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:1: fname : ( ID | CONSTANT | FID | op );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:7: ( ID | CONSTANT | FID | op )
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
            case 135:
                {
                alt35=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("416:1: fname : ( ID | CONSTANT | FID | op );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID95=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1114); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID95_tree = (Object)adaptor.create(ID95);
                    adaptor.addChild(root_0, ID95_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT96=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1116); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT96_tree = (Object)adaptor.create(CONSTANT96);
                    adaptor.addChild(root_0, CONSTANT96_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID97=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1118); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID97_tree = (Object)adaptor.create(FID97);
                    adaptor.addChild(root_0, FID97_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname1120);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set99=null;

        Object set99_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:15: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set99=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==135 ) {
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:3: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1281);
            notExpression100=notExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, notExpression100.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=136 && LA39_0<=137)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==136) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==137) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("430:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal101=(Token)input.LT(1);
            	            match(input,136,FOLLOW_136_in_andorExpression1291); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal101_tree = (Object)adaptor.create(string_literal101);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:15: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);

            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }


            	                switch (alt36) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK102=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1296); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal103=(Token)input.LT(1);
            	            match(input,137,FOLLOW_137_in_andorExpression1307); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal103_tree = (Object)adaptor.create(string_literal103);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal103_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:14: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK104=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1312); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1327);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression[true] );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:3: ( 'not' ( LINE_BREAK )* notExpression | definedExpression[true] )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==138) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=HEREDOC_STRING && LA41_0<=FLOAT)||(LA41_0>=IF_MODIFIER && LA41_0<=UNLESS_MODIFIER)||LA41_0==ID||LA41_0==STAR||(LA41_0>=BNOT && LA41_0<=REGEX)||(LA41_0>=SINGLE_QUOTE_STRING_SIMPLE && LA41_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA41_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA41_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA41_0==LCURLY||LA41_0==LPAREN||LA41_0==LBRACK||LA41_0==COLON||LA41_0==125||(LA41_0>=127 && LA41_0<=129)||(LA41_0>=139 && LA41_0<=141)) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("436:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression[true] );", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal106=(Token)input.LT(1);
                    match(input,138,FOLLOW_138_in_notExpression1345); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal106_tree = (Object)adaptor.create(string_literal106);
                    root_0 = (Object)adaptor.becomeRoot(string_literal106_tree, root_0);
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:4: ( LINE_BREAK )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==LINE_BREAK) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK107=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1352); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1360);
                    notExpression108=notExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, notExpression108.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:5: definedExpression[true]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1366);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:1: definedExpression[boolean allowsMrhsInSingleAssignment] : ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] );
    public final definedExpression_return definedExpression(boolean allowsMrhsInSingleAssignment) throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        definedExpression_return definedExpression111 = null;

        assignmentExpression_return assignmentExpression112 = null;


        Object string_literal110_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:2: ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==139) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||LA42_0==ID||LA42_0==STAR||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING_SIMPLE && LA42_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA42_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA42_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA42_0==LCURLY||LA42_0==LPAREN||LA42_0==LBRACK||LA42_0==COLON||LA42_0==125||(LA42_0>=127 && LA42_0<=129)||(LA42_0>=140 && LA42_0<=141)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("442:1: definedExpression[boolean allowsMrhsInSingleAssignment] : ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] );", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:4: ( 'defined?' ) definedExpression[false]
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:4: ( 'defined?' )
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:5: 'defined?'
                    {
                    string_literal110=(Token)input.LT(1);
                    match(input,139,FOLLOW_139_in_definedExpression1382); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal110_tree = (Object)adaptor.create(string_literal110);
                    root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
                    }

                    }

                    pushFollow(FOLLOW_definedExpression_in_definedExpression1386);
                    definedExpression111=definedExpression(false);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression111.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:10: assignmentExpression[allowsMrhsInSingleAssignment]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1398);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:2: ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression )
            int alt43=4;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==ASSIGN) && (true)) {
                    int LA43_4 = input.LA(3);

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
                            new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA43_1==EOF||(LA43_1>=LEFT_SHIFT && LA43_1<=FLOAT)||(LA43_1>=DIV && LA43_1<=MOD)||(LA43_1>=IF_MODIFIER && LA43_1<=LINE_BREAK)||LA43_1==DOT||(LA43_1>=ID && LA43_1<=POWER)||(LA43_1>=QUESTION && LA43_1<=REGEX)||(LA43_1>=SINGLE_QUOTE_STRING_SIMPLE && LA43_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA43_1>=LCURLY && LA43_1<=RCURLY)||LA43_1==ASSOC||(LA43_1>=LPAREN && LA43_1<=RBRACK)||LA43_1==COLON||(LA43_1>=125 && LA43_1<=132)||(LA43_1>=136 && LA43_1<=137)||(LA43_1>=139 && LA43_1<=142)) ) {
                    alt43=4;
                }
                else if ( ((LA43_1>=MOD_ASSIGN && LA43_1<=POWER_ASSIGN)) && (synpred1())) {
                    alt43=2;
                }
                else if ( (LA43_1==COMMA) ) {
                    switch ( input.LA(3) ) {
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
                                    new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 10, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA43_8>=HEREDOC_STRING && LA43_8<=FLOAT)||(LA43_8>=IF_MODIFIER && LA43_8<=UNLESS_MODIFIER)||(LA43_8>=SEMI && LA43_8<=LINE_BREAK)||LA43_8==STAR||(LA43_8>=BNOT && LA43_8<=REGEX)||(LA43_8>=SINGLE_QUOTE_STRING_SIMPLE && LA43_8<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_8>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_8<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_8==LCURLY||(LA43_8>=LPAREN && LA43_8<=LBRACK)||LA43_8==COLON||LA43_8==125||(LA43_8>=127 && LA43_8<=129)||(LA43_8>=139 && LA43_8<=141)) ) {
                            alt43=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ID:
                        {
                        int LA43_9 = input.LA(4);

                        if ( (synpred2()) ) {
                            alt43=3;
                        }
                        else if ( (true) ) {
                            alt43=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 9, input);

                            throw nvae;
                        }
                        }
                        break;
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
                    case 125:
                    case 127:
                    case 128:
                    case 129:
                    case 139:
                    case 140:
                    case 141:
                        {
                        alt43=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 6, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==STAR) && (synpred2())) {
                alt43=3;
            }
            else if ( ((LA43_0>=HEREDOC_STRING && LA43_0<=FLOAT)||(LA43_0>=IF_MODIFIER && LA43_0<=UNLESS_MODIFIER)||(LA43_0>=BNOT && LA43_0<=REGEX)||(LA43_0>=SINGLE_QUOTE_STRING_SIMPLE && LA43_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_0==LCURLY||LA43_0==LPAREN||LA43_0==LBRACK||LA43_0==COLON||LA43_0==125||(LA43_0>=127 && LA43_0<=129)||(LA43_0>=140 && LA43_0<=141)) ) {
                alt43=4;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:4: {...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment]
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentExpression", "true");
                    }
                    pushFollow(FOLLOW_lhs_in_assignmentExpression1419);
                    lhs113=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs113.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(lhs113.start,lhs113.stop));
                    }
                    ASSIGN114=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1423); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN114_tree = (Object)adaptor.create(ASSIGN114);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN114_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1426);
                    mrhs115=mrhs(allowsMrhsInSingleAssignment);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs115.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:90: ( simple_assignment_expression )=> simple_assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_assignment_expression_in_assignmentExpression1436);
                    simple_assignment_expression116=simple_assignment_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression116.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:154: ( mlhs )=> mlhs ASSIGN mrhs[true]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mlhs_in_assignmentExpression1446);
                    mlhs117=mlhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mlhs117.getTree());
                    ASSIGN118=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1448); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN118_tree = (Object)adaptor.create(ASSIGN118);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN118_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1451);
                    mrhs119=mrhs(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs119.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:191: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1457);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:1: simple_assignment_expression : lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false] ;
    public final simple_assignment_expression_return simple_assignment_expression() throws RecognitionException {
        simple_assignment_expression_return retval = new simple_assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set122=null;
        lhs_return lhs121 = null;

        definedExpression_return definedExpression123 = null;


        Object set122_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:2: ( lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false] )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:4: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lhs_in_simple_assignment_expression1491);
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_simple_assignment_expression1493);    throw mse;
            }

            pushFollow(FOLLOW_definedExpression_in_simple_assignment_expression1538);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:9: (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs )
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
                    new NoViableAltException("462:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:16: t0= lhs ( ',' t= lhs )* ( ',' star_lhs )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_mlhs1561);
                    t0=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, t0.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(t0.start,t0.stop));
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:48: ( ',' t= lhs )*
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:49: ',' t= lhs
                    	    {
                    	    char_literal124=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_mlhs1566); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal124_tree = (Object)adaptor.create(char_literal124);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal124_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_lhs_in_mlhs1571);
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

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:86: ( ',' star_lhs )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMMA) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:87: ',' star_lhs
                            {
                            char_literal125=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_mlhs1578); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal125_tree = (Object)adaptor.create(char_literal125);
                            root_0 = (Object)adaptor.becomeRoot(char_literal125_tree, root_0);
                            }
                            pushFollow(FOLLOW_star_lhs_in_mlhs1581);
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:104: star_lhs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_star_lhs_in_mlhs1586);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:1: star_lhs : STAR lhs -> ^( STAR_ID lhs ) ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:2: ( STAR lhs -> ^( STAR_ID lhs ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:9: STAR lhs
            {
            STAR128=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_lhs1602); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR128);

            pushFollow(FOLLOW_lhs_in_star_lhs1604);
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
            // 465:18: -> ^( STAR_ID lhs )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:21: ^( STAR_ID lhs )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:1: mrhs[boolean reallyMrhs] : ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:29: ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=HEREDOC_STRING && LA52_0<=FLOAT)||(LA52_0>=IF_MODIFIER && LA52_0<=UNLESS_MODIFIER)||LA52_0==ID||(LA52_0>=BNOT && LA52_0<=REGEX)||(LA52_0>=SINGLE_QUOTE_STRING_SIMPLE && LA52_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA52_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA52_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA52_0==LCURLY||LA52_0==LPAREN||LA52_0==LBRACK||LA52_0==COLON||LA52_0==125||(LA52_0>=127 && LA52_0<=129)||(LA52_0>=140 && LA52_0<=141)) ) {
                alt52=1;
            }
            else if ( (LA52_0==STAR) && (reallyMrhs)) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("470:1: mrhs[boolean reallyMrhs] : ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs );", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:36: ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:36: ( simple_assignment_expression | ternaryIfThenElseExpression )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( ((LA47_1>=ASSIGN && LA47_1<=POWER_ASSIGN)) ) {
                            alt47=1;
                        }
                        else if ( (LA47_1==EOF||(LA47_1>=LEFT_SHIFT && LA47_1<=FLOAT)||(LA47_1>=DIV && LA47_1<=MOD)||(LA47_1>=IF_MODIFIER && LA47_1<=LINE_BREAK)||LA47_1==DOT||(LA47_1>=ID && LA47_1<=POWER)||(LA47_1>=QUESTION && LA47_1<=REGEX)||(LA47_1>=SINGLE_QUOTE_STRING_SIMPLE && LA47_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA47_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA47_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA47_1>=LCURLY && LA47_1<=RCURLY)||LA47_1==ASSOC||(LA47_1>=LPAREN && LA47_1<=RBRACK)||(LA47_1>=COMMA && LA47_1<=COLON)||(LA47_1>=125 && LA47_1<=132)||(LA47_1>=136 && LA47_1<=137)||(LA47_1>=139 && LA47_1<=142)) ) {
                            alt47=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:36: ( simple_assignment_expression | ternaryIfThenElseExpression )", 47, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA47_0>=HEREDOC_STRING && LA47_0<=FLOAT)||(LA47_0>=IF_MODIFIER && LA47_0<=UNLESS_MODIFIER)||(LA47_0>=BNOT && LA47_0<=REGEX)||(LA47_0>=SINGLE_QUOTE_STRING_SIMPLE && LA47_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA47_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA47_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA47_0==LCURLY||LA47_0==LPAREN||LA47_0==LBRACK||LA47_0==COLON||LA47_0==125||(LA47_0>=127 && LA47_0<=129)||(LA47_0>=140 && LA47_0<=141)) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("470:36: ( simple_assignment_expression | ternaryIfThenElseExpression )", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:37: simple_assignment_expression
                            {
                            pushFollow(FOLLOW_simple_assignment_expression_in_mrhs1634);
                            simple_assignment_expression130=simple_assignment_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression130.getTree());

                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:66: ternaryIfThenElseExpression
                            {
                            pushFollow(FOLLOW_ternaryIfThenElseExpression_in_mrhs1636);
                            ternaryIfThenElseExpression131=ternaryIfThenElseExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression131.getTree());

                            }
                            break;

                    }

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )
                    int alt51=2;
                    switch ( input.LA(1) ) {
                    case 136:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 137:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 2, input);

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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 3, input);

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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 4, input);

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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 5, input);

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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 126:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 130:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 131:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RCURLY:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COLON:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 132:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COMMA:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case POWER:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 15, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STAR:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DIV:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 17, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MOD:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 18, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 19, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 20, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LEFT_SHIFT:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RIGHT_SHIFT:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BAND:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BXOR:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BOR:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LESS_THAN:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 26, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GREATER_THAN:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 27, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LESS_OR_EQUAL:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 28, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GREATER_OR_EQUAL:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COMPARE:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 30, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EQUAL:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 31, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASE_EQUAL:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 32, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT_EQUAL:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 33, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MATCH:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 34, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT_MATCH:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LOGICAL_AND:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LOGICAL_OR:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    case INCLUSIVE_RANGE:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EXCLUSIVE_RANGE:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case QUESTION:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RBRACK:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DOT:
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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 42, input);

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
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 51, 0, input);

                        throw nvae;
                    }

                    switch (alt51) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:96: 
                            {
                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:97: {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )?
                            {
                            if ( !(reallyMrhs) ) {
                                if (backtracking>0) {failed=true; return retval;}
                                throw new FailedPredicateException(input, "mrhs", "reallyMrhs");
                            }
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:114: ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==COMMA) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:115: ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )
                            	    {
                            	    char_literal132=(Token)input.LT(1);
                            	    match(input,COMMA,FOLLOW_COMMA_in_mrhs1646); if (failed) return retval;
                            	    if ( backtracking==0 ) {
                            	    char_literal132_tree = (Object)adaptor.create(char_literal132);
                            	    root_0 = (Object)adaptor.becomeRoot(char_literal132_tree, root_0);
                            	    }
                            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )
                            	    int alt48=2;
                            	    int LA48_0 = input.LA(1);

                            	    if ( (LA48_0==ID) ) {
                            	        int LA48_1 = input.LA(2);

                            	        if ( (LA48_1==EOF||(LA48_1>=LEFT_SHIFT && LA48_1<=FLOAT)||(LA48_1>=DIV && LA48_1<=MOD)||(LA48_1>=IF_MODIFIER && LA48_1<=LINE_BREAK)||LA48_1==DOT||(LA48_1>=ID && LA48_1<=POWER)||(LA48_1>=QUESTION && LA48_1<=REGEX)||(LA48_1>=SINGLE_QUOTE_STRING_SIMPLE && LA48_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA48_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA48_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA48_1>=LCURLY && LA48_1<=RCURLY)||LA48_1==ASSOC||(LA48_1>=LPAREN && LA48_1<=RBRACK)||(LA48_1>=COMMA && LA48_1<=COLON)||(LA48_1>=125 && LA48_1<=132)||(LA48_1>=136 && LA48_1<=137)||(LA48_1>=139 && LA48_1<=142)) ) {
                            	            alt48=2;
                            	        }
                            	        else if ( ((LA48_1>=ASSIGN && LA48_1<=POWER_ASSIGN)) && (synpred3())) {
                            	            alt48=1;
                            	        }
                            	        else {
                            	            if (backtracking>0) {failed=true; return retval;}
                            	            NoViableAltException nvae =
                            	                new NoViableAltException("470:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )", 48, 1, input);

                            	            throw nvae;
                            	        }
                            	    }
                            	    else if ( ((LA48_0>=HEREDOC_STRING && LA48_0<=FLOAT)||(LA48_0>=IF_MODIFIER && LA48_0<=UNLESS_MODIFIER)||(LA48_0>=BNOT && LA48_0<=REGEX)||(LA48_0>=SINGLE_QUOTE_STRING_SIMPLE && LA48_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA48_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA48_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA48_0==LCURLY||LA48_0==LPAREN||LA48_0==LBRACK||LA48_0==COLON||LA48_0==125||(LA48_0>=127 && LA48_0<=129)||(LA48_0>=140 && LA48_0<=141)) ) {
                            	        alt48=2;
                            	    }
                            	    else {
                            	        if (backtracking>0) {failed=true; return retval;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("470:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )", 48, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt48) {
                            	        case 1 :
                            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:121: ( simple_assignment_expression )=> simple_assignment_expression
                            	            {
                            	            pushFollow(FOLLOW_simple_assignment_expression_in_mrhs1656);
                            	            simple_assignment_expression133=simple_assignment_expression();
                            	            _fsp--;
                            	            if (failed) return retval;
                            	            if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression133.getTree());

                            	            }
                            	            break;
                            	        case 2 :
                            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:184: ternaryIfThenElseExpression
                            	            {
                            	            pushFollow(FOLLOW_ternaryIfThenElseExpression_in_mrhs1658);
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

                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:215: ( ',' star_rhs )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==COMMA) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:216: ',' star_rhs
                                    {
                                    char_literal135=(Token)input.LT(1);
                                    match(input,COMMA,FOLLOW_COMMA_in_mrhs1664); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal135_tree = (Object)adaptor.create(char_literal135);
                                    root_0 = (Object)adaptor.becomeRoot(char_literal135_tree, root_0);
                                    }
                                    pushFollow(FOLLOW_star_rhs_in_mrhs1667);
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:471:15: {...}? => star_rhs
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !(reallyMrhs) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "mrhs", "reallyMrhs");
                    }
                    pushFollow(FOLLOW_star_rhs_in_mrhs1691);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:1: star_rhs : STAR definedExpression[false] -> ^( STAR_ID definedExpression ) ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:10: ( STAR definedExpression[false] -> ^( STAR_ID definedExpression ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:16: STAR definedExpression[false]
            {
            STAR138=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_rhs1705); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR138);

            pushFollow(FOLLOW_definedExpression_in_star_rhs1707);
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
            // 474:46: -> ^( STAR_ID definedExpression )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:49: ^( STAR_ID definedExpression )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:3: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1731);
            r=rangeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==QUESTION) ) {
                alt53=1;
            }
            else if ( (LA53_0==EOF||LA53_0==LEFT_SHIFT||(LA53_0>=DIV && LA53_0<=MOD)||(LA53_0>=IF_MODIFIER && LA53_0<=LINE_BREAK)||LA53_0==DOT||(LA53_0>=COMPARE && LA53_0<=POWER)||(LA53_0>=INCLUSIVE_RANGE && LA53_0<=BAND)||LA53_0==RCURLY||LA53_0==ASSOC||LA53_0==RPAREN||LA53_0==RBRACK||(LA53_0>=COMMA && LA53_0<=COLON)||LA53_0==126||(LA53_0>=130 && LA53_0<=132)||(LA53_0>=136 && LA53_0<=137)) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("480:23: ( QUESTION rangeExpression ':' rangeExpression | )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION140=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1735); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION140_tree = (Object)adaptor.create(QUESTION140);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION140_tree, root_0);
                    }
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1738);
                    rangeExpression141=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression141.getTree());
                    char_literal142=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1740); if (failed) return retval;
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1743);
                    rangeExpression143=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression143.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:73: 
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:3: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1760);
            logicalOrExpression144=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression144.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
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
            	            new NoViableAltException("487:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 56, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE145=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1779); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            INCLUSIVE_RANGE145_tree = (Object)adaptor.create(INCLUSIVE_RANGE145);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE145_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:24: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);

            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }


            	                switch (alt54) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK146=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1783); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE147=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1794); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EXCLUSIVE_RANGE147_tree = (Object)adaptor.create(EXCLUSIVE_RANGE147);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE147_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:24: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK148=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1798); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1813);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:3: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1833);
            logicalAndExpression150=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression150.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==LOGICAL_OR) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR151=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1865); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_OR151_tree = (Object)adaptor.create(LOGICAL_OR151);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR151_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:18: ( LINE_BREAK )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==LINE_BREAK) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK152=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1870); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1879);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:504:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:3: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1899);
            equalityExpression154=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression154.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==LOGICAL_AND) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND155=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1931); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_AND155_tree = (Object)adaptor.create(LOGICAL_AND155);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND155_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:19: ( LINE_BREAK )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==LINE_BREAK) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK156=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1936); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop60;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1945);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:3: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1965);
            relationalExpression158=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression158.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
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
            	            new NoViableAltException("516:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 68, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt68) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE159=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1999); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            COMPARE159_tree = (Object)adaptor.create(COMPARE159);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE159_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:17: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK160=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2004); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL161=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression2015); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQUAL161_tree = (Object)adaptor.create(EQUAL161);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL161_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:16: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK162=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2021); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL163=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression2032); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            CASE_EQUAL163_tree = (Object)adaptor.create(CASE_EQUAL163);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL163_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:19: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);

            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }


            	                switch (alt64) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK164=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2036); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL165=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression2047); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_EQUAL165_tree = (Object)adaptor.create(NOT_EQUAL165);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL165_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:19: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);

            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }


            	                switch (alt65) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK166=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2052); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH167=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression2063); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MATCH167_tree = (Object)adaptor.create(MATCH167);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH167_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:16: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);

            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }


            	                switch (alt66) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK168=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2069); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH169=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression2080); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_MATCH169_tree = (Object)adaptor.create(NOT_MATCH169);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH169_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:19: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);

            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }


            	                switch (alt67) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK170=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2085); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2100);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:3: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression2121);
            orExpression172=orExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpression172.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
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
            	            new NoViableAltException("532:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 74, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt74) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN173=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression2155); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_THAN173_tree = (Object)adaptor.create(LESS_THAN173);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN173_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:20: ( LINE_BREAK )*
            	            loop70:
            	            do {
            	                int alt70=2;
            	                int LA70_0 = input.LA(1);

            	                if ( (LA70_0==LINE_BREAK) ) {
            	                    alt70=1;
            	                }


            	                switch (alt70) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK174=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2161); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop70;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN175=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression2172); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_THAN175_tree = (Object)adaptor.create(GREATER_THAN175);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN175_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:22: ( LINE_BREAK )*
            	            loop71:
            	            do {
            	                int alt71=2;
            	                int LA71_0 = input.LA(1);

            	                if ( (LA71_0==LINE_BREAK) ) {
            	                    alt71=1;
            	                }


            	                switch (alt71) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK176=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2177); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop71;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL177=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression2188); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_OR_EQUAL177_tree = (Object)adaptor.create(LESS_OR_EQUAL177);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL177_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:23: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK178=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2193); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL179=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2204); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_OR_EQUAL179_tree = (Object)adaptor.create(GREATER_OR_EQUAL179);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL179_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:25: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);

            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }


            	                switch (alt73) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK180=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2208); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression2223);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:3: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2243);
            andExpression182=andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpression182.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
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
            	            new NoViableAltException("545:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR183=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression2277); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BXOR183_tree = (Object)adaptor.create(BXOR183);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR183_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:15: ( LINE_BREAK )*
            	            loop76:
            	            do {
            	                int alt76=2;
            	                int LA76_0 = input.LA(1);

            	                if ( (LA76_0==LINE_BREAK) ) {
            	                    alt76=1;
            	                }


            	                switch (alt76) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK184=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2283); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop76;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR185=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression2294); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BOR185_tree = (Object)adaptor.create(BOR185);
            	            root_0 = (Object)adaptor.becomeRoot(BOR185_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:14: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);

            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }


            	                switch (alt77) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK186=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2300); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2315);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:3: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression2335);
            shiftExpression188=shiftExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression188.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==BAND) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND189=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2367); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BAND189_tree = (Object)adaptor.create(BAND189);
            	    root_0 = (Object)adaptor.becomeRoot(BAND189_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:13: ( LINE_BREAK )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==LINE_BREAK) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK190=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2373); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2382);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:3: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2404);
            additiveExpression192=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression192.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
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
            	            new NoViableAltException("567:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 84, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT193=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2438); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LEFT_SHIFT193_tree = (Object)adaptor.create(LEFT_SHIFT193);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT193_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:20: ( LINE_BREAK )*
            	            loop82:
            	            do {
            	                int alt82=2;
            	                int LA82_0 = input.LA(1);

            	                if ( (LA82_0==LINE_BREAK) ) {
            	                    alt82=1;
            	                }


            	                switch (alt82) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK194=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2443); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop82;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT195=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2454); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            RIGHT_SHIFT195_tree = (Object)adaptor.create(RIGHT_SHIFT195);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT195_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:20: ( LINE_BREAK )*
            	            loop83:
            	            do {
            	                int alt83=2;
            	                int LA83_0 = input.LA(1);

            	                if ( (LA83_0==LINE_BREAK) ) {
            	                    alt83=1;
            	                }


            	                switch (alt83) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK196=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2458); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop83;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2473);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:577:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:3: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2495);
            multiplicativeExpression198=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression198.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
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
            	            new NoViableAltException("580:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 88, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS199=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2529); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS199_tree = (Object)adaptor.create(PLUS199);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS199_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:16: ( LINE_BREAK )*
            	            loop86:
            	            do {
            	                int alt86=2;
            	                int LA86_0 = input.LA(1);

            	                if ( (LA86_0==LINE_BREAK) ) {
            	                    alt86=1;
            	                }


            	                switch (alt86) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK200=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2536); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop86;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS201=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2547); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS201_tree = (Object)adaptor.create(MINUS201);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS201_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:17: ( LINE_BREAK )*
            	            loop87:
            	            do {
            	                int alt87=2;
            	                int LA87_0 = input.LA(1);

            	                if ( (LA87_0==LINE_BREAK) ) {
            	                    alt87=1;
            	                }


            	                switch (alt87) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK202=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2554); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop87;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2569);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:3: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2589);
            powerExpression204=powerExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression204.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
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
            	            new NoViableAltException("591:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 93, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt93) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR205=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2623); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            STAR205_tree = (Object)adaptor.create(STAR205);
            	            root_0 = (Object)adaptor.becomeRoot(STAR205_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:15: ( LINE_BREAK )*
            	            loop90:
            	            do {
            	                int alt90=2;
            	                int LA90_0 = input.LA(1);

            	                if ( (LA90_0==LINE_BREAK) ) {
            	                    alt90=1;
            	                }


            	                switch (alt90) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK206=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2629); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop90;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV207=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2640); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV207_tree = (Object)adaptor.create(DIV207);
            	            root_0 = (Object)adaptor.becomeRoot(DIV207_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:14: ( LINE_BREAK )*
            	            loop91:
            	            do {
            	                int alt91=2;
            	                int LA91_0 = input.LA(1);

            	                if ( (LA91_0==LINE_BREAK) ) {
            	                    alt91=1;
            	                }


            	                switch (alt91) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK208=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2646); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop91;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD209=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2657); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD209_tree = (Object)adaptor.create(MOD209);
            	            root_0 = (Object)adaptor.becomeRoot(MOD209_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:14: ( LINE_BREAK )*
            	            loop92:
            	            do {
            	                int alt92=2;
            	                int LA92_0 = input.LA(1);

            	                if ( (LA92_0==LINE_BREAK) ) {
            	                    alt92=1;
            	                }


            	                switch (alt92) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK210=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2663); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop92;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2678);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:3: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2699);
            bnotExpression212=bnotExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression212.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==POWER) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER213=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2734); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    POWER213_tree = (Object)adaptor.create(POWER213);
            	    root_0 = (Object)adaptor.becomeRoot(POWER213_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:14: ( LINE_BREAK )*
            	    loop95:
            	    do {
            	        int alt95=2;
            	        int LA95_0 = input.LA(1);

            	        if ( (LA95_0==LINE_BREAK) ) {
            	            alt95=1;
            	        }


            	        switch (alt95) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK214=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2740); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop95;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2749);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:3: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT216=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2771); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BNOT216_tree = (Object)adaptor.create(BNOT216);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT216_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:15: ( LINE_BREAK )*
            	    loop97:
            	    do {
            	        int alt97=2;
            	        int LA97_0 = input.LA(1);

            	        if ( (LA97_0==LINE_BREAK) ) {
            	            alt97=1;
            	        }


            	        switch (alt97) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK217=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2777); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop97;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT218=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2787); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT218_tree = (Object)adaptor.create(NOT218);
            	    root_0 = (Object)adaptor.becomeRoot(NOT218_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:13: ( LINE_BREAK )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==LINE_BREAK) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK219=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2793); if (failed) return retval;

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

            pushFollow(FOLLOW_command_in_bnotExpression2807);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* ;
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:2: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )
            int alt100=9;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt100=1;
                }
                break;
            case 141:
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
                        new NoViableAltException("620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 100, 6, input);

                    throw nvae;
                }

                }
                break;
            case 127:
            case 128:
            case 129:
                {
                alt100=4;
                }
                break;
            case 125:
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
                    new NoViableAltException("620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' expression ')' )", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:4: 'expression0'
                    {
                    string_literal221=(Token)input.LT(1);
                    match(input,140,FOLLOW_140_in_command2826); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal221_tree = (Object)adaptor.create(string_literal221);
                    adaptor.addChild(root_0, string_literal221_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:20: 'expression1'
                    {
                    string_literal222=(Token)input.LT(1);
                    match(input,141,FOLLOW_141_in_command2830); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal222_tree = (Object)adaptor.create(string_literal222);
                    adaptor.addChild(root_0, string_literal222_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2833);
                    literal223=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal223.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2835);
                    boolean_expression224=boolean_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression224.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2838);
                    block_expression225=block_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_expression225.getTree());

                    }
                    break;
                case 6 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2840);
                    if_expression226=if_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, if_expression226.getTree());

                    }
                    break;
                case 7 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2842);
                    unless_expression227=unless_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unless_expression227.getTree());

                    }
                    break;
                case 8 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2844);
                    atom228=atom(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atom228.getTree());

                    }
                    break;
                case 9 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:125: '(' expression ')'
                    {
                    char_literal229=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_command2849); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal229_tree = (Object)adaptor.create(char_literal229);
                    adaptor.addChild(root_0, char_literal229_tree);
                    }
                    pushFollow(FOLLOW_expression_in_command2851);
                    expression230=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression230.getTree());
                    char_literal231=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_command2853); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal231_tree = (Object)adaptor.create(char_literal231);
                    adaptor.addChild(root_0, char_literal231_tree);
                    }

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:146: ( DOT method[false] )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==DOT) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:147: DOT method[false]
            	    {
            	    DOT232=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2858); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    DOT232_tree = (Object)adaptor.create(DOT232);
            	    root_0 = (Object)adaptor.becomeRoot(DOT232_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_method_in_command2861);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:1: atom[boolean topLevel] : ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] );
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:24: ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] )
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
                    new NoViableAltException("623:1: atom[boolean topLevel] : ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:58: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_atom2881);
                    array234=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, array234.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:64: hash
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hash_in_atom2883);
                    hash235=hash();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, hash235.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:69: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_single_quote_string_in_atom2885);
                    single_quote_string236=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string236.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:89: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_double_quote_string_in_atom2887);
                    double_quote_string237=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string237.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:109: symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbol_in_atom2889);
                    symbol238=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol238.getTree());

                    }
                    break;
                case 6 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:118: methodExpression[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodExpression_in_atom2893);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:1: methodExpression[boolean topLevel] : method[topLevel] ;
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        method_return method240 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:2: ( method[topLevel] )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:9: method[topLevel]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_method_in_methodExpression2909);
            method240=method(topLevel);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, method240.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:1: variable : {...}? ( simple_variable ( '[' array_items ']' )* ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal242=null;
        Token char_literal244=null;
        simple_variable_return simple_variable241 = null;

        array_items_return array_items243 = null;


        Object char_literal242_tree=null;
        Object char_literal244_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:9: ({...}? ( simple_variable ( '[' array_items ']' )* ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:11: {...}? ( simple_variable ( '[' array_items ']' )* )
            {
            root_0 = (Object)adaptor.nil();

            if ( !(isDefinedVar(tokenStream.LT(1).getText())) ) {
                if (backtracking>0) {failed=true; return retval;}
                throw new FailedPredicateException(input, "variable", "isDefinedVar(tokenStream.LT(1).getText())");
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:56: ( simple_variable ( '[' array_items ']' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:57: simple_variable ( '[' array_items ']' )*
            {
            pushFollow(FOLLOW_simple_variable_in_variable2919);
            simple_variable241=simple_variable();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(simple_variable241.getTree(), root_0);
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:74: ( '[' array_items ']' )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==LBRACK) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:75: '[' array_items ']'
            	    {
            	    char_literal242=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_variable2923); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal242_tree = (Object)adaptor.create(char_literal242);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal242_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_array_items_in_variable2926);
            	    array_items243=array_items();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, array_items243.getTree());
            	    char_literal244=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_variable2928); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal244_tree = (Object)adaptor.create(char_literal244);
            	    adaptor.addChild(root_0, char_literal244_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop103;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:1: simple_variable : ID -> ^( VARIABLE ID ) ;
    public final simple_variable_return simple_variable() throws RecognitionException {
        simple_variable_return retval = new simple_variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID245=null;

        Object ID245_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:2: ( ID -> ^( VARIABLE ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:4: ID
            {
            ID245=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_simple_variable2940); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID245);


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
            // 629:7: -> ^( VARIABLE ID )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:10: ^( VARIABLE ID )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:1: method[boolean topLevel] : ( ( ID ( block )? )=> ID ( block )? -> ^( VARIABLE_OR_METHOD ID ( block )? ) | ID open_args_with_block -> ^( CALL ID open_args_with_block ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID246=null;
        Token ID248=null;
        block_return block247 = null;

        open_args_with_block_return open_args_with_block249 = null;


        Object ID246_tree=null;
        Object ID248_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args_with_block=new RewriteRuleSubtreeStream(adaptor,"rule open_args_with_block");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:26: ( ( ID ( block )? )=> ID ( block )? -> ^( VARIABLE_OR_METHOD ID ( block )? ) | ID open_args_with_block -> ^( CALL ID open_args_with_block ) )
            int alt105=2;
            alt105 = dfa105.predict(input);
            switch (alt105) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:78: ( ID ( block )? )=> ID ( block )?
                    {
                    ID246=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2970); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID246);

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:96: ( block )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==LCURLY||LA104_0==142) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:96: block
                            {
                            pushFollow(FOLLOW_block_in_method2972);
                            block247=block();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_block.add(block247.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ID, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 632:138: -> ^( VARIABLE_OR_METHOD ID ( block )? )
                    {
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:141: ^( VARIABLE_OR_METHOD ID ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARIABLE_OR_METHOD, "VARIABLE_OR_METHOD"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:165: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.next());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:17: ID open_args_with_block
                    {
                    ID248=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method3006); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID248);

                    pushFollow(FOLLOW_open_args_with_block_in_method3008);
                    open_args_with_block249=open_args_with_block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_open_args_with_block.add(open_args_with_block249.getTree());

                    // AST REWRITE
                    // elements: open_args_with_block, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 634:43: -> ^( CALL ID open_args_with_block )
                    {
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:46: ^( CALL ID open_args_with_block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        adaptor.addChild(root_1, stream_open_args_with_block.next());

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

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:1: block : ( 'do' block_content 'end' | '{' block_content '}' );
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal250=null;
        Token string_literal252=null;
        Token char_literal253=null;
        Token char_literal255=null;
        block_content_return block_content251 = null;

        block_content_return block_content254 = null;


        Object string_literal250_tree=null;
        Object string_literal252_tree=null;
        Object char_literal253_tree=null;
        Object char_literal255_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:7: ( 'do' block_content 'end' | '{' block_content '}' )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==142) ) {
                alt106=1;
            }
            else if ( (LA106_0==LCURLY) ) {
                alt106=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("636:1: block : ( 'do' block_content 'end' | '{' block_content '}' );", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:9: 'do' block_content 'end'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal250=(Token)input.LT(1);
                    match(input,142,FOLLOW_142_in_block3036); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal250_tree = (Object)adaptor.create(string_literal250);
                    adaptor.addChild(root_0, string_literal250_tree);
                    }
                    if ( backtracking==0 ) {
                      enterScope();
                    }
                    pushFollow(FOLLOW_block_content_in_block3041);
                    block_content251=block_content();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_content251.getTree());
                    string_literal252=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_block3043); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal252_tree = (Object)adaptor.create(string_literal252);
                    adaptor.addChild(root_0, string_literal252_tree);
                    }
                    if ( backtracking==0 ) {
                      leaveScope();
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:4: '{' block_content '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal253=(Token)input.LT(1);
                    match(input,LCURLY,FOLLOW_LCURLY_in_block3050); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal253_tree = (Object)adaptor.create(char_literal253);
                    adaptor.addChild(root_0, char_literal253_tree);
                    }
                    if ( backtracking==0 ) {
                      enterScope();
                    }
                    pushFollow(FOLLOW_block_content_in_block3055);
                    block_content254=block_content();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_content254.getTree());
                    char_literal255=(Token)input.LT(1);
                    match(input,RCURLY,FOLLOW_RCURLY_in_block3057); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal255_tree = (Object)adaptor.create(char_literal255);
                    adaptor.addChild(root_0, char_literal255_tree);
                    }
                    if ( backtracking==0 ) {
                      leaveScope();
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
    // $ANTLR end block

    public static class block_content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block_content
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:1: block_content : ( '|' block_param '|' )? block_body ;
    public final block_content_return block_content() throws RecognitionException {
        block_content_return retval = new block_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal256=null;
        Token char_literal258=null;
        block_param_return block_param257 = null;

        block_body_return block_body259 = null;


        Object char_literal256_tree=null;
        Object char_literal258_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:2: ( ( '|' block_param '|' )? block_body )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:4: ( '|' block_param '|' )? block_body
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:4: ( '|' block_param '|' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==BOR) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:5: '|' block_param '|'
                    {
                    char_literal256=(Token)input.LT(1);
                    match(input,BOR,FOLLOW_BOR_in_block_content3068); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal256_tree = (Object)adaptor.create(char_literal256);
                    adaptor.addChild(root_0, char_literal256_tree);
                    }
                    pushFollow(FOLLOW_block_param_in_block_content3070);
                    block_param257=block_param();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_param257.getTree());
                    char_literal258=(Token)input.LT(1);
                    match(input,BOR,FOLLOW_BOR_in_block_content3072); if (failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_block_body_in_block_content3077);
            block_body259=block_body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, block_body259.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block_content

    public static class block_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block_param
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:640:1: block_param : ID ( ',' ID )* ;
    public final block_param_return block_param() throws RecognitionException {
        block_param_return retval = new block_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID260=null;
        Token char_literal261=null;
        Token ID262=null;

        Object ID260_tree=null;
        Object char_literal261_tree=null;
        Object ID262_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:2: ( ID ( ',' ID )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:4: ID ( ',' ID )*
            {
            root_0 = (Object)adaptor.nil();

            ID260=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_block_param3085); if (failed) return retval;
            if ( backtracking==0 ) {
            ID260_tree = (Object)adaptor.create(ID260);
            adaptor.addChild(root_0, ID260_tree);
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:7: ( ',' ID )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==COMMA) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:8: ',' ID
            	    {
            	    char_literal261=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_block_param3088); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal261_tree = (Object)adaptor.create(char_literal261);
            	    adaptor.addChild(root_0, char_literal261_tree);
            	    }
            	    ID262=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_block_param3090); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    ID262_tree = (Object)adaptor.create(ID262);
            	    adaptor.addChild(root_0, ID262_tree);
            	    }

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
    // $ANTLR end block_param

    public static class block_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block_body
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:642:1: block_body : ( bodyStatement )? ;
    public final block_body_return block_body() throws RecognitionException {
        block_body_return retval = new block_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        bodyStatement_return bodyStatement263 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:2: ( ( bodyStatement )? )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:4: ( bodyStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:4: ( bodyStatement )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=HEREDOC_STRING && LA109_0<=FLOAT)||(LA109_0>=IF_MODIFIER && LA109_0<=UNLESS_MODIFIER)||LA109_0==ID||LA109_0==STAR||(LA109_0>=BNOT && LA109_0<=REGEX)||(LA109_0>=SINGLE_QUOTE_STRING_SIMPLE && LA109_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA109_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA109_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA109_0==LCURLY||LA109_0==LPAREN||LA109_0==LBRACK||LA109_0==COLON||LA109_0==125||(LA109_0>=127 && LA109_0<=129)||(LA109_0>=133 && LA109_0<=134)||(LA109_0>=138 && LA109_0<=141)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:4: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_block_body3102);
                    bodyStatement263=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement263.getTree());

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
    // $ANTLR end block_body

    public static class open_args_with_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start open_args_with_block
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:1: open_args_with_block options {backtrack=true; } : ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args );
    public final open_args_with_block_return open_args_with_block() throws RecognitionException {
        open_args_with_block_return retval = new open_args_with_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal264=null;
        Token char_literal266=null;
        Token char_literal268=null;
        Token char_literal269=null;
        call_args_return call_args265 = null;

        block_return block267 = null;

        block_return block270 = null;

        call_args_return call_args271 = null;


        Object char_literal264_tree=null;
        Object char_literal266_tree=null;
        Object char_literal268_tree=null;
        Object char_literal269_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:2: ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args )
            int alt112=3;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==LPAREN) ) {
                int LA112_1 = input.LA(2);

                if ( (synpred5()) ) {
                    alt112=1;
                }
                else if ( (synpred6()) ) {
                    alt112=2;
                }
                else if ( (true) ) {
                    alt112=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("657:1: open_args_with_block options {backtrack=true; } : ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args );", 112, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA112_0>=HEREDOC_STRING && LA112_0<=FLOAT)||(LA112_0>=IF_MODIFIER && LA112_0<=UNLESS_MODIFIER)||LA112_0==ID||LA112_0==STAR||(LA112_0>=BNOT && LA112_0<=REGEX)||(LA112_0>=SINGLE_QUOTE_STRING_SIMPLE && LA112_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA112_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA112_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA112_0==LCURLY||LA112_0==LBRACK||LA112_0==COLON||LA112_0==125||(LA112_0>=127 && LA112_0<=129)||(LA112_0>=139 && LA112_0<=141)) ) {
                alt112=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("657:1: open_args_with_block options {backtrack=true; } : ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args );", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:4: '(' call_args ')' ( block )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal264=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args_with_block3123); if (failed) return retval;
                    pushFollow(FOLLOW_call_args_in_open_args_with_block3126);
                    call_args265=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args265.getTree());
                    char_literal266=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args_with_block3128); if (failed) return retval;
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: ( block )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==LCURLY||LA110_0==142) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: block
                            {
                            pushFollow(FOLLOW_block_in_open_args_with_block3131);
                            block267=block();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, block267.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:4: '(' ')' ( block )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal268=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args_with_block3137); if (failed) return retval;
                    char_literal269=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args_with_block3140); if (failed) return retval;
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: ( block )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==LCURLY||LA111_0==142) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: block
                            {
                            pushFollow(FOLLOW_block_in_open_args_with_block3143);
                            block270=block();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, block270.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_args_in_open_args_with_block3149);
                    call_args271=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args271.getTree());

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
    // $ANTLR end open_args_with_block

    public static class call_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start call_args
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        args_return args272 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:2: ( args -> ^( ARG args ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:4: args
            {
            pushFollow(FOLLOW_args_in_call_args3177);
            args272=args();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_args.add(args272.getTree());

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
            // 671:10: -> ^( ARG args )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:13: ^( ARG args )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal274=null;
        arg_return arg273 = null;

        arg_return arg275 = null;


        Object char_literal274_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:6: ( arg ( ',' arg )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args3195);
            arg273=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg273.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:12: ( ',' arg )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==COMMA) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:13: ',' arg
            	    {
            	    char_literal274=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args3198); if (failed) return retval;
            	    pushFollow(FOLLOW_arg_in_args3201);
            	    arg275=arg();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, arg275.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:1: arg : definedExpression[false] ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        definedExpression_return definedExpression276 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:5: ( definedExpression[false] )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:7: definedExpression[false]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_definedExpression_in_arg3212);
            definedExpression276=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression276.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set277=null;

        Object set277_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:16: ( ID | CONSTANT | FID )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set277=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set277));
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID278=null;
        Token CONSTANT279=null;
        Token FID280=null;
        op_return op281 = null;


        Object ID278_tree=null;
        Object CONSTANT279_tree=null;
        Object FID280_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:15: ( ID | CONSTANT | FID | op )
            int alt114=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt114=1;
                }
                break;
            case CONSTANT:
                {
                alt114=2;
                }
                break;
            case FID:
                {
                alt114=3;
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
            case 135:
                {
                alt114=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("682:1: operation2 : ( ID | CONSTANT | FID | op );", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID278=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation23251); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID278_tree = (Object)adaptor.create(ID278);
                    adaptor.addChild(root_0, ID278_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT279=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation23255); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT279_tree = (Object)adaptor.create(CONSTANT279);
                    adaptor.addChild(root_0, CONSTANT279_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:33: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID280=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation23259); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID280_tree = (Object)adaptor.create(FID280);
                    adaptor.addChild(root_0, FID280_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:39: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation23263);
                    op281=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op281.getTree());

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID282=null;
        Token FID283=null;
        op_return op284 = null;


        Object ID282_tree=null;
        Object FID283_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:15: ( ID | FID | op )
            int alt115=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt115=1;
                }
                break;
            case FID:
                {
                alt115=2;
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
            case 135:
                {
                alt115=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("685:1: operation3 : ( ID | FID | op );", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID282=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation33279); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID282_tree = (Object)adaptor.create(ID282);
                    adaptor.addChild(root_0, ID282_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:22: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID283=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation33283); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID283_tree = (Object)adaptor.create(FID283);
                    adaptor.addChild(root_0, FID283_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:28: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation33287);
                    op284=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op284.getTree());

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:688:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID285=null;

        Object ID285_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:688:5: ( ID -> ^( VARIABLE ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:688:7: ID
            {
            ID285=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs3301); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID285);


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
            // 688:10: -> ^( VARIABLE ID )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:688:13: ^( VARIABLE ID )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression286 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:5: ( expression )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs3317);
            expression286=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expression286.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:1: literal : ( INT | FLOAT | string | symbol | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT287=null;
        Token FLOAT288=null;
        Token REGEX291=null;
        string_return string289 = null;

        symbol_return symbol290 = null;


        Object INT287_tree=null;
        Object FLOAT288_tree=null;
        Object REGEX291_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:9: ( INT | FLOAT | string | symbol | REGEX )
            int alt116=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt116=1;
                }
                break;
            case FLOAT:
                {
                alt116=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt116=3;
                }
                break;
            case COLON:
                {
                alt116=4;
                }
                break;
            case REGEX:
                {
                alt116=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("693:1: literal : ( INT | FLOAT | string | symbol | REGEX );", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT287=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal3327); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT287_tree = (Object)adaptor.create(INT287);
                    adaptor.addChild(root_0, INT287_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT288=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal3329); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT288_tree = (Object)adaptor.create(FLOAT288);
                    adaptor.addChild(root_0, FLOAT288_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal3331);
                    string289=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string289.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:28: symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbol_in_literal3333);
                    symbol290=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol290.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:35: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX291=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal3335); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REGEX291_tree = (Object)adaptor.create(REGEX291);
                    adaptor.addChild(root_0, REGEX291_tree);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HEREDOC_STRING294=null;
        single_quote_string_return single_quote_string292 = null;

        double_quote_string_return double_quote_string293 = null;


        Object HEREDOC_STRING294_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:8: ( single_quote_string | double_quote_string | HEREDOC_STRING )
            int alt117=3;
            switch ( input.LA(1) ) {
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt117=1;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt117=2;
                }
                break;
            case HEREDOC_STRING:
                {
                alt117=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("764:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:10: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_single_quote_string_in_string4065);
                    single_quote_string292=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string292.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:30: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_double_quote_string_in_string4067);
                    double_quote_string293=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string293.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:50: HEREDOC_STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    HEREDOC_STRING294=(Token)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_string4069); if (failed) return retval;
                    if ( backtracking==0 ) {
                    HEREDOC_STRING294_tree = (Object)adaptor.create(HEREDOC_STRING294);
                    adaptor.addChild(root_0, HEREDOC_STRING294_tree);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:766:1: single_quote_string : ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX );
    public final single_quote_string_return single_quote_string() throws RecognitionException {
        single_quote_string_return retval = new single_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set295=null;

        Object set295_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:767:2: ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set295=(Token)input.LT(1);
            if ( (input.LA(1)>=SINGLE_QUOTE_STRING_SIMPLE && input.LA(1)<=SINGLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set295));
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:1: double_quote_string : ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX );
    public final double_quote_string_return double_quote_string() throws RecognitionException {
        double_quote_string_return retval = new double_quote_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set296=null;

        Object set296_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:815:2: ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set296=(Token)input.LT(1);
            if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_SIMPLE && input.LA(1)<=DOUBLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set296));
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:1: array : '[' array_items ']' ;
    public final array_return array() throws RecognitionException {
        array_return retval = new array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal297=null;
        Token char_literal299=null;
        array_items_return array_items298 = null;


        Object char_literal297_tree=null;
        Object char_literal299_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:7: ( '[' array_items ']' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:9: '[' array_items ']'
            {
            root_0 = (Object)adaptor.nil();

            char_literal297=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_array4476); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal297_tree = (Object)adaptor.create(char_literal297);
            root_0 = (Object)adaptor.becomeRoot(char_literal297_tree, root_0);
            }
            pushFollow(FOLLOW_array_items_in_array4479);
            array_items298=array_items();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, array_items298.getTree());
            char_literal299=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_array4481); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:1: array_items : array_item ( ',' array_item )* trailer ;
    public final array_items_return array_items() throws RecognitionException {
        array_items_return retval = new array_items_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal301=null;
        array_item_return array_item300 = null;

        array_item_return array_item302 = null;

        trailer_return trailer303 = null;


        Object char_literal301_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:13: ( array_item ( ',' array_item )* trailer )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:19: array_item ( ',' array_item )* trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_array_item_in_array_items4493);
            array_item300=array_item();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, array_item300.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:30: ( ',' array_item )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==COMMA) ) {
                    int LA118_2 = input.LA(2);

                    if ( ((LA118_2>=HEREDOC_STRING && LA118_2<=FLOAT)||(LA118_2>=IF_MODIFIER && LA118_2<=UNLESS_MODIFIER)||LA118_2==ID||(LA118_2>=INT && LA118_2<=REGEX)||(LA118_2>=SINGLE_QUOTE_STRING_SIMPLE && LA118_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA118_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA118_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA118_2==LCURLY||LA118_2==LPAREN||LA118_2==LBRACK||LA118_2==COLON||LA118_2==125||(LA118_2>=127 && LA118_2<=129)||(LA118_2>=140 && LA118_2<=141)) ) {
                        alt118=1;
                    }


                }


                switch (alt118) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:31: ',' array_item
            	    {
            	    char_literal301=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_array_items4496); if (failed) return retval;
            	    pushFollow(FOLLOW_array_item_in_array_items4499);
            	    array_item302=array_item();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, array_item302.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            pushFollow(FOLLOW_trailer_in_array_items4503);
            trailer303=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer303.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:1: array_item : command ;
    public final array_item_return array_item() throws RecognitionException {
        array_item_return retval = new array_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        command_return command304 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:13: ( command )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:19: command
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_command_in_array_item4515);
            command304=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command304.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal305=null;
        Token char_literal307=null;
        assoc_list_return assoc_list306 = null;


        Object char_literal305_tree=null;
        Object char_literal307_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:6: ( '{' assoc_list '}' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal305=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash4522); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal305_tree = (Object)adaptor.create(char_literal305);
            root_0 = (Object)adaptor.becomeRoot(char_literal305_tree, root_0);
            }
            pushFollow(FOLLOW_assoc_list_in_hash4525);
            assoc_list306=assoc_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc_list306.getTree());
            char_literal307=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash4527); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:858:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assocs_return assocs308 = null;

        trailer_return trailer309 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:2: ( assocs trailer )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list4536);
            assocs308=assocs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assocs308.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list4538);
            trailer309=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer309.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal311=null;
        assoc_return assoc310 = null;

        assoc_return assoc312 = null;


        Object char_literal311_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:8: ( assoc ( ',' assoc )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs4547);
            assoc310=assoc();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc310.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:16: ( ',' assoc )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    int LA119_2 = input.LA(2);

                    if ( ((LA119_2>=HEREDOC_STRING && LA119_2<=FLOAT)||(LA119_2>=IF_MODIFIER && LA119_2<=UNLESS_MODIFIER)||LA119_2==ID||LA119_2==STAR||(LA119_2>=BNOT && LA119_2<=REGEX)||(LA119_2>=SINGLE_QUOTE_STRING_SIMPLE && LA119_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA119_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA119_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA119_2==LCURLY||LA119_2==LPAREN||LA119_2==LBRACK||LA119_2==COLON||LA119_2==125||(LA119_2>=127 && LA119_2<=129)||(LA119_2>=139 && LA119_2<=141)) ) {
                        alt119=1;
                    }


                }


                switch (alt119) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:18: ',' assoc
            	    {
            	    char_literal311=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs4551); if (failed) return retval;
            	    pushFollow(FOLLOW_assoc_in_assocs4554);
            	    assoc312=assoc();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assoc312.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal314=null;
        Token set317=null;
        symbol_name_in_assoc_return symbol_name_in_assoc313 = null;

        arg_return arg315 = null;

        arg_return arg316 = null;

        arg_return arg318 = null;


        Object char_literal314_tree=null;
        Object set317_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:15: ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg )
            int alt120=2;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:17: ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbol_name_in_assoc_in_assoc4581);
                    symbol_name_in_assoc313=symbol_name_in_assoc();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol_name_in_assoc313.getTree());
                    char_literal314=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_assoc4583); if (failed) return retval;
                    pushFollow(FOLLOW_arg_in_assoc4586);
                    arg315=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg315.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:82: arg ( ASSOC | ',' ) arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arg_in_assoc4590);
                    arg316=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg316.getTree());
                    set317=(Token)input.LT(1);
                    if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc4592);    throw mse;
                    }

                    pushFollow(FOLLOW_arg_in_assoc4599);
                    arg318=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg318.getTree());

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:864:1: symbol_name_in_assoc : ID -> ^( SYMBOL ID ) ;
    public final symbol_name_in_assoc_return symbol_name_in_assoc() throws RecognitionException {
        symbol_name_in_assoc_return retval = new symbol_name_in_assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID319=null;

        Object ID319_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:2: ( ID -> ^( SYMBOL ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:4: ID
            {
            ID319=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_symbol_name_in_assoc4609); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID319);


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
            // 865:7: -> ^( SYMBOL ID )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:10: ^( SYMBOL ID )
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK320=null;
        Token char_literal321=null;

        Object LINE_BREAK320_tree=null;
        Object char_literal321_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:16: ( | LINE_BREAK | ',' )
            int alt121=3;
            switch ( input.LA(1) ) {
            case RCURLY:
            case RBRACK:
                {
                alt121=1;
                }
                break;
            case LINE_BREAK:
                {
                alt121=2;
                }
                break;
            case COMMA:
                {
                alt121=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("870:1: trailer : ( | LINE_BREAK | ',' );", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:29: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK320=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer4640); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:45: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal321=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer4645); if (failed) return retval;

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:1: symbol : ':' ( ID | single_quote_string | double_quote_string ) ;
    public final symbol_return symbol() throws RecognitionException {
        symbol_return retval = new symbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal322=null;
        Token ID323=null;
        single_quote_string_return single_quote_string324 = null;

        double_quote_string_return double_quote_string325 = null;


        Object char_literal322_tree=null;
        Object ID323_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:8: ( ':' ( ID | single_quote_string | double_quote_string ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:10: ':' ( ID | single_quote_string | double_quote_string )
            {
            root_0 = (Object)adaptor.nil();

            char_literal322=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_symbol4661); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal322_tree = (Object)adaptor.create(char_literal322);
            root_0 = (Object)adaptor.becomeRoot(char_literal322_tree, root_0);
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:15: ( ID | single_quote_string | double_quote_string )
            int alt122=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt122=1;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt122=2;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt122=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("873:15: ( ID | single_quote_string | double_quote_string )", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:16: ID
                    {
                    ID323=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_symbol4665); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID323_tree = (Object)adaptor.create(ID323);
                    adaptor.addChild(root_0, ID323_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:21: single_quote_string
                    {
                    pushFollow(FOLLOW_single_quote_string_in_symbol4669);
                    single_quote_string324=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string324.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:43: double_quote_string
                    {
                    pushFollow(FOLLOW_double_quote_string_in_symbol4673);
                    double_quote_string325=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string325.getTree());

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
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:90: ( simple_assignment_expression )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:91: simple_assignment_expression
        {
        pushFollow(FOLLOW_simple_assignment_expression_in_synpred11432);
        simple_assignment_expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:154: ( mlhs )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:155: mlhs
        {
        pushFollow(FOLLOW_mlhs_in_synpred21441);
        mlhs();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:121: ( simple_assignment_expression )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:122: simple_assignment_expression
        {
        pushFollow(FOLLOW_simple_assignment_expression_in_synpred31651);
        simple_assignment_expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:78: ( ID ( block )? )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:79: ID ( block )?
        {
        match(input,ID,FOLLOW_ID_in_synpred42962); if (failed) return ;
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:82: ( block )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( (LA123_0==LCURLY||LA123_0==142) ) {
            alt123=1;
        }
        switch (alt123) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:82: block
                {
                pushFollow(FOLLOW_block_in_synpred42964);
                block();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:4: ( '(' call_args ')' ( block )? )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:4: '(' call_args ')' ( block )?
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred53123); if (failed) return ;
        pushFollow(FOLLOW_call_args_in_synpred53126);
        call_args();
        _fsp--;
        if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred53128); if (failed) return ;
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: ( block )?
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==LCURLY||LA124_0==142) ) {
            alt124=1;
        }
        switch (alt124) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: block
                {
                pushFollow(FOLLOW_block_in_synpred53131);
                block();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:4: ( '(' ')' ( block )? )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:4: '(' ')' ( block )?
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred63137); if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred63140); if (failed) return ;
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: ( block )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==LCURLY||LA125_0==142) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: block
                {
                pushFollow(FOLLOW_block_in_synpred63143);
                block();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:17: ( symbol_name_in_assoc ':' arg )
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:18: symbol_name_in_assoc ':' arg
        {
        pushFollow(FOLLOW_symbol_name_in_assoc_in_synpred74573);
        symbol_name_in_assoc();
        _fsp--;
        if (failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred74575); if (failed) return ;
        pushFollow(FOLLOW_arg_in_synpred74577);
        arg();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred7

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
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
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
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA120 dfa120 = new DFA120(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\50\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\u0083\2\u008d\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\104\uffff\1\3\17\uffff\1\3\3\uffff\2\3",
            "\2\4\25\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\4\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
            "\3\uffff\4\4",
            "\2\4\25\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\13\uffff\1\4\31"+
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
            return "()* loopback of 294:21: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\51\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\u0084\1\u008d\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\120\uffff\1\2\11\uffff\1\3",
            "\2\4\25\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\13\uffff\1\4\31"+
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
            return "337:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA105_eotS =
        "\u00ce\uffff";
    static final String DFA105_eofS =
        "\1\uffff\1\43\u00cc\uffff";
    static final String DFA105_minS =
        "\1\55\1\13\1\uffff\1\14\1\uffff\1\14\32\uffff\1\14\7\uffff\1\14"+
        "\7\uffff\1\14\1\uffff\2\0\1\55\2\0\2\13\16\0\27\uffff\1\0\2\uffff"+
        "\33\0\51\uffff\1\0\7\uffff\34\0\5\uffff";
    static final String DFA105_maxS =
        "\1\55\1\u008e\1\uffff\1\u008d\1\uffff\1\u008d\32\uffff\1\u008d\7"+
        "\uffff\1\u008d\7\uffff\1\u008d\1\uffff\2\0\1\55\2\0\2\u0089\16\0"+
        "\27\uffff\1\0\2\uffff\33\0\51\uffff\1\0\7\uffff\34\0\5\uffff";
    static final String DFA105_acceptS =
        "\2\uffff\1\1\1\uffff\1\1\1\uffff\32\1\1\uffff\7\1\1\uffff\6\1\1"+
        "\2\1\uffff\1\1\25\uffff\27\1\1\uffff\2\1\33\uffff\51\1\1\uffff\7"+
        "\1\34\uffff\5\1";
    static final String DFA105_specialS =
        "\1\uffff\1\3\1\uffff\1\7\1\uffff\1\13\32\uffff\1\6\7\uffff\1\2\7"+
        "\uffff\1\1\1\uffff\1\12\1\10\1\uffff\1\0\1\11\1\4\1\5\u0095\uffff}>";
    static final String[] DFA105_transitionS = {
            "\1\1",
            "\1\12\2\57\17\uffff\1\6\1\7\4\uffff\1\40\1\60\3\61\1\41\1\42"+
            "\1\uffff\1\56\1\uffff\1\57\1\23\1\24\1\25\1\27\1\20\1\22\1\17"+
            "\1\21\1\13\1\10\1\11\1\5\1\4\16\uffff\1\35\1\33\1\34\1\32\1"+
            "\31\1\26\1\30\1\15\1\16\1\14\4\57\20\uffff\2\57\1\uffff\2\57"+
            "\1\uffff\1\3\1\47\2\uffff\1\54\2\uffff\1\57\1\52\1\57\1\55\1"+
            "\uffff\1\53\1\50\2\uffff\1\57\1\44\3\57\1\45\1\46\1\51\3\uffff"+
            "\1\36\1\37\1\uffff\3\57\1\2",
            "",
            "\1\75\1\72\25\uffff\1\102\1\103\10\uffff\1\62\13\uffff\1\64"+
            "\27\uffff\1\107\1\uffff\1\65\1\66\1\71\1\77\20\uffff\2\73\1"+
            "\uffff\2\74\1\uffff\1\105\1\113\5\uffff\1\106\1\uffff\1\104"+
            "\3\uffff\1\76\2\uffff\1\101\1\uffff\3\100\3\uffff\1\110\1\112"+
            "\3\uffff\1\111\1\63\1\67\1\70",
            "",
            "\1\125\1\122\25\uffff\1\132\1\133\4\uffff\1\114\3\uffff\1\136"+
            "\45\uffff\1\115\1\116\1\121\1\127\20\uffff\2\123\1\uffff\2\124"+
            "\1\uffff\1\135\6\uffff\1\137\1\uffff\1\134\3\uffff\1\126\2\uffff"+
            "\1\131\1\uffff\3\130\12\uffff\1\117\1\120",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156\1\153\25\uffff\1\163\1\164\4\uffff\1\140\3\uffff\1\144"+
            "\13\uffff\1\145\31\uffff\1\146\1\147\1\152\1\160\20\uffff\2"+
            "\154\1\uffff\2\155\1\uffff\1\166\6\uffff\1\167\1\uffff\1\165"+
            "\3\uffff\1\157\2\uffff\1\162\1\uffff\3\161\3\uffff\1\141\1\170"+
            "\3\uffff\1\142\1\143\1\150\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\1\u0089\25\uffff\1\u008f\1\u0090\3\uffff\1\175\1\174"+
            "\3\uffff\1\171\13\uffff\1\u0083\31\uffff\1\u0084\1\u0085\1\u0088"+
            "\1\u008c\20\uffff\2\172\1\uffff\2\173\1\uffff\1\u0092\6\uffff"+
            "\1\u0093\1\uffff\1\u0091\3\uffff\1\u008b\2\uffff\1\u008e\1\177"+
            "\3\u008d\1\45\1\176\1\uffff\1\u0080\1\u0094\3\uffff\1\u0081"+
            "\1\u0082\1\u0086\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2\1\u009f\25\uffff\1\u00a7\1\u00a8\4\uffff\1\140\3\uffff"+
            "\1\u0098\13\uffff\1\u0099\31\uffff\1\u009a\1\u009b\1\u009e\1"+
            "\u00a4\20\uffff\2\u00a0\1\uffff\2\u00a1\1\uffff\1\u00aa\6\uffff"+
            "\1\u00ab\1\uffff\1\u00a9\3\uffff\1\u00a3\2\uffff\1\u00a6\1\uffff"+
            "\3\u00a5\3\uffff\1\u0095\1\u00ac\3\uffff\1\u0096\1\u0097\1\u009c"+
            "\1\u009d",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ad",
            "\1\uffff",
            "\1\uffff",
            "\1\u00b5\21\uffff\1\u00b1\1\u00b2\4\uffff\5\u00cb\1\u00cc\1"+
            "\u00cd\1\uffff\1\u00ae\2\uffff\1\u00be\1\u00bf\1\u00c0\1\u00c2"+
            "\1\u00bb\1\u00bd\1\u00ba\1\u00bc\1\u00b6\1\u00b3\1\u00b4\1\u00b0"+
            "\1\u00af\16\uffff\1\u00c8\1\u00c6\1\u00c7\1\u00c5\1\u00c4\1"+
            "\u00c1\1\u00c3\1\u00b8\1\u00b9\1\u00b7\33\uffff\1\113\2\uffff"+
            "\1\57\7\uffff\1\57\16\uffff\1\u00c9\1\u00ca",
            "\1\u00b5\21\uffff\1\u00b1\1\u00b2\4\uffff\5\u00cb\1\u00cc\1"+
            "\u00cd\1\uffff\1\u00ae\2\uffff\1\u00be\1\u00bf\1\u00c0\1\u00c2"+
            "\1\u00bb\1\u00bd\1\u00ba\1\u00bc\1\u00b6\1\u00b3\1\u00b4\1\u00b0"+
            "\1\u00af\16\uffff\1\u00c8\1\u00c6\1\u00c7\1\u00c5\1\u00c4\1"+
            "\u00c1\1\u00c3\1\u00b8\1\u00b9\1\u00b7\33\uffff\1\113\2\uffff"+
            "\1\57\7\uffff\1\57\16\uffff\1\u00c9\1\u00ca",
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
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }
        public String getDescription() {
            return "632:1: method[boolean topLevel] : ( ( ID ( block )? )=> ID ( block )? -> ^( VARIABLE_OR_METHOD ID ( block )? ) | ID open_args_with_block -> ^( CALL ID open_args_with_block ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA105_53 = input.LA(1);

                         
                        int index105_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 172;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index105_53);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA105_48 = input.LA(1);

                         
                        int index105_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_48==LINE_BREAK) && (synpred4())) {s = 96;}

                        else if ( (LA105_48==133) && (synpred4())) {s = 149;}

                        else if ( (LA105_48==138) && (synpred4())) {s = 150;}

                        else if ( (LA105_48==139) && (synpred4())) {s = 151;}

                        else if ( (LA105_48==ID) && (synpred4())) {s = 152;}

                        else if ( (LA105_48==STAR) && (synpred4())) {s = 153;}

                        else if ( (LA105_48==BNOT) && (synpred4())) {s = 154;}

                        else if ( (LA105_48==NOT) && (synpred4())) {s = 155;}

                        else if ( (LA105_48==140) && (synpred4())) {s = 156;}

                        else if ( (LA105_48==141) && (synpred4())) {s = 157;}

                        else if ( (LA105_48==INT) && (synpred4())) {s = 158;}

                        else if ( (LA105_48==FLOAT) && (synpred4())) {s = 159;}

                        else if ( ((LA105_48>=SINGLE_QUOTE_STRING_SIMPLE && LA105_48<=SINGLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 160;}

                        else if ( ((LA105_48>=DOUBLE_QUOTE_STRING_SIMPLE && LA105_48<=DOUBLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 161;}

                        else if ( (LA105_48==HEREDOC_STRING) && (synpred4())) {s = 162;}

                        else if ( (LA105_48==COLON) && (synpred4())) {s = 163;}

                        else if ( (LA105_48==REGEX) && (synpred4())) {s = 164;}

                        else if ( ((LA105_48>=127 && LA105_48<=129)) ) {s = 165;}

                        else if ( (LA105_48==125) && (synpred4())) {s = 166;}

                        else if ( (LA105_48==IF_MODIFIER) && (synpred4())) {s = 167;}

                        else if ( (LA105_48==UNLESS_MODIFIER) && (synpred4())) {s = 168;}

                        else if ( (LA105_48==LBRACK) && (synpred4())) {s = 169;}

                        else if ( (LA105_48==LCURLY) && (synpred4())) {s = 170;}

                        else if ( (LA105_48==LPAREN) && (synpred4())) {s = 171;}

                        else if ( (LA105_48==134) && (synpred4())) {s = 172;}

                         
                        input.seek(index105_48);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA105_40 = input.LA(1);

                         
                        int index105_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_40==ID) ) {s = 121;}

                        else if ( ((LA105_40>=SINGLE_QUOTE_STRING_SIMPLE && LA105_40<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 122;}

                        else if ( ((LA105_40>=DOUBLE_QUOTE_STRING_SIMPLE && LA105_40<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 123;}

                        else if ( (LA105_40==LINE_BREAK) && (synpred4())) {s = 124;}

                        else if ( (LA105_40==SEMI) && (synpred4())) {s = 125;}

                        else if ( (LA105_40==131) && (synpred4())) {s = 126;}

                        else if ( (LA105_40==126) && (synpred4())) {s = 127;}

                        else if ( (LA105_40==130) && (synpred4())) {s = 37;}

                        else if ( (LA105_40==133) && (synpred4())) {s = 128;}

                        else if ( (LA105_40==138) && (synpred4())) {s = 129;}

                        else if ( (LA105_40==139) && (synpred4())) {s = 130;}

                        else if ( (LA105_40==STAR) && (synpred4())) {s = 131;}

                        else if ( (LA105_40==BNOT) && (synpred4())) {s = 132;}

                        else if ( (LA105_40==NOT) && (synpred4())) {s = 133;}

                        else if ( (LA105_40==140) && (synpred4())) {s = 134;}

                        else if ( (LA105_40==141) && (synpred4())) {s = 135;}

                        else if ( (LA105_40==INT) && (synpred4())) {s = 136;}

                        else if ( (LA105_40==FLOAT) && (synpred4())) {s = 137;}

                        else if ( (LA105_40==HEREDOC_STRING) && (synpred4())) {s = 138;}

                        else if ( (LA105_40==COLON) && (synpred4())) {s = 139;}

                        else if ( (LA105_40==REGEX) && (synpred4())) {s = 140;}

                        else if ( ((LA105_40>=127 && LA105_40<=129)) && (synpred4())) {s = 141;}

                        else if ( (LA105_40==125) && (synpred4())) {s = 142;}

                        else if ( (LA105_40==IF_MODIFIER) && (synpred4())) {s = 143;}

                        else if ( (LA105_40==UNLESS_MODIFIER) && (synpred4())) {s = 144;}

                        else if ( (LA105_40==LBRACK) && (synpred4())) {s = 145;}

                        else if ( (LA105_40==LCURLY) && (synpred4())) {s = 146;}

                        else if ( (LA105_40==LPAREN) && (synpred4())) {s = 147;}

                        else if ( (LA105_40==134) && (synpred4())) {s = 148;}

                         
                        input.seek(index105_40);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA105_1 = input.LA(1);

                         
                        int index105_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_1==142) && (synpred4())) {s = 2;}

                        else if ( (LA105_1==LCURLY) ) {s = 3;}

                        else if ( (LA105_1==POWER) && (synpred4())) {s = 4;}

                        else if ( (LA105_1==STAR) ) {s = 5;}

                        else if ( (LA105_1==DIV) && (synpred4())) {s = 6;}

                        else if ( (LA105_1==MOD) && (synpred4())) {s = 7;}

                        else if ( (LA105_1==PLUS) && (synpred4())) {s = 8;}

                        else if ( (LA105_1==MINUS) && (synpred4())) {s = 9;}

                        else if ( (LA105_1==LEFT_SHIFT) && (synpred4())) {s = 10;}

                        else if ( (LA105_1==RIGHT_SHIFT) && (synpred4())) {s = 11;}

                        else if ( (LA105_1==BAND) && (synpred4())) {s = 12;}

                        else if ( (LA105_1==BXOR) && (synpred4())) {s = 13;}

                        else if ( (LA105_1==BOR) && (synpred4())) {s = 14;}

                        else if ( (LA105_1==LESS_THAN) && (synpred4())) {s = 15;}

                        else if ( (LA105_1==GREATER_THAN) && (synpred4())) {s = 16;}

                        else if ( (LA105_1==LESS_OR_EQUAL) && (synpred4())) {s = 17;}

                        else if ( (LA105_1==GREATER_OR_EQUAL) && (synpred4())) {s = 18;}

                        else if ( (LA105_1==COMPARE) && (synpred4())) {s = 19;}

                        else if ( (LA105_1==EQUAL) && (synpred4())) {s = 20;}

                        else if ( (LA105_1==CASE_EQUAL) && (synpred4())) {s = 21;}

                        else if ( (LA105_1==NOT_EQUAL) && (synpred4())) {s = 22;}

                        else if ( (LA105_1==MATCH) && (synpred4())) {s = 23;}

                        else if ( (LA105_1==NOT_MATCH) && (synpred4())) {s = 24;}

                        else if ( (LA105_1==LOGICAL_AND) && (synpred4())) {s = 25;}

                        else if ( (LA105_1==LOGICAL_OR) && (synpred4())) {s = 26;}

                        else if ( (LA105_1==INCLUSIVE_RANGE) && (synpred4())) {s = 27;}

                        else if ( (LA105_1==EXCLUSIVE_RANGE) && (synpred4())) {s = 28;}

                        else if ( (LA105_1==QUESTION) && (synpred4())) {s = 29;}

                        else if ( (LA105_1==136) && (synpred4())) {s = 30;}

                        else if ( (LA105_1==137) && (synpred4())) {s = 31;}

                        else if ( (LA105_1==IF_MODIFIER) ) {s = 32;}

                        else if ( (LA105_1==SEMI) && (synpred4())) {s = 33;}

                        else if ( (LA105_1==LINE_BREAK) && (synpred4())) {s = 34;}

                        else if ( (LA105_1==EOF) && (synpred4())) {s = 35;}

                        else if ( (LA105_1==126) && (synpred4())) {s = 36;}

                        else if ( (LA105_1==130) && (synpred4())) {s = 37;}

                        else if ( (LA105_1==131) && (synpred4())) {s = 38;}

                        else if ( (LA105_1==RCURLY) && (synpred4())) {s = 39;}

                        else if ( (LA105_1==COLON) ) {s = 40;}

                        else if ( (LA105_1==132) && (synpred4())) {s = 41;}

                        else if ( (LA105_1==RPAREN) && (synpred4())) {s = 42;}

                        else if ( (LA105_1==COMMA) && (synpred4())) {s = 43;}

                        else if ( (LA105_1==ASSOC) && (synpred4())) {s = 44;}

                        else if ( (LA105_1==RBRACK) && (synpred4())) {s = 45;}

                        else if ( (LA105_1==DOT) && (synpred4())) {s = 46;}

                        else if ( ((LA105_1>=HEREDOC_STRING && LA105_1<=FLOAT)||LA105_1==ID||(LA105_1>=BNOT && LA105_1<=REGEX)||(LA105_1>=SINGLE_QUOTE_STRING_SIMPLE && LA105_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA105_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA105_1<=DOUBLE_QUOTE_STRING_COMPLEX)||LA105_1==LPAREN||LA105_1==LBRACK||LA105_1==125||(LA105_1>=127 && LA105_1<=129)||(LA105_1>=139 && LA105_1<=141)) ) {s = 47;}

                        else if ( (LA105_1==UNLESS_MODIFIER) ) {s = 48;}

                        else if ( ((LA105_1>=WHILE_MODIFIER && LA105_1<=RESCUE_MODIFIER)) && (synpred4())) {s = 49;}

                         
                        input.seek(index105_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA105_55 = input.LA(1);

                         
                        int index105_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_55==DOT) ) {s = 174;}

                        else if ( (LA105_55==POWER) ) {s = 175;}

                        else if ( (LA105_55==STAR) ) {s = 176;}

                        else if ( (LA105_55==DIV) ) {s = 177;}

                        else if ( (LA105_55==MOD) ) {s = 178;}

                        else if ( (LA105_55==PLUS) ) {s = 179;}

                        else if ( (LA105_55==MINUS) ) {s = 180;}

                        else if ( (LA105_55==LEFT_SHIFT) ) {s = 181;}

                        else if ( (LA105_55==RIGHT_SHIFT) ) {s = 182;}

                        else if ( (LA105_55==BAND) ) {s = 183;}

                        else if ( (LA105_55==BXOR) ) {s = 184;}

                        else if ( (LA105_55==BOR) ) {s = 185;}

                        else if ( (LA105_55==LESS_THAN) ) {s = 186;}

                        else if ( (LA105_55==GREATER_THAN) ) {s = 187;}

                        else if ( (LA105_55==LESS_OR_EQUAL) ) {s = 188;}

                        else if ( (LA105_55==GREATER_OR_EQUAL) ) {s = 189;}

                        else if ( (LA105_55==COMPARE) ) {s = 190;}

                        else if ( (LA105_55==EQUAL) ) {s = 191;}

                        else if ( (LA105_55==CASE_EQUAL) ) {s = 192;}

                        else if ( (LA105_55==NOT_EQUAL) ) {s = 193;}

                        else if ( (LA105_55==MATCH) ) {s = 194;}

                        else if ( (LA105_55==NOT_MATCH) ) {s = 195;}

                        else if ( (LA105_55==LOGICAL_AND) ) {s = 196;}

                        else if ( (LA105_55==LOGICAL_OR) ) {s = 197;}

                        else if ( (LA105_55==INCLUSIVE_RANGE) ) {s = 198;}

                        else if ( (LA105_55==EXCLUSIVE_RANGE) ) {s = 199;}

                        else if ( (LA105_55==QUESTION) ) {s = 200;}

                        else if ( (LA105_55==136) && (synpred4())) {s = 201;}

                        else if ( (LA105_55==137) && (synpred4())) {s = 202;}

                        else if ( ((LA105_55>=IF_MODIFIER && LA105_55<=RESCUE_MODIFIER)) && (synpred4())) {s = 203;}

                        else if ( (LA105_55==SEMI) && (synpred4())) {s = 204;}

                        else if ( (LA105_55==LINE_BREAK) && (synpred4())) {s = 205;}

                        else if ( (LA105_55==RCURLY) && (synpred4())) {s = 75;}

                        else if ( (LA105_55==ASSOC||LA105_55==COMMA) ) {s = 47;}

                         
                        input.seek(index105_55);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA105_56 = input.LA(1);

                         
                        int index105_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_56==DOT) ) {s = 174;}

                        else if ( (LA105_56==POWER) ) {s = 175;}

                        else if ( (LA105_56==STAR) ) {s = 176;}

                        else if ( (LA105_56==DIV) ) {s = 177;}

                        else if ( (LA105_56==MOD) ) {s = 178;}

                        else if ( (LA105_56==PLUS) ) {s = 179;}

                        else if ( (LA105_56==MINUS) ) {s = 180;}

                        else if ( (LA105_56==LEFT_SHIFT) ) {s = 181;}

                        else if ( (LA105_56==RIGHT_SHIFT) ) {s = 182;}

                        else if ( (LA105_56==BAND) ) {s = 183;}

                        else if ( (LA105_56==BXOR) ) {s = 184;}

                        else if ( (LA105_56==BOR) ) {s = 185;}

                        else if ( (LA105_56==LESS_THAN) ) {s = 186;}

                        else if ( (LA105_56==GREATER_THAN) ) {s = 187;}

                        else if ( (LA105_56==LESS_OR_EQUAL) ) {s = 188;}

                        else if ( (LA105_56==GREATER_OR_EQUAL) ) {s = 189;}

                        else if ( (LA105_56==COMPARE) ) {s = 190;}

                        else if ( (LA105_56==EQUAL) ) {s = 191;}

                        else if ( (LA105_56==CASE_EQUAL) ) {s = 192;}

                        else if ( (LA105_56==NOT_EQUAL) ) {s = 193;}

                        else if ( (LA105_56==MATCH) ) {s = 194;}

                        else if ( (LA105_56==NOT_MATCH) ) {s = 195;}

                        else if ( (LA105_56==LOGICAL_AND) ) {s = 196;}

                        else if ( (LA105_56==LOGICAL_OR) ) {s = 197;}

                        else if ( (LA105_56==INCLUSIVE_RANGE) ) {s = 198;}

                        else if ( (LA105_56==EXCLUSIVE_RANGE) ) {s = 199;}

                        else if ( (LA105_56==QUESTION) ) {s = 200;}

                        else if ( (LA105_56==ASSOC||LA105_56==COMMA) ) {s = 47;}

                        else if ( (LA105_56==136) && (synpred4())) {s = 201;}

                        else if ( (LA105_56==137) && (synpred4())) {s = 202;}

                        else if ( ((LA105_56>=IF_MODIFIER && LA105_56<=RESCUE_MODIFIER)) && (synpred4())) {s = 203;}

                        else if ( (LA105_56==SEMI) && (synpred4())) {s = 204;}

                        else if ( (LA105_56==LINE_BREAK) && (synpred4())) {s = 205;}

                        else if ( (LA105_56==RCURLY) && (synpred4())) {s = 75;}

                         
                        input.seek(index105_56);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA105_32 = input.LA(1);

                         
                        int index105_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_32==LINE_BREAK) && (synpred4())) {s = 96;}

                        else if ( (LA105_32==133) ) {s = 97;}

                        else if ( (LA105_32==138) ) {s = 98;}

                        else if ( (LA105_32==139) ) {s = 99;}

                        else if ( (LA105_32==ID) ) {s = 100;}

                        else if ( (LA105_32==STAR) ) {s = 101;}

                        else if ( (LA105_32==BNOT) ) {s = 102;}

                        else if ( (LA105_32==NOT) ) {s = 103;}

                        else if ( (LA105_32==140) ) {s = 104;}

                        else if ( (LA105_32==141) ) {s = 105;}

                        else if ( (LA105_32==INT) ) {s = 106;}

                        else if ( (LA105_32==FLOAT) ) {s = 107;}

                        else if ( ((LA105_32>=SINGLE_QUOTE_STRING_SIMPLE && LA105_32<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 108;}

                        else if ( ((LA105_32>=DOUBLE_QUOTE_STRING_SIMPLE && LA105_32<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 109;}

                        else if ( (LA105_32==HEREDOC_STRING) ) {s = 110;}

                        else if ( (LA105_32==COLON) ) {s = 111;}

                        else if ( (LA105_32==REGEX) ) {s = 112;}

                        else if ( ((LA105_32>=127 && LA105_32<=129)) ) {s = 113;}

                        else if ( (LA105_32==125) ) {s = 114;}

                        else if ( (LA105_32==IF_MODIFIER) ) {s = 115;}

                        else if ( (LA105_32==UNLESS_MODIFIER) ) {s = 116;}

                        else if ( (LA105_32==LBRACK) ) {s = 117;}

                        else if ( (LA105_32==LCURLY) ) {s = 118;}

                        else if ( (LA105_32==LPAREN) ) {s = 119;}

                        else if ( (LA105_32==134) ) {s = 120;}

                         
                        input.seek(index105_32);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA105_3 = input.LA(1);

                         
                        int index105_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_3==ID) ) {s = 50;}

                        else if ( (LA105_3==139) ) {s = 51;}

                        else if ( (LA105_3==STAR) ) {s = 52;}

                        else if ( (LA105_3==BNOT) ) {s = 53;}

                        else if ( (LA105_3==NOT) ) {s = 54;}

                        else if ( (LA105_3==140) ) {s = 55;}

                        else if ( (LA105_3==141) ) {s = 56;}

                        else if ( (LA105_3==INT) ) {s = 57;}

                        else if ( (LA105_3==FLOAT) ) {s = 58;}

                        else if ( ((LA105_3>=SINGLE_QUOTE_STRING_SIMPLE && LA105_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 59;}

                        else if ( ((LA105_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA105_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 60;}

                        else if ( (LA105_3==HEREDOC_STRING) ) {s = 61;}

                        else if ( (LA105_3==COLON) ) {s = 62;}

                        else if ( (LA105_3==REGEX) ) {s = 63;}

                        else if ( ((LA105_3>=127 && LA105_3<=129)) ) {s = 64;}

                        else if ( (LA105_3==125) ) {s = 65;}

                        else if ( (LA105_3==IF_MODIFIER) ) {s = 66;}

                        else if ( (LA105_3==UNLESS_MODIFIER) ) {s = 67;}

                        else if ( (LA105_3==LBRACK) ) {s = 68;}

                        else if ( (LA105_3==LCURLY) ) {s = 69;}

                        else if ( (LA105_3==LPAREN) ) {s = 70;}

                        else if ( (LA105_3==BOR) && (synpred4())) {s = 71;}

                        else if ( (LA105_3==133) && (synpred4())) {s = 72;}

                        else if ( (LA105_3==138) && (synpred4())) {s = 73;}

                        else if ( (LA105_3==134) && (synpred4())) {s = 74;}

                        else if ( (LA105_3==RCURLY) && (synpred4())) {s = 75;}

                         
                        input.seek(index105_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA105_51 = input.LA(1);

                         
                        int index105_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 172;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index105_51);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA105_54 = input.LA(1);

                         
                        int index105_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 172;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index105_54);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA105_50 = input.LA(1);

                         
                        int index105_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 172;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index105_50);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA105_5 = input.LA(1);

                         
                        int index105_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA105_5==LINE_BREAK) && (synpred4())) {s = 76;}

                        else if ( (LA105_5==BNOT) && (synpred4())) {s = 77;}

                        else if ( (LA105_5==NOT) && (synpred4())) {s = 78;}

                        else if ( (LA105_5==140) && (synpred4())) {s = 79;}

                        else if ( (LA105_5==141) && (synpred4())) {s = 80;}

                        else if ( (LA105_5==INT) && (synpred4())) {s = 81;}

                        else if ( (LA105_5==FLOAT) && (synpred4())) {s = 82;}

                        else if ( ((LA105_5>=SINGLE_QUOTE_STRING_SIMPLE && LA105_5<=SINGLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 83;}

                        else if ( ((LA105_5>=DOUBLE_QUOTE_STRING_SIMPLE && LA105_5<=DOUBLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 84;}

                        else if ( (LA105_5==HEREDOC_STRING) && (synpred4())) {s = 85;}

                        else if ( (LA105_5==COLON) && (synpred4())) {s = 86;}

                        else if ( (LA105_5==REGEX) && (synpred4())) {s = 87;}

                        else if ( ((LA105_5>=127 && LA105_5<=129)) && (synpred4())) {s = 88;}

                        else if ( (LA105_5==125) && (synpred4())) {s = 89;}

                        else if ( (LA105_5==IF_MODIFIER) && (synpred4())) {s = 90;}

                        else if ( (LA105_5==UNLESS_MODIFIER) && (synpred4())) {s = 91;}

                        else if ( (LA105_5==LBRACK) && (synpred4())) {s = 92;}

                        else if ( (LA105_5==LCURLY) && (synpred4())) {s = 93;}

                        else if ( (LA105_5==ID) ) {s = 94;}

                        else if ( (LA105_5==LPAREN) && (synpred4())) {s = 95;}

                         
                        input.seek(index105_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 105, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA120_eotS =
        "\67\uffff";
    static final String DFA120_eofS =
        "\67\uffff";
    static final String DFA120_minS =
        "\1\14\1\13\1\uffff\1\14\1\0\2\13\22\uffff\34\0\2\uffff";
    static final String DFA120_maxS =
        "\1\u008d\1\u008e\1\uffff\1\u008d\1\0\2\171\22\uffff\34\0\2\uffff";
    static final String DFA120_acceptS =
        "\2\uffff\1\2\4\uffff\22\1\34\uffff\2\1";
    static final String DFA120_specialS =
        "\3\uffff\1\3\1\0\1\1\1\2\60\uffff}>";
    static final String[] DFA120_transitionS = {
            "\2\2\25\uffff\2\2\10\uffff\1\1\13\uffff\1\2\31\uffff\4\2\20"+
            "\uffff\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\2\2\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "\3\2\17\uffff\2\2\4\uffff\2\2\6\uffff\1\2\1\uffff\52\2\20\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\2\1\3\2\uffff\1\2\1\uffff\3\2\11\uffff\4\2",
            "",
            "\1\17\1\16\25\uffff\1\24\1\25\10\uffff\1\4\13\uffff\1\10\31"+
            "\uffff\1\11\1\12\1\15\1\21\20\uffff\2\5\1\uffff\2\6\1\uffff"+
            "\1\27\6\uffff\1\30\1\uffff\1\26\3\uffff\1\20\2\uffff\1\23\1"+
            "\uffff\3\22\11\uffff\1\7\1\13\1\14",
            "\1\uffff",
            "\1\40\21\uffff\1\34\1\35\12\uffff\1\66\1\uffff\1\31\2\uffff"+
            "\1\51\1\52\1\53\1\55\1\46\1\50\1\45\1\47\1\41\1\36\1\37\1\33"+
            "\1\32\16\uffff\1\63\1\61\1\62\1\60\1\57\1\54\1\56\1\43\1\44"+
            "\1\42\33\uffff\1\65\2\uffff\1\2\7\uffff\1\64",
            "\1\40\21\uffff\1\34\1\35\12\uffff\1\66\1\uffff\1\31\2\uffff"+
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

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "862:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_4 = input.LA(1);

                         
                        int index120_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index120_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_5 = input.LA(1);

                         
                        int index120_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_5==DOT) ) {s = 25;}

                        else if ( (LA120_5==POWER) ) {s = 26;}

                        else if ( (LA120_5==STAR) ) {s = 27;}

                        else if ( (LA120_5==DIV) ) {s = 28;}

                        else if ( (LA120_5==MOD) ) {s = 29;}

                        else if ( (LA120_5==PLUS) ) {s = 30;}

                        else if ( (LA120_5==MINUS) ) {s = 31;}

                        else if ( (LA120_5==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA120_5==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA120_5==BAND) ) {s = 34;}

                        else if ( (LA120_5==BXOR) ) {s = 35;}

                        else if ( (LA120_5==BOR) ) {s = 36;}

                        else if ( (LA120_5==LESS_THAN) ) {s = 37;}

                        else if ( (LA120_5==GREATER_THAN) ) {s = 38;}

                        else if ( (LA120_5==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA120_5==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA120_5==COMPARE) ) {s = 41;}

                        else if ( (LA120_5==EQUAL) ) {s = 42;}

                        else if ( (LA120_5==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA120_5==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA120_5==MATCH) ) {s = 45;}

                        else if ( (LA120_5==NOT_MATCH) ) {s = 46;}

                        else if ( (LA120_5==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA120_5==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA120_5==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA120_5==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA120_5==QUESTION) ) {s = 51;}

                        else if ( (LA120_5==COMMA) ) {s = 52;}

                        else if ( (LA120_5==ASSOC) ) {s = 2;}

                        else if ( (LA120_5==RCURLY) && (synpred7())) {s = 53;}

                        else if ( (LA120_5==LINE_BREAK) && (synpred7())) {s = 54;}

                         
                        input.seek(index120_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_6 = input.LA(1);

                         
                        int index120_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_6==DOT) ) {s = 25;}

                        else if ( (LA120_6==POWER) ) {s = 26;}

                        else if ( (LA120_6==STAR) ) {s = 27;}

                        else if ( (LA120_6==DIV) ) {s = 28;}

                        else if ( (LA120_6==MOD) ) {s = 29;}

                        else if ( (LA120_6==PLUS) ) {s = 30;}

                        else if ( (LA120_6==MINUS) ) {s = 31;}

                        else if ( (LA120_6==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA120_6==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA120_6==BAND) ) {s = 34;}

                        else if ( (LA120_6==BXOR) ) {s = 35;}

                        else if ( (LA120_6==BOR) ) {s = 36;}

                        else if ( (LA120_6==LESS_THAN) ) {s = 37;}

                        else if ( (LA120_6==GREATER_THAN) ) {s = 38;}

                        else if ( (LA120_6==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA120_6==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA120_6==COMPARE) ) {s = 41;}

                        else if ( (LA120_6==EQUAL) ) {s = 42;}

                        else if ( (LA120_6==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA120_6==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA120_6==MATCH) ) {s = 45;}

                        else if ( (LA120_6==NOT_MATCH) ) {s = 46;}

                        else if ( (LA120_6==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA120_6==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA120_6==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA120_6==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA120_6==QUESTION) ) {s = 51;}

                        else if ( (LA120_6==COMMA) ) {s = 52;}

                        else if ( (LA120_6==RCURLY) && (synpred7())) {s = 53;}

                        else if ( (LA120_6==LINE_BREAK) && (synpred7())) {s = 54;}

                        else if ( (LA120_6==ASSOC) ) {s = 2;}

                         
                        input.seek(index120_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA120_3 = input.LA(1);

                         
                        int index120_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_3==ID) ) {s = 4;}

                        else if ( ((LA120_3>=SINGLE_QUOTE_STRING_SIMPLE && LA120_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 5;}

                        else if ( ((LA120_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA120_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 6;}

                        else if ( (LA120_3==139) && (synpred7())) {s = 7;}

                        else if ( (LA120_3==STAR) && (synpred7())) {s = 8;}

                        else if ( (LA120_3==BNOT) && (synpred7())) {s = 9;}

                        else if ( (LA120_3==NOT) && (synpred7())) {s = 10;}

                        else if ( (LA120_3==140) && (synpred7())) {s = 11;}

                        else if ( (LA120_3==141) && (synpred7())) {s = 12;}

                        else if ( (LA120_3==INT) && (synpred7())) {s = 13;}

                        else if ( (LA120_3==FLOAT) && (synpred7())) {s = 14;}

                        else if ( (LA120_3==HEREDOC_STRING) && (synpred7())) {s = 15;}

                        else if ( (LA120_3==COLON) && (synpred7())) {s = 16;}

                        else if ( (LA120_3==REGEX) && (synpred7())) {s = 17;}

                        else if ( ((LA120_3>=127 && LA120_3<=129)) && (synpred7())) {s = 18;}

                        else if ( (LA120_3==125) && (synpred7())) {s = 19;}

                        else if ( (LA120_3==IF_MODIFIER) && (synpred7())) {s = 20;}

                        else if ( (LA120_3==UNLESS_MODIFIER) && (synpred7())) {s = 21;}

                        else if ( (LA120_3==LBRACK) && (synpred7())) {s = 22;}

                        else if ( (LA120_3==LCURLY) && (synpred7())) {s = 23;}

                        else if ( (LA120_3==LPAREN) && (synpred7())) {s = 24;}

                         
                        input.seek(index120_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program277 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_statement_list_in_program281 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_terminal_in_program283 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list308 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list311 = new BitSet(new long[]{0x0200231800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_statement_in_statement_list314 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_expression_in_statement344 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement347 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_set_in_modifier_line387 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_line_break_in_modifier_line401 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_expression_in_modifier_line405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_block_expression480 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_body_in_block_expression482 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_block_expression484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body491 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_statement_list_in_body495 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_terminal_in_body497 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression520 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_expression_in_if_expression525 = new BitSet(new long[]{0x0000020000000000L,0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_seperator_in_if_expression527 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6FL});
    public static final BitSet FOLLOW_body_in_if_expression540 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_130_in_if_expression543 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_expression_in_if_expression547 = new BitSet(new long[]{0x0000020000000000L,0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_seperator_in_if_expression549 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6FL});
    public static final BitSet FOLLOW_body_in_if_expression553 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_131_in_if_expression567 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_body_in_if_expression571 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_if_expression584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator636 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator639 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator641 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator646 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_seperator649 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator651 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression661 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression663 = new BitSet(new long[]{0x0000020000000000L,0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_unless_expression666 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6BL});
    public static final BitSet FOLLOW_COLON_in_unless_expression668 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6BL});
    public static final BitSet FOLLOW_line_break_in_unless_expression670 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6BL});
    public static final BitSet FOLLOW_body_in_unless_expression682 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_unless_expression695 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_body_in_unless_expression697 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_unless_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_expression774 = new BitSet(new long[]{0x07FFE0006000C800L,0x01000000000F0000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fitem_in_expression777 = new BitSet(new long[]{0x07FFE0006000C800L,0x01000000000F0000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fitem_in_expression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_methodDefinition799 = new BitSet(new long[]{0x000022000000C000L,0x0010000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition803 = new BitSet(new long[]{0x000022000000C000L,0x0010000000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition809 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition811 = new BitSet(new long[]{0x000020000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition815 = new BitSet(new long[]{0x0200230000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition819 = new BitSet(new long[]{0x0200231800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition822 = new BitSet(new long[]{0x0200231800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition828 = new BitSet(new long[]{0x0000030000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition832 = new BitSet(new long[]{0x0000030000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_methodDefinition837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_variable_in_singleton848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton850 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_expression_in_singleton853 = new BitSet(new long[]{0x0000020000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton855 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist914 = new BitSet(new long[]{0x0200220000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist916 = new BitSet(new long[]{0x0000020000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist920 = new BitSet(new long[]{0x0000020000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist943 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args957 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args959 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args962 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args965 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args978 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args980 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args994 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args997 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1048 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args1072 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args1074 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_f_opt_args1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_136_in_andorExpression1291 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1296 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_137_in_andorExpression1307 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1312 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_138_in_notExpression1345 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1352 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_definedExpression1382 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_definedExpression_in_definedExpression1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1419 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1423 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_assignmentExpression1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_assignmentExpression1446 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1448 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_simple_assignment_expression1491 = new BitSet(new long[]{0xF800000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_set_in_simple_assignment_expression1493 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_definedExpression_in_simple_assignment_expression1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_mlhs1561 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1566 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_lhs_in_mlhs1571 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1578 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_lhs1602 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_lhs_in_star_lhs1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_mrhs1634 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_mrhs1636 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1646 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_mrhs1656 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_mrhs1658 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1664 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_star_rhs_in_mrhs1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_rhs_in_mrhs1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_rhs1705 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_definedExpression_in_star_rhs1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1735 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1738 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1740 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1779 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1783 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1794 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1798 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1865 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1870 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1931 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1936 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1965 = new BitSet(new long[]{0x0003C00000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1999 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2004 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression2015 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2021 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression2032 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2036 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression2047 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2052 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression2063 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2069 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression2080 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2085 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2100 = new BitSet(new long[]{0x0003C00000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2121 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression2155 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2161 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression2172 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2177 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression2188 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2193 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2204 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2208 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2223 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression2277 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2283 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_BOR_in_orExpression2294 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2300 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2367 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2373 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2404 = new BitSet(new long[]{0x0040000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2438 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2443 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2454 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2458 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2473 = new BitSet(new long[]{0x0040000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2495 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2529 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2536 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2547 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2554 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2569 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2589 = new BitSet(new long[]{0x0200000060000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2623 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2629 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2640 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2646 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2657 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2663 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2678 = new BitSet(new long[]{0x0200000060000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2699 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2734 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2740 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2749 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2771 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2777 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2787 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2793 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_command_in_bnotExpression2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_command2826 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_141_in_command2830 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_literal_in_command2833 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2835 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2838 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2840 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2842 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_atom_in_command2844 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_LPAREN_in_command2849 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_expression_in_command2851 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_command2853 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DOT_in_command2858 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_method_in_command2861 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_array_in_atom2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_atom2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_atom2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_atom2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_atom2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_variable_in_variable2919 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_variable2923 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000600000L,0x0000000000003003L});
    public static final BitSet FOLLOW_array_items_in_variable2926 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_variable2928 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_simple_variable2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2970 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_method2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method3006 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_open_args_with_block_in_method3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_block3036 = new BitSet(new long[]{0x0200201800003000L,0xE4502D80007A0000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_block_content_in_block3041 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_block3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block3050 = new BitSet(new long[]{0x0200201800003000L,0xA4506D80007A0000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_block_content_in_block3055 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RCURLY_in_block3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOR_in_block_content3068 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_block_param_in_block_content3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BOR_in_block_content3072 = new BitSet(new long[]{0x0200201800003002L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_block_body_in_block_content3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_block_param3085 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_block_param3088 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_block_param3090 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_bodyStatement_in_block_body3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args_with_block3123 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_call_args_in_open_args_with_block3126 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args_with_block3128 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_open_args_with_block3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args_with_block3137 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args_with_block3140 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_open_args_with_block3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args_with_block3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args3195 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args3198 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_args3201 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation23251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation23255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation23259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation23263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation33279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation33283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation33287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_literal3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_string4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_string4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_string4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_single_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_double_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array4476 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000600000L,0x0000000000003003L});
    public static final BitSet FOLLOW_array_items_in_array4479 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_item_in_array_items4493 = new BitSet(new long[]{0x0000020000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array_items4496 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000600000L,0x0000000000003003L});
    public static final BitSet FOLLOW_array_item_in_array_items4499 = new BitSet(new long[]{0x0000020000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_trailer_in_array_items4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_array_item4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash4522 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_assoc_list_in_hash4525 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list4536 = new BitSet(new long[]{0x0000020000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs4547 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs4551 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_assoc_in_assocs4554 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_assoc4581 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COLON_in_assoc4583 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_assoc4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_assoc4590 = new BitSet(new long[]{0x0000000000000000L,0x0202000000000000L});
    public static final BitSet FOLLOW_set_in_assoc4592 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_assoc4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_symbol_name_in_assoc4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_symbol4661 = new BitSet(new long[]{0x0000200000000000L,0x00000D8000000000L});
    public static final BitSet FOLLOW_ID_in_symbol4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_symbol4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_symbol4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_synpred11432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_synpred21441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_synpred31651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred42962 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred42964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred53123 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_call_args_in_synpred53126 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred53128 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred53131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred63137 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred63140 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred63143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_synpred74573 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred74575 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_synpred74577 = new BitSet(new long[]{0x0000000000000002L});

}