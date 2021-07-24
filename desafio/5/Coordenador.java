public class Coordenador extends Funcionario {
    public Coordenador(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Coordenador(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Coordenador(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return ((super.getSalarioBruto() / 100)*20) + super.getSalarioBruto();
    }
}
