// $ANTLR 3.0 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-06-16 20:26:08

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'"
    };
    public static final int COMMA=115;
    public static final int GREATER_THAN=46;
    public static final int LOGICAL_AND_ASSIGN=66;
    public static final int INSTANCE_VARIABLE=91;
    public static final int MINUS=52;
    public static final int ESCAPE_INT=98;
    public static final int ARRAY=82;
    public static final int HEX_PART=94;
    public static final int LOGICAL_OR=72;
    public static final int LESS_THAN=48;
    public static final int META_PART=96;
    public static final int LEADING0_NUMBER=89;
    public static final int BOR=77;
    public static final int LEADING_MARK_DECIMAL=87;
    public static final int BINARY=86;
    public static final int DOT=39;
    public static final int COLON2=40;
    public static final int EMPTY_ARRAY=114;
    public static final int LCURLY=104;
    public static final int LINE_BREAK=37;
    public static final int CONSTANT=14;
    public static final int LEFT_SHIFT=11;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=90;
    public static final int IF_MODIFIER=31;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int ESCAPE_INT_PART=97;
    public static final int REGEX=83;
    public static final int SYMBOL=18;
    public static final int RPAREN=111;
    public static final int CONTROL_PART=95;
    public static final int DOUBLE_QUOTE_STRING=101;
    public static final int STAR_ASSIGN=65;
    public static final int PLUS=51;
    public static final int HEREDOC_INDENT_BEGIN=107;
    public static final int BODY=9;
    public static final int UNLESS_MODIFIER=32;
    public static final int CASE_EQUAL=44;
    public static final int MINUS_ASSIGN=59;
    public static final int GREATER_OR_EQUAL=47;
    public static final int EXCLUSIVE_RANGE=71;
    public static final int POWER_ASSIGN=68;
    public static final int MOD_ASSIGN=56;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int WS=38;
    public static final int STRING=27;
    public static final int DOUBLE_STRING_CHAR=103;
    public static final int RIGHT_SHIFT_ASSIGN=64;
    public static final int GLOBAL_VARIABLE=93;
    public static final int NON_LEADING0_NUMBER=99;
    public static final int SINGLE_QUOTE_STRING=100;
    public static final int HEREDOC_BEGIN=106;
    public static final int CLASS_VARIABLE=92;
    public static final int LBRACK=112;
    public static final int SEMI=36;
    public static final int DIV_ASSIGN=58;
    public static final int MRHS=24;
    public static final int BLOCK_ARG=22;
    public static final int EQUAL=43;
    public static final int LOGICAL_AND=73;
    public static final int COLON=116;
    public static final int DIV=29;
    public static final int REST_UNUSE=28;
    public static final int HEX=85;
    public static final int SINGLETON_METHOD=26;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=70;
    public static final int BNOT=79;
    public static final int LOGICAL_OR_ASSIGN=67;
    public static final int ASSOC=108;
    public static final int FLOAT=13;
    public static final int OCTAL=84;
    public static final int MOD=30;
    public static final int PLUS_ASSIGN=60;
    public static final int QUESTION=69;
    public static final int UNTIL_MODIFIER=34;
    public static final int BLOCK=19;
    public static final int RCURLY=105;
    public static final int INT=81;
    public static final int BOR_ASSIGN=61;
    public static final int ASSIGN=55;
    public static final int LESS_OR_EQUAL=49;
    public static final int LPAREN=110;
    public static final int BAND=78;
    public static final int HEREDOC_STRING=12;
    public static final int NOT_MATCH=75;
    public static final int ID=41;
    public static final int NOT_EQUAL=74;
    public static final int BAND_ASSIGN=62;
    public static final int COMPLEMENT_ASSIGN=57;
    public static final int RIGHT_SHIFT=50;
    public static final int POWER=54;
    public static final int BXOR_ASSIGN=109;
    public static final int FID=15;
    public static final int NESTED_LHS=25;
    public static final int COMMENT=118;
    public static final int LEFT_SHIFT_ASSIGN=63;
    public static final int MATCH=45;
    public static final int WHILE_MODIFIER=33;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=117;
    public static final int EXP_PART=88;
    public static final int COMPARE=42;
    public static final int IF=7;
    public static final int ARG=10;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int EOF=-1;
    public static final int VARIABLE=16;
    public static final int CALL=17;
    public static final int RBRACK=113;
    public static final int RESCUE_MODIFIER=35;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=53;
    public static final int BXOR=76;
    public static final int NOT=80;
    public static final int SINGLE_STRING_CHAR=102;

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==119||(LA3_0>=121 && LA3_0<=123)||(LA3_0>=127 && LA3_0<=128)||(LA3_0>=132 && LA3_0<=135)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("260:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program227);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program231);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program233);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list247);
            statement4=statement();
            _fsp--;

            stream_statement.add(statement4.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:16: ( terminal )+ statement
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:16: ( terminal )+
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
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list250);
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

            	    pushFollow(FOLLOW_statement_in_statement_list253);
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
            // 265:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:58: ( statement )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;


        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement279);
            expression7=expression();
            _fsp--;

            stream_expression.add(expression7.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement282);
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
            // 273:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:59: ( modifier_line )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line322);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line336);
            	    line_break10=line_break();
            	    _fsp--;

            	    adaptor.addChild(root_0, line_break10.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_modifier_line340);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)input.LT(1);
            match(input,119,FOLLOW_119_in_block_expression415); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);

            pushFollow(FOLLOW_body_in_block_expression417);
            body13=body();
            _fsp--;

            adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,120,FOLLOW_120_in_block_expression419); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==120||(LA10_0>=124 && LA10_0<=125)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==119||(LA10_0>=121 && LA10_0<=123)||(LA10_0>=127 && LA10_0<=128)||(LA10_0>=132 && LA10_0<=135)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("297:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body426); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body430);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body432);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:298:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:299:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=121 && input.LA(1)<=123) ) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        RewriteRuleTokenStream stream_IF_MODIFIER=new RewriteRuleTokenStream(adaptor,"token IF_MODIFIER");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_seperator=new RewriteRuleSubtreeStream(adaptor,"rule seperator");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression455); 
            stream_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression460);
            e0=expression();
            _fsp--;

            stream_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression462);
            seperator20=seperator();
            _fsp--;

            stream_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression475);
            body0=body();
            _fsp--;

            stream_body.add(body0.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==124) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,124,FOLLOW_124_in_if_expression478); 
            	    stream_124.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression482);
            	    e1=expression();
            	    _fsp--;

            	    stream_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression484);
            	    seperator22=seperator();
            	    _fsp--;

            	    stream_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression488);
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

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==125) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,125,FOLLOW_125_in_if_expression502); 
                    stream_125.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression506);
                    body2=body();
                    _fsp--;

                    stream_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,120,FOLLOW_120_in_if_expression519); 
            stream_120.add(string_literal24);


            // AST REWRITE
            // elements: e0, e1, body0, body2, body1
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
            // 304:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:48: ( $body2)?
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:3: ( LINE_BREAK )+
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
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator571); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator574); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator576); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator581); 
                    	    LINE_BREAK28_tree = (Object)adaptor.create(LINE_BREAK28);
                    	    adaptor.addChild(root_0, LINE_BREAK28_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    string_literal29=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_seperator584); 
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator586); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression596); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_boolean_expression_in_unless_expression598);
            boolean_expression32=boolean_expression();
            _fsp--;

            adaptor.addChild(root_0, boolean_expression32.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 126:
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
                    new NoViableAltException("310:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_unless_expression601); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression603); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression605);
                    line_break35=line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression617);
            body36=body();
            _fsp--;

            adaptor.addChild(root_0, body36.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==125) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,125,FOLLOW_125_in_unless_expression630); 
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);

                    pushFollow(FOLLOW_body_in_unless_expression632);
                    body38=body();
                    _fsp--;

                    adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

            }

            string_literal39=(Token)input.LT(1);
            match(input,120,FOLLOW_120_in_unless_expression645); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:11: ( SEMI | line_break )
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
                    new NoViableAltException("314:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal651); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal654);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break664); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:5: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 127:
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
            case 119:
            case 121:
            case 122:
            case 123:
            case 132:
            case 133:
            case 134:
            case 135:
                {
                alt21=2;
                }
                break;
            case 128:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("348:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)input.LT(1);
                    match(input,127,FOLLOW_127_in_expression709); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);

                    pushFollow(FOLLOW_fitem_in_expression712);
                    fitem44=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression714);
                    fitem45=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem45.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression716);
                    andorExpression46=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression46.getTree());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_expression718);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodDefinition_return methodDefinition48 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:4: ( methodDefinition )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodDefinition_in_primaryExpression726);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:1: methodDefinition : 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:4: ( 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:4: 'def' ( LINE_BREAK )* ( singleton dot_or_colon )? methodName f_arglist ( terminal )* ( bodyStatement )? ( terminal )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,128,FOLLOW_128_in_methodDefinition734); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition738); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:26: ( singleton dot_or_colon )?
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:27: singleton dot_or_colon
                    {
                    pushFollow(FOLLOW_singleton_in_methodDefinition744);
                    singleton51=singleton();
                    _fsp--;

                    adaptor.addChild(root_0, singleton51.getTree());
                    pushFollow(FOLLOW_dot_or_colon_in_methodDefinition746);
                    dot_or_colon52=dot_or_colon();
                    _fsp--;

                    adaptor.addChild(root_0, dot_or_colon52.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_methodName_in_methodDefinition750);
            methodName53=methodName();
            _fsp--;

            adaptor.addChild(root_0, methodName53.getTree());
            enterScope();
            pushFollow(FOLLOW_f_arglist_in_methodDefinition754);
            f_arglist54=f_arglist();
            _fsp--;

            adaptor.addChild(root_0, f_arglist54.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:89: ( terminal )*
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
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:90: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition757);
            	    terminal55=terminal();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:103: ( bodyStatement )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=HEREDOC_STRING && LA25_0<=FLOAT)||LA25_0==SYMBOL||(LA25_0>=IF_MODIFIER && LA25_0<=UNLESS_MODIFIER)||LA25_0==ID||(LA25_0>=BNOT && LA25_0<=REGEX)||(LA25_0>=SINGLE_QUOTE_STRING && LA25_0<=DOUBLE_QUOTE_STRING)||LA25_0==119||(LA25_0>=121 && LA25_0<=123)||(LA25_0>=127 && LA25_0<=128)||(LA25_0>=132 && LA25_0<=135)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:103: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition763);
                    bodyStatement56=bodyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, bodyStatement56.getTree());

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:118: ( terminal )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:119: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition767);
            	    terminal57=terminal();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            string_literal58=(Token)input.LT(1);
            match(input,120,FOLLOW_120_in_methodDefinition772); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:354:1: singleton : ( variable | '(' expression opt_nl ')' );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:4: ( variable | '(' expression opt_nl ')' )
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
                    new NoViableAltException("354:1: singleton : ( variable | '(' expression opt_nl ')' );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:4: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_singleton783);
                    variable59=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable59.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:13: '(' expression opt_nl ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal60=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_singleton785); 
                    pushFollow(FOLLOW_expression_in_singleton788);
                    expression61=expression();
                    _fsp--;

                    adaptor.addChild(root_0, expression61.getTree());
                    pushFollow(FOLLOW_opt_nl_in_singleton790);
                    opt_nl62=opt_nl();
                    _fsp--;

                    adaptor.addChild(root_0, opt_nl62.getTree());
                    char_literal63=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_singleton792); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:356:1: opt_nl : ( | LINE_BREAK );
    public final opt_nl_return opt_nl() throws RecognitionException {
        opt_nl_return retval = new opt_nl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK64=null;

        Object LINE_BREAK64_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:356:28: ( | LINE_BREAK )
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
                    new NoViableAltException("356:1: opt_nl : ( | LINE_BREAK );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:356:28: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:356:30: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK64=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_opt_nl811); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:1: dot_or_colon : ( DOT | COLON2 );
    public final dot_or_colon_return dot_or_colon() throws RecognitionException {
        dot_or_colon_return retval = new dot_or_colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65=null;

        Object set65_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:4: ( DOT | COLON2 )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:1: methodName : ( ID | CONSTANT | FID );
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set66=null;

        Object set66_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:4: ( ID | CONSTANT | FID )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:4: ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal )
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
                    new NoViableAltException("362:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' -> ^( ARG f_args ) | f_args terminal );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist849); 
                    stream_LPAREN.add(char_literal67);

                    pushFollow(FOLLOW_f_args_in_f_arglist851);
                    f_args68=f_args();
                    _fsp--;

                    stream_f_args.add(f_args68.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:16: ( LINE_BREAK )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==LINE_BREAK) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:17: LINE_BREAK
                    	    {
                    	    LINE_BREAK69=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist855); 
                    	    stream_LINE_BREAK.add(LINE_BREAK69);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    char_literal70=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist859); 
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
                    // 363:34: -> ^( ARG f_args )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:37: ^( ARG f_args )
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_args_in_f_arglist878);
                    f_args71=f_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_args71.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist880);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );
    public final f_args_return f_args() throws RecognitionException {
        f_args_return retval = new f_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        Token char_literal78=null;
        f_norm_args_return f_norm_args73 = null;

        f_norm_args_return f_norm_args74 = null;

        f_opt_args_return f_opt_args76 = null;

        f_opt_args_return f_opt_args77 = null;

        f_rest_arg_return f_rest_arg79 = null;

        f_rest_arg_return f_rest_arg80 = null;


        Object char_literal75_tree=null;
        Object char_literal78_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:10: ( f_norm_args | f_norm_args ',' f_opt_args | | f_opt_args ( ',' f_rest_arg )? | f_rest_arg )
            int alt32=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case ASSIGN:
                    {
                    alt32=4;
                    }
                    break;
                case SEMI:
                case LINE_BREAK:
                case RPAREN:
                    {
                    alt32=1;
                    }
                    break;
                case COMMA:
                    {
                    alt32=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("365:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 32, 1, input);

                    throw nvae;
                }

                }
                break;
            case SEMI:
            case LINE_BREAK:
            case RPAREN:
                {
                alt32=3;
                }
                break;
            case STAR:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("365:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | | f_opt_args ( ',' f_rest_arg )? | f_rest_arg );", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args888);
                    f_norm_args73=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args73.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:24: f_norm_args ',' f_opt_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args892);
                    f_norm_args74=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args74.getTree());
                    char_literal75=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args894); 
                    char_literal75_tree = (Object)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);

                    pushFollow(FOLLOW_f_opt_args_in_f_args896);
                    f_opt_args76=f_opt_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_opt_args76.getTree());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:10: f_opt_args ( ',' f_rest_arg )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_opt_args_in_f_args910);
                    f_opt_args77=f_opt_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_opt_args77.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:21: ( ',' f_rest_arg )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==COMMA) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:22: ',' f_rest_arg
                            {
                            char_literal78=(Token)input.LT(1);
                            match(input,COMMA,FOLLOW_COMMA_in_f_args913); 
                            char_literal78_tree = (Object)adaptor.create(char_literal78);
                            adaptor.addChild(root_0, char_literal78_tree);

                            pushFollow(FOLLOW_f_rest_arg_in_f_args915);
                            f_rest_arg79=f_rest_arg();
                            _fsp--;

                            adaptor.addChild(root_0, f_rest_arg79.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:4: f_rest_arg
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_rest_arg_in_f_args922);
                    f_rest_arg80=f_rest_arg();
                    _fsp--;

                    adaptor.addChild(root_0, f_rest_arg80.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID81=null;

        Object ID81_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:2: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:2: ID
            {
            root_0 = (Object)adaptor.nil();

            ID81=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args953); 
            ID81_tree = (Object)adaptor.create(ID81);
            adaptor.addChild(root_0, ID81_tree);

            addVariable(ID81.getText());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );
    public final f_rest_arg_return f_rest_arg() throws RecognitionException {
        f_rest_arg_return retval = new f_rest_arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal82=null;
        Token ID83=null;
        Token char_literal84=null;

        Object char_literal82_tree=null;
        Object ID83_tree=null;
        Object char_literal84_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:4: ( '*' ID | '*' -> ^( '*' REST_UNUSE ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==STAR) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==ID) ) {
                    alt33=1;
                }
                else if ( ((LA33_1>=SEMI && LA33_1<=LINE_BREAK)||LA33_1==RPAREN) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("375:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("375:1: f_rest_arg : ( '*' ID | '*' -> ^( '*' REST_UNUSE ) );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:4: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal82=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg963); 
                    char_literal82_tree = (Object)adaptor.create(char_literal82);
                    root_0 = (Object)adaptor.becomeRoot(char_literal82_tree, root_0);

                    ID83=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_f_rest_arg966); 
                    ID83_tree = (Object)adaptor.create(ID83);
                    adaptor.addChild(root_0, ID83_tree);

                    addVariable(ID83.getText());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:38: '*'
                    {
                    char_literal84=(Token)input.LT(1);
                    match(input,STAR,FOLLOW_STAR_in_f_rest_arg971); 
                    stream_STAR.add(char_literal84);


                    // AST REWRITE
                    // elements: STAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:42: -> ^( '*' REST_UNUSE )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:45: ^( '*' REST_UNUSE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STAR.next(), root_1);

                        adaptor.addChild(root_1, adaptor.create(REST_UNUSE, "REST_UNUSE"));

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
    // $ANTLR end f_rest_arg

    public static class f_opt_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start f_opt_args
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:1: f_opt_args : ID '=' arg ;
    public final f_opt_args_return f_opt_args() throws RecognitionException {
        f_opt_args_return retval = new f_opt_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID85=null;
        Token char_literal86=null;
        arg_return arg87 = null;


        Object ID85_tree=null;
        Object char_literal86_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:4: ( ID '=' arg )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:4: ID '=' arg
            {
            root_0 = (Object)adaptor.nil();

            ID85=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_opt_args987); 
            ID85_tree = (Object)adaptor.create(ID85);
            adaptor.addChild(root_0, ID85_tree);

            char_literal86=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_f_opt_args989); 
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            root_0 = (Object)adaptor.becomeRoot(char_literal86_tree, root_0);

            pushFollow(FOLLOW_arg_in_f_opt_args992);
            arg87=arg();
            _fsp--;

            adaptor.addChild(root_0, arg87.getTree());
            addVariable(ID85.getText());

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
    // $ANTLR end f_opt_args

    public static class bodyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bodyStatement
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list88 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:4: ( statement_list -> ^( BODY statement_list ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement1004);
            statement_list88=statement_list();
            _fsp--;

            stream_statement_list.add(statement_list88.getTree());

            // AST REWRITE
            // elements: statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 381:19: -> ^( BODY statement_list )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:22: ^( BODY statement_list )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname89 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:9: ( fname )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:384:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem1022);
            fname89=fname();
            _fsp--;

            adaptor.addChild(root_0, fname89.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID90=null;
        Token CONSTANT91=null;
        Token FID92=null;
        op_return op93 = null;


        Object ID90_tree=null;
        Object CONSTANT91_tree=null;
        Object FID92_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:9: ( ID | CONSTANT | FID | op )
            int alt34=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt34=1;
                }
                break;
            case CONSTANT:
                {
                alt34=2;
                }
                break;
            case FID:
                {
                alt34=3;
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
            case 129:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("385:1: fname : ( ID | CONSTANT | FID | op );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID90=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname1029); 
                    ID90_tree = (Object)adaptor.create(ID90);
                    adaptor.addChild(root_0, ID90_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT91=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname1031); 
                    CONSTANT91_tree = (Object)adaptor.create(CONSTANT91);
                    adaptor.addChild(root_0, CONSTANT91_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID92=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname1033); 
                    FID92_tree = (Object)adaptor.create(FID92);
                    adaptor.addChild(root_0, FID92_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname1035);
                    op93=op();
                    _fsp--;

                    adaptor.addChild(root_0, op93.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set94=null;

        Object set94_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set94=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==129 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set94));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:397:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        Token LINE_BREAK97=null;
        Token string_literal98=null;
        Token LINE_BREAK99=null;
        notExpression_return notExpression95 = null;

        notExpression_return notExpression100 = null;


        Object string_literal96_tree=null;
        Object LINE_BREAK97_tree=null;
        Object string_literal98_tree=null;
        Object LINE_BREAK99_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1196);
            notExpression95=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression95.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=130 && LA38_0<=131)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==130) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==131) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("399:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal96=(Token)input.LT(1);
            	            match(input,130,FOLLOW_130_in_andorExpression1206); 
            	            string_literal96_tree = (Object)adaptor.create(string_literal96);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal96_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:15: ( LINE_BREAK )*
            	            loop35:
            	            do {
            	                int alt35=2;
            	                int LA35_0 = input.LA(1);

            	                if ( (LA35_0==LINE_BREAK) ) {
            	                    alt35=1;
            	                }


            	                switch (alt35) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK97=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1211); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop35;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal98=(Token)input.LT(1);
            	            match(input,131,FOLLOW_131_in_andorExpression1222); 
            	            string_literal98_tree = (Object)adaptor.create(string_literal98);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal98_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:14: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);

            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }


            	                switch (alt36) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK99=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1227); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1242);
            	    notExpression100=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression100.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        Token LINE_BREAK102=null;
        notExpression_return notExpression103 = null;

        definedExpression_return definedExpression104 = null;


        Object string_literal101_tree=null;
        Object LINE_BREAK102_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==132) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=HEREDOC_STRING && LA40_0<=FLOAT)||LA40_0==SYMBOL||(LA40_0>=IF_MODIFIER && LA40_0<=UNLESS_MODIFIER)||LA40_0==ID||(LA40_0>=BNOT && LA40_0<=REGEX)||(LA40_0>=SINGLE_QUOTE_STRING && LA40_0<=DOUBLE_QUOTE_STRING)||LA40_0==119||(LA40_0>=121 && LA40_0<=123)||(LA40_0>=133 && LA40_0<=135)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("405:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal101=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_notExpression1260); 
                    string_literal101_tree = (Object)adaptor.create(string_literal101);
                    root_0 = (Object)adaptor.becomeRoot(string_literal101_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:4: ( LINE_BREAK )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==LINE_BREAK) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK102=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1267); 

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1275);
                    notExpression103=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression103.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1281);
                    definedExpression104=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression104.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:411:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        assignmentExpression_return assignmentExpression106 = null;

        assignmentExpression_return assignmentExpression107 = null;


        Object string_literal105_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:4: ( 'defined' assignmentExpression | assignmentExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==133) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=HEREDOC_STRING && LA41_0<=FLOAT)||LA41_0==SYMBOL||(LA41_0>=IF_MODIFIER && LA41_0<=UNLESS_MODIFIER)||LA41_0==ID||(LA41_0>=BNOT && LA41_0<=REGEX)||(LA41_0>=SINGLE_QUOTE_STRING && LA41_0<=DOUBLE_QUOTE_STRING)||LA41_0==119||(LA41_0>=121 && LA41_0<=123)||(LA41_0>=134 && LA41_0<=135)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("411:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:412:4: 'defined' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal105=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_definedExpression1292); 
                    string_literal105_tree = (Object)adaptor.create(string_literal105);
                    adaptor.addChild(root_0, string_literal105_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1294);
                    assignmentExpression106=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression106.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1305);
                    assignmentExpression107=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression107.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:421:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set110=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression108 = null;

        lhs_return lhs109 = null;

        assignmentExpression_return assignmentExpression111 = null;


        Object set110_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=HEREDOC_STRING && LA42_0<=FLOAT)||LA42_0==SYMBOL||(LA42_0>=IF_MODIFIER && LA42_0<=UNLESS_MODIFIER)||(LA42_0>=BNOT && LA42_0<=REGEX)||(LA42_0>=SINGLE_QUOTE_STRING && LA42_0<=DOUBLE_QUOTE_STRING)||LA42_0==119||(LA42_0>=121 && LA42_0<=123)||(LA42_0>=134 && LA42_0<=135)) ) {
                alt42=1;
            }
            else if ( (LA42_0==ID) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==EOF||(LA42_2>=LEFT_SHIFT && LA42_2<=FLOAT)||LA42_2==SYMBOL||(LA42_2>=DIV && LA42_2<=LINE_BREAK)||LA42_2==DOT||(LA42_2>=ID && LA42_2<=POWER)||(LA42_2>=QUESTION && LA42_2<=REGEX)||(LA42_2>=SINGLE_QUOTE_STRING && LA42_2<=DOUBLE_QUOTE_STRING)||LA42_2==RCURLY||LA42_2==ASSOC||(LA42_2>=LPAREN && LA42_2<=RPAREN)||(LA42_2>=COMMA && LA42_2<=COLON)||(LA42_2>=119 && LA42_2<=126)||(LA42_2>=130 && LA42_2<=131)||(LA42_2>=133 && LA42_2<=135)) ) {
                    alt42=1;
                }
                else if ( ((LA42_2>=ASSIGN && LA42_2<=POWER_ASSIGN)) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("421:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("421:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression );", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:422:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1319);
                    ternaryIfThenElseExpression108=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression108.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1333);
                    lhs109=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs109.getTree());
                    set110=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set110), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1335);    throw mse;
                    }

                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1379);
                    assignmentExpression111=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression111.getTree());
                    addVariable(input.toString(lhs109.start,lhs109.stop));

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION112=null;
        Token char_literal114=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression113 = null;

        rangeExpression_return rangeExpression115 = null;


        Object QUESTION112_tree=null;
        Object char_literal114_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:5: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1393);
            r=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, r.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==QUESTION) ) {
                alt43=1;
            }
            else if ( (LA43_0==EOF||LA43_0==LEFT_SHIFT||(LA43_0>=DIV && LA43_0<=LINE_BREAK)||LA43_0==DOT||(LA43_0>=COMPARE && LA43_0<=POWER)||(LA43_0>=INCLUSIVE_RANGE && LA43_0<=BAND)||LA43_0==RCURLY||LA43_0==ASSOC||LA43_0==RPAREN||(LA43_0>=COMMA && LA43_0<=COLON)||LA43_0==120||(LA43_0>=124 && LA43_0<=126)||(LA43_0>=130 && LA43_0<=131)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("427:23: ( QUESTION rangeExpression ':' rangeExpression | )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION112=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1397); 
                    QUESTION112_tree = (Object)adaptor.create(QUESTION112);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION112_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1400);
                    rangeExpression113=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression113.getTree());
                    char_literal114=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1402); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1405);
                    rangeExpression115=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression115.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:73: 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE117=null;
        Token LINE_BREAK118=null;
        Token EXCLUSIVE_RANGE119=null;
        Token LINE_BREAK120=null;
        logicalOrExpression_return logicalOrExpression116 = null;

        logicalOrExpression_return logicalOrExpression121 = null;


        Object INCLUSIVE_RANGE117_tree=null;
        Object LINE_BREAK118_tree=null;
        Object EXCLUSIVE_RANGE119_tree=null;
        Object LINE_BREAK120_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:432:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:432:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1422);
            logicalOrExpression116=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression116.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:433:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==INCLUSIVE_RANGE) ) {
                    alt47=1;
                }
                else if ( (LA47_0==EXCLUSIVE_RANGE) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==INCLUSIVE_RANGE) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==EXCLUSIVE_RANGE) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("434:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE117=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1441); 
            	            INCLUSIVE_RANGE117_tree = (Object)adaptor.create(INCLUSIVE_RANGE117);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE117_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:24: ( LINE_BREAK )*
            	            loop44:
            	            do {
            	                int alt44=2;
            	                int LA44_0 = input.LA(1);

            	                if ( (LA44_0==LINE_BREAK) ) {
            	                    alt44=1;
            	                }


            	                switch (alt44) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:434:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK118=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1445); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop44;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE119=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1456); 
            	            EXCLUSIVE_RANGE119_tree = (Object)adaptor.create(EXCLUSIVE_RANGE119);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE119_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:24: ( LINE_BREAK )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);

            	                if ( (LA45_0==LINE_BREAK) ) {
            	                    alt45=1;
            	                }


            	                switch (alt45) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:435:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK120=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1460); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1475);
            	    logicalOrExpression121=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression121.getTree());

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
    // $ANTLR end rangeExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalOrExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR123=null;
        Token LINE_BREAK124=null;
        logicalAndExpression_return logicalAndExpression122 = null;

        logicalAndExpression_return logicalAndExpression125 = null;


        Object LOGICAL_OR123_tree=null;
        Object LINE_BREAK124_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:443:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1495);
            logicalAndExpression122=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression122.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:444:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==LOGICAL_OR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR123=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1527); 
            	    LOGICAL_OR123_tree = (Object)adaptor.create(LOGICAL_OR123);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR123_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:18: ( LINE_BREAK )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==LINE_BREAK) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:445:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK124=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1532); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1541);
            	    logicalAndExpression125=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression125.getTree());

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
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAndExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND127=null;
        Token LINE_BREAK128=null;
        equalityExpression_return equalityExpression126 = null;

        equalityExpression_return equalityExpression129 = null;


        Object LOGICAL_AND127_tree=null;
        Object LINE_BREAK128_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1561);
            equalityExpression126=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression126.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LOGICAL_AND) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND127=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1593); 
            	    LOGICAL_AND127_tree = (Object)adaptor.create(LOGICAL_AND127);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND127_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:19: ( LINE_BREAK )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==LINE_BREAK) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK128=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1598); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1607);
            	    equalityExpression129=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression129.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:460:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE131=null;
        Token LINE_BREAK132=null;
        Token EQUAL133=null;
        Token LINE_BREAK134=null;
        Token CASE_EQUAL135=null;
        Token LINE_BREAK136=null;
        Token NOT_EQUAL137=null;
        Token LINE_BREAK138=null;
        Token MATCH139=null;
        Token LINE_BREAK140=null;
        Token NOT_MATCH141=null;
        Token LINE_BREAK142=null;
        relationalExpression_return relationalExpression130 = null;

        relationalExpression_return relationalExpression143 = null;


        Object COMPARE131_tree=null;
        Object LINE_BREAK132_tree=null;
        Object EQUAL133_tree=null;
        Object LINE_BREAK134_tree=null;
        Object CASE_EQUAL135_tree=null;
        Object LINE_BREAK136_tree=null;
        Object NOT_EQUAL137_tree=null;
        Object LINE_BREAK138_tree=null;
        Object MATCH139_tree=null;
        Object LINE_BREAK140_tree=null;
        Object NOT_MATCH141_tree=null;
        Object LINE_BREAK142_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:461:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1627);
            relationalExpression130=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression130.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop59:
            do {
                int alt59=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt59=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt59=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt59=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt59=1;
                    }
                    break;
                case MATCH:
                    {
                    alt59=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt59=1;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt58=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt58=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt58=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt58=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt58=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt58=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt58=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("463:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 58, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt58) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE131=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1661); 
            	            COMPARE131_tree = (Object)adaptor.create(COMPARE131);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE131_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:17: ( LINE_BREAK )*
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==LINE_BREAK) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK132=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1666); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop52;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL133=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1677); 
            	            EQUAL133_tree = (Object)adaptor.create(EQUAL133);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL133_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:16: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK134=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1683); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL135=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1694); 
            	            CASE_EQUAL135_tree = (Object)adaptor.create(CASE_EQUAL135);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL135_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:19: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);

            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }


            	                switch (alt54) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK136=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1698); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL137=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1709); 
            	            NOT_EQUAL137_tree = (Object)adaptor.create(NOT_EQUAL137);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL137_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:19: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK138=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1714); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:467:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH139=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1725); 
            	            MATCH139_tree = (Object)adaptor.create(MATCH139);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH139_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:467:16: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:467:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK140=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1731); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH141=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1742); 
            	            NOT_MATCH141_tree = (Object)adaptor.create(NOT_MATCH141);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH141_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:19: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);

            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }


            	                switch (alt57) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:468:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK142=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1747); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1762);
            	    relationalExpression143=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression143.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN145=null;
        Token LINE_BREAK146=null;
        Token GREATER_THAN147=null;
        Token LINE_BREAK148=null;
        Token LESS_OR_EQUAL149=null;
        Token LINE_BREAK150=null;
        Token GREATER_OR_EQUAL151=null;
        Token LINE_BREAK152=null;
        orExpression_return orExpression144 = null;

        orExpression_return orExpression153 = null;


        Object LESS_THAN145_tree=null;
        Object LINE_BREAK146_tree=null;
        Object GREATER_THAN147_tree=null;
        Object LINE_BREAK148_tree=null;
        Object LESS_OR_EQUAL149_tree=null;
        Object LINE_BREAK150_tree=null;
        Object GREATER_OR_EQUAL151_tree=null;
        Object LINE_BREAK152_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1783);
            orExpression144=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression144.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop65:
            do {
                int alt65=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt65=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt65=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt65=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt65=1;
                    }
                    break;

                }

                switch (alt65) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt64=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt64=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt64=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt64=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt64=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("479:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 64, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt64) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN145=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1817); 
            	            LESS_THAN145_tree = (Object)adaptor.create(LESS_THAN145);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN145_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:20: ( LINE_BREAK )*
            	            loop60:
            	            do {
            	                int alt60=2;
            	                int LA60_0 = input.LA(1);

            	                if ( (LA60_0==LINE_BREAK) ) {
            	                    alt60=1;
            	                }


            	                switch (alt60) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK146=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1823); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop60;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN147=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1834); 
            	            GREATER_THAN147_tree = (Object)adaptor.create(GREATER_THAN147);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN147_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:22: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);

            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }


            	                switch (alt61) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:480:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK148=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1839); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL149=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1850); 
            	            LESS_OR_EQUAL149_tree = (Object)adaptor.create(LESS_OR_EQUAL149);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL149_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:23: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK150=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1855); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL151=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1866); 
            	            GREATER_OR_EQUAL151_tree = (Object)adaptor.create(GREATER_OR_EQUAL151);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL151_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:25: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK152=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1870); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1885);
            	    orExpression153=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression153.getTree());

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
    // $ANTLR end relationalExpression

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR155=null;
        Token LINE_BREAK156=null;
        Token BOR157=null;
        Token LINE_BREAK158=null;
        andExpression_return andExpression154 = null;

        andExpression_return andExpression159 = null;


        Object BXOR155_tree=null;
        Object LINE_BREAK156_tree=null;
        Object BOR157_tree=null;
        Object LINE_BREAK158_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:490:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1905);
            andExpression154=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression154.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:491:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==BXOR) ) {
                    alt69=1;
                }
                else if ( (LA69_0==BOR) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==BXOR) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==BOR) ) {
            	        alt68=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("492:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR155=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1939); 
            	            BXOR155_tree = (Object)adaptor.create(BXOR155);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR155_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:15: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);

            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }


            	                switch (alt66) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:492:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK156=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1945); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR157=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1956); 
            	            BOR157_tree = (Object)adaptor.create(BOR157);
            	            root_0 = (Object)adaptor.becomeRoot(BOR157_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:14: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);

            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }


            	                switch (alt67) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:493:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK158=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1962); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1977);
            	    andExpression159=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression159.getTree());

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
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:500:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND161=null;
        Token LINE_BREAK162=null;
        shiftExpression_return shiftExpression160 = null;

        shiftExpression_return shiftExpression163 = null;


        Object BAND161_tree=null;
        Object LINE_BREAK162_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1997);
            shiftExpression160=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression160.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:502:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==BAND) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND161=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression2029); 
            	    BAND161_tree = (Object)adaptor.create(BAND161);
            	    root_0 = (Object)adaptor.becomeRoot(BAND161_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:13: ( LINE_BREAK )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==LINE_BREAK) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK162=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression2035); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression2044);
            	    shiftExpression163=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression163.getTree());

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
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT165=null;
        Token LINE_BREAK166=null;
        Token RIGHT_SHIFT167=null;
        Token LINE_BREAK168=null;
        additiveExpression_return additiveExpression164 = null;

        additiveExpression_return additiveExpression169 = null;


        Object LEFT_SHIFT165_tree=null;
        Object LINE_BREAK166_tree=null;
        Object RIGHT_SHIFT167_tree=null;
        Object LINE_BREAK168_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2066);
            additiveExpression164=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression164.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:513:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==LEFT_SHIFT) ) {
                    alt75=1;
                }
                else if ( (LA75_0==RIGHT_SHIFT) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==LEFT_SHIFT) ) {
            	        alt74=1;
            	    }
            	    else if ( (LA74_0==RIGHT_SHIFT) ) {
            	        alt74=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("514:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 74, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT165=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression2100); 
            	            LEFT_SHIFT165_tree = (Object)adaptor.create(LEFT_SHIFT165);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT165_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:20: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:514:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK166=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2105); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT167=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression2116); 
            	            RIGHT_SHIFT167_tree = (Object)adaptor.create(RIGHT_SHIFT167);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT167_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:20: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);

            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }


            	                switch (alt73) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK168=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression2120); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2135);
            	    additiveExpression169=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression169.getTree());

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
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:524:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS171=null;
        Token LINE_BREAK172=null;
        Token MINUS173=null;
        Token LINE_BREAK174=null;
        multiplicativeExpression_return multiplicativeExpression170 = null;

        multiplicativeExpression_return multiplicativeExpression175 = null;


        Object PLUS171_tree=null;
        Object LINE_BREAK172_tree=null;
        Object MINUS173_tree=null;
        Object LINE_BREAK174_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:525:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2157);
            multiplicativeExpression170=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression170.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:526:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==PLUS) ) {
                    alt79=1;
                }
                else if ( (LA79_0==MINUS) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==PLUS) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==MINUS) ) {
            	        alt78=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("527:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS171=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2191); 
            	            PLUS171_tree = (Object)adaptor.create(PLUS171);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS171_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:16: ( LINE_BREAK )*
            	            loop76:
            	            do {
            	                int alt76=2;
            	                int LA76_0 = input.LA(1);

            	                if ( (LA76_0==LINE_BREAK) ) {
            	                    alt76=1;
            	                }


            	                switch (alt76) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK172=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2198); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop76;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS173=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2209); 
            	            MINUS173_tree = (Object)adaptor.create(MINUS173);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS173_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:17: ( LINE_BREAK )*
            	            loop77:
            	            do {
            	                int alt77=2;
            	                int LA77_0 = input.LA(1);

            	                if ( (LA77_0==LINE_BREAK) ) {
            	                    alt77=1;
            	                }


            	                switch (alt77) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:528:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK174=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2216); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop77;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2231);
            	    multiplicativeExpression175=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression175.getTree());

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
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:535:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR177=null;
        Token LINE_BREAK178=null;
        Token DIV179=null;
        Token LINE_BREAK180=null;
        Token MOD181=null;
        Token LINE_BREAK182=null;
        powerExpression_return powerExpression176 = null;

        powerExpression_return powerExpression183 = null;


        Object STAR177_tree=null;
        Object LINE_BREAK178_tree=null;
        Object DIV179_tree=null;
        Object LINE_BREAK180_tree=null;
        Object MOD181_tree=null;
        Object LINE_BREAK182_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2251);
            powerExpression176=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression176.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:537:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop84:
            do {
                int alt84=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt84=1;
                    }
                    break;
                case DIV:
                    {
                    alt84=1;
                    }
                    break;
                case MOD:
                    {
                    alt84=1;
                    }
                    break;

                }

                switch (alt84) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt83=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt83=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt83=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt83=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("538:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 83, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt83) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR177=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2285); 
            	            STAR177_tree = (Object)adaptor.create(STAR177);
            	            root_0 = (Object)adaptor.becomeRoot(STAR177_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:15: ( LINE_BREAK )*
            	            loop80:
            	            do {
            	                int alt80=2;
            	                int LA80_0 = input.LA(1);

            	                if ( (LA80_0==LINE_BREAK) ) {
            	                    alt80=1;
            	                }


            	                switch (alt80) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:538:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK178=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2291); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop80;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV179=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2302); 
            	            DIV179_tree = (Object)adaptor.create(DIV179);
            	            root_0 = (Object)adaptor.becomeRoot(DIV179_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:14: ( LINE_BREAK )*
            	            loop81:
            	            do {
            	                int alt81=2;
            	                int LA81_0 = input.LA(1);

            	                if ( (LA81_0==LINE_BREAK) ) {
            	                    alt81=1;
            	                }


            	                switch (alt81) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK180=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2308); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop81;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD181=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2319); 
            	            MOD181_tree = (Object)adaptor.create(MOD181);
            	            root_0 = (Object)adaptor.becomeRoot(MOD181_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:14: ( LINE_BREAK )*
            	            loop82:
            	            do {
            	                int alt82=2;
            	                int LA82_0 = input.LA(1);

            	                if ( (LA82_0==LINE_BREAK) ) {
            	                    alt82=1;
            	                }


            	                switch (alt82) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:540:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK182=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2325); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop82;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2340);
            	    powerExpression183=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression183.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start powerExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:548:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER185=null;
        Token LINE_BREAK186=null;
        bnotExpression_return bnotExpression184 = null;

        bnotExpression_return bnotExpression187 = null;


        Object POWER185_tree=null;
        Object LINE_BREAK186_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:549:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2361);
            bnotExpression184=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression184.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:550:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==POWER) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER185=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2396); 
            	    POWER185_tree = (Object)adaptor.create(POWER185);
            	    root_0 = (Object)adaptor.becomeRoot(POWER185_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:14: ( LINE_BREAK )*
            	    loop85:
            	    do {
            	        int alt85=2;
            	        int LA85_0 = input.LA(1);

            	        if ( (LA85_0==LINE_BREAK) ) {
            	            alt85=1;
            	        }


            	        switch (alt85) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:551:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK186=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2402); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop85;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2411);
            	    bnotExpression187=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression187.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:557:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT188=null;
        Token LINE_BREAK189=null;
        Token NOT190=null;
        Token LINE_BREAK191=null;
        command_return command192 = null;


        Object BNOT188_tree=null;
        Object LINE_BREAK189_tree=null;
        Object NOT190_tree=null;
        Object LINE_BREAK191_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop89:
            do {
                int alt89=3;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==BNOT) ) {
                    alt89=1;
                }
                else if ( (LA89_0==NOT) ) {
                    alt89=2;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT188=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2433); 
            	    BNOT188_tree = (Object)adaptor.create(BNOT188);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT188_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:15: ( LINE_BREAK )*
            	    loop87:
            	    do {
            	        int alt87=2;
            	        int LA87_0 = input.LA(1);

            	        if ( (LA87_0==LINE_BREAK) ) {
            	            alt87=1;
            	        }


            	        switch (alt87) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:558:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK189=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2439); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop87;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT190=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2449); 
            	    NOT190_tree = (Object)adaptor.create(NOT190);
            	    root_0 = (Object)adaptor.becomeRoot(NOT190_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:13: ( LINE_BREAK )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);

            	        if ( (LA88_0==LINE_BREAK) ) {
            	            alt88=1;
            	        }


            	        switch (alt88) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:559:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK191=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2455); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop88;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2469);
            command192=command();
            _fsp--;

            adaptor.addChild(root_0, command192.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:563:1: command : ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] ) ( DOT method[false] )* ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token string_literal194=null;
        Token DOT201=null;
        literal_return literal195 = null;

        boolean_expression_return boolean_expression196 = null;

        block_expression_return block_expression197 = null;

        if_expression_return if_expression198 = null;

        unless_expression_return unless_expression199 = null;

        atom_return atom200 = null;

        method_return method202 = null;


        Object string_literal193_tree=null;
        Object string_literal194_tree=null;
        Object DOT201_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:3: ( ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] ) ( DOT method[false] )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] ) ( DOT method[false] )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] )
            int alt90=8;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt90=1;
                }
                break;
            case 135:
                {
                alt90=2;
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
                alt90=3;
                }
                break;
            case 121:
            case 122:
            case 123:
                {
                alt90=4;
                }
                break;
            case 119:
                {
                alt90=5;
                }
                break;
            case IF_MODIFIER:
                {
                alt90=6;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt90=7;
                }
                break;
            case ID:
                {
                alt90=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("565:3: ( 'expression0' | 'expression1' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom[true] )", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:4: 'expression0'
                    {
                    string_literal193=(Token)input.LT(1);
                    match(input,134,FOLLOW_134_in_command2484); 
                    string_literal193_tree = (Object)adaptor.create(string_literal193);
                    adaptor.addChild(root_0, string_literal193_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:20: 'expression1'
                    {
                    string_literal194=(Token)input.LT(1);
                    match(input,135,FOLLOW_135_in_command2488); 
                    string_literal194_tree = (Object)adaptor.create(string_literal194);
                    adaptor.addChild(root_0, string_literal194_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2491);
                    literal195=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal195.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:43: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2493);
                    boolean_expression196=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression196.getTree());

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:63: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2496);
                    block_expression197=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression197.getTree());

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:80: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2498);
                    if_expression198=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression198.getTree());

                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:94: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2500);
                    unless_expression199=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression199.getTree());

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:112: atom[true]
                    {
                    pushFollow(FOLLOW_atom_in_command2502);
                    atom200=atom(true);
                    _fsp--;

                    adaptor.addChild(root_0, atom200.getTree());

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:124: ( DOT method[false] )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==DOT) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:565:125: DOT method[false]
            	    {
            	    DOT201=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_command2507); 
            	    DOT201_tree = (Object)adaptor.create(DOT201);
            	    root_0 = (Object)adaptor.becomeRoot(DOT201_tree, root_0);

            	    pushFollow(FOLLOW_method_in_command2510);
            	    method202=method(false);
            	    _fsp--;

            	    adaptor.addChild(root_0, method202.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:1: atom[boolean topLevel] : methodExpression[topLevel] ;
    public final atom_return atom(boolean topLevel) throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodExpression_return methodExpression203 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:26: ( methodExpression[topLevel] )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:567:26: methodExpression[topLevel]
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodExpression_in_atom2524);
            methodExpression203=methodExpression(topLevel);
            _fsp--;

            adaptor.addChild(root_0, methodExpression203.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:568:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );
    public final methodExpression_return methodExpression(boolean topLevel) throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variable_return variable204 = null;

        method_return method205 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:9: ( variable | method[topLevel] )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ID) ) {
                int LA92_1 = input.LA(2);

                if ( (isDefinedVar(input.LT(1).getText())) ) {
                    alt92=1;
                }
                else if ( (true) ) {
                    alt92=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("568:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 92, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("568:1: methodExpression[boolean topLevel] : ( variable | method[topLevel] );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:9: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_methodExpression2539);
                    variable204=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable204.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:569:18: method[topLevel]
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_method_in_methodExpression2541);
                    method205=method(topLevel);
                    _fsp--;

                    adaptor.addChild(root_0, method205.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID206=null;

        Object ID206_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:11: ({...}? ID -> ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:11: {...}? ID
            {
            if ( !(isDefinedVar(input.LT(1).getText())) ) {
                throw new FailedPredicateException(input, "variable", "isDefinedVar(input.LT(1).getText())");
            }
            ID206=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2550); 
            stream_ID.add(ID206);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 570:53: -> ^( VARIABLE ID )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:570:56: ^( VARIABLE ID )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method(boolean topLevel) throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID207=null;
        Token ID208=null;
        open_args_return open_args209 = null;


        Object ID207_tree=null;
        Object ID208_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:28: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:28: {...}? ID
                    {
                    if ( !(!isDefinedVar(input.LT(1).getText())) ) {
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(input.LT(1).getText())");
                    }
                    ID207=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2568); 
                    stream_ID.add(ID207);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 571:71: -> ^( CALL ID )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:74: ^( CALL ID )
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:572:17: ID open_args
                    {
                    ID208=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2594); 
                    stream_ID.add(ID208);

                    pushFollow(FOLLOW_open_args_in_method2596);
                    open_args209=open_args();
                    _fsp--;

                    stream_open_args.add(open_args209.getTree());

                    // AST REWRITE
                    // elements: ID, open_args
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 572:30: -> ^( CALL ID open_args )
                    {
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:572:33: ^( CALL ID open_args )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:1: primary : literal ;
    public final primary_return primary() throws RecognitionException {
        primary_return retval = new primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        literal_return literal210 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:11: ( literal )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:11: literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_literal_in_primary2622);
            literal210=literal();
            _fsp--;

            adaptor.addChild(root_0, literal210.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:1: command_call : command1 ;
    public final command_call_return command_call() throws RecognitionException {
        command_call_return retval = new command_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        command1_return command1211 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:577:4: ( command1 )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:577:4: command1
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_command1_in_command_call2632);
            command1211=command1();
            _fsp--;

            adaptor.addChild(root_0, command1211.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:1: command1 : operation1 ( command_args ) ;
    public final command1_return command1() throws RecognitionException {
        command1_return retval = new command1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operation1_return operation1212 = null;

        command_args_return command_args213 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:11: ( operation1 ( command_args ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:11: operation1 ( command_args )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operation1_in_command12644);
            operation1212=operation1();
            _fsp--;

            adaptor.addChild(root_0, operation1212.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:22: ( command_args )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:581:23: command_args
            {
            pushFollow(FOLLOW_command_args_in_command12647);
            command_args213=command_args();
            _fsp--;

            adaptor.addChild(root_0, command_args213.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:583:1: command_args : open_args ;
    public final command_args_return command_args() throws RecognitionException {
        command_args_return retval = new command_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        open_args_return open_args214 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:4: ( open_args )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:584:4: open_args
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_open_args_in_command_args2659);
            open_args214=open_args();
            _fsp--;

            adaptor.addChild(root_0, open_args214.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal216=null;
        Token char_literal217=null;
        Token char_literal218=null;
        Token char_literal220=null;
        call_args_return call_args215 = null;

        call_args_return call_args219 = null;


        Object char_literal216_tree=null;
        Object char_literal217_tree=null;
        Object char_literal218_tree=null;
        Object char_literal220_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:4: ( call_args | '(' ')' | '(' call_args ')' )
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=HEREDOC_STRING && LA94_0<=FLOAT)||LA94_0==SYMBOL||(LA94_0>=IF_MODIFIER && LA94_0<=UNLESS_MODIFIER)||LA94_0==ID||(LA94_0>=BNOT && LA94_0<=REGEX)||(LA94_0>=SINGLE_QUOTE_STRING && LA94_0<=DOUBLE_QUOTE_STRING)||LA94_0==119||(LA94_0>=121 && LA94_0<=123)||(LA94_0>=133 && LA94_0<=135)) ) {
                alt94=1;
            }
            else if ( (LA94_0==LPAREN) ) {
                int LA94_2 = input.LA(2);

                if ( (LA94_2==RPAREN) ) {
                    alt94=2;
                }
                else if ( ((LA94_2>=HEREDOC_STRING && LA94_2<=FLOAT)||LA94_2==SYMBOL||(LA94_2>=IF_MODIFIER && LA94_2<=UNLESS_MODIFIER)||LA94_2==ID||(LA94_2>=BNOT && LA94_2<=REGEX)||(LA94_2>=SINGLE_QUOTE_STRING && LA94_2<=DOUBLE_QUOTE_STRING)||LA94_2==119||(LA94_2>=121 && LA94_2<=123)||(LA94_2>=133 && LA94_2<=135)) ) {
                    alt94=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("586:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 94, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("586:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:587:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_args_in_open_args2669);
                    call_args215=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args215.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:588:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal216=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2679); 
                    char_literal217=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2682); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:589:10: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal218=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2694); 
                    pushFollow(FOLLOW_call_args_in_open_args2697);
                    call_args219=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args219.getTree());
                    char_literal220=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2701); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:590:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        args_return args221 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:4: ( args -> ^( ARG args ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2710);
            args221=args();
            _fsp--;

            stream_args.add(args221.getTree());

            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 591:10: -> ^( ARG args )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:591:13: ^( ARG args )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal223=null;
        arg_return arg222 = null;

        arg_return arg224 = null;


        Object char_literal223_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:8: ( arg ( ',' arg )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args2728);
            arg222=arg();
            _fsp--;

            adaptor.addChild(root_0, arg222.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:12: ( ',' arg )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==COMMA) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:593:13: ',' arg
            	    {
            	    char_literal223=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2731); 
            	    pushFollow(FOLLOW_arg_in_args2734);
            	    arg224=arg();
            	    _fsp--;

            	    adaptor.addChild(root_0, arg224.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        definedExpression_return definedExpression225 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:7: ( definedExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:595:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_definedExpression_in_arg2745);
            definedExpression225=definedExpression();
            _fsp--;

            adaptor.addChild(root_0, definedExpression225.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set226=null;

        Object set226_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:18: ( ID | CONSTANT | FID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set226=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set226));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID227=null;
        Token CONSTANT228=null;
        Token FID229=null;
        op_return op230 = null;


        Object ID227_tree=null;
        Object CONSTANT228_tree=null;
        Object FID229_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:17: ( ID | CONSTANT | FID | op )
            int alt96=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt96=1;
                }
                break;
            case CONSTANT:
                {
                alt96=2;
                }
                break;
            case FID:
                {
                alt96=3;
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
            case 129:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("602:1: operation2 : ( ID | CONSTANT | FID | op );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID227=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22783); 
                    ID227_tree = (Object)adaptor.create(ID227);
                    adaptor.addChild(root_0, ID227_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT228=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22787); 
                    CONSTANT228_tree = (Object)adaptor.create(CONSTANT228);
                    adaptor.addChild(root_0, CONSTANT228_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:33: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID229=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22791); 
                    FID229_tree = (Object)adaptor.create(FID229);
                    adaptor.addChild(root_0, FID229_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:602:39: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation22795);
                    op230=op();
                    _fsp--;

                    adaptor.addChild(root_0, op230.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID231=null;
        Token FID232=null;
        op_return op233 = null;


        Object ID231_tree=null;
        Object FID232_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:17: ( ID | FID | op )
            int alt97=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt97=1;
                }
                break;
            case FID:
                {
                alt97=2;
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
            case 129:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("605:1: operation3 : ( ID | FID | op );", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID231=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32811); 
                    ID231_tree = (Object)adaptor.create(ID231);
                    adaptor.addChild(root_0, ID231_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:22: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID232=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation32815); 
                    FID232_tree = (Object)adaptor.create(FID232);
                    adaptor.addChild(root_0, FID232_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:28: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation32819);
                    op233=op();
                    _fsp--;

                    adaptor.addChild(root_0, op233.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID234=null;

        Object ID234_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:7: ( ID -> ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:7: ID
            {
            ID234=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2833); 
            stream_ID.add(ID234);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 608:10: -> ^( VARIABLE ID )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:13: ^( VARIABLE ID )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression235 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:609:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2849);
            expression235=expression();
            _fsp--;

            adaptor.addChild(root_0, expression235.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:1: literal : ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT236=null;
        Token FLOAT237=null;
        Token ARRAY239=null;
        Token SYMBOL240=null;
        Token REGEX241=null;
        string_return string238 = null;


        Object INT236_tree=null;
        Object FLOAT237_tree=null;
        Object ARRAY239_tree=null;
        Object SYMBOL240_tree=null;
        Object REGEX241_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:11: ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX )
            int alt98=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt98=1;
                }
                break;
            case FLOAT:
                {
                alt98=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt98=3;
                }
                break;
            case ARRAY:
                {
                alt98=4;
                }
                break;
            case SYMBOL:
                {
                alt98=5;
                }
                break;
            case REGEX:
                {
                alt98=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("613:1: literal : ( INT | FLOAT | string | ARRAY | SYMBOL | REGEX );", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT236=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2859); 
                    INT236_tree = (Object)adaptor.create(INT236);
                    adaptor.addChild(root_0, INT236_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT237=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2861); 
                    FLOAT237_tree = (Object)adaptor.create(FLOAT237);
                    adaptor.addChild(root_0, FLOAT237_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2863);
                    string238=string();
                    _fsp--;

                    adaptor.addChild(root_0, string238.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY239=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2865); 
                    ARRAY239_tree = (Object)adaptor.create(ARRAY239);
                    adaptor.addChild(root_0, ARRAY239_tree);


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:34: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL240=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2867); 
                    SYMBOL240_tree = (Object)adaptor.create(SYMBOL240);
                    adaptor.addChild(root_0, SYMBOL240_tree);


                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:41: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX241=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2869); 
                    REGEX241_tree = (Object)adaptor.create(REGEX241);
                    adaptor.addChild(root_0, REGEX241_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:681:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set242=null;

        Object set242_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:681:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set242=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set242));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal243=null;
        Token char_literal245=null;
        assoc_list_return assoc_list244 = null;


        Object char_literal243_tree=null;
        Object char_literal245_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:8: ( '{' assoc_list '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal243=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3819); 
            char_literal243_tree = (Object)adaptor.create(char_literal243);
            root_0 = (Object)adaptor.becomeRoot(char_literal243_tree, root_0);

            pushFollow(FOLLOW_assoc_list_in_hash3822);
            assoc_list244=assoc_list();
            _fsp--;

            adaptor.addChild(root_0, assoc_list244.getTree());
            char_literal245=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3824); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:753:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assocs_return assocs246 = null;

        trailer_return trailer247 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:754:4: ( assocs trailer )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:754:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list3833);
            assocs246=assocs();
            _fsp--;

            adaptor.addChild(root_0, assocs246.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3835);
            trailer247=trailer();
            _fsp--;

            adaptor.addChild(root_0, trailer247.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal249=null;
        assoc_return assoc248 = null;

        assoc_return assoc250 = null;


        Object char_literal249_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:10: ( assoc ( ',' assoc )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs3844);
            assoc248=assoc();
            _fsp--;

            adaptor.addChild(root_0, assoc248.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:16: ( ',' assoc )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==COMMA) ) {
                    int LA99_2 = input.LA(2);

                    if ( ((LA99_2>=HEREDOC_STRING && LA99_2<=FLOAT)||LA99_2==SYMBOL||(LA99_2>=IF_MODIFIER && LA99_2<=UNLESS_MODIFIER)||LA99_2==ID||(LA99_2>=BNOT && LA99_2<=REGEX)||(LA99_2>=SINGLE_QUOTE_STRING && LA99_2<=DOUBLE_QUOTE_STRING)||LA99_2==119||(LA99_2>=121 && LA99_2<=123)||(LA99_2>=133 && LA99_2<=135)) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:755:18: ',' assoc
            	    {
            	    char_literal249=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3848); 
            	    pushFollow(FOLLOW_assoc_in_assocs3851);
            	    assoc250=assoc();
            	    _fsp--;

            	    adaptor.addChild(root_0, assoc250.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:1: assoc : arg ( ASSOC | ',' ) arg ;
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set252=null;
        arg_return arg251 = null;

        arg_return arg253 = null;


        Object set252_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:17: ( arg ( ASSOC | ',' ) arg )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:17: arg ( ASSOC | ',' ) arg
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_assoc3869);
            arg251=arg();
            _fsp--;

            adaptor.addChild(root_0, arg251.getTree());
            set252=(Token)input.LT(1);
            if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3871);    throw mse;
            }

            pushFollow(FOLLOW_arg_in_assoc3878);
            arg253=arg();
            _fsp--;

            adaptor.addChild(root_0, arg253.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:761:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK254=null;
        Token char_literal255=null;

        Object LINE_BREAK254_tree=null;
        Object char_literal255_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:761:29: ( | LINE_BREAK | ',' )
            int alt100=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt100=1;
                }
                break;
            case LINE_BREAK:
                {
                alt100=2;
                }
                break;
            case COMMA:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("761:1: trailer : ( | LINE_BREAK | ',' );", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:761:29: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:761:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK254=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer3899); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:761:45: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal255=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer3904); 

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
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\44\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\175\2\u0087\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\122\uffff\1\3\3\uffff\2\3",
            "\2\4\4\uffff\1\4\14\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\21\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
            "\3\uffff\4\4",
            "\2\4\4\uffff\1\4\14\uffff\2\4\3\uffff\1\1\1\2\3\uffff\1\4\45"+
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
            return "()* loopback of 265:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\45\1\14\3\uffff";
    static final String DFA17_maxS =
        "\1\176\1\u0087\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\116\uffff\1\2\11\uffff\1\3",
            "\2\4\4\uffff\1\4\14\uffff\2\4\3\uffff\1\4\1\1\3\uffff\1\4\45"+
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
            return "307:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
    static final String DFA93_eotS =
        "\104\uffff";
    static final String DFA93_eofS =
        "\1\uffff\1\2\102\uffff";
    static final String DFA93_minS =
        "\1\51\1\13\1\uffff\1\14\1\uffff\1\14\1\13\3\14\72\0";
    static final String DFA93_maxS =
        "\1\51\1\u0087\1\uffff\1\u0087\1\uffff\1\u0087\1\u0081\3\u0087\72"+
        "\0";
    static final String DFA93_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\77\uffff";
    static final String DFA93_specialS =
        "\104\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\1",
            "\1\2\2\4\4\uffff\1\4\12\uffff\2\2\1\3\1\5\5\2\1\uffff\1\2\1"+
            "\uffff\1\4\15\2\16\uffff\12\2\5\4\20\uffff\2\4\3\uffff\1\2\2"+
            "\uffff\1\2\1\uffff\1\4\1\2\3\uffff\2\2\2\uffff\1\4\1\2\3\4\3"+
            "\2\3\uffff\2\2\1\uffff\3\4",
            "",
            "\1\17\1\16\4\uffff\1\21\14\uffff\1\25\1\26\4\uffff\1\2\3\uffff"+
            "\1\27\45\uffff\1\11\1\12\1\15\1\20\1\22\20\uffff\2\17\21\uffff"+
            "\1\24\1\uffff\3\23\3\uffff\1\6\1\30\3\uffff\1\7\1\10\1\13\1"+
            "\14",
            "",
            "\2\2\4\uffff\1\2\14\uffff\2\2\4\uffff\1\2\3\uffff\1\2\45\uffff"+
            "\5\2\20\uffff\2\2\21\uffff\1\2\1\uffff\3\31\3\uffff\2\2\3\uffff"+
            "\4\2",
            "\1\35\2\uffff\1\33\1\34\15\uffff\2\35\12\uffff\1\32\15\35\25"+
            "\uffff\4\35\42\uffff\1\35\16\uffff\1\35",
            "\1\47\1\46\4\uffff\1\51\14\uffff\1\55\1\56\4\uffff\1\36\3\uffff"+
            "\1\57\45\uffff\1\41\1\42\1\45\1\50\1\52\20\uffff\2\47\21\uffff"+
            "\1\54\1\uffff\3\53\10\uffff\1\37\1\40\1\43\1\44",
            "\1\66\1\65\4\uffff\1\70\14\uffff\1\74\1\75\10\uffff\1\76\45"+
            "\uffff\1\60\1\61\1\64\1\67\1\71\20\uffff\2\66\21\uffff\1\73"+
            "\1\uffff\3\72\12\uffff\1\62\1\63",
            "\1\17\1\16\4\uffff\1\21\14\uffff\1\25\1\26\4\uffff\1\77\3\uffff"+
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

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "571:1: method[boolean topLevel] : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program227 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_statement_list_in_program231 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_program233 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list247 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list250 = new BitSet(new long[]{0x0000023180043000L,0x8E800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_statement_in_statement_list253 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_expression_in_statement279 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement282 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_set_in_modifier_line322 = new BitSet(new long[]{0x0000022180043000L,0x8E800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_line_break_in_modifier_line336 = new BitSet(new long[]{0x0000022180043000L,0x8E800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_expression_in_modifier_line340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_block_expression415 = new BitSet(new long[]{0x0000021180043000L,0x8F800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_body_in_block_expression417 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_block_expression419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body426 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_statement_list_in_body430 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_terminal_in_body432 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression455 = new BitSet(new long[]{0x0000020180043000L,0x8E800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_expression_in_if_expression460 = new BitSet(new long[]{0x0000002000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression462 = new BitSet(new long[]{0x0000021180043000L,0xBF800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_body_in_if_expression475 = new BitSet(new long[]{0x0000000000000000L,0x3100000000000000L});
    public static final BitSet FOLLOW_124_in_if_expression478 = new BitSet(new long[]{0x0000020180043000L,0x8E800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_expression_in_if_expression482 = new BitSet(new long[]{0x0000002000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression484 = new BitSet(new long[]{0x0000021180043000L,0xBF800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_body_in_if_expression488 = new BitSet(new long[]{0x0000000000000000L,0x3100000000000000L});
    public static final BitSet FOLLOW_125_in_if_expression502 = new BitSet(new long[]{0x0000021180043000L,0x8F800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_body_in_if_expression506 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_if_expression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator571 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator574 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator576 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator581 = new BitSet(new long[]{0x0000002000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_seperator584 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator586 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression596 = new BitSet(new long[]{0x0000000000000000L,0x0E00000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression598 = new BitSet(new long[]{0x0000002000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_126_in_unless_expression601 = new BitSet(new long[]{0x0000021180043000L,0xAF800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_COLON_in_unless_expression603 = new BitSet(new long[]{0x0000021180043000L,0xAF800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_line_break_in_unless_expression605 = new BitSet(new long[]{0x0000021180043000L,0xAF800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_body_in_unless_expression617 = new BitSet(new long[]{0x0000000000000000L,0x2100000000000000L});
    public static final BitSet FOLLOW_125_in_unless_expression630 = new BitSet(new long[]{0x0000021180043000L,0x8F800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_body_in_unless_expression632 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_unless_expression645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_expression709 = new BitSet(new long[]{0x007FFE006000C800L,0x000400000000F000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fitem_in_expression712 = new BitSet(new long[]{0x007FFE006000C800L,0x000400000000F000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fitem_in_expression714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_methodDefinition734 = new BitSet(new long[]{0x000002200000C000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition738 = new BitSet(new long[]{0x000002200000C000L,0x0000400000000000L});
    public static final BitSet FOLLOW_singleton_in_methodDefinition744 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_dot_or_colon_in_methodDefinition746 = new BitSet(new long[]{0x000002000000C000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition750 = new BitSet(new long[]{0x0020023000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition754 = new BitSet(new long[]{0x0000023180043000L,0x8F800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition757 = new BitSet(new long[]{0x0000023180043000L,0x8F800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition763 = new BitSet(new long[]{0x0000003000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinition767 = new BitSet(new long[]{0x0000003000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_methodDefinition772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_singleton783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_singleton785 = new BitSet(new long[]{0x0000020180043000L,0x8E800030000F8000L,0x00000000000000F1L});
    public static final BitSet FOLLOW_expression_in_singleton788 = new BitSet(new long[]{0x0000002000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_opt_nl_in_singleton790 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_singleton792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_opt_nl811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dot_or_colon0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist849 = new BitSet(new long[]{0x0020022000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist851 = new BitSet(new long[]{0x0000002000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist855 = new BitSet(new long[]{0x0000002000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist878 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args892 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args894 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args910 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args913 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_rest_arg_in_f_args922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg963 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_f_rest_arg966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_f_rest_arg971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_opt_args987 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_f_opt_args989 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_arg_in_f_opt_args992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_130_in_andorExpression1206 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1211 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_131_in_andorExpression1222 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1227 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_132_in_notExpression1260 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1267 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_definedExpression1292 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1333 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_set_in_assignmentExpression1335 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1397 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1400 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1402 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1422 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1441 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1445 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1456 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1460 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1475 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1527 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1532 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1593 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1598 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1627 = new BitSet(new long[]{0x00003C0000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1661 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1666 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1677 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1683 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1694 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1698 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1709 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1714 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1725 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1731 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1742 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1747 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1762 = new BitSet(new long[]{0x00003C0000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1783 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1817 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1823 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1834 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1839 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1850 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1855 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1866 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1870 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1885 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1939 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1945 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_BOR_in_orExpression1956 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1962 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1997 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_BAND_in_andExpression2029 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression2035 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression2044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2066 = new BitSet(new long[]{0x0004000000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression2100 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2105 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression2116 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression2120 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2135 = new BitSet(new long[]{0x0004000000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2157 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2191 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2198 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2209 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2216 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2231 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2251 = new BitSet(new long[]{0x0020000060000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2285 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2291 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2302 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2308 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2319 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2325 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2340 = new BitSet(new long[]{0x0020000060000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2361 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2396 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2402 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2411 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2433 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2439 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2449 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2455 = new BitSet(new long[]{0x0000022180043000L,0x0E800030000F8000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_command_in_bnotExpression2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_command2484 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_135_in_command2488 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_literal_in_command2491 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2493 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2496 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2498 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2500 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_atom_in_command2502 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_DOT_in_command2507 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_method_in_command2510 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2594 = new BitSet(new long[]{0x0000020180043000L,0x0E804030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_open_args_in_method2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command1_in_command_call2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation1_in_command12644 = new BitSet(new long[]{0x0000020180043000L,0x0E804030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_command_args_in_command12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_args_in_command_args2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2679 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2694 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_call_args_in_open_args2697 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2728 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2731 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_arg_in_args2734 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation32815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation32819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3819 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_assoc_list_in_hash3822 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3833 = new BitSet(new long[]{0x0000002000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3844 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3848 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_assoc_in_assocs3851 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_arg_in_assoc3869 = new BitSet(new long[]{0x0000000000000000L,0x0008100000000000L});
    public static final BitSet FOLLOW_set_in_assoc3871 = new BitSet(new long[]{0x0000020180043000L,0x0E800030000F8000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_arg_in_assoc3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer3904 = new BitSet(new long[]{0x0000000000000002L});

}