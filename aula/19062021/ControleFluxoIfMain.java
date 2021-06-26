public class ControleFluxoIfMain {
    public static void main(String[] args) {

        int ano = 2020;
        double altura = 1.4;
        double salario = 15000;

        if (ano < 0) {
            System.out.println("Ano invalido!");
        } else if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("Ano bissexto!");
        } else {
            System.out.println("Ano Normal!");
        }

        if (10 == 20) {
            System.out.println("É igual!");
        } else {
            System.out.println("É diferente!");
        }

        if (altura < 1.5) {
            System.out.println("É menor!");
        } else {
            System.out.println("É maior!");
        }

        if (salario >= 15000) {
            System.out.println("É ele!");
        } else {
            System.out.println("Não é ele!");
        }
    }
}