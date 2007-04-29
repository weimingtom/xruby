// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-04-29 16:07:09

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "INT", "NUMBER", "ARRAY", "HASH", "RANGE", "REGEX", "OCTAL", "DECIMAL", "HEX", "BINARY", "ESCAPE_INT", "HEX_PART", "CONTROL_PART", "META_PART", "NON_LEADING0_NUMBER", "EXP_PART", "LEADING0_NUMBER", "FLOAT", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "HEREDOC_STRING", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "':'", "'then'", "'expression0'", "'expression1'", "'expression2'", "'='"
    };
    public static final int SINGLETON_METHOD = 20;
    public static final int STATEMENT_LIST = 4;
    public static final int STATEMENT = 5;
    public static final int ESCAPE_INT = 41;
    public static final int ARRAY = 33;
    public static final int HASH = 34;
    public static final int HEX_PART = 42;
    public static final int NUMBER = 32;
    public static final int FLOAT = 48;
    public static final int OCTAL = 37;
    public static final int META_PART = 44;
    public static final int LEADING0_NUMBER = 47;
    public static final int DECIMAL = 38;
    public static final int BINARY = 40;
    public static final int BLOCK = 13;
    public static final int UNTIL_MODIFIER = 25;
    public static final int LINE_BREAK = 28;
    public static final int INT = 31;
    public static final int IF_MODIFIER = 22;
    public static final int MULTIPLE_ASSIGN = 14;
    public static final int REGEX = 36;
    public static final int SYMBOL = 12;
    public static final int CONTROL_PART = 43;
    public static final int DOUBLE_QUOTE_STRING = 50;
    public static final int BODY = 9;
    public static final int UNLESS_MODIFIER = 23;
    public static final int HEREDOC_STRING = 51;
    public static final int ID = 30;
    public static final int RANGE = 35;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA = 17;
    public static final int WS = 29;
    public static final int STRING = 21;
    public static final int NESTED_LHS = 19;
    public static final int NON_LEADING0_NUMBER = 45;
    public static final int SINGLE_QUOTE_STRING = 49;
    public static final int WHILE_MODIFIER = 24;
    public static final int EXP_PART = 46;
    public static final int SEMI = 27;
    public static final int MRHS = 18;
    public static final int BLOCK_ARG = 16;
    public static final int IF = 7;
    public static final int ARG = 11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA = 15;
    public static final int EOF = -1;
    public static final int CALL = 10;
    public static final int RESCUE_MODIFIER = 26;
    public static final int MODIFIER_LINE = 6;
    public static final int RPAREN_IN_METHOD_DEFINATION = 8;
    public static final int HEX = 39;

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


    public static class program_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start program
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:86:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3 = 2;
            int LA3_0 = input.LA(1);

            if ((LA3_0 == EOF || (LA3_0 >= SEMI && LA3_0 <= LINE_BREAK))) {
                alt3 = 1;
            } else
            if (((LA3_0 >= IF_MODIFIER && LA3_0 <= UNLESS_MODIFIER) || (LA3_0 >= ID && LA3_0 <= INT) || LA3_0 == 52 || (LA3_0 >= 54 && LA3_0 <= 56) || (LA3_0 >= 61 && LA3_0 <= 63))) {
                alt3 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("86:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:19: ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:19: ( terminal )*
                    loop1:
                    do {
                        int alt1 = 2;
                        int LA1_0 = input.LA(1);

                        if (((LA1_0 >= SEMI && LA1_0 <= LINE_BREAK))) {
                            alt1 = 1;
                        }


                        switch (alt1) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:19: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program159);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:30: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program163);
                    statement_list2 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:45: ( terminal )*
                    loop2:
                    do {
                        int alt2 = 2;
                        int LA2_0 = input.LA(1);

                        if (((LA2_0 >= SEMI && LA2_0 <= LINE_BREAK))) {
                            alt2 = 1;
                        }


                        switch (alt2) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:87:45: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program165);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:90:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:5: statement ( ( terminal )+ statement )*
            {
                pushFollow(FOLLOW_statement_in_statement_list179);
                statement4 = statement();
                _fsp--;

                list_statement.add(statement4.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:15: ( ( terminal )+ statement )*
                loop5:
                do {
                    int alt5 = 2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:16: ( terminal )+ statement
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:16: ( terminal )+
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
                                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:16: terminal
                                    {
                                        pushFollow(FOLLOW_terminal_in_statement_list182);
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

                            pushFollow(FOLLOW_statement_in_statement_list185);
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
                // 91:38: -> ^( STATEMENT_LIST ( statement )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:41: ^( STATEMENT_LIST ( statement )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:91:58: ( statement )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:98:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line = new ArrayList();
        List list_expression = new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:99:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:99:4: expression ( modifier_line )*
            {
                pushFollow(FOLLOW_expression_in_statement211);
                expression7 = expression();
                _fsp--;

                list_expression.add(expression7.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:99:15: ( modifier_line )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if (((LA6_0 >= IF_MODIFIER && LA6_0 <= RESCUE_MODIFIER))) {
                        alt6 = 1;
                    }


                    switch (alt6) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:99:16: modifier_line
                        {
                            pushFollow(FOLLOW_modifier_line_in_statement214);
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
                // 99:33: -> ^( STATEMENT expression ( modifier_line )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:99:36: ^( STATEMENT expression ( modifier_line )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                        adaptor.addChild(root_1, list_expression.get(i_0));
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:99:59: ( modifier_line )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:102:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9 = null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:103:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:103:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                    recoverFromMismatchedSet(input, mse, FOLLOW_set_in_modifier_line254);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:103:80: ( line_break )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if ((LA7_0 == LINE_BREAK)) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:103:81: line_break
                        {
                            pushFollow(FOLLOW_line_break_in_modifier_line268);
                            line_break10 = line_break();
                            _fsp--;

                            adaptor.addChild(root_0, line_break10.getTree());

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);

                pushFollow(FOLLOW_expression_in_modifier_line272);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:121:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:4: 'begin' body 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal12 = (Token) input.LT(1);
                match(input, 52, FOLLOW_52_in_block_expression347);
                string_literal12_tree = (Object) adaptor.create(string_literal12);
                adaptor.addChild(root_0, string_literal12_tree);

                pushFollow(FOLLOW_body_in_block_expression349);
                body13 = body();
                _fsp--;

                adaptor.addChild(root_0, body13.getTree());
                string_literal14 = (Token) input.LT(1);
                match(input, 53, FOLLOW_53_in_block_expression351);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15 = null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10 = 2;
            int LA10_0 = input.LA(1);

            if ((LA10_0 == SEMI || LA10_0 == 53 || (LA10_0 >= 57 && LA10_0 <= 58))) {
                alt10 = 1;
            } else
            if (((LA10_0 >= IF_MODIFIER && LA10_0 <= UNLESS_MODIFIER) || (LA10_0 >= ID && LA10_0 <= INT) || LA10_0 == 52 || (LA10_0 >= 54 && LA10_0 <= 56) || (LA10_0 >= 61 && LA10_0 <= 63))) {
                alt10 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("123:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:8: ( SEMI )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);

                        if ((LA8_0 == SEMI)) {
                            alt8 = 1;
                        }


                        switch (alt8) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:8: SEMI
                            {
                                SEMI15 = (Token) input.LT(1);
                                match(input, SEMI, FOLLOW_SEMI_in_body358);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:15: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body362);
                    statement_list16 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:30: ( terminal )*
                    loop9:
                    do {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);

                        if (((LA9_0 >= SEMI && LA9_0 <= LINE_BREAK))) {
                            alt9 = 1;
                        }


                        switch (alt9) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:123:30: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_body364);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:124:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18 = null;

        Object set18_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:125:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set18 = (Token) input.LT(1);
                if ((input.LA(1) >= 54 && input.LA(1) <= 56)) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:126:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        List list_57 = new ArrayList();
        List list_IF_MODIFIER = new ArrayList();
        List list_58 = new ArrayList();
        List list_53 = new ArrayList();
        Object string_literal19_tree = null;
        Object string_literal21_tree = null;
        Object string_literal23_tree = null;
        Object string_literal24_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:127:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:127:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
                string_literal19 = (Token) input.LT(1);
                match(input, IF_MODIFIER, FOLLOW_IF_MODIFIER_in_if_expression387);
                list_IF_MODIFIER.add(string_literal19);

                pushFollow(FOLLOW_expression_in_if_expression392);
                e0 = expression();
                _fsp--;

                list_expression.add(e0.getTree());
                pushFollow(FOLLOW_seperator_in_if_expression394);
                seperator20 = seperator();
                _fsp--;

                list_seperator.add(seperator20.getTree());
                pushFollow(FOLLOW_body_in_if_expression407);
                body0 = body();
                _fsp--;

                list_body.add(body0.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:128:21: ( 'elsif' e1= expression seperator body1+= body )*
                loop11:
                do {
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);

                    if ((LA11_0 == 57)) {
                        alt11 = 1;
                    }


                    switch (alt11) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:128:22: 'elsif' e1= expression seperator body1+= body
                        {
                            string_literal21 = (Token) input.LT(1);
                            match(input, 57, FOLLOW_57_in_if_expression410);
                            list_57.add(string_literal21);

                            pushFollow(FOLLOW_expression_in_if_expression414);
                            e1 = expression();
                            _fsp--;

                            list_expression.add(e1.getTree());
                            pushFollow(FOLLOW_seperator_in_if_expression416);
                            seperator22 = seperator();
                            _fsp--;

                            list_seperator.add(seperator22.getTree());
                            pushFollow(FOLLOW_body_in_if_expression420);
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

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:129:10: ( 'else' body2= body )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);

                if ((LA12_0 == 58)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:129:11: 'else' body2= body
                    {
                        string_literal23 = (Token) input.LT(1);
                        match(input, 58, FOLLOW_58_in_if_expression434);
                        list_58.add(string_literal23);

                        pushFollow(FOLLOW_body_in_if_expression438);
                        body2 = body();
                        _fsp--;

                        list_body.add(body2.getTree());

                    }
                    break;

                }

                string_literal24 = (Token) input.LT(1);
                match(input, 53, FOLLOW_53_in_if_expression451);
                list_53.add(string_literal24);

                // AST REWRITE
                int i_0 = 0;
                retval.tree = root_0;
                root_0 = (Object) adaptor.nil();
                // 130:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, e0.tree);
                        adaptor.addChild(root_1, body0.tree);
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:35: ( $e1)*
                        {
                            int n_1 = e1 == null ? 0 : 1;


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, e1.tree);

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:40: ( $body1)*
                        {
                            int n_1 = list_body1 == null ? 0 : list_body1.size();


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, ((ParserRuleReturnScope) list_body1.get(i_1)).getTree());

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:48: ( $body2)?
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:133:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17 = 3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:3: ( LINE_BREAK )+
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:3: ( LINE_BREAK )+
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
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:3: LINE_BREAK
                            {
                                LINE_BREAK25 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator503);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:15: ':' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    char_literal26 = (Token) input.LT(1);
                    match(input, 59, FOLLOW_59_in_seperator506);
                    char_literal26_tree = (Object) adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);

                        if ((LA14_0 == LINE_BREAK)) {
                            alt14 = 1;
                        }


                        switch (alt14) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:19: LINE_BREAK
                            {
                                LINE_BREAK27 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator508);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);

                        if ((LA15_0 == LINE_BREAK)) {
                            alt15 = 1;
                        }


                        switch (alt15) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:33: LINE_BREAK
                            {
                                LINE_BREAK28 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator513);
                                LINE_BREAK28_tree = (Object) adaptor.create(LINE_BREAK28);
                                adaptor.addChild(root_0, LINE_BREAK28_tree);


                            }
                            break;

                            default:
                                break loop15;
                        }
                    } while (true);

                    string_literal29 = (Token) input.LT(1);
                    match(input, 60, FOLLOW_60_in_seperator516);
                    string_literal29_tree = (Object) adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16 = 2;
                        int LA16_0 = input.LA(1);

                        if ((LA16_0 == LINE_BREAK)) {
                            alt16 = 1;
                        }


                        switch (alt16) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:52: LINE_BREAK
                            {
                                LINE_BREAK30 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator518);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:135:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:136:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:136:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal31 = (Token) input.LT(1);
                match(input, UNLESS_MODIFIER, FOLLOW_UNLESS_MODIFIER_in_unless_expression528);
                string_literal31_tree = (Object) adaptor.create(string_literal31);
                adaptor.addChild(root_0, string_literal31_tree);

                pushFollow(FOLLOW_boolean_expression_in_unless_expression530);
                boolean_expression32 = boolean_expression();
                _fsp--;

                adaptor.addChild(root_0, boolean_expression32.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:136:32: ( 'then' | ':' | line_break )
                int alt18 = 3;
                switch (input.LA(1)) {
                    case 60: {
                        alt18 = 1;
                    }
                    break;
                    case 59: {
                        alt18 = 2;
                    }
                    break;
                    case LINE_BREAK: {
                        alt18 = 3;
                    }
                    break;
                    default:
                        NoViableAltException nvae =
                                new NoViableAltException("136:32: ( 'then' | ':' | line_break )", 18, 0, input);

                        throw nvae;
                }

                switch (alt18) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:136:33: 'then'
                    {
                        string_literal33 = (Token) input.LT(1);
                        match(input, 60, FOLLOW_60_in_unless_expression533);
                        string_literal33_tree = (Object) adaptor.create(string_literal33);
                        adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:136:40: ':'
                    {
                        char_literal34 = (Token) input.LT(1);
                        match(input, 59, FOLLOW_59_in_unless_expression535);
                        char_literal34_tree = (Object) adaptor.create(char_literal34);
                        adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:136:44: line_break
                    {
                        pushFollow(FOLLOW_line_break_in_unless_expression537);
                        line_break35 = line_break();
                        _fsp--;

                        adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

                }

                pushFollow(FOLLOW_body_in_unless_expression549);
                body36 = body();
                _fsp--;

                adaptor.addChild(root_0, body36.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:138:10: ( 'else' body )?
                int alt19 = 2;
                int LA19_0 = input.LA(1);

                if ((LA19_0 == 58)) {
                    alt19 = 1;
                }
                switch (alt19) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:138:11: 'else' body
                    {
                        string_literal37 = (Token) input.LT(1);
                        match(input, 58, FOLLOW_58_in_unless_expression562);
                        string_literal37_tree = (Object) adaptor.create(string_literal37);
                        adaptor.addChild(root_0, string_literal37_tree);

                        pushFollow(FOLLOW_body_in_unless_expression564);
                        body38 = body();
                        _fsp--;

                        adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

                }

                string_literal39 = (Token) input.LT(1);
                match(input, 53, FOLLOW_53_in_unless_expression577);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:140:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40 = null;
        line_break_return line_break41 = null;


        Object SEMI40_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:140:11: ( SEMI | line_break )
            int alt20 = 2;
            int LA20_0 = input.LA(1);

            if ((LA20_0 == SEMI)) {
                alt20 = 1;
            } else if ((LA20_0 == LINE_BREAK)) {
                alt20 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("140:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:140:11: SEMI
                {
                    root_0 = (Object) adaptor.nil();

                    SEMI40 = (Token) input.LT(1);
                    match(input, SEMI, FOLLOW_SEMI_in_terminal583);

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:140:17: line_break
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal586);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:141:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42 = null;

        Object LINE_BREAK42_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:142:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:142:5: LINE_BREAK
            {
                root_0 = (Object) adaptor.nil();

                LINE_BREAK42 = (Token) input.LT(1);
                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_line_break596);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:1: expression : ( 'expression0' | 'expression1' | 'expression2' | INT | ID | boolean_expression | block_expression | if_expression | unless_expression | assignment_expression );
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43 = null;
        Token string_literal44 = null;
        Token string_literal45 = null;
        Token INT46 = null;
        Token ID47 = null;
        boolean_expression_return boolean_expression48 = null;

        block_expression_return block_expression49 = null;

        if_expression_return if_expression50 = null;

        unless_expression_return unless_expression51 = null;

        assignment_expression_return assignment_expression52 = null;


        Object string_literal43_tree = null;
        Object string_literal44_tree = null;
        Object string_literal45_tree = null;
        Object INT46_tree = null;
        Object ID47_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:4: ( 'expression0' | 'expression1' | 'expression2' | INT | ID | boolean_expression | block_expression | if_expression | unless_expression | assignment_expression )
            int alt21 = 10;
            switch (input.LA(1)) {
                case 61: {
                    alt21 = 1;
                }
                break;
                case 62: {
                    alt21 = 2;
                }
                break;
                case 63: {
                    alt21 = 3;
                }
                break;
                case INT: {
                    alt21 = 4;
                }
                break;
                case ID: {
                    int LA21_5 = input.LA(2);

                    if ((LA21_5 == EOF || (LA21_5 >= IF_MODIFIER && LA21_5 <= LINE_BREAK) || LA21_5 == 53 || (LA21_5 >= 57 && LA21_5 <= 60))) {
                        alt21 = 5;
                    } else if ((LA21_5 == 64)) {
                        alt21 = 10;
                    } else {
                        NoViableAltException nvae =
                                new NoViableAltException("153:1: expression : ( 'expression0' | 'expression1' | 'expression2' | INT | ID | boolean_expression | block_expression | if_expression | unless_expression | assignment_expression );", 21, 5, input);

                        throw nvae;
                    }
                }
                break;
                case 54:
                case 55:
                case 56: {
                    alt21 = 6;
                }
                break;
                case 52: {
                    alt21 = 7;
                }
                break;
                case IF_MODIFIER: {
                    alt21 = 8;
                }
                break;
                case UNLESS_MODIFIER: {
                    alt21 = 9;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("153:1: expression : ( 'expression0' | 'expression1' | 'expression2' | INT | ID | boolean_expression | block_expression | if_expression | unless_expression | assignment_expression );", 21, 0, input);

                    throw nvae;
            }

            switch (alt21) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:4: 'expression0'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal43 = (Token) input.LT(1);
                    match(input, 61, FOLLOW_61_in_expression680);
                    string_literal43_tree = (Object) adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:20: 'expression1'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal44 = (Token) input.LT(1);
                    match(input, 62, FOLLOW_62_in_expression684);
                    string_literal44_tree = (Object) adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:36: 'expression2'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal45 = (Token) input.LT(1);
                    match(input, 63, FOLLOW_63_in_expression688);
                    string_literal45_tree = (Object) adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);


                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:50: INT
                {
                    root_0 = (Object) adaptor.nil();

                    INT46 = (Token) input.LT(1);
                    match(input, INT, FOLLOW_INT_in_expression690);
                    INT46_tree = (Object) adaptor.create(INT46);
                    adaptor.addChild(root_0, INT46_tree);


                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:54: ID
                {
                    root_0 = (Object) adaptor.nil();

                    ID47 = (Token) input.LT(1);
                    match(input, ID, FOLLOW_ID_in_expression692);
                    ID47_tree = (Object) adaptor.create(ID47);
                    adaptor.addChild(root_0, ID47_tree);


                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:57: boolean_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_boolean_expression_in_expression694);
                    boolean_expression48 = boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression48.getTree());

                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:77: block_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_block_expression_in_expression697);
                    block_expression49 = block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression49.getTree());

                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:94: if_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_expression699);
                    if_expression50 = if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression50.getTree());

                }
                break;
                case 9:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:108: unless_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_unless_expression_in_expression701);
                    unless_expression51 = unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression51.getTree());

                }
                break;
                case 10:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:126: assignment_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_assignment_expression_in_expression703);
                    assignment_expression52 = assignment_expression();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_expression52.getTree());

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

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start assignment_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:1: assignment_expression : lvalue '=' rvalue ;
    public final assignment_expression_return assignment_expression() throws RecognitionException {
        assignment_expression_return retval = new assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54 = null;
        lvalue_return lvalue53 = null;

        rvalue_return rvalue55 = null;


        Object char_literal54_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:4: ( lvalue '=' rvalue )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:4: lvalue '=' rvalue
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_lvalue_in_assignment_expression711);
                lvalue53 = lvalue();
                _fsp--;

                adaptor.addChild(root_0, lvalue53.getTree());
                char_literal54 = (Token) input.LT(1);
                match(input, 64, FOLLOW_64_in_assignment_expression713);
                char_literal54_tree = (Object) adaptor.create(char_literal54);
                adaptor.addChild(root_0, char_literal54_tree);

                pushFollow(FOLLOW_rvalue_in_assignment_expression715);
                rvalue55 = rvalue();
                _fsp--;

                adaptor.addChild(root_0, rvalue55.getTree());

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

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start lvalue
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:1: lvalue : ID ;
    public final lvalue_return lvalue() throws RecognitionException {
        lvalue_return retval = new lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID56 = null;

        Object ID56_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:10: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:10: ID
            {
                root_0 = (Object) adaptor.nil();

                ID56 = (Token) input.LT(1);
                match(input, ID, FOLLOW_ID_in_lvalue722);
                ID56_tree = (Object) adaptor.create(ID56);
                adaptor.addChild(root_0, ID56_tree);


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
    // $ANTLR end lvalue

    public static class rvalue_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start rvalue
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:1: rvalue : expression ;
    public final rvalue_return rvalue() throws RecognitionException {
        rvalue_return retval = new rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression57 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:10: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:10: expression
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_expression_in_rvalue729);
                expression57 = expression();
                _fsp--;

                adaptor.addChild(root_0, expression57.getTree());

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
    // $ANTLR end rvalue

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start literal
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:1: literal : ( NUMBER | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER58 = null;
        Token ARRAY60 = null;
        Token HASH61 = null;
        Token RANGE62 = null;
        Token SYMBOL63 = null;
        Token REGEX64 = null;
        string_return string59 = null;


        Object NUMBER58_tree = null;
        Object ARRAY60_tree = null;
        Object HASH61_tree = null;
        Object RANGE62_tree = null;
        Object SYMBOL63_tree = null;
        Object REGEX64_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:11: ( NUMBER | string | ARRAY | HASH | RANGE | SYMBOL | REGEX )
            int alt22 = 7;
            switch (input.LA(1)) {
                case NUMBER: {
                    alt22 = 1;
                }
                break;
                case SINGLE_QUOTE_STRING:
                case DOUBLE_QUOTE_STRING: {
                    alt22 = 2;
                }
                break;
                case ARRAY: {
                    alt22 = 3;
                }
                break;
                case HASH: {
                    alt22 = 4;
                }
                break;
                case RANGE: {
                    alt22 = 5;
                }
                break;
                case SYMBOL: {
                    alt22 = 6;
                }
                break;
                case REGEX: {
                    alt22 = 7;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("160:1: literal : ( NUMBER | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );", 22, 0, input);

                    throw nvae;
            }

            switch (alt22) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:11: NUMBER
                {
                    root_0 = (Object) adaptor.nil();

                    NUMBER58 = (Token) input.LT(1);
                    match(input, NUMBER, FOLLOW_NUMBER_in_literal737);
                    NUMBER58_tree = (Object) adaptor.create(NUMBER58);
                    adaptor.addChild(root_0, NUMBER58_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:18: string
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal739);
                    string59 = string();
                    _fsp--;

                    adaptor.addChild(root_0, string59.getTree());

                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:25: ARRAY
                {
                    root_0 = (Object) adaptor.nil();

                    ARRAY60 = (Token) input.LT(1);
                    match(input, ARRAY, FOLLOW_ARRAY_in_literal741);
                    ARRAY60_tree = (Object) adaptor.create(ARRAY60);
                    adaptor.addChild(root_0, ARRAY60_tree);


                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:31: HASH
                {
                    root_0 = (Object) adaptor.nil();

                    HASH61 = (Token) input.LT(1);
                    match(input, HASH, FOLLOW_HASH_in_literal743);
                    HASH61_tree = (Object) adaptor.create(HASH61);
                    adaptor.addChild(root_0, HASH61_tree);


                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:36: RANGE
                {
                    root_0 = (Object) adaptor.nil();

                    RANGE62 = (Token) input.LT(1);
                    match(input, RANGE, FOLLOW_RANGE_in_literal745);
                    RANGE62_tree = (Object) adaptor.create(RANGE62);
                    adaptor.addChild(root_0, RANGE62_tree);


                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:42: SYMBOL
                {
                    root_0 = (Object) adaptor.nil();

                    SYMBOL63 = (Token) input.LT(1);
                    match(input, SYMBOL, FOLLOW_SYMBOL_in_literal747);
                    SYMBOL63_tree = (Object) adaptor.create(SYMBOL63);
                    adaptor.addChild(root_0, SYMBOL63_tree);


                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:49: REGEX
                {
                    root_0 = (Object) adaptor.nil();

                    REGEX64 = (Token) input.LT(1);
                    match(input, REGEX, FOLLOW_REGEX_in_literal749);
                    REGEX64_tree = (Object) adaptor.create(REGEX64);
                    adaptor.addChild(root_0, REGEX64_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:202:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65 = null;

        Object set65_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:202:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set65 = (Token) input.LT(1);
                if ((input.LA(1) >= SINGLE_QUOTE_STRING && input.LA(1) <= DOUBLE_QUOTE_STRING)) {
                    input.consume();
                    adaptor.addChild(root_0, adaptor.create(set65));
                    errorRecovery = false;
                } else {
                    MismatchedSetException mse =
                            new MismatchedSetException(null, input);
                    recoverFromMismatchedSet(input, mse, FOLLOW_set_in_string0);
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
    // $ANTLR end string


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA5_eotS =
            "\5\uffff";
    static final String DFA5_eofS =
            "\3\3\2\uffff";
    static final String DFA5_minS =
            "\1\33\2\26\2\uffff";
    static final String DFA5_maxS =
            "\1\72\2\77\2\uffff";
    static final String DFA5_acceptS =
            "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
            "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\30\uffff\1\3\3\uffff\2\3",
            "\2\4\3\uffff\1\1\1\2\1\uffff\2\4\24\uffff\1\4\1\3\3\4\2\3\2" +
                    "\uffff\3\4",
            "\2\4\3\uffff\1\1\1\2\1\uffff\2\4\24\uffff\1\4\1\3\3\4\2\3\2" +
                    "\uffff\3\4",
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
            return "()* loopback of 91:15: ( ( terminal )+ statement )*";
        }
    }

    static final String DFA17_eotS =
            "\5\uffff";
    static final String DFA17_eofS =
            "\5\uffff";
    static final String DFA17_minS =
            "\1\34\1\26\3\uffff";
    static final String DFA17_maxS =
            "\1\74\1\77\3\uffff";
    static final String DFA17_acceptS =
            "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
            "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\36\uffff\1\2\1\3",
            "\2\4\3\uffff\1\4\1\1\1\uffff\2\4\24\uffff\7\4\1\uffff\1\3\3" +
                    "\4",
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
            return "133:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }


    public static final BitSet FOLLOW_terminal_in_program159 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_statement_list_in_program163 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_terminal_in_program165 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_statement_in_statement_list179 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list182 = new BitSet(new long[]{0xE1D00000D8C00000L});
    public static final BitSet FOLLOW_statement_in_statement_list185 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_expression_in_statement211 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_modifier_line_in_statement214 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_set_in_modifier_line254 = new BitSet(new long[]{0xE1D00000D0C00000L});
    public static final BitSet FOLLOW_line_break_in_modifier_line268 = new BitSet(new long[]{0xE1D00000D0C00000L});
    public static final BitSet FOLLOW_expression_in_modifier_line272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_block_expression347 = new BitSet(new long[]{0xE1F00000C8C00000L});
    public static final BitSet FOLLOW_body_in_block_expression349 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_block_expression351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body358 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_statement_list_in_body362 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_terminal_in_body364 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression387 = new BitSet(new long[]{0xE1D00000C0C00000L});
    public static final BitSet FOLLOW_expression_in_if_expression392 = new BitSet(new long[]{0x1800000010000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression394 = new BitSet(new long[]{0xE7F00000C8C00000L});
    public static final BitSet FOLLOW_body_in_if_expression407 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_57_in_if_expression410 = new BitSet(new long[]{0xE1D00000C0C00000L});
    public static final BitSet FOLLOW_expression_in_if_expression414 = new BitSet(new long[]{0x1800000010000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression416 = new BitSet(new long[]{0xE7F00000C8C00000L});
    public static final BitSet FOLLOW_body_in_if_expression420 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_58_in_if_expression434 = new BitSet(new long[]{0xE1F00000C8C00000L});
    public static final BitSet FOLLOW_body_in_if_expression438 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_if_expression451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator503 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_59_in_seperator506 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator508 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator513 = new BitSet(new long[]{0x1000000010000000L});
    public static final BitSet FOLLOW_60_in_seperator516 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator518 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression528 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression530 = new BitSet(new long[]{0x1800000010000000L});
    public static final BitSet FOLLOW_60_in_unless_expression533 = new BitSet(new long[]{0xE5F00000C8C00000L});
    public static final BitSet FOLLOW_59_in_unless_expression535 = new BitSet(new long[]{0xE5F00000C8C00000L});
    public static final BitSet FOLLOW_line_break_in_unless_expression537 = new BitSet(new long[]{0xE5F00000C8C00000L});
    public static final BitSet FOLLOW_body_in_unless_expression549 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_58_in_unless_expression562 = new BitSet(new long[]{0xE1F00000C8C00000L});
    public static final BitSet FOLLOW_body_in_unless_expression564 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_unless_expression577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_expression684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_expression688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expression690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_expression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_expression697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_expression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_expression701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_assignment_expression711 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_assignment_expression713 = new BitSet(new long[]{0xE1D00000C0C00000L});
    public static final BitSet FOLLOW_rvalue_in_assignment_expression715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lvalue722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rvalue729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_literal737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_literal745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});

}