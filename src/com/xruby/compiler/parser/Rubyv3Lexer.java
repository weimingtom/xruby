// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-03 13:18:45

package com.xruby.compiler.parser;


import org.antlr.runtime.*;

public class Rubyv3Lexer extends BaseLexer {
    public static final int SINGLETON_METHOD = 22;
    public static final int STATEMENT_LIST = 4;
    public static final int STATEMENT = 5;
    public static final int ESCAPE_INT = 43;
    public static final int HASH = 36;
    public static final int ARRAY = 35;
    public static final int HEX_PART = 44;
    public static final int T58 = 58;
    public static final int FLOAT = 34;
    public static final int OCTAL = 39;
    public static final int META_PART = 46;
    public static final int T61 = 61;
    public static final int LEADING0_NUMBER = 50;
    public static final int DECIMAL = 40;
    public static final int BINARY = 42;
    public static final int T64 = 64;
    public static final int UNTIL_MODIFIER = 27;
    public static final int BLOCK = 15;
    public static final int LINE_BREAK = 30;
    public static final int INT = 33;
    public static final int IF_MODIFIER = 24;
    public static final int MULTIPLE_ASSIGN = 16;
    public static final int ESCAPE_INT_PART = 47;
    public static final int REGEX = 38;
    public static final int SYMBOL = 14;
    public static final int CONTROL_PART = 45;
    public static final int DOUBLE_QUOTE_STRING = 52;
    public static final int ASSIGNMENT = 13;
    public static final int BODY = 9;
    public static final int UNLESS_MODIFIER = 25;
    public static final int HEREDOC_STRING = 53;
    public static final int ID = 32;
    public static final int T62 = 62;
    public static final int T55 = 55;
    public static final int RANGE = 37;
    public static final int SHIFT = 12;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA = 19;
    public static final int WS = 31;
    public static final int STRING = 23;
    public static final int T66 = 66;
    public static final int NESTED_LHS = 21;
    public static final int T63 = 63;
    public static final int T57 = 57;
    public static final int NON_LEADING0_NUMBER = 48;
    public static final int T65 = 65;
    public static final int SINGLE_QUOTE_STRING = 51;
    public static final int HEREDOC_BEGIN = 54;
    public static final int WHILE_MODIFIER = 26;
    public static final int T56 = 56;
    public static final int SEMI = 29;
    public static final int EXP_PART = 49;
    public static final int T59 = 59;
    public static final int MRHS = 20;
    public static final int BLOCK_ARG = 18;
    public static final int IF = 7;
    public static final int ARG = 11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA = 17;
    public static final int EOF = -1;
    public static final int T67 = 67;
    public static final int CALL = 10;
    public static final int Tokens = 68;
    public static final int T60 = 60;
    public static final int RESCUE_MODIFIER = 28;
    public static final int MODIFIER_LINE = 6;
    public static final int RPAREN_IN_METHOD_DEFINATION = 8;
    public static final int HEX = 41;

    /**
     * Override this method to change where error messages go
     */
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

    /*public Token emit() {
    IntToken t =
        new IntToken(input, type, channel,
                    tokenStartCharIndex, getCharIndex()-1);
    t.setLine(tokenStartLine);
    t.setText(text);
    t.setCharPositionInLine(tokenStartCharPositionInLine);
    emit(t);
    return t;
    }*/

    /*private Token createIntToken() {
      return new IntToken(input, channel, tokenStartCharIndex, getCharIndex()-1);
    }*/

    private Token createStringToken() {
        return new StringToken(input, channel, tokenStartCharIndex, getCharIndex() - 1);
    }

    private int determineBegin(int begin) {
        int result = 0; //if collide with EOF, then we can use other value like -3,-7
        if (begin == '[' || begin == '{' || begin == '(' || begin == '<') {
            result = begin;
        }
        return result;
    }

    private int determineEnd(int begin) {
        int end = 0;
        if (begin == '[') {
            end = ']';
        } else if (begin == '{') {
            end = '}';
        } else if (begin == '(') {
            end = ')';
        } else if (begin == '<') {
            end = '>';
        } else {
            end = begin;
        }
        return end;
    }

    public Rubyv3Lexer() {
        ;
    }

    public Rubyv3Lexer(CharStream input) {
        super(input);
    }

