# bricolagem-project

Bricolagem é uma linguagem específica de domínio (DSL) voltada para a criação rápida e padronizada de planos de aula.
Ela foi desenvolvida pelo professor Jorge Fernandes para auxiliar professores na organização de atividades educativas, integrando objetivos da BNCC e promovendo agilidade no planejamento pedagógico.

O projeto usa ANTLR para interpretar a linguagem e gerar automaticamente planos em HTML, com suporte à geração de imagens via Inteligência Artificial para ilustrar o conteúdo.

Build do projeto

- git clone https://github.com/andrebonifacio/bricolagem-project.git

Compile o projeto:
- mvn clean install

Execute:

- java -jar target/bricolagem.jar

Insira o arquivo .bric com seu plano de aula na pasta de entrada.

O HTML gerado será salvo na pasta output/.

O link para o relatório da atividade pode ser acessado em:

https://docs.google.com/document/d/1TBN1F-lALi38PL3n6LaEtl_UkXRryJYMFJqP6yVkH1U/edit?usp=sharing
