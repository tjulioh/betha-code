package repository;

public class ProdutoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Busca por ID");
    }

    @Override
    public void findAll() {
        System.out.println("Busca geral");
    }
}