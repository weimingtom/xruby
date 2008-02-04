// $ANTLR 3.0.1 D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-04 15:32:44

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Rubyv3Lexer extends BaseLexer {
    public static final int STAR=54;
    public static final int CASE_EQUAL=45;
    public static final int EMPTY_ARRAY=118;
    public static final int MOD=29;
    public static final int REST_UNUSE=27;
    public static final int MOD_ASSIGN=57;
    public static final int FID=15;
    public static final int ANYTHING_OTHER_THAN_LINE_FEED=121;
    public static final int SINGLE_QUOTE_STRING_SIMPLE=101;
    public static final int REGEX=84;
    public static final int LEFT_SHIFT_ASSIGN=64;
    public static final int NOT=81;
    public static final int EOF=-1;
    public static final int UNTIL_MODIFIER=35;
    public static final int DIV_ASSIGN=59;
    public static final int LOGICAL_AND=74;
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
    public static final int NOT_EQUAL=75;
    public static final int SYMBOL_NAME=112;
    public static final int WHILE_MODIFIER=34;
    public static final int BODY=9;
    public static final int T131=131;
    public static final int COMMENT=122;
    public static final int T130=130;
    public static final int T135=135;
    public static final int ARRAY=83;
    public static final int T134=134;
    public static final int T133=133;
    public static final int T132=132;
    public static final int RBRACK=117;
    public static final int UNLESS_MODIFIER=33;
    public static final int HEREDOC_BEGIN=109;
    public static final int INCLUSIVE_RANGE=71;
    public static final int SYMBOL=30;
    public static final int MINUS_ASSIGN=60;
    public static final int DOUBLE_QUOTE_STRING_COMPLEX=105;
    public static final int POWER=55;
    public static final int MATCH=46;
    public static final int LCURLY=107;
    public static final int INT=82;
    public static final int GLOBAL_VARIABLE=94;
    public static final int ESCAPE_INT_PART=98;
    public static final int LINE_BREAK=38;
    public static final int WS=39;
    public static final int VARIABLE=16;
    public static final int INSTANCE_VARIABLE=92;
    public static final int LESS_THAN=49;
    public static final int OCTAL=85;
    public static final int SINGLETON_METHOD=25;
    public static final int CONSTANT=14;
    public static final int NOT_MATCH=76;
    public static final int BNOT=80;
    public static final int LEFT_SHIFT=11;
    public static final int CALL=17;
    public static final int ASSOC=111;
    public static final int NON_LEADING0_NUMBER=100;
    public static final int STAR_ID=31;
    public static final int CONTROL_PART=96;
    public static final int LBRACK=116;
    public static final int IF_MODIFIER=32;
    public static final int BXOR_ASSIGN=113;
    public static final int GREATER_OR_EQUAL=48;
    public static final int FLOAT=13;
    public static final int BLOCK_ARG=21;
    public static final int HEREDOC_STRING=12;
    public static final int ID=42;
    public static final int LPAREN=114;
    public static final int IF=7;
    public static final int EXP_PART=89;
    public static final int RESCUE_MODIFIER=36;
    public static final int SINGLE_QUOTE_STRING_COMPLEX=102;
    public static final int BOR_ASSIGN=62;
    public static final int LEADING0_NUMBER=90;
    public static final int COMMA=119;
    public static final int HEX=86;
    public static final int EQUAL=44;
    public static final int BOR=78;
    public static final int RIGHT_SHIFT=51;
    public static final int RIGHT_SHIFT_ASSIGN=65;
    public static final int LOGICAL_OR=73;
    public static final int COMPARE=43;
    public static final int PLUS=52;
    public static final int BXOR=77;
    public static final int DOT=40;
    public static final int EXCLUSIVE_RANGE=72;
    public static final int COLON2=41;
    public static final int MRHS=23;
    public static final int IDENTIFIER_CONSTANT_AND_KEYWORD=91;
    public static final int MULTIPLE_ASSIGN=19;
    public static final int GREATER_THAN=47;
    public static final int LEADING_MARK_DECIMAL=88;
    public static final int LOGICAL_AND_ASSIGN=67;
    public static final int DOUBLE_STRING_CHAR=106;
    public static final int LESS_OR_EQUAL=50;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=22;
    public static final int T137=137;
    public static final int T136=136;
    public static final int T139=139;
    public static final int T138=138;
    public static final int SINGLE_STRING_CHAR=103;
    public static final int STATEMENT_LIST=4;
    public static final int MODIFIER_LINE=6;
    public static final int MINUS=53;
    public static final int Tokens=140;
    public static final int BAND=79;
    public static final int SEMI=37;
    public static final int META_PART=97;
    public static final int STAR_ASSIGN=66;
    public static final int LOGICAL_OR_ASSIGN=68;
    public static final int COLON=120;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int BAND_ASSIGN=63;
    public static final int QUESTION=70;
    public static final int CLASS_VARIABLE=93;
    public static final int ESCAPE_INT=99;
    public static final int BLOCK=18;
    public static final int RCURLY=108;
    public static final int PLUS_ASSIGN=61;
    public static final int ASSIGN=56;
    public static final int POWER_ASSIGN=69;
    public static final int COMPLEMENT_ASSIGN=58;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:17: ( 'if' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:296:20: 'if'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:17: ( 'unless' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:20: 'unless'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:298:17: ( 'while' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:298:20: 'while'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:299:17: ( 'until' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:299:20: 'until'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:17: ( 'resuce' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:300:20: 'resuce'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:6: ( ';' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:7: ';'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:2: ( ( '\\r' )? '\\n' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:3: ( '\\r' )? '\\n'
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);
            
            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:335:3: '\\r'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:337:4: ( ( ' ' | '\\t' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:337:6: ( ' ' | '\\t' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:2: ( ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:4: ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:4: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);
            
            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:4: '-'
                    {
                    match('-'); 
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            int alt9=5;
            int LA9_0 = input.LA(1);
            
            if ( (LA9_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt9=2;
                    }
                    break;
                case 'b':
                    {
                    alt9=3;
                    }
                    break;
                case 'd':
                    {
                    alt9=4;
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
                    new NoViableAltException("665:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )", 9, 0, input);
            
                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:11: OCTAL
                    {
                    mOCTAL(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:17: HEX
                    {
                    mHEX(); 
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:21: BINARY
                    {
                    mBINARY(); 
                    
                    }
                    break;
                case 4 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:28: LEADING_MARK_DECIMAL
                    {
                    mLEADING_MARK_DECIMAL(); 
                    
                    }
                    break;
                case 5 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    {
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
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
                            new NoViableAltException("666:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 5, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:13: '0'
                            {
                            match('0'); 
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:17: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:26: ( ( '_' )? '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);
                                
                                if ( ((LA4_0>='0' && LA4_0<='9')||LA4_0=='_') ) {
                                    alt4=1;
                                }
                                
                            
                                switch (alt4) {
                            	case 1 :
                            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:27: ( '_' )? '0' .. '9'
                            	    {
                            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:27: ( '_' )?
                            	    int alt3=2;
                            	    int LA3_0 = input.LA(1);
                            	    
                            	    if ( (LA3_0=='_') ) {
                            	        alt3=1;
                            	    }
                            	    switch (alt3) {
                            	        case 1 :
                            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:27: '_'
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

                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:45: ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);
                    
                    if ( (LA8_0=='.'||LA8_0=='E'||LA8_0=='e') ) {
                        alt8=2;
                    }
                    else {
                        alt8=1;}
                    switch (alt8) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:55: 
                            {
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            {
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
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
                                    new NoViableAltException("666:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 7, 0, input);
                            
                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:58: EXP_PART
                                    {
                                    mEXP_PART(); 
                                    
                                    }
                                    break;
                                case 2 :
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:67: '.' LEADING0_NUMBER ( EXP_PART )?
                                    {
                                    if(input.LA(2) < '0' || input.LA(2) > '9') {_type=INT; this.type = INT; return;}
                                    match('.'); 
                                    mLEADING0_NUMBER(); 
                                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:170: ( EXP_PART )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);
                                    
                                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:170: EXP_PART
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
                    new NoViableAltException("670:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )", 10, 0, input);
            
                throw nvae;
            }
            
            switch (alt10) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:7: 'a' .. 'z'
                    {
                    matchRange('a','z'); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:18: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 
                    _type = CONSTANT;
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:48: '_'
                    {
                    match('_'); 
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:53: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            loop11:
            do {
                int alt11=4;
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
                    alt11=1;
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
                    alt11=2;
                    }
                    break;
                case '_':
                    {
                    alt11=3;
                    }
                    break;
                
                }
            
                switch (alt11) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:54: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:78: ( '0' .. '9' )
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:78: ( '0' .. '9' )
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:79: '0' .. '9'
            	    {
            	    matchRange('0','9'); 
            	    
            	    }

            	    
            	    }
            	    break;
            	case 3 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:91: '_'
            	    {
            	    match('_'); 
            	    
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:672:5: ( ID ( '?' | '!' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:672:7: ID ( '?' | '!' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:2: ( '@' IDENTIFIER_CONSTANT_AND_KEYWORD )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:674:4: '@' IDENTIFIER_CONSTANT_AND_KEYWORD
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:676:2: ( '@' INSTANCE_VARIABLE )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:676:4: '@' INSTANCE_VARIABLE
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:3: ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) )
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("678:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 14, 1, input);
                
                    throw nvae;
                }
            
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("678:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 14, 0, input);
            
                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:5: '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD
                    {
                    match('$'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:9: ( '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);
                    
                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:679:10: '-'
                            {
                            match('-'); 
                            
                            }
                            break;
                    
                    }

                    mIDENTIFIER_CONSTANT_AND_KEYWORD(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:680:5: '$' ( options {greedy=true; } : '0' .. '9' )+
                    {
                    match('$'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:680:9: ( options {greedy=true; } : '0' .. '9' )+
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
                    	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:680:32: '0' .. '9'
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:681:5: '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:685:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);
                
                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }
                
            
                switch (alt15) {
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:7: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:13: ( '_' )?
            int alt16=2;
            int LA16_0 = input.LA(1);
            
            if ( (LA16_0=='_') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:13: '_'
                    {
                    match('_'); 
                    
                    }
                    break;
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:18: ( '0' .. '7' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:19: '0' .. '7'
            {
            matchRange('0','7'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:29: ( ( '_' )? '0' .. '7' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);
                
                if ( ((LA18_0>='0' && LA18_0<='7')||LA18_0=='_') ) {
                    alt18=1;
                }
                
            
                switch (alt18) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:30: ( '_' )? '0' .. '7'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:30: ( '_' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);
            	    
            	    if ( (LA17_0=='_') ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:694:30: '_'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:696:22: ( ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:1: ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:1: ( '0d' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:2: '0d'
            {
            match("0d"); 

            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:8: ( '0' .. '9' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:9: '0' .. '9'
            {
            matchRange('0','9'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:19: ( ( '_' )? '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);
                
                if ( ((LA20_0>='0' && LA20_0<='9')||LA20_0=='_') ) {
                    alt20=1;
                }
                
            
                switch (alt20) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:20: ( '_' )? '0' .. '9'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:20: ( '_' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);
            	    
            	    if ( (LA19_0=='_') ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:20: '_'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:5: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:21: ( ( '_' )? HEX_PART )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);
                
                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='F')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='f')) ) {
                    alt22=1;
                }
                
            
                switch (alt22) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:22: ( '_' )? HEX_PART
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:22: ( '_' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);
            	    
            	    if ( (LA21_0=='_') ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:699:22: '_'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:8: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:14: ( '0' .. '1' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:15: '0' .. '1'
            {
            matchRange('0','1'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:25: ( ( '_' )? '0' .. '1' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);
                
                if ( ((LA24_0>='0' && LA24_0<='1')||LA24_0=='_') ) {
                    alt24=1;
                }
                
            
                switch (alt24) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:26: ( '_' )? '0' .. '1'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:26: ( '_' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);
            	    
            	    if ( (LA23_0=='_') ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:26: '_'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:2: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:23: ( CONTROL_PART | META_PART )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);
                
                if ( (LA25_0=='\\') ) {
                    int LA25_1 = input.LA(2);
                    
                    if ( (LA25_1=='C'||LA25_1=='c') ) {
                        alt25=1;
                    }
                    else if ( (LA25_1=='M') ) {
                        alt25=2;
                    }
                    
                
                }
                
            
                switch (alt25) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 
            	    
            	    }
            	    break;
            	case 2 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:37: META_PART
            	    {
            	    mMETA_PART(); 
            	    
            	    }
            	    break;
            
            	default :
            	    break loop25;
                }
            } while (true);

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
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
                    new NoViableAltException("710:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 26, 0, input);
            
                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 
                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:94: ESCAPE_INT_PART
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:2: ( ( '\\\\C-' | '\\\\c' ) )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:4: ( '\\\\C-' | '\\\\c' )
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:4: ( '\\\\C-' | '\\\\c' )
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
                        new NoViableAltException("714:4: ( '\\\\C-' | '\\\\c' )", 27, 1, input);
                
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("714:4: ( '\\\\C-' | '\\\\c' )", 27, 0, input);
            
                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:5: '\\\\C-'
                    {
                    match("\\C-"); 

                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:12: '\\\\c'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:718:2: ( '\\\\M-' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:718:4: '\\\\M-'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:2: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:3: ( '1' .. '9' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:4: '1' .. '9'
            {
            matchRange('1','9'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:14: ( ( '_' )? '0' .. '9' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);
                
                if ( ((LA29_0>='0' && LA29_0<='9')||LA29_0=='_') ) {
                    alt29=1;
                }
                
            
                switch (alt29) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:15: ( '_' )? '0' .. '9'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:15: ( '_' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);
            	    
            	    if ( (LA28_0=='_') ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:723:15: '_'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:2: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:3: ( '0' .. '9' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:4: '0' .. '9'
            {
            matchRange('0','9'); 
            
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:14: ( ( '_' )? '0' .. '9' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);
                
                if ( ((LA31_0>='0' && LA31_0<='9')||LA31_0=='_') ) {
                    alt31=1;
                }
                
            
                switch (alt31) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:15: ( '_' )? '0' .. '9'
            	    {
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:15: ( '_' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);
            	    
            	    if ( (LA30_0=='_') ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:726:15: '_'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:9: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:23: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);
            
            if ( (LA32_0=='-') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:23: '-'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:2: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:4: '\\'' ( SINGLE_STRING_CHAR )* '\\''
            {
            match('\''); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:9: ( SINGLE_STRING_CHAR )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);
                
                if ( ((LA33_0>='\u0000' && LA33_0<='&')||(LA33_0>='(' && LA33_0<='\uFFFE')) ) {
                    alt33=1;
                }
                
            
                switch (alt33) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:737:9: SINGLE_STRING_CHAR
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:741:33: ( '%q' begin= . (tmp= . )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:741:35: '%q' begin= . (tmp= . )*
            {
            match("%q"); 

            begin = input.LA(1);
            matchAny(); 
            System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:741:134: (tmp= . )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);
                
                if ( ((LA34_0>='\u0000' && LA34_0<='\uFFFE')) ) {
                    alt34=1;
                }
                
            
                switch (alt34) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:741:135: tmp= .
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
            	    break loop34;
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
    
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:766:2: (s= '\"' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:766:4: s= '\"'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:770:33: ( '%Q' begin= . )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:770:35: '%Q' begin= .
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:776:4: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);
            
            if ( (LA35_0=='\\') ) {
                alt35=1;
            }
            else if ( ((LA35_0>='\u0000' && LA35_0<='&')||(LA35_0>='(' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='\uFFFE')) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("774:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 35, 0, input);
            
                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:776:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:776:15: ~ ( '\\\\' | '\\'' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:779:2: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);
            
            if ( (LA36_0=='\\') ) {
                alt36=1;
            }
            else if ( ((LA36_0>='\u0000' && LA36_0<='!')||(LA36_0>='#' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFE')) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("777:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 36, 0, input);
            
                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:779:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 
                    
                    }
                    break;
                case 2 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:779:13: ~ ( '\\\\' | '\"' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:787:9: ( '{' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:787:11: '{'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:793:9: ( '}' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:793:11: '}'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:2: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt39=3;
            int LA39_0 = input.LA(1);
            
            if ( (LA39_0=='\\') ) {
                int LA39_1 = input.LA(2);
                
                if ( ((LA39_1>='\u0000' && LA39_1<='/')||(LA39_1>='8' && LA39_1<='B')||(LA39_1>='D' && LA39_1<='L')||(LA39_1>='N' && LA39_1<='b')||(LA39_1>='d' && LA39_1<='w')||(LA39_1>='y' && LA39_1<='\uFFFE')) ) {
                    alt39=3;
                }
                else if ( (LA39_1=='x') ) {
                    alt39=2;
                }
                else if ( ((LA39_1>='0' && LA39_1<='7')) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("804:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 39, 1, input);
                
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("804:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 39, 0, input);
            
                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt37=3;
                    int LA37_0 = input.LA(1);
                    
                    if ( ((LA37_0>='0' && LA37_0<='7')) ) {
                        int LA37_1 = input.LA(2);
                        
                        if ( ((LA37_1>='0' && LA37_1<='7')) ) {
                            int LA37_2 = input.LA(3);
                            
                            if ( ((LA37_2>='0' && LA37_2<='7')) ) {
                                alt37=3;
                            }
                            else {
                                alt37=2;}
                        }
                        else {
                            alt37=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("806:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 37, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:10: '0' .. '7'
                            {
                            matchRange('0','7'); 
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 
                            
                            }
                            break;
                        case 3 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:806:41: '0' .. '7' '0' .. '7' '0' .. '7'
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
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:807:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:807:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt38=2;
                    int LA38_0 = input.LA(1);
                    
                    if ( ((LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='F')||(LA38_0>='a' && LA38_0<='f')) ) {
                        int LA38_1 = input.LA(2);
                        
                        if ( ((LA38_1>='0' && LA38_1<='9')||(LA38_1>='A' && LA38_1<='F')||(LA38_1>='a' && LA38_1<='f')) ) {
                            alt38=2;
                        }
                        else {
                            alt38=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("807:19: ( HEX_PART | HEX_PART HEX_PART )", 38, 0, input);
                    
                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:807:20: HEX_PART
                            {
                            mHEX_PART(); 
                            
                            }
                            break;
                        case 2 :
                            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:807:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 
                            
                            }
                            break;
                    
                    }

                    
                    }
                    break;
                case 3 :
                    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:808:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:2: ( '<<' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:812:4: '<<'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:815:2: ( '<<-' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:815:4: '<<-'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:820:7: ( '[]' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:820:9: '[]'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:836:7: ( '/abc/' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:836:9: '/abc/'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:2: ( ( 'a' .. 'z' | 'A' .. 'Z' )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:4: ( 'a' .. 'z' | 'A' .. 'Z' )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:4: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);
                
                if ( ((LA40_0>='A' && LA40_0<='Z')||(LA40_0>='a' && LA40_0<='z')) ) {
                    alt40=1;
                }
                
            
                switch (alt40) {
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
            	    break loop40;
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:845:25: ( '=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:845:27: '='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:15: ( '+=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:17: '+='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:847:15: ( '-=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:847:17: '-='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:848:15: ( '*=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:848:17: '*='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:13: ( '/=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:15: '/='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:850:13: ( '%=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:850:15: '%='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:21: ( '~=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:851:25: '~='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:852:15: ( '**=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:852:17: '**='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:853:15: ( '&=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:853:17: '&='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:15: ( '^=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:854:17: '^='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:14: ( '|=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:855:16: '|='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:19: ( '<<=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:856:21: '<<='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:20: ( '>>=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:857:22: '>>='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:858:20: ( '&&=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:858:22: '&&='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:19: ( '||=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:859:21: '||='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:21: ( '..' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:860:23: '..'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:861:21: ( '...' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:861:23: '...'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:863:10: ( '=>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:863:12: '=>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:864:15: ( '&&' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:864:17: '&&'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:14: ( '||' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:865:16: '||'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:867:12: ( '?' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:867:14: '?'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:868:11: ( '(' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:868:13: '('
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:869:11: ( ')' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:869:13: ')'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:11: ( '[' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:870:13: '['
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:871:11: ( ']' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:871:13: ']'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:872:14: ( '[]' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:872:16: '[]'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:875:10: ( ',' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:875:12: ','
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:10: ( ':' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:12: ':'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:877:5: ( '.' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:877:7: '.'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:878:11: ( '::' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:878:13: '::'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:880:9: ( '!' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:880:11: '!'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:881:9: ( '~' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:881:11: '~'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:882:8: ( '/' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:882:10: '/'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:883:9: ( '+' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:883:11: '+'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:884:10: ( '-' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:884:12: '-'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:885:8: ( '%' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:885:10: '%'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:886:9: ( '*' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:886:11: '*'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:887:13: ( '<' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:887:15: '<'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:888:15: ( '>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:888:17: '>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:889:9: ( '^' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:889:11: '^'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:890:9: ( '|' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:890:11: '|'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:891:9: ( '&' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:891:11: '&'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:892:10: ( '**' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:892:12: '**'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:893:12: ( '<=>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:893:14: '<=>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:894:18: ( '>=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:894:20: '>='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:895:16: ( '<=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:895:18: '<='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:896:10: ( '==' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:896:12: '=='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:897:14: ( '===' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:897:16: '==='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:898:13: ( '!=' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:898:15: '!='
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:899:10: ( '=~' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:899:12: '=~'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:900:13: ( '!~' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:900:15: '!~'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:902:15: ( '>>' )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:902:17: '>>'
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:905:3: ( '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:905:5: '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK
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
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:3: ( (~ ( '\\r' | '\\n' ) )* )
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:5: (~ ( '\\r' | '\\n' ) )*
            {
            // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:5: (~ ( '\\r' | '\\n' ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);
                
                if ( ((LA41_0>='\u0000' && LA41_0<='\t')||(LA41_0>='\u000B' && LA41_0<='\f')||(LA41_0>='\u000E' && LA41_0<='\uFFFE')) ) {
                    alt41=1;
                }
                
            
                switch (alt41) {
            	case 1 :
            	    // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:6: ~ ( '\\r' | '\\n' )
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
            	    break loop41;
                }
            } while (true);

            
            }

        }
        finally {
        }
    }
    // $ANTLR end ANYTHING_OTHER_THAN_LINE_FEED

    public void mTokens() throws RecognitionException {
        // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:8: ( T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX | DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | REGEX | SYMBOL_NAME | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT )
        int alt42=95;
        alt42 = dfa42.predict(input);
        switch (alt42) {
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
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:407: ARRAY
                {
                mARRAY(); 
                
                }
                break;
            case 41 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:413: REGEX
                {
                mREGEX(); 
                
                }
                break;
            case 42 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:419: SYMBOL_NAME
                {
                mSYMBOL_NAME(); 
                
                }
                break;
            case 43 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:431: ASSIGN
                {
                mASSIGN(); 
                
                }
                break;
            case 44 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:438: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 
                
                }
                break;
            case 45 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:450: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 
                
                }
                break;
            case 46 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:463: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 
                
                }
                break;
            case 47 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:475: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 
                
                }
                break;
            case 48 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:486: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 
                
                }
                break;
            case 49 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:497: COMPLEMENT_ASSIGN
                {
                mCOMPLEMENT_ASSIGN(); 
                
                }
                break;
            case 50 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:515: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 
                
                }
                break;
            case 51 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:528: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 
                
                }
                break;
            case 52 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:540: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 
                
                }
                break;
            case 53 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:552: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 
                
                }
                break;
            case 54 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:563: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 
                
                }
                break;
            case 55 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:581: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 
                
                }
                break;
            case 56 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:600: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 
                
                }
                break;
            case 57 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:619: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 
                
                }
                break;
            case 58 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:637: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 
                
                }
                break;
            case 59 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:653: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 
                
                }
                break;
            case 60 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:669: ASSOC
                {
                mASSOC(); 
                
                }
                break;
            case 61 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:675: LOGICAL_AND
                {
                mLOGICAL_AND(); 
                
                }
                break;
            case 62 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:687: LOGICAL_OR
                {
                mLOGICAL_OR(); 
                
                }
                break;
            case 63 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:698: QUESTION
                {
                mQUESTION(); 
                
                }
                break;
            case 64 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:707: LPAREN
                {
                mLPAREN(); 
                
                }
                break;
            case 65 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:714: RPAREN
                {
                mRPAREN(); 
                
                }
                break;
            case 66 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:721: LBRACK
                {
                mLBRACK(); 
                
                }
                break;
            case 67 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:728: RBRACK
                {
                mRBRACK(); 
                
                }
                break;
            case 68 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:735: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 
                
                }
                break;
            case 69 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:747: COMMA
                {
                mCOMMA(); 
                
                }
                break;
            case 70 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:753: COLON
                {
                mCOLON(); 
                
                }
                break;
            case 71 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:759: DOT
                {
                mDOT(); 
                
                }
                break;
            case 72 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:763: COLON2
                {
                mCOLON2(); 
                
                }
                break;
            case 73 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:770: NOT
                {
                mNOT(); 
                
                }
                break;
            case 74 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:774: BNOT
                {
                mBNOT(); 
                
                }
                break;
            case 75 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:779: DIV
                {
                mDIV(); 
                
                }
                break;
            case 76 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:783: PLUS
                {
                mPLUS(); 
                
                }
                break;
            case 77 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:788: MINUS
                {
                mMINUS(); 
                
                }
                break;
            case 78 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:794: MOD
                {
                mMOD(); 
                
                }
                break;
            case 79 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:798: STAR
                {
                mSTAR(); 
                
                }
                break;
            case 80 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:803: LESS_THAN
                {
                mLESS_THAN(); 
                
                }
                break;
            case 81 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:813: GREATER_THAN
                {
                mGREATER_THAN(); 
                
                }
                break;
            case 82 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:826: BXOR
                {
                mBXOR(); 
                
                }
                break;
            case 83 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:831: BOR
                {
                mBOR(); 
                
                }
                break;
            case 84 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:835: BAND
                {
                mBAND(); 
                
                }
                break;
            case 85 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:840: POWER
                {
                mPOWER(); 
                
                }
                break;
            case 86 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:846: COMPARE
                {
                mCOMPARE(); 
                
                }
                break;
            case 87 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:854: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 
                
                }
                break;
            case 88 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:871: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 
                
                }
                break;
            case 89 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:885: EQUAL
                {
                mEQUAL(); 
                
                }
                break;
            case 90 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:891: CASE_EQUAL
                {
                mCASE_EQUAL(); 
                
                }
                break;
            case 91 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:902: NOT_EQUAL
                {
                mNOT_EQUAL(); 
                
                }
                break;
            case 92 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:912: MATCH
                {
                mMATCH(); 
                
                }
                break;
            case 93 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:918: NOT_MATCH
                {
                mNOT_MATCH(); 
                
                }
                break;
            case 94 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:928: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 
                
                }
                break;
            case 95 :
                // D:\\toolset\\xruby-antlrv3\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:940: COMMENT
                {
                mCOMMENT(); 
                
                }
                break;
        
        }
    
    }


    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA42_eotS =
        "\1\37\7\65\1\103\5\65\3\uffff\1\112\1\uffff\3\65\3\uffff\1\121\3"+
        "\uffff\1\124\1\127\1\uffff\1\133\1\135\1\140\1\142\1\145\1\147\1"+
        "\152\1\155\1\157\5\uffff\1\161\1\164\1\uffff\4\65\2\uffff\13\65"+
        "\1\u0082\1\uffff\1\u0083\1\u0084\3\65\2\uffff\1\65\6\uffff\1\u008a"+
        "\1\u008d\4\uffff\1\u008f\5\uffff\1\u0091\4\uffff\1\u0093\4\uffff"+
        "\1\u0095\3\uffff\1\u0097\1\uffff\1\u0099\6\uffff\1\65\1\u009b\3"+
        "\65\1\u00a0\1\u00a1\3\65\1\u00a5\1\u00a7\4\uffff\4\65\21\uffff\1"+
        "\65\1\uffff\1\65\1\u00ae\2\65\2\uffff\1\u00b1\1\u00b2\1\65\1\uffff"+
        "\1\65\1\uffff\4\65\1\u00b9\1\65\1\uffff\1\u00bb\1\u00bc\2\uffff"+
        "\1\u00bd\1\65\1\u00bf\1\65\1\u00c1\1\65\1\uffff\1\65\3\uffff\1\65"+
        "\1\uffff\1\u00c5\1\uffff\1\u00c6\2\65\2\uffff\1\65\1\uffff\1\65"+
        "\1\uffff\1\65\1\u00ce\1\u00cf\2\uffff";
    static final String DFA42_eofS =
        "\u00d0\uffff";
    static final String DFA42_minS =
        "\1\11\7\41\1\135\5\41\3\uffff\1\60\1\uffff\3\41\1\100\2\uffff\1"+
        "\75\3\uffff\1\74\1\75\1\uffff\2\75\1\52\1\75\1\46\3\75\1\56\5\uffff"+
        "\1\72\1\75\1\uffff\4\41\2\uffff\13\41\1\75\1\uffff\5\41\2\uffff"+
        "\1\41\6\uffff\1\76\1\55\4\uffff\1\75\5\uffff\1\75\4\uffff\1\75\4"+
        "\uffff\1\75\3\uffff\1\75\1\uffff\1\56\6\uffff\14\41\4\uffff\4\41"+
        "\21\uffff\1\41\1\uffff\4\41\2\uffff\3\41\1\uffff\1\41\1\uffff\6"+
        "\41\1\uffff\2\41\2\uffff\6\41\1\uffff\1\41\3\uffff\1\41\1\uffff"+
        "\1\41\1\uffff\3\41\2\uffff\1\41\1\uffff\1\41\1\uffff\3\41\2\uffff";
    static final String DFA42_maxS =
        "\1\176\7\172\1\135\5\172\3\uffff\1\75\1\uffff\4\172\2\uffff\1\161"+
        "\3\uffff\1\75\1\141\1\uffff\1\176\5\75\1\174\1\76\1\56\5\uffff\1"+
        "\72\1\176\1\uffff\4\172\2\uffff\13\172\1\75\1\uffff\5\172\2\uffff"+
        "\1\172\6\uffff\1\76\1\75\4\uffff\1\75\5\uffff\1\75\4\uffff\1\75"+
        "\4\uffff\1\75\3\uffff\1\75\1\uffff\1\56\6\uffff\14\172\4\uffff\4"+
        "\172\21\uffff\1\172\1\uffff\4\172\2\uffff\3\172\1\uffff\1\172\1"+
        "\uffff\6\172\1\uffff\2\172\2\uffff\6\172\1\uffff\1\172\3\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\3\172\2\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\3\172\2\uffff";
    static final String DFA42_acceptS =
        "\16\uffff\1\27\1\30\1\31\1\uffff\1\32\4\uffff\1\37\1\40\1\uffff"+
        "\1\42\1\44\1\45\2\uffff\1\52\11\uffff\1\77\1\100\1\101\1\103\1\105"+
        "\2\uffff\1\137\4\uffff\1\33\1\34\14\uffff\1\102\5\uffff\1\55\1\115"+
        "\1\uffff\1\36\1\35\1\43\1\41\1\60\1\116\2\uffff\1\120\1\57\1\51"+
        "\1\113\1\uffff\1\134\1\74\1\53\1\54\1\114\1\uffff\1\56\1\117\1\61"+
        "\1\112\1\uffff\1\63\1\124\1\64\1\122\1\uffff\1\65\1\123\1\127\1"+
        "\uffff\1\121\1\uffff\1\107\1\110\1\106\1\133\1\135\1\111\14\uffff"+
        "\1\13\1\50\1\15\1\22\4\uffff\1\126\1\130\1\66\1\47\1\46\1\132\1"+
        "\131\1\62\1\125\1\70\1\75\1\71\1\76\1\67\1\136\1\73\1\72\1\uffff"+
        "\1\2\4\uffff\1\4\1\16\3\uffff\1\14\1\uffff\1\12\6\uffff\1\7\2\uffff"+
        "\1\5\1\10\6\uffff\1\1\1\uffff\1\6\1\3\1\11\1\uffff\1\25\1\uffff"+
        "\1\24\3\uffff\1\23\1\26\1\uffff\1\17\1\uffff\1\17\3\uffff\1\21\1"+
        "\20";
    static final String DFA42_specialS =
        "\u00d0\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\20\1\17\2\uffff\1\17\22\uffff\1\20\1\57\1\32\1\60\1\27\1"+
            "\31\1\44\1\30\1\52\1\53\1\42\1\41\1\55\1\21\1\50\1\36\12\22"+
            "\1\56\1\16\1\35\1\40\1\47\1\51\1\26\32\24\1\10\1\uffff\1\54"+
            "\1\45\1\25\1\uffff\1\6\1\1\1\23\1\7\1\2\1\3\2\23\1\12\4\23\1"+
            "\4\1\11\2\23\1\15\1\23\1\5\1\13\1\23\1\14\3\23\1\33\1\46\1\34"+
            "\1\43",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\61\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\71\1\62\1\67\11\62\1\70\2\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\1\72\31\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\73\5\62\1\74\13\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\7\62\1\76\11\62\1\75\10\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\77\1\62\1\100\14\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\101\25\62",
            "\1\102",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\21\62\1\104\10\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\105\24\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\106\14\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\7\62\1\107\22\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\110\25\62",
            "",
            "",
            "",
            "\12\22\3\uffff\1\111",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\113\4\uffff\1\64"+
            "\1\uffff\32\113",
            "\1\114\32\115\4\uffff\1\115\1\uffff\32\115",
            "",
            "",
            "\1\120\23\uffff\1\116\37\uffff\1\117",
            "",
            "",
            "",
            "\1\123\1\122",
            "\1\125\43\uffff\1\126",
            "",
            "\1\130\1\132\77\uffff\1\131",
            "\1\134",
            "\1\136\22\uffff\1\137",
            "\1\141",
            "\1\143\26\uffff\1\144",
            "\1\146",
            "\1\151\76\uffff\1\150",
            "\1\153\1\154",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\162\100\uffff\1\163",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\6\62\1\165\23\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\113\4\uffff\1\64"+
            "\1\uffff\32\113",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\113\4\uffff\1\64"+
            "\1\uffff\32\113",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\166\26\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\17\62\1\167\12\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\170\7\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\171\16\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\172\16\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\23\62\1\173\6\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\24\62\1\174\5\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\175\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\176\21\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\177\26\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\u0080\24\62",
            "\1\u0081",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u0086\7\62\1\u0085\6\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u0087\21\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u0088\7\62",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\113\4\uffff\1\64"+
            "\1\uffff\32\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008c\17\uffff\1\u008b",
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
            "",
            "",
            "",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "",
            "",
            "",
            "\1\u0096",
            "",
            "\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u009a\21\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\21\62\1\u009c\10\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u009d\3\62\1\u009e\21\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u009f\7\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00a2\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00a3\14\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\1\u00a4\31\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00a6\21\62",
            "",
            "",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00a8\21\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00a9\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u00aa\16\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\24\62\1\u00ab\5\62",
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
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00ac\14\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00ad\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\u00af\24\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00b0\25\62",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00b3\7\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00b4\14\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u00b5\16\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00b6\7\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00b7\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\2\62\1\u00b8\27\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00ba\7\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00be\25\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c0\7\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00c2\25\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c3\7\62",
            "",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\u00c4\26\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00c7\21\62",
            "\1\66\16\uffff\12\63\5\uffff\1\u00c8\1\uffff\32\62\4\uffff\1"+
            "\64\1\uffff\32\62",
            "",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\16\62\1\u00c9\13\62",
            "",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00cb\14\62",
            "",
            "\1\66\16\uffff\1\u00cd\1\u00cc\10\63\5\uffff\1\66\1\uffff\32"+
            "\62\4\uffff\1\64\1\uffff\32\62",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\113\4\uffff\1\64"+
            "\1\uffff\32\113",
            "\1\66\16\uffff\12\63\5\uffff\1\66\1\uffff\32\113\4\uffff\1\64"+
            "\1\uffff\32\113",
            "",
            ""
    };
    
    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;
    
    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }
    
    class DFA42 extends DFA {
    
        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX | DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | REGEX | SYMBOL_NAME | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT );";
        }
    }
 

}