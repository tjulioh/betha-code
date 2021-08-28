package repository;

public class VendaBalcaoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Busca por ID");
    }

    @Override
    public void findAll() {
        System.out.println("Busca geral");
    }
}
