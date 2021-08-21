import model.Cliente;
import repository.ClienteRepository;
import service.ClienteService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Cliente cliente = new Cliente(25, "BrunoK", "04696900975", 1.47, 96.6, null, 1L);

        ClienteService service = new ClienteService();

        service.save(cliente);

        cliente.setNome(cliente.getNome() + " - alterado");

        service.update(cliente);

        ClienteRepository repository = new ClienteRepository();

        repository.findAll();

        repository.findById(10);

    }
}