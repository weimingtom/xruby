// $ANTLR 3.0.1 F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g 2008-02-05 21:41:44

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Rubyv3TreeParser extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "VARIABLE_OR_METHOD", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "REST_UNUSE", "DIV", "MOD", "SYMBOL", "STAR_ID", "ARRAY_REF_CALL", "BLOCK_ID", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "DOT", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING_SIMPLE", "SINGLE_QUOTE_STRING_COMPLEX", "SINGLE_STRING_CHAR", "DOUBLE_QUOTE_STRING_SIMPLE", "DOUBLE_QUOTE_STRING_COMPLEX", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "SYMBOL_NAME", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'[]='", "'and'", "'or'", "'not'", "'defined?'", "'expression0'", "'expression1'", "'do'", "'&&'", "'||'"
    };
    public static final int STAR=57;
    public static final int CASE_EQUAL=48;
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
    public static final int EOF=-1;
    public static final int UNTIL_MODIFIER=38;
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
    public static final int UNLESS_MODIFIER=36;
    public static final int HEREDOC_BEGIN=111;
    public static final int INCLUSIVE_RANGE=74;
    public static final int SYMBOL=31;
    public static final int MINUS_ASSIGN=63;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=107;
    public static final int POWER=58;
    public static final int MATCH=49;
    public static final int LCURLY=109;
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
    public static final int LEADING_MARK_DECIMAL=90;
    public static final int LOGICAL_AND_ASSIGN=70;
    public static final int DOUBLE_STRING_CHAR=108;
    public static final int LESS_OR_EQUAL=53;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int SINGLE_STRING_CHAR=105;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=56;
    public static final int BAND=82;
    public static final int SEMI=40;
    public static final int META_PART=99;
    public static final int STAR_ASSIGN=69;
    public static final int LOGICAL_OR_ASSIGN=71;
    public static final int COLON=122;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=66;
    public static final int QUESTION=73;
    public static final int CLASS_VARIABLE=95;
    public static final int ESCAPE_INT=101;
    public static final int BLOCK=19;
    public static final int RCURLY=110;
    public static final int PLUS_ASSIGN=64;
    public static final int ASSIGN=59;
    public static final int POWER_ASSIGN=72;
    public static final int COMPLEMENT_ASSIGN=61;
    public static final int BINARY=89;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int DIV=29;
    public static final int HEREDOC_INDENT_BEGIN=112;
    public static final int STRING=27;
    
        public Rubyv3TreeParser(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g"; }


    
    // $ANTLR start program
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:14:1: program returns [Program p] : sl= statement_list ;
    public final Program program() throws RecognitionException {

        Program p = null;
    
        StatementList sl = null;
        
    
        p = new Program();
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:27: (sl= statement_list )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:29: sl= statement_list
            {
            pushFollow(FOLLOW_statement_list_in_program48);
            sl=statement_list();
            _fsp--;

            p.setStatementList(sl);
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return p;
    }
    // $ANTLR end program

    
    // $ANTLR start statement_list
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:17:1: statement_list returns [StatementList statementList] : ^( STATEMENT_LIST (s= statement )* ) ;
    public final StatementList statement_list() throws RecognitionException {

        StatementList statementList = null;
    
        Statement s = null;
        
    
        statementList = new StatementList();
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:2: ( ^( STATEMENT_LIST (s= statement )* ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:4: ^( STATEMENT_LIST (s= statement )* )
            {
            match(input,STATEMENT_LIST,FOLLOW_STATEMENT_LIST_in_statement_list67); 
            
            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:21: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);
                    
                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }
                    
                
                    switch (alt1) {
                	case 1 :
                	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:22: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_statement_list72);
                	    s=statement();
                	    _fsp--;

                	    statementList.addStatement(s);
                	    
                	    }
                	    break;
                
                	default :
                	    break loop1;
                    }
                } while (true);

            
                match(input, Token.UP, null); 
            }
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statementList;
    }
    // $ANTLR end statement_list

    
    // $ANTLR start statement
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:22:1: statement returns [Statement s] : ^( STATEMENT e= expression ) ;
    public final Statement statement() throws RecognitionException {

        Statement s = null;
    
        Expression e = null;
        
    
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:23:2: ( ^( STATEMENT e= expression ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:23:4: ^( STATEMENT e= expression )
            {
            match(input,STATEMENT,FOLLOW_STATEMENT_in_statement91); 
            
            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_statement95);
            e=expression();
            _fsp--;

            
            match(input, Token.UP, null); 
            s=new ExpressionStatement(e);
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end statement

    
    // $ANTLR start expression
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:25:1: expression returns [Expression e] : (value= INT | value= FLOAT | value= ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX ) | value= ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX ) | value= HEREDOC_STRING | ^( 'alias' newName= . oldName= . ) | ^( ASSIGN left= variableExpression right= expression ) | ^( MOD_ASSIGN left= variableExpression right= expression ) | ^( DIV_ASSIGN left= variableExpression right= expression ) | ^( MINUS_ASSIGN left= variableExpression right= expression ) | ^( PLUS_ASSIGN left= variableExpression right= expression ) | ^( BOR_ASSIGN left= variableExpression right= expression ) | ^( BAND_ASSIGN left= variableExpression right= expression ) | ^( LEFT_SHIFT_ASSIGN left= variableExpression right= expression ) | ^( RIGHT_SHIFT_ASSIGN left= variableExpression right= expression ) | ^( STAR_ASSIGN left= variableExpression right= expression ) | ^( LOGICAL_AND_ASSIGN left= variableExpression right= expression ) | ^( LOGICAL_OR_ASSIGN left= variableExpression right= expression ) | ^( POWER_ASSIGN left= variableExpression right= expression ) | ^( LEFT_SHIFT lhs0= expression rhs= expression ) | e1= variableExpression | 'true' | 'false' | 'nil' | ^( QUESTION condition= expression left= expression right= expression ) | ^( POWER left= expression right= expression ) | ^(op= ( 'and' | '&&' ) left= expression right= expression ) | ^(op= ( 'or' | '||' ) left= expression right= expression ) | ^(op= 'not' left= expression ) | ^( INCLUSIVE_RANGE left= expression right= expression ) | ^( EXCLUSIVE_RANGE left= expression right= expression ) | e1= methodDefinition | e1= method | ^( DOT left= expression ^( CALL methodName= ID (arg= arguments )? ) ) | ^( '{' (e1= expression e2= expression )* ) );
    public final Expression expression() throws RecognitionException {

        Expression e = null;
    
        CommonTree value=null;
        CommonTree newName=null;
        CommonTree oldName=null;
        CommonTree op=null;
        CommonTree methodName=null;
        Expression left = null;

        Expression right = null;

        Expression lhs0 = null;

        Expression rhs = null;

        Expression e1 = null;

        Expression condition = null;

        MethodCallArguments arg = null;

        Expression e2 = null;
        
    
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:26:2: (value= INT | value= FLOAT | value= ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX ) | value= ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX ) | value= HEREDOC_STRING | ^( 'alias' newName= . oldName= . ) | ^( ASSIGN left= variableExpression right= expression ) | ^( MOD_ASSIGN left= variableExpression right= expression ) | ^( DIV_ASSIGN left= variableExpression right= expression ) | ^( MINUS_ASSIGN left= variableExpression right= expression ) | ^( PLUS_ASSIGN left= variableExpression right= expression ) | ^( BOR_ASSIGN left= variableExpression right= expression ) | ^( BAND_ASSIGN left= variableExpression right= expression ) | ^( LEFT_SHIFT_ASSIGN left= variableExpression right= expression ) | ^( RIGHT_SHIFT_ASSIGN left= variableExpression right= expression ) | ^( STAR_ASSIGN left= variableExpression right= expression ) | ^( LOGICAL_AND_ASSIGN left= variableExpression right= expression ) | ^( LOGICAL_OR_ASSIGN left= variableExpression right= expression ) | ^( POWER_ASSIGN left= variableExpression right= expression ) | ^( LEFT_SHIFT lhs0= expression rhs= expression ) | e1= variableExpression | 'true' | 'false' | 'nil' | ^( QUESTION condition= expression left= expression right= expression ) | ^( POWER left= expression right= expression ) | ^(op= ( 'and' | '&&' ) left= expression right= expression ) | ^(op= ( 'or' | '||' ) left= expression right= expression ) | ^(op= 'not' left= expression ) | ^( INCLUSIVE_RANGE left= expression right= expression ) | ^( EXCLUSIVE_RANGE left= expression right= expression ) | e1= methodDefinition | e1= method | ^( DOT left= expression ^( CALL methodName= ID (arg= arguments )? ) ) | ^( '{' (e1= expression e2= expression )* ) )
            int alt4=35;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt4=1;
                }
                break;
            case FLOAT:
                {
                alt4=2;
                }
                break;
            case SINGLE_QUOTE_STRING_SIMPLE:
            case SINGLE_QUOTE_STRING_COMPLEX:
                {
                alt4=3;
                }
                break;
            case DOUBLE_QUOTE_STRING_SIMPLE:
            case DOUBLE_QUOTE_STRING_COMPLEX:
                {
                alt4=4;
                }
                break;
            case HEREDOC_STRING:
                {
                alt4=5;
                }
                break;
            case 133:
                {
                alt4=6;
                }
                break;
            case ASSIGN:
                {
                alt4=7;
                }
                break;
            case MOD_ASSIGN:
                {
                alt4=8;
                }
                break;
            case DIV_ASSIGN:
                {
                alt4=9;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt4=10;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt4=11;
                }
                break;
            case BOR_ASSIGN:
                {
                alt4=12;
                }
                break;
            case BAND_ASSIGN:
                {
                alt4=13;
                }
                break;
            case LEFT_SHIFT_ASSIGN:
                {
                alt4=14;
                }
                break;
            case RIGHT_SHIFT_ASSIGN:
                {
                alt4=15;
                }
                break;
            case STAR_ASSIGN:
                {
                alt4=16;
                }
                break;
            case LOGICAL_AND_ASSIGN:
                {
                alt4=17;
                }
                break;
            case LOGICAL_OR_ASSIGN:
                {
                alt4=18;
                }
                break;
            case POWER_ASSIGN:
                {
                alt4=19;
                }
                break;
            case LEFT_SHIFT:
                {
                alt4=20;
                }
                break;
            case VARIABLE:
                {
                alt4=21;
                }
                break;
            case 129:
                {
                alt4=22;
                }
                break;
            case 127:
                {
                alt4=23;
                }
                break;
            case 128:
                {
                alt4=24;
                }
                break;
            case QUESTION:
                {
                alt4=25;
                }
                break;
            case POWER:
                {
                alt4=26;
                }
                break;
            case 136:
            case 143:
                {
                alt4=27;
                }
                break;
            case 137:
            case 144:
                {
                alt4=28;
                }
                break;
            case 138:
                {
                alt4=29;
                }
                break;
            case INCLUSIVE_RANGE:
                {
                alt4=30;
                }
                break;
            case EXCLUSIVE_RANGE:
                {
                alt4=31;
                }
                break;
            case 134:
                {
                alt4=32;
                }
                break;
            case CALL:
                {
                alt4=33;
                }
                break;
            case DOT:
                {
                alt4=34;
                }
                break;
            case LCURLY:
                {
                alt4=35;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("25:1: expression returns [Expression e] : (value= INT | value= FLOAT | value= ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX ) | value= ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX ) | value= HEREDOC_STRING | ^( 'alias' newName= . oldName= . ) | ^( ASSIGN left= variableExpression right= expression ) | ^( MOD_ASSIGN left= variableExpression right= expression ) | ^( DIV_ASSIGN left= variableExpression right= expression ) | ^( MINUS_ASSIGN left= variableExpression right= expression ) | ^( PLUS_ASSIGN left= variableExpression right= expression ) | ^( BOR_ASSIGN left= variableExpression right= expression ) | ^( BAND_ASSIGN left= variableExpression right= expression ) | ^( LEFT_SHIFT_ASSIGN left= variableExpression right= expression ) | ^( RIGHT_SHIFT_ASSIGN left= variableExpression right= expression ) | ^( STAR_ASSIGN left= variableExpression right= expression ) | ^( LOGICAL_AND_ASSIGN left= variableExpression right= expression ) | ^( LOGICAL_OR_ASSIGN left= variableExpression right= expression ) | ^( POWER_ASSIGN left= variableExpression right= expression ) | ^( LEFT_SHIFT lhs0= expression rhs= expression ) | e1= variableExpression | 'true' | 'false' | 'nil' | ^( QUESTION condition= expression left= expression right= expression ) | ^( POWER left= expression right= expression ) | ^(op= ( 'and' | '&&' ) left= expression right= expression ) | ^(op= ( 'or' | '||' ) left= expression right= expression ) | ^(op= 'not' left= expression ) | ^( INCLUSIVE_RANGE left= expression right= expression ) | ^( EXCLUSIVE_RANGE left= expression right= expression ) | e1= methodDefinition | e1= method | ^( DOT left= expression ^( CALL methodName= ID (arg= arguments )? ) ) | ^( '{' (e1= expression e2= expression )* ) );", 4, 0, input);
            
                throw nvae;
            }
            
            switch (alt4) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:26:4: value= INT
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_expression112); 
                    e=IntegerExpression.parseIntegerExpression(value.getText());
                    
                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:27:10: value= FLOAT
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_expression126); 
                    e=new FloatExpression(value.getText());
                    
                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:28:10: value= ( SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX )
                    {
                    value=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=SINGLE_QUOTE_STRING_SIMPLE && input.LA(1)<=SINGLE_QUOTE_STRING_COMPLEX) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expression140);    throw mse;
                    }

                    e=new SingleQuoteStringExpression(value.getText());
                    
                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:29:10: value= ( DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX )
                    {
                    value=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_SIMPLE && input.LA(1)<=DOUBLE_QUOTE_STRING_COMPLEX) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expression158);    throw mse;
                    }

                    e=((MyToken)value.getToken()).getExpression();
                    
                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:30:10: value= HEREDOC_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_expression177); 
                    e=((MyToken)value.getToken()).getExpression();
                    
                    }
                    break;
                case 6 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:32:10: ^( 'alias' newName= . oldName= . )
                    {
                    match(input,133,FOLLOW_133_in_expression192); 
                    
                    match(input, Token.DOWN, null); 
                    newName=(CommonTree)input.LT(1);
                    matchAny(input); 
                    oldName=(CommonTree)input.LT(1);
                    matchAny(input); 
                    
                    match(input, Token.UP, null); 
                    e = new ExpressionList(); ((ExpressionList)e).addExpression(new MethodDefinationExpression(oldName.getText())); ((ExpressionList)e).addExpression(new AliasStatement(newName.getText(), oldName.getText()));
                    
                    }
                    break;
                case 7 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:34:10: ^( ASSIGN left= variableExpression right= expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expression217); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression221);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression225);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, right);
                    
                    }
                    break;
                case 8 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:35:10: ^( MOD_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expression240); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression245);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression249);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression(String.valueOf(37), left, right));
                    
                    }
                    break;
                case 9 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:37:10: ^( DIV_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expression266); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression272);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression276);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("/", left, right));
                    
                    }
                    break;
                case 10 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:38:10: ^( MINUS_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expression291); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression297);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression301);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("-", left, right));
                    
                    }
                    break;
                case 11 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:39:10: ^( PLUS_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expression316); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression322);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression326);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("+", left, right));
                    
                    }
                    break;
                case 12 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:40:10: ^( BOR_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,BOR_ASSIGN,FOLLOW_BOR_ASSIGN_in_expression341); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression347);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression351);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("|", left, right));
                    
                    }
                    break;
                case 13 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:41:10: ^( BAND_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,BAND_ASSIGN,FOLLOW_BAND_ASSIGN_in_expression366); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression372);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression376);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("&", left, right));
                    
                    }
                    break;
                case 14 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:42:10: ^( LEFT_SHIFT_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,LEFT_SHIFT_ASSIGN,FOLLOW_LEFT_SHIFT_ASSIGN_in_expression391); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression396);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression400);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression("<<", left, right));
                    
                    }
                    break;
                case 15 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:43:10: ^( RIGHT_SHIFT_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,RIGHT_SHIFT_ASSIGN,FOLLOW_RIGHT_SHIFT_ASSIGN_in_expression415); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression420);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression424);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression(">>", left, right));
                    
                    }
                    break;
                case 16 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:44:10: ^( STAR_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expression439); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression445);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression449);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("*", left, right));
                    
                    }
                    break;
                case 17 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:45:10: ^( LOGICAL_AND_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,LOGICAL_AND_ASSIGN,FOLLOW_LOGICAL_AND_ASSIGN_in_expression464); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression468);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression472);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("&&", left, right));
                    
                    }
                    break;
                case 18 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:46:10: ^( LOGICAL_OR_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,LOGICAL_OR_ASSIGN,FOLLOW_LOGICAL_OR_ASSIGN_in_expression487); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression492);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression496);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("||", left, right));
                    
                    }
                    break;
                case 19 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:47:10: ^( POWER_ASSIGN left= variableExpression right= expression )
                    {
                    match(input,POWER_ASSIGN,FOLLOW_POWER_ASSIGN_in_expression511); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_variableExpression_in_expression517);
                    left=variableExpression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression521);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("**", left, right));
                    
                    }
                    break;
                case 20 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:49:10: ^( LEFT_SHIFT lhs0= expression rhs= expression )
                    {
                    match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_expression538); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression542);
                    lhs0=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression546);
                    rhs=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e=new BinaryOperatorExpression("<<", lhs0, rhs);
                    
                    }
                    break;
                case 21 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:50:10: e1= variableExpression
                    {
                    pushFollow(FOLLOW_variableExpression_in_expression562);
                    e1=variableExpression();
                    _fsp--;

                    e=e1;
                    
                    }
                    break;
                case 22 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:51:10: 'true'
                    {
                    match(input,129,FOLLOW_129_in_expression575); 
                    e = new TrueExpression();
                    
                    }
                    break;
                case 23 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:52:10: 'false'
                    {
                    match(input,127,FOLLOW_127_in_expression588); 
                    e = new FalseExpression();
                    
                    }
                    break;
                case 24 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:53:10: 'nil'
                    {
                    match(input,128,FOLLOW_128_in_expression600); 
                    e = new NilExpression();
                    
                    }
                    break;
                case 25 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:54:10: ^( QUESTION condition= expression left= expression right= expression )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expression613); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression617);
                    condition=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression621);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression625);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e= new IfExpression(condition, left, right);
                    
                    }
                    break;
                case 26 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:55:10: ^( POWER left= expression right= expression )
                    {
                    match(input,POWER,FOLLOW_POWER_in_expression640); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression644);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression648);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e= new BinaryOperatorExpression("**", left, right);
                    
                    }
                    break;
                case 27 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:56:10: ^(op= ( 'and' | '&&' ) left= expression right= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==136||input.LA(1)==143 ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expression665);    throw mse;
                    }

                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression673);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression677);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e= new AndOrBinaryOperatorExpression("&&", left, right);
                    
                    }
                    break;
                case 28 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:57:10: ^(op= ( 'or' | '||' ) left= expression right= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==137||input.LA(1)==144 ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expression694);    throw mse;
                    }

                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression702);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression706);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e= new AndOrBinaryOperatorExpression("||", left, right);
                    
                    }
                    break;
                case 29 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:58:10: ^(op= 'not' left= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    match(input,138,FOLLOW_138_in_expression723); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression726);
                    left=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = new UnaryOperatorExpression("!", left);
                    
                    }
                    break;
                case 30 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:59:10: ^( INCLUSIVE_RANGE left= expression right= expression )
                    {
                    match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_expression741); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression746);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression750);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = new RangeOperatorExpression("..", left, right);
                    
                    }
                    break;
                case 31 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:60:10: ^( EXCLUSIVE_RANGE left= expression right= expression )
                    {
                    match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_expression765); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression770);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression774);
                    right=expression();
                    _fsp--;

                    
                    match(input, Token.UP, null); 
                    e = new RangeOperatorExpression("...", left, right);
                    
                    }
                    break;
                case 32 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:62:10: e1= methodDefinition
                    {
                    pushFollow(FOLLOW_methodDefinition_in_expression792);
                    e1=methodDefinition();
                    _fsp--;

                    e=e1;
                    
                    }
                    break;
                case 33 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:63:10: e1= method
                    {
                    pushFollow(FOLLOW_method_in_expression807);
                    e1=method();
                    _fsp--;

                    e=e1;
                    
                    }
                    break;
                case 34 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:64:10: ^( DOT left= expression ^( CALL methodName= ID (arg= arguments )? ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_expression820); 
                    
                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression824);
                    left=expression();
                    _fsp--;

                    match(input,CALL,FOLLOW_CALL_in_expression827); 
                    
                    match(input, Token.DOWN, null); 
                    methodName=(CommonTree)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expression831); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:64:54: (arg= arguments )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);
                    
                    if ( (LA2_0==ARG) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:64:55: arg= arguments
                            {
                            pushFollow(FOLLOW_arguments_in_expression837);
                            arg=arguments();
                            _fsp--;

                            
                            }
                            break;
                    
                    }

                    
                    match(input, Token.UP, null); 
                    e = new MethodCallExpression(left, methodName.getText(), arg, null);
                    
                    match(input, Token.UP, null); 
                    
                    }
                    break;
                case 35 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:66:10: ^( '{' (e1= expression e2= expression )* )
                    {
                    match(input,LCURLY,FOLLOW_LCURLY_in_expression864); 
                    
                    e = new HashExpression();
                    
                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:66:44: (e1= expression e2= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);
                            
                            if ( ((LA3_0>=LEFT_SHIFT && LA3_0<=FLOAT)||(LA3_0>=VARIABLE && LA3_0<=CALL)||LA3_0==DOT||(LA3_0>=POWER && LA3_0<=MOD_ASSIGN)||(LA3_0>=DIV_ASSIGN && LA3_0<=EXCLUSIVE_RANGE)||LA3_0==INT||(LA3_0>=SINGLE_QUOTE_STRING_SIMPLE && LA3_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA3_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA3_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA3_0==LCURLY||(LA3_0>=127 && LA3_0<=129)||(LA3_0>=133 && LA3_0<=134)||(LA3_0>=136 && LA3_0<=138)||(LA3_0>=143 && LA3_0<=144)) ) {
                                alt3=1;
                            }
                            
                        
                            switch (alt3) {
                        	case 1 :
                        	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:66:45: e1= expression e2= expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_expression871);
                        	    e1=expression();
                        	    _fsp--;

                        	    pushFollow(FOLLOW_expression_in_expression875);
                        	    e2=expression();
                        	    _fsp--;

                        	    ((HashExpression)e).addElement(e1,e2);
                        	    
                        	    }
                        	    break;
                        
                        	default :
                        	    break loop3;
                            }
                        } while (true);

                    
                        match(input, Token.UP, null); 
                    }
                    
                    }
                    break;
            
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end expression

    
    // $ANTLR start variableExpression
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:68:1: variableExpression returns [LocalVariableExpression e] : ^( VARIABLE ID ) ;
    public final LocalVariableExpression variableExpression() throws RecognitionException {

        LocalVariableExpression e = null;
    
        CommonTree ID1=null;
    
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:69:2: ( ^( VARIABLE ID ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:69:4: ^( VARIABLE ID )
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_variableExpression895); 
            
            match(input, Token.DOWN, null); 
            ID1=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variableExpression897); 
            
            match(input, Token.UP, null); 
            e=new LocalVariableExpression(ID1.getText(), false);
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end variableExpression

    
    // $ANTLR start methodDefinition
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:70:1: methodDefinition returns [MethodDefinationExpression e] : ^( 'def' name= ID ( ^( ARG (name1= ID )* ( ^( '=' name2= ID e1= expression ) )* ( ^( '*' (name3= ID | REST_UNUSE ) ) )? ) )? ^( BODY sl= statement_list ) ) ;
    public final MethodDefinationExpression methodDefinition() throws RecognitionException {

        MethodDefinationExpression e = null;
    
        CommonTree name=null;
        CommonTree name1=null;
        CommonTree name2=null;
        CommonTree name3=null;
        Expression e1 = null;

        StatementList sl = null;
        
    
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:72:9: ( ^( 'def' name= ID ( ^( ARG (name1= ID )* ( ^( '=' name2= ID e1= expression ) )* ( ^( '*' (name3= ID | REST_UNUSE ) ) )? ) )? ^( BODY sl= statement_list ) ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:72:11: ^( 'def' name= ID ( ^( ARG (name1= ID )* ( ^( '=' name2= ID e1= expression ) )* ( ^( '*' (name3= ID | REST_UNUSE ) ) )? ) )? ^( BODY sl= statement_list ) )
            {
            match(input,134,FOLLOW_134_in_methodDefinition920); 
            
            match(input, Token.DOWN, null); 
            name=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_methodDefinition924); 
            e = new MethodDefinationExpression(name.getText());
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:73:20: ( ^( ARG (name1= ID )* ( ^( '=' name2= ID e1= expression ) )* ( ^( '*' (name3= ID | REST_UNUSE ) ) )? ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);
            
            if ( (LA9_0==ARG) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:73:21: ^( ARG (name1= ID )* ( ^( '=' name2= ID e1= expression ) )* ( ^( '*' (name3= ID | REST_UNUSE ) ) )? )
                    {
                    match(input,ARG,FOLLOW_ARG_in_methodDefinition949); 
                    
                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:73:27: (name1= ID )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);
                            
                            if ( (LA5_0==ID) ) {
                                alt5=1;
                            }
                            
                        
                            switch (alt5) {
                        	case 1 :
                        	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:73:28: name1= ID
                        	    {
                        	    name1=(CommonTree)input.LT(1);
                        	    match(input,ID,FOLLOW_ID_in_methodDefinition954); 
                        	    e.addParameter(name1.getText(), null);
                        	    
                        	    }
                        	    break;
                        
                        	default :
                        	    break loop5;
                            }
                        } while (true);

                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:73:75: ( ^( '=' name2= ID e1= expression ) )*
                        loop6:
                        do {
                            int alt6=2;
                            int LA6_0 = input.LA(1);
                            
                            if ( (LA6_0==ASSIGN) ) {
                                alt6=1;
                            }
                            
                        
                            switch (alt6) {
                        	case 1 :
                        	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:73:76: ^( '=' name2= ID e1= expression )
                        	    {
                        	    match(input,ASSIGN,FOLLOW_ASSIGN_in_methodDefinition961); 
                        	    
                        	    match(input, Token.DOWN, null); 
                        	    name2=(CommonTree)input.LT(1);
                        	    match(input,ID,FOLLOW_ID_in_methodDefinition965); 
                        	    pushFollow(FOLLOW_expression_in_methodDefinition969);
                        	    e1=expression();
                        	    _fsp--;

                        	    e.addParameter(name2.getText(), e1);
                        	    
                        	    match(input, Token.UP, null); 
                        	    
                        	    }
                        	    break;
                        
                        	default :
                        	    break loop6;
                            }
                        } while (true);

                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:74:20: ( ^( '*' (name3= ID | REST_UNUSE ) ) )?
                        int alt8=2;
                        int LA8_0 = input.LA(1);
                        
                        if ( (LA8_0==STAR) ) {
                            alt8=1;
                        }
                        switch (alt8) {
                            case 1 :
                                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:74:21: ^( '*' (name3= ID | REST_UNUSE ) )
                                {
                                match(input,STAR,FOLLOW_STAR_in_methodDefinition997); 
                                
                                match(input, Token.DOWN, null); 
                                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:74:27: (name3= ID | REST_UNUSE )
                                int alt7=2;
                                int LA7_0 = input.LA(1);
                                
                                if ( (LA7_0==ID) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_0==REST_UNUSE) ) {
                                    alt7=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("74:27: (name3= ID | REST_UNUSE )", 7, 0, input);
                                
                                    throw nvae;
                                }
                                switch (alt7) {
                                    case 1 :
                                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:74:28: name3= ID
                                        {
                                        name3=(CommonTree)input.LT(1);
                                        match(input,ID,FOLLOW_ID_in_methodDefinition1002); 
                                        e.setAsteriskParameter(name3.getText());
                                        
                                        }
                                        break;
                                    case 2 :
                                        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:74:77: REST_UNUSE
                                        {
                                        match(input,REST_UNUSE,FOLLOW_REST_UNUSE_in_methodDefinition1007); 
                                        e.setAsteriskParameter(null);
                                        
                                        }
                                        break;
                                
                                }

                                
                                match(input, Token.UP, null); 
                                
                                }
                                break;
                        
                        }

                    
                        match(input, Token.UP, null); 
                    }
                    
                    }
                    break;
            
            }

            match(input,BODY,FOLLOW_BODY_in_methodDefinition1090); 
            
            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_list_in_methodDefinition1094);
            sl=statement_list();
            _fsp--;

            
            match(input, Token.UP, null); 
            
            match(input, Token.UP, null); 
            e.setBody(new BodyStatement(sl));
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end methodDefinition

    
    // $ANTLR start method
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:78:1: method returns [MethodCallExpression e] : ^( CALL methodName= ID (arg= arguments )? ) ;
    public final MethodCallExpression method() throws RecognitionException {

        MethodCallExpression e = null;
    
        CommonTree methodName=null;
        MethodCallArguments arg = null;
        
    
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:80:1: ( ^( CALL methodName= ID (arg= arguments )? ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:81:1: ^( CALL methodName= ID (arg= arguments )? )
            {
            match(input,CALL,FOLLOW_CALL_in_method1112); 
            
            match(input, Token.DOWN, null); 
            methodName=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_method1116); 
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:81:23: (arg= arguments )?
            int alt10=2;
            int LA10_0 = input.LA(1);
            
            if ( (LA10_0==ARG) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:81:24: arg= arguments
                    {
                    pushFollow(FOLLOW_arguments_in_method1122);
                    arg=arguments();
                    _fsp--;

                    
                    }
                    break;
            
            }

            e = new MethodCallExpression(null, methodName.getText(), arg, null);
            
            match(input, Token.UP, null); 
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end method

    
    // $ANTLR start arguments
    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:83:1: arguments returns [MethodCallArguments args] : ^( ARG (e1= expression )* ) ;
    public final MethodCallArguments arguments() throws RecognitionException {

        MethodCallArguments args = null;
    
        Expression e1 = null;
        
    
        
        	args = new MethodCallArguments();
        	Expression e = null;
    
        try {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:89:3: ( ^( ARG (e1= expression )* ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:89:5: ^( ARG (e1= expression )* )
            {
            match(input,ARG,FOLLOW_ARG_in_arguments1154); 
            
            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:90:4: (e1= expression )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);
                    
                    if ( ((LA11_0>=LEFT_SHIFT && LA11_0<=FLOAT)||(LA11_0>=VARIABLE && LA11_0<=CALL)||LA11_0==DOT||(LA11_0>=POWER && LA11_0<=MOD_ASSIGN)||(LA11_0>=DIV_ASSIGN && LA11_0<=EXCLUSIVE_RANGE)||LA11_0==INT||(LA11_0>=SINGLE_QUOTE_STRING_SIMPLE && LA11_0<=SINGLE_QUOTE_STRING_COMPLEX)||(LA11_0>=DOUBLE_QUOTE_STRING_SIMPLE && LA11_0<=DOUBLE_QUOTE_STRING_COMPLEX)||LA11_0==LCURLY||(LA11_0>=127 && LA11_0<=129)||(LA11_0>=133 && LA11_0<=134)||(LA11_0>=136 && LA11_0<=138)||(LA11_0>=143 && LA11_0<=144)) ) {
                        alt11=1;
                    }
                    
                
                    switch (alt11) {
                	case 1 :
                	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:90:5: e1= expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments1164);
                	    e1=expression();
                	    _fsp--;

                	    args.addArgument(e1);
                	    
                	    }
                	    break;
                
                	default :
                	    break loop11;
                    }
                } while (true);

            
                match(input, Token.UP, null); 
            }
            
            }
    
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end arguments


 

    public static final BitSet FOLLOW_statement_list_in_program48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATEMENT_LIST_in_statement_list67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement_list72 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_STATEMENT_in_statement91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expression112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expression126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_expression177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_expression192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_expression217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression221 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expression240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression245 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expression266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression272 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expression291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression297 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expression316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression322 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_ASSIGN_in_expression341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression347 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_ASSIGN_in_expression366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression372 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_SHIFT_ASSIGN_in_expression391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression396 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_ASSIGN_in_expression415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression420 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expression439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression445 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_ASSIGN_in_expression464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression468 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_ASSIGN_in_expression487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression492 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_ASSIGN_in_expression511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableExpression_in_expression517 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_expression538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression542 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableExpression_in_expression562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_expression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_expression588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_expression600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expression613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression617 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression621 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression625 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_in_expression640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression644 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression673 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression702 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_138_in_expression723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_expression741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression746 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_expression765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression770 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression774 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodDefinition_in_expression792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_expression807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_expression820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CALL_in_expression827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression831 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_arguments_in_expression837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCURLY_in_expression864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression871 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_expression875 = new BitSet(new long[]{0xDC00080000033808L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_VARIABLE_in_variableExpression895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_variableExpression897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_134_in_methodDefinition920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDefinition924 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ARG_in_methodDefinition949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDefinition954 = new BitSet(new long[]{0x0A00200000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_methodDefinition961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDefinition965 = new BitSet(new long[]{0xDC00080000033800L,0x80002D8000200FFFL,0x0000000000018763L});
    public static final BitSet FOLLOW_expression_in_methodDefinition969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_methodDefinition997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDefinition1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REST_UNUSE_in_methodDefinition1007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BODY_in_methodDefinition1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_list_in_methodDefinition1094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_method1112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_method1116 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_arguments_in_method1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_arguments1154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments1164 = new BitSet(new long[]{0xDC00080000033808L,0x80002D8000200FFFL,0x0000000000018763L});

}