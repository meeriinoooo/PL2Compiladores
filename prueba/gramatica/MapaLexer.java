// Generated from c:/Users/Karimlk/Desktop/prueba/gramatica/MapaLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MapaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAPA=1, TE_DA=2, TE_QUITA=3, ENTERRADO_EN=4, OCULTO=5, PUNTOS=6, COMA=7, 
		DORADO=8, NOMBRE_BARCO=9, NUMERO=10, NOMBRE_PELIGRO=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAPA", "TE_DA", "TE_QUITA", "ENTERRADO_EN", "OCULTO", "PUNTOS", "COMA", 
			"DORADO", "NOMBRE_BARCO", "NUMERO", "NOMBRE_PELIGRO", "WS"
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


	public MapaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MapaLexer.g4"; }

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
		"\u0004\u0000\f\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bo\b\b\n\b\f\br\t\b\u0001\b\u0001\b\u0001\t\u0004\tw"+
		"\b\t\u000b\t\f\tx\u0001\n\u0001\n\u0001\n\u0005\n~\b\n\n\n\f\n\u0081\t"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u0086\b\u000b\u000b\u000b\f"+
		"\u000b\u0087\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0001\u0000\u0004\u0001\u0000AZ\u0003\u0000  A"+
		"Zaz\u0001\u000009\u0003\u0000\t\n\r\r  \u008e\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007:"+
		"\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000b[\u0001\u0000"+
		"\u0000\u0000\rb\u0001\u0000\u0000\u0000\u000fd\u0001\u0000\u0000\u0000"+
		"\u0011k\u0001\u0000\u0000\u0000\u0013v\u0001\u0000\u0000\u0000\u0015z"+
		"\u0001\u0000\u0000\u0000\u0017\u0085\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\"\u0000\u0000\u001a\u001b\u0005M\u0000\u0000\u001b\u001c\u0005"+
		"a\u0000\u0000\u001c\u001d\u0005p\u0000\u0000\u001d\u001e\u0005a\u0000"+
		"\u0000\u001e\u001f\u0005 \u0000\u0000\u001f \u0005d\u0000\u0000 !\u0005"+
		"e\u0000\u0000!\"\u0005 \u0000\u0000\"#\u0005p\u0000\u0000#$\u0005r\u0000"+
		"\u0000$%\u0005u\u0000\u0000%&\u0005e\u0000\u0000&\'\u0005b\u0000\u0000"+
		"\'(\u0005a\u0000\u0000()\u0005s\u0000\u0000)*\u0005\"\u0000\u0000*\u0002"+
		"\u0001\u0000\u0000\u0000+,\u0005t\u0000\u0000,-\u0005e\u0000\u0000-.\u0005"+
		" \u0000\u0000./\u0005d\u0000\u0000/0\u0005a\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005t\u0000\u000023\u0005e\u0000\u000034\u0005 \u0000"+
		"\u000045\u0005q\u0000\u000056\u0005u\u0000\u000067\u0005i\u0000\u0000"+
		"78\u0005t\u0000\u000089\u0005a\u0000\u00009\u0006\u0001\u0000\u0000\u0000"+
		":;\u0005e\u0000\u0000;<\u0005s\u0000\u0000<=\u0005t\u0000\u0000=>\u0005"+
		"\u00e1\u0000\u0000>?\u0005 \u0000\u0000?@\u0005e\u0000\u0000@A\u0005n"+
		"\u0000\u0000AB\u0005t\u0000\u0000BC\u0005e\u0000\u0000CD\u0005r\u0000"+
		"\u0000DE\u0005r\u0000\u0000EF\u0005a\u0000\u0000FG\u0005d\u0000\u0000"+
		"GH\u0005o\u0000\u0000HI\u0005 \u0000\u0000IJ\u0005e\u0000\u0000JK\u0005"+
		"n\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005e\u0000\u0000MN\u0005"+
		"s\u0000\u0000NO\u0005t\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005 \u0000"+
		"\u0000QR\u0005o\u0000\u0000RS\u0005c\u0000\u0000ST\u0005u\u0000\u0000"+
		"TU\u0005l\u0000\u0000UV\u0005t\u0000\u0000VW\u0005o\u0000\u0000WX\u0005"+
		" \u0000\u0000XY\u0005e\u0000\u0000YZ\u0005n\u0000\u0000Z\n\u0001\u0000"+
		"\u0000\u0000[\\\u0005p\u0000\u0000\\]\u0005u\u0000\u0000]^\u0005n\u0000"+
		"\u0000^_\u0005t\u0000\u0000_`\u0005o\u0000\u0000`a\u0005s\u0000\u0000"+
		"a\f\u0001\u0000\u0000\u0000bc\u0005,\u0000\u0000c\u000e\u0001\u0000\u0000"+
		"\u0000de\u0005D\u0000\u0000ef\u0005o\u0000\u0000fg\u0005r\u0000\u0000"+
		"gh\u0005a\u0000\u0000hi\u0005d\u0000\u0000ij\u0005o\u0000\u0000j\u0010"+
		"\u0001\u0000\u0000\u0000kl\u0005\"\u0000\u0000lp\u0007\u0000\u0000\u0000"+
		"mo\u0007\u0001\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\"\u0000\u0000t\u0012\u0001"+
		"\u0000\u0000\u0000uw\u0007\u0002\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y\u0014\u0001\u0000\u0000\u0000z{\u0005\"\u0000\u0000{\u007f\u0007"+
		"\u0000\u0000\u0000|~\u0007\u0001\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\"\u0000\u0000\u0083\u0016\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0007\u0003\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0006\u000b\u0000\u0000\u008a\u0018\u0001"+
		"\u0000\u0000\u0000\u0005\u0000px\u007f\u0087\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}