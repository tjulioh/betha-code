public class Gerente extends Funcionario{

    public Gerente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return ((super.getBonificacao() / 100 ) * 15 ) + super.getBonificacao();
    }
}
