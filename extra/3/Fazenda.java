public class Fazenda {
    public static void main(String[] args) {
        Animal gato = AnimalBuilder.gerarAnimal(EAnimal.GATO,"Leo","Vira-Lata","Miau",3);
        System.out.println(gato.getSom());

        Animal cachorro = AnimalBuilder.gerarAnimal(EAnimal.CACHORRO,"Lucas","Vira-Lata","...",4);
        System.out.println(cachorro.getSom("auuuu"));

        Cachorro cachorroAgitado = (Cachorro) cachorro;
        System.out.println(cachorroAgitado.getSom("aaaaauauauuuu"));

        Animal jacareManso = AnimalBuilder.gerarAnimal(EAnimal.JACARE,"Pedro","Branco","CROCOC",5);
        System.out.println(jacareManso.getSom());
    }
}
