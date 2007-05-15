// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-15 09:58:21

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "ASSIGNMENT", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "COMPARE", "EQUAL", "CASE_EQUAL", "NOT_EQUAL", "MATCH", "NOT_MATCH", "LESS_THAN", "GREATER_THAN", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "BXOR", "BOR", "BAND", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "BNOT", "NOT", "INT", "FLOAT", "ARRAY", "HASH", "RANGE", "REGEX", "OCTAL", "DECIMAL", "HEX", "BINARY", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "EXP_PART", "LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "POWER_ASSIGN", "BAND_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "ASSOC", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "COLON2", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'and'", "'or'", "'not'", "'expression0'", "'expression1'", "'expression2'", "'='"
    };
    public static final int COMMA=106;
    public static final int LOGICAL_AND_ASSIGN=98;
    public static final int GREATER_THAN=48;
    public static final int MINUS=56;
    public static final int ESCAPE_INT=75;
    public static final int ARRAY=63;
    public static final int HASH=64;
    public static final int HEX_PART=71;
    public static final int LOGICAL_OR=39;
    public static final int LESS_THAN=47;
    public static final int META_PART=73;
    public static final int LEADING0_NUMBER=78;
    public static final int BOR=52;
    public static final int BINARY=70;
    public static final int COLON2=108;
    public static final int EMPTY_ARRAY=105;
    public static final int LCURLY=83;
    public static final int LINE_BREAK=33;
    public static final int LEFT_SHIFT=12;
    public static final int IF_MODIFIER=27;
    public static final int MULTIPLE_ASSIGN=17;
    public static final int ESCAPE_INT_PART=74;
    public static final int REGEX=66;
    public static final int SYMBOL=15;
    public static final int RPAREN=102;
    public static final int CONTROL_PART=72;
    public static final int DOUBLE_QUOTE_STRING=80;
    public static final int STAR_ASSIGN=89;
    public static final int ASSIGNMENT=14;
    public static final int PLUS=55;
    public static final int BODY=9;
    public static final int HEREDOC_INDENT_BEGIN=86;
    public static final int CASE_EQUAL=43;
    public static final int UNLESS_MODIFIER=28;
    public static final int MINUS_ASSIGN=88;
    public static final int EXCLUSIVE_RANGE=38;
    public static final int GREATER_OR_EQUAL=50;
    public static final int RANGE=65;
    public static final int POWER_ASSIGN=92;
    public static final int MOD_ASSIGN=91;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=20;
    public static final int WS=34;
    public static final int STRING=24;
    public static final int DOUBLE_STRING_CHAR=82;
    public static final int RIGHT_SHIFT_ASSIGN=97;
    public static final int NON_LEADING0_NUMBER=76;
    public static final int SINGLE_QUOTE_STRING=79;
    public static final int HEREDOC_BEGIN=85;
    public static final int LBRACK=103;
    public static final int SEMI=32;
    public static final int DIV_ASSIGN=90;
    public static final int MRHS=21;
    public static final int BLOCK_ARG=19;
    public static final int EQUAL=42;
    public static final int LOGICAL_AND=40;
    public static final int COLON=107;
    public static final int DIV=25;
    public static final int HEX=69;
    public static final int SINGLETON_METHOD=23;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=37;
    public static final int BNOT=59;
    public static final int LOGICAL_OR_ASSIGN=99;
    public static final int ASSOC=100;
    public static final int FLOAT=62;
    public static final int OCTAL=67;
    public static final int MOD=26;
    public static final int PLUS_ASSIGN=87;
    public static final int QUESTION=36;
    public static final int DECIMAL=68;
    public static final int UNTIL_MODIFIER=30;
    public static final int BLOCK=16;
    public static final int RCURLY=84;
    public static final int INT=61;
    public static final int BOR_ASSIGN=95;
    public static final int LESS_OR_EQUAL=49;
    public static final int LPAREN=101;
    public static final int BAND=53;
    public static final int HEREDOC_STRING=13;
    public static final int NOT_MATCH=46;
    public static final int ID=35;
    public static final int NOT_EQUAL=44;
    public static final int BAND_ASSIGN=93;
    public static final int RIGHT_SHIFT=54;
    public static final int POWER=58;
    public static final int BXOR_ASSIGN=94;
    public static final int NESTED_LHS=22;
    public static final int LEFT_SHIFT_ASSIGN=96;
    public static final int MATCH=45;
    public static final int WHILE_MODIFIER=29;
    public static final int EXP_PART=77;
    public static final int COMPARE=41;
    public static final int IF=7;
    public static final int ARG=11;
    public static final int EOF=-1;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=18;
    public static final int CALL=10;
    public static final int RBRACK=104;
    public static final int RESCUE_MODIFIER=31;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BXOR=51;
    public static final int STAR=57;
    public static final int NOT=60;
    public static final int SINGLE_STRING_CHAR=81;

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:235:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( (LA3_0==HEREDOC_STRING||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==109||(LA3_0>=111 && LA3_0<=113)||(LA3_0>=119 && LA3_0<=122)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("235:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:19: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program200);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program204);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:45: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_program206);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list220);
            statement4=statement();
            _fsp--;

            list_statement.add(statement4.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:16: ( terminal )+ statement
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:16: ( terminal )+
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
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:16: terminal
            	    	    {
            	    	    pushFollow(FOLLOW_terminal_in_statement_list223);
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

            	    pushFollow(FOLLOW_statement_in_statement_list226);
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
            // 240:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:240:58: ( statement )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:247:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line=new ArrayList();
        List list_expression=new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:248:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:248:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement252);
            expression7=expression();
            _fsp--;

            list_expression.add(expression7.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:248:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:248:16: modifier_line
            	    {
            	    pushFollow(FOLLOW_modifier_line_in_statement255);
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
            // 248:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:248:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, list_expression.get(i_0));
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:248:59: ( modifier_line )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:251:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:252:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:252:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_modifier_line295);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:252:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:252:81: line_break
            	    {
            	    pushFollow(FOLLOW_line_break_in_modifier_line309);
            	    line_break10=line_break();
            	    _fsp--;

            	    adaptor.addChild(root_0, line_break10.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_modifier_line313);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:4: 'begin' body 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)input.LT(1);
            match(input,109,FOLLOW_109_in_block_expression388); 
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            adaptor.addChild(root_0, string_literal12_tree);

            pushFollow(FOLLOW_body_in_block_expression390);
            body13=body();
            _fsp--;

            adaptor.addChild(root_0, body13.getTree());
            string_literal14=(Token)input.LT(1);
            match(input,110,FOLLOW_110_in_block_expression392); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==110||(LA10_0>=114 && LA10_0<=115)) ) {
                alt10=1;
            }
            else if ( (LA10_0==HEREDOC_STRING||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==109||(LA10_0>=111 && LA10_0<=113)||(LA10_0>=119 && LA10_0<=122)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("272:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:8: SEMI
                    	    {
                    	    SEMI15=(Token)input.LT(1);
                    	    match(input,SEMI,FOLLOW_SEMI_in_body399); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body403);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:30: terminal
                    	    {
                    	    pushFollow(FOLLOW_terminal_in_body405);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=113) ) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        List list_114=new ArrayList();
        List list_115=new ArrayList();
        List list_IF_MODIFIER=new ArrayList();
        List list_110=new ArrayList();
        Object string_literal19_tree=null;
        Object string_literal21_tree=null;
        Object string_literal23_tree=null;
        Object string_literal24_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
            string_literal19=(Token)input.LT(1);
            match(input,IF_MODIFIER,FOLLOW_IF_MODIFIER_in_if_expression428); 
            list_IF_MODIFIER.add(string_literal19);

            pushFollow(FOLLOW_expression_in_if_expression433);
            e0=expression();
            _fsp--;

            list_expression.add(e0.getTree());
            pushFollow(FOLLOW_seperator_in_if_expression435);
            seperator20=seperator();
            _fsp--;

            list_seperator.add(seperator20.getTree());
            pushFollow(FOLLOW_body_in_if_expression448);
            body0=body();
            _fsp--;

            list_body.add(body0.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==114) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:22: 'elsif' e1= expression seperator body1+= body
            	    {
            	    string_literal21=(Token)input.LT(1);
            	    match(input,114,FOLLOW_114_in_if_expression451); 
            	    list_114.add(string_literal21);

            	    pushFollow(FOLLOW_expression_in_if_expression455);
            	    e1=expression();
            	    _fsp--;

            	    list_expression.add(e1.getTree());
            	    pushFollow(FOLLOW_seperator_in_if_expression457);
            	    seperator22=seperator();
            	    _fsp--;

            	    list_seperator.add(seperator22.getTree());
            	    pushFollow(FOLLOW_body_in_if_expression461);
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

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==115) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:11: 'else' body2= body
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,115,FOLLOW_115_in_if_expression475); 
                    list_115.add(string_literal23);

                    pushFollow(FOLLOW_body_in_if_expression479);
                    body2=body();
                    _fsp--;

                    list_body.add(body2.getTree());

                    }
                    break;

            }

            string_literal24=(Token)input.LT(1);
            match(input,110,FOLLOW_110_in_if_expression492); 
            list_110.add(string_literal24);


            // AST REWRITE
            int i_0 = 0;
            retval.tree = root_0;
            root_0 = (Object)adaptor.nil();
            // 279:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, e0.tree);
                adaptor.addChild(root_1, body0.tree);
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:35: ( $e1)*
                {
                int n_1 = e1==null ? 0 : 1;


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, e1.tree);

                }
                }
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:40: ( $body1)*
                {
                int n_1 = list_body1 == null ? 0 : list_body1.size();
                 


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)list_body1.get(i_1)).getTree());

                }
                }
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:48: ( $body2)?
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:3: ( LINE_BREAK )+
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
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:3: LINE_BREAK
                    	    {
                    	    LINE_BREAK25=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator544); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator547); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:19: LINE_BREAK
                    	    {
                    	    LINE_BREAK27=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator549); 
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:33: LINE_BREAK
                    	    {
                    	    LINE_BREAK28=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator554); 
                    	    LINE_BREAK28_tree = (Object)adaptor.create(LINE_BREAK28);
                    	    adaptor.addChild(root_0, LINE_BREAK28_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    string_literal29=(Token)input.LT(1);
                    match(input,116,FOLLOW_116_in_seperator557); 
                    string_literal29_tree = (Object)adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:52: LINE_BREAK
                    	    {
                    	    LINE_BREAK30=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_seperator559); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)input.LT(1);
            match(input,UNLESS_MODIFIER,FOLLOW_UNLESS_MODIFIER_in_unless_expression569); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_boolean_expression_in_unless_expression571);
            boolean_expression32=boolean_expression();
            _fsp--;

            adaptor.addChild(root_0, boolean_expression32.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:32: ( 'then' | ':' | line_break )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 116:
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
                    new NoViableAltException("285:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,116,FOLLOW_116_in_unless_expression574); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression576); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:44: line_break
                    {
                    pushFollow(FOLLOW_line_break_in_unless_expression578);
                    line_break35=line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_unless_expression590);
            body36=body();
            _fsp--;

            adaptor.addChild(root_0, body36.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==115) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:287:11: 'else' body
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,115,FOLLOW_115_in_unless_expression603); 
                    string_literal37_tree = (Object)adaptor.create(string_literal37);
                    adaptor.addChild(root_0, string_literal37_tree);

                    pushFollow(FOLLOW_body_in_unless_expression605);
                    body38=body();
                    _fsp--;

                    adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

            }

            string_literal39=(Token)input.LT(1);
            match(input,110,FOLLOW_110_in_unless_expression618); 
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:11: ( SEMI | line_break )
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
                    new NoViableAltException("289:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal624); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:289:17: line_break
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal627);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:290:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:291:5: LINE_BREAK
            {
            root_0 = (Object)adaptor.nil();

            LINE_BREAK42=(Token)input.LT(1);
            match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_line_break637); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:324:1: expression : ( andorExpression | assignment_expression );
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        andorExpression_return andorExpression43 = null;

        assignment_expression_return assignment_expression44 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:5: ( andorExpression | assignment_expression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==HEREDOC_STRING||LA21_0==SYMBOL||(LA21_0>=IF_MODIFIER && LA21_0<=UNLESS_MODIFIER)||(LA21_0>=BNOT && LA21_0<=REGEX)||(LA21_0>=SINGLE_QUOTE_STRING && LA21_0<=DOUBLE_QUOTE_STRING)||LA21_0==109||(LA21_0>=111 && LA21_0<=113)||(LA21_0>=119 && LA21_0<=122)) ) {
                alt21=1;
            }
            else if ( (LA21_0==ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==123) ) {
                    alt21=2;
                }
                else if ( (LA21_2==EOF||LA21_2==LEFT_SHIFT||(LA21_2>=DIV && LA21_2<=LINE_BREAK)||(LA21_2>=QUESTION && LA21_2<=POWER)||LA21_2==COLON||LA21_2==110||(LA21_2>=114 && LA21_2<=118)) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("324:1: expression : ( andorExpression | assignment_expression );", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("324:1: expression : ( andorExpression | assignment_expression );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:5: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression723);
                    andorExpression43=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression43.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:21: assignment_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_expression_in_expression725);
                    assignment_expression44=assignment_expression();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_expression44.getTree());

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

    public static class andorExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andorExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal46=null;
        Token LINE_BREAK47=null;
        Token string_literal48=null;
        Token LINE_BREAK49=null;
        notExpression_return notExpression45 = null;

        notExpression_return notExpression50 = null;


        Object string_literal46_tree=null;
        Object LINE_BREAK47_tree=null;
        Object string_literal48_tree=null;
        Object LINE_BREAK49_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression734);
            notExpression45=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression45.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=117 && LA25_0<=118)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==117) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==118) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("328:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal46=(Token)input.LT(1);
            	            match(input,117,FOLLOW_117_in_andorExpression744); 
            	            string_literal46_tree = (Object)adaptor.create(string_literal46);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal46_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:15: ( LINE_BREAK )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==LINE_BREAK) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK47=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression749); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop22;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal48=(Token)input.LT(1);
            	            match(input,118,FOLLOW_118_in_andorExpression760); 
            	            string_literal48_tree = (Object)adaptor.create(string_literal48);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal48_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:14: ( LINE_BREAK )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==LINE_BREAK) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK49=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression765); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression780);
            	    notExpression50=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression50.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:334:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal51=null;
        Token LINE_BREAK52=null;
        notExpression_return notExpression53 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression54 = null;


        Object string_literal51_tree=null;
        Object LINE_BREAK52_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:5: ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==119) ) {
                alt27=1;
            }
            else if ( (LA27_0==HEREDOC_STRING||LA27_0==SYMBOL||(LA27_0>=IF_MODIFIER && LA27_0<=UNLESS_MODIFIER)||LA27_0==ID||(LA27_0>=BNOT && LA27_0<=REGEX)||(LA27_0>=SINGLE_QUOTE_STRING && LA27_0<=DOUBLE_QUOTE_STRING)||LA27_0==109||(LA27_0>=111 && LA27_0<=113)||(LA27_0>=120 && LA27_0<=122)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("334:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal51=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_notExpression798); 
                    string_literal51_tree = (Object)adaptor.create(string_literal51);
                    root_0 = (Object)adaptor.becomeRoot(string_literal51_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:4: ( LINE_BREAK )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==LINE_BREAK) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:336:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK52=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression805); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression813);
                    notExpression53=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression53.getTree());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:338:5: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_notExpression819);
                    ternaryIfThenElseExpression54=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression54.getTree());

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

    public static class ternaryIfThenElseExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ternaryIfThenElseExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:1: ternaryIfThenElseExpression : rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION56=null;
        Token char_literal58=null;
        rangeExpression_return rangeExpression55 = null;

        rangeExpression_return rangeExpression57 = null;

        rangeExpression_return rangeExpression59 = null;


        Object QUESTION56_tree=null;
        Object char_literal58_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:341:5: ( rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:341:5: rangeExpression ( | QUESTION rangeExpression ':' rangeExpression )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression831);
            rangeExpression55=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, rangeExpression55.getTree());
            System.out.println("done with rangeExpression");
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:341:71: ( | QUESTION rangeExpression ':' rangeExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EOF||(LA28_0>=IF_MODIFIER && LA28_0<=LINE_BREAK)||LA28_0==COLON||LA28_0==110||(LA28_0>=114 && LA28_0<=118)) ) {
                alt28=1;
            }
            else if ( (LA28_0==QUESTION) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("341:71: ( | QUESTION rangeExpression ':' rangeExpression )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:341:73: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:341:76: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION56=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression839); 
                    QUESTION56_tree = (Object)adaptor.create(QUESTION56);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION56_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression842);
                    rangeExpression57=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression57.getTree());
                    char_literal58=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression844); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression847);
                    rangeExpression59=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression59.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:345:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE61=null;
        Token LINE_BREAK62=null;
        Token EXCLUSIVE_RANGE63=null;
        Token LINE_BREAK64=null;
        logicalOrExpression_return logicalOrExpression60 = null;

        logicalOrExpression_return logicalOrExpression65 = null;


        Object INCLUSIVE_RANGE61_tree=null;
        Object LINE_BREAK62_tree=null;
        Object EXCLUSIVE_RANGE63_tree=null;
        Object LINE_BREAK64_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression862);
            logicalOrExpression60=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression60.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:347:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=INCLUSIVE_RANGE && LA32_0<=EXCLUSIVE_RANGE)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==INCLUSIVE_RANGE) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==EXCLUSIVE_RANGE) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("348:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE61=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression881); 
            	            INCLUSIVE_RANGE61_tree = (Object)adaptor.create(INCLUSIVE_RANGE61);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE61_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:24: ( LINE_BREAK )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==LINE_BREAK) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK62=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression885); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop29;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE63=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression896); 
            	            EXCLUSIVE_RANGE63_tree = (Object)adaptor.create(EXCLUSIVE_RANGE63);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE63_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:24: ( LINE_BREAK )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==LINE_BREAK) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:349:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK64=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression900); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression915);
            	    logicalOrExpression65=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression65.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:356:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR67=null;
        Token LINE_BREAK68=null;
        logicalAndExpression_return logicalAndExpression66 = null;

        logicalAndExpression_return logicalAndExpression69 = null;


        Object LOGICAL_OR67_tree=null;
        Object LINE_BREAK68_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:357:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression935);
            logicalAndExpression66=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression66.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:358:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LOGICAL_OR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR67=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression967); 
            	    LOGICAL_OR67_tree = (Object)adaptor.create(LOGICAL_OR67);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR67_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:18: ( LINE_BREAK )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==LINE_BREAK) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:359:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK68=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression972); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression981);
            	    logicalAndExpression69=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression69.getTree());

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
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAndExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND71=null;
        Token LINE_BREAK72=null;
        equalityExpression_return equalityExpression70 = null;

        equalityExpression_return equalityExpression73 = null;


        Object LOGICAL_AND71_tree=null;
        Object LINE_BREAK72_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:366:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1001);
            equalityExpression70=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression70.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:367:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOGICAL_AND) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND71=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1033); 
            	    LOGICAL_AND71_tree = (Object)adaptor.create(LOGICAL_AND71);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND71_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:19: ( LINE_BREAK )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==LINE_BREAK) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:368:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK72=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1038); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1047);
            	    equalityExpression73=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression73.getTree());

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
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE75=null;
        Token LINE_BREAK76=null;
        Token EQUAL77=null;
        Token LINE_BREAK78=null;
        Token CASE_EQUAL79=null;
        Token LINE_BREAK80=null;
        Token NOT_EQUAL81=null;
        Token LINE_BREAK82=null;
        Token MATCH83=null;
        Token LINE_BREAK84=null;
        Token NOT_MATCH85=null;
        Token LINE_BREAK86=null;
        relationalExpression_return relationalExpression74 = null;

        relationalExpression_return relationalExpression87 = null;


        Object COMPARE75_tree=null;
        Object LINE_BREAK76_tree=null;
        Object EQUAL77_tree=null;
        Object LINE_BREAK78_tree=null;
        Object CASE_EQUAL79_tree=null;
        Object LINE_BREAK80_tree=null;
        Object NOT_EQUAL81_tree=null;
        Object LINE_BREAK82_tree=null;
        Object MATCH83_tree=null;
        Object LINE_BREAK84_tree=null;
        Object NOT_MATCH85_tree=null;
        Object LINE_BREAK86_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1067);
            relationalExpression74=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression74.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=COMPARE && LA44_0<=NOT_MATCH)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt43=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt43=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt43=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt43=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("377:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE75=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1101); 
            	            COMPARE75_tree = (Object)adaptor.create(COMPARE75);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE75_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:17: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK76=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1106); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL77=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1117); 
            	            EQUAL77_tree = (Object)adaptor.create(EQUAL77);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL77_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:16: ( LINE_BREAK )*
            	            loop38:
            	            do {
            	                int alt38=2;
            	                int LA38_0 = input.LA(1);

            	                if ( (LA38_0==LINE_BREAK) ) {
            	                    alt38=1;
            	                }


            	                switch (alt38) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK78=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1123); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop38;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL79=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1134); 
            	            CASE_EQUAL79_tree = (Object)adaptor.create(CASE_EQUAL79);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL79_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:19: ( LINE_BREAK )*
            	            loop39:
            	            do {
            	                int alt39=2;
            	                int LA39_0 = input.LA(1);

            	                if ( (LA39_0==LINE_BREAK) ) {
            	                    alt39=1;
            	                }


            	                switch (alt39) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:379:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK80=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1138); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop39;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL81=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1149); 
            	            NOT_EQUAL81_tree = (Object)adaptor.create(NOT_EQUAL81);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL81_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:19: ( LINE_BREAK )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==LINE_BREAK) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:380:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK82=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1154); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop40;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH83=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1165); 
            	            MATCH83_tree = (Object)adaptor.create(MATCH83);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH83_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:16: ( LINE_BREAK )*
            	            loop41:
            	            do {
            	                int alt41=2;
            	                int LA41_0 = input.LA(1);

            	                if ( (LA41_0==LINE_BREAK) ) {
            	                    alt41=1;
            	                }


            	                switch (alt41) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:381:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK84=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1171); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop41;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH85=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1182); 
            	            NOT_MATCH85_tree = (Object)adaptor.create(NOT_MATCH85);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH85_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:19: ( LINE_BREAK )*
            	            loop42:
            	            do {
            	                int alt42=2;
            	                int LA42_0 = input.LA(1);

            	                if ( (LA42_0==LINE_BREAK) ) {
            	                    alt42=1;
            	                }


            	                switch (alt42) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:382:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK86=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1187); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop42;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1202);
            	    relationalExpression87=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression87.getTree());

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
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN89=null;
        Token LINE_BREAK90=null;
        Token GREATER_THAN91=null;
        Token LINE_BREAK92=null;
        Token LESS_OR_EQUAL93=null;
        Token LINE_BREAK94=null;
        Token GREATER_OR_EQUAL95=null;
        Token LINE_BREAK96=null;
        orExpression_return orExpression88 = null;

        orExpression_return orExpression97 = null;


        Object LESS_THAN89_tree=null;
        Object LINE_BREAK90_tree=null;
        Object GREATER_THAN91_tree=null;
        Object LINE_BREAK92_tree=null;
        Object LESS_OR_EQUAL93_tree=null;
        Object LINE_BREAK94_tree=null;
        Object GREATER_OR_EQUAL95_tree=null;
        Object LINE_BREAK96_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:391:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1223);
            orExpression88=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression88.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:392:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=LESS_THAN && LA50_0<=GREATER_OR_EQUAL)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt49=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt49=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("393:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 49, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN89=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1257); 
            	            LESS_THAN89_tree = (Object)adaptor.create(LESS_THAN89);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN89_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:20: ( LINE_BREAK )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);

            	                if ( (LA45_0==LINE_BREAK) ) {
            	                    alt45=1;
            	                }


            	                switch (alt45) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:393:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK90=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1263); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN91=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1274); 
            	            GREATER_THAN91_tree = (Object)adaptor.create(GREATER_THAN91);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN91_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:22: ( LINE_BREAK )*
            	            loop46:
            	            do {
            	                int alt46=2;
            	                int LA46_0 = input.LA(1);

            	                if ( (LA46_0==LINE_BREAK) ) {
            	                    alt46=1;
            	                }


            	                switch (alt46) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:394:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK92=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1279); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop46;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL93=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1290); 
            	            LESS_OR_EQUAL93_tree = (Object)adaptor.create(LESS_OR_EQUAL93);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL93_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:23: ( LINE_BREAK )*
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==LINE_BREAK) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:395:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK94=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1295); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop47;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL95=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1306); 
            	            GREATER_OR_EQUAL95_tree = (Object)adaptor.create(GREATER_OR_EQUAL95);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL95_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:25: ( LINE_BREAK )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==LINE_BREAK) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:396:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK96=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1310); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1325);
            	    orExpression97=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression97.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:403:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR99=null;
        Token LINE_BREAK100=null;
        Token BOR101=null;
        Token LINE_BREAK102=null;
        andExpression_return andExpression98 = null;

        andExpression_return andExpression103 = null;


        Object BXOR99_tree=null;
        Object LINE_BREAK100_tree=null;
        Object BOR101_tree=null;
        Object LINE_BREAK102_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:404:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1345);
            andExpression98=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression98.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:405:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=BXOR && LA54_0<=BOR)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==BXOR) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==BOR) ) {
            	        alt53=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("406:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR99=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1379); 
            	            BXOR99_tree = (Object)adaptor.create(BXOR99);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR99_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:15: ( LINE_BREAK )*
            	            loop51:
            	            do {
            	                int alt51=2;
            	                int LA51_0 = input.LA(1);

            	                if ( (LA51_0==LINE_BREAK) ) {
            	                    alt51=1;
            	                }


            	                switch (alt51) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:406:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK100=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1385); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop51;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR101=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1396); 
            	            BOR101_tree = (Object)adaptor.create(BOR101);
            	            root_0 = (Object)adaptor.becomeRoot(BOR101_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:14: ( LINE_BREAK )*
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==LINE_BREAK) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK102=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1402); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop52;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1417);
            	    andExpression103=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression103.getTree());

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
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND105=null;
        Token LINE_BREAK106=null;
        shiftExpression_return shiftExpression104 = null;

        shiftExpression_return shiftExpression107 = null;


        Object BAND105_tree=null;
        Object LINE_BREAK106_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:415:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1437);
            shiftExpression104=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression104.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==BAND) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND105=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1469); 
            	    BAND105_tree = (Object)adaptor.create(BAND105);
            	    root_0 = (Object)adaptor.becomeRoot(BAND105_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:13: ( LINE_BREAK )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==LINE_BREAK) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK106=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1475); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop55;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1484);
            	    shiftExpression107=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression107.getTree());

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
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:425:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT109=null;
        Token LINE_BREAK110=null;
        Token RIGHT_SHIFT111=null;
        Token LINE_BREAK112=null;
        additiveExpression_return additiveExpression108 = null;

        additiveExpression_return additiveExpression113 = null;


        Object LEFT_SHIFT109_tree=null;
        Object LINE_BREAK110_tree=null;
        Object RIGHT_SHIFT111_tree=null;
        Object LINE_BREAK112_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:426:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1506);
            additiveExpression108=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression108.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:427:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==LEFT_SHIFT||LA60_0==RIGHT_SHIFT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==LEFT_SHIFT) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==RIGHT_SHIFT) ) {
            	        alt59=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("428:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 59, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT109=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression1540); 
            	            LEFT_SHIFT109_tree = (Object)adaptor.create(LEFT_SHIFT109);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT109_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:20: ( LINE_BREAK )*
            	            loop57:
            	            do {
            	                int alt57=2;
            	                int LA57_0 = input.LA(1);

            	                if ( (LA57_0==LINE_BREAK) ) {
            	                    alt57=1;
            	                }


            	                switch (alt57) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:428:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK110=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1545); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop57;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT111=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression1556); 
            	            RIGHT_SHIFT111_tree = (Object)adaptor.create(RIGHT_SHIFT111);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT111_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:20: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);

            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }


            	                switch (alt58) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:429:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK112=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1560); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1575);
            	    additiveExpression113=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression113.getTree());

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
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:438:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS115=null;
        Token LINE_BREAK116=null;
        Token MINUS117=null;
        Token LINE_BREAK118=null;
        multiplicativeExpression_return multiplicativeExpression114 = null;

        multiplicativeExpression_return multiplicativeExpression119 = null;


        Object PLUS115_tree=null;
        Object LINE_BREAK116_tree=null;
        Object MINUS117_tree=null;
        Object LINE_BREAK118_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:439:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1597);
            multiplicativeExpression114=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression114.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:440:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=PLUS && LA64_0<=MINUS)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==PLUS) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==MINUS) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("441:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS115=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression1631); 
            	            PLUS115_tree = (Object)adaptor.create(PLUS115);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS115_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:16: ( LINE_BREAK )*
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);

            	                if ( (LA61_0==LINE_BREAK) ) {
            	                    alt61=1;
            	                }


            	                switch (alt61) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:441:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK116=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression1638); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop61;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS117=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression1649); 
            	            MINUS117_tree = (Object)adaptor.create(MINUS117);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS117_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:17: ( LINE_BREAK )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==LINE_BREAK) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:442:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK118=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression1656); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1671);
            	    multiplicativeExpression119=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression119.getTree());

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
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:449:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR121=null;
        Token LINE_BREAK122=null;
        Token DIV123=null;
        Token LINE_BREAK124=null;
        Token MOD125=null;
        Token LINE_BREAK126=null;
        powerExpression_return powerExpression120 = null;

        powerExpression_return powerExpression127 = null;


        Object STAR121_tree=null;
        Object LINE_BREAK122_tree=null;
        Object DIV123_tree=null;
        Object LINE_BREAK124_tree=null;
        Object MOD125_tree=null;
        Object LINE_BREAK126_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:450:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression1691);
            powerExpression120=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression120.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:451:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=DIV && LA69_0<=MOD)||LA69_0==STAR) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt68=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt68=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt68=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt68=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("452:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 68, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt68) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR121=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression1725); 
            	            STAR121_tree = (Object)adaptor.create(STAR121);
            	            root_0 = (Object)adaptor.becomeRoot(STAR121_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:15: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);

            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }


            	                switch (alt65) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:452:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK122=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression1731); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV123=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression1742); 
            	            DIV123_tree = (Object)adaptor.create(DIV123);
            	            root_0 = (Object)adaptor.becomeRoot(DIV123_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:14: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);

            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }


            	                switch (alt66) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:453:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK124=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression1748); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD125=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression1759); 
            	            MOD125_tree = (Object)adaptor.create(MOD125);
            	            root_0 = (Object)adaptor.becomeRoot(MOD125_tree, root_0);

            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:14: ( LINE_BREAK )*
            	            loop67:
            	            do {
            	                int alt67=2;
            	                int LA67_0 = input.LA(1);

            	                if ( (LA67_0==LINE_BREAK) ) {
            	                    alt67=1;
            	                }


            	                switch (alt67) {
            	            	case 1 :
            	            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:454:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK126=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression1765); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop67;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression1780);
            	    powerExpression127=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression127.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start powerExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:462:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER129=null;
        Token LINE_BREAK130=null;
        bnotExpression_return bnotExpression128 = null;

        bnotExpression_return bnotExpression131 = null;


        Object POWER129_tree=null;
        Object LINE_BREAK130_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:463:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression1801);
            bnotExpression128=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression128.getTree());
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:464:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==POWER) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER129=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression1836); 
            	    POWER129_tree = (Object)adaptor.create(POWER129);
            	    root_0 = (Object)adaptor.becomeRoot(POWER129_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:14: ( LINE_BREAK )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==LINE_BREAK) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK130=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression1842); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression1851);
            	    bnotExpression131=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression131.getTree());

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
    // $ANTLR end powerExpression

    public static class bnotExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bnotExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:471:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT132=null;
        Token LINE_BREAK133=null;
        Token NOT134=null;
        Token LINE_BREAK135=null;
        command_return command136 = null;


        Object BNOT132_tree=null;
        Object LINE_BREAK133_tree=null;
        Object NOT134_tree=null;
        Object LINE_BREAK135_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==BNOT) ) {
                    alt74=1;
                }
                else if ( (LA74_0==NOT) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT132=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression1873); 
            	    BNOT132_tree = (Object)adaptor.create(BNOT132);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT132_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:15: ( LINE_BREAK )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==LINE_BREAK) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:472:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK133=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression1879); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT134=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression1889); 
            	    NOT134_tree = (Object)adaptor.create(NOT134);
            	    root_0 = (Object)adaptor.becomeRoot(NOT134_tree, root_0);

            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:13: ( LINE_BREAK )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==LINE_BREAK) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:473:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK135=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression1895); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop73;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression1909);
            command136=command();
            _fsp--;

            adaptor.addChild(root_0, command136.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:477:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression ) ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token ID141=null;
        literal_return literal140 = null;

        boolean_expression_return boolean_expression142 = null;

        block_expression_return block_expression143 = null;

        if_expression_return if_expression144 = null;

        unless_expression_return unless_expression145 = null;


        Object string_literal137_tree=null;
        Object string_literal138_tree=null;
        Object string_literal139_tree=null;
        Object ID141_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:3: ( ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            int alt75=9;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt75=1;
                }
                break;
            case 121:
                {
                alt75=2;
                }
                break;
            case 122:
                {
                alt75=3;
                }
                break;
            case HEREDOC_STRING:
            case SYMBOL:
            case INT:
            case FLOAT:
            case ARRAY:
            case HASH:
            case RANGE:
            case REGEX:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt75=4;
                }
                break;
            case ID:
                {
                alt75=5;
                }
                break;
            case 111:
            case 112:
            case 113:
                {
                alt75=6;
                }
                break;
            case 109:
                {
                alt75=7;
                }
                break;
            case IF_MODIFIER:
                {
                alt75=8;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt75=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("479:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:4: 'expression0'
                    {
                    string_literal137=(Token)input.LT(1);
                    match(input,120,FOLLOW_120_in_command1924); 
                    string_literal137_tree = (Object)adaptor.create(string_literal137);
                    adaptor.addChild(root_0, string_literal137_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:20: 'expression1'
                    {
                    string_literal138=(Token)input.LT(1);
                    match(input,121,FOLLOW_121_in_command1928); 
                    string_literal138_tree = (Object)adaptor.create(string_literal138);
                    adaptor.addChild(root_0, string_literal138_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:36: 'expression2'
                    {
                    string_literal139=(Token)input.LT(1);
                    match(input,122,FOLLOW_122_in_command1932); 
                    string_literal139_tree = (Object)adaptor.create(string_literal139);
                    adaptor.addChild(root_0, string_literal139_tree);


                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:50: literal
                    {
                    pushFollow(FOLLOW_literal_in_command1934);
                    literal140=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal140.getTree());

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:58: ID
                    {
                    ID141=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_command1936); 
                    ID141_tree = (Object)adaptor.create(ID141);
                    adaptor.addChild(root_0, ID141_tree);


                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:61: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command1938);
                    boolean_expression142=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression142.getTree());

                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:81: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command1941);
                    block_expression143=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression143.getTree());

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:98: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command1943);
                    if_expression144=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression144.getTree());

                    }
                    break;
                case 9 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:479:112: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command1945);
                    unless_expression145=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression145.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

            System.out.println("done with command" + input.toString(retval.start,input.LT(-1))); tokenStream.addVirtualToken(((Token)retval.stop).getTokenIndex(), VirtualToken.EXPR_END);
        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignment_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:481:1: assignment_expression : lhs '=' rhs ;
    public final assignment_expression_return assignment_expression() throws RecognitionException {
        assignment_expression_return retval = new assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal147=null;
        lhs_return lhs146 = null;

        rhs_return rhs148 = null;


        Object char_literal147_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:4: ( lhs '=' rhs )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:482:4: lhs '=' rhs
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lhs_in_assignment_expression1957);
            lhs146=lhs();
            _fsp--;

            adaptor.addChild(root_0, lhs146.getTree());
            char_literal147=(Token)input.LT(1);
            match(input,123,FOLLOW_123_in_assignment_expression1959); 
            char_literal147_tree = (Object)adaptor.create(char_literal147);
            root_0 = (Object)adaptor.becomeRoot(char_literal147_tree, root_0);

            pushFollow(FOLLOW_rhs_in_assignment_expression1962);
            rhs148=rhs();
            _fsp--;

            adaptor.addChild(root_0, rhs148.getTree());
            addVariable(input.toString(lhs146.start,lhs146.stop));

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        
        catch (RecognitionException e) {
        throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignment_expression

    public static class lhs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lhs
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID149=null;

        Object ID149_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:7: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:483:7: ID
            {
            root_0 = (Object)adaptor.nil();

            ID149=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs1971); 
            ID149_tree = (Object)adaptor.create(ID149);
            adaptor.addChild(root_0, ID149_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression150 = null;



        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:484:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs1978);
            expression150=expression();
            _fsp--;

            adaptor.addChild(root_0, expression150.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT151=null;
        Token FLOAT152=null;
        Token ARRAY154=null;
        Token HASH155=null;
        Token RANGE156=null;
        Token SYMBOL157=null;
        Token REGEX158=null;
        string_return string153 = null;


        Object INT151_tree=null;
        Object FLOAT152_tree=null;
        Object ARRAY154_tree=null;
        Object HASH155_tree=null;
        Object RANGE156_tree=null;
        Object SYMBOL157_tree=null;
        Object REGEX158_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:11: ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX )
            int alt76=8;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt76=1;
                }
                break;
            case FLOAT:
                {
                alt76=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt76=3;
                }
                break;
            case ARRAY:
                {
                alt76=4;
                }
                break;
            case HASH:
                {
                alt76=5;
                }
                break;
            case RANGE:
                {
                alt76=6;
                }
                break;
            case SYMBOL:
                {
                alt76=7;
                }
                break;
            case REGEX:
                {
                alt76=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("488:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT151=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal1988); 
                    INT151_tree = (Object)adaptor.create(INT151);
                    adaptor.addChild(root_0, INT151_tree);


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT152=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal1990); 
                    FLOAT152_tree = (Object)adaptor.create(FLOAT152);
                    adaptor.addChild(root_0, FLOAT152_tree);


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal1992);
                    string153=string();
                    _fsp--;

                    adaptor.addChild(root_0, string153.getTree());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY154=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal1994); 
                    ARRAY154_tree = (Object)adaptor.create(ARRAY154);
                    adaptor.addChild(root_0, ARRAY154_tree);


                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:34: HASH
                    {
                    root_0 = (Object)adaptor.nil();

                    HASH155=(Token)input.LT(1);
                    match(input,HASH,FOLLOW_HASH_in_literal1996); 
                    HASH155_tree = (Object)adaptor.create(HASH155);
                    adaptor.addChild(root_0, HASH155_tree);


                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:39: RANGE
                    {
                    root_0 = (Object)adaptor.nil();

                    RANGE156=(Token)input.LT(1);
                    match(input,RANGE,FOLLOW_RANGE_in_literal1998); 
                    RANGE156_tree = (Object)adaptor.create(RANGE156);
                    adaptor.addChild(root_0, RANGE156_tree);


                    }
                    break;
                case 7 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:45: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL157=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2000); 
                    SYMBOL157_tree = (Object)adaptor.create(SYMBOL157);
                    adaptor.addChild(root_0, SYMBOL157_tree);


                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:488:52: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX158=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2002); 
                    REGEX158_tree = (Object)adaptor.create(REGEX158);
                    adaptor.addChild(root_0, REGEX158_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set159=null;

        Object set159_tree=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:530:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set159=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set159));
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
        "\1\40\2\15\2\uffff";
    static final String DFA5_maxS =
        "\1\163\2\172\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\114\uffff\1\3\3\uffff\2\3",
            "\1\4\1\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\27"+
            "\uffff\10\4\14\uffff\2\4\34\uffff\1\4\1\3\3\4\2\3\3\uffff\4"+
            "\4",
            "\1\4\1\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\27"+
            "\uffff\10\4\14\uffff\2\4\34\uffff\1\4\1\3\3\4\2\3\3\uffff\4"+
            "\4",
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
            return "()* loopback of 240:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\41\1\15\3\uffff";
    static final String DFA17_maxS =
        "\1\164\1\172\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\111\uffff\1\2\10\uffff\1\3",
            "\1\4\1\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\1\uffff\1\4\27"+
            "\uffff\10\4\14\uffff\2\4\34\uffff\7\4\1\3\2\uffff\4\4",
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
            return "282:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program200 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_statement_list_in_program204 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_terminal_in_program206 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_statement_in_statement_list220 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list223 = new BitSet(new long[]{0xF800000B1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_statement_in_statement_list226 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_expression_in_statement252 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement255 = new BitSet(new long[]{0x00000000F8000002L});
    public static final BitSet FOLLOW_set_in_modifier_line295 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_line_break_in_modifier_line309 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_expression_in_modifier_line313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_block_expression388 = new BitSet(new long[]{0xF80000091800A000L,0x0783E00000018007L});
    public static final BitSet FOLLOW_body_in_block_expression390 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_block_expression392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body399 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_statement_list_in_body403 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_terminal_in_body405 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression428 = new BitSet(new long[]{0xF80000081800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_expression_in_if_expression433 = new BitSet(new long[]{0x0000000200000000L,0x0010080000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression435 = new BitSet(new long[]{0xF80000091800A000L,0x078FE00000018007L});
    public static final BitSet FOLLOW_body_in_if_expression448 = new BitSet(new long[]{0x0000000000000000L,0x000C400000000000L});
    public static final BitSet FOLLOW_114_in_if_expression451 = new BitSet(new long[]{0xF80000081800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_expression_in_if_expression455 = new BitSet(new long[]{0x0000000200000000L,0x0010080000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression457 = new BitSet(new long[]{0xF80000091800A000L,0x078FE00000018007L});
    public static final BitSet FOLLOW_body_in_if_expression461 = new BitSet(new long[]{0x0000000000000000L,0x000C400000000000L});
    public static final BitSet FOLLOW_115_in_if_expression475 = new BitSet(new long[]{0xF80000091800A000L,0x0783E00000018007L});
    public static final BitSet FOLLOW_body_in_if_expression479 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_if_expression492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator544 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COLON_in_seperator547 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator549 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator554 = new BitSet(new long[]{0x0000000200000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_seperator557 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator559 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression569 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression571 = new BitSet(new long[]{0x0000000200000000L,0x0010080000000000L});
    public static final BitSet FOLLOW_116_in_unless_expression574 = new BitSet(new long[]{0xF80000091800A000L,0x078BE00000018007L});
    public static final BitSet FOLLOW_COLON_in_unless_expression576 = new BitSet(new long[]{0xF80000091800A000L,0x078BE00000018007L});
    public static final BitSet FOLLOW_line_break_in_unless_expression578 = new BitSet(new long[]{0xF80000091800A000L,0x078BE00000018007L});
    public static final BitSet FOLLOW_body_in_unless_expression590 = new BitSet(new long[]{0x0000000000000000L,0x0008400000000000L});
    public static final BitSet FOLLOW_115_in_unless_expression603 = new BitSet(new long[]{0xF80000091800A000L,0x0783E00000018007L});
    public static final BitSet FOLLOW_body_in_unless_expression605 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_unless_expression618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression734 = new BitSet(new long[]{0x0000000000000002L,0x0060000000000000L});
    public static final BitSet FOLLOW_117_in_andorExpression744 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression749 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_118_in_andorExpression760 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression765 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression780 = new BitSet(new long[]{0x0000000000000002L,0x0060000000000000L});
    public static final BitSet FOLLOW_119_in_notExpression798 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression805 = new BitSet(new long[]{0xF800000A1800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_notExpression_in_notExpression813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_notExpression819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression831 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression839 = new BitSet(new long[]{0xF80000081800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression842 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression844 = new BitSet(new long[]{0xF80000081800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression862 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression881 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression885 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression896 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression900 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression915 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression935 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression967 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression972 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression981 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1001 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1033 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1038 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1047 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1067 = new BitSet(new long[]{0x00007E0000000002L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1101 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1106 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1117 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1123 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1134 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1138 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1149 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1154 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1165 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1171 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1182 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1187 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1202 = new BitSet(new long[]{0x00007E0000000002L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1223 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1257 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1263 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1274 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1279 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1290 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1295 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1306 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1310 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1325 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1345 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1379 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1385 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_BOR_in_orExpression1396 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1402 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1417 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1437 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_BAND_in_andExpression1469 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1475 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1484 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1506 = new BitSet(new long[]{0x0040000000001002L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression1540 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1545 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression1556 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1560 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1575 = new BitSet(new long[]{0x0040000000001002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1597 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression1631 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1638 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression1649 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1656 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1671 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression1691 = new BitSet(new long[]{0x0200000006000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression1725 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1731 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression1742 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1748 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression1759 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1765 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression1780 = new BitSet(new long[]{0x0200000006000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression1801 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression1836 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression1842 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression1851 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression1873 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression1879 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression1889 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression1895 = new BitSet(new long[]{0xF800000A1800A000L,0x0703A00000018007L});
    public static final BitSet FOLLOW_command_in_bnotExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_command1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_command1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_command1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignment_expression1957 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_assignment_expression1959 = new BitSet(new long[]{0xF80000081800A000L,0x0783A00000018007L});
    public static final BitSet FOLLOW_rhs_in_assignment_expression1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_literal1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});

}