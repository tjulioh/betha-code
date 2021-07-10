public class ControleFluxoForMain {
    public static void main(String[] args) {
        for (int x = 0;x < 10;x++){
            if(x == 5){
                continue;
            }
            if(x == 6){
                break;
            }
            System.out.println("item " + x);
        }
    }
}