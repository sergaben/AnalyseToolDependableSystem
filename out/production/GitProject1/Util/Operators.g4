

 /*
 * An ANTLRv4 capable Java 1.8 grammar for building ASTs.

 * This grammar is published under the ...
 *
 * BSD licence
 *
 * Copyright (c) 2007-2008 by HABELITZ Software Developments
 *
 * All rights reserved.
 *
 * http://www.habelitz.com
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY HABELITZ SOFTWARE DEVELOPMENTS ('HSD') ``AS IS''
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL 'HSD' BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

grammar Operators;


@lexer::members {
/**
 *  Determines if whitespaces and comments should be preserved or thrown away.
 *
 *  If <code>true</code> whitespaces and comments will be preserved within the
 *  hidden channel, otherwise the appropriate tokens will be skiped. This is
 *  a 'little bit' expensive, of course. If only one of the two behaviours is
 *  needed forever the lexer part of the grammar should be changed by replacing
 *  the 'if-else' stuff within the approprate lexer grammar actions.
 */
public boolean preserveWhitespacesAndComments = false;
private int channel;
}

// Parser rules

//parse
// : block EOF
// ;
//
//block
// : stat*
// ;
//
//stat
// : if_stat
// | regular_stat
// | assignment
// | while_stat
// | OTHER {System.out.println("unknown char: " + OTHER);}
//// | switch_stat
//
// ;
//system_println
// : 'System.out.println'OPAR (STRING| expr) CPAR SCOL
// ;
//
//regular_stat
// : ID expr SCOL
// | ID DOT expr SCOL
// | ID DOT ID*? DOT*? expr SCOL
// ;
//
//assignment
// : ID ASSIGN expr SCOL {System.out.println(" why jump in here?");}
// ;
//
////switch_stat
//// : SWITCH expr OBRACE case_stat* DEFAULT? CBRACE
//// ;
//
//if_stat
// : IF condition_block (ELSEIF condition_block)*? (ELSE stat_block)?
// ;
////case_stat
//// : CASE atom COLON stat_block* BREAK SCOL {System.out.prinln("it is working");}
//// ;
//condition_block
// : expr stat_block
// ;
//
//stat_block
// : OBRACE block CBRACE
// | stat
// ;
//
//while_stat
// : WHILE expr stat_block
// ;
javaSource
    :   compilationUnit
    | EOF
    ;

compilationUnit
    :   annotationList
        packageDeclaration?
        importDeclaration*
        typeDecls*
    ;

typeDecls
    :   typeDeclaration
    |   SCOL
    ;

packageDeclaration
    :   PACKAGE qualifiedIdentifier SCOL
    ;

importDeclaration
    :   IMPORT STATIC? qualifiedIdentifier DOTSTAR? SCOL
    ;

typeDeclaration
    :   modifierList
        (   classTypeDeclaration
        |   interfaceTypeDeclaration
        |   enumTypeDeclaration
        |   annotationTypeDeclaration
        )
    ;

classTypeDeclaration
    :   CLASS IDENT genericTypeParameterList? classExtendsClause? implementsClause? classBody
    ;

classExtendsClause
    :   EXTENDS type
    ;

interfaceExtendsClause
    :   EXTENDS typeList
    ;

implementsClause
    :   IMPLEMENTS typeList
    ;

genericTypeParameterList
    :   LT genericTypeParameter (COMMA genericTypeParameter)* genericTypeListClosing
    ;
genericTypeListClosing  // This 'trick' is fairly dirty - if there's some time a better solution should
                        // be found to resolve the problem with nested generic type parameter lists
                        // (i.e. <T1 extends AnyType<T2>> for generic type parameters or <T1<T2>> for
                        // generic type arguments etc).
    :   GT
    |   SHIFT_LEFT
    |   BIT_SHIFT_RIGHT
    |   // nothing
    ;

genericTypeParameter
    :   IDENT bound?
    ;

bound
    :   EXTENDS type (AND type)*
    ;

enumTypeDeclaration
    :   ENUM IDENT implementsClause? enumBody
    ;

enumBody
    :   OBRACE enumScopeDeclarations CBRACE
    ;

