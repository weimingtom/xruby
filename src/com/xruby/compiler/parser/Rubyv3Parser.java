// $ANTLR 3.0 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-06-05 10:22:25

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "COLON2", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'expression0'", "'expression1'", "'expression2'"
    };
    public static final int COMMA=107;
    public static final int GREATER_THAN=42;
    public static final int LOGICAL_AND_ASSIGN=62;
    public static final int MINUS=48;
    public static final int ESCAPE_INT=90;
    public static final int ARRAY=78;
    public static final int HEX_PART=86;
    public static final int LOGICAL_OR=68;
    public static final int LESS_THAN=44;
    public static final int META_PART=88;
    public static final int LEADING0_NUMBER=85;
    public static final int BOR=73;
    public static final int LEADING_MARK_DECIMAL=83;
    public static final int BINARY=82;
    public static final int COLON2=109;
    public static final int EMPTY_ARRAY=106;
    public static final int LCURLY=96;
    public static final int LINE_BREAK=35;
    public static final int CONSTANT=14;
    public static final int LEFT_SHIFT=11;
    public static final int IF_MODIFIER=29;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int ESCAPE_INT_PART=89;
    public static final int REGEX=79;
    public static final int SYMBOL=17;
    public static final int RPAREN=103;
    public static final int CONTROL_PART=87;
    public static final int DOUBLE_QUOTE_STRING=93;
    public static final int STAR_ASSIGN=61;
    public static final int PLUS=47;
    public static final int HEREDOC_INDENT_BEGIN=99;
    public static final int BODY=9;
    public static final int CASE_EQUAL=40;
    public static final int UNLESS_MODIFIER=30;
    public static final int MINUS_ASSIGN=55;
    public static final int GREATER_OR_EQUAL=43;
    public static final int EXCLUSIVE_RANGE=67;
    public static final int POWER_ASSIGN=64;
    public static final int MOD_ASSIGN=52;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
    public static final int WS=36;
    public static final int STRING=26;
    public static final int DOUBLE_STRING_CHAR=95;
    public static final int RIGHT_SHIFT_ASSIGN=60;
    public static final int NON_LEADING0_NUMBER=91;
    public static final int SINGLE_QUOTE_STRING=92;
    public static final int HEREDOC_BEGIN=98;
    public static final int LBRACK=104;
    public static final int SEMI=34;
    public static final int DIV_ASSIGN=54;
    public static final int MRHS=23;
    public static final int BLOCK_ARG=21;
    public static final int EQUAL=39;
    public static final int LOGICAL_AND=69;
    public static final int COLON=108;
    public static final int DIV=27;
    public static final int HEX=81;
    public static final int SINGLETON_METHOD=25;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=66;
    public static final int BNOT=75;
    public static final int LOGICAL_OR_ASSIGN=63;
    public static final int ASSOC=100;
    public static final int FLOAT=13;
    public static final int OCTAL=80;
    public static final int MOD=28;
    public static final int PLUS_ASSIGN=56;
    public static final int QUESTION=65;
    public static final int UNTIL_MODIFIER=32;
    public static final int BLOCK=18;
    public static final int RCURLY=97;
    public static final int INT=77;
    public static final int BOR_ASSIGN=57;
    public static final int ASSIGN=51;
    public static final int LESS_OR_EQUAL=45;
    public static final int LPAREN=102;
    public static final int BAND=74;
    public static final int HEREDOC_STRING=12;
    public static final int NOT_MATCH=71;
    public static final int ID=37;
    public static final int NOT_EQUAL=70;
    public static final int BAND_ASSIGN=58;
    public static final int COMPLEMENT_ASSIGN=53;
    public static final int RIGHT_SHIFT=46;
    public static final int POWER=50;
    public static final int BXOR_ASSIGN=101;
    public static final int FID=15;
    public static final int NESTED_LHS=24;
    public static final int COMMENT=111;
    public static final int LEFT_SHIFT_ASSIGN=59;
    public static final int MATCH=41;
    public static final int WHILE_MODIFIER=31;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=110;
    public static final int EXP_PART=84;
    public static final int COMPARE=38;
    public static final int IF=7;
    public static final int ARG=10;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int EOF=-1;
    public static final int CALL=16;
    public static final int RBRACK=105;
    public static final int RESCUE_MODIFIER=33;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=49;
    public static final int BXOR=72;
    public static final int NOT=76;
    public static final int SINGLE_STRING_CHAR=94;

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==LCURLY||LA3_0==112||(LA3_0>=114 && LA3_0<=116)||(LA3_0>=120 && LA3_0<=121)||(LA3_0>=125 && LA3_0<=128)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("257:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program217);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program221);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program223);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list237);
            statement4=statement();
            _fsp--;

            stream_statement.add(statement4.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:16: ( terminal )+ statement
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:16: ( terminal )+
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
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list240);
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

            	    pushFollow(FOLLOW_statement_in_statement_list243);
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
            // 262:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:58: ( statement )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:269:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;


        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement269);
            expression7=expression();
            _fsp--;

            stream_expression.add(expression7.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement272);
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
            // 270:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:59: ( modifier_line )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line312);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line326);
            	    line_break10=line_break();
            	    _fsp--;

            	    adaptor.addChild(root_0, line_break10.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_modifier_line330);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)input.LT(1);
            match(input,112,FOLLOW_112_in_block_expression405); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);

            pushFollow(FOLLOW_body_in_block_expression407);
            body13=body();
            _fsp--;

            adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,113,FOLLOW_113_in_block_expression409); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==113||(LA10_0>=117 && LA10_0<=118)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==LCURLY||LA10_0==112||(LA10_0>=114 && LA10_0<=116)||(LA10_0>=120 && LA10_0<=121)||(LA10_0>=125 && LA10_0<=128)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("294:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body416); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body420);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body422);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=114 && input.LA(1)<=116) ) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:298:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:298:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression445); 
            stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression450);
            e0=expression();
            _fsp--;

            stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression452);
            seperator20=seperator();
            _fsp--;

            stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression465);
            body0=body();
            _fsp--;

            stream_body.add(body0.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:299:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==117) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:299:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,117,FOLLOW_117_in_if_expression468); 
            	    stream_117.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression472);
            	    e1=expression();
            	    _fsp--;

            	    stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression474);
            	    seperator22=seperator();
            	    _fsp--;

            	    stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression478);
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

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==118) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,118,FOLLOW_118_in_if_expression492); 
                    stream_118.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression496);
                    body2=body();
                    _fsp--;

                    stream_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,113,FOLLOW_113_in_if_expression509); 
            stream_113.add(string_literal24);


            // AST REWRITE
            // elements: body1, e1, e0, body2, body0
            // token labels: 
            // rule labels: e0, body0, e1, retval, body2
            // token list labels: 
            // rule list labels: body1
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_e0=new RewriteRuleSubtreeStream(adaptor,"token e0",e0!=null?e0.tree:null);
            RewriteRuleSubtreeStream stream_body0=new RewriteRuleSubtreeStream(adaptor,"token body0",body0!=null?body0.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_body2=new RewriteRuleSubtreeStream(adaptor,"token body2",body2!=null?body2.tree:null);
            RewriteRuleSubtreeStream stream_body1=new RewriteRuleSubtreeStream(adaptor,"token body1",list_body1);
            root_0 = (Object)adaptor.nil();
            // 301:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:48: ( $body2)?
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:3: ( LINE_BREAK )+
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
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator561); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator564); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator566); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator571); 
                    	    LINE_BREAK28_tree = (Object)adaptor.create(LINE_BREAK28);
                    	    adaptor.addChild(root_0, LINE_BREAK28_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    string_literal29=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_seperator574); 
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:305:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator576); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:306:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression586); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_boolean_expression_in_unless_expression588);
            boolean_expression32=boolean_expression();
            _fsp--;

            adaptor.addChild(root_0, boolean_expression32.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 119:
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
                    new NoViableAltException("307:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_unless_expression591); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression593); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression595);
                    line_break35=line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression607);
            body36=body();
            _fsp--;

            adaptor.addChild(root_0, body36.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==118) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,118,FOLLOW_118_in_unless_expression620); 
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);

                    pushFollow(FOLLOW_body_in_unless_expression622);
                    body38=body();
                    _fsp--;

                    adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

            }

            string_literal39=(Token)input.LT(1);
            match(input,113,FOLLOW_113_in_unless_expression635); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:11: ( SEMI | line_break )
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
                    new NoViableAltException("311:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal641); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal644);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break654); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:5: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 120:
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
            case 112:
            case 114:
            case 115:
            case 116:
            case 125:
            case 126:
            case 127:
            case 128:
                {
                alt21=2;
                }
                break;
            case 121:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("345:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)input.LT(1);
                    match(input,120,FOLLOW_120_in_expression699); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);

                    pushFollow(FOLLOW_fitem_in_expression702);
                    fitem44=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression704);
                    fitem45=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem45.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression706);
                    andorExpression46=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression46.getTree());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_expression708);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:347:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodDefinition_return methodDefinition48 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:4: ( methodDefinition )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodDefinition_in_primaryExpression716);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:1: methodDefinition : 'def' ( LINE_BREAK )* methodName methodDefinationArgument ( bodyStatement )? 'end' ;
    public final methodDefinition_return methodDefinition() throws RecognitionException {
        methodDefinition_return retval = new methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token LINE_BREAK50=null;
        Token string_literal54=null;
        methodName_return methodName51 = null;

        methodDefinationArgument_return methodDefinationArgument52 = null;

        bodyStatement_return bodyStatement53 = null;


        Object string_literal49_tree=null;
        Object LINE_BREAK50_tree=null;
        Object string_literal54_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:4: ( 'def' ( LINE_BREAK )* methodName methodDefinationArgument ( bodyStatement )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:4: 'def' ( LINE_BREAK )* methodName methodDefinationArgument ( bodyStatement )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,121,FOLLOW_121_in_methodDefinition724); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition728); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_methodName_in_methodDefinition733);
            methodName51=methodName();
            _fsp--;

            adaptor.addChild(root_0, methodName51.getTree());
            enterScope();
            pushFollow(FOLLOW_methodDefinationArgument_in_methodDefinition737);
            methodDefinationArgument52=methodDefinationArgument();
            _fsp--;

            adaptor.addChild(root_0, methodDefinationArgument52.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:78: ( bodyStatement )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=HEREDOC_STRING && LA23_0<=FLOAT)||LA23_0==SYMBOL||(LA23_0>=IF_MODIFIER && LA23_0<=UNLESS_MODIFIER)||LA23_0==ID||(LA23_0>=BNOT && LA23_0<=REGEX)||(LA23_0>=SINGLE_QUOTE_STRING && LA23_0<=DOUBLE_QUOTE_STRING)||LA23_0==LCURLY||LA23_0==112||(LA23_0>=114 && LA23_0<=116)||(LA23_0>=120 && LA23_0<=121)||(LA23_0>=125 && LA23_0<=128)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:79: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition740);
                    bodyStatement53=bodyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, bodyStatement53.getTree());

                    }
                    break;

            }

            string_literal54=(Token)input.LT(1);
            match(input,113,FOLLOW_113_in_methodDefinition744); 
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

    public static class methodName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start methodName
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:1: methodName : id= ID ;
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: (id= ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: id= ID
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_methodName757); 
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);


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

    public static class methodDefinationArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start methodDefinationArgument
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:1: methodDefinationArgument : ( '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )? | ( methodDefinationArgumentWithoutParen )? terminal );
    public final methodDefinationArgument_return methodDefinationArgument() throws RecognitionException {
        methodDefinationArgument_return retval = new methodDefinationArgument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        methodDefinationArgumentWithoutParen_return methodDefinationArgumentWithoutParen56 = null;

        terminal_return terminal58 = null;

        methodDefinationArgumentWithoutParen_return methodDefinationArgumentWithoutParen59 = null;

        terminal_return terminal60 = null;


        Object char_literal55_tree=null;
        Object char_literal57_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:4: ( '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )? | ( methodDefinationArgumentWithoutParen )? terminal )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LPAREN) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=SEMI && LA27_0<=LINE_BREAK)||LA27_0==ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("353:1: methodDefinationArgument : ( '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )? | ( methodDefinationArgumentWithoutParen )? terminal );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:4: '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal55=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_methodDefinationArgument767); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:9: ( methodDefinationArgumentWithoutParen )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:10: methodDefinationArgumentWithoutParen
                            {
                            pushFollow(FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument771);
                            methodDefinationArgumentWithoutParen56=methodDefinationArgumentWithoutParen();
                            _fsp--;

                            adaptor.addChild(root_0, methodDefinationArgumentWithoutParen56.getTree());

                            }
                            break;

                    }

                    char_literal57=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_methodDefinationArgument775); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:54: ( terminal )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=SEMI && LA25_0<=LINE_BREAK)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:55: terminal
                            {
                            pushFollow(FOLLOW_terminal_in_methodDefinationArgument779);
                            terminal58=terminal();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:10: ( methodDefinationArgumentWithoutParen )? terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:10: ( methodDefinationArgumentWithoutParen )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:11: methodDefinationArgumentWithoutParen
                            {
                            pushFollow(FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument794);
                            methodDefinationArgumentWithoutParen59=methodDefinationArgumentWithoutParen();
                            _fsp--;

                            adaptor.addChild(root_0, methodDefinationArgumentWithoutParen59.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_terminal_in_methodDefinationArgument798);
                    terminal60=terminal();
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
    // $ANTLR end methodDefinationArgument

    public static class methodDefinationArgumentWithoutParen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start methodDefinationArgumentWithoutParen
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:356:1: methodDefinationArgumentWithoutParen : normalMethodDefinationArgument -> ^( ARG normalMethodDefinationArgument ) ;
    public final methodDefinationArgumentWithoutParen_return methodDefinationArgumentWithoutParen() throws RecognitionException {
        methodDefinationArgumentWithoutParen_return retval = new methodDefinationArgumentWithoutParen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        normalMethodDefinationArgument_return normalMethodDefinationArgument61 = null;


        RewriteRuleSubtreeStream stream_normalMethodDefinationArgument=new RewriteRuleSubtreeStream(adaptor,"rule normalMethodDefinationArgument");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:4: ( normalMethodDefinationArgument -> ^( ARG normalMethodDefinationArgument ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:4: normalMethodDefinationArgument
            {
            pushFollow(FOLLOW_normalMethodDefinationArgument_in_methodDefinationArgumentWithoutParen807);
            normalMethodDefinationArgument61=normalMethodDefinationArgument();
            _fsp--;

            stream_normalMethodDefinationArgument.add(normalMethodDefinationArgument61.getTree());

            // AST REWRITE
            // elements: normalMethodDefinationArgument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 357:35: -> ^( ARG normalMethodDefinationArgument )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:38: ^( ARG normalMethodDefinationArgument )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARG, "ARG"), root_1);

                adaptor.addChild(root_1, stream_normalMethodDefinationArgument.next());

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
    // $ANTLR end methodDefinationArgumentWithoutParen

    public static class normalMethodDefinationArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start normalMethodDefinationArgument
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:1: normalMethodDefinationArgument : ID ( '=' expression )? ;
    public final normalMethodDefinationArgument_return normalMethodDefinationArgument() throws RecognitionException {
        normalMethodDefinationArgument_return retval = new normalMethodDefinationArgument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID62=null;
        Token char_literal63=null;
        expression_return expression64 = null;


        Object ID62_tree=null;
        Object char_literal63_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:4: ( ID ( '=' expression )? )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:4: ID ( '=' expression )?
            {
            root_0 = (Object)adaptor.nil();

            ID62=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_normalMethodDefinationArgument823); 
            ID62_tree = (Object)adaptor.create(ID62);
            adaptor.addChild(root_0, ID62_tree);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:7: ( '=' expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSIGN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:9: '=' expression
                    {
                    char_literal63=(Token)input.LT(1);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_normalMethodDefinationArgument827); 
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);

                    pushFollow(FOLLOW_expression_in_normalMethodDefinationArgument829);
                    expression64=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression64.getTree());

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
    // $ANTLR end normalMethodDefinationArgument

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variable
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:1: variable : id= ID ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:11: (id= ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:11: id= ID
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable839); 
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);

            addVariable(id.getText());

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

    public static class bodyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bodyStatement
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list65 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:4: ( statement_list -> ^( BODY statement_list ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement850);
            statement_list65=statement_list();
            _fsp--;

            stream_statement_list.add(statement_list65.getTree());

            // AST REWRITE
            // elements: statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 362:19: -> ^( BODY statement_list )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:22: ^( BODY statement_list )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname66 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:9: ( fname )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem868);
            fname66=fname();
            _fsp--;

            adaptor.addChild(root_0, fname66.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID67=null;
        Token CONSTANT68=null;
        Token FID69=null;
        op_return op70 = null;


        Object ID67_tree=null;
        Object CONSTANT68_tree=null;
        Object FID69_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:9: ( ID | CONSTANT | FID | op )
            int alt29=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt29=1;
                }
                break;
            case CONSTANT:
                {
                alt29=2;
                }
                break;
            case FID:
                {
                alt29=3;
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
            case 122:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("366:1: fname : ( ID | CONSTANT | FID | op );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID67=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname875); 
                    ID67_tree = (Object)adaptor.create(ID67);
                    adaptor.addChild(root_0, ID67_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT68=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname877); 
                    CONSTANT68_tree = (Object)adaptor.create(CONSTANT68);
                    adaptor.addChild(root_0, CONSTANT68_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID69=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname879); 
                    FID69_tree = (Object)adaptor.create(FID69);
                    adaptor.addChild(root_0, FID69_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname881);
                    op70=op();
                    _fsp--;

                    adaptor.addChild(root_0, op70.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set71=null;

        Object set71_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set71=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==122 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set71));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal73=null;
        Token LINE_BREAK74=null;
        Token string_literal75=null;
        Token LINE_BREAK76=null;
        notExpression_return notExpression72 = null;

        notExpression_return notExpression77 = null;


        Object string_literal73_tree=null;
        Object LINE_BREAK74_tree=null;
        Object string_literal75_tree=null;
        Object LINE_BREAK76_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1042);
            notExpression72=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression72.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=123 && LA33_0<=124)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==123) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==124) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("380:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal73=(Token)input.LT(1);
            	            match(input,123,FOLLOW_123_in_andorExpression1052); 
            	            string_literal73_tree = (Object)adaptor.create(string_literal73);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal73_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:15: ( LINE_BREAK )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==LINE_BREAK) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK74=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1057); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal75=(Token)input.LT(1);
            	            match(input,124,FOLLOW_124_in_andorExpression1068); 
            	            string_literal75_tree = (Object)adaptor.create(string_literal75);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:14: ( LINE_BREAK )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==LINE_BREAK) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK76=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1073); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop31;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1088);
            	    notExpression77=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression77.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal78=null;
        Token LINE_BREAK79=null;
        notExpression_return notExpression80 = null;

        definedExpression_return definedExpression81 = null;


        Object string_literal78_tree=null;
        Object LINE_BREAK79_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==125) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=HEREDOC_STRING && LA35_0<=FLOAT)||LA35_0==SYMBOL||(LA35_0>=IF_MODIFIER && LA35_0<=UNLESS_MODIFIER)||LA35_0==ID||(LA35_0>=BNOT && LA35_0<=REGEX)||(LA35_0>=SINGLE_QUOTE_STRING && LA35_0<=DOUBLE_QUOTE_STRING)||LA35_0==LCURLY||LA35_0==112||(LA35_0>=114 && LA35_0<=116)||(LA35_0>=126 && LA35_0<=128)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("386:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal78=(Token)input.LT(1);
                    match(input,125,FOLLOW_125_in_notExpression1106); 
                    string_literal78_tree = (Object)adaptor.create(string_literal78);
                    root_0 = (Object)adaptor.becomeRoot(string_literal78_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:4: ( LINE_BREAK )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==LINE_BREAK) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK79=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1113); 

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1121);
                    notExpression80=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression80.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1127);
                    definedExpression81=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression81.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:1: definedExpression : methodExpression ;
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodExpression_return methodExpression82 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:4: ( methodExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:4: methodExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodExpression_in_definedExpression1138);
            methodExpression82=methodExpression();
            _fsp--;

            adaptor.addChild(root_0, methodExpression82.getTree());

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

    public static class methodExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start methodExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:1: methodExpression : ( method | assignmentExpression );
    public final methodExpression_return methodExpression() throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        method_return method83 = null;

        assignmentExpression_return assignmentExpression84 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:9: ( method | assignmentExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID) ) {
                int LA36_1 = input.LA(2);

                if ( ((LA36_1>=ASSIGN && LA36_1<=POWER_ASSIGN)) ) {
                    alt36=2;
                }
                else if ( (LA36_1==EOF||(LA36_1>=IF_MODIFIER && LA36_1<=LINE_BREAK)||LA36_1==RPAREN||LA36_1==COLON||LA36_1==113||(LA36_1>=117 && LA36_1<=119)||(LA36_1>=123 && LA36_1<=124)) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("394:1: methodExpression : ( method | assignmentExpression );", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA36_0>=HEREDOC_STRING && LA36_0<=FLOAT)||LA36_0==SYMBOL||(LA36_0>=IF_MODIFIER && LA36_0<=UNLESS_MODIFIER)||(LA36_0>=BNOT && LA36_0<=REGEX)||(LA36_0>=SINGLE_QUOTE_STRING && LA36_0<=DOUBLE_QUOTE_STRING)||LA36_0==LCURLY||LA36_0==112||(LA36_0>=114 && LA36_0<=116)||(LA36_0>=126 && LA36_0<=128)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("394:1: methodExpression : ( method | assignmentExpression );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:9: method
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_method_in_methodExpression1151);
                    method83=method();
                    _fsp--;

                    adaptor.addChild(root_0, method83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:2: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_methodExpression1156);
                    assignmentExpression84=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression84.getTree());

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

    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start method
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:1: method : ID ;
    public final method_return method() throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID85=null;

        Object ID85_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:10: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:10: ID
            {
            root_0 = (Object)adaptor.nil();

            ID85=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_method1163); 
            ID85_tree = (Object)adaptor.create(ID85);
            adaptor.addChild(root_0, ID85_tree);


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

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set88=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression86 = null;

        lhs_return lhs87 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression89 = null;


        Object set88_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=HEREDOC_STRING && LA37_0<=FLOAT)||LA37_0==SYMBOL||(LA37_0>=IF_MODIFIER && LA37_0<=UNLESS_MODIFIER)||(LA37_0>=BNOT && LA37_0<=REGEX)||(LA37_0>=SINGLE_QUOTE_STRING && LA37_0<=DOUBLE_QUOTE_STRING)||LA37_0==LCURLY||LA37_0==112||(LA37_0>=114 && LA37_0<=116)||(LA37_0>=126 && LA37_0<=128)) ) {
                alt37=1;
            }
            else if ( (LA37_0==ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("404:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1176);
                    ternaryIfThenElseExpression86=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression86.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1190);
                    lhs87=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs87.getTree());
                    set88=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set88), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1192);    throw mse;
                    }

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1236);
                    ternaryIfThenElseExpression89=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression89.getTree());
                    addVariable(input.toString(lhs87.start,lhs87.stop));

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:1: ternaryIfThenElseExpression : rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION91=null;
        Token char_literal93=null;
        rangeExpression_return rangeExpression90 = null;

        rangeExpression_return rangeExpression92 = null;

        rangeExpression_return rangeExpression94 = null;


        Object QUESTION91_tree=null;
        Object char_literal93_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:5: ( rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:5: rangeExpression ( | QUESTION rangeExpression ':' rangeExpression )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1248);
            rangeExpression90=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, rangeExpression90.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:21: ( | QUESTION rangeExpression ':' rangeExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==EOF||(LA38_0>=IF_MODIFIER && LA38_0<=LINE_BREAK)||LA38_0==RCURLY||LA38_0==ASSOC||LA38_0==RPAREN||(LA38_0>=COMMA && LA38_0<=COLON)||LA38_0==113||(LA38_0>=117 && LA38_0<=119)||(LA38_0>=123 && LA38_0<=124)) ) {
                alt38=1;
            }
            else if ( (LA38_0==QUESTION) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("410:21: ( | QUESTION rangeExpression ':' rangeExpression )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:23: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:26: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION91=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1255); 
                    QUESTION91_tree = (Object)adaptor.create(QUESTION91);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION91_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1258);
                    rangeExpression92=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression92.getTree());
                    char_literal93=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1260); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1263);
                    rangeExpression94=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression94.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE96=null;
        Token LINE_BREAK97=null;
        Token EXCLUSIVE_RANGE98=null;
        Token LINE_BREAK99=null;
        logicalOrExpression_return logicalOrExpression95 = null;

        logicalOrExpression_return logicalOrExpression100 = null;


        Object INCLUSIVE_RANGE96_tree=null;
        Object LINE_BREAK97_tree=null;
        Object EXCLUSIVE_RANGE98_tree=null;
        Object LINE_BREAK99_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1278);
            logicalOrExpression95=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression95.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=INCLUSIVE_RANGE && LA42_0<=EXCLUSIVE_RANGE)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==INCLUSIVE_RANGE) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==EXCLUSIVE_RANGE) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("417:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE96=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1297); 
            	            INCLUSIVE_RANGE96_tree = (Object)adaptor.create(INCLUSIVE_RANGE96);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE96_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:24: ( LINE_BREAK )*
            	            loop39:
            	            do {
            	                int alt39=2;
            	                int LA39_0 = input.LA(1);

            	                if ( (LA39_0==LINE_BREAK) ) {
            	                    alt39=1;
            	                }


            	                switch (alt39) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK97=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1301); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop39;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE98=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1312); 
            	            EXCLUSIVE_RANGE98_tree = (Object)adaptor.create(EXCLUSIVE_RANGE98);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE98_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:24: ( LINE_BREAK )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==LINE_BREAK) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK99=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1316); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop40;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1331);
            	    logicalOrExpression100=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression100.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:425:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR102=null;
        Token LINE_BREAK103=null;
        logicalAndExpression_return logicalAndExpression101 = null;

        logicalAndExpression_return logicalAndExpression104 = null;


        Object LOGICAL_OR102_tree=null;
        Object LINE_BREAK103_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1351);
            logicalAndExpression101=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression101.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LOGICAL_OR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR102=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1383); 
            	    LOGICAL_OR102_tree = (Object)adaptor.create(LOGICAL_OR102);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR102_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:18: ( LINE_BREAK )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==LINE_BREAK) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK103=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1388); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1397);
            	    logicalAndExpression104=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression104.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND106=null;
        Token LINE_BREAK107=null;
        equalityExpression_return equalityExpression105 = null;

        equalityExpression_return equalityExpression108 = null;


        Object LOGICAL_AND106_tree=null;
        Object LINE_BREAK107_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1417);
            equalityExpression105=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression105.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:436:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==LOGICAL_AND) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND106=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1449); 
            	    LOGICAL_AND106_tree = (Object)adaptor.create(LOGICAL_AND106);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND106_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:19: ( LINE_BREAK )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==LINE_BREAK) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:437:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK107=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1454); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1463);
            	    equalityExpression108=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE110=null;
        Token LINE_BREAK111=null;
        Token EQUAL112=null;
        Token LINE_BREAK113=null;
        Token CASE_EQUAL114=null;
        Token LINE_BREAK115=null;
        Token NOT_EQUAL116=null;
        Token LINE_BREAK117=null;
        Token MATCH118=null;
        Token LINE_BREAK119=null;
        Token NOT_MATCH120=null;
        Token LINE_BREAK121=null;
        relationalExpression_return relationalExpression109 = null;

        relationalExpression_return relationalExpression122 = null;


        Object COMPARE110_tree=null;
        Object LINE_BREAK111_tree=null;
        Object EQUAL112_tree=null;
        Object LINE_BREAK113_tree=null;
        Object CASE_EQUAL114_tree=null;
        Object LINE_BREAK115_tree=null;
        Object NOT_EQUAL116_tree=null;
        Object LINE_BREAK117_tree=null;
        Object MATCH118_tree=null;
        Object LINE_BREAK119_tree=null;
        Object NOT_MATCH120_tree=null;
        Object LINE_BREAK121_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1483);
            relationalExpression109=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression109.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=COMPARE && LA54_0<=MATCH)||(LA54_0>=NOT_EQUAL && LA54_0<=NOT_MATCH)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt53=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt53=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt53=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt53=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt53=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt53=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt53=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("446:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 53, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt53) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE110=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1517); 
            	            COMPARE110_tree = (Object)adaptor.create(COMPARE110);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE110_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:17: ( LINE_BREAK )*
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==LINE_BREAK) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:446:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK111=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1522); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop47;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL112=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1533); 
            	            EQUAL112_tree = (Object)adaptor.create(EQUAL112);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL112_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:16: ( LINE_BREAK )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==LINE_BREAK) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:447:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK113=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1539); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL114=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1550); 
            	            CASE_EQUAL114_tree = (Object)adaptor.create(CASE_EQUAL114);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL114_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:19: ( LINE_BREAK )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==LINE_BREAK) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK115=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1554); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL116=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1565); 
            	            NOT_EQUAL116_tree = (Object)adaptor.create(NOT_EQUAL116);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL116_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:19: ( LINE_BREAK )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==LINE_BREAK) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK117=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1570); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH118=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1581); 
            	            MATCH118_tree = (Object)adaptor.create(MATCH118);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH118_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:16: ( LINE_BREAK )*
            	            loop51:
            	            do {
            	                int alt51=2;
            	                int LA51_0 = input.LA(1);

            	                if ( (LA51_0==LINE_BREAK) ) {
            	                    alt51=1;
            	                }


            	                switch (alt51) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK119=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1587); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop51;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH120=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1598); 
            	            NOT_MATCH120_tree = (Object)adaptor.create(NOT_MATCH120);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH120_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:19: ( LINE_BREAK )*
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==LINE_BREAK) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK121=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1603); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop52;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1618);
            	    relationalExpression122=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression122.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:459:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN124=null;
        Token LINE_BREAK125=null;
        Token GREATER_THAN126=null;
        Token LINE_BREAK127=null;
        Token LESS_OR_EQUAL128=null;
        Token LINE_BREAK129=null;
        Token GREATER_OR_EQUAL130=null;
        Token LINE_BREAK131=null;
        orExpression_return orExpression123 = null;

        orExpression_return orExpression132 = null;


        Object LESS_THAN124_tree=null;
        Object LINE_BREAK125_tree=null;
        Object GREATER_THAN126_tree=null;
        Object LINE_BREAK127_tree=null;
        Object LESS_OR_EQUAL128_tree=null;
        Object LINE_BREAK129_tree=null;
        Object GREATER_OR_EQUAL130_tree=null;
        Object LINE_BREAK131_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1639);
            orExpression123=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression123.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=GREATER_THAN && LA60_0<=LESS_OR_EQUAL)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt59=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt59=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("462:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 59, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt59) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN124=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1673); 
            	            LESS_THAN124_tree = (Object)adaptor.create(LESS_THAN124);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN124_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:20: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1679); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN126=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1690); 
            	            GREATER_THAN126_tree = (Object)adaptor.create(GREATER_THAN126);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN126_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:22: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK127=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1695); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL128=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1706); 
            	            LESS_OR_EQUAL128_tree = (Object)adaptor.create(LESS_OR_EQUAL128);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL128_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:23: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);

            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }


            	                switch (alt57) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK129=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1711); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL130=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1722); 
            	            GREATER_OR_EQUAL130_tree = (Object)adaptor.create(GREATER_OR_EQUAL130);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL130_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:25: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);

            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }


            	                switch (alt58) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK131=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1726); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1741);
            	    orExpression132=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression132.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR134=null;
        Token LINE_BREAK135=null;
        Token BOR136=null;
        Token LINE_BREAK137=null;
        andExpression_return andExpression133 = null;

        andExpression_return andExpression138 = null;


        Object BXOR134_tree=null;
        Object LINE_BREAK135_tree=null;
        Object BOR136_tree=null;
        Object LINE_BREAK137_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1761);
            andExpression133=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression133.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=BXOR && LA64_0<=BOR)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==BXOR) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==BOR) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("475:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR134=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1795); 
            	            BXOR134_tree = (Object)adaptor.create(BXOR134);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR134_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:15: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);

            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }


            	                switch (alt61) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK135=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1801); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR136=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1812); 
            	            BOR136_tree = (Object)adaptor.create(BOR136);
            	            root_0 = (Object)adaptor.becomeRoot(BOR136_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:14: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1818); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1833);
            	    andExpression138=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression138.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND140=null;
        Token LINE_BREAK141=null;
        shiftExpression_return shiftExpression139 = null;

        shiftExpression_return shiftExpression142 = null;


        Object BAND140_tree=null;
        Object LINE_BREAK141_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1853);
            shiftExpression139=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression139.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:485:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==BAND) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND140=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1885); 
            	    BAND140_tree = (Object)adaptor.create(BAND140);
            	    root_0 = (Object)adaptor.becomeRoot(BAND140_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:13: ( LINE_BREAK )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==LINE_BREAK) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK141=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1891); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1900);
            	    shiftExpression142=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression142.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:494:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT144=null;
        Token LINE_BREAK145=null;
        Token RIGHT_SHIFT146=null;
        Token LINE_BREAK147=null;
        additiveExpression_return additiveExpression143 = null;

        additiveExpression_return additiveExpression148 = null;


        Object LEFT_SHIFT144_tree=null;
        Object LINE_BREAK145_tree=null;
        Object RIGHT_SHIFT146_tree=null;
        Object LINE_BREAK147_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1922);
            additiveExpression143=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression143.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==LEFT_SHIFT||LA70_0==RIGHT_SHIFT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==LEFT_SHIFT) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==RIGHT_SHIFT) ) {
            	        alt69=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("497:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 69, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT144=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression1956); 
            	            LEFT_SHIFT144_tree = (Object)adaptor.create(LEFT_SHIFT144);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT144_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:20: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);

            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }


            	                switch (alt67) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK145=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1961); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT146=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression1972); 
            	            RIGHT_SHIFT146_tree = (Object)adaptor.create(RIGHT_SHIFT146);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT146_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:20: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);

            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }


            	                switch (alt68) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1976); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1991);
            	    additiveExpression148=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression148.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS150=null;
        Token LINE_BREAK151=null;
        Token MINUS152=null;
        Token LINE_BREAK153=null;
        multiplicativeExpression_return multiplicativeExpression149 = null;

        multiplicativeExpression_return multiplicativeExpression154 = null;


        Object PLUS150_tree=null;
        Object LINE_BREAK151_tree=null;
        Object MINUS152_tree=null;
        Object LINE_BREAK153_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2013);
            multiplicativeExpression149=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression149.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=PLUS && LA74_0<=MINUS)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==PLUS) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==MINUS) ) {
            	        alt73=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("510:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS150=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2047); 
            	            PLUS150_tree = (Object)adaptor.create(PLUS150);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS150_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:16: ( LINE_BREAK )*
            	            loop71:
            	            do {
            	                int alt71=2;
            	                int LA71_0 = input.LA(1);

            	                if ( (LA71_0==LINE_BREAK) ) {
            	                    alt71=1;
            	                }


            	                switch (alt71) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK151=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2054); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop71;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS152=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2065); 
            	            MINUS152_tree = (Object)adaptor.create(MINUS152);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS152_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:17: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK153=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2072); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2087);
            	    multiplicativeExpression154=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression154.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:518:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR156=null;
        Token LINE_BREAK157=null;
        Token DIV158=null;
        Token LINE_BREAK159=null;
        Token MOD160=null;
        Token LINE_BREAK161=null;
        powerExpression_return powerExpression155 = null;

        powerExpression_return powerExpression162 = null;


        Object STAR156_tree=null;
        Object LINE_BREAK157_tree=null;
        Object DIV158_tree=null;
        Object LINE_BREAK159_tree=null;
        Object MOD160_tree=null;
        Object LINE_BREAK161_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2107);
            powerExpression155=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression155.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:520:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=DIV && LA79_0<=MOD)||LA79_0==STAR) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt78=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt78=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt78=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt78=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("521:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 78, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt78) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR156=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2141); 
            	            STAR156_tree = (Object)adaptor.create(STAR156);
            	            root_0 = (Object)adaptor.becomeRoot(STAR156_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:15: ( LINE_BREAK )*
            	            loop75:
            	            do {
            	                int alt75=2;
            	                int LA75_0 = input.LA(1);

            	                if ( (LA75_0==LINE_BREAK) ) {
            	                    alt75=1;
            	                }


            	                switch (alt75) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2147); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop75;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV158=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2158); 
            	            DIV158_tree = (Object)adaptor.create(DIV158);
            	            root_0 = (Object)adaptor.becomeRoot(DIV158_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:14: ( LINE_BREAK )*
            	            loop76:
            	            do {
            	                int alt76=2;
            	                int LA76_0 = input.LA(1);

            	                if ( (LA76_0==LINE_BREAK) ) {
            	                    alt76=1;
            	                }


            	                switch (alt76) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK159=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2164); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop76;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD160=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2175); 
            	            MOD160_tree = (Object)adaptor.create(MOD160);
            	            root_0 = (Object)adaptor.becomeRoot(MOD160_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:14: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);

            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }


            	                switch (alt77) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2181); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2196);
            	    powerExpression162=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression162.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER164=null;
        Token LINE_BREAK165=null;
        bnotExpression_return bnotExpression163 = null;

        bnotExpression_return bnotExpression166 = null;


        Object POWER164_tree=null;
        Object LINE_BREAK165_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2217);
            bnotExpression163=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression163.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==POWER) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER164=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2252); 
            	    POWER164_tree = (Object)adaptor.create(POWER164);
            	    root_0 = (Object)adaptor.becomeRoot(POWER164_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:14: ( LINE_BREAK )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==LINE_BREAK) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK165=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2258); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2267);
            	    bnotExpression166=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression166.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT167=null;
        Token LINE_BREAK168=null;
        Token NOT169=null;
        Token LINE_BREAK170=null;
        command_return command171 = null;


        Object BNOT167_tree=null;
        Object LINE_BREAK168_tree=null;
        Object NOT169_tree=null;
        Object LINE_BREAK170_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop84:
            do {
                int alt84=3;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==BNOT) ) {
                    alt84=1;
                }
                else if ( (LA84_0==NOT) ) {
                    alt84=2;
                }


                switch (alt84) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT167=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2289); 
            	    BNOT167_tree = (Object)adaptor.create(BNOT167);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT167_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:15: ( LINE_BREAK )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==LINE_BREAK) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK168=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2295); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop82;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT169=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2305); 
            	    NOT169_tree = (Object)adaptor.create(NOT169);
            	    root_0 = (Object)adaptor.becomeRoot(NOT169_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:13: ( LINE_BREAK )*
            	    loop83:
            	    do {
            	        int alt83=2;
            	        int LA83_0 = input.LA(1);

            	        if ( (LA83_0==LINE_BREAK) ) {
            	            alt83=1;
            	        }


            	        switch (alt83) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:542:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK170=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2311); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop83;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2325);
            command171=command();
            _fsp--;

            adaptor.addChild(root_0, command171.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression ) ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        literal_return literal175 = null;

        boolean_expression_return boolean_expression176 = null;

        block_expression_return block_expression177 = null;

        if_expression_return if_expression178 = null;

        unless_expression_return unless_expression179 = null;


        Object string_literal172_tree=null;
        Object string_literal173_tree=null;
        Object string_literal174_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:3: ( ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression )
            int alt85=8;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt85=1;
                }
                break;
            case 127:
                {
                alt85=2;
                }
                break;
            case 128:
                {
                alt85=3;
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
                alt85=4;
                }
                break;
            case 114:
            case 115:
            case 116:
                {
                alt85=5;
                }
                break;
            case 112:
                {
                alt85=6;
                }
                break;
            case IF_MODIFIER:
                {
                alt85=7;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt85=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("548:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression )", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:4: 'expression0'
                    {
                    string_literal172=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_command2340); 
                    string_literal172_tree = (Object)adaptor.create(string_literal172);
                    adaptor.addChild(root_0, string_literal172_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:20: 'expression1'
                    {
                    string_literal173=(Token)input.LT(1);
                    match(input,127,FOLLOW_127_in_command2344); 
                    string_literal173_tree = (Object)adaptor.create(string_literal173);
                    adaptor.addChild(root_0, string_literal173_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:36: 'expression2'
                    {
                    string_literal174=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_command2348); 
                    string_literal174_tree = (Object)adaptor.create(string_literal174);
                    adaptor.addChild(root_0, string_literal174_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:50: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2350);
                    literal175=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal175.getTree());

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:58: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2352);
                    boolean_expression176=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression176.getTree());

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:78: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2355);
                    block_expression177=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression177.getTree());

                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:95: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2357);
                    if_expression178=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression178.getTree());

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:109: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2359);
                    unless_expression179=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression179.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

            tokenStream.addVirtualToken(((Token)retval.stop).getTokenIndex(), VirtualToken.EXPR_END);
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command

    public static class lhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID180=null;

        Object ID180_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:7: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:7: ID
            {
            root_0 = (Object)adaptor.nil();

            ID180=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2372); 
            ID180_tree = (Object)adaptor.create(ID180);
            adaptor.addChild(root_0, ID180_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression181 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:552:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2379);
            expression181=expression();
            _fsp--;

            adaptor.addChild(root_0, expression181.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:1: literal : ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT182=null;
        Token FLOAT183=null;
        Token ARRAY185=null;
        Token SYMBOL187=null;
        Token REGEX188=null;
        string_return string184 = null;

        hash_return hash186 = null;


        Object INT182_tree=null;
        Object FLOAT183_tree=null;
        Object ARRAY185_tree=null;
        Object SYMBOL187_tree=null;
        Object REGEX188_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:11: ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX )
            int alt86=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt86=1;
                }
                break;
            case FLOAT:
                {
                alt86=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt86=3;
                }
                break;
            case ARRAY:
                {
                alt86=4;
                }
                break;
            case LCURLY:
                {
                alt86=5;
                }
                break;
            case SYMBOL:
                {
                alt86=6;
                }
                break;
            case REGEX:
                {
                alt86=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("556:1: literal : ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX );", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT182=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2389); 
                    INT182_tree = (Object)adaptor.create(INT182);
                    adaptor.addChild(root_0, INT182_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT183=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2391); 
                    FLOAT183_tree = (Object)adaptor.create(FLOAT183);
                    adaptor.addChild(root_0, FLOAT183_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2393);
                    string184=string();
                    _fsp--;

                    adaptor.addChild(root_0, string184.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY185=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2395); 
                    ARRAY185_tree = (Object)adaptor.create(ARRAY185);
                    adaptor.addChild(root_0, ARRAY185_tree);


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:34: hash
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hash_in_literal2397);
                    hash186=hash();
                    _fsp--;

                    adaptor.addChild(root_0, hash186.getTree());

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:39: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL187=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2399); 
                    SYMBOL187_tree = (Object)adaptor.create(SYMBOL187);
                    adaptor.addChild(root_0, SYMBOL187_tree);


                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:46: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX188=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2401); 
                    REGEX188_tree = (Object)adaptor.create(REGEX188);
                    adaptor.addChild(root_0, REGEX188_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set189=null;

        Object set189_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set189=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set189));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:680:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal190=null;
        Token char_literal192=null;
        assoc_list_return assoc_list191 = null;


        Object char_literal190_tree=null;
        Object char_literal192_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:680:8: ( '{' assoc_list '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:680:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal190=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3201); 
            char_literal190_tree = (Object)adaptor.create(char_literal190);
            root_0 = (Object)adaptor.becomeRoot(char_literal190_tree, root_0);

            pushFollow(FOLLOW_assoc_list_in_hash3204);
            assoc_list191=assoc_list();
            _fsp--;

            adaptor.addChild(root_0, assoc_list191.getTree());
            char_literal192=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3206); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:681:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assocs_return assocs193 = null;

        trailer_return trailer194 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:4: ( assocs trailer )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:682:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list3215);
            assocs193=assocs();
            _fsp--;

            adaptor.addChild(root_0, assocs193.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3217);
            trailer194=trailer();
            _fsp--;

            adaptor.addChild(root_0, trailer194.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:683:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal196=null;
        assoc_return assoc195 = null;

        assoc_return assoc197 = null;


        Object char_literal196_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:683:10: ( assoc ( ',' assoc )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:683:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs3226);
            assoc195=assoc();
            _fsp--;

            adaptor.addChild(root_0, assoc195.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:683:16: ( ',' assoc )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    int LA87_2 = input.LA(2);

                    if ( ((LA87_2>=HEREDOC_STRING && LA87_2<=FLOAT)||LA87_2==SYMBOL||(LA87_2>=IF_MODIFIER && LA87_2<=UNLESS_MODIFIER)||LA87_2==ID||(LA87_2>=BNOT && LA87_2<=REGEX)||(LA87_2>=SINGLE_QUOTE_STRING && LA87_2<=DOUBLE_QUOTE_STRING)||LA87_2==LCURLY||LA87_2==112||(LA87_2>=114 && LA87_2<=116)||(LA87_2>=126 && LA87_2<=128)) ) {
                        alt87=1;
                    }


                }


                switch (alt87) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:683:18: ',' assoc
            	    {
            	    char_literal196=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3230); 
            	    pushFollow(FOLLOW_assoc_in_assocs3233);
            	    assoc197=assoc();
            	    _fsp--;

            	    adaptor.addChild(root_0, assoc197.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:1: assoc : arg_value ( ASSOC | ',' ) arg_value ;
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set199=null;
        arg_value_return arg_value198 = null;

        arg_value_return arg_value200 = null;


        Object set199_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:17: ( arg_value ( ASSOC | ',' ) arg_value )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:17: arg_value ( ASSOC | ',' ) arg_value
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_value_in_assoc3251);
            arg_value198=arg_value();
            _fsp--;

            adaptor.addChild(root_0, arg_value198.getTree());
            set199=(Token)input.LT(1);
            if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3253);    throw mse;
            }

            pushFollow(FOLLOW_arg_value_in_assoc3260);
            arg_value200=arg_value();
            _fsp--;

            adaptor.addChild(root_0, arg_value200.getTree());

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

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start args
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:687:1: args : arg_value ( ',' arg_value )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal202=null;
        arg_value_return arg_value201 = null;

        arg_value_return arg_value203 = null;


        Object char_literal202_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:687:8: ( arg_value ( ',' arg_value )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:687:8: arg_value ( ',' arg_value )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_value_in_args3268);
            arg_value201=arg_value();
            _fsp--;

            adaptor.addChild(root_0, arg_value201.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:687:18: ( ',' arg_value )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:687:19: ',' arg_value
            	    {
            	    char_literal202=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args3271); 
            	    pushFollow(FOLLOW_arg_value_in_args3274);
            	    arg_value203=arg_value();
            	    _fsp--;

            	    adaptor.addChild(root_0, arg_value203.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
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

    public static class arg_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arg_value
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:689:1: arg_value : arg ;
    public final arg_value_return arg_value() throws RecognitionException {
        arg_value_return retval = new arg_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        arg_return arg204 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:4: ( arg )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:4: arg
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_arg_value3285);
            arg204=arg();
            _fsp--;

            adaptor.addChild(root_0, arg204.getTree());

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
    // $ANTLR end arg_value

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arg
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:692:1: arg : assignmentExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return assignmentExpression205 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:692:7: ( assignmentExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:692:7: assignmentExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_arg3294);
            assignmentExpression205=assignmentExpression();
            _fsp--;

            adaptor.addChild(root_0, assignmentExpression205.getTree());

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

    public static class trailer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start trailer
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK206=null;
        Token char_literal207=null;

        Object LINE_BREAK206_tree=null;
        Object char_literal207_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:29: ( | LINE_BREAK | ',' )
            int alt89=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt89=1;
                }
                break;
            case LINE_BREAK:
                {
                alt89=2;
                }
                break;
            case COMMA:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("694:1: trailer : ( | LINE_BREAK | ',' );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:29: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK206=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer3313); 
                    LINE_BREAK206_tree = (Object)adaptor.create(LINE_BREAK206);
                    adaptor.addChild(root_0, LINE_BREAK206_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:44: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal207=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer3317); 
                    char_literal207_tree = (Object)adaptor.create(char_literal207);
                    adaptor.addChild(root_0, char_literal207_tree);


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
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\42\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\166\2\u0080\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\115\uffff\1\3\3\uffff\2\3",
            "\2\4\3\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\5\4\14\uffff\2\4\2\uffff\1\4\17\uffff\1\4\1\3\3\4\2\3"+
            "\1\uffff\2\4\3\uffff\4\4",
            "\2\4\3\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\5\4\14\uffff\2\4\2\uffff\1\4\17\uffff\1\4\1\3\3\4\2\3"+
            "\1\uffff\2\4\3\uffff\4\4",
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
            return "()* loopback of 262:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\43\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\167\1\u0080\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\110\uffff\1\2\12\uffff\1\3",
            "\2\4\3\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\1\uffff\1\4\45"+
            "\uffff\5\4\14\uffff\2\4\2\uffff\1\4\17\uffff\7\4\1\3\2\4\3\uffff"+
            "\4\4",
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
            return "304:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program217 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_statement_list_in_program221 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_program223 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_statement_in_statement_list237 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list240 = new BitSet(new long[]{0x0000002C60023000L,0xE31D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_statement_list243 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_expression_in_statement269 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement272 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_set_in_modifier_line312 = new BitSet(new long[]{0x0000002860023000L,0xE31D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_break_in_modifier_line326 = new BitSet(new long[]{0x0000002860023000L,0xE31D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_modifier_line330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_block_expression405 = new BitSet(new long[]{0x0000002460023000L,0xE31F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_block_expression407 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_block_expression409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body416 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_statement_list_in_body420 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_body422 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression445 = new BitSet(new long[]{0x0000002060023000L,0xE31D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_if_expression450 = new BitSet(new long[]{0x0000000800000000L,0x0080100000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression452 = new BitSet(new long[]{0x0000002460023000L,0xE37F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_if_expression465 = new BitSet(new long[]{0x0000000000000000L,0x0062000000000000L});
    public static final BitSet FOLLOW_117_in_if_expression468 = new BitSet(new long[]{0x0000002060023000L,0xE31D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_if_expression472 = new BitSet(new long[]{0x0000000800000000L,0x0080100000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression474 = new BitSet(new long[]{0x0000002460023000L,0xE37F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_if_expression478 = new BitSet(new long[]{0x0000000000000000L,0x0062000000000000L});
    public static final BitSet FOLLOW_118_in_if_expression492 = new BitSet(new long[]{0x0000002460023000L,0xE31F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_if_expression496 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_expression509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator561 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_COLON_in_seperator564 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator566 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator571 = new BitSet(new long[]{0x0000000800000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_seperator574 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator576 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression586 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression588 = new BitSet(new long[]{0x0000000800000000L,0x0080100000000000L});
    public static final BitSet FOLLOW_119_in_unless_expression591 = new BitSet(new long[]{0x0000002460023000L,0xE35F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_COLON_in_unless_expression593 = new BitSet(new long[]{0x0000002460023000L,0xE35F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_break_in_unless_expression595 = new BitSet(new long[]{0x0000002460023000L,0xE35F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_unless_expression607 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_118_in_unless_expression620 = new BitSet(new long[]{0x0000002460023000L,0xE31F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_unless_expression622 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_unless_expression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_expression699 = new BitSet(new long[]{0x0007FFE01800C800L,0x0400040000000F00L});
    public static final BitSet FOLLOW_fitem_in_expression702 = new BitSet(new long[]{0x0007FFE01800C800L,0x0400040000000F00L});
    public static final BitSet FOLLOW_fitem_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_methodDefinition724 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition728 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition733 = new BitSet(new long[]{0x0000002C00000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_methodDefinationArgument_in_methodDefinition737 = new BitSet(new long[]{0x0000002060023000L,0xE31F00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition740 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_methodDefinition744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodName757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodDefinationArgument767 = new BitSet(new long[]{0x0000002000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument771 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_methodDefinationArgument775 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_methodDefinationArgument779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument794 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinationArgument798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalMethodDefinationArgument_in_methodDefinationArgumentWithoutParen807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_normalMethodDefinationArgument823 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_normalMethodDefinationArgument827 = new BitSet(new long[]{0x0000002060023000L,0xE31D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_normalMethodDefinationArgument829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1042 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_andorExpression1052 = new BitSet(new long[]{0x0000002860023000L,0xE01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1057 = new BitSet(new long[]{0x0000002860023000L,0xE01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_124_in_andorExpression1068 = new BitSet(new long[]{0x0000002860023000L,0xE01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1073 = new BitSet(new long[]{0x0000002860023000L,0xE01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1088 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_125_in_notExpression1106 = new BitSet(new long[]{0x0000002860023000L,0xE01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1113 = new BitSet(new long[]{0x0000002860023000L,0xE01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodExpression_in_definedExpression1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_methodExpression1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1190 = new BitSet(new long[]{0xFFF8000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_assignmentExpression1192 = new BitSet(new long[]{0x0000000060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1255 = new BitSet(new long[]{0x0000000060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1258 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1260 = new BitSet(new long[]{0x0000000060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1278 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1297 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1301 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1312 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1316 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1331 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1383 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1388 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1449 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1454 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1483 = new BitSet(new long[]{0x000003C000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1517 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1522 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1533 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1539 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1550 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1554 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1565 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1570 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1581 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1587 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1598 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1603 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1618 = new BitSet(new long[]{0x000003C000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1639 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1673 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1679 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1690 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1695 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1706 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1711 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1722 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1726 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1741 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1761 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1795 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1801 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_BOR_in_orExpression1812 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1818 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_BAND_in_andExpression1885 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1891 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1922 = new BitSet(new long[]{0x0000400000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression1956 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1961 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression1972 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1976 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1991 = new BitSet(new long[]{0x0000400000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2013 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2047 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2054 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2065 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2072 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2087 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2107 = new BitSet(new long[]{0x0002000018000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2141 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2147 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2158 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2164 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2175 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2181 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2196 = new BitSet(new long[]{0x0002000018000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2217 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2252 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2258 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2267 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2289 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2295 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2305 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2311 = new BitSet(new long[]{0x0000000860023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_command_in_bnotExpression2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_command2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_command2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_command2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_literal2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3201 = new BitSet(new long[]{0x0000002060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_assoc_list_in_hash3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3215 = new BitSet(new long[]{0x0000000800000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3226 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3230 = new BitSet(new long[]{0x0000002060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_assoc_in_assocs3233 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_arg_value_in_assoc3251 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_set_in_assoc3253 = new BitSet(new long[]{0x0000002060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_arg_value_in_assoc3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_value_in_args3268 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_args3271 = new BitSet(new long[]{0x0000002060023000L,0xC01D00013000F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_arg_value_in_args3274 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_arg_in_arg_value3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arg3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer3317 = new BitSet(new long[]{0x0000000000000002L});

}