public class SecretariaAgencia extends Secretaria{
    public SecretariaAgencia(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return ((super.getSalario() / 100 ) * 5 ) + super.getSalario();
    }
}
