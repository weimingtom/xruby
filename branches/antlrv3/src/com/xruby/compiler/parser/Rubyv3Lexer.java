// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-15 22:33:10

package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.Expression;
import org.antlr.runtime.*;

public class Rubyv3Lexer extends BaseLexer {
    public static final int COMMA=107;
    public static final int GREATER_THAN=62;
    public static final int LOGICAL_AND_ASSIGN=47;
    public static final int MINUS=70;
    public static final int ESCAPE_INT=90;
    public static final int ARRAY=76;
    public static final int HASH=77;
    public static final int HEX_PART=86;
    public static final int LOGICAL_OR=53;
    public static final int LESS_THAN=61;
    public static final int META_PART=88;
    public static final int LEADING0_NUMBER=85;
    public static final int BOR=66;
    public static final int LEADING_MARK_DECIMAL=83;
    public static final int BINARY=82;
    public static final int COLON2=109;
    public static final int EMPTY_ARRAY=106;
    public static final int LCURLY=96;
    public static final int LINE_BREAK=33;
    public static final int T114=114;
    public static final int LEFT_SHIFT=12;
    public static final int IF_MODIFIER=27;
    public static final int MULTIPLE_ASSIGN=17;
    public static final int ESCAPE_INT_PART=89;
    public static final int REGEX=79;
    public static final int SYMBOL=15;
    public static final int CONTROL_PART=87;
    public static final int RPAREN=103;
    public static final int T118=118;
    public static final int STAR_ASSIGN=46;
    public static final int DOUBLE_QUOTE_STRING=93;
    public static final int PLUS=69;
    public static final int T117=117;
    public static final int BODY=9;
    public static final int HEREDOC_INDENT_BEGIN=99;
    public static final int CASE_EQUAL=57;
    public static final int UNLESS_MODIFIER=28;
    public static final int MINUS_ASSIGN=40;
    public static final int GREATER_OR_EQUAL=64;
    public static final int EXCLUSIVE_RANGE=52;
    public static final int T113=113;
    public static final int RANGE=78;
    public static final int POWER_ASSIGN=49;
    public static final int MOD_ASSIGN=37;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA=20;
    public static final int T120=120;
    public static final int T115=115;
    public static final int WS=34;
    public static final int STRING=24;
    public static final int DOUBLE_STRING_CHAR=95;
    public static final int T121=121;
    public static final int RIGHT_SHIFT_ASSIGN=45;
    public static final int NON_LEADING0_NUMBER=91;
    public static final int SINGLE_QUOTE_STRING=92;
    public static final int T123=123;
    public static final int HEREDOC_BEGIN=98;
    public static final int LBRACK=104;
    public static final int SEMI=32;
    public static final int DIV_ASSIGN=39;
    public static final int MRHS=21;
    public static final int BLOCK_ARG=19;
    public static final int EQUAL=56;
    public static final int LOGICAL_AND=54;
    public static final int T119=119;
    public static final int COLON=108;
    public static final int DIV=25;
    public static final int T122=122;
    public static final int HEX=81;
    public static final int SINGLETON_METHOD=23;
    public static final int STATEMENT_LIST=4;
    public static final int STATEMENT=5;
    public static final int INCLUSIVE_RANGE=51;
    public static final int BNOT=73;
    public static final int LOGICAL_OR_ASSIGN=48;
    public static final int ASSOC=101;
    public static final int FLOAT=14;
    public static final int OCTAL=80;
    public static final int MOD=26;
    public static final int PLUS_ASSIGN=41;
    public static final int QUESTION=50;
    public static final int UNTIL_MODIFIER=30;
    public static final int BLOCK=16;
    public static final int RCURLY=97;
    public static final int T116=116;
    public static final int INT=75;
    public static final int BOR_ASSIGN=42;
    public static final int ASSIGN=36;
    public static final int LESS_OR_EQUAL=63;
    public static final int LPAREN=102;
    public static final int T111=111;
    public static final int BAND=67;
    public static final int T112=112;
    public static final int HEREDOC_STRING=13;
    public static final int NOT_MATCH=60;
    public static final int ID=35;
    public static final int NOT_EQUAL=58;
    public static final int BAND_ASSIGN=43;
    public static final int COMPLEMENT_ASSIGN=38;
    public static final int RIGHT_SHIFT=68;
    public static final int POWER=72;
    public static final int T110=110;
    public static final int BXOR_ASSIGN=100;
    public static final int NESTED_LHS=22;
    public static final int LEFT_SHIFT_ASSIGN=44;
    public static final int MATCH=59;
    public static final int WHILE_MODIFIER=29;
    public static final int EXP_PART=84;
    public static final int COMPARE=55;
    public static final int IF=7;
    public static final int ARG=11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA=18;
    public static final int EOF=-1;
    public static final int CALL=10;
    public static final int Tokens=124;
    public static final int RBRACK=105;
    public static final int RESCUE_MODIFIER=31;
    public static final int MODIFIER_LINE=6;
    public static final int RPAREN_IN_METHOD_DEFINATION=8;
    public static final int STAR=71;
    public static final int BXOR=65;
    public static final int NOT=74;
    public static final int SINGLE_STRING_CHAR=94;
    
    
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

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
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
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
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
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
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
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
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
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
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
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
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
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
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
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
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
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: ( 'and' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:8: 'and'
            {
            match("and"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: ( 'or' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: 'or'
            {
            match("or"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: ( 'not' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:8: 'not'
            {
            match("not"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: ( 'expression0' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:8: 'expression0'
            {
            match("expression0"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: ( 'expression1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:8: 'expression1'
            {
            match("expression1"); 


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: ( 'expression2' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:8: 'expression2'
            {
            match("expression2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T123

    // $ANTLR start IF_MODIFIER
    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:254:20: ( 'if' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:254:20: 'if'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:255:20: ( 'unless' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:255:20: 'unless'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:256:20: ( 'while' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:256:20: 'while'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:20: ( 'until' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:20: 'until'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:20: ( 'resuce' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:20: 'resuce'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:7: ( ';' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:7: ';'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( ( '\\r' )? '\\n' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( '\\r' )? '\\n'
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:3: '\\r'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:6: ( ( ' ' | '\\t' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:6: ( ' ' | '\\t' )
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

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:28: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:29: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:53: ( '0' .. '9' )
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:53: ( '0' .. '9' )
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:297:54: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:4: ( ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:4: ( '-' )? ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:4: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:496:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'x':
                    {
                    alt10=2;
                    }
                    break;
                case 'b':
                    {
                    alt10=3;
                    }
                    break;
                case 'd':
                    {
                    alt10=4;
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
                    alt10=1;
                    }
                    break;
                default:
                    alt10=5;}

            }
            else if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("497:10: ( OCTAL | HEX | BINARY | LEADING_MARK_DECIMAL | ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:11: OCTAL
                    {
                    mOCTAL(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:17: HEX
                    {
                    mHEX(); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:21: BINARY
                    {
                    mBINARY(); 

                    }
                    break;
                case 4 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:497:28: LEADING_MARK_DECIMAL
                    {
                    mLEADING_MARK_DECIMAL(); 

                    }
                    break;
                case 5 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='0') ) {
                        alt6=1;
                    }
                    else if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("498:12: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:13: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:17: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:26: ( ( '_' )? '0' .. '9' )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:27: ( '_' )? '0' .. '9'
                            	    {
                            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:27: ( '_' )?
                            	    int alt4=2;
                            	    int LA4_0 = input.LA(1);

                            	    if ( (LA4_0=='_') ) {
                            	        alt4=1;
                            	    }
                            	    switch (alt4) {
                            	        case 1 :
                            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:27: '_'
                            	            {
                            	            match('_'); 

                            	            }
                            	            break;

                            	    }

                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:45: ( | ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.'||LA9_0=='E'||LA9_0=='e') ) {
                        alt9=2;
                    }
                    else {
                        alt9=1;}
                    switch (alt9) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:55: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='E'||LA8_0=='e') ) {
                                alt8=1;
                            }
                            else if ( (LA8_0=='.') ) {
                                alt8=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("498:57: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:58: EXP_PART
                                    {
                                    mEXP_PART(); 

                                    }
                                    break;
                                case 2 :
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:67: '.' LEADING0_NUMBER ( EXP_PART )?
                                    {
                                    if(input.LA(2) < '0' || input.LA(2) > '9') {_type=INT; this.type = INT; return;}
                                    match('.'); 
                                    mLEADING0_NUMBER(); 
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:170: ( EXP_PART )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:498:170: EXP_PART
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

    // $ANTLR start OCTAL
    public final void mOCTAL() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:9: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
            match('0'); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:13: ( '_' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='_') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:13: '_'
                    {
                    match('_'); 

                    }
                    break;

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:18: ( '0' .. '7' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:29: ( ( '_' )? '0' .. '7' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='7')||LA13_0=='_') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:30: ( '_' )? '0' .. '7'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:30: ( '_' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0=='_') ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:507:30: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:1: ( ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:1: ( '0d' ) ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:1: ( '0d' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:2: '0d'
            {
            match("0d"); 


            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:8: ( '0' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:19: ( ( '_' )? '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||LA15_0=='_') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:20: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:20: ( '_' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0=='_') ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:510:20: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

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
    // $ANTLR end LEADING_MARK_DECIMAL

    // $ANTLR start HEX
    public final void mHEX() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:7: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
            match("0x"); 

            mHEX_PART(); 
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:21: ( ( '_' )? HEX_PART )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='F')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='f')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:22: ( '_' )? HEX_PART
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:22: ( '_' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='_') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:512:22: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mHEX_PART(); 

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
    // $ANTLR end HEX

    // $ANTLR start HEX_PART
    public final void mHEX_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:4: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:515:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:10: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
            match("0b"); 

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:14: ( '0' .. '1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:15: '0' .. '1'
            {
            matchRange('0','1'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:25: ( ( '_' )? '0' .. '1' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='1')||LA19_0=='_') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:26: ( '_' )? '0' .. '1'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:26: ( '_' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0=='_') ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:519:26: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','1'); 

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
    // $ANTLR end BINARY

    // $ANTLR start ESCAPE_INT
    public final void mESCAPE_INT() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:23: ( ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:23: ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:23: ( CONTROL_PART | META_PART )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='M') ) {
                        alt20=2;
                    }
                    else if ( (LA20_1=='C'||LA20_1=='c') ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:24: CONTROL_PART
            	    {
            	    mCONTROL_PART(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:37: META_PART
            	    {
            	    mMETA_PART(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>='\u0000' && LA21_1<='B')||(LA21_1>='D' && LA21_1<='L')||(LA21_1>='N' && LA21_1<='b')||(LA21_1>='d' && LA21_1<='\uFFFE')) ) {
                    alt21=3;
                }
                else {
                    alt21=1;}
            }
            else if ( ((LA21_0>='\u0093' && LA21_0<='\u0255')) ) {
                alt21=2;
            }
            else if ( ((LA21_0>='\u0000' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\u0091')) ) {
                alt21=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("523:49: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:50: '\\u0000' .. '\\u0091'
                    {
                    matchRange('\u0000','\u0091'); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:73: '\\u0093' .. '\\u0255'
                    {
                    matchRange('\u0093','\u0255'); 

                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:523:94: ESCAPE_INT_PART
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:4: ( ( '\\\\C-' | '\\\\c' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:4: ( '\\\\C-' | '\\\\c' )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:4: ( '\\\\C-' | '\\\\c' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\\') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='C') ) {
                    alt22=1;
                }
                else if ( (LA22_1=='c') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("527:4: ( '\\\\C-' | '\\\\c' )", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("527:4: ( '\\\\C-' | '\\\\c' )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:5: '\\\\C-'
                    {
                    match("\\C-"); 


                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:527:12: '\\\\c'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:4: ( '\\\\M-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:531:4: '\\\\M-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:3: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:3: ( '1' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:4: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:14: ( ( '_' )? '0' .. '9' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||LA24_0=='_') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:15: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:15: ( '_' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0=='_') ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:536:15: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    matchRange('0','9'); 

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
    // $ANTLR end NON_LEADING0_NUMBER

    // $ANTLR start LEADING0_NUMBER
    public final void mLEADING0_NUMBER() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:3: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:3: ( '0' .. '9' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:14: ( ( '_' )? '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||LA26_0=='_') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:15: ( '_' )? '0' .. '9'
            	    {
            	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:15: ( '_' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0=='_') ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:539:15: '_'
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
    // $ANTLR end LEADING0_NUMBER

    // $ANTLR start EXP_PART
    public final void mEXP_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:11: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:23: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='-') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:541:23: '-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:35: ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\'') ) {
                alt30=1;
            }
            else if ( (LA30_0=='%') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("545:1: SINGLE_QUOTE_STRING : ( '\\'' ( SINGLE_STRING_CHAR )* '\\'' | '%q' begin= . (tmp= . )* );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:35: '\\'' ( SINGLE_STRING_CHAR )* '\\''
                    {
                    match('\''); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:40: ( SINGLE_STRING_CHAR )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='\uFFFE')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:546:40: SINGLE_STRING_CHAR
                    	    {
                    	    mSINGLE_STRING_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:547:4: '%q' begin= . (tmp= . )*
                    {
                    match("%q"); 

                    int begin = input.LA(1);
                    matchAny(); 
                    System.out.println(begin); end=determineEnd(begin);begin=determineBegin(begin); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:547:103: (tmp= . )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>='\u0000' && LA29_0<='\uFFFE')) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:547:104: tmp= .
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
                    	    break loop29;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:6: ( '\\\\' . | ~ ( '\\\\' | '\\'' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\\') ) {
                alt31=1;
            }
            else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFE')) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("569:1: fragment SINGLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\\'' ) );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:6: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:571:15: ~ ( '\\\\' | '\\'' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:4: ( '\\\\' . | ~ ( '\\\\' | '\"' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\\') ) {
                alt32=1;
            }
            else if ( ((LA32_0>='\u0000' && LA32_0<='!')||(LA32_0>='#' && LA32_0<='[')||(LA32_0>=']' && LA32_0<='\uFFFE')) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("572:1: fragment DOUBLE_STRING_CHAR : ( '\\\\' . | ~ ( '\\\\' | '\"' ) );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:4: '\\\\' .
                    {
                    match('\\'); 
                    matchAny(); 

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:574:13: ~ ( '\\\\' | '\"' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:35: (s= ( '\"' | '%Q' begin= . ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:35: s= ( '\"' | '%Q' begin= . )
            {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:37: ( '\"' | '%Q' begin= . )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\"') ) {
                alt33=1;
            }
            else if ( (LA33_0=='%') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("576:37: ( '\"' | '%Q' begin= . )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:38: '\"'
                    {
                    match('\"'); 
                    expression = new DoubleStringParser(this.parser, input, '"', 0).parseString();

                    }
                    break;
                case 2 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:576:126: '%Q' begin= .
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:11: ( '{' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:580:11: '{'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:11: ( '}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:586:11: '}'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:4: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\\') ) {
                int LA36_1 = input.LA(2);

                if ( ((LA36_1>='\u0000' && LA36_1<='/')||(LA36_1>='8' && LA36_1<='B')||(LA36_1>='D' && LA36_1<='L')||(LA36_1>='N' && LA36_1<='b')||(LA36_1>='d' && LA36_1<='w')||(LA36_1>='y' && LA36_1<='\uFFFE')) ) {
                    alt36=3;
                }
                else if ( (LA36_1=='x') ) {
                    alt36=2;
                }
                else if ( ((LA36_1>='0' && LA36_1<='7')) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("597:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("597:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt34=3;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>='0' && LA34_0<='7')) ) {
                        int LA34_1 = input.LA(2);

                        if ( ((LA34_1>='0' && LA34_1<='7')) ) {
                            int LA34_2 = input.LA(3);

                            if ( ((LA34_2>='0' && LA34_2<='7')) ) {
                                alt34=3;
                            }
                            else {
                                alt34=2;}
                        }
                        else {
                            alt34=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("599:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:10: '0' .. '7'
                            {
                            matchRange('0','7'); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:21: '0' .. '7' '0' .. '7'
                            {
                            matchRange('0','7'); 
                            matchRange('0','7'); 

                            }
                            break;
                        case 3 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:599:41: '0' .. '7' '0' .. '7' '0' .. '7'
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                    {
                    match('\\'); 
                    match('x'); 
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>='0' && LA35_0<='9')||(LA35_0>='A' && LA35_0<='F')||(LA35_0>='a' && LA35_0<='f')) ) {
                        int LA35_1 = input.LA(2);

                        if ( ((LA35_1>='0' && LA35_1<='9')||(LA35_1>='A' && LA35_1<='F')||(LA35_1>='a' && LA35_1<='f')) ) {
                            alt35=2;
                        }
                        else {
                            alt35=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("600:19: ( HEX_PART | HEX_PART HEX_PART )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:20: HEX_PART
                            {
                            mHEX_PART(); 

                            }
                            break;
                        case 2 :
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:600:29: HEX_PART HEX_PART
                            {
                            mHEX_PART(); 
                            mHEX_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:601:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:4: ( '<<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:605:4: '<<'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:4: ( '<<-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:608:4: '<<-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:9: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:613:9: '[]'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:614:8: ( '{}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:614:8: '{}'
            {
            match("{}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HASH

    // $ANTLR start RANGE
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:9: ( 'a....b' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:615:9: 'a....b'
            {
            match("a....b"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RANGE

    // $ANTLR start REGEX
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:9: ( '/abc/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:616:9: '/abc/'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:10: ( ':abc' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:617:10: ':abc'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:27: ( '=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:619:27: '='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:17: ( '+=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:620:17: '+='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:17: ( '-=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:621:17: '-='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:17: ( '*=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:622:17: '*='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:15: ( '/=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:623:15: '/='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:15: ( '%=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:624:15: '%='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:25: ( '~=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:625:25: '~='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:17: ( '**=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:626:17: '**='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:17: ( '&=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:627:17: '&='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:17: ( '^=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:628:17: '^='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:16: ( '|=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:629:16: '|='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:21: ( '<<=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:630:21: '<<='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:22: ( '>>=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:631:22: '>>='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:22: ( '&&=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:632:22: '&&='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:21: ( '||=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:633:21: '||='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:23: ( '..' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:634:23: '..'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:635:23: ( '...' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:635:23: '...'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:12: ( '=>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:637:12: '=>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:17: ( '&&' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:638:17: '&&'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:16: ( '||' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:639:16: '||'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:14: ( '?' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:641:14: '?'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:642:13: ( '(' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:642:13: '('
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:13: ( ')' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:643:13: ')'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:13: ( '[' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:644:13: '['
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:13: ( ']' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:645:13: ']'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:646:16: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:646:16: '[]'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:649:12: ( ',' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:649:12: ','
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:12: ( ':' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:650:12: ':'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:651:13: ( '::' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:651:13: '::'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:653:11: ( '!' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:653:11: '!'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:654:11: ( '~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:654:11: '~'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:655:10: ( '/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:655:10: '/'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:656:11: ( '+' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:656:11: '+'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:12: ( '-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:657:12: '-'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:10: ( '%' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:658:10: '%'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:11: ( '*' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:659:11: '*'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:15: ( '<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:660:15: '<'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:17: ( '>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:661:17: '>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:11: ( '^' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:662:11: '^'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:663:11: ( '|' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:663:11: '|'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:11: ( '&' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:664:11: '&'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:12: ( '**' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:665:12: '**'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:14: ( '<=>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:666:14: '<=>'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:667:20: ( '>=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:667:20: '>='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:668:18: ( '<=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:668:18: '<='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:669:12: ( '==' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:669:12: '=='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:16: ( '===' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:670:16: '==='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:15: ( '!=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:671:15: '!='
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:672:12: ( '=~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:672:12: '=~'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:15: ( '!~' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:673:15: '!~'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:17: ( '>>' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:675:17: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_SHIFT

    public void mTokens() throws RecognitionException {
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: ( T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | RANGE | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT )
        int alt37=86;
        switch ( input.LA(1) ) {
        case 'b':
            {
            int LA37_1 = input.LA(2);

            if ( (LA37_1=='e') ) {
                int LA37_42 = input.LA(3);

                if ( (LA37_42=='g') ) {
                    int LA37_101 = input.LA(4);

                    if ( (LA37_101=='i') ) {
                        int LA37_135 = input.LA(5);

                        if ( (LA37_135=='n') ) {
                            int LA37_150 = input.LA(6);

                            if ( ((LA37_150>='0' && LA37_150<='9')||(LA37_150>='A' && LA37_150<='Z')||(LA37_150>='a' && LA37_150<='z')) ) {
                                alt37=23;
                            }
                            else {
                                alt37=1;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
            }
            else {
                alt37=23;}
            }
            break;
        case 'e':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA37_43 = input.LA(3);

                if ( (LA37_43=='s') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA37_136 = input.LA(5);

                        if ( (LA37_136=='f') ) {
                            int LA37_151 = input.LA(6);

                            if ( ((LA37_151>='0' && LA37_151<='9')||(LA37_151>='A' && LA37_151<='Z')||(LA37_151>='a' && LA37_151<='z')) ) {
                                alt37=23;
                            }
                            else {
                                alt37=6;}
                        }
                        else {
                            alt37=23;}
                        }
                        break;
                    case 'e':
                        {
                        int LA37_137 = input.LA(5);

                        if ( ((LA37_137>='0' && LA37_137<='9')||(LA37_137>='A' && LA37_137<='Z')||(LA37_137>='a' && LA37_137<='z')) ) {
                            alt37=23;
                        }
                        else {
                            alt37=7;}
                        }
                        break;
                    default:
                        alt37=23;}

                }
                else {
                    alt37=23;}
                }
                break;
            case 'x':
                {
                int LA37_44 = input.LA(3);

                if ( (LA37_44=='p') ) {
                    int LA37_103 = input.LA(4);

                    if ( (LA37_103=='r') ) {
                        int LA37_138 = input.LA(5);

                        if ( (LA37_138=='e') ) {
                            int LA37_153 = input.LA(6);

                            if ( (LA37_153=='s') ) {
                                int LA37_163 = input.LA(7);

                                if ( (LA37_163=='s') ) {
                                    int LA37_169 = input.LA(8);

                                    if ( (LA37_169=='i') ) {
                                        int LA37_172 = input.LA(9);

                                        if ( (LA37_172=='o') ) {
                                            int LA37_173 = input.LA(10);

                                            if ( (LA37_173=='n') ) {
                                                switch ( input.LA(11) ) {
                                                case '2':
                                                    {
                                                    int LA37_175 = input.LA(12);

                                                    if ( ((LA37_175>='0' && LA37_175<='9')||(LA37_175>='A' && LA37_175<='Z')||(LA37_175>='a' && LA37_175<='z')) ) {
                                                        alt37=23;
                                                    }
                                                    else {
                                                        alt37=14;}
                                                    }
                                                    break;
                                                case '0':
                                                    {
                                                    int LA37_176 = input.LA(12);

                                                    if ( ((LA37_176>='0' && LA37_176<='9')||(LA37_176>='A' && LA37_176<='Z')||(LA37_176>='a' && LA37_176<='z')) ) {
                                                        alt37=23;
                                                    }
                                                    else {
                                                        alt37=12;}
                                                    }
                                                    break;
                                                case '1':
                                                    {
                                                    int LA37_177 = input.LA(12);

                                                    if ( ((LA37_177>='0' && LA37_177<='9')||(LA37_177>='A' && LA37_177<='Z')||(LA37_177>='a' && LA37_177<='z')) ) {
                                                        alt37=23;
                                                    }
                                                    else {
                                                        alt37=13;}
                                                    }
                                                    break;
                                                default:
                                                    alt37=23;}

                                            }
                                            else {
                                                alt37=23;}
                                        }
                                        else {
                                            alt37=23;}
                                    }
                                    else {
                                        alt37=23;}
                                }
                                else {
                                    alt37=23;}
                            }
                            else {
                                alt37=23;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
                }
                break;
            case 'n':
                {
                int LA37_45 = input.LA(3);

                if ( (LA37_45=='d') ) {
                    int LA37_104 = input.LA(4);

                    if ( ((LA37_104>='0' && LA37_104<='9')||(LA37_104>='A' && LA37_104<='Z')||(LA37_104>='a' && LA37_104<='z')) ) {
                        alt37=23;
                    }
                    else {
                        alt37=2;}
                }
                else {
                    alt37=23;}
                }
                break;
            default:
                alt37=23;}

            }
            break;
        case 'f':
            {
            int LA37_3 = input.LA(2);

            if ( (LA37_3=='a') ) {
                int LA37_46 = input.LA(3);

                if ( (LA37_46=='l') ) {
                    int LA37_105 = input.LA(4);

                    if ( (LA37_105=='s') ) {
                        int LA37_140 = input.LA(5);

                        if ( (LA37_140=='e') ) {
                            int LA37_154 = input.LA(6);

                            if ( ((LA37_154>='0' && LA37_154<='9')||(LA37_154>='A' && LA37_154<='Z')||(LA37_154>='a' && LA37_154<='z')) ) {
                                alt37=23;
                            }
                            else {
                                alt37=3;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
            }
            else {
                alt37=23;}
            }
            break;
        case 'n':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA37_47 = input.LA(3);

                if ( (LA37_47=='t') ) {
                    int LA37_106 = input.LA(4);

                    if ( ((LA37_106>='0' && LA37_106<='9')||(LA37_106>='A' && LA37_106<='Z')||(LA37_106>='a' && LA37_106<='z')) ) {
                        alt37=23;
                    }
                    else {
                        alt37=11;}
                }
                else {
                    alt37=23;}
                }
                break;
            case 'i':
                {
                int LA37_48 = input.LA(3);

                if ( (LA37_48=='l') ) {
                    int LA37_107 = input.LA(4);

                    if ( ((LA37_107>='0' && LA37_107<='9')||(LA37_107>='A' && LA37_107<='Z')||(LA37_107>='a' && LA37_107<='z')) ) {
                        alt37=23;
                    }
                    else {
                        alt37=4;}
                }
                else {
                    alt37=23;}
                }
                break;
            default:
                alt37=23;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA37_49 = input.LA(3);

                if ( (LA37_49=='e') ) {
                    int LA37_108 = input.LA(4);

                    if ( (LA37_108=='n') ) {
                        int LA37_143 = input.LA(5);

                        if ( ((LA37_143>='0' && LA37_143<='9')||(LA37_143>='A' && LA37_143<='Z')||(LA37_143>='a' && LA37_143<='z')) ) {
                            alt37=23;
                        }
                        else {
                            alt37=8;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
                }
                break;
            case 'r':
                {
                int LA37_50 = input.LA(3);

                if ( (LA37_50=='u') ) {
                    int LA37_109 = input.LA(4);

                    if ( (LA37_109=='e') ) {
                        int LA37_144 = input.LA(5);

                        if ( ((LA37_144>='0' && LA37_144<='9')||(LA37_144>='A' && LA37_144<='Z')||(LA37_144>='a' && LA37_144<='z')) ) {
                            alt37=23;
                        }
                        else {
                            alt37=5;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
                }
                break;
            default:
                alt37=23;}

            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA37_51 = input.LA(3);

                if ( (LA37_51=='d') ) {
                    int LA37_110 = input.LA(4);

                    if ( ((LA37_110>='0' && LA37_110<='9')||(LA37_110>='A' && LA37_110<='Z')||(LA37_110>='a' && LA37_110<='z')) ) {
                        alt37=23;
                    }
                    else {
                        alt37=9;}
                }
                else {
                    alt37=23;}
                }
                break;
            case '.':
                {
                alt37=33;
                }
                break;
            default:
                alt37=23;}

            }
            break;
        case 'o':
            {
            int LA37_7 = input.LA(2);

            if ( (LA37_7=='r') ) {
                int LA37_53 = input.LA(3);

                if ( ((LA37_53>='0' && LA37_53<='9')||(LA37_53>='A' && LA37_53<='Z')||(LA37_53>='a' && LA37_53<='z')) ) {
                    alt37=23;
                }
                else {
                    alt37=10;}
            }
            else {
                alt37=23;}
            }
            break;
        case 'i':
            {
            int LA37_8 = input.LA(2);

            if ( (LA37_8=='f') ) {
                int LA37_54 = input.LA(3);

                if ( ((LA37_54>='0' && LA37_54<='9')||(LA37_54>='A' && LA37_54<='Z')||(LA37_54>='a' && LA37_54<='z')) ) {
                    alt37=23;
                }
                else {
                    alt37=15;}
            }
            else {
                alt37=23;}
            }
            break;
        case 'u':
            {
            int LA37_9 = input.LA(2);

            if ( (LA37_9=='n') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA37_113 = input.LA(4);

                    if ( (LA37_113=='e') ) {
                        int LA37_146 = input.LA(5);

                        if ( (LA37_146=='s') ) {
                            int LA37_157 = input.LA(6);

                            if ( (LA37_157=='s') ) {
                                int LA37_165 = input.LA(7);

                                if ( ((LA37_165>='0' && LA37_165<='9')||(LA37_165>='A' && LA37_165<='Z')||(LA37_165>='a' && LA37_165<='z')) ) {
                                    alt37=23;
                                }
                                else {
                                    alt37=16;}
                            }
                            else {
                                alt37=23;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                    }
                    break;
                case 't':
                    {
                    int LA37_114 = input.LA(4);

                    if ( (LA37_114=='i') ) {
                        int LA37_147 = input.LA(5);

                        if ( (LA37_147=='l') ) {
                            int LA37_158 = input.LA(6);

                            if ( ((LA37_158>='0' && LA37_158<='9')||(LA37_158>='A' && LA37_158<='Z')||(LA37_158>='a' && LA37_158<='z')) ) {
                                alt37=23;
                            }
                            else {
                                alt37=18;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                    }
                    break;
                default:
                    alt37=23;}

            }
            else {
                alt37=23;}
            }
            break;
        case 'w':
            {
            int LA37_10 = input.LA(2);

            if ( (LA37_10=='h') ) {
                int LA37_56 = input.LA(3);

                if ( (LA37_56=='i') ) {
                    int LA37_115 = input.LA(4);

                    if ( (LA37_115=='l') ) {
                        int LA37_148 = input.LA(5);

                        if ( (LA37_148=='e') ) {
                            int LA37_159 = input.LA(6);

                            if ( ((LA37_159>='0' && LA37_159<='9')||(LA37_159>='A' && LA37_159<='Z')||(LA37_159>='a' && LA37_159<='z')) ) {
                                alt37=23;
                            }
                            else {
                                alt37=17;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
            }
            else {
                alt37=23;}
            }
            break;
        case 'r':
            {
            int LA37_11 = input.LA(2);

            if ( (LA37_11=='e') ) {
                int LA37_57 = input.LA(3);

                if ( (LA37_57=='s') ) {
                    int LA37_116 = input.LA(4);

                    if ( (LA37_116=='u') ) {
                        int LA37_149 = input.LA(5);

                        if ( (LA37_149=='c') ) {
                            int LA37_160 = input.LA(6);

                            if ( (LA37_160=='e') ) {
                                int LA37_168 = input.LA(7);

                                if ( ((LA37_168>='0' && LA37_168<='9')||(LA37_168>='A' && LA37_168<='Z')||(LA37_168>='a' && LA37_168<='z')) ) {
                                    alt37=23;
                                }
                                else {
                                    alt37=19;}
                            }
                            else {
                                alt37=23;}
                        }
                        else {
                            alt37=23;}
                    }
                    else {
                        alt37=23;}
                }
                else {
                    alt37=23;}
            }
            else {
                alt37=23;}
            }
            break;
        case ';':
            {
            alt37=20;
            }
            break;
        case '\n':
        case '\r':
            {
            alt37=21;
            }
            break;
        case '\t':
        case ' ':
            {
            alt37=22;
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
        case 'c':
        case 'd':
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
            alt37=23;
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt37=38;
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
                alt37=24;
                }
                break;
            default:
                alt37=69;}

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
            alt37=24;
            }
            break;
        case '\'':
            {
            alt37=25;
            }
            break;
        case '%':
            {
            switch ( input.LA(2) ) {
            case 'q':
                {
                alt37=25;
                }
                break;
            case 'Q':
                {
                alt37=26;
                }
                break;
            case '=':
                {
                alt37=41;
                }
                break;
            default:
                alt37=70;}

            }
            break;
        case '\"':
            {
            alt37=26;
            }
            break;
        case '{':
            {
            int LA37_21 = input.LA(2);

            if ( (LA37_21=='}') ) {
                alt37=32;
            }
            else {
                alt37=27;}
            }
            break;
        case '}':
            {
            alt37=28;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '<':
                {
                switch ( input.LA(3) ) {
                case '-':
                    {
                    alt37=30;
                    }
                    break;
                case '=':
                    {
                    alt37=47;
                    }
                    break;
                default:
                    alt37=29;}

                }
                break;
            case '=':
                {
                int LA37_65 = input.LA(3);

                if ( (LA37_65=='>') ) {
                    alt37=78;
                }
                else {
                    alt37=80;}
                }
                break;
            default:
                alt37=72;}

            }
            break;
        case '[':
            {
            int LA37_24 = input.LA(2);

            if ( (LA37_24==']') ) {
                alt37=31;
            }
            else {
                alt37=59;}
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt37=40;
                }
                break;
            case 'a':
                {
                alt37=34;
                }
                break;
            default:
                alt37=67;}

            }
            break;
        case ':':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                alt37=35;
                }
                break;
            case ':':
                {
                alt37=64;
                }
                break;
            default:
                alt37=63;}

            }
            break;
        case '=':
            {
            switch ( input.LA(2) ) {
            case '~':
                {
                alt37=84;
                }
                break;
            case '=':
                {
                int LA37_76 = input.LA(3);

                if ( (LA37_76=='=') ) {
                    alt37=82;
                }
                else {
                    alt37=81;}
                }
                break;
            case '>':
                {
                alt37=53;
                }
                break;
            default:
                alt37=36;}

            }
            break;
        case '+':
            {
            int LA37_28 = input.LA(2);

            if ( (LA37_28=='=') ) {
                alt37=37;
            }
            else {
                alt37=68;}
            }
            break;
        case '*':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt37=39;
                }
                break;
            case '*':
                {
                int LA37_82 = input.LA(3);

                if ( (LA37_82=='=') ) {
                    alt37=43;
                }
                else {
                    alt37=77;}
                }
                break;
            default:
                alt37=71;}

            }
            break;
        case '~':
            {
            int LA37_30 = input.LA(2);

            if ( (LA37_30=='=') ) {
                alt37=42;
            }
            else {
                alt37=66;}
            }
            break;
        case '&':
            {
            switch ( input.LA(2) ) {
            case '&':
                {
                int LA37_86 = input.LA(3);

                if ( (LA37_86=='=') ) {
                    alt37=49;
                }
                else {
                    alt37=54;}
                }
                break;
            case '=':
                {
                alt37=44;
                }
                break;
            default:
                alt37=76;}

            }
            break;
        case '^':
            {
            int LA37_32 = input.LA(2);

            if ( (LA37_32=='=') ) {
                alt37=45;
            }
            else {
                alt37=74;}
            }
            break;
        case '|':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt37=46;
                }
                break;
            case '|':
                {
                int LA37_92 = input.LA(3);

                if ( (LA37_92=='=') ) {
                    alt37=50;
                }
                else {
                    alt37=55;}
                }
                break;
            default:
                alt37=75;}

            }
            break;
        case '>':
            {
            switch ( input.LA(2) ) {
            case '=':
                {
                alt37=79;
                }
                break;
            case '>':
                {
                int LA37_95 = input.LA(3);

                if ( (LA37_95=='=') ) {
                    alt37=48;
                }
                else {
                    alt37=86;}
                }
                break;
            default:
                alt37=73;}

            }
            break;
        case '.':
            {
            int LA37_35 = input.LA(2);

            if ( (LA37_35=='.') ) {
                int LA37_97 = input.LA(3);

                if ( (LA37_97=='.') ) {
                    alt37=52;
                }
                else {
                    alt37=51;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | RANGE | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT );", 37, 35, input);

                throw nvae;
            }
            }
            break;
        case '?':
            {
            alt37=56;
            }
            break;
        case '(':
            {
            alt37=57;
            }
            break;
        case ')':
            {
            alt37=58;
            }
            break;
        case ']':
            {
            alt37=60;
            }
            break;
        case ',':
            {
            alt37=62;
            }
            break;
        case '!':
            {
            switch ( input.LA(2) ) {
            case '~':
                {
                alt37=85;
                }
                break;
            case '=':
                {
                alt37=83;
                }
                break;
            default:
                alt37=65;}

            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | LCURLY | RCURLY | HEREDOC_BEGIN | HEREDOC_INDENT_BEGIN | ARRAY | HASH | RANGE | REGEX | SYMBOL | ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | COMPLEMENT_ASSIGN | POWER_ASSIGN | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LEFT_SHIFT_ASSIGN | RIGHT_SHIFT_ASSIGN | LOGICAL_AND_ASSIGN | LOGICAL_OR_ASSIGN | INCLUSIVE_RANGE | EXCLUSIVE_RANGE | ASSOC | LOGICAL_AND | LOGICAL_OR | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | EMPTY_ARRAY | COMMA | COLON | COLON2 | NOT | BNOT | DIV | PLUS | MINUS | MOD | STAR | LESS_THAN | GREATER_THAN | BXOR | BOR | BAND | POWER | COMPARE | GREATER_OR_EQUAL | LESS_OR_EQUAL | EQUAL | CASE_EQUAL | NOT_EQUAL | MATCH | NOT_MATCH | RIGHT_SHIFT );", 37, 0, input);

            throw nvae;
        }

        switch (alt37) {
            case 1 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T110
                {
                mT110(); 

                }
                break;
            case 2 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:15: T111
                {
                mT111(); 

                }
                break;
            case 3 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:20: T112
                {
                mT112(); 

                }
                break;
            case 4 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:25: T113
                {
                mT113(); 

                }
                break;
            case 5 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T114
                {
                mT114(); 

                }
                break;
            case 6 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:35: T115
                {
                mT115(); 

                }
                break;
            case 7 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:40: T116
                {
                mT116(); 

                }
                break;
            case 8 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:45: T117
                {
                mT117(); 

                }
                break;
            case 9 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T118
                {
                mT118(); 

                }
                break;
            case 10 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:55: T119
                {
                mT119(); 

                }
                break;
            case 11 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:60: T120
                {
                mT120(); 

                }
                break;
            case 12 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:65: T121
                {
                mT121(); 

                }
                break;
            case 13 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:70: T122
                {
                mT122(); 

                }
                break;
            case 14 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:75: T123
                {
                mT123(); 

                }
                break;
            case 15 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:80: IF_MODIFIER
                {
                mIF_MODIFIER(); 

                }
                break;
            case 16 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:92: UNLESS_MODIFIER
                {
                mUNLESS_MODIFIER(); 

                }
                break;
            case 17 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:108: WHILE_MODIFIER
                {
                mWHILE_MODIFIER(); 

                }
                break;
            case 18 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:123: UNTIL_MODIFIER
                {
                mUNTIL_MODIFIER(); 

                }
                break;
            case 19 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:138: RESCUE_MODIFIER
                {
                mRESCUE_MODIFIER(); 

                }
                break;
            case 20 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:154: SEMI
                {
                mSEMI(); 

                }
                break;
            case 21 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:159: LINE_BREAK
                {
                mLINE_BREAK(); 

                }
                break;
            case 22 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:170: WS
                {
                mWS(); 

                }
                break;
            case 23 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:173: ID
                {
                mID(); 

                }
                break;
            case 24 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:176: INT
                {
                mINT(); 

                }
                break;
            case 25 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:180: SINGLE_QUOTE_STRING
                {
                mSINGLE_QUOTE_STRING(); 

                }
                break;
            case 26 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:200: DOUBLE_QUOTE_STRING
                {
                mDOUBLE_QUOTE_STRING(); 

                }
                break;
            case 27 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:220: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 28 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:227: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 29 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:234: HEREDOC_BEGIN
                {
                mHEREDOC_BEGIN(); 

                }
                break;
            case 30 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:248: HEREDOC_INDENT_BEGIN
                {
                mHEREDOC_INDENT_BEGIN(); 

                }
                break;
            case 31 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:269: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 32 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:275: HASH
                {
                mHASH(); 

                }
                break;
            case 33 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:280: RANGE
                {
                mRANGE(); 

                }
                break;
            case 34 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:286: REGEX
                {
                mREGEX(); 

                }
                break;
            case 35 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:292: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 36 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:299: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 37 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:306: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 

                }
                break;
            case 38 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:318: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 

                }
                break;
            case 39 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:331: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 

                }
                break;
            case 40 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:343: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 

                }
                break;
            case 41 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:354: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 

                }
                break;
            case 42 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:365: COMPLEMENT_ASSIGN
                {
                mCOMPLEMENT_ASSIGN(); 

                }
                break;
            case 43 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:383: POWER_ASSIGN
                {
                mPOWER_ASSIGN(); 

                }
                break;
            case 44 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:396: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 

                }
                break;
            case 45 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:408: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 

                }
                break;
            case 46 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:420: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 

                }
                break;
            case 47 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:431: LEFT_SHIFT_ASSIGN
                {
                mLEFT_SHIFT_ASSIGN(); 

                }
                break;
            case 48 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:449: RIGHT_SHIFT_ASSIGN
                {
                mRIGHT_SHIFT_ASSIGN(); 

                }
                break;
            case 49 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:468: LOGICAL_AND_ASSIGN
                {
                mLOGICAL_AND_ASSIGN(); 

                }
                break;
            case 50 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:487: LOGICAL_OR_ASSIGN
                {
                mLOGICAL_OR_ASSIGN(); 

                }
                break;
            case 51 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:505: INCLUSIVE_RANGE
                {
                mINCLUSIVE_RANGE(); 

                }
                break;
            case 52 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:521: EXCLUSIVE_RANGE
                {
                mEXCLUSIVE_RANGE(); 

                }
                break;
            case 53 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:537: ASSOC
                {
                mASSOC(); 

                }
                break;
            case 54 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:543: LOGICAL_AND
                {
                mLOGICAL_AND(); 

                }
                break;
            case 55 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:555: LOGICAL_OR
                {
                mLOGICAL_OR(); 

                }
                break;
            case 56 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:566: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 57 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:575: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 58 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:582: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 59 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:589: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 60 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:596: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 61 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:603: EMPTY_ARRAY
                {
                mEMPTY_ARRAY(); 

                }
                break;
            case 62 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:615: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 63 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:621: COLON
                {
                mCOLON(); 

                }
                break;
            case 64 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:627: COLON2
                {
                mCOLON2(); 

                }
                break;
            case 65 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:634: NOT
                {
                mNOT(); 

                }
                break;
            case 66 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:638: BNOT
                {
                mBNOT(); 

                }
                break;
            case 67 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:643: DIV
                {
                mDIV(); 

                }
                break;
            case 68 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:647: PLUS
                {
                mPLUS(); 

                }
                break;
            case 69 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:652: MINUS
                {
                mMINUS(); 

                }
                break;
            case 70 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:658: MOD
                {
                mMOD(); 

                }
                break;
            case 71 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:662: STAR
                {
                mSTAR(); 

                }
                break;
            case 72 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:667: LESS_THAN
                {
                mLESS_THAN(); 

                }
                break;
            case 73 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:677: GREATER_THAN
                {
                mGREATER_THAN(); 

                }
                break;
            case 74 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:690: BXOR
                {
                mBXOR(); 

                }
                break;
            case 75 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:695: BOR
                {
                mBOR(); 

                }
                break;
            case 76 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:699: BAND
                {
                mBAND(); 

                }
                break;
            case 77 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:704: POWER
                {
                mPOWER(); 

                }
                break;
            case 78 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:710: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 79 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:718: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 

                }
                break;
            case 80 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:735: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 

                }
                break;
            case 81 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:749: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 82 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:755: CASE_EQUAL
                {
                mCASE_EQUAL(); 

                }
                break;
            case 83 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:766: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 84 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:776: MATCH
                {
                mMATCH(); 

                }
                break;
            case 85 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:782: NOT_MATCH
                {
                mNOT_MATCH(); 

                }
                break;
            case 86 :
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:792: RIGHT_SHIFT
                {
                mRIGHT_SHIFT(); 

                }
                break;

        }

    }


 

}