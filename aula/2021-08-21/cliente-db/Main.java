import model.Cliente;
import repository.ClienteRepository;
import service.ClienteService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Cliente cliente = new Cliente(10,"BrunoK","04696900975",1.47,96.6, null, 1L);

        ClienteService.save(cliente);

        cliente.setNome(cliente.getNome()+" - alterado");

        ClienteService.update(cliente);

        ClienteRepository.findAll();

        ClienteRepository.findById(10);

    }
}
