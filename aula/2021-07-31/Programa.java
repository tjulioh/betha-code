public class Programa {
    public static void main(String[] args) {
        Funcionario diretor = FuncionarioBuilder.gerarFuncionario(EFuncionario.DIRETOR,"Thiago",100.0);
        System.out.println(diretor.getBonificacao());

        Funcionario gerente = FuncionarioBuilder.gerarFuncionario(EFuncionario.GERENTE,"Thiago",100.0);
        System.out.println(gerente.getBonificacao());

        Funcionario agencia = FuncionarioBuilder.gerarFuncionario(EFuncionario.AGENCIA,"Thiago",100.0);
        System.out.println(agencia.getBonificacao());
    }
}
