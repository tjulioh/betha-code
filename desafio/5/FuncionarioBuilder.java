public class FuncionarioBuilder {
    public static Funcionario gerarFuncionario(EFuncionario tipo, Integer id, String nome, String cpf, Double salarioBruto){

        switch (tipo){
            case ANALISTA:
                return new Analista(id,nome,cpf,salarioBruto);
            case COORDENADOR:
                return new Coordenador(id,nome,cpf,salarioBruto);
            case ARQUITETO:
                return new ArquitetoSoftware(id,nome,cpf,salarioBruto);
            case ESTAGIARIO:
                return new Estagiario(id,nome,cpf,salarioBruto);
            default:
                return new Funcionario(id, nome);
        }
    }
}