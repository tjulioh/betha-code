import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class AtividadeJavaSwing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  

        //Questão Um
        //Método Um
        int[] lista = {10,20,30,40,50,60,70,80,90,100};
        String mensagem = "Lista:\n";
        for(int i = 0;i < lista.length;i++){
            mensagem = mensagem + "Valor " + i + " = " + lista[i] + "\n";
        }
        JOptionPane.showMessageDialog(null,mensagem);

        //Método Dois
        mensagem = "Lista:\n";
        for(int i:lista){
            mensagem = mensagem + i + "\n";
        }
        JOptionPane.showMessageDialog(null,mensagem);

        //Questão Dois
        //Método Um
        int[] listaInteiro = {10,20,30,40,50,60,70,80,90,100};
        int total = 0;
        for(int i = 0;i < listaInteiro.length;i++){
            total = total + listaInteiro[i];
        }
        JOptionPane.showMessageDialog(null,"Média: " + total / listaInteiro.length);

        //Método Dois
        JOptionPane.showMessageDialog(null,"Média: " + Arrays.stream(listaInteiro).sum() / listaInteiro.length);

        //Questão Três
        mensagem = "Lista Invertida:\n";
        int[] listaInverter = {10,20,30,40,50,60,70,80,90,100};
        int[] listaInvertida = new int[listaInverter.length];
        for(int i = listaInverter.length ,j=0;i > 0;i--,j++){
            listaInvertida[j] = listaInverter[i-1];
        }
        for(int i:listaInvertida){
            mensagem = mensagem + i + "\n";
        }
        JOptionPane.showMessageDialog(null,mensagem);

        //Questão Quatro
        String[] cadastro = new String[] {"Sem Nome","Sem Telefone"};
        cadastro[0] = JOptionPane.showInputDialog("Digite o seu nome: ");
        cadastro[1] = JOptionPane.showInputDialog("Digite a seu telefone: ");
        JOptionPane.showMessageDialog(null,"Olá " + cadastro[0] + ", cadastro completo!");

        //Questão Cinco
        mensagem = "Paramtros Invertidos:\n";
        String[] parametros = new String[10];
        for(int i = 0;i < 10;i++){
            parametros[i] = JOptionPane.showInputDialog("Digite o parametro " + (i+1) + ":");
        }
        String[] parametrosInvertidos = new String[parametros.length];
        for(int i = parametros.length,j=0;i > 0;i--,j++){
            parametrosInvertidos[j] = parametros[i-1];
        }
        for(String i:parametrosInvertidos){
            mensagem = mensagem + i + "\n";
        }

        //Questão Seis
        Double[] imc = new Double[2];
        imc[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        imc[1] = Double.valueOf(JOptionPane.showInputDialog("Digite a sua altura: "));
        JOptionPane.showMessageDialog(null,"Valor do seu IMC: " + (imc[0]/(Math.pow(imc[1],2))));
    }
}