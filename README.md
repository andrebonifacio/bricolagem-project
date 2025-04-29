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

```
### AULA 2: Produção Audiovisual: Criando um canal no YouTube

```
ProjetoMaker {
  Nivel: "Ensino Fundamental II (6º ao 9º ano)",
  Tema: "Produção Audiovisual: Criando um canal no YouTube",
  
  ObjetivoEnsino: [
    OE.1: "Ensinar fundamentos de produção audiovisual digital.",
    OE.2: "Desenvolver habilidades de comunicação multimodal.",
    OE.3: "Promover uso crítico e criativo de plataformas digitais."
  ],
  
  ObjetivoAprendizagem: [
    OA.1: "Entender etapas de produção de vídeo (roteiro, gravação, edição).",
    OA.2: "Criar conteúdo audiovisual básico.",
    OA.3: "Publicar vídeo em ambiente simulado ou real.",
    OA.4: "Analisar criticamente conteúdos digitais."
  ],
  
  ObjetivoPesquisa: [
    OP.1: "Investigar formatos de vídeos educacionais.",
    OP.2: "Pesquisar técnicas de engajamento audiovisual."
  ],
  
  ObjetivoEducacional: [
    OED.1: "Alinhar às competências BNCC EF69LP42, EF69AR25 (Linguagens e tecnologias).",
    OED.2: "Desenvolver competência 5 da BNCC (Cultura Digital - EF67LP25).",
    OED.3: "Trabalhar competência 9 (Empatia e cooperação)."
  ],
  
  Atividades: [
    {
      Nome: "Planejamento de canal",
      Descricao: "Definição de nicho e público-alvo",
      Duracao: 30,
      Passos: [
        "Brainstorming de temas possíveis",
        "Análise de exemplos de canais educacionais",
        "Definição de identidade visual básica"
      ]
    },
    {
      Nome: "Produção prática",
      Descricao: "Gravação de vídeo-curta",
      Duracao: 50,
      Passos: [
        "Roteirização coletiva",
        "Gravação com dispositivos móveis",
        "Noções básicas de enquadramento"
      ]
    },
    {
      Nome: "Edição colaborativa",
      Descricao: "Processo pós-produção",
      Duracao: 40,
      Passos: [
        "Uso de apps de edição (CapCut)",
        "Inclusão de elementos multimídia",
        "Exportação do produto final"
      ]
    }
  ],
  
  Avaliacao: {
    Criterios: [
      "Clareza da mensagem",
      "Qualidade técnica básica",
      "Trabalho colaborativo",
      "Criatividade na abordagem"
    ],
    Instrumentos: [
      "Rubrica analítica",
      "Portfólio digital",
      "Checklist de competências",
      "Feedback entre pares"
    ]
  },
  
  Recursos: [
    "Dispositivos móveis com câmera",
    "Aplicativos de edição (CapCut, FilmoraGo)",
    "Computadores com internet",
    "Roteiro guia (template)",
    "Lista de verificação técnica"
  ],
  
  ConformidadeBNCC: [
    "Competência 1 (EF69LP42): Linguagens digitais",
    "Competência 5 (EF67LP25): Cultura digital",
    "Competência 9 (EF69AR25): Cooperação criativa"
  ]
}

```
### AULA 3: Oficina de Costura Maker

```

