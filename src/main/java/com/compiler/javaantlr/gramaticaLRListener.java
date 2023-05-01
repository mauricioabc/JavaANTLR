package com.compiler.javaantlr;

// Generated from gramaticaLR.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaLRParser}.
 */
public interface gramaticaLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaLRParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaLRParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#secaoFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterSecaoFuncoes(gramaticaLRParser.SecaoFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#secaoFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitSecaoFuncoes(gramaticaLRParser.SecaoFuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterListaFuncoes(gramaticaLRParser.ListaFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitListaFuncoes(gramaticaLRParser.ListaFuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#decFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDecFuncao(gramaticaLRParser.DecFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#decFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDecFuncao(gramaticaLRParser.DecFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterTipoRetorno(gramaticaLRParser.TipoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitTipoRetorno(gramaticaLRParser.TipoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaLRParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaLRParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#tipoBase}.
	 * @param ctx the parse tree
	 */
	void enterTipoBase(gramaticaLRParser.TipoBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#tipoBase}.
	 * @param ctx the parse tree
	 */
	void exitTipoBase(gramaticaLRParser.TipoBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(gramaticaLRParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(gramaticaLRParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gramaticaLRParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gramaticaLRParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(gramaticaLRParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(gramaticaLRParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(gramaticaLRParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(gramaticaLRParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(gramaticaLRParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(gramaticaLRParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterSecaoVariaveis(gramaticaLRParser.SecaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitSecaoVariaveis(gramaticaLRParser.SecaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaVariaveis(gramaticaLRParser.ListaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaVariaveis(gramaticaLRParser.ListaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaID}.
	 * @param ctx the parse tree
	 */
	void enterListaID(gramaticaLRParser.ListaIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaID}.
	 * @param ctx the parse tree
	 */
	void exitListaID(gramaticaLRParser.ListaIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#secaoComandos}.
	 * @param ctx the parse tree
	 */
	void enterSecaoComandos(gramaticaLRParser.SecaoComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#secaoComandos}.
	 * @param ctx the parse tree
	 */
	void exitSecaoComandos(gramaticaLRParser.SecaoComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(gramaticaLRParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(gramaticaLRParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(gramaticaLRParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(gramaticaLRParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(gramaticaLRParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(gramaticaLRParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaTermoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterListaTermoLeitura(gramaticaLRParser.ListaTermoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaTermoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitListaTermoLeitura(gramaticaLRParser.ListaTermoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#termoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterTermoLeitura(gramaticaLRParser.TermoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#termoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitTermoLeitura(gramaticaLRParser.TermoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void enterDimensao2(gramaticaLRParser.Dimensao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void exitDimensao2(gramaticaLRParser.Dimensao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(gramaticaLRParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(gramaticaLRParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaTermoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterListaTermoEscrita(gramaticaLRParser.ListaTermoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaTermoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitListaTermoEscrita(gramaticaLRParser.ListaTermoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#termoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterTermoEscrita(gramaticaLRParser.TermoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#termoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitTermoEscrita(gramaticaLRParser.TermoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(gramaticaLRParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(gramaticaLRParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(gramaticaLRParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(gramaticaLRParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(gramaticaLRParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(gramaticaLRParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(gramaticaLRParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(gramaticaLRParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#complemento}.
	 * @param ctx the parse tree
	 */
	void enterComplemento(gramaticaLRParser.ComplementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#complemento}.
	 * @param ctx the parse tree
	 */
	void exitComplemento(gramaticaLRParser.ComplementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(gramaticaLRParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(gramaticaLRParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(gramaticaLRParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(gramaticaLRParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(gramaticaLRParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(gramaticaLRParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(gramaticaLRParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(gramaticaLRParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaLRParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaLRParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#exprOu}.
	 * @param ctx the parse tree
	 */
	void enterExprOu(gramaticaLRParser.ExprOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#exprOu}.
	 * @param ctx the parse tree
	 */
	void exitExprOu(gramaticaLRParser.ExprOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#exprE}.
	 * @param ctx the parse tree
	 */
	void enterExprE(gramaticaLRParser.ExprEContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#exprE}.
	 * @param ctx the parse tree
	 */
	void exitExprE(gramaticaLRParser.ExprEContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(gramaticaLRParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(gramaticaLRParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#exprAditiva}.
	 * @param ctx the parse tree
	 */
	void enterExprAditiva(gramaticaLRParser.ExprAditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#exprAditiva}.
	 * @param ctx the parse tree
	 */
	void exitExprAditiva(gramaticaLRParser.ExprAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#opAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOpAditivo(gramaticaLRParser.OpAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#opAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOpAditivo(gramaticaLRParser.OpAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#exprMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiplicativa(gramaticaLRParser.ExprMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#exprMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiplicativa(gramaticaLRParser.ExprMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOpMultiplicativo(gramaticaLRParser.OpMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOpMultiplicativo(gramaticaLRParser.OpMultiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaLRParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaLRParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(gramaticaLRParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(gramaticaLRParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#sinal}.
	 * @param ctx the parse tree
	 */
	void enterSinal(gramaticaLRParser.SinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#sinal}.
	 * @param ctx the parse tree
	 */
	void exitSinal(gramaticaLRParser.SinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLRParser#opRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOpRelacional(gramaticaLRParser.OpRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLRParser#opRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOpRelacional(gramaticaLRParser.OpRelacionalContext ctx);
}