enumScopeDeclarations
    :   enumConstants (COMMA)? enumClassScopeDeclarations?
    ;

enumClassScopeDeclarations
    :   SCOL classScopeDeclarations*
    ;

enumConstants
    :   enumConstant (COMMA enumConstant)*
    ;

enumConstant
    :   annotationList IDENT arguments? classBody?
    ;

interfaceTypeDeclaration
    :   INTERFACE IDENT genericTypeParameterList? interfaceExtendsClause? interfaceBody
    ;

typeList
    :   type (COMMA type)*
    ;

classBody
    :   OBRACE classScopeDeclarations* CBRACE
    ;

interfaceBody
    :   OBRACE interfaceScopeDeclarations* CBRACE
    ;

classScopeDeclarations
    :   block
    |   STATIC block
    |   modifierList
        (   genericTypeParameterList?
            (   type IDENT formalParameterList arrayDeclaratorList? throwsClause? (block | SCOL)
            |   VOID IDENT formalParameterList throwsClause? (block | SCOL)
            |   ident=IDENT formalParameterList throwsClause? block
            )
        |   type classFieldDeclaratorList SCOL
        )
    |   typeDeclaration
    |   SCOL
    ;

interfaceScopeDeclarations
    :   modifierList
        (   genericTypeParameterList?
            (   type IDENT formalParameterList arrayDeclaratorList? throwsClause? SCOL
            |   VOID IDENT formalParameterList throwsClause? SCOL
            )
        |   type interfaceFieldDeclaratorList SCOL
        )
    |   typeDeclaration
    |   SCOL
    ;

classFieldDeclaratorList
    :   classFieldDeclarator (COMMA classFieldDeclarator)*
    ;

classFieldDeclarator
    :   variableDeclaratorId (ASSIGN variableInitializer)?
    ;

interfaceFieldDeclaratorList
    :   interfaceFieldDeclarator (COMMA interfaceFieldDeclarator)*
    ;

interfaceFieldDeclarator
    :   variableDeclaratorId ASSIGN variableInitializer
    ;

variableDeclaratorId
    :   IDENT arrayDeclaratorList?
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayDeclarator
    :   OBRACK CBRACK
    ;

arrayDeclaratorList
    :   arrayDeclarator+
    ;

arrayInitializer
    :   OBRACE (variableInitializer (COMMA variableInitializer)* COMMA?)? CBRACE
    ;

throwsClause
    :   THROWS qualifiedIdentList
    ;

modifierList
 : modifier*
 ;

modifier
 : PUBLIC
 | PROTECTED
 | PRIVATE
 | STATIC
 | ABSTRACT
 | NATIVE
 | SYNC
 | TRANSIENT
 | VOLATILE
 | STRICTFP
 | localModifier
 ;

localModifierList
    :   localModifier*
    ;

localModifier
    :   FINAL
    |   annotation
    ;

type
    :   simpleType
    |   objectType
    ;

simpleType // including static arrays of simple type elements
    :   primitiveType arrayDeclaratorList?
    ;

objectType // including static arrays of object type reference elements
    :   qualifiedTypeIdent arrayDeclaratorList?
    ;

objectTypeSimplified
    :   qualifiedTypeIdentSimplified arrayDeclaratorList?
    ;

qualifiedTypeIdent
    :   typeIdent (DOT typeIdent)*
    ;

qualifiedTypeIdentSimplified
    :   typeIdentSimplified (DOT typeIdentSimplified)*
    ;

typeIdent
    :   IDENT genericTypeArgumentList?
    ;

typeIdentSimplified
    :   IDENT genericTypeArgumentListSimplified?
    ;

primitiveType
    :   BOOLEAN
    |   CHAR
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;

genericTypeArgumentList
    :   LT genericTypeArgument (COMMA genericTypeArgument)* genericTypeListClosing
    ;

genericTypeArgument
    :   type
    |   QUESTION genericWildcardBoundType?
    ;

genericWildcardBoundType
    :   (EXTENDS | SUPER) type
    ;

genericTypeArgumentListSimplified
    :   LT genericTypeArgumentSimplified (COMMA genericTypeArgumentSimplified)* genericTypeListClosing
    ;