ProjetoMaker {
  Nivel: "Ensino Fundamental II (6º ao 9º ano)",
  Tema: "Oficina de Costura Maker",
  
  ObjetivoEnsino: [
    OE.1: "Introduzir técnicas básicas de costura manual.",
    OE.2: "Promover sustentabilidade através do upcycling.",
    OE.3: "Desenvolver habilidades manuais e criativas."
  ],
  
  ObjetivoAprendizagem: [
    OA.1: "Aprender pontos básicos de costura.",
    OA.2: "Criar produto funcional (eco bag/necessaire).",
    OA.3: "Aplicar princípios de design sustentável.",
    OA.4: "Trabalhar medidas e proporções."
  ],
  
  ObjetivoPesquisa: [
    OP.1: "Investigar técnicas de reaproveitamento têxtil.",
    OP.2: "Pesquisar sobre fast fashion e impacto ambiental."
  ],
  
  ObjetivoEducacional: [
    OED.1: "Alinhar às competências BNCC EF89ER01 (Consumo consciente).",
    OED.2: "Desenvolver competência 7 (Argumentação - EF08ER03).",
    OED.3: "Trabalhar competência 10 (Responsabilidade social)."
  ],
  
  Atividades: [
    {
      Nome: "Oficina de pontos",
      Descricao: "Aprendizado técnico básico",
      Duracao: 30,
      Passos: [
        "Demonstração de pontos (caseado, overlock)",
        "Prática em tecido de reaproveitamento",
        "Correção coletiva de técnicas"
      ]
    },
    {
      Nome: "Projeto sustentável",
      Descricao: "Criação de produto funcional",
      Duracao: 60,
      Passos: [
        "Planejamento do produto",
        "Corte e montagem",
        "Customização criativa"
      ]
    },
    {
      Nome: "Feira de trocas",
      Descricao: "Socialização dos produtos",
      Duracao: 30,
      Passos: [
        "Exposição dos trabalhos",
        "Rodada de feedback",
        "Reflexão sobre processo criativo"
      ]
    }
  ],
  
  Avaliacao: {
    Criterios: [
      "Domínio das técnicas básicas",
      "Qualidade do produto final",
      "Originalidade na customização",
      "Engajamento sustentável"
    ],
    Instrumentos: [
      "Portfólio de processos",
      "Ficha de avaliação técnica",
      "Registro fotográfico",
      "Relatório reflexivo"
    ]
  },
  
  Recursos: [
    "Kits de costura (agulhas, linhas, tesouras)",
    "Tecidos reciclados (retalhos, roupas usadas)",
    "Moldes básicos em papel kraft",
    "Materiais para customização (tintas, botões)",
    "Guia ilustrado de pontos"
  ],
  
  ConformidadeBNCC: [
    "Competência 7 (EF89ER01): Sustentabilidade",
    "Competência 10 (EF08GE11): Responsabilidade socioambiental",
    "Competência 3 (EF69AR15): Repertório cultural"
  ]
}
```
Com os planos em mãos, os arquivos .Bric foram criados e utilizados na aplicação se geraram o seguinte resultado:


## Considerações Finais

A partir dessa experiência, foi possível concluir que o uso da DSL Bricolagem pode permitir agilidade ao professor na criação dos planos de aula, uma vez que a DSL, com seu alto nível de abstração, possibilita a descrição rápida e padronizada para resolução de algum problema, sem aprofundar em detalhes técnicos da programação, de certa forma esse aspecto pode poupar tempo do professor ao produzir os planos de aula, o que é muito útil em um contexto de alta carga por parte do docente. A utilização da DSL também ajuda a organizar os planos de maneira clara e estruturada, garantindo que os objetivos de aprendizagem, educacionais e de ensino estejam sempre presentes, a utilização da IA também possibilita sugestões de novas ideias e propostas que talvez o professor não tenha considerado, a geração automática de imagens também é um ponto positivo, pois ajuda a elucidar melhor o contexto da aula e sumarizar o conteúdo de forma visual, além de facilitar a compreensão por parte dos alunos, mas também em algumas situações as imagens geradas podem não representar fielmente os contextos escolares reais, inclusive alterando contextos sócio-econômicos e culturais e isso é um ponto de atenção, há também o fato de que o professor deve ser uma figura crítica e em constante reflexão e o uso desenfreado da IA pode enfraquecer essas habilidades, a IA deve ser usada como uma ferramenta para auxiliar nas tarefas e não ser o único instrumento de trabalho, ao meu ver o uso da IA pode causar dependência e reduzir o desenvolvimento e autonomia do professor se não for utilizada com consciência.
Dessa forma, é fundamental compreender que a Inteligência Artificial e a DSL Bricolagem devem ser encaradas como aliadas do trabalho docente, e não como substitutas da prática pedagógica intencional, sensível e contextualizada. O planejamento educacional envolve múltiplas dimensões: cognitivas, emocionais, culturais e sociais, que não podem ser plenamente captadas por uma ferramenta automatizada. Assim, cabe ao professor atuar como curador do conteúdo gerado, adaptando-o à realidade da sua turma, aos objetivos curriculares e às especificidades do seu contexto escolar.

Como sugestão de melhorias futuras da aplicação, é necessário enriquecer melhor os prompts que geram as imagens, pois foram encontradas dificuldades na geração de boas imagens, a maioria delas ficaram borradas, com frases em inglês mesmo pedindo a IA para gerar em PT-BR.




