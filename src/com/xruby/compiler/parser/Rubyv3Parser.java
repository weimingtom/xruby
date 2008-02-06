// $ANTLR 3.0.1 F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-06 14:45:35

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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:1: statement : statement_expression ( modifier_line )* -> ^( STATEMENT statement_expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_expression_return statement_expression7 = null;

        modifier_line_return modifier_line8 = null;


        RewriteRuleSubtreeStream stream_statement_expression=new RewriteRuleSubtreeStream(adaptor,"rule statement_expression");
        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:2: ( statement_expression ( modifier_line )* -> ^( STATEMENT statement_expression ( modifier_line )* ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:4: statement_expression ( modifier_line )*
            {
            pushFollow(FOLLOW_statement_expression_in_statement344);
            statement_expression7=statement_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement_expression.add(statement_expression7.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:25: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:26: modifier_line
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
            // elements: modifier_line, statement_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:43: -> ^( STATEMENT statement_expression ( modifier_line )* )
            {
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:46: ^( STATEMENT statement_expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_statement_expression.next());
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:79: ( modifier_line )*
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:306:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* statement_expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        statement_expression_return statement_expression11 = null;


        Object set9_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:2: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* statement_expression )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* statement_expression
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

            pushFollow(FOLLOW_statement_expression_in_modifier_line405);
            statement_expression11=statement_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, statement_expression11.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:1: if_expression : 'if' e0= statement_expression seperator body0= body ( 'elsif' e1= statement_expression seperator body1+= body )* ( 'else' ( LINE_BREAK )* body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
    public final if_expression_return if_expression() throws RecognitionException {
        if_expression_return retval = new if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal19=null;
        Token string_literal21=null;
        Token string_literal23=null;
        Token LINE_BREAK24=null;
        Token string_literal25=null;
        List list_body1=null;
        statement_expression_return e0 = null;

        body_return body0 = null;

        statement_expression_return e1 = null;

        body_return body2 = null;

        seperator_return seperator20 = null;

        seperator_return seperator22 = null;

        RuleReturnScope body1 = null;
        Object string_literal19_tree=null;
        Object string_literal21_tree=null;
        Object string_literal23_tree=null;
        Object LINE_BREAK24_tree=null;
        Object string_literal25_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_LINE_BREAK=new RewriteRuleTokenStream(adaptor,"token LINE_BREAK");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_statement_expression=new RewriteRuleSubtreeStream(adaptor,"rule statement_expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:2: ( 'if' e0= statement_expression seperator body0= body ( 'elsif' e1= statement_expression seperator body1+= body )* ( 'else' ( LINE_BREAK )* body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:4: 'if' e0= statement_expression seperator body0= body ( 'elsif' e1= statement_expression seperator body1+= body )* ( 'else' ( LINE_BREAK )* body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression520); if (failed) return retval;
            if ( backtracking==0 ) stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_statement_expression_in_if_expression525);
            e0=statement_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement_expression.add(e0.getTree());
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:21: ( 'elsif' e1= statement_expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==130) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:22: 'elsif' e1= statement_expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,130,FOLLOW_130_in_if_expression543); if (failed) return retval;
            	    if ( backtracking==0 ) stream_130.add(string_literal21);

            	    pushFollow(FOLLOW_statement_expression_in_if_expression547);
            	    e1=statement_expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_statement_expression.add(e1.getTree());
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

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:10: ( 'else' ( LINE_BREAK )* body2= body )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==131) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:11: 'else' ( LINE_BREAK )* body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_if_expression567); if (failed) return retval;
                    if ( backtracking==0 ) stream_131.add(string_literal23);

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:18: ( LINE_BREAK )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==LINE_BREAK) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:333:18: LINE_BREAK
                    	    {
                    	    LINE_BREAK24=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_if_expression569); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK24);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    pushFollow(FOLLOW_body_in_if_expression574);
                    body2=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal25=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_if_expression587); if (failed) return retval;
            if ( backtracking==0 ) stream_126.add(string_literal25);


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

        Token LINE_BREAK26=null;
        Token char_literal27=null;
        Token LINE_BREAK28=null;
        Token LINE_BREAK29=null;
        Token string_literal30=null;
        Token LINE_BREAK31=null;

        Object LINE_BREAK26_tree=null;
        Object char_literal27_tree=null;
        Object LINE_BREAK28_tree=null;
        Object LINE_BREAK29_tree=null;
        Object string_literal30_tree=null;
        Object LINE_BREAK31_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:2: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:3: ( LINE_BREAK )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK26=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator639); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK26_tree = (Object)adaptor.create(LINE_BREAK26);
                    	    adaptor.addChild(root_0, LINE_BREAK26_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal27=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator642); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal27_tree = (Object)adaptor.create(char_literal27);
                    adaptor.addChild(root_0, char_literal27_tree);
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:19: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator644); if (failed) return retval;
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


                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK29=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator649); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK29_tree = (Object)adaptor.create(LINE_BREAK29);
                    	    adaptor.addChild(root_0, LINE_BREAK29_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    string_literal30=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_seperator652); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal30_tree = (Object)adaptor.create(string_literal30);
                    adaptor.addChild(root_0, string_literal30_tree);
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:52: ( LINE_BREAK )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==LINE_BREAK) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK31=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator654); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    LINE_BREAK31_tree = (Object)adaptor.create(LINE_BREAK31);
                    	    adaptor.addChild(root_0, LINE_BREAK31_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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

        Token string_literal32=null;
        Token string_literal34=null;
        Token char_literal35=null;
        Token string_literal38=null;
        Token string_literal40=null;
        boolean_expression_return boolean_expression33 = null;

        line_break_return line_break36 = null;

        body_return body37 = null;

        body_return body39 = null;


        Object string_literal32_tree=null;
        Object string_literal34_tree=null;
        Object char_literal35_tree=null;
        Object string_literal38_tree=null;
        Object string_literal40_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:2: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal32=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression664); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal32_tree = (Object)adaptor.create(string_literal32);
            adaptor.addChild(root_0, string_literal32_tree);
            }
            pushFollow(FOLLOW_boolean_expression_in_unless_expression666);
            boolean_expression33=boolean_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression33.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:32: ( 'then' | ':' | line_break )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt19=1;
                }
                break;
            case COLON:
                {
                alt19=2;
                }
                break;
            case LINE_BREAK:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("340:32: ( 'then' | ':' | line_break )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:33: 'then'
                    {
                    string_literal34=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_unless_expression669); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal34_tree = (Object)adaptor.create(string_literal34);
                    adaptor.addChild(root_0, string_literal34_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:40: ':'
                    {
                    char_literal35=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression671); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression673);
                    line_break36=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break36.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression685);
            body37=body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, body37.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:10: ( 'else' body )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==131) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:11: 'else' body
                    {
                    string_literal38=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_unless_expression698); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal38_tree = (Object)adaptor.create(string_literal38);
                    adaptor.addChild(root_0, string_literal38_tree);
                    }
                    pushFollow(FOLLOW_body_in_unless_expression700);
                    body39=body();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, body39.getTree());

                    }
                    break;

            }

            string_literal40=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_unless_expression713); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal40_tree = (Object)adaptor.create(string_literal40);
            adaptor.addChild(root_0, string_literal40_tree);
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

        Token SEMI41=null;
        line_break_return line_break42 = null;


        Object SEMI41_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:9: ( SEMI | line_break )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SEMI) ) {
                alt21=1;
            }
            else if ( (LA21_0==LINE_BREAK) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("344:1: terminal : ( SEMI | line_break );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI41=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal719); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal722);
                    line_break42=line_break();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, line_break42.getTree());

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

        Token LINE_BREAK43=null;

        Object LINE_BREAK43_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:2: ( LINE_BREAK )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK43=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break732); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

    public static class statement_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement_expression
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:1: statement_expression : ( 'alias' fitem fitem | andorStatement | primaryExpression );
    public final statement_expression_return statement_expression() throws RecognitionException {
        statement_expression_return retval = new statement_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        fitem_return fitem45 = null;

        fitem_return fitem46 = null;

        andorStatement_return andorStatement47 = null;

        primaryExpression_return primaryExpression48 = null;


        Object string_literal44_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:2: ( 'alias' fitem fitem | andorStatement | primaryExpression )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt22=1;
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
                alt22=2;
                }
                break;
            case 134:
                {
                alt22=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("378:1: statement_expression : ( 'alias' fitem fitem | andorStatement | primaryExpression );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal44=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_statement_expression777); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal44_tree = (Object)adaptor.create(string_literal44);
                    root_0 = (Object)adaptor.becomeRoot(string_literal44_tree, root_0);
                    }
                    pushFollow(FOLLOW_fitem_in_statement_expression780);
                    fitem45=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem45.getTree());
                    pushFollow(FOLLOW_fitem_in_statement_expression782);
                    fitem46=fitem();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fitem46.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:26: andorStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorStatement_in_statement_expression784);
                    andorStatement47=andorStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, andorStatement47.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:41: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_statement_expression786);
                    primaryExpression48=primaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, primaryExpression48.getTree());

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
    // $ANTLR end statement_expression

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

        methodDefinition_return methodDefinition49 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:2: ( methodDefinition )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodDefinition_in_primaryExpression794);
            methodDefinition49=methodDefinition();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodDefinition49.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token string_literal50=null;
        Token LINE_BREAK51=null;
        Token string_literal59=null;
        singleton_return singleton52 = null;

        dot_or_colon_return dot_or_colon53 = null;

        methodName_return methodName54 = null;

        f_arglist_return f_arglist55 = null;

        terminal_return terminal56 = null;

        bodyStatement_return bodyStatement57 = null;

        terminal_return terminal58 = null;


        Object string_literal50_tree=null;
        Object LINE_BREAK51_tree=null;
        Object string_literal59_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:2: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal50=(Token)input.LT(1);
            match(input,134,FOLLOW_134_in_methodDefinition802); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal50_tree = (Object)adaptor.create(string_literal50);
            root_0 = (Object)adaptor.becomeRoot(string_literal50_tree, root_0);
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:11: ( LINE_BREAK )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==LINE_BREAK) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:12: LINE_BREAK
            	    {
            	    LINE_BREAK51=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition806); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:26: ( singleton dot_or_colon )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=DOT && LA24_1<=COLON2)) ) {
                    alt24=1;
                }
            }
            else if ( (LA24_0==LPAREN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition812);
                    singleton52=singleton();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleton52.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition814);
                    dot_or_colon53=dot_or_colon();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dot_or_colon53.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_methodName_in_methodDefinition818);
            methodName54=methodName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, methodName54.getTree());
            if ( backtracking==0 ) {
              enterScope();
            }
            pushFollow(FOLLOW_f_arglist_in_methodDefinition822);
            f_arglist55=f_arglist();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, f_arglist55.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:89: ( terminal )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SEMI) ) {
                    alt25=1;
                }
                else if ( (LA25_0==LINE_BREAK) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition825);
            	    terminal56=terminal();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:103: ( bodyStatement )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=HEREDOC_STRING && LA26_0<=FLOAT)||(LA26_0>=IF_MODIFIER && LA26_0<=UNLESS_MODIFIER)||LA26_0==ID||LA26_0==STAR||(LA26_0>=BNOT && LA26_0<=REGEX)||(LA26_0>=SINGLE_QUOTE_STRING_SIMPLE && LA26_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA26_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA26_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA26_0==LCURLY||LA26_0==LPAREN||LA26_0==LBRACK||LA26_0==COLON||LA26_0==125||(LA26_0>=127 && LA26_0<=129)||(LA26_0>=133 && LA26_0<=134)||(LA26_0>=138 && LA26_0<=141)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition831);
                    bodyStatement57=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement57.getTree());

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:118: ( terminal )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=SEMI && LA27_0<=LINE_BREAK)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition835);
            	    terminal58=terminal();
            	    _fsp--;
            	    if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            string_literal59=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_methodDefinition840); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:1: singleton : ( simple_variable | '(' statement_expression opt_nl ')' );
    public final singleton_return singleton() throws RecognitionException {
        singleton_return retval = new singleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal61=null;
        Token char_literal64=null;
        simple_variable_return simple_variable60 = null;

        statement_expression_return statement_expression62 = null;

        opt_nl_return opt_nl63 = null;


        Object char_literal61_tree=null;
        Object char_literal64_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:2: ( simple_variable | '(' statement_expression opt_nl ')' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==LPAREN) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("384:1: singleton : ( simple_variable | '(' statement_expression opt_nl ')' );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:4: simple_variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_variable_in_singleton851);
                    simple_variable60=simple_variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, simple_variable60.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:20: '(' statement_expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal61=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton853); if (failed) return retval;
                    pushFollow(FOLLOW_statement_expression_in_singleton856);
                    statement_expression62=statement_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_expression62.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton858);
                    opt_nl63=opt_nl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, opt_nl63.getTree());
                    char_literal64=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton860); if (failed) return retval;

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

        Token LINE_BREAK65=null;

        Object LINE_BREAK65_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:15: ( | LINE_BREAK )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RPAREN) ) {
                alt29=1;
            }
            else if ( (LA29_0==LINE_BREAK) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("386:1: opt_nl : ( | LINE_BREAK );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
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

                    LINE_BREAK65=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl879); if (failed) return retval;

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

        Token set66=null;

        Object set66_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:2: ( DOT | COLON2 )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set66=(Token)input.LT(1);
            if ( (input.LA(1)>=DOT && input.LA(1)<=COLON2) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set66));
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

        Token set67=null;

        Object set67_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:2: ( ID | CONSTANT | FID )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set67=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set67));
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

        Token char_literal68=null;
        Token LINE_BREAK70=null;
        Token char_literal71=null;
        f_args_return f_args69 = null;

        f_args_return f_args72 = null;

        terminal_return terminal73 = null;


        Object char_literal68_tree=null;
        Object LINE_BREAK70_tree=null;
        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LINE_BREAK=new RewriteRuleTokenStream(adaptor,"token LINE_BREAK");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_f_args=new RewriteRuleSubtreeStream(adaptor,"rule f_args");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:2: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LPAREN) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=SEMI && LA31_0<=LINE_BREAK)||LA31_0==ID||LA31_0==STAR) ) {
                alt31=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("392:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal68=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist917); if (failed) return retval;
                    if ( backtracking==0 ) stream_LPAREN.add(char_literal68);

                    pushFollow(FOLLOW_f_args_in_f_arglist919);
                    f_args69=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_f_args.add(f_args69.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:16: ( LINE_BREAK )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==LINE_BREAK) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK70=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist923); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_LINE_BREAK.add(LINE_BREAK70);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    char_literal71=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist927); if (failed) return retval;
                    if ( backtracking==0 ) stream_RPAREN.add(char_literal71);


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

                    pushFollow(FOLLOW_f_args_in_f_arglist946);
                    f_args72=f_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_args72.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist948);
                    terminal73=terminal();
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

        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal81=null;
        Token char_literal84=null;
        f_norm_args_return f_norm_args74 = null;

        f_norm_args_return f_norm_args75 = null;

        f_opt_args_return f_opt_args77 = null;

        f_rest_arg_return f_rest_arg79 = null;

        f_norm_args_return f_norm_args80 = null;

        f_rest_arg_return f_rest_arg82 = null;

        f_opt_args_return f_opt_args83 = null;

        f_rest_arg_return f_rest_arg85 = null;

        f_rest_arg_return f_rest_arg86 = null;


        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object char_literal81_tree=null;
        Object char_literal84_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:8: ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
            int alt34=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case ASSIGN:
                    {
                    alt34=5;
                    }
                    break;
                case SEMI:
                case LINE_BREAK:
                case RPAREN:
                    {
                    alt34=1;
                    }
                    break;
                case COMMA:
                    {
                    int LA34_6 = input.LA(3);

                    if ( (LA34_6==ID) ) {
                        alt34=2;
                    }
                    else if ( (LA34_6==STAR) ) {
                        alt34=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 34, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 34, 1, input);

                    throw nvae;
                }

                }
                break;
            case SEMI:
            case LINE_BREAK:
            case RPAREN:
                {
                alt34=3;
                }
                break;
            case STAR:
                {
                alt34=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("395:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args ( ',' f_rest_arg )? | | f_norm_args ',' f_rest_arg | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args956);
                    f_norm_args74=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args74.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:24: f_norm_args ',' f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args960);
                    f_norm_args75=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args75.getTree());
                    char_literal76=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args962); if (failed) return retval;
                    pushFollow(FOLLOW_f_opt_args_in_f_args965);
                    f_opt_args77=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args77.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:52: ( ',' f_rest_arg )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:53: ',' f_rest_arg
                            {
                            char_literal78=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args968); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args971);
                            f_rest_arg79=f_rest_arg();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg79.getTree());

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

                    pushFollow(FOLLOW_f_norm_args_in_f_args981);
                    f_norm_args80=f_norm_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_norm_args80.getTree());
                    char_literal81=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args983); if (failed) return retval;
                    pushFollow(FOLLOW_f_rest_arg_in_f_args986);
                    f_rest_arg82=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg82.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_opt_args_in_f_args997);
                    f_opt_args83=f_opt_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_opt_args83.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:21: ( ',' f_rest_arg )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==COMMA) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:22: ',' f_rest_arg
                            {
                            char_literal84=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args1000); if (failed) return retval;
                            pushFollow(FOLLOW_f_rest_arg_in_f_args1003);
                            f_rest_arg85=f_rest_arg();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg85.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_rest_arg_in_f_args1010);
                    f_rest_arg86=f_rest_arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, f_rest_arg86.getTree());

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

        Token ID87=null;

        Object ID87_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:2: ( ID )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:2: ID
            {
            root_0 = (Object)adaptor.nil();

            ID87=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args1041); if (failed) return retval;
            if ( backtracking==0 ) {
            ID87_tree = (Object)adaptor.create(ID87);
            adaptor.addChild(root_0, ID87_tree);
            }
            if ( backtracking==0 ) {
              addVariable(ID87.getText());
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

        Token char_literal88=null;
        Token ID89=null;
        Token char_literal90=null;

        Object char_literal88_tree=null;
        Object ID89_tree=null;
        Object char_literal90_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:2: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==STAR) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==ID) ) {
                    alt35=1;
                }
                else if ( ((LA35_1>=SEMI && LA35_1<=LINE_BREAK)||LA35_1==RPAREN) ) {
                    alt35=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("406:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("406:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal88=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1051); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal88_tree = (Object)adaptor.create(char_literal88);
                    root_0 = (Object)adaptor.becomeRoot(char_literal88_tree, root_0);
                    }
                    ID89=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg1054); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID89_tree = (Object)adaptor.create(ID89);
                    adaptor.addChild(root_0, ID89_tree);
                    }
                    if ( backtracking==0 ) {
                      addVariable(ID89.getText());
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:38: '*'
                    {
                    char_literal90=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg1059); if (failed) return retval;
                    if ( backtracking==0 ) stream_STAR.add(char_literal90);


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

        Token ID91=null;
        Token char_literal92=null;
        arg_return arg93 = null;


        Object ID91_tree=null;
        Object char_literal92_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:2: ( ID '=' arg )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();

            ID91=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args1075); if (failed) return retval;
            if ( backtracking==0 ) {
            ID91_tree = (Object)adaptor.create(ID91);
            adaptor.addChild(root_0, ID91_tree);
            }
            char_literal92=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args1077); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal92_tree = (Object)adaptor.create(char_literal92);
            root_0 = (Object)adaptor.becomeRoot(char_literal92_tree, root_0);
            }
            pushFollow(FOLLOW_arg_in_f_opt_args1080);
            arg93=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg93.getTree());
            if ( backtracking==0 ) {
              addVariable(ID91.getText());
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

        statement_list_return statement_list94 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:2: ( statement_list -> ^( BODY statement_list ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1092);
            statement_list94=statement_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement_list.add(statement_list94.getTree());

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

        fname_return fname95 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:7: ( fname )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem1110);
            fname95=fname();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, fname95.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token ID96=null;
        Token CONSTANT97=null;
        Token FID98=null;
        op_return op99 = null;


        Object ID96_tree=null;
        Object CONSTANT97_tree=null;
        Object FID98_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:7: ( ID | CONSTANT | FID | op )
            int alt36=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt36=1;
                }
                break;
            case CONSTANT:
                {
                alt36=2;
                }
                break;
            case FID:
                {
                alt36=3;
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
                alt36=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("416:1: fname : ( ID | CONSTANT | FID | op );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID96=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1117); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID96_tree = (Object)adaptor.create(ID96);
                    adaptor.addChild(root_0, ID96_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT97=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1119); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT97_tree = (Object)adaptor.create(CONSTANT97);
                    adaptor.addChild(root_0, CONSTANT97_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID98=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1121); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID98_tree = (Object)adaptor.create(FID98);
                    adaptor.addChild(root_0, FID98_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname1123);
                    op99=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op99.getTree());

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

        Token set100=null;

        Object set100_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:15: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set100=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==135 ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set100));
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

    public static class andorStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andorStatement
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:1: andorStatement : notStatement ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notStatement )* ;
    public final andorStatement_return andorStatement() throws RecognitionException {
        andorStatement_return retval = new andorStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal102=null;
        Token LINE_BREAK103=null;
        Token string_literal104=null;
        Token LINE_BREAK105=null;
        notStatement_return notStatement101 = null;

        notStatement_return notStatement106 = null;


        Object string_literal102_tree=null;
        Object LINE_BREAK103_tree=null;
        Object string_literal104_tree=null;
        Object LINE_BREAK105_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:3: ( notStatement ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notStatement )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:5: notStatement ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notStatement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notStatement_in_andorStatement1284);
            notStatement101=notStatement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, notStatement101.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:18: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notStatement )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=136 && LA40_0<=137)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notStatement
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==136) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==137) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("430:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal102=(Token)input.LT(1);
            	            match(input,136,FOLLOW_136_in_andorStatement1294); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal102_tree = (Object)adaptor.create(string_literal102);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal102_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:15: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK103=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorStatement1299); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal104=(Token)input.LT(1);
            	            match(input,137,FOLLOW_137_in_andorStatement1310); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal104_tree = (Object)adaptor.create(string_literal104);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal104_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:14: ( LINE_BREAK )*
            	            loop38:
            	            do {
            	                int alt38=2;
            	                int LA38_0 = input.LA(1);

            	                if ( (LA38_0==LINE_BREAK) ) {
            	                    alt38=1;
            	                }


            	                switch (alt38) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK105=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorStatement1315); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop38;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notStatement_in_andorStatement1330);
            	    notStatement106=notStatement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, notStatement106.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end andorStatement

    public static class notStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start notStatement
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:1: notStatement : ( 'not' ( LINE_BREAK )* notStatement | definedExpression[true] );
    public final notStatement_return notStatement() throws RecognitionException {
        notStatement_return retval = new notStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal107=null;
        Token LINE_BREAK108=null;
        notStatement_return notStatement109 = null;

        definedExpression_return definedExpression110 = null;


        Object string_literal107_tree=null;
        Object LINE_BREAK108_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:3: ( 'not' ( LINE_BREAK )* notStatement | definedExpression[true] )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==138) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||LA42_0==ID||LA42_0==STAR||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING_SIMPLE && LA42_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA42_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA42_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA42_0==LCURLY||LA42_0==LPAREN||LA42_0==LBRACK||LA42_0==COLON||LA42_0==125||(LA42_0>=127 && LA42_0<=129)||(LA42_0>=139 && LA42_0<=141)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("436:1: notStatement : ( 'not' ( LINE_BREAK )* notStatement | definedExpression[true] );", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:5: 'not' ( LINE_BREAK )* notStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal107=(Token)input.LT(1);
                    match(input,138,FOLLOW_138_in_notStatement1348); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal107_tree = (Object)adaptor.create(string_literal107);
                    root_0 = (Object)adaptor.becomeRoot(string_literal107_tree, root_0);
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:4: ( LINE_BREAK )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==LINE_BREAK) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK108=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notStatement1355); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notStatement_in_notStatement1363);
                    notStatement109=notStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, notStatement109.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:5: definedExpression[true]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notStatement1369);
                    definedExpression110=definedExpression(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression110.getTree());

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
    // $ANTLR end notStatement

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

        Token string_literal111=null;
        definedExpression_return definedExpression112 = null;

        assignmentExpression_return assignmentExpression113 = null;


        Object string_literal111_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:2: ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==139) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=HEREDOC_STRING && LA43_0<=FLOAT)||(LA43_0>=IF_MODIFIER && LA43_0<=UNLESS_MODIFIER)||LA43_0==ID||LA43_0==STAR||(LA43_0>=BNOT && LA43_0<=REGEX)||(LA43_0>=SINGLE_QUOTE_STRING_SIMPLE && LA43_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA43_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA43_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA43_0==LCURLY||LA43_0==LPAREN||LA43_0==LBRACK||LA43_0==COLON||LA43_0==125||(LA43_0>=127 && LA43_0<=129)||(LA43_0>=140 && LA43_0<=141)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("442:1: definedExpression[boolean allowsMrhsInSingleAssignment] : ( ( 'defined?' ) definedExpression[false] | assignmentExpression[allowsMrhsInSingleAssignment] );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:4: ( 'defined?' ) definedExpression[false]
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:4: ( 'defined?' )
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:5: 'defined?'
                    {
                    string_literal111=(Token)input.LT(1);
                    match(input,139,FOLLOW_139_in_definedExpression1385); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal111_tree = (Object)adaptor.create(string_literal111);
                    root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);
                    }

                    }

                    pushFollow(FOLLOW_definedExpression_in_definedExpression1389);
                    definedExpression112=definedExpression(false);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression112.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:10: assignmentExpression[allowsMrhsInSingleAssignment]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1401);
                    assignmentExpression113=assignmentExpression(allowsMrhsInSingleAssignment);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression113.getTree());

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

        Token ASSIGN115=null;
        Token ASSIGN119=null;
        lhs_return lhs114 = null;

        mrhs_return mrhs116 = null;

        simple_assignment_expression_return simple_assignment_expression117 = null;

        mlhs_return mlhs118 = null;

        mrhs_return mrhs120 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression121 = null;


        Object ASSIGN115_tree=null;
        Object ASSIGN119_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:2: ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression )
            int alt44=4;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==COMMA) ) {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        int LA44_7 = input.LA(4);

                        if ( (synpred2()) ) {
                            alt44=3;
                        }
                        else if ( (true) ) {
                            alt44=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 7, input);

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
                        alt44=4;
                        }
                        break;
                    case STAR:
                        {
                        int LA44_8 = input.LA(4);

                        if ( (LA44_8==ID) ) {
                            int LA44_10 = input.LA(5);

                            if ( (synpred2()) ) {
                                alt44=3;
                            }
                            else if ( (true) ) {
                                alt44=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 10, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA44_8>=HEREDOC_STRING && LA44_8<=FLOAT)||(LA44_8>=IF_MODIFIER && LA44_8<=UNLESS_MODIFIER)||(LA44_8>=SEMI && LA44_8<=LINE_BREAK)||LA44_8==STAR||(LA44_8>=BNOT && LA44_8<=REGEX)||(LA44_8>=SINGLE_QUOTE_STRING_SIMPLE && LA44_8<=SINGLE_QUOTE_STRING_COMPLEX)||(LA44_8>=DOUBLE_QUOTE_STRING_SIMPLE && LA44_8<=DOUBLE_QUOTE_STRING_COMPLEX)||LA44_8==LCURLY||(LA44_8>=LPAREN && LA44_8<=LBRACK)||LA44_8==COLON||LA44_8==125||(LA44_8>=127 && LA44_8<=129)||(LA44_8>=139 && LA44_8<=141)) ) {
                            alt44=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 4, input);

                        throw nvae;
                    }

                }
                else if ( (LA44_1==ASSIGN) && (true)) {
                    int LA44_5 = input.LA(3);

                    if ( (true) ) {
                        alt44=1;
                    }
                    else if ( (synpred1()) ) {
                        alt44=2;
                    }
                    else if ( (synpred2()) ) {
                        alt44=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA44_1==EOF||(LA44_1>=LEFT_SHIFT && LA44_1<=FLOAT)||(LA44_1>=DIV && LA44_1<=MOD)||(LA44_1>=IF_MODIFIER && LA44_1<=LINE_BREAK)||(LA44_1>=DOT && LA44_1<=POWER)||(LA44_1>=QUESTION && LA44_1<=REGEX)||(LA44_1>=SINGLE_QUOTE_STRING_SIMPLE && LA44_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA44_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA44_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA44_1>=LCURLY && LA44_1<=RCURLY)||LA44_1==ASSOC||(LA44_1>=LPAREN && LA44_1<=RBRACK)||LA44_1==COLON||(LA44_1>=125 && LA44_1<=132)||(LA44_1>=136 && LA44_1<=137)||(LA44_1>=139 && LA44_1<=142)) ) {
                    alt44=4;
                }
                else if ( ((LA44_1>=MOD_ASSIGN && LA44_1<=POWER_ASSIGN)) && (synpred1())) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA44_0==STAR) && (synpred2())) {
                alt44=3;
            }
            else if ( ((LA44_0>=HEREDOC_STRING && LA44_0<=FLOAT)||(LA44_0>=IF_MODIFIER && LA44_0<=UNLESS_MODIFIER)||(LA44_0>=BNOT && LA44_0<=REGEX)||(LA44_0>=SINGLE_QUOTE_STRING_SIMPLE && LA44_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA44_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA44_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA44_0==LCURLY||LA44_0==LPAREN||LA44_0==LBRACK||LA44_0==COLON||LA44_0==125||(LA44_0>=127 && LA44_0<=129)||(LA44_0>=140 && LA44_0<=141)) ) {
                alt44=4;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("452:1: assignmentExpression[boolean allowsMrhsInSingleAssignment] : ({...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment] | ( simple_assignment_expression )=> simple_assignment_expression | ( mlhs )=> mlhs ASSIGN mrhs[true] | ternaryIfThenElseExpression );", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:4: {...}? => lhs ASSIGN mrhs[allowsMrhsInSingleAssignment]
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !(true) ) {
                        if (backtracking>0) {failed=true; return retval;}
                        throw new FailedPredicateException(input, "assignmentExpression", "true");
                    }
                    pushFollow(FOLLOW_lhs_in_assignmentExpression1422);
                    lhs114=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, lhs114.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(lhs114.start,lhs114.stop));
                    }
                    ASSIGN115=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1426); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN115_tree = (Object)adaptor.create(ASSIGN115);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN115_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1429);
                    mrhs116=mrhs(allowsMrhsInSingleAssignment);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs116.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:90: ( simple_assignment_expression )=> simple_assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_assignment_expression_in_assignmentExpression1439);
                    simple_assignment_expression117=simple_assignment_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression117.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:154: ( mlhs )=> mlhs ASSIGN mrhs[true]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mlhs_in_assignmentExpression1449);
                    mlhs118=mlhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mlhs118.getTree());
                    ASSIGN119=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentExpression1451); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGN119_tree = (Object)adaptor.create(ASSIGN119);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN119_tree, root_0);
                    }
                    pushFollow(FOLLOW_mrhs_in_assignmentExpression1454);
                    mrhs120=mrhs(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, mrhs120.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:191: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1460);
                    ternaryIfThenElseExpression121=ternaryIfThenElseExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression121.getTree());

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

        Token set123=null;
        lhs_return lhs122 = null;

        definedExpression_return definedExpression124 = null;


        Object set123_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:2: ( lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false] )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:4: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) definedExpression[false]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lhs_in_simple_assignment_expression1494);
            lhs122=lhs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, lhs122.getTree());
            set123=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                input.consume();
                if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(adaptor.create(set123), root_0);
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_simple_assignment_expression1496);    throw mse;
            }

            pushFollow(FOLLOW_definedExpression_in_simple_assignment_expression1541);
            definedExpression124=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression124.getTree());
            if ( backtracking==0 ) {
              addVariable(input.toString(lhs122.start,lhs122.stop));
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

        Token char_literal125=null;
        Token char_literal126=null;
        lhs_return t0 = null;

        lhs_return t = null;

        star_lhs_return star_lhs127 = null;

        star_lhs_return star_lhs128 = null;


        Object char_literal125_tree=null;
        Object char_literal126_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:9: (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==STAR) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("462:1: mlhs : (t0= lhs ( ',' t= lhs )* ( ',' star_lhs )? | star_lhs );", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:16: t0= lhs ( ',' t= lhs )* ( ',' star_lhs )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_mlhs1564);
                    t0=lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, t0.getTree());
                    if ( backtracking==0 ) {
                      addVariable(input.toString(t0.start,t0.stop));
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:48: ( ',' t= lhs )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            int LA45_1 = input.LA(2);

                            if ( (LA45_1==ID) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:49: ',' t= lhs
                    	    {
                    	    char_literal125=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_mlhs1569); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal125_tree = (Object)adaptor.create(char_literal125);
                    	    root_0 = (Object)adaptor.becomeRoot(char_literal125_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_lhs_in_mlhs1574);
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
                    	    break loop45;
                        }
                    } while (true);

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:86: ( ',' star_lhs )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==COMMA) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:87: ',' star_lhs
                            {
                            char_literal126=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_mlhs1581); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal126_tree = (Object)adaptor.create(char_literal126);
                            root_0 = (Object)adaptor.becomeRoot(char_literal126_tree, root_0);
                            }
                            pushFollow(FOLLOW_star_lhs_in_mlhs1584);
                            star_lhs127=star_lhs();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, star_lhs127.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:104: star_lhs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_star_lhs_in_mlhs1589);
                    star_lhs128=star_lhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, star_lhs128.getTree());

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

        Token STAR129=null;
        lhs_return lhs130 = null;


        Object STAR129_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:2: ( STAR lhs -> ^( STAR_ID lhs ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:9: STAR lhs
            {
            STAR129=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_lhs1605); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR129);

            pushFollow(FOLLOW_lhs_in_star_lhs1607);
            lhs130=lhs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_lhs.add(lhs130.getTree());

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

        Token char_literal133=null;
        Token char_literal136=null;
        simple_assignment_expression_return simple_assignment_expression131 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression132 = null;

        simple_assignment_expression_return simple_assignment_expression134 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression135 = null;

        star_rhs_return star_rhs137 = null;

        star_rhs_return star_rhs138 = null;


        Object char_literal133_tree=null;
        Object char_literal136_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:29: ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=HEREDOC_STRING && LA53_0<=FLOAT)||(LA53_0>=IF_MODIFIER && LA53_0<=UNLESS_MODIFIER)||LA53_0==ID||(LA53_0>=BNOT && LA53_0<=REGEX)||(LA53_0>=SINGLE_QUOTE_STRING_SIMPLE && LA53_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA53_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA53_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA53_0==LCURLY||LA53_0==LPAREN||LA53_0==LBRACK||LA53_0==COLON||LA53_0==125||(LA53_0>=127 && LA53_0<=129)||(LA53_0>=140 && LA53_0<=141)) ) {
                alt53=1;
            }
            else if ( (LA53_0==STAR) && (reallyMrhs)) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("470:1: mrhs[boolean reallyMrhs] : ( ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? ) | {...}? => star_rhs );", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:36: ( simple_assignment_expression | ternaryIfThenElseExpression ) ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:36: ( simple_assignment_expression | ternaryIfThenElseExpression )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( ((LA48_1>=ASSIGN && LA48_1<=POWER_ASSIGN)) ) {
                            alt48=1;
                        }
                        else if ( (LA48_1==EOF||(LA48_1>=LEFT_SHIFT && LA48_1<=FLOAT)||(LA48_1>=DIV && LA48_1<=MOD)||(LA48_1>=IF_MODIFIER && LA48_1<=LINE_BREAK)||(LA48_1>=DOT && LA48_1<=POWER)||(LA48_1>=QUESTION && LA48_1<=REGEX)||(LA48_1>=SINGLE_QUOTE_STRING_SIMPLE && LA48_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA48_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA48_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA48_1>=LCURLY && LA48_1<=RCURLY)||LA48_1==ASSOC||(LA48_1>=LPAREN && LA48_1<=RBRACK)||(LA48_1>=COMMA && LA48_1<=COLON)||(LA48_1>=125 && LA48_1<=132)||(LA48_1>=136 && LA48_1<=137)||(LA48_1>=139 && LA48_1<=142)) ) {
                            alt48=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:36: ( simple_assignment_expression | ternaryIfThenElseExpression )", 48, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA48_0>=HEREDOC_STRING && LA48_0<=FLOAT)||(LA48_0>=IF_MODIFIER && LA48_0<=UNLESS_MODIFIER)||(LA48_0>=BNOT && LA48_0<=REGEX)||(LA48_0>=SINGLE_QUOTE_STRING_SIMPLE && LA48_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA48_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA48_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA48_0==LCURLY||LA48_0==LPAREN||LA48_0==LBRACK||LA48_0==COLON||LA48_0==125||(LA48_0>=127 && LA48_0<=129)||(LA48_0>=140 && LA48_0<=141)) ) {
                        alt48=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("470:36: ( simple_assignment_expression | ternaryIfThenElseExpression )", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:37: simple_assignment_expression
                            {
                            pushFollow(FOLLOW_simple_assignment_expression_in_mrhs1637);
                            simple_assignment_expression131=simple_assignment_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression131.getTree());

                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:66: ternaryIfThenElseExpression
                            {
                            pushFollow(FOLLOW_ternaryIfThenElseExpression_in_mrhs1639);
                            ternaryIfThenElseExpression132=ternaryIfThenElseExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression132.getTree());

                            }
                            break;

                    }

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )
                    int alt52=2;
                    switch ( input.LA(1) ) {
                    case 136:
                        {
                        int LA52_1 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 137:
                        {
                        int LA52_2 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 2, input);

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
                        int LA52_3 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case SEMI:
                        {
                        int LA52_4 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LINE_BREAK:
                        {
                        int LA52_5 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                        {
                        int LA52_6 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 126:
                        {
                        int LA52_7 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 130:
                        {
                        int LA52_8 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 131:
                        {
                        int LA52_9 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RCURLY:
                        {
                        int LA52_10 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COLON:
                        {
                        int LA52_11 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 132:
                        {
                        int LA52_12 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA52_13 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COMMA:
                        {
                        int LA52_14 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case POWER:
                        {
                        int LA52_15 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 15, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STAR:
                        {
                        int LA52_16 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DIV:
                        {
                        int LA52_17 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 17, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MOD:
                        {
                        int LA52_18 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 18, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA52_19 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 19, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                        {
                        int LA52_20 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 20, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LEFT_SHIFT:
                        {
                        int LA52_21 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RIGHT_SHIFT:
                        {
                        int LA52_22 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BAND:
                        {
                        int LA52_23 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BXOR:
                        {
                        int LA52_24 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case BOR:
                        {
                        int LA52_25 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LESS_THAN:
                        {
                        int LA52_26 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 26, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GREATER_THAN:
                        {
                        int LA52_27 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 27, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LESS_OR_EQUAL:
                        {
                        int LA52_28 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 28, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GREATER_OR_EQUAL:
                        {
                        int LA52_29 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case COMPARE:
                        {
                        int LA52_30 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 30, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EQUAL:
                        {
                        int LA52_31 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 31, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASE_EQUAL:
                        {
                        int LA52_32 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 32, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        int LA52_33 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 33, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MATCH:
                        {
                        int LA52_34 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 34, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT_MATCH:
                        {
                        int LA52_35 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LOGICAL_AND:
                        {
                        int LA52_36 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LOGICAL_OR:
                        {
                        int LA52_37 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    case INCLUSIVE_RANGE:
                        {
                        int LA52_38 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EXCLUSIVE_RANGE:
                        {
                        int LA52_39 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case QUESTION:
                        {
                        int LA52_40 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RBRACK:
                        {
                        int LA52_41 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DOT:
                    case COLON2:
                        {
                        int LA52_42 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ASSOC:
                        {
                        int LA52_43 = input.LA(2);

                        if ( (!(reallyMrhs)) ) {
                            alt52=1;
                        }
                        else if ( (reallyMrhs) ) {
                            alt52=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("470:95: ( | {...}? => ( ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression ) )* ( ',' star_rhs )? )", 52, 0, input);

                        throw nvae;
                    }

                    switch (alt52) {
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
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==COMMA) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:115: ',' ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )
                            	    {
                            	    char_literal133=(Token)input.LT(1);
                            	    match(input,COMMA,FOLLOW_COMMA_in_mrhs1649); if (failed) return retval;
                            	    if ( backtracking==0 ) {
                            	    char_literal133_tree = (Object)adaptor.create(char_literal133);
                            	    root_0 = (Object)adaptor.becomeRoot(char_literal133_tree, root_0);
                            	    }
                            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )
                            	    int alt49=2;
                            	    int LA49_0 = input.LA(1);

                            	    if ( (LA49_0==ID) ) {
                            	        int LA49_1 = input.LA(2);

                            	        if ( ((LA49_1>=ASSIGN && LA49_1<=POWER_ASSIGN)) && (synpred3())) {
                            	            alt49=1;
                            	        }
                            	        else if ( (LA49_1==EOF||(LA49_1>=LEFT_SHIFT && LA49_1<=FLOAT)||(LA49_1>=DIV && LA49_1<=MOD)||(LA49_1>=IF_MODIFIER && LA49_1<=LINE_BREAK)||(LA49_1>=DOT && LA49_1<=POWER)||(LA49_1>=QUESTION && LA49_1<=REGEX)||(LA49_1>=SINGLE_QUOTE_STRING_SIMPLE && LA49_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA49_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA49_1<=DOUBLE_QUOTE_STRING_COMPLEX)||(LA49_1>=LCURLY && LA49_1<=RCURLY)||LA49_1==ASSOC||(LA49_1>=LPAREN && LA49_1<=RBRACK)||(LA49_1>=COMMA && LA49_1<=COLON)||(LA49_1>=125 && LA49_1<=132)||(LA49_1>=136 && LA49_1<=137)||(LA49_1>=139 && LA49_1<=142)) ) {
                            	            alt49=2;
                            	        }
                            	        else {
                            	            if (backtracking>0) {failed=true; return retval;}
                            	            NoViableAltException nvae =
                            	                new NoViableAltException("470:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )", 49, 1, input);

                            	            throw nvae;
                            	        }
                            	    }
                            	    else if ( ((LA49_0>=HEREDOC_STRING && LA49_0<=FLOAT)||(LA49_0>=IF_MODIFIER && LA49_0<=UNLESS_MODIFIER)||(LA49_0>=BNOT && LA49_0<=REGEX)||(LA49_0>=SINGLE_QUOTE_STRING_SIMPLE && LA49_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA49_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA49_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA49_0==LCURLY||LA49_0==LPAREN||LA49_0==LBRACK||LA49_0==COLON||LA49_0==125||(LA49_0>=127 && LA49_0<=129)||(LA49_0>=140 && LA49_0<=141)) ) {
                            	        alt49=2;
                            	    }
                            	    else {
                            	        if (backtracking>0) {failed=true; return retval;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("470:120: ( ( simple_assignment_expression )=> simple_assignment_expression | ternaryIfThenElseExpression )", 49, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt49) {
                            	        case 1 :
                            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:121: ( simple_assignment_expression )=> simple_assignment_expression
                            	            {
                            	            pushFollow(FOLLOW_simple_assignment_expression_in_mrhs1659);
                            	            simple_assignment_expression134=simple_assignment_expression();
                            	            _fsp--;
                            	            if (failed) return retval;
                            	            if ( backtracking==0 ) adaptor.addChild(root_0, simple_assignment_expression134.getTree());

                            	            }
                            	            break;
                            	        case 2 :
                            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:184: ternaryIfThenElseExpression
                            	            {
                            	            pushFollow(FOLLOW_ternaryIfThenElseExpression_in_mrhs1661);
                            	            ternaryIfThenElseExpression135=ternaryIfThenElseExpression();
                            	            _fsp--;
                            	            if (failed) return retval;
                            	            if ( backtracking==0 ) adaptor.addChild(root_0, ternaryIfThenElseExpression135.getTree());

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);

                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:215: ( ',' star_rhs )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==COMMA) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:216: ',' star_rhs
                                    {
                                    char_literal136=(Token)input.LT(1);
                                    match(input,COMMA,FOLLOW_COMMA_in_mrhs1667); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal136_tree = (Object)adaptor.create(char_literal136);
                                    root_0 = (Object)adaptor.becomeRoot(char_literal136_tree, root_0);
                                    }
                                    pushFollow(FOLLOW_star_rhs_in_mrhs1670);
                                    star_rhs137=star_rhs();
                                    _fsp--;
                                    if (failed) return retval;
                                    if ( backtracking==0 ) adaptor.addChild(root_0, star_rhs137.getTree());

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
                    pushFollow(FOLLOW_star_rhs_in_mrhs1694);
                    star_rhs138=star_rhs();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, star_rhs138.getTree());

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

        Token STAR139=null;
        definedExpression_return definedExpression140 = null;


        Object STAR139_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_definedExpression=new RewriteRuleSubtreeStream(adaptor,"rule definedExpression");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:10: ( STAR definedExpression[false] -> ^( STAR_ID definedExpression ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:16: STAR definedExpression[false]
            {
            STAR139=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_star_rhs1708); if (failed) return retval;
            if ( backtracking==0 ) stream_STAR.add(STAR139);

            pushFollow(FOLLOW_definedExpression_in_star_rhs1710);
            definedExpression140=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_definedExpression.add(definedExpression140.getTree());

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

        Token QUESTION141=null;
        Token char_literal143=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression142 = null;

        rangeExpression_return rangeExpression144 = null;


        Object QUESTION141_tree=null;
        Object char_literal143_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:3: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1734);
            r=rangeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==QUESTION) ) {
                alt54=1;
            }
            else if ( (LA54_0==EOF||LA54_0==LEFT_SHIFT||(LA54_0>=DIV && LA54_0<=MOD)||(LA54_0>=IF_MODIFIER && LA54_0<=LINE_BREAK)||(LA54_0>=DOT && LA54_0<=COLON2)||(LA54_0>=COMPARE && LA54_0<=POWER)||(LA54_0>=INCLUSIVE_RANGE && LA54_0<=BAND)||LA54_0==RCURLY||LA54_0==ASSOC||LA54_0==RPAREN||LA54_0==RBRACK||(LA54_0>=COMMA && LA54_0<=COLON)||LA54_0==126||(LA54_0>=130 && LA54_0<=132)||(LA54_0>=136 && LA54_0<=137)) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("480:23: ( QUESTION rangeExpression ':' rangeExpression | )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION141=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1738); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION141_tree = (Object)adaptor.create(QUESTION141);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION141_tree, root_0);
                    }
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1741);
                    rangeExpression142=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression142.getTree());
                    char_literal143=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1743); if (failed) return retval;
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1746);
                    rangeExpression144=rangeExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpression144.getTree());

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

        Token INCLUSIVE_RANGE146=null;
        Token LINE_BREAK147=null;
        Token EXCLUSIVE_RANGE148=null;
        Token LINE_BREAK149=null;
        logicalOrExpression_return logicalOrExpression145 = null;

        logicalOrExpression_return logicalOrExpression150 = null;


        Object INCLUSIVE_RANGE146_tree=null;
        Object LINE_BREAK147_tree=null;
        Object EXCLUSIVE_RANGE148_tree=null;
        Object LINE_BREAK149_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:3: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1763);
            logicalOrExpression145=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression145.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==INCLUSIVE_RANGE) ) {
                    alt58=1;
                }
                else if ( (LA58_0==EXCLUSIVE_RANGE) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==INCLUSIVE_RANGE) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==EXCLUSIVE_RANGE) ) {
            	        alt57=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("487:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 57, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE146=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1782); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            INCLUSIVE_RANGE146_tree = (Object)adaptor.create(INCLUSIVE_RANGE146);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE146_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:24: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1786); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE148=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1797); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EXCLUSIVE_RANGE148_tree = (Object)adaptor.create(EXCLUSIVE_RANGE148);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE148_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:24: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK149=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1801); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1816);
            	    logicalOrExpression150=logicalOrExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression150.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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

        Token LOGICAL_OR152=null;
        Token LINE_BREAK153=null;
        logicalAndExpression_return logicalAndExpression151 = null;

        logicalAndExpression_return logicalAndExpression154 = null;


        Object LOGICAL_OR152_tree=null;
        Object LINE_BREAK153_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:3: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1836);
            logicalAndExpression151=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression151.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==LOGICAL_OR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR152=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1868); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_OR152_tree = (Object)adaptor.create(LOGICAL_OR152);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR152_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:18: ( LINE_BREAK )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==LINE_BREAK) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK153=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1873); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1882);
            	    logicalAndExpression154=logicalAndExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression154.getTree());

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

        Token LOGICAL_AND156=null;
        Token LINE_BREAK157=null;
        equalityExpression_return equalityExpression155 = null;

        equalityExpression_return equalityExpression158 = null;


        Object LOGICAL_AND156_tree=null;
        Object LINE_BREAK157_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:3: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1902);
            equalityExpression155=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression155.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==LOGICAL_AND) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND156=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1934); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    LOGICAL_AND156_tree = (Object)adaptor.create(LOGICAL_AND156);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND156_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:19: ( LINE_BREAK )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==LINE_BREAK) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK157=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1939); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1948);
            	    equalityExpression158=equalityExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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

        Token COMPARE160=null;
        Token LINE_BREAK161=null;
        Token EQUAL162=null;
        Token LINE_BREAK163=null;
        Token CASE_EQUAL164=null;
        Token LINE_BREAK165=null;
        Token NOT_EQUAL166=null;
        Token LINE_BREAK167=null;
        Token MATCH168=null;
        Token LINE_BREAK169=null;
        Token NOT_MATCH170=null;
        Token LINE_BREAK171=null;
        relationalExpression_return relationalExpression159 = null;

        relationalExpression_return relationalExpression172 = null;


        Object COMPARE160_tree=null;
        Object LINE_BREAK161_tree=null;
        Object EQUAL162_tree=null;
        Object LINE_BREAK163_tree=null;
        Object CASE_EQUAL164_tree=null;
        Object LINE_BREAK165_tree=null;
        Object NOT_EQUAL166_tree=null;
        Object LINE_BREAK167_tree=null;
        Object MATCH168_tree=null;
        Object LINE_BREAK169_tree=null;
        Object NOT_MATCH170_tree=null;
        Object LINE_BREAK171_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:3: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1968);
            relationalExpression159=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression159.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop70:
            do {
                int alt70=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt70=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt70=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt70=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt70=1;
                    }
                    break;
                case MATCH:
                    {
                    alt70=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt70=1;
                    }
                    break;

                }

                switch (alt70) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt69=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt69=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt69=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt69=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt69=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt69=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt69=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("516:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 69, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt69) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE160=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression2002); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            COMPARE160_tree = (Object)adaptor.create(COMPARE160);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE160_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:17: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:516:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2007); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL162=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression2018); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQUAL162_tree = (Object)adaptor.create(EQUAL162);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL162_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:16: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);

            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }


            	                switch (alt64) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:517:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK163=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2024); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL164=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression2035); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            CASE_EQUAL164_tree = (Object)adaptor.create(CASE_EQUAL164);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL164_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:19: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);

            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }


            	                switch (alt65) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK165=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2039); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL166=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression2050); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_EQUAL166_tree = (Object)adaptor.create(NOT_EQUAL166);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL166_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:19: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);

            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }


            	                switch (alt66) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK167=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2055); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH168=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression2066); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MATCH168_tree = (Object)adaptor.create(MATCH168);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH168_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:16: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);

            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }


            	                switch (alt67) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK169=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2072); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH170=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression2083); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOT_MATCH170_tree = (Object)adaptor.create(NOT_MATCH170);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH170_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:19: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);

            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }


            	                switch (alt68) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK171=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression2088); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2103);
            	    relationalExpression172=relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression172.getTree());

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

        Token LESS_THAN174=null;
        Token LINE_BREAK175=null;
        Token GREATER_THAN176=null;
        Token LINE_BREAK177=null;
        Token LESS_OR_EQUAL178=null;
        Token LINE_BREAK179=null;
        Token GREATER_OR_EQUAL180=null;
        Token LINE_BREAK181=null;
        orExpression_return orExpression173 = null;

        orExpression_return orExpression182 = null;


        Object LESS_THAN174_tree=null;
        Object LINE_BREAK175_tree=null;
        Object GREATER_THAN176_tree=null;
        Object LINE_BREAK177_tree=null;
        Object LESS_OR_EQUAL178_tree=null;
        Object LINE_BREAK179_tree=null;
        Object GREATER_OR_EQUAL180_tree=null;
        Object LINE_BREAK181_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:3: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression2124);
            orExpression173=orExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpression173.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop76:
            do {
                int alt76=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt76=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt76=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt76=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt76=1;
                    }
                    break;

                }

                switch (alt76) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt75=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt75=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt75=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt75=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt75=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("532:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 75, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt75) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN174=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression2158); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_THAN174_tree = (Object)adaptor.create(LESS_THAN174);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN174_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:20: ( LINE_BREAK )*
            	            loop71:
            	            do {
            	                int alt71=2;
            	                int LA71_0 = input.LA(1);

            	                if ( (LA71_0==LINE_BREAK) ) {
            	                    alt71=1;
            	                }


            	                switch (alt71) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK175=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2164); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop71;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN176=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression2175); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_THAN176_tree = (Object)adaptor.create(GREATER_THAN176);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN176_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:22: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK177=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2180); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL178=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression2191); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LESS_OR_EQUAL178_tree = (Object)adaptor.create(LESS_OR_EQUAL178);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL178_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:23: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);

            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }


            	                switch (alt73) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK179=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2196); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL180=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2207); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GREATER_OR_EQUAL180_tree = (Object)adaptor.create(GREATER_OR_EQUAL180);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL180_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:25: ( LINE_BREAK )*
            	            loop74:
            	            do {
            	                int alt74=2;
            	                int LA74_0 = input.LA(1);

            	                if ( (LA74_0==LINE_BREAK) ) {
            	                    alt74=1;
            	                }


            	                switch (alt74) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK181=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression2211); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop74;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression2226);
            	    orExpression182=orExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, orExpression182.getTree());

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

        Token BXOR184=null;
        Token LINE_BREAK185=null;
        Token BOR186=null;
        Token LINE_BREAK187=null;
        andExpression_return andExpression183 = null;

        andExpression_return andExpression188 = null;


        Object BXOR184_tree=null;
        Object LINE_BREAK185_tree=null;
        Object BOR186_tree=null;
        Object LINE_BREAK187_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:3: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2246);
            andExpression183=andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpression183.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==BXOR) ) {
                    alt80=1;
                }
                else if ( (LA80_0==BOR) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==BXOR) ) {
            	        alt79=1;
            	    }
            	    else if ( (LA79_0==BOR) ) {
            	        alt79=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("545:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 79, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR184=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression2280); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BXOR184_tree = (Object)adaptor.create(BXOR184);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR184_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:15: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);

            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }


            	                switch (alt77) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK185=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2286); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR186=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression2297); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            BOR186_tree = (Object)adaptor.create(BOR186);
            	            root_0 = (Object)adaptor.becomeRoot(BOR186_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:14: ( LINE_BREAK )*
            	            loop78:
            	            do {
            	                int alt78=2;
            	                int LA78_0 = input.LA(1);

            	                if ( (LA78_0==LINE_BREAK) ) {
            	                    alt78=1;
            	                }


            	                switch (alt78) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK187=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression2303); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop78;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression2318);
            	    andExpression188=andExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, andExpression188.getTree());

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

        Token BAND190=null;
        Token LINE_BREAK191=null;
        shiftExpression_return shiftExpression189 = null;

        shiftExpression_return shiftExpression192 = null;


        Object BAND190_tree=null;
        Object LINE_BREAK191_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:3: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression2338);
            shiftExpression189=shiftExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression189.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==BAND) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND190=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2370); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BAND190_tree = (Object)adaptor.create(BAND190);
            	    root_0 = (Object)adaptor.becomeRoot(BAND190_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:13: ( LINE_BREAK )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==LINE_BREAK) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK191=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2376); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2385);
            	    shiftExpression192=shiftExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, shiftExpression192.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
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

        Token LEFT_SHIFT194=null;
        Token LINE_BREAK195=null;
        Token RIGHT_SHIFT196=null;
        Token LINE_BREAK197=null;
        additiveExpression_return additiveExpression193 = null;

        additiveExpression_return additiveExpression198 = null;


        Object LEFT_SHIFT194_tree=null;
        Object LINE_BREAK195_tree=null;
        Object RIGHT_SHIFT196_tree=null;
        Object LINE_BREAK197_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:3: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2407);
            additiveExpression193=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression193.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==LEFT_SHIFT) ) {
                    alt86=1;
                }
                else if ( (LA86_0==RIGHT_SHIFT) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==LEFT_SHIFT) ) {
            	        alt85=1;
            	    }
            	    else if ( (LA85_0==RIGHT_SHIFT) ) {
            	        alt85=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("567:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 85, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT194=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2441); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LEFT_SHIFT194_tree = (Object)adaptor.create(LEFT_SHIFT194);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT194_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:20: ( LINE_BREAK )*
            	            loop83:
            	            do {
            	                int alt83=2;
            	                int LA83_0 = input.LA(1);

            	                if ( (LA83_0==LINE_BREAK) ) {
            	                    alt83=1;
            	                }


            	                switch (alt83) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK195=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2446); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop83;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT196=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2457); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            RIGHT_SHIFT196_tree = (Object)adaptor.create(RIGHT_SHIFT196);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT196_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:20: ( LINE_BREAK )*
            	            loop84:
            	            do {
            	                int alt84=2;
            	                int LA84_0 = input.LA(1);

            	                if ( (LA84_0==LINE_BREAK) ) {
            	                    alt84=1;
            	                }


            	                switch (alt84) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK197=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2461); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop84;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2476);
            	    additiveExpression198=additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression198.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
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

        Token PLUS200=null;
        Token LINE_BREAK201=null;
        Token MINUS202=null;
        Token LINE_BREAK203=null;
        multiplicativeExpression_return multiplicativeExpression199 = null;

        multiplicativeExpression_return multiplicativeExpression204 = null;


        Object PLUS200_tree=null;
        Object LINE_BREAK201_tree=null;
        Object MINUS202_tree=null;
        Object LINE_BREAK203_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:3: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2498);
            multiplicativeExpression199=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression199.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==PLUS) ) {
                    alt90=1;
                }
                else if ( (LA90_0==MINUS) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt89=2;
            	    int LA89_0 = input.LA(1);

            	    if ( (LA89_0==PLUS) ) {
            	        alt89=1;
            	    }
            	    else if ( (LA89_0==MINUS) ) {
            	        alt89=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("580:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 89, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt89) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS200=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2532); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS200_tree = (Object)adaptor.create(PLUS200);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS200_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:16: ( LINE_BREAK )*
            	            loop87:
            	            do {
            	                int alt87=2;
            	                int LA87_0 = input.LA(1);

            	                if ( (LA87_0==LINE_BREAK) ) {
            	                    alt87=1;
            	                }


            	                switch (alt87) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK201=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2539); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop87;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS202=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2550); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS202_tree = (Object)adaptor.create(MINUS202);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS202_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:17: ( LINE_BREAK )*
            	            loop88:
            	            do {
            	                int alt88=2;
            	                int LA88_0 = input.LA(1);

            	                if ( (LA88_0==LINE_BREAK) ) {
            	                    alt88=1;
            	                }


            	                switch (alt88) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK203=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2557); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop88;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2572);
            	    multiplicativeExpression204=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression204.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
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

        Token STAR206=null;
        Token LINE_BREAK207=null;
        Token DIV208=null;
        Token LINE_BREAK209=null;
        Token MOD210=null;
        Token LINE_BREAK211=null;
        powerExpression_return powerExpression205 = null;

        powerExpression_return powerExpression212 = null;


        Object STAR206_tree=null;
        Object LINE_BREAK207_tree=null;
        Object DIV208_tree=null;
        Object LINE_BREAK209_tree=null;
        Object MOD210_tree=null;
        Object LINE_BREAK211_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:3: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2592);
            powerExpression205=powerExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression205.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop95:
            do {
                int alt95=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt95=1;
                    }
                    break;
                case DIV:
                    {
                    alt95=1;
                    }
                    break;
                case MOD:
                    {
                    alt95=1;
                    }
                    break;

                }

                switch (alt95) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt94=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt94=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt94=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt94=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("591:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 94, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt94) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR206=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2626); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            STAR206_tree = (Object)adaptor.create(STAR206);
            	            root_0 = (Object)adaptor.becomeRoot(STAR206_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:15: ( LINE_BREAK )*
            	            loop91:
            	            do {
            	                int alt91=2;
            	                int LA91_0 = input.LA(1);

            	                if ( (LA91_0==LINE_BREAK) ) {
            	                    alt91=1;
            	                }


            	                switch (alt91) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK207=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2632); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop91;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV208=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2643); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV208_tree = (Object)adaptor.create(DIV208);
            	            root_0 = (Object)adaptor.becomeRoot(DIV208_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:14: ( LINE_BREAK )*
            	            loop92:
            	            do {
            	                int alt92=2;
            	                int LA92_0 = input.LA(1);

            	                if ( (LA92_0==LINE_BREAK) ) {
            	                    alt92=1;
            	                }


            	                switch (alt92) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK209=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2649); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop92;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD210=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2660); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MOD210_tree = (Object)adaptor.create(MOD210);
            	            root_0 = (Object)adaptor.becomeRoot(MOD210_tree, root_0);
            	            }
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:14: ( LINE_BREAK )*
            	            loop93:
            	            do {
            	                int alt93=2;
            	                int LA93_0 = input.LA(1);

            	                if ( (LA93_0==LINE_BREAK) ) {
            	                    alt93=1;
            	                }


            	                switch (alt93) {
            	            	case 1 :
            	            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK211=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2666); if (failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop93;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2681);
            	    powerExpression212=powerExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, powerExpression212.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
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

        Token POWER214=null;
        Token LINE_BREAK215=null;
        bnotExpression_return bnotExpression213 = null;

        bnotExpression_return bnotExpression216 = null;


        Object POWER214_tree=null;
        Object LINE_BREAK215_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:3: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2702);
            bnotExpression213=bnotExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression213.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:603:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==POWER) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER214=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2737); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    POWER214_tree = (Object)adaptor.create(POWER214);
            	    root_0 = (Object)adaptor.becomeRoot(POWER214_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:14: ( LINE_BREAK )*
            	    loop96:
            	    do {
            	        int alt96=2;
            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==LINE_BREAK) ) {
            	            alt96=1;
            	        }


            	        switch (alt96) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK215=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2743); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop96;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2752);
            	    bnotExpression216=bnotExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, bnotExpression216.getTree());

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

        Token BNOT217=null;
        Token LINE_BREAK218=null;
        Token NOT219=null;
        Token LINE_BREAK220=null;
        command_return command221 = null;


        Object BNOT217_tree=null;
        Object LINE_BREAK218_tree=null;
        Object NOT219_tree=null;
        Object LINE_BREAK220_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:3: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop100:
            do {
                int alt100=3;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==BNOT) ) {
                    alt100=1;
                }
                else if ( (LA100_0==NOT) ) {
                    alt100=2;
                }


                switch (alt100) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT217=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2774); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    BNOT217_tree = (Object)adaptor.create(BNOT217);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT217_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:15: ( LINE_BREAK )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==LINE_BREAK) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:611:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK218=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2780); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop98;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT219=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2790); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT219_tree = (Object)adaptor.create(NOT219);
            	    root_0 = (Object)adaptor.becomeRoot(NOT219_tree, root_0);
            	    }
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:13: ( LINE_BREAK )*
            	    loop99:
            	    do {
            	        int alt99=2;
            	        int LA99_0 = input.LA(1);

            	        if ( (LA99_0==LINE_BREAK) ) {
            	            alt99=1;
            	        }


            	        switch (alt99) {
            	    	case 1 :
            	    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:612:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK220=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2796); if (failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop99;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2810);
            command221=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command221.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:618:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' statement_expression ')' ) ( ( DOT | '::' ) method[false] )* ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal222=null;
        Token string_literal223=null;
        Token char_literal230=null;
        Token char_literal232=null;
        Token set233=null;
        literal_return literal224 = null;

        boolean_expression_return boolean_expression225 = null;

        block_expression_return block_expression226 = null;

        if_expression_return if_expression227 = null;

        unless_expression_return unless_expression228 = null;

        atom_return atom229 = null;

        statement_expression_return statement_expression231 = null;

        method_return method234 = null;


        Object string_literal222_tree=null;
        Object string_literal223_tree=null;
        Object char_literal230_tree=null;
        Object char_literal232_tree=null;
        Object set233_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:2: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' statement_expression ')' ) ( ( DOT | '::' ) method[false] )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' statement_expression ')' ) ( ( DOT | '::' ) method[false] )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' statement_expression ')' )
            int alt101=9;
            switch ( input.LA(1) ) {
            case 140:
                {
                alt101=1;
                }
                break;
            case 141:
                {
                alt101=2;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt101=3;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt101=3;
                }
                break;
            case HEREDOC_STRING:
            case REGEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt101=3;
                }
                break;
            case COLON:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt101=3;
                    }
                    break;
                case SINGLE_QUOTE_STRING_SIMPLE:
                case SINGLE_QUOTE_STRING_COMPLEX:
                    {
                    alt101=3;
                    }
                    break;
                case DOUBLE_QUOTE_STRING_SIMPLE:
                case DOUBLE_QUOTE_STRING_COMPLEX:
                    {
                    alt101=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' statement_expression ')' )", 101, 6, input);

                    throw nvae;
                }

                }
                break;
            case 127:
            case 128:
            case 129:
                {
                alt101=4;
                }
                break;
            case 125:
                {
                alt101=5;
                }
                break;
            case IF_MODIFIER:
                {
                alt101=6;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt101=7;
                }
                break;
            case ID:
            case LCURLY:
            case LBRACK:
                {
                alt101=8;
                }
                break;
            case LPAREN:
                {
                alt101=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("620:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] | '(' statement_expression ')' )", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:4: 'expression0'
                    {
                    string_literal222=(Token)input.LT(1);
                    match(input,140,FOLLOW_140_in_command2829); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal222_tree = (Object)adaptor.create(string_literal222);
                    adaptor.addChild(root_0, string_literal222_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:20: 'expression1'
                    {
                    string_literal223=(Token)input.LT(1);
                    match(input,141,FOLLOW_141_in_command2833); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal223_tree = (Object)adaptor.create(string_literal223);
                    adaptor.addChild(root_0, string_literal223_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2836);
                    literal224=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal224.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2838);
                    boolean_expression225=boolean_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boolean_expression225.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2841);
                    block_expression226=block_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_expression226.getTree());

                    }
                    break;
                case 6 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2843);
                    if_expression227=if_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, if_expression227.getTree());

                    }
                    break;
                case 7 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2845);
                    unless_expression228=unless_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unless_expression228.getTree());

                    }
                    break;
                case 8 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2847);
                    atom229=atom(true);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atom229.getTree());

                    }
                    break;
                case 9 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:125: '(' statement_expression ')'
                    {
                    char_literal230=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_command2852); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal230_tree = (Object)adaptor.create(char_literal230);
                    adaptor.addChild(root_0, char_literal230_tree);
                    }
                    pushFollow(FOLLOW_statement_expression_in_command2854);
                    statement_expression231=statement_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement_expression231.getTree());
                    char_literal232=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_command2856); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal232_tree = (Object)adaptor.create(char_literal232);
                    adaptor.addChild(root_0, char_literal232_tree);
                    }

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:156: ( ( DOT | '::' ) method[false] )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=DOT && LA102_0<=COLON2)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:157: ( DOT | '::' ) method[false]
            	    {
            	    set233=(Token)input.LT(1);
            	    if ( (input.LA(1)>=DOT && input.LA(1)<=COLON2) ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(adaptor.create(set233), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_command2861);    throw mse;
            	    }

            	    pushFollow(FOLLOW_method_in_command2868);
            	    method234=method(false);
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, method234.getTree());

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

        array_return array235 = null;

        hash_return hash236 = null;

        single_quote_string_return single_quote_string237 = null;

        double_quote_string_return double_quote_string238 = null;

        symbol_return symbol239 = null;

        methodExpression_return methodExpression240 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:24: ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] )
            int alt103=6;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt103=1;
                }
                break;
            case LCURLY:
                {
                alt103=2;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt103=3;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt103=4;
                }
                break;
            case COLON:
                {
                alt103=5;
                }
                break;
            case ID:
                {
                alt103=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("623:1: atom[boolean topLevel] : ( array | hash | single_quote_string | double_quote_string | symbol | methodExpression[topLevel] );", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:58: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_atom2888);
                    array235=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, array235.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:64: hash
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hash_in_atom2890);
                    hash236=hash();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, hash236.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:69: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_single_quote_string_in_atom2892);
                    single_quote_string237=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string237.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:89: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_double_quote_string_in_atom2894);
                    double_quote_string238=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string238.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:109: symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbol_in_atom2896);
                    symbol239=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol239.getTree());

                    }
                    break;
                case 6 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:118: methodExpression[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodExpression_in_atom2900);
                    methodExpression240=methodExpression(topLevel);
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, methodExpression240.getTree());

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

        method_return method241 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:2: ( method[topLevel] )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:9: method[topLevel]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_method_in_methodExpression2916);
            method241=method(topLevel);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, method241.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token char_literal243=null;
        Token char_literal245=null;
        simple_variable_return simple_variable242 = null;

        array_items_return array_items244 = null;


        Object char_literal243_tree=null;
        Object char_literal245_tree=null;

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
            pushFollow(FOLLOW_simple_variable_in_variable2926);
            simple_variable242=simple_variable();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(simple_variable242.getTree(), root_0);
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:74: ( '[' array_items ']' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==LBRACK) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:75: '[' array_items ']'
            	    {
            	    char_literal243=(Token)input.LT(1);
            	    match(input,LBRACK,FOLLOW_LBRACK_in_variable2930); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal243_tree = (Object)adaptor.create(char_literal243);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal243_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_array_items_in_variable2933);
            	    array_items244=array_items();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, array_items244.getTree());
            	    char_literal245=(Token)input.LT(1);
            	    match(input,RBRACK,FOLLOW_RBRACK_in_variable2935); if (failed) return retval;
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:1: simple_variable : ID -> ^( VARIABLE ID ) ;
    public final simple_variable_return simple_variable() throws RecognitionException {
        simple_variable_return retval = new simple_variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID246=null;

        Object ID246_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:2: ( ID -> ^( VARIABLE ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:4: ID
            {
            ID246=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_simple_variable2947); if (failed) return retval;
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

        Token ID247=null;
        Token ID249=null;
        block_return block248 = null;

        open_args_with_block_return open_args_with_block250 = null;


        Object ID247_tree=null;
        Object ID249_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args_with_block=new RewriteRuleSubtreeStream(adaptor,"rule open_args_with_block");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:26: ( ( ID ( block )? )=> ID ( block )? -> ^( VARIABLE_OR_METHOD ID ( block )? ) | ID open_args_with_block -> ^( CALL ID open_args_with_block ) )
            int alt106=2;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:78: ( ID ( block )? )=> ID ( block )?
                    {
                    ID247=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2977); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID247);

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:96: ( block )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==LCURLY||LA105_0==142) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:96: block
                            {
                            pushFollow(FOLLOW_block_in_method2979);
                            block248=block();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_block.add(block248.getTree());

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
                    ID249=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method3013); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID249);

                    pushFollow(FOLLOW_open_args_with_block_in_method3015);
                    open_args_with_block250=open_args_with_block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_open_args_with_block.add(open_args_with_block250.getTree());

                    // AST REWRITE
                    // elements: ID, open_args_with_block
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:1: block : ( 'do' ( LINE_BREAK )* block_content ( LINE_BREAK )* 'end' | '{' ( LINE_BREAK )* block_content ( LINE_BREAK )* '}' );
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal251=null;
        Token LINE_BREAK252=null;
        Token LINE_BREAK254=null;
        Token string_literal255=null;
        Token char_literal256=null;
        Token LINE_BREAK257=null;
        Token LINE_BREAK259=null;
        Token char_literal260=null;
        block_content_return block_content253 = null;

        block_content_return block_content258 = null;


        Object string_literal251_tree=null;
        Object LINE_BREAK252_tree=null;
        Object LINE_BREAK254_tree=null;
        Object string_literal255_tree=null;
        Object char_literal256_tree=null;
        Object LINE_BREAK257_tree=null;
        Object LINE_BREAK259_tree=null;
        Object char_literal260_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:7: ( 'do' ( LINE_BREAK )* block_content ( LINE_BREAK )* 'end' | '{' ( LINE_BREAK )* block_content ( LINE_BREAK )* '}' )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==142) ) {
                alt111=1;
            }
            else if ( (LA111_0==LCURLY) ) {
                alt111=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("636:1: block : ( 'do' ( LINE_BREAK )* block_content ( LINE_BREAK )* 'end' | '{' ( LINE_BREAK )* block_content ( LINE_BREAK )* '}' );", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:9: 'do' ( LINE_BREAK )* block_content ( LINE_BREAK )* 'end'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal251=(Token)input.LT(1);
                    match(input,142,FOLLOW_142_in_block3043); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal251_tree = (Object)adaptor.create(string_literal251);
                    adaptor.addChild(root_0, string_literal251_tree);
                    }
                    if ( backtracking==0 ) {
                      enterScope();
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:31: ( LINE_BREAK )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==LINE_BREAK) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:32: LINE_BREAK
                    	    {
                    	    LINE_BREAK252=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_block3049); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    pushFollow(FOLLOW_block_content_in_block3054);
                    block_content253=block_content();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_content253.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:60: ( LINE_BREAK )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==LINE_BREAK) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:61: LINE_BREAK
                    	    {
                    	    LINE_BREAK254=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_block3057); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    string_literal255=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_block3062); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal255_tree = (Object)adaptor.create(string_literal255);
                    adaptor.addChild(root_0, string_literal255_tree);
                    }
                    if ( backtracking==0 ) {
                      leaveScope();
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:4: '{' ( LINE_BREAK )* block_content ( LINE_BREAK )* '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal256=(Token)input.LT(1);
                    match(input,LCURLY,FOLLOW_LCURLY_in_block3069); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal256_tree = (Object)adaptor.create(char_literal256);
                    adaptor.addChild(root_0, char_literal256_tree);
                    }
                    if ( backtracking==0 ) {
                      enterScope();
                    }
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:25: ( LINE_BREAK )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==LINE_BREAK) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:26: LINE_BREAK
                    	    {
                    	    LINE_BREAK257=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_block3075); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    pushFollow(FOLLOW_block_content_in_block3080);
                    block_content258=block_content();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_content258.getTree());
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:54: ( LINE_BREAK )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==LINE_BREAK) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:55: LINE_BREAK
                    	    {
                    	    LINE_BREAK259=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_block3083); if (failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    char_literal260=(Token)input.LT(1);
                    match(input,RCURLY,FOLLOW_RCURLY_in_block3088); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal260_tree = (Object)adaptor.create(char_literal260);
                    adaptor.addChild(root_0, char_literal260_tree);
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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:1: block_content : ( '|' block_param '|' )? ( LINE_BREAK )* block_body ;
    public final block_content_return block_content() throws RecognitionException {
        block_content_return retval = new block_content_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal261=null;
        Token char_literal263=null;
        Token LINE_BREAK264=null;
        block_param_return block_param262 = null;

        block_body_return block_body265 = null;


        Object char_literal261_tree=null;
        Object char_literal263_tree=null;
        Object LINE_BREAK264_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:2: ( ( '|' block_param '|' )? ( LINE_BREAK )* block_body )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:4: ( '|' block_param '|' )? ( LINE_BREAK )* block_body
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:4: ( '|' block_param '|' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==BOR) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:5: '|' block_param '|'
                    {
                    char_literal261=(Token)input.LT(1);
                    match(input,BOR,FOLLOW_BOR_in_block_content3099); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal261_tree = (Object)adaptor.create(char_literal261);
                    adaptor.addChild(root_0, char_literal261_tree);
                    }
                    pushFollow(FOLLOW_block_param_in_block_content3101);
                    block_param262=block_param();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block_param262.getTree());
                    char_literal263=(Token)input.LT(1);
                    match(input,BOR,FOLLOW_BOR_in_block_content3103); if (failed) return retval;

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:28: ( LINE_BREAK )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==LINE_BREAK) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:29: LINE_BREAK
            	    {
            	    LINE_BREAK264=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_block_content3109); if (failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            pushFollow(FOLLOW_block_body_in_block_content3114);
            block_body265=block_body();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, block_body265.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token ID266=null;
        Token char_literal267=null;
        Token ID268=null;

        Object ID266_tree=null;
        Object char_literal267_tree=null;
        Object ID268_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:2: ( ID ( ',' ID )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:4: ID ( ',' ID )*
            {
            root_0 = (Object)adaptor.nil();

            ID266=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_block_param3122); if (failed) return retval;
            if ( backtracking==0 ) {
            ID266_tree = (Object)adaptor.create(ID266);
            adaptor.addChild(root_0, ID266_tree);
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:7: ( ',' ID )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:8: ',' ID
            	    {
            	    char_literal267=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_block_param3125); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal267_tree = (Object)adaptor.create(char_literal267);
            	    adaptor.addChild(root_0, char_literal267_tree);
            	    }
            	    ID268=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_block_param3127); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    ID268_tree = (Object)adaptor.create(ID268);
            	    adaptor.addChild(root_0, ID268_tree);
            	    }

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

        bodyStatement_return bodyStatement269 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:2: ( ( bodyStatement )? )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:4: ( bodyStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:4: ( bodyStatement )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=HEREDOC_STRING && LA115_0<=FLOAT)||(LA115_0>=IF_MODIFIER && LA115_0<=UNLESS_MODIFIER)||LA115_0==ID||LA115_0==STAR||(LA115_0>=BNOT && LA115_0<=REGEX)||(LA115_0>=SINGLE_QUOTE_STRING_SIMPLE && LA115_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA115_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA115_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA115_0==LCURLY||LA115_0==LPAREN||LA115_0==LBRACK||LA115_0==COLON||LA115_0==125||(LA115_0>=127 && LA115_0<=129)||(LA115_0>=133 && LA115_0<=134)||(LA115_0>=138 && LA115_0<=141)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:4: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_block_body3139);
                    bodyStatement269=bodyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, bodyStatement269.getTree());

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

        Token char_literal270=null;
        Token char_literal272=null;
        Token char_literal274=null;
        Token char_literal275=null;
        call_args_return call_args271 = null;

        block_return block273 = null;

        block_return block276 = null;

        call_args_return call_args277 = null;


        Object char_literal270_tree=null;
        Object char_literal272_tree=null;
        Object char_literal274_tree=null;
        Object char_literal275_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:2: ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args )
            int alt118=3;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==LPAREN) ) {
                int LA118_1 = input.LA(2);

                if ( (synpred5()) ) {
                    alt118=1;
                }
                else if ( (synpred6()) ) {
                    alt118=2;
                }
                else if ( (true) ) {
                    alt118=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("657:1: open_args_with_block options {backtrack=true; } : ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args );", 118, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA118_0>=HEREDOC_STRING && LA118_0<=FLOAT)||(LA118_0>=IF_MODIFIER && LA118_0<=UNLESS_MODIFIER)||LA118_0==ID||LA118_0==STAR||(LA118_0>=BNOT && LA118_0<=REGEX)||(LA118_0>=SINGLE_QUOTE_STRING_SIMPLE && LA118_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA118_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA118_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA118_0==LCURLY||LA118_0==LBRACK||LA118_0==COLON||LA118_0==125||(LA118_0>=127 && LA118_0<=129)||(LA118_0>=139 && LA118_0<=141)) ) {
                alt118=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("657:1: open_args_with_block options {backtrack=true; } : ( '(' call_args ')' ( block )? | '(' ')' ( block )? | call_args );", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:4: '(' call_args ')' ( block )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal270=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args_with_block3160); if (failed) return retval;
                    pushFollow(FOLLOW_call_args_in_open_args_with_block3163);
                    call_args271=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args271.getTree());
                    char_literal272=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args_with_block3165); if (failed) return retval;
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: ( block )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==LCURLY||LA116_0==142) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: block
                            {
                            pushFollow(FOLLOW_block_in_open_args_with_block3168);
                            block273=block();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, block273.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:4: '(' ')' ( block )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal274=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args_with_block3174); if (failed) return retval;
                    char_literal275=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args_with_block3177); if (failed) return retval;
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: ( block )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==LCURLY||LA117_0==142) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: block
                            {
                            pushFollow(FOLLOW_block_in_open_args_with_block3180);
                            block276=block();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, block276.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_args_in_open_args_with_block3186);
                    call_args277=call_args();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, call_args277.getTree());

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

        args_return args278 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:2: ( args -> ^( ARG args ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:4: args
            {
            pushFollow(FOLLOW_args_in_call_args3214);
            args278=args();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_args.add(args278.getTree());

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

        Token char_literal280=null;
        arg_return arg279 = null;

        arg_return arg281 = null;


        Object char_literal280_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:6: ( arg ( ',' arg )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args3232);
            arg279=arg();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, arg279.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:12: ( ',' arg )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:13: ',' arg
            	    {
            	    char_literal280=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args3235); if (failed) return retval;
            	    pushFollow(FOLLOW_arg_in_args3238);
            	    arg281=arg();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, arg281.getTree());

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

        definedExpression_return definedExpression282 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:5: ( definedExpression[false] )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:7: definedExpression[false]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_definedExpression_in_arg3249);
            definedExpression282=definedExpression(false);
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, definedExpression282.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token set283=null;

        Object set283_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:16: ( ID | CONSTANT | FID )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set283=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set283));
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

        Token ID284=null;
        Token CONSTANT285=null;
        Token FID286=null;
        op_return op287 = null;


        Object ID284_tree=null;
        Object CONSTANT285_tree=null;
        Object FID286_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:15: ( ID | CONSTANT | FID | op )
            int alt120=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt120=1;
                }
                break;
            case CONSTANT:
                {
                alt120=2;
                }
                break;
            case FID:
                {
                alt120=3;
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
                alt120=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("682:1: operation2 : ( ID | CONSTANT | FID | op );", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID284=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation23288); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID284_tree = (Object)adaptor.create(ID284);
                    adaptor.addChild(root_0, ID284_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT285=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation23292); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONSTANT285_tree = (Object)adaptor.create(CONSTANT285);
                    adaptor.addChild(root_0, CONSTANT285_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:33: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID286=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation23296); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID286_tree = (Object)adaptor.create(FID286);
                    adaptor.addChild(root_0, FID286_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:39: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation23300);
                    op287=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op287.getTree());

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

        Token ID288=null;
        Token FID289=null;
        op_return op290 = null;


        Object ID288_tree=null;
        Object FID289_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:15: ( ID | FID | op )
            int alt121=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt121=1;
                }
                break;
            case FID:
                {
                alt121=2;
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
                alt121=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("685:1: operation3 : ( ID | FID | op );", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID288=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation33316); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID288_tree = (Object)adaptor.create(ID288);
                    adaptor.addChild(root_0, ID288_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:22: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID289=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation33320); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FID289_tree = (Object)adaptor.create(FID289);
                    adaptor.addChild(root_0, FID289_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:28: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation33324);
                    op290=op();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, op290.getTree());

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

        Token ID291=null;

        Object ID291_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:688:5: ( ID -> ^( VARIABLE ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:688:7: ID
            {
            ID291=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs3338); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID291);


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
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:1: rhs : statement_expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_expression_return statement_expression292 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:5: ( statement_expression )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:7: statement_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_expression_in_rhs3354);
            statement_expression292=statement_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, statement_expression292.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token INT293=null;
        Token FLOAT294=null;
        Token REGEX297=null;
        string_return string295 = null;

        symbol_return symbol296 = null;


        Object INT293_tree=null;
        Object FLOAT294_tree=null;
        Object REGEX297_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:9: ( INT | FLOAT | string | symbol | REGEX )
            int alt122=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt122=1;
                }
                break;
            case FLOAT:
                {
                alt122=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt122=3;
                }
                break;
            case COLON:
                {
                alt122=4;
                }
                break;
            case REGEX:
                {
                alt122=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("693:1: literal : ( INT | FLOAT | string | symbol | REGEX );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT293=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal3364); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INT293_tree = (Object)adaptor.create(INT293);
                    adaptor.addChild(root_0, INT293_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT294=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal3366); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FLOAT294_tree = (Object)adaptor.create(FLOAT294);
                    adaptor.addChild(root_0, FLOAT294_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal3368);
                    string295=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string295.getTree());

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:28: symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbol_in_literal3370);
                    symbol296=symbol();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol296.getTree());

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:35: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX297=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal3372); if (failed) return retval;
                    if ( backtracking==0 ) {
                    REGEX297_tree = (Object)adaptor.create(REGEX297);
                    adaptor.addChild(root_0, REGEX297_tree);
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

        Token HEREDOC_STRING300=null;
        single_quote_string_return single_quote_string298 = null;

        double_quote_string_return double_quote_string299 = null;


        Object HEREDOC_STRING300_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:8: ( single_quote_string | double_quote_string | HEREDOC_STRING )
            int alt123=3;
            switch ( input.LA(1) ) {
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt123=1;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt123=2;
                }
                break;
            case HEREDOC_STRING:
                {
                alt123=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("764:1: string : ( single_quote_string | double_quote_string | HEREDOC_STRING );", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:10: single_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_single_quote_string_in_string4102);
                    single_quote_string298=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string298.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:30: double_quote_string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_double_quote_string_in_string4104);
                    double_quote_string299=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string299.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:50: HEREDOC_STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    HEREDOC_STRING300=(Token)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_string4106); if (failed) return retval;
                    if ( backtracking==0 ) {
                    HEREDOC_STRING300_tree = (Object)adaptor.create(HEREDOC_STRING300);
                    adaptor.addChild(root_0, HEREDOC_STRING300_tree);
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

        Token set301=null;

        Object set301_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:767:2: ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set301=(Token)input.LT(1);
            if ( (input.LA(1)>=SINGLE_QUOTE_STRING_SIMPLE && input.LA(1)<=SINGLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set301));
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

        Token set302=null;

        Object set302_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:815:2: ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set302=(Token)input.LT(1);
            if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_SIMPLE && input.LA(1)<=DOUBLE_QUOTE_STRING_COMPLEX) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set302));
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

        Token char_literal303=null;
        Token char_literal305=null;
        array_items_return array_items304 = null;


        Object char_literal303_tree=null;
        Object char_literal305_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:7: ( '[' array_items ']' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:9: '[' array_items ']'
            {
            root_0 = (Object)adaptor.nil();

            char_literal303=(Token)input.LT(1);
            match(input,LBRACK,FOLLOW_LBRACK_in_array4513); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal303_tree = (Object)adaptor.create(char_literal303);
            root_0 = (Object)adaptor.becomeRoot(char_literal303_tree, root_0);
            }
            pushFollow(FOLLOW_array_items_in_array4516);
            array_items304=array_items();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, array_items304.getTree());
            char_literal305=(Token)input.LT(1);
            match(input,RBRACK,FOLLOW_RBRACK_in_array4518); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token char_literal307=null;
        array_item_return array_item306 = null;

        array_item_return array_item308 = null;

        trailer_return trailer309 = null;


        Object char_literal307_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:13: ( array_item ( ',' array_item )* trailer )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:19: array_item ( ',' array_item )* trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_array_item_in_array_items4530);
            array_item306=array_item();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, array_item306.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:30: ( ',' array_item )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    int LA124_2 = input.LA(2);

                    if ( ((LA124_2>=HEREDOC_STRING && LA124_2<=FLOAT)||(LA124_2>=IF_MODIFIER && LA124_2<=UNLESS_MODIFIER)||LA124_2==ID||(LA124_2>=INT && LA124_2<=REGEX)||(LA124_2>=SINGLE_QUOTE_STRING_SIMPLE && LA124_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA124_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA124_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA124_2==LCURLY||LA124_2==LPAREN||LA124_2==LBRACK||LA124_2==COLON||LA124_2==125||(LA124_2>=127 && LA124_2<=129)||(LA124_2>=140 && LA124_2<=141)) ) {
                        alt124=1;
                    }


                }


                switch (alt124) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:31: ',' array_item
            	    {
            	    char_literal307=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_array_items4533); if (failed) return retval;
            	    pushFollow(FOLLOW_array_item_in_array_items4536);
            	    array_item308=array_item();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, array_item308.getTree());

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            pushFollow(FOLLOW_trailer_in_array_items4540);
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

        command_return command310 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:13: ( command )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:19: command
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_command_in_array_item4552);
            command310=command();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, command310.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token char_literal311=null;
        Token char_literal313=null;
        assoc_list_return assoc_list312 = null;


        Object char_literal311_tree=null;
        Object char_literal313_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:6: ( '{' assoc_list '}' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal311=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash4559); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal311_tree = (Object)adaptor.create(char_literal311);
            root_0 = (Object)adaptor.becomeRoot(char_literal311_tree, root_0);
            }
            pushFollow(FOLLOW_assoc_list_in_hash4562);
            assoc_list312=assoc_list();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc_list312.getTree());
            char_literal313=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash4564); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        assocs_return assocs314 = null;

        trailer_return trailer315 = null;



        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:2: ( assocs trailer )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list4573);
            assocs314=assocs();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assocs314.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list4575);
            trailer315=trailer();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, trailer315.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token char_literal317=null;
        assoc_return assoc316 = null;

        assoc_return assoc318 = null;


        Object char_literal317_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:8: ( assoc ( ',' assoc )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs4584);
            assoc316=assoc();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assoc316.getTree());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:16: ( ',' assoc )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==COMMA) ) {
                    int LA125_2 = input.LA(2);

                    if ( ((LA125_2>=HEREDOC_STRING && LA125_2<=FLOAT)||(LA125_2>=IF_MODIFIER && LA125_2<=UNLESS_MODIFIER)||LA125_2==ID||LA125_2==STAR||(LA125_2>=BNOT && LA125_2<=REGEX)||(LA125_2>=SINGLE_QUOTE_STRING_SIMPLE && LA125_2<=SINGLE_QUOTE_STRING_COMPLEX)||(LA125_2>=DOUBLE_QUOTE_STRING_SIMPLE && LA125_2<=DOUBLE_QUOTE_STRING_COMPLEX)||LA125_2==LCURLY||LA125_2==LPAREN||LA125_2==LBRACK||LA125_2==COLON||LA125_2==125||(LA125_2>=127 && LA125_2<=129)||(LA125_2>=139 && LA125_2<=141)) ) {
                        alt125=1;
                    }


                }


                switch (alt125) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:18: ',' assoc
            	    {
            	    char_literal317=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs4588); if (failed) return retval;
            	    pushFollow(FOLLOW_assoc_in_assocs4591);
            	    assoc318=assoc();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assoc318.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
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

        Token char_literal320=null;
        Token set323=null;
        symbol_name_in_assoc_return symbol_name_in_assoc319 = null;

        arg_return arg321 = null;

        arg_return arg322 = null;

        arg_return arg324 = null;


        Object char_literal320_tree=null;
        Object set323_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:15: ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg )
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:17: ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbol_name_in_assoc_in_assoc4618);
                    symbol_name_in_assoc319=symbol_name_in_assoc();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, symbol_name_in_assoc319.getTree());
                    char_literal320=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_assoc4620); if (failed) return retval;
                    pushFollow(FOLLOW_arg_in_assoc4623);
                    arg321=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg321.getTree());

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:862:82: arg ( ASSOC | ',' ) arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arg_in_assoc4627);
                    arg322=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg322.getTree());
                    set323=(Token)input.LT(1);
                    if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc4629);    throw mse;
                    }

                    pushFollow(FOLLOW_arg_in_assoc4636);
                    arg324=arg();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arg324.getTree());

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

        Token ID325=null;

        Object ID325_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:2: ( ID -> ^( SYMBOL ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:4: ID
            {
            ID325=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_symbol_name_in_assoc4646); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID325);


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

        Token LINE_BREAK326=null;
        Token char_literal327=null;

        Object LINE_BREAK326_tree=null;
        Object char_literal327_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:16: ( | LINE_BREAK | ',' )
            int alt127=3;
            switch ( input.LA(1) ) {
            case RCURLY:
            case RBRACK:
                {
                alt127=1;
                }
                break;
            case LINE_BREAK:
                {
                alt127=2;
                }
                break;
            case COMMA:
                {
                alt127=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("870:1: trailer : ( | LINE_BREAK | ',' );", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
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

                    LINE_BREAK326=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer4677); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:45: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal327=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer4682); if (failed) return retval;

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

        Token char_literal328=null;
        Token ID329=null;
        single_quote_string_return single_quote_string330 = null;

        double_quote_string_return double_quote_string331 = null;


        Object char_literal328_tree=null;
        Object ID329_tree=null;

        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:8: ( ':' ( ID | single_quote_string | double_quote_string ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:10: ':' ( ID | single_quote_string | double_quote_string )
            {
            root_0 = (Object)adaptor.nil();

            char_literal328=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_symbol4698); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal328_tree = (Object)adaptor.create(char_literal328);
            root_0 = (Object)adaptor.becomeRoot(char_literal328_tree, root_0);
            }
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:15: ( ID | single_quote_string | double_quote_string )
            int alt128=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt128=1;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt128=2;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt128=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("873:15: ( ID | single_quote_string | double_quote_string )", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:16: ID
                    {
                    ID329=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_symbol4702); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID329_tree = (Object)adaptor.create(ID329);
                    adaptor.addChild(root_0, ID329_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:21: single_quote_string
                    {
                    pushFollow(FOLLOW_single_quote_string_in_symbol4706);
                    single_quote_string330=single_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, single_quote_string330.getTree());

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:43: double_quote_string
                    {
                    pushFollow(FOLLOW_double_quote_string_in_symbol4710);
                    double_quote_string331=double_quote_string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, double_quote_string331.getTree());

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
        pushFollow(FOLLOW_simple_assignment_expression_in_synpred11435);
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
        pushFollow(FOLLOW_mlhs_in_synpred21444);
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
        pushFollow(FOLLOW_simple_assignment_expression_in_synpred31654);
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
        match(input,ID,FOLLOW_ID_in_synpred42969); if (failed) return ;
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:82: ( block )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==LCURLY||LA129_0==142) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:82: block
                {
                pushFollow(FOLLOW_block_in_synpred42971);
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
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred53160); if (failed) return ;
        pushFollow(FOLLOW_call_args_in_synpred53163);
        call_args();
        _fsp--;
        if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred53165); if (failed) return ;
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: ( block )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==LCURLY||LA130_0==142) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:24: block
                {
                pushFollow(FOLLOW_block_in_synpred53168);
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
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred63174); if (failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred63177); if (failed) return ;
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: ( block )?
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==LCURLY||LA131_0==142) ) {
            alt131=1;
        }
        switch (alt131) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:14: block
                {
                pushFollow(FOLLOW_block_in_synpred63180);
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
        pushFollow(FOLLOW_symbol_name_in_assoc_in_synpred74610);
        symbol_name_in_assoc();
        _fsp--;
        if (failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred74612); if (failed) return ;
        pushFollow(FOLLOW_arg_in_synpred74614);
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
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA126 dfa126 = new DFA126(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\3\3\1\uffff\1\3\1\uffff";
    static final String DFA5_minS =
        "\1\50\2\14\1\uffff\1\14\1\uffff";
    static final String DFA5_maxS =
        "\1\u0083\2\u008d\1\uffff\1\u008d\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\104\uffff\1\3\17\uffff\1\3\3\uffff\2\3",
            "\2\5\25\uffff\2\5\3\uffff\1\1\1\4\3\uffff\1\5\13\uffff\1\5\31"+
            "\uffff\4\5\20\uffff\2\5\1\uffff\2\5\1\uffff\1\5\6\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\1\3\3\5\2\3\1\uffff\2\5"+
            "\3\uffff\4\5",
            "\2\5\25\uffff\2\5\3\uffff\1\1\1\2\3\uffff\1\5\13\uffff\1\5\31"+
            "\uffff\4\5\20\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\3\5\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\1\3\3\5\2\3\1\uffff"+
            "\2\5\3\uffff\4\5",
            "",
            "\2\5\25\uffff\2\5\3\uffff\1\1\1\4\3\uffff\1\5\13\uffff\1\5\31"+
            "\uffff\4\5\20\uffff\2\5\1\uffff\2\5\1\uffff\1\5\6\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\1\3\3\5\2\3\1\uffff\2\5"+
            "\3\uffff\4\5",
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
    static final String DFA18_eotS =
        "\5\uffff";
    static final String DFA18_eofS =
        "\5\uffff";
    static final String DFA18_minS =
        "\1\51\1\14\3\uffff";
    static final String DFA18_maxS =
        "\1\u0084\1\u008d\3\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA18_specialS =
        "\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\120\uffff\1\2\11\uffff\1\3",
            "\2\4\25\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\13\uffff\1\4\31"+
            "\uffff\4\4\20\uffff\2\4\1\uffff\2\4\1\uffff\1\4\6\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\2\uffff\7\4\1\3\2\4\3\uffff\4\4",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "337:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA106_eotS =
        "\u00e4\uffff";
    static final String DFA106_eofS =
        "\1\uffff\1\43\u00e2\uffff";
    static final String DFA106_minS =
        "\1\55\1\13\1\uffff\1\14\1\uffff\1\14\32\uffff\1\14\7\uffff\1\14"+
        "\7\uffff\1\14\5\uffff\1\14\1\0\1\55\2\0\2\13\16\0\2\uffff\1\0\24"+
        "\uffff\33\0\51\uffff\1\0\7\uffff\61\0\5\uffff";
    static final String DFA106_maxS =
        "\1\55\1\u008e\1\uffff\1\u008d\1\uffff\1\u008d\32\uffff\1\u008d\7"+
        "\uffff\1\u008d\7\uffff\1\u008d\5\uffff\1\u008d\1\0\1\55\2\0\2\u0089"+
        "\16\0\2\uffff\1\0\24\uffff\33\0\51\uffff\1\0\7\uffff\61\0\5\uffff";
    static final String DFA106_acceptS =
        "\2\uffff\1\1\1\uffff\1\1\1\uffff\32\1\1\uffff\7\1\1\uffff\6\1\1"+
        "\2\1\uffff\5\1\25\uffff\2\1\1\uffff\24\1\33\uffff\51\1\1\uffff\7"+
        "\1\61\uffff\5\1";
    static final String DFA106_specialS =
        "\1\uffff\1\10\1\uffff\1\12\1\uffff\1\7\32\uffff\1\2\7\uffff\1\11"+
        "\7\uffff\1\1\6\uffff\1\0\1\uffff\1\5\1\6\1\4\1\3\u00a7\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\1",
            "\1\12\2\57\17\uffff\1\6\1\7\4\uffff\1\40\1\60\3\61\1\41\1\42"+
            "\1\uffff\2\56\1\57\1\23\1\24\1\25\1\27\1\20\1\22\1\17\1\21\1"+
            "\13\1\10\1\11\1\5\1\4\16\uffff\1\35\1\33\1\34\1\32\1\31\1\26"+
            "\1\30\1\15\1\16\1\14\4\57\20\uffff\2\57\1\uffff\2\57\1\uffff"+
            "\1\3\1\47\2\uffff\1\54\2\uffff\1\57\1\52\1\57\1\55\1\uffff\1"+
            "\53\1\50\2\uffff\1\57\1\44\3\57\1\45\1\46\1\51\3\uffff\1\36"+
            "\1\37\1\uffff\3\57\1\2",
            "",
            "\1\101\1\76\25\uffff\1\106\1\107\4\uffff\1\62\3\uffff\1\67\13"+
            "\uffff\1\70\27\uffff\1\63\1\uffff\1\71\1\72\1\75\1\103\20\uffff"+
            "\2\77\1\uffff\2\100\1\uffff\1\111\1\114\5\uffff\1\112\1\uffff"+
            "\1\110\3\uffff\1\102\2\uffff\1\105\1\uffff\3\104\3\uffff\1\64"+
            "\1\113\3\uffff\1\65\1\66\1\73\1\74",
            "",
            "\1\127\1\124\25\uffff\1\134\1\135\4\uffff\1\116\3\uffff\1\115"+
            "\45\uffff\1\117\1\120\1\123\1\131\20\uffff\2\125\1\uffff\2\126"+
            "\1\uffff\1\137\6\uffff\1\140\1\uffff\1\136\3\uffff\1\130\2\uffff"+
            "\1\133\1\uffff\3\132\12\uffff\1\121\1\122",
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
            "\1\157\1\154\25\uffff\1\164\1\165\4\uffff\1\141\3\uffff\1\145"+
            "\13\uffff\1\146\31\uffff\1\147\1\150\1\153\1\161\20\uffff\2"+
            "\155\1\uffff\2\156\1\uffff\1\167\6\uffff\1\170\1\uffff\1\166"+
            "\3\uffff\1\160\2\uffff\1\163\1\uffff\3\162\3\uffff\1\142\1\171"+
            "\3\uffff\1\143\1\144\1\151\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083\1\u0082\25\uffff\1\u0088\1\u0089\3\uffff\1\u008e\1"+
            "\u008d\3\uffff\1\172\13\uffff\1\u0094\31\uffff\1\175\1\176\1"+
            "\u0081\1\u0085\20\uffff\2\173\1\uffff\2\174\1\uffff\1\u008b"+
            "\6\uffff\1\u008c\1\uffff\1\u008a\3\uffff\1\u0084\2\uffff\1\u0087"+
            "\1\u0090\3\u0086\1\45\1\u008f\1\uffff\1\u0091\1\u0095\3\uffff"+
            "\1\u0092\1\u0093\1\177\1\u0080",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3\1\u00a0\25\uffff\1\u00a8\1\u00a9\4\uffff\1\141\3\uffff"+
            "\1\u0099\13\uffff\1\u009a\31\uffff\1\u009b\1\u009c\1\u009f\1"+
            "\u00a5\20\uffff\2\u00a1\1\uffff\2\u00a2\1\uffff\1\u00ab\6\uffff"+
            "\1\u00ac\1\uffff\1\u00aa\3\uffff\1\u00a4\2\uffff\1\u00a7\1\uffff"+
            "\3\u00a6\3\uffff\1\u0096\1\u00ad\3\uffff\1\u0097\1\u0098\1\u009d"+
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b9\1\u00b6\25\uffff\1\u00be\1\u00bf\10\uffff\1\u00af\13"+
            "\uffff\1\u00b0\31\uffff\1\u00b1\1\u00b2\1\u00b5\1\u00bb\20\uffff"+
            "\2\u00b7\1\uffff\2\u00b8\1\uffff\1\u00c1\6\uffff\1\u00c2\1\uffff"+
            "\1\u00c0\3\uffff\1\u00ba\2\uffff\1\u00bd\1\uffff\3\u00bc\11"+
            "\uffff\1\u00ae\1\u00b3\1\u00b4",
            "\1\uffff",
            "\1\u00c3",
            "\1\uffff",
            "\1\uffff",
            "\1\u00cb\21\uffff\1\u00c7\1\u00c8\4\uffff\5\u00e1\1\u00e2\1"+
            "\u00e3\1\uffff\2\u00c4\1\uffff\1\u00d4\1\u00d5\1\u00d6\1\u00d8"+
            "\1\u00d1\1\u00d3\1\u00d0\1\u00d2\1\u00cc\1\u00c9\1\u00ca\1\u00c6"+
            "\1\u00c5\16\uffff\1\u00de\1\u00dc\1\u00dd\1\u00db\1\u00da\1"+
            "\u00d7\1\u00d9\1\u00ce\1\u00cf\1\u00cd\33\uffff\1\114\2\uffff"+
            "\1\57\7\uffff\1\57\16\uffff\1\u00df\1\u00e0",
            "\1\u00cb\21\uffff\1\u00c7\1\u00c8\4\uffff\5\u00e1\1\u00e2\1"+
            "\u00e3\1\uffff\2\u00c4\1\uffff\1\u00d4\1\u00d5\1\u00d6\1\u00d8"+
            "\1\u00d1\1\u00d3\1\u00d0\1\u00d2\1\u00cc\1\u00c9\1\u00ca\1\u00c6"+
            "\1\u00c5\16\uffff\1\u00de\1\u00dc\1\u00dd\1\u00db\1\u00da\1"+
            "\u00d7\1\u00d9\1\u00ce\1\u00cf\1\u00cd\33\uffff\1\114\2\uffff"+
            "\1\57\7\uffff\1\57\16\uffff\1\u00df\1\u00e0",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "632:1: method[boolean topLevel] : ( ( ID ( block )? )=> ID ( block )? -> ^( VARIABLE_OR_METHOD ID ( block )? ) | ID open_args_with_block -> ^( CALL ID open_args_with_block ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_55 = input.LA(1);

                         
                        int index106_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 173;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index106_55);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA106_48 = input.LA(1);

                         
                        int index106_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA106_48==LINE_BREAK) && (synpred4())) {s = 97;}

                        else if ( (LA106_48==133) && (synpred4())) {s = 150;}

                        else if ( (LA106_48==138) && (synpred4())) {s = 151;}

                        else if ( (LA106_48==139) && (synpred4())) {s = 152;}

                        else if ( (LA106_48==ID) && (synpred4())) {s = 153;}

                        else if ( (LA106_48==STAR) && (synpred4())) {s = 154;}

                        else if ( (LA106_48==BNOT) && (synpred4())) {s = 155;}

                        else if ( (LA106_48==NOT) && (synpred4())) {s = 156;}

                        else if ( (LA106_48==140) && (synpred4())) {s = 157;}

                        else if ( (LA106_48==141) && (synpred4())) {s = 158;}

                        else if ( (LA106_48==INT) && (synpred4())) {s = 159;}

                        else if ( (LA106_48==FLOAT) && (synpred4())) {s = 160;}

                        else if ( ((LA106_48>=SINGLE_QUOTE_STRING_SIMPLE && LA106_48<=SINGLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 161;}

                        else if ( ((LA106_48>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_48<=DOUBLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 162;}

                        else if ( (LA106_48==HEREDOC_STRING) && (synpred4())) {s = 163;}

                        else if ( (LA106_48==COLON) && (synpred4())) {s = 164;}

                        else if ( (LA106_48==REGEX) && (synpred4())) {s = 165;}

                        else if ( ((LA106_48>=127 && LA106_48<=129)) ) {s = 166;}

                        else if ( (LA106_48==125) && (synpred4())) {s = 167;}

                        else if ( (LA106_48==IF_MODIFIER) && (synpred4())) {s = 168;}

                        else if ( (LA106_48==UNLESS_MODIFIER) && (synpred4())) {s = 169;}

                        else if ( (LA106_48==LBRACK) && (synpred4())) {s = 170;}

                        else if ( (LA106_48==LCURLY) && (synpred4())) {s = 171;}

                        else if ( (LA106_48==LPAREN) && (synpred4())) {s = 172;}

                        else if ( (LA106_48==134) && (synpred4())) {s = 173;}

                         
                        input.seek(index106_48);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA106_32 = input.LA(1);

                         
                        int index106_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA106_32==LINE_BREAK) && (synpred4())) {s = 97;}

                        else if ( (LA106_32==133) ) {s = 98;}

                        else if ( (LA106_32==138) ) {s = 99;}

                        else if ( (LA106_32==139) ) {s = 100;}

                        else if ( (LA106_32==ID) ) {s = 101;}

                        else if ( (LA106_32==STAR) ) {s = 102;}

                        else if ( (LA106_32==BNOT) ) {s = 103;}

                        else if ( (LA106_32==NOT) ) {s = 104;}

                        else if ( (LA106_32==140) ) {s = 105;}

                        else if ( (LA106_32==141) ) {s = 106;}

                        else if ( (LA106_32==INT) ) {s = 107;}

                        else if ( (LA106_32==FLOAT) ) {s = 108;}

                        else if ( ((LA106_32>=SINGLE_QUOTE_STRING_SIMPLE && LA106_32<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 109;}

                        else if ( ((LA106_32>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_32<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 110;}

                        else if ( (LA106_32==HEREDOC_STRING) ) {s = 111;}

                        else if ( (LA106_32==COLON) ) {s = 112;}

                        else if ( (LA106_32==REGEX) ) {s = 113;}

                        else if ( ((LA106_32>=127 && LA106_32<=129)) ) {s = 114;}

                        else if ( (LA106_32==125) ) {s = 115;}

                        else if ( (LA106_32==IF_MODIFIER) ) {s = 116;}

                        else if ( (LA106_32==UNLESS_MODIFIER) ) {s = 117;}

                        else if ( (LA106_32==LBRACK) ) {s = 118;}

                        else if ( (LA106_32==LCURLY) ) {s = 119;}

                        else if ( (LA106_32==LPAREN) ) {s = 120;}

                        else if ( (LA106_32==134) ) {s = 121;}

                         
                        input.seek(index106_32);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA106_60 = input.LA(1);

                         
                        int index106_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA106_60>=DOT && LA106_60<=COLON2)) ) {s = 196;}

                        else if ( (LA106_60==POWER) ) {s = 197;}

                        else if ( (LA106_60==STAR) ) {s = 198;}

                        else if ( (LA106_60==DIV) ) {s = 199;}

                        else if ( (LA106_60==MOD) ) {s = 200;}

                        else if ( (LA106_60==PLUS) ) {s = 201;}

                        else if ( (LA106_60==MINUS) ) {s = 202;}

                        else if ( (LA106_60==LEFT_SHIFT) ) {s = 203;}

                        else if ( (LA106_60==RIGHT_SHIFT) ) {s = 204;}

                        else if ( (LA106_60==BAND) ) {s = 205;}

                        else if ( (LA106_60==BXOR) ) {s = 206;}

                        else if ( (LA106_60==BOR) ) {s = 207;}

                        else if ( (LA106_60==LESS_THAN) ) {s = 208;}

                        else if ( (LA106_60==GREATER_THAN) ) {s = 209;}

                        else if ( (LA106_60==LESS_OR_EQUAL) ) {s = 210;}

                        else if ( (LA106_60==GREATER_OR_EQUAL) ) {s = 211;}

                        else if ( (LA106_60==COMPARE) ) {s = 212;}

                        else if ( (LA106_60==EQUAL) ) {s = 213;}

                        else if ( (LA106_60==CASE_EQUAL) ) {s = 214;}

                        else if ( (LA106_60==NOT_EQUAL) ) {s = 215;}

                        else if ( (LA106_60==MATCH) ) {s = 216;}

                        else if ( (LA106_60==NOT_MATCH) ) {s = 217;}

                        else if ( (LA106_60==LOGICAL_AND) ) {s = 218;}

                        else if ( (LA106_60==LOGICAL_OR) ) {s = 219;}

                        else if ( (LA106_60==INCLUSIVE_RANGE) ) {s = 220;}

                        else if ( (LA106_60==EXCLUSIVE_RANGE) ) {s = 221;}

                        else if ( (LA106_60==QUESTION) ) {s = 222;}

                        else if ( (LA106_60==136) && (synpred4())) {s = 223;}

                        else if ( (LA106_60==137) && (synpred4())) {s = 224;}

                        else if ( ((LA106_60>=IF_MODIFIER && LA106_60<=RESCUE_MODIFIER)) && (synpred4())) {s = 225;}

                        else if ( (LA106_60==SEMI) && (synpred4())) {s = 226;}

                        else if ( (LA106_60==LINE_BREAK) && (synpred4())) {s = 227;}

                        else if ( (LA106_60==RCURLY) && (synpred4())) {s = 76;}

                        else if ( (LA106_60==ASSOC||LA106_60==COMMA) ) {s = 47;}

                         
                        input.seek(index106_60);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA106_59 = input.LA(1);

                         
                        int index106_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA106_59>=DOT && LA106_59<=COLON2)) ) {s = 196;}

                        else if ( (LA106_59==POWER) ) {s = 197;}

                        else if ( (LA106_59==STAR) ) {s = 198;}

                        else if ( (LA106_59==DIV) ) {s = 199;}

                        else if ( (LA106_59==MOD) ) {s = 200;}

                        else if ( (LA106_59==PLUS) ) {s = 201;}

                        else if ( (LA106_59==MINUS) ) {s = 202;}

                        else if ( (LA106_59==LEFT_SHIFT) ) {s = 203;}

                        else if ( (LA106_59==RIGHT_SHIFT) ) {s = 204;}

                        else if ( (LA106_59==BAND) ) {s = 205;}

                        else if ( (LA106_59==BXOR) ) {s = 206;}

                        else if ( (LA106_59==BOR) ) {s = 207;}

                        else if ( (LA106_59==LESS_THAN) ) {s = 208;}

                        else if ( (LA106_59==GREATER_THAN) ) {s = 209;}

                        else if ( (LA106_59==LESS_OR_EQUAL) ) {s = 210;}

                        else if ( (LA106_59==GREATER_OR_EQUAL) ) {s = 211;}

                        else if ( (LA106_59==COMPARE) ) {s = 212;}

                        else if ( (LA106_59==EQUAL) ) {s = 213;}

                        else if ( (LA106_59==CASE_EQUAL) ) {s = 214;}

                        else if ( (LA106_59==NOT_EQUAL) ) {s = 215;}

                        else if ( (LA106_59==MATCH) ) {s = 216;}

                        else if ( (LA106_59==NOT_MATCH) ) {s = 217;}

                        else if ( (LA106_59==LOGICAL_AND) ) {s = 218;}

                        else if ( (LA106_59==LOGICAL_OR) ) {s = 219;}

                        else if ( (LA106_59==INCLUSIVE_RANGE) ) {s = 220;}

                        else if ( (LA106_59==EXCLUSIVE_RANGE) ) {s = 221;}

                        else if ( (LA106_59==QUESTION) ) {s = 222;}

                        else if ( (LA106_59==ASSOC||LA106_59==COMMA) ) {s = 47;}

                        else if ( (LA106_59==136) && (synpred4())) {s = 223;}

                        else if ( (LA106_59==137) && (synpred4())) {s = 224;}

                        else if ( ((LA106_59>=IF_MODIFIER && LA106_59<=RESCUE_MODIFIER)) && (synpred4())) {s = 225;}

                        else if ( (LA106_59==SEMI) && (synpred4())) {s = 226;}

                        else if ( (LA106_59==LINE_BREAK) && (synpred4())) {s = 227;}

                        else if ( (LA106_59==RCURLY) && (synpred4())) {s = 76;}

                         
                        input.seek(index106_59);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA106_57 = input.LA(1);

                         
                        int index106_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 173;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index106_57);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA106_58 = input.LA(1);

                         
                        int index106_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 173;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index106_58);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA106_5 = input.LA(1);

                         
                        int index106_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA106_5==ID) ) {s = 77;}

                        else if ( (LA106_5==LINE_BREAK) && (synpred4())) {s = 78;}

                        else if ( (LA106_5==BNOT) && (synpred4())) {s = 79;}

                        else if ( (LA106_5==NOT) && (synpred4())) {s = 80;}

                        else if ( (LA106_5==140) && (synpred4())) {s = 81;}

                        else if ( (LA106_5==141) && (synpred4())) {s = 82;}

                        else if ( (LA106_5==INT) && (synpred4())) {s = 83;}

                        else if ( (LA106_5==FLOAT) && (synpred4())) {s = 84;}

                        else if ( ((LA106_5>=SINGLE_QUOTE_STRING_SIMPLE && LA106_5<=SINGLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 85;}

                        else if ( ((LA106_5>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_5<=DOUBLE_QUOTE_STRING_COMPLEX)) && (synpred4())) {s = 86;}

                        else if ( (LA106_5==HEREDOC_STRING) && (synpred4())) {s = 87;}

                        else if ( (LA106_5==COLON) && (synpred4())) {s = 88;}

                        else if ( (LA106_5==REGEX) && (synpred4())) {s = 89;}

                        else if ( ((LA106_5>=127 && LA106_5<=129)) && (synpred4())) {s = 90;}

                        else if ( (LA106_5==125) && (synpred4())) {s = 91;}

                        else if ( (LA106_5==IF_MODIFIER) && (synpred4())) {s = 92;}

                        else if ( (LA106_5==UNLESS_MODIFIER) && (synpred4())) {s = 93;}

                        else if ( (LA106_5==LBRACK) && (synpred4())) {s = 94;}

                        else if ( (LA106_5==LCURLY) && (synpred4())) {s = 95;}

                        else if ( (LA106_5==LPAREN) && (synpred4())) {s = 96;}

                         
                        input.seek(index106_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA106_1==142) && (synpred4())) {s = 2;}

                        else if ( (LA106_1==LCURLY) ) {s = 3;}

                        else if ( (LA106_1==POWER) && (synpred4())) {s = 4;}

                        else if ( (LA106_1==STAR) ) {s = 5;}

                        else if ( (LA106_1==DIV) && (synpred4())) {s = 6;}

                        else if ( (LA106_1==MOD) && (synpred4())) {s = 7;}

                        else if ( (LA106_1==PLUS) && (synpred4())) {s = 8;}

                        else if ( (LA106_1==MINUS) && (synpred4())) {s = 9;}

                        else if ( (LA106_1==LEFT_SHIFT) && (synpred4())) {s = 10;}

                        else if ( (LA106_1==RIGHT_SHIFT) && (synpred4())) {s = 11;}

                        else if ( (LA106_1==BAND) && (synpred4())) {s = 12;}

                        else if ( (LA106_1==BXOR) && (synpred4())) {s = 13;}

                        else if ( (LA106_1==BOR) && (synpred4())) {s = 14;}

                        else if ( (LA106_1==LESS_THAN) && (synpred4())) {s = 15;}

                        else if ( (LA106_1==GREATER_THAN) && (synpred4())) {s = 16;}

                        else if ( (LA106_1==LESS_OR_EQUAL) && (synpred4())) {s = 17;}

                        else if ( (LA106_1==GREATER_OR_EQUAL) && (synpred4())) {s = 18;}

                        else if ( (LA106_1==COMPARE) && (synpred4())) {s = 19;}

                        else if ( (LA106_1==EQUAL) && (synpred4())) {s = 20;}

                        else if ( (LA106_1==CASE_EQUAL) && (synpred4())) {s = 21;}

                        else if ( (LA106_1==NOT_EQUAL) && (synpred4())) {s = 22;}

                        else if ( (LA106_1==MATCH) && (synpred4())) {s = 23;}

                        else if ( (LA106_1==NOT_MATCH) && (synpred4())) {s = 24;}

                        else if ( (LA106_1==LOGICAL_AND) && (synpred4())) {s = 25;}

                        else if ( (LA106_1==LOGICAL_OR) && (synpred4())) {s = 26;}

                        else if ( (LA106_1==INCLUSIVE_RANGE) && (synpred4())) {s = 27;}

                        else if ( (LA106_1==EXCLUSIVE_RANGE) && (synpred4())) {s = 28;}

                        else if ( (LA106_1==QUESTION) && (synpred4())) {s = 29;}

                        else if ( (LA106_1==136) && (synpred4())) {s = 30;}

                        else if ( (LA106_1==137) && (synpred4())) {s = 31;}

                        else if ( (LA106_1==IF_MODIFIER) ) {s = 32;}

                        else if ( (LA106_1==SEMI) && (synpred4())) {s = 33;}

                        else if ( (LA106_1==LINE_BREAK) && (synpred4())) {s = 34;}

                        else if ( (LA106_1==EOF) && (synpred4())) {s = 35;}

                        else if ( (LA106_1==126) && (synpred4())) {s = 36;}

                        else if ( (LA106_1==130) && (synpred4())) {s = 37;}

                        else if ( (LA106_1==131) && (synpred4())) {s = 38;}

                        else if ( (LA106_1==RCURLY) && (synpred4())) {s = 39;}

                        else if ( (LA106_1==COLON) ) {s = 40;}

                        else if ( (LA106_1==132) && (synpred4())) {s = 41;}

                        else if ( (LA106_1==RPAREN) && (synpred4())) {s = 42;}

                        else if ( (LA106_1==COMMA) && (synpred4())) {s = 43;}

                        else if ( (LA106_1==ASSOC) && (synpred4())) {s = 44;}

                        else if ( (LA106_1==RBRACK) && (synpred4())) {s = 45;}

                        else if ( ((LA106_1>=DOT && LA106_1<=COLON2)) && (synpred4())) {s = 46;}

                        else if ( ((LA106_1>=HEREDOC_STRING && LA106_1<=FLOAT)||LA106_1==ID||(LA106_1>=BNOT && LA106_1<=REGEX)||(LA106_1>=SINGLE_QUOTE_STRING_SIMPLE && LA106_1<=SINGLE_QUOTE_STRING_COMPLEX)||(LA106_1>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_1<=DOUBLE_QUOTE_STRING_COMPLEX)||LA106_1==LPAREN||LA106_1==LBRACK||LA106_1==125||(LA106_1>=127 && LA106_1<=129)||(LA106_1>=139 && LA106_1<=141)) ) {s = 47;}

                        else if ( (LA106_1==UNLESS_MODIFIER) ) {s = 48;}

                        else if ( ((LA106_1>=WHILE_MODIFIER && LA106_1<=RESCUE_MODIFIER)) && (synpred4())) {s = 49;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA106_40 = input.LA(1);

                         
                        int index106_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA106_40==ID) ) {s = 122;}

                        else if ( ((LA106_40>=SINGLE_QUOTE_STRING_SIMPLE && LA106_40<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 123;}

                        else if ( ((LA106_40>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_40<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 124;}

                        else if ( (LA106_40==BNOT) && (synpred4())) {s = 125;}

                        else if ( (LA106_40==NOT) && (synpred4())) {s = 126;}

                        else if ( (LA106_40==140) && (synpred4())) {s = 127;}

                        else if ( (LA106_40==141) && (synpred4())) {s = 128;}

                        else if ( (LA106_40==INT) && (synpred4())) {s = 129;}

                        else if ( (LA106_40==FLOAT) && (synpred4())) {s = 130;}

                        else if ( (LA106_40==HEREDOC_STRING) && (synpred4())) {s = 131;}

                        else if ( (LA106_40==COLON) && (synpred4())) {s = 132;}

                        else if ( (LA106_40==REGEX) && (synpred4())) {s = 133;}

                        else if ( ((LA106_40>=127 && LA106_40<=129)) && (synpred4())) {s = 134;}

                        else if ( (LA106_40==125) && (synpred4())) {s = 135;}

                        else if ( (LA106_40==IF_MODIFIER) && (synpred4())) {s = 136;}

                        else if ( (LA106_40==UNLESS_MODIFIER) && (synpred4())) {s = 137;}

                        else if ( (LA106_40==LBRACK) && (synpred4())) {s = 138;}

                        else if ( (LA106_40==LCURLY) && (synpred4())) {s = 139;}

                        else if ( (LA106_40==LPAREN) && (synpred4())) {s = 140;}

                        else if ( (LA106_40==LINE_BREAK) && (synpred4())) {s = 141;}

                        else if ( (LA106_40==SEMI) && (synpred4())) {s = 142;}

                        else if ( (LA106_40==130) && (synpred4())) {s = 37;}

                        else if ( (LA106_40==131) && (synpred4())) {s = 143;}

                        else if ( (LA106_40==126) && (synpred4())) {s = 144;}

                        else if ( (LA106_40==133) && (synpred4())) {s = 145;}

                        else if ( (LA106_40==138) && (synpred4())) {s = 146;}

                        else if ( (LA106_40==139) && (synpred4())) {s = 147;}

                        else if ( (LA106_40==STAR) && (synpred4())) {s = 148;}

                        else if ( (LA106_40==134) && (synpred4())) {s = 149;}

                         
                        input.seek(index106_40);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA106_3 = input.LA(1);

                         
                        int index106_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA106_3==LINE_BREAK) && (synpred4())) {s = 50;}

                        else if ( (LA106_3==BOR) && (synpred4())) {s = 51;}

                        else if ( (LA106_3==133) && (synpred4())) {s = 52;}

                        else if ( (LA106_3==138) && (synpred4())) {s = 53;}

                        else if ( (LA106_3==139) ) {s = 54;}

                        else if ( (LA106_3==ID) ) {s = 55;}

                        else if ( (LA106_3==STAR) ) {s = 56;}

                        else if ( (LA106_3==BNOT) ) {s = 57;}

                        else if ( (LA106_3==NOT) ) {s = 58;}

                        else if ( (LA106_3==140) ) {s = 59;}

                        else if ( (LA106_3==141) ) {s = 60;}

                        else if ( (LA106_3==INT) ) {s = 61;}

                        else if ( (LA106_3==FLOAT) ) {s = 62;}

                        else if ( ((LA106_3>=SINGLE_QUOTE_STRING_SIMPLE && LA106_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 63;}

                        else if ( ((LA106_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA106_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 64;}

                        else if ( (LA106_3==HEREDOC_STRING) ) {s = 65;}

                        else if ( (LA106_3==COLON) ) {s = 66;}

                        else if ( (LA106_3==REGEX) ) {s = 67;}

                        else if ( ((LA106_3>=127 && LA106_3<=129)) ) {s = 68;}

                        else if ( (LA106_3==125) ) {s = 69;}

                        else if ( (LA106_3==IF_MODIFIER) ) {s = 70;}

                        else if ( (LA106_3==UNLESS_MODIFIER) ) {s = 71;}

                        else if ( (LA106_3==LBRACK) ) {s = 72;}

                        else if ( (LA106_3==LCURLY) ) {s = 73;}

                        else if ( (LA106_3==LPAREN) ) {s = 74;}

                        else if ( (LA106_3==134) && (synpred4())) {s = 75;}

                        else if ( (LA106_3==RCURLY) && (synpred4())) {s = 76;}

                         
                        input.seek(index106_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA126_eotS =
        "\67\uffff";
    static final String DFA126_eofS =
        "\67\uffff";
    static final String DFA126_minS =
        "\1\14\1\13\1\uffff\1\14\1\uffff\1\0\7\uffff\2\13\12\uffff\34\0\2"+
        "\uffff";
    static final String DFA126_maxS =
        "\1\u008d\1\u008e\1\uffff\1\u008d\1\uffff\1\0\7\uffff\2\171\12\uffff"+
        "\34\0\2\uffff";
    static final String DFA126_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff\7\1\2\uffff\12\1\34\uffff\2\1";
    static final String DFA126_specialS =
        "\3\uffff\1\3\1\uffff\1\1\7\uffff\1\2\1\0\50\uffff}>";
    static final String[] DFA126_transitionS = {
            "\2\2\25\uffff\2\2\10\uffff\1\1\13\uffff\1\2\31\uffff\4\2\20"+
            "\uffff\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\2\2\uffff\1\2\1\uffff\3\2\11\uffff\3\2",
            "\3\2\17\uffff\2\2\4\uffff\2\2\6\uffff\54\2\20\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\1\2\1\3\2\uffff\1\2\1\uffff\3\2\11\uffff\4\2",
            "",
            "\1\17\1\14\25\uffff\1\24\1\25\10\uffff\1\5\13\uffff\1\6\31\uffff"+
            "\1\7\1\10\1\13\1\21\20\uffff\2\15\1\uffff\2\16\1\uffff\1\27"+
            "\6\uffff\1\30\1\uffff\1\26\3\uffff\1\20\2\uffff\1\23\1\uffff"+
            "\3\22\11\uffff\1\4\1\11\1\12",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\21\uffff\1\34\1\35\12\uffff\1\66\1\uffff\2\31\1\uffff"+
            "\1\51\1\52\1\53\1\55\1\46\1\50\1\45\1\47\1\41\1\36\1\37\1\33"+
            "\1\32\16\uffff\1\63\1\61\1\62\1\60\1\57\1\54\1\56\1\43\1\44"+
            "\1\42\33\uffff\1\65\2\uffff\1\2\7\uffff\1\64",
            "\1\40\21\uffff\1\34\1\35\12\uffff\1\66\1\uffff\2\31\1\uffff"+
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
    static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
    static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
    static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
    static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
    static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
    static final short[][] DFA126_transition;

    static {
        int numStates = DFA126_transitionS.length;
        DFA126_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
        }
    }

    class DFA126 extends DFA {

        public DFA126(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 126;
            this.eot = DFA126_eot;
            this.eof = DFA126_eof;
            this.min = DFA126_min;
            this.max = DFA126_max;
            this.accept = DFA126_accept;
            this.special = DFA126_special;
            this.transition = DFA126_transition;
        }
        public String getDescription() {
            return "862:1: assoc : ( ( symbol_name_in_assoc ':' arg )=> symbol_name_in_assoc ':' arg | arg ( ASSOC | ',' ) arg );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA126_14 = input.LA(1);

                         
                        int index126_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA126_14>=DOT && LA126_14<=COLON2)) ) {s = 25;}

                        else if ( (LA126_14==POWER) ) {s = 26;}

                        else if ( (LA126_14==STAR) ) {s = 27;}

                        else if ( (LA126_14==DIV) ) {s = 28;}

                        else if ( (LA126_14==MOD) ) {s = 29;}

                        else if ( (LA126_14==PLUS) ) {s = 30;}

                        else if ( (LA126_14==MINUS) ) {s = 31;}

                        else if ( (LA126_14==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA126_14==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA126_14==BAND) ) {s = 34;}

                        else if ( (LA126_14==BXOR) ) {s = 35;}

                        else if ( (LA126_14==BOR) ) {s = 36;}

                        else if ( (LA126_14==LESS_THAN) ) {s = 37;}

                        else if ( (LA126_14==GREATER_THAN) ) {s = 38;}

                        else if ( (LA126_14==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA126_14==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA126_14==COMPARE) ) {s = 41;}

                        else if ( (LA126_14==EQUAL) ) {s = 42;}

                        else if ( (LA126_14==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA126_14==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA126_14==MATCH) ) {s = 45;}

                        else if ( (LA126_14==NOT_MATCH) ) {s = 46;}

                        else if ( (LA126_14==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA126_14==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA126_14==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA126_14==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA126_14==QUESTION) ) {s = 51;}

                        else if ( (LA126_14==COMMA) ) {s = 52;}

                        else if ( (LA126_14==RCURLY) && (synpred7())) {s = 53;}

                        else if ( (LA126_14==LINE_BREAK) && (synpred7())) {s = 54;}

                        else if ( (LA126_14==ASSOC) ) {s = 2;}

                         
                        input.seek(index126_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA126_5 = input.LA(1);

                         
                        int index126_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index126_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA126_13 = input.LA(1);

                         
                        int index126_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA126_13>=DOT && LA126_13<=COLON2)) ) {s = 25;}

                        else if ( (LA126_13==POWER) ) {s = 26;}

                        else if ( (LA126_13==STAR) ) {s = 27;}

                        else if ( (LA126_13==DIV) ) {s = 28;}

                        else if ( (LA126_13==MOD) ) {s = 29;}

                        else if ( (LA126_13==PLUS) ) {s = 30;}

                        else if ( (LA126_13==MINUS) ) {s = 31;}

                        else if ( (LA126_13==LEFT_SHIFT) ) {s = 32;}

                        else if ( (LA126_13==RIGHT_SHIFT) ) {s = 33;}

                        else if ( (LA126_13==BAND) ) {s = 34;}

                        else if ( (LA126_13==BXOR) ) {s = 35;}

                        else if ( (LA126_13==BOR) ) {s = 36;}

                        else if ( (LA126_13==LESS_THAN) ) {s = 37;}

                        else if ( (LA126_13==GREATER_THAN) ) {s = 38;}

                        else if ( (LA126_13==LESS_OR_EQUAL) ) {s = 39;}

                        else if ( (LA126_13==GREATER_OR_EQUAL) ) {s = 40;}

                        else if ( (LA126_13==COMPARE) ) {s = 41;}

                        else if ( (LA126_13==EQUAL) ) {s = 42;}

                        else if ( (LA126_13==CASE_EQUAL) ) {s = 43;}

                        else if ( (LA126_13==NOT_EQUAL) ) {s = 44;}

                        else if ( (LA126_13==MATCH) ) {s = 45;}

                        else if ( (LA126_13==NOT_MATCH) ) {s = 46;}

                        else if ( (LA126_13==LOGICAL_AND) ) {s = 47;}

                        else if ( (LA126_13==LOGICAL_OR) ) {s = 48;}

                        else if ( (LA126_13==INCLUSIVE_RANGE) ) {s = 49;}

                        else if ( (LA126_13==EXCLUSIVE_RANGE) ) {s = 50;}

                        else if ( (LA126_13==QUESTION) ) {s = 51;}

                        else if ( (LA126_13==COMMA) ) {s = 52;}

                        else if ( (LA126_13==RCURLY) && (synpred7())) {s = 53;}

                        else if ( (LA126_13==LINE_BREAK) && (synpred7())) {s = 54;}

                        else if ( (LA126_13==ASSOC) ) {s = 2;}

                         
                        input.seek(index126_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA126_3 = input.LA(1);

                         
                        int index126_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA126_3==139) && (synpred7())) {s = 4;}

                        else if ( (LA126_3==ID) ) {s = 5;}

                        else if ( (LA126_3==STAR) && (synpred7())) {s = 6;}

                        else if ( (LA126_3==BNOT) && (synpred7())) {s = 7;}

                        else if ( (LA126_3==NOT) && (synpred7())) {s = 8;}

                        else if ( (LA126_3==140) && (synpred7())) {s = 9;}

                        else if ( (LA126_3==141) && (synpred7())) {s = 10;}

                        else if ( (LA126_3==INT) && (synpred7())) {s = 11;}

                        else if ( (LA126_3==FLOAT) && (synpred7())) {s = 12;}

                        else if ( ((LA126_3>=SINGLE_QUOTE_STRING_SIMPLE && LA126_3<=SINGLE_QUOTE_STRING_COMPLEX)) ) {s = 13;}

                        else if ( ((LA126_3>=DOUBLE_QUOTE_STRING_SIMPLE && LA126_3<=DOUBLE_QUOTE_STRING_COMPLEX)) ) {s = 14;}

                        else if ( (LA126_3==HEREDOC_STRING) && (synpred7())) {s = 15;}

                        else if ( (LA126_3==COLON) && (synpred7())) {s = 16;}

                        else if ( (LA126_3==REGEX) && (synpred7())) {s = 17;}

                        else if ( ((LA126_3>=127 && LA126_3<=129)) && (synpred7())) {s = 18;}

                        else if ( (LA126_3==125) && (synpred7())) {s = 19;}

                        else if ( (LA126_3==IF_MODIFIER) && (synpred7())) {s = 20;}

                        else if ( (LA126_3==UNLESS_MODIFIER) && (synpred7())) {s = 21;}

                        else if ( (LA126_3==LBRACK) && (synpred7())) {s = 22;}

                        else if ( (LA126_3==LCURLY) && (synpred7())) {s = 23;}

                        else if ( (LA126_3==LPAREN) && (synpred7())) {s = 24;}

                         
                        input.seek(index126_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 126, _s, input);
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
    public static final BitSet FOLLOW_statement_expression_in_statement344 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement347 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_set_in_modifier_line387 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_line_break_in_modifier_line401 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_statement_expression_in_modifier_line405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_block_expression480 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_body_in_block_expression482 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_block_expression484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body491 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_statement_list_in_body495 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_terminal_in_body497 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression520 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_statement_expression_in_if_expression525 = new BitSet(new long[]{0x0000020000000000L,0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_seperator_in_if_expression527 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6FL});
    public static final BitSet FOLLOW_body_in_if_expression540 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_130_in_if_expression543 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_statement_expression_in_if_expression547 = new BitSet(new long[]{0x0000020000000000L,0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_seperator_in_if_expression549 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6FL});
    public static final BitSet FOLLOW_body_in_if_expression553 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_131_in_if_expression567 = new BitSet(new long[]{0x0200231800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_LINE_BREAK_in_if_expression569 = new BitSet(new long[]{0x0200231800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_body_in_if_expression574 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_if_expression587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator639 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator642 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator644 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator649 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_seperator652 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator654 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression664 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression666 = new BitSet(new long[]{0x0000020000000000L,0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_unless_expression669 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6BL});
    public static final BitSet FOLLOW_COLON_in_unless_expression671 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6BL});
    public static final BitSet FOLLOW_line_break_in_unless_expression673 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C6BL});
    public static final BitSet FOLLOW_body_in_unless_expression685 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_unless_expression698 = new BitSet(new long[]{0x0200211800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_body_in_unless_expression700 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_unless_expression713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_statement_expression777 = new BitSet(new long[]{0x07FFE0006000C800L,0x01000000000F0000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fitem_in_statement_expression780 = new BitSet(new long[]{0x07FFE0006000C800L,0x01000000000F0000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fitem_in_statement_expression782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorStatement_in_statement_expression784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_statement_expression786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_methodDefinition802 = new BitSet(new long[]{0x000022000000C000L,0x0010000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition806 = new BitSet(new long[]{0x000022000000C000L,0x0010000000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition812 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition814 = new BitSet(new long[]{0x000020000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition818 = new BitSet(new long[]{0x0200230000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition822 = new BitSet(new long[]{0x0200231800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition825 = new BitSet(new long[]{0x0200231800003000L,0xE4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition831 = new BitSet(new long[]{0x0000030000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition835 = new BitSet(new long[]{0x0000030000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_methodDefinition840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_variable_in_singleton851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton853 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_statement_expression_in_singleton856 = new BitSet(new long[]{0x0000020000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton858 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist917 = new BitSet(new long[]{0x0200220000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist919 = new BitSet(new long[]{0x0000020000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist923 = new BitSet(new long[]{0x0000020000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist946 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args960 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args962 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args965 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args968 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args981 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args983 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args997 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args1000 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1051 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args1075 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args1077 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_f_opt_args1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notStatement_in_andorStatement1284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_136_in_andorStatement1294 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorStatement1299 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_137_in_andorStatement1310 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorStatement1315 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_notStatement_in_andorStatement1330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_138_in_notStatement1348 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notStatement1355 = new BitSet(new long[]{0x0200221800003000L,0xA4502D8000780000L,0x0000000000003C03L});
    public static final BitSet FOLLOW_notStatement_in_notStatement1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notStatement1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_definedExpression1385 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_definedExpression_in_definedExpression1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1422 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1426 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_assignmentExpression1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_assignmentExpression1449 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentExpression1451 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_mrhs_in_assignmentExpression1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_simple_assignment_expression1494 = new BitSet(new long[]{0xF800000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_set_in_simple_assignment_expression1496 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_definedExpression_in_simple_assignment_expression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_mlhs1564 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1569 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_lhs_in_mlhs1574 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mlhs1581 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_lhs_in_mlhs1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_lhs1605 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_lhs_in_star_lhs1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_mrhs1637 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_mrhs1639 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1649 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_mrhs1659 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_mrhs1661 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_mrhs1667 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_star_rhs_in_mrhs1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_star_rhs_in_mrhs1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_star_rhs1708 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_definedExpression_in_star_rhs1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1738 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1741 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1743 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1782 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1786 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1797 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1801 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1868 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1873 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1934 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1939 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1968 = new BitSet(new long[]{0x0003C00000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression2002 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2007 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression2018 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2024 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression2035 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2039 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression2050 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2055 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression2066 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2072 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression2083 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression2088 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2103 = new BitSet(new long[]{0x0003C00000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2124 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression2158 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2164 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression2175 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2180 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression2191 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2196 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression2207 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression2211 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression2226 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression2280 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2286 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_BOR_in_orExpression2297 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression2303 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2370 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2376 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2407 = new BitSet(new long[]{0x0040000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2441 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2446 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2457 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2461 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2476 = new BitSet(new long[]{0x0040000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2498 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2532 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2539 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2550 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2557 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2572 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2592 = new BitSet(new long[]{0x0200000060000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2626 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2632 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2643 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2649 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2660 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2666 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2681 = new BitSet(new long[]{0x0200000060000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2702 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2737 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2743 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2752 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2774 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2780 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2790 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2796 = new BitSet(new long[]{0x0000221800003000L,0xA4502D8000780000L,0x0000000000003003L});
    public static final BitSet FOLLOW_command_in_bnotExpression2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_command2829 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_141_in_command2833 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_literal_in_command2836 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2838 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2841 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2843 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2845 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_atom_in_command2847 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_LPAREN_in_command2852 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_statement_expression_in_command2854 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_command2856 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_set_in_command2861 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_method_in_command2868 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_array_in_atom2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_atom2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_atom2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_atom2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_atom2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_variable_in_variable2926 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_variable2930 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000600000L,0x0000000000003003L});
    public static final BitSet FOLLOW_array_items_in_variable2933 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_variable2935 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_simple_variable2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2977 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_method2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method3013 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_open_args_with_block_in_method3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_block3043 = new BitSet(new long[]{0x0200221800003000L,0xE4502D80007A0000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_LINE_BREAK_in_block3049 = new BitSet(new long[]{0x0200221800003000L,0xE4502D80007A0000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_block_content_in_block3054 = new BitSet(new long[]{0x0000020000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_block3057 = new BitSet(new long[]{0x0000020000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_block3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_block3069 = new BitSet(new long[]{0x0200221800003000L,0xA4506D80007A0000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_LINE_BREAK_in_block3075 = new BitSet(new long[]{0x0200221800003000L,0xA4506D80007A0000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_block_content_in_block3080 = new BitSet(new long[]{0x0000020000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_block3083 = new BitSet(new long[]{0x0000020000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RCURLY_in_block3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOR_in_block_content3099 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_block_param_in_block_content3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BOR_in_block_content3103 = new BitSet(new long[]{0x0200221800003002L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_LINE_BREAK_in_block_content3109 = new BitSet(new long[]{0x0200221800003002L,0xA4502D8000780000L,0x0000000000003C63L});
    public static final BitSet FOLLOW_block_body_in_block_content3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_block_param3122 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_block_param3125 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_block_param3127 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_bodyStatement_in_block_body3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args_with_block3160 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_call_args_in_open_args_with_block3163 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args_with_block3165 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_open_args_with_block3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args_with_block3174 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args_with_block3177 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_open_args_with_block3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args_with_block3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args3232 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args3235 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_args3238 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation23288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation23292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation23296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation23300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation33316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation33320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation33324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_expression_in_rhs3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_in_literal3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_string4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_string4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_string4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_single_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_double_quote_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array4513 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000600000L,0x0000000000003003L});
    public static final BitSet FOLLOW_array_items_in_array4516 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_array4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_item_in_array_items4530 = new BitSet(new long[]{0x0000020000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array_items4533 = new BitSet(new long[]{0x0000201800003000L,0xA4502D8000600000L,0x0000000000003003L});
    public static final BitSet FOLLOW_array_item_in_array_items4536 = new BitSet(new long[]{0x0000020000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_trailer_in_array_items4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_array_item4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash4559 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_assoc_list_in_hash4562 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list4573 = new BitSet(new long[]{0x0000020000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs4584 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs4588 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_assoc_in_assocs4591 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_assoc4618 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COLON_in_assoc4620 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_assoc4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_assoc4627 = new BitSet(new long[]{0x0000000000000000L,0x0202000000000000L});
    public static final BitSet FOLLOW_set_in_assoc4629 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_assoc4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_symbol_name_in_assoc4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_symbol4698 = new BitSet(new long[]{0x0000200000000000L,0x00000D8000000000L});
    public static final BitSet FOLLOW_ID_in_symbol4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_quote_string_in_symbol4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_quote_string_in_symbol4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_synpred11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlhs_in_synpred21444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_assignment_expression_in_synpred31654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred42969 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred42971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred53160 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_call_args_in_synpred53163 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred53165 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred53168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred63174 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred63177 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_synpred63180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbol_name_in_assoc_in_synpred74610 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred74612 = new BitSet(new long[]{0x0200201800003000L,0xA4502D8000780000L,0x0000000000003803L});
    public static final BitSet FOLLOW_arg_in_synpred74614 = new BitSet(new long[]{0x0000000000000002L});

}