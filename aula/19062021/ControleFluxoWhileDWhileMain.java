public class ControleFluxoWhileDWhileMain {
    public static void main(String[] args) {
        int x = 10;
        while (x < 10){
            System.out.println("item " + x);
            x++;
        }

        int y = 10;
        do {
            System.out.println("item " + y);
            y++;
        } while (y < 10);
    }
}
