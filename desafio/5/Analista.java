public class Analista extends Funcionario {
    public Analista(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Analista(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Analista(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return ((super.getSalarioBruto() / 100)*10) + super.getSalarioBruto();
    }
}
