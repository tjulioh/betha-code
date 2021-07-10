public class AnimalMain {
    public static void main(String[] args) {
        Animal gato = new Animal("Gato",0.75,6.5,"Miauuu");
        System.out.println(gato.nome);
        System.out.println(gato.emitirSom());
        gato.pular(0.5);
    }

    public static class Animal {
       private String nome;
       private Double altura;
       private Double peso;
       private String som;

       public Animal(String nome, Double peso, Double altura, String som){
           this.nome = nome;
           this.altura = peso;
           this.peso = altura;
           this.som = som;
       }

       public String emitirSom(){
           return som;
       }

        public void pular(Double altura){
            System.out.println("Gato pulou um total de " + altura);
        }
    }
}