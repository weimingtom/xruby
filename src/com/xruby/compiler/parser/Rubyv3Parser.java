// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-03 12:15:49

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "SHIFT", "ASSIGNMENT", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "INT", "FLOAT", "ARRAY", "HASH", "RANGE", "REGEX", "OCTAL", "DECIMAL", "HEX", "BINARY", "ESCAPE_INT", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "NON_LEADING0_NUMBER", "EXP_PART", "LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "HEREDOC_STRING", "HEREDOC_BEGIN", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "':'", "'then'", "'expression0'", "'expression1'", "'expression2'", "'='"
    };
    public static final int SINGLETON_METHOD = 22;
    public static final int STATEMENT_LIST = 4;
    public static final int STATEMENT = 5;
    public static final int ESCAPE_INT = 43;
    public static final int ARRAY = 35;
    public static final int HASH = 36;
    public static final int HEX_PART = 44;
    public static final int FLOAT = 34;
    public static final int OCTAL = 39;
    public static final int META_PART = 46;
    public static final int LEADING0_NUMBER = 50;
    public static final int DECIMAL = 40;
    public static final int BINARY = 42;
    public static final int BLOCK = 15;
    public static final int UNTIL_MODIFIER = 27;
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
    public static final int RANGE = 37;
    public static final int SHIFT = 12;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA = 19;
    public static final int WS = 31;
    public static final int STRING = 23;
    public static final int NESTED_LHS = 21;
    public static final int NON_LEADING0_NUMBER = 48;
    public static final int SINGLE_QUOTE_STRING = 51;
    public static final int HEREDOC_BEGIN = 54;
    public static final int WHILE_MODIFIER = 26;
    public static final int EXP_PART = 49;
    public static final int SEMI = 29;
    public static final int BLOCK_ARG = 18;
    public static final int MRHS = 20;
    public static final int IF = 7;
    public static final int ARG = 11;
    public static final int MULTIPLE_ASSIGN_WITH_EXTRA_COMMA = 17;
    public static final int EOF = -1;
    public static final int CALL = 10;
    public static final int RESCUE_MODIFIER = 28;
    public static final int MODIFIER_LINE = 6;
    public static final int RPAREN_IN_METHOD_DEFINATION = 8;
    public static final int HEX = 41;

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


    private SymbolTableManager stm = new SymbolTableManager(null);

    public boolean just_seen_var() {
        Token token = input.LT(1);
        if (token != null) {
            return stm.isDefinedInCurrentScope(token.getText());
        }
        return false;
    }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start program
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:115:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;


        ((Rubyv3Lexer) input.getTokenSource()).setParser(this);

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3 = 2;
            int LA3_0 = input.LA(1);

            if ((LA3_0 == EOF || (LA3_0 >= SEMI && LA3_0 <= LINE_BREAK))) {
                alt3 = 1;
            } else
            if ((LA3_0 == SYMBOL || (LA3_0 >= IF_MODIFIER && LA3_0 <= UNLESS_MODIFIER) || (LA3_0 >= ID && LA3_0 <= REGEX) || (LA3_0 >= SINGLE_QUOTE_STRING && LA3_0 <= HEREDOC_STRING) || LA3_0 == 55 || (LA3_0 >= 57 && LA3_0 <= 59) || (LA3_0 >= 64 && LA3_0 <= 66))) {
                alt3 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("115:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:19: ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:19: ( terminal )*
                    loop1:
                    do {
                        int alt1 = 2;
                        int LA1_0 = input.LA(1);

                        if (((LA1_0 >= SEMI && LA1_0 <= LINE_BREAK))) {
                            alt1 = 1;
                        }


                        switch (alt1) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:19: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program179);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:30: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program183);
                    statement_list2 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:45: ( terminal )*
                    loop2:
                    do {
                        int alt2 = 2;
                        int LA2_0 = input.LA(1);

                        if (((LA2_0 >= SEMI && LA2_0 <= LINE_BREAK))) {
                            alt2 = 1;
                        }


                        switch (alt2) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:118:45: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program185);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:121:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:5: statement ( ( terminal )+ statement )*
            {
                pushFollow(FOLLOW_statement_in_statement_list199);
                statement4 = statement();
                _fsp--;

                list_statement.add(statement4.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:15: ( ( terminal )+ statement )*
                loop5:
                do {
                    int alt5 = 2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:16: ( terminal )+ statement
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:16: ( terminal )+
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
                                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:16: terminal
                                    {
                                        pushFollow(FOLLOW_terminal_in_statement_list202);
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

                            pushFollow(FOLLOW_statement_in_statement_list205);
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
                // 122:38: -> ^( STATEMENT_LIST ( statement )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:41: ^( STATEMENT_LIST ( statement )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:122:58: ( statement )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:129:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line = new ArrayList();
        List list_expression = new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:4: expression ( modifier_line )*
            {
                pushFollow(FOLLOW_expression_in_statement231);
                expression7 = expression();
                _fsp--;

                list_expression.add(expression7.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:15: ( modifier_line )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if (((LA6_0 >= IF_MODIFIER && LA6_0 <= RESCUE_MODIFIER))) {
                        alt6 = 1;
                    }


                    switch (alt6) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:16: modifier_line
                        {
                            pushFollow(FOLLOW_modifier_line_in_statement234);
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
                // 130:33: -> ^( STATEMENT expression ( modifier_line )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:36: ^( STATEMENT expression ( modifier_line )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                        adaptor.addChild(root_1, list_expression.get(i_0));
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:130:59: ( modifier_line )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:133:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9 = null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                    recoverFromMismatchedSet(input, mse, FOLLOW_set_in_modifier_line274);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:80: ( line_break )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if ((LA7_0 == LINE_BREAK)) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:134:81: line_break
                        {
                            pushFollow(FOLLOW_line_break_in_modifier_line288);
                            line_break10 = line_break();
                            _fsp--;

                            adaptor.addChild(root_0, line_break10.getTree());

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);

                pushFollow(FOLLOW_expression_in_modifier_line292);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:152:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:153:4: 'begin' body 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal12 = (Token) input.LT(1);
                match(input, 55, FOLLOW_55_in_block_expression367);
                string_literal12_tree = (Object) adaptor.create(string_literal12);
                adaptor.addChild(root_0, string_literal12_tree);

                pushFollow(FOLLOW_body_in_block_expression369);
                body13 = body();
                _fsp--;

                adaptor.addChild(root_0, body13.getTree());
                string_literal14 = (Token) input.LT(1);
                match(input, 56, FOLLOW_56_in_block_expression371);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15 = null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10 = 2;
            int LA10_0 = input.LA(1);

            if ((LA10_0 == SEMI || LA10_0 == 56 || (LA10_0 >= 60 && LA10_0 <= 61))) {
                alt10 = 1;
            } else
            if ((LA10_0 == SYMBOL || (LA10_0 >= IF_MODIFIER && LA10_0 <= UNLESS_MODIFIER) || (LA10_0 >= ID && LA10_0 <= REGEX) || (LA10_0 >= SINGLE_QUOTE_STRING && LA10_0 <= HEREDOC_STRING) || LA10_0 == 55 || (LA10_0 >= 57 && LA10_0 <= 59) || (LA10_0 >= 64 && LA10_0 <= 66))) {
                alt10 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("154:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: ( SEMI )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);

                        if ((LA8_0 == SEMI)) {
                            alt8 = 1;
                        }


                        switch (alt8) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:8: SEMI
                            {
                                SEMI15 = (Token) input.LT(1);
                                match(input, SEMI, FOLLOW_SEMI_in_body378);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:15: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body382);
                    statement_list16 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:30: ( terminal )*
                    loop9:
                    do {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);

                        if (((LA9_0 >= SEMI && LA9_0 <= LINE_BREAK))) {
                            alt9 = 1;
                        }


                        switch (alt9) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:154:30: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_body384);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:155:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18 = null;

        Object set18_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:156:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set18 = (Token) input.LT(1);
                if ((input.LA(1) >= 57 && input.LA(1) <= 59)) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:157:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        List list_61 = new ArrayList();
        List list_56 = new ArrayList();
        List list_IF_MODIFIER = new ArrayList();
        List list_60 = new ArrayList();
        Object string_literal19_tree = null;
        Object string_literal21_tree = null;
        Object string_literal23_tree = null;
        Object string_literal24_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:158:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
                string_literal19 = (Token) input.LT(1);
                match(input, IF_MODIFIER, FOLLOW_IF_MODIFIER_in_if_expression407);
                list_IF_MODIFIER.add(string_literal19);

                pushFollow(FOLLOW_expression_in_if_expression412);
                e0 = expression();
                _fsp--;

                list_expression.add(e0.getTree());
                pushFollow(FOLLOW_seperator_in_if_expression414);
                seperator20 = seperator();
                _fsp--;

                list_seperator.add(seperator20.getTree());
                pushFollow(FOLLOW_body_in_if_expression427);
                body0 = body();
                _fsp--;

                list_body.add(body0.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:21: ( 'elsif' e1= expression seperator body1+= body )*
                loop11:
                do {
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);

                    if ((LA11_0 == 60)) {
                        alt11 = 1;
                    }


                    switch (alt11) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:159:22: 'elsif' e1= expression seperator body1+= body
                        {
                            string_literal21 = (Token) input.LT(1);
                            match(input, 60, FOLLOW_60_in_if_expression430);
                            list_60.add(string_literal21);

                            pushFollow(FOLLOW_expression_in_if_expression434);
                            e1 = expression();
                            _fsp--;

                            list_expression.add(e1.getTree());
                            pushFollow(FOLLOW_seperator_in_if_expression436);
                            seperator22 = seperator();
                            _fsp--;

                            list_seperator.add(seperator22.getTree());
                            pushFollow(FOLLOW_body_in_if_expression440);
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

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:10: ( 'else' body2= body )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);

                if ((LA12_0 == 61)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:160:11: 'else' body2= body
                    {
                        string_literal23 = (Token) input.LT(1);
                        match(input, 61, FOLLOW_61_in_if_expression454);
                        list_61.add(string_literal23);

                        pushFollow(FOLLOW_body_in_if_expression458);
                        body2 = body();
                        _fsp--;

                        list_body.add(body2.getTree());

                    }
                    break;

                }

                string_literal24 = (Token) input.LT(1);
                match(input, 56, FOLLOW_56_in_if_expression471);
                list_56.add(string_literal24);

                // AST REWRITE
                int i_0 = 0;
                retval.tree = root_0;
                root_0 = (Object) adaptor.nil();
                // 161:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, e0.tree);
                        adaptor.addChild(root_1, body0.tree);
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:35: ( $e1)*
                        {
                            int n_1 = e1 == null ? 0 : 1;


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, e1.tree);

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:40: ( $body1)*
                        {
                            int n_1 = list_body1 == null ? 0 : list_body1.size();


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, ((ParserRuleReturnScope) list_body1.get(i_1)).getTree());

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:161:48: ( $body2)?
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:164:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17 = 3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:3: ( LINE_BREAK )+
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:3: ( LINE_BREAK )+
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
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:3: LINE_BREAK
                            {
                                LINE_BREAK25 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator523);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:15: ':' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    char_literal26 = (Token) input.LT(1);
                    match(input, 62, FOLLOW_62_in_seperator526);
                    char_literal26_tree = (Object) adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);

                        if ((LA14_0 == LINE_BREAK)) {
                            alt14 = 1;
                        }


                        switch (alt14) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:19: LINE_BREAK
                            {
                                LINE_BREAK27 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator528);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);

                        if ((LA15_0 == LINE_BREAK)) {
                            alt15 = 1;
                        }


                        switch (alt15) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:33: LINE_BREAK
                            {
                                LINE_BREAK28 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator533);
                                LINE_BREAK28_tree = (Object) adaptor.create(LINE_BREAK28);
                                adaptor.addChild(root_0, LINE_BREAK28_tree);


                            }
                            break;

                            default:
                                break loop15;
                        }
                    } while (true);

                    string_literal29 = (Token) input.LT(1);
                    match(input, 63, FOLLOW_63_in_seperator536);
                    string_literal29_tree = (Object) adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16 = 2;
                        int LA16_0 = input.LA(1);

                        if ((LA16_0 == LINE_BREAK)) {
                            alt16 = 1;
                        }


                        switch (alt16) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:165:52: LINE_BREAK
                            {
                                LINE_BREAK30 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator538);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:166:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:167:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:167:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal31 = (Token) input.LT(1);
                match(input, UNLESS_MODIFIER, FOLLOW_UNLESS_MODIFIER_in_unless_expression548);
                string_literal31_tree = (Object) adaptor.create(string_literal31);
                adaptor.addChild(root_0, string_literal31_tree);

                pushFollow(FOLLOW_boolean_expression_in_unless_expression550);
                boolean_expression32 = boolean_expression();
                _fsp--;

                adaptor.addChild(root_0, boolean_expression32.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:167:32: ( 'then' | ':' | line_break )
                int alt18 = 3;
                switch (input.LA(1)) {
                    case 63: {
                        alt18 = 1;
                    }
                    break;
                    case 62: {
                        alt18 = 2;
                    }
                    break;
                    case LINE_BREAK: {
                        alt18 = 3;
                    }
                    break;
                    default:
                        NoViableAltException nvae =
                                new NoViableAltException("167:32: ( 'then' | ':' | line_break )", 18, 0, input);

                        throw nvae;
                }

                switch (alt18) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:167:33: 'then'
                    {
                        string_literal33 = (Token) input.LT(1);
                        match(input, 63, FOLLOW_63_in_unless_expression553);
                        string_literal33_tree = (Object) adaptor.create(string_literal33);
                        adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:167:40: ':'
                    {
                        char_literal34 = (Token) input.LT(1);
                        match(input, 62, FOLLOW_62_in_unless_expression555);
                        char_literal34_tree = (Object) adaptor.create(char_literal34);
                        adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:167:44: line_break
                    {
                        pushFollow(FOLLOW_line_break_in_unless_expression557);
                        line_break35 = line_break();
                        _fsp--;

                        adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

                }

                pushFollow(FOLLOW_body_in_unless_expression569);
                body36 = body();
                _fsp--;

                adaptor.addChild(root_0, body36.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:10: ( 'else' body )?
                int alt19 = 2;
                int LA19_0 = input.LA(1);

                if ((LA19_0 == 61)) {
                    alt19 = 1;
                }
                switch (alt19) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:11: 'else' body
                    {
                        string_literal37 = (Token) input.LT(1);
                        match(input, 61, FOLLOW_61_in_unless_expression582);
                        string_literal37_tree = (Object) adaptor.create(string_literal37);
                        adaptor.addChild(root_0, string_literal37_tree);

                        pushFollow(FOLLOW_body_in_unless_expression584);
                        body38 = body();
                        _fsp--;

                        adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

                }

                string_literal39 = (Token) input.LT(1);
                match(input, 56, FOLLOW_56_in_unless_expression597);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40 = null;
        line_break_return line_break41 = null;


        Object SEMI40_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:11: ( SEMI | line_break )
            int alt20 = 2;
            int LA20_0 = input.LA(1);

            if ((LA20_0 == SEMI)) {
                alt20 = 1;
            } else if ((LA20_0 == LINE_BREAK)) {
                alt20 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("171:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:11: SEMI
                {
                    root_0 = (Object) adaptor.nil();

                    SEMI40 = (Token) input.LT(1);
                    match(input, SEMI, FOLLOW_SEMI_in_terminal603);

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:171:17: line_break
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal606);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42 = null;

        Object LINE_BREAK42_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:5: LINE_BREAK
            {
                root_0 = (Object) adaptor.nil();

                LINE_BREAK42 = (Token) input.LT(1);
                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_line_break616);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:1: expression : ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs );
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43 = null;
        Token string_literal44 = null;
        Token string_literal45 = null;
        Token ID48 = null;
        Token SHIFT54 = null;
        literal_return literal46 = null;

        assignment_expression_return assignment_expression47 = null;

        boolean_expression_return boolean_expression49 = null;

        block_expression_return block_expression50 = null;

        if_expression_return if_expression51 = null;

        unless_expression_return unless_expression52 = null;

        lhs_return lhs53 = null;

        rhs_return rhs55 = null;


        Object string_literal43_tree = null;
        Object string_literal44_tree = null;
        Object string_literal45_tree = null;
        Object ID48_tree = null;
        Object SHIFT54_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:4: ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs )
            int alt21 = 11;
            switch (input.LA(1)) {
                case 64: {
                    alt21 = 1;
                }
                break;
                case 65: {
                    alt21 = 2;
                }
                break;
                case 66: {
                    alt21 = 3;
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
                case HEREDOC_STRING: {
                    alt21 = 4;
                }
                break;
                case ID: {
                    switch (input.LA(2)) {
                        case EOF:
                        case IF_MODIFIER:
                        case UNLESS_MODIFIER:
                        case WHILE_MODIFIER:
                        case UNTIL_MODIFIER:
                        case RESCUE_MODIFIER:
                        case SEMI:
                        case LINE_BREAK:
                        case 56:
                        case 60:
                        case 61:
                        case 62:
                        case 63: {
                            alt21 = 6;
                        }
                        break;
                        case 67: {
                            alt21 = 5;
                        }
                        break;
                        case SHIFT: {
                            alt21 = 11;
                        }
                        break;
                        default:
                            NoViableAltException nvae =
                                    new NoViableAltException("184:1: expression : ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs );", 21, 5, input);

                            throw nvae;
                    }

                }
                break;
                case 57:
                case 58:
                case 59: {
                    alt21 = 7;
                }
                break;
                case 55: {
                    alt21 = 8;
                }
                break;
                case IF_MODIFIER: {
                    alt21 = 9;
                }
                break;
                case UNLESS_MODIFIER: {
                    alt21 = 10;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("184:1: expression : ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs );", 21, 0, input);

                    throw nvae;
            }

            switch (alt21) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:4: 'expression0'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal43 = (Token) input.LT(1);
                    match(input, 64, FOLLOW_64_in_expression700);
                    string_literal43_tree = (Object) adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:20: 'expression1'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal44 = (Token) input.LT(1);
                    match(input, 65, FOLLOW_65_in_expression704);
                    string_literal44_tree = (Object) adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:36: 'expression2'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal45 = (Token) input.LT(1);
                    match(input, 66, FOLLOW_66_in_expression708);
                    string_literal45_tree = (Object) adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);


                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:50: literal
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_literal_in_expression710);
                    literal46 = literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal46.getTree());

                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:58: assignment_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_assignment_expression_in_expression712);
                    assignment_expression47 = assignment_expression();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_expression47.getTree());

                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:80: ID
                {
                    root_0 = (Object) adaptor.nil();

                    ID48 = (Token) input.LT(1);
                    match(input, ID, FOLLOW_ID_in_expression714);
                    ID48_tree = (Object) adaptor.create(ID48);
                    adaptor.addChild(root_0, ID48_tree);


                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:83: boolean_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_boolean_expression_in_expression716);
                    boolean_expression49 = boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression49.getTree());

                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:103: block_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_block_expression_in_expression719);
                    block_expression50 = block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression50.getTree());

                }
                break;
                case 9:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:120: if_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_expression721);
                    if_expression51 = if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression51.getTree());

                }
                break;
                case 10:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:134: unless_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_unless_expression_in_expression723);
                    unless_expression52 = unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression52.getTree());

                }
                break;
                case 11:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:186:10: lhs SHIFT rhs
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_expression734);
                    lhs53 = lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs53.getTree());
                    SHIFT54 = (Token) input.LT(1);
                    match(input, SHIFT, FOLLOW_SHIFT_in_expression736);
                    SHIFT54_tree = (Object) adaptor.create(SHIFT54);
                    root_0 = (Object) adaptor.becomeRoot(SHIFT54_tree, root_0);

                    pushFollow(FOLLOW_rhs_in_expression739);
                    rhs55 = rhs();
                    _fsp--;

                    adaptor.addChild(root_0, rhs55.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:187:1: assignment_expression : lhs '=' rhs ;
    public final assignment_expression_return assignment_expression() throws RecognitionException {
        assignment_expression_return retval = new assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal57 = null;
        lhs_return lhs56 = null;

        rhs_return rhs58 = null;


        Object char_literal57_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:4: ( lhs '=' rhs )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:188:4: lhs '=' rhs
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_lhs_in_assignment_expression748);
                lhs56 = lhs();
                _fsp--;

                adaptor.addChild(root_0, lhs56.getTree());
                char_literal57 = (Token) input.LT(1);
                match(input, 67, FOLLOW_67_in_assignment_expression750);
                char_literal57_tree = (Object) adaptor.create(char_literal57);
                root_0 = (Object) adaptor.becomeRoot(char_literal57_tree, root_0);

                pushFollow(FOLLOW_rhs_in_assignment_expression753);
                rhs58 = rhs();
                _fsp--;

                adaptor.addChild(root_0, rhs58.getTree());
                System.out.println(input.toString(lhs56.start, lhs56.stop));
                stm.addVariable(input.toString(lhs56.start, lhs56.stop));

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:189:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID59 = null;

        Object ID59_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:189:7: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:189:7: ID
            {
                root_0 = (Object) adaptor.nil();

                ID59 = (Token) input.LT(1);
                match(input, ID, FOLLOW_ID_in_lhs762);
                ID59_tree = (Object) adaptor.create(ID59);
                adaptor.addChild(root_0, ID59_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:190:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression60 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:190:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:190:7: expression
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_expression_in_rhs769);
                expression60 = expression();
                _fsp--;

                adaptor.addChild(root_0, expression60.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT61 = null;
        Token FLOAT62 = null;
        Token ARRAY64 = null;
        Token HASH65 = null;
        Token RANGE66 = null;
        Token SYMBOL67 = null;
        Token REGEX68 = null;
        string_return string63 = null;


        Object INT61_tree = null;
        Object FLOAT62_tree = null;
        Object ARRAY64_tree = null;
        Object HASH65_tree = null;
        Object RANGE66_tree = null;
        Object SYMBOL67_tree = null;
        Object REGEX68_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:11: ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX )
            int alt22 = 8;
            switch (input.LA(1)) {
                case INT: {
                    alt22 = 1;
                }
                break;
                case FLOAT: {
                    alt22 = 2;
                }
                break;
                case SINGLE_QUOTE_STRING:
                case DOUBLE_QUOTE_STRING:
                case HEREDOC_STRING: {
                    alt22 = 3;
                }
                break;
                case ARRAY: {
                    alt22 = 4;
                }
                break;
                case HASH: {
                    alt22 = 5;
                }
                break;
                case RANGE: {
                    alt22 = 6;
                }
                break;
                case SYMBOL: {
                    alt22 = 7;
                }
                break;
                case REGEX: {
                    alt22 = 8;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("192:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );", 22, 0, input);

                    throw nvae;
            }

            switch (alt22) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:11: INT
                {
                    root_0 = (Object) adaptor.nil();

                    INT61 = (Token) input.LT(1);
                    match(input, INT, FOLLOW_INT_in_literal777);
                    INT61_tree = (Object) adaptor.create(INT61);
                    adaptor.addChild(root_0, INT61_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:15: FLOAT
                {
                    root_0 = (Object) adaptor.nil();

                    FLOAT62 = (Token) input.LT(1);
                    match(input, FLOAT, FOLLOW_FLOAT_in_literal779);
                    FLOAT62_tree = (Object) adaptor.create(FLOAT62);
                    adaptor.addChild(root_0, FLOAT62_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:21: string
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal781);
                    string63 = string();
                    _fsp--;

                    adaptor.addChild(root_0, string63.getTree());

                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:28: ARRAY
                {
                    root_0 = (Object) adaptor.nil();

                    ARRAY64 = (Token) input.LT(1);
                    match(input, ARRAY, FOLLOW_ARRAY_in_literal783);
                    ARRAY64_tree = (Object) adaptor.create(ARRAY64);
                    adaptor.addChild(root_0, ARRAY64_tree);


                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:34: HASH
                {
                    root_0 = (Object) adaptor.nil();

                    HASH65 = (Token) input.LT(1);
                    match(input, HASH, FOLLOW_HASH_in_literal785);
                    HASH65_tree = (Object) adaptor.create(HASH65);
                    adaptor.addChild(root_0, HASH65_tree);


                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:39: RANGE
                {
                    root_0 = (Object) adaptor.nil();

                    RANGE66 = (Token) input.LT(1);
                    match(input, RANGE, FOLLOW_RANGE_in_literal787);
                    RANGE66_tree = (Object) adaptor.create(RANGE66);
                    adaptor.addChild(root_0, RANGE66_tree);


                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:45: SYMBOL
                {
                    root_0 = (Object) adaptor.nil();

                    SYMBOL67 = (Token) input.LT(1);
                    match(input, SYMBOL, FOLLOW_SYMBOL_in_literal789);
                    SYMBOL67_tree = (Object) adaptor.create(SYMBOL67);
                    adaptor.addChild(root_0, SYMBOL67_tree);


                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:192:52: REGEX
                {
                    root_0 = (Object) adaptor.nil();

                    REGEX68 = (Token) input.LT(1);
                    match(input, REGEX, FOLLOW_REGEX_in_literal791);
                    REGEX68_tree = (Object) adaptor.create(REGEX68);
                    adaptor.addChild(root_0, REGEX68_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set69 = null;

        Object set69_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:239:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set69 = (Token) input.LT(1);
                if ((input.LA(1) >= SINGLE_QUOTE_STRING && input.LA(1) <= HEREDOC_STRING)) {
                    input.consume();
                    adaptor.addChild(root_0, adaptor.create(set69));
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
            "\1\35\2\16\2\uffff";
    static final String DFA5_maxS =
            "\1\75\2\102\2\uffff";
    static final String DFA5_acceptS =
            "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
            "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\31\uffff\1\3\3\uffff\2\3",
            "\1\4\11\uffff\2\4\3\uffff\1\1\1\2\1\uffff\7\4\14\uffff\3\4\1" +
                    "\uffff\1\4\1\3\3\4\2\3\2\uffff\3\4",
            "\1\4\11\uffff\2\4\3\uffff\1\1\1\2\1\uffff\7\4\14\uffff\3\4\1" +
                    "\uffff\1\4\1\3\3\4\2\3\2\uffff\3\4",
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
            return "()* loopback of 122:15: ( ( terminal )+ statement )*";
        }
    }

    static final String DFA17_eotS =
            "\5\uffff";
    static final String DFA17_eofS =
            "\5\uffff";
    static final String DFA17_minS =
            "\1\36\1\16\3\uffff";
    static final String DFA17_maxS =
            "\1\77\1\102\3\uffff";
    static final String DFA17_acceptS =
            "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
            "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\37\uffff\1\2\1\3",
            "\1\4\11\uffff\2\4\3\uffff\1\4\1\1\1\uffff\7\4\14\uffff\3\4\1" +
                    "\uffff\7\4\1\uffff\1\3\3\4",
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
            return "164:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }


    public static final BitSet FOLLOW_terminal_in_program179 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_statement_list_in_program183 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_terminal_in_program185 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_statement_in_statement_list199 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list202 = new BitSet(new long[]{0x0EB8007F63004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_statement_in_statement_list205 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_expression_in_statement231 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement234 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_set_in_modifier_line274 = new BitSet(new long[]{0x0EB8007F43004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_line_break_in_modifier_line288 = new BitSet(new long[]{0x0EB8007F43004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_expression_in_modifier_line292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_block_expression367 = new BitSet(new long[]{0x0FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_body_in_block_expression369 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_block_expression371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body378 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_statement_list_in_body382 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_terminal_in_body384 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression407 = new BitSet(new long[]{0x0EB8007F03004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_expression_in_if_expression412 = new BitSet(new long[]{0xC000000040000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression414 = new BitSet(new long[]{0x3FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_body_in_if_expression427 = new BitSet(new long[]{0x3100000000000000L});
    public static final BitSet FOLLOW_60_in_if_expression430 = new BitSet(new long[]{0x0EB8007F03004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_expression_in_if_expression434 = new BitSet(new long[]{0xC000000040000000L});
    public static final BitSet FOLLOW_seperator_in_if_expression436 = new BitSet(new long[]{0x3FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_body_in_if_expression440 = new BitSet(new long[]{0x3100000000000000L});
    public static final BitSet FOLLOW_61_in_if_expression454 = new BitSet(new long[]{0x0FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_body_in_if_expression458 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_if_expression471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator523 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_62_in_seperator526 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator528 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator533 = new BitSet(new long[]{0x8000000040000000L});
    public static final BitSet FOLLOW_63_in_seperator536 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator538 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression548 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression550 = new BitSet(new long[]{0xC000000040000000L});
    public static final BitSet FOLLOW_63_in_unless_expression553 = new BitSet(new long[]{0x2FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_62_in_unless_expression555 = new BitSet(new long[]{0x2FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_line_break_in_unless_expression557 = new BitSet(new long[]{0x2FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_body_in_unless_expression569 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_61_in_unless_expression582 = new BitSet(new long[]{0x0FB8007F23004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_body_in_unless_expression584 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_unless_expression597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_expression700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_expression708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_expression716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_expression719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_expression721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_expression723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_expression734 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SHIFT_in_expression736 = new BitSet(new long[]{0x0EB8007F03004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_rhs_in_expression739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignment_expression748 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_assignment_expression750 = new BitSet(new long[]{0x0EB8007F03004000L, 0x0000000000000007L});
    public static final BitSet FOLLOW_rhs_in_assignment_expression753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_literal787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});

}