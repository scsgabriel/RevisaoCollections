package set;

import classeObjeto.Aluno;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args){
        //HashSet não permite dados repetidos
        //é mais rápido pra inserções de dados
        //não há ordenação natural de dados, nem garantia de que um dado que começou
        //em um índice vai continuar lá

        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(4);
        inteiros.add(3);
        inteiros.add(1);
        inteiros.add(1);
        inteiros.add(1);
        //repeti o 1 três vezes, mas ele só vai imprimir um, por não permitir repetição de dados
        System.out.println(inteiros);

        System.out.println("--------------------------- Exemplo com Objeto ---------------------------");
        Set<Aluno> alunos = new HashSet<>();
        Aluno a = new Aluno("Kratos", "Arte da Guerra", 10d);
        Aluno b = new Aluno("Mario", "Curso de Encanamento", 5d);
        Aluno c = new Aluno("Kratos", "Arte da Guerra", 10d);
        Aluno d = new Aluno("Mario", "Curso de Encanamento", 5d);
        Aluno e = new Aluno("Sonic", "Curso de Atletismo", 8d);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);
        for (Aluno iterar : alunos){
            System.out.println(iterar);
        }

        /*  consultas e exclusões são feitos com os objetos   */
        System.out.println("Consulta do HashSet");
        System.out.println(alunos.contains(a));
        System.out.println(alunos.contains(e)); //aqui vai dar false porque não adicionei o "e" na lista com o "add"

        System.out.println("Exclusão em HashSet");
        System.out.println(alunos.remove(a));
        System.out.println(alunos.contains(a));
        for (Aluno iterar : alunos){
            System.out.println(iterar.getNome());
        }



    }
}
