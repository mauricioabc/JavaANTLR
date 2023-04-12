/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compiler.javaantlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author mauricio.rodrigues
 */
    import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class arithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, RPAREN=4, PLUS=5, MINUS=6, 
		TIMES=7, DIV=8, GT=9, LT=10, EQ=11, POINT=12, POW=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", 
			"UNSIGNED_INTEGER", "E", "SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "DIV", "GT", "LT", "EQ", "POINT", "POW", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'='", "'.'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE", "SCIENTIFIC_NUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TIMES", "DIV", "GT", "LT", "EQ", "POINT", "POW", "WS"
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


	public arithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000es\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005"+
		"\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0004\u0004\u0004B\b\u0004\u000b\u0004\f\u0004C\u0001"+
		"\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004I\u0003\u0004"+
		"L\b\u0004\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005\f\u0005P\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013"+
		"n\b\u0013\u000b\u0013\f\u0013o\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0002\t\u0000\u000b\u0000\r"+
		"\u0000\u000f\u0000\u0011\u0003\u0013\u0004\u0015\u0005\u0017\u0006\u0019"+
		"\u0007\u001b\b\u001d\t\u001f\n!\u000b#\f%\r\'\u000e\u0001\u0000\u0004"+
		"\u0003\u0000AZ__az\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r"+
		"  u\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000"+
		"\u0000\u00077\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000b"+
		"N\u0001\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fT\u0001\u0000"+
		"\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000"+
		"\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019"+
		"^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001db\u0001"+
		"\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000"+
		"\u0000#h\u0001\u0000\u0000\u0000%j\u0001\u0000\u0000\u0000\'m\u0001\u0000"+
		"\u0000\u0000)-\u0003\u0003\u0001\u0000*,\u0003\u0005\u0002\u0000+*\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000002\u0007\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0004"+
		"\u0001\u0000\u0000\u000036\u0003\u0003\u0001\u000046\u000209\u000053\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0006\u0001\u0000\u0000"+
		"\u00007>\u0003\t\u0004\u00008:\u0003\r\u0006\u00009;\u0003\u000f\u0007"+
		"\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0003\u000b\u0005\u0000=?\u0001\u0000\u0000\u0000>8\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\b\u0001\u0000\u0000\u0000"+
		"@B\u000209\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C"+
		"A\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DK\u0001\u0000\u0000"+
		"\u0000EG\u0005.\u0000\u0000FH\u000209\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\n\u0001\u0000\u0000\u0000MO\u000209\u0000NM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0007\u0001\u0000\u0000"+
		"S\u000e\u0001\u0000\u0000\u0000TU\u0007\u0002\u0000\u0000U\u0010\u0001"+
		"\u0000\u0000\u0000VW\u0005(\u0000\u0000W\u0012\u0001\u0000\u0000\u0000"+
		"XY\u0005)\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005+\u0000\u0000"+
		"[\u0016\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]\u0018\u0001\u0000"+
		"\u0000\u0000^_\u0005*\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005"+
		"/\u0000\u0000a\u001c\u0001\u0000\u0000\u0000bc\u0005>\u0000\u0000c\u001e"+
		"\u0001\u0000\u0000\u0000de\u0005<\u0000\u0000e \u0001\u0000\u0000\u0000"+
		"fg\u0005=\u0000\u0000g\"\u0001\u0000\u0000\u0000hi\u0005.\u0000\u0000"+
		"i$\u0001\u0000\u0000\u0000jk\u0005^\u0000\u0000k&\u0001\u0000\u0000\u0000"+
		"ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0006\u0013\u0000\u0000r(\u0001\u0000\u0000\u0000\u000b"+
		"\u0000-15:>CIKPo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
