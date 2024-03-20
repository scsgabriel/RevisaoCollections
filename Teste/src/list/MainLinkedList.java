package list;

import classeObjeto.Aluno;
import classeObjeto.ComparadorNotas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args){
        exemploLinkedList();
    }

    private static void exemploLinkedList() {
        List<Aluno> listaAlunos = new LinkedList<>();
        Aluno a = new Aluno("Josh", "Cloud Computing", 10d);
        Aluno b = new Aluno("Drake", "Desenvolvimento de Software", 8d);
        Aluno c = new Aluno("Jeff", "Big Data", 6d);

        listaAlunos.add(a);
        listaAlunos.add(b);
        listaAlunos.add(c);

        System.out.println("Ordenação por Nome:");
        System.out.println(listaAlunos);

        System.out.println("Ordenação por Nota:");
        ComparadorNotas comparadorNotas = new ComparadorNotas();
        Collections.sort(listaAlunos, comparadorNotas);
        System.out.println(listaAlunos);

        System.out.println("Impressão dos Dados por ForEach, ordenados por Nota:");
        for (Aluno imprimir : listaAlunos){
            System.out.println(imprimir);
        }

        System.out.println("Impressão após remoção do aluno a:");
        listaAlunos.remove(a);
        for(Aluno remocao : listaAlunos){
            System.out.println(remocao);
        }

        System.out.println("Impressão pra verificar se existe um dado específico no programa:");
        boolean contem = listaAlunos.contains(a);
        System.out.println(contem);
        boolean contem2 = listaAlunos.contains(b);
        System.out.println(contem2);

    }
}
