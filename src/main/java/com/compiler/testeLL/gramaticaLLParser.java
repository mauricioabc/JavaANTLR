// Generated from gramaticaLL.g4 by ANTLR 4.12.0

package com.compiler.testeLL;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaLLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, CONSTANTE=37, ID=38, 
		NUM_INT=39, NUM_DEC=40, TEXTO=41, WS=42;
	public static final int
		RULE_programa = 0, RULE_listafuncoes = 1, RULE_decfuncao = 2, RULE_tiporetorno = 3, 
		RULE_tipo = 4, RULE_tipobase = 5, RULE_dimensao = 6, RULE_parametros = 7, 
		RULE_listaparametros = 8, RULE_principal = 9, RULE_bloco = 10, RULE_listavariaveis = 11, 
		RULE_listaID = 12, RULE_comandos = 13, RULE_comando = 14, RULE_leitura = 15, 
		RULE_termoleitura = 16, RULE_novotermoleitura = 17, RULE_dimensao2 = 18, 
		RULE_escrita = 19, RULE_termoescrita = 20, RULE_novotermoescrita = 21, 
		RULE_selecao = 22, RULE_senao = 23, RULE_enquanto = 24, RULE_atribuicao = 25, 
		RULE_complemento = 26, RULE_funcao = 27, RULE_argumentos = 28, RULE_novo_argumento = 29, 
		RULE_retorno = 30, RULE_expressao = 31, RULE_expressao_ou = 32, RULE_expressao_ou2 = 33, 
		RULE_expressao_e = 34, RULE_expressao_e2 = 35, RULE_expressao_relacional = 36, 
		RULE_expressao_relacional2 = 37, RULE_expressao_aditiva = 38, RULE_expressao_aditiva2 = 39, 
		RULE_expressao_multiplicativa = 40, RULE_expressao_multiplicativa2 = 41, 
		RULE_fator = 42, RULE_termo = 43, RULE_sinal = 44, RULE_opAditivo = 45, 
		RULE_opMultiplicativo = 46, RULE_opRelacional = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listafuncoes", "decfuncao", "tiporetorno", "tipo", "tipobase", 
			"dimensao", "parametros", "listaparametros", "principal", "bloco", "listavariaveis", 
			"listaID", "comandos", "comando", "leitura", "termoleitura", "novotermoleitura", 
			"dimensao2", "escrita", "termoescrita", "novotermoescrita", "selecao", 
			"senao", "enquanto", "atribuicao", "complemento", "funcao", "argumentos", 
			"novo_argumento", "retorno", "expressao", "expressao_ou", "expressao_ou2", 
			"expressao_e", "expressao_e2", "expressao_relacional", "expressao_relacional2", 
			"expressao_aditiva", "expressao_aditiva2", "expressao_multiplicativa", 
			"expressao_multiplicativa2", "fator", "termo", "sinal", "opAditivo", 
			"opMultiplicativo", "opRelacional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'void'", "'char'", "'float'", "'int'", "'boolean'", 
			"'['", "']'", "','", "'main()'", "'{'", "'}'", "';'", "'scanf('", "'println('", 
			"'if('", "'else'", "'while('", "'='", "'func'", "'return'", "'||'", "'&&'", 
			"'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CONSTANTE", "ID", "NUM_INT", "NUM_DEC", "TEXTO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramaticaLL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaLLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ListafuncoesContext listafuncoes() {
			return getRuleContext(ListafuncoesContext.class,0);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			listafuncoes();
			setState(97);
			principal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListafuncoesContext extends ParserRuleContext {
		public DecfuncaoContext decfuncao() {
			return getRuleContext(DecfuncaoContext.class,0);
		}
		public ListafuncoesContext listafuncoes() {
			return getRuleContext(ListafuncoesContext.class,0);
		}
		public ListafuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listafuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterListafuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitListafuncoes(this);
		}
	}

	public final ListafuncoesContext listafuncoes() throws RecognitionException {
		ListafuncoesContext _localctx = new ListafuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listafuncoes);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				decfuncao();
				setState(100);
				listafuncoes();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecfuncaoContext extends ParserRuleContext {
		public TiporetornoContext tiporetorno() {
			return getRuleContext(TiporetornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DecfuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterDecfuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitDecfuncao(this);
		}
	}

	public final DecfuncaoContext decfuncao() throws RecognitionException {
		DecfuncaoContext _localctx = new DecfuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decfuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			tiporetorno();
			setState(106);
			match(ID);
			setState(107);
			match(T__0);
			setState(108);
			parametros();
			setState(109);
			match(T__1);
			setState(110);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TiporetornoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TiporetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiporetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterTiporetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitTiporetorno(this);
		}
	}

	public final TiporetornoContext tiporetorno() throws RecognitionException {
		TiporetornoContext _localctx = new TiporetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tiporetorno);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				tipo();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipobaseContext tipobase() {
			return getRuleContext(TipobaseContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			tipobase();
			setState(117);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipobaseContext extends ParserRuleContext {
		public TipobaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipobase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterTipobase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitTipobase(this);
		}
	}

	public final TipobaseContext tipobase() throws RecognitionException {
		TipobaseContext _localctx = new TipobaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipobase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(gramaticaLLParser.NUM_INT, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__7);
				setState(122);
				match(NUM_INT);
				setState(123);
				match(T__8);
				setState(124);
				dimensao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				tipo();
				setState(129);
				match(ID);
				setState(130);
				listaparametros();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaparametrosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public ListaparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterListaparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitListaparametros(this);
		}
	}

	public final ListaparametrosContext listaparametros() throws RecognitionException {
		ListaparametrosContext _localctx = new ListaparametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaparametros);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__9);
				setState(136);
				tipo();
				setState(137);
				match(ID);
				setState(138);
				listaparametros();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrincipalContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitPrincipal(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__10);
			setState(144);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public ListavariaveisContext listavariaveis() {
			return getRuleContext(ListavariaveisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__11);
			setState(147);
			listavariaveis();
			setState(148);
			comandos();
			setState(149);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListavariaveisContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public ListavariaveisContext listavariaveis() {
			return getRuleContext(ListavariaveisContext.class,0);
		}
		public ListavariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterListavariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitListavariaveis(this);
		}
	}

	public final ListavariaveisContext listavariaveis() throws RecognitionException {
		ListavariaveisContext _localctx = new ListavariaveisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listavariaveis);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				tipo();
				setState(152);
				match(ID);
				setState(153);
				listaID();
				setState(154);
				match(T__13);
				setState(155);
				listavariaveis();
				}
				break;
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public ListaIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterListaID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitListaID(this);
		}
	}

	public final ListaIDContext listaID() throws RecognitionException {
		ListaIDContext _localctx = new ListaIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaID);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__9);
				setState(161);
				match(ID);
				setState(162);
				listaID();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				comando();
				setState(167);
				comandos();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				leitura();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				escrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				atribuicao();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				funcao();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				selecao();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				enquanto();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				retorno();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TermoleituraContext termoleitura() {
			return getRuleContext(TermoleituraContext.class,0);
		}
		public NovotermoleituraContext novotermoleitura() {
			return getRuleContext(NovotermoleituraContext.class,0);
		}
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__14);
			setState(182);
			termoleitura();
			setState(183);
			novotermoleitura();
			setState(184);
			match(T__1);
			setState(185);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoleituraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TermoleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterTermoleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitTermoleitura(this);
		}
	}

	public final TermoleituraContext termoleitura() throws RecognitionException {
		TermoleituraContext _localctx = new TermoleituraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termoleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			dimensao2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovotermoleituraContext extends ParserRuleContext {
		public TermoleituraContext termoleitura() {
			return getRuleContext(TermoleituraContext.class,0);
		}
		public NovotermoleituraContext novotermoleitura() {
			return getRuleContext(NovotermoleituraContext.class,0);
		}
		public NovotermoleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novotermoleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterNovotermoleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitNovotermoleitura(this);
		}
	}

	public final NovotermoleituraContext novotermoleitura() throws RecognitionException {
		NovotermoleituraContext _localctx = new NovotermoleituraContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_novotermoleitura);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__9);
				setState(191);
				termoleitura();
				setState(192);
				novotermoleitura();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dimensao2Context extends ParserRuleContext {
		public Expressao_aditivaContext expressao_aditiva() {
			return getRuleContext(Expressao_aditivaContext.class,0);
		}
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public Dimensao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterDimensao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitDimensao2(this);
		}
	}

	public final Dimensao2Context dimensao2() throws RecognitionException {
		Dimensao2Context _localctx = new Dimensao2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimensao2);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__7);
				setState(198);
				expressao_aditiva();
				setState(199);
				match(T__8);
				setState(200);
				dimensao2();
				}
				break;
			case T__1:
			case T__8:
			case T__9:
			case T__13:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TermoescritaContext termoescrita() {
			return getRuleContext(TermoescritaContext.class,0);
		}
		public NovotermoescritaContext novotermoescrita() {
			return getRuleContext(NovotermoescritaContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__15);
			setState(206);
			termoescrita();
			setState(207);
			novotermoescrita();
			setState(208);
			match(T__1);
			setState(209);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoescritaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(gramaticaLLParser.CONSTANTE, 0); }
		public TerminalNode TEXTO() { return getToken(gramaticaLLParser.TEXTO, 0); }
		public TermoescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterTermoescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitTermoescrita(this);
		}
	}

	public final TermoescritaContext termoescrita() throws RecognitionException {
		TermoescritaContext _localctx = new TermoescritaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termoescrita);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				setState(212);
				dimensao2();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(CONSTANTE);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(TEXTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovotermoescritaContext extends ParserRuleContext {
		public TermoescritaContext termoescrita() {
			return getRuleContext(TermoescritaContext.class,0);
		}
		public NovotermoescritaContext novotermoescrita() {
			return getRuleContext(NovotermoescritaContext.class,0);
		}
		public NovotermoescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novotermoescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterNovotermoescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitNovotermoescrita(this);
		}
	}

	public final NovotermoescritaContext novotermoescrita() throws RecognitionException {
		NovotermoescritaContext _localctx = new NovotermoescritaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_novotermoescrita);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__9);
				setState(218);
				termoescrita();
				setState(219);
				novotermoescrita();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__16);
			setState(225);
			expressao();
			setState(226);
			match(T__1);
			setState(227);
			bloco();
			setState(228);
			senao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senao);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__17);
				setState(231);
				bloco();
				}
				break;
			case T__12:
			case T__14:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__18);
			setState(236);
			expressao();
			setState(237);
			match(T__1);
			setState(238);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ComplementoContext complemento() {
			return getRuleContext(ComplementoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
			setState(241);
			match(T__19);
			setState(242);
			complemento();
			setState(243);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplementoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ComplementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterComplemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitComplemento(this);
		}
	}

	public final ComplementoContext complemento() throws RecognitionException {
		ComplementoContext _localctx = new ComplementoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_complemento);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__24:
			case T__25:
			case T__26:
			case CONSTANTE:
			case ID:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				expressao();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				funcao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__20);
			setState(250);
			match(ID);
			setState(251);
			match(T__0);
			setState(252);
			argumentos();
			setState(253);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Novo_argumentoContext novo_argumento() {
			return getRuleContext(Novo_argumentoContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentos);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__24:
			case T__25:
			case T__26:
			case CONSTANTE:
			case ID:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				expressao();
				setState(256);
				novo_argumento();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Novo_argumentoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Novo_argumentoContext novo_argumento() {
			return getRuleContext(Novo_argumentoContext.class,0);
		}
		public Novo_argumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novo_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterNovo_argumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitNovo_argumento(this);
		}
	}

	public final Novo_argumentoContext novo_argumento() throws RecognitionException {
		Novo_argumentoContext _localctx = new Novo_argumentoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_novo_argumento);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__9);
				setState(262);
				expressao();
				setState(263);
				novo_argumento();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__21);
			setState(269);
			expressao();
			setState(270);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao_ouContext expressao_ou() {
			return getRuleContext(Expressao_ouContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			expressao_ou();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_ouContext extends ParserRuleContext {
		public Expressao_eContext expressao_e() {
			return getRuleContext(Expressao_eContext.class,0);
		}
		public Expressao_ou2Context expressao_ou2() {
			return getRuleContext(Expressao_ou2Context.class,0);
		}
		public Expressao_ouContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_ou; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_ou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_ou(this);
		}
	}

	public final Expressao_ouContext expressao_ou() throws RecognitionException {
		Expressao_ouContext _localctx = new Expressao_ouContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressao_ou);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			expressao_e();
			setState(275);
			expressao_ou2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_ou2Context extends ParserRuleContext {
		public Expressao_eContext expressao_e() {
			return getRuleContext(Expressao_eContext.class,0);
		}
		public Expressao_ou2Context expressao_ou2() {
			return getRuleContext(Expressao_ou2Context.class,0);
		}
		public Expressao_ou2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_ou2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_ou2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_ou2(this);
		}
	}

	public final Expressao_ou2Context expressao_ou2() throws RecognitionException {
		Expressao_ou2Context _localctx = new Expressao_ou2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressao_ou2);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__22);
				setState(278);
				expressao_e();
				setState(279);
				expressao_ou2();
				}
				break;
			case T__1:
			case T__9:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_eContext extends ParserRuleContext {
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Expressao_e2Context expressao_e2() {
			return getRuleContext(Expressao_e2Context.class,0);
		}
		public Expressao_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_e(this);
		}
	}

	public final Expressao_eContext expressao_e() throws RecognitionException {
		Expressao_eContext _localctx = new Expressao_eContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressao_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			expressao_relacional();
			setState(285);
			expressao_e2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_e2Context extends ParserRuleContext {
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Expressao_e2Context expressao_e2() {
			return getRuleContext(Expressao_e2Context.class,0);
		}
		public Expressao_e2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_e2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_e2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_e2(this);
		}
	}

	public final Expressao_e2Context expressao_e2() throws RecognitionException {
		Expressao_e2Context _localctx = new Expressao_e2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressao_e2);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__23);
				setState(288);
				expressao_relacional();
				setState(289);
				expressao_e2();
				}
				break;
			case T__1:
			case T__9:
			case T__13:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_relacionalContext extends ParserRuleContext {
		public Expressao_aditivaContext expressao_aditiva() {
			return getRuleContext(Expressao_aditivaContext.class,0);
		}
		public Expressao_relacional2Context expressao_relacional2() {
			return getRuleContext(Expressao_relacional2Context.class,0);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expressao_aditiva();
			setState(295);
			expressao_relacional2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_relacional2Context extends ParserRuleContext {
		public OpRelacionalContext opRelacional() {
			return getRuleContext(OpRelacionalContext.class,0);
		}
		public Expressao_aditivaContext expressao_aditiva() {
			return getRuleContext(Expressao_aditivaContext.class,0);
		}
		public Expressao_relacional2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_relacional2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_relacional2(this);
		}
	}

	public final Expressao_relacional2Context expressao_relacional2() throws RecognitionException {
		Expressao_relacional2Context _localctx = new Expressao_relacional2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressao_relacional2);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				opRelacional();
				setState(298);
				expressao_aditiva();
				}
				break;
			case T__1:
			case T__9:
			case T__13:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aditivaContext extends ParserRuleContext {
		public Expressao_multiplicativaContext expressao_multiplicativa() {
			return getRuleContext(Expressao_multiplicativaContext.class,0);
		}
		public Expressao_aditiva2Context expressao_aditiva2() {
			return getRuleContext(Expressao_aditiva2Context.class,0);
		}
		public Expressao_aditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_aditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_aditiva(this);
		}
	}

	public final Expressao_aditivaContext expressao_aditiva() throws RecognitionException {
		Expressao_aditivaContext _localctx = new Expressao_aditivaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressao_aditiva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			expressao_multiplicativa();
			setState(304);
			expressao_aditiva2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aditiva2Context extends ParserRuleContext {
		public OpAditivoContext opAditivo() {
			return getRuleContext(OpAditivoContext.class,0);
		}
		public Expressao_multiplicativaContext expressao_multiplicativa() {
			return getRuleContext(Expressao_multiplicativaContext.class,0);
		}
		public Expressao_aditiva2Context expressao_aditiva2() {
			return getRuleContext(Expressao_aditiva2Context.class,0);
		}
		public Expressao_aditiva2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aditiva2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_aditiva2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_aditiva2(this);
		}
	}

	public final Expressao_aditiva2Context expressao_aditiva2() throws RecognitionException {
		Expressao_aditiva2Context _localctx = new Expressao_aditiva2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressao_aditiva2);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				opAditivo();
				setState(307);
				expressao_multiplicativa();
				setState(308);
				expressao_aditiva2();
				}
				break;
			case T__1:
			case T__8:
			case T__9:
			case T__13:
			case T__22:
			case T__23:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_multiplicativaContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Expressao_multiplicativa2Context expressao_multiplicativa2() {
			return getRuleContext(Expressao_multiplicativa2Context.class,0);
		}
		public Expressao_multiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_multiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_multiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_multiplicativa(this);
		}
	}

	public final Expressao_multiplicativaContext expressao_multiplicativa() throws RecognitionException {
		Expressao_multiplicativaContext _localctx = new Expressao_multiplicativaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressao_multiplicativa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			fator();
			setState(314);
			expressao_multiplicativa2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_multiplicativa2Context extends ParserRuleContext {
		public OpMultiplicativoContext opMultiplicativo() {
			return getRuleContext(OpMultiplicativoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Expressao_multiplicativa2Context expressao_multiplicativa2() {
			return getRuleContext(Expressao_multiplicativa2Context.class,0);
		}
		public Expressao_multiplicativa2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_multiplicativa2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterExpressao_multiplicativa2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitExpressao_multiplicativa2(this);
		}
	}

	public final Expressao_multiplicativa2Context expressao_multiplicativa2() throws RecognitionException {
		Expressao_multiplicativa2Context _localctx = new Expressao_multiplicativa2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressao_multiplicativa2);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				opMultiplicativo();
				setState(317);
				fator();
				setState(318);
				expressao_multiplicativa2();
				}
				break;
			case T__1:
			case T__8:
			case T__9:
			case T__13:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public SinalContext sinal() {
			return getRuleContext(SinalContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(gramaticaLLParser.TEXTO, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fator);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case CONSTANTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				sinal();
				setState(324);
				termo();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(TEXTO);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(T__24);
				setState(328);
				fator();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(T__0);
				setState(330);
				expressao();
				setState(331);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLLParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(gramaticaLLParser.CONSTANTE, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_termo);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(ID);
				setState(336);
				dimensao2();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(CONSTANTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinalContext extends ParserRuleContext {
		public SinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterSinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitSinal(this);
		}
	}

	public final SinalContext sinal() throws RecognitionException {
		SinalContext _localctx = new SinalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sinal);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(T__26);
				}
				break;
			case CONSTANTE:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpAditivoContext extends ParserRuleContext {
		public OpAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterOpAditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitOpAditivo(this);
		}
	}

	public final OpAditivoContext opAditivo() throws RecognitionException {
		OpAditivoContext _localctx = new OpAditivoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_opAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpMultiplicativoContext extends ParserRuleContext {
		public OpMultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMultiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterOpMultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitOpMultiplicativo(this);
		}
	}

	public final OpMultiplicativoContext opMultiplicativo() throws RecognitionException {
		OpMultiplicativoContext _localctx = new OpMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpRelacionalContext extends ParserRuleContext {
		public OpRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).enterOpRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLLListener ) ((gramaticaLLListener)listener).exitOpRelacional(this);
		}
	}

	public final OpRelacionalContext opRelacional() throws RecognitionException {
		OpRelacionalContext _localctx = new OpRelacionalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u0160\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003s\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007f\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0086\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008e\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u009f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a5"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ab\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00b4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c4\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00cc\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00d8\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00df\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00ea\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00f8\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0104\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u010b\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u011b\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0125\b#\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0003%\u012e\b%\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0138\b\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0142\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u014e\b*\u0001"+
		"+\u0001+\u0001+\u0003+\u0153\b+\u0001,\u0001,\u0001,\u0003,\u0158\b,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0000\u00000\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000\u0004\u0001\u0000\u0004\u0007\u0001"+
		"\u0000\u001a\u001b\u0001\u0000\u001c\u001e\u0001\u0000\u001f$\u0151\u0000"+
		"`\u0001\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004i\u0001"+
		"\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000"+
		"\u0000\nw\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e\u0085"+
		"\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u008f"+
		"\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016\u009e"+
		"\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00aa"+
		"\u0001\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e\u00b5"+
		"\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\"\u00c3\u0001"+
		"\u0000\u0000\u0000$\u00cb\u0001\u0000\u0000\u0000&\u00cd\u0001\u0000\u0000"+
		"\u0000(\u00d7\u0001\u0000\u0000\u0000*\u00de\u0001\u0000\u0000\u0000,"+
		"\u00e0\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000\u0000\u00000\u00eb\u0001"+
		"\u0000\u0000\u00002\u00f0\u0001\u0000\u0000\u00004\u00f7\u0001\u0000\u0000"+
		"\u00006\u00f9\u0001\u0000\u0000\u00008\u0103\u0001\u0000\u0000\u0000:"+
		"\u010a\u0001\u0000\u0000\u0000<\u010c\u0001\u0000\u0000\u0000>\u0110\u0001"+
		"\u0000\u0000\u0000@\u0112\u0001\u0000\u0000\u0000B\u011a\u0001\u0000\u0000"+
		"\u0000D\u011c\u0001\u0000\u0000\u0000F\u0124\u0001\u0000\u0000\u0000H"+
		"\u0126\u0001\u0000\u0000\u0000J\u012d\u0001\u0000\u0000\u0000L\u012f\u0001"+
		"\u0000\u0000\u0000N\u0137\u0001\u0000\u0000\u0000P\u0139\u0001\u0000\u0000"+
		"\u0000R\u0141\u0001\u0000\u0000\u0000T\u014d\u0001\u0000\u0000\u0000V"+
		"\u0152\u0001\u0000\u0000\u0000X\u0157\u0001\u0000\u0000\u0000Z\u0159\u0001"+
		"\u0000\u0000\u0000\\\u015b\u0001\u0000\u0000\u0000^\u015d\u0001\u0000"+
		"\u0000\u0000`a\u0003\u0002\u0001\u0000ab\u0003\u0012\t\u0000b\u0001\u0001"+
		"\u0000\u0000\u0000cd\u0003\u0004\u0002\u0000de\u0003\u0002\u0001\u0000"+
		"eh\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000h\u0003\u0001\u0000\u0000\u0000ij\u0003"+
		"\u0006\u0003\u0000jk\u0005&\u0000\u0000kl\u0005\u0001\u0000\u0000lm\u0003"+
		"\u000e\u0007\u0000mn\u0005\u0002\u0000\u0000no\u0003\u0014\n\u0000o\u0005"+
		"\u0001\u0000\u0000\u0000ps\u0003\b\u0004\u0000qs\u0005\u0003\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0007\u0001\u0000"+
		"\u0000\u0000tu\u0003\n\u0005\u0000uv\u0003\f\u0006\u0000v\t\u0001\u0000"+
		"\u0000\u0000wx\u0007\u0000\u0000\u0000x\u000b\u0001\u0000\u0000\u0000"+
		"yz\u0005\b\u0000\u0000z{\u0005\'\u0000\u0000{|\u0005\t\u0000\u0000|\u007f"+
		"\u0003\f\u0006\u0000}\u007f\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0003\b\u0004\u0000\u0081\u0082\u0005&\u0000\u0000\u0082\u0083"+
		"\u0003\u0010\b\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\n\u0000\u0000\u0088\u0089\u0003\b\u0004\u0000\u0089\u008a\u0005&\u0000"+
		"\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0011\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\u000b\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091"+
		"\u0013\u0001\u0000\u0000\u0000\u0092\u0093\u0005\f\u0000\u0000\u0093\u0094"+
		"\u0003\u0016\u000b\u0000\u0094\u0095\u0003\u001a\r\u0000\u0095\u0096\u0005"+
		"\r\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098\u0003\b"+
		"\u0004\u0000\u0098\u0099\u0005&\u0000\u0000\u0099\u009a\u0003\u0018\f"+
		"\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u009c\u0003\u0016\u000b"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u0017\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\n\u0000\u0000"+
		"\u00a1\u00a2\u0005&\u0000\u0000\u00a2\u00a5\u0003\u0018\f\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0003\u001c\u000e\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a6"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u001b"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b4\u0003\u001e\u000f\u0000\u00ad\u00b4"+
		"\u0003&\u0013\u0000\u00ae\u00b4\u00032\u0019\u0000\u00af\u00b4\u00036"+
		"\u001b\u0000\u00b0\u00b4\u0003,\u0016\u0000\u00b1\u00b4\u00030\u0018\u0000"+
		"\u00b2\u00b4\u0003<\u001e\u0000\u00b3\u00ac\u0001\u0000\u0000\u0000\u00b3"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3"+
		"\u00af\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u001d\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6"+
		"\u00b7\u0003 \u0010\u0000\u00b7\u00b8\u0003\"\u0011\u0000\u00b8\u00b9"+
		"\u0005\u0002\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u001f"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005&\u0000\u0000\u00bc\u00bd\u0003"+
		"$\u0012\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\n\u0000"+
		"\u0000\u00bf\u00c0\u0003 \u0010\u0000\u00c0\u00c1\u0003\"\u0011\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4#\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\b\u0000\u0000\u00c6"+
		"\u00c7\u0003L&\u0000\u00c7\u00c8\u0005\t\u0000\u0000\u00c8\u00c9\u0003"+
		"$\u0012\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc%\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0010\u0000"+
		"\u0000\u00ce\u00cf\u0003(\u0014\u0000\u00cf\u00d0\u0003*\u0015\u0000\u00d0"+
		"\u00d1\u0005\u0002\u0000\u0000\u00d1\u00d2\u0005\u000e\u0000\u0000\u00d2"+
		"\'\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005&\u0000\u0000\u00d4\u00d8"+
		"\u0003$\u0012\u0000\u00d5\u00d8\u0005%\u0000\u0000\u00d6\u00d8\u0005)"+
		"\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8)\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\n\u0000\u0000\u00da\u00db\u0003(\u0014\u0000"+
		"\u00db\u00dc\u0003*\u0015\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00df\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df+\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005\u0011\u0000\u0000\u00e1\u00e2\u0003>\u001f\u0000\u00e2\u00e3\u0005"+
		"\u0002\u0000\u0000\u00e3\u00e4\u0003\u0014\n\u0000\u00e4\u00e5\u0003."+
		"\u0017\u0000\u00e5-\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0012\u0000"+
		"\u0000\u00e7\u00ea\u0003\u0014\n\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea/\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0013\u0000\u0000\u00ec"+
		"\u00ed\u0003>\u001f\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000\u00ee\u00ef"+
		"\u0003\u0014\n\u0000\u00ef1\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"&\u0000\u0000\u00f1\u00f2\u0005\u0014\u0000\u0000\u00f2\u00f3\u00034\u001a"+
		"\u0000\u00f3\u00f4\u0005\u000e\u0000\u0000\u00f43\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0003>\u001f\u0000\u00f6\u00f8\u00036\u001b\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f85\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u0015\u0000\u0000\u00fa\u00fb\u0005"+
		"&\u0000\u0000\u00fb\u00fc\u0005\u0001\u0000\u0000\u00fc\u00fd\u00038\u001c"+
		"\u0000\u00fd\u00fe\u0005\u0002\u0000\u0000\u00fe7\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0003>\u001f\u0000\u0100\u0101\u0003:\u001d\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00ff"+
		"\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u01049\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106\u0107\u0003>"+
		"\u001f\u0000\u0107\u0108\u0003:\u001d\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0105\u0001\u0000\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b;\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005\u0016\u0000\u0000\u010d\u010e\u0003>\u001f\u0000\u010e"+
		"\u010f\u0005\u000e\u0000\u0000\u010f=\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0003@ \u0000\u0111?\u0001\u0000\u0000\u0000\u0112\u0113\u0003D\"\u0000"+
		"\u0113\u0114\u0003B!\u0000\u0114A\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005\u0017\u0000\u0000\u0116\u0117\u0003D\"\u0000\u0117\u0118\u0003"+
		"B!\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000"+
		"\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011bC\u0001\u0000\u0000\u0000\u011c\u011d\u0003H$\u0000\u011d"+
		"\u011e\u0003F#\u0000\u011eE\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"\u0018\u0000\u0000\u0120\u0121\u0003H$\u0000\u0121\u0122\u0003F#\u0000"+
		"\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000"+
		"\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0125G\u0001\u0000\u0000\u0000\u0126\u0127\u0003L&\u0000\u0127\u0128"+
		"\u0003J%\u0000\u0128I\u0001\u0000\u0000\u0000\u0129\u012a\u0003^/\u0000"+
		"\u012a\u012b\u0003L&\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012e"+
		"\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012eK\u0001\u0000\u0000\u0000\u012f\u0130\u0003"+
		"P(\u0000\u0130\u0131\u0003N\'\u0000\u0131M\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0003Z-\u0000\u0133\u0134\u0003P(\u0000\u0134\u0135\u0003N\'\u0000"+
		"\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0138O\u0001\u0000\u0000\u0000\u0139\u013a\u0003T*\u0000\u013a\u013b"+
		"\u0003R)\u0000\u013bQ\u0001\u0000\u0000\u0000\u013c\u013d\u0003\\.\u0000"+
		"\u013d\u013e\u0003T*\u0000\u013e\u013f\u0003R)\u0000\u013f\u0142\u0001"+
		"\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013c\u0001"+
		"\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142S\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0003X,\u0000\u0144\u0145\u0003V+\u0000\u0145"+
		"\u014e\u0001\u0000\u0000\u0000\u0146\u014e\u0005)\u0000\u0000\u0147\u0148"+
		"\u0005\u0019\u0000\u0000\u0148\u014e\u0003T*\u0000\u0149\u014a\u0005\u0001"+
		"\u0000\u0000\u014a\u014b\u0003>\u001f\u0000\u014b\u014c\u0005\u0002\u0000"+
		"\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0143\u0001\u0000\u0000"+
		"\u0000\u014d\u0146\u0001\u0000\u0000\u0000\u014d\u0147\u0001\u0000\u0000"+
		"\u0000\u014d\u0149\u0001\u0000\u0000\u0000\u014eU\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005&\u0000\u0000\u0150\u0153\u0003$\u0012\u0000\u0151\u0153"+
		"\u0005%\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0153W\u0001\u0000\u0000\u0000\u0154\u0158\u0005\u001a"+
		"\u0000\u0000\u0155\u0158\u0005\u001b\u0000\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158Y\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0007\u0001\u0000\u0000\u015a[\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0007\u0002\u0000\u0000\u015c]\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0007\u0003\u0000\u0000\u015e_\u0001\u0000\u0000\u0000\u0019gr"+
		"~\u0085\u008d\u009e\u00a4\u00aa\u00b3\u00c3\u00cb\u00d7\u00de\u00e9\u00f7"+
		"\u0103\u010a\u011a\u0124\u012d\u0137\u0141\u014d\u0152\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}