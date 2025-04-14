package com.bricolagem;

import com.bricolagem.BricolagemParser.*;
import com.bricolagem.BricolagemParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

public class BricolagemVisitorImpl extends BricolagemParserBaseVisitor<String> {

    @Override
    public String visitProjetoMaker(ProjetoMakerContext ctx) {
        StringBuilder html = new StringBuilder("<html><body>");
        html.append(visit(ctx.nivel()));
        html.append(visit(ctx.tema()));
        html.append(visit(ctx.objetivos()));
        html.append(visit(ctx.atividades()));
        html.append(visit(ctx.avaliacao()));
        html.append(visit(ctx.recursos()));
        if (ctx.conformidadeBNCC() != null) {
            html.append(visit(ctx.conformidadeBNCC()));
        }
        html.append("</body></html>");
        return html.toString();
    }

    @Override
    public String visitNivel(NivelContext ctx) {
        return "<p><strong>Nível:</strong> " + ctx.STRING().getText() + "</p>";
    }

    @Override
    public String visitTema(TemaContext ctx) {
        return "<p><strong>Tema:</strong> " + ctx.STRING().getText() + "</p>";
    }

    @Override
    public String visitObjetivos(ObjetivosContext ctx) {
        StringBuilder html = new StringBuilder("<h2>Objetivos</h2>");
        html.append("<h3>Ensino</h3>").append(visit(ctx.listaObjetivosEnsino()));
        html.append("<h3>Aprendizagem</h3>").append(visit(ctx.listaObjetivosAprendizagem()));
        if (ctx.listaObjetivosPesquisa() != null) {
            html.append("<h3>Pesquisa</h3>").append(visit(ctx.listaObjetivosPesquisa()));
        }
        html.append("<h3>Educacionais</h3>").append(visit(ctx.listaObjetivosEducacionais()));
        return html.toString();
    }

    @Override
    public String visitListaObjetivosEnsino(ListaObjetivosEnsinoContext ctx) {
        return listaObjetivosToHtml(ctx.objetivoEnsino());
    }

    @Override
    public String visitListaObjetivosAprendizagem(ListaObjetivosAprendizagemContext ctx) {
        return listaObjetivosToHtml(ctx.objetivoAprendizagem());
    }

    @Override
    public String visitListaObjetivosPesquisa(ListaObjetivosPesquisaContext ctx) {
        return listaObjetivosToHtml(ctx.objetivoPesquisa());
    }

    @Override
    public String visitListaObjetivosEducacionais(ListaObjetivosEducacionaisContext ctx) {
        return listaObjetivosToHtml(ctx.objetivoEducacional());
    }

    private String listaObjetivosToHtml(java.util.List<? extends ParserRuleContext> objetivos) {
        StringBuilder html = new StringBuilder("<ul>");
        for (var obj : objetivos) {
            var id = obj.getChild(0).getText();
            var texto = obj.getChild(2).getText(); // ID ':' STRING
            html.append("<li>").append(id).append(": ").append(texto).append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }

    @Override
    public String visitAtividades(AtividadesContext ctx) {
        StringBuilder html = new StringBuilder("<h2>Atividades</h2>");

        for (var atividade : ctx.listaAtividades().atividade()) {
            // Título da atividade
            String titulo = atividade.STRING(0).getText();

            // Descrição
            String descricao = stripQuotes(atividade.STRING(1).getText());

            // Duração (como texto)
            String duracao = atividade.NUMERO().getText();

            // Passos (múltiplos STRINGs após a palavra-chave Passos)
            html.append("<div><p><strong>Atividade:</strong> ").append(stripQuotes(titulo)).append("</p>");
            html.append("<p><strong>Descrição:</strong> ").append(descricao).append("</p>");
            html.append("<p><strong>Duração:</strong> ").append(duracao).append(" minutos</p><ul>");

            var passos = atividade.STRING().subList(2, atividade.STRING().size()); // do terceiro em diante
            for (var passo : passos) {
                html.append("<li>").append(stripQuotes(passo.getText())).append("</li>");
            }

            html.append("</ul></div>");
        }
        return html.toString();
    }

    @Override
    public String visitAvaliacao(BricolagemParser.AvaliacaoContext ctx) {
        StringBuilder html = new StringBuilder("<h2>Avaliação</h2>");

        var strings = ctx.STRING();  // todos os elementos "entre aspas" do trecho de avaliação
        int metade = strings.size() / 2;

        html.append("<h3>Critérios</h3><ul>");
        for (int i = 0; i < metade; i++) {
            html.append("<li>").append(stripQuotes(strings.get(i).getText())).append("</li>");
        }
        html.append("</ul>");

        html.append("<h3>Instrumentos</h3><ul>");
        for (int i = metade; i < strings.size(); i++) {
            html.append("<li>").append(stripQuotes(strings.get(i).getText())).append("</li>");
        }
        html.append("</ul>");

        return html.toString();
    }

    private String stripQuotes(String text) {
        return text.replaceAll("^\"|\"$", "");
    }

    @Override
    public String visitRecursos(RecursosContext ctx) {
        StringBuilder html = new StringBuilder("<h2>Recursos</h2><ul>");
        for (var recurso : ctx.STRING()) {
            html.append("<li>").append(recurso.getText()).append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }

    @Override
    public String visitConformidadeBNCC(ConformidadeBNCCContext ctx) {
        StringBuilder html = new StringBuilder("<h2>BNCC</h2><ul>");
        for (var id : ctx.ID()) {
            html.append("<li>").append(id.getText()).append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}
