// $ANTLR 3.0 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-06-11 10:21:30

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'.'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'", "'expression2'"
    };
    public static final int COMMA=113;
    public static final int GREATER_THAN=44;
    public static final int LOGICAL_AND_ASSIGN=64;
    public static final int INSTANCE_VARIABLE=89;
    public static final int MINUS=50;
    public static final int ESCAPE_INT=96;
    public static final int ARRAY=80;
    public static final int HEX_PART=92;
    public static final int LOGICAL_OR=70;
    public static final int LESS_THAN=46;
    public static final int META_PART=94;
    public static final int LEADING0_NUMBER=87;
    public static final int BOR=75;
    public static final int LEADING_MARK_DECIMAL=85;
    public static final int BINARY=84;
    public static final int COLON2=38;
    public static final int EMPTY_ARRAY=112;
    public static final int LCURLY=102;
    public static final int LINE_BREAK=36;
    public static final int CONSTANT=14;
    public static final int LEFT_SHIFT=11;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=88;
    public static final int IF_MODIFIER=30;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int ESCAPE_INT_PART=95;
    public static final int REGEX=81;
    public static final int SYMBOL=18;
    public static final int RPAREN=109;
    public static final int CONTROL_PART=93;
    public static final int DOUBLE_QUOTE_STRING=99;
    public static final int STAR_ASSIGN=63;
    public static final int PLUS=49;
    public static final int HEREDOC_INDENT_BEGIN=105;
    public static final int BODY=9;
    public static final int CASE_EQUAL=42;
    public static final int UNLESS_MODIFIER=31;
    public static final int MINUS_ASSIGN=57;
    public static final int GREATER_OR_EQUAL=45;
    public static final int EXCLUSIVE_RANGE=69;
    public static final int POWER_ASSIGN=66;
    public static final int MOD_ASSIGN=54;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int WS=37;
    public static final int STRING=27;
    public static final int DOUBLE_STRING_CHAR=101;
    public static final int RIGHT_SHIFT_ASSIGN=62;
    public static final int GLOBAL_VARIABLE=91;
    public static final int NON_LEADING0_NUMBER=97;
    public static final int SINGLE_QUOTE_STRING=98;
    public static final int HEREDOC_BEGIN=104;
    public static final int CLASS_VARIABLE=90;
    public static final int LBRACK=110;
    public static final int SEMI=35;
    public static final int DIV_ASSIGN=56;
    public static final int MRHS=24;
    public static final int BLOCK_ARG=22;
    public static final int EQUAL=41;
    public static final int LOGICAL_AND=71;
    public static final int COLON=114;
    public static final int DIV=28;
    public static final int HEX=83;
    public static final int SINGLETON_METHOD=26;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=68;
    public static final int BNOT=77;
    public static final int LOGICAL_OR_ASSIGN=65;
    public static final int ASSOC=106;
    public static final int FLOAT=13;
    public static final int OCTAL=82;
    public static final int MOD=29;
    public static final int PLUS_ASSIGN=58;
    public static final int QUESTION=67;
    public static final int UNTIL_MODIFIER=33;
    public static final int BLOCK=19;
    public static final int RCURLY=103;
    public static final int INT=79;
    public static final int BOR_ASSIGN=59;
    public static final int ASSIGN=53;
    public static final int LESS_OR_EQUAL=47;
    public static final int LPAREN=108;
    public static final int BAND=76;
    public static final int HEREDOC_STRING=12;
    public static final int NOT_MATCH=73;
    public static final int ID=39;
    public static final int NOT_EQUAL=72;
    public static final int BAND_ASSIGN=60;
    public static final int COMPLEMENT_ASSIGN=55;
    public static final int RIGHT_SHIFT=48;
    public static final int POWER=52;
    public static final int BXOR_ASSIGN=107;
    public static final int FID=15;
    public static final int NESTED_LHS=25;
    public static final int COMMENT=116;
    public static final int LEFT_SHIFT_ASSIGN=61;
    public static final int MATCH=43;
    public static final int WHILE_MODIFIER=32;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=115;
    public static final int EXP_PART=86;
    public static final int COMPARE=40;
    public static final int IF=7;
    public static final int ARG=10;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int EOF=-1;
    public static final int VARIABLE=16;
    public static final int CALL=17;
    public static final int RBRACK=111;
    public static final int RESCUE_MODIFIER=34;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=51;
    public static final int BXOR=74;
    public static final int NOT=78;
    public static final int SINGLE_STRING_CHAR=100;

        public Rubyv3Parser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:259:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==LCURLY||LA3_0==117||(LA3_0>=119 && LA3_0<=121)||(LA3_0>=125 && LA3_0<=126)||(LA3_0>=131 && LA3_0<=135)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("259:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program223);
                    	    terminal1=terminal();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, terminal1.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program227);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program229);
                    	    terminal3=terminal();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, terminal3.getTree());

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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:263:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list243);
            statement4=statement();
            _fsp--;

            stream_statement.add(statement4.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:16: ( terminal )+ statement
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:16: ( terminal )+
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
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list246);
            	    	    terminal5=terminal();
            	    	    _fsp--;

            	    	    stream_terminal.add(terminal5.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	    pushFollow(FOLLOW_statement_in_statement_list249);
            	    statement6=statement();
            	    _fsp--;

            	    stream_statement.add(statement6.getTree());

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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:58: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;


        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement275);
            expression7=expression();
            _fsp--;

            stream_expression.add(expression7.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement278);
            	    modifier_line8=modifier_line();
            	    _fsp--;

            	    stream_modifier_line.add(modifier_line8.getTree());

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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 272:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:59: ( modifier_line )*
                while ( stream_modifier_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier_line.next());

                }
                stream_modifier_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
            {
            root_0 = (Object)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=IF_MODIFIER && input.LA(1)<=RESCUE_MODIFIER) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(adaptor.create(set9), root_0);
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line318);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line332);
            	    line_break10=line_break();
            	    _fsp--;

            	    adaptor.addChild(root_0, line_break10.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_modifier_line336);
            expression11=expression();
            _fsp--;

            adaptor.addChild(root_0, expression11.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)input.LT(1);
            match(input,117,FOLLOW_117_in_block_expression411); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);

            pushFollow(FOLLOW_body_in_block_expression413);
            body13=body();
            _fsp--;

            adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,118,FOLLOW_118_in_block_expression415); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==118||(LA10_0>=122 && LA10_0<=123)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==LCURLY||LA10_0==117||(LA10_0>=119 && LA10_0<=121)||(LA10_0>=125 && LA10_0<=126)||(LA10_0>=131 && LA10_0<=135)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("296:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body422); 
                    	    SEMI15_tree = (Object)adaptor.create(SEMI15);
                    	    adaptor.addChild(root_0, SEMI15_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body426);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body428);
                    	    terminal17=terminal();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, terminal17.getTree());

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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:298:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=119 && input.LA(1)<=121) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set18));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boolean_expression0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:299:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression451); 
            stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression456);
            e0=expression();
            _fsp--;

            stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression458);
            seperator20=seperator();
            _fsp--;

            stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression471);
            body0=body();
            _fsp--;

            stream_body.add(body0.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==122) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,122,FOLLOW_122_in_if_expression474); 
            	    stream_122.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression478);
            	    e1=expression();
            	    _fsp--;

            	    stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression480);
            	    seperator22=seperator();
            	    _fsp--;

            	    stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression484);
            	    body1=body();
            	    _fsp--;

            	    stream_body.add(body1.getTree());
            	    if (list_body1==null) list_body1=new ArrayList();
            	    list_body1.add(body1);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==123) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,123,FOLLOW_123_in_if_expression498); 
                    stream_123.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression502);
                    body2=body();
                    _fsp--;

                    stream_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,118,FOLLOW_118_in_if_expression515); 
            stream_118.add(string_literal24);


            // AST REWRITE
            // elements: body0, body1, body2, e1, e0
            // token labels: 
            // rule labels: e0, e1, body0, retval, body2
            // token list labels: 
            // rule list labels: body1
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_e0=new RewriteRuleSubtreeStream(adaptor,"token e0",e0!=null?e0.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_body0=new RewriteRuleSubtreeStream(adaptor,"token body0",body0!=null?body0.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_body2=new RewriteRuleSubtreeStream(adaptor,"token body2",body2!=null?body2.tree:null);
            RewriteRuleSubtreeStream stream_body1=new RewriteRuleSubtreeStream(adaptor,"token body1",list_body1);
            root_0 = (Object)adaptor.nil();
            // 303:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:48: ( $body2)?
                if ( stream_body2.hasNext() ) {
                    adaptor.addChild(root_1, stream_body2.next());

                }
                stream_body2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:306:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:3: ( LINE_BREAK )+
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
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator567); 
                    	    LINE_BREAK25_tree = (Object)adaptor.create(LINE_BREAK25);
                    	    adaptor.addChild(root_0, LINE_BREAK25_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator570); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator572); 
                    	    LINE_BREAK27_tree = (Object)adaptor.create(LINE_BREAK27);
                    	    adaptor.addChild(root_0, LINE_BREAK27_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator577); 
                    	    LINE_BREAK28_tree = (Object)adaptor.create(LINE_BREAK28);
                    	    adaptor.addChild(root_0, LINE_BREAK28_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    string_literal29=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_seperator580); 
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator582); 
                    	    LINE_BREAK30_tree = (Object)adaptor.create(LINE_BREAK30);
                    	    adaptor.addChild(root_0, LINE_BREAK30_tree);


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

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression592); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_boolean_expression_in_unless_expression594);
            boolean_expression32=boolean_expression();
            _fsp--;

            adaptor.addChild(root_0, boolean_expression32.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 124:
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
                NoViableAltException nvae =
                    new NoViableAltException("309:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_unless_expression597); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression599); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression601);
                    line_break35=line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression613);
            body36=body();
            _fsp--;

            adaptor.addChild(root_0, body36.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==123) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,123,FOLLOW_123_in_unless_expression626); 
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);

                    pushFollow(FOLLOW_body_in_unless_expression628);
                    body38=body();
                    _fsp--;

                    adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

            }

            string_literal39=(Token)input.LT(1);
            match(input,118,FOLLOW_118_in_unless_expression641); 
            string_literal39_tree = (Object)adaptor.create(string_literal39);
            adaptor.addChild(root_0, string_literal39_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:11: ( SEMI | line_break )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SEMI) ) {
                alt20=1;
            }
            else if ( (LA20_0==LINE_BREAK) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("313:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal647); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal650);
                    line_break41=line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break660); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:347:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:5: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 125:
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
            case 117:
            case 119:
            case 120:
            case 121:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                {
                alt21=2;
                }
                break;
            case 126:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("347:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)input.LT(1);
                    match(input,125,FOLLOW_125_in_expression705); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);

                    pushFollow(FOLLOW_fitem_in_expression708);
                    fitem44=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression710);
                    fitem45=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem45.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression712);
                    andorExpression46=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression46.getTree());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_expression714);
                    primaryExpression47=primaryExpression();
                    _fsp--;

                    adaptor.addChild(root_0, primaryExpression47.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodDefinition_return methodDefinition48 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:4: ( methodDefinition )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodDefinition_in_primaryExpression722);
            methodDefinition48=methodDefinition();
            _fsp--;

            adaptor.addChild(root_0, methodDefinition48.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* bodyStatement 'end' ;
    public final methodDefinition_return methodDefinition() throws RecognitionException {
        methodDefinition_return retval = new methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token LINE_BREAK50=null;
        Token string_literal57=null;
        singleton_return singleton51 = null;

        dot_or_colon_return dot_or_colon52 = null;

        methodName_return methodName53 = null;

        f_arglist_return f_arglist54 = null;

        terminal_return terminal55 = null;

        bodyStatement_return bodyStatement56 = null;


        Object string_literal49_tree=null;
        Object LINE_BREAK50_tree=null;
        Object string_literal57_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* bodyStatement 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* bodyStatement 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_methodDefinition730); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition734); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:26: ( singleton dot_or_colon )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==COLON2||LA23_1==127) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==LPAREN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition740);
                    singleton51=singleton();
                    _fsp--;

                    adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition742);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;

                    adaptor.addChild(root_0, dot_or_colon52.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_methodName_in_methodDefinition746);
            methodName53=methodName();
            _fsp--;

            adaptor.addChild(root_0, methodName53.getTree());
            enterScope();
            pushFollow(FOLLOW_f_arglist_in_methodDefinition750);
            f_arglist54=f_arglist();
            _fsp--;

            adaptor.addChild(root_0, f_arglist54.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:89: ( terminal )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=SEMI && LA24_0<=LINE_BREAK)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition753);
            	    terminal55=terminal();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            pushFollow(FOLLOW_bodyStatement_in_methodDefinition759);
            bodyStatement56=bodyStatement();
            _fsp--;

            adaptor.addChild(root_0, bodyStatement56.getTree());
            string_literal57=(Token)input.LT(1);
            match(input,118,FOLLOW_118_in_methodDefinition761); 
            leaveScope();

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:1: singleton : ( variable | '(' expression opt_nl ')' );
    public final singleton_return singleton() throws RecognitionException {
        singleton_return retval = new singleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal59=null;
        Token char_literal62=null;
        variable_return variable58 = null;

        expression_return expression60 = null;

        opt_nl_return opt_nl61 = null;


        Object char_literal59_tree=null;
        Object char_literal62_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:4: ( variable | '(' expression opt_nl ')' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==LPAREN) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("353:1: singleton : ( variable | '(' expression opt_nl ')' );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:4: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_singleton772);
                    variable58=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable58.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal59=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton774); 
                    pushFollow(FOLLOW_expression_in_singleton777);
                    expression60=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression60.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton779);
                    opt_nl61=opt_nl();
                    _fsp--;

                    adaptor.addChild(root_0, opt_nl61.getTree());
                    char_literal62=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton781); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK63=null;

        Object LINE_BREAK63_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:28: ( | LINE_BREAK )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RPAREN) ) {
                alt26=1;
            }
            else if ( (LA26_0==LINE_BREAK) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("355:1: opt_nl : ( | LINE_BREAK );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:28: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK63=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl800); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:1: dot_or_colon : ( '.' | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set64=null;

        Object set64_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:4: ( '.' | COLON2 )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set64=(Token)input.LT(1);
            if ( input.LA(1)==COLON2||input.LA(1)==127 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set64));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_dot_or_colon0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65=null;

        Object set65_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:4: ( ID | CONSTANT | FID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set65=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set65));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_methodName0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' | f_args terminal );
    public final f_arglist_return f_arglist() throws RecognitionException {
        f_arglist_return retval = new f_arglist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal66=null;
        Token LINE_BREAK68=null;
        Token char_literal69=null;
        f_args_return f_args67 = null;

        f_args_return f_args70 = null;

        terminal_return terminal71 = null;


        Object char_literal66_tree=null;
        Object LINE_BREAK68_tree=null;
        Object char_literal69_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:4: ( '(' f_args ( LINE_BREAK )* ')' | f_args terminal )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LPAREN) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=SEMI && LA28_0<=LINE_BREAK)||LA28_0==ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("361:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' | f_args terminal );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal66=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist838); 
                    pushFollow(FOLLOW_f_args_in_f_arglist841);
                    f_args67=f_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_args67.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:17: ( LINE_BREAK )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==LINE_BREAK) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:18: LINE_BREAK
                    	    {
                    	    LINE_BREAK68=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist845); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    char_literal69=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist850); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_args_in_f_arglist863);
                    f_args70=f_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_args70.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist865);
                    terminal71=terminal();
                    _fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | );
    public final f_args_return f_args() throws RecognitionException {
        f_args_return retval = new f_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal74=null;
        f_norm_args_return f_norm_args72 = null;

        f_norm_args_return f_norm_args73 = null;

        f_opt_args_return f_opt_args75 = null;


        Object char_literal74_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:10: ( f_norm_args | f_norm_args ',' f_opt_args | )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>=SEMI && LA29_1<=LINE_BREAK)||LA29_1==RPAREN) ) {
                    alt29=1;
                }
                else if ( (LA29_1==COMMA) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("364:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | );", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA29_0>=SEMI && LA29_0<=LINE_BREAK)||LA29_0==RPAREN) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("364:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args873);
                    f_norm_args72=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args72.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:24: f_norm_args ',' f_opt_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args877);
                    f_norm_args73=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args73.getTree());
                    char_literal74=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args879); 
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);

                    pushFollow(FOLLOW_f_opt_args_in_f_args881);
                    f_opt_args75=f_opt_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_opt_args75.getTree());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:51: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID76=null;

        Object ID76_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:2: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:2: ID
            {
            root_0 = (Object)adaptor.nil();

            ID76=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args904); 
            ID76_tree = (Object)adaptor.create(ID76);
            adaptor.addChild(root_0, ID76_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end f_norm_args

    public static class f_opt_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start f_opt_args
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:371:1: f_opt_args : ;
    public final f_opt_args_return f_opt_args() throws RecognitionException {
        f_opt_args_return retval = new f_opt_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:4: ()
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:4: 
            {
            root_0 = (Object)adaptor.nil();

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list77 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:4: ( statement_list -> ^( BODY statement_list ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement922);
            statement_list77=statement_list();
            _fsp--;

            stream_statement_list.add(statement_list77.getTree());

            // AST REWRITE
            // elements: statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 375:19: -> ^( BODY statement_list )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:22: ^( BODY statement_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_statement_list.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname78 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:9: ( fname )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem940);
            fname78=fname();
            _fsp--;

            adaptor.addChild(root_0, fname78.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID79=null;
        Token CONSTANT80=null;
        Token FID81=null;
        op_return op82 = null;


        Object ID79_tree=null;
        Object CONSTANT80_tree=null;
        Object FID81_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:9: ( ID | CONSTANT | FID | op )
            int alt30=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt30=1;
                }
                break;
            case CONSTANT:
                {
                alt30=2;
                }
                break;
            case FID:
                {
                alt30=3;
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
            case 128:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("379:1: fname : ( ID | CONSTANT | FID | op );", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID79=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname947); 
                    ID79_tree = (Object)adaptor.create(ID79);
                    adaptor.addChild(root_0, ID79_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT80=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname949); 
                    CONSTANT80_tree = (Object)adaptor.create(CONSTANT80);
                    adaptor.addChild(root_0, CONSTANT80_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID81=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname951); 
                    FID81_tree = (Object)adaptor.create(FID81);
                    adaptor.addChild(root_0, FID81_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname953);
                    op82=op();
                    _fsp--;

                    adaptor.addChild(root_0, op82.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set83=null;

        Object set83_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set83=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==128 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set83));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_op0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        Token LINE_BREAK86=null;
        Token string_literal87=null;
        Token LINE_BREAK88=null;
        notExpression_return notExpression84 = null;

        notExpression_return notExpression89 = null;


        Object string_literal85_tree=null;
        Object LINE_BREAK86_tree=null;
        Object string_literal87_tree=null;
        Object LINE_BREAK88_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1114);
            notExpression84=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression84.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=129 && LA34_0<=130)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==129) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==130) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("393:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal85=(Token)input.LT(1);
            	            match(input,129,FOLLOW_129_in_andorExpression1124); 
            	            string_literal85_tree = (Object)adaptor.create(string_literal85);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal85_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:15: ( LINE_BREAK )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==LINE_BREAK) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK86=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1129); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop31;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal87=(Token)input.LT(1);
            	            match(input,130,FOLLOW_130_in_andorExpression1140); 
            	            string_literal87_tree = (Object)adaptor.create(string_literal87);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal87_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:14: ( LINE_BREAK )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==LINE_BREAK) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK88=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1145); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1160);
            	    notExpression89=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression89.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal90=null;
        Token LINE_BREAK91=null;
        notExpression_return notExpression92 = null;

        definedExpression_return definedExpression93 = null;


        Object string_literal90_tree=null;
        Object LINE_BREAK91_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==131) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=HEREDOC_STRING && LA36_0<=FLOAT)||LA36_0==SYMBOL||(LA36_0>=IF_MODIFIER && LA36_0<=UNLESS_MODIFIER)||LA36_0==ID||(LA36_0>=BNOT && LA36_0<=REGEX)||(LA36_0>=SINGLE_QUOTE_STRING && LA36_0<=DOUBLE_QUOTE_STRING)||LA36_0==LCURLY||LA36_0==117||(LA36_0>=119 && LA36_0<=121)||(LA36_0>=132 && LA36_0<=135)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("399:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal90=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_notExpression1178); 
                    string_literal90_tree = (Object)adaptor.create(string_literal90);
                    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:4: ( LINE_BREAK )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==LINE_BREAK) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK91=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1185); 

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1193);
                    notExpression92=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression92.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1199);
                    definedExpression93=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        assignmentExpression_return assignmentExpression95 = null;

        assignmentExpression_return assignmentExpression96 = null;


        Object string_literal94_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:4: ( 'defined' assignmentExpression | assignmentExpression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==132) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=HEREDOC_STRING && LA37_0<=FLOAT)||LA37_0==SYMBOL||(LA37_0>=IF_MODIFIER && LA37_0<=UNLESS_MODIFIER)||LA37_0==ID||(LA37_0>=BNOT && LA37_0<=REGEX)||(LA37_0>=SINGLE_QUOTE_STRING && LA37_0<=DOUBLE_QUOTE_STRING)||LA37_0==LCURLY||LA37_0==117||(LA37_0>=119 && LA37_0<=121)||(LA37_0>=133 && LA37_0<=135)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("405:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:4: 'defined' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal94=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_definedExpression1210); 
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1212);
                    assignmentExpression95=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression95.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1223);
                    assignmentExpression96=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression96.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set99=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression97 = null;

        lhs_return lhs98 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression100 = null;


        Object set99_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=HEREDOC_STRING && LA38_0<=FLOAT)||LA38_0==SYMBOL||(LA38_0>=IF_MODIFIER && LA38_0<=UNLESS_MODIFIER)||(LA38_0>=BNOT && LA38_0<=REGEX)||(LA38_0>=SINGLE_QUOTE_STRING && LA38_0<=DOUBLE_QUOTE_STRING)||LA38_0==LCURLY||LA38_0==117||(LA38_0>=119 && LA38_0<=121)||(LA38_0>=133 && LA38_0<=135)) ) {
                alt38=1;
            }
            else if ( (LA38_0==ID) ) {
                int LA38_2 = input.LA(2);

                if ( ((LA38_2>=ASSIGN && LA38_2<=POWER_ASSIGN)) ) {
                    alt38=2;
                }
                else if ( (LA38_2==EOF||(LA38_2>=LEFT_SHIFT && LA38_2<=FLOAT)||LA38_2==SYMBOL||(LA38_2>=DIV && LA38_2<=LINE_BREAK)||(LA38_2>=ID && LA38_2<=POWER)||(LA38_2>=QUESTION && LA38_2<=REGEX)||(LA38_2>=SINGLE_QUOTE_STRING && LA38_2<=DOUBLE_QUOTE_STRING)||(LA38_2>=LCURLY && LA38_2<=RCURLY)||LA38_2==ASSOC||(LA38_2>=LPAREN && LA38_2<=RPAREN)||(LA38_2>=COMMA && LA38_2<=COLON)||(LA38_2>=117 && LA38_2<=124)||(LA38_2>=129 && LA38_2<=130)||(LA38_2>=132 && LA38_2<=135)) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("415:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 38, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("415:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1237);
                    ternaryIfThenElseExpression97=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression97.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1251);
                    lhs98=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs98.getTree());
                    set99=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set99), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1253);    throw mse;
                    }

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1297);
                    ternaryIfThenElseExpression100=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression100.getTree());
                    addVariable(input.toString(lhs98.start,lhs98.stop));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION101=null;
        Token char_literal103=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression102 = null;

        rangeExpression_return rangeExpression104 = null;


        Object QUESTION101_tree=null;
        Object char_literal103_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:5: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1311);
            r=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, r.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QUESTION) ) {
                alt39=1;
            }
            else if ( (LA39_0==EOF||LA39_0==LEFT_SHIFT||(LA39_0>=DIV && LA39_0<=LINE_BREAK)||(LA39_0>=COMPARE && LA39_0<=POWER)||(LA39_0>=INCLUSIVE_RANGE && LA39_0<=BAND)||LA39_0==RCURLY||LA39_0==ASSOC||LA39_0==RPAREN||(LA39_0>=COMMA && LA39_0<=COLON)||LA39_0==118||(LA39_0>=122 && LA39_0<=124)||(LA39_0>=129 && LA39_0<=130)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("421:23: ( QUESTION rangeExpression ':' rangeExpression | )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION101=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1315); 
                    QUESTION101_tree = (Object)adaptor.create(QUESTION101);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION101_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1318);
                    rangeExpression102=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression102.getTree());
                    char_literal103=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1320); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1323);
                    rangeExpression104=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression104.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:73: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:425:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE106=null;
        Token LINE_BREAK107=null;
        Token EXCLUSIVE_RANGE108=null;
        Token LINE_BREAK109=null;
        logicalOrExpression_return logicalOrExpression105 = null;

        logicalOrExpression_return logicalOrExpression110 = null;


        Object INCLUSIVE_RANGE106_tree=null;
        Object LINE_BREAK107_tree=null;
        Object EXCLUSIVE_RANGE108_tree=null;
        Object LINE_BREAK109_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1340);
            logicalOrExpression105=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression105.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==INCLUSIVE_RANGE) ) {
                    alt43=1;
                }
                else if ( (LA43_0==EXCLUSIVE_RANGE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==INCLUSIVE_RANGE) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==EXCLUSIVE_RANGE) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("428:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE106=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1359); 
            	            INCLUSIVE_RANGE106_tree = (Object)adaptor.create(INCLUSIVE_RANGE106);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE106_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:24: ( LINE_BREAK )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==LINE_BREAK) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK107=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1363); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop40;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE108=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1374); 
            	            EXCLUSIVE_RANGE108_tree = (Object)adaptor.create(EXCLUSIVE_RANGE108);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE108_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:24: ( LINE_BREAK )*
            	            loop41:
            	            do {
            	                int alt41=2;
            	                int LA41_0 = input.LA(1);

            	                if ( (LA41_0==LINE_BREAK) ) {
            	                    alt41=1;
            	                }


            	                switch (alt41) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK109=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1378); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop41;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1393);
            	    logicalOrExpression110=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression110.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR112=null;
        Token LINE_BREAK113=null;
        logicalAndExpression_return logicalAndExpression111 = null;

        logicalAndExpression_return logicalAndExpression114 = null;


        Object LOGICAL_OR112_tree=null;
        Object LINE_BREAK113_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1413);
            logicalAndExpression111=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression111.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LOGICAL_OR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR112=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1445); 
            	    LOGICAL_OR112_tree = (Object)adaptor.create(LOGICAL_OR112);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR112_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:18: ( LINE_BREAK )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==LINE_BREAK) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK113=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1450); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1459);
            	    logicalAndExpression114=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression114.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND116=null;
        Token LINE_BREAK117=null;
        equalityExpression_return equalityExpression115 = null;

        equalityExpression_return equalityExpression118 = null;


        Object LOGICAL_AND116_tree=null;
        Object LINE_BREAK117_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1479);
            equalityExpression115=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression115.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==LOGICAL_AND) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND116=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1511); 
            	    LOGICAL_AND116_tree = (Object)adaptor.create(LOGICAL_AND116);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND116_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:19: ( LINE_BREAK )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==LINE_BREAK) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK117=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1516); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1525);
            	    equalityExpression118=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression118.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE120=null;
        Token LINE_BREAK121=null;
        Token EQUAL122=null;
        Token LINE_BREAK123=null;
        Token CASE_EQUAL124=null;
        Token LINE_BREAK125=null;
        Token NOT_EQUAL126=null;
        Token LINE_BREAK127=null;
        Token MATCH128=null;
        Token LINE_BREAK129=null;
        Token NOT_MATCH130=null;
        Token LINE_BREAK131=null;
        relationalExpression_return relationalExpression119 = null;

        relationalExpression_return relationalExpression132 = null;


        Object COMPARE120_tree=null;
        Object LINE_BREAK121_tree=null;
        Object EQUAL122_tree=null;
        Object LINE_BREAK123_tree=null;
        Object CASE_EQUAL124_tree=null;
        Object LINE_BREAK125_tree=null;
        Object NOT_EQUAL126_tree=null;
        Object LINE_BREAK127_tree=null;
        Object MATCH128_tree=null;
        Object LINE_BREAK129_tree=null;
        Object NOT_MATCH130_tree=null;
        Object LINE_BREAK131_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:455:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:455:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1545);
            relationalExpression119=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression119.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:456:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt55=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt55=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt55=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt55=1;
                    }
                    break;
                case MATCH:
                    {
                    alt55=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt54=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt54=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt54=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt54=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt54=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("457:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 54, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE120=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1579); 
            	            COMPARE120_tree = (Object)adaptor.create(COMPARE120);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE120_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:17: ( LINE_BREAK )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==LINE_BREAK) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK121=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1584); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL122=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1595); 
            	            EQUAL122_tree = (Object)adaptor.create(EQUAL122);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL122_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:16: ( LINE_BREAK )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==LINE_BREAK) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK123=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1601); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:459:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL124=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1612); 
            	            CASE_EQUAL124_tree = (Object)adaptor.create(CASE_EQUAL124);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL124_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:459:19: ( LINE_BREAK )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==LINE_BREAK) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:459:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1616); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL126=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1627); 
            	            NOT_EQUAL126_tree = (Object)adaptor.create(NOT_EQUAL126);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL126_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:19: ( LINE_BREAK )*
            	            loop51:
            	            do {
            	                int alt51=2;
            	                int LA51_0 = input.LA(1);

            	                if ( (LA51_0==LINE_BREAK) ) {
            	                    alt51=1;
            	                }


            	                switch (alt51) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK127=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1632); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop51;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH128=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1643); 
            	            MATCH128_tree = (Object)adaptor.create(MATCH128);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH128_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:16: ( LINE_BREAK )*
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==LINE_BREAK) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK129=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1649); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop52;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH130=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1660); 
            	            NOT_MATCH130_tree = (Object)adaptor.create(NOT_MATCH130);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH130_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:19: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK131=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1665); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1680);
            	    relationalExpression132=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression132.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:470:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN134=null;
        Token LINE_BREAK135=null;
        Token GREATER_THAN136=null;
        Token LINE_BREAK137=null;
        Token LESS_OR_EQUAL138=null;
        Token LINE_BREAK139=null;
        Token GREATER_OR_EQUAL140=null;
        Token LINE_BREAK141=null;
        orExpression_return orExpression133 = null;

        orExpression_return orExpression142 = null;


        Object LESS_THAN134_tree=null;
        Object LINE_BREAK135_tree=null;
        Object GREATER_THAN136_tree=null;
        Object LINE_BREAK137_tree=null;
        Object LESS_OR_EQUAL138_tree=null;
        Object LINE_BREAK139_tree=null;
        Object GREATER_OR_EQUAL140_tree=null;
        Object LINE_BREAK141_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:471:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:471:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1701);
            orExpression133=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression133.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop61:
            do {
                int alt61=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt61=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt61=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt61=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt61=1;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt60=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt60=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt60=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt60=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt60=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("473:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 60, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt60) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN134=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1735); 
            	            LESS_THAN134_tree = (Object)adaptor.create(LESS_THAN134);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN134_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:20: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK135=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1741); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN136=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1752); 
            	            GREATER_THAN136_tree = (Object)adaptor.create(GREATER_THAN136);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN136_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:22: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);

            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }


            	                switch (alt57) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1757); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL138=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1768); 
            	            LESS_OR_EQUAL138_tree = (Object)adaptor.create(LESS_OR_EQUAL138);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL138_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:23: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);

            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }


            	                switch (alt58) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK139=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1773); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL140=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1784); 
            	            GREATER_OR_EQUAL140_tree = (Object)adaptor.create(GREATER_OR_EQUAL140);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL140_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:25: ( LINE_BREAK )*
            	            loop59:
            	            do {
            	                int alt59=2;
            	                int LA59_0 = input.LA(1);

            	                if ( (LA59_0==LINE_BREAK) ) {
            	                    alt59=1;
            	                }


            	                switch (alt59) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK141=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1788); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop59;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1803);
            	    orExpression142=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression142.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR144=null;
        Token LINE_BREAK145=null;
        Token BOR146=null;
        Token LINE_BREAK147=null;
        andExpression_return andExpression143 = null;

        andExpression_return andExpression148 = null;


        Object BXOR144_tree=null;
        Object LINE_BREAK145_tree=null;
        Object BOR146_tree=null;
        Object LINE_BREAK147_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1823);
            andExpression143=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression143.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==BXOR) ) {
                    alt65=1;
                }
                else if ( (LA65_0==BOR) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==BXOR) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==BOR) ) {
            	        alt64=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("486:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR144=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1857); 
            	            BXOR144_tree = (Object)adaptor.create(BXOR144);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR144_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:15: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK145=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1863); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR146=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1874); 
            	            BOR146_tree = (Object)adaptor.create(BOR146);
            	            root_0 = (Object)adaptor.becomeRoot(BOR146_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:14: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1880); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1895);
            	    andExpression148=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression148.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND150=null;
        Token LINE_BREAK151=null;
        shiftExpression_return shiftExpression149 = null;

        shiftExpression_return shiftExpression152 = null;


        Object BAND150_tree=null;
        Object LINE_BREAK151_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1915);
            shiftExpression149=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression149.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==BAND) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND150=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1947); 
            	    BAND150_tree = (Object)adaptor.create(BAND150);
            	    root_0 = (Object)adaptor.becomeRoot(BAND150_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:13: ( LINE_BREAK )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( (LA66_0==LINE_BREAK) ) {
            	            alt66=1;
            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK151=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1953); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1962);
            	    shiftExpression152=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression152.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:505:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT154=null;
        Token LINE_BREAK155=null;
        Token RIGHT_SHIFT156=null;
        Token LINE_BREAK157=null;
        additiveExpression_return additiveExpression153 = null;

        additiveExpression_return additiveExpression158 = null;


        Object LEFT_SHIFT154_tree=null;
        Object LINE_BREAK155_tree=null;
        Object RIGHT_SHIFT156_tree=null;
        Object LINE_BREAK157_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1984);
            additiveExpression153=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression153.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==LEFT_SHIFT) ) {
                    alt71=1;
                }
                else if ( (LA71_0==RIGHT_SHIFT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==LEFT_SHIFT) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==RIGHT_SHIFT) ) {
            	        alt70=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("508:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT154=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2018); 
            	            LEFT_SHIFT154_tree = (Object)adaptor.create(LEFT_SHIFT154);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT154_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:20: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);

            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }


            	                switch (alt68) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK155=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2023); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT156=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2034); 
            	            RIGHT_SHIFT156_tree = (Object)adaptor.create(RIGHT_SHIFT156);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT156_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:20: ( LINE_BREAK )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                int LA69_0 = input.LA(1);

            	                if ( (LA69_0==LINE_BREAK) ) {
            	                    alt69=1;
            	                }


            	                switch (alt69) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2038); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop69;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2053);
            	    additiveExpression158=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS160=null;
        Token LINE_BREAK161=null;
        Token MINUS162=null;
        Token LINE_BREAK163=null;
        multiplicativeExpression_return multiplicativeExpression159 = null;

        multiplicativeExpression_return multiplicativeExpression164 = null;


        Object PLUS160_tree=null;
        Object LINE_BREAK161_tree=null;
        Object MINUS162_tree=null;
        Object LINE_BREAK163_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2075);
            multiplicativeExpression159=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression159.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==PLUS) ) {
                    alt75=1;
                }
                else if ( (LA75_0==MINUS) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==PLUS) ) {
            	        alt74=1;
            	    }
            	    else if ( (LA74_0==MINUS) ) {
            	        alt74=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("521:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 74, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS160=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2109); 
            	            PLUS160_tree = (Object)adaptor.create(PLUS160);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS160_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:16: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2116); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS162=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2127); 
            	            MINUS162_tree = (Object)adaptor.create(MINUS162);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS162_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:17: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);

            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }


            	                switch (alt73) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK163=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2134); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2149);
            	    multiplicativeExpression164=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression164.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:529:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR166=null;
        Token LINE_BREAK167=null;
        Token DIV168=null;
        Token LINE_BREAK169=null;
        Token MOD170=null;
        Token LINE_BREAK171=null;
        powerExpression_return powerExpression165 = null;

        powerExpression_return powerExpression172 = null;


        Object STAR166_tree=null;
        Object LINE_BREAK167_tree=null;
        Object DIV168_tree=null;
        Object LINE_BREAK169_tree=null;
        Object MOD170_tree=null;
        Object LINE_BREAK171_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2169);
            powerExpression165=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression165.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop80:
            do {
                int alt80=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt80=1;
                    }
                    break;
                case DIV:
                    {
                    alt80=1;
                    }
                    break;
                case MOD:
                    {
                    alt80=1;
                    }
                    break;

                }

                switch (alt80) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt79=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt79=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt79=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt79=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("532:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 79, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt79) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR166=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2203); 
            	            STAR166_tree = (Object)adaptor.create(STAR166);
            	            root_0 = (Object)adaptor.becomeRoot(STAR166_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:15: ( LINE_BREAK )*
            	            loop76:
            	            do {
            	                int alt76=2;
            	                int LA76_0 = input.LA(1);

            	                if ( (LA76_0==LINE_BREAK) ) {
            	                    alt76=1;
            	                }


            	                switch (alt76) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK167=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2209); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop76;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV168=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2220); 
            	            DIV168_tree = (Object)adaptor.create(DIV168);
            	            root_0 = (Object)adaptor.becomeRoot(DIV168_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:14: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);

            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }


            	                switch (alt77) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK169=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2226); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD170=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2237); 
            	            MOD170_tree = (Object)adaptor.create(MOD170);
            	            root_0 = (Object)adaptor.becomeRoot(MOD170_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:14: ( LINE_BREAK )*
            	            loop78:
            	            do {
            	                int alt78=2;
            	                int LA78_0 = input.LA(1);

            	                if ( (LA78_0==LINE_BREAK) ) {
            	                    alt78=1;
            	                }


            	                switch (alt78) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK171=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2243); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop78;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2258);
            	    powerExpression172=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression172.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER174=null;
        Token LINE_BREAK175=null;
        bnotExpression_return bnotExpression173 = null;

        bnotExpression_return bnotExpression176 = null;


        Object POWER174_tree=null;
        Object LINE_BREAK175_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:543:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2279);
            bnotExpression173=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression173.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:544:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==POWER) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER174=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2314); 
            	    POWER174_tree = (Object)adaptor.create(POWER174);
            	    root_0 = (Object)adaptor.becomeRoot(POWER174_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:14: ( LINE_BREAK )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==LINE_BREAK) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK175=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2320); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2329);
            	    bnotExpression176=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression176.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT177=null;
        Token LINE_BREAK178=null;
        Token NOT179=null;
        Token LINE_BREAK180=null;
        command_return command181 = null;


        Object BNOT177_tree=null;
        Object LINE_BREAK178_tree=null;
        Object NOT179_tree=null;
        Object LINE_BREAK180_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop85:
            do {
                int alt85=3;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==BNOT) ) {
                    alt85=1;
                }
                else if ( (LA85_0==NOT) ) {
                    alt85=2;
                }


                switch (alt85) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT177=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2351); 
            	    BNOT177_tree = (Object)adaptor.create(BNOT177);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT177_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:15: ( LINE_BREAK )*
            	    loop83:
            	    do {
            	        int alt83=2;
            	        int LA83_0 = input.LA(1);

            	        if ( (LA83_0==LINE_BREAK) ) {
            	            alt83=1;
            	        }


            	        switch (alt83) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK178=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2357); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop83;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT179=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2367); 
            	    NOT179_tree = (Object)adaptor.create(NOT179);
            	    root_0 = (Object)adaptor.becomeRoot(NOT179_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:13: ( LINE_BREAK )*
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( (LA84_0==LINE_BREAK) ) {
            	            alt84=1;
            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:553:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK180=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2373); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop84;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2387);
            command181=command();
            _fsp--;

            adaptor.addChild(root_0, command181.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom ) ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;
        Token string_literal183=null;
        Token string_literal184=null;
        literal_return literal185 = null;

        boolean_expression_return boolean_expression186 = null;

        block_expression_return block_expression187 = null;

        if_expression_return if_expression188 = null;

        unless_expression_return unless_expression189 = null;

        atom_return atom190 = null;


        Object string_literal182_tree=null;
        Object string_literal183_tree=null;
        Object string_literal184_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:3: ( ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom )
            int alt86=9;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt86=1;
                }
                break;
            case 134:
                {
                alt86=2;
                }
                break;
            case 135:
                {
                alt86=3;
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
            case LCURLY:
                {
                alt86=4;
                }
                break;
            case 119:
            case 120:
            case 121:
                {
                alt86=5;
                }
                break;
            case 117:
                {
                alt86=6;
                }
                break;
            case IF_MODIFIER:
                {
                alt86=7;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt86=8;
                }
                break;
            case ID:
                {
                alt86=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("559:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom )", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:4: 'expression0'
                    {
                    string_literal182=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_command2402); 
                    string_literal182_tree = (Object)adaptor.create(string_literal182);
                    adaptor.addChild(root_0, string_literal182_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:20: 'expression1'
                    {
                    string_literal183=(Token)input.LT(1);
                    match(input,134,FOLLOW_134_in_command2406); 
                    string_literal183_tree = (Object)adaptor.create(string_literal183);
                    adaptor.addChild(root_0, string_literal183_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:36: 'expression2'
                    {
                    string_literal184=(Token)input.LT(1);
                    match(input,135,FOLLOW_135_in_command2410); 
                    string_literal184_tree = (Object)adaptor.create(string_literal184);
                    adaptor.addChild(root_0, string_literal184_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:50: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2412);
                    literal185=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal185.getTree());

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:58: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2414);
                    boolean_expression186=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression186.getTree());

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:78: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2417);
                    block_expression187=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression187.getTree());

                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:95: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2419);
                    if_expression188=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression188.getTree());

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:109: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2421);
                    unless_expression189=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression189.getTree());

                    }
                    break;
                case 9 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:127: atom
                    {
                    pushFollow(FOLLOW_atom_in_command2423);
                    atom190=atom();
                    _fsp--;

                    adaptor.addChild(root_0, atom190.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

            System.out.println("add virtual Token EXPR_END");tokenStream.addVirtualToken(((Token)retval.stop).getTokenIndex(), VirtualToken.EXPR_END);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:1: atom : methodExpression ;
    public final atom_return atom() throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodExpression_return methodExpression191 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:8: ( methodExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:561:8: methodExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodExpression_in_atom2434);
            methodExpression191=methodExpression();
            _fsp--;

            adaptor.addChild(root_0, methodExpression191.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:1: methodExpression : ( variable | method );
    public final methodExpression_return methodExpression() throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variable_return variable192 = null;

        method_return method193 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:9: ( variable | method )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==ID) ) {
                int LA87_1 = input.LA(2);

                if ( (isDefinedVar(input.LT(1).getText())) ) {
                    alt87=1;
                }
                else if ( (true) ) {
                    alt87=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("562:1: methodExpression : ( variable | method );", 87, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("562:1: methodExpression : ( variable | method );", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:9: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_methodExpression2447);
                    variable192=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable192.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:18: method
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_method_in_methodExpression2449);
                    method193=method();
                    _fsp--;

                    adaptor.addChild(root_0, method193.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID194=null;

        Object ID194_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:11: ({...}? ID -> ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:11: {...}? ID
            {
            if ( !(isDefinedVar(input.LT(1).getText())) ) {
                throw new FailedPredicateException(input, "variable", "isDefinedVar(input.LT(1).getText())");
            }
            ID194=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2457); 
            stream_ID.add(ID194);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 564:53: -> ^( VARIABLE ID )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:56: ^( VARIABLE ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:1: method : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method() throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID195=null;
        Token ID196=null;
        open_args_return open_args197 = null;


        Object ID195_tree=null;
        Object ID196_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:10: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:10: {...}? ID
                    {
                    if ( !(!isDefinedVar(input.LT(1).getText())) ) {
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(input.LT(1).getText())");
                    }
                    ID195=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2474); 
                    stream_ID.add(ID195);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 565:53: -> ^( CALL ID )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:56: ^( CALL ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:17: ID open_args
                    {
                    ID196=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2500); 
                    stream_ID.add(ID196);

                    pushFollow(FOLLOW_open_args_in_method2502);
                    open_args197=open_args();
                    _fsp--;

                    stream_open_args.add(open_args197.getTree());

                    // AST REWRITE
                    // elements: ID, open_args
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 566:30: -> ^( CALL ID open_args )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:33: ^( CALL ID open_args )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        adaptor.addChild(root_1, stream_open_args.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end method

    public static class command_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start command_call
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:1: command_call : command1 ;
    public final command_call_return command_call() throws RecognitionException {
        command_call_return retval = new command_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        command1_return command1198 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:4: ( command1 )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:4: command1
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_command1_in_command_call2522);
            command1198=command1();
            _fsp--;

            adaptor.addChild(root_0, command1198.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command_call

    public static class command1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start command1
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:1: command1 : operation1 ( command_args ) ;
    public final command1_return command1() throws RecognitionException {
        command1_return retval = new command1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operation1_return operation1199 = null;

        command_args_return command_args200 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:11: ( operation1 ( command_args ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:11: operation1 ( command_args )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operation1_in_command12534);
            operation1199=operation1();
            _fsp--;

            adaptor.addChild(root_0, operation1199.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:22: ( command_args )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:23: command_args
            {
            pushFollow(FOLLOW_command_args_in_command12537);
            command_args200=command_args();
            _fsp--;

            adaptor.addChild(root_0, command_args200.getTree());

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command1

    public static class command_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start command_args
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:575:1: command_args : open_args ;
    public final command_args_return command_args() throws RecognitionException {
        command_args_return retval = new command_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        open_args_return open_args201 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:4: ( open_args )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:4: open_args
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_open_args_in_command_args2549);
            open_args201=open_args();
            _fsp--;

            adaptor.addChild(root_0, open_args201.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command_args

    public static class open_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start open_args
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:577:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal203=null;
        Token char_literal204=null;
        Token char_literal205=null;
        Token char_literal207=null;
        call_args_return call_args202 = null;

        call_args_return call_args206 = null;


        Object char_literal203_tree=null;
        Object char_literal204_tree=null;
        Object char_literal205_tree=null;
        Object char_literal207_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:4: ( call_args | '(' ')' | '(' call_args ')' )
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=HEREDOC_STRING && LA89_0<=FLOAT)||LA89_0==SYMBOL||(LA89_0>=IF_MODIFIER && LA89_0<=UNLESS_MODIFIER)||LA89_0==ID||(LA89_0>=BNOT && LA89_0<=REGEX)||(LA89_0>=SINGLE_QUOTE_STRING && LA89_0<=DOUBLE_QUOTE_STRING)||LA89_0==LCURLY||LA89_0==117||(LA89_0>=119 && LA89_0<=121)||(LA89_0>=132 && LA89_0<=135)) ) {
                alt89=1;
            }
            else if ( (LA89_0==LPAREN) ) {
                int LA89_2 = input.LA(2);

                if ( (LA89_2==RPAREN) ) {
                    alt89=2;
                }
                else if ( ((LA89_2>=HEREDOC_STRING && LA89_2<=FLOAT)||LA89_2==SYMBOL||(LA89_2>=IF_MODIFIER && LA89_2<=UNLESS_MODIFIER)||LA89_2==ID||(LA89_2>=BNOT && LA89_2<=REGEX)||(LA89_2>=SINGLE_QUOTE_STRING && LA89_2<=DOUBLE_QUOTE_STRING)||LA89_2==LCURLY||LA89_2==117||(LA89_2>=119 && LA89_2<=121)||(LA89_2>=132 && LA89_2<=135)) ) {
                    alt89=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("577:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 89, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("577:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_args_in_open_args2557);
                    call_args202=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args202.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:579:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal203=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2567); 
                    char_literal204=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2570); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:10: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal205=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2582); 
                    pushFollow(FOLLOW_call_args_in_open_args2585);
                    call_args206=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args206.getTree());
                    char_literal207=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2589); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        args_return args208 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:4: ( args -> ^( ARG args ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2598);
            args208=args();
            _fsp--;

            stream_args.add(args208.getTree());

            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 582:9: -> ^( ARG args )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:582:12: ^( ARG args )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARG, "ARG"), root_1);

                adaptor.addChild(root_1, stream_args.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal210=null;
        arg_return arg209 = null;

        arg_return arg211 = null;


        Object char_literal210_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:8: ( arg ( ',' arg )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args2615);
            arg209=arg();
            _fsp--;

            adaptor.addChild(root_0, arg209.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:12: ( ',' arg )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:13: ',' arg
            	    {
            	    char_literal210=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2618); 
            	    pushFollow(FOLLOW_arg_in_args2621);
            	    arg211=arg();
            	    _fsp--;

            	    adaptor.addChild(root_0, arg211.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        definedExpression_return definedExpression212 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:7: ( definedExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_definedExpression_in_arg2632);
            definedExpression212=definedExpression();
            _fsp--;

            adaptor.addChild(root_0, definedExpression212.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set213=null;

        Object set213_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:18: ( ID | CONSTANT | FID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set213=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set213));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_operation10);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID214=null;
        Token CONSTANT215=null;
        Token FID216=null;
        op_return op217 = null;


        Object ID214_tree=null;
        Object CONSTANT215_tree=null;
        Object FID216_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:17: ( ID | CONSTANT | FID | op )
            int alt91=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt91=1;
                }
                break;
            case CONSTANT:
                {
                alt91=2;
                }
                break;
            case FID:
                {
                alt91=3;
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
            case 128:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("593:1: operation2 : ( ID | CONSTANT | FID | op );", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID214=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22670); 
                    ID214_tree = (Object)adaptor.create(ID214);
                    adaptor.addChild(root_0, ID214_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT215=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22674); 
                    CONSTANT215_tree = (Object)adaptor.create(CONSTANT215);
                    adaptor.addChild(root_0, CONSTANT215_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:33: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID216=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22678); 
                    FID216_tree = (Object)adaptor.create(FID216);
                    adaptor.addChild(root_0, FID216_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:39: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation22682);
                    op217=op();
                    _fsp--;

                    adaptor.addChild(root_0, op217.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID218=null;
        Token FID219=null;
        op_return op220 = null;


        Object ID218_tree=null;
        Object FID219_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:17: ( ID | FID | op )
            int alt92=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt92=1;
                }
                break;
            case FID:
                {
                alt92=2;
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
            case 128:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("596:1: operation3 : ( ID | FID | op );", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID218=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32698); 
                    ID218_tree = (Object)adaptor.create(ID218);
                    adaptor.addChild(root_0, ID218_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:22: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID219=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation32702); 
                    FID219_tree = (Object)adaptor.create(FID219);
                    adaptor.addChild(root_0, FID219_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:28: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation32706);
                    op220=op();
                    _fsp--;

                    adaptor.addChild(root_0, op220.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID221=null;

        Object ID221_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:7: ( ID -> ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:7: ID
            {
            ID221=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2720); 
            stream_ID.add(ID221);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 599:10: -> ^( VARIABLE ID )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:13: ^( VARIABLE ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression222 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2736);
            expression222=expression();
            _fsp--;

            adaptor.addChild(root_0, expression222.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:1: literal : ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT223=null;
        Token FLOAT224=null;
        Token ARRAY226=null;
        Token SYMBOL228=null;
        Token REGEX229=null;
        string_return string225 = null;

        hash_return hash227 = null;


        Object INT223_tree=null;
        Object FLOAT224_tree=null;
        Object ARRAY226_tree=null;
        Object SYMBOL228_tree=null;
        Object REGEX229_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:11: ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX )
            int alt93=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt93=1;
                }
                break;
            case FLOAT:
                {
                alt93=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt93=3;
                }
                break;
            case ARRAY:
                {
                alt93=4;
                }
                break;
            case LCURLY:
                {
                alt93=5;
                }
                break;
            case SYMBOL:
                {
                alt93=6;
                }
                break;
            case REGEX:
                {
                alt93=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("604:1: literal : ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX );", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT223=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2746); 
                    INT223_tree = (Object)adaptor.create(INT223);
                    adaptor.addChild(root_0, INT223_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT224=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2748); 
                    FLOAT224_tree = (Object)adaptor.create(FLOAT224);
                    adaptor.addChild(root_0, FLOAT224_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2750);
                    string225=string();
                    _fsp--;

                    adaptor.addChild(root_0, string225.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY226=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2752); 
                    ARRAY226_tree = (Object)adaptor.create(ARRAY226);
                    adaptor.addChild(root_0, ARRAY226_tree);


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:34: hash
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hash_in_literal2754);
                    hash227=hash();
                    _fsp--;

                    adaptor.addChild(root_0, hash227.getTree());

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:39: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL228=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2756); 
                    SYMBOL228_tree = (Object)adaptor.create(SYMBOL228);
                    adaptor.addChild(root_0, SYMBOL228_tree);


                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:604:46: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX229=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2758); 
                    REGEX229_tree = (Object)adaptor.create(REGEX229);
                    adaptor.addChild(root_0, REGEX229_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:672:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set230=null;

        Object set230_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:672:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set230=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set230));
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_string0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:743:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal231=null;
        Token char_literal233=null;
        assoc_list_return assoc_list232 = null;


        Object char_literal231_tree=null;
        Object char_literal233_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:743:8: ( '{' assoc_list '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:743:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal231=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3716); 
            char_literal231_tree = (Object)adaptor.create(char_literal231);
            root_0 = (Object)adaptor.becomeRoot(char_literal231_tree, root_0);

            pushFollow(FOLLOW_assoc_list_in_hash3719);
            assoc_list232=assoc_list();
            _fsp--;

            adaptor.addChild(root_0, assoc_list232.getTree());
            char_literal233=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3721); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assocs_return assocs234 = null;

        trailer_return trailer235 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:745:4: ( assocs trailer )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:745:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list3730);
            assocs234=assocs();
            _fsp--;

            adaptor.addChild(root_0, assocs234.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3732);
            trailer235=trailer();
            _fsp--;

            adaptor.addChild(root_0, trailer235.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal237=null;
        assoc_return assoc236 = null;

        assoc_return assoc238 = null;


        Object char_literal237_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:10: ( assoc ( ',' assoc )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs3741);
            assoc236=assoc();
            _fsp--;

            adaptor.addChild(root_0, assoc236.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:16: ( ',' assoc )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==COMMA) ) {
                    int LA94_2 = input.LA(2);

                    if ( ((LA94_2>=HEREDOC_STRING && LA94_2<=FLOAT)||LA94_2==SYMBOL||(LA94_2>=IF_MODIFIER && LA94_2<=UNLESS_MODIFIER)||LA94_2==ID||(LA94_2>=BNOT && LA94_2<=REGEX)||(LA94_2>=SINGLE_QUOTE_STRING && LA94_2<=DOUBLE_QUOTE_STRING)||LA94_2==LCURLY||LA94_2==117||(LA94_2>=119 && LA94_2<=121)||(LA94_2>=132 && LA94_2<=135)) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:18: ',' assoc
            	    {
            	    char_literal237=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3745); 
            	    pushFollow(FOLLOW_assoc_in_assocs3748);
            	    assoc238=assoc();
            	    _fsp--;

            	    adaptor.addChild(root_0, assoc238.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:1: assoc : arg ( ASSOC | ',' ) arg ;
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set240=null;
        arg_return arg239 = null;

        arg_return arg241 = null;


        Object set240_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:17: ( arg ( ASSOC | ',' ) arg )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:17: arg ( ASSOC | ',' ) arg
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_assoc3766);
            arg239=arg();
            _fsp--;

            adaptor.addChild(root_0, arg239.getTree());
            set240=(Token)input.LT(1);
            if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3768);    throw mse;
            }

            pushFollow(FOLLOW_arg_in_assoc3775);
            arg241=arg();
            _fsp--;

            adaptor.addChild(root_0, arg241.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK242=null;
        Token char_literal243=null;

        Object LINE_BREAK242_tree=null;
        Object char_literal243_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:29: ( | LINE_BREAK | ',' )
            int alt95=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt95=1;
                }
                break;
            case LINE_BREAK:
                {
                alt95=2;
                }
                break;
            case COMMA:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("752:1: trailer : ( | LINE_BREAK | ',' );", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:29: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK242=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer3796); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:45: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal243=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer3801); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end trailer


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\43\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\173\2\u0087\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\121\uffff\1\3\3\uffff\2\3",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\2\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\16\uffff\1\4\1\3\3\4\2\3"+
            "\1\uffff\2\4\4\uffff\5\4",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\2\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\16\uffff\1\4\1\3\3\4\2\3"+
            "\1\uffff\2\4\4\uffff\5\4",
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
            return "()* loopback of 264:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\44\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\174\1\u0087\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\115\uffff\1\2\11\uffff\1\3",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\2\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\16\uffff\7\4\1\3\2\4\4\uffff"+
            "\5\4",
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
            return "306:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA88_eotS =
        "\111\uffff";
    static final String DFA88_eofS =
        "\1\uffff\1\2\107\uffff";
    static final String DFA88_minS =
        "\1\47\1\13\1\uffff\1\14\1\uffff\1\14\1\13\3\14\77\0";
    static final String DFA88_maxS =
        "\1\47\1\u0087\1\uffff\1\u0087\1\uffff\1\u0087\1\u0080\3\u0087\77"+
        "\0";
    static final String DFA88_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\104\uffff";
    static final String DFA88_specialS =
        "\111\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\1",
            "\1\2\2\4\4\uffff\1\4\11\uffff\2\2\1\3\1\5\5\2\2\uffff\1\4\15"+
            "\2\16\uffff\12\2\5\4\20\uffff\2\4\2\uffff\1\4\1\2\2\uffff\1"+
            "\2\1\uffff\1\4\1\2\3\uffff\2\2\2\uffff\1\4\1\2\3\4\3\2\4\uffff"+
            "\2\2\1\uffff\4\4",
            "",
            "\1\20\1\17\4\uffff\1\23\13\uffff\1\27\1\30\4\uffff\1\2\2\uffff"+
            "\1\31\45\uffff\1\11\1\12\1\16\1\21\1\24\20\uffff\2\20\2\uffff"+
            "\1\22\16\uffff\1\26\1\uffff\3\25\3\uffff\1\6\1\32\4\uffff\1"+
            "\7\1\10\1\13\1\14\1\15",
            "",
            "\2\2\4\uffff\1\2\13\uffff\2\2\4\uffff\1\2\2\uffff\1\2\45\uffff"+
            "\5\2\20\uffff\2\2\2\uffff\1\2\16\uffff\1\2\1\uffff\3\33\3\uffff"+
            "\2\2\4\uffff\5\2",
            "\1\37\2\uffff\1\35\1\36\14\uffff\2\37\11\uffff\1\34\15\37\25"+
            "\uffff\4\37\42\uffff\1\37\17\uffff\1\37",
            "\1\52\1\51\4\uffff\1\55\13\uffff\1\61\1\62\4\uffff\1\40\2\uffff"+
            "\1\63\45\uffff\1\43\1\44\1\50\1\53\1\56\20\uffff\2\52\2\uffff"+
            "\1\54\16\uffff\1\60\1\uffff\3\57\11\uffff\1\41\1\42\1\45\1\46"+
            "\1\47",
            "\1\73\1\72\4\uffff\1\76\13\uffff\1\102\1\103\7\uffff\1\104\45"+
            "\uffff\1\64\1\65\1\71\1\74\1\77\20\uffff\2\73\2\uffff\1\75\16"+
            "\uffff\1\101\1\uffff\3\100\13\uffff\1\66\1\67\1\70",
            "\1\20\1\17\4\uffff\1\23\13\uffff\1\27\1\30\4\uffff\1\105\2\uffff"+
            "\1\106\45\uffff\1\107\1\110\1\16\1\21\1\24\20\uffff\2\20\2\uffff"+
            "\1\22\16\uffff\1\26\1\uffff\3\25\13\uffff\1\13\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "565:1: method : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program223 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_statement_list_in_program227 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_program229 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_statement_in_statement_list243 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list246 = new BitSet(new long[]{0x00000098C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_statement_in_statement_list249 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_expression_in_statement275 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement278 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_set_in_modifier_line318 = new BitSet(new long[]{0x00000090C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_line_break_in_modifier_line332 = new BitSet(new long[]{0x00000090C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_expression_in_modifier_line336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_block_expression411 = new BitSet(new long[]{0x00000088C0043000L,0x63E0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_body_in_block_expression413 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_block_expression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body422 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_statement_list_in_body426 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_body428 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression451 = new BitSet(new long[]{0x00000080C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_expression_in_if_expression456 = new BitSet(new long[]{0x0000001000000000L,0x1004000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression458 = new BitSet(new long[]{0x00000088C0043000L,0x6FE0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_body_in_if_expression471 = new BitSet(new long[]{0x0000000000000000L,0x0C40000000000000L});
    public static final BitSet FOLLOW_122_in_if_expression474 = new BitSet(new long[]{0x00000080C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_expression_in_if_expression478 = new BitSet(new long[]{0x0000001000000000L,0x1004000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression480 = new BitSet(new long[]{0x00000088C0043000L,0x6FE0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_body_in_if_expression484 = new BitSet(new long[]{0x0000000000000000L,0x0C40000000000000L});
    public static final BitSet FOLLOW_123_in_if_expression498 = new BitSet(new long[]{0x00000088C0043000L,0x63E0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_body_in_if_expression502 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_if_expression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator567 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator570 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator572 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator577 = new BitSet(new long[]{0x0000001000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_seperator580 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator582 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression592 = new BitSet(new long[]{0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression594 = new BitSet(new long[]{0x0000001000000000L,0x1004000000000000L});
    public static final BitSet FOLLOW_124_in_unless_expression597 = new BitSet(new long[]{0x00000088C0043000L,0x6BE0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_COLON_in_unless_expression599 = new BitSet(new long[]{0x00000088C0043000L,0x6BE0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_line_break_in_unless_expression601 = new BitSet(new long[]{0x00000088C0043000L,0x6BE0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_body_in_unless_expression613 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_123_in_unless_expression626 = new BitSet(new long[]{0x00000088C0043000L,0x63E0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_body_in_unless_expression628 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_unless_expression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_expression705 = new BitSet(new long[]{0x001FFF803000C800L,0x0001000000003C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_fitem_in_expression708 = new BitSet(new long[]{0x001FFF803000C800L,0x0001000000003C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_fitem_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_methodDefinition730 = new BitSet(new long[]{0x000000900000C000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition734 = new BitSet(new long[]{0x000000900000C000L,0x0000100000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition740 = new BitSet(new long[]{0x0000004000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition742 = new BitSet(new long[]{0x000000800000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition746 = new BitSet(new long[]{0x0000009800000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition750 = new BitSet(new long[]{0x00000098C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition753 = new BitSet(new long[]{0x00000098C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition759 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_methodDefinition761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton774 = new BitSet(new long[]{0x00000080C0043000L,0x63A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_expression_in_singleton777 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton779 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist838 = new BitSet(new long[]{0x0000009000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist841 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist845 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist863 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args877 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_andorExpression1124 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1129 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_130_in_andorExpression1140 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1145 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_131_in_notExpression1178 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1185 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_definedExpression1210 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1251 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_assignmentExpression1253 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1315 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1318 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1320 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1359 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1363 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1374 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1378 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1445 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1450 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1511 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1516 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1545 = new BitSet(new long[]{0x00000F0000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1579 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1584 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1595 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1601 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1612 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1616 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1627 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1632 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1643 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1649 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1660 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1665 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1680 = new BitSet(new long[]{0x00000F0000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1701 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1735 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1741 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1752 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1757 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1768 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1773 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1784 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1788 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1803 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1857 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1863 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_BOR_in_orExpression1874 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1880 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_BAND_in_andExpression1947 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1953 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1984 = new BitSet(new long[]{0x0001000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2018 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2023 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2034 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2038 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2053 = new BitSet(new long[]{0x0001000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2075 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2109 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2116 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2127 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2134 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2149 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2169 = new BitSet(new long[]{0x0008000030000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2203 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2209 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2220 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2226 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2237 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2243 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2258 = new BitSet(new long[]{0x0008000030000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2279 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2314 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2320 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2329 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2351 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2357 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2367 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2373 = new BitSet(new long[]{0x00000090C0043000L,0x03A0004C0003E000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_command_in_bnotExpression2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_command2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_command2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_command2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_command2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2500 = new BitSet(new long[]{0x00000080C0043000L,0x03A0104C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_open_args_in_method2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command1_in_command_call2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation1_in_command12534 = new BitSet(new long[]{0x00000080C0043000L,0x03A0104C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_command_args_in_command12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_args_in_command_args2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2567 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2582 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_call_args_in_open_args2585 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2615 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2618 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_arg_in_args2621 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation32702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation32706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_literal2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3716 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_assoc_list_in_hash3719 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3730 = new BitSet(new long[]{0x0000001000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3741 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3745 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_assoc_in_assocs3748 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_arg_in_assoc3766 = new BitSet(new long[]{0x0000000000000000L,0x0002040000000000L});
    public static final BitSet FOLLOW_set_in_assoc3768 = new BitSet(new long[]{0x00000080C0043000L,0x03A0004C0003E000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_arg_in_assoc3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer3801 = new BitSet(new long[]{0x0000000000000002L});

}