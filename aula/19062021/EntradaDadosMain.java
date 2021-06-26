import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma linha: ");
        String linha = s.nextLine();

        System.out.println("Digite um numero: ");
        int i = s.nextInt();

        System.out.println("Digite um numero: ");
        double d = s.nextDouble();

        System.out.println("Resposta: linha: " + linha + " | inteiro: " + i + " | double: " + d);
    }
}
