// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-16 15:25:55

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "HASH", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "BXOR_ASSIGN", "ASSOC", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "COLON2", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'[]='", "'and'", "'or'", "'not'", "'expression0'", "'expression1'", "'expression2'"
    };
    public static final int COMMA=108;
    public static final int GREATER_THAN=42;
    public static final int LOGICAL_AND_ASSIGN=62;
    public static final int MINUS=48;
    public static final int ESCAPE_INT=91;
    public static final int ARRAY=78;
    public static final int HASH=79;
    public static final int HEX_PART=87;
    public static final int LOGICAL_OR=68;
    public static final int LESS_THAN=44;
    public static final int META_PART=89;
    public static final int LEADING0_NUMBER=86;
    public static final int BOR=73;
    public static final int LEADING_MARK_DECIMAL=84;
    public static final int BINARY=83;
    public static final int COLON2=110;
    public static final int EMPTY_ARRAY=107;
    public static final int LCURLY=97;
    public static final int LINE_BREAK=35;
    public static final int CONSTANT=15;
    public static final int LEFT_SHIFT=12;
    public static final int IF_MODIFIER=29;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int ESCAPE_INT_PART=90;
    public static final int REGEX=80;
    public static final int SYMBOL=17;
    public static final int RPAREN=104;
    public static final int CONTROL_PART=88;
    public static final int DOUBLE_QUOTE_STRING=94;
    public static final int STAR_ASSIGN=61;
    public static final int PLUS=47;
    public static final int HEREDOC_INDENT_BEGIN=100;
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
    public static final int DOUBLE_STRING_CHAR=96;
    public static final int RIGHT_SHIFT_ASSIGN=60;
    public static final int NON_LEADING0_NUMBER=92;
    public static final int SINGLE_QUOTE_STRING=93;
    public static final int HEREDOC_BEGIN=99;
    public static final int LBRACK=105;
    public static final int SEMI=34;
    public static final int DIV_ASSIGN=54;
    public static final int MRHS=23;
    public static final int BLOCK_ARG=21;
    public static final int EQUAL=39;
    public static final int LOGICAL_AND=69;
    public static final int COLON=109;
    public static final int DIV=27;
    public static final int HEX=82;
    public static final int SINGLETON_METHOD=25;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=66;
    public static final int BNOT=75;
    public static final int LOGICAL_OR_ASSIGN=63;
    public static final int ASSOC=102;
    public static final int FLOAT=14;
    public static final int OCTAL=81;
    public static final int MOD=28;
    public static final int PLUS_ASSIGN=56;
    public static final int QUESTION=65;
    public static final int UNTIL_MODIFIER=32;
    public static final int BLOCK=18;
    public static final int RCURLY=98;
    public static final int INT=77;
    public static final int BOR_ASSIGN=57;
    public static final int ASSIGN=51;
    public static final int LESS_OR_EQUAL=45;
    public static final int LPAREN=103;
    public static final int BAND=74;
    public static final int HEREDOC_STRING=13;
    public static final int NOT_MATCH=71;
    public static final int ID=37;
    public static final int NOT_EQUAL=70;
    public static final int BAND_ASSIGN=58;
    public static final int COMPLEMENT_ASSIGN=53;
    public static final int RIGHT_SHIFT=46;
    public static final int POWER=50;
    public static final int BXOR_ASSIGN=101;
    public static final int FID=16;
    public static final int NESTED_LHS=24;
    public static final int COMMENT=112;
    public static final int LEFT_SHIFT_ASSIGN=59;
    public static final int MATCH=41;
    public static final int WHILE_MODIFIER=31;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=111;
    public static final int EXP_PART=85;
    public static final int COMPARE=38;
    public static final int IF=7;
    public static final int ARG=11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int EOF=-1;
    public static final int CALL=10;
    public static final int RBRACK=106;
    public static final int RESCUE_MODIFIER=33;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=49;
    public static final int BXOR=72;
    public static final int NOT=76;
    public static final int SINGLE_STRING_CHAR=95;

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==113||(LA3_0>=115 && LA3_0<=117)||LA3_0==121||(LA3_0>=125 && LA3_0<=128)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("240:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program212);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program216);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program218);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:244:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
    public final statement_list_return statement_list() throws RecognitionException {
        statement_list_return retval = new statement_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement4 = null;

        terminal_return terminal5 = null;

        statement_return statement6 = null;

        List list_statement=new ArrayList();
        List list_terminal=new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list232);
            statement4=statement();
            _fsp--;

            list_statement.add(statement4.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:16: ( terminal )+ statement
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:16: ( terminal )+
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
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list235);
            	    	    terminal5=terminal();
            	    	    _fsp--;

            	    	    list_terminal.add(terminal5.getTree());

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

            	    pushFollow(FOLLOW_statement_in_statement_list238);
            	    statement6=statement();
            	    _fsp--;

            	    list_statement.add(statement6.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            int i_0 = 0;
            retval.tree = root_0;
            root_0 = (Object)adaptor.nil();
            // 245:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:245:58: ( statement )*
                {
                int n_1 = list_statement == null ? 0 : list_statement.size();
                 


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, list_statement.get(i_1));

                }
                }

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:252:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line=new ArrayList();
        List list_expression=new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:253:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:253:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement264);
            expression7=expression();
            _fsp--;

            list_expression.add(expression7.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:253:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:253:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement267);
            	    modifier_line8=modifier_line();
            	    _fsp--;

            	    list_modifier_line.add(modifier_line8.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            int i_0 = 0;
            retval.tree = root_0;
            root_0 = (Object)adaptor.nil();
            // 253:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:253:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, list_expression.get(i_0));
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:253:59: ( modifier_line )*
                {
                int n_1 = list_modifier_line == null ? 0 : list_modifier_line.size();
                 


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, list_modifier_line.get(i_1));

                }
                }

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:256:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line307);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line321);
            	    line_break10=line_break();
            	    _fsp--;

            	    adaptor.addChild(root_0, line_break10.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_modifier_line325);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)input.LT(1);
            match(input,113,FOLLOW_113_in_block_expression400); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);

            pushFollow(FOLLOW_body_in_block_expression402);
            body13=body();
            _fsp--;

            adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,114,FOLLOW_114_in_block_expression404); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==114||(LA10_0>=118 && LA10_0<=119)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==113||(LA10_0>=115 && LA10_0<=117)||LA10_0==121||(LA10_0>=125 && LA10_0<=128)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("277:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body411); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body415);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body417);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=115 && input.LA(1)<=117) ) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:280:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        List list_seperator=new ArrayList();
        List list_expression=new ArrayList();
        List list_body=new ArrayList();
        List list_119=new ArrayList();
        List list_114=new ArrayList();
        List list_118=new ArrayList();
        List list_IF_MODIFIER=new ArrayList();
        Object string_literal19_tree=null;
        Object string_literal21_tree=null;
        Object string_literal23_tree=null;
        Object string_literal24_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression440); 
            list_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression445);
            e0=expression();
            _fsp--;

            list_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression447);
            seperator20=seperator();
            _fsp--;

            list_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression460);
            body0=body();
            _fsp--;

            list_body.add(body0.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==118) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,118,FOLLOW_118_in_if_expression463); 
            	    list_118.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression467);
            	    e1=expression();
            	    _fsp--;

            	    list_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression469);
            	    seperator22=seperator();
            	    _fsp--;

            	    list_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression473);
            	    body1=body();
            	    _fsp--;

            	    list_body.add(body1.getTree());
            	    if (list_body1==null) list_body1=new ArrayList();
            	    list_body1.add(body1);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==119) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_if_expression487); 
                    list_119.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression491);
                    body2=body();
                    _fsp--;

                    list_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,114,FOLLOW_114_in_if_expression504); 
            list_114.add(string_literal24);


            // AST REWRITE
            int i_0 = 0;
            retval.tree = root_0;
            root_0 = (Object)adaptor.nil();
            // 284:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, e0.tree);
                adaptor.addChild(root_1, body0.tree);
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:35: ( $e1)*
                {
                int n_1 = e1==null ? 0 : 1;


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, e1.tree);

                }
                }
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:40: ( $body1)*
                {
                int n_1 = list_body1 == null ? 0 : list_body1.size();
                 


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)list_body1.get(i_1)).getTree());

                }
                }
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:48: ( $body2)?
                {
                int n_1 = body2==null ? 0 : 1;


                if ( n_1 > 1 ) throw new RuntimeException(" list has > 1 elements");
                if ( n_1==1 ) {
                    int i_1 = 0;
                    adaptor.addChild(root_1, body2.tree);

                    }
                }

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:3: ( LINE_BREAK )+
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
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator556); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator559); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator561); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator566); 
                    	    LINE_BREAK28_tree = (Object)adaptor.create(LINE_BREAK28);
                    	    adaptor.addChild(root_0, LINE_BREAK28_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    string_literal29=(Token)input.LT(1);
                    match(input,120,FOLLOW_120_in_seperator569); 
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:288:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator571); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression581); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_boolean_expression_in_unless_expression583);
            boolean_expression32=boolean_expression();
            _fsp--;

            adaptor.addChild(root_0, boolean_expression32.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 120:
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
                    new NoViableAltException("290:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,120,FOLLOW_120_in_unless_expression586); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression588); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression590);
                    line_break35=line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression602);
            body36=body();
            _fsp--;

            adaptor.addChild(root_0, body36.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==119) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_unless_expression615); 
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);

                    pushFollow(FOLLOW_body_in_unless_expression617);
                    body38=body();
                    _fsp--;

                    adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

            }

            string_literal39=(Token)input.LT(1);
            match(input,114,FOLLOW_114_in_unless_expression630); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:11: ( SEMI | line_break )
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
                    new NoViableAltException("294:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal636); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal639);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break649); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:1: expression : ( 'alias' fitem fitem | andorExpression );
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        fitem_return fitem44 = null;

        fitem_return fitem45 = null;

        andorExpression_return andorExpression46 = null;


        Object string_literal43_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:5: ( 'alias' fitem fitem | andorExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==121) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=HEREDOC_STRING && LA21_0<=FLOAT)||LA21_0==SYMBOL||(LA21_0>=IF_MODIFIER && LA21_0<=UNLESS_MODIFIER)||LA21_0==ID||(LA21_0>=BNOT && LA21_0<=REGEX)||(LA21_0>=SINGLE_QUOTE_STRING && LA21_0<=DOUBLE_QUOTE_STRING)||LA21_0==113||(LA21_0>=115 && LA21_0<=117)||(LA21_0>=125 && LA21_0<=128)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("328:1: expression : ( 'alias' fitem fitem | andorExpression );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:5: 'alias' fitem fitem
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal43=(Token)input.LT(1);
                    match(input,121,FOLLOW_121_in_expression694); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);

                    pushFollow(FOLLOW_fitem_in_expression697);
                    fitem44=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem44.getTree());
                    pushFollow(FOLLOW_fitem_in_expression699);
                    fitem45=fitem();
                    _fsp--;

                    adaptor.addChild(root_0, fitem45.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression701);
                    andorExpression46=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression46.getTree());

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

    public static class fitem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fitem
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname47 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:9: ( fname )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem708);
            fname47=fname();
            _fsp--;

            adaptor.addChild(root_0, fname47.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID48=null;
        Token CONSTANT49=null;
        Token FID50=null;
        op_return op51 = null;


        Object ID48_tree=null;
        Object CONSTANT49_tree=null;
        Object FID50_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:9: ( ID | CONSTANT | FID | op )
            int alt22=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt22=1;
                }
                break;
            case CONSTANT:
                {
                alt22=2;
                }
                break;
            case FID:
                {
                alt22=3;
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
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("331:1: fname : ( ID | CONSTANT | FID | op );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID48=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname715); 
                    ID48_tree = (Object)adaptor.create(ID48);
                    adaptor.addChild(root_0, ID48_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT49=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname717); 
                    CONSTANT49_tree = (Object)adaptor.create(CONSTANT49);
                    adaptor.addChild(root_0, CONSTANT49_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID50=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname719); 
                    FID50_tree = (Object)adaptor.create(FID50);
                    adaptor.addChild(root_0, FID50_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname721);
                    op51=op();
                    _fsp--;

                    adaptor.addChild(root_0, op51.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:339:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set52=null;

        Object set52_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:339:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set52=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==122 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set52));
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:343:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal54=null;
        Token LINE_BREAK55=null;
        Token string_literal56=null;
        Token LINE_BREAK57=null;
        notExpression_return notExpression53 = null;

        notExpression_return notExpression58 = null;


        Object string_literal54_tree=null;
        Object LINE_BREAK55_tree=null;
        Object string_literal56_tree=null;
        Object LINE_BREAK57_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression882);
            notExpression53=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression53.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:344:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=123 && LA26_0<=124)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==123) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==124) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("345:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal54=(Token)input.LT(1);
            	            match(input,123,FOLLOW_123_in_andorExpression892); 
            	            string_literal54_tree = (Object)adaptor.create(string_literal54);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal54_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:15: ( LINE_BREAK )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==LINE_BREAK) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK55=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression897); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal56=(Token)input.LT(1);
            	            match(input,124,FOLLOW_124_in_andorExpression908); 
            	            string_literal56_tree = (Object)adaptor.create(string_literal56);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal56_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:14: ( LINE_BREAK )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==LINE_BREAK) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK57=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression913); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression928);
            	    notExpression58=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression58.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;
        Token LINE_BREAK60=null;
        notExpression_return notExpression61 = null;

        definedExpression_return definedExpression62 = null;


        Object string_literal59_tree=null;
        Object LINE_BREAK60_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==125) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=HEREDOC_STRING && LA28_0<=FLOAT)||LA28_0==SYMBOL||(LA28_0>=IF_MODIFIER && LA28_0<=UNLESS_MODIFIER)||LA28_0==ID||(LA28_0>=BNOT && LA28_0<=REGEX)||(LA28_0>=SINGLE_QUOTE_STRING && LA28_0<=DOUBLE_QUOTE_STRING)||LA28_0==113||(LA28_0>=115 && LA28_0<=117)||(LA28_0>=126 && LA28_0<=128)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("351:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal59=(Token)input.LT(1);
                    match(input,125,FOLLOW_125_in_notExpression946); 
                    string_literal59_tree = (Object)adaptor.create(string_literal59);
                    root_0 = (Object)adaptor.becomeRoot(string_literal59_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:4: ( LINE_BREAK )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==LINE_BREAK) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK60=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression953); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression961);
                    notExpression61=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression61.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:355:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression967);
                    definedExpression62=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression62.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:1: definedExpression : assignmentExpression ;
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return assignmentExpression63 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:4: ( assignmentExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:4: assignmentExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_definedExpression978);
            assignmentExpression63=assignmentExpression();
            _fsp--;

            adaptor.addChild(root_0, assignmentExpression63.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set66=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression64 = null;

        lhs_return lhs65 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression67 = null;


        Object set66_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=HEREDOC_STRING && LA29_0<=FLOAT)||LA29_0==SYMBOL||(LA29_0>=IF_MODIFIER && LA29_0<=UNLESS_MODIFIER)||(LA29_0>=BNOT && LA29_0<=REGEX)||(LA29_0>=SINGLE_QUOTE_STRING && LA29_0<=DOUBLE_QUOTE_STRING)||LA29_0==113||(LA29_0>=115 && LA29_0<=117)||(LA29_0>=126 && LA29_0<=128)) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                int LA29_2 = input.LA(2);

                if ( ((LA29_2>=ASSIGN && LA29_2<=POWER_ASSIGN)) ) {
                    alt29=2;
                }
                else if ( (LA29_2==EOF||LA29_2==LEFT_SHIFT||(LA29_2>=DIV && LA29_2<=LINE_BREAK)||(LA29_2>=COMPARE && LA29_2<=POWER)||(LA29_2>=QUESTION && LA29_2<=BAND)||LA29_2==COLON||LA29_2==114||(LA29_2>=118 && LA29_2<=120)||(LA29_2>=123 && LA29_2<=124)) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("359:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 29, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("359:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:360:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression986);
                    ternaryIfThenElseExpression64=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression64.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1000);
                    lhs65=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs65.getTree());
                    set66=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set66), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1002);    throw mse;
                    }

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1046);
                    ternaryIfThenElseExpression67=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression67.getTree());
                    addVariable(input.toString(lhs65.start,lhs65.stop));

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:1: ternaryIfThenElseExpression : rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION69=null;
        Token char_literal71=null;
        rangeExpression_return rangeExpression68 = null;

        rangeExpression_return rangeExpression70 = null;

        rangeExpression_return rangeExpression72 = null;


        Object QUESTION69_tree=null;
        Object char_literal71_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:5: ( rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:5: rangeExpression ( | QUESTION rangeExpression ':' rangeExpression )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1058);
            rangeExpression68=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, rangeExpression68.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:21: ( | QUESTION rangeExpression ':' rangeExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==EOF||(LA30_0>=IF_MODIFIER && LA30_0<=LINE_BREAK)||LA30_0==COLON||LA30_0==114||(LA30_0>=118 && LA30_0<=120)||(LA30_0>=123 && LA30_0<=124)) ) {
                alt30=1;
            }
            else if ( (LA30_0==QUESTION) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("365:21: ( | QUESTION rangeExpression ':' rangeExpression )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:23: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:26: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION69=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1065); 
                    QUESTION69_tree = (Object)adaptor.create(QUESTION69);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION69_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1068);
                    rangeExpression70=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression70.getTree());
                    char_literal71=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1070); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1073);
                    rangeExpression72=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression72.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:369:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE74=null;
        Token LINE_BREAK75=null;
        Token EXCLUSIVE_RANGE76=null;
        Token LINE_BREAK77=null;
        logicalOrExpression_return logicalOrExpression73 = null;

        logicalOrExpression_return logicalOrExpression78 = null;


        Object INCLUSIVE_RANGE74_tree=null;
        Object LINE_BREAK75_tree=null;
        Object EXCLUSIVE_RANGE76_tree=null;
        Object LINE_BREAK77_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:370:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1088);
            logicalOrExpression73=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression73.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:371:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=INCLUSIVE_RANGE && LA34_0<=EXCLUSIVE_RANGE)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==INCLUSIVE_RANGE) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==EXCLUSIVE_RANGE) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("372:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE74=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1107); 
            	            INCLUSIVE_RANGE74_tree = (Object)adaptor.create(INCLUSIVE_RANGE74);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE74_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:24: ( LINE_BREAK )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==LINE_BREAK) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:372:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK75=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1111); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop31;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE76=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1122); 
            	            EXCLUSIVE_RANGE76_tree = (Object)adaptor.create(EXCLUSIVE_RANGE76);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE76_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:24: ( LINE_BREAK )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==LINE_BREAK) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:373:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK77=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1126); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1141);
            	    logicalOrExpression78=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression78.getTree());

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
    // $ANTLR end rangeExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalOrExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR80=null;
        Token LINE_BREAK81=null;
        logicalAndExpression_return logicalAndExpression79 = null;

        logicalAndExpression_return logicalAndExpression82 = null;


        Object LOGICAL_OR80_tree=null;
        Object LINE_BREAK81_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1161);
            logicalAndExpression79=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression79.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOGICAL_OR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR80=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1193); 
            	    LOGICAL_OR80_tree = (Object)adaptor.create(LOGICAL_OR80);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR80_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:18: ( LINE_BREAK )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==LINE_BREAK) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:383:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK81=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1198); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1207);
            	    logicalAndExpression82=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression82.getTree());

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
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAndExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND84=null;
        Token LINE_BREAK85=null;
        equalityExpression_return equalityExpression83 = null;

        equalityExpression_return equalityExpression86 = null;


        Object LOGICAL_AND84_tree=null;
        Object LINE_BREAK85_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1227);
            equalityExpression83=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression83.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LOGICAL_AND) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND84=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1259); 
            	    LOGICAL_AND84_tree = (Object)adaptor.create(LOGICAL_AND84);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND84_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:19: ( LINE_BREAK )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==LINE_BREAK) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK85=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1264); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1273);
            	    equalityExpression86=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression86.getTree());

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
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE88=null;
        Token LINE_BREAK89=null;
        Token EQUAL90=null;
        Token LINE_BREAK91=null;
        Token CASE_EQUAL92=null;
        Token LINE_BREAK93=null;
        Token NOT_EQUAL94=null;
        Token LINE_BREAK95=null;
        Token MATCH96=null;
        Token LINE_BREAK97=null;
        Token NOT_MATCH98=null;
        Token LINE_BREAK99=null;
        relationalExpression_return relationalExpression87 = null;

        relationalExpression_return relationalExpression100 = null;


        Object COMPARE88_tree=null;
        Object LINE_BREAK89_tree=null;
        Object EQUAL90_tree=null;
        Object LINE_BREAK91_tree=null;
        Object CASE_EQUAL92_tree=null;
        Object LINE_BREAK93_tree=null;
        Object NOT_EQUAL94_tree=null;
        Object LINE_BREAK95_tree=null;
        Object MATCH96_tree=null;
        Object LINE_BREAK97_tree=null;
        Object NOT_MATCH98_tree=null;
        Object LINE_BREAK99_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1293);
            relationalExpression87=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression87.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=COMPARE && LA46_0<=MATCH)||(LA46_0>=NOT_EQUAL && LA46_0<=NOT_MATCH)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt45=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt45=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt45=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt45=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt45=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt45=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt45=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("401:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 45, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt45) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE88=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1327); 
            	            COMPARE88_tree = (Object)adaptor.create(COMPARE88);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE88_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:17: ( LINE_BREAK )*
            	            loop39:
            	            do {
            	                int alt39=2;
            	                int LA39_0 = input.LA(1);

            	                if ( (LA39_0==LINE_BREAK) ) {
            	                    alt39=1;
            	                }


            	                switch (alt39) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK89=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1332); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop39;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL90=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1343); 
            	            EQUAL90_tree = (Object)adaptor.create(EQUAL90);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL90_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:16: ( LINE_BREAK )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==LINE_BREAK) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:402:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK91=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1349); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop40;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL92=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1360); 
            	            CASE_EQUAL92_tree = (Object)adaptor.create(CASE_EQUAL92);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL92_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:19: ( LINE_BREAK )*
            	            loop41:
            	            do {
            	                int alt41=2;
            	                int LA41_0 = input.LA(1);

            	                if ( (LA41_0==LINE_BREAK) ) {
            	                    alt41=1;
            	                }


            	                switch (alt41) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK93=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1364); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop41;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL94=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1375); 
            	            NOT_EQUAL94_tree = (Object)adaptor.create(NOT_EQUAL94);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL94_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:19: ( LINE_BREAK )*
            	            loop42:
            	            do {
            	                int alt42=2;
            	                int LA42_0 = input.LA(1);

            	                if ( (LA42_0==LINE_BREAK) ) {
            	                    alt42=1;
            	                }


            	                switch (alt42) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK95=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1380); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop42;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH96=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1391); 
            	            MATCH96_tree = (Object)adaptor.create(MATCH96);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH96_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:16: ( LINE_BREAK )*
            	            loop43:
            	            do {
            	                int alt43=2;
            	                int LA43_0 = input.LA(1);

            	                if ( (LA43_0==LINE_BREAK) ) {
            	                    alt43=1;
            	                }


            	                switch (alt43) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK97=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1397); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop43;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH98=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1408); 
            	            NOT_MATCH98_tree = (Object)adaptor.create(NOT_MATCH98);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH98_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:19: ( LINE_BREAK )*
            	            loop44:
            	            do {
            	                int alt44=2;
            	                int LA44_0 = input.LA(1);

            	                if ( (LA44_0==LINE_BREAK) ) {
            	                    alt44=1;
            	                }


            	                switch (alt44) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK99=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1413); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop44;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1428);
            	    relationalExpression100=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression100.getTree());

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
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN102=null;
        Token LINE_BREAK103=null;
        Token GREATER_THAN104=null;
        Token LINE_BREAK105=null;
        Token LESS_OR_EQUAL106=null;
        Token LINE_BREAK107=null;
        Token GREATER_OR_EQUAL108=null;
        Token LINE_BREAK109=null;
        orExpression_return orExpression101 = null;

        orExpression_return orExpression110 = null;


        Object LESS_THAN102_tree=null;
        Object LINE_BREAK103_tree=null;
        Object GREATER_THAN104_tree=null;
        Object LINE_BREAK105_tree=null;
        Object LESS_OR_EQUAL106_tree=null;
        Object LINE_BREAK107_tree=null;
        Object GREATER_OR_EQUAL108_tree=null;
        Object LINE_BREAK109_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1449);
            orExpression101=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression101.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=GREATER_THAN && LA52_0<=LESS_OR_EQUAL)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt51=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt51=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("417:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 51, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt51) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN102=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1483); 
            	            LESS_THAN102_tree = (Object)adaptor.create(LESS_THAN102);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN102_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:20: ( LINE_BREAK )*
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==LINE_BREAK) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK103=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1489); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop47;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN104=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1500); 
            	            GREATER_THAN104_tree = (Object)adaptor.create(GREATER_THAN104);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN104_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:22: ( LINE_BREAK )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==LINE_BREAK) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK105=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1505); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL106=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1516); 
            	            LESS_OR_EQUAL106_tree = (Object)adaptor.create(LESS_OR_EQUAL106);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL106_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:23: ( LINE_BREAK )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==LINE_BREAK) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK107=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1521); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL108=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1532); 
            	            GREATER_OR_EQUAL108_tree = (Object)adaptor.create(GREATER_OR_EQUAL108);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL108_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:25: ( LINE_BREAK )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==LINE_BREAK) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:420:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK109=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1536); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1551);
            	    orExpression110=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression110.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR112=null;
        Token LINE_BREAK113=null;
        Token BOR114=null;
        Token LINE_BREAK115=null;
        andExpression_return andExpression111 = null;

        andExpression_return andExpression116 = null;


        Object BXOR112_tree=null;
        Object LINE_BREAK113_tree=null;
        Object BOR114_tree=null;
        Object LINE_BREAK115_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1571);
            andExpression111=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression111.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=BXOR && LA56_0<=BOR)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==BXOR) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==BOR) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("430:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR112=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1605); 
            	            BXOR112_tree = (Object)adaptor.create(BXOR112);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR112_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:15: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:430:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK113=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1611); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR114=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1622); 
            	            BOR114_tree = (Object)adaptor.create(BOR114);
            	            root_0 = (Object)adaptor.becomeRoot(BOR114_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:14: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);

            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }


            	                switch (alt54) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:431:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK115=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1628); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1643);
            	    andExpression116=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression116.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND118=null;
        Token LINE_BREAK119=null;
        shiftExpression_return shiftExpression117 = null;

        shiftExpression_return shiftExpression120 = null;


        Object BAND118_tree=null;
        Object LINE_BREAK119_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1663);
            shiftExpression117=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression117.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==BAND) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND118=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1695); 
            	    BAND118_tree = (Object)adaptor.create(BAND118);
            	    root_0 = (Object)adaptor.becomeRoot(BAND118_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:13: ( LINE_BREAK )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==LINE_BREAK) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK119=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1701); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1710);
            	    shiftExpression120=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression120.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT122=null;
        Token LINE_BREAK123=null;
        Token RIGHT_SHIFT124=null;
        Token LINE_BREAK125=null;
        additiveExpression_return additiveExpression121 = null;

        additiveExpression_return additiveExpression126 = null;


        Object LEFT_SHIFT122_tree=null;
        Object LINE_BREAK123_tree=null;
        Object RIGHT_SHIFT124_tree=null;
        Object LINE_BREAK125_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1732);
            additiveExpression121=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression121.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==LEFT_SHIFT||LA62_0==RIGHT_SHIFT) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==LEFT_SHIFT) ) {
            	        alt61=1;
            	    }
            	    else if ( (LA61_0==RIGHT_SHIFT) ) {
            	        alt61=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("452:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 61, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT122=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression1766); 
            	            LEFT_SHIFT122_tree = (Object)adaptor.create(LEFT_SHIFT122);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT122_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:20: ( LINE_BREAK )*
            	            loop59:
            	            do {
            	                int alt59=2;
            	                int LA59_0 = input.LA(1);

            	                if ( (LA59_0==LINE_BREAK) ) {
            	                    alt59=1;
            	                }


            	                switch (alt59) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK123=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1771); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop59;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT124=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression1782); 
            	            RIGHT_SHIFT124_tree = (Object)adaptor.create(RIGHT_SHIFT124);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT124_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:20: ( LINE_BREAK )*
            	            loop60:
            	            do {
            	                int alt60=2;
            	                int LA60_0 = input.LA(1);

            	                if ( (LA60_0==LINE_BREAK) ) {
            	                    alt60=1;
            	                }


            	                switch (alt60) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1786); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop60;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1801);
            	    additiveExpression126=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression126.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS128=null;
        Token LINE_BREAK129=null;
        Token MINUS130=null;
        Token LINE_BREAK131=null;
        multiplicativeExpression_return multiplicativeExpression127 = null;

        multiplicativeExpression_return multiplicativeExpression132 = null;


        Object PLUS128_tree=null;
        Object LINE_BREAK129_tree=null;
        Object MINUS130_tree=null;
        Object LINE_BREAK131_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1823);
            multiplicativeExpression127=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression127.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=PLUS && LA66_0<=MINUS)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==PLUS) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==MINUS) ) {
            	        alt65=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("465:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS128=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression1857); 
            	            PLUS128_tree = (Object)adaptor.create(PLUS128);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS128_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:16: ( LINE_BREAK )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==LINE_BREAK) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK129=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression1864); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS130=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression1875); 
            	            MINUS130_tree = (Object)adaptor.create(MINUS130);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS130_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:17: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);

            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }


            	                switch (alt64) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:466:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK131=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression1882); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1897);
            	    multiplicativeExpression132=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression132.getTree());

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
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR134=null;
        Token LINE_BREAK135=null;
        Token DIV136=null;
        Token LINE_BREAK137=null;
        Token MOD138=null;
        Token LINE_BREAK139=null;
        powerExpression_return powerExpression133 = null;

        powerExpression_return powerExpression140 = null;


        Object STAR134_tree=null;
        Object LINE_BREAK135_tree=null;
        Object DIV136_tree=null;
        Object LINE_BREAK137_tree=null;
        Object MOD138_tree=null;
        Object LINE_BREAK139_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:474:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression1917);
            powerExpression133=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression133.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:475:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=DIV && LA71_0<=MOD)||LA71_0==STAR) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt70=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt70=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt70=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt70=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("476:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 70, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt70) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR134=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression1951); 
            	            STAR134_tree = (Object)adaptor.create(STAR134);
            	            root_0 = (Object)adaptor.becomeRoot(STAR134_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:15: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);

            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }


            	                switch (alt67) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:476:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK135=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression1957); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV136=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression1968); 
            	            DIV136_tree = (Object)adaptor.create(DIV136);
            	            root_0 = (Object)adaptor.becomeRoot(DIV136_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:14: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);

            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }


            	                switch (alt68) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression1974); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD138=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression1985); 
            	            MOD138_tree = (Object)adaptor.create(MOD138);
            	            root_0 = (Object)adaptor.becomeRoot(MOD138_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:14: ( LINE_BREAK )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                int LA69_0 = input.LA(1);

            	                if ( (LA69_0==LINE_BREAK) ) {
            	                    alt69=1;
            	                }


            	                switch (alt69) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:478:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK139=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression1991); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop69;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2006);
            	    powerExpression140=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression140.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start powerExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:486:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER142=null;
        Token LINE_BREAK143=null;
        bnotExpression_return bnotExpression141 = null;

        bnotExpression_return bnotExpression144 = null;


        Object POWER142_tree=null;
        Object LINE_BREAK143_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:487:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2027);
            bnotExpression141=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression141.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==POWER) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER142=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2062); 
            	    POWER142_tree = (Object)adaptor.create(POWER142);
            	    root_0 = (Object)adaptor.becomeRoot(POWER142_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:14: ( LINE_BREAK )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==LINE_BREAK) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:489:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK143=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2068); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2077);
            	    bnotExpression144=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression144.getTree());

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
    // $ANTLR end powerExpression

    public static class bnotExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bnotExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:495:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT145=null;
        Token LINE_BREAK146=null;
        Token NOT147=null;
        Token LINE_BREAK148=null;
        command_return command149 = null;


        Object BNOT145_tree=null;
        Object LINE_BREAK146_tree=null;
        Object NOT147_tree=null;
        Object LINE_BREAK148_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop76:
            do {
                int alt76=3;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==BNOT) ) {
                    alt76=1;
                }
                else if ( (LA76_0==NOT) ) {
                    alt76=2;
                }


                switch (alt76) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT145=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2099); 
            	    BNOT145_tree = (Object)adaptor.create(BNOT145);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT145_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:15: ( LINE_BREAK )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==LINE_BREAK) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK146=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2105); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT147=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2115); 
            	    NOT147_tree = (Object)adaptor.create(NOT147);
            	    root_0 = (Object)adaptor.becomeRoot(NOT147_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:13: ( LINE_BREAK )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==LINE_BREAK) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK148=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2121); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2135);
            command149=command();
            _fsp--;

            adaptor.addChild(root_0, command149.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:501:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression ) ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token ID154=null;
        literal_return literal153 = null;

        boolean_expression_return boolean_expression155 = null;

        block_expression_return block_expression156 = null;

        if_expression_return if_expression157 = null;

        unless_expression_return unless_expression158 = null;


        Object string_literal150_tree=null;
        Object string_literal151_tree=null;
        Object string_literal152_tree=null;
        Object ID154_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:3: ( ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            int alt77=9;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt77=1;
                }
                break;
            case 127:
                {
                alt77=2;
                }
                break;
            case 128:
                {
                alt77=3;
                }
                break;
            case HEREDOC_STRING:
            case FLOAT:
            case SYMBOL:
            case INT:
            case ARRAY:
            case HASH:
            case REGEX:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt77=4;
                }
                break;
            case ID:
                {
                alt77=5;
                }
                break;
            case 115:
            case 116:
            case 117:
                {
                alt77=6;
                }
                break;
            case 113:
                {
                alt77=7;
                }
                break;
            case IF_MODIFIER:
                {
                alt77=8;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt77=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("503:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:4: 'expression0'
                    {
                    string_literal150=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_command2150); 
                    string_literal150_tree = (Object)adaptor.create(string_literal150);
                    adaptor.addChild(root_0, string_literal150_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:20: 'expression1'
                    {
                    string_literal151=(Token)input.LT(1);
                    match(input,127,FOLLOW_127_in_command2154); 
                    string_literal151_tree = (Object)adaptor.create(string_literal151);
                    adaptor.addChild(root_0, string_literal151_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:36: 'expression2'
                    {
                    string_literal152=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_command2158); 
                    string_literal152_tree = (Object)adaptor.create(string_literal152);
                    adaptor.addChild(root_0, string_literal152_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:50: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2160);
                    literal153=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal153.getTree());

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:58: ID
                    {
                    ID154=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_command2162); 
                    ID154_tree = (Object)adaptor.create(ID154);
                    adaptor.addChild(root_0, ID154_tree);


                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:61: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2164);
                    boolean_expression155=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression155.getTree());

                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:81: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2167);
                    block_expression156=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression156.getTree());

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:98: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2169);
                    if_expression157=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression157.getTree());

                    }
                    break;
                case 9 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:503:112: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2171);
                    unless_expression158=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression158.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID159=null;

        Object ID159_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:7: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:506:7: ID
            {
            root_0 = (Object)adaptor.nil();

            ID159=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2183); 
            ID159_tree = (Object)adaptor.create(ID159);
            adaptor.addChild(root_0, ID159_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression160 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2190);
            expression160=expression();
            _fsp--;

            adaptor.addChild(root_0, expression160.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:1: literal : ( INT | FLOAT | string | ARRAY | HASH | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT161=null;
        Token FLOAT162=null;
        Token ARRAY164=null;
        Token HASH165=null;
        Token SYMBOL166=null;
        Token REGEX167=null;
        string_return string163 = null;


        Object INT161_tree=null;
        Object FLOAT162_tree=null;
        Object ARRAY164_tree=null;
        Object HASH165_tree=null;
        Object SYMBOL166_tree=null;
        Object REGEX167_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:11: ( INT | FLOAT | string | ARRAY | HASH | SYMBOL | REGEX )
            int alt78=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt78=1;
                }
                break;
            case FLOAT:
                {
                alt78=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt78=3;
                }
                break;
            case ARRAY:
                {
                alt78=4;
                }
                break;
            case HASH:
                {
                alt78=5;
                }
                break;
            case SYMBOL:
                {
                alt78=6;
                }
                break;
            case REGEX:
                {
                alt78=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("511:1: literal : ( INT | FLOAT | string | ARRAY | HASH | SYMBOL | REGEX );", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT161=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2200); 
                    INT161_tree = (Object)adaptor.create(INT161);
                    adaptor.addChild(root_0, INT161_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT162=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2202); 
                    FLOAT162_tree = (Object)adaptor.create(FLOAT162);
                    adaptor.addChild(root_0, FLOAT162_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2204);
                    string163=string();
                    _fsp--;

                    adaptor.addChild(root_0, string163.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY164=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2206); 
                    ARRAY164_tree = (Object)adaptor.create(ARRAY164);
                    adaptor.addChild(root_0, ARRAY164_tree);


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:34: HASH
                    {
                    root_0 = (Object)adaptor.nil();

                    HASH165=(Token)input.LT(1);
                    match(input,HASH,FOLLOW_HASH_in_literal2208); 
                    HASH165_tree = (Object)adaptor.create(HASH165);
                    adaptor.addChild(root_0, HASH165_tree);


                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:39: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL166=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2210); 
                    SYMBOL166_tree = (Object)adaptor.create(SYMBOL166);
                    adaptor.addChild(root_0, SYMBOL166_tree);


                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:511:46: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX167=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2212); 
                    REGEX167_tree = (Object)adaptor.create(REGEX167);
                    adaptor.addChild(root_0, REGEX167_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set168=null;

        Object set168_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:564:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set168=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set168));
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\42\2\15\2\uffff";
    static final String DFA5_maxS =
        "\1\167\2\u0080\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\116\uffff\1\3\3\uffff\2\3",
            "\2\4\2\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\6\4\14\uffff\2\4\22\uffff\1\4\1\3\3\4\2\3\1\uffff\1\4"+
            "\3\uffff\4\4",
            "\2\4\2\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\6\4\14\uffff\2\4\22\uffff\1\4\1\3\3\4\2\3\1\uffff\1\4"+
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
            return "()* loopback of 245:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\43\1\15\3\uffff";
    static final String DFA17_maxS =
        "\1\170\1\u0080\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\111\uffff\1\2\12\uffff\1\3",
            "\2\4\2\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\1\uffff\1\4\45"+
            "\uffff\6\4\14\uffff\2\4\22\uffff\7\4\1\3\1\4\3\uffff\4\4",
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
            return "287:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program212 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_statement_list_in_program216 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_program218 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_statement_in_statement_list232 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list235 = new BitSet(new long[]{0x0000002C60026000L,0xE23A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_statement_in_statement_list238 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_expression_in_statement264 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement267 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_set_in_modifier_line307 = new BitSet(new long[]{0x0000002860026000L,0xE23A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_break_in_modifier_line321 = new BitSet(new long[]{0x0000002860026000L,0xE23A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_modifier_line325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_block_expression400 = new BitSet(new long[]{0x0000002460026000L,0xE23E00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_block_expression402 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_block_expression404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body411 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_statement_list_in_body415 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_body417 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression440 = new BitSet(new long[]{0x0000002060026000L,0xE23A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_if_expression445 = new BitSet(new long[]{0x0000000800000000L,0x0100200000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression447 = new BitSet(new long[]{0x0000002460026000L,0xE2FE00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_if_expression460 = new BitSet(new long[]{0x0000000000000000L,0x00C4000000000000L});
    public static final BitSet FOLLOW_118_in_if_expression463 = new BitSet(new long[]{0x0000002060026000L,0xE23A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_in_if_expression467 = new BitSet(new long[]{0x0000000800000000L,0x0100200000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression469 = new BitSet(new long[]{0x0000002460026000L,0xE2FE00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_if_expression473 = new BitSet(new long[]{0x0000000000000000L,0x00C4000000000000L});
    public static final BitSet FOLLOW_119_in_if_expression487 = new BitSet(new long[]{0x0000002460026000L,0xE23E00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_if_expression491 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_if_expression504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator556 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_COLON_in_seperator559 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator561 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator566 = new BitSet(new long[]{0x0000000800000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_seperator569 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator571 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression581 = new BitSet(new long[]{0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression583 = new BitSet(new long[]{0x0000000800000000L,0x0100200000000000L});
    public static final BitSet FOLLOW_120_in_unless_expression586 = new BitSet(new long[]{0x0000002460026000L,0xE2BE00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_COLON_in_unless_expression588 = new BitSet(new long[]{0x0000002460026000L,0xE2BE00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_break_in_unless_expression590 = new BitSet(new long[]{0x0000002460026000L,0xE2BE00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_unless_expression602 = new BitSet(new long[]{0x0000000000000000L,0x0084000000000000L});
    public static final BitSet FOLLOW_119_in_unless_expression615 = new BitSet(new long[]{0x0000002460026000L,0xE23E00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_body_in_unless_expression617 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_unless_expression630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_expression694 = new BitSet(new long[]{0x0007FFE018019000L,0x0400080000000F00L});
    public static final BitSet FOLLOW_fitem_in_expression697 = new BitSet(new long[]{0x0007FFE018019000L,0x0400080000000F00L});
    public static final BitSet FOLLOW_fitem_in_expression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression882 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_andorExpression892 = new BitSet(new long[]{0x0000002860026000L,0xE03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression897 = new BitSet(new long[]{0x0000002860026000L,0xE03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_124_in_andorExpression908 = new BitSet(new long[]{0x0000002860026000L,0xE03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression913 = new BitSet(new long[]{0x0000002860026000L,0xE03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression928 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_125_in_notExpression946 = new BitSet(new long[]{0x0000002860026000L,0xE03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression953 = new BitSet(new long[]{0x0000002860026000L,0xE03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_notExpression_in_notExpression961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1000 = new BitSet(new long[]{0xFFF8000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_assignmentExpression1002 = new BitSet(new long[]{0x0000002060026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1065 = new BitSet(new long[]{0x0000002060026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1068 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1070 = new BitSet(new long[]{0x0000002060026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1088 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1107 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1111 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1122 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1126 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1141 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1193 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1198 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1227 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1259 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1264 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1293 = new BitSet(new long[]{0x000003C000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1327 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1332 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1343 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1349 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1360 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1364 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1375 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1380 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1391 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1397 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1408 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1413 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1428 = new BitSet(new long[]{0x000003C000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1449 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1483 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1489 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1500 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1505 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1516 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1521 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1532 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1536 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1551 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1605 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1611 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_BOR_in_orExpression1622 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1628 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_BAND_in_andExpression1695 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1701 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1732 = new BitSet(new long[]{0x0000400000001002L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression1766 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1771 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression1782 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1786 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1801 = new BitSet(new long[]{0x0000400000001002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1823 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression1857 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1864 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression1875 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1882 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1897 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression1917 = new BitSet(new long[]{0x0002000018000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression1951 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1957 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression1968 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1974 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression1985 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1991 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2006 = new BitSet(new long[]{0x0002000018000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2027 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2062 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2068 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2077 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2099 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2105 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2115 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2121 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000001L});
    public static final BitSet FOLLOW_command_in_bnotExpression2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_command2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_command2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_command2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});

}