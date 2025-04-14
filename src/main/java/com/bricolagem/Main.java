package com.bricolagem;

import com.bricolagem.openai.OpenAIImageClient;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    private static final String IMPRESSORA = "FuncionamentoImpressora.Bric";
    private static final String COSTURA = "Costura.Bric";
    private static final String AUDIOVISUAL = "ProducaoAudiovisual.Bric";
    private static final String ROBOTICA = "RoboticaSustentavel.Bric";

    public static void main(String[] args) throws IOException {
        String input;
        try (InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(COSTURA)) {
            if (inputStream == null) {
                System.err.println("❌ Arquivo não encontrado em src/main/resources/");
                return;
            }
            input = new String(inputStream.readAllBytes());
        }

        BricolagemLexer lexer = new BricolagemLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BricolagemParser parser = new BricolagemParser(tokens);
        ParseTree tree = parser.projetoMaker();

        // Visitor (gera o HTML)
        BricolagemVisitorImpl visitor = new BricolagemVisitorImpl();
        String html = visitor.visit(tree);

        // Gera o prompt a partir do HTML
        String prompt = PromptGenerator.gerarPrompt(html);

        // Chama a API da OpenAI para gerar a imagem
        String imageUrl = null;

        try {
            imageUrl = OpenAIImageClient.gerarImagem(prompt);
        } catch (Exception e) {
            System.err.println("❌ Erro ao gerar imagem com OpenAI: " + e.getMessage());
        }

        // Adiciona a imagem no final do HTML
        String htmlFinal = html;
        if (imageUrl != null) {
            htmlFinal += """
                <h2>Ilustração do Projeto</h2>
                <img src="%s" alt="Imagem gerada por IA" style="max-width:100%%; height:auto;">
                """.formatted(imageUrl);
        }

        // HTML final
        Path outputPath = Paths.get("saida.html");
        Files.writeString(outputPath, htmlFinal);
        System.out.println("✅ Arquivo HTML com imagem gerado com sucesso em: " + outputPath.toAbsolutePath());
    }
}
