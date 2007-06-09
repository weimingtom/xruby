// $ANTLR 3.0 Rubyv3.g 2007-06-09 15:14:26

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "COLON2", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'", "'expression2'"
    };
    public static final int COMMA=112;
    public static final int GREATER_THAN=43;
    public static final int LOGICAL_AND_ASSIGN=63;
    public static final int INSTANCE_VARIABLE=88;
    public static final int MINUS=49;
    public static final int ESCAPE_INT=95;
    public static final int ARRAY=79;
    public static final int HEX_PART=91;
    public static final int LOGICAL_OR=69;
    public static final int LESS_THAN=45;
    public static final int META_PART=93;
    public static final int LEADING0_NUMBER=86;
    public static final int BOR=74;
    public static final int LEADING_MARK_DECIMAL=84;
    public static final int BINARY=83;
    public static final int COLON2=114;
    public static final int EMPTY_ARRAY=111;
    public static final int LCURLY=101;
    public static final int LINE_BREAK=36;
    public static final int CONSTANT=14;
    public static final int LEFT_SHIFT=11;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=87;
    public static final int IF_MODIFIER=30;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int ESCAPE_INT_PART=94;
    public static final int REGEX=80;
    public static final int SYMBOL=18;
    public static final int RPAREN=108;
    public static final int CONTROL_PART=92;
    public static final int DOUBLE_QUOTE_STRING=98;
    public static final int STAR_ASSIGN=62;
    public static final int PLUS=48;
    public static final int HEREDOC_INDENT_BEGIN=104;
    public static final int BODY=9;
    public static final int CASE_EQUAL=41;
    public static final int UNLESS_MODIFIER=31;
    public static final int MINUS_ASSIGN=56;
    public static final int GREATER_OR_EQUAL=44;
    public static final int EXCLUSIVE_RANGE=68;
    public static final int POWER_ASSIGN=65;
    public static final int MOD_ASSIGN=53;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int WS=37;
    public static final int STRING=27;
    public static final int DOUBLE_STRING_CHAR=100;
    public static final int RIGHT_SHIFT_ASSIGN=61;
    public static final int GLOBAL_VARIABLE=90;
    public static final int NON_LEADING0_NUMBER=96;
    public static final int SINGLE_QUOTE_STRING=97;
    public static final int HEREDOC_BEGIN=103;
    public static final int CLASS_VARIABLE=89;
    public static final int LBRACK=109;
    public static final int SEMI=35;
    public static final int DIV_ASSIGN=55;
    public static final int MRHS=24;
    public static final int BLOCK_ARG=22;
    public static final int EQUAL=40;
    public static final int LOGICAL_AND=70;
    public static final int COLON=113;
    public static final int DIV=28;
    public static final int HEX=82;
    public static final int SINGLETON_METHOD=26;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=67;
    public static final int BNOT=76;
    public static final int LOGICAL_OR_ASSIGN=64;
    public static final int ASSOC=105;
    public static final int FLOAT=13;
    public static final int OCTAL=81;
    public static final int MOD=29;
    public static final int PLUS_ASSIGN=57;
    public static final int QUESTION=66;
    public static final int UNTIL_MODIFIER=33;
    public static final int BLOCK=19;
    public static final int RCURLY=102;
    public static final int INT=78;
    public static final int BOR_ASSIGN=58;
    public static final int ASSIGN=52;
    public static final int LESS_OR_EQUAL=46;
    public static final int LPAREN=107;
    public static final int BAND=75;
    public static final int HEREDOC_STRING=12;
    public static final int NOT_MATCH=72;
    public static final int ID=38;
    public static final int NOT_EQUAL=71;
    public static final int BAND_ASSIGN=59;
    public static final int COMPLEMENT_ASSIGN=54;
    public static final int RIGHT_SHIFT=47;
    public static final int POWER=51;
    public static final int BXOR_ASSIGN=106;
    public static final int FID=15;
    public static final int NESTED_LHS=25;
    public static final int COMMENT=116;
    public static final int LEFT_SHIFT_ASSIGN=60;
    public static final int MATCH=42;
    public static final int WHILE_MODIFIER=32;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=115;
    public static final int EXP_PART=85;
    public static final int COMPARE=39;
    public static final int IF=7;
    public static final int ARG=10;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int EOF=-1;
    public static final int VARIABLE=16;
    public static final int CALL=17;
    public static final int RBRACK=110;
    public static final int RESCUE_MODIFIER=34;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=50;
    public static final int BXOR=73;
    public static final int NOT=77;
    public static final int SINGLE_STRING_CHAR=99;

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
    // Rubyv3.g:259:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;



        try {
            // Rubyv3.g:260:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=SEMI && LA3_0<=LINE_BREAK)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=HEREDOC_STRING && LA3_0<=FLOAT)||LA3_0==SYMBOL||(LA3_0>=IF_MODIFIER && LA3_0<=UNLESS_MODIFIER)||LA3_0==ID||(LA3_0>=BNOT && LA3_0<=REGEX)||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==LCURLY||LA3_0==117||(LA3_0>=119 && LA3_0<=121)||(LA3_0>=125 && LA3_0<=126)||(LA3_0>=130 && LA3_0<=134)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("259:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Rubyv3.g:260:19: ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:260:19: ( terminal )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=SEMI && LA1_0<=LINE_BREAK)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Rubyv3.g:260:19: terminal
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
                    // Rubyv3.g:260:30: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program227);
                    statement_list2=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // Rubyv3.g:260:45: ( terminal )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=SEMI && LA2_0<=LINE_BREAK)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Rubyv3.g:260:45: terminal
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
    // Rubyv3.g:263:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // Rubyv3.g:264:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // Rubyv3.g:264:5: statement ( ( terminal )+ statement )*
            {
            pushFollow(FOLLOW_statement_in_statement_list243);
            statement4=statement();
            _fsp--;

            stream_statement.add(statement4.getTree());
            // Rubyv3.g:264:15: ( ( terminal )+ statement )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // Rubyv3.g:264:16: ( terminal )+ statement
            	    {
            	    // Rubyv3.g:264:16: ( terminal )+
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
            	    	    // Rubyv3.g:264:16: terminal
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
                // Rubyv3.g:264:41: ^( STATEMENT_LIST ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                // Rubyv3.g:264:58: ( statement )*
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
    // Rubyv3.g:271:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;


        RewriteRuleSubtreeStream stream_modifier_line=new RewriteRuleSubtreeStream(adaptor,"rule modifier_line");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Rubyv3.g:272:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // Rubyv3.g:272:4: expression ( modifier_line )*
            {
            pushFollow(FOLLOW_expression_in_statement275);
            expression7=expression();
            _fsp--;

            stream_expression.add(expression7.getTree());
            // Rubyv3.g:272:15: ( modifier_line )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=IF_MODIFIER && LA6_0<=RESCUE_MODIFIER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Rubyv3.g:272:16: modifier_line
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
                // Rubyv3.g:272:36: ^( STATEMENT expression ( modifier_line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                // Rubyv3.g:272:59: ( modifier_line )*
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
    // Rubyv3.g:275:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree=null;

        try {
            // Rubyv3.g:276:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // Rubyv3.g:276:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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

            // Rubyv3.g:276:80: ( line_break )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE_BREAK) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Rubyv3.g:276:81: line_break
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
    // Rubyv3.g:294:1: block_expression : 'begin' body 'end' ;
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
            // Rubyv3.g:295:4: ( 'begin' body 'end' )
            // Rubyv3.g:295:4: 'begin' body 'end'
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
    // Rubyv3.g:296:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15=null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree=null;

        try {
            // Rubyv3.g:296:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SEMI||LA10_0==118||(LA10_0>=122 && LA10_0<=123)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=HEREDOC_STRING && LA10_0<=FLOAT)||LA10_0==SYMBOL||(LA10_0>=IF_MODIFIER && LA10_0<=UNLESS_MODIFIER)||LA10_0==ID||(LA10_0>=BNOT && LA10_0<=REGEX)||(LA10_0>=SINGLE_QUOTE_STRING && LA10_0<=DOUBLE_QUOTE_STRING)||LA10_0==LCURLY||LA10_0==117||(LA10_0>=119 && LA10_0<=121)||(LA10_0>=125 && LA10_0<=126)||(LA10_0>=130 && LA10_0<=134)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("296:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Rubyv3.g:296:8: ( SEMI )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:296:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==SEMI) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Rubyv3.g:296:8: SEMI
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
                    // Rubyv3.g:296:15: statement_list ( terminal )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body426);
                    statement_list16=statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // Rubyv3.g:296:30: ( terminal )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=SEMI && LA9_0<=LINE_BREAK)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Rubyv3.g:296:30: terminal
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
    // Rubyv3.g:297:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // Rubyv3.g:298:4: ( 'false' | 'nil' | 'true' )
            // Rubyv3.g:
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
    // Rubyv3.g:299:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
            // Rubyv3.g:300:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // Rubyv3.g:300:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
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
            // Rubyv3.g:301:21: ( 'elsif' e1= expression seperator body1+= body )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==122) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Rubyv3.g:301:22: 'elsif' e1= expression seperator body1+= body
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

            // Rubyv3.g:302:10: ( 'else' body2= body )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==123) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Rubyv3.g:302:11: 'else' body2= body
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
            // elements: e0, body0, e1, body1, body2
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
                // Rubyv3.g:303:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_e0.next());
                adaptor.addChild(root_1, stream_body0.next());
                // Rubyv3.g:303:35: ( $e1)*
                while ( stream_e1.hasNext() ) {
                    adaptor.addChild(root_1, stream_e1.next());

                }
                stream_e1.reset();
                // Rubyv3.g:303:40: ( $body1)*
                while ( stream_body1.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_body1.next()).getTree());

                }
                stream_body1.reset();
                // Rubyv3.g:303:48: ( $body2)?
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
    // Rubyv3.g:306:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // Rubyv3.g:307:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // Rubyv3.g:307:3: ( LINE_BREAK )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:307:3: ( LINE_BREAK )+
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
                    	    // Rubyv3.g:307:3: LINE_BREAK
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
                    // Rubyv3.g:307:15: ':' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal26=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_seperator570); 
                    char_literal26_tree = (Object)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // Rubyv3.g:307:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LINE_BREAK) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Rubyv3.g:307:19: LINE_BREAK
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
                    // Rubyv3.g:307:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // Rubyv3.g:307:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==LINE_BREAK) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Rubyv3.g:307:33: LINE_BREAK
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

                    // Rubyv3.g:307:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==LINE_BREAK) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Rubyv3.g:307:52: LINE_BREAK
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
    // Rubyv3.g:308:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // Rubyv3.g:309:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // Rubyv3.g:309:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
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
            // Rubyv3.g:309:32: ( 'then' | ':' | line_break )
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
                    // Rubyv3.g:309:33: 'then'
                    {
                    string_literal33=(Token)input.LT(1);
                    match(input,124,FOLLOW_124_in_unless_expression597); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:309:40: ':'
                    {
                    char_literal34=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_unless_expression599); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:309:44: line_break
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
            // Rubyv3.g:311:10: ( 'else' body )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==123) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Rubyv3.g:311:11: 'else' body
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
    // Rubyv3.g:313:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40=null;
        line_break_return line_break41 = null;


        Object SEMI40_tree=null;

        try {
            // Rubyv3.g:313:11: ( SEMI | line_break )
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
                    // Rubyv3.g:313:11: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI40=(Token)input.LT(1);
                    match(input,SEMI,FOLLOW_SEMI_in_terminal647); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:313:17: line_break
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
    // Rubyv3.g:314:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42=null;

        Object LINE_BREAK42_tree=null;

        try {
            // Rubyv3.g:315:5: ( LINE_BREAK )
            // Rubyv3.g:315:5: LINE_BREAK
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
    // Rubyv3.g:347:1: expression : ( 'alias' fitem fitem | andorExpression | primaryExpression );
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
            // Rubyv3.g:348:5: ( 'alias' fitem fitem | andorExpression | primaryExpression )
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
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
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
                    // Rubyv3.g:348:5: 'alias' fitem fitem
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
                    // Rubyv3.g:348:26: andorExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression712);
                    andorExpression46=andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression46.getTree());

                    }
                    break;
                case 3 :
                    // Rubyv3.g:348:42: primaryExpression
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
    // Rubyv3.g:349:1: primaryExpression : methodDefinition ;
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodDefinition_return methodDefinition48 = null;



        try {
            // Rubyv3.g:350:4: ( methodDefinition )
            // Rubyv3.g:350:4: methodDefinition
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
    // Rubyv3.g:351:1: methodDefinition : 'def' ( LINE_BREAK )* methodName f_arglist ( terminal )* bodyStatement 'end' ;
    public final methodDefinition_return methodDefinition() throws RecognitionException {
        methodDefinition_return retval = new methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token LINE_BREAK50=null;
        Token string_literal55=null;
        methodName_return methodName51 = null;

        f_arglist_return f_arglist52 = null;

        terminal_return terminal53 = null;

        bodyStatement_return bodyStatement54 = null;


        Object string_literal49_tree=null;
        Object LINE_BREAK50_tree=null;
        Object string_literal55_tree=null;

        try {
            // Rubyv3.g:352:4: ( 'def' ( LINE_BREAK )* methodName f_arglist ( terminal )* bodyStatement 'end' )
            // Rubyv3.g:352:4: 'def' ( LINE_BREAK )* methodName f_arglist ( terminal )* bodyStatement 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)input.LT(1);
            match(input,126,FOLLOW_126_in_methodDefinition730); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

            // Rubyv3.g:352:11: ( LINE_BREAK )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LINE_BREAK) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Rubyv3.g:352:12: LINE_BREAK
            	    {
            	    LINE_BREAK50=(Token)input.LT(1);
            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_methodDefinition734); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_methodName_in_methodDefinition739);
            methodName51=methodName();
            _fsp--;

            adaptor.addChild(root_0, methodName51.getTree());
            enterScope();
            pushFollow(FOLLOW_f_arglist_in_methodDefinition743);
            f_arglist52=f_arglist();
            _fsp--;

            adaptor.addChild(root_0, f_arglist52.getTree());
            // Rubyv3.g:352:63: ( terminal )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=SEMI && LA23_0<=LINE_BREAK)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Rubyv3.g:352:64: terminal
            	    {
            	    pushFollow(FOLLOW_terminal_in_methodDefinition746);
            	    terminal53=terminal();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            pushFollow(FOLLOW_bodyStatement_in_methodDefinition752);
            bodyStatement54=bodyStatement();
            _fsp--;

            adaptor.addChild(root_0, bodyStatement54.getTree());
            string_literal55=(Token)input.LT(1);
            match(input,118,FOLLOW_118_in_methodDefinition754); 
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
    // Rubyv3.g:353:1: methodName : id= ID ;
    public final methodName_return methodName() throws RecognitionException {
        methodName_return retval = new methodName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // Rubyv3.g:354:4: (id= ID )
            // Rubyv3.g:354:4: id= ID
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_methodName767); 
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

    public static class f_arglist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start f_arglist
    // Rubyv3.g:355:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' | f_args terminal );
    public final f_arglist_return f_arglist() throws RecognitionException {
        f_arglist_return retval = new f_arglist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal56=null;
        Token LINE_BREAK58=null;
        Token char_literal59=null;
        f_args_return f_args57 = null;

        f_args_return f_args60 = null;

        terminal_return terminal61 = null;


        Object char_literal56_tree=null;
        Object LINE_BREAK58_tree=null;
        Object char_literal59_tree=null;

        try {
            // Rubyv3.g:356:4: ( '(' f_args ( LINE_BREAK )* ')' | f_args terminal )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LPAREN) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=SEMI && LA25_0<=LINE_BREAK)||LA25_0==ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("355:1: f_arglist : ( '(' f_args ( LINE_BREAK )* ')' | f_args terminal );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // Rubyv3.g:356:4: '(' f_args ( LINE_BREAK )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal56=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_f_arglist777); 
                    pushFollow(FOLLOW_f_args_in_f_arglist780);
                    f_args57=f_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_args57.getTree());
                    // Rubyv3.g:356:17: ( LINE_BREAK )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==LINE_BREAK) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Rubyv3.g:356:18: LINE_BREAK
                    	    {
                    	    LINE_BREAK58=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_f_arglist784); 

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    char_literal59=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_f_arglist789); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:357:10: f_args terminal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_args_in_f_arglist802);
                    f_args60=f_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_args60.getTree());
                    pushFollow(FOLLOW_terminal_in_f_arglist804);
                    terminal61=terminal();
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
    // Rubyv3.g:358:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | );
    public final f_args_return f_args() throws RecognitionException {
        f_args_return retval = new f_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        f_norm_args_return f_norm_args62 = null;

        f_norm_args_return f_norm_args63 = null;

        f_opt_args_return f_opt_args65 = null;


        Object char_literal64_tree=null;

        try {
            // Rubyv3.g:358:10: ( f_norm_args | f_norm_args ',' f_opt_args | )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==COMMA) ) {
                    alt26=2;
                }
                else if ( ((LA26_1>=SEMI && LA26_1<=LINE_BREAK)||LA26_1==RPAREN) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("358:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | );", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA26_0>=SEMI && LA26_0<=LINE_BREAK)||LA26_0==RPAREN) ) {
                alt26=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("358:1: f_args : ( f_norm_args | f_norm_args ',' f_opt_args | );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // Rubyv3.g:358:10: f_norm_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args812);
                    f_norm_args62=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args62.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:358:24: f_norm_args ',' f_opt_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_f_norm_args_in_f_args816);
                    f_norm_args63=f_norm_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_norm_args63.getTree());
                    char_literal64=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_f_args818); 
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);

                    pushFollow(FOLLOW_f_opt_args_in_f_args820);
                    f_opt_args65=f_opt_args();
                    _fsp--;

                    adaptor.addChild(root_0, f_opt_args65.getTree());

                    }
                    break;
                case 3 :
                    // Rubyv3.g:358:51: 
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
    // Rubyv3.g:359:1: f_norm_args : ID ;
    public final f_norm_args_return f_norm_args() throws RecognitionException {
        f_norm_args_return retval = new f_norm_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID66=null;

        Object ID66_tree=null;

        try {
            // Rubyv3.g:364:2: ( ID )
            // Rubyv3.g:364:2: ID
            {
            root_0 = (Object)adaptor.nil();

            ID66=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_f_norm_args843); 
            ID66_tree = (Object)adaptor.create(ID66);
            adaptor.addChild(root_0, ID66_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:365:1: f_opt_args : ;
    public final f_opt_args_return f_opt_args() throws RecognitionException {
        f_opt_args_return retval = new f_opt_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        try {
            // Rubyv3.g:366:4: ()
            // Rubyv3.g:366:4: 
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
    // Rubyv3.g:368:1: bodyStatement : statement_list -> ^( BODY statement_list ) ;
    public final bodyStatement_return bodyStatement() throws RecognitionException {
        bodyStatement_return retval = new bodyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_list_return statement_list67 = null;


        RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");
        try {
            // Rubyv3.g:369:4: ( statement_list -> ^( BODY statement_list ) )
            // Rubyv3.g:369:4: statement_list
            {
            pushFollow(FOLLOW_statement_list_in_bodyStatement861);
            statement_list67=statement_list();
            _fsp--;

            stream_statement_list.add(statement_list67.getTree());

            // AST REWRITE
            // elements: statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 369:19: -> ^( BODY statement_list )
            {
                // Rubyv3.g:369:22: ^( BODY statement_list )
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
    // Rubyv3.g:372:1: fitem : fname ;
    public final fitem_return fitem() throws RecognitionException {
        fitem_return retval = new fitem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        fname_return fname68 = null;



        try {
            // Rubyv3.g:372:9: ( fname )
            // Rubyv3.g:372:9: fname
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fname_in_fitem879);
            fname68=fname();
            _fsp--;

            adaptor.addChild(root_0, fname68.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:373:1: fname : ( ID | CONSTANT | FID | op );
    public final fname_return fname() throws RecognitionException {
        fname_return retval = new fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID69=null;
        Token CONSTANT70=null;
        Token FID71=null;
        op_return op72 = null;


        Object ID69_tree=null;
        Object CONSTANT70_tree=null;
        Object FID71_tree=null;

        try {
            // Rubyv3.g:373:9: ( ID | CONSTANT | FID | op )
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
            case 127:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("373:1: fname : ( ID | CONSTANT | FID | op );", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // Rubyv3.g:373:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID69=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_fname886); 
                    ID69_tree = (Object)adaptor.create(ID69);
                    adaptor.addChild(root_0, ID69_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:373:12: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT70=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_fname888); 
                    CONSTANT70_tree = (Object)adaptor.create(CONSTANT70);
                    adaptor.addChild(root_0, CONSTANT70_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:373:21: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID71=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_fname890); 
                    FID71_tree = (Object)adaptor.create(FID71);
                    adaptor.addChild(root_0, FID71_tree);


                    }
                    break;
                case 4 :
                    // Rubyv3.g:373:25: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_fname892);
                    op72=op();
                    _fsp--;

                    adaptor.addChild(root_0, op72.getTree());

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
    // Rubyv3.g:381:1: op : ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' );
    public final op_return op() throws RecognitionException {
        op_return retval = new op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;

        Object set73_tree=null;

        try {
            // Rubyv3.g:381:17: ( '|' | '^' | '&' | COMPARE | EQUAL | CASE_EQUAL | MATCH | GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL | LEFT_SHIFT | RIGHT_SHIFT | PLUS | MINUS | STAR | DIV | MOD | POWER | '~' | '[]' | '[]=' )
            // Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set73=(Token)input.LT(1);
            if ( input.LA(1)==LEFT_SHIFT||(input.LA(1)>=DIV && input.LA(1)<=MOD)||(input.LA(1)>=COMPARE && input.LA(1)<=POWER)||(input.LA(1)>=BXOR && input.LA(1)<=BNOT)||input.LA(1)==EMPTY_ARRAY||input.LA(1)==127 ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set73));
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
    // Rubyv3.g:385:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal75=null;
        Token LINE_BREAK76=null;
        Token string_literal77=null;
        Token LINE_BREAK78=null;
        notExpression_return notExpression74 = null;

        notExpression_return notExpression79 = null;


        Object string_literal75_tree=null;
        Object LINE_BREAK76_tree=null;
        Object string_literal77_tree=null;
        Object LINE_BREAK78_tree=null;

        try {
            // Rubyv3.g:386:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // Rubyv3.g:386:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_notExpression_in_andorExpression1053);
            notExpression74=notExpression();
            _fsp--;

            adaptor.addChild(root_0, notExpression74.getTree());
            // Rubyv3.g:386:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=128 && LA31_0<=129)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Rubyv3.g:387:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
            	    {
            	    // Rubyv3.g:387:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==128) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==129) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("387:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // Rubyv3.g:387:7: 'and' ( LINE_BREAK )*
            	            {
            	            string_literal75=(Token)input.LT(1);
            	            match(input,128,FOLLOW_128_in_andorExpression1063); 
            	            string_literal75_tree = (Object)adaptor.create(string_literal75);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal75_tree, root_0);

            	            // Rubyv3.g:387:15: ( LINE_BREAK )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==LINE_BREAK) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // Rubyv3.g:387:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK76=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1068); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop28;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:388:7: 'or' ( LINE_BREAK )*
            	            {
            	            string_literal77=(Token)input.LT(1);
            	            match(input,129,FOLLOW_129_in_andorExpression1079); 
            	            string_literal77_tree = (Object)adaptor.create(string_literal77);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal77_tree, root_0);

            	            // Rubyv3.g:388:14: ( LINE_BREAK )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==LINE_BREAK) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // Rubyv3.g:388:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK78=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andorExpression1084); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop29;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_notExpression_in_andorExpression1099);
            	    notExpression79=notExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, notExpression79.getTree());

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
    // Rubyv3.g:393:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token LINE_BREAK81=null;
        notExpression_return notExpression82 = null;

        definedExpression_return definedExpression83 = null;


        Object string_literal80_tree=null;
        Object LINE_BREAK81_tree=null;

        try {
            // Rubyv3.g:394:5: ( 'not' ( LINE_BREAK )* notExpression | definedExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==130) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=HEREDOC_STRING && LA33_0<=FLOAT)||LA33_0==SYMBOL||(LA33_0>=IF_MODIFIER && LA33_0<=UNLESS_MODIFIER)||LA33_0==ID||(LA33_0>=BNOT && LA33_0<=REGEX)||(LA33_0>=SINGLE_QUOTE_STRING && LA33_0<=DOUBLE_QUOTE_STRING)||LA33_0==LCURLY||LA33_0==117||(LA33_0>=119 && LA33_0<=121)||(LA33_0>=131 && LA33_0<=134)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("393:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | definedExpression );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // Rubyv3.g:394:5: 'not' ( LINE_BREAK )* notExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal80=(Token)input.LT(1);
                    match(input,130,FOLLOW_130_in_notExpression1117); 
                    string_literal80_tree = (Object)adaptor.create(string_literal80);
                    root_0 = (Object)adaptor.becomeRoot(string_literal80_tree, root_0);

                    // Rubyv3.g:395:4: ( LINE_BREAK )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==LINE_BREAK) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Rubyv3.g:395:5: LINE_BREAK
                    	    {
                    	    LINE_BREAK81=(Token)input.LT(1);
                    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_notExpression1124); 

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression1132);
                    notExpression82=notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression82.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:397:5: definedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_definedExpression_in_notExpression1138);
                    definedExpression83=definedExpression();
                    _fsp--;

                    adaptor.addChild(root_0, definedExpression83.getTree());

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
    // Rubyv3.g:399:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );
    public final definedExpression_return definedExpression() throws RecognitionException {
        definedExpression_return retval = new definedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal84=null;
        assignmentExpression_return assignmentExpression85 = null;

        assignmentExpression_return assignmentExpression86 = null;


        Object string_literal84_tree=null;

        try {
            // Rubyv3.g:400:4: ( 'defined' assignmentExpression | assignmentExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==131) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=HEREDOC_STRING && LA34_0<=FLOAT)||LA34_0==SYMBOL||(LA34_0>=IF_MODIFIER && LA34_0<=UNLESS_MODIFIER)||LA34_0==ID||(LA34_0>=BNOT && LA34_0<=REGEX)||(LA34_0>=SINGLE_QUOTE_STRING && LA34_0<=DOUBLE_QUOTE_STRING)||LA34_0==LCURLY||LA34_0==117||(LA34_0>=119 && LA34_0<=121)||(LA34_0>=132 && LA34_0<=134)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("399:1: definedExpression : ( 'defined' assignmentExpression | assignmentExpression );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // Rubyv3.g:400:4: 'defined' assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal84=(Token)input.LT(1);
                    match(input,131,FOLLOW_131_in_definedExpression1149); 
                    string_literal84_tree = (Object)adaptor.create(string_literal84);
                    adaptor.addChild(root_0, string_literal84_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1151);
                    assignmentExpression85=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression85.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:401:10: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_definedExpression1162);
                    assignmentExpression86=assignmentExpression();
                    _fsp--;

                    adaptor.addChild(root_0, assignmentExpression86.getTree());

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
    // Rubyv3.g:409:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set89=null;
        ternaryIfThenElseExpression_return ternaryIfThenElseExpression87 = null;

        lhs_return lhs88 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression90 = null;


        Object set89_tree=null;

        try {
            // Rubyv3.g:410:4: ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=HEREDOC_STRING && LA35_0<=FLOAT)||LA35_0==SYMBOL||(LA35_0>=IF_MODIFIER && LA35_0<=UNLESS_MODIFIER)||(LA35_0>=BNOT && LA35_0<=REGEX)||(LA35_0>=SINGLE_QUOTE_STRING && LA35_0<=DOUBLE_QUOTE_STRING)||LA35_0==LCURLY||LA35_0==117||(LA35_0>=119 && LA35_0<=121)||(LA35_0>=132 && LA35_0<=134)) ) {
                alt35=1;
            }
            else if ( (LA35_0==ID) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==EOF||(LA35_2>=LEFT_SHIFT && LA35_2<=FLOAT)||LA35_2==SYMBOL||(LA35_2>=DIV && LA35_2<=LINE_BREAK)||(LA35_2>=ID && LA35_2<=POWER)||(LA35_2>=QUESTION && LA35_2<=REGEX)||(LA35_2>=SINGLE_QUOTE_STRING && LA35_2<=DOUBLE_QUOTE_STRING)||(LA35_2>=LCURLY && LA35_2<=RCURLY)||LA35_2==ASSOC||(LA35_2>=LPAREN && LA35_2<=RPAREN)||(LA35_2>=COMMA && LA35_2<=COLON)||(LA35_2>=117 && LA35_2<=124)||(LA35_2>=128 && LA35_2<=129)||(LA35_2>=131 && LA35_2<=134)) ) {
                    alt35=1;
                }
                else if ( ((LA35_2>=ASSIGN && LA35_2<=POWER_ASSIGN)) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("409:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 35, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("409:1: assignmentExpression : ( ternaryIfThenElseExpression | lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // Rubyv3.g:410:4: ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1176);
                    ternaryIfThenElseExpression87=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression87.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:411:13: lhs ( ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | DIV_ASSIGN | MINUS_ASSIGN | PLUS_ASSIGN | BOR_ASSIGN | BAND_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | STAR_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | POWER_ASSIGN ) ternaryIfThenElseExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_assignmentExpression1190);
                    lhs88=lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs88.getTree());
                    set89=(Token)input.LT(1);
                    if ( (input.LA(1)>=ASSIGN && input.LA(1)<=POWER_ASSIGN) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot(adaptor.create(set89), root_0);
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentExpression1192);    throw mse;
                    }

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1236);
                    ternaryIfThenElseExpression90=ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression90.getTree());
                    addVariable(input.toString(lhs88.start,lhs88.stop));

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
    // Rubyv3.g:414:1: ternaryIfThenElseExpression : r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION91=null;
        Token char_literal93=null;
        rangeExpression_return r = null;

        rangeExpression_return rangeExpression92 = null;

        rangeExpression_return rangeExpression94 = null;


        Object QUESTION91_tree=null;
        Object char_literal93_tree=null;

        try {
            // Rubyv3.g:415:5: (r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | ) )
            // Rubyv3.g:415:5: r= rangeExpression ( QUESTION rangeExpression ':' rangeExpression | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1250);
            r=rangeExpression();
            _fsp--;

            adaptor.addChild(root_0, r.getTree());
            // Rubyv3.g:415:23: ( QUESTION rangeExpression ':' rangeExpression | )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==QUESTION) ) {
                alt36=1;
            }
            else if ( (LA36_0==EOF||LA36_0==LEFT_SHIFT||(LA36_0>=DIV && LA36_0<=LINE_BREAK)||(LA36_0>=COMPARE && LA36_0<=POWER)||(LA36_0>=INCLUSIVE_RANGE && LA36_0<=BAND)||LA36_0==RCURLY||LA36_0==ASSOC||LA36_0==RPAREN||(LA36_0>=COMMA && LA36_0<=COLON)||LA36_0==118||(LA36_0>=122 && LA36_0<=124)||(LA36_0>=128 && LA36_0<=129)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("415:23: ( QUESTION rangeExpression ':' rangeExpression | )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // Rubyv3.g:415:25: QUESTION rangeExpression ':' rangeExpression
                    {
                    QUESTION91=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_ternaryIfThenElseExpression1254); 
                    QUESTION91_tree = (Object)adaptor.create(QUESTION91);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION91_tree, root_0);

                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1257);
                    rangeExpression92=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression92.getTree());
                    char_literal93=(Token)input.LT(1);
                    match(input,COLON,FOLLOW_COLON_in_ternaryIfThenElseExpression1259); 
                    pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1262);
                    rangeExpression94=rangeExpression();
                    _fsp--;

                    adaptor.addChild(root_0, rangeExpression94.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:415:73: 
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
    // Rubyv3.g:419:1: rangeExpression : logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* ;
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
            // Rubyv3.g:420:5: ( logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )* )
            // Rubyv3.g:420:5: logicalOrExpression ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1279);
            logicalOrExpression95=logicalOrExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalOrExpression95.getTree());
            // Rubyv3.g:421:10: ( ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==INCLUSIVE_RANGE) ) {
                    alt40=1;
                }
                else if ( (LA40_0==EXCLUSIVE_RANGE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // Rubyv3.g:422:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* ) logicalOrExpression
            	    {
            	    // Rubyv3.g:422:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==INCLUSIVE_RANGE) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==EXCLUSIVE_RANGE) ) {
            	        alt39=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("422:5: ( INCLUSIVE_RANGE ( LINE_BREAK )* | EXCLUSIVE_RANGE ( LINE_BREAK )* )", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // Rubyv3.g:422:7: INCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            INCLUSIVE_RANGE96=(Token)input.LT(1);
            	            match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1298); 
            	            INCLUSIVE_RANGE96_tree = (Object)adaptor.create(INCLUSIVE_RANGE96);
            	            root_0 = (Object)adaptor.becomeRoot(INCLUSIVE_RANGE96_tree, root_0);

            	            // Rubyv3.g:422:24: ( LINE_BREAK )*
            	            loop37:
            	            do {
            	                int alt37=2;
            	                int LA37_0 = input.LA(1);

            	                if ( (LA37_0==LINE_BREAK) ) {
            	                    alt37=1;
            	                }


            	                switch (alt37) {
            	            	case 1 :
            	            	    // Rubyv3.g:422:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK97=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1302); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop37;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:423:7: EXCLUSIVE_RANGE ( LINE_BREAK )*
            	            {
            	            EXCLUSIVE_RANGE98=(Token)input.LT(1);
            	            match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1313); 
            	            EXCLUSIVE_RANGE98_tree = (Object)adaptor.create(EXCLUSIVE_RANGE98);
            	            root_0 = (Object)adaptor.becomeRoot(EXCLUSIVE_RANGE98_tree, root_0);

            	            // Rubyv3.g:423:24: ( LINE_BREAK )*
            	            loop38:
            	            do {
            	                int alt38=2;
            	                int LA38_0 = input.LA(1);

            	                if ( (LA38_0==LINE_BREAK) ) {
            	                    alt38=1;
            	                }


            	                switch (alt38) {
            	            	case 1 :
            	            	    // Rubyv3.g:423:25: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK99=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_rangeExpression1317); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop38;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression1332);
            	    logicalOrExpression100=logicalOrExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalOrExpression100.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // Rubyv3.g:430:1: logicalOrExpression : logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* ;
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
            // Rubyv3.g:431:5: ( logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )* )
            // Rubyv3.g:431:5: logicalAndExpression ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1352);
            logicalAndExpression101=logicalAndExpression();
            _fsp--;

            adaptor.addChild(root_0, logicalAndExpression101.getTree());
            // Rubyv3.g:432:25: ( LOGICAL_OR ( LINE_BREAK )* logicalAndExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LOGICAL_OR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Rubyv3.g:433:5: LOGICAL_OR ( LINE_BREAK )* logicalAndExpression
            	    {
            	    LOGICAL_OR102=(Token)input.LT(1);
            	    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_logicalOrExpression1384); 
            	    LOGICAL_OR102_tree = (Object)adaptor.create(LOGICAL_OR102);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_OR102_tree, root_0);

            	    // Rubyv3.g:433:18: ( LINE_BREAK )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==LINE_BREAK) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // Rubyv3.g:433:19: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK103=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalOrExpression1389); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1398);
            	    logicalAndExpression104=logicalAndExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, logicalAndExpression104.getTree());

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
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAndExpression
    // Rubyv3.g:439:1: logicalAndExpression : equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* ;
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
            // Rubyv3.g:440:5: ( equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )* )
            // Rubyv3.g:440:5: equalityExpression ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1418);
            equalityExpression105=equalityExpression();
            _fsp--;

            adaptor.addChild(root_0, equalityExpression105.getTree());
            // Rubyv3.g:441:25: ( LOGICAL_AND ( LINE_BREAK )* equalityExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LOGICAL_AND) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Rubyv3.g:442:5: LOGICAL_AND ( LINE_BREAK )* equalityExpression
            	    {
            	    LOGICAL_AND106=(Token)input.LT(1);
            	    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_logicalAndExpression1450); 
            	    LOGICAL_AND106_tree = (Object)adaptor.create(LOGICAL_AND106);
            	    root_0 = (Object)adaptor.becomeRoot(LOGICAL_AND106_tree, root_0);

            	    // Rubyv3.g:442:19: ( LINE_BREAK )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==LINE_BREAK) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // Rubyv3.g:442:20: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK107=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_logicalAndExpression1455); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1464);
            	    equalityExpression108=equalityExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, equalityExpression108.getTree());

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
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // Rubyv3.g:448:1: equalityExpression : relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* ;
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
            // Rubyv3.g:449:5: ( relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )* )
            // Rubyv3.g:449:5: relationalExpression ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1484);
            relationalExpression109=relationalExpression();
            _fsp--;

            adaptor.addChild(root_0, relationalExpression109.getTree());
            // Rubyv3.g:450:25: ( ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case COMPARE:
                    {
                    alt52=1;
                    }
                    break;
                case EQUAL:
                    {
                    alt52=1;
                    }
                    break;
                case CASE_EQUAL:
                    {
                    alt52=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt52=1;
                    }
                    break;
                case MATCH:
                    {
                    alt52=1;
                    }
                    break;
                case NOT_MATCH:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // Rubyv3.g:451:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* ) relationalExpression
            	    {
            	    // Rubyv3.g:451:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )
            	    int alt51=6;
            	    switch ( input.LA(1) ) {
            	    case COMPARE:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case EQUAL:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case CASE_EQUAL:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt51=4;
            	        }
            	        break;
            	    case MATCH:
            	        {
            	        alt51=5;
            	        }
            	        break;
            	    case NOT_MATCH:
            	        {
            	        alt51=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("451:5: ( COMPARE ( LINE_BREAK )* | EQUAL ( LINE_BREAK )* | CASE_EQUAL ( LINE_BREAK )* | NOT_EQUAL ( LINE_BREAK )* | MATCH ( LINE_BREAK )* | NOT_MATCH ( LINE_BREAK )* )", 51, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt51) {
            	        case 1 :
            	            // Rubyv3.g:451:7: COMPARE ( LINE_BREAK )*
            	            {
            	            COMPARE110=(Token)input.LT(1);
            	            match(input,COMPARE,FOLLOW_COMPARE_in_equalityExpression1518); 
            	            COMPARE110_tree = (Object)adaptor.create(COMPARE110);
            	            root_0 = (Object)adaptor.becomeRoot(COMPARE110_tree, root_0);

            	            // Rubyv3.g:451:17: ( LINE_BREAK )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);

            	                if ( (LA45_0==LINE_BREAK) ) {
            	                    alt45=1;
            	                }


            	                switch (alt45) {
            	            	case 1 :
            	            	    // Rubyv3.g:451:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK111=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1523); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:452:7: EQUAL ( LINE_BREAK )*
            	            {
            	            EQUAL112=(Token)input.LT(1);
            	            match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1534); 
            	            EQUAL112_tree = (Object)adaptor.create(EQUAL112);
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL112_tree, root_0);

            	            // Rubyv3.g:452:16: ( LINE_BREAK )*
            	            loop46:
            	            do {
            	                int alt46=2;
            	                int LA46_0 = input.LA(1);

            	                if ( (LA46_0==LINE_BREAK) ) {
            	                    alt46=1;
            	                }


            	                switch (alt46) {
            	            	case 1 :
            	            	    // Rubyv3.g:452:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK113=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1540); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop46;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // Rubyv3.g:453:7: CASE_EQUAL ( LINE_BREAK )*
            	            {
            	            CASE_EQUAL114=(Token)input.LT(1);
            	            match(input,CASE_EQUAL,FOLLOW_CASE_EQUAL_in_equalityExpression1551); 
            	            CASE_EQUAL114_tree = (Object)adaptor.create(CASE_EQUAL114);
            	            root_0 = (Object)adaptor.becomeRoot(CASE_EQUAL114_tree, root_0);

            	            // Rubyv3.g:453:19: ( LINE_BREAK )*
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==LINE_BREAK) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // Rubyv3.g:453:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK115=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1555); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop47;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // Rubyv3.g:454:7: NOT_EQUAL ( LINE_BREAK )*
            	            {
            	            NOT_EQUAL116=(Token)input.LT(1);
            	            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_equalityExpression1566); 
            	            NOT_EQUAL116_tree = (Object)adaptor.create(NOT_EQUAL116);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL116_tree, root_0);

            	            // Rubyv3.g:454:19: ( LINE_BREAK )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==LINE_BREAK) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // Rubyv3.g:454:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK117=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1571); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 5 :
            	            // Rubyv3.g:455:7: MATCH ( LINE_BREAK )*
            	            {
            	            MATCH118=(Token)input.LT(1);
            	            match(input,MATCH,FOLLOW_MATCH_in_equalityExpression1582); 
            	            MATCH118_tree = (Object)adaptor.create(MATCH118);
            	            root_0 = (Object)adaptor.becomeRoot(MATCH118_tree, root_0);

            	            // Rubyv3.g:455:16: ( LINE_BREAK )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==LINE_BREAK) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // Rubyv3.g:455:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK119=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1588); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 6 :
            	            // Rubyv3.g:456:7: NOT_MATCH ( LINE_BREAK )*
            	            {
            	            NOT_MATCH120=(Token)input.LT(1);
            	            match(input,NOT_MATCH,FOLLOW_NOT_MATCH_in_equalityExpression1599); 
            	            NOT_MATCH120_tree = (Object)adaptor.create(NOT_MATCH120);
            	            root_0 = (Object)adaptor.becomeRoot(NOT_MATCH120_tree, root_0);

            	            // Rubyv3.g:456:19: ( LINE_BREAK )*
            	            loop50:
            	            do {
            	                int alt50=2;
            	                int LA50_0 = input.LA(1);

            	                if ( (LA50_0==LINE_BREAK) ) {
            	                    alt50=1;
            	                }


            	                switch (alt50) {
            	            	case 1 :
            	            	    // Rubyv3.g:456:20: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK121=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_equalityExpression1604); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop50;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1619);
            	    relationalExpression122=relationalExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, relationalExpression122.getTree());

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
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // Rubyv3.g:464:1: relationalExpression : orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* ;
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
            // Rubyv3.g:465:5: ( orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )* )
            // Rubyv3.g:465:5: orExpression ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpression_in_relationalExpression1640);
            orExpression123=orExpression();
            _fsp--;

            adaptor.addChild(root_0, orExpression123.getTree());
            // Rubyv3.g:466:25: ( ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression )*
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case LESS_THAN:
                    {
                    alt58=1;
                    }
                    break;
                case GREATER_THAN:
                    {
                    alt58=1;
                    }
                    break;
                case LESS_OR_EQUAL:
                    {
                    alt58=1;
                    }
                    break;
                case GREATER_OR_EQUAL:
                    {
                    alt58=1;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // Rubyv3.g:467:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* ) orExpression
            	    {
            	    // Rubyv3.g:467:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )
            	    int alt57=4;
            	    switch ( input.LA(1) ) {
            	    case LESS_THAN:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case GREATER_THAN:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case LESS_OR_EQUAL:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    case GREATER_OR_EQUAL:
            	        {
            	        alt57=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("467:5: ( LESS_THAN ( LINE_BREAK )* | GREATER_THAN ( LINE_BREAK )* | LESS_OR_EQUAL ( LINE_BREAK )* | GREATER_OR_EQUAL ( LINE_BREAK )* )", 57, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt57) {
            	        case 1 :
            	            // Rubyv3.g:467:7: LESS_THAN ( LINE_BREAK )*
            	            {
            	            LESS_THAN124=(Token)input.LT(1);
            	            match(input,LESS_THAN,FOLLOW_LESS_THAN_in_relationalExpression1674); 
            	            LESS_THAN124_tree = (Object)adaptor.create(LESS_THAN124);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_THAN124_tree, root_0);

            	            // Rubyv3.g:467:20: ( LINE_BREAK )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==LINE_BREAK) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // Rubyv3.g:467:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK125=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1680); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop53;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:468:7: GREATER_THAN ( LINE_BREAK )*
            	            {
            	            GREATER_THAN126=(Token)input.LT(1);
            	            match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_relationalExpression1691); 
            	            GREATER_THAN126_tree = (Object)adaptor.create(GREATER_THAN126);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_THAN126_tree, root_0);

            	            // Rubyv3.g:468:22: ( LINE_BREAK )*
            	            loop54:
            	            do {
            	                int alt54=2;
            	                int LA54_0 = input.LA(1);

            	                if ( (LA54_0==LINE_BREAK) ) {
            	                    alt54=1;
            	                }


            	                switch (alt54) {
            	            	case 1 :
            	            	    // Rubyv3.g:468:23: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK127=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1696); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop54;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // Rubyv3.g:469:7: LESS_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            LESS_OR_EQUAL128=(Token)input.LT(1);
            	            match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_relationalExpression1707); 
            	            LESS_OR_EQUAL128_tree = (Object)adaptor.create(LESS_OR_EQUAL128);
            	            root_0 = (Object)adaptor.becomeRoot(LESS_OR_EQUAL128_tree, root_0);

            	            // Rubyv3.g:469:23: ( LINE_BREAK )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==LINE_BREAK) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // Rubyv3.g:469:24: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK129=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1712); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 4 :
            	            // Rubyv3.g:470:7: GREATER_OR_EQUAL ( LINE_BREAK )*
            	            {
            	            GREATER_OR_EQUAL130=(Token)input.LT(1);
            	            match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1723); 
            	            GREATER_OR_EQUAL130_tree = (Object)adaptor.create(GREATER_OR_EQUAL130);
            	            root_0 = (Object)adaptor.becomeRoot(GREATER_OR_EQUAL130_tree, root_0);

            	            // Rubyv3.g:470:25: ( LINE_BREAK )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==LINE_BREAK) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // Rubyv3.g:470:26: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK131=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_relationalExpression1727); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_orExpression_in_relationalExpression1742);
            	    orExpression132=orExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, orExpression132.getTree());

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
    // $ANTLR end relationalExpression

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orExpression
    // Rubyv3.g:477:1: orExpression : andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* ;
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
            // Rubyv3.g:478:5: ( andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )* )
            // Rubyv3.g:478:5: andExpression ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression1762);
            andExpression133=andExpression();
            _fsp--;

            adaptor.addChild(root_0, andExpression133.getTree());
            // Rubyv3.g:479:25: ( ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==BXOR) ) {
                    alt62=1;
                }
                else if ( (LA62_0==BOR) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // Rubyv3.g:480:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* ) andExpression
            	    {
            	    // Rubyv3.g:480:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==BXOR) ) {
            	        alt61=1;
            	    }
            	    else if ( (LA61_0==BOR) ) {
            	        alt61=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("480:5: ( BXOR ( LINE_BREAK )* | BOR ( LINE_BREAK )* )", 61, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // Rubyv3.g:480:7: BXOR ( LINE_BREAK )*
            	            {
            	            BXOR134=(Token)input.LT(1);
            	            match(input,BXOR,FOLLOW_BXOR_in_orExpression1796); 
            	            BXOR134_tree = (Object)adaptor.create(BXOR134);
            	            root_0 = (Object)adaptor.becomeRoot(BXOR134_tree, root_0);

            	            // Rubyv3.g:480:15: ( LINE_BREAK )*
            	            loop59:
            	            do {
            	                int alt59=2;
            	                int LA59_0 = input.LA(1);

            	                if ( (LA59_0==LINE_BREAK) ) {
            	                    alt59=1;
            	                }


            	                switch (alt59) {
            	            	case 1 :
            	            	    // Rubyv3.g:480:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK135=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1802); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop59;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:481:7: BOR ( LINE_BREAK )*
            	            {
            	            BOR136=(Token)input.LT(1);
            	            match(input,BOR,FOLLOW_BOR_in_orExpression1813); 
            	            BOR136_tree = (Object)adaptor.create(BOR136);
            	            root_0 = (Object)adaptor.becomeRoot(BOR136_tree, root_0);

            	            // Rubyv3.g:481:14: ( LINE_BREAK )*
            	            loop60:
            	            do {
            	                int alt60=2;
            	                int LA60_0 = input.LA(1);

            	                if ( (LA60_0==LINE_BREAK) ) {
            	                    alt60=1;
            	                }


            	                switch (alt60) {
            	            	case 1 :
            	            	    // Rubyv3.g:481:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK137=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_orExpression1819); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop60;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_andExpression_in_orExpression1834);
            	    andExpression138=andExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, andExpression138.getTree());

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
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpression
    // Rubyv3.g:488:1: andExpression : shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* ;
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
            // Rubyv3.g:489:5: ( shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )* )
            // Rubyv3.g:489:5: shiftExpression ( BAND ( LINE_BREAK )* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_andExpression1854);
            shiftExpression139=shiftExpression();
            _fsp--;

            adaptor.addChild(root_0, shiftExpression139.getTree());
            // Rubyv3.g:490:25: ( BAND ( LINE_BREAK )* shiftExpression )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==BAND) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Rubyv3.g:491:5: BAND ( LINE_BREAK )* shiftExpression
            	    {
            	    BAND140=(Token)input.LT(1);
            	    match(input,BAND,FOLLOW_BAND_in_andExpression1886); 
            	    BAND140_tree = (Object)adaptor.create(BAND140);
            	    root_0 = (Object)adaptor.becomeRoot(BAND140_tree, root_0);

            	    // Rubyv3.g:491:13: ( LINE_BREAK )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==LINE_BREAK) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // Rubyv3.g:491:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK141=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_andExpression1892); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop63;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_shiftExpression_in_andExpression1901);
            	    shiftExpression142=shiftExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, shiftExpression142.getTree());

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
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start shiftExpression
    // Rubyv3.g:499:1: shiftExpression : additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* ;
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
            // Rubyv3.g:500:5: ( additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )* )
            // Rubyv3.g:500:5: additiveExpression ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1923);
            additiveExpression143=additiveExpression();
            _fsp--;

            adaptor.addChild(root_0, additiveExpression143.getTree());
            // Rubyv3.g:501:25: ( ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==LEFT_SHIFT) ) {
                    alt68=1;
                }
                else if ( (LA68_0==RIGHT_SHIFT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Rubyv3.g:502:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* ) additiveExpression
            	    {
            	    // Rubyv3.g:502:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==LEFT_SHIFT) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==RIGHT_SHIFT) ) {
            	        alt67=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("502:5: ( LEFT_SHIFT ( LINE_BREAK )* | RIGHT_SHIFT ( LINE_BREAK )* )", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // Rubyv3.g:502:7: LEFT_SHIFT ( LINE_BREAK )*
            	            {
            	            LEFT_SHIFT144=(Token)input.LT(1);
            	            match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shiftExpression1957); 
            	            LEFT_SHIFT144_tree = (Object)adaptor.create(LEFT_SHIFT144);
            	            root_0 = (Object)adaptor.becomeRoot(LEFT_SHIFT144_tree, root_0);

            	            // Rubyv3.g:502:20: ( LINE_BREAK )*
            	            loop65:
            	            do {
            	                int alt65=2;
            	                int LA65_0 = input.LA(1);

            	                if ( (LA65_0==LINE_BREAK) ) {
            	                    alt65=1;
            	                }


            	                switch (alt65) {
            	            	case 1 :
            	            	    // Rubyv3.g:502:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK145=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1962); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop65;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:503:7: RIGHT_SHIFT ( LINE_BREAK )*
            	            {
            	            RIGHT_SHIFT146=(Token)input.LT(1);
            	            match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shiftExpression1973); 
            	            RIGHT_SHIFT146_tree = (Object)adaptor.create(RIGHT_SHIFT146);
            	            root_0 = (Object)adaptor.becomeRoot(RIGHT_SHIFT146_tree, root_0);

            	            // Rubyv3.g:503:20: ( LINE_BREAK )*
            	            loop66:
            	            do {
            	                int alt66=2;
            	                int LA66_0 = input.LA(1);

            	                if ( (LA66_0==LINE_BREAK) ) {
            	                    alt66=1;
            	                }


            	                switch (alt66) {
            	            	case 1 :
            	            	    // Rubyv3.g:503:21: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK147=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_shiftExpression1977); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop66;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1992);
            	    additiveExpression148=additiveExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, additiveExpression148.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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
    // Rubyv3.g:512:1: additiveExpression : multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* ;
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
            // Rubyv3.g:513:5: ( multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )* )
            // Rubyv3.g:513:5: multiplicativeExpression ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2014);
            multiplicativeExpression149=multiplicativeExpression();
            _fsp--;

            adaptor.addChild(root_0, multiplicativeExpression149.getTree());
            // Rubyv3.g:514:25: ( ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==PLUS) ) {
                    alt72=1;
                }
                else if ( (LA72_0==MINUS) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // Rubyv3.g:515:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* ) multiplicativeExpression
            	    {
            	    // Rubyv3.g:515:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==PLUS) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==MINUS) ) {
            	        alt71=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("515:5: ( PLUS ( LINE_BREAK )* | MINUS ( LINE_BREAK )* )", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // Rubyv3.g:515:7: PLUS ( LINE_BREAK )*
            	            {
            	            PLUS150=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2048); 
            	            PLUS150_tree = (Object)adaptor.create(PLUS150);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS150_tree, root_0);

            	            // Rubyv3.g:515:16: ( LINE_BREAK )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                int LA69_0 = input.LA(1);

            	                if ( (LA69_0==LINE_BREAK) ) {
            	                    alt69=1;
            	                }


            	                switch (alt69) {
            	            	case 1 :
            	            	    // Rubyv3.g:515:17: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK151=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2055); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop69;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:516:7: MINUS ( LINE_BREAK )*
            	            {
            	            MINUS152=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2066); 
            	            MINUS152_tree = (Object)adaptor.create(MINUS152);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS152_tree, root_0);

            	            // Rubyv3.g:516:17: ( LINE_BREAK )*
            	            loop70:
            	            do {
            	                int alt70=2;
            	                int LA70_0 = input.LA(1);

            	                if ( (LA70_0==LINE_BREAK) ) {
            	                    alt70=1;
            	                }


            	                switch (alt70) {
            	            	case 1 :
            	            	    // Rubyv3.g:516:18: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK153=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_additiveExpression2073); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop70;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2088);
            	    multiplicativeExpression154=multiplicativeExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression154.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // Rubyv3.g:523:1: multiplicativeExpression : powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* ;
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
            // Rubyv3.g:524:5: ( powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )* )
            // Rubyv3.g:524:5: powerExpression ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2108);
            powerExpression155=powerExpression();
            _fsp--;

            adaptor.addChild(root_0, powerExpression155.getTree());
            // Rubyv3.g:525:25: ( ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression )*
            loop77:
            do {
                int alt77=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt77=1;
                    }
                    break;
                case DIV:
                    {
                    alt77=1;
                    }
                    break;
                case MOD:
                    {
                    alt77=1;
                    }
                    break;

                }

                switch (alt77) {
            	case 1 :
            	    // Rubyv3.g:526:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* ) powerExpression
            	    {
            	    // Rubyv3.g:526:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )
            	    int alt76=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt76=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt76=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt76=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("526:5: ( STAR ( LINE_BREAK )* | DIV ( LINE_BREAK )* | MOD ( LINE_BREAK )* )", 76, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt76) {
            	        case 1 :
            	            // Rubyv3.g:526:7: STAR ( LINE_BREAK )*
            	            {
            	            STAR156=(Token)input.LT(1);
            	            match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2142); 
            	            STAR156_tree = (Object)adaptor.create(STAR156);
            	            root_0 = (Object)adaptor.becomeRoot(STAR156_tree, root_0);

            	            // Rubyv3.g:526:15: ( LINE_BREAK )*
            	            loop73:
            	            do {
            	                int alt73=2;
            	                int LA73_0 = input.LA(1);

            	                if ( (LA73_0==LINE_BREAK) ) {
            	                    alt73=1;
            	                }


            	                switch (alt73) {
            	            	case 1 :
            	            	    // Rubyv3.g:526:16: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK157=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2148); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop73;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // Rubyv3.g:527:7: DIV ( LINE_BREAK )*
            	            {
            	            DIV158=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression2159); 
            	            DIV158_tree = (Object)adaptor.create(DIV158);
            	            root_0 = (Object)adaptor.becomeRoot(DIV158_tree, root_0);

            	            // Rubyv3.g:527:14: ( LINE_BREAK )*
            	            loop74:
            	            do {
            	                int alt74=2;
            	                int LA74_0 = input.LA(1);

            	                if ( (LA74_0==LINE_BREAK) ) {
            	                    alt74=1;
            	                }


            	                switch (alt74) {
            	            	case 1 :
            	            	    // Rubyv3.g:527:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK159=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2165); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop74;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 3 :
            	            // Rubyv3.g:528:7: MOD ( LINE_BREAK )*
            	            {
            	            MOD160=(Token)input.LT(1);
            	            match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2176); 
            	            MOD160_tree = (Object)adaptor.create(MOD160);
            	            root_0 = (Object)adaptor.becomeRoot(MOD160_tree, root_0);

            	            // Rubyv3.g:528:14: ( LINE_BREAK )*
            	            loop75:
            	            do {
            	                int alt75=2;
            	                int LA75_0 = input.LA(1);

            	                if ( (LA75_0==LINE_BREAK) ) {
            	                    alt75=1;
            	                }


            	                switch (alt75) {
            	            	case 1 :
            	            	    // Rubyv3.g:528:15: LINE_BREAK
            	            	    {
            	            	    LINE_BREAK161=(Token)input.LT(1);
            	            	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_multiplicativeExpression2182); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop75;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression2197);
            	    powerExpression162=powerExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, powerExpression162.getTree());

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
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start powerExpression
    // Rubyv3.g:536:1: powerExpression : bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* ;
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
            // Rubyv3.g:537:5: ( bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )* )
            // Rubyv3.g:537:5: bnotExpression ( POWER ( LINE_BREAK )* bnotExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bnotExpression_in_powerExpression2218);
            bnotExpression163=bnotExpression();
            _fsp--;

            adaptor.addChild(root_0, bnotExpression163.getTree());
            // Rubyv3.g:538:25: ( POWER ( LINE_BREAK )* bnotExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==POWER) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Rubyv3.g:539:5: POWER ( LINE_BREAK )* bnotExpression
            	    {
            	    POWER164=(Token)input.LT(1);
            	    match(input,POWER,FOLLOW_POWER_in_powerExpression2253); 
            	    POWER164_tree = (Object)adaptor.create(POWER164);
            	    root_0 = (Object)adaptor.becomeRoot(POWER164_tree, root_0);

            	    // Rubyv3.g:539:14: ( LINE_BREAK )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==LINE_BREAK) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // Rubyv3.g:539:15: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK165=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_powerExpression2259); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop78;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_bnotExpression_in_powerExpression2268);
            	    bnotExpression166=bnotExpression();
            	    _fsp--;

            	    adaptor.addChild(root_0, bnotExpression166.getTree());

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
    // $ANTLR end powerExpression

    public static class bnotExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start bnotExpression
    // Rubyv3.g:545:1: bnotExpression : ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command ;
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
            // Rubyv3.g:546:5: ( ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command )
            // Rubyv3.g:546:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )* command
            {
            root_0 = (Object)adaptor.nil();

            // Rubyv3.g:546:5: ( BNOT ( LINE_BREAK )* | NOT ( LINE_BREAK )* )*
            loop82:
            do {
                int alt82=3;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==BNOT) ) {
                    alt82=1;
                }
                else if ( (LA82_0==NOT) ) {
                    alt82=2;
                }


                switch (alt82) {
            	case 1 :
            	    // Rubyv3.g:546:7: BNOT ( LINE_BREAK )*
            	    {
            	    BNOT167=(Token)input.LT(1);
            	    match(input,BNOT,FOLLOW_BNOT_in_bnotExpression2290); 
            	    BNOT167_tree = (Object)adaptor.create(BNOT167);
            	    root_0 = (Object)adaptor.becomeRoot(BNOT167_tree, root_0);

            	    // Rubyv3.g:546:15: ( LINE_BREAK )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==LINE_BREAK) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // Rubyv3.g:546:16: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK168=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2296); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // Rubyv3.g:547:6: NOT ( LINE_BREAK )*
            	    {
            	    NOT169=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_bnotExpression2306); 
            	    NOT169_tree = (Object)adaptor.create(NOT169);
            	    root_0 = (Object)adaptor.becomeRoot(NOT169_tree, root_0);

            	    // Rubyv3.g:547:13: ( LINE_BREAK )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==LINE_BREAK) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // Rubyv3.g:547:14: LINE_BREAK
            	    	    {
            	    	    LINE_BREAK170=(Token)input.LT(1);
            	    	    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_bnotExpression2312); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_bnotExpression2326);
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
    // Rubyv3.g:551:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom ) ;
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

        atom_return atom180 = null;


        Object string_literal172_tree=null;
        Object string_literal173_tree=null;
        Object string_literal174_tree=null;

        try {
            // Rubyv3.g:553:3: ( ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom ) )
            // Rubyv3.g:553:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom )
            {
            root_0 = (Object)adaptor.nil();

            // Rubyv3.g:553:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom )
            int alt83=9;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt83=1;
                }
                break;
            case 133:
                {
                alt83=2;
                }
                break;
            case 134:
                {
                alt83=3;
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
                alt83=4;
                }
                break;
            case 119:
            case 120:
            case 121:
                {
                alt83=5;
                }
                break;
            case 117:
                {
                alt83=6;
                }
                break;
            case IF_MODIFIER:
                {
                alt83=7;
                }
                break;
            case UNLESS_MODIFIER:
                {
                alt83=8;
                }
                break;
            case ID:
                {
                alt83=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("553:3: ( 'expression0' | 'expression1' | 'expression2' | literal | boolean_expression | block_expression | if_expression | unless_expression | atom )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // Rubyv3.g:553:4: 'expression0'
                    {
                    string_literal172=(Token)input.LT(1);
                    match(input,132,FOLLOW_132_in_command2341); 
                    string_literal172_tree = (Object)adaptor.create(string_literal172);
                    adaptor.addChild(root_0, string_literal172_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:553:20: 'expression1'
                    {
                    string_literal173=(Token)input.LT(1);
                    match(input,133,FOLLOW_133_in_command2345); 
                    string_literal173_tree = (Object)adaptor.create(string_literal173);
                    adaptor.addChild(root_0, string_literal173_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:553:36: 'expression2'
                    {
                    string_literal174=(Token)input.LT(1);
                    match(input,134,FOLLOW_134_in_command2349); 
                    string_literal174_tree = (Object)adaptor.create(string_literal174);
                    adaptor.addChild(root_0, string_literal174_tree);


                    }
                    break;
                case 4 :
                    // Rubyv3.g:553:50: literal
                    {
                    pushFollow(FOLLOW_literal_in_command2351);
                    literal175=literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal175.getTree());

                    }
                    break;
                case 5 :
                    // Rubyv3.g:553:58: boolean_expression
                    {
                    pushFollow(FOLLOW_boolean_expression_in_command2353);
                    boolean_expression176=boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression176.getTree());

                    }
                    break;
                case 6 :
                    // Rubyv3.g:553:78: block_expression
                    {
                    pushFollow(FOLLOW_block_expression_in_command2356);
                    block_expression177=block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression177.getTree());

                    }
                    break;
                case 7 :
                    // Rubyv3.g:553:95: if_expression
                    {
                    pushFollow(FOLLOW_if_expression_in_command2358);
                    if_expression178=if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression178.getTree());

                    }
                    break;
                case 8 :
                    // Rubyv3.g:553:109: unless_expression
                    {
                    pushFollow(FOLLOW_unless_expression_in_command2360);
                    unless_expression179=unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression179.getTree());

                    }
                    break;
                case 9 :
                    // Rubyv3.g:553:127: atom
                    {
                    pushFollow(FOLLOW_atom_in_command2362);
                    atom180=atom();
                    _fsp--;

                    adaptor.addChild(root_0, atom180.getTree());

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
    // Rubyv3.g:555:1: atom : methodExpression ;
    public final atom_return atom() throws RecognitionException {
        atom_return retval = new atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        methodExpression_return methodExpression181 = null;



        try {
            // Rubyv3.g:555:8: ( methodExpression )
            // Rubyv3.g:555:8: methodExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_methodExpression_in_atom2373);
            methodExpression181=methodExpression();
            _fsp--;

            adaptor.addChild(root_0, methodExpression181.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:556:1: methodExpression : ( variable | method );
    public final methodExpression_return methodExpression() throws RecognitionException {
        methodExpression_return retval = new methodExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        variable_return variable182 = null;

        method_return method183 = null;



        try {
            // Rubyv3.g:557:9: ( variable | method )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==ID) ) {
                int LA84_1 = input.LA(2);

                if ( (isDefinedVar(input.LT(1).getText())) ) {
                    alt84=1;
                }
                else if ( (true) ) {
                    alt84=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("556:1: methodExpression : ( variable | method );", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("556:1: methodExpression : ( variable | method );", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // Rubyv3.g:557:9: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_methodExpression2386);
                    variable182=variable();
                    _fsp--;

                    adaptor.addChild(root_0, variable182.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:557:18: method
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_method_in_methodExpression2388);
                    method183=method();
                    _fsp--;

                    adaptor.addChild(root_0, method183.getTree());

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
    // Rubyv3.g:558:1: variable : {...}? ID -> ^( VARIABLE ID ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID184=null;

        Object ID184_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // Rubyv3.g:558:11: ({...}? ID -> ^( VARIABLE ID ) )
            // Rubyv3.g:558:11: {...}? ID
            {
            if ( !(isDefinedVar(input.LT(1).getText())) ) {
                throw new FailedPredicateException(input, "variable", "isDefinedVar(input.LT(1).getText())");
            }
            ID184=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variable2396); 
            stream_ID.add(ID184);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 558:53: -> ^( VARIABLE ID )
            {
                // Rubyv3.g:558:56: ^( VARIABLE ID )
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
    // Rubyv3.g:559:1: method : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );
    public final method_return method() throws RecognitionException {
        method_return retval = new method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID185=null;
        Token ID186=null;
        open_args_return open_args187 = null;


        Object ID185_tree=null;
        Object ID186_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_open_args=new RewriteRuleSubtreeStream(adaptor,"rule open_args");
        try {
            // Rubyv3.g:559:10: ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // Rubyv3.g:559:10: {...}? ID
                    {
                    if ( !(!isDefinedVar(input.LT(1).getText())) ) {
                        throw new FailedPredicateException(input, "method", "!isDefinedVar(input.LT(1).getText())");
                    }
                    ID185=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2413); 
                    stream_ID.add(ID185);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 559:53: -> ^( CALL ID )
                    {
                        // Rubyv3.g:559:56: ^( CALL ID )
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
                    // Rubyv3.g:560:17: ID open_args
                    {
                    ID186=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_method2439); 
                    stream_ID.add(ID186);

                    pushFollow(FOLLOW_open_args_in_method2441);
                    open_args187=open_args();
                    _fsp--;

                    stream_open_args.add(open_args187.getTree());

                    // AST REWRITE
                    // elements: open_args, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 560:30: -> ^( CALL ID open_args )
                    {
                        // Rubyv3.g:560:33: ^( CALL ID open_args )
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
    // Rubyv3.g:562:1: command_call : command1 ;
    public final command_call_return command_call() throws RecognitionException {
        command_call_return retval = new command_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        command1_return command1188 = null;



        try {
            // Rubyv3.g:563:4: ( command1 )
            // Rubyv3.g:563:4: command1
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_command1_in_command_call2461);
            command1188=command1();
            _fsp--;

            adaptor.addChild(root_0, command1188.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:567:1: command1 : operation1 ( command_args ) ;
    public final command1_return command1() throws RecognitionException {
        command1_return retval = new command1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        operation1_return operation1189 = null;

        command_args_return command_args190 = null;



        try {
            // Rubyv3.g:567:11: ( operation1 ( command_args ) )
            // Rubyv3.g:567:11: operation1 ( command_args )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operation1_in_command12473);
            operation1189=operation1();
            _fsp--;

            adaptor.addChild(root_0, operation1189.getTree());
            // Rubyv3.g:567:22: ( command_args )
            // Rubyv3.g:567:23: command_args
            {
            pushFollow(FOLLOW_command_args_in_command12476);
            command_args190=command_args();
            _fsp--;

            adaptor.addChild(root_0, command_args190.getTree());

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
    // Rubyv3.g:569:1: command_args : open_args ;
    public final command_args_return command_args() throws RecognitionException {
        command_args_return retval = new command_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        open_args_return open_args191 = null;



        try {
            // Rubyv3.g:570:4: ( open_args )
            // Rubyv3.g:570:4: open_args
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_open_args_in_command_args2488);
            open_args191=open_args();
            _fsp--;

            adaptor.addChild(root_0, open_args191.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:571:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );
    public final open_args_return open_args() throws RecognitionException {
        open_args_return retval = new open_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal193=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        call_args_return call_args192 = null;

        call_args_return call_args196 = null;


        Object char_literal193_tree=null;
        Object char_literal194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;

        try {
            // Rubyv3.g:572:4: ( call_args | '(' ')' | '(' call_args ')' )
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=HEREDOC_STRING && LA86_0<=FLOAT)||LA86_0==SYMBOL||(LA86_0>=IF_MODIFIER && LA86_0<=UNLESS_MODIFIER)||LA86_0==ID||(LA86_0>=BNOT && LA86_0<=REGEX)||(LA86_0>=SINGLE_QUOTE_STRING && LA86_0<=DOUBLE_QUOTE_STRING)||LA86_0==LCURLY||LA86_0==117||(LA86_0>=119 && LA86_0<=121)||(LA86_0>=131 && LA86_0<=134)) ) {
                alt86=1;
            }
            else if ( (LA86_0==LPAREN) ) {
                int LA86_2 = input.LA(2);

                if ( (LA86_2==RPAREN) ) {
                    alt86=2;
                }
                else if ( ((LA86_2>=HEREDOC_STRING && LA86_2<=FLOAT)||LA86_2==SYMBOL||(LA86_2>=IF_MODIFIER && LA86_2<=UNLESS_MODIFIER)||LA86_2==ID||(LA86_2>=BNOT && LA86_2<=REGEX)||(LA86_2>=SINGLE_QUOTE_STRING && LA86_2<=DOUBLE_QUOTE_STRING)||LA86_2==LCURLY||LA86_2==117||(LA86_2>=119 && LA86_2<=121)||(LA86_2>=131 && LA86_2<=134)) ) {
                    alt86=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("571:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 86, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("571:1: open_args : ( call_args | '(' ')' | '(' call_args ')' );", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // Rubyv3.g:572:4: call_args
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_args_in_open_args2496);
                    call_args192=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args192.getTree());

                    }
                    break;
                case 2 :
                    // Rubyv3.g:573:9: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal193=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2506); 
                    char_literal194=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2509); 

                    }
                    break;
                case 3 :
                    // Rubyv3.g:574:10: '(' call_args ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal195=(Token)input.LT(1);
                    match(input,LPAREN,FOLLOW_LPAREN_in_open_args2521); 
                    pushFollow(FOLLOW_call_args_in_open_args2524);
                    call_args196=call_args();
                    _fsp--;

                    adaptor.addChild(root_0, call_args196.getTree());
                    char_literal197=(Token)input.LT(1);
                    match(input,RPAREN,FOLLOW_RPAREN_in_open_args2528); 

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
    // Rubyv3.g:575:1: call_args : args -> ^( ARG args ) ;
    public final call_args_return call_args() throws RecognitionException {
        call_args_return retval = new call_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        args_return args198 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // Rubyv3.g:576:4: ( args -> ^( ARG args ) )
            // Rubyv3.g:576:4: args
            {
            pushFollow(FOLLOW_args_in_call_args2537);
            args198=args();
            _fsp--;

            stream_args.add(args198.getTree());

            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 576:9: -> ^( ARG args )
            {
                // Rubyv3.g:576:12: ^( ARG args )
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
    // Rubyv3.g:578:1: args : arg ( ',' arg )* ;
    public final args_return args() throws RecognitionException {
        args_return retval = new args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal200=null;
        arg_return arg199 = null;

        arg_return arg201 = null;


        Object char_literal200_tree=null;

        try {
            // Rubyv3.g:578:8: ( arg ( ',' arg )* )
            // Rubyv3.g:578:8: arg ( ',' arg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args2554);
            arg199=arg();
            _fsp--;

            adaptor.addChild(root_0, arg199.getTree());
            // Rubyv3.g:578:12: ( ',' arg )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // Rubyv3.g:578:13: ',' arg
            	    {
            	    char_literal200=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_args2557); 
            	    pushFollow(FOLLOW_arg_in_args2560);
            	    arg201=arg();
            	    _fsp--;

            	    adaptor.addChild(root_0, arg201.getTree());

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
    // $ANTLR end args

    public static class arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arg
    // Rubyv3.g:580:1: arg : definedExpression ;
    public final arg_return arg() throws RecognitionException {
        arg_return retval = new arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        definedExpression_return definedExpression202 = null;



        try {
            // Rubyv3.g:580:7: ( definedExpression )
            // Rubyv3.g:580:7: definedExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_definedExpression_in_arg2571);
            definedExpression202=definedExpression();
            _fsp--;

            adaptor.addChild(root_0, definedExpression202.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:584:1: operation1 : ( ID | CONSTANT | FID );
    public final operation1_return operation1() throws RecognitionException {
        operation1_return retval = new operation1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set203=null;

        Object set203_tree=null;

        try {
            // Rubyv3.g:584:18: ( ID | CONSTANT | FID )
            // Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set203=(Token)input.LT(1);
            if ( (input.LA(1)>=CONSTANT && input.LA(1)<=FID)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set203));
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
    // Rubyv3.g:587:1: operation2 : ( ID | CONSTANT | FID | op );
    public final operation2_return operation2() throws RecognitionException {
        operation2_return retval = new operation2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID204=null;
        Token CONSTANT205=null;
        Token FID206=null;
        op_return op207 = null;


        Object ID204_tree=null;
        Object CONSTANT205_tree=null;
        Object FID206_tree=null;

        try {
            // Rubyv3.g:587:17: ( ID | CONSTANT | FID | op )
            int alt88=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt88=1;
                }
                break;
            case CONSTANT:
                {
                alt88=2;
                }
                break;
            case FID:
                {
                alt88=3;
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
            case 127:
                {
                alt88=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("587:1: operation2 : ( ID | CONSTANT | FID | op );", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // Rubyv3.g:587:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID204=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation22609); 
                    ID204_tree = (Object)adaptor.create(ID204);
                    adaptor.addChild(root_0, ID204_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:587:22: CONSTANT
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT205=(Token)input.LT(1);
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_operation22613); 
                    CONSTANT205_tree = (Object)adaptor.create(CONSTANT205);
                    adaptor.addChild(root_0, CONSTANT205_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:587:33: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID206=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation22617); 
                    FID206_tree = (Object)adaptor.create(FID206);
                    adaptor.addChild(root_0, FID206_tree);


                    }
                    break;
                case 4 :
                    // Rubyv3.g:587:39: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation22621);
                    op207=op();
                    _fsp--;

                    adaptor.addChild(root_0, op207.getTree());

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
    // Rubyv3.g:590:1: operation3 : ( ID | FID | op );
    public final operation3_return operation3() throws RecognitionException {
        operation3_return retval = new operation3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID208=null;
        Token FID209=null;
        op_return op210 = null;


        Object ID208_tree=null;
        Object FID209_tree=null;

        try {
            // Rubyv3.g:590:17: ( ID | FID | op )
            int alt89=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt89=1;
                }
                break;
            case FID:
                {
                alt89=2;
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
            case 127:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("590:1: operation3 : ( ID | FID | op );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // Rubyv3.g:590:17: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID208=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_operation32637); 
                    ID208_tree = (Object)adaptor.create(ID208);
                    adaptor.addChild(root_0, ID208_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:590:22: FID
                    {
                    root_0 = (Object)adaptor.nil();

                    FID209=(Token)input.LT(1);
                    match(input,FID,FOLLOW_FID_in_operation32641); 
                    FID209_tree = (Object)adaptor.create(FID209);
                    adaptor.addChild(root_0, FID209_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:590:28: op
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_in_operation32645);
                    op210=op();
                    _fsp--;

                    adaptor.addChild(root_0, op210.getTree());

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
    // Rubyv3.g:593:1: lhs : ID -> ^( VARIABLE ID ) ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID211=null;

        Object ID211_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // Rubyv3.g:593:7: ( ID -> ^( VARIABLE ID ) )
            // Rubyv3.g:593:7: ID
            {
            ID211=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lhs2659); 
            stream_ID.add(ID211);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 593:10: -> ^( VARIABLE ID )
            {
                // Rubyv3.g:593:13: ^( VARIABLE ID )
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
    // Rubyv3.g:594:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression212 = null;



        try {
            // Rubyv3.g:594:7: ( expression )
            // Rubyv3.g:594:7: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_rhs2675);
            expression212=expression();
            _fsp--;

            adaptor.addChild(root_0, expression212.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:598:1: literal : ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT213=null;
        Token FLOAT214=null;
        Token ARRAY216=null;
        Token SYMBOL218=null;
        Token REGEX219=null;
        string_return string215 = null;

        hash_return hash217 = null;


        Object INT213_tree=null;
        Object FLOAT214_tree=null;
        Object ARRAY216_tree=null;
        Object SYMBOL218_tree=null;
        Object REGEX219_tree=null;

        try {
            // Rubyv3.g:598:11: ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX )
            int alt90=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt90=1;
                }
                break;
            case FLOAT:
                {
                alt90=2;
                }
                break;
            case HEREDOC_STRING:
            case SINGLE_QUOTE_STRING:
            case DOUBLE_QUOTE_STRING:
                {
                alt90=3;
                }
                break;
            case ARRAY:
                {
                alt90=4;
                }
                break;
            case LCURLY:
                {
                alt90=5;
                }
                break;
            case SYMBOL:
                {
                alt90=6;
                }
                break;
            case REGEX:
                {
                alt90=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("598:1: literal : ( INT | FLOAT | string | ARRAY | hash | SYMBOL | REGEX );", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // Rubyv3.g:598:11: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT213=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_literal2685); 
                    INT213_tree = (Object)adaptor.create(INT213);
                    adaptor.addChild(root_0, INT213_tree);


                    }
                    break;
                case 2 :
                    // Rubyv3.g:598:15: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT214=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_literal2687); 
                    FLOAT214_tree = (Object)adaptor.create(FLOAT214);
                    adaptor.addChild(root_0, FLOAT214_tree);


                    }
                    break;
                case 3 :
                    // Rubyv3.g:598:21: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2689);
                    string215=string();
                    _fsp--;

                    adaptor.addChild(root_0, string215.getTree());

                    }
                    break;
                case 4 :
                    // Rubyv3.g:598:28: ARRAY
                    {
                    root_0 = (Object)adaptor.nil();

                    ARRAY216=(Token)input.LT(1);
                    match(input,ARRAY,FOLLOW_ARRAY_in_literal2691); 
                    ARRAY216_tree = (Object)adaptor.create(ARRAY216);
                    adaptor.addChild(root_0, ARRAY216_tree);


                    }
                    break;
                case 5 :
                    // Rubyv3.g:598:34: hash
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hash_in_literal2693);
                    hash217=hash();
                    _fsp--;

                    adaptor.addChild(root_0, hash217.getTree());

                    }
                    break;
                case 6 :
                    // Rubyv3.g:598:39: SYMBOL
                    {
                    root_0 = (Object)adaptor.nil();

                    SYMBOL218=(Token)input.LT(1);
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_literal2695); 
                    SYMBOL218_tree = (Object)adaptor.create(SYMBOL218);
                    adaptor.addChild(root_0, SYMBOL218_tree);


                    }
                    break;
                case 7 :
                    // Rubyv3.g:598:46: REGEX
                    {
                    root_0 = (Object)adaptor.nil();

                    REGEX219=(Token)input.LT(1);
                    match(input,REGEX,FOLLOW_REGEX_in_literal2697); 
                    REGEX219_tree = (Object)adaptor.create(REGEX219);
                    adaptor.addChild(root_0, REGEX219_tree);


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
    // Rubyv3.g:666:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set220=null;

        Object set220_tree=null;

        try {
            // Rubyv3.g:666:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // Rubyv3.g:
            {
            root_0 = (Object)adaptor.nil();

            set220=(Token)input.LT(1);
            if ( input.LA(1)==HEREDOC_STRING||(input.LA(1)>=SINGLE_QUOTE_STRING && input.LA(1)<=DOUBLE_QUOTE_STRING) ) {
                input.consume();
                adaptor.addChild(root_0, adaptor.create(set220));
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
    // Rubyv3.g:737:1: hash : '{' assoc_list '}' ;
    public final hash_return hash() throws RecognitionException {
        hash_return retval = new hash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal221=null;
        Token char_literal223=null;
        assoc_list_return assoc_list222 = null;


        Object char_literal221_tree=null;
        Object char_literal223_tree=null;

        try {
            // Rubyv3.g:737:8: ( '{' assoc_list '}' )
            // Rubyv3.g:737:8: '{' assoc_list '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal221=(Token)input.LT(1);
            match(input,LCURLY,FOLLOW_LCURLY_in_hash3655); 
            char_literal221_tree = (Object)adaptor.create(char_literal221);
            root_0 = (Object)adaptor.becomeRoot(char_literal221_tree, root_0);

            pushFollow(FOLLOW_assoc_list_in_hash3658);
            assoc_list222=assoc_list();
            _fsp--;

            adaptor.addChild(root_0, assoc_list222.getTree());
            char_literal223=(Token)input.LT(1);
            match(input,RCURLY,FOLLOW_RCURLY_in_hash3660); 

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:738:1: assoc_list : assocs trailer ;
    public final assoc_list_return assoc_list() throws RecognitionException {
        assoc_list_return retval = new assoc_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        assocs_return assocs224 = null;

        trailer_return trailer225 = null;



        try {
            // Rubyv3.g:739:4: ( assocs trailer )
            // Rubyv3.g:739:4: assocs trailer
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assocs_in_assoc_list3669);
            assocs224=assocs();
            _fsp--;

            adaptor.addChild(root_0, assocs224.getTree());
            pushFollow(FOLLOW_trailer_in_assoc_list3671);
            trailer225=trailer();
            _fsp--;

            adaptor.addChild(root_0, trailer225.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:740:1: assocs : assoc ( ',' assoc )* ;
    public final assocs_return assocs() throws RecognitionException {
        assocs_return retval = new assocs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal227=null;
        assoc_return assoc226 = null;

        assoc_return assoc228 = null;


        Object char_literal227_tree=null;

        try {
            // Rubyv3.g:740:10: ( assoc ( ',' assoc )* )
            // Rubyv3.g:740:10: assoc ( ',' assoc )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assoc_in_assocs3680);
            assoc226=assoc();
            _fsp--;

            adaptor.addChild(root_0, assoc226.getTree());
            // Rubyv3.g:740:16: ( ',' assoc )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    int LA91_2 = input.LA(2);

                    if ( ((LA91_2>=HEREDOC_STRING && LA91_2<=FLOAT)||LA91_2==SYMBOL||(LA91_2>=IF_MODIFIER && LA91_2<=UNLESS_MODIFIER)||LA91_2==ID||(LA91_2>=BNOT && LA91_2<=REGEX)||(LA91_2>=SINGLE_QUOTE_STRING && LA91_2<=DOUBLE_QUOTE_STRING)||LA91_2==LCURLY||LA91_2==117||(LA91_2>=119 && LA91_2<=121)||(LA91_2>=131 && LA91_2<=134)) ) {
                        alt91=1;
                    }


                }


                switch (alt91) {
            	case 1 :
            	    // Rubyv3.g:740:18: ',' assoc
            	    {
            	    char_literal227=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_assocs3684); 
            	    pushFollow(FOLLOW_assoc_in_assocs3687);
            	    assoc228=assoc();
            	    _fsp--;

            	    adaptor.addChild(root_0, assoc228.getTree());

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
    // Rubyv3.g:742:1: assoc : arg ( ASSOC | ',' ) arg ;
    public final assoc_return assoc() throws RecognitionException {
        assoc_return retval = new assoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set230=null;
        arg_return arg229 = null;

        arg_return arg231 = null;


        Object set230_tree=null;

        try {
            // Rubyv3.g:742:17: ( arg ( ASSOC | ',' ) arg )
            // Rubyv3.g:742:17: arg ( ASSOC | ',' ) arg
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arg_in_assoc3705);
            arg229=arg();
            _fsp--;

            adaptor.addChild(root_0, arg229.getTree());
            set230=(Token)input.LT(1);
            if ( input.LA(1)==ASSOC||input.LA(1)==COMMA ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assoc3707);    throw mse;
            }

            pushFollow(FOLLOW_arg_in_assoc3714);
            arg231=arg();
            _fsp--;

            adaptor.addChild(root_0, arg231.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // Rubyv3.g:746:1: trailer : ( | LINE_BREAK | ',' );
    public final trailer_return trailer() throws RecognitionException {
        trailer_return retval = new trailer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK232=null;
        Token char_literal233=null;

        Object LINE_BREAK232_tree=null;
        Object char_literal233_tree=null;

        try {
            // Rubyv3.g:746:29: ( | LINE_BREAK | ',' )
            int alt92=3;
            switch ( input.LA(1) ) {
            case RCURLY:
                {
                alt92=1;
                }
                break;
            case LINE_BREAK:
                {
                alt92=2;
                }
                break;
            case COMMA:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("746:1: trailer : ( | LINE_BREAK | ',' );", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // Rubyv3.g:746:29: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // Rubyv3.g:746:31: LINE_BREAK
                    {
                    root_0 = (Object)adaptor.nil();

                    LINE_BREAK232=(Token)input.LT(1);
                    match(input,LINE_BREAK,FOLLOW_LINE_BREAK_in_trailer3735); 

                    }
                    break;
                case 3 :
                    // Rubyv3.g:746:45: ','
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal233=(Token)input.LT(1);
                    match(input,COMMA,FOLLOW_COMMA_in_trailer3740); 

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
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\3\3\2\uffff";
    static final String DFA5_minS =
        "\1\43\2\14\2\uffff";
    static final String DFA5_maxS =
        "\1\173\2\u0086\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\121\uffff\1\3\3\uffff\2\3",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\17\uffff\1\4\1\3\3\4\2\3"+
            "\1\uffff\2\4\3\uffff\5\4",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\17\uffff\1\4\1\3\3\4\2\3"+
            "\1\uffff\2\4\3\uffff\5\4",
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
        "\1\174\1\u0086\3\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
        "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\114\uffff\1\2\12\uffff\1\3",
            "\2\4\4\uffff\1\4\13\uffff\2\4\3\uffff\1\4\1\1\1\uffff\1\4\45"+
            "\uffff\5\4\20\uffff\2\4\2\uffff\1\4\17\uffff\7\4\1\3\2\4\3\uffff"+
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
    static final String DFA85_eotS =
        "\111\uffff";
    static final String DFA85_eofS =
        "\1\uffff\1\2\107\uffff";
    static final String DFA85_minS =
        "\1\46\1\13\1\uffff\1\14\1\uffff\1\14\1\13\3\14\77\0";
    static final String DFA85_maxS =
        "\1\46\1\u0086\1\uffff\1\u0086\1\uffff\1\u0086\1\177\3\u0086\77\0";
    static final String DFA85_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\104\uffff";
    static final String DFA85_specialS =
        "\111\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\1",
            "\1\2\2\4\4\uffff\1\4\11\uffff\2\2\1\3\1\5\5\2\1\uffff\1\4\15"+
            "\2\16\uffff\12\2\5\4\20\uffff\2\4\2\uffff\1\4\1\2\2\uffff\1"+
            "\2\1\uffff\1\4\1\2\3\uffff\2\2\3\uffff\1\4\1\2\3\4\3\2\3\uffff"+
            "\2\2\1\uffff\4\4",
            "",
            "\1\20\1\17\4\uffff\1\23\13\uffff\1\27\1\30\4\uffff\1\2\1\uffff"+
            "\1\31\45\uffff\1\11\1\12\1\16\1\21\1\24\20\uffff\2\20\2\uffff"+
            "\1\22\17\uffff\1\26\1\uffff\3\25\3\uffff\1\6\1\32\3\uffff\1"+
            "\7\1\10\1\13\1\14\1\15",
            "",
            "\2\2\4\uffff\1\2\13\uffff\2\2\4\uffff\1\2\1\uffff\1\2\45\uffff"+
            "\5\2\20\uffff\2\2\2\uffff\1\2\17\uffff\1\2\1\uffff\3\33\3\uffff"+
            "\2\2\3\uffff\5\2",
            "\1\37\2\uffff\1\35\1\36\14\uffff\2\37\10\uffff\1\34\15\37\25"+
            "\uffff\4\37\42\uffff\1\37\17\uffff\1\37",
            "\1\52\1\51\4\uffff\1\55\13\uffff\1\61\1\62\4\uffff\1\40\1\uffff"+
            "\1\63\45\uffff\1\43\1\44\1\50\1\53\1\56\20\uffff\2\52\2\uffff"+
            "\1\54\17\uffff\1\60\1\uffff\3\57\10\uffff\1\41\1\42\1\45\1\46"+
            "\1\47",
            "\1\73\1\72\4\uffff\1\76\13\uffff\1\102\1\103\6\uffff\1\104\45"+
            "\uffff\1\64\1\65\1\71\1\74\1\77\20\uffff\2\73\2\uffff\1\75\17"+
            "\uffff\1\101\1\uffff\3\100\12\uffff\1\66\1\67\1\70",
            "\1\20\1\17\4\uffff\1\23\13\uffff\1\27\1\30\4\uffff\1\105\1\uffff"+
            "\1\106\45\uffff\1\107\1\110\1\16\1\21\1\24\20\uffff\2\20\2\uffff"+
            "\1\22\17\uffff\1\26\1\uffff\3\25\12\uffff\1\13\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "559:1: method : ({...}? ID -> ^( CALL ID ) | ID open_args -> ^( CALL ID open_args ) );";
        }
    }
 

    public static final BitSet FOLLOW_terminal_in_program223 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_statement_list_in_program227 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_program229 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_statement_in_statement_list243 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list246 = new BitSet(new long[]{0x00000058C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_statement_in_statement_list249 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_expression_in_statement275 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement278 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_set_in_modifier_line318 = new BitSet(new long[]{0x00000050C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_line_break_in_modifier_line332 = new BitSet(new long[]{0x00000050C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_expression_in_modifier_line336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_block_expression411 = new BitSet(new long[]{0x00000048C0043000L,0x63E000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_body_in_block_expression413 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_block_expression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body422 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_statement_list_in_body426 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_terminal_in_body428 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression451 = new BitSet(new long[]{0x00000040C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_expression_in_if_expression456 = new BitSet(new long[]{0x0000001000000000L,0x1002000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression458 = new BitSet(new long[]{0x00000048C0043000L,0x6FE000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_body_in_if_expression471 = new BitSet(new long[]{0x0000000000000000L,0x0C40000000000000L});
    public static final BitSet FOLLOW_122_in_if_expression474 = new BitSet(new long[]{0x00000040C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_expression_in_if_expression478 = new BitSet(new long[]{0x0000001000000000L,0x1002000000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression480 = new BitSet(new long[]{0x00000048C0043000L,0x6FE000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_body_in_if_expression484 = new BitSet(new long[]{0x0000000000000000L,0x0C40000000000000L});
    public static final BitSet FOLLOW_123_in_if_expression498 = new BitSet(new long[]{0x00000048C0043000L,0x63E000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_body_in_if_expression502 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_if_expression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator567 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_COLON_in_seperator570 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator572 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator577 = new BitSet(new long[]{0x0000001000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_seperator580 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator582 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression592 = new BitSet(new long[]{0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression594 = new BitSet(new long[]{0x0000001000000000L,0x1002000000000000L});
    public static final BitSet FOLLOW_124_in_unless_expression597 = new BitSet(new long[]{0x00000048C0043000L,0x6BE000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_COLON_in_unless_expression599 = new BitSet(new long[]{0x00000048C0043000L,0x6BE000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_line_break_in_unless_expression601 = new BitSet(new long[]{0x00000048C0043000L,0x6BE000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_body_in_unless_expression613 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_123_in_unless_expression626 = new BitSet(new long[]{0x00000048C0043000L,0x63E000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_body_in_unless_expression628 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_unless_expression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_expression705 = new BitSet(new long[]{0x000FFFC03000C800L,0x8000800000001E00L});
    public static final BitSet FOLLOW_fitem_in_expression708 = new BitSet(new long[]{0x000FFFC03000C800L,0x8000800000001E00L});
    public static final BitSet FOLLOW_fitem_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_expression714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_methodDefinition730 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_methodDefinition734 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_methodName_in_methodDefinition739 = new BitSet(new long[]{0x0000005800000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_f_arglist_in_methodDefinition743 = new BitSet(new long[]{0x00000058C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_terminal_in_methodDefinition746 = new BitSet(new long[]{0x00000058C0043000L,0x63A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_bodyStatement_in_methodDefinition752 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_methodDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodName767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_f_arglist777 = new BitSet(new long[]{0x0000005000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_f_args_in_f_arglist780 = new BitSet(new long[]{0x0000001000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LINE_BREAK_in_f_arglist784 = new BitSet(new long[]{0x0000001000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_f_arglist789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_args_in_f_arglist802 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_terminal_in_f_arglist804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_norm_args_in_f_args816 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_COMMA_in_f_args818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_f_opt_args_in_f_args820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_f_norm_args843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_list_in_bodyStatement861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fitem879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_fname888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_fname890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_fname892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_andorExpression1063 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1068 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_129_in_andorExpression1079 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression1084 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_notExpression_in_andorExpression1099 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_130_in_notExpression1117 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression1124 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x000000000000007CL});
    public static final BitSet FOLLOW_notExpression_in_notExpression1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definedExpression_in_notExpression1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_definedExpression1149 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_definedExpression1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignmentExpression1190 = new BitSet(new long[]{0xFFF0000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_assignmentExpression1192 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_assignmentExpression1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_QUESTION_in_ternaryIfThenElseExpression1254 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1257 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryIfThenElseExpression1259 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression1298 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1302 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression1313 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression1317 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression1332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression1384 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression1389 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1450 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1455 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1484 = new BitSet(new long[]{0x0000078000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1518 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1523 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1534 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1540 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1551 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1555 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1566 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1571 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1582 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1588 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1599 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1604 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1619 = new BitSet(new long[]{0x0000078000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1640 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1674 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1680 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1691 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1696 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1707 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1712 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1723 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1727 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1742 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1796 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1802 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_BOR_in_orExpression1813 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1819 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_BAND_in_andExpression1886 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1892 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1923 = new BitSet(new long[]{0x0000800000000802L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression1957 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1962 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression1973 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1977 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1992 = new BitSet(new long[]{0x0000800000000802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2014 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression2048 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2055 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression2066 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression2073 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2088 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2108 = new BitSet(new long[]{0x0004000030000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2142 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2148 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression2159 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2165 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2176 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression2182 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression2197 = new BitSet(new long[]{0x0004000030000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2218 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression2253 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression2259 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression2268 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression2290 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2296 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression2306 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression2312 = new BitSet(new long[]{0x00000050C0043000L,0x03A000260001F000L,0x0000000000000070L});
    public static final BitSet FOLLOW_command_in_bnotExpression2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_command2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_command2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_command2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_command2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodExpression_in_atom2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_methodExpression2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methodExpression2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method2439 = new BitSet(new long[]{0x00000040C0043000L,0x03A008260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_open_args_in_method2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command1_in_command_call2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation1_in_command12473 = new BitSet(new long[]{0x00000040C0043000L,0x03A008260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_command_args_in_command12476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_open_args_in_command_args2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_args_in_open_args2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2506 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_open_args2521 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_call_args_in_open_args2524 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_RPAREN_in_open_args2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_call_args2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args2554 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_COMMA_in_args2557 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_arg_in_args2560 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_definedExpression_in_arg2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operation10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation22609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_operation22613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation22621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation32637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FID_in_operation32641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_operation32645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hash_in_literal2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_hash3655 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_assoc_list_in_hash3658 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_RCURLY_in_hash3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assocs_in_assoc_list3669 = new BitSet(new long[]{0x0000001000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_trailer_in_assoc_list3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assoc_in_assocs3680 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_COMMA_in_assocs3684 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_assoc_in_assocs3687 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_arg_in_assoc3705 = new BitSet(new long[]{0x0000000000000000L,0x0001020000000000L});
    public static final BitSet FOLLOW_set_in_assoc3707 = new BitSet(new long[]{0x00000040C0043000L,0x03A000260001F000L,0x0000000000000078L});
    public static final BitSet FOLLOW_arg_in_assoc3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_trailer3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_trailer3740 = new BitSet(new long[]{0x0000000000000002L});

}