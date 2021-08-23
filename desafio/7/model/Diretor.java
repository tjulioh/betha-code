package model;
public class Diretor extends Funcionario{

    private Double bonus;

    public Diretor() {
    }

    public Diretor(Long id, String nome, String cpf, Double salario, Double bonus) {
        super(id, nome, cpf, salario);
        this.bonus = bonus;
    }

    public Diretor(String nome, String cpf, Double salario, Double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }


    @Override
    public String toString() {
        return "Diretor{" +
                "id=" + super.getId() +
                ", nome='" +  super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                ", salario=" + super.getSalario() +
                ", bonus=" + bonus +
                '}';
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
