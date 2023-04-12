# ANTLR
## O que é?
O ANTLR (ANother Tool for Language Recognition) é uma ferramenta de geração de analisadores de linguagem, desenvolvida por Terence Parr, que pode ser usada para analisar e interpretar linguagens complexas. Ele é baseado em uma gramática livre de contexto e é capaz de gerar código-fonte para várias linguagens de programação, como Java, C++, Python, entre outras.

O ANTLR é especialmente útil para criar compiladores, interpretadores e outras ferramentas de processamento de linguagem natural, pois permite que você defina regras gramaticais em um arquivo de gramática e gere um analisador para a sua linguagem de programação escolhida. Além disso, o ANTLR oferece recursos avançados, como suporte a expressões regulares, análise semântica e geração de árvores sintáticas.

Uma das principais vantagens do ANTLR é que ele permite que você crie gramáticas altamente expressivas e facilmente legíveis, o que pode simplificar muito o processo de análise de linguagens complexas. O ANTLR também é altamente extensível e pode ser personalizado para atender às necessidades específicas de seu projeto.

Em resumo, o ANTLR é uma ferramenta poderosa para análise de linguagem natural e geração de código-fonte, que pode ser usada para criar uma ampla variedade de ferramentas de processamento de linguagem natural, como compiladores, interpretadores e ferramentas de análise semântica.

## Como usar?
Para usar o ANTLR em um projeto Java, você precisará seguir alguns passos básicos:

1. Adicionar o Plugin no seu projeto: Você pode fazer isso configurando o Maven ou Gradle para baixar automaticamente.
```
<plugin>
  <groupId>org.antlr</groupId>
   <artifactId>antlr4-maven-plugin</artifactId>
   <version>4.12.0</version>
   <executions>
     <execution>
        <goals>
          <goal>antlr4</goal>
        </goals>
     </execution>
   </executions>
</plugin>
```
2. Adicionar a biblioteca as dependências do seu projeto: Você pode fazer isso configurando o Maven ou Gradle para baixar a biblioteca automaticamente.
```
<dependency> 
	 <groupId>org.antlr</groupId> 
	 <artifactId>antlr4</artifactId> 
	 <version>4.12.0</version> 
</dependency>
<dependency>
 	<groupId>org.antlr</groupId>
 	<artifactId>antlr4-runtime</artifactId>
 	<version>4.12.0</version>
</dependency>
```
3. Adicionar o 'antlr-4.12.0-complete.jar' na pasta do projeto.

4. Definir a gramática em um arquivo '.g4', com as informações para geração do código.

5. Executar o comando 'java -jar antlr-4.12.0-complete.jar <arquivo_gramatica>.g4', as classes serão geradas no diretório em que o comando for executado, estas poderão ser usadas no seu projeto.

## Exemplo
No código desse repositório, temos a geração de código para duas gramáticas e o exemplo delas, 'arithmetic.g4' e 'exemploSlide.g4'.

arithmetic.g4: disponível em https://github.com/antlr/grammars-v4/blob/master/arithmetic/arithmetic.g4

exemploSlide:
```
E → E + T | T
T → T * F | F
F → id |( E )
```

## Referências
#### ANTLR:
1. [https://www.antlr.org/](https://www.antlr.org/)
 
#### ANTLR Donwloads:
2. [https://www.antlr.org/download.html](https://www.antlr.org/download.html)

#### Repositório e exemplos de gramática:
3. [https://github.com/antlr](https://github.com/antlr)
