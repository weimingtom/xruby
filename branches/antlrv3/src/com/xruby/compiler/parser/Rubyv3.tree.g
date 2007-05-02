tree grammar Rubyv3Tree;

options {
tokenVocab=Rubyv3; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
}

program	:	.*;



