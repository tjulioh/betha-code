import java.util.Arrays;

public class OrdenacaoArray {
    public static void main(String[] args) {
        int[] arrayInteiros = new int[10000];
        for(int i = 10000;i>0;i--){
            arrayInteiros[arrayInteiros.length - i] = i;
        }

        boolean estaOrdenado = false;

        long inicio = System.currentTimeMillis();
        while(!estaOrdenado){
            estaOrdenado = true;
            for(int i = 1;i< arrayInteiros.length;i++){
                if(arrayInteiros[i-1] > arrayInteiros[i]){
                    estaOrdenado = false;
                    int aux = arrayInteiros[i];
                    arrayInteiros[i] = arrayInteiros[i-1];
                    arrayInteiros[i-1] = aux;
                }
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo ordenar 1: " + (fim-inicio) + "ms");

        for(int i=10000;i>0;i--){
            arrayInteiros[arrayInteiros.length - i] = i;
        }
        inicio = System.currentTimeMillis();

        Arrays.sort(arrayInteiros);

        fim = System.currentTimeMillis();

        System.out.println("Tempo ordenar 2: " + (fim-inicio) + "ms");
    }
}
