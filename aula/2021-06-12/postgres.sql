--create DATABASE betha;

--CREATE SCHEMA curso;

drop table if exists curso.funcionarios cascade;
drop table if exists curso.cidades cascade;
drop table if exists curso.fornecedores cascade;
CREATE TABLE if not exists curso.funcionarios
(
    id
    int,
    nome
    varchar
(
    80
),
    cpf varchar
(
    11
),
    altura decimal,
    peso decimal,
    dataNascimento date,
    CONSTRAINT pk_clientes PRIMARY KEY
(
    id
)
    );

SELECT *
FROM curso.funcionarios;

INSERT INTO curso.funcionarios
VALUES (1, 'Francisco JosÃ©', '04696900879', 1.74, 90, '1994-11-27');

INSERT INTO curso.funcionarios (id, nome, cpf, dataNascimento, peso, altura)
VALUES (2, 'JosÃ© da Silva', '07288600981', '1994-11-27', 95, 1.83);

INSERT INTO curso.funcionarios (id, nome, cpf, dataNascimento, peso, altura)
VALUES (3, 'JosÃ© da Silva', '07288600981', '1994-11-27', 95, 1.83);

UPDATE curso.funcionarios
SET nome = 'JosÃ© da Silva Fernandes'
WHERE id = 2;

UPDATE curso.funcionarios
SET dataNascimento = '1984-11-27'
WHERE id = 1;

DELETE
FROM curso.funcionarios
WHERE id = 1;

DELETE
FROM curso.funcionarios
WHERE nome like '%Silva%';

DELETE
FROM curso.funcionarios;

DELETE
FROM curso.funcionarios
WHERE extract(year from dataNascimento) = 1994;

SELECT *
FROM curso.funcionarios
WHERE id = 1;

SELECT *
FROM curso.funcionarios
WHERE nome = 'JosÃ©';

SELECT *
FROM curso.funcionarios
WHERE extract(year from dataNascimento) = 1994;

SELECT *
FROM curso.funcionarios
WHERE nome like '%Silva%';

SELECT extract(year from age(c.dataNascimento))
FROM curso.funcionarios c;

SELECT count(*)
FROM curso.funcionarios;

SELECT nome, count(*), avg(peso), avg(altura)
FROM curso.funcionarios
group by nome;

SELECT distinct(nome)
FROM curso.funcionarios;

SELECT sum(extract(year from age(dataNascimento))) / count(*) as media
FROM curso.funcionarios;

UPDATE curso.funcionarios
SET dataNascimento = '1992-11-27'
WHERE id = 1;

SELECT *
FROM curso.funcionarios
WHERE datanascimento BETWEEN '1992-01-01' AND '1992-12-31';

create table if not exists curso.cidades
(
    id
    int,
    nome
    varchar
(
    80
),
    constraint PK_CIDADES primary key
(
    id
)
    );

insert into curso.cidades
values (1, 'Criciuma');
insert into curso.cidades
values (2, 'Tubarao');
insert into curso.cidades
values (3, 'Icara');
insert into curso.cidades
values (4, 'Ararangua');

alter table curso.funcionarios
    add i_cidades INT;
alter table curso.funcionarios
    add constraint fk_cidades_clientes foreign key (i_cidades) references curso.cidades (id);

update curso.funcionarios
set i_cidades = 1;
update curso.funcionarios
set i_cidades = 3
where id = 2;
update curso.funcionarios
set i_cidades = 5
where id = 2;
update curso.funcionarios
set i_cidades = null
where id = 2;

select *
from curso.funcionarios,
     curso.cidades
where funcionarios.i_cidades = cidades.id;

select *
from curso.funcionarios
         left join curso.cidades on (funcionarios.i_cidades = cidades.id);

create table if not exists curso.fornecedores
(
    id
    int,
    nome
    varchar
(
    80
),
    cnpj varchar
(
    22
),
    dataCriacao date
    );

create
or replace view curso.fornecedores_por_idade as
select*, extract(year from age(dataCriacao)) as idade
from curso.fornecedores;

select *
from curso.fornecedores_por_idade;

SELECT nome, dataA
FROM (
         SELECT nome, dataNascimento as dataA
         FROM curso.funcionarios c
         UNION ALL
         SELECT nome, dataCriacao as dataA
         FROM curso.fornecedores f
     ) as tab;