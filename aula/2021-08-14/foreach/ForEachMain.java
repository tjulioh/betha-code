package foreach;

import list.Aluno;

import java.util.ArrayList;
import java.util.List;

public class ForEachMain {

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);

        for (Aluno aluno: lista){
            System.out.println("Aluno: "+ aluno);
        }
    }
}
