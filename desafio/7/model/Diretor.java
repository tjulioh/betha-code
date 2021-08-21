package model;
public class Diretor extends Funcionario{

    private Double bonus;

    public Diretor() {
    }

    public Diretor(Double bonus) {
        this.bonus = bonus;
    }

    public Diretor(Long id, String nome, String cpf, Double salario, Double bonus) {
        super(id, nome, cpf, salario);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "bonus=" + bonus +
                '}';
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
