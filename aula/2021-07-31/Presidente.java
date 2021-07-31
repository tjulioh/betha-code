public class Presidente extends Funcionario{
    public Presidente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return ((super.getSalario() / 100 ) * 10 ) + super.getSalario();
    }
}
