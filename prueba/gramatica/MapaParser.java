// Generated from c:/Users/Karimlk/Desktop/prueba/gramatica/MapaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MapaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAPA=1, TE_DA=2, TE_QUITA=3, ENTERRADO_EN=4, OCULTO=5, PUNTOS=6, COMA=7, 
		DORADO=8, NOMBRE_BARCO=9, NUMERO=10, NOMBRE_PELIGRO=11, WS=12;
	public static final int
		RULE_mapa = 0, RULE_barcoInfo = 1, RULE_posicionInfo = 2, RULE_peligroInfo = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"mapa", "barcoInfo", "posicionInfo", "peligroInfo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"Mapa de pruebas\"'", "'te da'", "'te quita'", "'est\\u00E1 enterrado en'", 
			"'esta oculto en'", "'puntos'", "','", "'Dorado'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAPA", "TE_DA", "TE_QUITA", "ENTERRADO_EN", "OCULTO", "PUNTOS", 
			"COMA", "DORADO", "NOMBRE_BARCO", "NUMERO", "NOMBRE_PELIGRO", "WS"
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
	public String getGrammarFileName() { return "MapaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MapaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapaContext extends ParserRuleContext {
		public TerminalNode MAPA() { return getToken(MapaParser.MAPA, 0); }
		public TerminalNode EOF() { return getToken(MapaParser.EOF, 0); }
		public List<PeligroInfoContext> peligroInfo() {
			return getRuleContexts(PeligroInfoContext.class);
		}
		public PeligroInfoContext peligroInfo(int i) {
			return getRuleContext(PeligroInfoContext.class,i);
		}
		public List<BarcoInfoContext> barcoInfo() {
			return getRuleContexts(BarcoInfoContext.class);
		}
		public BarcoInfoContext barcoInfo(int i) {
			return getRuleContext(BarcoInfoContext.class,i);
		}
		public List<PosicionInfoContext> posicionInfo() {
			return getRuleContexts(PosicionInfoContext.class);
		}
		public PosicionInfoContext posicionInfo(int i) {
			return getRuleContext(PosicionInfoContext.class,i);
		}
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterMapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitMapa(this);
		}
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mapa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(MAPA);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE_PELIGRO) {
				{
				{
				setState(9);
				peligroInfo();
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(15);
					barcoInfo();
					}
					} 
				}
				setState(20);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE_BARCO) {
				{
				{
				setState(21);
				posicionInfo();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(EOF);
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
	public static class BarcoInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_BARCO() { return getToken(MapaParser.NOMBRE_BARCO, 0); }
		public TerminalNode TE_DA() { return getToken(MapaParser.TE_DA, 0); }
		public TerminalNode NUMERO() { return getToken(MapaParser.NUMERO, 0); }
		public TerminalNode PUNTOS() { return getToken(MapaParser.PUNTOS, 0); }
		public BarcoInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barcoInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterBarcoInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitBarcoInfo(this);
		}
	}

	public final BarcoInfoContext barcoInfo() throws RecognitionException {
		BarcoInfoContext _localctx = new BarcoInfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_barcoInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(NOMBRE_BARCO);
			setState(30);
			match(TE_DA);
			setState(31);
			match(NUMERO);
			setState(32);
			match(PUNTOS);
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
	public static class PosicionInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_BARCO() { return getToken(MapaParser.NOMBRE_BARCO, 0); }
		public TerminalNode ENTERRADO_EN() { return getToken(MapaParser.ENTERRADO_EN, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(MapaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(MapaParser.NUMERO, i);
		}
		public TerminalNode COMA() { return getToken(MapaParser.COMA, 0); }
		public PosicionInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posicionInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterPosicionInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitPosicionInfo(this);
		}
	}

	public final PosicionInfoContext posicionInfo() throws RecognitionException {
		PosicionInfoContext _localctx = new PosicionInfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_posicionInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(NOMBRE_BARCO);
			setState(35);
			match(ENTERRADO_EN);
			setState(36);
			match(NUMERO);
			setState(37);
			match(COMA);
			setState(38);
			match(NUMERO);
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
	public static class PeligroInfoContext extends ParserRuleContext {
		public TerminalNode NOMBRE_PELIGRO() { return getToken(MapaParser.NOMBRE_PELIGRO, 0); }
		public TerminalNode TE_QUITA() { return getToken(MapaParser.TE_QUITA, 0); }
		public TerminalNode NUMERO() { return getToken(MapaParser.NUMERO, 0); }
		public TerminalNode PUNTOS() { return getToken(MapaParser.PUNTOS, 0); }
		public PeligroInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peligroInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).enterPeligroInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapaParserListener ) ((MapaParserListener)listener).exitPeligroInfo(this);
		}
	}

	public final PeligroInfoContext peligroInfo() throws RecognitionException {
		PeligroInfoContext _localctx = new PeligroInfoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_peligroInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NOMBRE_PELIGRO);
			setState(41);
			match(TE_QUITA);
			setState(42);
			match(NUMERO);
			setState(43);
			match(PUNTOS);
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
		"\u0004\u0001\f.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u000b\b\u0000\n\u0000\f\u0000\u000e\t\u0000\u0001\u0000\u0005\u0000"+
		"\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0005\u0000\u0017"+
		"\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u0000,\u0000\b\u0001\u0000\u0000\u0000\u0002"+
		"\u001d\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006("+
		"\u0001\u0000\u0000\u0000\b\f\u0005\u0001\u0000\u0000\t\u000b\u0003\u0006"+
		"\u0003\u0000\n\t\u0001\u0000\u0000\u0000\u000b\u000e\u0001\u0000\u0000"+
		"\u0000\f\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u0012"+
		"\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000f\u0011\u0003"+
		"\u0002\u0001\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0018\u0001\u0000\u0000\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0015\u0017\u0003\u0004\u0002\u0000\u0016\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001"+
		"\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\t\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0005\n\u0000"+
		"\u0000 !\u0005\u0006\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005"+
		"\t\u0000\u0000#$\u0005\u0004\u0000\u0000$%\u0005\n\u0000\u0000%&\u0005"+
		"\u0007\u0000\u0000&\'\u0005\n\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"()\u0005\u000b\u0000\u0000)*\u0005\u0003\u0000\u0000*+\u0005\n\u0000\u0000"+
		"+,\u0005\u0006\u0000\u0000,\u0007\u0001\u0000\u0000\u0000\u0003\f\u0012"+
		"\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}