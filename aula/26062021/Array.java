public class Array {
    public static void main(String[] args) {
        int[] jogoSena;

        jogoSena = new int[6];

        jogoSena[0] = 23;
        jogoSena[1] = 12;
        jogoSena[2] = 55;
        jogoSena[3] = 02;
        jogoSena[4] = 07;
        jogoSena[5] = 19;

        int[] outroJogoSena = {23,12,55,02,07,19};

        System.out.println(jogoSena);

        int i;
        for(i=0;i < outroJogoSena.length; i++){
            System.out.println(jogoSena[i]);
        }        
    }
}
