import java.util.Arrays;

public class PesquisarArray {
    public static void main(String[] args) {
        int[] numeroInteiros = new int[1000000];
        int numeroPesquisado = 55500;
        for(int i=0;i < 1000000;i++){
            numeroInteiros[i] = i;            
        }

        long inicio = System.currentTimeMillis();

        for(int i=0;i < 1000000;i++){
            if(numeroInteiros[i] == numeroPesquisado){
                break;
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo pesquisar 1: " + (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();

        Arrays.binarySearch(numeroInteiros,numeroPesquisado);

        fim = System.currentTimeMillis();

        System.out.println("Tempo pesquisar 2: " + (fim-inicio) + "ms");
    }
}
