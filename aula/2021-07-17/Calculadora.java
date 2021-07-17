public class Calculadora {
    public static void main(String[] args) {
        calcular(1,1);
        calcular(2.5,1.5);
        calcular("5.5","2.5");
    }

    private static void calcular(int a, int b){
        System.out.println(a + b);
    }

    private static void calcular(double a, double b){
        System.out.println(a + b);
    }

    private static void calcular(String a, String b){
        System.out.println(Double.parseDouble(a) + Double.parseDouble(b));
    }

}
