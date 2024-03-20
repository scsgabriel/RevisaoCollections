package set;

import classeObjeto.Aluno;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args){
        exemploTreeSet();
    }

    private static void exemploTreeSet() {
        Set<Aluno> listaAlunos = new TreeSet<>();
        Aluno a = new Aluno("Limeira", "Linux", 9d);
        Aluno b = new Aluno("Pônei", "Data Base", 10d);
        Aluno c = new Aluno("Amanda", "Rust Development", 7d);

        listaAlunos.add(a);
        listaAlunos.add(b);
        listaAlunos.add(c);

        //TreeSet faz a ordenação natural dos dados em lista
        for (Aluno iterar : listaAlunos){
            System.out.println(iterar);
        }
    }
}
