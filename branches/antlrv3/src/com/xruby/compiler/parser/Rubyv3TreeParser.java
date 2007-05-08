// $ANTLR 3.0b7 E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g 2007-05-08 20:00:20

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

public class Rubyv3TreeParser extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "SHIFT", "ASSIGNMENT", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "INT", "FLOAT", "ARRAY", "HASH", "RANGE", "REGEX", "OCTAL", "DECIMAL", "HEX", "BINARY", "ESCAPE_INT", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "NON_LEADING0_NUMBER", "EXP_PART", "LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "HEREDOC_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "':'", "'then'", "'expression0'", "'expression1'", "'expression2'", "'='"
    };
    public static final int SINGLETON_METHOD=22;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int ESCAPE_INT=43;
    public static final int HASH=36;
    public static final int ARRAY=35;
    public static final int HEX_PART=44;
    public static final int FLOAT=34;
    public static final int OCTAL=39;
    public static final int META_PART=46;
    public static final int LEADING0_NUMBER=50;
    public static final int DECIMAL=40;
    public static final int BINARY=42;
    public static final int UNTIL_MODIFIER=27;
    public static final int BLOCK=15;
    public static final int RCURLY=57;
    public static final int LCURLY=56;
    public static final int LINE_BREAK=30;
    public static final int INT=33;
    public static final int IF_MODIFIER=24;
    public static final int MULTIPLE_ASSIGN=16;
    public static final int ESCAPE_INT_PART=47;
    public static final int REGEX=38;
    public static final int SYMBOL=14;
    public static final int CONTROL_PART=45;
    public static final int DOUBLE_QUOTE_STRING=52;
    public static final int ASSIGNMENT=13;
    public static final int BODY=9;
    public static final int UNLESS_MODIFIER=25;
    public static final int HEREDOC_STRING=53;
    public static final int ID=32;
    public static final int RANGE=37;
    public static final int SHIFT=12;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=19;
    public static final int WS=31;
    public static final int STRING=23;
    public static final int DOUBLE_STRING_CHAR=55;
    public static final int NESTED_LHS=21;
    public static final int NON_LEADING0_NUMBER=48;
    public static final int SINGLE_QUOTE_STRING=51;
    public static final int WHILE_MODIFIER=26;
    public static final int HEREDOC_BEGIN=58;
    public static final int SEMI=29;
    public static final int EXP_PART=49;
    public static final int MRHS=20;
    public static final int BLOCK_ARG=18;
    public static final int IF=7;
    public static final int ARG=11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=17;
    public static final int EOF=-1;
    public static final int CALL=10;
    public static final int RESCUE_MODIFIER=28;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int SINGLE_STRING_CHAR=54;
    public static final int HEX=41;

        public Rubyv3TreeParser(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g"; }



    // $ANTLR start program
    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:14:1: program returns [Program p] : ^( STATEMENT_LIST (s= statement )* ) ;
    public final Program program() throws RecognitionException {
        Program p = null;

        Statement s = null;


        StatementList statementList = new StatementList(); p = new Program(statementList);
        try {
            // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:92: ( ^( STATEMENT_LIST (s= statement )* ) )
            // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:92: ^( STATEMENT_LIST (s= statement )* )
            {
            match(input,STATEMENT_LIST,FOLLOW_STATEMENT_LIST_in_program46); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:109: (s= statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==STATEMENT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:15:110: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_program51);
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
        return p;
    }
    // $ANTLR end program


    // $ANTLR start statement
    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:17:1: statement returns [Statement s] : ^( STATEMENT e= expression ) ;
    public final Statement statement() throws RecognitionException {
        Statement s = null;

        Expression e = null;


        try {
            // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:18:4: ( ^( STATEMENT e= expression ) )
            // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:18:4: ^( STATEMENT e= expression )
            {
            match(input,STATEMENT,FOLLOW_STATEMENT_in_statement68); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_statement72);
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
    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:20:1: expression returns [Expression e] : (value= INT | value= SINGLE_QUOTE_STRING | value= DOUBLE_QUOTE_STRING | value= HEREDOC_STRING | ^( '=' lhs= . rhs= expression ) | ^( SHIFT lhs= . rhs= expression ) | ID );
    public final Expression expression() throws RecognitionException {
        Expression e = null;

        CommonTree value=null;
        CommonTree lhs=null;
        CommonTree ID1=null;
        Expression rhs = null;


        try {
            // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:21:4: (value= INT | value= SINGLE_QUOTE_STRING | value= DOUBLE_QUOTE_STRING | value= HEREDOC_STRING | ^( '=' lhs= . rhs= expression ) | ^( SHIFT lhs= . rhs= expression ) | ID )
            int alt2=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt2=1;
                }
                break;
            case SINGLE_QUOTE_STRING:
                {
                alt2=2;
                }
                break;
            case DOUBLE_QUOTE_STRING:
                {
                alt2=3;
                }
                break;
            case HEREDOC_STRING:
                {
                alt2=4;
                }
                break;
            case 71:
                {
                alt2=5;
                }
                break;
            case SHIFT:
                {
                alt2=6;
                }
                break;
            case ID:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("20:1: expression returns [Expression e] : (value= INT | value= SINGLE_QUOTE_STRING | value= DOUBLE_QUOTE_STRING | value= HEREDOC_STRING | ^( '=' lhs= . rhs= expression ) | ^( SHIFT lhs= . rhs= expression ) | ID );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:21:4: value= INT
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_expression89); 
                    e=IntegerExpression.parseIntegerExpression(value.getText());

                    }
                    break;
                case 2 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:22:10: value= SINGLE_QUOTE_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_expression103); 
                    e=new SingleQuoteStringExpression(value.getText());

                    }
                    break;
                case 3 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:23:10: value= DOUBLE_QUOTE_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,DOUBLE_QUOTE_STRING,FOLLOW_DOUBLE_QUOTE_STRING_in_expression117); 
                    e=((MyToken)value.getToken()).getExpression();

                    }
                    break;
                case 4 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:24:10: value= HEREDOC_STRING
                    {
                    value=(CommonTree)input.LT(1);
                    match(input,HEREDOC_STRING,FOLLOW_HEREDOC_STRING_in_expression132); 
                    e=((MyToken)value.getToken()).getExpression();

                    }
                    break;
                case 5 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:25:10: ^( '=' lhs= . rhs= expression )
                    {
                    match(input,71,FOLLOW_71_in_expression145); 

                    match(input, Token.DOWN, null); 
                    lhs=(CommonTree)input.LT(1);
                    matchAny(input); 
                    pushFollow(FOLLOW_expression_in_expression153);
                    rhs=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e=new AssignmentExpression(new LocalVariableExpression(lhs.getText(), false), rhs);

                    }
                    break;
                case 6 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:26:10: ^( SHIFT lhs= . rhs= expression )
                    {
                    match(input,SHIFT,FOLLOW_SHIFT_in_expression168); 

                    match(input, Token.DOWN, null); 
                    lhs=(CommonTree)input.LT(1);
                    matchAny(input); 
                    pushFollow(FOLLOW_expression_in_expression176);
                    rhs=expression();
                    _fsp--;


                    match(input, Token.UP, null); 
                    e=new BinaryOperatorExpression("<<", new LocalVariableExpression(lhs.getText(), false), rhs);

                    }
                    break;
                case 7 :
                    // E:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3TreeParser.g:27:10: ID
                    {
                    ID1=(CommonTree)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expression190); 
                    e=new LocalVariableExpression(ID1.getText(), false);

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


 

    public static final BitSet FOLLOW_STATEMENT_LIST_in_program46 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_program51 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_STATEMENT_in_statement68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expression89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_expression103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_in_expression117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_STRING_in_expression132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_expression145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_in_expression168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expression190 = new BitSet(new long[]{0x0000000000000002L});

}