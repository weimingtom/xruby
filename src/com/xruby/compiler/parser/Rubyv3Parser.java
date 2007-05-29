// $ANTLR 3.0b7 Rubyv3.g 2007-05-29 14:23:20

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "HASH", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "BXOR_ASSIGN", "ASSOC", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "COLON2", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'expression0'", "'expression1'", "'expression2'"
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
    public String getGrammarFileName() { return "Rubyv3.g"; }

    
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
    // Rubyv3.g:253:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // Rubyv3.g:254:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==113||(LA3_0>=115 && LA3_0<=117)||(LA3_0>=121 && LA3_0<=122)||(LA3_0>=126 && LA3_0<=129)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("253:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Rubyv3.g:254:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:254:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Rubyv3.g:254:19: terminal
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
                    // Rubyv3.g:254:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program216);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // Rubyv3.g:254:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Rubyv3.g:254:45: terminal
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
    // Rubyv3.g:257:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // Rubyv3.g:258:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // Rubyv3.g:258:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list232);
            statement4=statement();
            _fsp--;

            list_statement.add(statement4.getTree());
            // Rubyv3.g:258:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // Rubyv3.g:258:16: ( terminal )+ statement
            	    {
            	    // Rubyv3.g:258:16: ( terminal )+
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
            	    	    // Rubyv3.g:258:16: terminal
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
            // 258:38: -> ^( STATEMENT_LIST ( statement )* )
            {
                // Rubyv3.g:258:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // Rubyv3.g:258:58: ( statement )*
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
    // Rubyv3.g:265:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line=new ArrayList();
        List list_expression=new ArrayList();

        try {
            // Rubyv3.g:266:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // Rubyv3.g:266:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement264);
            expression7=expression();
            _fsp--;

            list_expression.add(expression7.getTree());
            // Rubyv3.g:266:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Rubyv3.g:266:16: modifier_line
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
            // 266:33: -> ^( STATEMENT expression ( modifier_line )* )
            {
                // Rubyv3.g:266:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, list_expression.get(i_0));
                // Rubyv3.g:266:59: ( modifier_line )*
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
    // Rubyv3.g:269:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // Rubyv3.g:270:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // Rubyv3.g:270:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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

            // Rubyv3.g:270:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Rubyv3.g:270:81: line_break
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
    // Rubyv3.g:288:1: block_expression : 'begin' body 'end' ;
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
            // Rubyv3.g:289:4: ( 'begin' body 'end' )
            // Rubyv3.g:289:4: 'begin' body 'end'
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
    // Rubyv3.g:290:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // Rubyv3.g:290:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==114||(LA10_0>=118 && LA10_0<=119)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==113||(LA10_0>=115 && LA10_0<=117)||(LA10_0>=121 && LA10_0<=122)||(LA10_0>=126 && LA10_0<=129)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("290:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Rubyv3.g:290:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:290:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Rubyv3.g:290:8: SEMI
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
                    // Rubyv3.g:290:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body415);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // Rubyv3.g:290:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Rubyv3.g:290:30: terminal
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
    // Rubyv3.g:291:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // Rubyv3.g:292:4: ( 'false' | 'nil' | 'true' )
            // Rubyv3.g:
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
    // Rubyv3.g:293:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
            // Rubyv3.g:294:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // Rubyv3.g:294:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
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
            // Rubyv3.g:295:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==118) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Rubyv3.g:295:22: 'elsif' e1= expression seperator body1+= body
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

            // Rubyv3.g:296:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==119) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Rubyv3.g:296:11: 'else' body2= body
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
            // 297:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
            {
                // Rubyv3.g:297:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, e0.tree);
                adaptor.addChild(root_1, body0.tree);
                // Rubyv3.g:297:35: ( $e1)*
                {
                int n_1 = e1==null ? 0 : 1;


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, e1.tree);

                }
                }
                // Rubyv3.g:297:40: ( $body1)*
                {
                int n_1 = list_body1 == null ? 0 : list_body1.size();
                 


                for (int i_1=0; i_1<n_1; i_1++) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)list_body1.get(i_1)).getTree());

                }
                }
                // Rubyv3.g:297:48: ( $body2)?
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
    // Rubyv3.g:300:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // Rubyv3.g:301:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // Rubyv3.g:301:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:301:3: ( LINE_BREAK )+
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
                    	    // Rubyv3.g:301:3: LINE_BREAK
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
                    // Rubyv3.g:301:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator559); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // Rubyv3.g:301:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Rubyv3.g:301:19: LINE_BREAK
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
                    // Rubyv3.g:301:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:301:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Rubyv3.g:301:33: LINE_BREAK
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

                    // Rubyv3.g:301:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Rubyv3.g:301:52: LINE_BREAK
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
    // Rubyv3.g:302:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // Rubyv3.g:303:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // Rubyv3.g:303:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
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
            // Rubyv3.g:303:32: ( 'then' | ':' | line_break )
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
                    new NoViableAltException("303:32: ( 'then' | ':' | line_break )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // Rubyv3.g:303:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,120,FOLLOW_120_in_unless_expression586); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:303:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression588); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:303:44: line_break
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
            // Rubyv3.g:305:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==119) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Rubyv3.g:305:11: 'else' body
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
    // Rubyv3.g:307:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // Rubyv3.g:307:11: ( SEMI | line_break )
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
                    new NoViableAltException("307:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // Rubyv3.g:307:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal636); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:307:17: line_break
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
    // Rubyv3.g:308:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // Rubyv3.g:309:5: ( LINE_BREAK )
            // Rubyv3.g:309:5: LINE_BREAK
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
    // Rubyv3.g:341:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // Rubyv3.g:342:5: ( 'alias' fitem fitem | andorExpression | primaryExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 121:
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
            case HASH:
            case REGEX:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
            case 113:
            case 115:
            case 116:
            case 117:
            case 126:
            case 127:
            case 128:
            case 129:
                {
                alt21=2;
                }
                break;
            case 122:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("341:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // Rubyv3.g:342:5: 'alias' fitem fitem
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
                    // Rubyv3.g:342:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression701);
                    andorExpression46=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression46.getTree());

                    }
                    break;
                case 3 :
                    // Rubyv3.g:342:42: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_expression703);
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
    // Rubyv3.g:343:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodDefinition_return methodDefinition48 = null;



        try {
            // Rubyv3.g:344:4: ( methodDefinition )
            // Rubyv3.g:344:4: methodDefinition
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodDefinition_in_primaryExpression711);
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
    // Rubyv3.g:345:1: methodDefinition : 'def' methodName methodDefinationArgument ( bodyStatement )? 'end' ;
    public final methodDefinition_return methodDefinition() throws RecognitionException {
        methodDefinition_return retval = new methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token string_literal53=null;
        methodName_return methodName50 = null;

        methodDefinationArgument_return methodDefinationArgument51 = null;

        bodyStatement_return bodyStatement52 = null;


        Object string_literal49_tree=null;
        Object string_literal53_tree=null;

        try {
            // Rubyv3.g:346:4: ( 'def' methodName methodDefinationArgument ( bodyStatement )? 'end' )
            // Rubyv3.g:346:4: 'def' methodName methodDefinationArgument ( bodyStatement )? 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,122,FOLLOW_122_in_methodDefinition719); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

            pushFollow(FOLLOW_methodName_in_methodDefinition722);
            methodName50=methodName();
            _fsp--;

            adaptor.addChild(root_0, methodName50.getTree());
            enterScope();
            pushFollow(FOLLOW_methodDefinationArgument_in_methodDefinition726);
            methodDefinationArgument51=methodDefinationArgument();
            _fsp--;

            adaptor.addChild(root_0, methodDefinationArgument51.getTree());
            // Rubyv3.g:346:63: ( bodyStatement )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=HEREDOC_STRING && LA22_0<=FLOAT)||LA22_0==SYMBOL||(LA22_0>=IF_MODIFIER && LA22_0<=UNLESS_MODIFIER)||LA22_0==ID||(LA22_0>=BNOT && LA22_0<=REGEX)||(LA22_0>=SINGLE_QUOTE_STRING && LA22_0<=DOUBLE_QUOTE_STRING)||LA22_0==113||(LA22_0>=115 && LA22_0<=117)||(LA22_0>=121 && LA22_0<=122)||(LA22_0>=126 && LA22_0<=129)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Rubyv3.g:346:64: bodyStatement
                    {
                    pushFollow(FOLLOW_bodyStatement_in_methodDefinition729);
                    bodyStatement52=bodyStatement();
                    _fsp--;

                    adaptor.addChild(root_0, bodyStatement52.getTree());

                    }
                    break;

            }

            string_literal53=(Token)input.LT(1);
            match(input,114,FOLLOW_114_in_methodDefinition733); 
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
    // Rubyv3.g:347:1: methodName : id= ID ;
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // Rubyv3.g:348:4: (id= ID )
            // Rubyv3.g:348:4: id= ID
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_methodName746); 
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
    // Rubyv3.g:349:1: methodDefinationArgument : ( '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )? | ( methodDefinationArgumentWithoutParen )? terminal );
    public final methodDefinationArgument_return methodDefinationArgument() throws RecognitionException {
        methodDefinationArgument_return retval = new methodDefinationArgument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        methodDefinationArgumentWithoutParen_return methodDefinationArgumentWithoutParen55 = null;

        terminal_return terminal57 = null;

        methodDefinationArgumentWithoutParen_return methodDefinationArgumentWithoutParen58 = null;

        terminal_return terminal59 = null;


        Object char_literal54_tree=null;
        Object char_literal56_tree=null;

        try {
            // Rubyv3.g:350:4: ( '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )? | ( methodDefinationArgumentWithoutParen )? terminal )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LPAREN) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)||LA26_0==ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("349:1: methodDefinationArgument : ( '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )? | ( methodDefinationArgumentWithoutParen )? terminal );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // Rubyv3.g:350:4: '(' ( methodDefinationArgumentWithoutParen )? ')' ( terminal )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal54=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_methodDefinationArgument756); 
                    char_literal54_tree = (Object)adaptor.create(char_literal54);
                    adaptor.addChild(root_0, char_literal54_tree);

                    // Rubyv3.g:350:8: ( methodDefinationArgumentWithoutParen )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Rubyv3.g:350:9: methodDefinationArgumentWithoutParen
                            {
                            pushFollow(FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument759);
                            methodDefinationArgumentWithoutParen55=methodDefinationArgumentWithoutParen();
                            _fsp--;

                            adaptor.addChild(root_0, methodDefinationArgumentWithoutParen55.getTree());

                            }
                            break;

                    }

                    char_literal56=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_methodDefinationArgument763); 
                    char_literal56_tree = (Object)adaptor.create(char_literal56);
                    adaptor.addChild(root_0, char_literal56_tree);

                    // Rubyv3.g:350:52: ( terminal )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=SEMI && LA24_0<=LINE_BREAK)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Rubyv3.g:350:53: terminal
                            {
                            pushFollow(FOLLOW_terminal_in_methodDefinationArgument766);
                            terminal57=terminal();
                            _fsp--;

                            adaptor.addChild(root_0, terminal57.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Rubyv3.g:351:10: ( methodDefinationArgumentWithoutParen )? terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:351:10: ( methodDefinationArgumentWithoutParen )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Rubyv3.g:351:11: methodDefinationArgumentWithoutParen
                            {
                            pushFollow(FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument780);
                            methodDefinationArgumentWithoutParen58=methodDefinationArgumentWithoutParen();
                            _fsp--;

                            adaptor.addChild(root_0, methodDefinationArgumentWithoutParen58.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_terminal_in_methodDefinationArgument784);
                    terminal59=terminal();
                    _fsp--;

                    adaptor.addChild(root_0, terminal59.getTree());

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
    // Rubyv3.g:352:1: methodDefinationArgumentWithoutParen : normalMethodDefinationArgument ;
    public final methodDefinationArgumentWithoutParen_return methodDefinationArgumentWithoutParen() throws RecognitionException {
        methodDefinationArgumentWithoutParen_return retval = new methodDefinationArgumentWithoutParen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        normalMethodDefinationArgument_return normalMethodDefinationArgument60 = null;



        try {
            // Rubyv3.g:353:4: ( normalMethodDefinationArgument )
            // Rubyv3.g:353:4: normalMethodDefinationArgument
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_normalMethodDefinationArgument_in_methodDefinationArgumentWithoutParen792);
            normalMethodDefinationArgument60=normalMethodDefinationArgument();
            _fsp--;

            adaptor.addChild(root_0, normalMethodDefinationArgument60.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:354:1: normalMethodDefinationArgument : variable ( '=' expression ) ;
    public final normalMethodDefinationArgument_return normalMethodDefinationArgument() throws RecognitionException {
        normalMethodDefinationArgument_return retval = new normalMethodDefinationArgument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal62=null;
        variable_return variable61 = null;

        expression_return expression63 = null;


        Object char_literal62_tree=null;

        try {
            // Rubyv3.g:355:4: ( variable ( '=' expression ) )
            // Rubyv3.g:355:4: variable ( '=' expression )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variable_in_normalMethodDefinationArgument800);
            variable61=variable();
            _fsp--;

            adaptor.addChild(root_0, variable61.getTree());
            // Rubyv3.g:355:13: ( '=' expression )
            // Rubyv3.g:355:15: '=' expression
            {
            char_literal62=(Token)input.LT(1);
            match(input,ASSIGN,FOLLOW_ASSIGN_in_normalMethodDefinationArgument804); 
            char_literal62_tree = (Object)adaptor.create(char_literal62);
            adaptor.addChild(root_0, char_literal62_tree);

            pushFollow(FOLLOW_expression_in_normalMethodDefinationArgument806);
            expression63=expression();
            _fsp--;

            adaptor.addChild(root_0, expression63.getTree());

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
    // Rubyv3.g:356:1: variable : id= ID ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // Rubyv3.g:356:11: (id= ID )
            // Rubyv3.g:356:11: id= ID
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable815); 
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
    // Rubyv3.g:357:1: bodyStatement : statement_list ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list64 = null;



        try {
            // Rubyv3.g:358:4: ( statement_list )
            // Rubyv3.g:358:4: statement_list
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_list_in_bodyStatement826);
            statement_list64=statement_list();
            _fsp--;

            adaptor.addChild(root_0, statement_list64.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:361:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname65 = null;



        try {
            // Rubyv3.g:361:9: ( fname )
            // Rubyv3.g:361:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem836);
            fname65=fname();
            _fsp--;

            adaptor.addChild(root_0, fname65.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:362:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID66=null;
        Token CONSTANT67=null;
        Token FID68=null;
        op_return op69 = null;


        Object ID66_tree=null;
        Object CONSTANT67_tree=null;
        Object FID68_tree=null;

        try {
            // Rubyv3.g:362:9: ( ID | CONSTANT | FID | op )
            int alt27=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt27=1;
                }
                break;
            case CONSTANT:
                {
                alt27=2;
                }
                break;
            case FID:
                {
                alt27=3;
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
            case 123:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("362:1: fname : ( ID | CONSTANT | FID | op );", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // Rubyv3.g:362:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID66=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname843); 
                    ID66_tree = (Object)adaptor.create(ID66);
                    adaptor.addChild(root_0, ID66_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:362:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT67=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname845); 
                    CONSTANT67_tree = (Object)adaptor.create(CONSTANT67);
                    adaptor.addChild(root_0, CONSTANT67_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:362:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID68=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname847); 
                    FID68_tree = (Object)adaptor.create(FID68);
                    adaptor.addChild(root_0, FID68_tree);


                    }
                    break;
                case 4 :
                    // Rubyv3.g:362:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname849);
                    op69=op();
                    _fsp--;

                    adaptor.addChild(root_0, op69.getTree());

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
    // Rubyv3.g:370:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set70=null;

        Object set70_tree=null;

        try {
            // Rubyv3.g:370:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set70=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==123 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set70));
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
    // Rubyv3.g:374:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;
        Token LINE_BREAK73=null;
        Token string_literal74=null;
        Token LINE_BREAK75=null;
        notExpression_return notExpression71 = null;

        notExpression_return notExpression76 = null;


        Object string_literal72_tree=null;
        Object LINE_BREAK73_tree=null;
        Object string_literal74_tree=null;
        Object LINE_BREAK75_tree=null;

        try {
            // Rubyv3.g:375:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // Rubyv3.g:375:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1010);
            notExpression71=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression71.getTree());
            // Rubyv3.g:375:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=124 && LA31_0<=125)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Rubyv3.g:376:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // Rubyv3.g:376:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==124) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==125) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("376:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // Rubyv3.g:376:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal72=(Token)input.LT(1);
            	            match(input,124,FOLLOW_124_in_andorExpression1020); 
            	            string_literal72_tree = (Object)adaptor.create(string_literal72);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal72_tree, root_0);

            	            // Rubyv3.g:376:15: ( LINE_BREAK )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==LINE_BREAK) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // Rubyv3.g:376:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK73=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1025); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop28;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:377:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal74=(Token)input.LT(1);
            	            match(input,125,FOLLOW_125_in_andorExpression1036); 
            	            string_literal74_tree = (Object)adaptor.create(string_literal74);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);

            	            // Rubyv3.g:377:14: ( LINE_BREAK )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==LINE_BREAK) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // Rubyv3.g:377:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK75=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1041); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop29;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1056);
            	    notExpression76=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression76.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // Rubyv3.g:382:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token LINE_BREAK78=null;
        notExpression_return notExpression79 = null;

        definedExpression_return definedExpression80 = null;


        Object string_literal77_tree=null;
        Object LINE_BREAK78_tree=null;

        try {
            // Rubyv3.g:383:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==126) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=HEREDOC_STRING && LA33_0<=FLOAT)||LA33_0==SYMBOL||(LA33_0>=IF_MODIFIER && LA33_0<=UNLESS_MODIFIER)||LA33_0==ID||(LA33_0>=BNOT && LA33_0<=REGEX)||(LA33_0>=SINGLE_QUOTE_STRING && LA33_0<=DOUBLE_QUOTE_STRING)||LA33_0==113||(LA33_0>=115 && LA33_0<=117)||(LA33_0>=127 && LA33_0<=129)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("382:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // Rubyv3.g:383:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal77=(Token)input.LT(1);
                    match(input,126,FOLLOW_126_in_notExpression1074); 
                    string_literal77_tree = (Object)adaptor.create(string_literal77);
                    root_0 = (Object)adaptor.becomeRoot(string_literal77_tree, root_0);

                    // Rubyv3.g:384:4: ( LINE_BREAK )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==LINE_BREAK) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Rubyv3.g:384:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK78=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1081); 

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1089);
                    notExpression79=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression79.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:386:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1095);
                    definedExpression80=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression80.getTree());

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
    // Rubyv3.g:388:1: definedExpression : assignmentExpression ;
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assignmentExpression_return assignmentExpression81 = null;



        try {
            // Rubyv3.g:389:4: ( assignmentExpression )
            // Rubyv3.g:389:4: assignmentExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_definedExpression1106);
            assignmentExpression81=assignmentExpression();
            _fsp--;

            adaptor.addChild(root_0, assignmentExpression81.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:390:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set84=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression82 = null;

        lhs_return lhs83 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression85 = null;


        Object set84_tree=null;

        try {
            // Rubyv3.g:391:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=HEREDOC_STRING && LA34_0<=FLOAT)||LA34_0==SYMBOL||(LA34_0>=IF_MODIFIER && LA34_0<=UNLESS_MODIFIER)||(LA34_0>=BNOT && LA34_0<=REGEX)||(LA34_0>=SINGLE_QUOTE_STRING && LA34_0<=DOUBLE_QUOTE_STRING)||LA34_0==113||(LA34_0>=115 && LA34_0<=117)||(LA34_0>=127 && LA34_0<=129)) ) {
                alt34=1;
            }
            else if ( (LA34_0==ID) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==EOF||LA34_2==LEFT_SHIFT||(LA34_2>=DIV && LA34_2<=LINE_BREAK)||(LA34_2>=COMPARE && LA34_2<=POWER)||(LA34_2>=QUESTION && LA34_2<=BAND)||LA34_2==RPAREN||LA34_2==COLON||LA34_2==114||(LA34_2>=118 && LA34_2<=120)||(LA34_2>=124 && LA34_2<=125)) ) {
                    alt34=1;
                }
                else if ( ((LA34_2>=ASSIGN && LA34_2<=POWER_ASSIGN)) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("390:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 34, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("390:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // Rubyv3.g:391:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1114);
                    ternaryIfThenElseExpression82=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression82.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:392:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1128);
                    lhs83=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs83.getTree());
                    set84=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set84), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1130);    throw mse;
                    }

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1174);
                    ternaryIfThenElseExpression85=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression85.getTree());
                    addVariable(input.toString(lhs83.start,lhs83.stop));

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
    // Rubyv3.g:395:1: ternaryIfThenElseExpression : rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION87=null;
        Token char_literal89=null;
        rangeExpression_return rangeExpression86 = null;

        rangeExpression_return rangeExpression88 = null;

        rangeExpression_return rangeExpression90 = null;


        Object QUESTION87_tree=null;
        Object char_literal89_tree=null;

        try {
            // Rubyv3.g:396:5: ( rangeExpression ( | QUESTION rangeExpression ':' rangeExpression ) )
            // Rubyv3.g:396:5: rangeExpression ( | QUESTION rangeExpression ':' rangeExpression )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1186);
            rangeExpression86=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, rangeExpression86.getTree());
            // Rubyv3.g:396:21: ( | QUESTION rangeExpression ':' rangeExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EOF||(LA35_0>=IF_MODIFIER && LA35_0<=LINE_BREAK)||LA35_0==RPAREN||LA35_0==COLON||LA35_0==114||(LA35_0>=118 && LA35_0<=120)||(LA35_0>=124 && LA35_0<=125)) ) {
                alt35=1;
            }
            else if ( (LA35_0==QUESTION) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("396:21: ( | QUESTION rangeExpression ':' rangeExpression )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // Rubyv3.g:396:23: 
                    {
                    }
                    break;
                case 2 :
                    // Rubyv3.g:396:26: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION87=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1193); 
                    QUESTION87_tree = (Object)adaptor.create(QUESTION87);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION87_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1196);
                    rangeExpression88=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression88.getTree());
                    char_literal89=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1198); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1201);
                    rangeExpression90=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression90.getTree());

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
    // Rubyv3.g:400:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE92=null;
        Token LINE_BREAK93=null;
        Token EXCLUSIVE_RANGE94=null;
        Token LINE_BREAK95=null;
        logicalOrExpression_return logicalOrExpression91 = null;

        logicalOrExpression_return logicalOrExpression96 = null;


        Object INCLUSIVE_RANGE92_tree=null;
        Object LINE_BREAK93_tree=null;
        Object EXCLUSIVE_RANGE94_tree=null;
        Object LINE_BREAK95_tree=null;

        try {
            // Rubyv3.g:401:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // Rubyv3.g:401:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1216);
            logicalOrExpression91=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression91.getTree());
            // Rubyv3.g:402:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=INCLUSIVE_RANGE && LA39_0<=EXCLUSIVE_RANGE)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Rubyv3.g:403:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // Rubyv3.g:403:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==INCLUSIVE_RANGE) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==EXCLUSIVE_RANGE) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("403:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // Rubyv3.g:403:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE92=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1235); 
            	            INCLUSIVE_RANGE92_tree = (Object)adaptor.create(INCLUSIVE_RANGE92);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE92_tree, root_0);

            	            // Rubyv3.g:403:24: ( LINE_BREAK )*
            	            loop36:
            	            do {
            	                int alt36=2;
            	                int LA36_0 = input.LA(1);

            	                if ( (LA36_0==LINE_BREAK) ) {
            	                    alt36=1;
            	                }


            	                switch (alt36) {
            	            	case 1 :
            	            	    // Rubyv3.g:403:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK93=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1239); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop36;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:404:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE94=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1250); 
            	            EXCLUSIVE_RANGE94_tree = (Object)adaptor.create(EXCLUSIVE_RANGE94);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE94_tree, root_0);

            	            // Rubyv3.g:404:24: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // Rubyv3.g:404:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK95=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1254); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1269);
            	    logicalOrExpression96=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // Rubyv3.g:411:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR98=null;
        Token LINE_BREAK99=null;
        logicalAndExpression_return logicalAndExpression97 = null;

        logicalAndExpression_return logicalAndExpression100 = null;


        Object LOGICAL_OR98_tree=null;
        Object LINE_BREAK99_tree=null;

        try {
            // Rubyv3.g:412:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // Rubyv3.g:412:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1289);
            logicalAndExpression97=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression97.getTree());
            // Rubyv3.g:413:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LOGICAL_OR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Rubyv3.g:414:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR98=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1321); 
            	    LOGICAL_OR98_tree = (Object)adaptor.create(LOGICAL_OR98);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR98_tree, root_0);

            	    // Rubyv3.g:414:18: ( LINE_BREAK )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==LINE_BREAK) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // Rubyv3.g:414:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK99=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1326); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1335);
            	    logicalAndExpression100=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression100.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // Rubyv3.g:420:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND102=null;
        Token LINE_BREAK103=null;
        equalityExpression_return equalityExpression101 = null;

        equalityExpression_return equalityExpression104 = null;


        Object LOGICAL_AND102_tree=null;
        Object LINE_BREAK103_tree=null;

        try {
            // Rubyv3.g:421:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // Rubyv3.g:421:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1355);
            equalityExpression101=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression101.getTree());
            // Rubyv3.g:422:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LOGICAL_AND) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Rubyv3.g:423:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND102=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1387); 
            	    LOGICAL_AND102_tree = (Object)adaptor.create(LOGICAL_AND102);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND102_tree, root_0);

            	    // Rubyv3.g:423:19: ( LINE_BREAK )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==LINE_BREAK) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // Rubyv3.g:423:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK103=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1392); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1401);
            	    equalityExpression104=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression104.getTree());

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
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // Rubyv3.g:429:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE106=null;
        Token LINE_BREAK107=null;
        Token EQUAL108=null;
        Token LINE_BREAK109=null;
        Token CASE_EQUAL110=null;
        Token LINE_BREAK111=null;
        Token NOT_EQUAL112=null;
        Token LINE_BREAK113=null;
        Token MATCH114=null;
        Token LINE_BREAK115=null;
        Token NOT_MATCH116=null;
        Token LINE_BREAK117=null;
        relationalExpression_return relationalExpression105 = null;

        relationalExpression_return relationalExpression118 = null;


        Object COMPARE106_tree=null;
        Object LINE_BREAK107_tree=null;
        Object EQUAL108_tree=null;
        Object LINE_BREAK109_tree=null;
        Object CASE_EQUAL110_tree=null;
        Object LINE_BREAK111_tree=null;
        Object NOT_EQUAL112_tree=null;
        Object LINE_BREAK113_tree=null;
        Object MATCH114_tree=null;
        Object LINE_BREAK115_tree=null;
        Object NOT_MATCH116_tree=null;
        Object LINE_BREAK117_tree=null;

        try {
            // Rubyv3.g:430:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // Rubyv3.g:430:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1421);
            relationalExpression105=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression105.getTree());
            // Rubyv3.g:431:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=COMPARE && LA51_0<=MATCH)||(LA51_0>=NOT_EQUAL && LA51_0<=NOT_MATCH)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Rubyv3.g:432:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // Rubyv3.g:432:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt50=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt50=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt50=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt50=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("432:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 50, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // Rubyv3.g:432:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE106=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1455); 
            	            COMPARE106_tree = (Object)adaptor.create(COMPARE106);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE106_tree, root_0);

            	            // Rubyv3.g:432:17: ( LINE_BREAK )*
            	            loop44:
            	            do {
            	                int alt44=2;
            	                int LA44_0 = input.LA(1);

            	                if ( (LA44_0==LINE_BREAK) ) {
            	                    alt44=1;
            	                }


            	                switch (alt44) {
            	            	case 1 :
            	            	    // Rubyv3.g:432:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK107=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1460); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop44;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:433:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL108=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1471); 
            	            EQUAL108_tree = (Object)adaptor.create(EQUAL108);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL108_tree, root_0);

            	            // Rubyv3.g:433:16: ( LINE_BREAK )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);

            	                if ( (LA45_0==LINE_BREAK) ) {
            	                    alt45=1;
            	                }


            	                switch (alt45) {
            	            	case 1 :
            	            	    // Rubyv3.g:433:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK109=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1477); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // Rubyv3.g:434:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL110=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1488); 
            	            CASE_EQUAL110_tree = (Object)adaptor.create(CASE_EQUAL110);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL110_tree, root_0);

            	            // Rubyv3.g:434:19: ( LINE_BREAK )*
            	            loop46:
            	            do {
            	                int alt46=2;
            	                int LA46_0 = input.LA(1);

            	                if ( (LA46_0==LINE_BREAK) ) {
            	                    alt46=1;
            	                }


            	                switch (alt46) {
            	            	case 1 :
            	            	    // Rubyv3.g:434:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK111=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1492); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop46;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // Rubyv3.g:435:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL112=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1503); 
            	            NOT_EQUAL112_tree = (Object)adaptor.create(NOT_EQUAL112);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL112_tree, root_0);

            	            // Rubyv3.g:435:19: ( LINE_BREAK )*
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==LINE_BREAK) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // Rubyv3.g:435:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK113=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1508); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop47;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // Rubyv3.g:436:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH114=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1519); 
            	            MATCH114_tree = (Object)adaptor.create(MATCH114);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH114_tree, root_0);

            	            // Rubyv3.g:436:16: ( LINE_BREAK )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==LINE_BREAK) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // Rubyv3.g:436:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK115=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1525); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // Rubyv3.g:437:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH116=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1536); 
            	            NOT_MATCH116_tree = (Object)adaptor.create(NOT_MATCH116);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH116_tree, root_0);

            	            // Rubyv3.g:437:19: ( LINE_BREAK )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==LINE_BREAK) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // Rubyv3.g:437:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK117=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1541); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1556);
            	    relationalExpression118=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression118.getTree());

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
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // Rubyv3.g:445:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN120=null;
        Token LINE_BREAK121=null;
        Token GREATER_THAN122=null;
        Token LINE_BREAK123=null;
        Token LESS_OR_EQUAL124=null;
        Token LINE_BREAK125=null;
        Token GREATER_OR_EQUAL126=null;
        Token LINE_BREAK127=null;
        orExpression_return orExpression119 = null;

        orExpression_return orExpression128 = null;


        Object LESS_THAN120_tree=null;
        Object LINE_BREAK121_tree=null;
        Object GREATER_THAN122_tree=null;
        Object LINE_BREAK123_tree=null;
        Object LESS_OR_EQUAL124_tree=null;
        Object LINE_BREAK125_tree=null;
        Object GREATER_OR_EQUAL126_tree=null;
        Object LINE_BREAK127_tree=null;

        try {
            // Rubyv3.g:446:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // Rubyv3.g:446:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1577);
            orExpression119=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression119.getTree());
            // Rubyv3.g:447:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=GREATER_THAN && LA57_0<=LESS_OR_EQUAL)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Rubyv3.g:448:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // Rubyv3.g:448:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt56=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt56=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt56=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt56=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt56=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("448:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 56, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt56) {
            	        case 1 :
            	            // Rubyv3.g:448:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN120=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1611); 
            	            LESS_THAN120_tree = (Object)adaptor.create(LESS_THAN120);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN120_tree, root_0);

            	            // Rubyv3.g:448:20: ( LINE_BREAK )*
            	            loop52:
            	            do {
            	                int alt52=2;
            	                int LA52_0 = input.LA(1);

            	                if ( (LA52_0==LINE_BREAK) ) {
            	                    alt52=1;
            	                }


            	                switch (alt52) {
            	            	case 1 :
            	            	    // Rubyv3.g:448:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK121=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1617); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop52;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:449:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN122=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1628); 
            	            GREATER_THAN122_tree = (Object)adaptor.create(GREATER_THAN122);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN122_tree, root_0);

            	            // Rubyv3.g:449:22: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // Rubyv3.g:449:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK123=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1633); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // Rubyv3.g:450:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL124=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1644); 
            	            LESS_OR_EQUAL124_tree = (Object)adaptor.create(LESS_OR_EQUAL124);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL124_tree, root_0);

            	            // Rubyv3.g:450:23: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);

            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }


            	                switch (alt54) {
            	            	case 1 :
            	            	    // Rubyv3.g:450:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1649); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // Rubyv3.g:451:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL126=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1660); 
            	            GREATER_OR_EQUAL126_tree = (Object)adaptor.create(GREATER_OR_EQUAL126);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL126_tree, root_0);

            	            // Rubyv3.g:451:25: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // Rubyv3.g:451:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK127=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1664); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1679);
            	    orExpression128=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression128.getTree());

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
    // $ANTLR end relationalExpression

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orExpression
    // Rubyv3.g:458:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR130=null;
        Token LINE_BREAK131=null;
        Token BOR132=null;
        Token LINE_BREAK133=null;
        andExpression_return andExpression129 = null;

        andExpression_return andExpression134 = null;


        Object BXOR130_tree=null;
        Object LINE_BREAK131_tree=null;
        Object BOR132_tree=null;
        Object LINE_BREAK133_tree=null;

        try {
            // Rubyv3.g:459:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // Rubyv3.g:459:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1699);
            andExpression129=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression129.getTree());
            // Rubyv3.g:460:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=BXOR && LA61_0<=BOR)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // Rubyv3.g:461:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // Rubyv3.g:461:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==BXOR) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==BOR) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("461:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // Rubyv3.g:461:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR130=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1733); 
            	            BXOR130_tree = (Object)adaptor.create(BXOR130);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR130_tree, root_0);

            	            // Rubyv3.g:461:15: ( LINE_BREAK )*
            	            loop58:
            	            do {
            	                int alt58=2;
            	                int LA58_0 = input.LA(1);

            	                if ( (LA58_0==LINE_BREAK) ) {
            	                    alt58=1;
            	                }


            	                switch (alt58) {
            	            	case 1 :
            	            	    // Rubyv3.g:461:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK131=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1739); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop58;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:462:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR132=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1750); 
            	            BOR132_tree = (Object)adaptor.create(BOR132);
            	            root_0 = (Object)adaptor.becomeRoot(BOR132_tree, root_0);

            	            // Rubyv3.g:462:14: ( LINE_BREAK )*
            	            loop59:
            	            do {
            	                int alt59=2;
            	                int LA59_0 = input.LA(1);

            	                if ( (LA59_0==LINE_BREAK) ) {
            	                    alt59=1;
            	                }


            	                switch (alt59) {
            	            	case 1 :
            	            	    // Rubyv3.g:462:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK133=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1756); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop59;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1771);
            	    andExpression134=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression134.getTree());

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
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpression
    // Rubyv3.g:469:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND136=null;
        Token LINE_BREAK137=null;
        shiftExpression_return shiftExpression135 = null;

        shiftExpression_return shiftExpression138 = null;


        Object BAND136_tree=null;
        Object LINE_BREAK137_tree=null;

        try {
            // Rubyv3.g:470:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // Rubyv3.g:470:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1791);
            shiftExpression135=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression135.getTree());
            // Rubyv3.g:471:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==BAND) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // Rubyv3.g:472:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND136=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1823); 
            	    BAND136_tree = (Object)adaptor.create(BAND136);
            	    root_0 = (Object)adaptor.becomeRoot(BAND136_tree, root_0);

            	    // Rubyv3.g:472:13: ( LINE_BREAK )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==LINE_BREAK) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // Rubyv3.g:472:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK137=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1829); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop62;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1838);
            	    shiftExpression138=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression138.getTree());

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
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // Rubyv3.g:480:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT140=null;
        Token LINE_BREAK141=null;
        Token RIGHT_SHIFT142=null;
        Token LINE_BREAK143=null;
        additiveExpression_return additiveExpression139 = null;

        additiveExpression_return additiveExpression144 = null;


        Object LEFT_SHIFT140_tree=null;
        Object LINE_BREAK141_tree=null;
        Object RIGHT_SHIFT142_tree=null;
        Object LINE_BREAK143_tree=null;

        try {
            // Rubyv3.g:481:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // Rubyv3.g:481:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1860);
            additiveExpression139=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression139.getTree());
            // Rubyv3.g:482:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==LEFT_SHIFT||LA67_0==RIGHT_SHIFT) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Rubyv3.g:483:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // Rubyv3.g:483:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==LEFT_SHIFT) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==RIGHT_SHIFT) ) {
            	        alt66=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("483:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // Rubyv3.g:483:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT140=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression1894); 
            	            LEFT_SHIFT140_tree = (Object)adaptor.create(LEFT_SHIFT140);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT140_tree, root_0);

            	            // Rubyv3.g:483:20: ( LINE_BREAK )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);

            	                if ( (LA64_0==LINE_BREAK) ) {
            	                    alt64=1;
            	                }


            	                switch (alt64) {
            	            	case 1 :
            	            	    // Rubyv3.g:483:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK141=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1899); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:484:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT142=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression1910); 
            	            RIGHT_SHIFT142_tree = (Object)adaptor.create(RIGHT_SHIFT142);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT142_tree, root_0);

            	            // Rubyv3.g:484:20: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);

            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }


            	                switch (alt65) {
            	            	case 1 :
            	            	    // Rubyv3.g:484:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK143=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1914); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1929);
            	    additiveExpression144=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression144.getTree());

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
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // Rubyv3.g:493:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS146=null;
        Token LINE_BREAK147=null;
        Token MINUS148=null;
        Token LINE_BREAK149=null;
        multiplicativeExpression_return multiplicativeExpression145 = null;

        multiplicativeExpression_return multiplicativeExpression150 = null;


        Object PLUS146_tree=null;
        Object LINE_BREAK147_tree=null;
        Object MINUS148_tree=null;
        Object LINE_BREAK149_tree=null;

        try {
            // Rubyv3.g:494:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // Rubyv3.g:494:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1951);
            multiplicativeExpression145=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression145.getTree());
            // Rubyv3.g:495:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=PLUS && LA71_0<=MINUS)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // Rubyv3.g:496:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // Rubyv3.g:496:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==PLUS) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==MINUS) ) {
            	        alt70=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("496:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // Rubyv3.g:496:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS146=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression1985); 
            	            PLUS146_tree = (Object)adaptor.create(PLUS146);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS146_tree, root_0);

            	            // Rubyv3.g:496:16: ( LINE_BREAK )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);

            	                if ( (LA68_0==LINE_BREAK) ) {
            	                    alt68=1;
            	                }


            	                switch (alt68) {
            	            	case 1 :
            	            	    // Rubyv3.g:496:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression1992); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:497:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS148=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2003); 
            	            MINUS148_tree = (Object)adaptor.create(MINUS148);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS148_tree, root_0);

            	            // Rubyv3.g:497:17: ( LINE_BREAK )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                int LA69_0 = input.LA(1);

            	                if ( (LA69_0==LINE_BREAK) ) {
            	                    alt69=1;
            	                }


            	                switch (alt69) {
            	            	case 1 :
            	            	    // Rubyv3.g:497:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK149=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2010); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop69;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2025);
            	    multiplicativeExpression150=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression150.getTree());

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
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // Rubyv3.g:504:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR152=null;
        Token LINE_BREAK153=null;
        Token DIV154=null;
        Token LINE_BREAK155=null;
        Token MOD156=null;
        Token LINE_BREAK157=null;
        powerExpression_return powerExpression151 = null;

        powerExpression_return powerExpression158 = null;


        Object STAR152_tree=null;
        Object LINE_BREAK153_tree=null;
        Object DIV154_tree=null;
        Object LINE_BREAK155_tree=null;
        Object MOD156_tree=null;
        Object LINE_BREAK157_tree=null;

        try {
            // Rubyv3.g:505:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // Rubyv3.g:505:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2045);
            powerExpression151=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression151.getTree());
            // Rubyv3.g:506:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=DIV && LA76_0<=MOD)||LA76_0==STAR) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Rubyv3.g:507:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // Rubyv3.g:507:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt75=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt75=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt75=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt75=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("507:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 75, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt75) {
            	        case 1 :
            	            // Rubyv3.g:507:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR152=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2079); 
            	            STAR152_tree = (Object)adaptor.create(STAR152);
            	            root_0 = (Object)adaptor.becomeRoot(STAR152_tree, root_0);

            	            // Rubyv3.g:507:15: ( LINE_BREAK )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==LINE_BREAK) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // Rubyv3.g:507:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK153=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2085); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:508:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV154=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2096); 
            	            DIV154_tree = (Object)adaptor.create(DIV154);
            	            root_0 = (Object)adaptor.becomeRoot(DIV154_tree, root_0);

            	            // Rubyv3.g:508:14: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);

            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }


            	                switch (alt73) {
            	            	case 1 :
            	            	    // Rubyv3.g:508:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK155=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2102); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // Rubyv3.g:509:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD156=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2113); 
            	            MOD156_tree = (Object)adaptor.create(MOD156);
            	            root_0 = (Object)adaptor.becomeRoot(MOD156_tree, root_0);

            	            // Rubyv3.g:509:14: ( LINE_BREAK )*
            	            loop74:
            	            do {
            	                int alt74=2;
            	                int LA74_0 = input.LA(1);

            	                if ( (LA74_0==LINE_BREAK) ) {
            	                    alt74=1;
            	                }


            	                switch (alt74) {
            	            	case 1 :
            	            	    // Rubyv3.g:509:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2119); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop74;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2134);
            	    powerExpression158=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // Rubyv3.g:517:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER160=null;
        Token LINE_BREAK161=null;
        bnotExpression_return bnotExpression159 = null;

        bnotExpression_return bnotExpression162 = null;


        Object POWER160_tree=null;
        Object LINE_BREAK161_tree=null;

        try {
            // Rubyv3.g:518:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // Rubyv3.g:518:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2155);
            bnotExpression159=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression159.getTree());
            // Rubyv3.g:519:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==POWER) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Rubyv3.g:520:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER160=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2190); 
            	    POWER160_tree = (Object)adaptor.create(POWER160);
            	    root_0 = (Object)adaptor.becomeRoot(POWER160_tree, root_0);

            	    // Rubyv3.g:520:14: ( LINE_BREAK )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==LINE_BREAK) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // Rubyv3.g:520:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK161=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2196); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2205);
            	    bnotExpression162=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression162.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // Rubyv3.g:526:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT163=null;
        Token LINE_BREAK164=null;
        Token NOT165=null;
        Token LINE_BREAK166=null;
        command_return command167 = null;


        Object BNOT163_tree=null;
        Object LINE_BREAK164_tree=null;
        Object NOT165_tree=null;
        Object LINE_BREAK166_tree=null;

        try {
            // Rubyv3.g:527:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // Rubyv3.g:527:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // Rubyv3.g:527:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop81:
            do {
                int alt81=3;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==BNOT) ) {
                    alt81=1;
                }
                else if ( (LA81_0==NOT) ) {
                    alt81=2;
                }


                switch (alt81) {
            	case 1 :
            	    // Rubyv3.g:527:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT163=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2227); 
            	    BNOT163_tree = (Object)adaptor.create(BNOT163);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT163_tree, root_0);

            	    // Rubyv3.g:527:15: ( LINE_BREAK )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==LINE_BREAK) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // Rubyv3.g:527:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK164=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2233); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop79;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // Rubyv3.g:528:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT165=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2243); 
            	    NOT165_tree = (Object)adaptor.create(NOT165);
            	    root_0 = (Object)adaptor.becomeRoot(NOT165_tree, root_0);

            	    // Rubyv3.g:528:13: ( LINE_BREAK )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==LINE_BREAK) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // Rubyv3.g:528:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK166=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2249); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2263);
            command167=command();
            _fsp--;

            adaptor.addChild(root_0, command167.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:532:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression ) ;
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        Token ID172=null;
        literal_return literal171 = null;

        boolean_expression_return boolean_expression173 = null;

        block_expression_return block_expression174 = null;

        if_expression_return if_expression175 = null;

        unless_expression_return unless_expression176 = null;


        Object string_literal168_tree=null;
        Object string_literal169_tree=null;
        Object string_literal170_tree=null;
        Object ID172_tree=null;

        try {
            // Rubyv3.g:534:3: ( ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression ) )
            // Rubyv3.g:534:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            {
            root_0 = (Object)adaptor.nil();

            // Rubyv3.g:534:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            int alt82=9;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt82=1;
                }
                break;
            case 128:
                {
                alt82=2;
                }
                break;
            case 129:
                {
                alt82=3;
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
                alt82=4;
                }
                break;
            case ID:
                {
                alt82=5;
                }
                break;
            case 115:
            case 116:
            case 117:
                {
                alt82=6;
                }
                break;
            case 113:
                {
                alt82=7;
                }
                break;
            case IF_MODIFIER:
                {
                alt82=8;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt82=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("534:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // Rubyv3.g:534:4: 'expression0'
                    {
                    string_literal168=(Token)input.LT(1);
                    match(input,127,FOLLOW_127_in_command2278); 
                    string_literal168_tree = (Object)adaptor.create(string_literal168);
                    adaptor.addChild(root_0, string_literal168_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:534:20: 'expression1'
                    {
                    string_literal169=(Token)input.LT(1);
                    match(input,128,FOLLOW_128_in_command2282); 
                    string_literal169_tree = (Object)adaptor.create(string_literal169);
                    adaptor.addChild(root_0, string_literal169_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:534:36: 'expression2'
                    {
                    string_literal170=(Token)input.LT(1);
                    match(input,129,FOLLOW_129_in_command2286); 
                    string_literal170_tree = (Object)adaptor.create(string_literal170);
                    adaptor.addChild(root_0, string_literal170_tree);


                    }
                    break;
                case 4 :
                    // Rubyv3.g:534:50: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2288);
                    literal171=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal171.getTree());

                    }
                    break;
                case 5 :
                    // Rubyv3.g:534:58: ID
                    {
                    ID172=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_command2290); 
                    ID172_tree = (Object)adaptor.create(ID172);
                    adaptor.addChild(root_0, ID172_tree);


                    }
                    break;
                case 6 :
                    // Rubyv3.g:534:61: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2292);
                    boolean_expression173=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression173.getTree());

                    }
                    break;
                case 7 :
                    // Rubyv3.g:534:81: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2295);
                    block_expression174=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression174.getTree());

                    }
                    break;
                case 8 :
                    // Rubyv3.g:534:98: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2297);
                    if_expression175=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression175.getTree());

                    }
                    break;
                case 9 :
                    // Rubyv3.g:534:112: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2299);
                    unless_expression176=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression176.getTree());

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
    // Rubyv3.g:537:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID177=null;

        Object ID177_tree=null;

        try {
            // Rubyv3.g:537:7: ( ID )
            // Rubyv3.g:537:7: ID
            {
            root_0 = (Object)adaptor.nil();

            ID177=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2311); 
            ID177_tree = (Object)adaptor.create(ID177);
            adaptor.addChild(root_0, ID177_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:538:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression178 = null;



        try {
            // Rubyv3.g:538:7: ( expression )
            // Rubyv3.g:538:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2318);
            expression178=expression();
            _fsp--;

            adaptor.addChild(root_0, expression178.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:542:1: literal : ( INT | FLOAT | string | ARRAY | HASH | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT179=null;
        Token FLOAT180=null;
        Token ARRAY182=null;
        Token HASH183=null;
        Token SYMBOL184=null;
        Token REGEX185=null;
        string_return string181 = null;


        Object INT179_tree=null;
        Object FLOAT180_tree=null;
        Object ARRAY182_tree=null;
        Object HASH183_tree=null;
        Object SYMBOL184_tree=null;
        Object REGEX185_tree=null;

        try {
            // Rubyv3.g:542:11: ( INT | FLOAT | string | ARRAY | HASH | SYMBOL | REGEX )
            int alt83=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt83=1;
                }
                break;
            case FLOAT:
                {
                alt83=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt83=3;
                }
                break;
            case ARRAY:
                {
                alt83=4;
                }
                break;
            case HASH:
                {
                alt83=5;
                }
                break;
            case SYMBOL:
                {
                alt83=6;
                }
                break;
            case REGEX:
                {
                alt83=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("542:1: literal : ( INT | FLOAT | string | ARRAY | HASH | SYMBOL | REGEX );", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // Rubyv3.g:542:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT179=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2328); 
                    INT179_tree = (Object)adaptor.create(INT179);
                    adaptor.addChild(root_0, INT179_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:542:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT180=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2330); 
                    FLOAT180_tree = (Object)adaptor.create(FLOAT180);
                    adaptor.addChild(root_0, FLOAT180_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:542:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2332);
                    string181=string();
                    _fsp--;

                    adaptor.addChild(root_0, string181.getTree());

                    }
                    break;
                case 4 :
                    // Rubyv3.g:542:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY182=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2334); 
                    ARRAY182_tree = (Object)adaptor.create(ARRAY182);
                    adaptor.addChild(root_0, ARRAY182_tree);


                    }
                    break;
                case 5 :
                    // Rubyv3.g:542:34: HASH
                    {
                    root_0 = (Object)adaptor.nil();

                    HASH183=(Token)input.LT(1);
                    match(input,HASH,FOLLOW_HASH_in_literal2336); 
                    HASH183_tree = (Object)adaptor.create(HASH183);
                    adaptor.addChild(root_0, HASH183_tree);


                    }
                    break;
                case 6 :
                    // Rubyv3.g:542:39: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL184=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2338); 
                    SYMBOL184_tree = (Object)adaptor.create(SYMBOL184);
                    adaptor.addChild(root_0, SYMBOL184_tree);


                    }
                    break;
                case 7 :
                    // Rubyv3.g:542:46: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX185=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2340); 
                    REGEX185_tree = (Object)adaptor.create(REGEX185);
                    adaptor.addChild(root_0, REGEX185_tree);


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
    // Rubyv3.g:595:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set186=null;

        Object set186_tree=null;

        try {
            // Rubyv3.g:595:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set186=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set186));
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
        "\1\167\2\u0081\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\116\uffff\1\3\3\uffff\2\3",
            "\2\4\2\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\6\4\14\uffff\2\4\22\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
            "\3\uffff\4\4",
            "\2\4\2\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\6\4\14\uffff\2\4\22\uffff\1\4\1\3\3\4\2\3\1\uffff\2\4"+
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
            return "()* loopback of 258:15: ( ( terminal )+ statement )*";
        }
    }
    static final String DFA17_eotS =
        "\5\uffff";
    static final String DFA17_eofS =
        "\5\uffff";
    static final String DFA17_minS =
        "\1\43\1\15\3\uffff";
    static final String DFA17_maxS =
        "\1\170\1\u0081\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\111\uffff\1\2\12\uffff\1\3",
            "\2\4\2\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\1\uffff\1\4\45"+
            "\uffff\6\4\14\uffff\2\4\22\uffff\7\4\1\3\2\4\3\uffff\4\4",
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
            return "300:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program212 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_statement_list_in_program216 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_program218 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_statement_in_statement_list232 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list235 = new BitSet(new long[]{0x0000002C60026000L,0xC63A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_statement_in_statement_list238 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_expression_in_statement264 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement267 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_set_in_modifier_line307 = new BitSet(new long[]{0x0000002860026000L,0xC63A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_line_break_in_modifier_line321 = new BitSet(new long[]{0x0000002860026000L,0xC63A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_modifier_line325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_block_expression400 = new BitSet(new long[]{0x0000002460026000L,0xC63E00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_body_in_block_expression402 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_block_expression404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body411 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_statement_list_in_body415 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_body417 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression440 = new BitSet(new long[]{0x0000002060026000L,0xC63A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_if_expression445 = new BitSet(new long[]{0x0000000800000000L,0x0100200000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression447 = new BitSet(new long[]{0x0000002460026000L,0xC6FE00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_body_in_if_expression460 = new BitSet(new long[]{0x0000000000000000L,0x00C4000000000000L});
    public static final BitSet FOLLOW_118_in_if_expression463 = new BitSet(new long[]{0x0000002060026000L,0xC63A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_if_expression467 = new BitSet(new long[]{0x0000000800000000L,0x0100200000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression469 = new BitSet(new long[]{0x0000002460026000L,0xC6FE00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_body_in_if_expression473 = new BitSet(new long[]{0x0000000000000000L,0x00C4000000000000L});
    public static final BitSet FOLLOW_119_in_if_expression487 = new BitSet(new long[]{0x0000002460026000L,0xC63E00006001F800L,0x0000000000000003L});
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
    public static final BitSet FOLLOW_120_in_unless_expression586 = new BitSet(new long[]{0x0000002460026000L,0xC6BE00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_COLON_in_unless_expression588 = new BitSet(new long[]{0x0000002460026000L,0xC6BE00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_line_break_in_unless_expression590 = new BitSet(new long[]{0x0000002460026000L,0xC6BE00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_body_in_unless_expression602 = new BitSet(new long[]{0x0000000000000000L,0x0084000000000000L});
    public static final BitSet FOLLOW_119_in_unless_expression615 = new BitSet(new long[]{0x0000002460026000L,0xC63E00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_body_in_unless_expression617 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_unless_expression630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_expression694 = new BitSet(new long[]{0x0007FFE018019000L,0x0800080000000F00L});
    public static final BitSet FOLLOW_fitem_in_expression697 = new BitSet(new long[]{0x0007FFE018019000L,0x0800080000000F00L});
    public static final BitSet FOLLOW_fitem_in_expression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_methodDefinition719 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition722 = new BitSet(new long[]{0x0000002C00000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_methodDefinationArgument_in_methodDefinition726 = new BitSet(new long[]{0x0000002060026000L,0xC63E00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition729 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_methodDefinition733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodName746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodDefinationArgument756 = new BitSet(new long[]{0x0000002000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument759 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_methodDefinationArgument763 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_terminal_in_methodDefinationArgument766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinationArgumentWithoutParen_in_methodDefinationArgument780 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_terminal_in_methodDefinationArgument784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalMethodDefinationArgument_in_methodDefinationArgumentWithoutParen792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_normalMethodDefinationArgument800 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_normalMethodDefinationArgument804 = new BitSet(new long[]{0x0000002060026000L,0xC63A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_normalMethodDefinationArgument806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1010 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_124_in_andorExpression1020 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1025 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_125_in_andorExpression1036 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1041 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1056 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_126_in_notExpression1074 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1081 = new BitSet(new long[]{0x0000002860026000L,0xC03A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_notExpression_in_notExpression1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1128 = new BitSet(new long[]{0xFFF8000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_assignmentExpression1130 = new BitSet(new long[]{0x0000002060026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1193 = new BitSet(new long[]{0x0000002060026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1196 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1198 = new BitSet(new long[]{0x0000002060026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1216 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1235 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1239 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1250 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1254 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1269 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1321 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1326 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1387 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1392 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1421 = new BitSet(new long[]{0x000003C000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1455 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1460 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1471 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1477 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1488 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1492 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1503 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1508 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1519 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1525 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1536 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1541 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1556 = new BitSet(new long[]{0x000003C000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1577 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1611 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1617 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1628 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1633 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1644 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1649 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1660 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1664 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1679 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1733 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1739 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_BOR_in_orExpression1750 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1756 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_BAND_in_andExpression1823 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1829 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1860 = new BitSet(new long[]{0x0000400000001002L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression1894 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1899 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression1910 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1914 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1929 = new BitSet(new long[]{0x0000400000001002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1951 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression1985 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1992 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2003 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2010 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2025 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2045 = new BitSet(new long[]{0x0002000018000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2079 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2085 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2096 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2102 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2113 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2119 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2134 = new BitSet(new long[]{0x0002000018000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2155 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2190 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2196 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2205 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2227 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2233 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2243 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2249 = new BitSet(new long[]{0x0000002860026000L,0x803A00006001F800L,0x0000000000000003L});
    public static final BitSet FOLLOW_command_in_bnotExpression2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_command2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_command2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_command2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});

}