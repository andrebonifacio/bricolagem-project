package com.bricolagem;

public class PromptGenerator {

    public static String gerarPrompt(String html) {
        String tema = extrair(html, "<p><strong>Tema:</strong>", "</p>").trim();
        StringBuilder prompt = new StringBuilder("Gere uma imagem que represente uma aula maker com o tema: ");
        prompt.append(tema).append(".\n");

        // Objetivo de Ensino
        String ensino = extrairLista(html, "Objetivos de Ensino");
        if (!ensino.isEmpty()) {
            prompt.append("Os objetivos de ensino incluem: ").append(ensino).append(".\n");
        }

        // Objetivo de Aprendizagem
        String aprendizagem = extrairLista(html, "Objetivos de Aprendizagem");
        if (!aprendizagem.isEmpty()) {
            prompt.append("Objetivos de aprendizagem esperados: ").append(aprendizagem).append(".\n");
        }

        // Objetivo de Pesquisa
        String pesquisa = extrairLista(html, "Objetivos de Pesquisa");
        if (!pesquisa.isEmpty()) {
            prompt.append("Este projeto também estimula a pesquisa em sala com os seguintes focos: ")
                  .append(pesquisa).append(".\n");
        }

        // Atividade
        String atividade = extrair(html, "<h3>", "</h3>");
        if (!atividade.isEmpty()) {
            prompt.append("A principal atividade prevista é: ").append(atividade).append(".\n");
        }

        prompt.append("A imagem deve ser criativa, educativa, e apropriada ao contexto escolar, e em Português-BR");
        System.out.println(prompt);
        return prompt.toString().trim();
    }

    private static String extrair(String html, String inicio, String fim) {
        int ini = html.indexOf(inicio);
        if (ini == -1) return "";
        int fimIdx = html.indexOf(fim, ini);
        if (fimIdx == -1) return "";
        return html.substring(ini + inicio.length(), fimIdx).replaceAll("<.*?>", "").trim();
    }

    private static String extrairLista(String html, String titulo) {
        int ini = html.indexOf("<h2>" + titulo + "</h2>");
        if (ini == -1) return "";
        int ulIni = html.indexOf("<ul>", ini);
        int ulFim = html.indexOf("</ul>", ulIni);
        if (ulIni == -1 || ulFim == -1) return "";

        String ulContent = html.substring(ulIni + 4, ulFim);
        String[] itens = ulContent.split("</li>");
        StringBuilder sb = new StringBuilder();
        for (String item : itens) {
            String texto = item.replaceAll("<li>", "").replaceAll("<.*?>", "").trim();
            if (!texto.isEmpty()) {
                sb.append(texto).append(", ");
            }
        }
        return sb.toString().replaceAll(", $", "");
    }
}
