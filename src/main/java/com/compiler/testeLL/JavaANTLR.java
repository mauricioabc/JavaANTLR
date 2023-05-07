package com.compiler.testeLL;

import com.compiler.javaantlr.*;
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
        
        CharStream input = CharStreams.fromString("main(){ int x, y; scanf(x); y = 3 * x; println(y); }");
        
        // Cria um lexer a partir do CharStream
        gramaticaLLLexer lexer = new gramaticaLLLexer(input);
        
        // Cria um CommonTokenStream a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Cria um parser a partir do CommonTokenStream
        gramaticaLLParser parser = new gramaticaLLParser(tokens);
        
        // Cria a árvore de análise sintática a partir do parser
        ParseTree tree = parser.programa();
        
        // Imprime a árvore de análise sintática
        System.out.println(tree.toStringTree(parser));
        
    }
}
