// $ANTLR 3.0.1 F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2008-02-05 20:26:12

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Rubyv3Lexer extends BaseLexer {
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
    public static final int T127=127;
    public static final int T128=128;
    public static final int T125=125;
    public static final int RPAREN=117;
    public static final int T126=126;
    public static final int HEX_PART=97;
    public static final int DOUBLE_QUOTE_STRING_SIMPLE=106;
    public static final int T129=129;
    public static final int ARG=10;
    public static final int NESTED_LHS=25;
    public static final int NOT_EQUAL=78;
    public static final int SYMBOL_NAME=114;
    public static final int WHILE_MODIFIER=37;
    public static final int BODY=9;
    public static final int T131=131;
    public static final int COMMENT=124;
    public static final int T130=130;
    public static final int T135=135;
    public static final int T134=134;
    public static final int T133=133;
    public static final int T132=132;
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
    public static final int T137=137;
    public static final int T136=136;
    public static final int T139=139;
    public static final int T138=138;
    public static final int SINGLE_STRING_CHAR=105;
    public static final int STATEMENT_LIST=4;
    public static final int T140=140;
    public static final int T141=141;
    public static final int MODIFIER_LINE=6;
    public static final int T142=142;
    public static final int MINUS=56;
    public static final int Tokens=143;
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
    public String getGrammarFileName() { return "F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g"; }

    // $ANTLR start T125
    public final void mT125() throws RecognitionException {
        try {
            int _type = T125;
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:6: ( 'begin' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:145:8: 'begin'
            {
            match("begin"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:6: ( 'end' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:8: 'end'
            {
            match("end"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:6: ( 'false' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:8: 'false'
            {
            match("false"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:6: ( 'nil' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:148:8: 'nil'
            {
            match("nil"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:6: ( 'true' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:8: 'true'
            {
            match("true"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:6: ( 'elsif' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:150:8: 'elsif'
            {
            match("elsif"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:6: ( 'else' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:8: 'else'
            {
            match("else"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:6: ( 'then' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:8: 'then'
            {
            match("then"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:6: ( 'alias' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: 'alias'
            {
            match("alias"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:6: ( 'def' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: 'def'
            {
            match("def"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:6: ( '[]=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: '[]='
            {
            match("[]="); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:6: ( 'and' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: 'and'
            {
            match("and"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:6: ( 'or' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: 'or'
            {
            match("or"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:6: ( 'not' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: 'not'
            {
            match("not"); 


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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:6: ( 'defined?' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:8: 'defined?'
            {
            match("defined?"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T139

    // $ANTLR start T140
    public final void mT140() throws RecognitionException {
        try {
            int _type = T140;
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:6: ( 'expression0' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:8: 'expression0'
            {
            match("expression0"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T140

    // $ANTLR start T141
    public final void mT141() throws RecognitionException {
        try {
            int _type = T141;
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:6: ( 'expression1' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:8: 'expression1'
            {
            match("expression1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T141

    // $ANTLR start T142
    public final void mT142() throws RecognitionException {
        try {
            int _type = T142;
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:162:6: ( 'do' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:162:8: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T142

    // $ANTLR start IF_MODIFIER
    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:17: ( 'if' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:309:20: 'if'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:17: ( 'unless' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:20: 'unless'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:17: ( 'while' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:20: 'while'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:17: ( 'until' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:20: 'until'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:17: ( 'resuce' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:20: 'resuce'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:6: ( ';' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:7: ';'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:2: ( ( '\\r' )? '\\n' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:3: ( '\\r' )? '\\n'
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:348:3: '\\r'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:4: ( ( ' ' | '\\t' ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:6: ( ' ' | '\\t' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:695:2: ( ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:695:4: ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:695:4: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:695:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:696:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            int alt9=5;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                switch ( input.LA(2) ) {
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
                case 'x':
                    {
                    alt9=2;
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
                    new NoViableAltException("696:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:696:11: OCTAL
                    {
                    mOCTAL(); 

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:696:17: HEX
                    {
                    mHEX(); 

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:696:21: BINARY
                    {
                    mBINARY(); 

                    }
                    break;
                case 4 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:696:28: LEADING_MARK_DECIMAL
                    {
                    mLEADING_MARK_DECIMAL(); 

                    }
                    break;
                case 5 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    {
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
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
                            new NoViableAltException("697:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:13: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:17: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:26: ( ( '_' )? '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')||LA4_0=='_') ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:27: ( '_' )? '0' .. '9'
                            	    {
                            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:27: ( '_' )?
                            	    int alt3=2;
                            	    int LA3_0 = input.LA(1);

                            	    if ( (LA3_0=='_') ) {
                            	        alt3=1;
                            	    }
                            	    switch (alt3) {
                            	        case 1 :
                            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:27: '_'
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

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:45: ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.'||LA8_0=='E'||LA8_0=='e') ) {
                        alt8=2;
                    }
                    else {
                        alt8=1;}
                    switch (alt8) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:55: 
                            {
                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            {
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
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
                                    new NoViableAltException("697:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:58: EXP_PART
                                    {
                                    mEXP_PART(); 

                                    }
                                    break;
                                case 2 :
                                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:67: '.' LEADING0_NUMBER ( EXP_PART )?
                                    {
                                    if(input.LA(2) < '0' || input.LA(2) > '9') {_type=INT; this.type = INT; return;}
                                    match('.'); 
                                    mLEADING0_NUMBER(); 
                                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:170: ( EXP_PART )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:697:170: EXP_PART
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '-' )? ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | ':' | '\\\"' ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='$') ) {
                int LA14_2 = input.LA(2);

                if ( ((LA14_2>='!' && LA14_2<='\"')||LA14_2=='$'||(LA14_2>='&' && LA14_2<='\'')||(LA14_2>='*' && LA14_2<=',')||(LA14_2>='.' && LA14_2<='/')||(LA14_2>=':' && LA14_2<='@')||LA14_2=='\\'||LA14_2=='`'||LA14_2=='~') ) {
                    alt14=4;
                }
                else {
                    alt14=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("701:1: ID : ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '-' )? ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* | '$' ( '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | ':' | '\\\"' ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:35: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:36: ( 'a' .. 'z' | 'A' .. 'Z' )
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:60: ( '0' .. '9' )
                    	    {
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:60: ( '0' .. '9' )
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:61: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:701:73: '_'
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:18: '$' ( '-' )? ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
                    {
                    match('$'); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:22: ( '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:22: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:28: ( 'a' .. 'z' | 'A' .. 'Z' )
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:52: ( '0' .. '9' )
                    	    {
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:52: ( '0' .. '9' )
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:53: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:702:65: '_'
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:703:18: '$' ( '0' .. '9' )+
                    {
                    match('$'); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:703:22: ( '0' .. '9' )+
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:703:23: '0' .. '9'
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:704:18: '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | ':' | '\\\"' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:5: ( ID ( '?' | '!' ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:706:7: ID ( '?' | '!' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:708:2: ( '@' IDENTIFIER_CONSTANT_AND_KEYWORD )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:708:4: '@' IDENTIFIER_CONSTANT_AND_KEYWORD
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:2: ( '@' INSTANCE_VARIABLE )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:710:4: '@' INSTANCE_VARIABLE
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:713:3: ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) )
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
                        new NoViableAltException("712:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("712:1: GLOBAL_VARIABLE : ( '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD | '$' ( options {greedy=true; } : '0' .. '9' )+ | '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' ) );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:713:5: '$' ( '-' )? IDENTIFIER_CONSTANT_AND_KEYWORD
                    {
                    match('$'); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:713:9: ( '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:713:10: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mIDENTIFIER_CONSTANT_AND_KEYWORD(); 

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:5: '$' ( options {greedy=true; } : '0' .. '9' )+
                    {
                    match('$'); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:9: ( options {greedy=true; } : '0' .. '9' )+
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
                    	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:714:32: '0' .. '9'
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:715:5: '$' ( '!' | '@' | '&' | '`' | '\\'' | '+' | '~' | '=' | '/' | '\\\\' | ',' | ';' | '.' | '<' | '>' | '*' | '$' | '?' | '\\\"' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:719:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:719:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:719:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:7: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:13: ( '_' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='_') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:13: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:18: ( '0' .. '7' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:29: ( ( '_' )? '0' .. '7' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='7')||LA21_0=='_') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:30: ( '_' )? '0' .. '7'
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:30: ( '_' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0=='_') ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:728:30: '_'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:730:22: ( ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:1: ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:1: ( '0d' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:2: '0d'
            {
            match("0d"); 


            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:8: ( '0' .. '9' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:19: ( ( '_' )? '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||LA23_0=='_') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:20: ( '_' )? '0' .. '9'
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:20: ( '_' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0=='_') ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:731:20: '_'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:5: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:21: ( ( '_' )? HEX_PART )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='F')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='f')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:22: ( '_' )? HEX_PART
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:22: ( '_' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0=='_') ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:733:22: '_'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:736:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:736:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:8: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:14: ( '0' .. '1' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:15: '0' .. '1'
            {
            matchRange('0','1'); 

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:25: ( ( '_' )? '0' .. '1' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='1')||LA27_0=='_') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:26: ( '_' )? '0' .. '1'
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:26: ( '_' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0=='_') ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:740:26: '_'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:2: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:23: ( CONTROL_PART | META_PART )*
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
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 

            	    }
            	    break;
            	case 2 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:37: META_PART
            	    {
            	    mMETA_PART(); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
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
                    new NoViableAltException("744:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 

                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:744:94: ESCAPE_INT_PART
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:2: ( ( '\\\\C-' | '\\\\c' ) )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:4: ( '\\\\C-' | '\\\\c' )
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:4: ( '\\\\C-' | '\\\\c' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\\') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='C') ) {
                    alt30=1;
                }
                else if ( (LA30_1=='c') ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("748:4: ( '\\\\C-' | '\\\\c' )", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("748:4: ( '\\\\C-' | '\\\\c' )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:5: '\\\\C-'
                    {
                    match("\\C-"); 


                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:748:12: '\\\\c'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:2: ( '\\\\M-' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:752:4: '\\\\M-'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:2: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:3: ( '1' .. '9' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:4: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:14: ( ( '_' )? '0' .. '9' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='9')||LA32_0=='_') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:15: ( '_' )? '0' .. '9'
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:15: ( '_' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0=='_') ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:757:15: '_'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:2: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:3: ( '0' .. '9' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:14: ( ( '_' )? '0' .. '9' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='0' && LA34_0<='9')||LA34_0=='_') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:15: ( '_' )? '0' .. '9'
            	    {
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:15: ( '_' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0=='_') ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:760:15: '_'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:762:9: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:762:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:762:23: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='-') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:762:23: '-'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:2: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:4: '\\'' ( SINGLE_STRING_CHAR )* '\\''
            {
            match('\''); 
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:9: ( SINGLE_STRING_CHAR )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>='\u0000' && LA36_0<='&')||(LA36_0>='(' && LA36_0<='\uFFFE')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:771:9: SINGLE_STRING_CHAR
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:33: ( '%q' begin= . (tmp= . )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:35: '%q' begin= . (tmp= . )*
            {
            match("%q"); 

            begin = input.LA(1);
            matchAny(); 
            System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:134: (tmp= . )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='\u0000' && LA37_0<='\uFFFE')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:775:135: tmp= .
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

            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:800:2: (s= '\"' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:800:4: s= '\"'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:33: ( '%Q' begin= . )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:804:35: '%Q' begin= .
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:4: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
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
                    new NoViableAltException("808:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:810:15: ~ ( '\\\\' | '\\'' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:2: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
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
                    new NoViableAltException("811:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:813:13: ~ ( '\\\\' | '\"' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:821:9: ( '{' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:821:11: '{'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:9: ( '}' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:827:11: '}'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:2: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\\') ) {
                int LA42_1 = input.LA(2);

                if ( ((LA42_1>='\u0000' && LA42_1<='/')||(LA42_1>='8' && LA42_1<='B')||(LA42_1>='D' && LA42_1<='L')||(LA42_1>='N' && LA42_1<='b')||(LA42_1>='d' && LA42_1<='w')||(LA42_1>='y' && LA42_1<='\uFFFE')) ) {
                    alt42=3;
                }
                else if ( (LA42_1=='x') ) {
                    alt42=2;
                }
                else if ( ((LA42_1>='0' && LA42_1<='7')) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("838:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("838:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
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
                            new NoViableAltException("840:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:10: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;
                        case 3 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:840:41: '0' .. '7' '0' .. '7' '0' .. '7'
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
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:841:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:841:19: ( HEX_PART | HEX_PART HEX_PART )
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
                            new NoViableAltException("841:19: ( HEX_PART | HEX_PART HEX_PART )", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:841:20: HEX_PART
                            {
                            mHEX_PART(); 

                            }
                            break;
                        case 2 :
                            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:841:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:842:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:2: ( '<<' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:846:4: '<<'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:2: ( '<<-' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:849:4: '<<-'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:872:7: ( '/abc/' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:872:9: '/abc/'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:2: ( ( 'a' .. 'z' | 'A' .. 'Z' )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:4: ( 'a' .. 'z' | 'A' .. 'Z' )*
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:876:4: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='A' && LA43_0<='Z')||(LA43_0>='a' && LA43_0<='z')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:881:25: ( '=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:881:27: '='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:882:15: ( '+=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:882:17: '+='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:883:15: ( '-=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:883:17: '-='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:884:15: ( '*=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:884:17: '*='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:885:13: ( '/=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:885:15: '/='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:886:13: ( '%=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:886:15: '%='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:887:21: ( '~=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:887:25: '~='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:888:15: ( '**=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:888:17: '**='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:889:15: ( '&=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:889:17: '&='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:890:15: ( '^=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:890:17: '^='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:891:14: ( '|=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:891:16: '|='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:892:19: ( '<<=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:892:21: '<<='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:893:20: ( '>>=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:893:22: '>>='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:894:20: ( '&&=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:894:22: '&&='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:895:19: ( '||=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:895:21: '||='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:896:21: ( '..' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:896:23: '..'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:897:21: ( '...' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:897:23: '...'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:899:10: ( '=>' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:899:12: '=>'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:900:15: ( '&&' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:900:17: '&&'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:901:14: ( '||' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:901:16: '||'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:903:12: ( '?' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:903:14: '?'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:904:11: ( '(' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:904:13: '('
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:905:11: ( ')' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:905:13: ')'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:906:11: ( '[' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:906:13: '['
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:907:11: ( ']' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:907:13: ']'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:908:14: ( '[]' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:908:16: '[]'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:911:10: ( ',' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:911:12: ','
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:10: ( ':' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:912:12: ':'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:913:5: ( '.' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:913:7: '.'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:914:11: ( '::' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:914:13: '::'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:916:9: ( '!' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:916:11: '!'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:917:9: ( '~' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:917:11: '~'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:918:8: ( '/' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:918:10: '/'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:919:9: ( '+' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:919:11: '+'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:920:10: ( '-' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:920:12: '-'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:921:8: ( '%' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:921:10: '%'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:922:9: ( '*' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:922:11: '*'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:923:13: ( '<' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:923:15: '<'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:924:15: ( '>' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:924:17: '>'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:925:9: ( '^' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:925:11: '^'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:926:9: ( '|' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:926:11: '|'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:927:9: ( '&' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:927:11: '&'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:928:10: ( '**' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:928:12: '**'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:929:12: ( '<=>' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:929:14: '<=>'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:930:18: ( '>=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:930:20: '>='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:931:16: ( '<=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:931:18: '<='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:932:10: ( '==' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:932:12: '=='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:933:14: ( '===' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:933:16: '==='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:934:13: ( '!=' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:934:15: '!='
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:935:10: ( '=~' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:935:12: '=~'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:936:13: ( '!~' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:936:15: '!~'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:938:15: ( '>>' )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:938:17: '>>'
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:941:3: ( '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:941:5: '#' ANYTHING_OTHER_THAN_LINE_FEED LINE_BREAK
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
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:948:3: ( (~ ( '\\r' | '\\n' ) )* )
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:948:5: (~ ( '\\r' | '\\n' ) )*
            {
            // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:948:5: (~ ( '\\r' | '\\n' ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\u0000' && LA44_0<='\t')||(LA44_0>='\u000B' && LA44_0<='\f')||(LA44_0>='\u000E' && LA44_0<='\uFFFE')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:948:6: ~ ( '\\r' | '\\n' )
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
        // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:8: ( T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | T140 | T141 | T142 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX | DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | REGEX | SYMBOL_NAME | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT )
        int alt45=95;
        alt45 = dfa45.predict(input);
        switch (alt45) {
            case 1 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T125
                {
                mT125(); 

                }
                break;
            case 2 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:15: T126
                {
                mT126(); 

                }
                break;
            case 3 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:20: T127
                {
                mT127(); 

                }
                break;
            case 4 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:25: T128
                {
                mT128(); 

                }
                break;
            case 5 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T129
                {
                mT129(); 

                }
                break;
            case 6 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:35: T130
                {
                mT130(); 

                }
                break;
            case 7 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:40: T131
                {
                mT131(); 

                }
                break;
            case 8 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:45: T132
                {
                mT132(); 

                }
                break;
            case 9 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T133
                {
                mT133(); 

                }
                break;
            case 10 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:55: T134
                {
                mT134(); 

                }
                break;
            case 11 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:60: T135
                {
                mT135(); 

                }
                break;
            case 12 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:65: T136
                {
                mT136(); 

                }
                break;
            case 13 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:70: T137
                {
                mT137(); 

                }
                break;
            case 14 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:75: T138
                {
                mT138(); 

                }
                break;
            case 15 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:80: T139
                {
                mT139(); 

                }
                break;
            case 16 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:85: T140
                {
                mT140(); 

                }
                break;
            case 17 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:90: T141
                {
                mT141(); 

                }
                break;
            case 18 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:95: T142
                {
                mT142(); 

                }
                break;
            case 19 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:100: IF_MODIFIER
                {
                mIF_MODIFIER(); 

                }
                break;
            case 20 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:112: UNLESS_MODIFIER
                {
                mUNLESS_MODIFIER(); 

                }
                break;
            case 21 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:128: WHILE_MODIFIER
                {
                mWHILE_MODIFIER(); 

                }
                break;
            case 22 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:143: UNTIL_MODIFIER
                {
                mUNTIL_MODIFIER(); 

                }
                break;
            case 23 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:158: RESCUE_MODIFIER
                {
                mRESCUE_MODIFIER(); 

                }
                break;
            case 24 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:174: SEMI
                {
                mSEMI(); 

                }
                break;
            case 25 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:179: LINE_BREAK
                {
                mLINE_BREAK(); 

                }
                break;
            case 26 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:190: WS
                {
                mWS(); 

                }
                break;
            case 27 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:193: INT
                {
                mINT(); 

                }
                break;
            case 28 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:197: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:200: FID
                {
                mFID(); 

                }
                break;
            case 30 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:204: INSTANCE_VARIABLE
                {
                mINSTANCE_VARIABLE(); 

                }
                break;
            case 31 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:222: CLASS_VARIABLE
                {
                mCLASS_VARIABLE(); 

                }
                break;
            case 32 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:237: GLOBAL_VARIABLE
                {
                mGLOBAL_VARIABLE(); 

                }
                break;
            case 33 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:253: SINGLE_QUOTE_STRING_SIMPLE
                {
                mSINGLE_QUOTE_STRING_SIMPLE(); 

                }
                break;
            case 34 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:280: SINGLE_QUOTE_STRING_COMPLEX
                {
                mSINGLE_QUOTE_STRING_COMPLEX(); 

                }
                break;
            case 35 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:308: DOUBLE_QUOTE_STRING_SIMPLE
                {
                mDOUBLE_QUOTE_STRING_SIMPLE(); 

                }
                break;
            case 36 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:335: DOUBLE_QUOTE_STRING_COMPLEX
                {
                mDOUBLE_QUOTE_STRING_COMPLEX(); 

                }
                break;
            case 37 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:363: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 38 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:370: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 39 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:377: HEREDOC_BEGIN
                {
                mHEREDOC_BEGIN(); 

                }
                break;
            case 40 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:391: HEREDOC_INDENT_BEGIN
                {
                mHEREDOC_INDENT_BEGIN(); 

                }
                break;
            case 41 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:412: REGEX
                {
                mREGEX(); 

                }
                break;
            case 42 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:418: SYMBOL_NAME
                {
                mSYMBOL_NAME(); 

                }
                break;
            case 43 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:430: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 44 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:437: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 

                }
                break;
            case 45 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:449: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 

                }
                break;
            case 46 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:462: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 

                }
                break;
            case 47 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:474: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 48 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:485: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 49 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:496: COMPLEMENT_ASSIGN
                {
                mCOMPLEMENT_ASSIGN(); 

                }
                break;
            case 50 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:514: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 

                }
                break;
            case 51 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:527: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 

                }
                break;
            case 52 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:539: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 

                }
                break;
            case 53 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:551: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 

                }
                break;
            case 54 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:562: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 

                }
                break;
            case 55 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:580: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 

                }
                break;
            case 56 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:599: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 

                }
                break;
            case 57 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:618: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 

                }
                break;
            case 58 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:636: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 

                }
                break;
            case 59 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:652: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 

                }
                break;
            case 60 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:668: ASSOC
                {
                mASSOC(); 

                }
                break;
            case 61 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:674: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 62 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:686: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 63 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:697: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 64 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:706: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 65 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:713: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 66 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:720: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 67 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:727: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 68 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:734: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 

                }
                break;
            case 69 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:746: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 70 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:752: COLON
                {
                mCOLON(); 

                }
                break;
            case 71 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:758: DOT
                {
                mDOT(); 

                }
                break;
            case 72 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:762: COLON2
                {
                mCOLON2(); 

                }
                break;
            case 73 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:769: NOT
                {
                mNOT(); 

                }
                break;
            case 74 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:773: BNOT
                {
                mBNOT(); 

                }
                break;
            case 75 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:778: DIV
                {
                mDIV(); 

                }
                break;
            case 76 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:782: PLUS
                {
                mPLUS(); 

                }
                break;
            case 77 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:787: MINUS
                {
                mMINUS(); 

                }
                break;
            case 78 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:793: MOD
                {
                mMOD(); 

                }
                break;
            case 79 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:797: STAR
                {
                mSTAR(); 

                }
                break;
            case 80 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:802: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 81 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:812: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 82 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:825: BXOR
                {
                mBXOR(); 

                }
                break;
            case 83 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:830: BOR
                {
                mBOR(); 

                }
                break;
            case 84 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:834: BAND
                {
                mBAND(); 

                }
                break;
            case 85 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:839: POWER
                {
                mPOWER(); 

                }
                break;
            case 86 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:845: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 87 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:853: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 88 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:870: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 89 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:884: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 90 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:890: CASE_EQUAL
                {
                mCASE_EQUAL(); 

                }
                break;
            case 91 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:901: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 92 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:911: MATCH
                {
                mMATCH(); 

                }
                break;
            case 93 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:917: NOT_MATCH
                {
                mNOT_MATCH(); 

                }
                break;
            case 94 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:927: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 

                }
                break;
            case 95 :
                // F:\\toolset\\ruby\\xruby-antlrv3-variable_or_method\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:939: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA45_eotS =
        "\1\36\7\61\1\103\5\61\3\uffff\1\112\1\uffff\2\61\2\uffff\1\127\3"+
        "\uffff\1\132\1\135\1\61\1\uffff\1\142\1\144\1\147\1\151\1\154\1"+
        "\156\1\161\1\164\1\166\5\uffff\1\170\1\173\1\uffff\1\61\1\uffff"+
        "\3\61\1\uffff\13\61\1\u0088\1\u008a\1\uffff\1\u008b\1\u008c\3\61"+
        "\2\uffff\7\61\6\uffff\1\u0098\1\u009b\4\uffff\1\61\1\uffff\1\u009d"+
        "\4\uffff\1\u009f\5\uffff\1\u00a1\4\uffff\1\u00a3\2\uffff\1\u00a5"+
        "\1\uffff\1\u00a7\6\uffff\1\61\1\u00a9\3\61\1\u00ae\1\u00af\2\61"+
        "\1\u00b2\1\61\1\u00b5\5\uffff\12\61\21\uffff\1\61\1\uffff\1\61\1"+
        "\u00bc\2\61\2\uffff\1\u00bf\1\u00c0\1\uffff\2\61\1\uffff\4\61\1"+
        "\u00c7\1\61\1\uffff\1\u00c9\1\u00ca\2\uffff\1\u00cb\1\61\1\u00cd"+
        "\1\61\1\u00cf\1\61\1\uffff\1\61\3\uffff\1\61\1\uffff\1\u00d3\1\uffff"+
        "\1\u00d4\2\61\2\uffff\1\61\1\uffff\1\61\1\uffff\1\61\1\u00dc\1\u00dd"+
        "\2\uffff";
    static final String DFA45_eofS =
        "\u00de\uffff";
    static final String DFA45_minS =
        "\1\11\7\41\1\135\5\41\3\uffff\1\60\1\uffff\2\41\1\100\1\uffff\1"+
        "\75\3\uffff\1\74\1\75\1\41\1\uffff\2\75\1\52\1\75\1\46\3\75\1\56"+
        "\5\uffff\1\72\1\75\1\uffff\1\41\1\uffff\3\41\1\uffff\14\41\1\75"+
        "\1\uffff\5\41\2\uffff\7\41\6\uffff\1\76\1\55\4\uffff\1\41\1\uffff"+
        "\1\75\4\uffff\1\75\5\uffff\1\75\4\uffff\1\75\2\uffff\1\75\1\uffff"+
        "\1\56\6\uffff\14\41\5\uffff\12\41\21\uffff\1\41\1\uffff\4\41\2\uffff"+
        "\2\41\1\uffff\2\41\1\uffff\6\41\1\uffff\2\41\2\uffff\6\41\1\uffff"+
        "\1\41\3\uffff\1\41\1\uffff\1\41\1\uffff\3\41\2\uffff\1\41\1\uffff"+
        "\1\41\1\uffff\3\41\2\uffff";
    static final String DFA45_maxS =
        "\1\176\7\172\1\135\5\172\3\uffff\1\75\1\uffff\1\172\1\176\1\172"+
        "\1\uffff\1\161\3\uffff\1\75\1\141\1\172\1\uffff\1\176\5\75\1\174"+
        "\1\76\1\56\5\uffff\1\72\1\176\1\uffff\1\172\1\uffff\3\172\1\uffff"+
        "\14\172\1\75\1\uffff\5\172\2\uffff\2\77\4\172\1\77\6\uffff\1\76"+
        "\1\75\4\uffff\1\172\1\uffff\1\75\4\uffff\1\75\5\uffff\1\75\4\uffff"+
        "\1\75\2\uffff\1\75\1\uffff\1\56\6\uffff\14\172\5\uffff\12\172\21"+
        "\uffff\1\172\1\uffff\4\172\2\uffff\2\172\1\uffff\2\172\1\uffff\6"+
        "\172\1\uffff\2\172\2\uffff\6\172\1\uffff\1\172\3\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\3\172\2\uffff\1\172\1\uffff\1\172\1\uffff\3\172\2"+
        "\uffff";
    static final String DFA45_acceptS =
        "\16\uffff\1\30\1\31\1\32\1\uffff\1\33\3\uffff\1\41\1\uffff\1\43"+
        "\1\45\1\46\3\uffff\1\52\11\uffff\1\77\1\100\1\101\1\103\1\105\2"+
        "\uffff\1\137\1\uffff\1\34\3\uffff\1\35\15\uffff\1\102\5\uffff\1"+
        "\55\1\115\7\uffff\1\37\1\36\1\44\1\42\1\60\1\116\2\uffff\1\120\1"+
        "\57\1\51\1\113\1\uffff\1\74\1\uffff\1\134\1\53\1\54\1\114\1\uffff"+
        "\1\56\1\117\1\61\1\112\1\63\1\uffff\1\124\1\64\1\122\1\65\1\uffff"+
        "\1\123\1\127\1\uffff\1\121\1\uffff\1\107\1\110\1\106\1\133\1\135"+
        "\1\111\14\uffff\1\22\1\13\1\104\1\15\1\23\12\uffff\1\126\1\130\1"+
        "\50\1\66\1\47\1\132\1\131\1\62\1\125\1\70\1\75\1\71\1\76\1\67\1"+
        "\136\1\73\1\72\1\uffff\1\2\4\uffff\1\16\1\4\2\uffff\1\14\2\uffff"+
        "\1\12\6\uffff\1\7\2\uffff\1\5\1\10\6\uffff\1\1\1\uffff\1\6\1\3\1"+
        "\11\1\uffff\1\26\1\uffff\1\25\3\uffff\1\24\1\27\1\uffff\1\17\1\uffff"+
        "\1\17\3\uffff\1\21\1\20";
    static final String DFA45_specialS =
        "\u00de\uffff}>";
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
            "\1\uffff\4\62\1\100\11\62\1\101\13\62",
            "\1\102",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\21\62\1\104\10\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\105\24\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\106\14\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\7\62\1\107\22\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\110\25\62",
            "",
            "",
            "",
            "\12\22\3\uffff\1\111",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\113\1\121\1\uffff\1\121\1\uffff\2\121\2\uffff\3\121\1\116"+
            "\2\121\12\115\1\114\4\121\1\113\1\121\32\117\1\uffff\1\121\2"+
            "\uffff\1\120\1\121\32\117\3\uffff\1\121",
            "\1\122\32\123\4\uffff\1\123\1\uffff\32\123",
            "",
            "\1\126\23\uffff\1\124\37\uffff\1\125",
            "",
            "",
            "",
            "\1\131\1\130",
            "\1\133\43\uffff\1\134",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\136\4\uffff\1\64"+
            "\1\uffff\32\136",
            "",
            "\1\140\1\137\77\uffff\1\141",
            "\1\143",
            "\1\145\22\uffff\1\146",
            "\1\150",
            "\1\153\26\uffff\1\152",
            "\1\155",
            "\1\157\76\uffff\1\160",
            "\1\162\1\163",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "\1\171\100\uffff\1\172",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\6\62\1\174\23\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\136\4\uffff\1\64"+
            "\1\uffff\32\136",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\136\4\uffff\1\64"+
            "\1\uffff\32\136",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\175\26\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\17\62\1\176\12\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\177\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u0080\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\23\62\1\u0081\6\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u0082\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\24\62\1\u0083\5\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u0084\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\u0085\26\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u0086\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\u0087\24\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\u0089",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u008e\7\62\1\u008d\6\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u008f\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u0090\7\62",
            "",
            "",
            "\1\65\35\uffff\1\65",
            "\1\65\35\uffff\1\65",
            "\1\65\16\uffff\12\115\5\uffff\1\65\1\uffff\32\u0091\4\uffff"+
            "\1\u0092\1\uffff\32\u0091",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\117\4\uffff"+
            "\1\120\1\uffff\32\117",
            "\1\65\16\uffff\12\u0095\5\uffff\1\65\1\uffff\32\u0094\4\uffff"+
            "\1\u0096\1\uffff\32\u0094",
            "\1\65\16\uffff\12\u0095\5\uffff\1\65\1\uffff\32\u0094\4\uffff"+
            "\1\u0096\1\uffff\32\u0094",
            "\1\65\35\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0099\17\uffff\1\u009a",
            "",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\136\4\uffff\1\64"+
            "\1\uffff\32\136",
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
            "",
            "",
            "\1\u00a2",
            "",
            "",
            "\1\u00a4",
            "",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00a8\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\21\62\1\u00aa\10\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00ab\3\62\1\u00ac\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00ad\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00b0\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00b1\14\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\1\u00b3\31\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00b4\21\62",
            "",
            "",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00b6\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00b7\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u00b8\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\24\62\1\u00b9\5\62",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0091\4\uffff"+
            "\1\u0092\1\uffff\32\u0091",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0091\4\uffff"+
            "\1\u0092\1\uffff\32\u0091",
            "\1\65\16\uffff\12\u0093\5\uffff\1\65\1\uffff\32\u0091\4\uffff"+
            "\1\u0092\1\uffff\32\u0091",
            "\1\65\16\uffff\12\u0095\5\uffff\1\65\1\uffff\32\u0094\4\uffff"+
            "\1\u0096\1\uffff\32\u0094",
            "\1\65\16\uffff\12\u0095\5\uffff\1\65\1\uffff\32\u0094\4\uffff"+
            "\1\u0096\1\uffff\32\u0094",
            "\1\65\16\uffff\12\u0095\5\uffff\1\65\1\uffff\32\u0094\4\uffff"+
            "\1\u0096\1\uffff\32\u0094",
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
            "\1\uffff\15\62\1\u00ba\14\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00bb\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\5\62\1\u00bd\24\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00be\25\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c1\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00c2\14\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\13\62\1\u00c3\16\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c4\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00c5\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\2\62\1\u00c6\27\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00c8\7\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00cc\25\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00ce\7\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\4\62\1\u00d0\25\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\22\62\1\u00d1\7\62",
            "",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\3\62\1\u00d2\26\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\10\62\1\u00d5\21\62",
            "\1\65\16\uffff\12\63\5\uffff\1\u00d6\1\uffff\32\62\4\uffff\1"+
            "\64\1\uffff\32\62",
            "",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\16\62\1\u00d7\13\62",
            "",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\62\4\uffff\1\64"+
            "\1\uffff\15\62\1\u00d9\14\62",
            "",
            "\1\65\16\uffff\1\u00db\1\u00da\10\63\5\uffff\1\65\1\uffff\32"+
            "\62\4\uffff\1\64\1\uffff\32\62",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\136\4\uffff\1\64"+
            "\1\uffff\32\136",
            "\1\65\16\uffff\12\63\5\uffff\1\65\1\uffff\32\136\4\uffff\1\64"+
            "\1\uffff\32\136",
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
            return "1:1: Tokens : ( T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | T140 | T141 | T142 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | INT | ID | FID | INSTANCE_VARIABLE | CLASS_VARIABLE | GLOBAL_VARIABLE | SINGLE_QUOTE_STRING_SIMPLE | SINGLE_QUOTE_STRING_COMPLEX | DOUBLE_QUOTE_STRING_SIMPLE | DOUBLE_QUOTE_STRING_COMPLEX | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | REGEX | SYMBOL_NAME | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | DOT | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT | COMMENT );";
        }
    }
 

}