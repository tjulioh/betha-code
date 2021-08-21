package model;
public class Diretor extends Funcionario{

    private Double bonus;

    public Diretor() {
    }

    public Diretor(Double bonus) {
        this.bonus = bonus;
    }

    public Diretor(Integer id, String nome, String cpf, Double salario, Double bonus) {
        super(id, nome, cpf, salario);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
