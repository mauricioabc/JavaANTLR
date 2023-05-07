// Generated from gramaticaLL.g4 by ANTLR 4.12.0

package com.compiler.testeLL;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaLLParser}.
 */
public interface gramaticaLLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaLLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaLLParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#listafuncoes}.
	 * @param ctx the parse tree
	 */
	void enterListafuncoes(gramaticaLLParser.ListafuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#listafuncoes}.
	 * @param ctx the parse tree
	 */
	void exitListafuncoes(gramaticaLLParser.ListafuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#decfuncao}.
	 * @param ctx the parse tree
	 */
	void enterDecfuncao(gramaticaLLParser.DecfuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#decfuncao}.
	 * @param ctx the parse tree
	 */
	void exitDecfuncao(gramaticaLLParser.DecfuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#tiporetorno}.
	 * @param ctx the parse tree
	 */
	void enterTiporetorno(gramaticaLLParser.TiporetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#tiporetorno}.
	 * @param ctx the parse tree
	 */
	void exitTiporetorno(gramaticaLLParser.TiporetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaLLParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaLLParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#tipobase}.
	 * @param ctx the parse tree
	 */
	void enterTipobase(gramaticaLLParser.TipobaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#tipobase}.
	 * @param ctx the parse tree
	 */
	void exitTipobase(gramaticaLLParser.TipobaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(gramaticaLLParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(gramaticaLLParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gramaticaLLParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gramaticaLLParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#listaparametros}.
	 * @param ctx the parse tree
	 */
	void enterListaparametros(gramaticaLLParser.ListaparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#listaparametros}.
	 * @param ctx the parse tree
	 */
	void exitListaparametros(gramaticaLLParser.ListaparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(gramaticaLLParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(gramaticaLLParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(gramaticaLLParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(gramaticaLLParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#listavariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListavariaveis(gramaticaLLParser.ListavariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#listavariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListavariaveis(gramaticaLLParser.ListavariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#listaID}.
	 * @param ctx the parse tree
	 */
	void enterListaID(gramaticaLLParser.ListaIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#listaID}.
	 * @param ctx the parse tree
	 */
	void exitListaID(gramaticaLLParser.ListaIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(gramaticaLLParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(gramaticaLLParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(gramaticaLLParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(gramaticaLLParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(gramaticaLLParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(gramaticaLLParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#termoleitura}.
	 * @param ctx the parse tree
	 */
	void enterTermoleitura(gramaticaLLParser.TermoleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#termoleitura}.
	 * @param ctx the parse tree
	 */
	void exitTermoleitura(gramaticaLLParser.TermoleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#novotermoleitura}.
	 * @param ctx the parse tree
	 */
	void enterNovotermoleitura(gramaticaLLParser.NovotermoleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#novotermoleitura}.
	 * @param ctx the parse tree
	 */
	void exitNovotermoleitura(gramaticaLLParser.NovotermoleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void enterDimensao2(gramaticaLLParser.Dimensao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void exitDimensao2(gramaticaLLParser.Dimensao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(gramaticaLLParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(gramaticaLLParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#termoescrita}.
	 * @param ctx the parse tree
	 */
	void enterTermoescrita(gramaticaLLParser.TermoescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#termoescrita}.
	 * @param ctx the parse tree
	 */
	void exitTermoescrita(gramaticaLLParser.TermoescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#novotermoescrita}.
	 * @param ctx the parse tree
	 */
	void enterNovotermoescrita(gramaticaLLParser.NovotermoescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#novotermoescrita}.
	 * @param ctx the parse tree
	 */
	void exitNovotermoescrita(gramaticaLLParser.NovotermoescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(gramaticaLLParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(gramaticaLLParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(gramaticaLLParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(gramaticaLLParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(gramaticaLLParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(gramaticaLLParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(gramaticaLLParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(gramaticaLLParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#complemento}.
	 * @param ctx the parse tree
	 */
	void enterComplemento(gramaticaLLParser.ComplementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#complemento}.
	 * @param ctx the parse tree
	 */
	void exitComplemento(gramaticaLLParser.ComplementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(gramaticaLLParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(gramaticaLLParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(gramaticaLLParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(gramaticaLLParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#novo_argumento}.
	 * @param ctx the parse tree
	 */
	void enterNovo_argumento(gramaticaLLParser.Novo_argumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#novo_argumento}.
	 * @param ctx the parse tree
	 */
	void exitNovo_argumento(gramaticaLLParser.Novo_argumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(gramaticaLLParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(gramaticaLLParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaLLParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaLLParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_ou}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_ou(gramaticaLLParser.Expressao_ouContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_ou}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_ou(gramaticaLLParser.Expressao_ouContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_ou2}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_ou2(gramaticaLLParser.Expressao_ou2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_ou2}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_ou2(gramaticaLLParser.Expressao_ou2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_e}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_e(gramaticaLLParser.Expressao_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_e}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_e(gramaticaLLParser.Expressao_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_e2}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_e2(gramaticaLLParser.Expressao_e2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_e2}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_e2(gramaticaLLParser.Expressao_e2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(gramaticaLLParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(gramaticaLLParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_relacional2}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional2(gramaticaLLParser.Expressao_relacional2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_relacional2}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional2(gramaticaLLParser.Expressao_relacional2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_aditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aditiva(gramaticaLLParser.Expressao_aditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_aditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aditiva(gramaticaLLParser.Expressao_aditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_aditiva2}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aditiva2(gramaticaLLParser.Expressao_aditiva2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_aditiva2}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aditiva2(gramaticaLLParser.Expressao_aditiva2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_multiplicativa(gramaticaLLParser.Expressao_multiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_multiplicativa(gramaticaLLParser.Expressao_multiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#expressao_multiplicativa2}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_multiplicativa2(gramaticaLLParser.Expressao_multiplicativa2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#expressao_multiplicativa2}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_multiplicativa2(gramaticaLLParser.Expressao_multiplicativa2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaLLParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaLLParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaLLParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaLLParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#sinal}.
	 * @param ctx the parse tree
	 */
	void enterSinal(gramaticaLLParser.SinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#sinal}.
	 * @param ctx the parse tree
	 */
	void exitSinal(gramaticaLLParser.SinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#opAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOpAditivo(gramaticaLLParser.OpAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#opAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOpAditivo(gramaticaLLParser.OpAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOpMultiplicativo(gramaticaLLParser.OpMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOpMultiplicativo(gramaticaLLParser.OpMultiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaLLParser#opRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOpRelacional(gramaticaLLParser.OpRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaLLParser#opRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOpRelacional(gramaticaLLParser.OpRelacionalContext ctx);
}