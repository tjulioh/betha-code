# Desafio Java Polimorfismo e Sobrecarga

* Criar Classes e suas extensões:
    1. FUNCIONARIO: id, nome, cpf e salarioBruto:
        1. ESTAGIARIO: sobrescrever getSalarioBruto() aplicando um bônus de 5%;
        2. ANALISTA: sobrescrever getSalarioBruto() aplicando um bônus de 10%;
        3. ARQUITETO SOFT.: sobrescrever getSalarioBruto() aplicando um bônus de 15%;
        4. COORDENADOR: sobrescrever getSalarioBruto() aplicando um bônus de 20%.
    2. FOLHA: id, funcionario, data de pagamento, lista de descontos e salarioLiquido;
    3. DESCONTO: id, descricao e valor.


* Objetivo final:
  - Criar um método:
    - calcular()
    - calcular(List<descontos>)
    - calcular(List<descontos>, Double
  - No método calcular aplicar a regra do imposto de renda.
  - No método calcular aplicar a regra do INSS
  - No método calcular aplicar os descontos;
  - No método calcular aplicar o bônus quando houver. 
  - Criar funcionarioBuilder para gerar o funcionário que será adicionado a folha de pagamento.
