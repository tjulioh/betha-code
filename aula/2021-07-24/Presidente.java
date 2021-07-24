public class Presidente extends Funcionario{
    public Presidente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return ((super.getBonificacao() / 100 ) * 10 ) + super.getBonificacao();
    }
}
