CREATE TABLE condutores (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    cpf VARCHAR(11)

);

CREATE TABLE ocorrencias (
    id SERIAL PRIMARY KEY,
    descricaoBloqueio VARCHAR(255),
    documentoGeradorImpedimentoBloqueio VARCHAR(255)

);
