/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testesGramatica;

import com.compiler.javaantlr.arithmeticLexer;
import com.compiler.javaantlr.arithmeticParser;
import com.compiler.javaantlr.exemploSlideLexer;
import com.compiler.javaantlr.exemploSlideParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mauricio.rodrigues
 */
public class testeGramatica {
    
    public testeGramatica() {
    }
    
    //Testes Corretos
    @Test
    public void testaArithmetic_1(){
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
    
    @Test
    public void testaExemploSlide_1(){
        CharStream input = CharStreams.fromString("id*(id+id)");
        
        // Cria um lexer a partir do CharStream
        exemploSlideLexer lexer = new exemploSlideLexer(input);
        
        // Cria um CommonTokenStream a partir do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Cria um parser a partir do CommonTokenStream
        exemploSlideParser parser = new exemploSlideParser(tokens);
        
        // Cria a árvore de análise sintática a partir do parser
        ParseTree tree = parser.expr();
        
        // Imprime a árvore de análise sintática
        System.out.println(tree.toStringTree(parser));
    }
    
}
