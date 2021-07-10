public class Programa {
    public static void main(String[] args) {

        Apartamento apartamento = new Apartamento(3, 1,120.0,"Ana Maria","Concordia","842144",300,1,false);
        System.out.println(apartamento.getAndar());

        Casa casa = new Casa(3, 1,120.0,"Ana Maria","Concordia","842144",300,true);
        System.out.println(casa.getAlvenaria());
    }
}