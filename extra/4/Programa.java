public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getArea());

        FiguraGeometrica triangulo = new Triangulo(5,4,5,4,3);
        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getArea());
    }
}
