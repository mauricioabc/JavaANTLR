package testesGramatica;

import com.compiler.testeLL.gramaticaLLLexer;
import com.compiler.testeLL.gramaticaLLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mauricio.rodrigues
 */
public class testeGramaticaLL {
    
    public testeGramaticaLL() {
    }
    
    //Testes Aula 13 - Lista de Exercícios
    @Test
    public void testaExercicio_1(){
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
    
    @Test
    public void testaExercicio_2(){
        CharStream input = CharStreams.fromString("main(){ int x; char y; scanf(x); y = 2 * x; println(y); }");
        
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
    
    @Test
    public void testaExercicio_3(){
        CharStream input = CharStreams.fromString("int soma(int a, int b){ return a + b; } main(){ int x, y, z; x = 2; scanf(y); z = func soma(x,y); println(z); }");
        
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
    
    @Test
    public void testaExercicio_4(){
        CharStream input = CharStreams.fromString("main(){ int x, y; scanf(x); y = 2 * x; println(y); }");
        
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
    
    @Test
    public void testaExercicio_5(){
        CharStream input = CharStreams.fromString("main(){ int x; char y; scanf(x); y = 2 * x; println(y); }");
        
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
    
    @Test
    public void testaExercicio_6(){
        CharStream input = CharStreams.fromString("int soma(int a, int b){ return a + b; } main(){ int x, y, z; x = 2; scanf(y); z = func soma(x,y); println(z); }");
        
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
    
    @Test
    public void testaExercicio_7(){
        CharStream input = CharStreams.fromString("int soma(int a, int b){ return a + b; } main(){ int x, y, z; x = \"Dois\"; scanf(y); z = func soma(x,y); println(z); }");
        
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
