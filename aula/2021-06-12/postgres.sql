--create DATABASE betha;

--CREATE SCHEMA curso;

drop table if exists curso.clientes cascade;
drop table if exists curso.cidades cascade;
drop table if exists curso.fornecedores cascade;
CREATE TABLE if not exists curso.clientes
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
FROM curso.clientes;

INSERT INTO curso.clientes
VALUES (1, 'Francisco JosÃ©', '04696900879', 1.74, 90, '1994-11-27');

INSERT INTO curso.clientes (id, nome, cpf, dataNascimento, peso, altura)
VALUES (2, 'JosÃ© da Silva', '07288600981', '1994-11-27', 95, 1.83);

INSERT INTO curso.clientes (id, nome, cpf, dataNascimento, peso, altura)
VALUES (3, 'JosÃ© da Silva', '07288600981', '1994-11-27', 95, 1.83);

UPDATE curso.clientes
SET nome = 'JosÃ© da Silva Fernandes'
WHERE id = 2;

UPDATE curso.clientes
SET dataNascimento = '1984-11-27'
WHERE id = 1;

DELETE
FROM curso.clientes
WHERE id = 1;

DELETE
FROM curso.clientes
WHERE nome like '%Silva%';

DELETE
FROM curso.clientes;

DELETE
FROM curso.clientes
WHERE extract(year from dataNascimento) = 1994;

SELECT *
FROM curso.clientes
WHERE id = 1;

SELECT *
FROM curso.clientes
WHERE nome = 'JosÃ©';

SELECT *
FROM curso.clientes
WHERE extract(year from dataNascimento) = 1994;

SELECT *
FROM curso.clientes
WHERE nome like '%Silva%';

SELECT extract(year from age(c.dataNascimento))
FROM curso.clientes c;

SELECT count(*)
FROM curso.clientes;

SELECT nome, count(*), avg(peso), avg(altura)
FROM curso.clientes
group by nome;

SELECT distinct(nome)
FROM curso.clientes;

SELECT sum(extract(year from age(dataNascimento))) / count(*) as media
FROM curso.clientes;

UPDATE curso.clientes
SET dataNascimento = '1992-11-27'
WHERE id = 1;

SELECT *
FROM curso.clientes
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

alter table curso.clientes
    add i_cidades INT;
alter table curso.clientes
    add constraint fk_cidades_clientes foreign key (i_cidades) references curso.cidades (id);

update curso.clientes
set i_cidades = 1;
update curso.clientes
set i_cidades = 3
where id = 2;
update curso.clientes
set i_cidades = 5
where id = 2;
update curso.clientes
set i_cidades = null
where id = 2;

select *
from curso.clientes,
     curso.cidades
where clientes.i_cidades = cidades.id;

select *
from curso.clientes
         left join curso.cidades on (clientes.i_cidades = cidades.id);

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
         FROM curso.clientes c
         UNION ALL
         SELECT nome, dataCriacao as dataA
         FROM curso.fornecedores f
     ) as tab;