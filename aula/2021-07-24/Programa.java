public class Programa {
    public static void main(String[] args) {
        Funcionario diretor = new Diretor("Thiago",100.0);
        System.out.println(diretor.getBonificacao());

        Funcionario gerente = new Gerente("Thiago",100.0);
        System.out.println(gerente.getBonificacao());
    }
}
