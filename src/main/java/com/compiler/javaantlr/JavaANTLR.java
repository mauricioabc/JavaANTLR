package com.compiler.javaantlr;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 *
 * @author mauricio.rodrigues
 */
public class JavaANTLR {

    public static void main(String[] args) throws IOException {
        System.out.println("-- Java Parser --");
        
        // Cria um CharStream a partir da entrada
        //CharStream input = CharStreams.fromStream(System.in);
        
        CharStream input = CharStreams.fromString("2*(2+2)");
        
        // Cria um lexer a partir do CharStream
        arithmeticLexer lexer = new arithmeticLexer(input);
        
        // Cria um CommonTokenStream a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Cria um parser a partir do CommonTokenStream
        arithmeticParser parser = new arithmeticParser(tokens);
        
        // Cria a árvore de análise sintática a partir do parser
        ParseTree tree = parser.expression();
        
        // Imprime a árvore de análise sintática
        System.out.println(tree.toStringTree(parser));
        
    }
}
