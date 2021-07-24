public class Cachorro extends Animal{
    public Cachorro(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    @Override
    public String getSom() {
        return super.getSom();
    }

    public String getSom(String som) {
        return getSom() + som;
    }
}
