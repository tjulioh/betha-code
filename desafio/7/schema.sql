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