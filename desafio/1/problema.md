Criar um banco de dados para uma escola, este banco deverá permitir guardar dados de PAISES, CIDADES, ALUNOS, PROFESSORES, MATERIA, TURMAS, FREQUÊNCIA.

PAISES: ID, NOME, POPULAÇÃO.
ESTADOS: ID, NOME, POPULAÇÃO, PAÍS.
CIDADES: ID, NOME, POPULAÇÃO, ESTADO.
ALUNOS: ID, NOME, MATRÍCULA, CIDADE, DATA DE NASCIMENTO.
PROFESSORES: ID, NOME, CIDADE, DATA DE NASCIMENTO.
MATERIA: ID, DESCRICAO.
TURMAS: ID, DESCRICAO, MATÉRIA, PROFESSOR.
FREQUÊNCIA: ID, TURMA, ALUNO, DATA DE AULA, SE COMPARECEU OU NÃO.

Criar um SQL que traga todos os alunos de uma cidade específica. 

Criar um SQL que traga todas as turmas de um determinado professor.

Criar um SQL que traga a quantidade de alunos por cidade onde a população for menor que 10 mil habitantes.

Criar um SQL que traga as datas de nascimento de professores e alunos juntos.

Criar um SQL que traga o nome da cidade e o nome do aluno na mesma consulta.

Criar um SQL que traga a quantidade de alunos que compareceram e que não compareceram às aulas, por turma e em uma data específica.