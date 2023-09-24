CREATE TABLE topicos (

    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensagem TEXT(500) NOT NULL,
    data_criacao TIMESTAMP NOT NULL,
    status VARCHAR(25) NOT NULL,
    autor VARCHAR(50) NOT NULL,
    curso VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)
);