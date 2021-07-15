# Desafio Java Herança e Encapsulamento

* Criar Classes e suas extensões:
    1. PESSOA: id, nome, endereço e telefone.
        1. PESSOA FÍSICA: cpf, rg e sexo.
            1. CLIENTE: limite crediário e limite utilizado.
            2. FUNCIONÁRIO: salário bruto e salário liquido.
        2. PESSOA JURÍDICA: cnpj, inscrição estadual e cnae.
            1. FORNECEDOR: responsável e observação.
    

* Objetivo final:
  1. CRIAR TODOS OS GETTERS, SETTERS.
  2. PARA O CLIENTE CRIAR UM MÉTODO PARA AUMENTAR O LIMITE E UM PARA DIMINUIR.
  3. PARA O FUNCIONÁRIO CRIAR UM MÉTODO QUE APLIQUE O DISSÍDIO NO SALÁRIO.
  4. APENAS MÉTODOS PODERÃO ALTERAR VALORES, TODO OS ATRIBUTOS PRIVATE.
  5. CRIAR CONSTRUTORES COM PARAMETROS.
  6. CRIAR UMA CLASSE PARA EXECUTAR O TESTES (PUBLIC STATIC VOID MAIN…..)
  7. UTILIZAR HERANÇA
  8. CRIAR UM MÉTODO getDocumentoPrincipal() EM PESSOA, sobrescrever em pessoa fisica e juridica, um retornará o CPF e outro o CNPJ
