package exercicio;

import exception.PersonalizadaException;

import java.util.Scanner;

public class ExercicioMain {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        try {
            if (numero > 10) {
                ValorMaiorQueOPermitidoException me = new ValorMaiorQueOPermitidoException("Valor maior que o permitido!");
                throw me;
            }

            if (numero < 3) {
                ValorMenorQueOPermdoException me = new ValorMenorQueOPermdoException("Valor menor que o permitido!");
                throw me;
            }
        } catch (Exception e) {
            System.out.println("Regra: " + e.getMessage());
        }

        System.out.println("Valor: " + numero);
    }
}
