package stream;

import list.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 7);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 8);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 9);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 7);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        List<String> nomes = lista.stream().map(p -> p.getNome()).collect(Collectors.toList());
        System.out.println(nomes);

        List<Aluno> ant = lista.stream().filter(p -> p.getNome().startsWith("Ant")).collect(Collectors.toList());
        System.out.println(ant);

        List<Aluno> ant2 = lista.stream().filter(p -> p.getCurso().equals("Internet")).collect(Collectors.toList());
        System.out.println(ant2);

        lista.stream().forEach(p -> System.out.println(p));

        lista.stream().forEach(p ->{
            System.out.println(p.getNome());
            System.out.println(p.getCurso());
        });


    }
}