genericTypeArgumentSimplified
    :   type
    |   QUESTION
    ;

qualifiedIdentList
    :   qualifiedIdentifier (COMMA qualifiedIdentifier)*
    ;

formalParameterList
    :   OPAR
        (   // Contains at least one standard argument declaration and optionally a variable argument declaration.
            formalParameterStandardDecl (COMMA formalParameterStandardDecl)* (COMMA formalParameterVarArgDecl)?
            // Contains a variable argument declaration only.
        |   formalParameterVarArgDecl
            // Contains nothing.
        |
        )
        CPAR
    ;

formalParameterStandardDecl
    :   localModifierList type variableDeclaratorId
    ;

formalParameterVarArgDecl
    :   localModifierList type ELLIPSIS variableDeclaratorId
    ;

qualifiedIdentifier
    :   (   IDENT
        )
        (   DOT ident=IDENT
        )*
    ;

// ANNOTATIONS

annotationList
    :   annotation*
    ;

annotation
    :   AT qualifiedIdentifier annotationInit?
    ;

annotationInit
    :   OPAR annotationInitializers CPAR
    ;

annotationInitializers
    :   annotationInitializer (COMMA annotationInitializer)*
    |   annotationElementValue // implicite initialization of the annotation field 'value'
    ;

annotationInitializer
    :   IDENT ASSIGN annotationElementValue
    ;

annotationElementValue
    :   annotationElementValueExpression
    |   annotation
    |   annotationElementValueArrayInitializer
    ;

annotationElementValueExpression
    :   conditionalExpression
    ;

annotationElementValueArrayInitializer
    :   OBRACE (annotationElementValue (COMMA annotationElementValue)*)? (COMMA)? CBRACE
    ;

annotationTypeDeclaration
    :   AT INTERFACE IDENT annotationBody
    ;

annotationBody
    :   OBRACE annotationScopeDeclarations* CBRACE
    ;

annotationScopeDeclarations
    :   modifierList type
        (   IDENT OPAR CPAR annotationDefaultValue? SCOL
        |   classFieldDeclaratorList SCOL
        )
    |   typeDeclaration
    ;

annotationDefaultValue
    :   DEFAULT annotationElementValue
    ;

// STATEMENTS / BLOCKS

block
    :   OBRACE blockStatement* CBRACE
    ;

blockStatement
    :   localVariableDeclaration SCOL
    |   typeDeclaration
    |   statement
    ;

localVariableDeclaration
    :   localModifierList type classFieldDeclaratorList
    ;


statement
    :   block
    |   ASSERT expr1=expression
        (   COLON expr2=expression SCOL
        |   SCOL
        )
    |   if_statement
    |   forEachLoop_forLoop_statement
    |   while_statement
    |   do_while_statement
    |   try_catch_finally_statement
    |   switch_statement
    |   SYNC parenthesizedExpression block
    |   RETURN expression? SCOL
    |   THROW expression SCOL
    |   BREAK IDENT? SCOL
    |   CONTINUE IDENT? SCOL
    |   IDENT COLON statement
    |   expression SCOL
    |   SCOL // Preserve empty statements.
    ;
if_statement
 : IF parenthesizedExpression ifStat=statement (ELSEIF parenthesizedExpression ifStat=statement)*? (ELSE elseStat=statement)?
 ;
switch_statement
 : SWITCH parenthesizedExpression OBRACE switchBlockLabels CBRACE
 ;
do_while_statement
 :DO statement WHILE parenthesizedExpression SCOL
 ;
while_statement
 : WHILE parenthesizedExpression statement
 ;
forEachLoop_forLoop_statement
: FOR OPAR ( forInit SCOL forCondition SCOL forUpdater CPAR statement | localModifierList type IDENT COLON expression CPAR statement )
;
try_catch_finally_statement
 :TRY block (catches finallyClause? | finallyClause)
 ;
catches
    :   catchClause+
    ;

catchClause
    :   CATCH OPAR formalParameterStandardDecl CPAR block
    ;

finallyClause
    :   FINALLY block
    ;

switchBlockLabels
    :   switchCaseLabels switchDefaultLabel? switchCaseLabels
    ;

