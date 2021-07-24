public class Estagiario extends Funcionario {
    public Estagiario(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Estagiario(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Estagiario(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return ((super.getSalarioBruto() / 100)*5) + super.getSalarioBruto();
    }
}
