import java.util.Scanner;

public class DesafioDoisMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Atividade 1
        System.out.println("Digite um numero referente ao dia da semana: ");
        int dia = s.nextInt();
        switch (dia){
            case 1:
                System.out.println("Segunda-Feria");
                break;
            case 2:
                System.out.println("Terça-Feria");
                break;
            case 3:
                System.out.println("Quarta-Feria");
                break;
            case 4:
                System.out.println("Quinta-Feria");
                break;
            case 5:
                System.out.println("Sexta-Feria");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Incorreto!");
        }

        //Atividade 2
        int x = 10;
        while (x < 30){
            System.out.println("item " + x);
            x++;
        }

        //Atividade 3
        int y = 10;
        do {
            System.out.println("item " + y);
            y++;
        } while (y < 30);

        //Atividade 4
        System.out.println("Digite um numero de no maximo 4 digitos: ");
        /*
        do {
        } while (s.nextInt() < 30);
        */

        //Atividade 5
        System.out.println("Digite a altura: ");
        double h = s.nextDouble();
        System.out.println("Digite a base menor: ");
        double b = s.nextDouble();
        System.out.println("Digite a base maior: ");
        double B = s.nextDouble();
        System.out.println((h*(b+B)/2));

        //Atividade 6
        for (int z = 15;z < 35;z++){
            if(z % 2 == 0){
                continue;
            }
            System.out.println("item " + z);
        }
    }
}
