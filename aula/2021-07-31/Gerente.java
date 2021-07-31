public class Gerente extends Funcionario{

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return ((getSalario() / 100 ) * 15 ) + getSalario();
    }
}
