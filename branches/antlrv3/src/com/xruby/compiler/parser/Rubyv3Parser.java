// $ANTLR 3.0 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-06-16 18:22:47

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'"
    };
    public static final int COMMA=114;
    public static final int GREATER_THAN=45;
    public static final int LOGICAL_AND_ASSIGN=65;
    public static final int INSTANCE_VARIABLE=90;
    public static final int MINUS=51;
    public static final int ESCAPE_INT=97;
    public static final int ARRAY=81;
    public static final int HEX_PART=93;
    public static final int LOGICAL_OR=71;
    public static final int LESS_THAN=47;
    public static final int META_PART=95;
    public static final int LEADING0_NUMBER=88;
    public static final int BOR=76;
    public static final int LEADING_MARK_DECIMAL=86;
    public static final int BINARY=85;
    public static final int DOT=38;
    public static final int COLON2=39;
    public static final int EMPTY_ARRAY=113;
    public static final int LCURLY=103;
    public static final int LINE_BREAK=36;
    public static final int CONSTANT=14;
    public static final int LEFT_SHIFT=11;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=89;
    public static final int IF_MODIFIER=30;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int ESCAPE_INT_PART=96;
    public static final int REGEX=82;
    public static final int SYMBOL=18;
    public static final int RPAREN=110;
    public static final int CONTROL_PART=94;
    public static final int DOUBLE_QUOTE_STRING=100;
    public static final int STAR_ASSIGN=64;
    public static final int PLUS=50;
    public static final int HEREDOC_INDENT_BEGIN=106;
    public static final int BODY=9;
    public static final int CASE_EQUAL=43;
    public static final int UNLESS_MODIFIER=31;
    public static final int MINUS_ASSIGN=58;
    public static final int GREATER_OR_EQUAL=46;
    public static final int EXCLUSIVE_RANGE=70;
    public static final int POWER_ASSIGN=67;
    public static final int MOD_ASSIGN=55;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int WS=37;
    public static final int STRING=27;
    public static final int DOUBLE_STRING_CHAR=102;
    public static final int RIGHT_SHIFT_ASSIGN=63;
    public static final int GLOBAL_VARIABLE=92;
    public static final int NON_LEADING0_NUMBER=98;
    public static final int SINGLE_QUOTE_STRING=99;
    public static final int HEREDOC_BEGIN=105;
    public static final int CLASS_VARIABLE=91;
    public static final int LBRACK=111;
    public static final int SEMI=35;
    public static final int DIV_ASSIGN=57;
    public static final int MRHS=24;
    public static final int BLOCK_ARG=22;
    public static final int EQUAL=42;
    public static final int LOGICAL_AND=72;
    public static final int COLON=115;
    public static final int DIV=28;
    public static final int HEX=84;
    public static final int SINGLETON_METHOD=26;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=69;
    public static final int BNOT=78;
    public static final int LOGICAL_OR_ASSIGN=66;
    public static final int ASSOC=107;
    public static final int FLOAT=13;
    public static final int OCTAL=83;
    public static final int MOD=29;
    public static final int PLUS_ASSIGN=59;
    public static final int QUESTION=68;
    public static final int UNTIL_MODIFIER=33;
    public static final int BLOCK=19;
    public static final int RCURLY=104;
    public static final int INT=80;
    public static final int BOR_ASSIGN=60;
    public static final int ASSIGN=54;
    public static final int LESS_OR_EQUAL=48;
    public static final int LPAREN=109;
    public static final int BAND=77;
    public static final int HEREDOC_STRING=12;
    public static final int NOT_MATCH=74;
    public static final int ID=40;
    public static final int NOT_EQUAL=73;
    public static final int BAND_ASSIGN=61;
    public static final int COMPLEMENT_ASSIGN=56;
    public static final int RIGHT_SHIFT=49;
    public static final int POWER=53;
    public static final int BXOR_ASSIGN=108;
    public static final int FID=15;
    public static final int NESTED_LHS=25;
    public static final int COMMENT=117;
    public static final int LEFT_SHIFT_ASSIGN=62;
    public static final int MATCH=44;
    public static final int WHILE_MODIFIER=32;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=116;
    public static final int EXP_PART=87;
    public static final int COMPARE=41;
    public static final int IF=7;
    public static final int ARG=10;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int EOF=-1;
    public static final int VARIABLE=16;
    public static final int CALL=17;
    public static final int RBRACK=112;
    public static final int RESCUE_MODIFIER=34;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=52;
    public static final int BXOR=75;
    public static final int NOT=79;
    public static final int SINGLE_STRING_CHAR=101;

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
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==118||(LA3_0>=120 && LA3_0<=122)||(LA3_0>=126 && LA3_0<=127)||(LA3_0>=131 && LA3_0<=134)) ) {
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
            // elements: modifier_line, expression
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
            match(input,118,FOLLOW_118_in_block_expression411); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);

            pushFollow(FOLLOW_body_in_block_expression413);
            body13=body();
            _fsp--;

            adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,119,FOLLOW_119_in_block_expression415); 
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

            if ( (LA10_0==SEMI||LA10_0==119||(LA10_0>=123 && LA10_0<=124)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==118||(LA10_0>=120 && LA10_0<=122)||(LA10_0>=126 && LA10_0<=127)||(LA10_0>=131 && LA10_0<=134)) ) {
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
            if ( (input.LA(1)>=120 && input.LA(1)<=122) ) {
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
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
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

                if ( (LA11_0==123) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,123,FOLLOW_123_in_if_expression474); 
            	    stream_123.add(string_literal21);

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

            if ( (LA12_0==124) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_if_expression498); 
                    stream_124.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression502);
                    body2=body();
                    _fsp--;

                    stream_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,119,FOLLOW_119_in_if_expression515); 
            stream_119.add(string_literal24);


            // AST REWRITE
            // elements: body2, body1, body0, e0, e1
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
                    match(input,125,FOLLOW_125_in_seperator580); 
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
            case 125:
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
                    match(input,125,FOLLOW_125_in_unless_expression597); 
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

            if ( (LA19_0==124) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_unless_expression626); 
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
            match(input,119,FOLLOW_119_in_unless_expression641); 
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
            case 126:
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
            case 118:
            case 120:
            case 121:
            case 122:
            case 131:
            case 132:
            case 133:
            case 134:
                {
                alt21=2;
                }
                break;
            case 127:
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
                    match(input,126,FOLLOW_126_in_expression705); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,127,FOLLOW_127_in_methodDefinition730); 
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

                if ( ((LA23_1>=DOT && LA23_1<=COLON2)) ) {
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

                if ( (LA24_0==SEMI) ) {
                    alt24=1;
                }
                else if ( (LA24_0==LINE_BREAK) ) {
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

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||LA25_0==SYMBOL||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING && LA25_0<=DOUBLE_QUOTE_STRING)||LA25_0==118||(LA25_0>=120 && LA25_0<=122)||(LA25_0>=126 && LA25_0<=127)||(LA25_0>=131 && LA25_0<=134)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition759);
                    bodyStatement56=bodyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, bodyStatement56.getTree());

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition763);
            	    terminal57=terminal();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            string_literal58=(Token)input.LT(1);
            match(input,119,FOLLOW_119_in_methodDefinition768); 
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

        Token char_literal60=null;
        Token char_literal63=null;
        variable_return variable59 = null;

        expression_return expression61 = null;

        opt_nl_return opt_nl62 = null;


        Object char_literal60_tree=null;
        Object char_literal63_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:4: ( variable | '(' expression opt_nl ')' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==LPAREN) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("353:1: singleton : ( variable | '(' expression opt_nl ')' );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:4: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_singleton779);
                    variable59=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable59.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton781); 
                    pushFollow(FOLLOW_expression_in_singleton784);
                    expression61=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton786);
                    opt_nl62=opt_nl();
                    _fsp--;

                    adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton788); 

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

        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:28: ( | LINE_BREAK )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RPAREN) ) {
                alt28=1;
            }
            else if ( (LA28_0==LINE_BREAK) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("355:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
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

                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl807); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65=null;

        Object set65_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:4: ( DOT | COLON2 )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set65=(Token)input.LT(1);
            if ( (input.LA(1)>=DOT && input.LA(1)<=COLON2) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set65));
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

        Token set66=null;

        Object set66_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:4: ( ID | CONSTANT | FID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set66=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set66));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
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
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LINE_BREAK=new RewriteRuleTokenStream(adaptor,"token LINE_BREAK");
        RewriteRuleSubtreeStream stream_f_args=new RewriteRuleSubtreeStream(adaptor,"rule f_args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:4: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LPAREN) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=SEMI && LA30_0<=LINE_BREAK)||LA30_0==ID||LA30_0==STAR) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("361:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist845); 
                    stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist847);
                    f_args68=f_args();
                    _fsp--;

                    stream_f_args.add(f_args68.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist851); 
                    	    stream_LINE_BREAK.add(LINE_BREAK69);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist855); 
                    stream_RPAREN.add(char_literal70);


                    // AST REWRITE
                    // elements: f_args
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:34: -> ^( ARG f_args )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:37: ^( ARG f_args )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARG, "ARG"), root_1);

                        adaptor.addChild(root_1, stream_f_args.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_args_in_f_arglist874);
                    f_args71=f_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist876);
                    terminal72=terminal();
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | | f_rest_arg );
    public final f_args_return f_args() throws RecognitionException {
        f_args_return retval = new f_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        f_norm_args_return f_norm_args73 = null;

        f_norm_args_return f_norm_args74 = null;

        f_opt_args_return f_opt_args76 = null;

        f_rest_arg_return f_rest_arg77 = null;


        Object char_literal75_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:10: ( f_norm_args | f_norm_args ',' f_opt_args | | f_rest_arg )
            int alt31=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==COMMA) ) {
                    alt31=2;
                }
                else if ( ((LA31_1>=SEMI && LA31_1<=LINE_BREAK)||LA31_1==RPAREN) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("364:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | | f_rest_arg );", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case SEMI:
            case LINE_BREAK:
            case RPAREN:
                {
                alt31=3;
                }
                break;
            case STAR:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("364:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | | f_rest_arg );", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args884);
                    f_norm_args73=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args73.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:24: f_norm_args ',' f_opt_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args888);
                    f_norm_args74=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args890); 
                    char_literal75_tree = (Object)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);

                    pushFollow(FOLLOW_f_opt_args_in_f_args892);
                    f_opt_args76=f_opt_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_opt_args76.getTree());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_rest_arg_in_f_args900);
                    f_rest_arg77=f_rest_arg();
                    _fsp--;

                    adaptor.addChild(root_0, f_rest_arg77.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID78=null;

        Object ID78_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:371:2: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:371:2: ID
            {
            root_0 = (Object)adaptor.nil();

            ID78=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args922); 
            ID78_tree = (Object)adaptor.create(ID78);
            adaptor.addChild(root_0, ID78_tree);


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

    public static class f_rest_arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start f_rest_arg
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:1: f_rest_arg : '*' ID ;
    public final f_rest_arg_return f_rest_arg() throws RecognitionException {
        f_rest_arg_return retval = new f_rest_arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        Token ID80=null;

        Object char_literal79_tree=null;
        Object ID80_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:4: ( '*' ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:4: '*' ID
            {
            root_0 = (Object)adaptor.nil();

            char_literal79=(Token)input.LT(1);
            match(input,STAR,FOLLOW_STAR_in_f_rest_arg930); 
            char_literal79_tree = (Object)adaptor.create(char_literal79);
            root_0 = (Object)adaptor.becomeRoot(char_literal79_tree, root_0);

            ID80=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_rest_arg933); 
            ID80_tree = (Object)adaptor.create(ID80);
            adaptor.addChild(root_0, ID80_tree);


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
    // $ANTLR end f_rest_arg

    public static class f_opt_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start f_opt_args
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:1: f_opt_args : ;
    public final f_opt_args_return f_opt_args() throws RecognitionException {
        f_opt_args_return retval = new f_opt_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:4: ()
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:4: 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list81 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:4: ( statement_list -> ^( BODY statement_list ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement951);
            statement_list81=statement_list();
            _fsp--;

            stream_statement_list.add(statement_list81.getTree());

            // AST REWRITE
            // elements: statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 378:19: -> ^( BODY statement_list )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:22: ^( BODY statement_list )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname82 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:9: ( fname )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem969);
            fname82=fname();
            _fsp--;

            adaptor.addChild(root_0, fname82.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID83=null;
        Token CONSTANT84=null;
        Token FID85=null;
        op_return op86 = null;


        Object ID83_tree=null;
        Object CONSTANT84_tree=null;
        Object FID85_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:9: ( ID | CONSTANT | FID | op )
            int alt32=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt32=1;
                }
                break;
            case CONSTANT:
                {
                alt32=2;
                }
                break;
            case FID:
                {
                alt32=3;
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
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("382:1: fname : ( ID | CONSTANT | FID | op );", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID83=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname976); 
                    ID83_tree = (Object)adaptor.create(ID83);
                    adaptor.addChild(root_0, ID83_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT84=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname978); 
                    CONSTANT84_tree = (Object)adaptor.create(CONSTANT84);
                    adaptor.addChild(root_0, CONSTANT84_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID85=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname980); 
                    FID85_tree = (Object)adaptor.create(FID85);
                    adaptor.addChild(root_0, FID85_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname982);
                    op86=op();
                    _fsp--;

                    adaptor.addChild(root_0, op86.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;

        Object set87_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==128 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set87));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        Token LINE_BREAK90=null;
        Token string_literal91=null;
        Token LINE_BREAK92=null;
        notExpression_return notExpression88 = null;

        notExpression_return notExpression93 = null;


        Object string_literal89_tree=null;
        Object LINE_BREAK90_tree=null;
        Object string_literal91_tree=null;
        Object LINE_BREAK92_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1143);
            notExpression88=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression88.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=129 && LA36_0<=130)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==129) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==130) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("396:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal89=(Token)input.LT(1);
            	            match(input,129,FOLLOW_129_in_andorExpression1153); 
            	            string_literal89_tree = (Object)adaptor.create(string_literal89);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal89_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:15: ( LINE_BREAK )*
            	            loop33:
            	            do {
            	                int alt33=2;
            	                int LA33_0 = input.LA(1);

            	                if ( (LA33_0==LINE_BREAK) ) {
            	                    alt33=1;
            	                }


            	                switch (alt33) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK90=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1158); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop33;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal91=(Token)input.LT(1);
            	            match(input,130,FOLLOW_130_in_andorExpression1169); 
            	            string_literal91_tree = (Object)adaptor.create(string_literal91);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal91_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:14: ( LINE_BREAK )*
            	            loop34:
            	            do {
            	                int alt34=2;
            	                int LA34_0 = input.LA(1);

            	                if ( (LA34_0==LINE_BREAK) ) {
            	                    alt34=1;
            	                }


            	                switch (alt34) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK92=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1174); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop34;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1189);
            	    notExpression93=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression93.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        Token LINE_BREAK95=null;
        notExpression_return notExpression96 = null;

        definedExpression_return definedExpression97 = null;


        Object string_literal94_tree=null;
        Object LINE_BREAK95_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==131) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=HEREDOC_STRING && LA38_0<=FLOAT)||LA38_0==SYMBOL||(LA38_0>=IF_MODIFIER && LA38_0<=UNLESS_MODIFIER)||LA38_0==ID||(LA38_0>=BNOT && LA38_0<=REGEX)||(LA38_0>=SINGLE_QUOTE_STRING && LA38_0<=DOUBLE_QUOTE_STRING)||LA38_0==118||(LA38_0>=120 && LA38_0<=122)||(LA38_0>=132 && LA38_0<=134)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("402:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal94=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_notExpression1207); 
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    root_0 = (Object)adaptor.becomeRoot(string_literal94_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:4: ( LINE_BREAK )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==LINE_BREAK) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK95=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1214); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1222);
                    notExpression96=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression96.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1228);
                    definedExpression97=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression97.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        assignmentExpression_return assignmentExpression99 = null;

        assignmentExpression_return assignmentExpression100 = null;


        Object string_literal98_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:4: ( 'defined' assignmentExpression | assignmentExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==132) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=HEREDOC_STRING && LA39_0<=FLOAT)||LA39_0==SYMBOL||(LA39_0>=IF_MODIFIER && LA39_0<=UNLESS_MODIFIER)||LA39_0==ID||(LA39_0>=BNOT && LA39_0<=REGEX)||(LA39_0>=SINGLE_QUOTE_STRING && LA39_0<=DOUBLE_QUOTE_STRING)||LA39_0==118||(LA39_0>=120 && LA39_0<=122)||(LA39_0>=133 && LA39_0<=134)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("408:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:4: 'defined' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal98=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_definedExpression1239); 
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1241);
                    assignmentExpression99=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression99.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:410:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1252);
                    assignmentExpression100=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression100.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set103=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression101 = null;

        lhs_return lhs102 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression104 = null;


        Object set103_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=HEREDOC_STRING && LA40_0<=FLOAT)||LA40_0==SYMBOL||(LA40_0>=IF_MODIFIER && LA40_0<=UNLESS_MODIFIER)||(LA40_0>=BNOT && LA40_0<=REGEX)||(LA40_0>=SINGLE_QUOTE_STRING && LA40_0<=DOUBLE_QUOTE_STRING)||LA40_0==118||(LA40_0>=120 && LA40_0<=122)||(LA40_0>=133 && LA40_0<=134)) ) {
                alt40=1;
            }
            else if ( (LA40_0==ID) ) {
                int LA40_2 = input.LA(2);

                if ( ((LA40_2>=ASSIGN && LA40_2<=POWER_ASSIGN)) ) {
                    alt40=2;
                }
                else if ( (LA40_2==EOF||(LA40_2>=LEFT_SHIFT && LA40_2<=FLOAT)||LA40_2==SYMBOL||(LA40_2>=DIV && LA40_2<=LINE_BREAK)||LA40_2==DOT||(LA40_2>=ID && LA40_2<=POWER)||(LA40_2>=QUESTION && LA40_2<=REGEX)||(LA40_2>=SINGLE_QUOTE_STRING && LA40_2<=DOUBLE_QUOTE_STRING)||LA40_2==RCURLY||LA40_2==ASSOC||(LA40_2>=LPAREN && LA40_2<=RPAREN)||(LA40_2>=COMMA && LA40_2<=COLON)||(LA40_2>=118 && LA40_2<=125)||(LA40_2>=129 && LA40_2<=130)||(LA40_2>=132 && LA40_2<=134)) ) {
                    alt40=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("418:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("418:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1266);
                    ternaryIfThenElseExpression101=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression101.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1280);
                    lhs102=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs102.getTree());
                    set103=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set103), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1282);    throw mse;
                    }

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1326);
                    ternaryIfThenElseExpression104=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression104.getTree());
                    addVariable(input.toString(lhs102.start,lhs102.stop));

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION105=null;
        Token char_literal107=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression106 = null;

        rangeExpression_return rangeExpression108 = null;


        Object QUESTION105_tree=null;
        Object char_literal107_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:5: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1340);
            r=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, r.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==QUESTION) ) {
                alt41=1;
            }
            else if ( (LA41_0==EOF||LA41_0==LEFT_SHIFT||(LA41_0>=DIV && LA41_0<=LINE_BREAK)||LA41_0==DOT||(LA41_0>=COMPARE && LA41_0<=POWER)||(LA41_0>=INCLUSIVE_RANGE && LA41_0<=BAND)||LA41_0==RCURLY||LA41_0==ASSOC||LA41_0==RPAREN||(LA41_0>=COMMA && LA41_0<=COLON)||LA41_0==119||(LA41_0>=123 && LA41_0<=125)||(LA41_0>=129 && LA41_0<=130)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("424:23: ( QUESTION rangeExpression ':' rangeExpression | )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION105=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1344); 
                    QUESTION105_tree = (Object)adaptor.create(QUESTION105);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION105_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1347);
                    rangeExpression106=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression106.getTree());
                    char_literal107=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1349); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1352);
                    rangeExpression108=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression108.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:424:73: 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE110=null;
        Token LINE_BREAK111=null;
        Token EXCLUSIVE_RANGE112=null;
        Token LINE_BREAK113=null;
        logicalOrExpression_return logicalOrExpression109 = null;

        logicalOrExpression_return logicalOrExpression114 = null;


        Object INCLUSIVE_RANGE110_tree=null;
        Object LINE_BREAK111_tree=null;
        Object EXCLUSIVE_RANGE112_tree=null;
        Object LINE_BREAK113_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1369);
            logicalOrExpression109=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression109.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==INCLUSIVE_RANGE) ) {
                    alt45=1;
                }
                else if ( (LA45_0==EXCLUSIVE_RANGE) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==INCLUSIVE_RANGE) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==EXCLUSIVE_RANGE) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("431:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE110=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1388); 
            	            INCLUSIVE_RANGE110_tree = (Object)adaptor.create(INCLUSIVE_RANGE110);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE110_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:24: ( LINE_BREAK )*
            	            loop42:
            	            do {
            	                int alt42=2;
            	                int LA42_0 = input.LA(1);

            	                if ( (LA42_0==LINE_BREAK) ) {
            	                    alt42=1;
            	                }


            	                switch (alt42) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK111=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1392); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop42;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:432:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE112=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1403); 
            	            EXCLUSIVE_RANGE112_tree = (Object)adaptor.create(EXCLUSIVE_RANGE112);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE112_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:432:24: ( LINE_BREAK )*
            	            loop43:
            	            do {
            	                int alt43=2;
            	                int LA43_0 = input.LA(1);

            	                if ( (LA43_0==LINE_BREAK) ) {
            	                    alt43=1;
            	                }


            	                switch (alt43) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:432:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK113=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1407); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop43;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1422);
            	    logicalOrExpression114=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression114.getTree());

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
    // $ANTLR end rangeExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalOrExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR116=null;
        Token LINE_BREAK117=null;
        logicalAndExpression_return logicalAndExpression115 = null;

        logicalAndExpression_return logicalAndExpression118 = null;


        Object LOGICAL_OR116_tree=null;
        Object LINE_BREAK117_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1442);
            logicalAndExpression115=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression115.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==LOGICAL_OR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR116=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1474); 
            	    LOGICAL_OR116_tree = (Object)adaptor.create(LOGICAL_OR116);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR116_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:18: ( LINE_BREAK )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==LINE_BREAK) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK117=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1479); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1488);
            	    logicalAndExpression118=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression118.getTree());

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
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAndExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:448:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND120=null;
        Token LINE_BREAK121=null;
        equalityExpression_return equalityExpression119 = null;

        equalityExpression_return equalityExpression122 = null;


        Object LOGICAL_AND120_tree=null;
        Object LINE_BREAK121_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1508);
            equalityExpression119=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression119.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==LOGICAL_AND) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND120=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1540); 
            	    LOGICAL_AND120_tree = (Object)adaptor.create(LOGICAL_AND120);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND120_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:19: ( LINE_BREAK )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==LINE_BREAK) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK121=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1545); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1554);
            	    equalityExpression122=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression122.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:457:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE124=null;
        Token LINE_BREAK125=null;
        Token EQUAL126=null;
        Token LINE_BREAK127=null;
        Token CASE_EQUAL128=null;
        Token LINE_BREAK129=null;
        Token NOT_EQUAL130=null;
        Token LINE_BREAK131=null;
        Token MATCH132=null;
        Token LINE_BREAK133=null;
        Token NOT_MATCH134=null;
        Token LINE_BREAK135=null;
        relationalExpression_return relationalExpression123 = null;

        relationalExpression_return relationalExpression136 = null;


        Object COMPARE124_tree=null;
        Object LINE_BREAK125_tree=null;
        Object EQUAL126_tree=null;
        Object LINE_BREAK127_tree=null;
        Object CASE_EQUAL128_tree=null;
        Object LINE_BREAK129_tree=null;
        Object NOT_EQUAL130_tree=null;
        Object LINE_BREAK131_tree=null;
        Object MATCH132_tree=null;
        Object LINE_BREAK133_tree=null;
        Object NOT_MATCH134_tree=null;
        Object LINE_BREAK135_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:458:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1574);
            relationalExpression123=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression123.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:459:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt57=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt57=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt57=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt57=1;
                    }
                    break;
                case MATCH:
                    {
                    alt57=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt57=1;
                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt56=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt56=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt56=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt56=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt56=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt56=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt56=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("460:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 56, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt56) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE124=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1608); 
            	            COMPARE124_tree = (Object)adaptor.create(COMPARE124);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE124_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:17: ( LINE_BREAK )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==LINE_BREAK) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1613); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL126=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1624); 
            	            EQUAL126_tree = (Object)adaptor.create(EQUAL126);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL126_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:16: ( LINE_BREAK )*
            	            loop51:
            	            do {
            	                int alt51=2;
            	                int LA51_0 = input.LA(1);

            	                if ( (LA51_0==LINE_BREAK) ) {
            	                    alt51=1;
            	                }


            	                switch (alt51) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK127=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1630); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop51;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL128=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1641); 
            	            CASE_EQUAL128_tree = (Object)adaptor.create(CASE_EQUAL128);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL128_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:19: ( LINE_BREAK )*
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==LINE_BREAK) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK129=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1645); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop52;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL130=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1656); 
            	            NOT_EQUAL130_tree = (Object)adaptor.create(NOT_EQUAL130);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL130_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:19: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK131=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1661); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH132=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1672); 
            	            MATCH132_tree = (Object)adaptor.create(MATCH132);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH132_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:16: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);

            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }


            	                switch (alt54) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK133=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1678); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH134=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1689); 
            	            NOT_MATCH134_tree = (Object)adaptor.create(NOT_MATCH134);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH134_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:19: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK135=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1694); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1709);
            	    relationalExpression136=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression136.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN138=null;
        Token LINE_BREAK139=null;
        Token GREATER_THAN140=null;
        Token LINE_BREAK141=null;
        Token LESS_OR_EQUAL142=null;
        Token LINE_BREAK143=null;
        Token GREATER_OR_EQUAL144=null;
        Token LINE_BREAK145=null;
        orExpression_return orExpression137 = null;

        orExpression_return orExpression146 = null;


        Object LESS_THAN138_tree=null;
        Object LINE_BREAK139_tree=null;
        Object GREATER_THAN140_tree=null;
        Object LINE_BREAK141_tree=null;
        Object LESS_OR_EQUAL142_tree=null;
        Object LINE_BREAK143_tree=null;
        Object GREATER_OR_EQUAL144_tree=null;
        Object LINE_BREAK145_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1730);
            orExpression137=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression137.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop63:
            do {
                int alt63=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt63=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt63=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt63=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt63=1;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt62=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt62=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt62=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt62=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt62=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("476:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 62, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt62) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN138=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1764); 
            	            LESS_THAN138_tree = (Object)adaptor.create(LESS_THAN138);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN138_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:20: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);

            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }


            	                switch (alt58) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK139=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1770); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN140=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1781); 
            	            GREATER_THAN140_tree = (Object)adaptor.create(GREATER_THAN140);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN140_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:22: ( LINE_BREAK )*
            	            loop59:
            	            do {
            	                int alt59=2;
            	                int LA59_0 = input.LA(1);

            	                if ( (LA59_0==LINE_BREAK) ) {
            	                    alt59=1;
            	                }


            	                switch (alt59) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK141=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1786); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop59;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL142=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1797); 
            	            LESS_OR_EQUAL142_tree = (Object)adaptor.create(LESS_OR_EQUAL142);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL142_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:23: ( LINE_BREAK )*
            	            loop60:
            	            do {
            	                int alt60=2;
            	                int LA60_0 = input.LA(1);

            	                if ( (LA60_0==LINE_BREAK) ) {
            	                    alt60=1;
            	                }


            	                switch (alt60) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK143=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1802); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop60;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL144=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1813); 
            	            GREATER_OR_EQUAL144_tree = (Object)adaptor.create(GREATER_OR_EQUAL144);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL144_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:25: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);

            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }


            	                switch (alt61) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK145=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1817); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1832);
            	    orExpression146=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression146.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR148=null;
        Token LINE_BREAK149=null;
        Token BOR150=null;
        Token LINE_BREAK151=null;
        andExpression_return andExpression147 = null;

        andExpression_return andExpression152 = null;


        Object BXOR148_tree=null;
        Object LINE_BREAK149_tree=null;
        Object BOR150_tree=null;
        Object LINE_BREAK151_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1852);
            andExpression147=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression147.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==BXOR) ) {
                    alt67=1;
                }
                else if ( (LA67_0==BOR) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==BXOR) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==BOR) ) {
            	        alt66=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("489:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR148=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1886); 
            	            BXOR148_tree = (Object)adaptor.create(BXOR148);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR148_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:15: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);

            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }


            	                switch (alt64) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK149=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1892); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR150=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1903); 
            	            BOR150_tree = (Object)adaptor.create(BOR150);
            	            root_0 = (Object)adaptor.becomeRoot(BOR150_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:14: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);

            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }


            	                switch (alt65) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK151=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1909); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1924);
            	    andExpression152=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression152.getTree());

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
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND154=null;
        Token LINE_BREAK155=null;
        shiftExpression_return shiftExpression153 = null;

        shiftExpression_return shiftExpression156 = null;


        Object BAND154_tree=null;
        Object LINE_BREAK155_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1944);
            shiftExpression153=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression153.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:499:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==BAND) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:500:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND154=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1976); 
            	    BAND154_tree = (Object)adaptor.create(BAND154);
            	    root_0 = (Object)adaptor.becomeRoot(BAND154_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:500:13: ( LINE_BREAK )*
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( (LA68_0==LINE_BREAK) ) {
            	            alt68=1;
            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:500:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK155=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1982); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop68;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1991);
            	    shiftExpression156=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression156.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:508:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT158=null;
        Token LINE_BREAK159=null;
        Token RIGHT_SHIFT160=null;
        Token LINE_BREAK161=null;
        additiveExpression_return additiveExpression157 = null;

        additiveExpression_return additiveExpression162 = null;


        Object LEFT_SHIFT158_tree=null;
        Object LINE_BREAK159_tree=null;
        Object RIGHT_SHIFT160_tree=null;
        Object LINE_BREAK161_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:509:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2013);
            additiveExpression157=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression157.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==LEFT_SHIFT) ) {
                    alt73=1;
                }
                else if ( (LA73_0==RIGHT_SHIFT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==LEFT_SHIFT) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==RIGHT_SHIFT) ) {
            	        alt72=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("511:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT158=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2047); 
            	            LEFT_SHIFT158_tree = (Object)adaptor.create(LEFT_SHIFT158);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT158_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:20: ( LINE_BREAK )*
            	            loop70:
            	            do {
            	                int alt70=2;
            	                int LA70_0 = input.LA(1);

            	                if ( (LA70_0==LINE_BREAK) ) {
            	                    alt70=1;
            	                }


            	                switch (alt70) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK159=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2052); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop70;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT160=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2063); 
            	            RIGHT_SHIFT160_tree = (Object)adaptor.create(RIGHT_SHIFT160);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT160_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:20: ( LINE_BREAK )*
            	            loop71:
            	            do {
            	                int alt71=2;
            	                int LA71_0 = input.LA(1);

            	                if ( (LA71_0==LINE_BREAK) ) {
            	                    alt71=1;
            	                }


            	                switch (alt71) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2067); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop71;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2082);
            	    additiveExpression162=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression162.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:521:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS164=null;
        Token LINE_BREAK165=null;
        Token MINUS166=null;
        Token LINE_BREAK167=null;
        multiplicativeExpression_return multiplicativeExpression163 = null;

        multiplicativeExpression_return multiplicativeExpression168 = null;


        Object PLUS164_tree=null;
        Object LINE_BREAK165_tree=null;
        Object MINUS166_tree=null;
        Object LINE_BREAK167_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:522:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2104);
            multiplicativeExpression163=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression163.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==PLUS) ) {
                    alt77=1;
                }
                else if ( (LA77_0==MINUS) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==PLUS) ) {
            	        alt76=1;
            	    }
            	    else if ( (LA76_0==MINUS) ) {
            	        alt76=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("524:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 76, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS164=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2138); 
            	            PLUS164_tree = (Object)adaptor.create(PLUS164);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS164_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:16: ( LINE_BREAK )*
            	            loop74:
            	            do {
            	                int alt74=2;
            	                int LA74_0 = input.LA(1);

            	                if ( (LA74_0==LINE_BREAK) ) {
            	                    alt74=1;
            	                }


            	                switch (alt74) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK165=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2145); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop74;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS166=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2156); 
            	            MINUS166_tree = (Object)adaptor.create(MINUS166);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS166_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:17: ( LINE_BREAK )*
            	            loop75:
            	            do {
            	                int alt75=2;
            	                int LA75_0 = input.LA(1);

            	                if ( (LA75_0==LINE_BREAK) ) {
            	                    alt75=1;
            	                }


            	                switch (alt75) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK167=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2163); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop75;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2178);
            	    multiplicativeExpression168=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression168.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR170=null;
        Token LINE_BREAK171=null;
        Token DIV172=null;
        Token LINE_BREAK173=null;
        Token MOD174=null;
        Token LINE_BREAK175=null;
        powerExpression_return powerExpression169 = null;

        powerExpression_return powerExpression176 = null;


        Object STAR170_tree=null;
        Object LINE_BREAK171_tree=null;
        Object DIV172_tree=null;
        Object LINE_BREAK173_tree=null;
        Object MOD174_tree=null;
        Object LINE_BREAK175_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2198);
            powerExpression169=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression169.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:534:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop82:
            do {
                int alt82=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt82=1;
                    }
                    break;
                case DIV:
                    {
                    alt82=1;
                    }
                    break;
                case MOD:
                    {
                    alt82=1;
                    }
                    break;

                }

                switch (alt82) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt81=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt81=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt81=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt81=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("535:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 81, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt81) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR170=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2232); 
            	            STAR170_tree = (Object)adaptor.create(STAR170);
            	            root_0 = (Object)adaptor.becomeRoot(STAR170_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:15: ( LINE_BREAK )*
            	            loop78:
            	            do {
            	                int alt78=2;
            	                int LA78_0 = input.LA(1);

            	                if ( (LA78_0==LINE_BREAK) ) {
            	                    alt78=1;
            	                }


            	                switch (alt78) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK171=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2238); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop78;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV172=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2249); 
            	            DIV172_tree = (Object)adaptor.create(DIV172);
            	            root_0 = (Object)adaptor.becomeRoot(DIV172_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:14: ( LINE_BREAK )*
            	            loop79:
            	            do {
            	                int alt79=2;
            	                int LA79_0 = input.LA(1);

            	                if ( (LA79_0==LINE_BREAK) ) {
            	                    alt79=1;
            	                }


            	                switch (alt79) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK173=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2255); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop79;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:537:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD174=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2266); 
            	            MOD174_tree = (Object)adaptor.create(MOD174);
            	            root_0 = (Object)adaptor.becomeRoot(MOD174_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:537:14: ( LINE_BREAK )*
            	            loop80:
            	            do {
            	                int alt80=2;
            	                int LA80_0 = input.LA(1);

            	                if ( (LA80_0==LINE_BREAK) ) {
            	                    alt80=1;
            	                }


            	                switch (alt80) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:537:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK175=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2272); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop80;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2287);
            	    powerExpression176=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression176.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start powerExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:545:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER178=null;
        Token LINE_BREAK179=null;
        bnotExpression_return bnotExpression177 = null;

        bnotExpression_return bnotExpression180 = null;


        Object POWER178_tree=null;
        Object LINE_BREAK179_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2308);
            bnotExpression177=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression177.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:547:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==POWER) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER178=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2343); 
            	    POWER178_tree = (Object)adaptor.create(POWER178);
            	    root_0 = (Object)adaptor.becomeRoot(POWER178_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:14: ( LINE_BREAK )*
            	    loop83:
            	    do {
            	        int alt83=2;
            	        int LA83_0 = input.LA(1);

            	        if ( (LA83_0==LINE_BREAK) ) {
            	            alt83=1;
            	        }


            	        switch (alt83) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK179=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2349); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop83;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2358);
            	    bnotExpression180=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression180.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:554:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT181=null;
        Token LINE_BREAK182=null;
        Token NOT183=null;
        Token LINE_BREAK184=null;
        command_return command185 = null;


        Object BNOT181_tree=null;
        Object LINE_BREAK182_tree=null;
        Object NOT183_tree=null;
        Object LINE_BREAK184_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop87:
            do {
                int alt87=3;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==BNOT) ) {
                    alt87=1;
                }
                else if ( (LA87_0==NOT) ) {
                    alt87=2;
                }


                switch (alt87) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT181=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2380); 
            	    BNOT181_tree = (Object)adaptor.create(BNOT181);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT181_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:15: ( LINE_BREAK )*
            	    loop85:
            	    do {
            	        int alt85=2;
            	        int LA85_0 = input.LA(1);

            	        if ( (LA85_0==LINE_BREAK) ) {
            	            alt85=1;
            	        }


            	        switch (alt85) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:555:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK182=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2386); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop85;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT183=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2396); 
            	    NOT183_tree = (Object)adaptor.create(NOT183);
            	    root_0 = (Object)adaptor.becomeRoot(NOT183_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:13: ( LINE_BREAK )*
            	    loop86:
            	    do {
            	        int alt86=2;
            	        int LA86_0 = input.LA(1);

            	        if ( (LA86_0==LINE_BREAK) ) {
            	            alt86=1;
            	        }


            	        switch (alt86) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:556:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK184=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2402); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop86;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2416);
            command185=command();
            _fsp--;

            adaptor.addChild(root_0, command185.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:560:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] ) ( DOT method[false] )* ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal186=null;
        Token string_literal187=null;
        Token DOT194=null;
        literal_return literal188 = null;

        boolean_expression_return boolean_expression189 = null;

        block_expression_return block_expression190 = null;

        if_expression_return if_expression191 = null;

        unless_expression_return unless_expression192 = null;

        atom_return atom193 = null;

        method_return method195 = null;


        Object string_literal186_tree=null;
        Object string_literal187_tree=null;
        Object DOT194_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:3: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] ) ( DOT method[false] )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] )
            int alt88=8;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt88=1;
                }
                break;
            case 134:
                {
                alt88=2;
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
                alt88=3;
                }
                break;
            case 120:
            case 121:
            case 122:
                {
                alt88=4;
                }
                break;
            case 118:
                {
                alt88=5;
                }
                break;
            case IF_MODIFIER:
                {
                alt88=6;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt88=7;
                }
                break;
            case ID:
                {
                alt88=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("562:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] )", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:4: 'expression0'
                    {
                    string_literal186=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_command2431); 
                    string_literal186_tree = (Object)adaptor.create(string_literal186);
                    adaptor.addChild(root_0, string_literal186_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:20: 'expression1'
                    {
                    string_literal187=(Token)input.LT(1);
                    match(input,134,FOLLOW_134_in_command2435); 
                    string_literal187_tree = (Object)adaptor.create(string_literal187);
                    adaptor.addChild(root_0, string_literal187_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2438);
                    literal188=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal188.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2440);
                    boolean_expression189=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression189.getTree());

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2443);
                    block_expression190=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression190.getTree());

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2445);
                    if_expression191=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression191.getTree());

                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2447);
                    unless_expression192=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression192.getTree());

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2449);
                    atom193=atom(true);
                    _fsp--;

                    adaptor.addChild(root_0, atom193.getTree());

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:124: ( DOT method[false] )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==DOT) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:562:125: DOT method[false]
            	    {
            	    DOT194=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2454); 
            	    DOT194_tree = (Object)adaptor.create(DOT194);
            	    root_0 = (Object)adaptor.becomeRoot(DOT194_tree, root_0);

            	    pushFollow(FOLLOW_method_in_command2457);
            	    method195=method(false);
            	    _fsp--;

            	    adaptor.addChild(root_0, method195.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:1: atom[boolean topLevel] : methodExpression[topLevel] ;
    public final atom_return atom(boolean topLevel) throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodExpression_return methodExpression196 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:26: ( methodExpression[topLevel] )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:26: methodExpression[topLevel]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodExpression_in_atom2471);
            methodExpression196=methodExpression(topLevel);
            _fsp--;

            adaptor.addChild(root_0, methodExpression196.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variable_return variable197 = null;

        method_return method198 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:9: ( variable | method[topLevel] )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ID) ) {
                int LA90_1 = input.LA(2);

                if ( (isDefinedVar(input.LT(1).getText())) ) {
                    alt90=1;
                }
                else if ( (true) ) {
                    alt90=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("565:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 90, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("565:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:9: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_methodExpression2486);
                    variable197=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable197.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:566:18: method[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_method_in_methodExpression2488);
                    method198=method(topLevel);
                    _fsp--;

                    adaptor.addChild(root_0, method198.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID199=null;

        Object ID199_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:11: ({...}? ID -> ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:11: {...}? ID
            {
            if ( !(isDefinedVar(input.LT(1).getText())) ) {
                throw new FailedPredicateException(input, "variable", "isDefinedVar(input.LT(1).getText())");
            }
            ID199=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2497); 
            stream_ID.add(ID199);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 567:53: -> ^( VARIABLE ID )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:56: ^( VARIABLE ID )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID200=null;
        Token ID201=null;
        open_args_return open_args202 = null;


        Object ID200_tree=null;
        Object ID201_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:28: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:28: {...}? ID
                    {
                    if ( !(!isDefinedVar(input.LT(1).getText())) ) {
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(input.LT(1).getText())");
                    }
                    ID200=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2515); 
                    stream_ID.add(ID200);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 568:71: -> ^( CALL ID )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:74: ^( CALL ID )
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:17: ID open_args
                    {
                    ID201=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2541); 
                    stream_ID.add(ID201);

                    pushFollow(FOLLOW_open_args_in_method2543);
                    open_args202=open_args();
                    _fsp--;

                    stream_open_args.add(open_args202.getTree());

                    // AST REWRITE
                    // elements: open_args, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 569:30: -> ^( CALL ID open_args )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:33: ^( CALL ID open_args )
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

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start primary
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:1: primary : literal ;
    public final primary_return primary() throws RecognitionException {
        primary_return retval = new primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        literal_return literal203 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:11: ( literal )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:11: literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_literal_in_primary2569);
            literal203=literal();
            _fsp--;

            adaptor.addChild(root_0, literal203.getTree());

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
    // $ANTLR end primary

    public static class command_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start command_call
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:573:1: command_call : command1 ;
    public final command_call_return command_call() throws RecognitionException {
        command_call_return retval = new command_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        command1_return command1204 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:4: ( command1 )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:4: command1
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_command1_in_command_call2579);
            command1204=command1();
            _fsp--;

            adaptor.addChild(root_0, command1204.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:1: command1 : operation1 ( command_args ) ;
    public final command1_return command1() throws RecognitionException {
        command1_return retval = new command1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operation1_return operation1205 = null;

        command_args_return command_args206 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:11: ( operation1 ( command_args ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:11: operation1 ( command_args )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operation1_in_command12591);
            operation1205=operation1();
            _fsp--;

            adaptor.addChild(root_0, operation1205.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:22: ( command_args )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:578:23: command_args
            {
            pushFollow(FOLLOW_command_args_in_command12594);
            command_args206=command_args();
            _fsp--;

            adaptor.addChild(root_0, command_args206.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:1: command_args : open_args ;
    public final command_args_return command_args() throws RecognitionException {
        command_args_return retval = new command_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        open_args_return open_args207 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:4: ( open_args )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:4: open_args
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_open_args_in_command_args2606);
            open_args207=open_args();
            _fsp--;

            adaptor.addChild(root_0, open_args207.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:583:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal209=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        call_args_return call_args208 = null;

        call_args_return call_args212 = null;


        Object char_literal209_tree=null;
        Object char_literal210_tree=null;
        Object char_literal211_tree=null;
        Object char_literal213_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:4: ( call_args | '(' ')' | '(' call_args ')' )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=HEREDOC_STRING && LA92_0<=FLOAT)||LA92_0==SYMBOL||(LA92_0>=IF_MODIFIER && LA92_0<=UNLESS_MODIFIER)||LA92_0==ID||(LA92_0>=BNOT && LA92_0<=REGEX)||(LA92_0>=SINGLE_QUOTE_STRING && LA92_0<=DOUBLE_QUOTE_STRING)||LA92_0==118||(LA92_0>=120 && LA92_0<=122)||(LA92_0>=132 && LA92_0<=134)) ) {
                alt92=1;
            }
            else if ( (LA92_0==LPAREN) ) {
                int LA92_2 = input.LA(2);

                if ( (LA92_2==RPAREN) ) {
                    alt92=2;
                }
                else if ( ((LA92_2>=HEREDOC_STRING && LA92_2<=FLOAT)||LA92_2==SYMBOL||(LA92_2>=IF_MODIFIER && LA92_2<=UNLESS_MODIFIER)||LA92_2==ID||(LA92_2>=BNOT && LA92_2<=REGEX)||(LA92_2>=SINGLE_QUOTE_STRING && LA92_2<=DOUBLE_QUOTE_STRING)||LA92_2==118||(LA92_2>=120 && LA92_2<=122)||(LA92_2>=132 && LA92_2<=134)) ) {
                    alt92=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("583:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 92, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("583:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_args_in_open_args2616);
                    call_args208=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args208.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:585:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal209=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2626); 
                    char_literal210=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2629); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:10: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal211=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2641); 
                    pushFollow(FOLLOW_call_args_in_open_args2644);
                    call_args212=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args212.getTree());
                    char_literal213=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2648); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        args_return args214 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:4: ( args -> ^( ARG args ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2657);
            args214=args();
            _fsp--;

            stream_args.add(args214.getTree());

            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 588:10: -> ^( ARG args )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:13: ^( ARG args )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal216=null;
        arg_return arg215 = null;

        arg_return arg217 = null;


        Object char_literal216_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:8: ( arg ( ',' arg )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args2675);
            arg215=arg();
            _fsp--;

            adaptor.addChild(root_0, arg215.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:12: ( ',' arg )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==COMMA) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:13: ',' arg
            	    {
            	    char_literal216=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2678); 
            	    pushFollow(FOLLOW_arg_in_args2681);
            	    arg217=arg();
            	    _fsp--;

            	    adaptor.addChild(root_0, arg217.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        definedExpression_return definedExpression218 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:7: ( definedExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:592:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_definedExpression_in_arg2692);
            definedExpression218=definedExpression();
            _fsp--;

            adaptor.addChild(root_0, definedExpression218.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set219=null;

        Object set219_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:596:18: ( ID | CONSTANT | FID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set219=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set219));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID220=null;
        Token CONSTANT221=null;
        Token FID222=null;
        op_return op223 = null;


        Object ID220_tree=null;
        Object CONSTANT221_tree=null;
        Object FID222_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:17: ( ID | CONSTANT | FID | op )
            int alt94=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt94=1;
                }
                break;
            case CONSTANT:
                {
                alt94=2;
                }
                break;
            case FID:
                {
                alt94=3;
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
                alt94=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("599:1: operation2 : ( ID | CONSTANT | FID | op );", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID220=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22730); 
                    ID220_tree = (Object)adaptor.create(ID220);
                    adaptor.addChild(root_0, ID220_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT221=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22734); 
                    CONSTANT221_tree = (Object)adaptor.create(CONSTANT221);
                    adaptor.addChild(root_0, CONSTANT221_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:33: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID222=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22738); 
                    FID222_tree = (Object)adaptor.create(FID222);
                    adaptor.addChild(root_0, FID222_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:39: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation22742);
                    op223=op();
                    _fsp--;

                    adaptor.addChild(root_0, op223.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID224=null;
        Token FID225=null;
        op_return op226 = null;


        Object ID224_tree=null;
        Object FID225_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:17: ( ID | FID | op )
            int alt95=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt95=1;
                }
                break;
            case FID:
                {
                alt95=2;
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
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("602:1: operation3 : ( ID | FID | op );", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID224=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32758); 
                    ID224_tree = (Object)adaptor.create(ID224);
                    adaptor.addChild(root_0, ID224_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:22: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID225=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation32762); 
                    FID225_tree = (Object)adaptor.create(FID225);
                    adaptor.addChild(root_0, FID225_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:28: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation32766);
                    op226=op();
                    _fsp--;

                    adaptor.addChild(root_0, op226.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID227=null;

        Object ID227_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:7: ( ID -> ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:7: ID
            {
            ID227=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2780); 
            stream_ID.add(ID227);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 605:10: -> ^( VARIABLE ID )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:13: ^( VARIABLE ID )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:606:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression228 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:606:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:606:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2796);
            expression228=expression();
            _fsp--;

            adaptor.addChild(root_0, expression228.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:1: literal : ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT229=null;
        Token FLOAT230=null;
        Token ARRAY232=null;
        Token SYMBOL233=null;
        Token REGEX234=null;
        string_return string231 = null;


        Object INT229_tree=null;
        Object FLOAT230_tree=null;
        Object ARRAY232_tree=null;
        Object SYMBOL233_tree=null;
        Object REGEX234_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:11: ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX )
            int alt96=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt96=1;
                }
                break;
            case FLOAT:
                {
                alt96=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt96=3;
                }
                break;
            case ARRAY:
                {
                alt96=4;
                }
                break;
            case SYMBOL:
                {
                alt96=5;
                }
                break;
            case REGEX:
                {
                alt96=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("610:1: literal : ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT229=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2806); 
                    INT229_tree = (Object)adaptor.create(INT229);
                    adaptor.addChild(root_0, INT229_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT230=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2808); 
                    FLOAT230_tree = (Object)adaptor.create(FLOAT230);
                    adaptor.addChild(root_0, FLOAT230_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2810);
                    string231=string();
                    _fsp--;

                    adaptor.addChild(root_0, string231.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY232=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2812); 
                    ARRAY232_tree = (Object)adaptor.create(ARRAY232);
                    adaptor.addChild(root_0, ARRAY232_tree);


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:34: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL233=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2814); 
                    SYMBOL233_tree = (Object)adaptor.create(SYMBOL233);
                    adaptor.addChild(root_0, SYMBOL233_tree);


                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:610:41: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX234=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2816); 
                    REGEX234_tree = (Object)adaptor.create(REGEX234);
                    adaptor.addChild(root_0, REGEX234_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:678:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set235=null;

        Object set235_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:678:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set235=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set235));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        assoc_list_return assoc_list237 = null;


        Object char_literal236_tree=null;
        Object char_literal238_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:8: ( '{' assoc_list '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal236=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3766); 
            char_literal236_tree = (Object)adaptor.create(char_literal236);
            root_0 = (Object)adaptor.becomeRoot(char_literal236_tree, root_0);

            pushFollow(FOLLOW_assoc_list_in_hash3769);
            assoc_list237=assoc_list();
            _fsp--;

            adaptor.addChild(root_0, assoc_list237.getTree());
            char_literal238=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3771); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:750:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assocs_return assocs239 = null;

        trailer_return trailer240 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:4: ( assocs trailer )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list3780);
            assocs239=assocs();
            _fsp--;

            adaptor.addChild(root_0, assocs239.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3782);
            trailer240=trailer();
            _fsp--;

            adaptor.addChild(root_0, trailer240.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal242=null;
        assoc_return assoc241 = null;

        assoc_return assoc243 = null;


        Object char_literal242_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:10: ( assoc ( ',' assoc )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs3791);
            assoc241=assoc();
            _fsp--;

            adaptor.addChild(root_0, assoc241.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:16: ( ',' assoc )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==COMMA) ) {
                    int LA97_2 = input.LA(2);

                    if ( ((LA97_2>=HEREDOC_STRING && LA97_2<=FLOAT)||LA97_2==SYMBOL||(LA97_2>=IF_MODIFIER && LA97_2<=UNLESS_MODIFIER)||LA97_2==ID||(LA97_2>=BNOT && LA97_2<=REGEX)||(LA97_2>=SINGLE_QUOTE_STRING && LA97_2<=DOUBLE_QUOTE_STRING)||LA97_2==118||(LA97_2>=120 && LA97_2<=122)||(LA97_2>=132 && LA97_2<=134)) ) {
                        alt97=1;
                    }


                }


                switch (alt97) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:18: ',' assoc
            	    {
            	    char_literal242=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3795); 
            	    pushFollow(FOLLOW_assoc_in_assocs3798);
            	    assoc243=assoc();
            	    _fsp--;

            	    adaptor.addChild(root_0, assoc243.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:754:1: assoc : arg ( ASSOC | ',' ) arg ;
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set245=null;
        arg_return arg244 = null;

        arg_return arg246 = null;


        Object set245_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:754:17: ( arg ( ASSOC | ',' ) arg )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:754:17: arg ( ASSOC | ',' ) arg
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_assoc3816);
            arg244=arg();
            _fsp--;

            adaptor.addChild(root_0, arg244.getTree());
            set245=(Token)input.LT(1);
            if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3818);    throw mse;
            }

            pushFollow(FOLLOW_arg_in_assoc3825);
            arg246=arg();
            _fsp--;

            adaptor.addChild(root_0, arg246.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:758:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK247=null;
        Token char_literal248=null;

        Object LINE_BREAK247_tree=null;
        Object char_literal248_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:758:29: ( | LINE_BREAK | ',' )
            int alt98=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt98=1;
                }
                break;
            case LINE_BREAK:
                {
                alt98=2;
                }
                break;
            case COMMA:
                {
                alt98=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("758:1: trailer : ( | LINE_BREAK | ',' );", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:758:29: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:758:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK247=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer3846); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:758:45: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal248=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer3851); 

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
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\43\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\174\2\u0086\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\122\uffff\1\3\3\uffff\2\3",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\21\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
            "\3\uffff\4\4",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\21\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
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
        "\1\175\1\u0086\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\116\uffff\1\2\11\uffff\1\3",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\21\uffff\7\4\1\3\2\4\3\uffff\4\4",
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
    static final String DFA91_eotS =
        "\104\uffff";
    static final String DFA91_eofS =
        "\1\uffff\1\5\102\uffff";
    static final String DFA91_minS =
        "\1\50\1\13\1\uffff\2\14\1\uffff\1\13\3\14\72\0";
    static final String DFA91_maxS =
        "\1\50\1\u0086\1\uffff\2\u0086\1\uffff\1\u0080\3\u0086\72\0";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\76\uffff";
    static final String DFA91_specialS =
        "\104\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\1",
            "\1\5\2\2\4\uffff\1\2\11\uffff\2\5\1\3\1\4\5\5\1\uffff\1\5\1"+
            "\uffff\1\2\15\5\16\uffff\12\5\5\2\20\uffff\2\2\3\uffff\1\5\2"+
            "\uffff\1\5\1\uffff\1\2\1\5\3\uffff\2\5\2\uffff\1\2\1\5\3\2\3"+
            "\5\3\uffff\2\5\1\uffff\3\2",
            "",
            "\1\17\1\16\4\uffff\1\21\13\uffff\1\25\1\26\4\uffff\1\5\3\uffff"+
            "\1\27\45\uffff\1\11\1\12\1\15\1\20\1\22\20\uffff\2\17\21\uffff"+
            "\1\24\1\uffff\3\23\3\uffff\1\6\1\30\3\uffff\1\7\1\10\1\13\1"+
            "\14",
            "\2\5\4\uffff\1\5\13\uffff\2\5\4\uffff\1\5\3\uffff\1\5\45\uffff"+
            "\5\5\20\uffff\2\5\21\uffff\1\5\1\uffff\3\31\3\uffff\2\5\3\uffff"+
            "\4\5",
            "",
            "\1\35\2\uffff\1\33\1\34\14\uffff\2\35\12\uffff\1\32\15\35\25"+
            "\uffff\4\35\42\uffff\1\35\16\uffff\1\35",
            "\1\47\1\46\4\uffff\1\51\13\uffff\1\55\1\56\4\uffff\1\36\3\uffff"+
            "\1\57\45\uffff\1\41\1\42\1\45\1\50\1\52\20\uffff\2\47\21\uffff"+
            "\1\54\1\uffff\3\53\10\uffff\1\37\1\40\1\43\1\44",
            "\1\66\1\65\4\uffff\1\70\13\uffff\1\74\1\75\10\uffff\1\76\45"+
            "\uffff\1\60\1\61\1\64\1\67\1\71\20\uffff\2\66\21\uffff\1\73"+
            "\1\uffff\3\72\12\uffff\1\62\1\63",
            "\1\17\1\16\4\uffff\1\21\13\uffff\1\25\1\26\4\uffff\1\77\3\uffff"+
            "\1\101\45\uffff\1\102\1\103\1\15\1\20\1\22\20\uffff\2\17\21"+
            "\uffff\1\100\1\uffff\3\23\12\uffff\1\13\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "568:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program223 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_statement_list_in_program227 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_program229 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_statement_in_statement_list243 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list246 = new BitSet(new long[]{0x00000118C0043000L,0xC74000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_statement_in_statement_list249 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_expression_in_statement275 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement278 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_set_in_modifier_line318 = new BitSet(new long[]{0x00000110C0043000L,0xC74000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_line_break_in_modifier_line332 = new BitSet(new long[]{0x00000110C0043000L,0xC74000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_modifier_line336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_block_expression411 = new BitSet(new long[]{0x00000108C0043000L,0xC7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_body_in_block_expression413 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_block_expression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body422 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_statement_list_in_body426 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_body428 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression451 = new BitSet(new long[]{0x00000100C0043000L,0xC74000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_if_expression456 = new BitSet(new long[]{0x0000001000000000L,0x2008000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression458 = new BitSet(new long[]{0x00000108C0043000L,0xDFC000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_body_in_if_expression471 = new BitSet(new long[]{0x0000000000000000L,0x1880000000000000L});
    public static final BitSet FOLLOW_123_in_if_expression474 = new BitSet(new long[]{0x00000100C0043000L,0xC74000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_if_expression478 = new BitSet(new long[]{0x0000001000000000L,0x2008000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression480 = new BitSet(new long[]{0x00000108C0043000L,0xDFC000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_body_in_if_expression484 = new BitSet(new long[]{0x0000000000000000L,0x1880000000000000L});
    public static final BitSet FOLLOW_124_in_if_expression498 = new BitSet(new long[]{0x00000108C0043000L,0xC7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_body_in_if_expression502 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_if_expression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator567 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator570 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator572 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator577 = new BitSet(new long[]{0x0000001000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_seperator580 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator582 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression592 = new BitSet(new long[]{0x0000000000000000L,0x0700000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression594 = new BitSet(new long[]{0x0000001000000000L,0x2008000000000000L});
    public static final BitSet FOLLOW_125_in_unless_expression597 = new BitSet(new long[]{0x00000108C0043000L,0xD7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_COLON_in_unless_expression599 = new BitSet(new long[]{0x00000108C0043000L,0xD7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_line_break_in_unless_expression601 = new BitSet(new long[]{0x00000108C0043000L,0xD7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_body_in_unless_expression613 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L});
    public static final BitSet FOLLOW_124_in_unless_expression626 = new BitSet(new long[]{0x00000108C0043000L,0xC7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_body_in_unless_expression628 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_unless_expression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_expression705 = new BitSet(new long[]{0x003FFF003000C800L,0x0002000000007800L,0x0000000000000001L});
    public static final BitSet FOLLOW_fitem_in_expression708 = new BitSet(new long[]{0x003FFF003000C800L,0x0002000000007800L,0x0000000000000001L});
    public static final BitSet FOLLOW_fitem_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_methodDefinition730 = new BitSet(new long[]{0x000001100000C000L,0x0000200000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition734 = new BitSet(new long[]{0x000001100000C000L,0x0000200000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition740 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition742 = new BitSet(new long[]{0x000001000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition746 = new BitSet(new long[]{0x0010011800000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition750 = new BitSet(new long[]{0x00000118C0043000L,0xC7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition753 = new BitSet(new long[]{0x00000118C0043000L,0xC7C000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition759 = new BitSet(new long[]{0x0000001800000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition763 = new BitSet(new long[]{0x0000001800000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_methodDefinition768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton781 = new BitSet(new long[]{0x00000100C0043000L,0xC74000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_singleton784 = new BitSet(new long[]{0x0000001000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton786 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist845 = new BitSet(new long[]{0x0010011000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist847 = new BitSet(new long[]{0x0000001000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist851 = new BitSet(new long[]{0x0000001000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist874 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args888 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg930 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_andorExpression1153 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1158 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_130_in_andorExpression1169 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1174 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1189 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_131_in_notExpression1207 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1214 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000078L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_definedExpression1239 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1280 = new BitSet(new long[]{0xFFC0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_assignmentExpression1282 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1344 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1347 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1349 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1388 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1392 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1403 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1407 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1474 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1479 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1508 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1540 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1545 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1554 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1574 = new BitSet(new long[]{0x00001E0000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1608 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1613 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1624 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1630 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1641 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1645 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1656 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1661 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1672 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1678 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1689 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1694 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1709 = new BitSet(new long[]{0x00001E0000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1730 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1764 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1770 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1781 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1786 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1797 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1802 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1813 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1817 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1832 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1886 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1892 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_BOR_in_orExpression1903 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1909 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1944 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_BAND_in_andExpression1976 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1982 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2013 = new BitSet(new long[]{0x0002000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2047 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2052 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2063 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2067 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2082 = new BitSet(new long[]{0x0002000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2104 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2138 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2145 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2156 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2163 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2178 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2198 = new BitSet(new long[]{0x0010000030000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2232 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2238 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2249 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2255 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2266 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2272 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2287 = new BitSet(new long[]{0x0010000030000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2308 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2343 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2349 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2358 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2380 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2386 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2396 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2402 = new BitSet(new long[]{0x00000110C0043000L,0x074000180007C000L,0x0000000000000060L});
    public static final BitSet FOLLOW_command_in_bnotExpression2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_command2431 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_134_in_command2435 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_literal_in_command2438 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2440 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2443 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2445 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2447 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_atom_in_command2449 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_DOT_in_command2454 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_method_in_command2457 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2541 = new BitSet(new long[]{0x00000100C0043000L,0x074020180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_open_args_in_method2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command1_in_command_call2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation1_in_command12591 = new BitSet(new long[]{0x00000100C0043000L,0x074020180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_command_args_in_command12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_args_in_command_args2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2626 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2641 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_call_args_in_open_args2644 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2675 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2678 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_arg_in_args2681 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation32762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation32766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3766 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_assoc_list_in_hash3769 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3780 = new BitSet(new long[]{0x0000001000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3791 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3795 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_assoc_in_assocs3798 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_arg_in_assoc3816 = new BitSet(new long[]{0x0000000000000000L,0x0004080000000000L});
    public static final BitSet FOLLOW_set_in_assoc3818 = new BitSet(new long[]{0x00000100C0043000L,0x074000180007C000L,0x0000000000000070L});
    public static final BitSet FOLLOW_arg_in_assoc3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer3851 = new BitSet(new long[]{0x0000000000000002L});

}