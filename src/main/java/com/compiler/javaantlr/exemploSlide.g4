/**
 * Author:  mauricio.rodrigues
 * Created: 12 de abr. de 2023
 */

grammar exemploSlide;

/* Regra inicial */
start : expr ;

/* Regra para expressões */
expr : expr '+' term
     | term ;

/* Regra para termos */
term : term '*' factor
     | factor ;

/* Regra para fatores */
factor : ID
       | '(' expr ')' ;

/* Token para identificadores */
ID : [a-zA-Z]+ ;

/* Ignora espaços em branco */
WS : [ \t\r\n]+ -> skip ;