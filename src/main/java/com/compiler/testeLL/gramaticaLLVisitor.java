// Generated from C:/Users/mauricio.rodrigues/OneDrive - NDD.Tech/Documentos/GitHub/JavaANTLR/src/main/java/com/compiler/testeLL\gramaticaLL.g4 by ANTLR 4.12.0
package com.compiler.testeLL;

package com.compiler.testeLL;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaLLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaLLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaLLParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#listafuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListafuncoes(gramaticaLLParser.ListafuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#decfuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfuncao(gramaticaLLParser.DecfuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#tiporetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiporetorno(gramaticaLLParser.TiporetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(gramaticaLLParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#tipobase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipobase(gramaticaLLParser.TipobaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(gramaticaLLParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(gramaticaLLParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#listaparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaparametros(gramaticaLLParser.ListaparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(gramaticaLLParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(gramaticaLLParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#listavariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListavariaveis(gramaticaLLParser.ListavariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#listaID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaID(gramaticaLLParser.ListaIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(gramaticaLLParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(gramaticaLLParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(gramaticaLLParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#termoleitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoleitura(gramaticaLLParser.TermoleituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#novotermoleitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovotermoleitura(gramaticaLLParser.NovotermoleituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#dimensao2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao2(gramaticaLLParser.Dimensao2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrita(gramaticaLLParser.EscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#termoescrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoescrita(gramaticaLLParser.TermoescritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#novotermoescrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovotermoescrita(gramaticaLLParser.NovotermoescritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(gramaticaLLParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(gramaticaLLParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(gramaticaLLParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(gramaticaLLParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#complemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplemento(gramaticaLLParser.ComplementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(gramaticaLLParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(gramaticaLLParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#novo_argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovo_argumento(gramaticaLLParser.Novo_argumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(gramaticaLLParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(gramaticaLLParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_ou}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_ou(gramaticaLLParser.Expressao_ouContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_ou2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_ou2(gramaticaLLParser.Expressao_ou2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_e(gramaticaLLParser.Expressao_eContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_e2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_e2(gramaticaLLParser.Expressao_e2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_relacional(gramaticaLLParser.Expressao_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_relacional2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_relacional2(gramaticaLLParser.Expressao_relacional2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_aditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aditiva(gramaticaLLParser.Expressao_aditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_aditiva2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aditiva2(gramaticaLLParser.Expressao_aditiva2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_multiplicativa(gramaticaLLParser.Expressao_multiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#expressao_multiplicativa2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_multiplicativa2(gramaticaLLParser.Expressao_multiplicativa2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(gramaticaLLParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(gramaticaLLParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#sinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinal(gramaticaLLParser.SinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#opAditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAditivo(gramaticaLLParser.OpAditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMultiplicativo(gramaticaLLParser.OpMultiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLLParser#opRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRelacional(gramaticaLLParser.OpRelacionalContext ctx);
}