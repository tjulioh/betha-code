# Desafio PostgreSQL

* Criar um banco de dados para uma escola, este banco deverá permitir guardar dados de PAISES, CIDADES, ALUNOS,PROFESSORES, MATERIA, TURMAS, FREQUÊNCIA:
    1. PAISES: ID, NOME, POPULAÇÃO.
    2. ESTADOS: ID, NOME, POPULAÇÃO, PAÍS.
    3. CIDADES: ID, NOME, POPULAÇÃO, ESTADO.
    4. ALUNOS: ID, NOME, MATRÍCULA, CIDADE, DATA DE NASCIMENTO.
    5. PROFESSORES: ID, NOME, CIDADE, DATA DE NASCIMENTO.
    6. MATERIA: ID, DESCRICAO.
    7. TURMAS: ID, DESCRICAO, MATÉRIA, PROFESSOR.
    8. FREQUÊNCIA: ID, TURMA, ALUNO, DATA DE AULA, SE COMPARECEU OU NÃO.

1. Criar um SQL que traga todos os alunos de uma cidade específica. 

2. Criar um SQL que traga todas as turmas de um determinado professor.

3. Criar um SQL que traga a quantidade de alunos por cidade onde a população for menor que 10 mil habitantes.

4. Criar um SQL que traga as datas de nascimento de professores e alunos juntos.

5. Criar um SQL que traga o nome da cidade e o nome do aluno na mesma consulta.

6. Criar um SQL que traga a quantidade de alunos que compareceram e que não compareceram às aulas, por turma e em uma data específica.