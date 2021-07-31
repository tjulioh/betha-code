public class FuncionarioBuilder {
    public static Funcionario gerarFuncionario(EFuncionario tipo, String nome, Double salarioBruto){

        switch (tipo){
            case GERENTE:
                return new Gerente(nome, salarioBruto);
            case DIRETOR:
                return new Diretor(nome, salarioBruto);
            case PRESIDENTE:
                return new Presidente(nome, salarioBruto);
            case AGENCIA:
                return new SecretariaAgencia(nome, salarioBruto);
            default:
                return null;
        }
    }
}