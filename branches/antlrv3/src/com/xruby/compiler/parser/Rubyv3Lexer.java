// $ANTLR 3.0 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-06-16 20:26:08

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import org.antlr.runtime.*;

public class Rubyv3Lexer extends BaseLexer {
    public static final int COMMA=115;
    public static final int INSTANCE_VARIABLE=91;
    public static final int LOGICAL_AND_ASSIGN=66;
    public static final int GREATER_THAN=46;
    public static final int MINUS=52;
    public static final int ESCAPE_INT=98;
    public static final int ARRAY=82;
    public static final int HEX_PART=94;
    public static final int LOGICAL_OR=72;
    public static final int LESS_THAN=48;
    public static final int T129=129;
    public static final int META_PART=96;
    public static final int T131=131;
    public static final int LEADING0_NUMBER=89;
    public static final int BOR=77;
    public static final int LEADING_MARK_DECIMAL=87;
    public static final int BINARY=86;
    public static final int DOT=39;
    public static final int COLON2=40;
    public static final int EMPTY_ARRAY=114;
    public static final int LCURLY=104;
    public static final int CONSTANT=14;
    public static final int LINE_BREAK=37;
    public static final int LEFT_SHIFT=11;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=90;
    public static final int T132=132;
    public static final int IF_MODIFIER=31;
    public static final int MULTIPLE_ASSIGN=20;
    public static final int ESCAPE_INT_PART=97;
    public static final int REGEX=83;
    public static final int SYMBOL=18;
    public static final int CONTROL_PART=95;
    public static final int RPAREN=111;
    public static final int STAR_ASSIGN=65;
    public static final int DOUBLE_QUOTE_STRING=101;
    public static final int PLUS=51;
    public static final int BODY=9;
    public static final int HEREDOC_INDENT_BEGIN=107;
    public static final int CASE_EQUAL=44;
    public static final int UNLESS_MODIFIER=32;
    public static final int MINUS_ASSIGN=59;
    public static final int EXCLUSIVE_RANGE=71;
    public static final int GREATER_OR_EQUAL=47;
    public static final int T130=130;
    public static final int POWER_ASSIGN=68;
    public static final int MOD_ASSIGN=56;
    public static final int T133=133;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=23;
    public static final int T120=120;
    public static final int WS=38;
    public static final int STRING=27;
    public static final int DOUBLE_STRING_CHAR=103;
    public static final int T121=121;
    public static final int RIGHT_SHIFT_ASSIGN=64;
    public static final int GLOBAL_VARIABLE=93;
    public static final int NON_LEADING0_NUMBER=99;
    public static final int SINGLE_QUOTE_STRING=100;
    public static final int T123=123;
    public static final int HEREDOC_BEGIN=106;
    public static final int CLASS_VARIABLE=92;
    public static final int LBRACK=112;
    public static final int SEMI=36;
    public static final int DIV_ASSIGN=58;
    public static final int MRHS=24;
    public static final int BLOCK_ARG=22;
    public static final int EQUAL=43;
    public static final int LOGICAL_AND=73;
    public static final int T119=119;
    public static final int COLON=116;
    public static final int DIV=29;
    public static final int REST_UNUSE=28;
    public static final int T122=122;
    public static final int T135=135;
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
    public static final int T134=134;
    public static final int RCURLY=105;
    public static final int T127=127;
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
    public static final int T124=124;
    public static final int COMPARE=42;
    public static final int T125=125;
    public static final int IF=7;
    public static final int ARG=10;
    public static final int VARIABLE=16;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=21;
    public static final int EOF=-1;
    public static final int T126=126;
    public static final int CALL=17;
    public static final int Tokens=136;
    public static final int RBRACK=113;
    public static final int RESCUE_MODIFIER=35;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BXOR=76;
    public static final int STAR=53;
    public static final int T128=128;
    public static final int NOT=80;
    public static final int SINGLE_STRING_CHAR=102;
    
    
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
    public String getGrammarFileName() { return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:8: ( 'begin' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:8: 'begin'
            {
            match("begin"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:8: ( 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:8: 'end'
            {
            match("end"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:8: ( 'false' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:8: 'false'
            {
            match("false"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:8: ( 'nil' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:8: 'nil'
            {
            match("nil"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:8: ( 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:8: 'true'
            {
            match("true"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:8: ( 'elsif' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:8: 'elsif'
            {
            match("elsif"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:8: ( 'else' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:8: 'else'
            {
            match("else"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:8: ( 'then' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:8: 'then'
            {
            match("then"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: ( 'alias' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: 'alias'
            {
            match("alias"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: ( 'def' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: 'def'
            {
            match("def"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: ( '[]=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: '[]='
            {
            match("[]="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T129

    // $ANTLR start T130
    public final void mT130() throws RecognitionException {
        try {
            int _type = T130;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: ( 'and' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T130

    // $ANTLR start T131
    public final void mT131() throws RecognitionException {
        try {
            int _type = T131;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: ( 'or' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T131

    // $ANTLR start T132
    public final void mT132() throws RecognitionException {
        try {
            int _type = T132;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: ( 'not' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T132

    // $ANTLR start T133
    public final void mT133() throws RecognitionException {
        try {
            int _type = T133;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:8: ( 'defined' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:8: 'defined'
            {
            match("defined"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T133

    // $ANTLR start T134
    public final void mT134() throws RecognitionException {
        try {
            int _type = T134;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:8: ( 'expression0' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:8: 'expression0'
            {
            match("expression0"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T134

    // $ANTLR start T135
    public final void mT135() throws RecognitionException {
        try {
            int _type = T135;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:8: ( 'expression1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:8: 'expression1'
            {
            match("expression1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T135

    // $ANTLR start IF_MODIFIER
    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:20: ( 'if' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:20: 'if'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:280:20: ( 'unless' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:280:20: 'unless'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:20: ( 'while' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:20: 'while'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:20: ( 'until' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:20: 'until'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:20: ( 'resuce' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:20: 'resuce'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:7: ( ';' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:7: ';'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: ( ( '\\r' )? '\\n' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: ( '\\r' )? '\\n'
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:3: '\\r'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:6: ( ( ' ' | '\\t' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:320:6: ( ' ' | '\\t' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:4: ( ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:4: ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:4: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
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
                    new NoViableAltException("616:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:11: OCTAL
                    {
                    mOCTAL(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:17: HEX
                    {
                    mHEX(); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:21: BINARY
                    {
                    mBINARY(); 

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:28: LEADING_MARK_DECIMAL
                    {
                    mLEADING_MARK_DECIMAL(); 

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
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
                            new NoViableAltException("617:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:13: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:17: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:26: ( ( '_' )? '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')||LA4_0=='_') ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:27: ( '_' )? '0' .. '9'
                            	    {
                            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:27: ( '_' )?
                            	    int alt3=2;
                            	    int LA3_0 = input.LA(1);

                            	    if ( (LA3_0=='_') ) {
                            	        alt3=1;
                            	    }
                            	    switch (alt3) {
                            	        case 1 :
                            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:27: '_'
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

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:45: ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.'||LA8_0=='E'||LA8_0=='e') ) {
                        alt8=2;
                    }
                    else {
                        alt8=1;}
                    switch (alt8) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:55: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
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
                                    new NoViableAltException("617:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:58: EXP_PART
                                    {
                                    mEXP_PART(); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:67: '.' LEADING0_NUMBER ( EXP_PART )?
                                    {
                                    if(input.LA(2) < '0' || input.LA(2) > '9') {_type=INT; this.type = INT; return;}
                                    match('.'); 
                                    mLEADING0_NUMBER(); 
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:170: ( EXP_PART )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:170: EXP_PART
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
                    new NoViableAltException("621:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:7: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:18: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 
                    _type = CONSTANT;

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:48: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:53: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:54: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:78: ( '0' .. '9' )
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:78: ( '0' .. '9' )
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:79: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start FID
    public final void mFID() throws RecognitionException {
        try {
            int _type = FID;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:7: ( ID ( '?' | '!' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:7: ID ( '?' | '!' )
            {
            mID(); 
            if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FID

    // $ANTLR start INSTANCE_VARIABLE
    public final void mINSTANCE_VARIABLE() throws RecognitionException {
        try {
            int _type = INSTANCE_VARIABLE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:4: ( '@' IDENTIFIER_CONSTANT_AND_KEYWORD )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:4: '@' IDENTIFIER_CONSTANT_AND_KEYWORD
            {
            match('@'); 
            mIDENTIFIER_CONSTANT_AND_KEYWORD(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INSTANCE_VARIABLE

    // $ANTLR start CLASS_VARIABLE
    public final void mCLASS_VARIABLE() throws RecognitionException {
        try {
            int _type = CLASS_VARIABLE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:4: ( '@' INSTANCE_VARIABLE )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:4: '@' INSTANCE_VARIABLE
            {
            match('@'); 
            mINSTANCE_VARIABLE(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLASS_VARIABLE

    // $ANTLR start GLOBAL_VARIABLE
    public final void mGLOBAL_VARIABLE() throws RecognitionException {
        try {
            int _type = GLOBAL_VARIABLE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:5: ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='$') ) {
                switch ( input.LA(2) ) {
                case '!':
                case '\"':
                case '$':
                case '&':
                case '\'':
                case '*':
                case '+':
                case ',':
                case '.':
                case '/':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                case '\\':
                case '`':
                case '~':
                    {
                    alt14=3;
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
                    alt14=2;
                    }
                    break;
                case '-':
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
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("629:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("629:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:5: '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD
                    {
                    match('$'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:9: ( '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:10: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mIDENTIFIER_CONSTANT_AND_KEYWORD(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:5: '$' ( options {greedy=true; } : '0' .. '9' )+
                    {
                    match('$'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:9: ( options {greedy=true; } : '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:5: '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' )
                    {
                    match('$'); 
                    if ( (input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='/')||(input.LA(1)>=';' && input.LA(1)<='@')||input.LA(1)=='\\'||input.LA(1)=='`'||input.LA(1)=='~' ) {
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
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GLOBAL_VARIABLE

    // $ANTLR start IDENTIFIER_CONSTANT_AND_KEYWORD
    public final void mIDENTIFIER_CONSTANT_AND_KEYWORD() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:636:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop15;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end IDENTIFIER_CONSTANT_AND_KEYWORD

    // $ANTLR start OCTAL
    public final void mOCTAL() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:9: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:13: ( '_' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='_') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:13: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:18: ( '0' .. '7' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:29: ( ( '_' )? '0' .. '7' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='7')||LA18_0=='_') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:30: ( '_' )? '0' .. '7'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:30: ( '_' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0=='_') ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:30: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:1: ( ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:1: ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:1: ( '0d' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:2: '0d'
            {
            match("0d"); 


            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:8: ( '0' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:19: ( ( '_' )? '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||LA20_0=='_') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:20: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:20: ( '_' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0=='_') ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:648:20: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:7: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:21: ( ( '_' )? HEX_PART )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='F')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='f')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:22: ( '_' )? HEX_PART
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:22: ( '_' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0=='_') ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:22: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mHEX_PART(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:653:4: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:653:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:10: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:14: ( '0' .. '1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:15: '0' .. '1'
            {
            matchRange('0','1'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:25: ( ( '_' )? '0' .. '1' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='1')||LA24_0=='_') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:26: ( '_' )? '0' .. '1'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:26: ( '_' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0=='_') ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:26: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','1'); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:23: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:23: ( CONTROL_PART | META_PART )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='M') ) {
                        alt25=2;
                    }
                    else if ( (LA25_1=='C'||LA25_1=='c') ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:37: META_PART
            	    {
            	    mMETA_PART(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
                int LA26_1 = input.LA(2);

                if ( ((LA26_1>='\u0000' && LA26_1<='B')||(LA26_1>='D' && LA26_1<='L')||(LA26_1>='N' && LA26_1<='b')||(LA26_1>='d' && LA26_1<='\uFFFE')) ) {
                    alt26=3;
                }
                else {
                    alt26=1;}
            }
            else if ( ((LA26_0>='\u0093' && LA26_0<='\u0255')) ) {
                alt26=2;
            }
            else if ( ((LA26_0>='\u0000' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\u0091')) ) {
                alt26=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("661:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:94: ESCAPE_INT_PART
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:4: ( ( '\\\\C-' | '\\\\c' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:4: ( '\\\\C-' | '\\\\c' )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:4: ( '\\\\C-' | '\\\\c' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='c') ) {
                    alt27=2;
                }
                else if ( (LA27_1=='C') ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("665:4: ( '\\\\C-' | '\\\\c' )", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("665:4: ( '\\\\C-' | '\\\\c' )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:5: '\\\\C-'
                    {
                    match("\\C-"); 


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:12: '\\\\c'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:669:4: ( '\\\\M-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:669:4: '\\\\M-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:3: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:3: ( '1' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:4: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:14: ( ( '_' )? '0' .. '9' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')||LA29_0=='_') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:15: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:15: ( '_' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0=='_') ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:3: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:3: ( '0' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:14: ( ( '_' )? '0' .. '9' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='9')||LA31_0=='_') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:15: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:15: ( '_' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0=='_') ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:677:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:11: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:23: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='-') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:23: '-'
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
            int begin;
            int tmp;

            int end=0; int nested=0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:35: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\'') ) {
                alt35=1;
            }
            else if ( (LA35_0=='%') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("683:1: SINGLE_QUOTE_STRING : ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:35: '\\'' ( SINGLE_STRING_CHAR )* '\\''
                    {
                    match('\''); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:40: ( SINGLE_STRING_CHAR )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>='\u0000' && LA33_0<='&')||(LA33_0>='(' && LA33_0<='\uFFFE')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:40: SINGLE_STRING_CHAR
                    	    {
                    	    mSINGLE_STRING_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:4: '%q' begin= . (tmp= . )*
                    {
                    match("%q"); 

                    begin = input.LA(1);
                    matchAny(); 
                    System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:103: (tmp= . )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>='\u0000' && LA34_0<='\uFFFE')) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:104: tmp= .
                    	    {
                    	    tmp = input.LA(1);
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
                    	    break loop34;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:709:6: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\\') ) {
                alt36=1;
            }
            else if ( ((LA36_0>='\u0000' && LA36_0<='&')||(LA36_0>='(' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFE')) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("707:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:709:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:709:15: ~ ( '\\\\' | '\\'' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:712:4: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\\') ) {
                alt37=1;
            }
            else if ( ((LA37_0>='\u0000' && LA37_0<='!')||(LA37_0>='#' && LA37_0<='[')||(LA37_0>=']' && LA37_0<='\uFFFE')) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("710:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:712:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:712:13: ~ ( '\\\\' | '\"' )
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
            int begin;
            int s;

            int end=0; int nested=0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:35: (s= ( '\"' | '%Q' begin= . ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:35: s= ( '\"' | '%Q' begin= . )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:37: ( '\"' | '%Q' begin= . )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\"') ) {
                alt38=1;
            }
            else if ( (LA38_0=='%') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("714:37: ( '\"' | '%Q' begin= . )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:38: '\"'
                    {
                    match('\"'); 
                    expression = new DoubleStringParser(this.parser, input, '"', 0).parseString();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:126: '%Q' begin= .
                    {
                    match("%Q"); 

                    begin = input.LA(1);
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:718:11: ( '{' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:718:11: '{'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:724:11: ( '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:724:11: '}'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:4: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\\') ) {
                int LA41_1 = input.LA(2);

                if ( ((LA41_1>='\u0000' && LA41_1<='/')||(LA41_1>='8' && LA41_1<='B')||(LA41_1>='D' && LA41_1<='L')||(LA41_1>='N' && LA41_1<='b')||(LA41_1>='d' && LA41_1<='w')||(LA41_1>='y' && LA41_1<='\uFFFE')) ) {
                    alt41=3;
                }
                else if ( (LA41_1=='x') ) {
                    alt41=2;
                }
                else if ( ((LA41_1>='0' && LA41_1<='7')) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("735:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("735:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt39=3;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>='0' && LA39_0<='7')) ) {
                        int LA39_1 = input.LA(2);

                        if ( ((LA39_1>='0' && LA39_1<='7')) ) {
                            int LA39_2 = input.LA(3);

                            if ( ((LA39_2>='0' && LA39_2<='7')) ) {
                                alt39=3;
                            }
                            else {
                                alt39=2;}
                        }
                        else {
                            alt39=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("737:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:10: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;
                        case 3 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:41: '0' .. '7' '0' .. '7' '0' .. '7'
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:738:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:738:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>='0' && LA40_0<='9')||(LA40_0>='A' && LA40_0<='F')||(LA40_0>='a' && LA40_0<='f')) ) {
                        int LA40_1 = input.LA(2);

                        if ( ((LA40_1>='0' && LA40_1<='9')||(LA40_1>='A' && LA40_1<='F')||(LA40_1>='a' && LA40_1<='f')) ) {
                            alt40=2;
                        }
                        else {
                            alt40=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("738:19: ( HEX_PART | HEX_PART HEX_PART )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:738:20: HEX_PART
                            {
                            mHEX_PART(); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:738:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:739:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:743:4: ( '<<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:743:4: '<<'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:4: ( '<<-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:4: '<<-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:9: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:9: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARRAY

    // $ANTLR start REGEX
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:763:9: ( '/abc/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:763:9: '/abc/'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:10: ( ':abc' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:10: ':abc'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:766:27: ( '=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:766:27: '='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:767:17: ( '+=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:767:17: '+='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:768:17: ( '-=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:768:17: '-='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:769:17: ( '*=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:769:17: '*='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:770:15: ( '/=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:770:15: '/='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:15: ( '%=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:15: '%='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:772:25: ( '~=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:772:25: '~='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:773:17: ( '**=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:773:17: '**='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:774:17: ( '&=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:774:17: '&='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:17: ( '^=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:17: '^='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:776:16: ( '|=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:776:16: '|='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:777:21: ( '<<=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:777:21: '<<='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:778:22: ( '>>=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:778:22: '>>='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:779:22: ( '&&=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:779:22: '&&='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:780:21: ( '||=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:780:21: '||='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:23: ( '..' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:781:23: '..'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:782:23: ( '...' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:782:23: '...'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:784:12: ( '=>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:784:12: '=>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:785:17: ( '&&' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:785:17: '&&'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:786:16: ( '||' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:786:16: '||'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:788:14: ( '?' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:788:14: '?'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:789:13: ( '(' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:789:13: '('
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:790:13: ( ')' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:790:13: ')'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:791:13: ( '[' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:791:13: '['
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:792:13: ( ']' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:792:13: ']'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:793:16: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:793:16: '[]'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:796:12: ( ',' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:796:12: ','
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:797:12: ( ':' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:797:12: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:798:7: ( '.' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:798:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start COLON2
    public final void mCOLON2() throws RecognitionException {
        try {
            int _type = COLON2;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:13: ( '::' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:13: '::'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:11: ( '!' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:801:11: '!'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:802:11: ( '~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:802:11: '~'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:803:10: ( '/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:803:10: '/'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:11: ( '+' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:11: '+'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:805:12: ( '-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:805:12: '-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:10: ( '%' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:10: '%'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:807:11: ( '*' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:807:11: '*'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:808:15: ( '<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:808:15: '<'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:17: ( '>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:809:17: '>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:11: ( '^' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:11: '^'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:811:11: ( '|' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:811:11: '|'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:11: ( '&' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:11: '&'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:12: ( '**' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:12: '**'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:14: ( '<=>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:814:14: '<=>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:815:20: ( '>=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:815:20: '>='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:18: ( '<=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:18: '<='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:817:12: ( '==' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:817:12: '=='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:818:16: ( '===' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:818:16: '==='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:819:15: ( '!=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:819:15: '!='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:820:12: ( '=~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:820:12: '=~'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:821:15: ( '!~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:821:15: '!~'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:823:17: ( '>>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:823:17: '>>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:826:5: ( '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:826:5: '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:833:5: ( (~ ( '\\r' | '\\n' ) )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:833:5: (~ ( '\\r' | '\\n' ) )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:833:5: (~ ( '\\r' | '\\n' ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\u0000' && LA42_0<='\t')||(LA42_0>='\u000B' && LA42_0<='\f')||(LA42_0>='\u000E' && LA42_0<='\uFFFE')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:833:6: ~ ( '\\r' | '\\n' )
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
            	    break loop42;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end ANYTHING_OTHER_THAN_LINE_FEED

    public void mTokens() throws RecognitionException {
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: ( T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT )
        int alt43=93;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T119
                {
                mT119(); 

                }
                break;
            case 2 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:15: T120
                {
                mT120(); 

                }
                break;
            case 3 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:20: T121
                {
                mT121(); 

                }
                break;
            case 4 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:25: T122
                {
                mT122(); 

                }
                break;
            case 5 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T123
                {
                mT123(); 

                }
                break;
            case 6 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:35: T124
                {
                mT124(); 

                }
                break;
            case 7 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:40: T125
                {
                mT125(); 

                }
                break;
            case 8 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:45: T126
                {
                mT126(); 

                }
                break;
            case 9 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T127
                {
                mT127(); 

                }
                break;
            case 10 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:55: T128
                {
                mT128(); 

                }
                break;
            case 11 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:60: T129
                {
                mT129(); 

                }
                break;
            case 12 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:65: T130
                {
                mT130(); 

                }
                break;
            case 13 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:70: T131
                {
                mT131(); 

                }
                break;
            case 14 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:75: T132
                {
                mT132(); 

                }
                break;
            case 15 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:80: T133
                {
                mT133(); 

                }
                break;
            case 16 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:85: T134
                {
                mT134(); 

                }
                break;
            case 17 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:90: T135
                {
                mT135(); 

                }
                break;
            case 18 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:95: IF_MODIFIER
                {
                mIF_MODIFIER(); 

                }
                break;
            case 19 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:107: UNLESS_MODIFIER
                {
                mUNLESS_MODIFIER(); 

                }
                break;
            case 20 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:123: WHILE_MODIFIER
                {
                mWHILE_MODIFIER(); 

                }
                break;
            case 21 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:138: UNTIL_MODIFIER
                {
                mUNTIL_MODIFIER(); 

                }
                break;
            case 22 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:153: RESCUE_MODIFIER
                {
                mRESCUE_MODIFIER(); 

                }
                break;
            case 23 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:169: SEMI
                {
                mSEMI(); 

                }
                break;
            case 24 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:174: LINE_BREAK
                {
                mLINE_BREAK(); 

                }
                break;
            case 25 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:185: WS
                {
                mWS(); 

                }
                break;
            case 26 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:188: INT
                {
                mINT(); 

                }
                break;
            case 27 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:192: ID
                {
                mID(); 

                }
                break;
            case 28 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:195: FID
                {
                mFID(); 

                }
                break;
            case 29 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:199: INSTANCE_VARIABLE
                {
                mINSTANCE_VARIABLE(); 

                }
                break;
            case 30 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:217: CLASS_VARIABLE
                {
                mCLASS_VARIABLE(); 

                }
                break;
            case 31 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:232: GLOBAL_VARIABLE
                {
                mGLOBAL_VARIABLE(); 

                }
                break;
            case 32 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:248: SINGLE_QUOTE_STRING
                {
                mSINGLE_QUOTE_STRING(); 

                }
                break;
            case 33 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:268: DOUBLE_QUOTE_STRING
                {
                mDOUBLE_QUOTE_STRING(); 

                }
                break;
            case 34 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:288: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 35 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:295: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 36 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:302: HEREDOC_BEGIN
                {
                mHEREDOC_BEGIN(); 

                }
                break;
            case 37 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:316: HEREDOC_INDENT_BEGIN
                {
                mHEREDOC_INDENT_BEGIN(); 

                }
                break;
            case 38 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:337: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 39 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:343: REGEX
                {
                mREGEX(); 

                }
                break;
            case 40 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:349: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 41 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:356: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 42 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:363: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 

                }
                break;
            case 43 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:375: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 

                }
                break;
            case 44 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:388: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 

                }
                break;
            case 45 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:400: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 46 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:411: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 47 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:422: COMPLEMENT_ASSIGN
                {
                mCOMPLEMENT_ASSIGN(); 

                }
                break;
            case 48 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:440: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 

                }
                break;
            case 49 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:453: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 

                }
                break;
            case 50 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:465: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 

                }
                break;
            case 51 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:477: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 

                }
                break;
            case 52 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:488: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 

                }
                break;
            case 53 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:506: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 

                }
                break;
            case 54 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:525: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 

                }
                break;
            case 55 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:544: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 

                }
                break;
            case 56 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:562: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 

                }
                break;
            case 57 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:578: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 

                }
                break;
            case 58 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:594: ASSOC
                {
                mASSOC(); 

                }
                break;
            case 59 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:600: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 60 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:612: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 61 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:623: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 62 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:632: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 63 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:639: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 64 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:646: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 65 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:653: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 66 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:660: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 

                }
                break;
            case 67 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:672: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 68 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:678: COLON
                {
                mCOLON(); 

                }
                break;
            case 69 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:684: DOT
                {
                mDOT(); 

                }
                break;
            case 70 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:688: COLON2
                {
                mCOLON2(); 

                }
                break;
            case 71 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:695: NOT
                {
                mNOT(); 

                }
                break;
            case 72 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:699: BNOT
                {
                mBNOT(); 

                }
                break;
            case 73 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:704: DIV
                {
                mDIV(); 

                }
                break;
            case 74 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:708: PLUS
                {
                mPLUS(); 

                }
                break;
            case 75 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:713: MINUS
                {
                mMINUS(); 

                }
                break;
            case 76 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:719: MOD
                {
                mMOD(); 

                }
                break;
            case 77 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:723: STAR
                {
                mSTAR(); 

                }
                break;
            case 78 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:728: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 79 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:738: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 80 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:751: BXOR
                {
                mBXOR(); 

                }
                break;
            case 81 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:756: BOR
                {
                mBOR(); 

                }
                break;
            case 82 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:760: BAND
                {
                mBAND(); 

                }
                break;
            case 83 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:765: POWER
                {
                mPOWER(); 

                }
                break;
            case 84 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:771: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 85 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:779: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 86 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:796: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 87 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:810: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 88 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:816: CASE_EQUAL
                {
                mCASE_EQUAL(); 

                }
                break;
            case 89 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:827: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 90 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:837: MATCH
                {
                mMATCH(); 

                }
                break;
            case 91 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:843: NOT_MATCH
                {
                mNOT_MATCH(); 

                }
                break;
            case 92 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:853: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 

                }
                break;
            case 93 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:865: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA43_eotS =
        "\1\uffff\7\63\1\101\5\63\3\uffff\1\110\1\uffff\3\63\3\uffff\1\114"+
        "\3\uffff\1\117\1\122\1\125\1\131\1\133\1\136\1\140\1\143\1\145\1"+
        "\150\1\153\1\155\5\uffff\1\160\1\uffff\3\63\2\uffff\13\63\1\176"+
        "\1\uffff\1\177\1\u0080\3\63\6\uffff\1\u0087\1\u0089\7\uffff\1\u008b"+
        "\5\uffff\1\u008d\4\uffff\1\u008f\5\uffff\1\u0091\1\uffff\1\u0093"+
        "\2\uffff\1\u0095\4\uffff\1\63\1\u0097\3\63\1\u009c\1\u009d\3\63"+
        "\1\u00a1\1\u00a3\4\uffff\4\63\21\uffff\1\63\1\uffff\1\u00a9\3\63"+
        "\2\uffff\1\u00ad\1\u00ae\1\63\1\uffff\1\63\1\uffff\4\63\1\u00b5"+
        "\1\uffff\1\u00b6\1\63\1\u00b8\2\uffff\1\u00b9\2\63\1\u00bc\1\u00bd"+
        "\1\63\2\uffff\1\63\2\uffff\1\63\1\u00c1\2\uffff\1\u00c2\1\63\1\u00c4"+
        "\2\uffff\1\63\1\uffff\2\63\1\u00c9\1\u00ca\2\uffff";
    static final String DFA43_eofS =
        "\u00cb\uffff";
    static final String DFA43_minS =
        "\1\11\7\41\1\135\5\41\3\uffff\1\60\1\uffff\3\41\1\100\2\uffff\1"+
        "\75\3\uffff\1\74\1\75\1\72\2\75\1\52\1\75\1\46\3\75\1\56\5\uffff"+
        "\1\75\1\uffff\3\41\2\uffff\13\41\1\75\1\uffff\5\41\6\uffff\1\55"+
        "\1\76\7\uffff\1\75\5\uffff\1\75\4\uffff\1\75\5\uffff\1\75\1\uffff"+
        "\1\75\2\uffff\1\56\4\uffff\14\41\4\uffff\4\41\21\uffff\1\41\1\uffff"+
        "\4\41\2\uffff\3\41\1\uffff\1\41\1\uffff\5\41\1\uffff\3\41\2\uffff"+
        "\6\41\2\uffff\1\41\2\uffff\2\41\2\uffff\3\41\2\uffff\1\41\1\uffff"+
        "\4\41\2\uffff";
    static final String DFA43_maxS =
        "\1\176\7\172\1\135\5\172\3\uffff\1\75\1\uffff\4\172\2\uffff\1\161"+
        "\3\uffff\1\75\2\141\1\176\5\75\1\174\1\76\1\56\5\uffff\1\176\1\uffff"+
        "\3\172\2\uffff\13\172\1\75\1\uffff\5\172\6\uffff\1\75\1\76\7\uffff"+
        "\1\75\5\uffff\1\75\4\uffff\1\75\5\uffff\1\75\1\uffff\1\75\2\uffff"+
        "\1\56\4\uffff\14\172\4\uffff\4\172\21\uffff\1\172\1\uffff\4\172"+
        "\2\uffff\3\172\1\uffff\1\172\1\uffff\5\172\1\uffff\3\172\2\uffff"+
        "\6\172\2\uffff\1\172\2\uffff\2\172\2\uffff\3\172\2\uffff\1\172\1"+
        "\uffff\4\172\2\uffff";
    static final String DFA43_acceptS =
        "\16\uffff\1\27\1\30\1\31\1\uffff\1\32\4\uffff\1\37\1\40\1\uffff"+
        "\1\41\1\42\1\43\14\uffff\1\75\1\76\1\77\1\101\1\103\1\uffff\1\135"+
        "\3\uffff\1\33\1\34\14\uffff\1\100\5\uffff\1\53\1\113\1\35\1\36\1"+
        "\56\1\114\2\uffff\1\116\1\47\1\55\1\111\1\50\1\106\1\104\1\uffff"+
        "\1\132\1\72\1\51\1\52\1\112\1\uffff\1\54\1\115\1\57\1\110\1\uffff"+
        "\1\61\1\122\1\62\1\120\1\63\1\uffff\1\121\1\uffff\1\125\1\117\1"+
        "\uffff\1\105\1\133\1\131\1\107\14\uffff\1\13\1\46\1\15\1\22\4\uffff"+
        "\1\45\1\64\1\44\1\124\1\126\1\130\1\127\1\60\1\123\1\66\1\73\1\67"+
        "\1\74\1\65\1\134\1\71\1\70\1\uffff\1\2\4\uffff\1\4\1\16\3\uffff"+
        "\1\14\1\uffff\1\12\5\uffff\1\7\3\uffff\1\5\1\10\6\uffff\1\1\1\6"+
        "\1\uffff\1\3\1\11\2\uffff\1\25\1\24\3\uffff\1\23\1\26\1\uffff\1"+
        "\17\4\uffff\1\20\1\21";
    static final String DFA43_specialS =
        "\u00cb\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\20\1\17\2\uffff\1\17\22\uffff\1\20\1\56\1\32\1\57\1\27\1"+
            "\31\1\44\1\30\1\52\1\53\1\42\1\41\1\55\1\21\1\50\1\36\12\22"+
            "\1\37\1\16\1\35\1\40\1\47\1\51\1\26\32\24\1\10\1\uffff\1\54"+
            "\1\45\1\25\1\uffff\1\6\1\1\1\23\1\7\1\2\1\3\2\23\1\12\4\23\1"+
            "\4\1\11\2\23\1\15\1\23\1\5\1\13\1\23\1\14\3\23\1\33\1\46\1\34"+
            "\1\43",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\60\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\66\1\61\1\65\11\61\1\67\2\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\1\70"+
            "\31\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\71\5\61\1\72\13\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\7\61"+
            "\1\74\11\61\1\73\10\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\75\1\61\1\76\14\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\77\25\61",
            "\1\100",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\21\61"+
            "\1\102\10\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\5\61"+
            "\1\103\24\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\15\61"+
            "\1\104\14\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\7\61"+
            "\1\105\22\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\106\25\61",
            "",
            "",
            "",
            "\12\22\3\uffff\1\107",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\112\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "\1\113\23\uffff\1\32\37\uffff\1\30",
            "",
            "",
            "",
            "\1\115\1\116",
            "\1\121\43\uffff\1\120",
            "\1\124\46\uffff\1\123",
            "\1\126\1\130\77\uffff\1\127",
            "\1\132",
            "\1\134\22\uffff\1\135",
            "\1\137",
            "\1\141\26\uffff\1\142",
            "\1\144",
            "\1\146\76\uffff\1\147",
            "\1\152\1\151",
            "\1\154",
            "",
            "",
            "",
            "",
            "",
            "\1\157\100\uffff\1\156",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\6\61"+
            "\1\161\23\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\3\61"+
            "\1\162\26\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\163\7\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\17\61"+
            "\1\164\12\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\165\16\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\166\16\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\23\61"+
            "\1\167\6\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\24\61"+
            "\1\170\5\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\171\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\172\21\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\3\61"+
            "\1\173\26\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\5\61"+
            "\1\174\24\61",
            "\1\175",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\u0081\7\61\1\u0082\6\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\u0083\21\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u0084\7\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085\17\uffff\1\u0086",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "",
            "\1\u0092",
            "",
            "",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\u0096\21\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u0098\3\61\1\u0099\21\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\21\61"+
            "\1\u009a\10\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u009b\7\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u009e\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\15\61"+
            "\1\u009f\14\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\1\u00a0"+
            "\31\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\u00a2\21\61",
            "",
            "",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u00a4\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\u00a5\21\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\u00a6\16\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\24\61"+
            "\1\u00a7\5\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\15\61"+
            "\1\u00a8\14\61",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\5\61"+
            "\1\u00aa\24\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u00ab\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u00ac\25\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u00af\7\61",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\15\61"+
            "\1\u00b0\14\61",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u00b1\7\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\13\61"+
            "\1\u00b2\16\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u00b3\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\2\61"+
            "\1\u00b4\27\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u00b7\7\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u00ba\25\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u00bb\7\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\4\61"+
            "\1\u00be\25\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\22\61"+
            "\1\u00bf\7\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\3\61"+
            "\1\u00c0\26\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\10\61"+
            "\1\u00c3\21\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\16\61"+
            "\1\u00c5\13\61",
            "",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\15\61"+
            "\1\u00c6\14\61",
            "\1\64\16\uffff\1\u00c7\1\u00c8\10\62\5\uffff\1\64\1\uffff\32"+
            "\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "\1\64\16\uffff\12\62\5\uffff\1\64\1\uffff\32\61\6\uffff\32\61",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT );";
        }
    }
 

}