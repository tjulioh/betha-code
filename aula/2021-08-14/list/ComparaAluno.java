package list;

import java.util.Comparator;

public class ComparaAluno implements Comparator<Aluno> {
    public int compare(Aluno a, Aluno b) {
        return a.getNome().compareTo(b.getNome());
    }
}
