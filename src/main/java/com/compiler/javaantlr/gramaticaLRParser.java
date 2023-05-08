// Generated from C:/Users/mauricio.rodrigues/OneDrive - NDD.Tech/Documentos/GitHub/JavaANTLR/src/main/java/com/compiler/javaantlr\gramaticaLR.g4 by ANTLR 4.12.0

package com.compiler.javaantlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaLRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, NUM_INT=38, NUM_DEC=39, 
		TEXTO=40, WS=41;
	public static final int
		RULE_programa = 0, RULE_secaoFuncoes = 1, RULE_listaFuncoes = 2, RULE_decFuncao = 3, 
		RULE_tipoRetorno = 4, RULE_tipo = 5, RULE_tipoBase = 6, RULE_dimensao = 7, 
		RULE_parametros = 8, RULE_listaParametros = 9, RULE_principal = 10, RULE_bloco = 11, 
		RULE_secaoVariaveis = 12, RULE_listaVariaveis = 13, RULE_listaID = 14, 
		RULE_secaoComandos = 15, RULE_listaComandos = 16, RULE_comando = 17, RULE_leitura = 18, 
		RULE_listaTermoLeitura = 19, RULE_termoLeitura = 20, RULE_dimensao2 = 21, 
		RULE_escrita = 22, RULE_listaTermoEscrita = 23, RULE_termoEscrita = 24, 
		RULE_selecao = 25, RULE_senao = 26, RULE_enquanto = 27, RULE_atribuicao = 28, 
		RULE_complemento = 29, RULE_funcao = 30, RULE_argumentos = 31, RULE_listaArgumentos = 32, 
		RULE_retorno = 33, RULE_expressao = 34, RULE_exprOu = 35, RULE_exprE = 36, 
		RULE_exprRelacional = 37, RULE_exprAditiva = 38, RULE_opAditivo = 39, 
		RULE_exprMultiplicativa = 40, RULE_opMultiplicativo = 41, RULE_fator = 42, 
		RULE_constante = 43, RULE_sinal = 44, RULE_opRelacional = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "secaoFuncoes", "listaFuncoes", "decFuncao", "tipoRetorno", 
			"tipo", "tipoBase", "dimensao", "parametros", "listaParametros", "principal", 
			"bloco", "secaoVariaveis", "listaVariaveis", "listaID", "secaoComandos", 
			"listaComandos", "comando", "leitura", "listaTermoLeitura", "termoLeitura", 
			"dimensao2", "escrita", "listaTermoEscrita", "termoEscrita", "selecao", 
			"senao", "enquanto", "atribuicao", "complemento", "funcao", "argumentos", 
			"listaArgumentos", "retorno", "expressao", "exprOu", "exprE", "exprRelacional", 
			"exprAditiva", "opAditivo", "exprMultiplicativa", "opMultiplicativo", 
			"fator", "constante", "sinal", "opRelacional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'void'", "'char'", "'float'", "'int'", "'boolean'", 
			"'['", "']'", "','", "'main'", "'{'", "'}'", "';'", "'scanf'", "'println'", 
			"'if'", "'else'", "'while'", "'='", "'func'", "'return'", "'||'", "'&&'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NUM_INT", "NUM_DEC", "TEXTO", "WS"
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
	public String getGrammarFileName() { return "gramaticaLR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaLRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SecaoFuncoesContext secaoFuncoes() {
			return getRuleContext(SecaoFuncoesContext.class,0);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			secaoFuncoes();
			setState(93);
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
	public static class SecaoFuncoesContext extends ParserRuleContext {
		public ListaFuncoesContext listaFuncoes() {
			return getRuleContext(ListaFuncoesContext.class,0);
		}
		public SecaoFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterSecaoFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitSecaoFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitSecaoFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoFuncoesContext secaoFuncoes() throws RecognitionException {
		SecaoFuncoesContext _localctx = new SecaoFuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_secaoFuncoes);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				listaFuncoes(0);
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
	public static class ListaFuncoesContext extends ParserRuleContext {
		public DecFuncaoContext decFuncao() {
			return getRuleContext(DecFuncaoContext.class,0);
		}
		public ListaFuncoesContext listaFuncoes() {
			return getRuleContext(ListaFuncoesContext.class,0);
		}
		public ListaFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaFuncoesContext listaFuncoes() throws RecognitionException {
		return listaFuncoes(0);
	}

	private ListaFuncoesContext listaFuncoes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaFuncoesContext _localctx = new ListaFuncoesContext(_ctx, _parentState);
		ListaFuncoesContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_listaFuncoes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			decFuncao();
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaFuncoesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listaFuncoes);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					decFuncao();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecFuncaoContext extends ParserRuleContext {
		public TipoRetornoContext tipoRetorno() {
			return getRuleContext(TipoRetornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaLRParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DecFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterDecFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitDecFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitDecFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFuncaoContext decFuncao() throws RecognitionException {
		DecFuncaoContext _localctx = new DecFuncaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			tipoRetorno();
			setState(110);
			match(ID);
			setState(111);
			match(T__0);
			setState(112);
			parametros();
			setState(113);
			match(T__1);
			setState(114);
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
	public static class TipoRetornoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterTipoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitTipoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitTipoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoRetorno);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				tipo();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tipoBase();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(121);
				dimensao();
				}
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
	public static class TipoBaseContext extends ParserRuleContext {
		public TipoBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterTipoBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitTipoBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitTipoBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBaseContext tipoBase() throws RecognitionException {
		TipoBaseContext _localctx = new TipoBaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipoBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		public TerminalNode NUM_INT() { return getToken(gramaticaLRParser.NUM_INT, 0); }
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(NUM_INT);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(128);
				match(T__8);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParametrosContext extends ParserRuleContext {
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				listaParametros();
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
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(gramaticaLRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaLRParser.ID, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			tipo();
			setState(139);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(140);
				match(T__9);
				setState(141);
				tipo();
				setState(142);
				match(ID);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__10);
			setState(150);
			match(T__0);
			setState(151);
			match(T__1);
			setState(152);
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
		public SecaoVariaveisContext secaoVariaveis() {
			return getRuleContext(SecaoVariaveisContext.class,0);
		}
		public SecaoComandosContext secaoComandos() {
			return getRuleContext(SecaoComandosContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__11);
			setState(155);
			secaoVariaveis();
			setState(156);
			secaoComandos();
			setState(157);
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
	public static class SecaoVariaveisContext extends ParserRuleContext {
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
		}
		public SecaoVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterSecaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitSecaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitSecaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoVariaveisContext secaoVariaveis() throws RecognitionException {
		SecaoVariaveisContext _localctx = new SecaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_secaoVariaveis);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				listaVariaveis(0);
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
	public static class ListaVariaveisContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIDContext listaID() {
			return getRuleContext(ListaIDContext.class,0);
		}
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
		}
		public ListaVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaVariaveisContext listaVariaveis() throws RecognitionException {
		return listaVariaveis(0);
	}

	private ListaVariaveisContext listaVariaveis(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaVariaveisContext _localctx = new ListaVariaveisContext(_ctx, _parentState);
		ListaVariaveisContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listaVariaveis, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			tipo();
			setState(165);
			listaID();
			setState(166);
			match(T__13);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaVariaveisContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listaVariaveis);
					setState(168);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(169);
					tipo();
					setState(170);
					listaID();
					setState(171);
					match(T__13);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaLRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaLRParser.ID, i);
		}
		public ListaIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIDContext listaID() throws RecognitionException {
		ListaIDContext _localctx = new ListaIDContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(179);
				match(T__9);
				setState(180);
				match(ID);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class SecaoComandosContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SecaoComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterSecaoComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitSecaoComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitSecaoComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoComandosContext secaoComandos() throws RecognitionException {
		SecaoComandosContext _localctx = new SecaoComandosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_secaoComandos);
		try {
			setState(188);
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
				setState(186);
				listaComandos(0);
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
	public static class ListaComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		return listaComandos(0);
	}

	private ListaComandosContext listaComandos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, _parentState);
		ListaComandosContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listaComandos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			comando();
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaComandosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listaComandos);
					setState(193);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(194);
					comando();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				leitura();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				escrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				atribuicao();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				funcao();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				selecao();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				enquanto();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
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
		public ListaTermoLeituraContext listaTermoLeitura() {
			return getRuleContext(ListaTermoLeituraContext.class,0);
		}
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__14);
			setState(210);
			match(T__0);
			setState(211);
			listaTermoLeitura();
			setState(212);
			match(T__1);
			setState(213);
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
	public static class ListaTermoLeituraContext extends ParserRuleContext {
		public List<TermoLeituraContext> termoLeitura() {
			return getRuleContexts(TermoLeituraContext.class);
		}
		public TermoLeituraContext termoLeitura(int i) {
			return getRuleContext(TermoLeituraContext.class,i);
		}
		public ListaTermoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaTermoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaTermoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaTermoLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaTermoLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaTermoLeituraContext listaTermoLeitura() throws RecognitionException {
		ListaTermoLeituraContext _localctx = new ListaTermoLeituraContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listaTermoLeitura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			termoLeitura();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(216);
				match(T__9);
				setState(217);
				termoLeitura();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TermoLeituraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLRParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TermoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterTermoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitTermoLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitTermoLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoLeituraContext termoLeitura() throws RecognitionException {
		TermoLeituraContext _localctx = new TermoLeituraContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termoLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(224);
				dimensao2();
				}
				break;
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
	public static class Dimensao2Context extends ParserRuleContext {
		public ExprAditivaContext exprAditiva() {
			return getRuleContext(ExprAditivaContext.class,0);
		}
		public Dimensao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterDimensao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitDimensao2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitDimensao2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensao2Context dimensao2() throws RecognitionException {
		Dimensao2Context _localctx = new Dimensao2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_dimensao2);
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__7);
				setState(228);
				exprAditiva();
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						match(T__8);
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case T__1:
			case T__8:
			case T__9:
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
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
		public ListaTermoEscritaContext listaTermoEscrita() {
			return getRuleContext(ListaTermoEscritaContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__15);
			setState(239);
			match(T__0);
			setState(240);
			listaTermoEscrita();
			setState(241);
			match(T__1);
			setState(242);
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
	public static class ListaTermoEscritaContext extends ParserRuleContext {
		public List<TermoEscritaContext> termoEscrita() {
			return getRuleContexts(TermoEscritaContext.class);
		}
		public TermoEscritaContext termoEscrita(int i) {
			return getRuleContext(TermoEscritaContext.class,i);
		}
		public ListaTermoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaTermoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaTermoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaTermoEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaTermoEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaTermoEscritaContext listaTermoEscrita() throws RecognitionException {
		ListaTermoEscritaContext _localctx = new ListaTermoEscritaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listaTermoEscrita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			termoEscrita();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(245);
				match(T__9);
				setState(246);
				termoEscrita();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TermoEscritaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaLRParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(gramaticaLRParser.TEXTO, 0); }
		public TermoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterTermoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitTermoEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitTermoEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoEscritaContext termoEscrita() throws RecognitionException {
		TermoEscritaContext _localctx = new TermoEscritaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termoEscrita);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(ID);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(253);
					dimensao2();
					}
					break;
				}
				}
				break;
			case NUM_INT:
			case NUM_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				constante();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__16);
			setState(261);
			match(T__0);
			setState(262);
			expressao();
			setState(263);
			match(T__1);
			setState(264);
			bloco();
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(265);
				senao();
				}
				break;
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_senao);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__17);
				setState(269);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__18);
			setState(274);
			match(T__0);
			setState(275);
			expressao();
			setState(276);
			match(T__1);
			setState(277);
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
		public TerminalNode ID() { return getToken(gramaticaLRParser.ID, 0); }
		public ComplementoContext complemento() {
			return getRuleContext(ComplementoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
			setState(280);
			match(T__19);
			setState(281);
			complemento();
			setState(282);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterComplemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitComplemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitComplemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplementoContext complemento() throws RecognitionException {
		ComplementoContext _localctx = new ComplementoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_complemento);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__24:
			case T__25:
			case T__29:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				expressao();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
		public TerminalNode ID() { return getToken(gramaticaLRParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__20);
			setState(289);
			match(ID);
			setState(290);
			match(T__0);
			setState(291);
			argumentos();
			setState(292);
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
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argumentos);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__24:
			case T__25:
			case T__29:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				listaArgumentos();
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
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitListaArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitListaArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			expressao();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(299);
				match(T__9);
				setState(300);
				expressao();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__21);
			setState(307);
			expressao();
			setState(308);
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
		public ExprOuContext exprOu() {
			return getRuleContext(ExprOuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			exprOu();
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
	public static class ExprOuContext extends ParserRuleContext {
		public List<ExprEContext> exprE() {
			return getRuleContexts(ExprEContext.class);
		}
		public ExprEContext exprE(int i) {
			return getRuleContext(ExprEContext.class,i);
		}
		public ExprOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterExprOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitExprOu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitExprOu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOuContext exprOu() throws RecognitionException {
		ExprOuContext _localctx = new ExprOuContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprOu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			exprE();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(313);
				match(T__22);
				setState(314);
				exprE();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ExprEContext extends ParserRuleContext {
		public List<ExprRelacionalContext> exprRelacional() {
			return getRuleContexts(ExprRelacionalContext.class);
		}
		public ExprRelacionalContext exprRelacional(int i) {
			return getRuleContext(ExprRelacionalContext.class,i);
		}
		public ExprEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterExprE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitExprE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitExprE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEContext exprE() throws RecognitionException {
		ExprEContext _localctx = new ExprEContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			exprRelacional();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(321);
				match(T__23);
				setState(322);
				exprRelacional();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ExprRelacionalContext extends ParserRuleContext {
		public List<ExprAditivaContext> exprAditiva() {
			return getRuleContexts(ExprAditivaContext.class);
		}
		public ExprAditivaContext exprAditiva(int i) {
			return getRuleContext(ExprAditivaContext.class,i);
		}
		public OpRelacionalContext opRelacional() {
			return getRuleContext(OpRelacionalContext.class,0);
		}
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelacionalContext exprRelacional() throws RecognitionException {
		ExprRelacionalContext _localctx = new ExprRelacionalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exprRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			exprAditiva();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) {
				{
				setState(329);
				opRelacional();
				setState(330);
				exprAditiva();
				}
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
	public static class ExprAditivaContext extends ParserRuleContext {
		public List<ExprMultiplicativaContext> exprMultiplicativa() {
			return getRuleContexts(ExprMultiplicativaContext.class);
		}
		public ExprMultiplicativaContext exprMultiplicativa(int i) {
			return getRuleContext(ExprMultiplicativaContext.class,i);
		}
		public List<OpAditivoContext> opAditivo() {
			return getRuleContexts(OpAditivoContext.class);
		}
		public OpAditivoContext opAditivo(int i) {
			return getRuleContext(OpAditivoContext.class,i);
		}
		public ExprAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterExprAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitExprAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitExprAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAditivaContext exprAditiva() throws RecognitionException {
		ExprAditivaContext _localctx = new ExprAditivaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprAditiva);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			exprMultiplicativa();
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					opAditivo();
					setState(336);
					exprMultiplicativa();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class OpAditivoContext extends ParserRuleContext {
		public OpAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterOpAditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitOpAditivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitOpAditivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAditivoContext opAditivo() throws RecognitionException {
		OpAditivoContext _localctx = new OpAditivoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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
	public static class ExprMultiplicativaContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<OpMultiplicativoContext> opMultiplicativo() {
			return getRuleContexts(OpMultiplicativoContext.class);
		}
		public OpMultiplicativoContext opMultiplicativo(int i) {
			return getRuleContext(OpMultiplicativoContext.class,i);
		}
		public ExprMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterExprMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitExprMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitExprMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultiplicativaContext exprMultiplicativa() throws RecognitionException {
		ExprMultiplicativaContext _localctx = new ExprMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprMultiplicativa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			fator();
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					opMultiplicativo();
					setState(347);
					fator();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterOpMultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitOpMultiplicativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitOpMultiplicativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMultiplicativoContext opMultiplicativo() throws RecognitionException {
		OpMultiplicativoContext _localctx = new OpMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
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
	public static class FatorContext extends ParserRuleContext {
		public SinalContext sinal() {
			return getRuleContext(SinalContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaLRParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(gramaticaLRParser.TEXTO, 0); }
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
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fator);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(356);
				sinal();
				setState(357);
				match(ID);
				setState(358);
				dimensao2();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(360);
				sinal();
				setState(361);
				constante();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(TEXTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(T__29);
				setState(365);
				fator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				match(T__0);
				setState(367);
				expressao();
				setState(368);
				match(T__1);
				}
				break;
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
	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(gramaticaLRParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(gramaticaLRParser.NUM_DEC, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT || _la==NUM_DEC) ) {
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
	public static class SinalContext extends ParserRuleContext {
		public SinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterSinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitSinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitSinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinalContext sinal() throws RecognitionException {
		SinalContext _localctx = new SinalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sinal);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__25);
				}
				break;
			case ID:
			case NUM_INT:
			case NUM_DEC:
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
	public static class OpRelacionalContext extends ParserRuleContext {
		public OpRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).enterOpRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaLRListener ) ((gramaticaLRListener)listener).exitOpRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaLRVisitor ) return ((gramaticaLRVisitor<? extends T>)visitor).visitOpRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpRelacionalContext opRelacional() throws RecognitionException {
		OpRelacionalContext _localctx = new OpRelacionalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_opRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return listaFuncoes_sempred((ListaFuncoesContext)_localctx, predIndex);
		case 13:
			return listaVariaveis_sempred((ListaVariaveisContext)_localctx, predIndex);
		case 16:
			return listaComandos_sempred((ListaComandosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listaFuncoes_sempred(ListaFuncoesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listaVariaveis_sempred(ListaVariaveisContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean listaComandos_sempred(ListaComandosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u017e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002i\b\u0002\n\u0002\f\u0002l\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004w\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005{\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0082\b\u0007\n\u0007\f\u0007\u0085\t\u0007\u0001\b"+
		"\u0001\b\u0003\b\u0089\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0091\b\t\n\t\f\t\u0094\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f\u00a2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ae\b\r\n\r\f\r\u00b1\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b6\b\u000e\n\u000e"+
		"\f\u000e\u00b9\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00bd\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00c4\b\u0010\n\u0010\f\u0010\u00c7\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d0"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00db\b\u0013\n"+
		"\u0013\f\u0013\u00de\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00e2"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00e7\b\u0015"+
		"\n\u0015\f\u0015\u00ea\t\u0015\u0001\u0015\u0003\u0015\u00ed\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00f8\b\u0017\n\u0017\f\u0017"+
		"\u00fb\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00ff\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0103\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u010b\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0110\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u011f\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0129\b\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u012e\b \n \f \u0131\t \u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u013c\b#\n#\f#\u013f\t#"+
		"\u0001$\u0001$\u0001$\u0005$\u0144\b$\n$\f$\u0147\t$\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u014d\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u0153\b&\n"+
		"&\f&\u0156\t&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u015e"+
		"\b(\n(\f(\u0161\t(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0173"+
		"\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0003,\u017a\b,\u0001-\u0001-\u0001"+
		"-\u0000\u0003\u0004\u001a .\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\u0000\u0005\u0001\u0000\u0004\u0007\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u001b\u001d\u0001\u0000&\'\u0001\u0000\u001f$\u0179\u0000\\\u0001"+
		"\u0000\u0000\u0000\u0002a\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000"+
		"\u0000\u0006m\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\nx\u0001"+
		"\u0000\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000"+
		"\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000\u0000"+
		"\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000"+
		"\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000"+
		"\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000\u0000"+
		"\u0000 \u00be\u0001\u0000\u0000\u0000\"\u00cf\u0001\u0000\u0000\u0000"+
		"$\u00d1\u0001\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000(\u00df"+
		"\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000,\u00ee\u0001\u0000"+
		"\u0000\u0000.\u00f4\u0001\u0000\u0000\u00000\u0102\u0001\u0000\u0000\u0000"+
		"2\u0104\u0001\u0000\u0000\u00004\u010f\u0001\u0000\u0000\u00006\u0111"+
		"\u0001\u0000\u0000\u00008\u0117\u0001\u0000\u0000\u0000:\u011e\u0001\u0000"+
		"\u0000\u0000<\u0120\u0001\u0000\u0000\u0000>\u0128\u0001\u0000\u0000\u0000"+
		"@\u012a\u0001\u0000\u0000\u0000B\u0132\u0001\u0000\u0000\u0000D\u0136"+
		"\u0001\u0000\u0000\u0000F\u0138\u0001\u0000\u0000\u0000H\u0140\u0001\u0000"+
		"\u0000\u0000J\u0148\u0001\u0000\u0000\u0000L\u014e\u0001\u0000\u0000\u0000"+
		"N\u0157\u0001\u0000\u0000\u0000P\u0159\u0001\u0000\u0000\u0000R\u0162"+
		"\u0001\u0000\u0000\u0000T\u0172\u0001\u0000\u0000\u0000V\u0174\u0001\u0000"+
		"\u0000\u0000X\u0179\u0001\u0000\u0000\u0000Z\u017b\u0001\u0000\u0000\u0000"+
		"\\]\u0003\u0002\u0001\u0000]^\u0003\u0014\n\u0000^\u0001\u0001\u0000\u0000"+
		"\u0000_b\u0003\u0004\u0002\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0003\u0001\u0000\u0000\u0000"+
		"cd\u0006\u0002\uffff\uffff\u0000de\u0003\u0006\u0003\u0000ej\u0001\u0000"+
		"\u0000\u0000fg\n\u0001\u0000\u0000gi\u0003\u0006\u0003\u0000hf\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000k\u0005\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mn\u0003\b\u0004\u0000no\u0005%\u0000\u0000op\u0005\u0001\u0000"+
		"\u0000pq\u0003\u0010\b\u0000qr\u0005\u0002\u0000\u0000rs\u0003\u0016\u000b"+
		"\u0000s\u0007\u0001\u0000\u0000\u0000tw\u0003\n\u0005\u0000uw\u0005\u0003"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\t\u0001"+
		"\u0000\u0000\u0000xz\u0003\f\u0006\u0000y{\u0003\u000e\u0007\u0000zy\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u000b\u0001\u0000\u0000"+
		"\u0000|}\u0007\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\b\u0000\u0000\u007f\u0083\u0005&\u0000\u0000\u0080\u0082\u0005\t\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0003\u0012\t\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b\u0003\n\u0005\u0000\u008b"+
		"\u0092\u0005%\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e"+
		"\u0003\n\u0005\u0000\u008e\u008f\u0005%\u0000\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u000b\u0000\u0000\u0096\u0097\u0005"+
		"\u0001\u0000\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u0099\u0003"+
		"\u0016\u000b\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\f\u0000\u0000\u009b\u009c\u0003\u0018\f\u0000\u009c\u009d\u0003\u001e"+
		"\u000f\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u0017\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0003\u001a\r\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\r\uffff\uffff\u0000"+
		"\u00a4\u00a5\u0003\n\u0005\u0000\u00a5\u00a6\u0003\u001c\u000e\u0000\u00a6"+
		"\u00a7\u0005\u000e\u0000\u0000\u00a7\u00af\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\n\u0001\u0000\u0000\u00a9\u00aa\u0003\n\u0005\u0000\u00aa\u00ab"+
		"\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005\u000e\u0000\u0000\u00ac\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ae\u00b1"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b7\u0005%\u0000\u0000\u00b3\u00b4\u0005"+
		"\n\u0000\u0000\u00b4\u00b6\u0005%\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0003 \u0010"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u001f\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0006\u0010\uffff\uffff\u0000\u00bf\u00c0\u0003\"\u0011"+
		"\u0000\u00c0\u00c5\u0001\u0000\u0000\u0000\u00c1\u00c2\n\u0001\u0000\u0000"+
		"\u00c2\u00c4\u0003\"\u0011\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6!\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00d0\u0003$\u0012\u0000\u00c9\u00d0\u0003"+
		",\u0016\u0000\u00ca\u00d0\u00038\u001c\u0000\u00cb\u00d0\u0003<\u001e"+
		"\u0000\u00cc\u00d0\u00032\u0019\u0000\u00cd\u00d0\u00036\u001b\u0000\u00ce"+
		"\u00d0\u0003B!\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00cf\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0#\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u000f\u0000\u0000\u00d2\u00d3\u0005\u0001"+
		"\u0000\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00d5\u0005\u0002\u0000"+
		"\u0000\u00d5\u00d6\u0005\u000e\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000"+
		"\u00d7\u00dc\u0003(\u0014\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9"+
		"\u00db\u0003(\u0014\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\'\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e1\u0005%\u0000\u0000\u00e0\u00e2\u0003*\u0015"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2)\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\b\u0000\u0000"+
		"\u00e4\u00e8\u0003L&\u0000\u00e5\u00e7\u0005\t\u0000\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed+\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		"\u0010\u0000\u0000\u00ef\u00f0\u0005\u0001\u0000\u0000\u00f0\u00f1\u0003"+
		".\u0017\u0000\u00f1\u00f2\u0005\u0002\u0000\u0000\u00f2\u00f3\u0005\u000e"+
		"\u0000\u0000\u00f3-\u0001\u0000\u0000\u0000\u00f4\u00f9\u00030\u0018\u0000"+
		"\u00f5\u00f6\u0005\n\u0000\u0000\u00f6\u00f8\u00030\u0018\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"/\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0005%\u0000\u0000\u00fd\u00ff\u0003*\u0015\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103\u0001\u0000"+
		"\u0000\u0000\u0100\u0103\u0003V+\u0000\u0101\u0103\u0005(\u0000\u0000"+
		"\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u01031\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005\u0011\u0000\u0000\u0105\u0106\u0005\u0001\u0000\u0000\u0106"+
		"\u0107\u0003D\"\u0000\u0107\u0108\u0005\u0002\u0000\u0000\u0108\u010a"+
		"\u0003\u0016\u000b\u0000\u0109\u010b\u00034\u001a\u0000\u010a\u0109\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b3\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005\u0012\u0000\u0000\u010d\u0110\u0003\u0016"+
		"\u000b\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010c\u0001\u0000"+
		"\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u01105\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\u0013\u0000\u0000\u0112\u0113\u0005\u0001\u0000"+
		"\u0000\u0113\u0114\u0003D\"\u0000\u0114\u0115\u0005\u0002\u0000\u0000"+
		"\u0115\u0116\u0003\u0016\u000b\u0000\u01167\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005%\u0000\u0000\u0118\u0119\u0005\u0014\u0000\u0000\u0119\u011a"+
		"\u0003:\u001d\u0000\u011a\u011b\u0005\u000e\u0000\u0000\u011b9\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0003D\"\u0000\u011d\u011f\u0003<\u001e\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011f;\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0015\u0000\u0000\u0121"+
		"\u0122\u0005%\u0000\u0000\u0122\u0123\u0005\u0001\u0000\u0000\u0123\u0124"+
		"\u0003>\u001f\u0000\u0124\u0125\u0005\u0002\u0000\u0000\u0125=\u0001\u0000"+
		"\u0000\u0000\u0126\u0129\u0003@ \u0000\u0127\u0129\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0129?\u0001\u0000\u0000\u0000\u012a\u012f\u0003D\"\u0000\u012b\u012c"+
		"\u0005\n\u0000\u0000\u012c\u012e\u0003D\"\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130A\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0016\u0000"+
		"\u0000\u0133\u0134\u0003D\"\u0000\u0134\u0135\u0005\u000e\u0000\u0000"+
		"\u0135C\u0001\u0000\u0000\u0000\u0136\u0137\u0003F#\u0000\u0137E\u0001"+
		"\u0000\u0000\u0000\u0138\u013d\u0003H$\u0000\u0139\u013a\u0005\u0017\u0000"+
		"\u0000\u013a\u013c\u0003H$\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013eG\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u0145\u0003J%\u0000\u0141\u0142\u0005\u0018"+
		"\u0000\u0000\u0142\u0144\u0003J%\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146I\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0148\u014c\u0003L&\u0000\u0149\u014a\u0003"+
		"Z-\u0000\u014a\u014b\u0003L&\u0000\u014b\u014d\u0001\u0000\u0000\u0000"+
		"\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014dK\u0001\u0000\u0000\u0000\u014e\u0154\u0003P(\u0000\u014f\u0150"+
		"\u0003N\'\u0000\u0150\u0151\u0003P(\u0000\u0151\u0153\u0001\u0000\u0000"+
		"\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000"+
		"\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155M\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0007\u0001\u0000\u0000\u0158O\u0001\u0000\u0000\u0000\u0159"+
		"\u015f\u0003T*\u0000\u015a\u015b\u0003R)\u0000\u015b\u015c\u0003T*\u0000"+
		"\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000"+
		"\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160Q\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u0007\u0002\u0000\u0000\u0163"+
		"S\u0001\u0000\u0000\u0000\u0164\u0165\u0003X,\u0000\u0165\u0166\u0005"+
		"%\u0000\u0000\u0166\u0167\u0003*\u0015\u0000\u0167\u0173\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0003X,\u0000\u0169\u016a\u0003V+\u0000\u016a\u0173"+
		"\u0001\u0000\u0000\u0000\u016b\u0173\u0005(\u0000\u0000\u016c\u016d\u0005"+
		"\u001e\u0000\u0000\u016d\u0173\u0003T*\u0000\u016e\u016f\u0005\u0001\u0000"+
		"\u0000\u016f\u0170\u0003D\"\u0000\u0170\u0171\u0005\u0002\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0164\u0001\u0000\u0000\u0000"+
		"\u0172\u0168\u0001\u0000\u0000\u0000\u0172\u016b\u0001\u0000\u0000\u0000"+
		"\u0172\u016c\u0001\u0000\u0000\u0000\u0172\u016e\u0001\u0000\u0000\u0000"+
		"\u0173U\u0001\u0000\u0000\u0000\u0174\u0175\u0007\u0003\u0000\u0000\u0175"+
		"W\u0001\u0000\u0000\u0000\u0176\u017a\u0005\u0019\u0000\u0000\u0177\u017a"+
		"\u0005\u001a\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0176"+
		"\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u017aY\u0001\u0000\u0000\u0000\u017b\u017c\u0007"+
		"\u0004\u0000\u0000\u017c[\u0001\u0000\u0000\u0000 ajvz\u0083\u0088\u0092"+
		"\u00a1\u00af\u00b7\u00bc\u00c5\u00cf\u00dc\u00e1\u00e8\u00ec\u00f9\u00fe"+
		"\u0102\u010a\u010f\u011e\u0128\u012f\u013d\u0145\u014c\u0154\u015f\u0172"+
		"\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}