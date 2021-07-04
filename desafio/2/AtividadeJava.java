import java.util.Scanner;

public class AtividadeJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  

        //Questão Um - Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente.
        //Método Um
        System.out.print("Digite o numero referente ao dia da semana: ");  
        int dia = s.nextInt();                     
        String[] diaSemana = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira","Sábado","Domingo"};          
        System.out.println(diaSemana[dia-1]);

        //Método Dois
        System.out.print("Digite o numero referente ao dia da semana: ");  
        dia = s.nextInt();        
        switch (dia) {
            case 1: 
                System.out.println("Segunda-feira");
                break;                
            case 2: 
                System.out.println("Terça-feira");
                break;                    
            case 3: 
                System.out.println("Quarta-feira");
                break;                    
            case 4: 
                System.out.println("Quinta-feira");
                break;                    
            case 5: 
                System.out.println("Sexta-feira");
                break;
            case 6: 
                System.out.println("Sábado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;                
            default:
                System.out.println("Favor informar um dia valido!");                
        }  

        //Questão Dois - Escreva um laço while que execute 20 vezes, imprimindo o valor da variável x que inicialmente está com valor 10.
        int x = 10;
        while (x <= 30) {
            System.out.println("Enquanto de N° " + x);
            x++;            
        }

        //Questão Três - Converta este laço do exercício anterior para um do-while.
        x = 10;
        do {
            System.out.println("Enquanto de N° " + x);
            x++;            
        } while (x <= 30);

        //Questão Quatro - Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos. Inverta esse número.
        int a;
        int n;
        int r = 0;        
        do {     
            System.out.println("Digite um numero de no maximo 4 digitos: ");  
            n = s.nextInt();
        } while (n >= 9999);   
        
        //Método Um
        for (a = n; a !=0; a /= 10) {
            r = r * 10 + a % 10;
        }
        System.out.println("Numero inverso de " + n + " é " + r);  

        //Método Dois
        while (a != 0) {
            r = r * 10 + a % 10;
            a = a / 10;
        }
        System.out.println("Numero inverso de " + n + " é " + r);  

        //Questão Cinco - Implemente um programa para calcular a área de um trapézio, onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2
        System.out.println("Digite a altura para calcular área de um trapézio: ");  
        double altura = s.nextDouble();
        System.out.println("Digite a base menor: ");  
        double baseMaior = s.nextDouble();
        System.out.println("Digite a base maior: ");  
        double baseMenor = s.nextDouble();
        System.out.println("Área do trapézio: " + (altura*(baseMenor+baseMaior))/2);  

        //Questão Seis - Faça um programa que imprima os quadrados dos números inteiros ímpares entre 15 e 35.
        for (int i = 15;i < 35;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Quadrado do N° " + i +" é " + i*i);
        }
    }    
}