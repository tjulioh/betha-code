import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("Funcionarios:");
        Funcionario funcionario = new Funcionario(1,"Thiago", "04696900975", 3951.6);

        FuncionarioService funcionarioService = new FuncionarioService();
        funcionarioService.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " Julio");
        funcionarioService.update(funcionario);

        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        funcionarioRepository.findAll();
        funcionarioRepository.findById(1);

        System.out.println("Diretores:");
        Diretor diretor = new Diretor(1,"Bruno", "07593302271", 9951.6,729.1);

        DiretorService diretorService = new DiretorService();
        diretorService.save(diretor);

        diretor.setNome(diretor.getNome() + " Kurzawe");
        diretorService.update(diretor);

        DiretorRepository diretorRepository = new DiretorRepository();
        diretorRepository.findAll();
        diretorRepository.findById(1);
    }
}