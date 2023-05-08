grammar gramaticaLR;

@header {
package com.compiler.javaantlr;
}

programa: secaoFuncoes principal;

secaoFuncoes: listaFuncoes | ;

listaFuncoes: decFuncao | listaFuncoes decFuncao;

decFuncao: tipoRetorno ID '(' parametros ')' bloco;

tipoRetorno: tipo | 'void';

tipo: tipoBase dimensao?;

tipoBase: 'char' | 'float' | 'int' | 'boolean';

dimensao: '[' NUM_INT ']'*;

parametros: listaParametros | ;

listaParametros: tipo ID (',' tipo ID)*;

principal: 'main' '(' ')' bloco;

bloco: '{' secaoVariaveis secaoComandos '}';

secaoVariaveis: listaVariaveis | ;

listaVariaveis: tipo listaID ';' | listaVariaveis tipo listaID ';';

listaID: ID (',' ID)*;

secaoComandos: listaComandos | ;

listaComandos: comando | listaComandos comando;

comando: leitura | escrita | atribuicao | funcao | selecao | enquanto | retorno;

leitura: 'scanf' '(' listaTermoLeitura ')' ';';

listaTermoLeitura: termoLeitura (',' termoLeitura)*;

termoLeitura: ID dimensao2?;

dimensao2: '[' exprAditiva ']'* | ;

escrita: 'println' '(' listaTermoEscrita ')' ';';

listaTermoEscrita: termoEscrita (',' termoEscrita)*;

termoEscrita: ID dimensao2? | constante | TEXTO;

selecao: 'if' '(' expressao ')' bloco senao?;

senao: 'else' bloco | ;

enquanto: 'while' '(' expressao ')' bloco;

atribuicao: ID '=' complemento ';';

complemento: expressao | funcao;

funcao: 'func' ID '(' argumentos ')';

argumentos: listaArgumentos | ;

listaArgumentos: expressao (',' expressao)*;

retorno: 'return' expressao ';';

expressao: exprOu;

exprOu: exprE ('||' exprE)*;

exprE: exprRelacional ('&&' exprRelacional)*;

exprRelacional: exprAditiva (opRelacional exprAditiva)?;

exprAditiva: exprMultiplicativa (opAditivo exprMultiplicativa)*;

opAditivo: '+' | '-';

exprMultiplicativa: fator (opMultiplicativo fator)*;

opMultiplicativo: '*' | '/' | '%';

fator: (sinal ID dimensao2) | (sinal constante) | TEXTO | '!' fator | '(' expressao ')';

constante: NUM_INT | NUM_DEC;

sinal: '+' | '-' | ;

ID: [a-zA-Z_] [a-zA-Z0-9_]*;

opRelacional : '==' | '!=' | '<' | '<=' | '>' | '>=' ;

NUM_INT : [0-9]+; 

NUM_DEC: [0-9]+ '.' [0-9]+;

TEXTO: '"' .*? '"';

/* Ignora espaços em branco */
WS : [ \t\r\n]+ -> skip ;
