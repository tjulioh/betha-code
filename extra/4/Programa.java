public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getArea());

        Triangulo triangulo = new Triangulo(5,5,5,5,5);
        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getArea());
    }
}
