lexer grammar BricolagemLexer;

// Palavras-chave
PROJETO_MAKER: 'ProjetoMaker';
NIVEL: 'Nivel';
TEMA: 'Tema';
OBJETIVO_ENSINO: 'ObjetivoEnsino';
OBJETIVO_APRENDIZAGEM: 'ObjetivoAprendizagem';
OBJETIVO_PESQUISA: 'ObjetivoPesquisa';
OBJETIVO_EDUCACIONAL: 'ObjetivoEducacional';
ATIVIDADES: 'Atividades';
AVALIACAO: 'Avaliacao';
RECURSOS: 'Recursos';
CONFORMIDADE_BNCC: 'ConformidadeBNCC';

DESCRICAO: 'Descricao';
DURACAO: 'Duracao';
MINUTOS: 'minutos';
PASSOS: 'Passos';
CRITERIOS: 'Criterios';
INSTRUMENTOS: 'Instrumentos';

// Símbolos
ABRE_CHAVE: '{';
FECHA_CHAVE: '}';
DOIS_PONTOS: ':';
VIRGULA: ',';
ABRE_COLCHETE: '[';
FECHA_COLCHETE: ']';

// Tipos básicos
STRING: '"' .*? '"';  // Texto entre aspas
NUMERO: [0-9]+;       // Números inteiros
ID: [a-zA-Z0-9._-]+;  // Códigos (ex: BNCC.EM.CC.1)

// Ignorar espaços e quebras de linha
WS: [ \t\r\n]+ -> skip;
