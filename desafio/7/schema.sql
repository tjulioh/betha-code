DROP SCHEMA IF EXISTS folha CASCADE;

CREATE SCHEMA IF NOT EXISTS folha;

CREATE TABLE if not exists folha.funcionario
(
    id int,
    nome varchar (80),
    cpf varchar (11),
    salario decimal,
    CONSTRAINT pk_funcionario PRIMARY KEY(id)
    );

CREATE TABLE if not exists folha.diretor
(
    id int,
    nome varchar (80),
    cpf varchar (11),
    salario decimal,
    bonus decimal,
    CONSTRAINT pk_diretor PRIMARY KEY(id)
    );

CREATE SEQUENCE folha.SEQ_FUNCIONARIO MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE folha.SEQ_DIRETOR MAXVALUE 9999999999 CACHE 1;