// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-04-29 19:26:15

package com.xruby.compiler.parser;


import org.antlr.runtime.*;

public class Rubyv3Lexer extends BaseLexer {
    public static final int SINGLETON_METHOD = 21;
    public static final int STATEMENT_LIST = 4;
    public static final int STATEMENT = 5;
    public static final int ESCAPE_INT = 42;
    public static final int HASH = 35;
    public static final int ARRAY = 34;
    public static final int HEX_PART = 43;
    public static final int NUMBER = 33;
    public static final int T58 = 58;
    public static final int FLOAT = 49;
    public static final int OCTAL = 38;
    public static final int META_PART = 45;
    public static final int T61 = 61;
    public static final int LEADING0_NUMBER = 48;
    public static final int DECIMAL = 39;
    public static final int BINARY = 41;
    public static final int T64 = 64;
    public static final int UNTIL_MODIFIER = 26;
    public static final int BLOCK = 14;
    public static final int LINE_BREAK = 29;
    public static final int INT = 32;
    public static final int IF_MODIFIER = 23;
    public static final int MULTIPLE_ASSIGN = 15;
    public static final int REGEX = 37;
    public static final int SYMBOL = 13;
    public static final int CONTROL_PART = 44;
    public static final int DOUBLE_QUOTE_STRING = 51;
    public static final int BODY = 9;
    public static final int UNLESS_MODIFIER = 24;
    public static final int HEREDOC_STRING = 52;
    public static final int ID = 31;
    public static final int T62 = 62;
    public static final int T55 = 55;
    public static final int RANGE = 36;
    public static final int SHIFT = 12;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA = 18;
    public static final int WS = 30;
    public static final int STRING = 22;
    public static final int T66 = 66;
    public static final int NESTED_LHS = 20;
    public static final int T63 = 63;
    public static final int T57 = 57;
    public static final int NON_LEADING0_NUMBER = 46;
    public static final int T65 = 65;
    public static final int SINGLE_QUOTE_STRING = 50;
    public static final int HEREDOC_BEGIN = 53;
    public static final int WHILE_MODIFIER = 25;
    public static final int T56 = 56;
    public static final int EXP_PART = 47;
    public static final int SEMI = 28;
    public static final int T59 = 59;
    public static final int BLOCK_ARG = 17;
    public static final int MRHS = 19;
    public static final int IF = 7;
    public static final int T54 = 54;
    public static final int ARG = 11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA = 16;
    public static final int EOF = -1;
    public static final int CALL = 10;
    public static final int Tokens = 67;
    public static final int T60 = 60;
    public static final int RESCUE_MODIFIER = 27;
    public static final int MODIFIER_LINE = 6;
    public static final int RPAREN_IN_METHOD_DEFINATION = 8;
    public static final int HEX = 40;

    /**
     * Override this method to change where error messages go
     */
    public void emitErrorMessage(String msg) {
        System.err.println(msg);
    }

