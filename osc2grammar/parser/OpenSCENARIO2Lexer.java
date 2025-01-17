// Generated from F:\github\myfork\osc2checker\osc2grammar/OpenSCENARIO2.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpenSCENARIO2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, OPEN_PAREN=79, CLOSE_PAREN=80, 
		OPEN_BRACK=81, CLOSE_BRACK=82, OPEN_BRACE=83, CLOSE_BRACE=84, NEWLINE=85, 
		SKIP_=86, BLOCK_COMMENT=87, LINE_COMMENT=88, StringLiteral=89, FloatLiteral=90, 
		UintLiteral=91, HexUintLiteral=92, IntLiteral=93, BoolLiteral=94, Identifier=95;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "NEWLINE", 
			"SKIP_", "SPACES", "LINE_JOINING", "RN", "BLOCK_COMMENT", "LINE_COMMENT", 
			"StringLiteral", "Shortstring", "ShortstringElem", "ShortstringChar", 
			"Longstring", "LongstringElem", "LongstringChar", "StringEscapeSeq", 
			"FloatLiteral", "UintLiteral", "HexUintLiteral", "IntLiteral", "BoolLiteral", 
			"Identifier", "NonVerticalLineChar", "Digit", "HexDigit", "IdStartChar", 
			"IdChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'.'", "'type'", "'is'", "'SI'", "'unit'", "'of'", 
			"','", "':'", "'enum'", "'='", "'!'", "'struct'", "'inherits'", "'=='", 
			"'actor'", "'scenario'", "'action'", "'modifier'", "'extend'", "'global'", 
			"'list'", "'int'", "'uint'", "'float'", "'bool'", "'string'", "'event'", 
			"'if'", "'@'", "'as'", "'rise'", "'fall'", "'elapsed'", "'every'", "'var'", 
			"'sample'", "'with'", "'keep'", "'default'", "'hard'", "'remove_default'", 
			"'on'", "'do'", "'serial'", "'one_of'", "'parallel'", "'wait'", "'emit'", 
			"'call'", "'until'", "'def'", "'->'", "'expression'", "'undefined'", 
			"'external'", "'only'", "'cover'", "'record'", "'?'", "'=>'", "'or'", 
			"'and'", "'not'", "'!='", "'<'", "'<='", "'>'", "'>='", "'in'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'it'", "'range'", "'..'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "NEWLINE", 
			"SKIP_", "BLOCK_COMMENT", "LINE_COMMENT", "StringLiteral", "FloatLiteral", 
			"UintLiteral", "HexUintLiteral", "IntLiteral", "BoolLiteral", "Identifier"
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


		int mOpened = 0;
		static final int TAB_INDENT = 4;
		java.util.LinkedList<Token> mTokens = new java.util.LinkedList<>();
		java.util.LinkedList<Integer> mIndents = new java.util.LinkedList<>();
		Token mLastToken = null;
		Token commonToken(int tokenType, String text)
		{
			int stop = getCharIndex() - 1;
			int start = text.isEmpty() ? stop : stop - text.length() + 1;
			CommonToken token = new CommonToken(_tokenFactorySourcePair, tokenType, DEFAULT_TOKEN_CHANNEL, start, stop);
			token.setLine(getLine());
			token.setCharPositionInLine(getCharPositionInLine());
			token.setText(text);
			return token;
		}
		Token createDedent()
		{
			return commonToken(OpenSCENARIO2Parser.DEDENT, "<DEDENT>");
		}
		void processNewLine(int indent)
		{
			emit(commonToken(OpenSCENARIO2Parser.NEWLINE, "\n"));
			int previous = mIndents.isEmpty() ? 0 : mIndents.getLast();
			if (indent == previous)
			{
				skip();
			}
			else if (indent > previous) {
				mIndents.add(indent);
				emit(commonToken(OpenSCENARIO2Parser.INDENT, "<INDENT>"));
			}
			else {
				while (!mIndents.isEmpty() && mIndents.getLast() > indent)
				{
					emit(createDedent());
					mIndents.removeLast();
				}
			}
		}
		@Override
		public void emit(Token token) {
			mTokens.add(token);
			super.setToken(token);
		}
		@Override
		public Token nextToken() {
			if (!mIndents.isEmpty() && _input.LA(1) == EOF) {
				for(int i = mTokens.size() -1; i>=0 ; i--)
				{
						if (mTokens.get(i).getType() == EOF)
						{
							mTokens.remove(i);
						}
				}

				emit(commonToken(OpenSCENARIO2Parser.NEWLINE, "\n"));
				
				while (!mIndents.isEmpty()) {
					emit(createDedent());
					mIndents.removeLast();
				}

				emit(commonToken(EOF, "<EOF>"));
			}

			Token next = super.nextToken();

			if (next.getChannel() == DEFAULT_TOKEN_CHANNEL) {
				mLastToken = next;
			}

			if (!mTokens.isEmpty())
			{
				next = mTokens.getFirst();
				mTokens.removeFirst();
			}
			return next;
		}
		void onNewLine(){
			int indent  = 0;
			String text = getText();
			for(int i=0;i<text.length();i++)
			{
				char c=text.charAt(i);
				if(c == '\t')
					indent += TAB_INDENT - (indent % TAB_INDENT);
				else if( c == ' ')
					indent ++;
			}
			int next = _input.LA(1);
			int nextnext = _input.LA(2);
			if (mOpened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
				skip();
			}
			else
			{
				processNewLine(indent);
				skip();
			}
		}
		boolean atStartOfInput(){
			return getCharPositionInLine() == 0 && getLine() == 1;
		}

		void openBrace(){
			mOpened++;
		}
		void closeBrace(){
			mOpened--;
		}


	public OpenSCENARIO2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OpenSCENARIO2.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 78:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			OPEN_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			CLOSE_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			openBrace();
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			closeBrace();
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			openBrace();
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			closeBrace();
			break;
		}
	}
	private void OPEN_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			openBrace();
			break;
		}
	}
	private void CLOSE_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			closeBrace();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			onNewLine();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 84:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2a\u0344\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3"+
		"F\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3N\3N\3N\3"+
		"O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3"+
		"V\3V\5V\u0275\nV\5V\u0277\nV\3V\3V\3W\3W\5W\u027d\nW\3W\3W\3X\6X\u0282"+
		"\nX\rX\16X\u0283\3Y\3Y\5Y\u0288\nY\3Y\5Y\u028b\nY\3Y\3Y\3Z\5Z\u0290\n"+
		"Z\3Z\3Z\3[\3[\3[\3[\7[\u0298\n[\f[\16[\u029b\13[\3[\3[\3[\3[\3[\3\\\3"+
		"\\\7\\\u02a4\n\\\f\\\16\\\u02a7\13\\\3\\\3\\\3]\3]\5]\u02ad\n]\3^\3^\7"+
		"^\u02b1\n^\f^\16^\u02b4\13^\3^\3^\3^\7^\u02b9\n^\f^\16^\u02bc\13^\3^\5"+
		"^\u02bf\n^\3_\3_\5_\u02c3\n_\3`\3`\3a\3a\3a\3a\3a\7a\u02cc\na\fa\16a\u02cf"+
		"\13a\3a\3a\3a\3a\3a\3a\3a\3a\7a\u02d9\na\fa\16a\u02dc\13a\3a\3a\3a\5a"+
		"\u02e1\na\3b\3b\5b\u02e5\nb\3c\3c\3d\3d\3d\3d\5d\u02ed\nd\3e\5e\u02f0"+
		"\ne\3e\7e\u02f3\ne\fe\16e\u02f6\13e\3e\3e\6e\u02fa\ne\re\16e\u02fb\3e"+
		"\3e\5e\u0300\ne\3e\6e\u0303\ne\re\16e\u0304\5e\u0307\ne\3f\6f\u030a\n"+
		"f\rf\16f\u030b\3g\3g\3g\3g\6g\u0312\ng\rg\16g\u0313\3h\3h\6h\u0318\nh"+
		"\rh\16h\u0319\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0325\ni\3j\3j\7j\u0329\n"+
		"j\fj\16j\u032c\13j\3j\3j\6j\u0330\nj\rj\16j\u0331\3j\3j\5j\u0336\nj\3"+
		"k\3k\3l\3l\3m\3m\3n\5n\u033f\nn\3o\3o\5o\u0343\no\3\u0299\2p\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00af\2\u00b1\2\u00b3\2\u00b5Y\u00b7Z\u00b9"+
		"[\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\\\u00cb"+
		"]\u00cd^\u00cf_\u00d1`\u00d3a\u00d5\2\u00d7\2\u00d9\2\u00db\2\u00dd\2"+
		"\3\2\r\4\2\13\13\"\"\4\2\f\f\16\17\7\2\f\f\17\17$$))^^\3\2^^\4\2--//\4"+
		"\2GGgg\3\2~~\3\2\62;\5\2\62;CHch\u0129\2C\\aac|\u00ac\u00ac\u00b7\u00b7"+
		"\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0243\u0252\u02c3\u02c8\u02d3"+
		"\u02e2\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e"+
		"\u0390\u03a3\u03a5\u03d0\u03d2\u03f7\u03f9\u0483\u048c\u04d0\u04d2\u04fb"+
		"\u0502\u0511\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4"+
		"\u0623\u063c\u0642\u064c\u0670\u0671\u0673\u06d5\u06d7\u06d7\u06e7\u06e8"+
		"\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712\u0714\u0731\u074f\u076f"+
		"\u0782\u07a7\u07b3\u07b3\u0906\u093b\u093f\u093f\u0952\u0952\u095a\u0963"+
		"\u097f\u097f\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4"+
		"\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f3"+
		"\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38"+
		"\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93"+
		"\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2"+
		"\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35"+
		"\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85"+
		"\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1"+
		"\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a"+
		"\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa"+
		"\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e"+
		"\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3"+
		"\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48"+
		"\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99"+
		"\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2"+
		"\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02"+
		"\u0f42\u0f49\u0f4b\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c"+
		"\u1052\u1057\u10a2\u10c7\u10d2\u10fc\u10fe\u10fe\u1102\u115b\u1161\u11a4"+
		"\u11aa\u11fb\u1202\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f"+
		"\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2"+
		"\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391"+
		"\u13a2\u13f6\u1403\u166e\u1671\u1678\u1683\u169c\u16a2\u16ec\u16f0\u16f2"+
		"\u1702\u170e\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772"+
		"\u1782\u17b5\u17d9\u17d9\u17de\u17de\u1822\u1879\u1882\u18aa\u1902\u191e"+
		"\u1952\u196f\u1972\u1976\u1982\u19ab\u19c3\u19c9\u1a02\u1a18\u1d02\u1dc1"+
		"\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f"+
		"\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6"+
		"\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd"+
		"\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2073\u2073\u2081\u2081\u2092\u2096"+
		"\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211a\u211f\u2126\u2126"+
		"\u2128\u2128\u212a\u212a\u212c\u2133\u2135\u213b\u213e\u2141\u2147\u214b"+
		"\u2162\u2185\u2c02\u2c30\u2c32\u2c60\u2c82\u2ce6\u2d02\u2d27\u2d32\u2d67"+
		"\u2d71\u2d71\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0"+
		"\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u3007\u3009\u3023\u302b"+
		"\u3033\u3037\u303a\u303e\u3043\u3098\u309d\u30a1\u30a3\u30fc\u30fe\u3101"+
		"\u3107\u312e\u3133\u3190\u31a2\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fbd"+
		"\ua002\ua48e\ua802\ua803\ua805\ua807\ua809\ua80c\ua80e\ua824\uac02\ud7a5"+
		"\uf902\ufa2f\ufa32\ufa6c\ufa72\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f"+
		"\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46"+
		"\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76"+
		"\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1"+
		"\uffd4\uffd9\uffdc\uffde\u0096\2\62;\u0302\u0371\u0485\u0488\u0593\u05bb"+
		"\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c7\u05c9\u05c9\u0612\u0617"+
		"\u064d\u0660\u0662\u066b\u0672\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea"+
		"\u06ec\u06ef\u06f2\u06fb\u0713\u0713\u0732\u074c\u07a8\u07b2\u0903\u0905"+
		"\u093e\u093e\u0940\u094f\u0953\u0956\u0964\u0965\u0968\u0971\u0983\u0985"+
		"\u09be\u09be\u09c0\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5"+
		"\u09e8\u09f1\u0a03\u0a05\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f"+
		"\u0a68\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf"+
		"\u0ae4\u0ae5\u0ae8\u0af1\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a"+
		"\u0b4d\u0b4f\u0b58\u0b59\u0b68\u0b71\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca"+
		"\u0bcc\u0bcf\u0bd9\u0bd9\u0be8\u0bf1\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a"+
		"\u0c4c\u0c4f\u0c57\u0c58\u0c68\u0c71\u0c84\u0c85\u0cbe\u0cbe\u0cc0\u0cc6"+
		"\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce8\u0cf1\u0d04\u0d05\u0d40\u0d45"+
		"\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc"+
		"\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c"+
		"\u0e49\u0e50\u0e52\u0e5b\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf"+
		"\u0ed2\u0edb\u0f1a\u0f1b\u0f22\u0f2b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b"+
		"\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8"+
		"\u102e\u1034\u1038\u103b\u1042\u104b\u1058\u105b\u1361\u1361\u136b\u1373"+
		"\u1714\u1716\u1734\u1736\u1754\u1755\u1774\u1775\u17b8\u17d5\u17df\u17df"+
		"\u17e2\u17eb\u180d\u180f\u1812\u181b\u18ab\u18ab\u1922\u192d\u1932\u193d"+
		"\u1948\u1951\u19b2\u19c2\u19ca\u19cb\u19d2\u19db\u1a19\u1a1d\u1dc2\u1dc5"+
		"\u2041\u2042\u2056\u2056\u20d2\u20de\u20e3\u20e3\u20e7\u20ed\u302c\u3031"+
		"\u309b\u309c\ua804\ua804\ua808\ua808\ua80d\ua80d\ua825\ua829\ufb20\ufb20"+
		"\ufe02\ufe11\ufe22\ufe25\ufe35\ufe36\ufe4f\ufe51\uff12\uff1b\uff41\uff41"+
		"\2\u0355\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\3\u00df\3\2\2"+
		"\2\5\u00e6\3\2\2\2\7\u00e8\3\2\2\2\t\u00ed\3\2\2\2\13\u00f0\3\2\2\2\r"+
		"\u00f3\3\2\2\2\17\u00f8\3\2\2\2\21\u00fb\3\2\2\2\23\u00fd\3\2\2\2\25\u00ff"+
		"\3\2\2\2\27\u0104\3\2\2\2\31\u0106\3\2\2\2\33\u0108\3\2\2\2\35\u010f\3"+
		"\2\2\2\37\u0118\3\2\2\2!\u011b\3\2\2\2#\u0121\3\2\2\2%\u012a\3\2\2\2\'"+
		"\u0131\3\2\2\2)\u013a\3\2\2\2+\u0141\3\2\2\2-\u0148\3\2\2\2/\u014d\3\2"+
		"\2\2\61\u0151\3\2\2\2\63\u0156\3\2\2\2\65\u015c\3\2\2\2\67\u0161\3\2\2"+
		"\29\u0168\3\2\2\2;\u016e\3\2\2\2=\u0171\3\2\2\2?\u0173\3\2\2\2A\u0176"+
		"\3\2\2\2C\u017b\3\2\2\2E\u0180\3\2\2\2G\u0188\3\2\2\2I\u018e\3\2\2\2K"+
		"\u0192\3\2\2\2M\u0199\3\2\2\2O\u019e\3\2\2\2Q\u01a3\3\2\2\2S\u01ab\3\2"+
		"\2\2U\u01b0\3\2\2\2W\u01bf\3\2\2\2Y\u01c2\3\2\2\2[\u01c5\3\2\2\2]\u01cc"+
		"\3\2\2\2_\u01d3\3\2\2\2a\u01dc\3\2\2\2c\u01e1\3\2\2\2e\u01e6\3\2\2\2g"+
		"\u01eb\3\2\2\2i\u01f1\3\2\2\2k\u01f5\3\2\2\2m\u01f8\3\2\2\2o\u0203\3\2"+
		"\2\2q\u020d\3\2\2\2s\u0216\3\2\2\2u\u021b\3\2\2\2w\u0221\3\2\2\2y\u0228"+
		"\3\2\2\2{\u022a\3\2\2\2}\u022d\3\2\2\2\177\u0230\3\2\2\2\u0081\u0234\3"+
		"\2\2\2\u0083\u0238\3\2\2\2\u0085\u023b\3\2\2\2\u0087\u023d\3\2\2\2\u0089"+
		"\u0240\3\2\2\2\u008b\u0242\3\2\2\2\u008d\u0245\3\2\2\2\u008f\u0248\3\2"+
		"\2\2\u0091\u024a\3\2\2\2\u0093\u024c\3\2\2\2\u0095\u024e\3\2\2\2\u0097"+
		"\u0250\3\2\2\2\u0099\u0252\3\2\2\2\u009b\u0255\3\2\2\2\u009d\u025b\3\2"+
		"\2\2\u009f\u025e\3\2\2\2\u00a1\u0261\3\2\2\2\u00a3\u0264\3\2\2\2\u00a5"+
		"\u0267\3\2\2\2\u00a7\u026a\3\2\2\2\u00a9\u026d\3\2\2\2\u00ab\u0276\3\2"+
		"\2\2\u00ad\u027c\3\2\2\2\u00af\u0281\3\2\2\2\u00b1\u0285\3\2\2\2\u00b3"+
		"\u028f\3\2\2\2\u00b5\u0293\3\2\2\2\u00b7\u02a1\3\2\2\2\u00b9\u02ac\3\2"+
		"\2\2\u00bb\u02be\3\2\2\2\u00bd\u02c2\3\2\2\2\u00bf\u02c4\3\2\2\2\u00c1"+
		"\u02e0\3\2\2\2\u00c3\u02e4\3\2\2\2\u00c5\u02e6\3\2\2\2\u00c7\u02ec\3\2"+
		"\2\2\u00c9\u02ef\3\2\2\2\u00cb\u0309\3\2\2\2\u00cd\u030d\3\2\2\2\u00cf"+
		"\u0315\3\2\2\2\u00d1\u0324\3\2\2\2\u00d3\u0335\3\2\2\2\u00d5\u0337\3\2"+
		"\2\2\u00d7\u0339\3\2\2\2\u00d9\u033b\3\2\2\2\u00db\u033e\3\2\2\2\u00dd"+
		"\u0342\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7r\2"+
		"\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7v\2\2\u00e5\4\3"+
		"\2\2\2\u00e6\u00e7\7\60\2\2\u00e7\6\3\2\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea"+
		"\7{\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7g\2\2\u00ec\b\3\2\2\2\u00ed\u00ee"+
		"\7k\2\2\u00ee\u00ef\7u\2\2\u00ef\n\3\2\2\2\u00f0\u00f1\7U\2\2\u00f1\u00f2"+
		"\7K\2\2\u00f2\f\3\2\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6"+
		"\7k\2\2\u00f6\u00f7\7v\2\2\u00f7\16\3\2\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7h\2\2\u00fa\20\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc\22\3\2\2\2\u00fd\u00fe"+
		"\7<\2\2\u00fe\24\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7w\2\2\u0102\u0103\7o\2\2\u0103\26\3\2\2\2\u0104\u0105\7?\2\2\u0105\30"+
		"\3\2\2\2\u0106\u0107\7#\2\2\u0107\32\3\2\2\2\u0108\u0109\7u\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7w\2\2\u010c\u010d\7e\2\2"+
		"\u010d\u010e\7v\2\2\u010e\34\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7"+
		"p\2\2\u0111\u0112\7j\2\2\u0112\u0113\7g\2\2\u0113\u0114\7t\2\2\u0114\u0115"+
		"\7k\2\2\u0115\u0116\7v\2\2\u0116\u0117\7u\2\2\u0117\36\3\2\2\2\u0118\u0119"+
		"\7?\2\2\u0119\u011a\7?\2\2\u011a \3\2\2\2\u011b\u011c\7c\2\2\u011c\u011d"+
		"\7e\2\2\u011d\u011e\7v\2\2\u011e\u011f\7q\2\2\u011f\u0120\7t\2\2\u0120"+
		"\"\3\2\2\2\u0121\u0122\7u\2\2\u0122\u0123\7e\2\2\u0123\u0124\7g\2\2\u0124"+
		"\u0125\7p\2\2\u0125\u0126\7c\2\2\u0126\u0127\7t\2\2\u0127\u0128\7k\2\2"+
		"\u0128\u0129\7q\2\2\u0129$\3\2\2\2\u012a\u012b\7c\2\2\u012b\u012c\7e\2"+
		"\2\u012c\u012d\7v\2\2\u012d\u012e\7k\2\2\u012e\u012f\7q\2\2\u012f\u0130"+
		"\7p\2\2\u0130&\3\2\2\2\u0131\u0132\7o\2\2\u0132\u0133\7q\2\2\u0133\u0134"+
		"\7f\2\2\u0134\u0135\7k\2\2\u0135\u0136\7h\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139(\3\2\2\2\u013a\u013b\7g\2\2\u013b"+
		"\u013c\7z\2\2\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2\u013e\u013f\7p\2\2"+
		"\u013f\u0140\7f\2\2\u0140*\3\2\2\2\u0141\u0142\7i\2\2\u0142\u0143\7n\2"+
		"\2\u0143\u0144\7q\2\2\u0144\u0145\7d\2\2\u0145\u0146\7c\2\2\u0146\u0147"+
		"\7n\2\2\u0147,\3\2\2\2\u0148\u0149\7n\2\2\u0149\u014a\7k\2\2\u014a\u014b"+
		"\7u\2\2\u014b\u014c\7v\2\2\u014c.\3\2\2\2\u014d\u014e\7k\2\2\u014e\u014f"+
		"\7p\2\2\u014f\u0150\7v\2\2\u0150\60\3\2\2\2\u0151\u0152\7w\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7p\2\2\u0154\u0155\7v\2\2\u0155\62\3\2\2\2\u0156\u0157"+
		"\7h\2\2\u0157\u0158\7n\2\2\u0158\u0159\7q\2\2\u0159\u015a\7c\2\2\u015a"+
		"\u015b\7v\2\2\u015b\64\3\2\2\2\u015c\u015d\7d\2\2\u015d\u015e\7q\2\2\u015e"+
		"\u015f\7q\2\2\u015f\u0160\7n\2\2\u0160\66\3\2\2\2\u0161\u0162\7u\2\2\u0162"+
		"\u0163\7v\2\2\u0163\u0164\7t\2\2\u0164\u0165\7k\2\2\u0165\u0166\7p\2\2"+
		"\u0166\u0167\7i\2\2\u01678\3\2\2\2\u0168\u0169\7g\2\2\u0169\u016a\7x\2"+
		"\2\u016a\u016b\7g\2\2\u016b\u016c\7p\2\2\u016c\u016d\7v\2\2\u016d:\3\2"+
		"\2\2\u016e\u016f\7k\2\2\u016f\u0170\7h\2\2\u0170<\3\2\2\2\u0171\u0172"+
		"\7B\2\2\u0172>\3\2\2\2\u0173\u0174\7c\2\2\u0174\u0175\7u\2\2\u0175@\3"+
		"\2\2\2\u0176\u0177\7t\2\2\u0177\u0178\7k\2\2\u0178\u0179\7u\2\2\u0179"+
		"\u017a\7g\2\2\u017aB\3\2\2\2\u017b\u017c\7h\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7n\2\2\u017e\u017f\7n\2\2\u017fD\3\2\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7n\2\2\u0182\u0183\7c\2\2\u0183\u0184\7r\2\2\u0184\u0185\7u\2\2"+
		"\u0185\u0186\7g\2\2\u0186\u0187\7f\2\2\u0187F\3\2\2\2\u0188\u0189\7g\2"+
		"\2\u0189\u018a\7x\2\2\u018a\u018b\7g\2\2\u018b\u018c\7t\2\2\u018c\u018d"+
		"\7{\2\2\u018dH\3\2\2\2\u018e\u018f\7x\2\2\u018f\u0190\7c\2\2\u0190\u0191"+
		"\7t\2\2\u0191J\3\2\2\2\u0192\u0193\7u\2\2\u0193\u0194\7c\2\2\u0194\u0195"+
		"\7o\2\2\u0195\u0196\7r\2\2\u0196\u0197\7n\2\2\u0197\u0198\7g\2\2\u0198"+
		"L\3\2\2\2\u0199\u019a\7y\2\2\u019a\u019b\7k\2\2\u019b\u019c\7v\2\2\u019c"+
		"\u019d\7j\2\2\u019dN\3\2\2\2\u019e\u019f\7m\2\2\u019f\u01a0\7g\2\2\u01a0"+
		"\u01a1\7g\2\2\u01a1\u01a2\7r\2\2\u01a2P\3\2\2\2\u01a3\u01a4\7f\2\2\u01a4"+
		"\u01a5\7g\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7w\2\2"+
		"\u01a8\u01a9\7n\2\2\u01a9\u01aa\7v\2\2\u01aaR\3\2\2\2\u01ab\u01ac\7j\2"+
		"\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7f\2\2\u01afT\3\2"+
		"\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4"+
		"\7q\2\2\u01b4\u01b5\7x\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7a\2\2\u01b7"+
		"\u01b8\7f\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7h\2\2\u01ba\u01bb\7c\2\2"+
		"\u01bb\u01bc\7w\2\2\u01bc\u01bd\7n\2\2\u01bd\u01be\7v\2\2\u01beV\3\2\2"+
		"\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7p\2\2\u01c1X\3\2\2\2\u01c2\u01c3\7"+
		"f\2\2\u01c3\u01c4\7q\2\2\u01c4Z\3\2\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7"+
		"\7g\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7c\2\2\u01ca"+
		"\u01cb\7n\2\2\u01cb\\\3\2\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7p\2\2\u01ce"+
		"\u01cf\7g\2\2\u01cf\u01d0\7a\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7h\2\2"+
		"\u01d2^\3\2\2\2\u01d3\u01d4\7r\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7t\2"+
		"\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7n\2\2\u01d8\u01d9\7n\2\2\u01d9\u01da"+
		"\7g\2\2\u01da\u01db\7n\2\2\u01db`\3\2\2\2\u01dc\u01dd\7y\2\2\u01dd\u01de"+
		"\7c\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7v\2\2\u01e0b\3\2\2\2\u01e1\u01e2"+
		"\7g\2\2\u01e2\u01e3\7o\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7v\2\2\u01e5"+
		"d\3\2\2\2\u01e6\u01e7\7e\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7n\2\2\u01e9"+
		"\u01ea\7n\2\2\u01eaf\3\2\2\2\u01eb\u01ec\7w\2\2\u01ec\u01ed\7p\2\2\u01ed"+
		"\u01ee\7v\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7n\2\2\u01f0h\3\2\2\2\u01f1"+
		"\u01f2\7f\2\2\u01f2\u01f3\7g\2\2\u01f3\u01f4\7h\2\2\u01f4j\3\2\2\2\u01f5"+
		"\u01f6\7/\2\2\u01f6\u01f7\7@\2\2\u01f7l\3\2\2\2\u01f8\u01f9\7g\2\2\u01f9"+
		"\u01fa\7z\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd\7g\2\2"+
		"\u01fd\u01fe\7u\2\2\u01fe\u01ff\7u\2\2\u01ff\u0200\7k\2\2\u0200\u0201"+
		"\7q\2\2\u0201\u0202\7p\2\2\u0202n\3\2\2\2\u0203\u0204\7w\2\2\u0204\u0205"+
		"\7p\2\2\u0205\u0206\7f\2\2\u0206\u0207\7g\2\2\u0207\u0208\7h\2\2\u0208"+
		"\u0209\7k\2\2\u0209\u020a\7p\2\2\u020a\u020b\7g\2\2\u020b\u020c\7f\2\2"+
		"\u020cp\3\2\2\2\u020d\u020e\7g\2\2\u020e\u020f\7z\2\2\u020f\u0210\7v\2"+
		"\2\u0210\u0211\7g\2\2\u0211\u0212\7t\2\2\u0212\u0213\7p\2\2\u0213\u0214"+
		"\7c\2\2\u0214\u0215\7n\2\2\u0215r\3\2\2\2\u0216\u0217\7q\2\2\u0217\u0218"+
		"\7p\2\2\u0218\u0219\7n\2\2\u0219\u021a\7{\2\2\u021at\3\2\2\2\u021b\u021c"+
		"\7e\2\2\u021c\u021d\7q\2\2\u021d\u021e\7x\2\2\u021e\u021f\7g\2\2\u021f"+
		"\u0220\7t\2\2\u0220v\3\2\2\2\u0221\u0222\7t\2\2\u0222\u0223\7g\2\2\u0223"+
		"\u0224\7e\2\2\u0224\u0225\7q\2\2\u0225\u0226\7t\2\2\u0226\u0227\7f\2\2"+
		"\u0227x\3\2\2\2\u0228\u0229\7A\2\2\u0229z\3\2\2\2\u022a\u022b\7?\2\2\u022b"+
		"\u022c\7@\2\2\u022c|\3\2\2\2\u022d\u022e\7q\2\2\u022e\u022f\7t\2\2\u022f"+
		"~\3\2\2\2\u0230\u0231\7c\2\2\u0231\u0232\7p\2\2\u0232\u0233\7f\2\2\u0233"+
		"\u0080\3\2\2\2\u0234\u0235\7p\2\2\u0235\u0236\7q\2\2\u0236\u0237\7v\2"+
		"\2\u0237\u0082\3\2\2\2\u0238\u0239\7#\2\2\u0239\u023a\7?\2\2\u023a\u0084"+
		"\3\2\2\2\u023b\u023c\7>\2\2\u023c\u0086\3\2\2\2\u023d\u023e\7>\2\2\u023e"+
		"\u023f\7?\2\2\u023f\u0088\3\2\2\2\u0240\u0241\7@\2\2\u0241\u008a\3\2\2"+
		"\2\u0242\u0243\7@\2\2\u0243\u0244\7?\2\2\u0244\u008c\3\2\2\2\u0245\u0246"+
		"\7k\2\2\u0246\u0247\7p\2\2\u0247\u008e\3\2\2\2\u0248\u0249\7-\2\2\u0249"+
		"\u0090\3\2\2\2\u024a\u024b\7/\2\2\u024b\u0092\3\2\2\2\u024c\u024d\7,\2"+
		"\2\u024d\u0094\3\2\2\2\u024e\u024f\7\61\2\2\u024f\u0096\3\2\2\2\u0250"+
		"\u0251\7\'\2\2\u0251\u0098\3\2\2\2\u0252\u0253\7k\2\2\u0253\u0254\7v\2"+
		"\2\u0254\u009a\3\2\2\2\u0255\u0256\7t\2\2\u0256\u0257\7c\2\2\u0257\u0258"+
		"\7p\2\2\u0258\u0259\7i\2\2\u0259\u025a\7g\2\2\u025a\u009c\3\2\2\2\u025b"+
		"\u025c\7\60\2\2\u025c\u025d\7\60\2\2\u025d\u009e\3\2\2\2\u025e\u025f\7"+
		"*\2\2\u025f\u0260\bP\2\2\u0260\u00a0\3\2\2\2\u0261\u0262\7+\2\2\u0262"+
		"\u0263\bQ\3\2\u0263\u00a2\3\2\2\2\u0264\u0265\7]\2\2\u0265\u0266\bR\4"+
		"\2\u0266\u00a4\3\2\2\2\u0267\u0268\7_\2\2\u0268\u0269\bS\5\2\u0269\u00a6"+
		"\3\2\2\2\u026a\u026b\7}\2\2\u026b\u026c\bT\6\2\u026c\u00a8\3\2\2\2\u026d"+
		"\u026e\7\177\2\2\u026e\u026f\bU\7\2\u026f\u00aa\3\2\2\2\u0270\u0271\6"+
		"V\2\2\u0271\u0277\5\u00afX\2\u0272\u0274\5\u00b3Z\2\u0273\u0275\5\u00af"+
		"X\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0270\3\2\2\2\u0276\u0272\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\bV"+
		"\b\2\u0279\u00ac\3\2\2\2\u027a\u027d\5\u00afX\2\u027b\u027d\5\u00b1Y\2"+
		"\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f"+
		"\bW\t\2\u027f\u00ae\3\2\2\2\u0280\u0282\t\2\2\2\u0281\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u00b0\3\2"+
		"\2\2\u0285\u0287\7^\2\2\u0286\u0288\5\u00afX\2\u0287\u0286\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u028b\7\17\2\2\u028a\u0289\3"+
		"\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\7\f\2\2\u028d"+
		"\u00b2\3\2\2\2\u028e\u0290\7\17\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3"+
		"\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\7\f\2\2\u0292\u00b4\3\2\2\2\u0293"+
		"\u0294\7\61\2\2\u0294\u0295\7,\2\2\u0295\u0299\3\2\2\2\u0296\u0298\13"+
		"\2\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u029a\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7,"+
		"\2\2\u029d\u029e\7\61\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\b[\t\2\u02a0"+
		"\u00b6\3\2\2\2\u02a1\u02a5\7%\2\2\u02a2\u02a4\n\3\2\2\u02a3\u02a2\3\2"+
		"\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\b\\\t\2\u02a9\u00b8\3\2"+
		"\2\2\u02aa\u02ad\5\u00bb^\2\u02ab\u02ad\5\u00c1a\2\u02ac\u02aa\3\2\2\2"+
		"\u02ac\u02ab\3\2\2\2\u02ad\u00ba\3\2\2\2\u02ae\u02b2\7$\2\2\u02af\u02b1"+
		"\5\u00bd_\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2"+
		"\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02bf"+
		"\7$\2\2\u02b6\u02ba\7)\2\2\u02b7\u02b9\5\u00bd_\2\u02b8\u02b7\3\2\2\2"+
		"\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02bf\7)\2\2\u02be\u02ae\3\2\2\2\u02be"+
		"\u02b6\3\2\2\2\u02bf\u00bc\3\2\2\2\u02c0\u02c3\5\u00bf`\2\u02c1\u02c3"+
		"\5\u00c7d\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u00be\3\2\2"+
		"\2\u02c4\u02c5\n\4\2\2\u02c5\u00c0\3\2\2\2\u02c6\u02c7\7$\2\2\u02c7\u02c8"+
		"\7$\2\2\u02c8\u02c9\7$\2\2\u02c9\u02cd\3\2\2\2\u02ca\u02cc\5\u00c3b\2"+
		"\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7$\2\2\u02d1"+
		"\u02d2\7$\2\2\u02d2\u02e1\7$\2\2\u02d3\u02d4\7)\2\2\u02d4\u02d5\7)\2\2"+
		"\u02d5\u02d6\7)\2\2\u02d6\u02da\3\2\2\2\u02d7\u02d9\5\u00c3b\2\u02d8\u02d7"+
		"\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dd\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\7)\2\2\u02de\u02df\7)\2"+
		"\2\u02df\u02e1\7)\2\2\u02e0\u02c6\3\2\2\2\u02e0\u02d3\3\2\2\2\u02e1\u00c2"+
		"\3\2\2\2\u02e2\u02e5\5\u00c5c\2\u02e3\u02e5\5\u00c7d\2\u02e4\u02e2\3\2"+
		"\2\2\u02e4\u02e3\3\2\2\2\u02e5\u00c4\3\2\2\2\u02e6\u02e7\n\5\2\2\u02e7"+
		"\u00c6\3\2\2\2\u02e8\u02e9\7^\2\2\u02e9\u02ed\13\2\2\2\u02ea\u02eb\7^"+
		"\2\2\u02eb\u02ed\5\u00b3Z\2\u02ec\u02e8\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed"+
		"\u00c8\3\2\2\2\u02ee\u02f0\t\6\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f4\3\2\2\2\u02f1\u02f3\5\u00d7l\2\u02f2\u02f1\3\2\2\2\u02f3"+
		"\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2"+
		"\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f9\7\60\2\2\u02f8\u02fa\5\u00d7l\2\u02f9"+
		"\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u0306\3\2\2\2\u02fd\u02ff\t\7\2\2\u02fe\u0300\t\6\2\2\u02ff"+
		"\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u0303\5\u00d7"+
		"l\2\u0302\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0302\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u02fd\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u00ca\3\2\2\2\u0308\u030a\5\u00d7l\2\u0309\u0308\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u00cc\3\2"+
		"\2\2\u030d\u030e\7\62\2\2\u030e\u030f\7z\2\2\u030f\u0311\3\2\2\2\u0310"+
		"\u0312\5\u00d9m\2\u0311\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u00ce\3\2\2\2\u0315\u0317\7/\2\2\u0316"+
		"\u0318\5\u00d7l\2\u0317\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0317"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u00d0\3\2\2\2\u031b\u031c\7v\2\2\u031c"+
		"\u031d\7t\2\2\u031d\u031e\7w\2\2\u031e\u0325\7g\2\2\u031f\u0320\7h\2\2"+
		"\u0320\u0321\7c\2\2\u0321\u0322\7n\2\2\u0322\u0323\7u\2\2\u0323\u0325"+
		"\7g\2\2\u0324\u031b\3\2\2\2\u0324\u031f\3\2\2\2\u0325\u00d2\3\2\2\2\u0326"+
		"\u032a\5\u00dbn\2\u0327\u0329\5\u00ddo\2\u0328\u0327\3\2\2\2\u0329\u032c"+
		"\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0336\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u032f\7~\2\2\u032e\u0330\5\u00d5k\2\u032f\u032e\3"+
		"\2\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0334\7~\2\2\u0334\u0336\3\2\2\2\u0335\u0326\3\2"+
		"\2\2\u0335\u032d\3\2\2\2\u0336\u00d4\3\2\2\2\u0337\u0338\n\b\2\2\u0338"+
		"\u00d6\3\2\2\2\u0339\u033a\t\t\2\2\u033a\u00d8\3\2\2\2\u033b\u033c\t\n"+
		"\2\2\u033c\u00da\3\2\2\2\u033d\u033f\t\13\2\2\u033e\u033d\3\2\2\2\u033f"+
		"\u00dc\3\2\2\2\u0340\u0343\5\u00dbn\2\u0341\u0343\t\f\2\2\u0342\u0340"+
		"\3\2\2\2\u0342\u0341\3\2\2\2\u0343\u00de\3\2\2\2%\2\u0274\u0276\u027c"+
		"\u0283\u0287\u028a\u028f\u0299\u02a5\u02ac\u02b2\u02ba\u02be\u02c2\u02cd"+
		"\u02da\u02e0\u02e4\u02ec\u02ef\u02f4\u02fb\u02ff\u0304\u0306\u030b\u0313"+
		"\u0319\u0324\u032a\u0331\u0335\u033e\u0342\n\3P\2\3Q\3\3R\4\3S\5\3T\6"+
		"\3U\7\3V\b\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}