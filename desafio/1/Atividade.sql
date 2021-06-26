DROP SCHEMA IF EXISTS educacao CASCADE;

CREATE SCHEMA IF NOT EXISTS educacao;

CREATE TABLE educacao.pais(
	id int,
	nome varchar(80),
	populacao int,
	CONSTRAINT pk_pais PRIMARY KEY (id)
);

CREATE TABLE educacao.estado(
	id int,
	nome varchar(80),
	populacao int,
	i_pais int,
	CONSTRAINT pk_estado PRIMARY KEY (id),
	foreign key (i_pais) references educacao.pais (id)
);

CREATE TABLE educacao.cidade(
	id int,
	nome varchar(80),
	populacao int,
	i_estado int,
	CONSTRAINT pk_cidade PRIMARY KEY (id),
	foreign key (i_estado) references educacao.estado (id)
);

CREATE TABLE educacao.aluno(
	id int,
	nome varchar(80),
	matricula int,
	i_cidade int,
	dt_nascimento date,
	CONSTRAINT pk_aluno PRIMARY KEY (id),
	foreign key (i_cidade) references educacao.cidade (id)
);

CREATE TABLE educacao.professor(
	id int,
	nome varchar(80),
	i_cidade int,
	dt_nascimento date,
	CONSTRAINT pk_professor PRIMARY KEY (id),
	foreign key (i_cidade) references educacao.cidade (id)
);

CREATE TABLE educacao.materia(
	id int,
	descricao varchar(80),	
	CONSTRAINT pk_materia PRIMARY KEY (id)	
);

CREATE TABLE educacao.turma(
	id int,
	descricao varchar(80),
	i_materia int,
	i_professor int,
	CONSTRAINT pk_turma PRIMARY KEY (id),
	foreign key (i_materia) references educacao.materia (id),
	foreign key (i_professor) references educacao.professor (id)
);

CREATE TABLE educacao.frequencia(
	id int,
	i_turma int,	
	dt_aula date,
	fl_compareceu boolean,
	CONSTRAINT pk_frequencia PRIMARY KEY (id),
	foreign key (i_turma) references educacao.turma (id)	
);

alter table educacao.frequencia add i_aluno INT;
alter table educacao.frequencia add foreign key (i_aluno) references educacao.aluno (id);

CREATE SEQUENCE educacao.SEQ_PAIS MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_ESTADO MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_CIDADE MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_ALUNO MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_PROFESSOR MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_MATERIA MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_TURMA MAXVALUE 9999999999 CACHE 1;
CREATE SEQUENCE educacao.SEQ_FREQUENCIA MAXVALUE 9999999999 CACHE 1;

INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Brasil', 2519240);
INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Uruguai', 3005040);
INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Mexico', 418153);
INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Paraguai', 154344);
INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Bolivia', 702414);
INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Venezuela', 59480);
INSERT INTO educacao.pais VALUES (nextval('educacao.SEQ_PAIS'),'Argentina', 98377);

INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Santa Catarina', 257340,1);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Minas Gerais', 128421,1);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'SÃ£o Paulo', 329744,1);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Parana', 371238,1);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Amazonas', 53372,1);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Montevideo', 383278,2);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Cidade do Mexico', 837213,3);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Asuncao', 98337,4);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'La Paz', 21367,5);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Caracas', 2131,6);
INSERT INTO educacao.estado VALUES (nextval('educacao.SEQ_ESTADO'),'Buenos Aires', 5231,7);

INSERT INTO educacao.cidade VALUES (nextval('educacao.SEQ_CIDADE'),'Criciuma', 250383,1);
INSERT INTO educacao.cidade VALUES (nextval('educacao.SEQ_CIDADE'),'Florianopolis', 193008,1);
INSERT INTO educacao.cidade VALUES (nextval('educacao.SEQ_CIDADE'),'Icara', 8032,1);
INSERT INTO educacao.cidade VALUES (nextval('educacao.SEQ_CIDADE'),'Tubarao', 123783,1);
INSERT INTO educacao.cidade VALUES (nextval('educacao.SEQ_CIDADE'),'Sideropolis', 38284,1);
INSERT INTO educacao.cidade (id,populacao,i_estado) VALUES (nextval('educacao.SEQ_cidade'), 193,1);

