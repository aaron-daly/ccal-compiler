# ccal-compiler

## 1. Overview

The language is not case sensitive. A nonterminal, X, is represented by enclosing it in angle brackets, e.g. hXi. A terminal is represented without angle brackets. A bold typeface is used to represent terminal symbols in the language and reserved words, whereas a non-bold typeface is used for symbols that are used to group terminals and nonterminals together. Source code is kept in files with the .ccl extension, e.g. hello world.ccl.

## 2. Syntax

The reserved words in the language are var, const, return, integer, boolean, void, main, if, else, while and skip. The following are tokens in the language: , ; : = { } ( ) + - ∼ || && == != < <= > >=. Integers are represented by a string of one or more digits (‘0’-‘9’) that do not start with the digit ‘0’, but may start with a minus sign (‘-’), e.g. 123, -456. Identifiers are represented by a string of letters, digits or underscore character (‘ ’) beginning with a letter. Identifiers cannot be reserved words. Comments can appear between any two tokens. There are two forms of comment: one is delimited by /* and */ and can be nested; the other begins with // and is delimited by the end of line and this type of comments may not be nested.

## 3. Semantics

Declaration made outside a function (including main) are global in scope. Declarations inside a function are local in scope to that function. Function arguments are passed-by-value. Variables or constants cannot be declared using the void type. The skip statement does nothing.
