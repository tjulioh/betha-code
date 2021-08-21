package exception;

import java.io.*;

public class ExceptionMain {


    public static void main(String[] args) throws Exception {

        //dividePorZero();
        //dividePorZeroTratado();

        //elementoNoArrayInexistente();
        elementoNoArrayInexistentTratado();

        //classeNaoEncontrada();
        //classeNaoEncontradaTratado();

        //arquivoNaoEncontrado();
        //arquivoNaoEncontradoTratado();

        //objetoNullo();
        //objetoNulloTratado();


    }

    public static void dividePorZero() {
        int a = 0;
        int b = 2;
        int resultado = 0;

        resultado = b / a;
    }

    public static void dividePorZeroTratado() {
        int a = 0;
        int b = 2;
        int resultado = 0;

        try {
            resultado = b / a;
        } catch (ArithmeticException ar) {
            System.out.println("O divisor deve ser maior que ZERO!");
        }
    }

    public static void elementoNoArrayInexistente() {
        int[] array = {10, 11, 12};
        System.out.println(array[3]);
    }

    public static void elementoNoArrayInexistentTratado() {
        int[] array = {10, 11, 12};

        try{
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("Elemento do array inexistente!");
        }
    }

    public static void classeNaoEncontrada() throws Exception{
        Object objeto = Class.forName("classe.NaoExiste").newInstance();
    }

    public static void classeNaoEncontradaTratado() throws Exception{
        try{
            Object objeto = Class.forName("classe.NaoExiste").newInstance();
        } catch (ClassNotFoundException cl){
            System.out.println("Classe não encontrada!!");
        }
    }

    public static void arquivoNaoEncontrado() throws Exception {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }

    public static void arquivoNaoEncontradoTratado() throws Exception {
        try {
            InputStream is = new FileInputStream("arquivo.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();

            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
        }catch (FileNotFoundException fe){
            System.out.println("Arquivo nao encontrado!");
        }
    }

    public static void objetoNullo(){
        Documento documento = null;

        System.out.println(documento.getNumeroDocumento());
    }

    public static void objetoNulloTratado(){
        Documento documento = null;

        try {
            System.out.println(documento.getNumeroDocumento());    
        }catch (NullPointerException npe){
            System.out.println("Objeto referenciado esta nullo!");
        }
        
    }

    public static class Documento{
        private String numeroDocumento;

        public String getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(String numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }
    }


}
