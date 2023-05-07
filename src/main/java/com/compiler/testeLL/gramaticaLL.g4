grammar gramaticaLL;

@header {
package com.compiler.testeLL;
}

// Regras da gramática
programa: listafuncoes principal;

listafuncoes: decfuncao listafuncoes 
        |;

decfuncao: tiporetorno ID '(' parametros ')' bloco;

tiporetorno: tipo | 'void';

tipo: tipobase dimensao;

tipobase: 'char' | 'float' | 'int' | 'boolean';

dimensao: '[' NUM_INT ']' dimensao
        |;

parametros: tipo ID listaparametros
          |;

listaparametros: ',' tipo ID listaparametros
                |;

principal: 'main()' bloco;

bloco: '{' listavariaveis comandos '}';

listavariaveis: tipo ID listaID ';' listavariaveis
              |;

listaID: ',' ID listaID
       |;

comandos: comando comandos
        |;

comando: leitura
       | escrita
       | atribuicao
       | funcao
       | selecao
       | enquanto
       | retorno;

leitura: 'scanf(' termoleitura novotermoleitura ')' ';';

termoleitura: ID dimensao2;

novotermoleitura: ',' termoleitura novotermoleitura
                 |;

dimensao2: '[' expressao_aditiva ']' dimensao2
         |;

escrita: 'println(' termoescrita novotermoescrita ')' ';';

termoescrita: ID dimensao2
            | CONSTANTE
            | TEXTO;

novotermoescrita: ',' termoescrita novotermoescrita
                |;

selecao: 'if(' expressao ')' bloco senao;

senao: 'else' bloco
     |;

enquanto: 'while(' expressao ')' bloco;

atribuicao: ID '=' complemento ';';

complemento: expressao
           | funcao;

funcao: 'func' ID '(' argumentos ')';

argumentos: expressao novo_argumento
          |;

novo_argumento: ',' expressao novo_argumento
              |;

retorno: 'return' expressao ';';

expressao: expressao_ou;

expressao_ou: expressao_e expressao_ou2;

expressao_ou2: '||' expressao_e expressao_ou2
             |;

expressao_e: expressao_relacional expressao_e2;

expressao_e2: '&&' expressao_relacional expressao_e2
            |;

expressao_relacional: expressao_aditiva expressao_relacional2;

expressao_relacional2: opRelacional expressao_aditiva
|;

expressao_aditiva: expressao_multiplicativa expressao_aditiva2;

expressao_aditiva2: opAditivo expressao_multiplicativa expressao_aditiva2
                  |;

expressao_multiplicativa: fator expressao_multiplicativa2;

expressao_multiplicativa2: opMultiplicativo fator expressao_multiplicativa2
                         |;

fator: sinal termo
     | TEXTO
     | '!' fator
     | '(' expressao ')';

termo: ID dimensao2
     | CONSTANTE;

sinal: '+' | '-'
     |;

CONSTANTE: NUM_INT
         | NUM_DEC;

opAditivo: '+' | '-';
opMultiplicativo: '*' | '/' | '%';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;
opRelacional : '==' | '!=' | '<' | '<=' | '>' | '>=' ;
NUM_INT : [0-9]+; 
NUM_DEC: [0-9]+ '.' [0-9]+;
TEXTO: '"' .*? '"';

/* Ignora espaços em branco */
WS : [ \t\r\n]+ -> skip ;

