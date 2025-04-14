// REGRAS SINTÁTICAS (PARSER)

parser grammar BricolagemParser;

options { tokenVocab=BricolagemLexer; }


projetoMaker: PROJETO_MAKER ABRE_CHAVE
    nivel
    tema
    objetivos
    atividades
    avaliacao
    recursos
    (conformidadeBNCC)?  // Opcional
    FECHA_CHAVE;

nivel: NIVEL DOIS_PONTOS STRING VIRGULA;
tema: TEMA DOIS_PONTOS STRING VIRGULA;

objetivos: 
    OBJETIVO_ENSINO DOIS_PONTOS ABRE_COLCHETE listaObjetivosEnsino FECHA_COLCHETE VIRGULA
    OBJETIVO_APRENDIZAGEM DOIS_PONTOS ABRE_COLCHETE listaObjetivosAprendizagem FECHA_COLCHETE VIRGULA
    (OBJETIVO_PESQUISA DOIS_PONTOS ABRE_COLCHETE listaObjetivosPesquisa FECHA_COLCHETE VIRGULA)?
    OBJETIVO_EDUCACIONAL DOIS_PONTOS ABRE_COLCHETE listaObjetivosEducacionais FECHA_COLCHETE VIRGULA;

listaObjetivosEnsino: (objetivoEnsino (VIRGULA objetivoEnsino)*)?;
objetivoEnsino: ID DOIS_PONTOS STRING;

listaObjetivosAprendizagem: (objetivoAprendizagem (VIRGULA objetivoAprendizagem)*)?;
objetivoAprendizagem: ID DOIS_PONTOS STRING;

listaObjetivosPesquisa: (objetivoPesquisa (VIRGULA objetivoPesquisa)*)?;
objetivoPesquisa: ID DOIS_PONTOS STRING;

listaObjetivosEducacionais: (objetivoEducacional (VIRGULA objetivoEducacional)*)?;
objetivoEducacional: ID DOIS_PONTOS STRING;

atividades: ATIVIDADES DOIS_PONTOS ABRE_COLCHETE listaAtividades FECHA_COLCHETE VIRGULA;
listaAtividades: (atividade (VIRGULA atividade)*)?;
atividade: STRING DOIS_PONTOS ABRE_CHAVE
    'Descricao' DOIS_PONTOS STRING VIRGULA
    'Duracao' DOIS_PONTOS NUMERO 'minutos' VIRGULA
    'Passos' DOIS_PONTOS ABRE_COLCHETE (STRING (VIRGULA STRING)*) FECHA_COLCHETE
    FECHA_CHAVE;

avaliacao: AVALIACAO DOIS_PONTOS ABRE_CHAVE
    'Criterios' DOIS_PONTOS ABRE_COLCHETE (STRING (VIRGULA STRING)*) FECHA_COLCHETE VIRGULA
    'Instrumentos' DOIS_PONTOS ABRE_COLCHETE (STRING (VIRGULA STRING)*) FECHA_COLCHETE
    FECHA_CHAVE VIRGULA;

recursos: RECURSOS DOIS_PONTOS ABRE_COLCHETE (STRING (VIRGULA STRING)*) FECHA_COLCHETE VIRGULA;

conformidadeBNCC: CONFORMIDADE_BNCC DOIS_PONTOS ABRE_COLCHETE (ID (VIRGULA ID)*) FECHA_COLCHETE VIRGULA;