switchCaseLabels
    :   switchCaseLabel*
    ;

switchCaseLabel
    :   CASE expression COLON blockStatement*
    ;

switchDefaultLabel
    :   DEFAULT COLON blockStatement*
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    |
    ;

forCondition
    :   expression?
    ;

forUpdater
    :   expressionList?
    ;

// EXPRESSIONS

parenthesizedExpression
    :   OPAR expression CPAR
    ;

expressionList
    :   expression (COMMA expression)*
    ;

expression
    :   assignmentExpression
    ;

assignmentExpression
    :   conditionalExpression
        (   (   ASSIGN
            |   PLUS_ASSIGN
            |   MINUS_ASSIGN
            |   STAR_ASSIGN
            |   DIV_ASSIGN
            |   AND_ASSIGN
            |   OR_ASSIGN
            |   XOR_ASSIGN
            |   MOD_ASSIGN
            |   SHIFT_LEFT_ASSIGN
            |   SHIFT_RIGHT_ASSIGN
            |   BIT_SHIFT_RIGHT_ASSIGN
        )
        assignmentExpression)?
    ;

conditionalExpression
    :   logicalOrExpression (QUESTION assignmentExpression COLON conditionalExpression)?
    ;

logicalOrExpression
    :   logicalAndExpression (OR_LOGICAL logicalAndExpression)*
    ;

logicalAndExpression
    :   inclusiveOrExpression (AND_LOGICAL inclusiveOrExpression)*
    ;

inclusiveOrExpression
    :   exclusiveOrExpression (OR exclusiveOrExpression)*
    ;

exclusiveOrExpression
    :   andExpression (XOR andExpression)*
    ;

andExpression
    :   equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    :   instanceOfExpression
        (   (   EQ
            |   NEQ
            )
            instanceOfExpression
        )*
    ;

instanceOfExpression
    :   relationalExpression (INSTANCEOF type)?
    ;

relationalExpression
    :   shiftExpression
        (   (   LTEQ
            |   GTEQ
            |   LT
            |   GT
            )
            shiftExpression
        )*
    ;

shiftExpression
    :   additiveExpression
        (   (   BIT_SHIFT_RIGHT
            |   SHIFT_RIGHT
            |   SHIFT_LEFT
            )
            additiveExpression
        )*
    ;

additiveExpression
    :   multiplicativeExpression
        (   (   PLUS
            |   MINUS
            )
            multiplicativeExpression
        )*
    ;

multiplicativeExpression
    :   unaryExpression
        (   (   MULT
            |   DIV
            |   MOD
            )
            unaryExpression
        )*
    ;

unaryExpression
    :   PLUS unaryExpression
    |   MINUS unaryExpression
    |   INCREMENT postfixedExpression
    |   DECREMENT postfixedExpression
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :   NOT unaryExpression
    |   LOGICAL_NOT unaryExpression
    |   OPAR type CPAR unaryExpression
    |   postfixedExpression
    ;

postfixedExpression
        // At first resolve the primary expression ...
    :   (   primaryExpression
        )
        // ... and than the optional things that may follow a primary expression 0 or more times.
        (   outerDot=DOT
            (   (   genericTypeArgumentListSimplified?  // Note: generic type arguments are only valid for method calls, i.e. if there
                                                        //       is an argument list.
                    IDENT
                )
                (   arguments
                )?
            |   THIS
            |   Super=SUPER arguments
            |   (   SUPER innerDot=DOT IDENT
                )
                (   arguments
                )?
            |   innerNewExpression
            )
        |   OBRACK expression CBRACK
        )*
        // At the end there may follow a post increment/decrement.
        (   INCREMENT
        |   DECREMENT
        )?
    ;

primaryExpression
    :   parenthesizedExpression
    |   literal
    |   newExpression
    |   qualifiedIdentExpression
    |   genericTypeArgumentListSimplified
        (   SUPER
            (   arguments
            |   DOT IDENT arguments
            )
        |   IDENT arguments
        |   THIS arguments
        )
    |   (   THIS
        )
        (   arguments
        )?
    |   SUPER arguments
    |   (   SUPER DOT IDENT
        )
        (   arguments
        |
        )
    |   (   primitiveType
        )
        (   arrayDeclarator
        )*
        DOT CLASS
    |   VOID DOT CLASS
    ;

