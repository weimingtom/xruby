// $ANTLR 3.0b7 C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g 2007-05-09 11:09:06

package com.xruby.compiler.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.util.ArrayList;
import java.util.List;

public class Rubyv3Parser extends Parser {
    public static final String[] tokenNames = new String[]{
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STATEMENT_LIST", "STATEMENT", "MODIFIER_LINE", "IF", "RPAREN_IN_METHOD_DEFINATION", "BODY", "CALL", "ARG", "SHIFT", "ASSIGNMENT", "SYMBOL", "BLOCK", "MULTIPLE_ASSIGN", "MULTIPLE_ASSIGN_WITH_EXTRA_COMMA", "BLOCK_ARG", "BLOCK_ARG_WITH_EXTRA_COMMA", "MRHS", "NESTED_LHS", "SINGLETON_METHOD", "STRING", "IF_MODIFIER", "UNLESS_MODIFIER", "WHILE_MODIFIER", "UNTIL_MODIFIER", "RESCUE_MODIFIER", "SEMI", "LINE_BREAK", "WS", "ID", "INT", "FLOAT", "ARRAY", "HASH", "RANGE", "REGEX", "OCTAL", "DECIMAL", "HEX", "BINARY", "ESCAPE_INT", "HEX_PART", "CONTROL_PART", "META_PART", "ESCAPE_INT_PART", "NON_LEADING0_NUMBER", "EXP_PART", "LEADING0_NUMBER", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "HEREDOC_STRING", "SINGLE_STRING_CHAR", "DOUBLE_STRING_CHAR", "LCURLY", "RCURLY", "HEREDOC_BEGIN", "HEREDOC_INDENT_BEGIN", "'begin'", "'end'", "'false'", "'nil'", "'true'", "'elsif'", "'else'", "':'", "'then'", "'and'", "'or'", "'not'", "'expression0'", "'expression1'", "'expression2'", "'='"
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
    public static final int RCURLY = 57;
    public static final int LCURLY = 56;
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
    public static final int HEREDOC_INDENT_BEGIN = 59;
    public static final int BODY = 9;
    public static final int UNLESS_MODIFIER = 25;
    public static final int HEREDOC_STRING = 53;
    public static final int ID = 32;
    public static final int RANGE = 37;
    public static final int SHIFT = 12;
    public static final int BLOCK_ARG_WITH_EXTRA_COMMA = 19;
    public static final int WS = 31;
    public static final int STRING = 23;
    public static final int DOUBLE_STRING_CHAR = 55;
    public static final int NESTED_LHS = 21;
    public static final int NON_LEADING0_NUMBER = 48;
    public static final int SINGLE_QUOTE_STRING = 51;
    public static final int HEREDOC_BEGIN = 58;
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
    public static final int SINGLE_STRING_CHAR = 54;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:168:1: program : ( ( terminal )* | statement_list ( terminal )* );
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        terminal_return terminal1 = null;

        statement_list_return statement_list2 = null;

        terminal_return terminal3 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:19: ( ( terminal )* | statement_list ( terminal )* )
            int alt3 = 2;
            int LA3_0 = input.LA(1);

            if ((LA3_0 == EOF || (LA3_0 >= SEMI && LA3_0 <= LINE_BREAK))) {
                alt3 = 1;
            } else
            if ((LA3_0 == SYMBOL || (LA3_0 >= IF_MODIFIER && LA3_0 <= UNLESS_MODIFIER) || (LA3_0 >= ID && LA3_0 <= REGEX) || (LA3_0 >= SINGLE_QUOTE_STRING && LA3_0 <= HEREDOC_STRING) || LA3_0 == 60 || (LA3_0 >= 62 && LA3_0 <= 64) || (LA3_0 >= 71 && LA3_0 <= 74))) {
                alt3 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("168:1: program : ( ( terminal )* | statement_list ( terminal )* );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:19: ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:19: ( terminal )*
                    loop1:
                    do {
                        int alt1 = 2;
                        int LA1_0 = input.LA(1);

                        if (((LA1_0 >= SEMI && LA1_0 <= LINE_BREAK))) {
                            alt1 = 1;
                        }


                        switch (alt1) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:19: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program186);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:30: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_program190);
                    statement_list2 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list2.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:45: ( terminal )*
                    loop2:
                    do {
                        int alt2 = 2;
                        int LA2_0 = input.LA(1);

                        if (((LA2_0 >= SEMI && LA2_0 <= LINE_BREAK))) {
                            alt2 = 1;
                        }


                        switch (alt2) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:169:45: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_program192);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:172:1: statement_list : statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:5: ( statement ( ( terminal )+ statement )* -> ^( STATEMENT_LIST ( statement )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:5: statement ( ( terminal )+ statement )*
            {
                pushFollow(FOLLOW_statement_in_statement_list206);
                statement4 = statement();
                _fsp--;

                list_statement.add(statement4.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:15: ( ( terminal )+ statement )*
                loop5:
                do {
                    int alt5 = 2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:16: ( terminal )+ statement
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:16: ( terminal )+
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
                                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:16: terminal
                                    {
                                        pushFollow(FOLLOW_terminal_in_statement_list209);
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

                            pushFollow(FOLLOW_statement_in_statement_list212);
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
                // 173:38: -> ^( STATEMENT_LIST ( statement )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:41: ^( STATEMENT_LIST ( statement )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT_LIST, "STATEMENT_LIST"), root_1);

                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:173:58: ( statement )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:180:1: statement : expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression7 = null;

        modifier_line_return modifier_line8 = null;

        List list_modifier_line = new ArrayList();
        List list_expression = new ArrayList();

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:4: ( expression ( modifier_line )* -> ^( STATEMENT expression ( modifier_line )* ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:4: expression ( modifier_line )*
            {
                pushFollow(FOLLOW_expression_in_statement238);
                expression7 = expression();
                _fsp--;

                list_expression.add(expression7.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:15: ( modifier_line )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if (((LA6_0 >= IF_MODIFIER && LA6_0 <= RESCUE_MODIFIER))) {
                        alt6 = 1;
                    }


                    switch (alt6) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:16: modifier_line
                        {
                            pushFollow(FOLLOW_modifier_line_in_statement241);
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
                // 181:33: -> ^( STATEMENT expression ( modifier_line )* )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:36: ^( STATEMENT expression ( modifier_line )* )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(STATEMENT, "STATEMENT"), root_1);

                        adaptor.addChild(root_1, list_expression.get(i_0));
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:181:59: ( modifier_line )*
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:184:1: modifier_line : ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression ;
    public final modifier_line_return modifier_line() throws RecognitionException {
        modifier_line_return retval = new modifier_line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9 = null;
        line_break_return line_break10 = null;

        expression_return expression11 = null;


        Object set9_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:3: ( ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:3: ( IF_MODIFIER | UNLESS_MODIFIER | WHILE_MODIFIER | UNTIL_MODIFIER | RESCUE_MODIFIER ) ( line_break )* expression
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
                    recoverFromMismatchedSet(input, mse, FOLLOW_set_in_modifier_line281);
                    throw mse;
                }

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:80: ( line_break )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);

                    if ((LA7_0 == LINE_BREAK)) {
                        alt7 = 1;
                    }


                    switch (alt7) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:185:81: line_break
                        {
                            pushFollow(FOLLOW_line_break_in_modifier_line295);
                            line_break10 = line_break();
                            _fsp--;

                            adaptor.addChild(root_0, line_break10.getTree());

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);

                pushFollow(FOLLOW_expression_in_modifier_line299);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:203:1: block_expression : 'begin' body 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:4: ( 'begin' body 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:204:4: 'begin' body 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal12 = (Token) input.LT(1);
                match(input, 60, FOLLOW_60_in_block_expression374);
                string_literal12_tree = (Object) adaptor.create(string_literal12);
                adaptor.addChild(root_0, string_literal12_tree);

                pushFollow(FOLLOW_body_in_block_expression376);
                body13 = body();
                _fsp--;

                adaptor.addChild(root_0, body13.getTree());
                string_literal14 = (Token) input.LT(1);
                match(input, 61, FOLLOW_61_in_block_expression378);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:1: body : ( ( SEMI )* | statement_list ( terminal )* );
    public final body_return body() throws RecognitionException {
        body_return retval = new body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI15 = null;
        statement_list_return statement_list16 = null;

        terminal_return terminal17 = null;


        Object SEMI15_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:8: ( ( SEMI )* | statement_list ( terminal )* )
            int alt10 = 2;
            int LA10_0 = input.LA(1);

            if ((LA10_0 == SEMI || LA10_0 == 61 || (LA10_0 >= 65 && LA10_0 <= 66))) {
                alt10 = 1;
            } else
            if ((LA10_0 == SYMBOL || (LA10_0 >= IF_MODIFIER && LA10_0 <= UNLESS_MODIFIER) || (LA10_0 >= ID && LA10_0 <= REGEX) || (LA10_0 >= SINGLE_QUOTE_STRING && LA10_0 <= HEREDOC_STRING) || LA10_0 == 60 || (LA10_0 >= 62 && LA10_0 <= 64) || (LA10_0 >= 71 && LA10_0 <= 74))) {
                alt10 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("205:1: body : ( ( SEMI )* | statement_list ( terminal )* );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:8: ( SEMI )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:8: ( SEMI )*
                    loop8:
                    do {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);

                        if ((LA8_0 == SEMI)) {
                            alt8 = 1;
                        }


                        switch (alt8) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:8: SEMI
                            {
                                SEMI15 = (Token) input.LT(1);
                                match(input, SEMI, FOLLOW_SEMI_in_body385);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:15: statement_list ( terminal )*
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_statement_list_in_body389);
                    statement_list16 = statement_list();
                    _fsp--;

                    adaptor.addChild(root_0, statement_list16.getTree());
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:30: ( terminal )*
                    loop9:
                    do {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);

                        if (((LA9_0 >= SEMI && LA9_0 <= LINE_BREAK))) {
                            alt9 = 1;
                        }


                        switch (alt9) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:205:30: terminal
                            {
                                pushFollow(FOLLOW_terminal_in_body391);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:206:1: boolean_expression : ( 'false' | 'nil' | 'true' );
    public final boolean_expression_return boolean_expression() throws RecognitionException {
        boolean_expression_return retval = new boolean_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18 = null;

        Object set18_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:207:4: ( 'false' | 'nil' | 'true' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set18 = (Token) input.LT(1);
                if ((input.LA(1) >= 62 && input.LA(1) <= 64)) {
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:208:1: if_expression : 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) ;
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
        List list_65 = new ArrayList();
        List list_61 = new ArrayList();
        List list_IF_MODIFIER = new ArrayList();
        List list_66 = new ArrayList();
        Object string_literal19_tree = null;
        Object string_literal21_tree = null;
        Object string_literal23_tree = null;
        Object string_literal24_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:209:4: ( 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end' -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? ) )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:209:4: 'if' e0= expression seperator body0= body ( 'elsif' e1= expression seperator body1+= body )* ( 'else' body2= body )? 'end'
            {
                string_literal19 = (Token) input.LT(1);
                match(input, IF_MODIFIER, FOLLOW_IF_MODIFIER_in_if_expression414);
                list_IF_MODIFIER.add(string_literal19);

                pushFollow(FOLLOW_expression_in_if_expression419);
                e0 = expression();
                _fsp--;

                list_expression.add(e0.getTree());
                pushFollow(FOLLOW_seperator_in_if_expression421);
                seperator20 = seperator();
                _fsp--;

                list_seperator.add(seperator20.getTree());
                pushFollow(FOLLOW_body_in_if_expression434);
                body0 = body();
                _fsp--;

                list_body.add(body0.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:210:21: ( 'elsif' e1= expression seperator body1+= body )*
                loop11:
                do {
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);

                    if ((LA11_0 == 65)) {
                        alt11 = 1;
                    }


                    switch (alt11) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:210:22: 'elsif' e1= expression seperator body1+= body
                        {
                            string_literal21 = (Token) input.LT(1);
                            match(input, 65, FOLLOW_65_in_if_expression437);
                            list_65.add(string_literal21);

                            pushFollow(FOLLOW_expression_in_if_expression441);
                            e1 = expression();
                            _fsp--;

                            list_expression.add(e1.getTree());
                            pushFollow(FOLLOW_seperator_in_if_expression443);
                            seperator22 = seperator();
                            _fsp--;

                            list_seperator.add(seperator22.getTree());
                            pushFollow(FOLLOW_body_in_if_expression447);
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

                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:10: ( 'else' body2= body )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);

                if ((LA12_0 == 66)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:211:11: 'else' body2= body
                    {
                        string_literal23 = (Token) input.LT(1);
                        match(input, 66, FOLLOW_66_in_if_expression461);
                        list_66.add(string_literal23);

                        pushFollow(FOLLOW_body_in_if_expression465);
                        body2 = body();
                        _fsp--;

                        list_body.add(body2.getTree());

                    }
                    break;

                }

                string_literal24 = (Token) input.LT(1);
                match(input, 61, FOLLOW_61_in_if_expression478);
                list_61.add(string_literal24);

                // AST REWRITE
                int i_0 = 0;
                retval.tree = root_0;
                root_0 = (Object) adaptor.nil();
                // 212:16: -> ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                {
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:19: ^( IF $e0 $body0 ( $e1)* ( $body1)* ( $body2)? )
                    {
                        Object root_1 = (Object) adaptor.nil();
                        root_1 = (Object) adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, e0.tree);
                        adaptor.addChild(root_1, body0.tree);
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:35: ( $e1)*
                        {
                            int n_1 = e1 == null ? 0 : 1;


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, e1.tree);

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:40: ( $body1)*
                        {
                            int n_1 = list_body1 == null ? 0 : list_body1.size();


                            for (int i_1 = 0; i_1 < n_1; i_1++) {
                                adaptor.addChild(root_1, ((ParserRuleReturnScope) list_body1.get(i_1)).getTree());

                            }
                        }
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:212:48: ( $body2)?
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:215:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:3: ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* )
            int alt17 = 3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:3: ( LINE_BREAK )+
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:3: ( LINE_BREAK )+
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
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:3: LINE_BREAK
                            {
                                LINE_BREAK25 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator530);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:15: ':' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    char_literal26 = (Token) input.LT(1);
                    match(input, 67, FOLLOW_67_in_seperator533);
                    char_literal26_tree = (Object) adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:19: ( LINE_BREAK )*
                    loop14:
                    do {
                        int alt14 = 2;
                        int LA14_0 = input.LA(1);

                        if ((LA14_0 == LINE_BREAK)) {
                            alt14 = 1;
                        }


                        switch (alt14) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:19: LINE_BREAK
                            {
                                LINE_BREAK27 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator535);
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
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:33: ( LINE_BREAK )* 'then' ( LINE_BREAK )*
                {
                    root_0 = (Object) adaptor.nil();

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:33: ( LINE_BREAK )*
                    loop15:
                    do {
                        int alt15 = 2;
                        int LA15_0 = input.LA(1);

                        if ((LA15_0 == LINE_BREAK)) {
                            alt15 = 1;
                        }


                        switch (alt15) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:33: LINE_BREAK
                            {
                                LINE_BREAK28 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator540);
                                LINE_BREAK28_tree = (Object) adaptor.create(LINE_BREAK28);
                                adaptor.addChild(root_0, LINE_BREAK28_tree);


                            }
                            break;

                            default:
                                break loop15;
                        }
                    } while (true);

                    string_literal29 = (Token) input.LT(1);
                    match(input, 68, FOLLOW_68_in_seperator543);
                    string_literal29_tree = (Object) adaptor.create(string_literal29);
                    adaptor.addChild(root_0, string_literal29_tree);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:52: ( LINE_BREAK )*
                    loop16:
                    do {
                        int alt16 = 2;
                        int LA16_0 = input.LA(1);

                        if ((LA16_0 == LINE_BREAK)) {
                            alt16 = 1;
                        }


                        switch (alt16) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:216:52: LINE_BREAK
                            {
                                LINE_BREAK30 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_seperator545);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:217:1: unless_expression : 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' ;
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
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:4: ( 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end' )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:4: 'unless' boolean_expression ( 'then' | ':' | line_break ) body ( 'else' body )? 'end'
            {
                root_0 = (Object) adaptor.nil();

                string_literal31 = (Token) input.LT(1);
                match(input, UNLESS_MODIFIER, FOLLOW_UNLESS_MODIFIER_in_unless_expression555);
                string_literal31_tree = (Object) adaptor.create(string_literal31);
                adaptor.addChild(root_0, string_literal31_tree);

                pushFollow(FOLLOW_boolean_expression_in_unless_expression557);
                boolean_expression32 = boolean_expression();
                _fsp--;

                adaptor.addChild(root_0, boolean_expression32.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:32: ( 'then' | ':' | line_break )
                int alt18 = 3;
                switch (input.LA(1)) {
                    case 68: {
                        alt18 = 1;
                    }
                    break;
                    case 67: {
                        alt18 = 2;
                    }
                    break;
                    case LINE_BREAK: {
                        alt18 = 3;
                    }
                    break;
                    default:
                        NoViableAltException nvae =
                                new NoViableAltException("218:32: ( 'then' | ':' | line_break )", 18, 0, input);

                        throw nvae;
                }

                switch (alt18) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:33: 'then'
                    {
                        string_literal33 = (Token) input.LT(1);
                        match(input, 68, FOLLOW_68_in_unless_expression560);
                        string_literal33_tree = (Object) adaptor.create(string_literal33);
                        adaptor.addChild(root_0, string_literal33_tree);


                    }
                    break;
                    case 2:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:40: ':'
                    {
                        char_literal34 = (Token) input.LT(1);
                        match(input, 67, FOLLOW_67_in_unless_expression562);
                        char_literal34_tree = (Object) adaptor.create(char_literal34);
                        adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                    case 3:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:218:44: line_break
                    {
                        pushFollow(FOLLOW_line_break_in_unless_expression564);
                        line_break35 = line_break();
                        _fsp--;

                        adaptor.addChild(root_0, line_break35.getTree());

                    }
                    break;

                }

                pushFollow(FOLLOW_body_in_unless_expression576);
                body36 = body();
                _fsp--;

                adaptor.addChild(root_0, body36.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:220:10: ( 'else' body )?
                int alt19 = 2;
                int LA19_0 = input.LA(1);

                if ((LA19_0 == 66)) {
                    alt19 = 1;
                }
                switch (alt19) {
                    case 1:
                        // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:220:11: 'else' body
                    {
                        string_literal37 = (Token) input.LT(1);
                        match(input, 66, FOLLOW_66_in_unless_expression589);
                        string_literal37_tree = (Object) adaptor.create(string_literal37);
                        adaptor.addChild(root_0, string_literal37_tree);

                        pushFollow(FOLLOW_body_in_unless_expression591);
                        body38 = body();
                        _fsp--;

                        adaptor.addChild(root_0, body38.getTree());

                    }
                    break;

                }

                string_literal39 = (Token) input.LT(1);
                match(input, 61, FOLLOW_61_in_unless_expression604);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:222:1: terminal : ( SEMI | line_break );
    public final terminal_return terminal() throws RecognitionException {
        terminal_return retval = new terminal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI40 = null;
        line_break_return line_break41 = null;


        Object SEMI40_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:222:11: ( SEMI | line_break )
            int alt20 = 2;
            int LA20_0 = input.LA(1);

            if ((LA20_0 == SEMI)) {
                alt20 = 1;
            } else if ((LA20_0 == LINE_BREAK)) {
                alt20 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("222:1: terminal : ( SEMI | line_break );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:222:11: SEMI
                {
                    root_0 = (Object) adaptor.nil();

                    SEMI40 = (Token) input.LT(1);
                    match(input, SEMI, FOLLOW_SEMI_in_terminal610);

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:222:17: line_break
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_line_break_in_terminal613);
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:223:1: line_break : LINE_BREAK ;
    public final line_break_return line_break() throws RecognitionException {
        line_break_return retval = new line_break_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LINE_BREAK42 = null;

        Object LINE_BREAK42_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:224:5: ( LINE_BREAK )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:224:5: LINE_BREAK
            {
                root_0 = (Object) adaptor.nil();

                LINE_BREAK42 = (Token) input.LT(1);
                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_line_break623);

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:257:1: expression : andorExpression ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        andorExpression_return andorExpression43 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:5: ( andorExpression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:258:5: andorExpression
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_andorExpression_in_expression709);
                andorExpression43 = andorExpression();
                _fsp--;

                adaptor.addChild(root_0, andorExpression43.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:259:1: andorExpression : notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* ;
    public final andorExpression_return andorExpression() throws RecognitionException {
        andorExpression_return retval = new andorExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45 = null;
        Token LINE_BREAK46 = null;
        Token string_literal47 = null;
        Token LINE_BREAK48 = null;
        notExpression_return notExpression44 = null;

        notExpression_return notExpression49 = null;


        Object string_literal45_tree = null;
        Object LINE_BREAK46_tree = null;
        Object string_literal47_tree = null;
        Object LINE_BREAK48_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:5: ( notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )* )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:5: notExpression ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_notExpression_in_andorExpression718);
                notExpression44 = notExpression();
                _fsp--;

                adaptor.addChild(root_0, notExpression44.getTree());
                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:260:19: ( ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression )*
                loop24:
                do {
                    int alt24 = 2;
                    int LA24_0 = input.LA(1);

                    if ((LA24_0 == 69)) {
                        alt24 = 1;
                    } else if ((LA24_0 == 70)) {
                        alt24 = 1;
                    }


                    switch (alt24) {
                        case 1:
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* ) notExpression
                        {
                            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);

                            if ((LA23_0 == 69)) {
                                alt23 = 1;
                            } else if ((LA23_0 == 70)) {
                                alt23 = 2;
                            } else {
                                NoViableAltException nvae =
                                        new NoViableAltException("261:5: ( 'and' ( LINE_BREAK )* | 'or' ( LINE_BREAK )* )", 23, 0, input);

                                throw nvae;
                            }
                            switch (alt23) {
                                case 1:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:7: 'and' ( LINE_BREAK )*
                                {
                                    string_literal45 = (Token) input.LT(1);
                                    match(input, 69, FOLLOW_69_in_andorExpression728);
                                    string_literal45_tree = (Object) adaptor.create(string_literal45);
                                    root_0 = (Object) adaptor.becomeRoot(string_literal45_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:15: ( LINE_BREAK )*
                                    loop21:
                                    do {
                                        int alt21 = 2;
                                        int LA21_0 = input.LA(1);

                                        if ((LA21_0 == LINE_BREAK)) {
                                            alt21 = 1;
                                        }


                                        switch (alt21) {
                                            case 1:
                                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:261:16: LINE_BREAK
                                            {
                                                LINE_BREAK46 = (Token) input.LT(1);
                                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_andorExpression733);

                                            }
                                            break;

                                            default:
                                                break loop21;
                                        }
                                    } while (true);


                                }
                                break;
                                case 2:
                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:7: 'or' ( LINE_BREAK )*
                                {
                                    string_literal47 = (Token) input.LT(1);
                                    match(input, 70, FOLLOW_70_in_andorExpression744);
                                    string_literal47_tree = (Object) adaptor.create(string_literal47);
                                    root_0 = (Object) adaptor.becomeRoot(string_literal47_tree, root_0);

                                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:14: ( LINE_BREAK )*
                                    loop22:
                                    do {
                                        int alt22 = 2;
                                        int LA22_0 = input.LA(1);

                                        if ((LA22_0 == LINE_BREAK)) {
                                            alt22 = 1;
                                        }


                                        switch (alt22) {
                                            case 1:
                                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:262:15: LINE_BREAK
                                            {
                                                LINE_BREAK48 = (Token) input.LT(1);
                                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_andorExpression749);

                                            }
                                            break;

                                            default:
                                                break loop22;
                                        }
                                    } while (true);


                                }
                                break;

                            }

                            pushFollow(FOLLOW_notExpression_in_andorExpression764);
                            notExpression49 = notExpression();
                            _fsp--;

                            adaptor.addChild(root_0, notExpression49.getTree());

                        }
                        break;

                        default:
                            break loop24;
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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:267:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression );
    public final notExpression_return notExpression() throws RecognitionException {
        notExpression_return retval = new notExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal50 = null;
        Token LINE_BREAK51 = null;
        notExpression_return notExpression52 = null;

        ternaryIfThenElseExpression_return ternaryIfThenElseExpression53 = null;


        Object string_literal50_tree = null;
        Object LINE_BREAK51_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:268:5: ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression )
            int alt26 = 2;
            int LA26_0 = input.LA(1);

            if ((LA26_0 == 71)) {
                alt26 = 1;
            } else
            if ((LA26_0 == SYMBOL || (LA26_0 >= IF_MODIFIER && LA26_0 <= UNLESS_MODIFIER) || (LA26_0 >= ID && LA26_0 <= REGEX) || (LA26_0 >= SINGLE_QUOTE_STRING && LA26_0 <= HEREDOC_STRING) || LA26_0 == 60 || (LA26_0 >= 62 && LA26_0 <= 64) || (LA26_0 >= 72 && LA26_0 <= 74))) {
                alt26 = 2;
            } else {
                NoViableAltException nvae =
                        new NoViableAltException("267:1: notExpression : ( 'not' ( LINE_BREAK )* notExpression | ternaryIfThenElseExpression );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:268:5: 'not' ( LINE_BREAK )* notExpression
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal50 = (Token) input.LT(1);
                    match(input, 71, FOLLOW_71_in_notExpression782);
                    string_literal50_tree = (Object) adaptor.create(string_literal50);
                    root_0 = (Object) adaptor.becomeRoot(string_literal50_tree, root_0);

                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:269:4: ( LINE_BREAK )*
                    loop25:
                    do {
                        int alt25 = 2;
                        int LA25_0 = input.LA(1);

                        if ((LA25_0 == LINE_BREAK)) {
                            alt25 = 1;
                        }


                        switch (alt25) {
                            case 1:
                                // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:269:5: LINE_BREAK
                            {
                                LINE_BREAK51 = (Token) input.LT(1);
                                match(input, LINE_BREAK, FOLLOW_LINE_BREAK_in_notExpression789);

                            }
                            break;

                            default:
                                break loop25;
                        }
                    } while (true);

                    pushFollow(FOLLOW_notExpression_in_notExpression797);
                    notExpression52 = notExpression();
                    _fsp--;

                    adaptor.addChild(root_0, notExpression52.getTree());

                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:271:5: ternaryIfThenElseExpression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_ternaryIfThenElseExpression_in_notExpression803);
                    ternaryIfThenElseExpression53 = ternaryIfThenElseExpression();
                    _fsp--;

                    adaptor.addChild(root_0, ternaryIfThenElseExpression53.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:273:1: ternaryIfThenElseExpression : ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs );
    public final ternaryIfThenElseExpression_return ternaryIfThenElseExpression() throws RecognitionException {
        ternaryIfThenElseExpression_return retval = new ternaryIfThenElseExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal54 = null;
        Token string_literal55 = null;
        Token string_literal56 = null;
        Token ID59 = null;
        Token SHIFT65 = null;
        literal_return literal57 = null;

        assignment_expression_return assignment_expression58 = null;

        boolean_expression_return boolean_expression60 = null;

        block_expression_return block_expression61 = null;

        if_expression_return if_expression62 = null;

        unless_expression_return unless_expression63 = null;

        lhs_return lhs64 = null;

        rhs_return rhs66 = null;


        Object string_literal54_tree = null;
        Object string_literal55_tree = null;
        Object string_literal56_tree = null;
        Object ID59_tree = null;
        Object SHIFT65_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:3: ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs )
            int alt27 = 11;
            switch (input.LA(1)) {
                case 72: {
                    alt27 = 1;
                }
                break;
                case 73: {
                    alt27 = 2;
                }
                break;
                case 74: {
                    alt27 = 3;
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
                    alt27 = 4;
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
                        case 61:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70: {
                            alt27 = 6;
                        }
                        break;
                        case SHIFT: {
                            alt27 = 11;
                        }
                        break;
                        case 75: {
                            alt27 = 5;
                        }
                        break;
                        default:
                            NoViableAltException nvae =
                                    new NoViableAltException("273:1: ternaryIfThenElseExpression : ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs );", 27, 5, input);

                            throw nvae;
                    }

                }
                break;
                case 62:
                case 63:
                case 64: {
                    alt27 = 7;
                }
                break;
                case 60: {
                    alt27 = 8;
                }
                break;
                case IF_MODIFIER: {
                    alt27 = 9;
                }
                break;
                case UNLESS_MODIFIER: {
                    alt27 = 10;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("273:1: ternaryIfThenElseExpression : ( 'expression0' | 'expression1' | 'expression2' | literal | assignment_expression | ID | boolean_expression | block_expression | if_expression | unless_expression | lhs SHIFT rhs );", 27, 0, input);

                    throw nvae;
            }

            switch (alt27) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:3: 'expression0'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal54 = (Token) input.LT(1);
                    match(input, 72, FOLLOW_72_in_ternaryIfThenElseExpression813);
                    string_literal54_tree = (Object) adaptor.create(string_literal54);
                    adaptor.addChild(root_0, string_literal54_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:19: 'expression1'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal55 = (Token) input.LT(1);
                    match(input, 73, FOLLOW_73_in_ternaryIfThenElseExpression817);
                    string_literal55_tree = (Object) adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:35: 'expression2'
                {
                    root_0 = (Object) adaptor.nil();

                    string_literal56 = (Token) input.LT(1);
                    match(input, 74, FOLLOW_74_in_ternaryIfThenElseExpression821);
                    string_literal56_tree = (Object) adaptor.create(string_literal56);
                    adaptor.addChild(root_0, string_literal56_tree);


                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:49: literal
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_literal_in_ternaryIfThenElseExpression823);
                    literal57 = literal();
                    _fsp--;

                    adaptor.addChild(root_0, literal57.getTree());

                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:57: assignment_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_assignment_expression_in_ternaryIfThenElseExpression825);
                    assignment_expression58 = assignment_expression();
                    _fsp--;

                    adaptor.addChild(root_0, assignment_expression58.getTree());

                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:79: ID
                {
                    root_0 = (Object) adaptor.nil();

                    ID59 = (Token) input.LT(1);
                    match(input, ID, FOLLOW_ID_in_ternaryIfThenElseExpression827);
                    ID59_tree = (Object) adaptor.create(ID59);
                    adaptor.addChild(root_0, ID59_tree);


                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:82: boolean_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_boolean_expression_in_ternaryIfThenElseExpression829);
                    boolean_expression60 = boolean_expression();
                    _fsp--;

                    adaptor.addChild(root_0, boolean_expression60.getTree());

                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:102: block_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_block_expression_in_ternaryIfThenElseExpression832);
                    block_expression61 = block_expression();
                    _fsp--;

                    adaptor.addChild(root_0, block_expression61.getTree());

                }
                break;
                case 9:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:119: if_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_if_expression_in_ternaryIfThenElseExpression834);
                    if_expression62 = if_expression();
                    _fsp--;

                    adaptor.addChild(root_0, if_expression62.getTree());

                }
                break;
                case 10:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:274:133: unless_expression
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_unless_expression_in_ternaryIfThenElseExpression836);
                    unless_expression63 = unless_expression();
                    _fsp--;

                    adaptor.addChild(root_0, unless_expression63.getTree());

                }
                break;
                case 11:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:275:10: lhs SHIFT rhs
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_lhs_in_ternaryIfThenElseExpression847);
                    lhs64 = lhs();
                    _fsp--;

                    adaptor.addChild(root_0, lhs64.getTree());
                    SHIFT65 = (Token) input.LT(1);
                    match(input, SHIFT, FOLLOW_SHIFT_in_ternaryIfThenElseExpression849);
                    SHIFT65_tree = (Object) adaptor.create(SHIFT65);
                    root_0 = (Object) adaptor.becomeRoot(SHIFT65_tree, root_0);

                    pushFollow(FOLLOW_rhs_in_ternaryIfThenElseExpression852);
                    rhs66 = rhs();
                    _fsp--;

                    adaptor.addChild(root_0, rhs66.getTree());

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
    // $ANTLR end ternaryIfThenElseExpression

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;

        public Object getTree() {
            return tree;
        }
    }

    ;

    // $ANTLR start assignment_expression
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:276:1: assignment_expression : lhs '=' rhs ;
    public final assignment_expression_return assignment_expression() throws RecognitionException {
        assignment_expression_return retval = new assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal68 = null;
        lhs_return lhs67 = null;

        rhs_return rhs69 = null;


        Object char_literal68_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:4: ( lhs '=' rhs )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:277:4: lhs '=' rhs
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_lhs_in_assignment_expression862);
                lhs67 = lhs();
                _fsp--;

                adaptor.addChild(root_0, lhs67.getTree());
                char_literal68 = (Token) input.LT(1);
                match(input, 75, FOLLOW_75_in_assignment_expression864);
                char_literal68_tree = (Object) adaptor.create(char_literal68);
                root_0 = (Object) adaptor.becomeRoot(char_literal68_tree, root_0);

                pushFollow(FOLLOW_rhs_in_assignment_expression867);
                rhs69 = rhs();
                _fsp--;

                adaptor.addChild(root_0, rhs69.getTree());
                addVariable(input.toString(lhs67.start, lhs67.stop));

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:1: lhs : ID ;
    public final lhs_return lhs() throws RecognitionException {
        lhs_return retval = new lhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID70 = null;

        Object ID70_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:7: ( ID )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:278:7: ID
            {
                root_0 = (Object) adaptor.nil();

                ID70 = (Token) input.LT(1);
                match(input, ID, FOLLOW_ID_in_lhs876);
                ID70_tree = (Object) adaptor.create(ID70);
                adaptor.addChild(root_0, ID70_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:1: rhs : expression ;
    public final rhs_return rhs() throws RecognitionException {
        rhs_return retval = new rhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expression_return expression71 = null;


        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:7: ( expression )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:279:7: expression
            {
                root_0 = (Object) adaptor.nil();

                pushFollow(FOLLOW_expression_in_rhs883);
                expression71 = expression();
                _fsp--;

                adaptor.addChild(root_0, expression71.getTree());

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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT72 = null;
        Token FLOAT73 = null;
        Token ARRAY75 = null;
        Token HASH76 = null;
        Token RANGE77 = null;
        Token SYMBOL78 = null;
        Token REGEX79 = null;
        string_return string74 = null;


        Object INT72_tree = null;
        Object FLOAT73_tree = null;
        Object ARRAY75_tree = null;
        Object HASH76_tree = null;
        Object RANGE77_tree = null;
        Object SYMBOL78_tree = null;
        Object REGEX79_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:11: ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX )
            int alt28 = 8;
            switch (input.LA(1)) {
                case INT: {
                    alt28 = 1;
                }
                break;
                case FLOAT: {
                    alt28 = 2;
                }
                break;
                case SINGLE_QUOTE_STRING:
                case DOUBLE_QUOTE_STRING:
                case HEREDOC_STRING: {
                    alt28 = 3;
                }
                break;
                case ARRAY: {
                    alt28 = 4;
                }
                break;
                case HASH: {
                    alt28 = 5;
                }
                break;
                case RANGE: {
                    alt28 = 6;
                }
                break;
                case SYMBOL: {
                    alt28 = 7;
                }
                break;
                case REGEX: {
                    alt28 = 8;
                }
                break;
                default:
                    NoViableAltException nvae =
                            new NoViableAltException("283:1: literal : ( INT | FLOAT | string | ARRAY | HASH | RANGE | SYMBOL | REGEX );", 28, 0, input);

                    throw nvae;
            }

            switch (alt28) {
                case 1:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:11: INT
                {
                    root_0 = (Object) adaptor.nil();

                    INT72 = (Token) input.LT(1);
                    match(input, INT, FOLLOW_INT_in_literal893);
                    INT72_tree = (Object) adaptor.create(INT72);
                    adaptor.addChild(root_0, INT72_tree);


                }
                break;
                case 2:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:15: FLOAT
                {
                    root_0 = (Object) adaptor.nil();

                    FLOAT73 = (Token) input.LT(1);
                    match(input, FLOAT, FOLLOW_FLOAT_in_literal895);
                    FLOAT73_tree = (Object) adaptor.create(FLOAT73);
                    adaptor.addChild(root_0, FLOAT73_tree);


                }
                break;
                case 3:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:21: string
                {
                    root_0 = (Object) adaptor.nil();

                    pushFollow(FOLLOW_string_in_literal897);
                    string74 = string();
                    _fsp--;

                    adaptor.addChild(root_0, string74.getTree());

                }
                break;
                case 4:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:28: ARRAY
                {
                    root_0 = (Object) adaptor.nil();

                    ARRAY75 = (Token) input.LT(1);
                    match(input, ARRAY, FOLLOW_ARRAY_in_literal899);
                    ARRAY75_tree = (Object) adaptor.create(ARRAY75);
                    adaptor.addChild(root_0, ARRAY75_tree);


                }
                break;
                case 5:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:34: HASH
                {
                    root_0 = (Object) adaptor.nil();

                    HASH76 = (Token) input.LT(1);
                    match(input, HASH, FOLLOW_HASH_in_literal901);
                    HASH76_tree = (Object) adaptor.create(HASH76);
                    adaptor.addChild(root_0, HASH76_tree);


                }
                break;
                case 6:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:39: RANGE
                {
                    root_0 = (Object) adaptor.nil();

                    RANGE77 = (Token) input.LT(1);
                    match(input, RANGE, FOLLOW_RANGE_in_literal903);
                    RANGE77_tree = (Object) adaptor.create(RANGE77);
                    adaptor.addChild(root_0, RANGE77_tree);


                }
                break;
                case 7:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:45: SYMBOL
                {
                    root_0 = (Object) adaptor.nil();

                    SYMBOL78 = (Token) input.LT(1);
                    match(input, SYMBOL, FOLLOW_SYMBOL_in_literal905);
                    SYMBOL78_tree = (Object) adaptor.create(SYMBOL78);
                    adaptor.addChild(root_0, SYMBOL78_tree);


                }
                break;
                case 8:
                    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:283:52: REGEX
                {
                    root_0 = (Object) adaptor.nil();

                    REGEX79 = (Token) input.LT(1);
                    match(input, REGEX, FOLLOW_REGEX_in_literal907);
                    REGEX79_tree = (Object) adaptor.create(REGEX79);
                    adaptor.addChild(root_0, REGEX79_tree);


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
    // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:1: string : ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING );
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set80 = null;

        Object set80_tree = null;

        try {
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:325:10: ( SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | HEREDOC_STRING )
            // C:\\toolset\\ruby\\xruby-trunk\\src\\com\\xruby\\compiler\\parser\\Rubyv3.g:
            {
                root_0 = (Object) adaptor.nil();

                set80 = (Token) input.LT(1);
                if ((input.LA(1) >= SINGLE_QUOTE_STRING && input.LA(1) <= HEREDOC_STRING)) {
                    input.consume();
                    adaptor.addChild(root_0, adaptor.create(set80));
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
            "\1\102\2\112\2\uffff";
    static final String DFA5_acceptS =
            "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
            "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\36\uffff\1\3\3\uffff\2\3",
            "\1\4\11\uffff\2\4\3\uffff\1\1\1\2\1\uffff\7\4\14\uffff\3\4\6" +
                    "\uffff\1\4\1\3\3\4\2\3\4\uffff\4\4",
            "\1\4\11\uffff\2\4\3\uffff\1\1\1\2\1\uffff\7\4\14\uffff\3\4\6" +
                    "\uffff\1\4\1\3\3\4\2\3\4\uffff\4\4",
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
            return "()* loopback of 173:15: ( ( terminal )+ statement )*";
        }
    }

    static final String DFA17_eotS =
            "\5\uffff";
    static final String DFA17_eofS =
            "\5\uffff";
    static final String DFA17_minS =
            "\1\36\1\16\3\uffff";
    static final String DFA17_maxS =
            "\1\104\1\112\3\uffff";
    static final String DFA17_acceptS =
            "\2\uffff\1\2\1\3\1\1";
    static final String DFA17_specialS =
            "\5\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\44\uffff\1\2\1\3",
            "\1\4\11\uffff\2\4\3\uffff\1\4\1\1\1\uffff\7\4\14\uffff\3\4\6" +
                    "\uffff\7\4\1\uffff\1\3\2\uffff\4\4",
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
            return "215:1: seperator : ( ( LINE_BREAK )+ | ':' ( LINE_BREAK )* | ( LINE_BREAK )* 'then' ( LINE_BREAK )* );";
        }
    }


    public static final BitSet FOLLOW_terminal_in_program186 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_statement_list_in_program190 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_terminal_in_program192 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_statement_in_statement_list206 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_terminal_in_statement_list209 = new BitSet(new long[]{0xD038007F63004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_statement_in_statement_list212 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_expression_in_statement238 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_modifier_line_in_statement241 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_set_in_modifier_line281 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_line_break_in_modifier_line295 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_expression_in_modifier_line299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_block_expression374 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_body_in_block_expression376 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_block_expression378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_body385 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_statement_list_in_body389 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_terminal_in_body391 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_set_in_boolean_expression0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_MODIFIER_in_if_expression414 = new BitSet(new long[]{0xD038007F03004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_expression_in_if_expression419 = new BitSet(new long[]{0x0000000040000000L, 0x0000000000000018L});
    public static final BitSet FOLLOW_seperator_in_if_expression421 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000787L});
    public static final BitSet FOLLOW_body_in_if_expression434 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_if_expression437 = new BitSet(new long[]{0xD038007F03004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_expression_in_if_expression441 = new BitSet(new long[]{0x0000000040000000L, 0x0000000000000018L});
    public static final BitSet FOLLOW_seperator_in_if_expression443 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000787L});
    public static final BitSet FOLLOW_body_in_if_expression447 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000006L});
    public static final BitSet FOLLOW_66_in_if_expression461 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_body_in_if_expression465 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_if_expression478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator530 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_67_in_seperator533 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator535 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator540 = new BitSet(new long[]{0x0000000040000000L, 0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_seperator543 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_seperator545 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_UNLESS_MODIFIER_in_unless_expression555 = new BitSet(new long[]{0xC000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_boolean_expression_in_unless_expression557 = new BitSet(new long[]{0x0000000040000000L, 0x0000000000000018L});
    public static final BitSet FOLLOW_68_in_unless_expression560 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000785L});
    public static final BitSet FOLLOW_67_in_unless_expression562 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000785L});
    public static final BitSet FOLLOW_line_break_in_unless_expression564 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000785L});
    public static final BitSet FOLLOW_body_in_unless_expression576 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_unless_expression589 = new BitSet(new long[]{0xF038007F23004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_body_in_unless_expression591 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_unless_expression604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_terminal610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_break_in_terminal613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_BREAK_in_line_break623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andorExpression_in_expression709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression718 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_andorExpression728 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression733 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_70_in_andorExpression744 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_LINE_BREAK_in_andorExpression749 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_notExpression_in_andorExpression764 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000060L});
    public static final BitSet FOLLOW_71_in_notExpression782 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_LINE_BREAK_in_notExpression789 = new BitSet(new long[]{0xD038007F43004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_notExpression_in_notExpression797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryIfThenElseExpression_in_notExpression803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ternaryIfThenElseExpression813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ternaryIfThenElseExpression817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ternaryIfThenElseExpression821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ternaryIfThenElseExpression823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_ternaryIfThenElseExpression825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ternaryIfThenElseExpression827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_expression_in_ternaryIfThenElseExpression829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_expression_in_ternaryIfThenElseExpression832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expression_in_ternaryIfThenElseExpression834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unless_expression_in_ternaryIfThenElseExpression836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_ternaryIfThenElseExpression847 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SHIFT_in_ternaryIfThenElseExpression849 = new BitSet(new long[]{0xD038007F03004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_rhs_in_ternaryIfThenElseExpression852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_assignment_expression862 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_assignment_expression864 = new BitSet(new long[]{0xD038007F03004000L, 0x0000000000000781L});
    public static final BitSet FOLLOW_rhs_in_assignment_expression867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lhs876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_rhs883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_literal897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_literal899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_literal903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_literal905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_literal907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});

}