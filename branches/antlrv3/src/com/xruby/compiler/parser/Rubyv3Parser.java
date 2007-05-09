// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-09 17:10:45

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "LEFT_SHIFT", "ASSIGNMENT", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "DIV", "MOD", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "INCLUSIVE_RANGE", "EXCLUSIVE_RANGE", "LOGICAL_OR", "LOGICAL_AND", "COMPARE", "EQUAL", "CASE_EQUAL", "NOT_EQUAL", "MATCH", "NOT_MATCH", "LESS_THAN", "GREATER_THAN", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "BXOR", "BOR", "BAND", "RIGHT_SHIFT", "PLUS", "MINUS", "STAR", "POWER", "BNOT", "NOT", "INT", "FLOAT", "ARRAY", "HASH", "RANGE", "REGEX", "OCTAL", "DECIMAL", "HEX", "BINARY", "ESCAPE_INT", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "NON_LEADING0_NUMBER", "EXP_PART", "LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "HEREDOC_CONTENT", "HEREDOC_INDENT_STRING", "PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "POWER_ASSIGN", "BAND_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "LOGICAL_AND_ASSIGN", "LOGICAL_OR_ASSIGN", "ASSOC", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "EMPTY_ARRAY", "COMMA", "COLON", "COLON2", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "'then'", "'and'", "'or'", "'not'", "'expression0'", "'expression1'", "'expression2'", "'='"
    };
    public static final int COMMA = 106;
    public static final int LOGICAL_AND_ASSIGN = 98;
    public static final int GREATER_THAN = 46;
    public static final int MINUS = 54;
    public static final int ESCAPE_INT = 69;
    public static final int ARRAY = 61;
    public static final int HASH = 62;
    public static final int HEX_PART = 70;
    public static final int LOGICAL_OR = 37;
    public static final int LESS_THAN = 45;
    public static final int META_PART = 72;
    public static final int LEADING0_NUMBER = 76;
    public static final int BOR = 50;
    public static final int BINARY = 68;
    public static final int COLON2 = 108;
    public static final int EMPTY_ARRAY = 105;
    public static final int LCURLY = 81;
    public static final int LINE_BREAK = 32;
    public static final int LEFT_SHIFT = 12;
    public static final int IF_MODIFIER = 26;
    public static final int MULTIPLE_ASSIGN = 16;
    public static final int ESCAPE_INT_PART = 73;
    public static final int REGEX = 64;
    public static final int SYMBOL = 14;
    public static final int RPAREN = 102;
    public static final int CONTROL_PART = 71;
    public static final int DOUBLE_QUOTE_STRING = 78;
    public static final int STAR_ASSIGN = 89;
    public static final int ASSIGNMENT = 13;
    public static final int PLUS = 53;
    public static final int BODY = 9;
    public static final int HEREDOC_INDENT_BEGIN = 84;
    public static final int CASE_EQUAL = 41;
    public static final int UNLESS_MODIFIER = 27;
    public static final int MINUS_ASSIGN = 88;
    public static final int EXCLUSIVE_RANGE = 36;
    public static final int GREATER_OR_EQUAL = 48;
    public static final int RANGE = 63;
    public static final int POWER_ASSIGN = 92;
    public static final int MOD_ASSIGN = 91;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA = 19;
    public static final int WS = 33;
    public static final int STRING = 23;
    public static final int DOUBLE_STRING_CHAR = 80;
    public static final int RIGHT_SHIFT_ASSIGN = 97;
    public static final int NON_LEADING0_NUMBER = 74;
    public static final int SINGLE_QUOTE_STRING = 77;
    public static final int HEREDOC_BEGIN = 83;
    public static final int LBRACK = 103;
    public static final int SEMI = 31;
    public static final int DIV_ASSIGN = 90;
    public static final int MRHS = 20;
    public static final int BLOCK_ARG = 18;
    public static final int EQUAL = 40;
    public static final int LOGICAL_AND = 38;
    public static final int COLON = 107;
    public static final int DIV = 24;
    public static final int HEREDOC_CONTENT = 85;
    public static final int HEX = 67;
    public static final int SINGLETON_METHOD = 22;
    public static final int STATEMENT_LIST = 4;
    public static final int STATEMENT = 5;
    public static final int INCLUSIVE_RANGE = 35;
    public static final int BNOT = 57;
    public static final int LOGICAL_OR_ASSIGN = 99;
    public static final int ASSOC = 100;
    public static final int FLOAT = 60;
    public static final int OCTAL = 65;
    public static final int MOD = 25;
    public static final int PLUS_ASSIGN = 87;
    public static final int DECIMAL = 66;
    public static final int UNTIL_MODIFIER = 29;
    public static final int BLOCK = 15;
    public static final int RCURLY = 82;
    public static final int INT = 59;
    public static final int BOR_ASSIGN = 95;
    public static final int LESS_OR_EQUAL = 47;
    public static final int LPAREN = 101;
    public static final int BAND = 51;
    public static final int NOT_MATCH = 44;
    public static final int ID = 34;
    public static final int NOT_EQUAL = 42;
    public static final int BAND_ASSIGN = 93;
    public static final int RIGHT_SHIFT = 52;
    public static final int POWER = 56;
    public static final int BXOR_ASSIGN = 94;
    public static final int NESTED_LHS = 21;
    public static final int LEFT_SHIFT_ASSIGN = 96;
    public static final int MATCH = 43;
    public static final int HEREDOC_INDENT_STRING = 86;
    public static final int WHILE_MODIFIER = 28;
    public static final int EXP_PART = 75;
    public static final int COMPARE = 39;
    public static final int IF = 7;
    public static final int ARG = 11;
    public static final int EOF = -1;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA = 17;
    public static final int CALL = 10;
    public static final int RBRACK = 104;
    public static final int RESCUE_MODIFIER = 30;
    public static final int MODIFIER_LINE = 6;
    public static final int RPAREN_IN_METHOD_DEFINATION = 8;
    public static final int BXOR = 49;
    public static final int STAR = 55;
    public static final int NOT = 58;
    public static final int SINGLE_STRING_CHAR = 79;

    public Rubyv3Parser(TokenStream input) {
        super(input);
    }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() {
        return tokenNames;
    }

    public String getGrammarFileName() {
        return "C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g";
    }


    private Rubyv3Parser parent = null;
    private SymbolTableManager stm = new SymbolTableManager(null);

    /*public boolean just_seen_var() {
            Token token = input.LT(1);
            if(token != null) {
              return stm.isDefinedInCurrentScope(token.getText());
            }
            return false;
    }*/
    public boolean isDefinedVar(String text) {
        boolean result = false;
        if (parent != null) {
            result = parent.isDefinedVar(text);
        } else {
            return stm.isDefinedInCurrentScope(text);
        }
        if (result) {
            return true;
        } else {
            return false;
        }

    }

    public void addVariable(String s) {
        if (parent != null) {
            parent.addVariable(s);
            return;
        }
        stm.addVariable(s);
    }

    public Rubyv3Parser(TokenStream input, Rubyv3Parser parent) {
        super(input);
        ((Rubyv3Lexer) input.getTokenSource()).setParser(this);
        this.parent = parent;
    }
    /*public void init() {
      ((Rubyv3Lexer) input.getTokenSource()).setParser(this);
    }*/


    public static class program_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start program
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3 = 2;
            int LA3_0 = input.LA(1);

            if ((LA3_0 == EOF || (LA3_0 >= SEMI && LA3_0 <= LINE_BREAK))) {
                alt3 = 1;
            } else
            if ((LA3_0 == SYMBOL || (LA3_0 >= IF_MODIFIER && LA3_0 <= UNLESS_MODIFIER) || LA3_0 == ID || (LA3_0 >= BNOT && LA3_0 <= REGEX) || (LA3_0 >= SINGLE_QUOTE_STRING && LA3_0 <= DOUBLE_QUOTE_STRING) || LA3_0 == HEREDOC_BEGIN || LA3_0 == HEREDOC_INDENT_STRING || LA3_0 == 109 || (LA3_0 >= 111 && LA3_0 <= 113) || (LA3_0 >= 119 && LA3_0 <= 122))) {
                alt3 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("171:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:19: ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:19: ( terminal )*
                    loop1:
                    do {
                        int alt1 = 2;
                        int LA1_0 = input.LA(1);

                        if (((LA1_0 >= SEMI && LA1_0 <= LINE_BREAK))) {
                            alt1 = 1;
                        }


                        switch (alt1) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:19: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program196);
                                terminal1 = terminal();
                                _fsp--;

                                adaptor.addChild(root_0, terminal1.getTree());

                            }
                            break;

                            default:
                                break loop1;
                        }
                    } while (true);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:30: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program200);
                    statement_list2 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:45: ( terminal )*
                    loop2:
                    do {
                        int alt2 = 2;
                        int LA2_0 = input.LA(1);

                        if (((LA2_0 >= SEMI && LA2_0 <= LINE_BREAK))) {
                            alt2 = 1;
                        }


                        switch (alt2) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:45: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program202);
                                terminal3 = terminal();
                                _fsp--;

                                adaptor.addChild(root_0, terminal3.getTree());

                            }
                            break;

                            default:
                                break loop2;
                        }
                    } while (true);


                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class statement_list_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start statement_list
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:175:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
    public final statement_list_return statement_list() throws RecognitionException {
        statement_list_return retval = new statement_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement4 = null;

        terminal_return terminal5 = null;

        statement_return statement6 = null;

        List list_statement = new ArrayList();
        List list_terminal = new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:5: statement ( ( terminal )+ statement )*
            {
                pushFollow(FOLLOW_statement_in_statement_list216);
                statement4 = statement();
                _fsp--;

                list_statement.add(statement4.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:15: ( ( terminal )+ statement )*
                loop5:
                do {
                    int alt5 = 2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:16: ( terminal )+ statement
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:16: ( terminal )+
                            int cnt4 = 0;
                            loop4:
                            do {
                                int alt4 = 2;
                                int LA4_0 = input.LA(1);

                                if (((LA4_0 >= SEMI && LA4_0 <= LINE_BREAK))) {
                                    alt4 = 1;
                                }


                                switch (alt4) {
                                    case 1:
                                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:16: terminal
                                    {
                                        pushFollow(FOLLOW_terminal_in_statement_list219);
                                        terminal5 = terminal();
                                        _fsp--;

                                        list_terminal.add(terminal5.getTree());

                                    }
                                    break;

                                    default:
                                        if (cnt4 >= 1) break loop4;
                                        EarlyExitException eee =
                                                new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);

                            pushFollow(FOLLOW_statement_in_statement_list222);
                            statement6 = statement();
                            _fsp--;

                            list_statement.add(statement6.getTree());

                        }
                        break;

                        default:
                            break loop5;
                    }
                } while (true);

                // AST REWRITE
                int i_0 = 0;
                retval.tree = root_0;
                root_0 = (Object) adaptor.nil();
                // 176:38: -> ^( STATEMENT_LIST ( statement )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:41: ^( STATEMENT_LIST ( statement )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:176:58: ( statement )*
                        {
                            int n_1 = list_statement == null ? 0 : list_statement.size();


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, list_statement.get(i_1));

                            }
                        }

                        adaptor.addChild(root_0, root_1);
                    }

                }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement_list

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start statement
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:183:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line = new ArrayList();
        List list_expression = new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:4: expression ( modifier_line )*
            {
                pushFollow(FOLLOW_expression_in_statement248);
                expression7 = expression();
                _fsp--;

                list_expression.add(expression7.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:15: ( modifier_line )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if (((LA6_0 >= IF_MODIFIER && LA6_0 <= RESCUE_MODIFIER))) {
                        alt6 = 1;
                    }


                    switch (alt6) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:16: modifier_line
                        {
                            pushFollow(FOLLOW_modifier_line_in_statement251);
                            modifier_line8 = modifier_line();
                            _fsp--;

                            list_modifier_line.add(modifier_line8.getTree());

                        }
                        break;

                        default:
                            break loop6;
                    }
                } while (true);

                // AST REWRITE
                int i_0 = 0;
                retval.tree = root_0;
                root_0 = (Object) adaptor.nil();
                // 184:33: -> ^( STATEMENT expression ( modifier_line )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:36: ^( STATEMENT expression ( modifier_line )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                        adaptor.addChild(root_1, list_expression.get(i_0));
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:59: ( modifier_line )*
                        {
                            int n_1 = list_modifier_line == null ? 0 : list_modifier_line.size();


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, list_modifier_line.get(i_1));

                            }
                        }

                        adaptor.addChild(root_0, root_1);
                    }

                }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class modifier_line_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start modifier_line
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:187:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9 = null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
            {
                root_0 = (Object) adaptor.nil();

                set9 = (Token) input.LT(1);
                if ((input.LA(1) >= IF_MODIFIER && input.LA(1) <= RESCUE_MODIFIER)) {
                    input.consume();
                    root_0 = (Object) adaptor.becomeRoot(adaptor.create(set9), root_0);
                    errorRecovery = false;
                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recoverFromMismatchedSet(input, mse, FOLLOW_set_in_modifier_line291);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:80: ( line_break )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if ((LA7_0 == LINE_BREAK)) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:81: line_break
                        {
                            pushFollow(FOLLOW_line_break_in_modifier_line305);
                            line_break10 = line_break();
                            _fsp--;

                            adaptor.addChild(root_0, line_break10.getTree());

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);

                pushFollow(FOLLOW_expression_in_modifier_line309);
                expression11 = expression();
                _fsp--;

                adaptor.addChild(root_0, expression11.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end modifier_line

    public static class block_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start block_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:1: block_expression : 'begin' body 'end' ;
    public final block_expression_return block_expression() throws RecognitionException {
        block_expression_return retval = new block_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12 = null;
        Token string_literal14 = null;
        body_return body13 = null;


        Object string_literal12_tree = null;
        Object string_literal14_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:207:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:207:4: 'begin' body 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal12 = (Token) input.LT(1);
                match(input, 109, FOLLOW_109_in_block_expression384);
                string_literal12_tree = (Object) adaptor.create(string_literal12);
                adaptor.addChild(root_0, string_literal12_tree);

                pushFollow(FOLLOW_body_in_block_expression386);
                body13 = body();
                _fsp--;

                adaptor.addChild(root_0, body13.getTree());
                string_literal14 = (Token) input.LT(1);
                match(input, 110, FOLLOW_110_in_block_expression388);
                string_literal14_tree = (Object) adaptor.create(string_literal14);
                adaptor.addChild(root_0, string_literal14_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block_expression

    public static class body_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start body
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15 = null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10 = 2;
            int LA10_0 = input.LA(1);

            if ((LA10_0 == SEMI || LA10_0 == 110 || (LA10_0 >= 114 && LA10_0 <= 115))) {
                alt10 = 1;
            } else
            if ((LA10_0 == SYMBOL || (LA10_0 >= IF_MODIFIER && LA10_0 <= UNLESS_MODIFIER) || LA10_0 == ID || (LA10_0 >= BNOT && LA10_0 <= REGEX) || (LA10_0 >= SINGLE_QUOTE_STRING && LA10_0 <= DOUBLE_QUOTE_STRING) || LA10_0 == HEREDOC_BEGIN || LA10_0 == HEREDOC_INDENT_STRING || LA10_0 == 109 || (LA10_0 >= 111 && LA10_0 <= 113) || (LA10_0 >= 119 && LA10_0 <= 122))) {
                alt10 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("208:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:8: ( SEMI )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);

                        if ((LA8_0 == SEMI)) {
                            alt8 = 1;
                        }


                        switch (alt8) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:8: SEMI
                            {
                                SEMI15 = (Token) input.LT(1);
                                match(input, SEMI, FOLLOW_SEMI_in_body395);
                                SEMI15_tree = (Object) adaptor.create(SEMI15);
                                adaptor.addChild(root_0, SEMI15_tree);


                            }
                            break;

                            default:
                                break loop8;
                        }
                    } while (true);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:15: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body399);
                    statement_list16 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:30: ( terminal )*
                    loop9:
                    do {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);

                        if (((LA9_0 >= SEMI && LA9_0 <= LINE_BREAK))) {
                            alt9 = 1;
                        }


                        switch (alt9) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:30: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_body401);
                                terminal17 = terminal();
                                _fsp--;

                                adaptor.addChild(root_0, terminal17.getTree());

                            }
                            break;

                            default:
                                break loop9;
                        }
                    } while (true);


                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end body

    public static class boolean_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start boolean_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:209:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18 = null;

        Object set18_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:210:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set18 = (Token) input.LT(1);
                if ((input.LA(1) >= 111 && input.LA(1) <= 113)) {
                    input.consume();
                    adaptor.addChild(root_0, adaptor.create(set18));
                    errorRecovery = false;
                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recoverFromMismatchedSet(input, mse, FOLLOW_set_in_boolean_expression0);
                    throw mse;
                }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end boolean_expression

    public static class if_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start if_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
    public final if_expression_return if_expression() throws RecognitionException {
        if_expression_return retval = new if_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal19 = null;
        Token string_literal21 = null;
        Token string_literal23 = null;
        Token string_literal24 = null;
        List list_body1 = null;
        expression_return e0 = null;

        body_return body0 = null;

        expression_return e1 = null;

        body_return body2 = null;

        seperator_return seperator20 = null;

        seperator_return seperator22 = null;

        RuleReturnScope body1 = null;
        List list_seperator = new ArrayList();
        List list_expression = new ArrayList();
        List list_body = new ArrayList();
        List list_114 = new ArrayList();
        List list_115 = new ArrayList();
        List list_IF_MODIFIER = new ArrayList();
        List list_110 = new ArrayList();
        Object string_literal19_tree = null;
        Object string_literal21_tree = null;
        Object string_literal23_tree = null;
        Object string_literal24_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
                string_literal19 = (Token) input.LT(1);
                match(input, IF_MODIFIER, FOLLOW_IF_MODIFIER_in_if_expression424);
                list_IF_MODIFIER.add(string_literal19);

                pushFollow(FOLLOW_expression_in_if_expression429);
                e0 = expression();
                _fsp--;

                list_expression.add(e0.getTree());
                pushFollow(FOLLOW_seperator_in_if_expression431);
                seperator20 = seperator();
                _fsp--;

                list_seperator.add(seperator20.getTree());
                pushFollow(FOLLOW_body_in_if_expression444);
                body0 = body();
                _fsp--;

                list_body.add(body0.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:21: ( 'elsif' e1= expression seperator body1+= body )*
                loop11:
                do {
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);

                    if ((LA11_0 == 114)) {
                        alt11 = 1;
                    }


                    switch (alt11) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:213:22: 'elsif' e1= expression seperator body1+= body
                        {
                            string_literal21 = (Token) input.LT(1);
                            match(input, 114, FOLLOW_114_in_if_expression447);
                            list_114.add(string_literal21);

                            pushFollow(FOLLOW_expression_in_if_expression451);
                            e1 = expression();
                            _fsp--;

                            list_expression.add(e1.getTree());
                            pushFollow(FOLLOW_seperator_in_if_expression453);
                            seperator22 = seperator();
                            _fsp--;

                            list_seperator.add(seperator22.getTree());
                            pushFollow(FOLLOW_body_in_if_expression457);
                            body1 = body();
                            _fsp--;

                            list_body.add(body1.getTree());
                            if (list_body1 == null) list_body1 = new ArrayList();
                            list_body1.add(body1);


                        }
                        break;

                        default:
                            break loop11;
                    }
                } while (true);

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:214:10: ( 'else' body2= body )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);

                if ((LA12_0 == 115)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:214:11: 'else' body2= body
                    {
                        string_literal23 = (Token) input.LT(1);
                        match(input, 115, FOLLOW_115_in_if_expression471);
                        list_115.add(string_literal23);

                        pushFollow(FOLLOW_body_in_if_expression475);
                        body2 = body();
                        _fsp--;

                        list_body.add(body2.getTree());

                    }
                    break;

                }

                string_literal24 = (Token) input.LT(1);
                match(input, 110, FOLLOW_110_in_if_expression488);
                list_110.add(string_literal24);

                // AST REWRITE
                int i_0 = 0;
                retval.tree = root_0;
                root_0 = (Object) adaptor.nil();
                // 215:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:215:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, e0.tree);
                        adaptor.addChild(root_1, body0.tree);
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:215:35: ( $e1)*
                        {
                            int n_1 = e1 == null ? 0 : 1;


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, e1.tree);

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:215:40: ( $body1)*
                        {
                            int n_1 = list_body1 == null ? 0 : list_body1.size();


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, ((ParserRuleReturnScope) list_body1.get(i_1)).getTree());

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:215:48: ( $body2)?
                        {
                            int n_1 = body2 == null ? 0 : 1;


                            if (n_1 > 1) throw new RuntimeException(" list has > 1 elements");
                            if (n_1 == 1) {
                                int i_1 = 0;
                                adaptor.addChild(root_1, body2.tree);

                            }
                        }

                        adaptor.addChild(root_0, root_1);
                    }

                }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end if_expression

    public static class seperator_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start seperator
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
    public final seperator_return seperator() throws RecognitionException {
        seperator_return retval = new seperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK25 = null;
        Token char_literal26 = null;
        Token LINE_BREAK27 = null;
        Token LINE_BREAK28 = null;
        Token string_literal29 = null;
        Token LINE_BREAK30 = null;

        Object LINE_BREAK25_tree = null;
        Object char_literal26_tree = null;
        Object LINE_BREAK27_tree = null;
        Object LINE_BREAK28_tree = null;
        Object string_literal29_tree = null;
        Object LINE_BREAK30_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17 = 3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:3: ( LINE_BREAK )+
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:3: ( LINE_BREAK )+
                    int cnt13 = 0;
                    loop13:
                    do {
                        int alt13 = 2;
                        int LA13_0 = input.LA(1);

                        if ((LA13_0 == LINE_BREAK)) {
                            alt13 = 1;
                        }


                        switch (alt13) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:3: LINE_BREAK
                            {
                                LINE_BREAK25 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator540);
                                LINE_BREAK25_tree = (Object) adaptor.create(LINE_BREAK25);
                                adaptor.addChild(root_0, LINE_BREAK25_tree);


                            }
                            break;

                            default:
                                if (cnt13 >= 1) break loop13;
                                EarlyExitException eee =
                                        new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:15: ':' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    char_literal26 = (Token) input.LT(1);
                    match(input, COLON, FOLLOW_COLON_in_seperator543);
                    char_literal26_tree = (Object) adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);

                        if ((LA14_0 == LINE_BREAK)) {
                            alt14 = 1;
                        }


                        switch (alt14) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:19: LINE_BREAK
                            {
                                LINE_BREAK27 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator545);
                                LINE_BREAK27_tree = (Object) adaptor.create(LINE_BREAK27);
                                adaptor.addChild(root_0, LINE_BREAK27_tree);


                            }
                            break;

                            default:
                                break loop14;
                        }
                    } while (true);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);

                        if ((LA15_0 == LINE_BREAK)) {
                            alt15 = 1;
                        }


                        switch (alt15) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:33: LINE_BREAK
                            {
                                LINE_BREAK28 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator550);
                                LINE_BREAK28_tree = (Object) adaptor.create(LINE_BREAK28);
                                adaptor.addChild(root_0, LINE_BREAK28_tree);


                            }
                            break;

                            default:
                                break loop15;
                        }
                    } while (true);

                    string_literal29 = (Token) input.LT(1);
                    match(input, 116, FOLLOW_116_in_seperator553);
                    string_literal29_tree = (Object) adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16 = 2;
                        int LA16_0 = input.LA(1);

                        if ((LA16_0 == LINE_BREAK)) {
                            alt16 = 1;
                        }


                        switch (alt16) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:219:52: LINE_BREAK
                            {
                                LINE_BREAK30 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator555);
                                LINE_BREAK30_tree = (Object) adaptor.create(LINE_BREAK30);
                                adaptor.addChild(root_0, LINE_BREAK30_tree);


                            }
                            break;

                            default:
                                break loop16;
                        }
                    } while (true);


                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end seperator

    public static class unless_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start unless_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:220:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
    public final unless_expression_return unless_expression() throws RecognitionException {
        unless_expression_return retval = new unless_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31 = null;
        Token string_literal33 = null;
        Token char_literal34 = null;
        Token string_literal37 = null;
        Token string_literal39 = null;
        boolean_expression_return boolean_expression32 = null;

        line_break_return line_break35 = null;

        body_return body36 = null;

        body_return body38 = null;


        Object string_literal31_tree = null;
        Object string_literal33_tree = null;
        Object char_literal34_tree = null;
        Object string_literal37_tree = null;
        Object string_literal39_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal31 = (Token) input.LT(1);
                match(input, UNLESS_MODIFIER, FOLLOW_UNLESS_MODIFIER_in_unless_expression565);
                string_literal31_tree = (Object) adaptor.create(string_literal31);
                adaptor.addChild(root_0, string_literal31_tree);

                pushFollow(FOLLOW_boolean_expression_in_unless_expression567);
                boolean_expression32 = boolean_expression();
                _fsp--;

                adaptor.addChild(root_0, boolean_expression32.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:32: ( 'then' | ':' | line_break )
                int alt18 = 3;
                switch (input.LA(1)) {
                    case 116: {
                        alt18 = 1;
                    }
                    break;
                    case COLON: {
                        alt18 = 2;
                    }
                    break;
                    case LINE_BREAK: {
                        alt18 = 3;
                    }
                    break;
                    default:
                        NoViableAltException nvae =
                                new NoViableAltException("221:32: ( 'then' | ':' | line_break )", 18, 0, input);

                        throw nvae;
                }

                switch (alt18) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:33: 'then'
                    {
                        string_literal33 = (Token) input.LT(1);
                        match(input, 116, FOLLOW_116_in_unless_expression570);
                        string_literal33_tree = (Object) adaptor.create(string_literal33);
                        adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:40: ':'
                    {
                        char_literal34 = (Token) input.LT(1);
                        match(input, COLON, FOLLOW_COLON_in_unless_expression572);
                        char_literal34_tree = (Object) adaptor.create(char_literal34);
                        adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:221:44: line_break
                    {
                        pushFollow(FOLLOW_line_break_in_unless_expression574);
                        line_break35 = line_break();
                        _fsp--;

                        adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

                }

                pushFollow(FOLLOW_body_in_unless_expression586);
                body36 = body();
                _fsp--;

                adaptor.addChild(root_0, body36.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:223:10: ( 'else' body )?
                int alt19 = 2;
                int LA19_0 = input.LA(1);

                if ((LA19_0 == 115)) {
                    alt19 = 1;
                }
                switch (alt19) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:223:11: 'else' body
                    {
                        string_literal37 = (Token) input.LT(1);
                        match(input, 115, FOLLOW_115_in_unless_expression599);
                        string_literal37_tree = (Object) adaptor.create(string_literal37);
                        adaptor.addChild(root_0, string_literal37_tree);

                        pushFollow(FOLLOW_body_in_unless_expression601);
                        body38 = body();
                        _fsp--;

                        adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

                }

                string_literal39 = (Token) input.LT(1);
                match(input, 110, FOLLOW_110_in_unless_expression614);
                string_literal39_tree = (Object) adaptor.create(string_literal39);
                adaptor.addChild(root_0, string_literal39_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unless_expression

    public static class terminal_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start terminal
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:225:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40 = null;
        line_break_return line_break41 = null;


        Object SEMI40_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:225:11: ( SEMI | line_break )
            int alt20 = 2;
            int LA20_0 = input.LA(1);

            if ((LA20_0 == SEMI)) {
                alt20 = 1;
            } else if ((LA20_0 == LINE_BREAK)) {
                alt20 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("225:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:225:11: SEMI
                {
                    root_0 = (Object) adaptor.nil();

                    SEMI40 = (Token) input.LT(1);
                    match(input, SEMI, FOLLOW_SEMI_in_terminal620);

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:225:17: line_break
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal623);
                    line_break41 = line_break();
                    _fsp--;

                    adaptor.addChild(root_0, line_break41.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end terminal

    public static class line_break_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start line_break
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:226:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42 = null;

        Object LINE_BREAK42_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:227:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:227:5: LINE_BREAK
            {
                root_0 = (Object) adaptor.nil();

                LINE_BREAK42 = (Token) input.LT(1);
                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_line_break633);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end line_break

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:1: expression : ( andorExpression | assignment_expression );
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        andorExpression_return andorExpression43 = null;

        assignment_expression_return assignment_expression44 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:5: ( andorExpression | assignment_expression )
            int alt21 = 2;
            int LA21_0 = input.LA(1);

            if ((LA21_0 == SYMBOL || (LA21_0 >= IF_MODIFIER && LA21_0 <= UNLESS_MODIFIER) || (LA21_0 >= BNOT && LA21_0 <= REGEX) || (LA21_0 >= SINGLE_QUOTE_STRING && LA21_0 <= DOUBLE_QUOTE_STRING) || LA21_0 == HEREDOC_BEGIN || LA21_0 == HEREDOC_INDENT_STRING || LA21_0 == 109 || (LA21_0 >= 111 && LA21_0 <= 113) || (LA21_0 >= 119 && LA21_0 <= 122))) {
                alt21 = 1;
            } else if ((LA21_0 == ID)) {
                int LA21_2 = input.LA(2);

                if ((LA21_2 == EOF || LA21_2 == LEFT_SHIFT || (LA21_2 >= DIV && LA21_2 <= LINE_BREAK) || (LA21_2 >= INCLUSIVE_RANGE && LA21_2 <= POWER) || LA21_2 == COLON || LA21_2 == 110 || (LA21_2 >= 114 && LA21_2 <= 118))) {
                    alt21 = 1;
                } else if ((LA21_2 == 123)) {
                    alt21 = 2;
                } else {
                    NoViableAltException nvae =
                            new NoViableAltException("260:1: expression : ( andorExpression | assignment_expression );", 21, 2, input);

                    throw nvae;
                }
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("260:1: expression : ( andorExpression | assignment_expression );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:5: andorExpression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_andorExpression_in_expression719);
                    andorExpression43 = andorExpression();
                    _fsp--;

                    adaptor.addChild(root_0, andorExpression43.getTree());

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:21: assignment_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_assignment_expression_in_expression721);
                    assignment_expression44 = assignment_expression();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_expression44.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression

    public static class andorExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start andorExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal46 = null;
        Token LINE_BREAK47 = null;
        Token string_literal48 = null;
        Token LINE_BREAK49 = null;
        notExpression_return notExpression45 = null;

        notExpression_return notExpression50 = null;


        Object string_literal46_tree = null;
        Object LINE_BREAK47_tree = null;
        Object string_literal48_tree = null;
        Object LINE_BREAK49_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:263:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:263:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_notExpression_in_andorExpression730);
                notExpression45 = notExpression();
                _fsp--;

                adaptor.addChild(root_0, notExpression45.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:263:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
                loop25:
                do {
                    int alt25 = 2;
                    int LA25_0 = input.LA(1);

                    if (((LA25_0 >= 117 && LA25_0 <= 118))) {
                        alt25 = 1;
                    }


                    switch (alt25) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
                            int alt24 = 2;
                            int LA24_0 = input.LA(1);

                            if ((LA24_0 == 117)) {
                                alt24 = 1;
                            } else if ((LA24_0 == 118)) {
                                alt24 = 2;
                            } else {
                                NoViableAltException nvae =
                                        new NoViableAltException("264:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:7: 'and' ( LINE_BREAK )*
                                {
                                    string_literal46 = (Token) input.LT(1);
                                    match(input, 117, FOLLOW_117_in_andorExpression740);
                                    string_literal46_tree = (Object) adaptor.create(string_literal46);
                                    root_0 = (Object) adaptor.becomeRoot(string_literal46_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:15: ( LINE_BREAK )*
                                    loop22:
                                    do {
                                        int alt22 = 2;
                                        int LA22_0 = input.LA(1);

                                        if ((LA22_0 == LINE_BREAK)) {
                                            alt22 = 1;
                                        }


                                        switch (alt22) {
                                            case 1:
                                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:264:16: LINE_BREAK
                                            {
                                                LINE_BREAK47 = (Token) input.LT(1);
                                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_andorExpression745);

                                            }
                                            break;

                                            default:
                                                break loop22;
                                        }
                                    } while (true);


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:7: 'or' ( LINE_BREAK )*
                                {
                                    string_literal48 = (Token) input.LT(1);
                                    match(input, 118, FOLLOW_118_in_andorExpression756);
                                    string_literal48_tree = (Object) adaptor.create(string_literal48);
                                    root_0 = (Object) adaptor.becomeRoot(string_literal48_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:14: ( LINE_BREAK )*
                                    loop23:
                                    do {
                                        int alt23 = 2;
                                        int LA23_0 = input.LA(1);

                                        if ((LA23_0 == LINE_BREAK)) {
                                            alt23 = 1;
                                        }


                                        switch (alt23) {
                                            case 1:
                                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:265:15: LINE_BREAK
                                            {
                                                LINE_BREAK49 = (Token) input.LT(1);
                                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_andorExpression761);

                                            }
                                            break;

                                            default:
                                                break loop23;
                                        }
                                    } while (true);


                                }
                                break;

                            }

                            pushFollow(FOLLOW_notExpression_in_andorExpression776);
                            notExpression50 = notExpression();
                            _fsp--;

                            adaptor.addChild(root_0, notExpression50.getTree());

                        }
                        break;

                        default:
                            break loop25;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end andorExpression

    public static class notExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start notExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:270:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal51 = null;
        Token LINE_BREAK52 = null;
        notExpression_return notExpression53 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression54 = null;


        Object string_literal51_tree = null;
        Object LINE_BREAK52_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:5: ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression )
            int alt27 = 2;
            int LA27_0 = input.LA(1);

            if ((LA27_0 == 119)) {
                alt27 = 1;
            } else
            if ((LA27_0 == SYMBOL || (LA27_0 >= IF_MODIFIER && LA27_0 <= UNLESS_MODIFIER) || LA27_0 == ID || (LA27_0 >= BNOT && LA27_0 <= REGEX) || (LA27_0 >= SINGLE_QUOTE_STRING && LA27_0 <= DOUBLE_QUOTE_STRING) || LA27_0 == HEREDOC_BEGIN || LA27_0 == HEREDOC_INDENT_STRING || LA27_0 == 109 || (LA27_0 >= 111 && LA27_0 <= 113) || (LA27_0 >= 120 && LA27_0 <= 122))) {
                alt27 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("270:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:5: 'not' ( LINE_BREAK )* notExpression
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal51 = (Token) input.LT(1);
                    match(input, 119, FOLLOW_119_in_notExpression794);
                    string_literal51_tree = (Object) adaptor.create(string_literal51);
                    root_0 = (Object) adaptor.becomeRoot(string_literal51_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:4: ( LINE_BREAK )*
                    loop26:
                    do {
                        int alt26 = 2;
                        int LA26_0 = input.LA(1);

                        if ((LA26_0 == LINE_BREAK)) {
                            alt26 = 1;
                        }


                        switch (alt26) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:272:5: LINE_BREAK
                            {
                                LINE_BREAK52 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_notExpression801);

                            }
                            break;

                            default:
                                break loop26;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression809);
                    notExpression53 = notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression53.getTree());

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:5: ternaryIfThenElseExpression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_notExpression815);
                    ternaryIfThenElseExpression54 = ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression54.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end notExpression

    public static class ternaryIfThenElseExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start ternaryIfThenElseExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:1: ternaryIfThenElseExpression : rangeExpression ;
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        rangeExpression_return rangeExpression55 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:5: ( rangeExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:5: rangeExpression
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_rangeExpression_in_ternaryIfThenElseExpression827);
                rangeExpression55 = rangeExpression();
                _fsp--;

                adaptor.addChild(root_0, rangeExpression55.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ternaryIfThenElseExpression

    public static class rangeExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start rangeExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:281:1: rangeExpression : logicalOrExpression ( options {greedy=true; } : ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? ) logicalOrExpression )* ;
    public final rangeExpression_return rangeExpression() throws RecognitionException {
        rangeExpression_return retval = new rangeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUSIVE_RANGE57 = null;
        Token LINE_BREAK58 = null;
        Token EXCLUSIVE_RANGE59 = null;
        Token LINE_BREAK60 = null;
        logicalOrExpression_return logicalOrExpression56 = null;

        logicalOrExpression_return logicalOrExpression61 = null;


        Object INCLUSIVE_RANGE57_tree = null;
        Object LINE_BREAK58_tree = null;
        Object EXCLUSIVE_RANGE59_tree = null;
        Object LINE_BREAK60_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:5: ( logicalOrExpression ( options {greedy=true; } : ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? ) logicalOrExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:282:5: logicalOrExpression ( options {greedy=true; } : ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? ) logicalOrExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression841);
                logicalOrExpression56 = logicalOrExpression();
                _fsp--;

                adaptor.addChild(root_0, logicalOrExpression56.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:4: ( options {greedy=true; } : ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? ) logicalOrExpression )*
                loop31:
                do {
                    int alt31 = 2;
                    int LA31_0 = input.LA(1);

                    if (((LA31_0 >= INCLUSIVE_RANGE && LA31_0 <= EXCLUSIVE_RANGE))) {
                        alt31 = 1;
                    }


                    switch (alt31) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:5: ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? ) logicalOrExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:5: ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? )
                            int alt30 = 2;
                            int LA30_0 = input.LA(1);

                            if ((LA30_0 == INCLUSIVE_RANGE)) {
                                alt30 = 1;
                            } else if ((LA30_0 == EXCLUSIVE_RANGE)) {
                                alt30 = 2;
                            } else {
                                NoViableAltException nvae =
                                        new NoViableAltException("284:5: ( INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? | EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )? )", 30, 0, input);

                                throw nvae;
                            }
                            switch (alt30) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:7: INCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    INCLUSIVE_RANGE57 = (Token) input.LT(1);
                                    match(input, INCLUSIVE_RANGE, FOLLOW_INCLUSIVE_RANGE_in_rangeExpression862);
                                    INCLUSIVE_RANGE57_tree = (Object) adaptor.create(INCLUSIVE_RANGE57);
                                    root_0 = (Object) adaptor.becomeRoot(INCLUSIVE_RANGE57_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:24: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt28 = 2;
                                    int LA28_0 = input.LA(1);

                                    if ((LA28_0 == LINE_BREAK)) {
                                        alt28 = 1;
                                    }
                                    switch (alt28) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:284:47: LINE_BREAK
                                        {
                                            LINE_BREAK58 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_rangeExpression873);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:7: EXCLUSIVE_RANGE ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    EXCLUSIVE_RANGE59 = (Token) input.LT(1);
                                    match(input, EXCLUSIVE_RANGE, FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression884);
                                    EXCLUSIVE_RANGE59_tree = (Object) adaptor.create(EXCLUSIVE_RANGE59);
                                    root_0 = (Object) adaptor.becomeRoot(EXCLUSIVE_RANGE59_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:24: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt29 = 2;
                                    int LA29_0 = input.LA(1);

                                    if ((LA29_0 == LINE_BREAK)) {
                                        alt29 = 1;
                                    }
                                    switch (alt29) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:285:47: LINE_BREAK
                                        {
                                            LINE_BREAK60 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_rangeExpression895);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_logicalOrExpression_in_rangeExpression910);
                            logicalOrExpression61 = logicalOrExpression();
                            _fsp--;

                            adaptor.addChild(root_0, logicalOrExpression61.getTree());

                        }
                        break;

                        default:
                            break loop31;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rangeExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start logicalOrExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:292:1: logicalOrExpression : logicalAndExpression ( options {greedy=true; } : LOGICAL_OR ( options {greedy=true; } : LINE_BREAK )? logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_OR63 = null;
        Token LINE_BREAK64 = null;
        logicalAndExpression_return logicalAndExpression62 = null;

        logicalAndExpression_return logicalAndExpression65 = null;


        Object LOGICAL_OR63_tree = null;
        Object LINE_BREAK64_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:5: ( logicalAndExpression ( options {greedy=true; } : LOGICAL_OR ( options {greedy=true; } : LINE_BREAK )? logicalAndExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:293:5: logicalAndExpression ( options {greedy=true; } : LOGICAL_OR ( options {greedy=true; } : LINE_BREAK )? logicalAndExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression930);
                logicalAndExpression62 = logicalAndExpression();
                _fsp--;

                adaptor.addChild(root_0, logicalAndExpression62.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:294:4: ( options {greedy=true; } : LOGICAL_OR ( options {greedy=true; } : LINE_BREAK )? logicalAndExpression )*
                loop33:
                do {
                    int alt33 = 2;
                    int LA33_0 = input.LA(1);

                    if ((LA33_0 == LOGICAL_OR)) {
                        alt33 = 1;
                    }


                    switch (alt33) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:5: LOGICAL_OR ( options {greedy=true; } : LINE_BREAK )? logicalAndExpression
                        {
                            LOGICAL_OR63 = (Token) input.LT(1);
                            match(input, LOGICAL_OR, FOLLOW_LOGICAL_OR_in_logicalOrExpression949);
                            LOGICAL_OR63_tree = (Object) adaptor.create(LOGICAL_OR63);
                            root_0 = (Object) adaptor.becomeRoot(LOGICAL_OR63_tree, root_0);

                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:18: ( options {greedy=true; } : LINE_BREAK )?
                            int alt32 = 2;
                            int LA32_0 = input.LA(1);

                            if ((LA32_0 == LINE_BREAK)) {
                                alt32 = 1;
                            }
                            switch (alt32) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:295:41: LINE_BREAK
                                {
                                    LINE_BREAK64 = (Token) input.LT(1);
                                    match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_logicalOrExpression961);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression970);
                            logicalAndExpression65 = logicalAndExpression();
                            _fsp--;

                            adaptor.addChild(root_0, logicalAndExpression65.getTree());

                        }
                        break;

                        default:
                            break loop33;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start logicalAndExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:301:1: logicalAndExpression : equalityExpression ( options {greedy=true; } : LOGICAL_AND ( options {greedy=true; } : LINE_BREAK )? equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOGICAL_AND67 = null;
        Token LINE_BREAK68 = null;
        equalityExpression_return equalityExpression66 = null;

        equalityExpression_return equalityExpression69 = null;


        Object LOGICAL_AND67_tree = null;
        Object LINE_BREAK68_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:5: ( equalityExpression ( options {greedy=true; } : LOGICAL_AND ( options {greedy=true; } : LINE_BREAK )? equalityExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:302:5: equalityExpression ( options {greedy=true; } : LOGICAL_AND ( options {greedy=true; } : LINE_BREAK )? equalityExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression990);
                equalityExpression66 = equalityExpression();
                _fsp--;

                adaptor.addChild(root_0, equalityExpression66.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:303:4: ( options {greedy=true; } : LOGICAL_AND ( options {greedy=true; } : LINE_BREAK )? equalityExpression )*
                loop35:
                do {
                    int alt35 = 2;
                    int LA35_0 = input.LA(1);

                    if ((LA35_0 == LOGICAL_AND)) {
                        alt35 = 1;
                    }


                    switch (alt35) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:5: LOGICAL_AND ( options {greedy=true; } : LINE_BREAK )? equalityExpression
                        {
                            LOGICAL_AND67 = (Token) input.LT(1);
                            match(input, LOGICAL_AND, FOLLOW_LOGICAL_AND_in_logicalAndExpression1009);
                            LOGICAL_AND67_tree = (Object) adaptor.create(LOGICAL_AND67);
                            root_0 = (Object) adaptor.becomeRoot(LOGICAL_AND67_tree, root_0);

                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:19: ( options {greedy=true; } : LINE_BREAK )?
                            int alt34 = 2;
                            int LA34_0 = input.LA(1);

                            if ((LA34_0 == LINE_BREAK)) {
                                alt34 = 1;
                            }
                            switch (alt34) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:304:42: LINE_BREAK
                                {
                                    LINE_BREAK68 = (Token) input.LT(1);
                                    match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_logicalAndExpression1021);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression1030);
                            equalityExpression69 = equalityExpression();
                            _fsp--;

                            adaptor.addChild(root_0, equalityExpression69.getTree());

                        }
                        break;

                        default:
                            break loop35;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start equalityExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:310:1: equalityExpression : relationalExpression ( options {greedy=true; } : ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPARE71 = null;
        Token LINE_BREAK72 = null;
        Token EQUAL73 = null;
        Token LINE_BREAK74 = null;
        Token CASE_EQUAL75 = null;
        Token LINE_BREAK76 = null;
        Token NOT_EQUAL77 = null;
        Token LINE_BREAK78 = null;
        Token MATCH79 = null;
        Token LINE_BREAK80 = null;
        Token NOT_MATCH81 = null;
        Token LINE_BREAK82 = null;
        relationalExpression_return relationalExpression70 = null;

        relationalExpression_return relationalExpression83 = null;


        Object COMPARE71_tree = null;
        Object LINE_BREAK72_tree = null;
        Object EQUAL73_tree = null;
        Object LINE_BREAK74_tree = null;
        Object CASE_EQUAL75_tree = null;
        Object LINE_BREAK76_tree = null;
        Object NOT_EQUAL77_tree = null;
        Object LINE_BREAK78_tree = null;
        Object MATCH79_tree = null;
        Object LINE_BREAK80_tree = null;
        Object NOT_MATCH81_tree = null;
        Object LINE_BREAK82_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:5: ( relationalExpression ( options {greedy=true; } : ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? ) relationalExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:311:5: relationalExpression ( options {greedy=true; } : ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? ) relationalExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_relationalExpression_in_equalityExpression1050);
                relationalExpression70 = relationalExpression();
                _fsp--;

                adaptor.addChild(root_0, relationalExpression70.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:312:4: ( options {greedy=true; } : ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? ) relationalExpression )*
                loop43:
                do {
                    int alt43 = 2;
                    int LA43_0 = input.LA(1);

                    if (((LA43_0 >= COMPARE && LA43_0 <= NOT_MATCH))) {
                        alt43 = 1;
                    }


                    switch (alt43) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:5: ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? ) relationalExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:5: ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? )
                            int alt42 = 6;
                            switch (input.LA(1)) {
                                case COMPARE: {
                                    alt42 = 1;
                                }
                                break;
                                case EQUAL: {
                                    alt42 = 2;
                                }
                                break;
                                case CASE_EQUAL: {
                                    alt42 = 3;
                                }
                                break;
                                case NOT_EQUAL: {
                                    alt42 = 4;
                                }
                                break;
                                case MATCH: {
                                    alt42 = 5;
                                }
                                break;
                                case NOT_MATCH: {
                                    alt42 = 6;
                                }
                                break;
                                default:
                                    NoViableAltException nvae =
                                            new NoViableAltException("313:5: ( COMPARE ( options {greedy=true; } : LINE_BREAK )? | EQUAL ( options {greedy=true; } : LINE_BREAK )? | CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )? | NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )? | MATCH ( options {greedy=true; } : LINE_BREAK )? | NOT_MATCH ( options {greedy=true; } : LINE_BREAK )? )", 42, 0, input);

                                    throw nvae;
                            }

                            switch (alt42) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:7: COMPARE ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    COMPARE71 = (Token) input.LT(1);
                                    match(input, COMPARE, FOLLOW_COMPARE_in_equalityExpression1071);
                                    COMPARE71_tree = (Object) adaptor.create(COMPARE71);
                                    root_0 = (Object) adaptor.becomeRoot(COMPARE71_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:17: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt36 = 2;
                                    int LA36_0 = input.LA(1);

                                    if ((LA36_0 == LINE_BREAK)) {
                                        alt36 = 1;
                                    }
                                    switch (alt36) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:313:40: LINE_BREAK
                                        {
                                            LINE_BREAK72 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_equalityExpression1083);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:7: EQUAL ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    EQUAL73 = (Token) input.LT(1);
                                    match(input, EQUAL, FOLLOW_EQUAL_in_equalityExpression1094);
                                    EQUAL73_tree = (Object) adaptor.create(EQUAL73);
                                    root_0 = (Object) adaptor.becomeRoot(EQUAL73_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:16: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt37 = 2;
                                    int LA37_0 = input.LA(1);

                                    if ((LA37_0 == LINE_BREAK)) {
                                        alt37 = 1;
                                    }
                                    switch (alt37) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:314:39: LINE_BREAK
                                        {
                                            LINE_BREAK74 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_equalityExpression1107);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 3:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:7: CASE_EQUAL ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    CASE_EQUAL75 = (Token) input.LT(1);
                                    match(input, CASE_EQUAL, FOLLOW_CASE_EQUAL_in_equalityExpression1118);
                                    CASE_EQUAL75_tree = (Object) adaptor.create(CASE_EQUAL75);
                                    root_0 = (Object) adaptor.becomeRoot(CASE_EQUAL75_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:19: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt38 = 2;
                                    int LA38_0 = input.LA(1);

                                    if ((LA38_0 == LINE_BREAK)) {
                                        alt38 = 1;
                                    }
                                    switch (alt38) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:315:42: LINE_BREAK
                                        {
                                            LINE_BREAK76 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_equalityExpression1129);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 4:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:7: NOT_EQUAL ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    NOT_EQUAL77 = (Token) input.LT(1);
                                    match(input, NOT_EQUAL, FOLLOW_NOT_EQUAL_in_equalityExpression1140);
                                    NOT_EQUAL77_tree = (Object) adaptor.create(NOT_EQUAL77);
                                    root_0 = (Object) adaptor.becomeRoot(NOT_EQUAL77_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:19: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt39 = 2;
                                    int LA39_0 = input.LA(1);

                                    if ((LA39_0 == LINE_BREAK)) {
                                        alt39 = 1;
                                    }
                                    switch (alt39) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:316:42: LINE_BREAK
                                        {
                                            LINE_BREAK78 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_equalityExpression1152);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 5:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:7: MATCH ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    MATCH79 = (Token) input.LT(1);
                                    match(input, MATCH, FOLLOW_MATCH_in_equalityExpression1163);
                                    MATCH79_tree = (Object) adaptor.create(MATCH79);
                                    root_0 = (Object) adaptor.becomeRoot(MATCH79_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:16: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt40 = 2;
                                    int LA40_0 = input.LA(1);

                                    if ((LA40_0 == LINE_BREAK)) {
                                        alt40 = 1;
                                    }
                                    switch (alt40) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:317:39: LINE_BREAK
                                        {
                                            LINE_BREAK80 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_equalityExpression1176);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 6:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:7: NOT_MATCH ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    NOT_MATCH81 = (Token) input.LT(1);
                                    match(input, NOT_MATCH, FOLLOW_NOT_MATCH_in_equalityExpression1187);
                                    NOT_MATCH81_tree = (Object) adaptor.create(NOT_MATCH81);
                                    root_0 = (Object) adaptor.becomeRoot(NOT_MATCH81_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:19: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt41 = 2;
                                    int LA41_0 = input.LA(1);

                                    if ((LA41_0 == LINE_BREAK)) {
                                        alt41 = 1;
                                    }
                                    switch (alt41) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:318:42: LINE_BREAK
                                        {
                                            LINE_BREAK82 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_equalityExpression1199);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1214);
                            relationalExpression83 = relationalExpression();
                            _fsp--;

                            adaptor.addChild(root_0, relationalExpression83.getTree());

                        }
                        break;

                        default:
                            break loop43;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start relationalExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:326:1: relationalExpression : orExpression ( options {greedy=true; } : ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? ) orExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LESS_THAN85 = null;
        Token LINE_BREAK86 = null;
        Token GREATER_THAN87 = null;
        Token LINE_BREAK88 = null;
        Token LESS_OR_EQUAL89 = null;
        Token LINE_BREAK90 = null;
        Token GREATER_OR_EQUAL91 = null;
        Token LINE_BREAK92 = null;
        orExpression_return orExpression84 = null;

        orExpression_return orExpression93 = null;


        Object LESS_THAN85_tree = null;
        Object LINE_BREAK86_tree = null;
        Object GREATER_THAN87_tree = null;
        Object LINE_BREAK88_tree = null;
        Object LESS_OR_EQUAL89_tree = null;
        Object LINE_BREAK90_tree = null;
        Object GREATER_OR_EQUAL91_tree = null;
        Object LINE_BREAK92_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:5: ( orExpression ( options {greedy=true; } : ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? ) orExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:327:5: orExpression ( options {greedy=true; } : ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? ) orExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_orExpression_in_relationalExpression1235);
                orExpression84 = orExpression();
                _fsp--;

                adaptor.addChild(root_0, orExpression84.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:328:4: ( options {greedy=true; } : ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? ) orExpression )*
                loop49:
                do {
                    int alt49 = 2;
                    int LA49_0 = input.LA(1);

                    if (((LA49_0 >= LESS_THAN && LA49_0 <= GREATER_OR_EQUAL))) {
                        alt49 = 1;
                    }


                    switch (alt49) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:5: ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? ) orExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:5: ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? )
                            int alt48 = 4;
                            switch (input.LA(1)) {
                                case LESS_THAN: {
                                    alt48 = 1;
                                }
                                break;
                                case GREATER_THAN: {
                                    alt48 = 2;
                                }
                                break;
                                case LESS_OR_EQUAL: {
                                    alt48 = 3;
                                }
                                break;
                                case GREATER_OR_EQUAL: {
                                    alt48 = 4;
                                }
                                break;
                                default:
                                    NoViableAltException nvae =
                                            new NoViableAltException("329:5: ( LESS_THAN ( options {greedy=true; } : LINE_BREAK )? | GREATER_THAN ( options {greedy=true; } : LINE_BREAK )? | LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? | GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )? )", 48, 0, input);

                                    throw nvae;
                            }

                            switch (alt48) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:7: LESS_THAN ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    LESS_THAN85 = (Token) input.LT(1);
                                    match(input, LESS_THAN, FOLLOW_LESS_THAN_in_relationalExpression1256);
                                    LESS_THAN85_tree = (Object) adaptor.create(LESS_THAN85);
                                    root_0 = (Object) adaptor.becomeRoot(LESS_THAN85_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:20: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt44 = 2;
                                    int LA44_0 = input.LA(1);

                                    if ((LA44_0 == LINE_BREAK)) {
                                        alt44 = 1;
                                    }
                                    switch (alt44) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:329:43: LINE_BREAK
                                        {
                                            LINE_BREAK86 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_relationalExpression1269);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:7: GREATER_THAN ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    GREATER_THAN87 = (Token) input.LT(1);
                                    match(input, GREATER_THAN, FOLLOW_GREATER_THAN_in_relationalExpression1280);
                                    GREATER_THAN87_tree = (Object) adaptor.create(GREATER_THAN87);
                                    root_0 = (Object) adaptor.becomeRoot(GREATER_THAN87_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:22: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt45 = 2;
                                    int LA45_0 = input.LA(1);

                                    if ((LA45_0 == LINE_BREAK)) {
                                        alt45 = 1;
                                    }
                                    switch (alt45) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:330:45: LINE_BREAK
                                        {
                                            LINE_BREAK88 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_relationalExpression1292);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 3:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:7: LESS_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    LESS_OR_EQUAL89 = (Token) input.LT(1);
                                    match(input, LESS_OR_EQUAL, FOLLOW_LESS_OR_EQUAL_in_relationalExpression1303);
                                    LESS_OR_EQUAL89_tree = (Object) adaptor.create(LESS_OR_EQUAL89);
                                    root_0 = (Object) adaptor.becomeRoot(LESS_OR_EQUAL89_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:23: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt46 = 2;
                                    int LA46_0 = input.LA(1);

                                    if ((LA46_0 == LINE_BREAK)) {
                                        alt46 = 1;
                                    }
                                    switch (alt46) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:331:46: LINE_BREAK
                                        {
                                            LINE_BREAK90 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_relationalExpression1315);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 4:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:7: GREATER_OR_EQUAL ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    GREATER_OR_EQUAL91 = (Token) input.LT(1);
                                    match(input, GREATER_OR_EQUAL, FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1326);
                                    GREATER_OR_EQUAL91_tree = (Object) adaptor.create(GREATER_OR_EQUAL91);
                                    root_0 = (Object) adaptor.becomeRoot(GREATER_OR_EQUAL91_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:25: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt47 = 2;
                                    int LA47_0 = input.LA(1);

                                    if ((LA47_0 == LINE_BREAK)) {
                                        alt47 = 1;
                                    }
                                    switch (alt47) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:332:48: LINE_BREAK
                                        {
                                            LINE_BREAK92 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_relationalExpression1337);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_orExpression_in_relationalExpression1352);
                            orExpression93 = orExpression();
                            _fsp--;

                            adaptor.addChild(root_0, orExpression93.getTree());

                        }
                        break;

                        default:
                            break loop49;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpression

    public static class orExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start orExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:339:1: orExpression : andExpression ( options {greedy=true; } : ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? ) andExpression )* ;
    public final orExpression_return orExpression() throws RecognitionException {
        orExpression_return retval = new orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BXOR95 = null;
        Token LINE_BREAK96 = null;
        Token BOR97 = null;
        Token LINE_BREAK98 = null;
        andExpression_return andExpression94 = null;

        andExpression_return andExpression99 = null;


        Object BXOR95_tree = null;
        Object LINE_BREAK96_tree = null;
        Object BOR97_tree = null;
        Object LINE_BREAK98_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:5: ( andExpression ( options {greedy=true; } : ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? ) andExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:340:5: andExpression ( options {greedy=true; } : ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? ) andExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_andExpression_in_orExpression1372);
                andExpression94 = andExpression();
                _fsp--;

                adaptor.addChild(root_0, andExpression94.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:341:4: ( options {greedy=true; } : ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? ) andExpression )*
                loop53:
                do {
                    int alt53 = 2;
                    int LA53_0 = input.LA(1);

                    if (((LA53_0 >= BXOR && LA53_0 <= BOR))) {
                        alt53 = 1;
                    }


                    switch (alt53) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:5: ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? ) andExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:5: ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? )
                            int alt52 = 2;
                            int LA52_0 = input.LA(1);

                            if ((LA52_0 == BXOR)) {
                                alt52 = 1;
                            } else if ((LA52_0 == BOR)) {
                                alt52 = 2;
                            } else {
                                NoViableAltException nvae =
                                        new NoViableAltException("342:5: ( BXOR ( options {greedy=true; } : LINE_BREAK )? | BOR ( options {greedy=true; } : LINE_BREAK )? )", 52, 0, input);

                                throw nvae;
                            }
                            switch (alt52) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:7: BXOR ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    BXOR95 = (Token) input.LT(1);
                                    match(input, BXOR, FOLLOW_BXOR_in_orExpression1393);
                                    BXOR95_tree = (Object) adaptor.create(BXOR95);
                                    root_0 = (Object) adaptor.becomeRoot(BXOR95_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:15: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt50 = 2;
                                    int LA50_0 = input.LA(1);

                                    if ((LA50_0 == LINE_BREAK)) {
                                        alt50 = 1;
                                    }
                                    switch (alt50) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:342:38: LINE_BREAK
                                        {
                                            LINE_BREAK96 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_orExpression1406);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:343:7: BOR ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    BOR97 = (Token) input.LT(1);
                                    match(input, BOR, FOLLOW_BOR_in_orExpression1417);
                                    BOR97_tree = (Object) adaptor.create(BOR97);
                                    root_0 = (Object) adaptor.becomeRoot(BOR97_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:343:14: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt51 = 2;
                                    int LA51_0 = input.LA(1);

                                    if ((LA51_0 == LINE_BREAK)) {
                                        alt51 = 1;
                                    }
                                    switch (alt51) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:343:37: LINE_BREAK
                                        {
                                            LINE_BREAK98 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_orExpression1430);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_andExpression_in_orExpression1445);
                            andExpression99 = andExpression();
                            _fsp--;

                            adaptor.addChild(root_0, andExpression99.getTree());

                        }
                        break;

                        default:
                            break loop53;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end orExpression

    public static class andExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start andExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:350:1: andExpression : shiftExpression ( options {greedy=true; } : BAND ( options {greedy=true; } : LINE_BREAK )? shiftExpression )* ;
    public final andExpression_return andExpression() throws RecognitionException {
        andExpression_return retval = new andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAND101 = null;
        Token LINE_BREAK102 = null;
        shiftExpression_return shiftExpression100 = null;

        shiftExpression_return shiftExpression103 = null;


        Object BAND101_tree = null;
        Object LINE_BREAK102_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:5: ( shiftExpression ( options {greedy=true; } : BAND ( options {greedy=true; } : LINE_BREAK )? shiftExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:351:5: shiftExpression ( options {greedy=true; } : BAND ( options {greedy=true; } : LINE_BREAK )? shiftExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_shiftExpression_in_andExpression1465);
                shiftExpression100 = shiftExpression();
                _fsp--;

                adaptor.addChild(root_0, shiftExpression100.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:352:4: ( options {greedy=true; } : BAND ( options {greedy=true; } : LINE_BREAK )? shiftExpression )*
                loop55:
                do {
                    int alt55 = 2;
                    int LA55_0 = input.LA(1);

                    if ((LA55_0 == BAND)) {
                        alt55 = 1;
                    }


                    switch (alt55) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:5: BAND ( options {greedy=true; } : LINE_BREAK )? shiftExpression
                        {
                            BAND101 = (Token) input.LT(1);
                            match(input, BAND, FOLLOW_BAND_in_andExpression1484);
                            BAND101_tree = (Object) adaptor.create(BAND101);
                            root_0 = (Object) adaptor.becomeRoot(BAND101_tree, root_0);

                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:13: ( options {greedy=true; } : LINE_BREAK )?
                            int alt54 = 2;
                            int LA54_0 = input.LA(1);

                            if ((LA54_0 == LINE_BREAK)) {
                                alt54 = 1;
                            }
                            switch (alt54) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:353:36: LINE_BREAK
                                {
                                    LINE_BREAK102 = (Token) input.LT(1);
                                    match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_andExpression1497);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_shiftExpression_in_andExpression1506);
                            shiftExpression103 = shiftExpression();
                            _fsp--;

                            adaptor.addChild(root_0, shiftExpression103.getTree());

                        }
                        break;

                        default:
                            break loop55;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end andExpression

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start shiftExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:361:1: shiftExpression : additiveExpression ( options {greedy=true; } : ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? ) additiveExpression )* ;
    public final shiftExpression_return shiftExpression() throws RecognitionException {
        shiftExpression_return retval = new shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_SHIFT105 = null;
        Token LINE_BREAK106 = null;
        Token RIGHT_SHIFT107 = null;
        Token LINE_BREAK108 = null;
        additiveExpression_return additiveExpression104 = null;

        additiveExpression_return additiveExpression109 = null;


        Object LEFT_SHIFT105_tree = null;
        Object LINE_BREAK106_tree = null;
        Object RIGHT_SHIFT107_tree = null;
        Object LINE_BREAK108_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:5: ( additiveExpression ( options {greedy=true; } : ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? ) additiveExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:362:5: additiveExpression ( options {greedy=true; } : ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? ) additiveExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_additiveExpression_in_shiftExpression1528);
                additiveExpression104 = additiveExpression();
                _fsp--;

                adaptor.addChild(root_0, additiveExpression104.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:363:4: ( options {greedy=true; } : ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? ) additiveExpression )*
                loop59:
                do {
                    int alt59 = 2;
                    int LA59_0 = input.LA(1);

                    if ((LA59_0 == LEFT_SHIFT || LA59_0 == RIGHT_SHIFT)) {
                        alt59 = 1;
                    }


                    switch (alt59) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:5: ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? ) additiveExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:5: ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? )
                            int alt58 = 2;
                            int LA58_0 = input.LA(1);

                            if ((LA58_0 == LEFT_SHIFT)) {
                                alt58 = 1;
                            } else if ((LA58_0 == RIGHT_SHIFT)) {
                                alt58 = 2;
                            } else {
                                NoViableAltException nvae =
                                        new NoViableAltException("364:5: ( LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )? | RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )? )", 58, 0, input);

                                throw nvae;
                            }
                            switch (alt58) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:7: LEFT_SHIFT ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    LEFT_SHIFT105 = (Token) input.LT(1);
                                    match(input, LEFT_SHIFT, FOLLOW_LEFT_SHIFT_in_shiftExpression1549);
                                    LEFT_SHIFT105_tree = (Object) adaptor.create(LEFT_SHIFT105);
                                    root_0 = (Object) adaptor.becomeRoot(LEFT_SHIFT105_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:20: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt56 = 2;
                                    int LA56_0 = input.LA(1);

                                    if ((LA56_0 == LINE_BREAK)) {
                                        alt56 = 1;
                                    }
                                    switch (alt56) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:364:43: LINE_BREAK
                                        {
                                            LINE_BREAK106 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_shiftExpression1561);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:7: RIGHT_SHIFT ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    RIGHT_SHIFT107 = (Token) input.LT(1);
                                    match(input, RIGHT_SHIFT, FOLLOW_RIGHT_SHIFT_in_shiftExpression1572);
                                    RIGHT_SHIFT107_tree = (Object) adaptor.create(RIGHT_SHIFT107);
                                    root_0 = (Object) adaptor.becomeRoot(RIGHT_SHIFT107_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:20: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt57 = 2;
                                    int LA57_0 = input.LA(1);

                                    if ((LA57_0 == LINE_BREAK)) {
                                        alt57 = 1;
                                    }
                                    switch (alt57) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:365:43: LINE_BREAK
                                        {
                                            LINE_BREAK108 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_shiftExpression1583);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1598);
                            additiveExpression109 = additiveExpression();
                            _fsp--;

                            adaptor.addChild(root_0, additiveExpression109.getTree());

                        }
                        break;

                        default:
                            break loop59;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end shiftExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start additiveExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:374:1: additiveExpression : multiplicativeExpression ( options {greedy=true; } : ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS111 = null;
        Token LINE_BREAK112 = null;
        Token MINUS113 = null;
        Token LINE_BREAK114 = null;
        multiplicativeExpression_return multiplicativeExpression110 = null;

        multiplicativeExpression_return multiplicativeExpression115 = null;


        Object PLUS111_tree = null;
        Object LINE_BREAK112_tree = null;
        Object MINUS113_tree = null;
        Object LINE_BREAK114_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:5: ( multiplicativeExpression ( options {greedy=true; } : ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? ) multiplicativeExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:375:5: multiplicativeExpression ( options {greedy=true; } : ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? ) multiplicativeExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1620);
                multiplicativeExpression110 = multiplicativeExpression();
                _fsp--;

                adaptor.addChild(root_0, multiplicativeExpression110.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:376:4: ( options {greedy=true; } : ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? ) multiplicativeExpression )*
                loop63:
                do {
                    int alt63 = 2;
                    int LA63_0 = input.LA(1);

                    if (((LA63_0 >= PLUS && LA63_0 <= MINUS))) {
                        alt63 = 1;
                    }


                    switch (alt63) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:5: ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? ) multiplicativeExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:5: ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? )
                            int alt62 = 2;
                            int LA62_0 = input.LA(1);

                            if ((LA62_0 == PLUS)) {
                                alt62 = 1;
                            } else if ((LA62_0 == MINUS)) {
                                alt62 = 2;
                            } else {
                                NoViableAltException nvae =
                                        new NoViableAltException("377:5: ( PLUS ( options {greedy=true; } : LINE_BREAK )? | MINUS ( options {greedy=true; } : LINE_BREAK )? )", 62, 0, input);

                                throw nvae;
                            }
                            switch (alt62) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:7: PLUS ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    PLUS111 = (Token) input.LT(1);
                                    match(input, PLUS, FOLLOW_PLUS_in_additiveExpression1641);
                                    PLUS111_tree = (Object) adaptor.create(PLUS111);
                                    root_0 = (Object) adaptor.becomeRoot(PLUS111_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:16: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt60 = 2;
                                    int LA60_0 = input.LA(1);

                                    if ((LA60_0 == LINE_BREAK)) {
                                        alt60 = 1;
                                    }
                                    switch (alt60) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:377:39: LINE_BREAK
                                        {
                                            LINE_BREAK112 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_additiveExpression1655);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:7: MINUS ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    MINUS113 = (Token) input.LT(1);
                                    match(input, MINUS, FOLLOW_MINUS_in_additiveExpression1666);
                                    MINUS113_tree = (Object) adaptor.create(MINUS113);
                                    root_0 = (Object) adaptor.becomeRoot(MINUS113_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:17: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt61 = 2;
                                    int LA61_0 = input.LA(1);

                                    if ((LA61_0 == LINE_BREAK)) {
                                        alt61 = 1;
                                    }
                                    switch (alt61) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:378:40: LINE_BREAK
                                        {
                                            LINE_BREAK114 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_additiveExpression1680);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1695);
                            multiplicativeExpression115 = multiplicativeExpression();
                            _fsp--;

                            adaptor.addChild(root_0, multiplicativeExpression115.getTree());

                        }
                        break;

                        default:
                            break loop63;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start multiplicativeExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:385:1: multiplicativeExpression : powerExpression ( options {greedy=true; } : ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? ) powerExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STAR117 = null;
        Token LINE_BREAK118 = null;
        Token DIV119 = null;
        Token LINE_BREAK120 = null;
        Token MOD121 = null;
        Token LINE_BREAK122 = null;
        powerExpression_return powerExpression116 = null;

        powerExpression_return powerExpression123 = null;


        Object STAR117_tree = null;
        Object LINE_BREAK118_tree = null;
        Object DIV119_tree = null;
        Object LINE_BREAK120_tree = null;
        Object MOD121_tree = null;
        Object LINE_BREAK122_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:5: ( powerExpression ( options {greedy=true; } : ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? ) powerExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:386:5: powerExpression ( options {greedy=true; } : ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? ) powerExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression1715);
                powerExpression116 = powerExpression();
                _fsp--;

                adaptor.addChild(root_0, powerExpression116.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:387:4: ( options {greedy=true; } : ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? ) powerExpression )*
                loop68:
                do {
                    int alt68 = 2;
                    int LA68_0 = input.LA(1);

                    if (((LA68_0 >= DIV && LA68_0 <= MOD) || LA68_0 == STAR)) {
                        alt68 = 1;
                    }


                    switch (alt68) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:5: ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? ) powerExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:5: ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? )
                            int alt67 = 3;
                            switch (input.LA(1)) {
                                case STAR: {
                                    alt67 = 1;
                                }
                                break;
                                case DIV: {
                                    alt67 = 2;
                                }
                                break;
                                case MOD: {
                                    alt67 = 3;
                                }
                                break;
                                default:
                                    NoViableAltException nvae =
                                            new NoViableAltException("388:5: ( STAR ( options {greedy=true; } : LINE_BREAK )? | DIV ( options {greedy=true; } : LINE_BREAK )? | MOD ( options {greedy=true; } : LINE_BREAK )? )", 67, 0, input);

                                    throw nvae;
                            }

                            switch (alt67) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:7: STAR ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    STAR117 = (Token) input.LT(1);
                                    match(input, STAR, FOLLOW_STAR_in_multiplicativeExpression1736);
                                    STAR117_tree = (Object) adaptor.create(STAR117);
                                    root_0 = (Object) adaptor.becomeRoot(STAR117_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:15: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt64 = 2;
                                    int LA64_0 = input.LA(1);

                                    if ((LA64_0 == LINE_BREAK)) {
                                        alt64 = 1;
                                    }
                                    switch (alt64) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:388:38: LINE_BREAK
                                        {
                                            LINE_BREAK118 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_multiplicativeExpression1749);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:7: DIV ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    DIV119 = (Token) input.LT(1);
                                    match(input, DIV, FOLLOW_DIV_in_multiplicativeExpression1760);
                                    DIV119_tree = (Object) adaptor.create(DIV119);
                                    root_0 = (Object) adaptor.becomeRoot(DIV119_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:14: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt65 = 2;
                                    int LA65_0 = input.LA(1);

                                    if ((LA65_0 == LINE_BREAK)) {
                                        alt65 = 1;
                                    }
                                    switch (alt65) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:389:37: LINE_BREAK
                                        {
                                            LINE_BREAK120 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_multiplicativeExpression1773);

                                        }
                                        break;

                                    }


                                }
                                break;
                                case 3:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:7: MOD ( options {greedy=true; } : LINE_BREAK )?
                                {
                                    MOD121 = (Token) input.LT(1);
                                    match(input, MOD, FOLLOW_MOD_in_multiplicativeExpression1784);
                                    MOD121_tree = (Object) adaptor.create(MOD121);
                                    root_0 = (Object) adaptor.becomeRoot(MOD121_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:14: ( options {greedy=true; } : LINE_BREAK )?
                                    int alt66 = 2;
                                    int LA66_0 = input.LA(1);

                                    if ((LA66_0 == LINE_BREAK)) {
                                        alt66 = 1;
                                    }
                                    switch (alt66) {
                                        case 1:
                                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:390:37: LINE_BREAK
                                        {
                                            LINE_BREAK122 = (Token) input.LT(1);
                                            match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_multiplicativeExpression1797);

                                        }
                                        break;

                                    }


                                }
                                break;

                            }

                            pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression1812);
                            powerExpression123 = powerExpression();
                            _fsp--;

                            adaptor.addChild(root_0, powerExpression123.getTree());

                        }
                        break;

                        default:
                            break loop68;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpression

    public static class powerExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start powerExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:398:1: powerExpression : bnotExpression ( options {greedy=true; } : POWER ( options {greedy=true; } : LINE_BREAK )? bnotExpression )* ;
    public final powerExpression_return powerExpression() throws RecognitionException {
        powerExpression_return retval = new powerExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token POWER125 = null;
        Token LINE_BREAK126 = null;
        bnotExpression_return bnotExpression124 = null;

        bnotExpression_return bnotExpression127 = null;


        Object POWER125_tree = null;
        Object LINE_BREAK126_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:5: ( bnotExpression ( options {greedy=true; } : POWER ( options {greedy=true; } : LINE_BREAK )? bnotExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:399:5: bnotExpression ( options {greedy=true; } : POWER ( options {greedy=true; } : LINE_BREAK )? bnotExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_bnotExpression_in_powerExpression1833);
                bnotExpression124 = bnotExpression();
                _fsp--;

                adaptor.addChild(root_0, bnotExpression124.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:400:4: ( options {greedy=true; } : POWER ( options {greedy=true; } : LINE_BREAK )? bnotExpression )*
                loop70:
                do {
                    int alt70 = 2;
                    int LA70_0 = input.LA(1);

                    if ((LA70_0 == POWER)) {
                        alt70 = 1;
                    }


                    switch (alt70) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:5: POWER ( options {greedy=true; } : LINE_BREAK )? bnotExpression
                        {
                            POWER125 = (Token) input.LT(1);
                            match(input, POWER, FOLLOW_POWER_in_powerExpression1852);
                            POWER125_tree = (Object) adaptor.create(POWER125);
                            root_0 = (Object) adaptor.becomeRoot(POWER125_tree, root_0);

                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:14: ( options {greedy=true; } : LINE_BREAK )?
                            int alt69 = 2;
                            int LA69_0 = input.LA(1);

                            if ((LA69_0 == LINE_BREAK)) {
                                alt69 = 1;
                            }
                            switch (alt69) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:401:37: LINE_BREAK
                                {
                                    LINE_BREAK126 = (Token) input.LT(1);
                                    match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_powerExpression1865);

                                }
                                break;

                            }

                            pushFollow(FOLLOW_bnotExpression_in_powerExpression1874);
                            bnotExpression127 = bnotExpression();
                            _fsp--;

                            adaptor.addChild(root_0, bnotExpression127.getTree());

                        }
                        break;

                        default:
                            break loop70;
                    }
                } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end powerExpression

    public static class bnotExpression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start bnotExpression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:407:1: bnotExpression : ( BNOT ( options {greedy=true; } : LINE_BREAK )? | NOT ( options {greedy=true; } : LINE_BREAK )? )* command ;
    public final bnotExpression_return bnotExpression() throws RecognitionException {
        bnotExpression_return retval = new bnotExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BNOT128 = null;
        Token LINE_BREAK129 = null;
        Token NOT130 = null;
        Token LINE_BREAK131 = null;
        command_return command132 = null;


        Object BNOT128_tree = null;
        Object LINE_BREAK129_tree = null;
        Object NOT130_tree = null;
        Object LINE_BREAK131_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:5: ( ( BNOT ( options {greedy=true; } : LINE_BREAK )? | NOT ( options {greedy=true; } : LINE_BREAK )? )* command )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:5: ( BNOT ( options {greedy=true; } : LINE_BREAK )? | NOT ( options {greedy=true; } : LINE_BREAK )? )* command
            {
                root_0 = (Object) adaptor.nil();

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:5: ( BNOT ( options {greedy=true; } : LINE_BREAK )? | NOT ( options {greedy=true; } : LINE_BREAK )? )*
                loop73:
                do {
                    int alt73 = 3;
                    int LA73_0 = input.LA(1);

                    if ((LA73_0 == BNOT)) {
                        alt73 = 1;
                    } else if ((LA73_0 == NOT)) {
                        alt73 = 2;
                    }


                    switch (alt73) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:7: BNOT ( options {greedy=true; } : LINE_BREAK )?
                        {
                            BNOT128 = (Token) input.LT(1);
                            match(input, BNOT, FOLLOW_BNOT_in_bnotExpression1896);
                            BNOT128_tree = (Object) adaptor.create(BNOT128);
                            root_0 = (Object) adaptor.becomeRoot(BNOT128_tree, root_0);

                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:15: ( options {greedy=true; } : LINE_BREAK )?
                            int alt71 = 2;
                            int LA71_0 = input.LA(1);

                            if ((LA71_0 == LINE_BREAK)) {
                                alt71 = 1;
                            }
                            switch (alt71) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:408:38: LINE_BREAK
                                {
                                    LINE_BREAK129 = (Token) input.LT(1);
                                    match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_bnotExpression1909);

                                }
                                break;

                            }


                        }
                        break;
                        case 2:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:6: NOT ( options {greedy=true; } : LINE_BREAK )?
                        {
                            NOT130 = (Token) input.LT(1);
                            match(input, NOT, FOLLOW_NOT_in_bnotExpression1919);
                            NOT130_tree = (Object) adaptor.create(NOT130);
                            root_0 = (Object) adaptor.becomeRoot(NOT130_tree, root_0);

                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:13: ( options {greedy=true; } : LINE_BREAK )?
                            int alt72 = 2;
                            int LA72_0 = input.LA(1);

                            if ((LA72_0 == LINE_BREAK)) {
                                alt72 = 1;
                            }
                            switch (alt72) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:409:36: LINE_BREAK
                                {
                                    LINE_BREAK131 = (Token) input.LT(1);
                                    match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_bnotExpression1932);

                                }
                                break;

                            }


                        }
                        break;

                        default:
                            break loop73;
                    }
                } while (true);

                pushFollow(FOLLOW_command_in_bnotExpression1946);
                command132 = command();
                _fsp--;

                adaptor.addChild(root_0, command132.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end bnotExpression

    public static class command_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start command
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:413:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression );
    public final command_return command() throws RecognitionException {
        command_return retval = new command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133 = null;
        Token string_literal134 = null;
        Token string_literal135 = null;
        Token ID137 = null;
        literal_return literal136 = null;

        boolean_expression_return boolean_expression138 = null;

        block_expression_return block_expression139 = null;

        if_expression_return if_expression140 = null;

        unless_expression_return unless_expression141 = null;


        Object string_literal133_tree = null;
        Object string_literal134_tree = null;
        Object string_literal135_tree = null;
        Object ID137_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:3: ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression )
            int alt74 = 9;
            switch (input.LA(1)) {
                case 120: {
                    alt74 = 1;
                }
                break;
                case 121: {
                    alt74 = 2;
                }
                break;
                case 122: {
                    alt74 = 3;
                }
                break;
                case SYMBOL:
                case INT:
                case FLOAT:
                case ARRAY:
                case HASH:
                case RANGE:
                case REGEX:
                case SINGLE_QUOTE_STRING:
                case DOUBLE_QUOTE_STRING:
                case HEREDOC_BEGIN:
                case HEREDOC_INDENT_STRING: {
                    alt74 = 4;
                }
                break;
                case ID: {
                    alt74 = 5;
                }
                break;
                case 111:
                case 112:
                case 113: {
                    alt74 = 6;
                }
                break;
                case 109: {
                    alt74 = 7;
                }
                break;
                case IF_MODIFIER: {
                    alt74 = 8;
                }
                break;
                case UNLESS_MODIFIER: {
                    alt74 = 9;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("413:1: command : ( 'expression0' | 'expression1' | 'expression2' | literal | ID | boolean_expression | block_expression | if_expression | unless_expression );", 74, 0, input);

                    throw nvae;
            }

            switch (alt74) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:3: 'expression0'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal133 = (Token) input.LT(1);
                    match(input, 120, FOLLOW_120_in_command1956);
                    string_literal133_tree = (Object) adaptor.create(string_literal133);
                    adaptor.addChild(root_0, string_literal133_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:19: 'expression1'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal134 = (Token) input.LT(1);
                    match(input, 121, FOLLOW_121_in_command1960);
                    string_literal134_tree = (Object) adaptor.create(string_literal134);
                    adaptor.addChild(root_0, string_literal134_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:35: 'expression2'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal135 = (Token) input.LT(1);
                    match(input, 122, FOLLOW_122_in_command1964);
                    string_literal135_tree = (Object) adaptor.create(string_literal135);
                    adaptor.addChild(root_0, string_literal135_tree);


                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:49: literal
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_literal_in_command1966);
                    literal136 = literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal136.getTree());

                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:57: ID
                {
                    root_0 = (Object) adaptor.nil();

                    ID137 = (Token) input.LT(1);
                    match(input, ID, FOLLOW_ID_in_command1968);
                    ID137_tree = (Object) adaptor.create(ID137);
                    adaptor.addChild(root_0, ID137_tree);


                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:60: boolean_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_boolean_expression_in_command1970);
                    boolean_expression138 = boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression138.getTree());

                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:80: block_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_block_expression_in_command1973);
                    block_expression139 = block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression139.getTree());

                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:97: if_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_command1975);
                    if_expression140 = if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression140.getTree());

                }
                break;
                case 9:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:414:111: unless_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_unless_expression_in_command1977);
                    unless_expression141 = unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression141.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end command

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start assignment_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:416:1: assignment_expression : lhs '=' rhs ;
    public final assignment_expression_return assignment_expression() throws RecognitionException {
        assignment_expression_return retval = new assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal143 = null;
        lhs_return lhs142 = null;

        rhs_return rhs144 = null;


        Object char_literal143_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:4: ( lhs '=' rhs )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:417:4: lhs '=' rhs
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_lhs_in_assignment_expression1988);
                lhs142 = lhs();
                _fsp--;

                adaptor.addChild(root_0, lhs142.getTree());
                char_literal143 = (Token) input.LT(1);
                match(input, 123, FOLLOW_123_in_assignment_expression1990);
                char_literal143_tree = (Object) adaptor.create(char_literal143);
                root_0 = (Object) adaptor.becomeRoot(char_literal143_tree, root_0);

                pushFollow(FOLLOW_rhs_in_assignment_expression1993);
                rhs144 = rhs();
                _fsp--;

                adaptor.addChild(root_0, rhs144.getTree());
                addVariable(input.toString(lhs142.start, lhs142.stop));

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignment_expression

    public static class lhs_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start lhs
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID145 = null;

        Object ID145_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:7: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:418:7: ID
            {
                root_0 = (Object) adaptor.nil();

                ID145 = (Token) input.LT(1);
                match(input, ID, FOLLOW_ID_in_lhs2002);
                ID145_tree = (Object) adaptor.create(ID145);
                adaptor.addChild(root_0, ID145_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lhs

    public static class rhs_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start rhs
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression146 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:419:7: expression
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_expression_in_rhs2009);
                expression146 = expression();
                _fsp--;

                adaptor.addChild(root_0, expression146.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rhs

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start literal
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT147 = null;
        Token FLOAT148 = null;
        Token ARRAY150 = null;
        Token HASH151 = null;
        Token RANGE152 = null;
        Token SYMBOL153 = null;
        Token REGEX154 = null;
        string_return string149 = null;


        Object INT147_tree = null;
        Object FLOAT148_tree = null;
        Object ARRAY150_tree = null;
        Object HASH151_tree = null;
        Object RANGE152_tree = null;
        Object SYMBOL153_tree = null;
        Object REGEX154_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:11: ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX )
            int alt75 = 8;
            switch (input.LA(1)) {
                case INT: {
                    alt75 = 1;
                }
                break;
                case FLOAT: {
                    alt75 = 2;
                }
                break;
                case SINGLE_QUOTE_STRING:
                case DOUBLE_QUOTE_STRING:
                case HEREDOC_BEGIN:
                case HEREDOC_INDENT_STRING: {
                    alt75 = 3;
                }
                break;
                case ARRAY: {
                    alt75 = 4;
                }
                break;
                case HASH: {
                    alt75 = 5;
                }
                break;
                case RANGE: {
                    alt75 = 6;
                }
                break;
                case SYMBOL: {
                    alt75 = 7;
                }
                break;
                case REGEX: {
                    alt75 = 8;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("423:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );", 75, 0, input);

                    throw nvae;
            }

            switch (alt75) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:11: INT
                {
                    root_0 = (Object) adaptor.nil();

                    INT147 = (Token) input.LT(1);
                    match(input, INT, FOLLOW_INT_in_literal2019);
                    INT147_tree = (Object) adaptor.create(INT147);
                    adaptor.addChild(root_0, INT147_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:15: FLOAT
                {
                    root_0 = (Object) adaptor.nil();

                    FLOAT148 = (Token) input.LT(1);
                    match(input, FLOAT, FOLLOW_FLOAT_in_literal2021);
                    FLOAT148_tree = (Object) adaptor.create(FLOAT148);
                    adaptor.addChild(root_0, FLOAT148_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:21: string
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal2023);
                    string149 = string();
                    _fsp--;

                    adaptor.addChild(root_0, string149.getTree());

                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:28: ARRAY
                {
                    root_0 = (Object) adaptor.nil();

                    ARRAY150 = (Token) input.LT(1);
                    match(input, ARRAY, FOLLOW_ARRAY_in_literal2025);
                    ARRAY150_tree = (Object) adaptor.create(ARRAY150);
                    adaptor.addChild(root_0, ARRAY150_tree);


                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:34: HASH
                {
                    root_0 = (Object) adaptor.nil();

                    HASH151 = (Token) input.LT(1);
                    match(input, HASH, FOLLOW_HASH_in_literal2027);
                    HASH151_tree = (Object) adaptor.create(HASH151);
                    adaptor.addChild(root_0, HASH151_tree);


                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:39: RANGE
                {
                    root_0 = (Object) adaptor.nil();

                    RANGE152 = (Token) input.LT(1);
                    match(input, RANGE, FOLLOW_RANGE_in_literal2029);
                    RANGE152_tree = (Object) adaptor.create(RANGE152);
                    adaptor.addChild(root_0, RANGE152_tree);


                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:45: SYMBOL
                {
                    root_0 = (Object) adaptor.nil();

                    SYMBOL153 = (Token) input.LT(1);
                    match(input, SYMBOL, FOLLOW_SYMBOL_in_literal2031);
                    SYMBOL153_tree = (Object) adaptor.create(SYMBOL153);
                    adaptor.addChild(root_0, SYMBOL153_tree);


                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:423:52: REGEX
                {
                    root_0 = (Object) adaptor.nil();

                    REGEX154 = (Token) input.LT(1);
                    match(input, REGEX, FOLLOW_REGEX_in_literal2033);
                    REGEX154_tree = (Object) adaptor.create(REGEX154);
                    adaptor.addChild(root_0, REGEX154_tree);


                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class string_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start string
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | heredoc_string );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE_STRING155 = null;
        Token DOUBLE_QUOTE_STRING156 = null;
        heredoc_string_return heredoc_string157 = null;


        Object SINGLE_QUOTE_STRING155_tree = null;
        Object DOUBLE_QUOTE_STRING156_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | heredoc_string )
            int alt76 = 3;
            switch (input.LA(1)) {
                case SINGLE_QUOTE_STRING: {
                    alt76 = 1;
                }
                break;
                case DOUBLE_QUOTE_STRING: {
                    alt76 = 2;
                }
                break;
                case HEREDOC_BEGIN:
                case HEREDOC_INDENT_STRING: {
                    alt76 = 3;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("465:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | heredoc_string );", 76, 0, input);

                    throw nvae;
            }

            switch (alt76) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:10: SINGLE_QUOTE_STRING
                {
                    root_0 = (Object) adaptor.nil();

                    SINGLE_QUOTE_STRING155 = (Token) input.LT(1);
                    match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_string2358);
                    SINGLE_QUOTE_STRING155_tree = (Object) adaptor.create(SINGLE_QUOTE_STRING155);
                    adaptor.addChild(root_0, SINGLE_QUOTE_STRING155_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:30: DOUBLE_QUOTE_STRING
                {
                    root_0 = (Object) adaptor.nil();

                    DOUBLE_QUOTE_STRING156 = (Token) input.LT(1);
                    match(input, DOUBLE_QUOTE_STRING, FOLLOW_DOUBLE_QUOTE_STRING_in_string2360);
                    DOUBLE_QUOTE_STRING156_tree = (Object) adaptor.create(DOUBLE_QUOTE_STRING156);
                    adaptor.addChild(root_0, DOUBLE_QUOTE_STRING156_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:465:50: heredoc_string
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_heredoc_string_in_string2362);
                    heredoc_string157 = heredoc_string();
                    _fsp--;

                    adaptor.addChild(root_0, heredoc_string157.getTree());

                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end string

    public static class heredoc_string_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start heredoc_string
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:532:1: heredoc_string : ( HEREDOC_BEGIN HEREDOC_CONTENT | HEREDOC_INDENT_STRING );
    public final heredoc_string_return heredoc_string() throws RecognitionException {
        heredoc_string_return retval = new heredoc_string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HEREDOC_BEGIN158 = null;
        Token HEREDOC_CONTENT159 = null;
        Token HEREDOC_INDENT_STRING160 = null;

        Object HEREDOC_BEGIN158_tree = null;
        Object HEREDOC_CONTENT159_tree = null;
        Object HEREDOC_INDENT_STRING160_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:4: ( HEREDOC_BEGIN HEREDOC_CONTENT | HEREDOC_INDENT_STRING )
            int alt77 = 2;
            int LA77_0 = input.LA(1);

            if ((LA77_0 == HEREDOC_BEGIN)) {
                alt77 = 1;
            } else if ((LA77_0 == HEREDOC_INDENT_STRING)) {
                alt77 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("532:1: heredoc_string : ( HEREDOC_BEGIN HEREDOC_CONTENT | HEREDOC_INDENT_STRING );", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:4: HEREDOC_BEGIN HEREDOC_CONTENT
                {
                    root_0 = (Object) adaptor.nil();

                    HEREDOC_BEGIN158 = (Token) input.LT(1);
                    match(input, HEREDOC_BEGIN, FOLLOW_HEREDOC_BEGIN_in_heredoc_string2706);
                    HEREDOC_BEGIN158_tree = (Object) adaptor.create(HEREDOC_BEGIN158);
                    adaptor.addChild(root_0, HEREDOC_BEGIN158_tree);

                    HEREDOC_CONTENT159 = (Token) input.LT(1);
                    match(input, HEREDOC_CONTENT, FOLLOW_HEREDOC_CONTENT_in_heredoc_string2708);
                    HEREDOC_CONTENT159_tree = (Object) adaptor.create(HEREDOC_CONTENT159);
                    adaptor.addChild(root_0, HEREDOC_CONTENT159_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:533:34: HEREDOC_INDENT_STRING
                {
                    root_0 = (Object) adaptor.nil();

                    HEREDOC_INDENT_STRING160 = (Token) input.LT(1);
                    match(input, HEREDOC_INDENT_STRING, FOLLOW_HEREDOC_INDENT_STRING_in_heredoc_string2710);
                    HEREDOC_INDENT_STRING160_tree = (Object) adaptor.create(HEREDOC_INDENT_STRING160);
                    adaptor.addChild(root_0, HEREDOC_INDENT_STRING160_tree);


                }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end heredoc_string


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA5_eotS =
            "\5\uffff";
    static final String DFA5_eofS =
            "\3\3\2\uffff";
    static final String DFA5_minS =
            "\1\37\2\16\2\uffff";
    static final String DFA5_maxS =
            "\1\163\2\172\2\uffff";
    static final String DFA5_acceptS =
            "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
            "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\115\uffff\1\3\3\uffff\2\3",
            "\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\26\uffff\10\4" +
                    "\14\uffff\2\4\4\uffff\1\4\2\uffff\1\4\26\uffff\1\4\1\3\3\4\2" +
                    "\3\3\uffff\4\4",
            "\1\4\13\uffff\2\4\3\uffff\1\1\1\2\1\uffff\1\4\26\uffff\10\4" +
                    "\14\uffff\2\4\4\uffff\1\4\2\uffff\1\4\26\uffff\1\4\1\3\3\4\2" +
                    "\3\3\uffff\4\4",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }

        public String getDescription() {
            return "()* loopback of 176:15: ( ( terminal )+ statement )*";
        }
    }

    static final String DFA17_eotS =
            "\5\uffff";
    static final String DFA17_eofS =
            "\5\uffff";
    static final String DFA17_minS =
            "\1\40\1\16\3\uffff";
    static final String DFA17_maxS =
            "\1\164\1\172\3\uffff";
    static final String DFA17_acceptS =
            "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
            "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\112\uffff\1\2\10\uffff\1\3",
            "\1\4\13\uffff\2\4\3\uffff\1\4\1\1\1\uffff\1\4\26\uffff\10\4" +
                    "\14\uffff\2\4\4\uffff\1\4\2\uffff\1\4\26\uffff\7\4\1\3\2\uffff" +
                    "\4\4",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }

        public String getDescription() {
            return "218:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }


    public static final BitSet FOLLOW_terminal_in_program196 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_statement_list_in_program200 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_terminal_in_program202 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_statement_in_statement_list216 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list219 = new BitSet(new long[]{0xFE0000058C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_statement_in_statement_list222 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_expression_in_statement248 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement251 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_set_in_modifier_line291 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_line_break_in_modifier_line305 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_expression_in_modifier_line309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_block_expression384 = new BitSet(new long[]{0xFE0000048C004000L, 0x0783E00000486001L});
    public static final BitSet FOLLOW_body_in_block_expression386 = new BitSet(new long[]{0x0000000000000000L, 0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_block_expression388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body395 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_statement_list_in_body399 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_terminal_in_body401 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression424 = new BitSet(new long[]{0xFE0000040C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_expression_in_if_expression429 = new BitSet(new long[]{0x0000000100000000L, 0x0010080000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression431 = new BitSet(new long[]{0xFE0000048C004000L, 0x078FE00000486001L});
    public static final BitSet FOLLOW_body_in_if_expression444 = new BitSet(new long[]{0x0000000000000000L, 0x000C400000000000L});
    public static final BitSet FOLLOW_114_in_if_expression447 = new BitSet(new long[]{0xFE0000040C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_expression_in_if_expression451 = new BitSet(new long[]{0x0000000100000000L, 0x0010080000000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression453 = new BitSet(new long[]{0xFE0000048C004000L, 0x078FE00000486001L});
    public static final BitSet FOLLOW_body_in_if_expression457 = new BitSet(new long[]{0x0000000000000000L, 0x000C400000000000L});
    public static final BitSet FOLLOW_115_in_if_expression471 = new BitSet(new long[]{0xFE0000048C004000L, 0x0783E00000486001L});
    public static final BitSet FOLLOW_body_in_if_expression475 = new BitSet(new long[]{0x0000000000000000L, 0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_if_expression488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator540 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COLON_in_seperator543 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator545 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator550 = new BitSet(new long[]{0x0000000100000000L, 0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_seperator553 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator555 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression565 = new BitSet(new long[]{0x0000000000000000L, 0x0003800000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression567 = new BitSet(new long[]{0x0000000100000000L, 0x0010080000000000L});
    public static final BitSet FOLLOW_116_in_unless_expression570 = new BitSet(new long[]{0xFE0000048C004000L, 0x078BE00000486001L});
    public static final BitSet FOLLOW_COLON_in_unless_expression572 = new BitSet(new long[]{0xFE0000048C004000L, 0x078BE00000486001L});
    public static final BitSet FOLLOW_line_break_in_unless_expression574 = new BitSet(new long[]{0xFE0000048C004000L, 0x078BE00000486001L});
    public static final BitSet FOLLOW_body_in_unless_expression586 = new BitSet(new long[]{0x0000000000000000L, 0x0008400000000000L});
    public static final BitSet FOLLOW_115_in_unless_expression599 = new BitSet(new long[]{0xFE0000048C004000L, 0x0783E00000486001L});
    public static final BitSet FOLLOW_body_in_unless_expression601 = new BitSet(new long[]{0x0000000000000000L, 0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_unless_expression614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression730 = new BitSet(new long[]{0x0000000000000002L, 0x0060000000000000L});
    public static final BitSet FOLLOW_117_in_andorExpression740 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression745 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_118_in_andorExpression756 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression761 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression776 = new BitSet(new long[]{0x0000000000000002L, 0x0060000000000000L});
    public static final BitSet FOLLOW_119_in_notExpression794 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression801 = new BitSet(new long[]{0xFE0000050C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_notExpression_in_notExpression809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_notExpression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpression_in_ternaryIfThenElseExpression827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression841 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_INCLUSIVE_RANGE_in_rangeExpression862 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression873 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_EXCLUSIVE_RANGE_in_rangeExpression884 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_rangeExpression895 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_logicalOrExpression_in_rangeExpression910 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression930 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_logicalOrExpression949 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalOrExpression961 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression970 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression990 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_logicalAndExpression1009 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_logicalAndExpression1021 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression1030 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1050 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_COMPARE_in_equalityExpression1071 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1083 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpression1094 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1107 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_CASE_EQUAL_in_equalityExpression1118 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1129 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_equalityExpression1140 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1152 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_MATCH_in_equalityExpression1163 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1176 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_NOT_MATCH_in_equalityExpression1187 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_equalityExpression1199 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1214 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1235 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_relationalExpression1256 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1269 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_GREATER_THAN_in_relationalExpression1280 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1292 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_relationalExpression1303 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1315 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_relationalExpression1326 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_relationalExpression1337 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_orExpression_in_relationalExpression1352 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1372 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_BXOR_in_orExpression1393 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1406 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_BOR_in_orExpression1417 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_orExpression1430 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1445 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1465 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_BAND_in_andExpression1484 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andExpression1497 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_shiftExpression_in_andExpression1506 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1528 = new BitSet(new long[]{0x0010000000001002L});
    public static final BitSet FOLLOW_LEFT_SHIFT_in_shiftExpression1549 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1561 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_RIGHT_SHIFT_in_shiftExpression1572 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_shiftExpression1583 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1598 = new BitSet(new long[]{0x0010000000001002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1620 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression1641 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1655 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression1666 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_additiveExpression1680 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1695 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression1715 = new BitSet(new long[]{0x0080000003000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeExpression1736 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1749 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression1760 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1773 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeExpression1784 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_multiplicativeExpression1797 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression1812 = new BitSet(new long[]{0x0080000003000002L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression1833 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_POWER_in_powerExpression1852 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_powerExpression1865 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_bnotExpression_in_powerExpression1874 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_BNOT_in_bnotExpression1896 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression1909 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_NOT_in_bnotExpression1919 = new BitSet(new long[]{0xFE0000050C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_LINE_BREAK_in_bnotExpression1932 = new BitSet(new long[]{0xFE0000040C004000L, 0x0703A00000486001L});
    public static final BitSet FOLLOW_command_in_bnotExpression1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_command1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_command1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_command1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_command1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_command1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_command1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_command1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_command1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignment_expression1988 = new BitSet(new long[]{0x0000000000000000L, 0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_assignment_expression1990 = new BitSet(new long[]{0xFE0000040C004000L, 0x0783A00000486001L});
    public static final BitSet FOLLOW_rhs_in_assignment_expression1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_literal2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_string2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_in_string2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_heredoc_string_in_string2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_BEGIN_in_heredoc_string2706 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_HEREDOC_CONTENT_in_heredoc_string2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEREDOC_INDENT_STRING_in_heredoc_string2710 = new BitSet(new long[]{0x0000000000000002L});

}