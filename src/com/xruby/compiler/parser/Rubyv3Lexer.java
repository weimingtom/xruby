// $ANTLR 3.0.1 D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-05 14:15:29

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Rubyv3Lexer extends BaseLexer {
    public static final int STAR=55;
    public static final int CASE_EQUAL=46;
    public static final int EMPTY_ARRAY=118;
    public static final int MOD=29;
    public static final int REST_UNUSE=27;
    public static final int MOD_ASSIGN=58;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=121;
    public static final int SINGLE_QUOTE_STRING_SIMPLE=101;
    public static final int REGEX=84;
    public static final int LEFT_SHIFT_ASSIGN=65;
    public static final int NOT=82;
    public static final int EOF=-1;
    public static final int UNTIL_MODIFIER=36;
    public static final int DIV_ASSIGN=60;
    public static final int LOGICAL_AND=75;
    public static final int STATEMENT=5;
    public static final int T124=124;
    public static final int T123=123;
    public static final int T127=127;
    public static final int T128=128;
    public static final int T125=125;
    public static final int RPAREN=115;
    public static final int T126=126;
    public static final int HEX_PART=95;
    public static final int DOUBLE_QUOTE_STRING_SIMPLE=104;
    public static final int T129=129;
    public static final int ARG=10;
    public static final int NESTED_LHS=24;
    public static final int NOT_EQUAL=76;
    public static final int SYMBOL_NAME=112;
    public static final int WHILE_MODIFIER=35;
    public static final int BODY=9;
    public static final int T131=131;
    public static final int COMMENT=122;
    public static final int T130=130;
    public static final int T135=135;
    public static final int T134=134;
    public static final int T133=133;
    public static final int T132=132;
    public static final int RBRACK=117;
    public static final int UNLESS_MODIFIER=34;
    public static final int HEREDOC_BEGIN=109;
    public static final int INCLUSIVE_RANGE=72;
    public static final int SYMBOL=30;
    public static final int MINUS_ASSIGN=61;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=105;
    public static final int POWER=56;
    public static final int MATCH=47;
    public static final int LCURLY=107;
    public static final int INT=83;
    public static final int GLOBAL_VARIABLE=94;
    public static final int ESCAPE_INT_PART=98;
    public static final int LINE_BREAK=39;
    public static final int WS=40;
    public static final int VARIABLE=16;
    public static final int INSTANCE_VARIABLE=92;
    public static final int LESS_THAN=50;
    public static final int OCTAL=85;
    public static final int SINGLETON_METHOD=25;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=77;
    public static final int BNOT=81;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=111;
    public static final int ARRAY_REF_CALL=32;
    public static final int NON_LEADING0_NUMBER=100;
    public static final int STAR_ID=31;
    public static final int CONTROL_PART=96;
    public static final int LBRACK=116;
    public static final int IF_MODIFIER=33;
    public static final int BXOR_ASSIGN=113;
    public static final int GREATER_OR_EQUAL=49;
    public static final int FLOAT=13;
    public static final int BLOCK_ARG=21;
    public static final int HEREDOC_STRING=12;
    public static final int ID=43;
    public static final int LPAREN=114;
    public static final int IF=7;
    public static final int EXP_PART=89;
    public static final int RESCUE_MODIFIER=37;
    public static final int SINGLE_QUOTE_STRING_COMPLEX=102;
    public static final int BOR_ASSIGN=63;
    public static final int LEADING0_NUMBER=90;
    public static final int COMMA=119;
    public static final int HEX=86;
    public static final int EQUAL=45;
    public static final int BOR=79;
    public static final int RIGHT_SHIFT=52;
    public static final int RIGHT_SHIFT_ASSIGN=66;
    public static final int LOGICAL_OR=74;
    public static final int COMPARE=44;
    public static final int PLUS=53;
    public static final int BXOR=78;
    public static final int DOT=41;
    public static final int EXCLUSIVE_RANGE=73;
    public static final int COLON2=42;
    public static final int MRHS=23;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=91;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int GREATER_THAN=48;
    public static final int LEADING_MARK_DECIMAL=88;
    public static final int LOGICAL_AND_ASSIGN=68;
    public static final int DOUBLE_STRING_CHAR=106;
    public static final int LESS_OR_EQUAL=51;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
    public static final int T137=137;
    public static final int T136=136;
    public static final int T139=139;
    public static final int T138=138;
    public static final int SINGLE_STRING_CHAR=103;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=54;
    public static final int Tokens=140;
    public static final int BAND=80;
    public static final int SEMI=38;
    public static final int META_PART=97;
    public static final int STAR_ASSIGN=67;
    public static final int LOGICAL_OR_ASSIGN=69;
    public static final int COLON=120;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=64;
    public static final int QUESTION=71;
    public static final int CLASS_VARIABLE=93;
    public static final int ESCAPE_INT=99;
    public static final int BLOCK=18;
    public static final int RCURLY=108;
    public static final int PLUS_ASSIGN=62;
    public static final int ASSIGN=57;
    public static final int POWER_ASSIGN=70;
    public static final int COMPLEMENT_ASSIGN=59;
    public static final int BINARY=87;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=20;
    public static final int DIV=28;
    public static final int HEREDOC_INDENT_BEGIN=110;
    public static final int STRING=26;
    
    
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
    
    	public int determineBegin(int begin) {
            int result = 0; //if collide with EOF, then we can use other value like -3,-7 
            if (begin == '[' || begin == '{' || begin == '(' || begin == '<') {
                result = begin;
            } 
            return result;
            }
            public int determineEnd(int begin) {
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
    public String getGrammarFileName() { return "D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    // $ANTLR start T123
    public final void mT123() throws RecognitionException {
        try {
            int _type = T123;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:6: ( 'begin' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:8: 'begin'
            {
            match("begin"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:6: ( 'end' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:8: 'end'
            {
            match("end"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:6: ( 'false' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:8: 'false'
            {
            match("false"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:6: ( 'nil' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:8: 'nil'
            {
            match("nil"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:6: ( 'true' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:8: 'true'
            {
            match("true"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:6: ( 'elsif' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:8: 'elsif'
            {
            match("elsif"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:6: ( 'else' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:8: 'else'
            {
            match("else"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:6: ( 'then' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:8: 'then'
            {
            match("then"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:6: ( 'alias' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: 'alias'
            {
            match("alias"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:6: ( 'def' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: 'def'
            {
            match("def"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:6: ( '[]=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: '[]='
            {
            match("[]="); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:6: ( 'and' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: 'and'
            {
            match("and"); 

            
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:6: ( 'or' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: 'or'
            {
            match("or"); 

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T135

    // $ANTLR start T136
    public final void mT136() throws RecognitionException {
        try {
            int _type = T136;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:6: ( 'not' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: 'not'
            {
            match("not"); 

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T136

    // $ANTLR start T137
    public final void mT137() throws RecognitionException {
        try {
            int _type = T137;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:6: ( 'defined?' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:8: 'defined?'
            {
            match("defined?"); 

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T137

    // $ANTLR start T138
    public final void mT138() throws RecognitionException {
        try {
            int _type = T138;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:6: ( 'expression0' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:8: 'expression0'
            {
            match("expression0"); 

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T138

    // $ANTLR start T139
    public final void mT139() throws RecognitionException {
        try {
            int _type = T139;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:6: ( 'expression1' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:8: 'expression1'
            {
            match("expression1"); 

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T139

    // $ANTLR start IF_MODIFIER
    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:17: ( 'if' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:307:20: 'if'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:17: ( 'unless' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:308:20: 'unless'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:17: ( 'while' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:20: 'while'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:17: ( 'until' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:20: 'until'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:17: ( 'resuce' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:20: 'resuce'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:6: ( ';' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:7: ';'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:2: ( ( '\\r' )? '\\n' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:3: ( '\\r' )? '\\n'
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);
            
            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:346:3: '\\r'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:4: ( ( ' ' | '\\t' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:6: ( ' ' | '\\t' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:2: ( ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:4: ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:4: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);
            
            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:684:4: '-'
                    {
                    match('-'); 
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
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
                    new NoViableAltException("685:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )", 9, 0, input);
            
                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:11: OCTAL
                    {
                    mOCTAL(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:17: HEX
                    {
                    mHEX(); 
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:21: BINARY
                    {
                    mBINARY(); 
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:28: LEADING_MARK_DECIMAL
                    {
                    mLEADING_MARK_DECIMAL(); 
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    {
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
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
                            new NoViableAltException("686:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 5, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:13: '0'
                            {
                            match('0'); 
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:17: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:26: ( ( '_' )? '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);
                                
                                if ( ((LA4_0>='0' && LA4_0<='9')||LA4_0=='_') ) {
                                    alt4=1;
                                }
                                
                            
                                switch (alt4) {
                            	case 1 :
                            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:27: ( '_' )? '0' .. '9'
                            	    {
                            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:27: ( '_' )?
                            	    int alt3=2;
                            	    int LA3_0 = input.LA(1);
                            	    
                            	    if ( (LA3_0=='_') ) {
                            	        alt3=1;
                            	    }
                            	    switch (alt3) {
                            	        case 1 :
                            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:27: '_'
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

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:45: ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);
                    
                    if ( (LA8_0=='.'||LA8_0=='E'||LA8_0=='e') ) {
                        alt8=2;
                    }
                    else {
                        alt8=1;}
                    switch (alt8) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:55: 
                            {
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            {
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
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
                                    new NoViableAltException("686:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 7, 0, input);
                            
                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:58: EXP_PART
                                    {
                                    mEXP_PART(); 
                                    
                                    }
                                    break;
                                case 2 :
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:67: '.' LEADING0_NUMBER ( EXP_PART )?
                                    {
                                    if(input.LA(2) < '0' || input.LA(2) > '9') {_type=INT; this.type = INT; return;}
                                    match('.'); 
                                    mLEADING0_NUMBER(); 
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:170: ( EXP_PART )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);
                                    
                                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:686:170: EXP_PART
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '-' )? ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | ':' | '\\\"' ) )
            int alt14=4;
            int LA14_0 = input.LA(1);
            
            if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='$') ) {
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
                case ':':
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
                    alt14=4;
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
                    alt14=2;
                    }
                    break;
                default:
                    alt14=2;}
            
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("690:1: ID : ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '-' )? ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | ':' | '\\\"' ) );", 14, 0, input);
            
                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();
                    
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:35: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
                    loop10:
                    do {
                        int alt10=4;
                        switch ( input.LA(1) ) {
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
                            alt10=2;
                            }
                            break;
                        case '_':
                            {
                            alt10=3;
                            }
                            break;
                        
                        }
                    
                        switch (alt10) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:36: ( 'a' .. 'z' | 'A' .. 'Z' )
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:60: ( '0' .. '9' )
                    	    {
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:60: ( '0' .. '9' )
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:61: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 
                    	    
                    	    }

                    	    
                    	    }
                    	    break;
                    	case 3 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:690:73: '_'
                    	    {
                    	    match('_'); 
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:18: '$' ( '-' )? ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
                    {
                    match('$'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:22: ( '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);
                    
                    if ( (LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:22: '-'
                            {
                            match('-'); 
                            
                            }
                            break;
                    
                    }

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
                    loop12:
                    do {
                        int alt12=4;
                        switch ( input.LA(1) ) {
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
                            alt12=1;
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
                            alt12=2;
                            }
                            break;
                        case '_':
                            {
                            alt12=3;
                            }
                            break;
                        
                        }
                    
                        switch (alt12) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:28: ( 'a' .. 'z' | 'A' .. 'Z' )
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:52: ( '0' .. '9' )
                    	    {
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:52: ( '0' .. '9' )
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:53: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 
                    	    
                    	    }

                    	    
                    	    }
                    	    break;
                    	case 3 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:691:65: '_'
                    	    {
                    	    match('_'); 
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:692:18: '$' ( '0' .. '9' )+
                    {
                    match('$'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:692:22: ( '0' .. '9' )+
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:692:23: '0' .. '9'
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
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:693:18: '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | ':' | '\\\"' )
                    {
                    match('$'); 
                    if ( (input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||input.LA(1)=='\\'||input.LA(1)=='`'||input.LA(1)=='~' ) {
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
    // $ANTLR end ID

    // $ANTLR start FID
    public final void mFID() throws RecognitionException {
        try {
            int _type = FID;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:695:5: ( ID ( '?' | '!' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:695:7: ID ( '?' | '!' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:2: ( '@' IDENTIFIER_CONSTANT_AND_KEYWORD )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:4: '@' IDENTIFIER_CONSTANT_AND_KEYWORD
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:2: ( '@' INSTANCE_VARIABLE )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:4: '@' INSTANCE_VARIABLE
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:3: ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) )
            int alt17=3;
            int LA17_0 = input.LA(1);
            
            if ( (LA17_0=='$') ) {
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
                    alt17=3;
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
                    alt17=1;
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
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("701:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 17, 1, input);
                
                    throw nvae;
                }
            
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("701:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 17, 0, input);
            
                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:5: '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD
                    {
                    match('$'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:9: ( '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);
                    
                    if ( (LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:10: '-'
                            {
                            match('-'); 
                            
                            }
                            break;
                    
                    }

                    mIDENTIFIER_CONSTANT_AND_KEYWORD(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:703:5: '$' ( options {greedy=true; } : '0' .. '9' )+
                    {
                    match('$'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:703:9: ( options {greedy=true; } : '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);
                        
                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }
                        
                    
                        switch (alt16) {
                    	case 1 :
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:703:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 
                    	    
                    	    }
                    	    break;
                    
                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:704:5: '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:708:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:708:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:708:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);
                
                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }
                
            
                switch (alt18) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
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
            	    break loop18;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:7: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:13: ( '_' )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            
            if ( (LA19_0=='_') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:13: '_'
                    {
                    match('_'); 
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:18: ( '0' .. '7' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:19: '0' .. '7'
            {
            matchRange('0','7'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:29: ( ( '_' )? '0' .. '7' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);
                
                if ( ((LA21_0>='0' && LA21_0<='7')||LA21_0=='_') ) {
                    alt21=1;
                }
                
            
                switch (alt21) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:30: ( '_' )? '0' .. '7'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:30: ( '_' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);
            	    
            	    if ( (LA20_0=='_') ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:717:30: '_'
            	            {
            	            match('_'); 
            	            
            	            }
            	            break;
            	    
            	    }

            	    matchRange('0','7'); 
            	    
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
    // $ANTLR end OCTAL

    // $ANTLR start LEADING_MARK_DECIMAL
    public final void mLEADING_MARK_DECIMAL() throws RecognitionException {
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:719:22: ( ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:1: ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:1: ( '0d' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:2: '0d'
            {
            match("0d"); 

            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:8: ( '0' .. '9' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:9: '0' .. '9'
            {
            matchRange('0','9'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:19: ( ( '_' )? '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);
                
                if ( ((LA23_0>='0' && LA23_0<='9')||LA23_0=='_') ) {
                    alt23=1;
                }
                
            
                switch (alt23) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:20: ( '_' )? '0' .. '9'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:20: ( '_' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);
            	    
            	    if ( (LA22_0=='_') ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:720:20: '_'
            	            {
            	            match('_'); 
            	            
            	            }
            	            break;
            	    
            	    }

            	    matchRange('0','9'); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop23;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:5: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:21: ( ( '_' )? HEX_PART )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);
                
                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='F')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='f')) ) {
                    alt25=1;
                }
                
            
                switch (alt25) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:22: ( '_' )? HEX_PART
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:22: ( '_' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);
            	    
            	    if ( (LA24_0=='_') ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:722:22: '_'
            	            {
            	            match('_'); 
            	            
            	            }
            	            break;
            	    
            	    }

            	    mHEX_PART(); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop25;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:725:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:725:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:8: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:14: ( '0' .. '1' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:15: '0' .. '1'
            {
            matchRange('0','1'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:25: ( ( '_' )? '0' .. '1' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);
                
                if ( ((LA27_0>='0' && LA27_0<='1')||LA27_0=='_') ) {
                    alt27=1;
                }
                
            
                switch (alt27) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:26: ( '_' )? '0' .. '1'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:26: ( '_' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);
            	    
            	    if ( (LA26_0=='_') ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:729:26: '_'
            	            {
            	            match('_'); 
            	            
            	            }
            	            break;
            	    
            	    }

            	    matchRange('0','1'); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop27;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:2: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:23: ( CONTROL_PART | META_PART )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);
                
                if ( (LA28_0=='\\') ) {
                    int LA28_1 = input.LA(2);
                    
                    if ( (LA28_1=='M') ) {
                        alt28=2;
                    }
                    else if ( (LA28_1=='C'||LA28_1=='c') ) {
                        alt28=1;
                    }
                    
                
                }
                
            
                switch (alt28) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 
            	    
            	    }
            	    break;
            	case 2 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:37: META_PART
            	    {
            	    mMETA_PART(); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop28;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            int alt29=3;
            int LA29_0 = input.LA(1);
            
            if ( (LA29_0=='\\') ) {
                int LA29_1 = input.LA(2);
                
                if ( ((LA29_1>='\u0000' && LA29_1<='B')||(LA29_1>='D' && LA29_1<='L')||(LA29_1>='N' && LA29_1<='b')||(LA29_1>='d' && LA29_1<='\uFFFE')) ) {
                    alt29=3;
                }
                else {
                    alt29=1;}
            }
            else if ( ((LA29_0>='\u0093' && LA29_0<='\u0255')) ) {
                alt29=2;
            }
            else if ( ((LA29_0>='\u0000' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\u0091')) ) {
                alt29=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("733:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 29, 0, input);
            
                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:94: ESCAPE_INT_PART
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:2: ( ( '\\\\C-' | '\\\\c' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:4: ( '\\\\C-' | '\\\\c' )
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:4: ( '\\\\C-' | '\\\\c' )
            int alt30=2;
            int LA30_0 = input.LA(1);
            
            if ( (LA30_0=='\\') ) {
                int LA30_1 = input.LA(2);
                
                if ( (LA30_1=='c') ) {
                    alt30=2;
                }
                else if ( (LA30_1=='C') ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("737:4: ( '\\\\C-' | '\\\\c' )", 30, 1, input);
                
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("737:4: ( '\\\\C-' | '\\\\c' )", 30, 0, input);
            
                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:5: '\\\\C-'
                    {
                    match("\\C-"); 

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:12: '\\\\c'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:741:2: ( '\\\\M-' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:741:4: '\\\\M-'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:2: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:3: ( '1' .. '9' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:4: '1' .. '9'
            {
            matchRange('1','9'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:14: ( ( '_' )? '0' .. '9' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);
                
                if ( ((LA32_0>='0' && LA32_0<='9')||LA32_0=='_') ) {
                    alt32=1;
                }
                
            
                switch (alt32) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:15: ( '_' )? '0' .. '9'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:15: ( '_' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);
            	    
            	    if ( (LA31_0=='_') ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:746:15: '_'
            	            {
            	            match('_'); 
            	            
            	            }
            	            break;
            	    
            	    }

            	    matchRange('0','9'); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop32;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:2: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:3: ( '0' .. '9' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:4: '0' .. '9'
            {
            matchRange('0','9'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:14: ( ( '_' )? '0' .. '9' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);
                
                if ( ((LA34_0>='0' && LA34_0<='9')||LA34_0=='_') ) {
                    alt34=1;
                }
                
            
                switch (alt34) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:15: ( '_' )? '0' .. '9'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:15: ( '_' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);
            	    
            	    if ( (LA33_0=='_') ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:749:15: '_'
            	            {
            	            match('_'); 
            	            
            	            }
            	            break;
            	    
            	    }

            	    matchRange('0','9'); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop34;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:9: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:23: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);
            
            if ( (LA35_0=='-') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:751:23: '-'
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

    // $ANTLR start SINGLE_QUOTE_STRING_SIMPLE
    public final void mSINGLE_QUOTE_STRING_SIMPLE() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE_STRING_SIMPLE;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:2: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:4: '\\'' ( SINGLE_STRING_CHAR )* '\\''
            {
            match('\''); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:9: ( SINGLE_STRING_CHAR )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);
                
                if ( ((LA36_0>='\u0000' && LA36_0<='&')||(LA36_0>='(' && LA36_0<='\uFFFE')) ) {
                    alt36=1;
                }
                
            
                switch (alt36) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:9: SINGLE_STRING_CHAR
            	    {
            	    mSINGLE_STRING_CHAR(); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop36;
                }
            } while (true);

            match('\''); 
            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SINGLE_QUOTE_STRING_SIMPLE

    // $ANTLR start SINGLE_QUOTE_STRING_COMPLEX
    public final void mSINGLE_QUOTE_STRING_COMPLEX() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE_STRING_COMPLEX;
            int begin;
            int tmp;
    
            int end=0; int nested=0;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:33: ( '%q' begin= . (tmp= . )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:35: '%q' begin= . (tmp= . )*
            {
            match("%q"); 

            begin = input.LA(1);
            matchAny(); 
            System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:134: (tmp= . )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);
                
                if ( ((LA37_0>='\u0000' && LA37_0<='\uFFFE')) ) {
                    alt37=1;
                }
                
            
                switch (alt37) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:764:135: tmp= .
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
            	                                    this.type=SINGLE_QUOTE_STRING_COMPLEX;
            	                                    return;
            	                                    }
            	                                    nested --;
            	                                }
            	                                
            	    
            	    }
            	    break;
            
            	default :
            	    break loop37;
                }
            } while (true);

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SINGLE_QUOTE_STRING_COMPLEX

    // $ANTLR start DOUBLE_QUOTE_STRING_SIMPLE
    public final void mDOUBLE_QUOTE_STRING_SIMPLE() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE_STRING_SIMPLE;
            int s;
    
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:789:2: (s= '\"' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:789:4: s= '\"'
            {
            s = input.LA(1);
            match('\"'); 
            expression = new DoubleStringParser(this.parser, input, '"', 0).parseString();
            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_QUOTE_STRING_SIMPLE

    // $ANTLR start DOUBLE_QUOTE_STRING_COMPLEX
    public final void mDOUBLE_QUOTE_STRING_COMPLEX() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE_STRING_COMPLEX;
            int begin;
    
            int end=0; int nested=0;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:793:33: ( '%Q' begin= . )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:793:35: '%Q' begin= .
            {
            match("%Q"); 

            begin = input.LA(1);
            matchAny(); 
            end=determineEnd(begin);begin=determineBegin(begin); 
            	expression = new DoubleStringParser(this.parser, input, end, begin).parseString(); 
            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_QUOTE_STRING_COMPLEX

    // $ANTLR start SINGLE_STRING_CHAR
    public final void mSINGLE_STRING_CHAR() throws RecognitionException {
        try {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:4: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);
            
            if ( (LA38_0=='\\') ) {
                alt38=1;
            }
            else if ( ((LA38_0>='\u0000' && LA38_0<='&')||(LA38_0>='(' && LA38_0<='[')||(LA38_0>=']' && LA38_0<='\uFFFE')) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("797:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 38, 0, input);
            
                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:799:15: ~ ( '\\\\' | '\\'' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:802:2: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);
            
            if ( (LA39_0=='\\') ) {
                alt39=1;
            }
            else if ( ((LA39_0>='\u0000' && LA39_0<='!')||(LA39_0>='#' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFE')) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("800:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 39, 0, input);
            
                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:802:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:802:13: ~ ( '\\\\' | '\"' )
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

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:9: ( '{' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:11: '{'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:9: ( '}' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:816:11: '}'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:829:2: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt42=3;
            int LA42_0 = input.LA(1);
            
            if ( (LA42_0=='\\') ) {
                int LA42_1 = input.LA(2);
                
                if ( (LA42_1=='x') ) {
                    alt42=2;
                }
                else if ( ((LA42_1>='\u0000' && LA42_1<='/')||(LA42_1>='8' && LA42_1<='B')||(LA42_1>='D' && LA42_1<='L')||(LA42_1>='N' && LA42_1<='b')||(LA42_1>='d' && LA42_1<='w')||(LA42_1>='y' && LA42_1<='\uFFFE')) ) {
                    alt42=3;
                }
                else if ( ((LA42_1>='0' && LA42_1<='7')) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("827:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 42, 1, input);
                
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("827:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 42, 0, input);
            
                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:829:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:829:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt40=3;
                    int LA40_0 = input.LA(1);
                    
                    if ( ((LA40_0>='0' && LA40_0<='7')) ) {
                        int LA40_1 = input.LA(2);
                        
                        if ( ((LA40_1>='0' && LA40_1<='7')) ) {
                            int LA40_2 = input.LA(3);
                            
                            if ( ((LA40_2>='0' && LA40_2<='7')) ) {
                                alt40=3;
                            }
                            else {
                                alt40=2;}
                        }
                        else {
                            alt40=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("829:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 40, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:829:10: '0' .. '7'
                            {
                            matchRange('0','7'); 
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:829:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 
                            
                            }
                            break;
                        case 3 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:829:41: '0' .. '7' '0' .. '7' '0' .. '7'
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:830:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:830:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt41=2;
                    int LA41_0 = input.LA(1);
                    
                    if ( ((LA41_0>='0' && LA41_0<='9')||(LA41_0>='A' && LA41_0<='F')||(LA41_0>='a' && LA41_0<='f')) ) {
                        int LA41_1 = input.LA(2);
                        
                        if ( ((LA41_1>='0' && LA41_1<='9')||(LA41_1>='A' && LA41_1<='F')||(LA41_1>='a' && LA41_1<='f')) ) {
                            alt41=2;
                        }
                        else {
                            alt41=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("830:19: ( HEX_PART | HEX_PART HEX_PART )", 41, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:830:20: HEX_PART
                            {
                            mHEX_PART(); 
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:830:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 
                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:831:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:835:2: ( '<<' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:835:4: '<<'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:838:2: ( '<<-' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:838:4: '<<-'
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

    // $ANTLR start REGEX
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:861:7: ( '/abc/' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:861:9: '/abc/'
            {
            match("/abc/"); 

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REGEX

    // $ANTLR start SYMBOL_NAME
    public final void mSYMBOL_NAME() throws RecognitionException {
        try {
            int _type = SYMBOL_NAME;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:2: ( ( 'a' .. 'z' | 'A' .. 'Z' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:4: ( 'a' .. 'z' | 'A' .. 'Z' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:4: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);
                
                if ( ((LA43_0>='A' && LA43_0<='Z')||(LA43_0>='a' && LA43_0<='z')) ) {
                    alt43=1;
                }
                
            
                switch (alt43) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
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
            
            	default :
            	    break loop43;
                }
            } while (true);

            
            }
    
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SYMBOL_NAME

    // $ANTLR start ASSIGN
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:25: ( '=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:27: '='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:871:15: ( '+=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:871:17: '+='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:872:15: ( '-=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:872:17: '-='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:15: ( '*=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:873:17: '*='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:874:13: ( '/=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:874:15: '/='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:875:13: ( '%=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:875:15: '%='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:21: ( '~=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:25: '~='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:877:15: ( '**=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:877:17: '**='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:878:15: ( '&=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:878:17: '&='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:879:15: ( '^=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:879:17: '^='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:880:14: ( '|=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:880:16: '|='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:881:19: ( '<<=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:881:21: '<<='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:882:20: ( '>>=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:882:22: '>>='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:883:20: ( '&&=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:883:22: '&&='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:884:19: ( '||=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:884:21: '||='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:885:21: ( '..' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:885:23: '..'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:886:21: ( '...' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:886:23: '...'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:888:10: ( '=>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:888:12: '=>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:889:15: ( '&&' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:889:17: '&&'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:890:14: ( '||' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:890:16: '||'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:892:12: ( '?' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:892:14: '?'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:893:11: ( '(' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:893:13: '('
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:894:11: ( ')' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:894:13: ')'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:895:11: ( '[' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:895:13: '['
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:896:11: ( ']' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:896:13: ']'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:897:14: ( '[]' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:897:16: '[]'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:900:10: ( ',' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:900:12: ','
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:901:10: ( ':' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:901:12: ':'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:902:5: ( '.' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:902:7: '.'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:903:11: ( '::' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:903:13: '::'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:905:9: ( '!' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:905:11: '!'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:906:9: ( '~' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:906:11: '~'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:907:8: ( '/' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:907:10: '/'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:908:9: ( '+' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:908:11: '+'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:909:10: ( '-' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:909:12: '-'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:910:8: ( '%' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:910:10: '%'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:911:9: ( '*' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:911:11: '*'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:13: ( '<' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:15: '<'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:913:15: ( '>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:913:17: '>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:914:9: ( '^' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:914:11: '^'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:915:9: ( '|' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:915:11: '|'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:916:9: ( '&' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:916:11: '&'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:917:10: ( '**' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:917:12: '**'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:918:12: ( '<=>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:918:14: '<=>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:919:18: ( '>=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:919:20: '>='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:920:16: ( '<=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:920:18: '<='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:921:10: ( '==' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:921:12: '=='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:922:14: ( '===' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:922:16: '==='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:923:13: ( '!=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:923:15: '!='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:924:10: ( '=~' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:924:12: '=~'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:925:13: ( '!~' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:925:15: '!~'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:927:15: ( '>>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:927:17: '>>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:930:3: ( '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:930:5: '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:937:3: ( (~ ( '\\r' | '\\n' ) )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:937:5: (~ ( '\\r' | '\\n' ) )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:937:5: (~ ( '\\r' | '\\n' ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);
                
                if ( ((LA44_0>='\u0000' && LA44_0<='\t')||(LA44_0>='\u000B' && LA44_0<='\f')||(LA44_0>='\u000E' && LA44_0<='\uFFFE')) ) {
                    alt44=1;
                }
                
            
                switch (alt44) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:937:6: ~ ( '\\r' | '\\n' )
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
            	    break loop44;
                }
            } while (true);

            
            }

        }
        finally {
        }
    }
    // $ANTLR end ANYTHING_OTHER_THAN_LINE_FEED

    public void mTokens() throws RecognitionException {
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:8: ( T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX | DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | REGEX | SYMBOL_NAME | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT )
        int alt45=94;
        alt45 = dfa45.predict(input);
        switch (alt45) {
            case 1 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T123
                {
                mT123(); 
                
                }
                break;
            case 2 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:15: T124
                {
                mT124(); 
                
                }
                break;
            case 3 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:20: T125
                {
                mT125(); 
                
                }
                break;
            case 4 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:25: T126
                {
                mT126(); 
                
                }
                break;
            case 5 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T127
                {
                mT127(); 
                
                }
                break;
            case 6 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:35: T128
                {
                mT128(); 
                
                }
                break;
            case 7 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:40: T129
                {
                mT129(); 
                
                }
                break;
            case 8 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:45: T130
                {
                mT130(); 
                
                }
                break;
            case 9 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T131
                {
                mT131(); 
                
                }
                break;
            case 10 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:55: T132
                {
                mT132(); 
                
                }
                break;
            case 11 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:60: T133
                {
                mT133(); 
                
                }
                break;
            case 12 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:65: T134
                {
                mT134(); 
                
                }
                break;
            case 13 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:70: T135
                {
                mT135(); 
                
                }
                break;
            case 14 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:75: T136
                {
                mT136(); 
                
                }
                break;
            case 15 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:80: T137
                {
                mT137(); 
                
                }
                break;
            case 16 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:85: T138
                {
                mT138(); 
                
                }
                break;
            case 17 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:90: T139
                {
                mT139(); 
                
                }
                break;
            case 18 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:95: IF_MODIFIER
                {
                mIF_MODIFIER(); 
                
                }
                break;
            case 19 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:107: UNLESS_MODIFIER
                {
                mUNLESS_MODIFIER(); 
                
                }
                break;
            case 20 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:123: WHILE_MODIFIER
                {
                mWHILE_MODIFIER(); 
                
                }
                break;
            case 21 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:138: UNTIL_MODIFIER
                {
                mUNTIL_MODIFIER(); 
                
                }
                break;
            case 22 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:153: RESCUE_MODIFIER
                {
                mRESCUE_MODIFIER(); 
                
                }
                break;
            case 23 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:169: SEMI
                {
                mSEMI(); 
                
                }
                break;
            case 24 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:174: LINE_BREAK
                {
                mLINE_BREAK(); 
                
                }
                break;
            case 25 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:185: WS
                {
                mWS(); 
                
                }
                break;
            case 26 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:188: INT
                {
                mINT(); 
                
                }
                break;
            case 27 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:192: ID
                {
                mID(); 
                
                }
                break;
            case 28 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:195: FID
                {
                mFID(); 
                
                }
                break;
            case 29 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:199: INSTANCE_VARIABLE
                {
                mINSTANCE_VARIABLE(); 
                
                }
                break;
            case 30 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:217: CLASS_VARIABLE
                {
                mCLASS_VARIABLE(); 
                
                }
                break;
            case 31 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:232: GLOBAL_VARIABLE
                {
                mGLOBAL_VARIABLE(); 
                
                }
                break;
            case 32 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:248: SINGLE_QUOTE_STRING_SIMPLE
                {
                mSINGLE_QUOTE_STRING_SIMPLE(); 
                
                }
                break;
            case 33 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:275: SINGLE_QUOTE_STRING_COMPLEX
                {
                mSINGLE_QUOTE_STRING_COMPLEX(); 
                
                }
                break;
            case 34 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:303: DOUBLE_QUOTE_STRING_SIMPLE
                {
                mDOUBLE_QUOTE_STRING_SIMPLE(); 
                
                }
                break;
            case 35 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:330: DOUBLE_QUOTE_STRING_COMPLEX
                {
                mDOUBLE_QUOTE_STRING_COMPLEX(); 
                
                }
                break;
            case 36 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:358: LCURLY
                {
                mLCURLY(); 
                
                }
                break;
            case 37 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:365: RCURLY
                {
                mRCURLY(); 
                
                }
                break;
            case 38 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:372: HEREDOC_BEGIN
                {
                mHEREDOC_BEGIN(); 
                
                }
                break;
            case 39 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:386: HEREDOC_INDENT_BEGIN
                {
                mHEREDOC_INDENT_BEGIN(); 
                
                }
                break;
            case 40 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:407: REGEX
                {
                mREGEX(); 
                
                }
                break;
            case 41 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:413: SYMBOL_NAME
                {
                mSYMBOL_NAME(); 
                
                }
                break;
            case 42 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:425: ASSIGN
                {
                mASSIGN(); 
                
                }
                break;
            case 43 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:432: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 
                
                }
                break;
            case 44 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:444: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 
                
                }
                break;
            case 45 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:457: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 
                
                }
                break;
            case 46 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:469: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 
                
                }
                break;
            case 47 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:480: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 
                
                }
                break;
            case 48 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:491: COMPLEMENT_ASSIGN
                {
                mCOMPLEMENT_ASSIGN(); 
                
                }
                break;
            case 49 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:509: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 
                
                }
                break;
            case 50 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:522: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 
                
                }
                break;
            case 51 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:534: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 
                
                }
                break;
            case 52 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:546: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 
                
                }
                break;
            case 53 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:557: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 
                
                }
                break;
            case 54 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:575: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 
                
                }
                break;
            case 55 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:594: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 
                
                }
                break;
            case 56 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:613: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 
                
                }
                break;
            case 57 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:631: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 
                
                }
                break;
            case 58 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:647: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 
                
                }
                break;
            case 59 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:663: ASSOC
                {
                mASSOC(); 
                
                }
                break;
            case 60 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:669: LOGICAL_AND
                {
                mLOGICAL_AND(); 
                
                }
                break;
            case 61 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:681: LOGICAL_OR
                {
                mLOGICAL_OR(); 
                
                }
                break;
            case 62 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:692: QUESTION
                {
                mQUESTION(); 
                
                }
                break;
            case 63 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:701: LPAREN
                {
                mLPAREN(); 
                
                }
                break;
            case 64 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:708: RPAREN
                {
                mRPAREN(); 
                
                }
                break;
            case 65 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:715: LBRACK
                {
                mLBRACK(); 
                
                }
                break;
            case 66 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:722: RBRACK
                {
                mRBRACK(); 
                
                }
                break;
            case 67 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:729: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 
                
                }
                break;
            case 68 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:741: COMMA
                {
                mCOMMA(); 
                
                }
                break;
            case 69 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:747: COLON
                {
                mCOLON(); 
                
                }
                break;
            case 70 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:753: DOT
                {
                mDOT(); 
                
                }
                break;
            case 71 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:757: COLON2
                {
                mCOLON2(); 
                
                }
                break;
            case 72 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:764: NOT
                {
                mNOT(); 
                
                }
                break;
            case 73 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:768: BNOT
                {
                mBNOT(); 
                
                }
                break;
            case 74 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:773: DIV
                {
                mDIV(); 
                
                }
                break;
            case 75 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:777: PLUS
                {
                mPLUS(); 
                
                }
                break;
            case 76 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:782: MINUS
                {
                mMINUS(); 
                
                }
                break;
            case 77 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:788: MOD
                {
                mMOD(); 
                
                }
                break;
            case 78 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:792: STAR
                {
                mSTAR(); 
                
                }
                break;
            case 79 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:797: LESS_THAN
                {
                mLESS_THAN(); 
                
                }
                break;
            case 80 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:807: GREATER_THAN
                {
                mGREATER_THAN(); 
                
                }
                break;
            case 81 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:820: BXOR
                {
                mBXOR(); 
                
                }
                break;
            case 82 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:825: BOR
                {
                mBOR(); 
                
                }
                break;
            case 83 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:829: BAND
                {
                mBAND(); 
                
                }
                break;
            case 84 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:834: POWER
                {
                mPOWER(); 
                
                }
                break;
            case 85 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:840: COMPARE
                {
                mCOMPARE(); 
                
                }
                break;
            case 86 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:848: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 
                
                }
                break;
            case 87 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:865: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 
                
                }
                break;
            case 88 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:879: EQUAL
                {
                mEQUAL(); 
                
                }
                break;
            case 89 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:885: CASE_EQUAL
                {
                mCASE_EQUAL(); 
                
                }
                break;
            case 90 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:896: NOT_EQUAL
                {
                mNOT_EQUAL(); 
                
                }
                break;
            case 91 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:906: MATCH
                {
                mMATCH(); 
                
                }
                break;
            case 92 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:912: NOT_MATCH
                {
                mNOT_MATCH(); 
                
                }
                break;
            case 93 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:922: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 
                
                }
                break;
            case 94 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:934: COMMENT
                {
                mCOMMENT(); 
                
                }
                break;
        
        }
    
    }


    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA45_eotS =
        "\1\36\7\61\1\102\5\61\3\uffff\1\111\1\uffff\2\61\2\uffff\1\126\3"+
        "\uffff\1\131\1\134\1\61\1\uffff\1\141\1\143\1\146\1\150\1\153\1"+
        "\155\1\160\1\163\1\165\5\uffff\1\167\1\172\1\uffff\1\61\1\uffff"+
        "\3\61\1\uffff\13\61\1\u0088\1\uffff\1\u0089\1\u008a\3\61\2\uffff"+
        "\7\61\6\uffff\1\u0096\1\u0099\4\uffff\1\61\1\u009b\5\uffff\1\u009d"+
        "\4\uffff\1\u009f\5\uffff\1\u00a1\2\uffff\1\u00a3\1\uffff\1\u00a5"+
        "\6\uffff\1\61\1\u00a7\3\61\1\u00ac\1\u00ad\2\61\1\u00b0\1\61\1\u00b3"+
        "\4\uffff\12\61\21\uffff\1\61\1\uffff\2\61\1\u00bb\1\61\2\uffff\1"+
        "\u00bd\1\u00be\1\uffff\2\61\1\uffff\4\61\1\u00c5\1\61\1\u00c7\1"+
        "\uffff\1\u00c8\2\uffff\1\u00c9\2\61\1\u00cc\1\u00cd\1\61\1\uffff"+
        "\1\61\3\uffff\1\61\1\u00d1\2\uffff\1\u00d2\2\61\2\uffff\1\61\1\uffff"+
        "\1\61\1\uffff\1\61\1\u00da\1\u00db\2\uffff";
    static final String DFA45_eofS =
        "\u00dc\uffff";
    static final String DFA45_minS =
        "\1\11\7\41\1\135\5\41\3\uffff\1\60\1\uffff\2\41\1\100\1\uffff\1"+
        "\75\3\uffff\1\74\1\75\1\41\1\uffff\2\75\1\52\1\75\1\46\3\75\1\56"+
        "\5\uffff\1\72\1\75\1\uffff\1\41\1\uffff\3\41\1\uffff\13\41\1\75"+
        "\1\uffff\5\41\2\uffff\7\41\6\uffff\1\76\1\55\4\uffff\1\41\1\75\5"+
        "\uffff\1\75\4\uffff\1\75\5\uffff\1\75\2\uffff\1\75\1\uffff\1\56"+
        "\6\uffff\14\41\4\uffff\12\41\21\uffff\1\41\1\uffff\4\41\2\uffff"+
        "\2\41\1\uffff\2\41\1\uffff\7\41\1\uffff\1\41\2\uffff\6\41\1\uffff"+
        "\1\41\3\uffff\2\41\2\uffff\3\41\2\uffff\1\41\1\uffff\1\41\1\uffff"+
        "\3\41\2\uffff";
    static final String DFA45_maxS =
        "\1\176\7\172\1\135\5\172\3\uffff\1\75\1\uffff\1\172\1\176\1\172"+
        "\1\uffff\1\161\3\uffff\1\75\1\141\1\172\1\uffff\1\176\5\75\1\174"+
        "\1\76\1\56\5\uffff\1\72\1\176\1\uffff\1\172\1\uffff\3\172\1\uffff"+
        "\13\172\1\75\1\uffff\5\172\2\uffff\2\77\4\172\1\77\6\uffff\1\76"+
        "\1\75\4\uffff\1\172\1\75\5\uffff\1\75\4\uffff\1\75\5\uffff\1\75"+
        "\2\uffff\1\75\1\uffff\1\56\6\uffff\14\172\4\uffff\12\172\21\uffff"+
        "\1\172\1\uffff\4\172\2\uffff\2\172\1\uffff\2\172\1\uffff\7\172\1"+
        "\uffff\1\172\2\uffff\6\172\1\uffff\1\172\3\uffff\2\172\2\uffff\3"+
        "\172\2\uffff\1\172\1\uffff\1\172\1\uffff\3\172\2\uffff";
    static final String DFA45_acceptS =
        "\16\uffff\1\27\1\30\1\31\1\uffff\1\32\3\uffff\1\40\1\uffff\1\42"+
        "\1\44\1\45\3\uffff\1\51\11\uffff\1\76\1\77\1\100\1\102\1\104\2\uffff"+
        "\1\136\1\uffff\1\33\3\uffff\1\34\14\uffff\1\101\5\uffff\1\54\1\114"+
        "\7\uffff\1\36\1\35\1\43\1\41\1\57\1\115\2\uffff\1\117\1\56\1\50"+
        "\1\112\2\uffff\1\73\1\133\1\52\1\53\1\113\1\uffff\1\55\1\116\1\60"+
        "\1\111\1\uffff\1\62\1\123\1\63\1\121\1\64\1\uffff\1\122\1\126\1"+
        "\uffff\1\120\1\uffff\1\106\1\107\1\105\1\132\1\134\1\110\14\uffff"+
        "\1\13\1\103\1\15\1\22\12\uffff\1\125\1\127\1\47\1\65\1\46\1\131"+
        "\1\130\1\61\1\124\1\67\1\74\1\70\1\75\1\66\1\135\1\72\1\71\1\uffff"+
        "\1\2\4\uffff\1\16\1\4\2\uffff\1\14\2\uffff\1\12\7\uffff\1\7\1\uffff"+
        "\1\5\1\10\6\uffff\1\1\1\uffff\1\6\1\3\1\11\2\uffff\1\25\1\24\3\uffff"+
        "\1\23\1\26\1\uffff\1\17\1\uffff\1\17\3\uffff\1\21\1\20";
    static final String DFA45_specialS =
        "\u00dc\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\20\1\17\2\uffff\1\17\22\uffff\1\20\1\56\1\30\1\57\1\24\1"+
            "\27\1\43\1\26\1\51\1\52\1\41\1\40\1\54\1\21\1\47\1\34\12\22"+
            "\1\55\1\16\1\33\1\37\1\46\1\50\1\25\32\23\1\10\1\uffff\1\53"+
            "\1\44\1\35\1\uffff\1\6\1\1\1\23\1\7\1\2\1\3\2\23\1\12\4\23\1"+
            "\4\1\11\2\23\1\15\1\23\1\5\1\13\1\23\1\14\3\23\1\31\1\45\1\32"+
            "\1\42",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\60\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\70\1\62\1\66\11\62\1\67\2\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\1\71\31\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\73\5\62\1\72\13\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\7\62\1\75\11\62\1\74\10\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\77\1\62\1\76\14\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\100\25\62",
            "\1\101",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\21\62\1\103\10\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\104\24\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\105\14\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\7\62\1\106\22\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\107\25\62",
            "",
            "",
            "",
            "\12\22\3\uffff\1\110",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\112\1\120\1\uffff\1\120\1\uffff\2\120\2\uffff\3\120\1\115"+
            "\2\120\12\114\1\113\4\120\1\112\1\120\32\116\1\uffff\1\120\2"+
            "\uffff\1\117\1\120\32\116\3\uffff\1\120",
            "\1\121\32\122\4\uffff\1\122\1\uffff\32\122",
            "",
            "\1\125\23\uffff\1\123\37\uffff\1\124",
            "",
            "",
            "",
            "\1\130\1\127",
            "\1\132\43\uffff\1\133",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\135\4\uffff\1\64"+
            "\1\uffff\32\135",
            "",
            "\1\136\1\137\77\uffff\1\140",
            "\1\142",
            "\1\144\22\uffff\1\145",
            "\1\147",
            "\1\151\26\uffff\1\152",
            "\1\154",
            "\1\156\76\uffff\1\157",
            "\1\161\1\162",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\170\100\uffff\1\171",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\6\62\1\173\23\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\135\4\uffff\1\64"+
            "\1\uffff\32\135",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\135\4\uffff\1\64"+
            "\1\uffff\32\135",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\174\26\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\17\62\1\175\12\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\176\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\177\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\23\62\1\u0080\6\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u0081\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\24\62\1\u0082\5\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u0083\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\u0084\26\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u0085\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\u0086\24\62",
            "\1\u0087",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u008b\7\62\1\u008c\6\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u008d\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u008e\7\62",
            "",
            "",
            "\1\65\35\uffff\1\65",
            "\1\65\35\uffff\1\65",
            "\1\65\16\uffff\12\114\5\uffff\1\65\1\uffff\32\u008f\4\uffff"+
            "\1\u0090\1\uffff\32\u008f",
            "\1\65\16\uffff\12\u0091\5\uffff\1\65\1\uffff\32\116\4\uffff"+
            "\1\117\1\uffff\32\116",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0092\4\uffff"+
            "\1\u0094\1\uffff\32\u0092",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0092\4\uffff"+
            "\1\u0094\1\uffff\32\u0092",
            "\1\65\35\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0097\17\uffff\1\u0098",
            "",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\135\4\uffff\1\64"+
            "\1\uffff\32\135",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "",
            "",
            "\1\u00a2",
            "",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00a6\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\21\62\1\u00a8\10\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00aa\3\62\1\u00a9\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00ab\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00ae\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00af\14\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\1\u00b1\31\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00b2\21\62",
            "",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00b4\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00b5\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u00b6\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\24\62\1\u00b7\5\62",
            "\1\65\16\uffff\12\u0091\5\uffff\1\65\1\uffff\32\u008f\4\uffff"+
            "\1\u0090\1\uffff\32\u008f",
            "\1\65\16\uffff\12\u0091\5\uffff\1\65\1\uffff\32\u008f\4\uffff"+
            "\1\u0090\1\uffff\32\u008f",
            "\1\65\16\uffff\12\u0091\5\uffff\1\65\1\uffff\32\u008f\4\uffff"+
            "\1\u0090\1\uffff\32\u008f",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0092\4\uffff"+
            "\1\u0094\1\uffff\32\u0092",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0092\4\uffff"+
            "\1\u0094\1\uffff\32\u0092",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0092\4\uffff"+
            "\1\u0094\1\uffff\32\u0092",
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
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00b8\14\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00b9\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\u00ba\24\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00bc\25\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00bf\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00c0\14\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c1\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u00c2\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00c3\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\2\62\1\u00c4\27\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c6\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00ca\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00cb\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00ce\25\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00cf\7\62",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\u00d0\26\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00d3\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\u00d4\1\uffff\32\62\4\uffff\1"+
            "\64\1\uffff\32\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\16\62\1\u00d5\13\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00d7\14\62",
            "",
            "\1\65\16\uffff\1\u00d9\1\u00d8\10\63\5\uffff\1\65\1\uffff\32"+
            "\62\4\uffff\1\64\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\135\4\uffff\1\64"+
            "\1\uffff\32\135",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\135\4\uffff\1\64"+
            "\1\uffff\32\135",
            "",
            ""
    };
    
    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;
    
    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }
    
    class DFA45 extends DFA {
    
        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX | DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | REGEX | SYMBOL_NAME | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT );";
        }
    }
 

}