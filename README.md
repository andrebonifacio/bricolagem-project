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

# Relatório de Experiência Utilizando a DSL Bricolagem

**Nome:** André Bonifácio dos Santos Junior  
**Matrícula:** 170137058

---

## Introdução

O presente relatório tem como objetivo descrever a experiência de uso da linguagem de domínio específico (DSL) **Bricolagem**, desenvolvida como ferramenta para facilitar a elaboração de planos de aula voltados à abordagem *maker* e à prática pedagógica interdisciplinar. A proposta da DSL Bricolagem surgiu como uma ideia do professor **Jorge Fernandes** para validar a pertinência do uso de Inteligência Artificial Generativa no desenvolvimento e uso da DSL como apoio a professores na criação de planos de aula *maker*.

---

## Etapas Iniciais

Primeiramente, foram realizadas as leituras dos documentos com os prompts utilizados pelo professor para gerar a DSL Bricolagem. Ao final da leitura 4, havia um exemplo de uma aula sobre **Robótica Sustentável**, estruturada na DSL criada pela IA. Este arquivo foi utilizado como base para compreender e gerar prompts para novos temas de aulas voltadas à temática *maker*.

---

## Desenvolvimento do Projeto

Com base nos estudos e exemplos iniciais da DSL Bricolagem, iniciou-se o desenvolvimento prático do projeto **bricolagem-project**, uma aplicação Java construída com o objetivo de interpretar arquivos escritos na linguagem Bricolagem e convertê-los em **planos de aula automatizados em HTML**.

O projeto foi gerenciado com o **Maven**, responsável pelo controle das dependências, como ANTLR e outras bibliotecas utilizadas.

### Estrutura do Projeto

A arquitetura foi estruturada a partir da definição da gramática da linguagem utilizando o **ANTLR (Another Tool For Language Recognition)**. Foram criados dois arquivos:

- `BricolagemLexer.g4` — responsável por identificar os tokens da linguagem;
- `BricolagemParser.g4` — responsável por definir regras sintáticas.

A gramática contempla os seguintes elementos:

- `projetoMaker` (bloco principal);
- `nivel`, `tema`, `objetivoEnsino`, `objetivoAprendizagem`, `objetivoPesquisa`, `objetivoEducacional`;
- `atividades`, `avaliacao`, `recursos`, `conformidadeBNCC`.

### Geração de HTML

Após a geração automática do *lexer* e *parser*, foi implementado o visitor `BricolagemToHTMLVisitor.java`, que percorre a árvore sintática e transforma o conteúdo em uma estrutura **HTML semântica**, com divisões claras entre os objetivos pedagógicos, proposta da aula e recursos.

### Integração com IA

Foi implementado o módulo `OpenAIImageClient`, capaz de se integrar à API do ChatGPT e gerar imagens ilustrativas com base nos planos de aula. Por exemplo:

- Oficina de Robótica Sustentável
- Impressora 3D em funcionamento

### Repositório

Repositório disponível em:  
👉 [https://github.com/andrebonifacio/bricolagem-project](https://github.com/andrebonifacio/bricolagem-project)

---

## Geração de Planos com DeepSeek

Com a aplicação já estruturada, a IA **DeepSeek** foi utilizada para gerar planos de aula. O prompt enviado foi:

> “Crie três planos de aula voltados para o ensino fundamental 2, utilizando a temática maker. Os temas das aulas são:  
> 1 - Funcionamento e componentes de uma impressora 3D  
> 2 - Produção Audiovisual: Como criar um canal no YouTube  
> 3 - Oficina de costura  
> Os planos de aula devem conter: Nível, Tema, Objetivo de Ensino, Objetivo de Aprendizagem, Objetivo de Pesquisa, Objetivo Educacional, Atividades (Descrição, Duração, Passos), Avaliação (Critérios, Instrumentos), Recursos.  
> Alinhados às competências da BNCC e formação docente.”

---

## Exemplos Gerados

### AULA 1: Impressora 3D

```dsl
ProjetoMaker {
  Nivel: "Ensino Fundamental II (6º ao 9º ano)",
  Tema: "Funcionamento e componentes de uma impressora 3D",
  ObjetivoEnsino: [
    OE.1: "Introduzir os princípios básicos da impressão 3D, seus componentes e funcionamento.",
    OE.2: "Incentivar a criatividade e a resolução de problemas.",
    OE.3: "Promover a cultura maker através da tecnologia digital."
  ],
  ObjetivoAprendizagem: [
    OA.1: "Compreender como uma impressora 3D funciona.",
    OA.2: "Identificar os principais componentes (extrusor, filamento, mesa de impressão, etc.).",
    OA.3: "Relacionar a impressão 3D com aplicações reais.",
    OA.4: "Desenvolver habilidades básicas de modelagem 3D."
  ],
  ObjetivoPesquisa: [
    OP.1: "Investigar diferentes tipos de impressoras 3D e materiais utilizados.",
    OP.2: "Pesquisar aplicações da impressão 3D em diferentes áreas profissionais."
  ],
  ObjetivoEducacional: [
    OED.1: "Alinhar projeto às competências BNCC EF07CI01, EF08CI01.",
    OED.2: "Alinhar projeto às competências BNCC EF67LP25, EF69LP42.",
    OED.3: "Desenvolver a competência geral 5 da BNCC."
  ],
  Atividades: [
    { Nome: "Aula expositiva e demonstração", ... },
    { Nome: "Montagem simulada", ... },
    { Nome: "Desafio maker", ... }
  ],
  Avaliacao: {
    Criterios: [...],
    Instrumentos: [...]
  },
  Recursos: [...],
  ConformidadeBNCC: [...]
}

