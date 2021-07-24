public class AnimalBuilder {
    public static Animal gerarAnimal(EAnimal tipo,String nome, String raca, String som, Integer qtdPatas){
        switch (tipo){
            case CACHORRO:
                return new Cachorro(nome,raca,som,qtdPatas);
            case GATO:
                return new Gato(nome,raca,som,qtdPatas);
            case JACARE:
                return new Jacare(nome,raca,som,qtdPatas);
            default:
                return new Animal(nome,raca,som,qtdPatas);
        }
    }
}