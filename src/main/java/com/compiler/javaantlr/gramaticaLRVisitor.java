// Generated from C:/Users/mauricio.rodrigues/OneDrive - NDD.Tech/Documentos/GitHub/JavaANTLR/src/main/java/com/compiler/javaantlr\gramaticaLR.g4 by ANTLR 4.12.0

package com.compiler.javaantlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaLRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaLRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaLRParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#secaoFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecaoFuncoes(gramaticaLRParser.SecaoFuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaFuncoes(gramaticaLRParser.ListaFuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#decFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFuncao(gramaticaLRParser.DecFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#tipoRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoRetorno(gramaticaLRParser.TipoRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(gramaticaLRParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#tipoBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBase(gramaticaLRParser.TipoBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(gramaticaLRParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(gramaticaLRParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(gramaticaLRParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(gramaticaLRParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(gramaticaLRParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecaoVariaveis(gramaticaLRParser.SecaoVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVariaveis(gramaticaLRParser.ListaVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaID(gramaticaLRParser.ListaIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#secaoComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecaoComandos(gramaticaLRParser.SecaoComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComandos(gramaticaLRParser.ListaComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(gramaticaLRParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(gramaticaLRParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaTermoLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaTermoLeitura(gramaticaLRParser.ListaTermoLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#termoLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoLeitura(gramaticaLRParser.TermoLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#dimensao2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao2(gramaticaLRParser.Dimensao2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrita(gramaticaLRParser.EscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaTermoEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaTermoEscrita(gramaticaLRParser.ListaTermoEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#termoEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoEscrita(gramaticaLRParser.TermoEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(gramaticaLRParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(gramaticaLRParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(gramaticaLRParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(gramaticaLRParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#complemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplemento(gramaticaLRParser.ComplementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(gramaticaLRParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(gramaticaLRParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(gramaticaLRParser.ListaArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(gramaticaLRParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(gramaticaLRParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#exprOu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOu(gramaticaLRParser.ExprOuContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#exprE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprE(gramaticaLRParser.ExprEContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#exprRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(gramaticaLRParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#exprAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAditiva(gramaticaLRParser.ExprAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#opAditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAditivo(gramaticaLRParser.OpAditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#exprMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiplicativa(gramaticaLRParser.ExprMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMultiplicativo(gramaticaLRParser.OpMultiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(gramaticaLRParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(gramaticaLRParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#sinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinal(gramaticaLRParser.SinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaLRParser#opRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRelacional(gramaticaLRParser.OpRelacionalContext ctx);
}