    private boolean just_seen_var = false;

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

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:52:7: ( 'begin' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:52:7: 'begin'
            {
                match("begin");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55

    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:53:7: ( 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:53:7: 'end'
            {
                match("end");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:54:7: ( 'false' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:54:7: 'false'
            {
                match("false");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:55:7: ( 'nil' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:55:7: 'nil'
            {
                match("nil");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:56:7: ( 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:56:7: 'true'
            {
                match("true");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:57:7: ( 'elsif' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:57:7: 'elsif'
            {
                match("elsif");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:58:7: ( 'else' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:58:7: 'else'
            {
                match("else");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:59:7: ( ':' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:59:7: ':'
            {
                match(':');

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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:60:7: ( 'then' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:60:7: 'then'
            {
                match("then");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:61:7: ( 'expression0' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:61:7: 'expression0'
            {
                match("expression0");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:62:7: ( 'expression1' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:62:7: 'expression1'
            {
                match("expression1");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:63:7: ( 'expression2' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:63:7: 'expression2'
            {
                match("expression2");


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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:64:7: ( '=' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:64:7: '='
            {
                match('=');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start IF_MODIFIER

    public final void mIF_MODIFIER() throws RecognitionException {
        try {
            int _type = IF_MODIFIER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:108:20: ( 'if' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:108:20: 'if'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:109:20: ( 'unless' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:109:20: 'unless'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:110:20: ( 'while' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:110:20: 'while'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:111:20: ( 'until' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:111:20: 'until'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:112:20: ( 'resuce' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:112:20: 'resuce'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:114:7: ( ';' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:114:7: ';'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:3: ( ( '\\r' )? '\\n' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:3: ( '\\r' )? '\\n'
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:3: ( '\\r' )?
                int alt1 = 2;
                int LA1_0 = input.LA(1);

                if ((LA1_0 == '\r')) {
                    alt1 = 1;
                }
                switch (alt1) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:147:3: '\\r'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:6: ( ( ' ' | '\\t' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:149:6: ( ' ' | '\\t' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();

                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:28: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:29: ( 'a' .. 'z' | 'A' .. 'Z' )
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
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:53: ( '0' .. '9' )
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:53: ( '0' .. '9' )
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:151:54: '0' .. '9'
                            {
                                matchRange('0', '9');

                            }


                        }
                        break;

                        default:
                            break loop2;
                    }
                } while (true);

                if ("var".equals(getText())) {
                    System.out.println("just_seen_var:" + getText());
                    just_seen_var = true;
                }

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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:4: ( ( '-' )? ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:4: ( '-' )? ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:4: ( '-' )?
                int alt3 = 2;
                int LA3_0 = input.LA(1);

                if ((LA3_0 == '-')) {
                    alt3 = 1;
                }
                switch (alt3) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:4: '-'
                    {
                        match('-');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:8: ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )
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
                                        new NoViableAltException("165:8: ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )", 4, 1, input);

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
                                new NoViableAltException("165:8: ( OCTAL | DECIMAL | HEX | BINARY | ESCAPE_INT )", 4, 0, input);

                        throw nvae;
                }

                switch (alt4) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:9: OCTAL
                    {
                        mOCTAL();

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:15: DECIMAL
                    {
                        mDECIMAL();

                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:23: HEX
                    {
                        mHEX();

                    }
                    break;
                    case 4:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:27: BINARY
                    {
                        mBINARY();

                    }
                    break;
                    case 5:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:35: ESCAPE_INT
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:9: ( '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:9: '0' ( '_' )? ( '0' .. '7' ) ( ( '_' )? '0' .. '7' )*
            {
                match('0');
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:13: ( '_' )?
                int alt5 = 2;
                int LA5_0 = input.LA(1);

                if ((LA5_0 == '_')) {
                    alt5 = 1;
                }
                switch (alt5) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:13: '_'
                    {
                        match('_');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:18: ( '0' .. '7' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:19: '0' .. '7'
                {
                    matchRange('0', '7');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:29: ( ( '_' )? '0' .. '7' )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if (((LA7_0 >= '0' && LA7_0 <= '7') || LA7_0 == '_')) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:30: ( '_' )? '0' .. '7'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:30: ( '_' )?
                            int alt6 = 2;
                            int LA6_0 = input.LA(1);

                            if ((LA6_0 == '_')) {
                                alt6 = 1;
                            }
                            switch (alt6) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:30: '_'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:1: ( ( '0d' )? ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:1: ( '0d' )? ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:1: ( '0d' )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);

                if ((LA8_0 == '0')) {
                    alt8 = 1;
                }
                switch (alt8) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:2: '0d'
                    {
                        match("0d");


                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:8: ( '1' .. '9' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:9: '1' .. '9'
                {
                    matchRange('1', '9');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:19: ( ( '_' )? '0' .. '9' )*
                loop10:
                do {
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);

                    if (((LA10_0 >= '0' && LA10_0 <= '9') || LA10_0 == '_')) {
                        alt10 = 1;
                    }


                    switch (alt10) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:20: ( '_' )? '0' .. '9'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:20: ( '_' )?
                            int alt9 = 2;
                            int LA9_0 = input.LA(1);

                            if ((LA9_0 == '_')) {
                                alt9 = 1;
                            }
                            switch (alt9) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:20: '_'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:7: ( '0x' HEX_PART ( ( '_' )? HEX_PART )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:7: '0x' HEX_PART ( ( '_' )? HEX_PART )*
            {
                match("0x");

                mHEX_PART();
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:21: ( ( '_' )? HEX_PART )*
                loop12:
                do {
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);

                    if (((LA12_0 >= '0' && LA12_0 <= '9') || (LA12_0 >= 'A' && LA12_0 <= 'F') || LA12_0 == '_' || (LA12_0 >= 'a' && LA12_0 <= 'f'))) {
                        alt12 = 1;
                    }


                    switch (alt12) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:22: ( '_' )? HEX_PART
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:22: ( '_' )?
                            int alt11 = 2;
                            int LA11_0 = input.LA(1);

                            if ((LA11_0 == '_')) {
                                alt11 = 1;
                            }
                            switch (alt11) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:22: '_'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:4: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:10: ( '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:10: '0b' ( '0' .. '1' ) ( ( '_' )? '0' .. '1' )*
            {
                match("0b");

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:14: ( '0' .. '1' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:15: '0' .. '1'
                {
                    matchRange('0', '1');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:25: ( ( '_' )? '0' .. '1' )*
                loop14:
                do {
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);

                    if (((LA14_0 >= '0' && LA14_0 <= '1') || LA14_0 == '_')) {
                        alt14 = 1;
                    }


                    switch (alt14) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:26: ( '_' )? '0' .. '1'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:26: ( '_' )?
                            int alt13 = 2;
                            int LA13_0 = input.LA(1);

                            if ((LA13_0 == '_')) {
                                alt13 = 1;
                            }
                            switch (alt13) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:26: '_'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:10: ( '?' ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0255' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:10: '?' ( CONTROL_PART | META_PART )* ( '\\u0000' .. '\\u0255' )
            {
                match('?');
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:13: ( CONTROL_PART | META_PART )*
                loop15:
                do {
                    int alt15 = 3;
                    int LA15_0 = input.LA(1);

                    if ((LA15_0 == '\\')) {
                        int LA15_1 = input.LA(2);

                        if ((LA15_1 == 'M')) {
                            alt15 = 2;
                        } else if ((LA15_1 == 'C' || LA15_1 == 'c')) {
                            alt15 = 1;
                        }


                    }


                    switch (alt15) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:14: CONTROL_PART
                        {
                            mCONTROL_PART();

                        }
                        break;
                        case 2:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:27: META_PART
                        {
                            mMETA_PART();

                        }
                        break;

                        default:
                            break loop15;
                    }
                } while (true);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:39: ( '\\u0000' .. '\\u0255' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:40: '\\u0000' .. '\\u0255'
                {
                    matchRange('\u0000', '\u0255');

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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:4: ( ( '\\\\C-' | '\\\\c' ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:4: ( '\\\\C-' | '\\\\c' )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:4: ( '\\\\C-' | '\\\\c' )
                int alt16 = 2;
                int LA16_0 = input.LA(1);

                if ((LA16_0 == '\\')) {
                    int LA16_1 = input.LA(2);

                    if ((LA16_1 == 'c')) {
                        alt16 = 2;
                    } else if ((LA16_1 == 'C')) {
                        alt16 = 1;
                    } else {
                        NoViableAltException nvae =
                                new NoViableAltException("188:4: ( '\\\\C-' | '\\\\c' )", 16, 1, input);

                        throw nvae;
                    }
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("188:4: ( '\\\\C-' | '\\\\c' )", 16, 0, input);

                    throw nvae;
                }
                switch (alt16) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:5: '\\\\C-'
                    {
                        match("\\C-");


                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:12: '\\\\c'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:4: ( '\\\\M-' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:4: '\\\\M-'
            {
                match("\\M-");


            }

        }
        finally {
        }
    }
    // $ANTLR end META_PART

    // $ANTLR start FLOAT

    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:9: ( ( '-' )? ( NON_LEADING0_NUMBER | '0' ) ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:9: ( '-' )? ( NON_LEADING0_NUMBER | '0' ) ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:9: ( '-' )?
                int alt17 = 2;
                int LA17_0 = input.LA(1);

                if ((LA17_0 == '-')) {
                    alt17 = 1;
                }
                switch (alt17) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:9: '-'
                    {
                        match('-');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:13: ( NON_LEADING0_NUMBER | '0' )
                int alt18 = 2;
                int LA18_0 = input.LA(1);

                if (((LA18_0 >= '1' && LA18_0 <= '9'))) {
                    alt18 = 1;
                } else if ((LA18_0 == '0')) {
                    alt18 = 2;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("194:13: ( NON_LEADING0_NUMBER | '0' )", 18, 0, input);

                    throw nvae;
                }
                switch (alt18) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:15: NON_LEADING0_NUMBER
                    {
                        mNON_LEADING0_NUMBER();

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:37: '0'
                    {
                        match('0');

                    }
                    break;

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:42: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )
                int alt20 = 2;
                int LA20_0 = input.LA(1);

                if ((LA20_0 == 'E' || LA20_0 == 'e')) {
                    alt20 = 1;
                } else if ((LA20_0 == '.')) {
                    alt20 = 2;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("194:42: ( EXP_PART | '.' LEADING0_NUMBER ( EXP_PART )? )", 20, 0, input);

                    throw nvae;
                }
                switch (alt20) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:43: EXP_PART
                    {
                        mEXP_PART();

                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:54: '.' LEADING0_NUMBER ( EXP_PART )?
                    {
                        match('.');
                        mLEADING0_NUMBER();
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:74: ( EXP_PART )?
                        int alt19 = 2;
                        int LA19_0 = input.LA(1);

                        if ((LA19_0 == 'E' || LA19_0 == 'e')) {
                            alt19 = 1;
                        }
                        switch (alt19) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:194:74: EXP_PART
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:3: ( ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:3: ( '1' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:3: ( '1' .. '9' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:4: '1' .. '9'
                {
                    matchRange('1', '9');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:14: ( ( '_' )? '0' .. '9' )*
                loop22:
                do {
                    int alt22 = 2;
                    int LA22_0 = input.LA(1);

                    if (((LA22_0 >= '0' && LA22_0 <= '9') || LA22_0 == '_')) {
                        alt22 = 1;
                    }


                    switch (alt22) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:15: ( '_' )? '0' .. '9'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:15: ( '_' )?
                            int alt21 = 2;
                            int LA21_0 = input.LA(1);

                            if ((LA21_0 == '_')) {
                                alt21 = 1;
                            }
                            switch (alt21) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:197:15: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '9');

                        }
                        break;

                        default:
                            break loop22;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:3: ( ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:3: ( '0' .. '9' ) ( ( '_' )? '0' .. '9' )*
            {
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:3: ( '0' .. '9' )
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:4: '0' .. '9'
                {
                    matchRange('0', '9');

                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:14: ( ( '_' )? '0' .. '9' )*
                loop24:
                do {
                    int alt24 = 2;
                    int LA24_0 = input.LA(1);

                    if (((LA24_0 >= '0' && LA24_0 <= '9') || LA24_0 == '_')) {
                        alt24 = 1;
                    }


                    switch (alt24) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:15: ( '_' )? '0' .. '9'
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:15: ( '_' )?
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);

                            if ((LA23_0 == '_')) {
                                alt23 = 1;
                            }
                            switch (alt23) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:200:15: '_'
                                {
                                    match('_');

                                }
                                break;

                            }

                            matchRange('0', '9');

                        }
                        break;

                        default:
                            break loop24;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:202:11: ( ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:202:11: ( 'e' | 'E' ) ( '-' )? LEADING0_NUMBER
            {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                    input.consume();

                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:202:23: ( '-' )?
                int alt25 = 2;
                int LA25_0 = input.LA(1);

                if ((LA25_0 == '-')) {
                    alt25 = 1;
                }
                switch (alt25) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:202:23: '-'
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

    // $ANTLR start NUMBER

    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:203:10: ( INT | FLOAT )
            int alt26 = 2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:203:10: INT
                {
                    mINT();

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:203:14: FLOAT
                {
                    mFLOAT();

                }
                break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start SINGLE_QUOTE_STRING

    public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE_STRING;
            int end = 0;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:21: ( '\\'' ( . )* '\\'' | '%q' begin= . (tmp= . )* )
            int alt29 = 2;
            int LA29_0 = input.LA(1);

            if ((LA29_0 == '\'')) {
                alt29 = 1;
            } else if ((LA29_0 == '%')) {
                alt29 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("207:1: SINGLE_QUOTE_STRING : ( '\\'' ( . )* '\\'' | '%q' begin= . (tmp= . )* );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:21: '\\'' ( . )* '\\''
                {
                    match('\'');
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:26: ( . )*
                    loop27:
                    do {
                        int alt27 = 2;
                        int LA27_0 = input.LA(1);

                        if ((LA27_0 == '\'')) {
                            alt27 = 2;
                        } else if (((LA27_0 >= '\u0000' && LA27_0 <= '&') || (LA27_0 >= '(' && LA27_0 <= '\uFFFE'))) {
                            alt27 = 1;
                        }


                        switch (alt27) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:26: .
                            {
                                matchAny();

                            }
                            break;

                            default:
                                break loop27;
                        }
                    } while (true);

                    match('\'');

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:36: '%q' begin= . (tmp= . )*
                {
                    match("%q");

                    int begin = input.LA(1);
                    matchAny();
                    end = determineEnd(begin);
                    System.out.println(begin);
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:105: (tmp= . )*
                    loop28:
                    do {
                        int alt28 = 2;
                        int LA28_0 = input.LA(1);

                        if (((LA28_0 >= '\u0000' && LA28_0 <= '\uFFFE'))) {
                            alt28 = 1;
                        }


                        switch (alt28) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:106: tmp= .
                            {
                                int tmp = input.LA(1);
                                matchAny();
                                System.out.println(tmp);
                                if (tmp == end) {
                                    this.type = SINGLE_QUOTE_STRING;
                                    return;
                                }

                            }
                            break;

                            default:
                                break loop28;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:21: ( '\"' ( . )* '\"' | '%Q' begin= . (tmp= . )* )
            int alt32 = 2;
            int LA32_0 = input.LA(1);

            if ((LA32_0 == '\"')) {
                alt32 = 1;
            } else if ((LA32_0 == '%')) {
                alt32 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("210:1: DOUBLE_QUOTE_STRING : ( '\"' ( . )* '\"' | '%Q' begin= . (tmp= . )* );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:21: '\"' ( . )* '\"'
                {
                    match('\"');
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:25: ( . )*
                    loop30:
                    do {
                        int alt30 = 2;
                        int LA30_0 = input.LA(1);

                        if ((LA30_0 == '\"')) {
                            alt30 = 2;
                        } else if (((LA30_0 >= '\u0000' && LA30_0 <= '!') || (LA30_0 >= '#' && LA30_0 <= '\uFFFE'))) {
                            alt30 = 1;
                        }


                        switch (alt30) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:25: .
                            {
                                matchAny();

                            }
                            break;

                            default:
                                break loop30;
                        }
                    } while (true);

                    match('\"');

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:34: '%Q' begin= . (tmp= . )*
                {
                    match("%Q");

                    int begin = input.LA(1);
                    matchAny();
                    end = determineEnd(begin);
                    System.out.println(begin);
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:2: (tmp= . )*
                    loop31:
                    do {
                        int alt31 = 2;
                        int LA31_0 = input.LA(1);

                        if (((LA31_0 >= '\u0000' && LA31_0 <= '\uFFFE'))) {
                            alt31 = 1;
                        }


                        switch (alt31) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:3: tmp= .
                            {
                                int tmp = input.LA(1);
                                matchAny();
                                System.out.println(tmp);
                                if (tmp == end) {
                                    this.type = DOUBLE_QUOTE_STRING;
                                    return;
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
    // $ANTLR end DOUBLE_QUOTE_STRING

    // $ANTLR start HEREDOC_BEGIN

    public final void mHEREDOC_BEGIN() throws RecognitionException {
        try {
            int _type = HEREDOC_BEGIN;
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:214:4: ( '<<' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:214:4: '<<'
            {
                match("<<");

                if (just_seen_var) {
                    _type = SHIFT;
                }

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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:4: ( 'HEREDOC_STRING' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:4: 'HEREDOC_STRING'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:9: ( '[]' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:9: '[]'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:220:8: ( '{}' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:220:8: '{}'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:9: ( 'a..b' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:9: 'a..b'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:222:9: ( '/abc/' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:222:9: '/abc/'
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:223:10: ( ':abc' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:223:10: ':abc'
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
        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: ( T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | FLOAT | NUMBER | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_BEGIN | HEREDOC_STRING | ARRAY | HASH | RANGE | REGEX | SYMBOL )
        int alt33 = 34;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:10: T54
            {
                mT54();

            }
            break;
            case 2:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:14: T55
            {
                mT55();

            }
            break;
            case 3:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:18: T56
            {
                mT56();

            }
            break;
            case 4:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:22: T57
            {
                mT57();

            }
            break;
            case 5:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:26: T58
            {
                mT58();

            }
            break;
            case 6:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:30: T59
            {
                mT59();

            }
            break;
            case 7:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:34: T60
            {
                mT60();

            }
            break;
            case 8:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:38: T61
            {
                mT61();

            }
            break;
            case 9:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:42: T62
            {
                mT62();

            }
            break;
            case 10:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:46: T63
            {
                mT63();

            }
            break;
            case 11:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:50: T64
            {
                mT64();

            }
            break;
            case 12:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:54: T65
            {
                mT65();

            }
            break;
            case 13:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:58: T66
            {
                mT66();

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
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:168: NUMBER
            {
                mNUMBER();

            }
            break;
            case 26:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:175: SINGLE_QUOTE_STRING
            {
                mSINGLE_QUOTE_STRING();

            }
            break;
            case 27:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:195: DOUBLE_QUOTE_STRING
            {
                mDOUBLE_QUOTE_STRING();

            }
            break;
            case 28:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:215: HEREDOC_BEGIN
            {
                mHEREDOC_BEGIN();

            }
            break;
            case 29:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:229: HEREDOC_STRING
            {
                mHEREDOC_STRING();

            }
            break;
            case 30:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:244: ARRAY
            {
                mARRAY();

            }
            break;
            case 31:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:250: HASH
            {
                mHASH();

            }
            break;
            case 32:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:255: RANGE
            {
                mRANGE();

            }
            break;
            case 33:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:261: REGEX
            {
                mREGEX();

            }
            break;
            case 34:
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:1:267: SYMBOL
            {
                mSYMBOL();

            }
            break;

        }

    }


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA26_eotS =
            "\3\uffff\1\4\3\uffff\1\4";
    static final String DFA26_eofS =
            "\10\uffff";
    static final String DFA26_minS =
            "\1\55\1\60\2\56\2\uffff\1\60\1\56";
    static final String DFA26_maxS =
            "\2\77\1\170\1\145\2\uffff\1\71\1\145";
    static final String DFA26_acceptS =
            "\4\uffff\1\1\1\2\2\uffff";
    static final String DFA26_specialS =
            "\10\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\2\uffff\1\2\11\3\5\uffff\1\4",
            "\1\2\11\3\5\uffff\1\4",
            "\1\5\1\uffff\10\4\15\uffff\1\5\31\uffff\1\4\2\uffff\1\4\1\uffff" +
                    "\1\4\1\5\22\uffff\1\4",
            "\1\5\1\uffff\12\7\13\uffff\1\5\31\uffff\1\6\5\uffff\1\5",
            "",
            "",
            "\12\7",
            "\1\5\1\uffff\12\7\13\uffff\1\5\31\uffff\1\6\5\uffff\1\5"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }

        public String getDescription() {
            return "203:1: NUMBER : ( INT | FLOAT );";
        }
    }

    static final String DFA33_eotS =
            "\1\uffff\5\33\1\46\1\uffff\4\33\3\uffff\1\33\2\uffff\1\65\5\uffff" +
                    "\1\33\4\uffff\10\33\2\uffff\1\101\4\33\6\uffff\1\65\1\uffff\1\65" +
                    "\1\uffff\1\65\2\uffff\1\33\1\123\3\33\1\130\2\33\1\uffff\5\33\3" +
                    "\65\1\uffff\2\150\1\uffff\1\65\3\uffff\1\33\1\uffff\1\33\1\160\2" +
                    "\33\1\uffff\1\163\1\164\5\33\1\uffff\1\65\1\uffff\1\65\1\uffff\1" +
                    "\65\1\uffff\1\150\2\uffff\1\150\3\uffff\1\174\1\175\1\uffff\1\33" +
                    "\1\177\2\uffff\1\u0080\1\33\1\u0082\2\33\1\uffff\1\150\2\uffff\1" +
                    "\33\2\uffff\1\u0088\1\uffff\1\u0089\1\33\1\uffff\1\150\1\33\2\uffff" +
                    "\2\33\1\uffff\2\33\1\u0092\1\u0093\1\u0094\3\uffff";
    static final String DFA33_eofS =
            "\u0095\uffff";
    static final String DFA33_minS =
            "\1\11\1\145\1\154\1\141\1\151\1\150\1\141\1\uffff\1\146\1\156\1" +
                    "\150\1\145\3\uffff\1\105\1\60\2\56\1\0\1\uffff\1\121\2\uffff\1\56" +
                    "\4\uffff\1\147\1\144\1\163\1\160\2\154\1\145\1\165\2\uffff\1\60" +
                    "\1\154\1\151\1\163\1\122\1\61\2\60\1\55\4\60\1\56\1\uffff\1\103" +
                    "\2\uffff\1\151\1\60\1\145\1\162\1\163\1\60\1\156\1\145\1\uffff\1" +
                    "\151\1\145\1\154\1\165\1\105\10\60\1\0\2\55\1\156\1\uffff\1\146" +
                    "\1\60\2\145\1\uffff\2\60\1\154\1\163\1\145\1\143\1\104\10\60\1\uffff" +
                    "\2\60\1\55\2\0\2\60\1\uffff\1\163\1\60\2\uffff\1\60\1\163\1\60\1" +
                    "\145\1\117\2\60\2\uffff\1\163\2\uffff\1\60\1\uffff\1\60\1\103\2" +
                    "\60\1\151\2\uffff\1\137\1\157\1\uffff\1\156\4\60\3\uffff";
    static final String DFA33_maxS =
            "\1\173\1\145\1\170\1\141\1\151\1\162\1\141\1\uffff\1\146\1\156\1" +
                    "\150\1\145\3\uffff\1\105\1\77\1\170\1\145\1\u0255\1\uffff\1\161" +
                    "\2\uffff\1\56\4\uffff\1\147\1\144\1\163\1\160\2\154\1\145\1\165" +
                    "\2\uffff\1\172\1\164\1\151\1\163\1\122\1\71\1\146\1\61\2\71\1\67" +
                    "\1\137\1\71\1\145\1\uffff\1\143\2\uffff\1\151\1\172\1\151\1\162" +
                    "\1\163\1\172\1\156\1\145\1\uffff\1\151\1\145\1\154\1\165\1\105\1" +
                    "\137\1\146\1\137\1\71\1\137\1\145\1\67\1\137\1\u0255\2\55\1\156" +
                    "\1\uffff\1\146\1\172\2\145\1\uffff\2\172\1\154\1\163\1\145\1\143" +
                    "\1\104\1\71\1\137\2\146\1\61\1\137\1\71\1\137\1\uffff\1\71\1\145" +
                    "\1\71\2\u0255\2\172\1\uffff\1\163\1\172\2\uffff\1\172\1\163\1\172" +
                    "\1\145\1\117\1\71\1\137\2\uffff\1\163\2\uffff\1\172\1\uffff\1\172" +
                    "\1\103\1\71\1\137\1\151\2\uffff\1\137\1\157\1\uffff\1\156\1\62\3" +
                    "\172\3\uffff";
    static final String DFA33_acceptS =
            "\7\uffff\1\15\4\uffff\1\23\1\24\1\25\5\uffff\1\32\1\uffff\1\33\1" +
                    "\34\1\uffff\1\36\1\37\1\26\1\41\10\uffff\1\42\1\10\16\uffff\1\27" +
                    "\1\uffff\1\27\1\40\10\uffff\1\16\21\uffff\1\2\4\uffff\1\4\17\uffff" +
                    "\1\30\7\uffff\1\7\2\uffff\1\11\1\5\7\uffff\1\1\1\6\1\uffff\1\3\1" +
                    "\21\1\uffff\1\20\5\uffff\1\17\1\22\2\uffff\1\35\5\uffff\1\13\1\12" +
                    "\1\14";
    static final String DFA33_specialS =
            "\u0095\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\16\1\15\2\uffff\1\15\22\uffff\1\16\1\uffff\1\26\2\uffff\1" +
                    "\25\1\uffff\1\24\5\uffff\1\20\1\uffff\1\34\1\21\11\22\1\6\1" +
                    "\14\1\27\1\7\1\uffff\1\23\1\uffff\7\33\1\17\22\33\1\31\5\uffff" +
                    "\1\30\1\1\2\33\1\2\1\3\2\33\1\10\4\33\1\4\3\33\1\13\1\33\1\5" +
                    "\1\11\1\33\1\12\3\33\1\32",
            "\1\35",
            "\1\37\1\uffff\1\36\11\uffff\1\40",
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
            "\1\60\1\uffff\10\62\15\uffff\1\57\31\uffff\1\61\2\uffff\1\56" +
                    "\1\uffff\1\54\1\57\22\uffff\1\55",
            "\1\60\1\uffff\12\64\13\uffff\1\57\31\uffff\1\63\5\uffff\1\57",
            "\134\67\1\66\u01f9\67",
            "",
            "\1\26\37\uffff\1\24",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\103\7\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "\11\107",
            "\12\110\7\uffff\6\110\32\uffff\6\110",
            "\2\111",
            "\1\112\2\uffff\12\113",
            "\12\114",
            "\10\62",
            "\10\116\47\uffff\1\115",
            "\12\64",
            "\1\60\1\uffff\12\64\13\uffff\1\57\31\uffff\1\63\5\uffff\1\57",
            "",
            "\1\121\11\uffff\1\120\25\uffff\1\117",
            "",
            "",
            "\1\122",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\125\3\uffff\1\124",
            "\1\126",
            "\1\127",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\141\45\uffff\1\140",
            "\12\143\7\uffff\6\143\30\uffff\1\142\1\uffff\6\143",
            "\2\145\55\uffff\1\144",
            "\12\113",
            "\12\147\45\uffff\1\146",
            "\12\152\13\uffff\1\153\31\uffff\1\151\5\uffff\1\153",
            "\10\116",
            "\10\116\47\uffff\1\115",
            "\134\67\1\66\u01f9\67",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\161",
            "\1\162",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\141",
            "\12\141\45\uffff\1\140",
            "\12\143\7\uffff\6\143\32\uffff\6\143",
            "\12\143\7\uffff\6\143\30\uffff\1\142\1\uffff\6\143",
            "\2\145",
            "\2\145\55\uffff\1\144",
            "\12\147",
            "\12\147\45\uffff\1\146",
            "",
            "\12\152",
            "\12\152\13\uffff\1\153\31\uffff\1\151\5\uffff\1\153",
            "\1\172\2\uffff\12\173",
            "\134\67\1\66\u01f9\67",
            "\134\67\1\66\u01f9\67",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\1\176",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\u0081",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\u0083",
            "\1\u0084",
            "\12\173",
            "\12\u0086\45\uffff\1\u0085",
            "",
            "",
            "\1\u0087",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\u008a",
            "\12\u0086",
            "\12\u0086\45\uffff\1\u0085",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u0090\1\u008f\1\u0091",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER | SEMI | LINE_BREAK | WS | ID | INT | FLOAT | NUMBER | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_BEGIN | HEREDOC_STRING | ARRAY | HASH | RANGE | REGEX | SYMBOL );";
        }
    }


}