    public String getGrammarFileName() {
        return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g";
    }

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:66:7: ( 'begin' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:66:7: 'begin'
            {
                match("begin");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56

    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:67:7: ( 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:67:7: 'end'
            {
                match("end");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57

    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:68:7: ( 'false' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:68:7: 'false'
            {
                match("false");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58

    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:69:7: ( 'nil' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:69:7: 'nil'
            {
                match("nil");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59

    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:70:7: ( 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:70:7: 'true'
            {
                match("true");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60

    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:71:7: ( 'elsif' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:71:7: 'elsif'
            {
                match("elsif");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61

    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:72:7: ( 'else' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:72:7: 'else'
            {
                match("else");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62

    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:73:7: ( ':' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:73:7: ':'
            {
                match(':');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63

    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:74:7: ( 'then' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:74:7: 'then'
            {
                match("then");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64

    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:75:7: ( 'expression0' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:75:7: 'expression0'
            {
                match("expression0");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65

    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:76:7: ( 'expression1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:76:7: 'expression1'
            {
                match("expression1");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66

    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:77:7: ( 'expression2' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:77:7: 'expression2'
            {
                match("expression2");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67

    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:78:7: ( '=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:78:7: '='
            {
                match('=');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start IF_MODIFIER

    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:140:20: ( 'if' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:140:20: 'if'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:141:20: ( 'unless' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:141:20: 'unless'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:142:20: ( 'while' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:142:20: 'while'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:143:20: ( 'until' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:143:20: 'until'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:144:20: ( 'resuce' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:144:20: 'resuce'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:7: ( ';' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:146:7: ';'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:179:3: ( ( '\\r' )? '\\n' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:179:3: ( '\\r' )? '\\n'
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:179:3: ( '\\r' )?
                int alt1 = 2;
                int LA1_0 = input.LA(1);

                if ((LA1_0 == '\r')) {
                    alt1 = 1;
                }
                switch (alt1) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:179:3: '\\r'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:6: ( ( ' ' | '\\t' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:6: ( ' ' | '\\t' )
            {
                if (input.LA(1) == '\t' || input.LA(1) == ' ') {
                    input.consume();

                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();

                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:28: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
                loop2:
                do {
                    int alt2 = 3;
                    int LA2_0 = input.LA(1);

                    if (((LA2_0 >= 'A' && LA2_0 <= 'Z') || (LA2_0 >= 'a' && LA2_0 <= 'z'))) {
                        alt2 = 1;
                    } else if (((LA2_0 >= '0' && LA2_0 <= '9'))) {
                        alt2 = 2;
                    }


                    switch (alt2) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:29: ( 'a' .. 'z' | 'A' .. 'Z' )
                        {
                            if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();

                            } else {
                                MismatchedSetException mse =
                                        new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }


                        }
                        break;
                        case 2:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:53: ( '0' .. '9' )
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:53: ( '0' .. '9' )
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:54: '0' .. '9'
                            {
                                matchRange('0', '9');

                            }


                        }
                        break;

                        default:
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:4: ( ( '-' )? ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:4: ( '-' )? ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:4: ( '-' )?
                int alt3 = 2;
                int LA3_0 = input.LA(1);

                if ((LA3_0 == '-')) {
                    alt3 = 1;
                }
                switch (alt3) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:4: '-'
                    {
                        match('-');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:8: ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )
                int alt4 = 5;
                switch (input.LA(1)) {
                    case '0': {
                        switch (input.LA(2)) {
                            case 'b': {
                                alt4 = 4;
                            }
                            break;
                            case 'd': {
                                alt4 = 2;
                            }
                            break;
                            case 'x': {
                                alt4 = 3;
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
                            case '_': {
                                alt4 = 1;
                            }
                            break;
                            default:
                                NoViableAltException nvae =
                                        new NoViableAltException("198:8: ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )", 4, 1, input);

                                throw nvae;
                        }

                    }
                    break;
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9': {
                        alt4 = 2;
                    }
                    break;
                    case '?': {
                        alt4 = 5;
                    }
                    break;
                    default:
                        NoViableAltException nvae =
                                new NoViableAltException("198:8: ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )", 4, 0, input);

                        throw nvae;
                }

                switch (alt4) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:9: OCTAL
                    {
                        mOCTAL();

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:15: DECIMAL
                    {
                        mDECIMAL();

                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:23: HEX
                    {
                        mHEX();

                    }
                    break;
                    case 4:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:27: BINARY
                    {
                        mBINARY();

                    }
                    break;
                    case 5:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:198:35: ESCAPE_INT
                    {
                        mESCAPE_INT();

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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:9: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
                match('0');
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:13: ( '_' )?
                int alt5 = 2;
                int LA5_0 = input.LA(1);

                if ((LA5_0 == '_')) {
                    alt5 = 1;
                }
                switch (alt5) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:13: '_'
                    {
                        match('_');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:18: ( '0' .. '7' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:19: '0' .. '7'
                {
                    matchRange('0', '7');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:29: ( ( '_' )? '0' .. '7' )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if (((LA7_0 >= '0' && LA7_0 <= '7') || LA7_0 == '_')) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:30: ( '_' )? '0' .. '7'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:30: ( '_' )?
                            int alt6 = 2;
                            int LA6_0 = input.LA(1);

                            if ((LA6_0 == '_')) {
                                alt6 = 1;
                            }
                            switch (alt6) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:201:30: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '7');

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end OCTAL

    // $ANTLR start DECIMAL

    public final void mDECIMAL() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:1: ( ( '0d' )? ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:1: ( '0d' )? ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:1: ( '0d' )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);

                if ((LA8_0 == '0')) {
                    alt8 = 1;
                }
                switch (alt8) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:2: '0d'
                    {
                        match("0d");


                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:8: ( '1' .. '9' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:9: '1' .. '9'
                {
                    matchRange('1', '9');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:19: ( ( '_' )? '0' .. '9' )*
                loop10:
                do {
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);

                    if (((LA10_0 >= '0' && LA10_0 <= '9') || LA10_0 == '_')) {
                        alt10 = 1;
                    }


                    switch (alt10) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:20: ( '_' )? '0' .. '9'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:20: ( '_' )?
                            int alt9 = 2;
                            int LA9_0 = input.LA(1);

                            if ((LA9_0 == '_')) {
                                alt9 = 1;
                            }
                            switch (alt9) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:20: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '9');

                        }
                        break;

                        default:
                            break loop10;
                    }
                } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end DECIMAL

    // $ANTLR start HEX

    public final void mHEX() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:7: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
                match("0x");

                mHEX_PART();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:21: ( ( '_' )? HEX_PART )*
                loop12:
                do {
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);

                    if (((LA12_0 >= '0' && LA12_0 <= '9') || (LA12_0 >= 'A' && LA12_0 <= 'F') || LA12_0 == '_' || (LA12_0 >= 'a' && LA12_0 <= 'f'))) {
                        alt12 = 1;
                    }


                    switch (alt12) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:22: ( '_' )? HEX_PART
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:22: ( '_' )?
                            int alt11 = 2;
                            int LA11_0 = input.LA(1);

                            if ((LA11_0 == '_')) {
                                alt11 = 1;
                            }
                            switch (alt11) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:22: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            mHEX_PART();

                        }
                        break;

                        default:
                            break loop12;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:209:4: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:209:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F') || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
                    input.consume();

                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:10: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
                match("0b");

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:14: ( '0' .. '1' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:15: '0' .. '1'
                {
                    matchRange('0', '1');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:25: ( ( '_' )? '0' .. '1' )*
                loop14:
                do {
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);

                    if (((LA14_0 >= '0' && LA14_0 <= '1') || LA14_0 == '_')) {
                        alt14 = 1;
                    }


                    switch (alt14) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:26: ( '_' )? '0' .. '1'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:26: ( '_' )?
                            int alt13 = 2;
                            int LA13_0 = input.LA(1);

                            if ((LA13_0 == '_')) {
                                alt13 = 1;
                            }
                            switch (alt13) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:26: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '1');

                        }
                        break;

                        default:
                            break loop14;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:10: ( '?' ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:10: '?' ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
            {
                match('?');
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:13: ( CONTROL_PART | META_PART )*
                loop15:
                do {
                    int alt15 = 3;
                    int LA15_0 = input.LA(1);

                    if ((LA15_0 == '\\')) {
                        int LA15_1 = input.LA(2);

                        if ((LA15_1 == 'C' || LA15_1 == 'c')) {
                            alt15 = 1;
                        } else if ((LA15_1 == 'M')) {
                            alt15 = 2;
                        }


                    }


                    switch (alt15) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:14: CONTROL_PART
                        {
                            mCONTROL_PART();

                        }
                        break;
                        case 2:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:27: META_PART
                        {
                            mMETA_PART();

                        }
                        break;

                        default:
                            break loop15;
                    }
                } while (true);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:39: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )
                int alt16 = 3;
                int LA16_0 = input.LA(1);

                if ((LA16_0 == '\\')) {
                    int LA16_1 = input.LA(2);

                    if (((LA16_1 >= '\u0000' && LA16_1 <= 'B') || (LA16_1 >= 'D' && LA16_1 <= 'L') || (LA16_1 >= 'N' && LA16_1 <= 'b') || (LA16_1 >= 'd' && LA16_1 <= '\uFFFE'))) {
                        alt16 = 3;
                    } else {
                        alt16 = 1;
                    }
                } else if (((LA16_0 >= '\u0093' && LA16_0 <= '\u0255'))) {
                    alt16 = 2;
                } else if (((LA16_0 >= '\u0000' && LA16_0 <= '[') || (LA16_0 >= ']' && LA16_0 <= '\u0091'))) {
                    alt16 = 1;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("217:39: ( '\\u0000' .. '\\u0091' | '\\u0093' .. '\\u0255' | ESCAPE_INT_PART )", 16, 0, input);

                    throw nvae;
                }
                switch (alt16) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:40: '\\u0000' .. '\\u0091'
                    {
                        matchRange('\u0000', '\u0091');

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:63: '\\u0093' .. '\\u0255'
                    {
                        matchRange('\u0093', '\u0255');

                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:84: ESCAPE_INT_PART
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:4: ( ( '\\\\C-' | '\\\\c' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:4: ( '\\\\C-' | '\\\\c' )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:4: ( '\\\\C-' | '\\\\c' )
                int alt17 = 2;
                int LA17_0 = input.LA(1);

                if ((LA17_0 == '\\')) {
                    int LA17_1 = input.LA(2);

                    if ((LA17_1 == 'C')) {
                        alt17 = 1;
                    } else if ((LA17_1 == 'c')) {
                        alt17 = 2;
                    } else {
                        NoViableAltException nvae =
                                new NoViableAltException("221:4: ( '\\\\C-' | '\\\\c' )", 17, 1, input);

                        throw nvae;
                    }
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("221:4: ( '\\\\C-' | '\\\\c' )", 17, 0, input);

                    throw nvae;
                }
                switch (alt17) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:5: '\\\\C-'
                    {
                        match("\\C-");


                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:12: '\\\\c'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:225:4: ( '\\\\M-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:225:4: '\\\\M-'
            {
                match("\\M-");


            }

        }
        finally {
        }
    }
    // $ANTLR end META_PART

    // $ANTLR start ESCAPE_INT_PART

    public final void mESCAPE_INT_PART() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:229:4: ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) )
            int alt20 = 3;
            int LA20_0 = input.LA(1);

            if ((LA20_0 == '\\')) {
                int LA20_1 = input.LA(2);

                if ((LA20_1 == 'x')) {
                    alt20 = 2;
                } else
                if (((LA20_1 >= '\u0000' && LA20_1 <= '/') || (LA20_1 >= '8' && LA20_1 <= 'B') || (LA20_1 >= 'D' && LA20_1 <= 'L') || (LA20_1 >= 'N' && LA20_1 <= 'b') || (LA20_1 >= 'd' && LA20_1 <= 'w') || (LA20_1 >= 'y' && LA20_1 <= '\uFFFE'))) {
                    alt20 = 3;
                } else if (((LA20_1 >= '0' && LA20_1 <= '7'))) {
                    alt20 = 1;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("227:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 20, 1, input);

                    throw nvae;
                }
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("227:1: fragment ESCAPE_INT_PART : ( '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' ) | '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART ) | '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' ) );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:229:4: '\\\\' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                {
                    match('\\');
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:229:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )
                    int alt18 = 3;
                    int LA18_0 = input.LA(1);

                    if (((LA18_0 >= '0' && LA18_0 <= '7'))) {
                        int LA18_1 = input.LA(2);

                        if (((LA18_1 >= '0' && LA18_1 <= '7'))) {
                            int LA18_2 = input.LA(3);

                            if (((LA18_2 >= '0' && LA18_2 <= '7'))) {
                                alt18 = 3;
                            } else {
                                alt18 = 2;
                            }
                        } else {
                            alt18 = 1;
                        }
                    } else {
                        NoViableAltException nvae =
                                new NoViableAltException("229:9: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' '0' .. '7' )", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:229:10: '0' .. '7'
                        {
                            matchRange('0', '7');

                        }
                        break;
                        case 2:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:229:21: '0' .. '7' '0' .. '7'
                        {
                            matchRange('0', '7');
                            matchRange('0', '7');

                        }
                        break;
                        case 3:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:229:41: '0' .. '7' '0' .. '7' '0' .. '7'
                        {
                            matchRange('0', '7');
                            matchRange('0', '7');
                            matchRange('0', '7');

                        }
                        break;

                    }


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:230:10: '\\\\' 'x' ( HEX_PART | HEX_PART HEX_PART )
                {
                    match('\\');
                    match('x');
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:230:19: ( HEX_PART | HEX_PART HEX_PART )
                    int alt19 = 2;
                    int LA19_0 = input.LA(1);

                    if (((LA19_0 >= '0' && LA19_0 <= '9') || (LA19_0 >= 'A' && LA19_0 <= 'F') || (LA19_0 >= 'a' && LA19_0 <= 'f'))) {
                        int LA19_1 = input.LA(2);

                        if (((LA19_1 >= '0' && LA19_1 <= '9') || (LA19_1 >= 'A' && LA19_1 <= 'F') || (LA19_1 >= 'a' && LA19_1 <= 'f'))) {
                            alt19 = 2;
                        } else {
                            alt19 = 1;
                        }
                    } else {
                        NoViableAltException nvae =
                                new NoViableAltException("230:19: ( HEX_PART | HEX_PART HEX_PART )", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:230:20: HEX_PART
                        {
                            mHEX_PART();

                        }
                        break;
                        case 2:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:230:29: HEX_PART HEX_PART
                        {
                            mHEX_PART();
                            mHEX_PART();

                        }
                        break;

                    }


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:231:10: '\\\\' ~ ( '0' .. '7' | 'x' | 'c' | 'M' | 'C' )
                {
                    match('\\');
                    if ((input.LA(1) >= '\u0000' && input.LA(1) <= '/') || (input.LA(1) >= '8' && input.LA(1) <= 'B') || (input.LA(1) >= 'D' && input.LA(1) <= 'L') || (input.LA(1) >= 'N' && input.LA(1) <= 'b') || (input.LA(1) >= 'd' && input.LA(1) <= 'w') || (input.LA(1) >= 'y' && input.LA(1) <= '\uFFFE')) {
                        input.consume();

                    } else {
                        MismatchedSetException mse =
                                new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }


                }
                break;

            }
        }
        finally {
        }
    }
    // $ANTLR end ESCAPE_INT_PART

    // $ANTLR start FLOAT

    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:9: ( ( '-' )? ( NON_LEADING0_NUMBER | '0' ) ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:9: ( '-' )? ( NON_LEADING0_NUMBER | '0' ) ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:9: ( '-' )?
                int alt21 = 2;
                int LA21_0 = input.LA(1);

                if ((LA21_0 == '-')) {
                    alt21 = 1;
                }
                switch (alt21) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:9: '-'
                    {
                        match('-');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:13: ( NON_LEADING0_NUMBER | '0' )
                int alt22 = 2;
                int LA22_0 = input.LA(1);

                if (((LA22_0 >= '1' && LA22_0 <= '9'))) {
                    alt22 = 1;
                } else if ((LA22_0 == '0')) {
                    alt22 = 2;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("233:13: ( NON_LEADING0_NUMBER | '0' )", 22, 0, input);

                    throw nvae;
                }
                switch (alt22) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:15: NON_LEADING0_NUMBER
                    {
                        mNON_LEADING0_NUMBER();

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:37: '0'
                    {
                        match('0');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:42: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                int alt24 = 2;
                int LA24_0 = input.LA(1);

                if ((LA24_0 == 'E' || LA24_0 == 'e')) {
                    alt24 = 1;
                } else if ((LA24_0 == '.')) {
                    alt24 = 2;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("233:42: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 24, 0, input);

                    throw nvae;
                }
                switch (alt24) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:43: EXP_PART
                    {
                        mEXP_PART();

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:54: '.' LEADING0_NUMBER ( EXP_PART )?
                    {
                        match('.');
                        mLEADING0_NUMBER();
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:74: ( EXP_PART )?
                        int alt23 = 2;
                        int LA23_0 = input.LA(1);

                        if ((LA23_0 == 'E' || LA23_0 == 'e')) {
                            alt23 = 1;
                        }
                        switch (alt23) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:233:74: EXP_PART
                            {
                                mEXP_PART();

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
    // $ANTLR end FLOAT

    // $ANTLR start NON_LEADING0_NUMBER

    public final void mNON_LEADING0_NUMBER() throws RecognitionException {
        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:3: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:3: ( '1' .. '9' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:4: '1' .. '9'
                {
                    matchRange('1', '9');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:14: ( ( '_' )? '0' .. '9' )*
                loop26:
                do {
                    int alt26 = 2;
                    int LA26_0 = input.LA(1);

                    if (((LA26_0 >= '0' && LA26_0 <= '9') || LA26_0 == '_')) {
                        alt26 = 1;
                    }


                    switch (alt26) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:15: ( '_' )? '0' .. '9'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:15: ( '_' )?
                            int alt25 = 2;
                            int LA25_0 = input.LA(1);

                            if ((LA25_0 == '_')) {
                                alt25 = 1;
                            }
                            switch (alt25) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:236:15: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '9');

                        }
                        break;

                        default:
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:3: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:3: ( '0' .. '9' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:4: '0' .. '9'
                {
                    matchRange('0', '9');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:14: ( ( '_' )? '0' .. '9' )*
                loop28:
                do {
                    int alt28 = 2;
                    int LA28_0 = input.LA(1);

                    if (((LA28_0 >= '0' && LA28_0 <= '9') || LA28_0 == '_')) {
                        alt28 = 1;
                    }


                    switch (alt28) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:15: ( '_' )? '0' .. '9'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:15: ( '_' )?
                            int alt27 = 2;
                            int LA27_0 = input.LA(1);

                            if ((LA27_0 == '_')) {
                                alt27 = 1;
                            }
                            switch (alt27) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:15: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '9');

                        }
                        break;

                        default:
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:11: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                    input.consume();

                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:23: ( '-' )?
                int alt29 = 2;
                int LA29_0 = input.LA(1);

                if ((LA29_0 == '-')) {
                    alt29 = 1;
                }
                switch (alt29) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:241:23: '-'
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
            int end = 0;
            int nested = 0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:35: ( '\\'' ( . )* '\\'' | '%q' begin= . (tmp= . )* )
            int alt32 = 2;
            int LA32_0 = input.LA(1);

            if ((LA32_0 == '\'')) {
                alt32 = 1;
            } else if ((LA32_0 == '%')) {
                alt32 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("245:1: SINGLE_QUOTE_STRING : ( '\\'' ( . )* '\\'' | '%q' begin= . (tmp= . )* );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:35: '\\'' ( . )* '\\''
                {
                    match('\'');
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:40: ( . )*
                    loop30:
                    do {
                        int alt30 = 2;
                        int LA30_0 = input.LA(1);

                        if ((LA30_0 == '\'')) {
                            alt30 = 2;
                        } else if (((LA30_0 >= '\u0000' && LA30_0 <= '&') || (LA30_0 >= '(' && LA30_0 <= '\uFFFE'))) {
                            alt30 = 1;
                        }


                        switch (alt30) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:40: .
                            {
                                matchAny();

                            }
                            break;

                            default:
                                break loop30;
                        }
                    } while (true);

                    match('\'');

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:50: '%q' begin= . (tmp= . )*
                {
                    match("%q");

                    int begin = input.LA(1);
                    matchAny();
                    System.out.println(begin);
                    end = determineEnd(begin);
                    begin = determineBegin(begin);
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:149: (tmp= . )*
                    loop31:
                    do {
                        int alt31 = 2;
                        int LA31_0 = input.LA(1);

                        if (((LA31_0 >= '\u0000' && LA31_0 <= '\uFFFE'))) {
                            alt31 = 1;
                        }


                        switch (alt31) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:246:150: tmp= .
                            {
                                int tmp = input.LA(1);
                                matchAny();
                                System.out.println(tmp);
                                if (tmp == begin) {
                                    nested++;
                                } else if (tmp == end) {

                                    if (nested == 0) {
                                        this.type = SINGLE_QUOTE_STRING;
                                        return;
                                    }
                                    nested--;
                                }


                            }
                            break;

                            default:
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

    // $ANTLR start DOUBLE_QUOTE_STRING

    public final void mDOUBLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE_STRING;
            int end = 0;
            int nested = 0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:35: ( '\"' ( . )* '\"' | '%Q' begin= . (tmp= . )* )
            int alt35 = 2;
            int LA35_0 = input.LA(1);

            if ((LA35_0 == '\"')) {
                alt35 = 1;
            } else if ((LA35_0 == '%')) {
                alt35 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("259:1: DOUBLE_QUOTE_STRING : ( '\"' ( . )* '\"' | '%Q' begin= . (tmp= . )* );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:35: '\"' ( . )* '\"'
                {
                    match('\"');
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:39: ( . )*
                    loop33:
                    do {
                        int alt33 = 2;
                        int LA33_0 = input.LA(1);

                        if ((LA33_0 == '\"')) {
                            alt33 = 2;
                        } else if (((LA33_0 >= '\u0000' && LA33_0 <= '!') || (LA33_0 >= '#' && LA33_0 <= '\uFFFE'))) {
                            alt33 = 1;
                        }


                        switch (alt33) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:39: .
                            {
                                matchAny();

                            }
                            break;

                            default:
                                break loop33;
                        }
                    } while (true);

                    match('\"');

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:48: '%Q' begin= . (tmp= . )*
                {
                    match("%Q");

                    int begin = input.LA(1);
                    matchAny();
                    System.out.println(begin);
                    end = determineEnd(begin);
                    begin = determineBegin(begin);
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:2: (tmp= . )*
                    loop34:
                    do {
                        int alt34 = 2;
                        int LA34_0 = input.LA(1);

                        if (((LA34_0 >= '\u0000' && LA34_0 <= '\uFFFE'))) {
                            alt34 = 1;
                        }


                        switch (alt34) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:3: tmp= .
                            {
                                int tmp = input.LA(1);
                                matchAny();
                                System.out.println(tmp);
                                if (tmp == begin) {
                                    nested++;
                                } else if (tmp == end) {

                                    if (nested == 0) {
                                        this.type = DOUBLE_QUOTE_STRING;
                                        return;
                                    }
                                    nested--;
                                }


                            }
                            break;

                            default:
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
    // $ANTLR end DOUBLE_QUOTE_STRING

    // $ANTLR start HEREDOC_BEGIN

    public final void mHEREDOC_BEGIN() throws RecognitionException {
        try {
            int _type = HEREDOC_BEGIN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:4: ( '<<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:4: '<<'
            {
                match("<<");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEREDOC_BEGIN

    // $ANTLR start HEREDOC_STRING

    public final void mHEREDOC_STRING() throws RecognitionException {
        try {
            int _type = HEREDOC_STRING;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:4: ( 'HEREDOC_STRING' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:4: 'HEREDOC_STRING'
            {
                match("HEREDOC_STRING");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEREDOC_STRING

    // $ANTLR start ARRAY

    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:9: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:9: '[]'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:280:8: ( '{}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:280:8: '{}'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:9: ( 'a..b' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:9: 'a..b'
            {
                match("a..b");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:9: ( '/abc/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:9: '/abc/'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:10: ( ':abc' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:10: ':abc'
            {
                match(":abc");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SYMBOL

    public void mTokens() throws RecognitionException {
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: ( T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | FLOAT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_BEGIN | HEREDOC_STRING | ARRAY | HASH | RANGE | REGEX | SYMBOL )
        int alt36 = 33;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T55
            {
                mT55();

            }
            break;
            case 2:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:14: T56
            {
                mT56();

            }
            break;
            case 3:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:18: T57
            {
                mT57();

            }
            break;
            case 4:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:22: T58
            {
                mT58();

            }
            break;
            case 5:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:26: T59
            {
                mT59();

            }
            break;
            case 6:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T60
            {
                mT60();

            }
            break;
            case 7:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:34: T61
            {
                mT61();

            }
            break;
            case 8:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:38: T62
            {
                mT62();

            }
            break;
            case 9:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:42: T63
            {
                mT63();

            }
            break;
            case 10:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:46: T64
            {
                mT64();

            }
            break;
            case 11:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T65
            {
                mT65();

            }
            break;
            case 12:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:54: T66
            {
                mT66();

            }
            break;
            case 13:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:58: T67
            {
                mT67();

            }
            break;
            case 14:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:62: IF_MODIFIER
            {
                mIF_MODIFIER();

            }
            break;
            case 15:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:74: UNLESS_MODIFIER
            {
                mUNLESS_MODIFIER();

            }
            break;
            case 16:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:90: WHILE_MODIFIER
            {
                mWHILE_MODIFIER();

            }
            break;
            case 17:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:105: UNTIL_MODIFIER
            {
                mUNTIL_MODIFIER();

            }
            break;
            case 18:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:120: RESCUE_MODIFIER
            {
                mRESCUE_MODIFIER();

            }
            break;
            case 19:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:136: SEMI
            {
                mSEMI();

            }
            break;
            case 20:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:141: LINE_BREAK
            {
                mLINE_BREAK();

            }
            break;
            case 21:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:152: WS
            {
                mWS();

            }
            break;
            case 22:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:155: ID
            {
                mID();

            }
            break;
            case 23:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:158: INT
            {
                mINT();

            }
            break;
            case 24:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:162: FLOAT
            {
                mFLOAT();

            }
            break;
            case 25:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:168: SINGLE_QUOTE_STRING
            {
                mSINGLE_QUOTE_STRING();

            }
            break;
            case 26:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:188: DOUBLE_QUOTE_STRING
            {
                mDOUBLE_QUOTE_STRING();

            }
            break;
            case 27:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:208: HEREDOC_BEGIN
            {
                mHEREDOC_BEGIN();

            }
            break;
            case 28:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:222: HEREDOC_STRING
            {
                mHEREDOC_STRING();

            }
            break;
            case 29:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:237: ARRAY
            {
                mARRAY();

            }
            break;
            case 30:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:243: HASH
            {
                mHASH();

            }
            break;
            case 31:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:248: RANGE
            {
                mRANGE();

            }
            break;
            case 32:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:254: REGEX
            {
                mREGEX();

            }
            break;
            case 33:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:260: SYMBOL
            {
                mSYMBOL();

            }
            break;

        }

    }


    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA36_eotS =
            "\1\uffff\5\33\1\46\1\uffff\4\33\3\uffff\1\33\2\uffff\1\23\5\uffff" +
                    "\1\33\4\uffff\10\33\2\uffff\1\70\4\33\2\uffff\1\23\1\uffff\3\33" +
                    "\1\102\1\33\1\104\2\33\1\uffff\7\33\1\116\1\33\1\uffff\1\33\1\uffff" +
                    "\1\121\1\122\5\33\1\130\1\33\1\uffff\1\132\1\133\2\uffff\1\33\1" +
                    "\135\1\136\2\33\1\uffff\1\33\2\uffff\1\142\2\uffff\1\143\2\33\2" +
                    "\uffff\2\33\1\uffff\2\33\1\154\1\155\1\156\3\uffff";
    static final String DFA36_eofS =
            "\157\uffff";
    static final String DFA36_minS =
            "\1\11\1\145\1\154\1\141\1\151\1\150\1\141\1\uffff\1\146\1\156\1" +
                    "\150\1\145\3\uffff\1\105\1\60\2\56\2\uffff\1\121\2\uffff\1\56\4" +
                    "\uffff\1\147\1\160\1\163\1\144\2\154\1\145\1\165\2\uffff\1\60\1" +
                    "\154\1\151\1\163\1\122\1\uffff\1\60\1\56\1\uffff\1\151\1\162\1\145" +
                    "\1\60\1\163\1\60\1\156\1\145\1\uffff\1\145\1\151\1\154\1\165\1\105" +
                    "\1\156\1\145\1\60\1\146\1\uffff\1\145\1\uffff\2\60\1\163\1\154\1" +
                    "\145\1\143\1\104\1\60\1\163\1\uffff\2\60\2\uffff\1\163\2\60\1\145" +
                    "\1\117\1\uffff\1\163\2\uffff\1\60\2\uffff\1\60\1\103\1\151\2\uffff" +
                    "\1\137\1\157\1\uffff\1\156\4\60\3\uffff";
    static final String DFA36_maxS =
            "\1\173\1\145\1\170\1\141\1\151\1\162\1\141\1\uffff\1\146\1\156\1" +
                    "\150\1\145\3\uffff\1\105\1\77\1\170\1\145\2\uffff\1\161\2\uffff" +
                    "\1\56\4\uffff\1\147\1\160\1\163\1\144\2\154\1\145\1\165\2\uffff" +
                    "\1\172\1\164\1\151\1\163\1\122\1\uffff\1\71\1\145\1\uffff\1\151" +
                    "\1\162\1\151\1\172\1\163\1\172\1\156\1\145\1\uffff\1\145\1\151\1" +
                    "\154\1\165\1\105\1\156\1\145\1\172\1\146\1\uffff\1\145\1\uffff\2" +
                    "\172\1\163\1\154\1\145\1\143\1\104\1\172\1\163\1\uffff\2\172\2\uffff" +
                    "\1\163\2\172\1\145\1\117\1\uffff\1\163\2\uffff\1\172\2\uffff\1\172" +
                    "\1\103\1\151\2\uffff\1\137\1\157\1\uffff\1\156\1\62\3\172\3\uffff";
    static final String DFA36_acceptS =
            "\7\uffff\1\15\4\uffff\1\23\1\24\1\25\4\uffff\1\27\1\31\1\uffff\1" +
                    "\32\1\33\1\uffff\1\35\1\36\1\26\1\40\10\uffff\1\41\1\10\5\uffff" +
                    "\1\30\2\uffff\1\37\10\uffff\1\16\11\uffff\1\2\1\uffff\1\4\11\uffff" +
                    "\1\7\2\uffff\1\11\1\5\5\uffff\1\1\1\uffff\1\6\1\3\1\uffff\1\21\1" +
                    "\20\3\uffff\1\17\1\22\2\uffff\1\34\5\uffff\1\13\1\12\1\14";
    static final String DFA36_specialS =
            "\157\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\16\1\15\2\uffff\1\15\22\uffff\1\16\1\uffff\1\26\2\uffff\1" +
                    "\25\1\uffff\1\24\5\uffff\1\20\1\uffff\1\34\1\21\11\22\1\6\1" +
                    "\14\1\27\1\7\1\uffff\1\23\1\uffff\7\33\1\17\22\33\1\31\5\uffff" +
                    "\1\30\1\1\2\33\1\2\1\3\2\33\1\10\4\33\1\4\3\33\1\13\1\33\1\5" +
                    "\1\11\1\33\1\12\3\33\1\32",
            "\1\35",
            "\1\37\1\uffff\1\40\11\uffff\1\36",
            "\1\41",
            "\1\42",
            "\1\43\11\uffff\1\44",
            "\1\45",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "\1\53",
            "\1\21\11\22\5\uffff\1\23",
            "\1\54\1\uffff\10\23\15\uffff\1\54\31\uffff\1\23\2\uffff\1\23" +
                    "\1\uffff\1\23\1\54\22\uffff\1\23",
            "\1\54\1\uffff\12\56\13\uffff\1\54\31\uffff\1\55\5\uffff\1\54",
            "",
            "",
            "\1\26\37\uffff\1\24",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\71\7\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\12\56",
            "\1\54\1\uffff\12\56\13\uffff\1\54\31\uffff\1\55\5\uffff\1\54",
            "",
            "\1\76",
            "\1\77",
            "\1\100\3\uffff\1\101",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\103",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\117",
            "",
            "\1\120",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\131",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "\1\134",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\144",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\152\1\151\1\153",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | FLOAT | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_BEGIN | HEREDOC_STRING | ARRAY | HASH | RANGE | REGEX | SYMBOL );";
        }
    }


}