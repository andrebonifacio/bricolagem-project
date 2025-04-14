// Generated from com/bricolagem/BricolagemParser.g4 by ANTLR 4.13.1
package com.bricolagem;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BricolagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROJETO_MAKER=1, NIVEL=2, TEMA=3, OBJETIVO_ENSINO=4, OBJETIVO_APRENDIZAGEM=5, 
		OBJETIVO_PESQUISA=6, OBJETIVO_EDUCACIONAL=7, ATIVIDADES=8, AVALIACAO=9, 
		RECURSOS=10, CONFORMIDADE_BNCC=11, DESCRICAO=12, DURACAO=13, MINUTOS=14, 
		PASSOS=15, CRITERIOS=16, INSTRUMENTOS=17, ABRE_CHAVE=18, FECHA_CHAVE=19, 
		DOIS_PONTOS=20, VIRGULA=21, ABRE_COLCHETE=22, FECHA_COLCHETE=23, STRING=24, 
		NUMERO=25, ID=26, WS=27;
	public static final int
		RULE_projetoMaker = 0, RULE_nivel = 1, RULE_tema = 2, RULE_objetivos = 3, 
		RULE_listaObjetivosEnsino = 4, RULE_objetivoEnsino = 5, RULE_listaObjetivosAprendizagem = 6, 
		RULE_objetivoAprendizagem = 7, RULE_listaObjetivosPesquisa = 8, RULE_objetivoPesquisa = 9, 
		RULE_listaObjetivosEducacionais = 10, RULE_objetivoEducacional = 11, RULE_atividades = 12, 
		RULE_listaAtividades = 13, RULE_atividade = 14, RULE_avaliacao = 15, RULE_recursos = 16, 
		RULE_conformidadeBNCC = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"projetoMaker", "nivel", "tema", "objetivos", "listaObjetivosEnsino", 
			"objetivoEnsino", "listaObjetivosAprendizagem", "objetivoAprendizagem", 
			"listaObjetivosPesquisa", "objetivoPesquisa", "listaObjetivosEducacionais", 
			"objetivoEducacional", "atividades", "listaAtividades", "atividade", 
			"avaliacao", "recursos", "conformidadeBNCC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ProjetoMaker'", "'Nivel'", "'Tema'", "'ObjetivoEnsino'", "'ObjetivoAprendizagem'", 
			"'ObjetivoPesquisa'", "'ObjetivoEducacional'", "'Atividades'", "'Avaliacao'", 
			"'Recursos'", "'ConformidadeBNCC'", "'Descricao'", "'Duracao'", "'minutos'", 
			"'Passos'", "'Criterios'", "'Instrumentos'", "'{'", "'}'", "':'", "','", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROJETO_MAKER", "NIVEL", "TEMA", "OBJETIVO_ENSINO", "OBJETIVO_APRENDIZAGEM", 
			"OBJETIVO_PESQUISA", "OBJETIVO_EDUCACIONAL", "ATIVIDADES", "AVALIACAO", 
			"RECURSOS", "CONFORMIDADE_BNCC", "DESCRICAO", "DURACAO", "MINUTOS", "PASSOS", 
			"CRITERIOS", "INSTRUMENTOS", "ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", 
			"VIRGULA", "ABRE_COLCHETE", "FECHA_COLCHETE", "STRING", "NUMERO", "ID", 
			"WS"
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
	public String getGrammarFileName() { return "BricolagemParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BricolagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjetoMakerContext extends ParserRuleContext {
		public TerminalNode PROJETO_MAKER() { return getToken(BricolagemParser.PROJETO_MAKER, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(BricolagemParser.ABRE_CHAVE, 0); }
		public NivelContext nivel() {
			return getRuleContext(NivelContext.class,0);
		}
		public TemaContext tema() {
			return getRuleContext(TemaContext.class,0);
		}
		public ObjetivosContext objetivos() {
			return getRuleContext(ObjetivosContext.class,0);
		}
		public AtividadesContext atividades() {
			return getRuleContext(AtividadesContext.class,0);
		}
		public AvaliacaoContext avaliacao() {
			return getRuleContext(AvaliacaoContext.class,0);
		}
		public RecursosContext recursos() {
			return getRuleContext(RecursosContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(BricolagemParser.FECHA_CHAVE, 0); }
		public ConformidadeBNCCContext conformidadeBNCC() {
			return getRuleContext(ConformidadeBNCCContext.class,0);
		}
		public ProjetoMakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projetoMaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterProjetoMaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitProjetoMaker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitProjetoMaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjetoMakerContext projetoMaker() throws RecognitionException {
		ProjetoMakerContext _localctx = new ProjetoMakerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_projetoMaker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(PROJETO_MAKER);
			setState(37);
			match(ABRE_CHAVE);
			setState(38);
			nivel();
			setState(39);
			tema();
			setState(40);
			objetivos();
			setState(41);
			atividades();
			setState(42);
			avaliacao();
			setState(43);
			recursos();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFORMIDADE_BNCC) {
				{
				setState(44);
				conformidadeBNCC();
				}
			}

			setState(47);
			match(FECHA_CHAVE);
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
	public static class NivelContext extends ParserRuleContext {
		public TerminalNode NIVEL() { return getToken(BricolagemParser.NIVEL, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(BricolagemParser.STRING, 0); }
		public TerminalNode VIRGULA() { return getToken(BricolagemParser.VIRGULA, 0); }
		public NivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterNivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitNivel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitNivel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NivelContext nivel() throws RecognitionException {
		NivelContext _localctx = new NivelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(NIVEL);
			setState(50);
			match(DOIS_PONTOS);
			setState(51);
			match(STRING);
			setState(52);
			match(VIRGULA);
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
	public static class TemaContext extends ParserRuleContext {
		public TerminalNode TEMA() { return getToken(BricolagemParser.TEMA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(BricolagemParser.STRING, 0); }
		public TerminalNode VIRGULA() { return getToken(BricolagemParser.VIRGULA, 0); }
		public TemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterTema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitTema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitTema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemaContext tema() throws RecognitionException {
		TemaContext _localctx = new TemaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TEMA);
			setState(55);
			match(DOIS_PONTOS);
			setState(56);
			match(STRING);
			setState(57);
			match(VIRGULA);
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
	public static class ObjetivosContext extends ParserRuleContext {
		public TerminalNode OBJETIVO_ENSINO() { return getToken(BricolagemParser.OBJETIVO_ENSINO, 0); }
		public List<TerminalNode> DOIS_PONTOS() { return getTokens(BricolagemParser.DOIS_PONTOS); }
		public TerminalNode DOIS_PONTOS(int i) {
			return getToken(BricolagemParser.DOIS_PONTOS, i);
		}
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(BricolagemParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(BricolagemParser.ABRE_COLCHETE, i);
		}
		public ListaObjetivosEnsinoContext listaObjetivosEnsino() {
			return getRuleContext(ListaObjetivosEnsinoContext.class,0);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(BricolagemParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(BricolagemParser.FECHA_COLCHETE, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public TerminalNode OBJETIVO_APRENDIZAGEM() { return getToken(BricolagemParser.OBJETIVO_APRENDIZAGEM, 0); }
		public ListaObjetivosAprendizagemContext listaObjetivosAprendizagem() {
			return getRuleContext(ListaObjetivosAprendizagemContext.class,0);
		}
		public TerminalNode OBJETIVO_EDUCACIONAL() { return getToken(BricolagemParser.OBJETIVO_EDUCACIONAL, 0); }
		public ListaObjetivosEducacionaisContext listaObjetivosEducacionais() {
			return getRuleContext(ListaObjetivosEducacionaisContext.class,0);
		}
		public TerminalNode OBJETIVO_PESQUISA() { return getToken(BricolagemParser.OBJETIVO_PESQUISA, 0); }
		public ListaObjetivosPesquisaContext listaObjetivosPesquisa() {
			return getRuleContext(ListaObjetivosPesquisaContext.class,0);
		}
		public ObjetivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterObjetivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitObjetivos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitObjetivos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetivosContext objetivos() throws RecognitionException {
		ObjetivosContext _localctx = new ObjetivosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objetivos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(OBJETIVO_ENSINO);
			setState(60);
			match(DOIS_PONTOS);
			setState(61);
			match(ABRE_COLCHETE);
			setState(62);
			listaObjetivosEnsino();
			setState(63);
			match(FECHA_COLCHETE);
			setState(64);
			match(VIRGULA);
			setState(65);
			match(OBJETIVO_APRENDIZAGEM);
			setState(66);
			match(DOIS_PONTOS);
			setState(67);
			match(ABRE_COLCHETE);
			setState(68);
			listaObjetivosAprendizagem();
			setState(69);
			match(FECHA_COLCHETE);
			setState(70);
			match(VIRGULA);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJETIVO_PESQUISA) {
				{
				setState(71);
				match(OBJETIVO_PESQUISA);
				setState(72);
				match(DOIS_PONTOS);
				setState(73);
				match(ABRE_COLCHETE);
				setState(74);
				listaObjetivosPesquisa();
				setState(75);
				match(FECHA_COLCHETE);
				setState(76);
				match(VIRGULA);
				}
			}

			setState(80);
			match(OBJETIVO_EDUCACIONAL);
			setState(81);
			match(DOIS_PONTOS);
			setState(82);
			match(ABRE_COLCHETE);
			setState(83);
			listaObjetivosEducacionais();
			setState(84);
			match(FECHA_COLCHETE);
			setState(85);
			match(VIRGULA);
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
	public static class ListaObjetivosEnsinoContext extends ParserRuleContext {
		public List<ObjetivoEnsinoContext> objetivoEnsino() {
			return getRuleContexts(ObjetivoEnsinoContext.class);
		}
		public ObjetivoEnsinoContext objetivoEnsino(int i) {
			return getRuleContext(ObjetivoEnsinoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public ListaObjetivosEnsinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaObjetivosEnsino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterListaObjetivosEnsino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitListaObjetivosEnsino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitListaObjetivosEnsino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaObjetivosEnsinoContext listaObjetivosEnsino() throws RecognitionException {
		ListaObjetivosEnsinoContext _localctx = new ListaObjetivosEnsinoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaObjetivosEnsino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(87);
				objetivoEnsino();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(88);
					match(VIRGULA);
					setState(89);
					objetivoEnsino();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjetivoEnsinoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BricolagemParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(BricolagemParser.STRING, 0); }
		public ObjetivoEnsinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivoEnsino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterObjetivoEnsino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitObjetivoEnsino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitObjetivoEnsino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetivoEnsinoContext objetivoEnsino() throws RecognitionException {
		ObjetivoEnsinoContext _localctx = new ObjetivoEnsinoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objetivoEnsino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(DOIS_PONTOS);
			setState(99);
			match(STRING);
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
	public static class ListaObjetivosAprendizagemContext extends ParserRuleContext {
		public List<ObjetivoAprendizagemContext> objetivoAprendizagem() {
			return getRuleContexts(ObjetivoAprendizagemContext.class);
		}
		public ObjetivoAprendizagemContext objetivoAprendizagem(int i) {
			return getRuleContext(ObjetivoAprendizagemContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public ListaObjetivosAprendizagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaObjetivosAprendizagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterListaObjetivosAprendizagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitListaObjetivosAprendizagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitListaObjetivosAprendizagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaObjetivosAprendizagemContext listaObjetivosAprendizagem() throws RecognitionException {
		ListaObjetivosAprendizagemContext _localctx = new ListaObjetivosAprendizagemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaObjetivosAprendizagem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(101);
				objetivoAprendizagem();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(102);
					match(VIRGULA);
					setState(103);
					objetivoAprendizagem();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjetivoAprendizagemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BricolagemParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(BricolagemParser.STRING, 0); }
		public ObjetivoAprendizagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivoAprendizagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterObjetivoAprendizagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitObjetivoAprendizagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitObjetivoAprendizagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetivoAprendizagemContext objetivoAprendizagem() throws RecognitionException {
		ObjetivoAprendizagemContext _localctx = new ObjetivoAprendizagemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objetivoAprendizagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(DOIS_PONTOS);
			setState(113);
			match(STRING);
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
	public static class ListaObjetivosPesquisaContext extends ParserRuleContext {
		public List<ObjetivoPesquisaContext> objetivoPesquisa() {
			return getRuleContexts(ObjetivoPesquisaContext.class);
		}
		public ObjetivoPesquisaContext objetivoPesquisa(int i) {
			return getRuleContext(ObjetivoPesquisaContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public ListaObjetivosPesquisaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaObjetivosPesquisa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterListaObjetivosPesquisa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitListaObjetivosPesquisa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitListaObjetivosPesquisa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaObjetivosPesquisaContext listaObjetivosPesquisa() throws RecognitionException {
		ListaObjetivosPesquisaContext _localctx = new ListaObjetivosPesquisaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaObjetivosPesquisa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(115);
				objetivoPesquisa();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(116);
					match(VIRGULA);
					setState(117);
					objetivoPesquisa();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjetivoPesquisaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BricolagemParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(BricolagemParser.STRING, 0); }
		public ObjetivoPesquisaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivoPesquisa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterObjetivoPesquisa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitObjetivoPesquisa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitObjetivoPesquisa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetivoPesquisaContext objetivoPesquisa() throws RecognitionException {
		ObjetivoPesquisaContext _localctx = new ObjetivoPesquisaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objetivoPesquisa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(DOIS_PONTOS);
			setState(127);
			match(STRING);
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
	public static class ListaObjetivosEducacionaisContext extends ParserRuleContext {
		public List<ObjetivoEducacionalContext> objetivoEducacional() {
			return getRuleContexts(ObjetivoEducacionalContext.class);
		}
		public ObjetivoEducacionalContext objetivoEducacional(int i) {
			return getRuleContext(ObjetivoEducacionalContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public ListaObjetivosEducacionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaObjetivosEducacionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterListaObjetivosEducacionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitListaObjetivosEducacionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitListaObjetivosEducacionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaObjetivosEducacionaisContext listaObjetivosEducacionais() throws RecognitionException {
		ListaObjetivosEducacionaisContext _localctx = new ListaObjetivosEducacionaisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaObjetivosEducacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(129);
				objetivoEducacional();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(130);
					match(VIRGULA);
					setState(131);
					objetivoEducacional();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjetivoEducacionalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BricolagemParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode STRING() { return getToken(BricolagemParser.STRING, 0); }
		public ObjetivoEducacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetivoEducacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterObjetivoEducacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitObjetivoEducacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitObjetivoEducacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetivoEducacionalContext objetivoEducacional() throws RecognitionException {
		ObjetivoEducacionalContext _localctx = new ObjetivoEducacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objetivoEducacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(DOIS_PONTOS);
			setState(141);
			match(STRING);
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
	public static class AtividadesContext extends ParserRuleContext {
		public TerminalNode ATIVIDADES() { return getToken(BricolagemParser.ATIVIDADES, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(BricolagemParser.ABRE_COLCHETE, 0); }
		public ListaAtividadesContext listaAtividades() {
			return getRuleContext(ListaAtividadesContext.class,0);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(BricolagemParser.FECHA_COLCHETE, 0); }
		public TerminalNode VIRGULA() { return getToken(BricolagemParser.VIRGULA, 0); }
		public AtividadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atividades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterAtividades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitAtividades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitAtividades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtividadesContext atividades() throws RecognitionException {
		AtividadesContext _localctx = new AtividadesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atividades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ATIVIDADES);
			setState(144);
			match(DOIS_PONTOS);
			setState(145);
			match(ABRE_COLCHETE);
			setState(146);
			listaAtividades();
			setState(147);
			match(FECHA_COLCHETE);
			setState(148);
			match(VIRGULA);
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
	public static class ListaAtividadesContext extends ParserRuleContext {
		public List<AtividadeContext> atividade() {
			return getRuleContexts(AtividadeContext.class);
		}
		public AtividadeContext atividade(int i) {
			return getRuleContext(AtividadeContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public ListaAtividadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAtividades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterListaAtividades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitListaAtividades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitListaAtividades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaAtividadesContext listaAtividades() throws RecognitionException {
		ListaAtividadesContext _localctx = new ListaAtividadesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaAtividades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(150);
				atividade();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(151);
					match(VIRGULA);
					setState(152);
					atividade();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class AtividadeContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(BricolagemParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BricolagemParser.STRING, i);
		}
		public List<TerminalNode> DOIS_PONTOS() { return getTokens(BricolagemParser.DOIS_PONTOS); }
		public TerminalNode DOIS_PONTOS(int i) {
			return getToken(BricolagemParser.DOIS_PONTOS, i);
		}
		public TerminalNode ABRE_CHAVE() { return getToken(BricolagemParser.ABRE_CHAVE, 0); }
		public TerminalNode DESCRICAO() { return getToken(BricolagemParser.DESCRICAO, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public TerminalNode DURACAO() { return getToken(BricolagemParser.DURACAO, 0); }
		public TerminalNode NUMERO() { return getToken(BricolagemParser.NUMERO, 0); }
		public TerminalNode MINUTOS() { return getToken(BricolagemParser.MINUTOS, 0); }
		public TerminalNode PASSOS() { return getToken(BricolagemParser.PASSOS, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(BricolagemParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(BricolagemParser.FECHA_COLCHETE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(BricolagemParser.FECHA_CHAVE, 0); }
		public AtividadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atividade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterAtividade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitAtividade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitAtividade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtividadeContext atividade() throws RecognitionException {
		AtividadeContext _localctx = new AtividadeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atividade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(STRING);
			setState(161);
			match(DOIS_PONTOS);
			setState(162);
			match(ABRE_CHAVE);
			setState(163);
			match(DESCRICAO);
			setState(164);
			match(DOIS_PONTOS);
			setState(165);
			match(STRING);
			setState(166);
			match(VIRGULA);
			setState(167);
			match(DURACAO);
			setState(168);
			match(DOIS_PONTOS);
			setState(169);
			match(NUMERO);
			setState(170);
			match(MINUTOS);
			setState(171);
			match(VIRGULA);
			setState(172);
			match(PASSOS);
			setState(173);
			match(DOIS_PONTOS);
			setState(174);
			match(ABRE_COLCHETE);
			{
			setState(175);
			match(STRING);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(176);
				match(VIRGULA);
				setState(177);
				match(STRING);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(183);
			match(FECHA_COLCHETE);
			setState(184);
			match(FECHA_CHAVE);
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
	public static class AvaliacaoContext extends ParserRuleContext {
		public TerminalNode AVALIACAO() { return getToken(BricolagemParser.AVALIACAO, 0); }
		public List<TerminalNode> DOIS_PONTOS() { return getTokens(BricolagemParser.DOIS_PONTOS); }
		public TerminalNode DOIS_PONTOS(int i) {
			return getToken(BricolagemParser.DOIS_PONTOS, i);
		}
		public TerminalNode ABRE_CHAVE() { return getToken(BricolagemParser.ABRE_CHAVE, 0); }
		public TerminalNode CRITERIOS() { return getToken(BricolagemParser.CRITERIOS, 0); }
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(BricolagemParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(BricolagemParser.ABRE_COLCHETE, i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(BricolagemParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(BricolagemParser.FECHA_COLCHETE, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public TerminalNode INSTRUMENTOS() { return getToken(BricolagemParser.INSTRUMENTOS, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(BricolagemParser.FECHA_CHAVE, 0); }
		public List<TerminalNode> STRING() { return getTokens(BricolagemParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BricolagemParser.STRING, i);
		}
		public AvaliacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaliacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterAvaliacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitAvaliacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitAvaliacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvaliacaoContext avaliacao() throws RecognitionException {
		AvaliacaoContext _localctx = new AvaliacaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_avaliacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(AVALIACAO);
			setState(187);
			match(DOIS_PONTOS);
			setState(188);
			match(ABRE_CHAVE);
			setState(189);
			match(CRITERIOS);
			setState(190);
			match(DOIS_PONTOS);
			setState(191);
			match(ABRE_COLCHETE);
			{
			setState(192);
			match(STRING);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(193);
				match(VIRGULA);
				setState(194);
				match(STRING);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(200);
			match(FECHA_COLCHETE);
			setState(201);
			match(VIRGULA);
			setState(202);
			match(INSTRUMENTOS);
			setState(203);
			match(DOIS_PONTOS);
			setState(204);
			match(ABRE_COLCHETE);
			{
			setState(205);
			match(STRING);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(206);
				match(VIRGULA);
				setState(207);
				match(STRING);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(213);
			match(FECHA_COLCHETE);
			setState(214);
			match(FECHA_CHAVE);
			setState(215);
			match(VIRGULA);
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
	public static class RecursosContext extends ParserRuleContext {
		public TerminalNode RECURSOS() { return getToken(BricolagemParser.RECURSOS, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(BricolagemParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(BricolagemParser.FECHA_COLCHETE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(BricolagemParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BricolagemParser.STRING, i);
		}
		public RecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterRecursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitRecursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursosContext recursos() throws RecognitionException {
		RecursosContext _localctx = new RecursosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_recursos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(RECURSOS);
			setState(218);
			match(DOIS_PONTOS);
			setState(219);
			match(ABRE_COLCHETE);
			{
			setState(220);
			match(STRING);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(221);
				match(VIRGULA);
				setState(222);
				match(STRING);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(228);
			match(FECHA_COLCHETE);
			setState(229);
			match(VIRGULA);
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
	public static class ConformidadeBNCCContext extends ParserRuleContext {
		public TerminalNode CONFORMIDADE_BNCC() { return getToken(BricolagemParser.CONFORMIDADE_BNCC, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(BricolagemParser.DOIS_PONTOS, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(BricolagemParser.ABRE_COLCHETE, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(BricolagemParser.FECHA_COLCHETE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(BricolagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BricolagemParser.VIRGULA, i);
		}
		public List<TerminalNode> ID() { return getTokens(BricolagemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BricolagemParser.ID, i);
		}
		public ConformidadeBNCCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformidadeBNCC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).enterConformidadeBNCC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BricolagemParserListener ) ((BricolagemParserListener)listener).exitConformidadeBNCC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BricolagemParserVisitor ) return ((BricolagemParserVisitor<? extends T>)visitor).visitConformidadeBNCC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConformidadeBNCCContext conformidadeBNCC() throws RecognitionException {
		ConformidadeBNCCContext _localctx = new ConformidadeBNCCContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conformidadeBNCC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(CONFORMIDADE_BNCC);
			setState(232);
			match(DOIS_PONTOS);
			setState(233);
			match(ABRE_COLCHETE);
			{
			setState(234);
			match(ID);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(235);
				match(VIRGULA);
				setState(236);
				match(ID);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(242);
			match(FECHA_COLCHETE);
			setState(243);
			match(VIRGULA);
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
		"\u0004\u0001\u001b\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004[\b"+
		"\u0004\n\u0004\f\u0004^\t\u0004\u0003\u0004`\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006i\b\u0006\n\u0006\f\u0006l\t\u0006\u0003\u0006n\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bw"+
		"\b\b\n\b\f\bz\t\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u0085\b\n\n\n\f\n\u0088\t\n\u0003\n\u008a\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u009a"+
		"\b\r\n\r\f\r\u009d\t\r\u0003\r\u009f\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e\n"+
		"\u000e\f\u000e\u00b6\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c4\b\u000f\n\u000f\f\u000f"+
		"\u00c7\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d1\b\u000f\n\u000f"+
		"\f\u000f\u00d4\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00e0\b\u0010\n\u0010\f\u0010\u00e3\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00ee\b\u0011\n\u0011\f\u0011\u00f1\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0000\u00f4\u0000$\u0001\u0000\u0000\u0000\u00021\u0001"+
		"\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000"+
		"\u0000\b_\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fm\u0001"+
		"\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000"+
		"\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000"+
		"\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000"+
		"\u001a\u009e\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000"+
		"\u001e\u00ba\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\""+
		"\u00e7\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0012"+
		"\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0003\u0004\u0002\u0000()\u0003"+
		"\u0006\u0003\u0000)*\u0003\u0018\f\u0000*+\u0003\u001e\u000f\u0000+-\u0003"+
		" \u0010\u0000,.\u0003\"\u0011\u0000-,\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0013\u0000\u0000"+
		"0\u0001\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u000023\u0005\u0014"+
		"\u0000\u000034\u0005\u0018\u0000\u000045\u0005\u0015\u0000\u00005\u0003"+
		"\u0001\u0000\u0000\u000067\u0005\u0003\u0000\u000078\u0005\u0014\u0000"+
		"\u000089\u0005\u0018\u0000\u00009:\u0005\u0015\u0000\u0000:\u0005\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0004\u0000\u0000<=\u0005\u0014\u0000\u0000"+
		"=>\u0005\u0016\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\u0017\u0000\u0000"+
		"@A\u0005\u0015\u0000\u0000AB\u0005\u0005\u0000\u0000BC\u0005\u0014\u0000"+
		"\u0000CD\u0005\u0016\u0000\u0000DE\u0003\f\u0006\u0000EF\u0005\u0017\u0000"+
		"\u0000FN\u0005\u0015\u0000\u0000GH\u0005\u0006\u0000\u0000HI\u0005\u0014"+
		"\u0000\u0000IJ\u0005\u0016\u0000\u0000JK\u0003\u0010\b\u0000KL\u0005\u0017"+
		"\u0000\u0000LM\u0005\u0015\u0000\u0000MO\u0001\u0000\u0000\u0000NG\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u0007\u0000\u0000QR\u0005\u0014\u0000\u0000RS\u0005\u0016\u0000"+
		"\u0000ST\u0003\u0014\n\u0000TU\u0005\u0017\u0000\u0000UV\u0005\u0015\u0000"+
		"\u0000V\u0007\u0001\u0000\u0000\u0000W\\\u0003\n\u0005\u0000XY\u0005\u0015"+
		"\u0000\u0000Y[\u0003\n\u0005\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\t\u0001\u0000\u0000\u0000ab\u0005\u001a\u0000"+
		"\u0000bc\u0005\u0014\u0000\u0000cd\u0005\u0018\u0000\u0000d\u000b\u0001"+
		"\u0000\u0000\u0000ej\u0003\u000e\u0007\u0000fg\u0005\u0015\u0000\u0000"+
		"gi\u0003\u000e\u0007\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000me\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u0005\u001a\u0000\u0000"+
		"pq\u0005\u0014\u0000\u0000qr\u0005\u0018\u0000\u0000r\u000f\u0001\u0000"+
		"\u0000\u0000sx\u0003\u0012\t\u0000tu\u0005\u0015\u0000\u0000uw\u0003\u0012"+
		"\t\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|\u0011\u0001\u0000\u0000\u0000}~\u0005\u001a\u0000\u0000~\u007f\u0005"+
		"\u0014\u0000\u0000\u007f\u0080\u0005\u0018\u0000\u0000\u0080\u0013\u0001"+
		"\u0000\u0000\u0000\u0081\u0086\u0003\u0016\u000b\u0000\u0082\u0083\u0005"+
		"\u0015\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u0081\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0015\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u001a\u0000\u0000\u008c\u008d\u0005"+
		"\u0014\u0000\u0000\u008d\u008e\u0005\u0018\u0000\u0000\u008e\u0017\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\b\u0000\u0000\u0090\u0091\u0005\u0014"+
		"\u0000\u0000\u0091\u0092\u0005\u0016\u0000\u0000\u0092\u0093\u0003\u001a"+
		"\r\u0000\u0093\u0094\u0005\u0017\u0000\u0000\u0094\u0095\u0005\u0015\u0000"+
		"\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u009b\u0003\u001c\u000e"+
		"\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098\u009a\u0003\u001c\u000e"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u001b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0018\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0014\u0000\u0000\u00a2\u00a3\u0005\u0012\u0000"+
		"\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00a5\u0005\u0014\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000"+
		"\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0019\u0000\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ad\u0005\u000f\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0014\u0000\u0000\u00ae\u00af\u0005\u0016\u0000\u0000\u00af"+
		"\u00b4\u0005\u0018\u0000\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1"+
		"\u00b3\u0005\u0018\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0013\u0000\u0000\u00b9\u001d\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005\t\u0000\u0000\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc\u00bd"+
		"\u0005\u0012\u0000\u0000\u00bd\u00be\u0005\u0010\u0000\u0000\u00be\u00bf"+
		"\u0005\u0014\u0000\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000\u00c0\u00c5"+
		"\u0005\u0018\u0000\u0000\u00c1\u00c2\u0005\u0015\u0000\u0000\u00c2\u00c4"+
		"\u0005\u0018\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0017\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0015\u0000\u0000\u00ca\u00cb\u0005\u0011\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0014\u0000\u0000\u00cc\u00cd\u0005\u0016\u0000\u0000\u00cd\u00d2"+
		"\u0005\u0018\u0000\u0000\u00ce\u00cf\u0005\u0015\u0000\u0000\u00cf\u00d1"+
		"\u0005\u0018\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0013\u0000\u0000\u00d7\u00d8\u0005\u0015\u0000\u0000\u00d8\u001f"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\n\u0000\u0000\u00da\u00db\u0005"+
		"\u0014\u0000\u0000\u00db\u00dc\u0005\u0016\u0000\u0000\u00dc\u00e1\u0005"+
		"\u0018\u0000\u0000\u00dd\u00de\u0005\u0015\u0000\u0000\u00de\u00e0\u0005"+
		"\u0018\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u0017\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0015\u0000\u0000\u00e6!\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u000b"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0014\u0000\u0000\u00e9\u00ea\u0005\u0016"+
		"\u0000\u0000\u00ea\u00ef\u0005\u001a\u0000\u0000\u00eb\u00ec\u0005\u0015"+
		"\u0000\u0000\u00ec\u00ee\u0005\u001a\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0017"+
		"\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4#\u0001\u0000\u0000"+
		"\u0000\u0011-N\\_jmx{\u0086\u0089\u009b\u009e\u00b4\u00c5\u00d2\u00e1"+
		"\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}