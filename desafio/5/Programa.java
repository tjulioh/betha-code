import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) throws Throwable {
        Funcionario coordernador = FuncionarioBuilder.gerarFuncionario(EFuncionario.COORDENADOR, 5,"onurB ","101213",17000.0);
        Funcionario analista = FuncionarioBuilder.gerarFuncionario(EFuncionario.ANALISTA,1,"ogaihT", "10944",3500.0);

        Folha coordenadorFolha = new Folha(5,coordernador, new SimpleDateFormat("dd/MM/yyyy").parse("24/07/2021"), null, null);
        Folha analistaFolha = new Folha(1,analista, new SimpleDateFormat("dd/MM/yyyy").parse("24/07/2021"),null,null);

        List<Desconto> descontos = new ArrayList<>();
        descontos.add(new Desconto("Festa do Setor", 50.0));
        descontos.add(new Desconto("Unimed", 85.0));

        coordenadorFolha.calcular(descontos, 570.0);
        analistaFolha.calcular();

        System.out.println("Liquido Coordenador: " + coordenadorFolha.getSalarioLiquido());
        System.out.println("Liquido Analista: " + analistaFolha.getSalarioLiquido());
    }
}
