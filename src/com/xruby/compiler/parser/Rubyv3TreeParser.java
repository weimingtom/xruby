// $ANTLR 3.0 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g 2007-06-11 10:23:47

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

public class Rubyv3TreeParser extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "ARG", "LEFT_SHIFT", "HEREDOC_STRING", "FLOAT", "CONSTANT", "FID", "VARIABLE", "CALL", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "COLON2", "ID", "COMPARE", "EQUAL", "CASE_EQUAL", "MATCH", "GREATER_THAN", "GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "ASSIGN", "MOD_ASSIGN", "COMPLEMENT_ASSIGN", "DIV_ASSIGN", "MINUS_ASSIGN", "PLUS_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "STAR_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "POWER_ASSIGN", "QUESTION", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "NOT_EQUAL", "NOT_MATCH", "BXOR", "BOR", "BAND", "BNOT", "NOT", "INT", "ARRAY", "REGEX", "OCTAL", "HEX", "BINARY", "LEADING_MARK_DECIMAL", "EXP_PART", "LEADING0_NUMBER", "IDENTIFIER_CONSTANT_AND_KEYWORD", "INSTANCE_VARIABLE", "CLASS_VARIABLE", "GLOBAL_VARIABLE", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "ESCAPE_INT", "NON_LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "ASSOC", "BXOR_ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "ANYTHING_OTHER_THAN_LINE_FEED", "COMMENT", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'alias'", "'def'", "'.'", "'[]='", "'and'", "'or'", "'not'", "'defined'", "'expression0'", "'expression1'", "'expression2'", "'&&'", "'||'"
    };
    public static final int COMMA=113;
    public static final int INSTANCE_VARIABLE=89;
    public static final int LOGICAL_AND_ASSIGN=64;
    public static final int GREATER_THAN=44;
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
    public static final int CONSTANT=14;
    public static final int LINE_BREAK=36;
    public static final int LEFT_SHIFT=11;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=88;
    public static final int IF_MODIFIER=30;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int ESCAPE_INT_PART=95;
    public static final int REGEX=81;
    public static final int SYMBOL=18;
    public static final int CONTROL_PART=93;
    public static final int RPAREN=109;
    public static final int STAR_ASSIGN=63;
    public static final int DOUBLE_QUOTE_STRING=99;
    public static final int PLUS=49;
    public static final int BODY=9;
    public static final int HEREDOC_INDENT_BEGIN=105;
    public static final int UNLESS_MODIFIER=31;
    public static final int CASE_EQUAL=42;
    public static final int MINUS_ASSIGN=57;
    public static final int EXCLUSIVE_RANGE=69;
    public static final int GREATER_OR_EQUAL=45;
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
    public static final int VARIABLE=16;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int EOF=-1;
    public static final int CALL=17;
    public static final int RBRACK=111;
    public static final int RESCUE_MODIFIER=34;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BXOR=74;
    public static final int STAR=51;
    public static final int NOT=78;
    public static final int SINGLE_STRING_CHAR=100;

        public Rubyv3TreeParser(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g"; }



    // $ANTLR start program
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:14:1: program returns [Program p] : sl= statement_list ;
    public final Program program() throws RecognitionException {
        Program p = null;

        StatementList sl = null;


        p = new Program();
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:29: (sl= statement_list )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:29: sl= statement_list
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:17:1: statement_list returns [StatementList statementList] : ^( STATEMENT_LIST (s= statement )* ) ;
    public final StatementList statement_list() throws RecognitionException {
        StatementList statementList = null;

        Statement s = null;


        statementList = new StatementList();
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:4: ( ^( STATEMENT_LIST (s= statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:4: ^( STATEMENT_LIST (s= statement )* )
            {
            match(input,STATEMENT_LIST,FOLLOW_STATEMENT_LIST_in_statement_list67); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:21: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:19:22: s= statement
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:22:1: statement returns [Statement s] : ^( STATEMENT e= expression ) ;
    public final Statement statement() throws RecognitionException {
        Statement s = null;

        Expression e = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:23:4: ( ^( STATEMENT e= expression ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:23:4: ^( STATEMENT e= expression )
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:25:1: expression returns [Expression e] : (value= INT | value= FLOAT | value= SINGLE_QUOTE_STRING | value= DOUBLE_QUOTE_STRING | value= HEREDOC_STRING | ^( 'alias' newName= . oldName= . ) | ^( ASSIGN left= expression right= expression ) | ^( MOD_ASSIGN left= expression right= expression ) | ^( DIV_ASSIGN left= expression right= expression ) | ^( MINUS_ASSIGN left= expression right= expression ) | ^( PLUS_ASSIGN left= expression right= expression ) | ^( BOR_ASSIGN left= expression right= expression ) | ^( BAND_ASSIGN left= expression right= expression ) | ^( LEFT_SHIFT_ASSIGN left= expression right= expression ) | ^( RIGHT_SHIFT_ASSIGN left= expression right= expression ) | ^( STAR_ASSIGN left= expression right= expression ) | ^( LOGICAL_AND_ASSIGN left= expression right= expression ) | ^( LOGICAL_OR_ASSIGN left= expression right= expression ) | ^( POWER_ASSIGN left= expression right= expression ) | ^( LEFT_SHIFT lhs0= expression rhs= expression ) | e1= variableExpression | 'true' | 'false' | 'nil' | ^( QUESTION condition= expression left= expression right= expression ) | ^( POWER left= expression right= expression ) | ^(op= ( 'and' | '&&' ) left= expression right= expression ) | ^(op= ( 'or' | '||' ) left= expression right= expression ) | ^(op= 'not' left= expression ) | ^( INCLUSIVE_RANGE left= expression right= expression ) | ^( EXCLUSIVE_RANGE left= expression right= expression ) | e1= methodDefinition | ^( CALL methodName= ID (arg= arguments )? ) | ^( '{' (e1= expression e2= expression )* ) );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:26:4: (value= INT | value= FLOAT | value= SINGLE_QUOTE_STRING | value= DOUBLE_QUOTE_STRING | value= HEREDOC_STRING | ^( 'alias' newName= . oldName= . ) | ^( ASSIGN left= expression right= expression ) | ^( MOD_ASSIGN left= expression right= expression ) | ^( DIV_ASSIGN left= expression right= expression ) | ^( MINUS_ASSIGN left= expression right= expression ) | ^( PLUS_ASSIGN left= expression right= expression ) | ^( BOR_ASSIGN left= expression right= expression ) | ^( BAND_ASSIGN left= expression right= expression ) | ^( LEFT_SHIFT_ASSIGN left= expression right= expression ) | ^( RIGHT_SHIFT_ASSIGN left= expression right= expression ) | ^( STAR_ASSIGN left= expression right= expression ) | ^( LOGICAL_AND_ASSIGN left= expression right= expression ) | ^( LOGICAL_OR_ASSIGN left= expression right= expression ) | ^( POWER_ASSIGN left= expression right= expression ) | ^( LEFT_SHIFT lhs0= expression rhs= expression ) | e1= variableExpression | 'true' | 'false' | 'nil' | ^( QUESTION condition= expression left= expression right= expression ) | ^( POWER left= expression right= expression ) | ^(op= ( 'and' | '&&' ) left= expression right= expression ) | ^(op= ( 'or' | '||' ) left= expression right= expression ) | ^(op= 'not' left= expression ) | ^( INCLUSIVE_RANGE left= expression right= expression ) | ^( EXCLUSIVE_RANGE left= expression right= expression ) | e1= methodDefinition | ^( CALL methodName= ID (arg= arguments )? ) | ^( '{' (e1= expression e2= expression )* ) )
            int alt4=34;
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
            case SINGLE_QUOTE_STRING:
                {
                alt4=3;
                }
                break;
            case DOUBLE_QUOTE_STRING:
                {
                alt4=4;
                }
                break;
            case HEREDOC_STRING:
                {
                alt4=5;
                }
                break;
            case 125:
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
            case 121:
                {
                alt4=22;
                }
                break;
            case 119:
                {
                alt4=23;
                }
                break;
            case 120:
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
            case 129:
            case 136:
                {
                alt4=27;
                }
                break;
            case 130:
            case 137:
                {
                alt4=28;
                }
                break;
            case 131:
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
            case 126:
                {
                alt4=32;
                }
                break;
            case CALL:
                {
                alt4=33;
                }
                break;
            case LCURLY:
                {
                alt4=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("25:1: expression returns [Expression e] : (value= INT | value= FLOAT | value= SINGLE_QUOTE_STRING | value= DOUBLE_QUOTE_STRING | value= HEREDOC_STRING | ^( 'alias' newName= . oldName= . ) | ^( ASSIGN left= expression right= expression ) | ^( MOD_ASSIGN left= expression right= expression ) | ^( DIV_ASSIGN left= expression right= expression ) | ^( MINUS_ASSIGN left= expression right= expression ) | ^( PLUS_ASSIGN left= expression right= expression ) | ^( BOR_ASSIGN left= expression right= expression ) | ^( BAND_ASSIGN left= expression right= expression ) | ^( LEFT_SHIFT_ASSIGN left= expression right= expression ) | ^( RIGHT_SHIFT_ASSIGN left= expression right= expression ) | ^( STAR_ASSIGN left= expression right= expression ) | ^( LOGICAL_AND_ASSIGN left= expression right= expression ) | ^( LOGICAL_OR_ASSIGN left= expression right= expression ) | ^( POWER_ASSIGN left= expression right= expression ) | ^( LEFT_SHIFT lhs0= expression rhs= expression ) | e1= variableExpression | 'true' | 'false' | 'nil' | ^( QUESTION condition= expression left= expression right= expression ) | ^( POWER left= expression right= expression ) | ^(op= ( 'and' | '&&' ) left= expression right= expression ) | ^(op= ( 'or' | '||' ) left= expression right= expression ) | ^(op= 'not' left= expression ) | ^( INCLUSIVE_RANGE left= expression right= expression ) | ^( EXCLUSIVE_RANGE left= expression right= expression ) | e1= methodDefinition | ^( CALL methodName= ID (arg= arguments )? ) | ^( '{' (e1= expression e2= expression )* ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:26:4: value= INT
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_expression112); 
                    e=IntegerExpression.parseIntegerExpression(value.getText());

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:27:10: value= FLOAT
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_expression126); 
                    e=new FloatExpression(value.getText());

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:28:10: value= SINGLE_QUOTE_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_expression140); 
                    e=new SingleQuoteStringExpression(value.getText());

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:29:10: value= DOUBLE_QUOTE_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,DOUBLE_QUOTE_STRING,FOLLOW_DOUBLE_QUOTE_STRING_in_expression154); 
                    e=((MyToken)value.getToken()).getExpression();

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:30:10: value= HEREDOC_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_expression169); 
                    e=((MyToken)value.getToken()).getExpression();

                    }
                    break;
                case 6 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:32:10: ^( 'alias' newName= . oldName= . )
                    {
                    match(input,125,FOLLOW_125_in_expression184); 

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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:34:10: ^( ASSIGN left= expression right= expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expression209); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression213);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression217);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, right);

                    }
                    break;
                case 8 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:35:10: ^( MOD_ASSIGN left= expression right= expression )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expression232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression237);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression241);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression(String.valueOf(37), left, right));

                    }
                    break;
                case 9 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:37:10: ^( DIV_ASSIGN left= expression right= expression )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expression258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression264);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression268);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("/", left, right));

                    }
                    break;
                case 10 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:38:10: ^( MINUS_ASSIGN left= expression right= expression )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expression283); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression289);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression293);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("-", left, right));

                    }
                    break;
                case 11 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:39:10: ^( PLUS_ASSIGN left= expression right= expression )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expression308); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression314);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression318);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("+", left, right));

                    }
                    break;
                case 12 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:40:10: ^( BOR_ASSIGN left= expression right= expression )
                    {
                    match(input,BOR_ASSIGN,FOLLOW_BOR_ASSIGN_in_expression333); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression339);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression343);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("|", left, right));

                    }
                    break;
                case 13 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:41:10: ^( BAND_ASSIGN left= expression right= expression )
                    {
                    match(input,BAND_ASSIGN,FOLLOW_BAND_ASSIGN_in_expression358); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression364);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression368);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("&", left, right));

                    }
                    break;
                case 14 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:42:10: ^( LEFT_SHIFT_ASSIGN left= expression right= expression )
                    {
                    match(input,LEFT_SHIFT_ASSIGN,FOLLOW_LEFT_SHIFT_ASSIGN_in_expression383); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression388);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression392);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression("<<", left, right));

                    }
                    break;
                case 15 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:43:10: ^( RIGHT_SHIFT_ASSIGN left= expression right= expression )
                    {
                    match(input,RIGHT_SHIFT_ASSIGN,FOLLOW_RIGHT_SHIFT_ASSIGN_in_expression407); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression412);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression416);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression(">>", left, right));

                    }
                    break;
                case 16 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:44:10: ^( STAR_ASSIGN left= expression right= expression )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expression431); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression437);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression441);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("*", left, right));

                    }
                    break;
                case 17 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:45:10: ^( LOGICAL_AND_ASSIGN left= expression right= expression )
                    {
                    match(input,LOGICAL_AND_ASSIGN,FOLLOW_LOGICAL_AND_ASSIGN_in_expression456); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression460);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression464);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("&&", left, right));

                    }
                    break;
                case 18 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:46:10: ^( LOGICAL_OR_ASSIGN left= expression right= expression )
                    {
                    match(input,LOGICAL_OR_ASSIGN,FOLLOW_LOGICAL_OR_ASSIGN_in_expression479); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression484);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression488);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("||", left, right));

                    }
                    break;
                case 19 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:47:10: ^( POWER_ASSIGN left= expression right= expression )
                    {
                    match(input,POWER_ASSIGN,FOLLOW_POWER_ASSIGN_in_expression503); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression509);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression513);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("**", left, right));

                    }
                    break;
                case 20 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:49:10: ^( LEFT_SHIFT lhs0= expression rhs= expression )
                    {
                    match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_expression530); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression534);
                    lhs0=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression538);
                    rhs=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e=new BinaryOperatorExpression("<<", lhs0, rhs);

                    }
                    break;
                case 21 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:50:10: e1= variableExpression
                    {
                    pushFollow(FOLLOW_variableExpression_in_expression554);
                    e1=variableExpression();
                    _fsp--;

                    e=e1;

                    }
                    break;
                case 22 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:51:10: 'true'
                    {
                    match(input,121,FOLLOW_121_in_expression567); 
                    e = new TrueExpression();

                    }
                    break;
                case 23 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:52:10: 'false'
                    {
                    match(input,119,FOLLOW_119_in_expression580); 
                    e = new FalseExpression();

                    }
                    break;
                case 24 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:53:10: 'nil'
                    {
                    match(input,120,FOLLOW_120_in_expression592); 
                    e = new NilExpression();

                    }
                    break;
                case 25 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:54:10: ^( QUESTION condition= expression left= expression right= expression )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expression605); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression609);
                    condition=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression613);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression617);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e= new IfExpression(condition, left, right);

                    }
                    break;
                case 26 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:55:10: ^( POWER left= expression right= expression )
                    {
                    match(input,POWER,FOLLOW_POWER_in_expression632); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression636);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression640);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e= new BinaryOperatorExpression("**", left, right);

                    }
                    break;
                case 27 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:56:10: ^(op= ( 'and' | '&&' ) left= expression right= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==129||input.LA(1)==136 ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expression657);    throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression665);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression669);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e= new AndOrBinaryOperatorExpression("&&", left, right);

                    }
                    break;
                case 28 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:57:10: ^(op= ( 'or' | '||' ) left= expression right= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    if ( input.LA(1)==130||input.LA(1)==137 ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_expression686);    throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression694);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression698);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e= new AndOrBinaryOperatorExpression("||", left, right);

                    }
                    break;
                case 29 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:58:10: ^(op= 'not' left= expression )
                    {
                    op=(CommonTree)input.LT(1);
                    match(input,131,FOLLOW_131_in_expression715); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression718);
                    left=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = new UnaryOperatorExpression("!", left);

                    }
                    break;
                case 30 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:59:10: ^( INCLUSIVE_RANGE left= expression right= expression )
                    {
                    match(input,INCLUSIVE_RANGE,FOLLOW_INCLUSIVE_RANGE_in_expression733); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression738);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression742);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = new RangeOperatorExpression("..", left, right);

                    }
                    break;
                case 31 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:60:10: ^( EXCLUSIVE_RANGE left= expression right= expression )
                    {
                    match(input,EXCLUSIVE_RANGE,FOLLOW_EXCLUSIVE_RANGE_in_expression757); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression762);
                    left=expression();
                    _fsp--;

                    pushFollow(FOLLOW_expression_in_expression766);
                    right=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e = new RangeOperatorExpression("...", left, right);

                    }
                    break;
                case 32 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:62:10: e1= methodDefinition
                    {
                    pushFollow(FOLLOW_methodDefinition_in_expression784);
                    e1=methodDefinition();
                    _fsp--;

                    e=e1;

                    }
                    break;
                case 33 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:63:10: ^( CALL methodName= ID (arg= arguments )? )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expression799); 

                    match(input, Token.DOWN, null); 
                    methodName=(CommonTree)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expression803); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:63:32: (arg= arguments )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ARG) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:63:33: arg= arguments
                            {
                            pushFollow(FOLLOW_arguments_in_expression809);
                            arg=arguments();
                            _fsp--;


                            }
                            break;

                    }

                    e = new MethodCallExpression(null, methodName.getText(), arg, null);

                    match(input, Token.UP, null); 

                    }
                    break;
                case 34 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:64:10: ^( '{' (e1= expression e2= expression )* )
                    {
                    match(input,LCURLY,FOLLOW_LCURLY_in_expression826); 

                    e = new HashExpression();

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:64:44: (e1= expression e2= expression )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>=LEFT_SHIFT && LA3_0<=FLOAT)||(LA3_0>=VARIABLE && LA3_0<=CALL)||(LA3_0>=POWER && LA3_0<=MOD_ASSIGN)||(LA3_0>=DIV_ASSIGN && LA3_0<=EXCLUSIVE_RANGE)||LA3_0==INT||(LA3_0>=SINGLE_QUOTE_STRING && LA3_0<=DOUBLE_QUOTE_STRING)||LA3_0==LCURLY||(LA3_0>=119 && LA3_0<=121)||(LA3_0>=125 && LA3_0<=126)||(LA3_0>=129 && LA3_0<=131)||(LA3_0>=136 && LA3_0<=137)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:64:45: e1= expression e2= expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_expression833);
                        	    e1=expression();
                        	    _fsp--;

                        	    pushFollow(FOLLOW_expression_in_expression837);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:66:1: variableExpression returns [LocalVariableExpression e] : ^( VARIABLE ID ) ;
    public final LocalVariableExpression variableExpression() throws RecognitionException {
        LocalVariableExpression e = null;

        CommonTree ID1=null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:67:4: ( ^( VARIABLE ID ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:67:4: ^( VARIABLE ID )
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_variableExpression857); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_variableExpression859); 

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:68:1: methodDefinition returns [MethodDefinationExpression e] : ^( 'def' name= ID ( ^( ARG ID ) )* ^( BODY sl= statement_list ) ) ;
    public final MethodDefinationExpression methodDefinition() throws RecognitionException {
        MethodDefinationExpression e = null;

        CommonTree name=null;
        StatementList sl = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:70:11: ( ^( 'def' name= ID ( ^( ARG ID ) )* ^( BODY sl= statement_list ) ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:70:11: ^( 'def' name= ID ( ^( ARG ID ) )* ^( BODY sl= statement_list ) )
            {
            match(input,126,FOLLOW_126_in_methodDefinition882); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)input.LT(1);
            match(input,ID,FOLLOW_ID_in_methodDefinition886); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:70:27: ( ^( ARG ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ARG) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:70:28: ^( ARG ID )
            	    {
            	    match(input,ARG,FOLLOW_ARG_in_methodDefinition890); 

            	    match(input, Token.DOWN, null); 
            	    match(input,ID,FOLLOW_ID_in_methodDefinition892); 

            	    match(input, Token.UP, null); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,BODY,FOLLOW_BODY_in_methodDefinition898); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_statement_list_in_methodDefinition902);
            sl=statement_list();
            _fsp--;


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 
            e = new MethodDefinationExpression(name.getText()); e.setBody(new BodyStatement(sl));

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


    // $ANTLR start arguments
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:72:1: arguments returns [MethodCallArguments args] : ^( ARG (e1= expression )* ) ;
    public final MethodCallArguments arguments() throws RecognitionException {
        MethodCallArguments args = null;

        Expression e1 = null;


        
        	args = new MethodCallArguments();
        	Expression e = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:78:5: ( ^( ARG (e1= expression )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:78:5: ^( ARG (e1= expression )* )
            {
            match(input,ARG,FOLLOW_ARG_in_arguments933); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:79:4: (e1= expression )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=LEFT_SHIFT && LA6_0<=FLOAT)||(LA6_0>=VARIABLE && LA6_0<=CALL)||(LA6_0>=POWER && LA6_0<=MOD_ASSIGN)||(LA6_0>=DIV_ASSIGN && LA6_0<=EXCLUSIVE_RANGE)||LA6_0==INT||(LA6_0>=SINGLE_QUOTE_STRING && LA6_0<=DOUBLE_QUOTE_STRING)||LA6_0==LCURLY||(LA6_0>=119 && LA6_0<=121)||(LA6_0>=125 && LA6_0<=126)||(LA6_0>=129 && LA6_0<=131)||(LA6_0>=136 && LA6_0<=137)) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:79:5: e1= expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments943);
                	    e1=expression();
                	    _fsp--;

                	    args.addArgument(e1);

                	    }
                	    break;

                	default :
                	    break loop6;
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
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_expression140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_in_expression154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_expression169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_expression184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_expression209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression213 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expression232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression237 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expression258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression264 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expression283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression289 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expression308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression314 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_ASSIGN_in_expression333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression339 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_ASSIGN_in_expression358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression364 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_SHIFT_ASSIGN_in_expression383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression388 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_ASSIGN_in_expression407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression412 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expression431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression437 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_ASSIGN_in_expression456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression460 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_ASSIGN_in_expression479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression484 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_ASSIGN_in_expression503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression509 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_expression530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression534 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableExpression_in_expression554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_expression567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_expression580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_expression592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expression605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression609 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression613 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_in_expression632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression636 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression665 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_expression686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression694 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_expression715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_expression733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression738 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_expression757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression762 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodDefinition_in_expression784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_expression799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression803 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_arguments_in_expression809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCURLY_in_expression826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression833 = new BitSet(new long[]{0xFF70000000033800L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_expression_in_expression837 = new BitSet(new long[]{0xFF70000000033808L,0x6380004C0000803FL,0x000000000000030EL});
    public static final BitSet FOLLOW_VARIABLE_in_variableExpression857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_variableExpression859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_126_in_methodDefinition882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDefinition886 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ARG_in_methodDefinition890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_methodDefinition892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BODY_in_methodDefinition898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_list_in_methodDefinition902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_arguments933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments943 = new BitSet(new long[]{0xFF70000000033808L,0x6380004C0000803FL,0x000000000000030EL});

}