qualifiedIdentExpression
        // The qualified identifier itself is the starting point for this rule.
    :   (   qualifiedIdentifier
        )
        // And now comes the stuff that may follow the qualified identifier.
        (   (   arrayDeclarator
            )+
            (   DOT CLASS
            )
        |   arguments
        |   outerDot=DOT
            (   CLASS
            |   genericTypeArgumentListSimplified
                (   Super=SUPER arguments
                |   SUPER innerDot=DOT IDENT arguments
                |   IDENT arguments
                )
            |   THIS
            |   Super=SUPER arguments
            |   innerNewExpression
            )
        )?
    ;

newExpression
    :   NEW
        (   primitiveType newArrayConstruction      // new static array of primitive type elements
        |   genericTypeArgumentListSimplified? qualifiedTypeIdentSimplified
            (   newArrayConstruction                // new static array of object type reference elements
            |   arguments classBody?                // new object type via constructor invocation
            )
        )
    ;

innerNewExpression // something like 'InnerType innerType = outer.new InnerType();'
    :   NEW genericTypeArgumentListSimplified? IDENT arguments classBody?
    ;

newArrayConstruction
    :   arrayDeclaratorList arrayInitializer
    ;

arguments
    :   OPAR expressionList? CPAR
    ;

literal
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |   FLOATING_POINT_LITERAL
    |   CHARACTER_LITERAL
    |   STRING_LITERAL
    |   TRUE
    |   FALSE
    |   NULL
    ;
//expr
// : MINUS expr                           #unaryMinusExpr
// | NOT expr                             #notExpr
// | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
// | expr op=(PLUS | MINUS) expr          #additiveExpr
// | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
// | expr op=(EQ | NEQ) expr              #equalityExpr
// | expr AND expr                        #andExpr
// | expr OR expr                         #orExpr
// | atom                                 #atomExpr
// ;
//
//atom
// : OPAR expr CPAR #parExpr
// | (WHOLENUMBER | DECIMALNUMBER)  #numberAtom
// | (TRUE | FALSE) #booleanAtom
// | ID             #idAtom
// | STRING         #stringAtom
// | NULL            #nilAtom
// ;



// ---------------------- Lexer rules ------------------------

//MULTILINEORSINGLELINECOMMENTDELIMITER
//:('//'|'/*'|'/**') . ('*/'?)-> skip
//;

 SINGLELINECOMMENT
  :'//'~('\r' | '\n')*
  {
          if (!preserveWhitespacesAndComments) {
              skip();
          } else {
              channel = HIDDEN;
          }
      }
  ;
 BLOCKCOMMENT
  : '/*'.*? '*/'
  {
          if (!preserveWhitespacesAndComments) {
              skip();
          } else {
              channel = HIDDEN;
          }
      }
  ;
JAVADOCCOMMENT
  : '/**' .*? '*/'
  {
          if (!preserveWhitespacesAndComments) {
              skip();
          } else {
              channel = HIDDEN;
          }
      }
  ;
HEX_LITERAL : '0' ('x'|'X') HEX_DIGIT+ INTEGER_TYPE_SUFFIX? ;

DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) INTEGER_TYPE_SUFFIX? ;

OCTAL_LITERAL : '0' ('0'..'7')+ INTEGER_TYPE_SUFFIX? ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
INTEGER_TYPE_SUFFIX : ('l'|'L') ;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+
        (
            DOT ('0'..'9')* EXPONENT? FLOAT_TYPE_SUFFIX?
        |   EXPONENT FLOAT_TYPE_SUFFIX?
        |   FLOAT_TYPE_SUFFIX
        )
    |   DOT ('0'..'9')+ EXPONENT? FLOAT_TYPE_SUFFIX?
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FLOAT_TYPE_SUFFIX : ('f'|'F'|'d'|'D') ;

CHARACTER_LITERAL
    :   '\'' ( ESCAPE_SEQUENCE | ~('\''|'\\') ) '\''
    ;

STRING_LITERAL
    :  '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"'
    ;

