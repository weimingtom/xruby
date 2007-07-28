package com.xruby.compiler.parser;

public interface ReOptions {
    int RE_OPTION_IGNORECASE   = 1;
    int RE_OPTION_EXTENDED     = 2;
    int RE_OPTION_MULTILINE    = 4;
    int RE_OPTION_SINGLELINE   = 8;
    int RE_OPTION_POSIXLINE    = (RE_OPTION_MULTILINE | RE_OPTION_SINGLELINE);
    int RE_OPTION_LONGEST      = 16;
    int RE_MAY_IGNORECASE      = 32;
    int RE_UNICODE             = 64;
    int RE_OPTION_ONCE         = 0x80; // odd...but it is odd in ruby too.
}
