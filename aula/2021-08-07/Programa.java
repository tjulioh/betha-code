import java.util.*;

public class Programa {
    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente(1,"Thiago","101","29"));
        lista.add(new Cliente(2,"Bruno","102","39"));
        lista.add(new Cliente(3,"Edvan","103","49"));
        lista.add(new Cliente(3,"Edvan","103","49"));
        System.out.println(lista);

        Set<Cliente> conjunto = new HashSet<>();
        conjunto.add(new Cliente(1,"Thiago","101","29"));
        conjunto.add(new Cliente(2,"Bruno","102","39"));
        conjunto.add(new Cliente(3,"Edvan","103","49"));
        conjunto.add(new Cliente(3,"Edvan","103","49"));
        System.out.println(conjunto);

        Map<Integer,Cliente> mapa = new HashMap<>();
        mapa.put(1,new Cliente(1,"Thiago","101","29"));
        mapa.put(2,new Cliente(2,"Bruno","102","39"));
        mapa.put(3,new Cliente(3,"Edvan","103","49"));
        mapa.put(3,new Cliente(3,"Edvan","103","49"));
        System.out.println(mapa);
    }
}
