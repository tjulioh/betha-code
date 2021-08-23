import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("- Funcionarios");
        Funcionario funcionario = new Funcionario("Thiago", "04696900975", 3951.6);

        FuncionarioService funcionarioService = new FuncionarioService();
        funcionario = funcionarioService.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " Julio");
        funcionario = funcionarioService.update(funcionario);

        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        System.out.println("- Listar Todos:");
        for (Funcionario f : funcionarioRepository.findAll()) {
            System.out.println(f);
        }
        System.out.println("- Listar Especifico:");
        System.out.println(funcionarioRepository.findById(1L));

        System.out.println("\n- Diretores");
        Diretor diretor = new Diretor("Bruno", "07593302271", 9951.6,729.1);

        DiretorService diretorService = new DiretorService();
        diretor = diretorService.save(diretor);

        diretor.setNome(diretor.getNome() + " Kurzawe");
        diretor = diretorService.update(diretor);

        DiretorRepository diretorRepository = new DiretorRepository();
        System.out.println("- Listar Todos:");
        for (Diretor d : diretorRepository.findAll()) {
            System.out.println(d);
        }
        System.out.println("- Listar Especifico:");
        System.out.println(diretorRepository.findById(1L));
    }
}