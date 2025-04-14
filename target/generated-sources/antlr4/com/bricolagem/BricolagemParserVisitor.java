// Generated from com/bricolagem/BricolagemParser.g4 by ANTLR 4.13.1
package com.bricolagem;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BricolagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BricolagemParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#projetoMaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjetoMaker(BricolagemParser.ProjetoMakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#nivel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNivel(BricolagemParser.NivelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#tema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTema(BricolagemParser.TemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#objetivos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetivos(BricolagemParser.ObjetivosContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#listaObjetivosEnsino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaObjetivosEnsino(BricolagemParser.ListaObjetivosEnsinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#objetivoEnsino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetivoEnsino(BricolagemParser.ObjetivoEnsinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#listaObjetivosAprendizagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaObjetivosAprendizagem(BricolagemParser.ListaObjetivosAprendizagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#objetivoAprendizagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetivoAprendizagem(BricolagemParser.ObjetivoAprendizagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#listaObjetivosPesquisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaObjetivosPesquisa(BricolagemParser.ListaObjetivosPesquisaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#objetivoPesquisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetivoPesquisa(BricolagemParser.ObjetivoPesquisaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#listaObjetivosEducacionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaObjetivosEducacionais(BricolagemParser.ListaObjetivosEducacionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#objetivoEducacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetivoEducacional(BricolagemParser.ObjetivoEducacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#atividades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtividades(BricolagemParser.AtividadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#listaAtividades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaAtividades(BricolagemParser.ListaAtividadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#atividade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtividade(BricolagemParser.AtividadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#avaliacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvaliacao(BricolagemParser.AvaliacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursos(BricolagemParser.RecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link BricolagemParser#conformidadeBNCC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformidadeBNCC(BricolagemParser.ConformidadeBNCCContext ctx);
}