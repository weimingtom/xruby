// $ANTLR 3.0b7 Rubyv3.g 2007-05-29 14:23:21

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import org.antlr.runtime.*;

public class Rubyv3Lexer extends BaseLexer {
    public static final int COMMA=108;
    public static final int LOGICAL_AND_ASSIGN=62;
    public static final int GREATER_THAN=42;
    public static final int MINUS=48;
    public static final int ESCAPE_INT=91;
    public static final int ARRAY=78;
    public static final int HASH=79;
    public static final int HEX_PART=87;
    public static final int LOGICAL_OR=68;
    public static final int LESS_THAN=44;
    public static final int T129=129;
    public static final int META_PART=89;
    public static final int LEADING0_NUMBER=86;
    public static final int BOR=73;
    public static final int LEADING_MARK_DECIMAL=84;
    public static final int BINARY=83;
    public static final int COLON2=110;
    public static final int EMPTY_ARRAY=107;
    public static final int LCURLY=97;
    public static final int CONSTANT=15;
    public static final int LINE_BREAK=35;
    public static final int T114=114;
    public static final int LEFT_SHIFT=12;
    public static final int IF_MODIFIER=29;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int ESCAPE_INT_PART=90;
    public static final int REGEX=80;
    public static final int SYMBOL=17;
    public static final int CONTROL_PART=88;
    public static final int RPAREN=104;
    public static final int T118=118;
    public static final int STAR_ASSIGN=61;
    public static final int DOUBLE_QUOTE_STRING=94;
    public static final int PLUS=47;
    public static final int T117=117;
    public static final int BODY=9;
    public static final int HEREDOC_INDENT_BEGIN=100;
    public static final int UNLESS_MODIFIER=30;
    public static final int CASE_EQUAL=40;
    public static final int MINUS_ASSIGN=55;
    public static final int EXCLUSIVE_RANGE=67;
    public static final int GREATER_OR_EQUAL=43;
    public static final int T113=113;
    public static final int POWER_ASSIGN=64;
    public static final int MOD_ASSIGN=52;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
    public static final int T120=120;
    public static final int T115=115;
    public static final int WS=36;
    public static final int STRING=26;
    public static final int DOUBLE_STRING_CHAR=96;
    public static final int T121=121;
    public static final int RIGHT_SHIFT_ASSIGN=60;
    public static final int NON_LEADING0_NUMBER=92;
    public static final int SINGLE_QUOTE_STRING=93;
    public static final int T123=123;
    public static final int HEREDOC_BEGIN=99;
    public static final int LBRACK=105;
    public static final int SEMI=34;
    public static final int DIV_ASSIGN=54;
    public static final int MRHS=23;
    public static final int BLOCK_ARG=21;
    public static final int EQUAL=39;
    public static final int LOGICAL_AND=69;
    public static final int T119=119;
    public static final int COLON=109;
    public static final int DIV=27;
    public static final int T122=122;
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
    public static final int T116=116;
    public static final int T127=127;
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
    public static final int T124=124;
    public static final int COMPARE=38;
    public static final int T125=125;
    public static final int IF=7;
    public static final int ARG=11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int EOF=-1;
    public static final int T126=126;
    public static final int CALL=10;
    public static final int Tokens=130;
    public static final int RBRACK=106;
    public static final int RESCUE_MODIFIER=33;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BXOR=72;
    public static final int STAR=49;
    public static final int T128=128;
    public static final int NOT=76;
    public static final int SINGLE_STRING_CHAR=95;
    
    
        static final int STR_FUNC_ESCAPE=0x01;
        static final int STR_FUNC_EXPAND=0x02;
        static final int STR_FUNC_REGEXP=0x04;
        static final int STR_FUNC_QWORDS=0x08;
        static final int STR_FUNC_SYMBOL=0x10;
        static final int STR_FUNC_INDENT=0x20;
    
        private final int str_squote = 0;
        private final int str_dquote = STR_FUNC_EXPAND;
        private final int str_xquote = STR_FUNC_EXPAND;
        private final int str_regexp = STR_FUNC_REGEXP | STR_FUNC_ESCAPE | STR_FUNC_EXPAND;
        private final int str_ssym   = STR_FUNC_SYMBOL;
        private final int str_dsym   = STR_FUNC_SYMBOL | STR_FUNC_EXPAND;
        
        public int lex_state = 0;
        public static final int IN_HEREDOC_STRING = 1;
            /** Override this method to change where error messages go */
            public void emitErrorMessage(String msg) {
    		System.err.println(msg);
    	}
    	private Rubyv3Parser parser;
    	public void setParser(Rubyv3Parser parser) {
            this.parser = parser;
            }
            public Rubyv3Parser getParser() {
              return this.parser;
            }
            
            private Expression expression;
            public void reset() {
    		super.reset(); // reset all recognizer state variables
    		expression = null;
    	}
            public Token emit() {
    	    MyToken t =
    	        new MyToken(input, type, channel,
    	                    tokenStartCharIndex, getCharIndex()-1);
    	    t.setLine(tokenStartLine);
    	    t.setText(text);
    	    t.setCharPositionInLine(tokenStartCharPositionInLine);
    	    t.expression = expression;
    	    expression = null; //clear out expression
    	    emit(t);
    	    return t;
           }
           private static final boolean isIdentifierChar(int c) {
            return Character.isLetterOrDigit(c) || c == '_';
           }
            public static int nesting = 0;
    
    	private int determineBegin(int begin) {
            int result = 0; //if collide with EOF, then we can use other value like -3,-7 
            if (begin == '[' || begin == '{' || begin == '(' || begin == '<') {
                result = begin;
            } 
            return result;
            }
            private int determineEnd(int begin) {
                    int end = 0;
                    if(begin == '[') {
                        end = ']';
                    } else if(begin == '{') {
                        end = '}';
                    } else if(begin == '(') {
                        end = ')';
                    } else if(begin == '<'){
                        end = '>';
                    } else {
                        end = begin;
                    }
                    return end;
            }
            
