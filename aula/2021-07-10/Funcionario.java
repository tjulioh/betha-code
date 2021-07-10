public class Funcionario extends Individuo {
    private String marca;

    public Funcionario(String nome, Double altura, Double peso) {
        super(nome, altura, peso);
    }

    public Double getImc(){
        return getPeso() * (getAltura() * getAltura());
    }
}