INSERT INTO educacao.aluno VALUES (nextval('educacao.SEQ_ALUNO'),'Thiago Julio', 100,2,'2000-06-01');
INSERT INTO educacao.aluno VALUES (nextval('educacao.SEQ_ALUNO'),'Murilo Dono', 200,3,'2001-01-31');
INSERT INTO educacao.aluno VALUES (nextval('educacao.SEQ_ALUNO'),'Mateus Emanuel', 300,1,'1990-01-01');
INSERT INTO educacao.aluno VALUES (nextval('educacao.SEQ_ALUNO'),'Edvan Escobar', 400,1,'1999-09-09');
INSERT INTO educacao.aluno VALUES (nextval('educacao.SEQ_ALUNO'),'Emanuel De Melo', 500,4,'1987-11-09');

INSERT INTO educacao.professor VALUES (nextval('educacao.SEQ_PROFESSOR'),'Bruno',3,'1973-12-03');
INSERT INTO educacao.professor VALUES (nextval('educacao.SEQ_PROFESSOR'),'Renan',2,'1960-11-13');
INSERT INTO educacao.professor VALUES (nextval('educacao.SEQ_PROFESSOR'),'Eduardo',3,'1980-11-13');
INSERT INTO educacao.professor VALUES (nextval('educacao.SEQ_PROFESSOR'),'Douglas',2,'1983-07-14');
INSERT INTO educacao.professor VALUES (nextval('educacao.SEQ_PROFESSOR'),'Diego',1,'1969-03-19');

INSERT INTO educacao.materia VALUES (nextval('educacao.SEQ_MATERIA'),'Design de Interacao');
INSERT INTO educacao.materia VALUES (nextval('educacao.SEQ_MATERIA'),'Raciocinio Logico');
INSERT INTO educacao.materia VALUES (nextval('educacao.SEQ_MATERIA'),'Estrutura de Dados');
INSERT INTO educacao.materia VALUES (nextval('educacao.SEQ_MATERIA'),'Sociologia');
INSERT INTO educacao.materia VALUES (nextval('educacao.SEQ_MATERIA'),'Pascal I');

INSERT INTO educacao.turma VALUES (nextval('educacao.SEQ_TURMA'),'Betha Code #Colaborador',5,1);
INSERT INTO educacao.turma VALUES (nextval('educacao.SEQ_TURMA'),'Betha Code #Visitantes',5,2);
INSERT INTO educacao.turma VALUES (nextval('educacao.SEQ_TURMA'),'Treinamento I',3,4);
INSERT INTO educacao.turma VALUES (nextval('educacao.SEQ_TURMA'),'Treinamento II',4,4);
INSERT INTO educacao.turma VALUES (nextval('educacao.SEQ_TURMA'),'Treinamento III',5,4);

INSERT INTO educacao.frequencia VALUES (nextval('educacao.SEQ_FREQUENCIA'),1,'2021-06-05',true,1);
INSERT INTO educacao.frequencia VALUES (nextval('educacao.SEQ_FREQUENCIA'),1,'2021-05-29',true,1);
INSERT INTO educacao.frequencia VALUES (nextval('educacao.SEQ_FREQUENCIA'),1,'2021-06-12',true,1);
INSERT INTO educacao.frequencia VALUES (nextval('educacao.SEQ_FREQUENCIA'),1,'2021-06-05',false,3);
INSERT INTO educacao.frequencia VALUES (nextval('educacao.SEQ_FREQUENCIA'),1,'2021-06-05',true,2);

-- Questão Um
select * from educacao.aluno as a where i_cidade = 1;

-- Questão Dois
select * from educacao.turma as a where i_professor = 1;

-- Questão Três
select c.nome as cidade,count(*) as total from educacao.aluno as a join educacao.cidade as c on (a.i_cidade = c.id) where c.populacao < 10000 group by c.nome;

-- Questão Quatro
select * from (
	select dt_nascimento,nome from educacao.aluno
	union all
	select dt_nascimento,nome from educacao.professor
) as a;

-- Questão Cinco
select a.nome as aluno,c.nome as cidade from educacao.aluno as a join educacao.cidade as c on (a.i_cidade = c.id);

-- Questão Seis
-- Método Um
select i_turma as turma,fl_compareceu,count(*) as total from educacao.frequencia as f where dt_aula = '2021-06-05' group by fl_compareceu,i_turma;

-- Método Dois
select i_turma as turma,count(nullif(fl_compareceu, false)) as presenca,count(nullif(fl_compareceu, true)) as falta from educacao.frequencia as f where dt_aula = '2021-06-05' group by i_turma;