            //hand written lexer matcher
            public Expression mHEREDOC_CONTENT(boolean indent) {
                String delimiter = null;int func = 0;StringBuffer tokens = new StringBuffer();
                expression = null;
                int c= input.LA(1);
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='_' && input.LA(1)<='z') ) {
                        input.consume();
    
                    }
                    else {
                        return expression; //not match heredoc
                    }
    
    
                            int end;
                            if (c == '\'' || c == '"' || c == '`') {
                                if (c == '\'') {
                                    func |= str_squote;
                                } else if (c == '"') {
                                    func |= str_dquote;
                                } else {
                                    func |= str_xquote;
                                }
    
    
                                end = c;
                                while ((c = input.LT(1)) != EOF && c != end) {
                                    tokens.append((char)c);
                                    input.consume();
                                }
                                if (c == EOF) {
                                    throw new SyntaxException("unterminated here document identifier");
                                }
                                input.consume(); //consume the end character.
                            } else {
                                /*if (!isIdentifierChar(c)) {
                                    throw new SyntaxException("shouldn't happen");
                                }*/
    
                                func |= str_dquote;
                                tokens.append((char)c);
                                while(true) {
                                c = input.LT(1);
                                if(c == Token.EOF || !isIdentifierChar(c)) {
                                    break;
                                }
                                tokens.append((char)c);
                                input.consume();
                                }
    
                             } //we already consume the last character.
    
                           expression = new HeredocParser(this.parser, input, func, tokens.toString(), indent).parseString();
                           return expression;
            }

    public Rubyv3Lexer() {;} 
    public Rubyv3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "Rubyv3.g"; }

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // Rubyv3.g:145:8: ( 'begin' )
            // Rubyv3.g:145:8: 'begin'
            {
            match("begin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // Rubyv3.g:146:8: ( 'end' )
            // Rubyv3.g:146:8: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // Rubyv3.g:147:8: ( 'false' )
            // Rubyv3.g:147:8: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // Rubyv3.g:148:8: ( 'nil' )
            // Rubyv3.g:148:8: 'nil'
            {
            match("nil"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // Rubyv3.g:149:8: ( 'true' )
            // Rubyv3.g:149:8: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // Rubyv3.g:150:8: ( 'elsif' )
            // Rubyv3.g:150:8: 'elsif'
            {
            match("elsif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T118

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // Rubyv3.g:151:8: ( 'else' )
            // Rubyv3.g:151:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T119

    // $ANTLR start T120
    public final void mT120() throws RecognitionException {
        try {
            int _type = T120;
            // Rubyv3.g:152:8: ( 'then' )
            // Rubyv3.g:152:8: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T120

    // $ANTLR start T121
    public final void mT121() throws RecognitionException {
        try {
            int _type = T121;
            // Rubyv3.g:153:8: ( 'alias' )
            // Rubyv3.g:153:8: 'alias'
            {
            match("alias"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T121

    // $ANTLR start T122
    public final void mT122() throws RecognitionException {
        try {
            int _type = T122;
            // Rubyv3.g:154:8: ( 'def' )
            // Rubyv3.g:154:8: 'def'
            {
            match("def"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T122

    // $ANTLR start T123
    public final void mT123() throws RecognitionException {
        try {
            int _type = T123;
            // Rubyv3.g:155:8: ( '[]=' )
            // Rubyv3.g:155:8: '[]='
            {
            match("[]="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T123

    // $ANTLR start T124
    public final void mT124() throws RecognitionException {
        try {
            int _type = T124;
            // Rubyv3.g:156:8: ( 'and' )
            // Rubyv3.g:156:8: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T124

    // $ANTLR start T125
    public final void mT125() throws RecognitionException {
        try {
            int _type = T125;
            // Rubyv3.g:157:8: ( 'or' )
            // Rubyv3.g:157:8: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T125

    // $ANTLR start T126
    public final void mT126() throws RecognitionException {
        try {
            int _type = T126;
            // Rubyv3.g:158:8: ( 'not' )
            // Rubyv3.g:158:8: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T126

    // $ANTLR start T127
    public final void mT127() throws RecognitionException {
        try {
            int _type = T127;
            // Rubyv3.g:159:8: ( 'expression0' )
            // Rubyv3.g:159:8: 'expression0'
            {
            match("expression0"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T127

    // $ANTLR start T128
    public final void mT128() throws RecognitionException {
        try {
            int _type = T128;
            // Rubyv3.g:160:8: ( 'expression1' )
            // Rubyv3.g:160:8: 'expression1'
            {
            match("expression1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T128

    // $ANTLR start T129
    public final void mT129() throws RecognitionException {
        try {
            int _type = T129;
            // Rubyv3.g:161:8: ( 'expression2' )
            // Rubyv3.g:161:8: 'expression2'
            {
            match("expression2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T129

    // $ANTLR start IF_MODIFIER
    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // Rubyv3.g:272:20: ( 'if' )
            // Rubyv3.g:272:20: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF_MODIFIER

    // $ANTLR start UNLESS_MODIFIER
    public final void mUNLESS_MODIFIER() throws RecognitionException {
        try {
            int _type = UNLESS_MODIFIER;
            // Rubyv3.g:273:20: ( 'unless' )
            // Rubyv3.g:273:20: 'unless'
            {
            match("unless"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNLESS_MODIFIER

    // $ANTLR start WHILE_MODIFIER
    public final void mWHILE_MODIFIER() throws RecognitionException {
        try {
            int _type = WHILE_MODIFIER;
            // Rubyv3.g:274:20: ( 'while' )
            // Rubyv3.g:274:20: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHILE_MODIFIER

    // $ANTLR start UNTIL_MODIFIER
    public final void mUNTIL_MODIFIER() throws RecognitionException {
        try {
            int _type = UNTIL_MODIFIER;
            // Rubyv3.g:275:20: ( 'until' )
            // Rubyv3.g:275:20: 'until'
            {
            match("until"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UNTIL_MODIFIER

    // $ANTLR start RESCUE_MODIFIER
    public final void mRESCUE_MODIFIER() throws RecognitionException {
        try {
            int _type = RESCUE_MODIFIER;
            // Rubyv3.g:276:20: ( 'resuce' )
            // Rubyv3.g:276:20: 'resuce'
            {
            match("resuce"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RESCUE_MODIFIER

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // Rubyv3.g:278:7: ( ';' )
            // Rubyv3.g:278:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMI

    // $ANTLR start LINE_BREAK
    public final void mLINE_BREAK() throws RecognitionException {
        try {
            int _type = LINE_BREAK;
            // Rubyv3.g:311:3: ( ( '\\r' )? '\\n' )
            // Rubyv3.g:311:3: ( '\\r' )? '\\n'
            {
            // Rubyv3.g:311:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Rubyv3.g:311:3: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_BREAK

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // Rubyv3.g:313:6: ( ( ' ' | '\\t' ) )
            // Rubyv3.g:313:6: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

             skip(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // Rubyv3.g:544:4: ( ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) ) )
            // Rubyv3.g:544:4: ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            {
            // Rubyv3.g:544:4: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Rubyv3.g:544:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Rubyv3.g:545:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt9=2;
                    }
                    break;
                case 'd':
                    {
                    alt9=4;
                    }
                    break;
                case 'b':
                    {
                    alt9=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '_':
                    {
                    alt9=1;
                    }
                    break;
                default:
                    alt9=5;}

            }
            else if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                alt9=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("545:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Rubyv3.g:545:11: OCTAL
                    {
                    mOCTAL(); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:545:17: HEX
                    {
                    mHEX(); 

                    }
                    break;
                case 3 :
                    // Rubyv3.g:545:21: BINARY
                    {
                    mBINARY(); 

                    }
                    break;
                case 4 :
                    // Rubyv3.g:545:28: LEADING_MARK_DECIMAL
                    {
                    mLEADING_MARK_DECIMAL(); 

                    }
                    break;
                case 5 :
                    // Rubyv3.g:546:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    {
                    // Rubyv3.g:546:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='0') ) {
                        alt5=1;
                    }
                    else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("546:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // Rubyv3.g:546:13: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // Rubyv3.g:546:17: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // Rubyv3.g:546:26: ( ( '_' )? '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')||LA4_0=='_') ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // Rubyv3.g:546:27: ( '_' )? '0' .. '9'
                            	    {
                            	    // Rubyv3.g:546:27: ( '_' )?
                            	    int alt3=2;
                            	    int LA3_0 = input.LA(1);

                            	    if ( (LA3_0=='_') ) {
                            	        alt3=1;
                            	    }
                            	    switch (alt3) {
                            	        case 1 :
                            	            // Rubyv3.g:546:27: '_'
                            	            {
                            	            match('_'); 

                            	            }
                            	            break;

                            	    }

                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // Rubyv3.g:546:45: ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.'||LA8_0=='E'||LA8_0=='e') ) {
                        alt8=2;
                    }
                    else {
                        alt8=1;}
                    switch (alt8) {
                        case 1 :
                            // Rubyv3.g:546:55: 
                            {
                            }
                            break;
                        case 2 :
                            // Rubyv3.g:546:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            {
                            // Rubyv3.g:546:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='E'||LA7_0=='e') ) {
                                alt7=1;
                            }
                            else if ( (LA7_0=='.') ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("546:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // Rubyv3.g:546:58: EXP_PART
                                    {
                                    mEXP_PART(); 

                                    }
                                    break;
                                case 2 :
                                    // Rubyv3.g:546:67: '.' LEADING0_NUMBER ( EXP_PART )?
                                    {
                                    if(input.LA(2) < '0' || input.LA(2) > '9') {_type=INT; this.type = INT; return;}
                                    match('.'); 
                                    mLEADING0_NUMBER(); 
                                    // Rubyv3.g:546:170: ( EXP_PART )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // Rubyv3.g:546:170: EXP_PART
                                            {
                                            mEXP_PART(); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            _type = FLOAT;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // Rubyv3.g:550:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( | ( '?' | '!' ) ) )
            // Rubyv3.g:550:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( | ( '?' | '!' ) )
            {
            // Rubyv3.g:550:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt10=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt10=2;
                }
                break;
            case '_':
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("550:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // Rubyv3.g:550:7: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:550:18: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 
                    _type = CONSTANT;

                    }
                    break;
                case 3 :
                    // Rubyv3.g:550:48: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // Rubyv3.g:550:53: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }
                else if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // Rubyv3.g:550:54: ( 'a' .. 'z' | 'A' .. 'Z' )
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // Rubyv3.g:550:78: ( '0' .. '9' )
            	    {
            	    // Rubyv3.g:550:78: ( '0' .. '9' )
            	    // Rubyv3.g:550:79: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // Rubyv3.g:550:91: ( | ( '?' | '!' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='!'||LA12_0=='?') ) {
                alt12=2;
            }
            else {
                alt12=1;}
            switch (alt12) {
                case 1 :
                    // Rubyv3.g:550:101: 
                    {
                    }
                    break;
                case 2 :
                    // Rubyv3.g:550:103: ( '?' | '!' )
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    _type=FID;

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start OCTAL
    public final void mOCTAL() throws RecognitionException {
        try {
            // Rubyv3.g:559:9: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // Rubyv3.g:559:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // Rubyv3.g:559:13: ( '_' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='_') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Rubyv3.g:559:13: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // Rubyv3.g:559:18: ( '0' .. '7' )
            // Rubyv3.g:559:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            // Rubyv3.g:559:29: ( ( '_' )? '0' .. '7' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='7')||LA15_0=='_') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Rubyv3.g:559:30: ( '_' )? '0' .. '7'
            	    {
            	    // Rubyv3.g:559:30: ( '_' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0=='_') ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // Rubyv3.g:559:30: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end OCTAL

    // $ANTLR start LEADING_MARK_DECIMAL
    public final void mLEADING_MARK_DECIMAL() throws RecognitionException {
        try {
            // Rubyv3.g:562:1: ( ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // Rubyv3.g:562:1: ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // Rubyv3.g:562:1: ( '0d' )
            // Rubyv3.g:562:2: '0d'
            {
            match("0d"); 


            }

            // Rubyv3.g:562:8: ( '0' .. '9' )
            // Rubyv3.g:562:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // Rubyv3.g:562:19: ( ( '_' )? '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||LA17_0=='_') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Rubyv3.g:562:20: ( '_' )? '0' .. '9'
            	    {
            	    // Rubyv3.g:562:20: ( '_' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='_') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // Rubyv3.g:562:20: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end LEADING_MARK_DECIMAL

    // $ANTLR start HEX
    public final void mHEX() throws RecognitionException {
        try {
            // Rubyv3.g:564:7: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // Rubyv3.g:564:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // Rubyv3.g:564:21: ( ( '_' )? HEX_PART )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='f')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Rubyv3.g:564:22: ( '_' )? HEX_PART
            	    {
            	    // Rubyv3.g:564:22: ( '_' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0=='_') ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // Rubyv3.g:564:22: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mHEX_PART(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end HEX

    // $ANTLR start HEX_PART
    public final void mHEX_PART() throws RecognitionException {
        try {
            // Rubyv3.g:567:4: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Rubyv3.g:567:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HEX_PART

    // $ANTLR start BINARY
    public final void mBINARY() throws RecognitionException {
        try {
            // Rubyv3.g:571:10: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // Rubyv3.g:571:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // Rubyv3.g:571:14: ( '0' .. '1' )
            // Rubyv3.g:571:15: '0' .. '1'
            {
            matchRange('0','1'); 

            }

            // Rubyv3.g:571:25: ( ( '_' )? '0' .. '1' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='1')||LA21_0=='_') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Rubyv3.g:571:26: ( '_' )? '0' .. '1'
            	    {
            	    // Rubyv3.g:571:26: ( '_' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0=='_') ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // Rubyv3.g:571:26: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','1'); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end BINARY

    // $ANTLR start ESCAPE_INT
    public final void mESCAPE_INT() throws RecognitionException {
        try {
            // Rubyv3.g:575:23: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // Rubyv3.g:575:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // Rubyv3.g:575:23: ( CONTROL_PART | META_PART )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='M') ) {
                        alt22=2;
                    }
                    else if ( (LA22_1=='C'||LA22_1=='c') ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // Rubyv3.g:575:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 

            	    }
            	    break;
            	case 2 :
            	    // Rubyv3.g:575:37: META_PART
            	    {
            	    mMETA_PART(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // Rubyv3.g:575:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\\') ) {
                int LA23_1 = input.LA(2);

                if ( ((LA23_1>='\u0000' && LA23_1<='B')||(LA23_1>='D' && LA23_1<='L')||(LA23_1>='N' && LA23_1<='b')||(LA23_1>='d' && LA23_1<='\uFFFE')) ) {
                    alt23=3;
                }
                else {
                    alt23=1;}
            }
            else if ( ((LA23_0>='\u0093' && LA23_0<='\u0255')) ) {
                alt23=2;
            }
            else if ( ((LA23_0>='\u0000' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\u0091')) ) {
                alt23=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("575:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // Rubyv3.g:575:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:575:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 

                    }
                    break;
                case 3 :
                    // Rubyv3.g:575:94: ESCAPE_INT_PART
                    {
                    mESCAPE_INT_PART(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ESCAPE_INT

    // $ANTLR start CONTROL_PART
    public final void mCONTROL_PART() throws RecognitionException {
        try {
            // Rubyv3.g:579:4: ( ( '\\\\C-' | '\\\\c' ) )
            // Rubyv3.g:579:4: ( '\\\\C-' | '\\\\c' )
            {
            // Rubyv3.g:579:4: ( '\\\\C-' | '\\\\c' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\\') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='c') ) {
                    alt24=2;
                }
                else if ( (LA24_1=='C') ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("579:4: ( '\\\\C-' | '\\\\c' )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("579:4: ( '\\\\C-' | '\\\\c' )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // Rubyv3.g:579:5: '\\\\C-'
                    {
                    match("\\C-"); 


                    }
                    break;
                case 2 :
                    // Rubyv3.g:579:12: '\\\\c'
                    {
                    match("\\c"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end CONTROL_PART

    // $ANTLR start META_PART
    public final void mMETA_PART() throws RecognitionException {
        try {
            // Rubyv3.g:583:4: ( '\\\\M-' )
            // Rubyv3.g:583:4: '\\\\M-'
            {
            match("\\M-"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end META_PART

    // $ANTLR start NON_LEADING0_NUMBER
    public final void mNON_LEADING0_NUMBER() throws RecognitionException {
        try {
            // Rubyv3.g:588:3: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // Rubyv3.g:588:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // Rubyv3.g:588:3: ( '1' .. '9' )
            // Rubyv3.g:588:4: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // Rubyv3.g:588:14: ( ( '_' )? '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||LA26_0=='_') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Rubyv3.g:588:15: ( '_' )? '0' .. '9'
            	    {
            	    // Rubyv3.g:588:15: ( '_' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0=='_') ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // Rubyv3.g:588:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end NON_LEADING0_NUMBER

    // $ANTLR start LEADING0_NUMBER
    public final void mLEADING0_NUMBER() throws RecognitionException {
        try {
            // Rubyv3.g:591:3: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // Rubyv3.g:591:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // Rubyv3.g:591:3: ( '0' .. '9' )
            // Rubyv3.g:591:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // Rubyv3.g:591:14: ( ( '_' )? '0' .. '9' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||LA28_0=='_') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Rubyv3.g:591:15: ( '_' )? '0' .. '9'
            	    {
            	    // Rubyv3.g:591:15: ( '_' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0=='_') ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // Rubyv3.g:591:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end LEADING0_NUMBER

    // $ANTLR start EXP_PART
    public final void mEXP_PART() throws RecognitionException {
        try {
            // Rubyv3.g:593:11: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // Rubyv3.g:593:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // Rubyv3.g:593:23: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='-') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Rubyv3.g:593:23: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mLEADING0_NUMBER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end EXP_PART

    // $ANTLR start SINGLE_QUOTE_STRING
    public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE_STRING;
            int end=0; int nested=0;
            // Rubyv3.g:598:35: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\'') ) {
                alt32=1;
            }
            else if ( (LA32_0=='%') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("597:1: SINGLE_QUOTE_STRING : ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // Rubyv3.g:598:35: '\\'' ( SINGLE_STRING_CHAR )* '\\''
                    {
                    match('\''); 
                    // Rubyv3.g:598:40: ( SINGLE_STRING_CHAR )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>='\u0000' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='\uFFFE')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Rubyv3.g:598:40: SINGLE_STRING_CHAR
                    	    {
                    	    mSINGLE_STRING_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:599:4: '%q' begin= . (tmp= . )*
                    {
                    match("%q"); 

                    int begin = input.LA(1);
                    matchAny(); 
                    System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
                    // Rubyv3.g:599:103: (tmp= . )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>='\u0000' && LA31_0<='\uFFFE')) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Rubyv3.g:599:104: tmp= .
                    	    {
                    	    int tmp = input.LA(1);
                    	    matchAny(); 
                    	    System.out.println(tmp);
                    	    	                    if(tmp == EOF) {
                    	    	                      throw new SyntaxException("unterminated string meets end of file");
                    	    	                    } else if(tmp == '\\') {
                    	    	                      int c = input.LA(1);
                    	    	                      if(c == EOF) {
                    	    	                         throw new SyntaxException("unterminated string meets end of file");
                    	    	                      } else if (c == begin || c == end || c == '\\') {
                    	    	                         //tokens.add();
                    	    	                         input.consume();
                    	    	                      }
                    	    	                    }else if(tmp==begin) {
                    	                                    nested ++;
                    	                                } else if(tmp==end)  {
                    	                                    
                    	                                    if(nested == 0) {
                    	                                    this.type=SINGLE_QUOTE_STRING;
                    	                                    return;
                    	                                    }
                    	                                    nested --;
                    	                                }
                    	                                

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SINGLE_QUOTE_STRING

    // $ANTLR start SINGLE_STRING_CHAR
    public final void mSINGLE_STRING_CHAR() throws RecognitionException {
        try {
            // Rubyv3.g:623:6: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\\') ) {
                alt33=1;
            }
            else if ( ((LA33_0>='\u0000' && LA33_0<='&')||(LA33_0>='(' && LA33_0<='[')||(LA33_0>=']' && LA33_0<='\uFFFE')) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("621:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // Rubyv3.g:623:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:623:15: ~ ( '\\\\' | '\\'' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end SINGLE_STRING_CHAR

    // $ANTLR start DOUBLE_STRING_CHAR
    public final void mDOUBLE_STRING_CHAR() throws RecognitionException {
        try {
            // Rubyv3.g:626:4: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\\') ) {
                alt34=1;
            }
            else if ( ((LA34_0>='\u0000' && LA34_0<='!')||(LA34_0>='#' && LA34_0<='[')||(LA34_0>=']' && LA34_0<='\uFFFE')) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("624:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // Rubyv3.g:626:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // Rubyv3.g:626:13: ~ ( '\\\\' | '\"' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_STRING_CHAR

    // $ANTLR start DOUBLE_QUOTE_STRING
    public final void mDOUBLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE_STRING;
            int end=0; int nested=0;
            // Rubyv3.g:628:35: (s= ( '\"' | '%Q' begin= . ) )
            // Rubyv3.g:628:35: s= ( '\"' | '%Q' begin= . )
            {
            // Rubyv3.g:628:37: ( '\"' | '%Q' begin= . )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\"') ) {
                alt35=1;
            }
            else if ( (LA35_0=='%') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("628:37: ( '\"' | '%Q' begin= . )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // Rubyv3.g:628:38: '\"'
                    {
                    match('\"'); 
                    expression = new DoubleStringParser(this.parser, input, '"', 0).parseString();

                    }
                    break;
                case 2 :
                    // Rubyv3.g:628:126: '%Q' begin= .
                    {
                    match("%Q"); 

                    int begin = input.LA(1);
                    matchAny(); 
                    end=determineEnd(begin);begin=determineBegin(begin); 
                    	expression = new DoubleStringParser(this.parser, input, end, begin).parseString(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_QUOTE_STRING

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // Rubyv3.g:632:11: ( '{' )
            // Rubyv3.g:632:11: '{'
            {
            match('{'); 
            nesting++; System.out.println("meeting LCURLY with nesting:" + nesting);

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // Rubyv3.g:638:11: ( '}' )
            // Rubyv3.g:638:11: '}'
            {
            match('}'); 
            
                      if ( nesting<=0 ) {
                            token=Token.EOF_TOKEN;
                            System.out.println("exiting embedded simple with nesting:" + nesting);
                      }
                      else {
                            nesting--;
                      }
                      

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start ESCAPE_INT_PART
    public final void mESCAPE_INT_PART() throws RecognitionException {
        try {
            // Rubyv3.g:651:4: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\\') ) {
                int LA38_1 = input.LA(2);

                if ( ((LA38_1>='\u0000' && LA38_1<='/')||(LA38_1>='8' && LA38_1<='B')||(LA38_1>='D' && LA38_1<='L')||(LA38_1>='N' && LA38_1<='b')||(LA38_1>='d' && LA38_1<='w')||(LA38_1>='y' && LA38_1<='\uFFFE')) ) {
                    alt38=3;
                }
                else if ( (LA38_1=='x') ) {
                    alt38=2;
                }
                else if ( ((LA38_1>='0' && LA38_1<='7')) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("649:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("649:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // Rubyv3.g:651:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // Rubyv3.g:651:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt36=3;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>='0' && LA36_0<='7')) ) {
                        int LA36_1 = input.LA(2);

                        if ( ((LA36_1>='0' && LA36_1<='7')) ) {
                            int LA36_2 = input.LA(3);

                            if ( ((LA36_2>='0' && LA36_2<='7')) ) {
                                alt36=3;
                            }
                            else {
                                alt36=2;}
                        }
                        else {
                            alt36=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("651:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // Rubyv3.g:651:10: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;
                        case 2 :
                            // Rubyv3.g:651:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;
                        case 3 :
                            // Rubyv3.g:651:41: '0' .. '7' '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Rubyv3.g:652:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // Rubyv3.g:652:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='F')||(LA37_0>='a' && LA37_0<='f')) ) {
                        int LA37_1 = input.LA(2);

                        if ( ((LA37_1>='0' && LA37_1<='9')||(LA37_1>='A' && LA37_1<='F')||(LA37_1>='a' && LA37_1<='f')) ) {
                            alt37=2;
                        }
                        else {
                            alt37=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("652:19: ( HEX_PART | HEX_PART HEX_PART )", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // Rubyv3.g:652:20: HEX_PART
                            {
                            mHEX_PART(); 

                            }
                            break;
                        case 2 :
                            // Rubyv3.g:652:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Rubyv3.g:653:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
                    {
                    match('\\'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='/')||(input.LA(1)>='8' && input.LA(1)<='B')||(input.LA(1)>='D' && input.LA(1)<='L')||(input.LA(1)>='N' && input.LA(1)<='b')||(input.LA(1)>='d' && input.LA(1)<='w')||(input.LA(1)>='y' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end ESCAPE_INT_PART

    // $ANTLR start HEREDOC_BEGIN
    public final void mHEREDOC_BEGIN() throws RecognitionException {
        try {
            int _type = HEREDOC_BEGIN;
            // Rubyv3.g:657:4: ( '<<' )
            // Rubyv3.g:657:4: '<<'
            {
            match("<<"); 

            if(Character.isWhitespace(input.LT(1))) {_type = LEFT_SHIFT;}

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEREDOC_BEGIN

    // $ANTLR start HEREDOC_INDENT_BEGIN
    public final void mHEREDOC_INDENT_BEGIN() throws RecognitionException {
        try {
            int _type = HEREDOC_INDENT_BEGIN;
            // Rubyv3.g:660:4: ( '<<-' )
            // Rubyv3.g:660:4: '<<-'
            {
            match("<<-"); 

            if(Character.isWhitespace(input.LT(1))) {_type = LEFT_SHIFT;}

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEREDOC_INDENT_BEGIN

    // $ANTLR start ARRAY
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            // Rubyv3.g:665:9: ( '[]' )
            // Rubyv3.g:665:9: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARRAY

    // $ANTLR start HASH
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            // Rubyv3.g:666:8: ( '{}' )
            // Rubyv3.g:666:8: '{}'
            {
            match("{}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HASH

    // $ANTLR start REGEX
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            // Rubyv3.g:667:9: ( '/abc/' )
            // Rubyv3.g:667:9: '/abc/'
            {
            match("/abc/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REGEX

    // $ANTLR start SYMBOL
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            // Rubyv3.g:668:10: ( ':abc' )
            // Rubyv3.g:668:10: ':abc'
            {
            match(":abc"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SYMBOL

    // $ANTLR start ASSIGN
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            // Rubyv3.g:670:27: ( '=' )
            // Rubyv3.g:670:27: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSIGN

    // $ANTLR start PLUS_ASSIGN
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            // Rubyv3.g:671:17: ( '+=' )
            // Rubyv3.g:671:17: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS_ASSIGN

    // $ANTLR start MINUS_ASSIGN
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            // Rubyv3.g:672:17: ( '-=' )
            // Rubyv3.g:672:17: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS_ASSIGN

    // $ANTLR start STAR_ASSIGN
    public final void mSTAR_ASSIGN() throws RecognitionException {
        try {
            int _type = STAR_ASSIGN;
            // Rubyv3.g:673:17: ( '*=' )
            // Rubyv3.g:673:17: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR_ASSIGN

    // $ANTLR start DIV_ASSIGN
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            // Rubyv3.g:674:15: ( '/=' )
            // Rubyv3.g:674:15: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV_ASSIGN

    // $ANTLR start MOD_ASSIGN
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            // Rubyv3.g:675:15: ( '%=' )
            // Rubyv3.g:675:15: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD_ASSIGN

    // $ANTLR start COMPLEMENT_ASSIGN
    public final void mCOMPLEMENT_ASSIGN() throws RecognitionException {
        try {
            int _type = COMPLEMENT_ASSIGN;
            // Rubyv3.g:676:25: ( '~=' )
            // Rubyv3.g:676:25: '~='
            {
            match("~="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMPLEMENT_ASSIGN

    // $ANTLR start POWER_ASSIGN
    public final void mPOWER_ASSIGN() throws RecognitionException {
        try {
            int _type = POWER_ASSIGN;
            // Rubyv3.g:677:17: ( '**=' )
            // Rubyv3.g:677:17: '**='
            {
            match("**="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POWER_ASSIGN

    // $ANTLR start BAND_ASSIGN
    public final void mBAND_ASSIGN() throws RecognitionException {
        try {
            int _type = BAND_ASSIGN;
            // Rubyv3.g:678:17: ( '&=' )
            // Rubyv3.g:678:17: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BAND_ASSIGN

    // $ANTLR start BXOR_ASSIGN
    public final void mBXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BXOR_ASSIGN;
            // Rubyv3.g:679:17: ( '^=' )
            // Rubyv3.g:679:17: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BXOR_ASSIGN

    // $ANTLR start BOR_ASSIGN
    public final void mBOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BOR_ASSIGN;
            // Rubyv3.g:680:16: ( '|=' )
            // Rubyv3.g:680:16: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOR_ASSIGN

    // $ANTLR start LEFT_SHIFT_ASSIGN
    public final void mLEFT_SHIFT_ASSIGN() throws RecognitionException {
        try {
            int _type = LEFT_SHIFT_ASSIGN;
            // Rubyv3.g:681:21: ( '<<=' )
            // Rubyv3.g:681:21: '<<='
            {
            match("<<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFT_SHIFT_ASSIGN

    // $ANTLR start RIGHT_SHIFT_ASSIGN
    public final void mRIGHT_SHIFT_ASSIGN() throws RecognitionException {
        try {
            int _type = RIGHT_SHIFT_ASSIGN;
            // Rubyv3.g:682:22: ( '>>=' )
            // Rubyv3.g:682:22: '>>='
            {
            match(">>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_SHIFT_ASSIGN

    // $ANTLR start LOGICAL_AND_ASSIGN
    public final void mLOGICAL_AND_ASSIGN() throws RecognitionException {
        try {
            int _type = LOGICAL_AND_ASSIGN;
            // Rubyv3.g:683:22: ( '&&=' )
            // Rubyv3.g:683:22: '&&='
            {
            match("&&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_AND_ASSIGN

    // $ANTLR start LOGICAL_OR_ASSIGN
    public final void mLOGICAL_OR_ASSIGN() throws RecognitionException {
        try {
            int _type = LOGICAL_OR_ASSIGN;
            // Rubyv3.g:684:21: ( '||=' )
            // Rubyv3.g:684:21: '||='
            {
            match("||="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_OR_ASSIGN

    // $ANTLR start INCLUSIVE_RANGE
    public final void mINCLUSIVE_RANGE() throws RecognitionException {
        try {
            int _type = INCLUSIVE_RANGE;
            // Rubyv3.g:685:23: ( '..' )
            // Rubyv3.g:685:23: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INCLUSIVE_RANGE

    // $ANTLR start EXCLUSIVE_RANGE
    public final void mEXCLUSIVE_RANGE() throws RecognitionException {
        try {
            int _type = EXCLUSIVE_RANGE;
            // Rubyv3.g:686:23: ( '...' )
            // Rubyv3.g:686:23: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXCLUSIVE_RANGE

    // $ANTLR start ASSOC
    public final void mASSOC() throws RecognitionException {
        try {
            int _type = ASSOC;
            // Rubyv3.g:688:12: ( '=>' )
            // Rubyv3.g:688:12: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASSOC

    // $ANTLR start LOGICAL_AND
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            // Rubyv3.g:689:17: ( '&&' )
            // Rubyv3.g:689:17: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_AND

    // $ANTLR start LOGICAL_OR
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            // Rubyv3.g:690:16: ( '||' )
            // Rubyv3.g:690:16: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LOGICAL_OR

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // Rubyv3.g:692:14: ( '?' )
            // Rubyv3.g:692:14: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // Rubyv3.g:693:13: ( '(' )
            // Rubyv3.g:693:13: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // Rubyv3.g:694:13: ( ')' )
            // Rubyv3.g:694:13: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LBRACK
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            // Rubyv3.g:695:13: ( '[' )
            // Rubyv3.g:695:13: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRACK

    // $ANTLR start RBRACK
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            // Rubyv3.g:696:13: ( ']' )
            // Rubyv3.g:696:13: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRACK

    // $ANTLR start EMPTY_ARRAY
    public final void mEMPTY_ARRAY() throws RecognitionException {
        try {
            int _type = EMPTY_ARRAY;
            // Rubyv3.g:697:16: ( '[]' )
            // Rubyv3.g:697:16: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EMPTY_ARRAY

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // Rubyv3.g:700:12: ( ',' )
            // Rubyv3.g:700:12: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // Rubyv3.g:701:12: ( ':' )
            // Rubyv3.g:701:12: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COLON2
    public final void mCOLON2() throws RecognitionException {
        try {
            int _type = COLON2;
            // Rubyv3.g:702:13: ( '::' )
            // Rubyv3.g:702:13: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON2

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            // Rubyv3.g:704:11: ( '!' )
            // Rubyv3.g:704:11: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start BNOT
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            // Rubyv3.g:705:11: ( '~' )
            // Rubyv3.g:705:11: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BNOT

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // Rubyv3.g:706:10: ( '/' )
            // Rubyv3.g:706:10: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // Rubyv3.g:707:11: ( '+' )
            // Rubyv3.g:707:11: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // Rubyv3.g:708:12: ( '-' )
            // Rubyv3.g:708:12: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // Rubyv3.g:709:10: ( '%' )
            // Rubyv3.g:709:10: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // Rubyv3.g:710:11: ( '*' )
            // Rubyv3.g:710:11: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start LESS_THAN
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            // Rubyv3.g:711:15: ( '<' )
            // Rubyv3.g:711:15: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS_THAN

    // $ANTLR start GREATER_THAN
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            // Rubyv3.g:712:17: ( '>' )
            // Rubyv3.g:712:17: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER_THAN

    // $ANTLR start BXOR
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            // Rubyv3.g:713:11: ( '^' )
            // Rubyv3.g:713:11: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BXOR

    // $ANTLR start BOR
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            // Rubyv3.g:714:11: ( '|' )
            // Rubyv3.g:714:11: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOR

    // $ANTLR start BAND
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            // Rubyv3.g:715:11: ( '&' )
            // Rubyv3.g:715:11: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BAND

    // $ANTLR start POWER
    public final void mPOWER() throws RecognitionException {
        try {
            int _type = POWER;
            // Rubyv3.g:716:12: ( '**' )
            // Rubyv3.g:716:12: '**'
            {
            match("**"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POWER

    // $ANTLR start COMPARE
    public final void mCOMPARE() throws RecognitionException {
        try {
            int _type = COMPARE;
            // Rubyv3.g:717:14: ( '<=>' )
            // Rubyv3.g:717:14: '<=>'
            {
            match("<=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMPARE

    // $ANTLR start GREATER_OR_EQUAL
    public final void mGREATER_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQUAL;
            // Rubyv3.g:718:20: ( '>=' )
            // Rubyv3.g:718:20: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER_OR_EQUAL

    // $ANTLR start LESS_OR_EQUAL
    public final void mLESS_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_OR_EQUAL;
            // Rubyv3.g:719:18: ( '<=' )
            // Rubyv3.g:719:18: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS_OR_EQUAL

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // Rubyv3.g:720:12: ( '==' )
            // Rubyv3.g:720:12: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start CASE_EQUAL
    public final void mCASE_EQUAL() throws RecognitionException {
        try {
            int _type = CASE_EQUAL;
            // Rubyv3.g:721:16: ( '===' )
            // Rubyv3.g:721:16: '==='
            {
            match("==="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CASE_EQUAL

    // $ANTLR start NOT_EQUAL
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            // Rubyv3.g:722:15: ( '!=' )
            // Rubyv3.g:722:15: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_EQUAL

    // $ANTLR start MATCH
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            // Rubyv3.g:723:12: ( '=~' )
            // Rubyv3.g:723:12: '=~'
            {
            match("=~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MATCH

    // $ANTLR start NOT_MATCH
    public final void mNOT_MATCH() throws RecognitionException {
        try {
            int _type = NOT_MATCH;
            // Rubyv3.g:724:15: ( '!~' )
            // Rubyv3.g:724:15: '!~'
            {
            match("!~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_MATCH

    // $ANTLR start RIGHT_SHIFT
    public final void mRIGHT_SHIFT() throws RecognitionException {
        try {
            int _type = RIGHT_SHIFT;
            // Rubyv3.g:726:17: ( '>>' )
            // Rubyv3.g:726:17: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_SHIFT

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // Rubyv3.g:729:5: ( '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK )
            // Rubyv3.g:729:5: '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK
            {
            match('#'); 
            mANYTHING_OTHER_THAN_LINE_FEED(); 
            mLINE_BREAK(); 
            
            				skip();
            			

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start ANYTHING_OTHER_THAN_LINE_FEED
    public final void mANYTHING_OTHER_THAN_LINE_FEED() throws RecognitionException {
        try {
            // Rubyv3.g:736:5: ( (~ ( '\\r' | '\\n' ) )* )
            // Rubyv3.g:736:5: (~ ( '\\r' | '\\n' ) )*
            {
            // Rubyv3.g:736:5: (~ ( '\\r' | '\\n' ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\u0000' && LA39_0<='\t')||(LA39_0>='\u000B' && LA39_0<='\f')||(LA39_0>='\u000E' && LA39_0<='\uFFFE')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Rubyv3.g:736:6: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end ANYTHING_OTHER_THAN_LINE_FEED

    public void mTokens() throws RecognitionException {
        // Rubyv3.g:1:10: ( T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT )
        int alt40=89;
        switch ( input.LA(1) ) {
        case 'b':
            {
            int LA40_1 = input.LA(2);

            if ( (LA40_1=='e') ) {
                int LA40_44 = input.LA(3);

                if ( (LA40_44=='g') ) {
                    int LA40_104 = input.LA(4);

                    if ( (LA40_104=='i') ) {
                        int LA40_141 = input.LA(5);

                        if ( (LA40_141=='n') ) {
                            int LA40_158 = input.LA(6);

                            if ( (LA40_158=='!'||(LA40_158>='0' && LA40_158<='9')||LA40_158=='?'||(LA40_158>='A' && LA40_158<='Z')||(LA40_158>='a' && LA40_158<='z')) ) {
                                alt40=27;
                            }
                            else {
                                alt40=1;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
            }
            else {
                alt40=27;}
            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA40_45 = input.LA(3);

                if ( (LA40_45=='s') ) {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA40_142 = input.LA(5);

                        if ( (LA40_142=='!'||(LA40_142>='0' && LA40_142<='9')||LA40_142=='?'||(LA40_142>='A' && LA40_142<='Z')||(LA40_142>='a' && LA40_142<='z')) ) {
                            alt40=27;
                        }
                        else {
                            alt40=7;}
                        }
                        break;
                    case 'i':
                        {
                        int LA40_143 = input.LA(5);

                        if ( (LA40_143=='f') ) {
                            int LA40_160 = input.LA(6);

                            if ( (LA40_160=='!'||(LA40_160>='0' && LA40_160<='9')||LA40_160=='?'||(LA40_160>='A' && LA40_160<='Z')||(LA40_160>='a' && LA40_160<='z')) ) {
                                alt40=27;
                            }
                            else {
                                alt40=6;}
                        }
                        else {
                            alt40=27;}
                        }
                        break;
                    default:
                        alt40=27;}

                }
                else {
                    alt40=27;}
                }
                break;
            case 'x':
                {
                int LA40_46 = input.LA(3);

                if ( (LA40_46=='p') ) {
                    int LA40_106 = input.LA(4);

                    if ( (LA40_106=='r') ) {
                        int LA40_144 = input.LA(5);

                        if ( (LA40_144=='e') ) {
                            int LA40_161 = input.LA(6);

                            if ( (LA40_161=='s') ) {
                                int LA40_172 = input.LA(7);

                                if ( (LA40_172=='s') ) {
                                    int LA40_179 = input.LA(8);

                                    if ( (LA40_179=='i') ) {
                                        int LA40_182 = input.LA(9);

                                        if ( (LA40_182=='o') ) {
                                            int LA40_183 = input.LA(10);

                                            if ( (LA40_183=='n') ) {
                                                switch ( input.LA(11) ) {
                                                case '2':
                                                    {
                                                    int LA40_185 = input.LA(12);

                                                    if ( (LA40_185=='!'||(LA40_185>='0' && LA40_185<='9')||LA40_185=='?'||(LA40_185>='A' && LA40_185<='Z')||(LA40_185>='a' && LA40_185<='z')) ) {
                                                        alt40=27;
                                                    }
                                                    else {
                                                        alt40=17;}
                                                    }
                                                    break;
                                                case '0':
                                                    {
                                                    int LA40_186 = input.LA(12);

                                                    if ( (LA40_186=='!'||(LA40_186>='0' && LA40_186<='9')||LA40_186=='?'||(LA40_186>='A' && LA40_186<='Z')||(LA40_186>='a' && LA40_186<='z')) ) {
                                                        alt40=27;
                                                    }
                                                    else {
                                                        alt40=15;}
                                                    }
                                                    break;
                                                case '1':
                                                    {
                                                    int LA40_187 = input.LA(12);

                                                    if ( (LA40_187=='!'||(LA40_187>='0' && LA40_187<='9')||LA40_187=='?'||(LA40_187>='A' && LA40_187<='Z')||(LA40_187>='a' && LA40_187<='z')) ) {
                                                        alt40=27;
                                                    }
                                                    else {
                                                        alt40=16;}
                                                    }
                                                    break;
                                                default:
                                                    alt40=27;}

                                            }
                                            else {
                                                alt40=27;}
                                        }
                                        else {
                                            alt40=27;}
                                    }
                                    else {
                                        alt40=27;}
                                }
                                else {
                                    alt40=27;}
                            }
                            else {
                                alt40=27;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
                }
                break;
            case 'n':
                {
                int LA40_47 = input.LA(3);

                if ( (LA40_47=='d') ) {
                    int LA40_107 = input.LA(4);

                    if ( (LA40_107=='!'||(LA40_107>='0' && LA40_107<='9')||LA40_107=='?'||(LA40_107>='A' && LA40_107<='Z')||(LA40_107>='a' && LA40_107<='z')) ) {
                        alt40=27;
                    }
                    else {
                        alt40=2;}
                }
                else {
                    alt40=27;}
                }
                break;
            default:
                alt40=27;}

            }
            break;
        case 'f':
            {
            int LA40_3 = input.LA(2);

            if ( (LA40_3=='a') ) {
                int LA40_48 = input.LA(3);

                if ( (LA40_48=='l') ) {
                    int LA40_108 = input.LA(4);

                    if ( (LA40_108=='s') ) {
                        int LA40_146 = input.LA(5);

                        if ( (LA40_146=='e') ) {
                            int LA40_162 = input.LA(6);

                            if ( (LA40_162=='!'||(LA40_162>='0' && LA40_162<='9')||LA40_162=='?'||(LA40_162>='A' && LA40_162<='Z')||(LA40_162>='a' && LA40_162<='z')) ) {
                                alt40=27;
                            }
                            else {
                                alt40=3;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
            }
            else {
                alt40=27;}
            }
            break;
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA40_49 = input.LA(3);

                if ( (LA40_49=='t') ) {
                    int LA40_109 = input.LA(4);

                    if ( (LA40_109=='!'||(LA40_109>='0' && LA40_109<='9')||LA40_109=='?'||(LA40_109>='A' && LA40_109<='Z')||(LA40_109>='a' && LA40_109<='z')) ) {
                        alt40=27;
                    }
                    else {
                        alt40=14;}
                }
                else {
                    alt40=27;}
                }
                break;
            case 'i':
                {
                int LA40_50 = input.LA(3);

                if ( (LA40_50=='l') ) {
                    int LA40_110 = input.LA(4);

                    if ( (LA40_110=='!'||(LA40_110>='0' && LA40_110<='9')||LA40_110=='?'||(LA40_110>='A' && LA40_110<='Z')||(LA40_110>='a' && LA40_110<='z')) ) {
                        alt40=27;
                    }
                    else {
                        alt40=4;}
                }
                else {
                    alt40=27;}
                }
                break;
            default:
                alt40=27;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA40_51 = input.LA(3);

                if ( (LA40_51=='u') ) {
                    int LA40_111 = input.LA(4);

                    if ( (LA40_111=='e') ) {
                        int LA40_149 = input.LA(5);

                        if ( (LA40_149=='!'||(LA40_149>='0' && LA40_149<='9')||LA40_149=='?'||(LA40_149>='A' && LA40_149<='Z')||(LA40_149>='a' && LA40_149<='z')) ) {
                            alt40=27;
                        }
                        else {
                            alt40=5;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
                }
                break;
            case 'h':
                {
                int LA40_52 = input.LA(3);

                if ( (LA40_52=='e') ) {
                    int LA40_112 = input.LA(4);

                    if ( (LA40_112=='n') ) {
                        int LA40_150 = input.LA(5);

                        if ( (LA40_150=='!'||(LA40_150>='0' && LA40_150<='9')||LA40_150=='?'||(LA40_150>='A' && LA40_150<='Z')||(LA40_150>='a' && LA40_150<='z')) ) {
                            alt40=27;
                        }
                        else {
                            alt40=8;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
                }
                break;
            default:
                alt40=27;}

            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA40_53 = input.LA(3);

                if ( (LA40_53=='i') ) {
                    int LA40_113 = input.LA(4);

                    if ( (LA40_113=='a') ) {
                        int LA40_151 = input.LA(5);

                        if ( (LA40_151=='s') ) {
                            int LA40_165 = input.LA(6);

                            if ( (LA40_165=='!'||(LA40_165>='0' && LA40_165<='9')||LA40_165=='?'||(LA40_165>='A' && LA40_165<='Z')||(LA40_165>='a' && LA40_165<='z')) ) {
                                alt40=27;
                            }
                            else {
                                alt40=9;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
                }
                break;
            case 'n':
                {
                int LA40_54 = input.LA(3);

                if ( (LA40_54=='d') ) {
                    int LA40_114 = input.LA(4);

                    if ( (LA40_114=='!'||(LA40_114>='0' && LA40_114<='9')||LA40_114=='?'||(LA40_114>='A' && LA40_114<='Z')||(LA40_114>='a' && LA40_114<='z')) ) {
                        alt40=27;
                    }
                    else {
                        alt40=12;}
                }
                else {
                    alt40=27;}
                }
                break;
            default:
                alt40=27;}

            }
            break;
        case 'd':
            {
            int LA40_7 = input.LA(2);

            if ( (LA40_7=='e') ) {
                int LA40_55 = input.LA(3);

                if ( (LA40_55=='f') ) {
                    int LA40_115 = input.LA(4);

                    if ( (LA40_115=='!'||(LA40_115>='0' && LA40_115<='9')||LA40_115=='?'||(LA40_115>='A' && LA40_115<='Z')||(LA40_115>='a' && LA40_115<='z')) ) {
                        alt40=27;
                    }
                    else {
                        alt40=10;}
                }
                else {
                    alt40=27;}
            }
            else {
                alt40=27;}
            }
            break;
        case '[':
            {
            int LA40_8 = input.LA(2);

            if ( (LA40_8==']') ) {
                int LA40_56 = input.LA(3);

                if ( (LA40_56=='=') ) {
                    alt40=11;
                }
                else {
                    alt40=34;}
            }
            else {
                alt40=61;}
            }
            break;
        case 'o':
            {
            int LA40_9 = input.LA(2);

            if ( (LA40_9=='r') ) {
                int LA40_58 = input.LA(3);

                if ( (LA40_58=='!'||(LA40_58>='0' && LA40_58<='9')||LA40_58=='?'||(LA40_58>='A' && LA40_58<='Z')||(LA40_58>='a' && LA40_58<='z')) ) {
                    alt40=27;
                }
                else {
                    alt40=13;}
            }
            else {
                alt40=27;}
            }
            break;
        case 'i':
            {
            int LA40_10 = input.LA(2);

            if ( (LA40_10=='f') ) {
                int LA40_59 = input.LA(3);

                if ( (LA40_59=='!'||(LA40_59>='0' && LA40_59<='9')||LA40_59=='?'||(LA40_59>='A' && LA40_59<='Z')||(LA40_59>='a' && LA40_59<='z')) ) {
                    alt40=27;
                }
                else {
                    alt40=18;}
            }
            else {
                alt40=27;}
            }
            break;
        case 'u':
            {
            int LA40_11 = input.LA(2);

            if ( (LA40_11=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA40_120 = input.LA(4);

                    if ( (LA40_120=='i') ) {
                        int LA40_154 = input.LA(5);

                        if ( (LA40_154=='l') ) {
                            int LA40_166 = input.LA(6);

                            if ( (LA40_166=='!'||(LA40_166>='0' && LA40_166<='9')||LA40_166=='?'||(LA40_166>='A' && LA40_166<='Z')||(LA40_166>='a' && LA40_166<='z')) ) {
                                alt40=27;
                            }
                            else {
                                alt40=21;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                    }
                    break;
                case 'l':
                    {
                    int LA40_121 = input.LA(4);

                    if ( (LA40_121=='e') ) {
                        int LA40_155 = input.LA(5);

                        if ( (LA40_155=='s') ) {
                            int LA40_167 = input.LA(6);

                            if ( (LA40_167=='s') ) {
                                int LA40_176 = input.LA(7);

                                if ( (LA40_176=='!'||(LA40_176>='0' && LA40_176<='9')||LA40_176=='?'||(LA40_176>='A' && LA40_176<='Z')||(LA40_176>='a' && LA40_176<='z')) ) {
                                    alt40=27;
                                }
                                else {
                                    alt40=19;}
                            }
                            else {
                                alt40=27;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                    }
                    break;
                default:
                    alt40=27;}

            }
            else {
                alt40=27;}
            }
            break;
        case 'w':
            {
            int LA40_12 = input.LA(2);

            if ( (LA40_12=='h') ) {
                int LA40_61 = input.LA(3);

                if ( (LA40_61=='i') ) {
                    int LA40_122 = input.LA(4);

                    if ( (LA40_122=='l') ) {
                        int LA40_156 = input.LA(5);

                        if ( (LA40_156=='e') ) {
                            int LA40_168 = input.LA(6);

                            if ( (LA40_168=='!'||(LA40_168>='0' && LA40_168<='9')||LA40_168=='?'||(LA40_168>='A' && LA40_168<='Z')||(LA40_168>='a' && LA40_168<='z')) ) {
                                alt40=27;
                            }
                            else {
                                alt40=20;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
            }
            else {
                alt40=27;}
            }
            break;
        case 'r':
            {
            int LA40_13 = input.LA(2);

            if ( (LA40_13=='e') ) {
                int LA40_62 = input.LA(3);

                if ( (LA40_62=='s') ) {
                    int LA40_123 = input.LA(4);

                    if ( (LA40_123=='u') ) {
                        int LA40_157 = input.LA(5);

                        if ( (LA40_157=='c') ) {
                            int LA40_169 = input.LA(6);

                            if ( (LA40_169=='e') ) {
                                int LA40_178 = input.LA(7);

                                if ( (LA40_178=='!'||(LA40_178>='0' && LA40_178<='9')||LA40_178=='?'||(LA40_178>='A' && LA40_178<='Z')||(LA40_178>='a' && LA40_178<='z')) ) {
                                    alt40=27;
                                }
                                else {
                                    alt40=22;}
                            }
                            else {
                                alt40=27;}
                        }
                        else {
                            alt40=27;}
                    }
                    else {
                        alt40=27;}
                }
                else {
                    alt40=27;}
            }
            else {
                alt40=27;}
            }
            break;
        case ';':
            {
            alt40=23;
            }
            break;
        case '\n':
        case '\r':
            {
            alt40=24;
            }
            break;
        case '\t':
        case ' ':
            {
            alt40=25;
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt40=40;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt40=26;
                }
                break;
            default:
                alt40=71;}

            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt40=26;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'c':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'p':
        case 'q':
        case 's':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt40=27;
            }
            break;
        case '\'':
            {
            alt40=28;
            }
            break;
        case '%':
            {
            switch ( input.LA(2) ) {
            case 'Q':
                {
                alt40=29;
                }
                break;
            case 'q':
                {
                alt40=28;
                }
                break;
            case '=':
                {
                alt40=43;
                }
                break;
            default:
                alt40=72;}

            }
            break;
        case '\"':
            {
            alt40=29;
            }
            break;
        case '{':
            {
            int LA40_23 = input.LA(2);

            if ( (LA40_23=='}') ) {
                alt40=35;
            }
            else {
                alt40=30;}
            }
            break;
        case '}':
            {
            alt40=31;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                int LA40_69 = input.LA(3);

                if ( (LA40_69=='>') ) {
                    alt40=80;
                }
                else {
                    alt40=82;}
                }
                break;
            case '<':
                {
                switch ( input.LA(3) ) {
                case '=':
                    {
                    alt40=49;
                    }
                    break;
                case '-':
                    {
                    alt40=33;
                    }
                    break;
                default:
                    alt40=32;}

                }
                break;
            default:
                alt40=74;}

            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                alt40=36;
                }
                break;
            case '=':
                {
                alt40=42;
                }
                break;
            default:
                alt40=69;}

            }
            break;
        case ':':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                alt40=37;
                }
                break;
            case ':':
                {
                alt40=66;
                }
                break;
            default:
                alt40=65;}

            }
            break;
        case '=':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt40=55;
                }
                break;
            case '~':
                {
                alt40=86;
                }
                break;
            case '=':
                {
                int LA40_80 = input.LA(3);

                if ( (LA40_80=='=') ) {
                    alt40=84;
                }
                else {
                    alt40=83;}
                }
                break;
            default:
                alt40=38;}

            }
            break;
        case '+':
            {
            int LA40_29 = input.LA(2);

            if ( (LA40_29=='=') ) {
                alt40=39;
            }
            else {
                alt40=70;}
            }
            break;
        case '*':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                int LA40_84 = input.LA(3);

                if ( (LA40_84=='=') ) {
                    alt40=45;
                }
                else {
                    alt40=79;}
                }
                break;
            case '=':
                {
                alt40=41;
                }
                break;
            default:
                alt40=73;}

            }
            break;
        case '~':
            {
            int LA40_31 = input.LA(2);

            if ( (LA40_31=='=') ) {
                alt40=44;
            }
            else {
                alt40=68;}
            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '&':
                {
                int LA40_89 = input.LA(3);

                if ( (LA40_89=='=') ) {
                    alt40=51;
                }
                else {
                    alt40=56;}
                }
                break;
            case '=':
                {
                alt40=46;
                }
                break;
            default:
                alt40=78;}

            }
            break;
        case '^':
            {
            int LA40_33 = input.LA(2);

            if ( (LA40_33=='=') ) {
                alt40=47;
            }
            else {
                alt40=76;}
            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '|':
                {
                int LA40_94 = input.LA(3);

                if ( (LA40_94=='=') ) {
                    alt40=52;
                }
                else {
                    alt40=57;}
                }
                break;
            case '=':
                {
                alt40=48;
                }
                break;
            default:
                alt40=77;}

            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt40=81;
                }
                break;
            case '>':
                {
                int LA40_98 = input.LA(3);

                if ( (LA40_98=='=') ) {
                    alt40=50;
                }
                else {
                    alt40=88;}
                }
                break;
            default:
                alt40=75;}

            }
            break;
        case '.':
            {
            int LA40_36 = input.LA(2);

            if ( (LA40_36=='.') ) {
                int LA40_100 = input.LA(3);

                if ( (LA40_100=='.') ) {
                    alt40=54;
                }
                else {
                    alt40=53;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT );", 40, 36, input);

                throw nvae;
            }
            }
            break;
        case '?':
            {
            alt40=58;
            }
            break;
        case '(':
            {
            alt40=59;
            }
            break;
        case ')':
            {
            alt40=60;
            }
            break;
        case ']':
            {
            alt40=62;
            }
            break;
        case ',':
            {
            alt40=64;
            }
            break;
        case '!':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt40=85;
                }
                break;
            case '~':
                {
                alt40=87;
                }
                break;
            default:
                alt40=67;}

            }
            break;
        case '#':
            {
            alt40=89;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT );", 40, 0, input);

            throw nvae;
        }

        switch (alt40) {
            case 1 :
                // Rubyv3.g:1:10: T113
                {
                mT113(); 

                }
                break;
            case 2 :
                // Rubyv3.g:1:15: T114
                {
                mT114(); 

                }
                break;
            case 3 :
                // Rubyv3.g:1:20: T115
                {
                mT115(); 

                }
                break;
            case 4 :
                // Rubyv3.g:1:25: T116
                {
                mT116(); 

                }
                break;
            case 5 :
                // Rubyv3.g:1:30: T117
                {
                mT117(); 

                }
                break;
            case 6 :
                // Rubyv3.g:1:35: T118
                {
                mT118(); 

                }
                break;
            case 7 :
                // Rubyv3.g:1:40: T119
                {
                mT119(); 

                }
                break;
            case 8 :
                // Rubyv3.g:1:45: T120
                {
                mT120(); 

                }
                break;
            case 9 :
                // Rubyv3.g:1:50: T121
                {
                mT121(); 

                }
                break;
            case 10 :
                // Rubyv3.g:1:55: T122
                {
                mT122(); 

                }
                break;
            case 11 :
                // Rubyv3.g:1:60: T123
                {
                mT123(); 

                }
                break;
            case 12 :
                // Rubyv3.g:1:65: T124
                {
                mT124(); 

                }
                break;
            case 13 :
                // Rubyv3.g:1:70: T125
                {
                mT125(); 

                }
                break;
            case 14 :
                // Rubyv3.g:1:75: T126
                {
                mT126(); 

                }
                break;
            case 15 :
                // Rubyv3.g:1:80: T127
                {
                mT127(); 

                }
                break;
            case 16 :
                // Rubyv3.g:1:85: T128
                {
                mT128(); 

                }
                break;
            case 17 :
                // Rubyv3.g:1:90: T129
                {
                mT129(); 

                }
                break;
            case 18 :
                // Rubyv3.g:1:95: IF_MODIFIER
                {
                mIF_MODIFIER(); 

                }
                break;
            case 19 :
                // Rubyv3.g:1:107: UNLESS_MODIFIER
                {
                mUNLESS_MODIFIER(); 

                }
                break;
            case 20 :
                // Rubyv3.g:1:123: WHILE_MODIFIER
                {
                mWHILE_MODIFIER(); 

                }
                break;
            case 21 :
                // Rubyv3.g:1:138: UNTIL_MODIFIER
                {
                mUNTIL_MODIFIER(); 

                }
                break;
            case 22 :
                // Rubyv3.g:1:153: RESCUE_MODIFIER
                {
                mRESCUE_MODIFIER(); 

                }
                break;
            case 23 :
                // Rubyv3.g:1:169: SEMI
                {
                mSEMI(); 

                }
                break;
            case 24 :
                // Rubyv3.g:1:174: LINE_BREAK
                {
                mLINE_BREAK(); 

                }
                break;
            case 25 :
                // Rubyv3.g:1:185: WS
                {
                mWS(); 

                }
                break;
            case 26 :
                // Rubyv3.g:1:188: INT
                {
                mINT(); 

                }
                break;
            case 27 :
                // Rubyv3.g:1:192: ID
                {
                mID(); 

                }
                break;
            case 28 :
                // Rubyv3.g:1:195: SINGLE_QUOTE_STRING
                {
                mSINGLE_QUOTE_STRING(); 

                }
                break;
            case 29 :
                // Rubyv3.g:1:215: DOUBLE_QUOTE_STRING
                {
                mDOUBLE_QUOTE_STRING(); 

                }
                break;
            case 30 :
                // Rubyv3.g:1:235: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 31 :
                // Rubyv3.g:1:242: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 32 :
                // Rubyv3.g:1:249: HEREDOC_BEGIN
                {
                mHEREDOC_BEGIN(); 

                }
                break;
            case 33 :
                // Rubyv3.g:1:263: HEREDOC_INDENT_BEGIN
                {
                mHEREDOC_INDENT_BEGIN(); 

                }
                break;
            case 34 :
                // Rubyv3.g:1:284: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 35 :
                // Rubyv3.g:1:290: HASH
                {
                mHASH(); 

                }
                break;
            case 36 :
                // Rubyv3.g:1:295: REGEX
                {
                mREGEX(); 

                }
                break;
            case 37 :
                // Rubyv3.g:1:301: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 38 :
                // Rubyv3.g:1:308: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 39 :
                // Rubyv3.g:1:315: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 

                }
                break;
            case 40 :
                // Rubyv3.g:1:327: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 

                }
                break;
            case 41 :
                // Rubyv3.g:1:340: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 

                }
                break;
            case 42 :
                // Rubyv3.g:1:352: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 43 :
                // Rubyv3.g:1:363: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 44 :
                // Rubyv3.g:1:374: COMPLEMENT_ASSIGN
                {
                mCOMPLEMENT_ASSIGN(); 

                }
                break;
            case 45 :
                // Rubyv3.g:1:392: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 

                }
                break;
            case 46 :
                // Rubyv3.g:1:405: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 

                }
                break;
            case 47 :
                // Rubyv3.g:1:417: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 

                }
                break;
            case 48 :
                // Rubyv3.g:1:429: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 

                }
                break;
            case 49 :
                // Rubyv3.g:1:440: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 

                }
                break;
            case 50 :
                // Rubyv3.g:1:458: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 

                }
                break;
            case 51 :
                // Rubyv3.g:1:477: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 

                }
                break;
            case 52 :
                // Rubyv3.g:1:496: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 

                }
                break;
            case 53 :
                // Rubyv3.g:1:514: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 

                }
                break;
            case 54 :
                // Rubyv3.g:1:530: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 

                }
                break;
            case 55 :
                // Rubyv3.g:1:546: ASSOC
                {
                mASSOC(); 

                }
                break;
            case 56 :
                // Rubyv3.g:1:552: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 57 :
                // Rubyv3.g:1:564: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 58 :
                // Rubyv3.g:1:575: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 59 :
                // Rubyv3.g:1:584: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 60 :
                // Rubyv3.g:1:591: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 61 :
                // Rubyv3.g:1:598: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 62 :
                // Rubyv3.g:1:605: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 63 :
                // Rubyv3.g:1:612: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 

                }
                break;
            case 64 :
                // Rubyv3.g:1:624: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 65 :
                // Rubyv3.g:1:630: COLON
                {
                mCOLON(); 

                }
                break;
            case 66 :
                // Rubyv3.g:1:636: COLON2
                {
                mCOLON2(); 

                }
                break;
            case 67 :
                // Rubyv3.g:1:643: NOT
                {
                mNOT(); 

                }
                break;
            case 68 :
                // Rubyv3.g:1:647: BNOT
                {
                mBNOT(); 

                }
                break;
            case 69 :
                // Rubyv3.g:1:652: DIV
                {
                mDIV(); 

                }
                break;
            case 70 :
                // Rubyv3.g:1:656: PLUS
                {
                mPLUS(); 

                }
                break;
            case 71 :
                // Rubyv3.g:1:661: MINUS
                {
                mMINUS(); 

                }
                break;
            case 72 :
                // Rubyv3.g:1:667: MOD
                {
                mMOD(); 

                }
                break;
            case 73 :
                // Rubyv3.g:1:671: STAR
                {
                mSTAR(); 

                }
                break;
            case 74 :
                // Rubyv3.g:1:676: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 75 :
                // Rubyv3.g:1:686: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 76 :
                // Rubyv3.g:1:699: BXOR
                {
                mBXOR(); 

                }
                break;
            case 77 :
                // Rubyv3.g:1:704: BOR
                {
                mBOR(); 

                }
                break;
            case 78 :
                // Rubyv3.g:1:708: BAND
                {
                mBAND(); 

                }
                break;
            case 79 :
                // Rubyv3.g:1:713: POWER
                {
                mPOWER(); 

                }
                break;
            case 80 :
                // Rubyv3.g:1:719: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 81 :
                // Rubyv3.g:1:727: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 82 :
                // Rubyv3.g:1:744: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 83 :
                // Rubyv3.g:1:758: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 84 :
                // Rubyv3.g:1:764: CASE_EQUAL
                {
                mCASE_EQUAL(); 

                }
                break;
            case 85 :
                // Rubyv3.g:1:775: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 86 :
                // Rubyv3.g:1:785: MATCH
                {
                mMATCH(); 

                }
                break;
            case 87 :
                // Rubyv3.g:1:791: NOT_MATCH
                {
                mNOT_MATCH(); 

                }
                break;
            case 88 :
                // Rubyv3.g:1:801: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 

                }
                break;
            case 89 :
                // Rubyv3.g:1:813: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


 

}