fragment
ESCAPE_SEQUENCE
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'//"'|'\''|'\\')
    |   UNICODE_ESCAPE
    |   OCTAL_ESCAPE
    ;

fragment
OCTAL_ESCAPE
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESCAPE
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

// operators and other special chars
AT:'@';
UNDERSCORE:'_';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
OR_LOGICAL : '||';
AND_LOGICAL : '&&';
QUESTION:'?';
COLON:':';
INCREMENT:'++';
DECREMENT:'--';
LOGICAL_NOT : '!';
MINUS : '-';
MULT : '*';
DIV : ('/');
MOD : '%';
MOD_ASSIGN:'%=';
PLUS : '+';
NOT:'~';
SHIFT_LEFT:'<<';
SHIFT_RIGHT:'>>';
BIT_SHIFT_RIGHT:'>>>';
BIT_SHIFT_RIGHT_ASSIGN:'>>>=';
SHIFT_LEFT_ASSIGN:'<<=';
SHIFT_RIGHT_ASSIGN:'>>=';
AND:'&';
AND_ASSIGN:'&=';
OR:'|';
OR_ASSIGN:'|=';
XOR:'^';
XOR_ASSIGN:'^=';
SCOL : ';';
ASSIGN : '=';
PLUS_ASSIGN:'+=';
MINUS_ASSIGN:'-=';
DIV_ASSIGN:'/=';
STAR_ASSIGN:'*=';
ARROWLAMBDA:'->';
DOUBLECOLON:'::';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
DOT:'.';
DOTSTAR:'.*';
TRUE : 'true';
FALSE : 'false';
NULL : 'null';
COMMA :',';
ELLIPSIS:'...';
OBRACK: '[';
CBRACK: ']';

// Java Keywords
ABSTRACT: 'abstract';
CONTINUE:'continue';
FOR:'for';
NEW:'new';
SWITCH:'switch';
ASSERT:'assert';
DEFAULT:'default';
GOTO:'goto';
PACKAGE:'package';
SYNC:'synchronized';
BOOLEAN:'boolean';
DO:'do';
IF : 'if';
ELSEIF:'else if';
PRIVATE:'private';
THIS:'this';
BREAK:'break';
DOUBLE:'double';
IMPLEMENTS:'double';
PROTECTED:'protected';
THROW:'throw';
BYTE:'byte';
ELSE : 'else';
IMPORT:'import';
PUBLIC:'public';
THROWS:'throws';
CASE:'case';
ENUM:'enum';
INSTANCEOF:'instanceof';
RETURN:'return';
TRANSIENT:'transient';
CATCH:'catch';
EXTENDS:'extends';
INT:'int';
SHORT:'short';
TRY:'try';
CHAR:'char';
FINAL:'final';
INTERFACE:'interface';
STATIC:'static';
VOID:'void';
CLASS:'class';
FINALLY:'finally';
LONG:'long';
STRICTFP:'strictfp';
VOLATILE:'volatile';
CONST:'const';
FLOAT:'float';
NATIVE:'native';
SUPER:'super';
WHILE : 'while';
//////////////////
//ID
// : [a-zA-Z][a-zA-Z0-9]*
// ;

WHOLENUMBER
 : [0-9]+
 ;

DECIMALNUMBER
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
IDENT
    :  JAVA_ID_START (JAVA_ID_PART)*
    ;

fragment
JAVA_ID_START
    :  '\u0024'
    |  '\u0041'..'\u005a'
    |  '\u005f'
    |  '\u0061'..'\u007a'
    |  '\u00c0'..'\u00d6'
    |  '\u00d8'..'\u00f6'
    |  '\u00f8'..'\u00ff'
    |  '\u0100'..'\u1fff'
    |  '\u3040'..'\u318f'
    |  '\u3300'..'\u337f'
    |  '\u3400'..'\u3d2d'
    |  '\u4e00'..'\u9fff'
    |  '\uf900'..'\ufaff'
    ;

fragment
JAVA_ID_PART
    :  JAVA_ID_START
    |  '\u0030'..'\u0039'
    ;

SPACE
  : [ \t\r\n] -> skip
  ;

OTHER
 : .
 ;