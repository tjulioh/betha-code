public class ArquitetoSoftware extends Funcionario {
    public ArquitetoSoftware(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public ArquitetoSoftware(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public ArquitetoSoftware(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return ((super.getSalarioBruto() / 100)*15) + super.getSalarioBruto();
    }
}
