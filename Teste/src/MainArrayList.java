import java.util.*;

public class MainArrayList {
    public static void main(String[] args) {
        exemploArrayList();
        exemploLinkedList();
        exemploClasseAluno();
    }
    private static void exemploClasseAluno() {
        System.out.println("--------------------------");
        System.out.println("Classe Aluno");

        //primeiro eu instancio o objeto com as características da classe Aluno
        List<Aluno> aluno = new ArrayList<>();

        //depois crio um objeto representando um aluno, informo os atributos e adiciono a lista
        Aluno a = new Aluno("Xavier", "Backend", 9d);
        Aluno b = new Aluno("Jão", "Relações Públicas", 8d);
        Aluno c = new Aluno("Raymilson", "Administrativo", 10d);
        Aluno d = new Aluno("Limeira", "Concurseiro", 7d);

        /*Pra usar o collections com objetos é necesário implementar na classe
        * responsável pelo objeto o "Comparable" e seu método
        * dentro da classe.
        * Aqui, por exemplo, o Comparable foi implementado na classe Aluno
        * E seu método "CompareTo" também, dentro da classe Aluno*/

        aluno.add(a);
        aluno.add(b);
        aluno.add(c);
        aluno.add(d);
        /* pra usar o Collections.sort com objetos é necessário implementar
        * na classe do objeto o Comparable<> */
       Collections.sort(aluno);

        System.out.println("Ordenação por Nome/Alunos\n");
       for(int i = 0; i < aluno.size(); i++){
           System.out.println(aluno.get(i));
       }

       System.out.println("--------------------------------------------------------");
       System.out.println("Ordenação por Nota/Alunos\n");
       ComparadorNotas comparaNotas = new ComparadorNotas();
       Collections.sort(aluno, comparaNotas);
        for(int i = 0; i < aluno.size(); i++){
            System.out.println(aluno.get(i));
        }
    }

    private static void exemploLinkedList() {

        System.out.println("--------------------------");
        System.out.println("Linked List");

        List<Integer> numeros = new LinkedList<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploArrayList() {
        System.out.println("Array List -- Desordenada");

        List<String> nomes = new ArrayList<>();
        nomes.add("Joaquim");
        nomes.add("Camila");
        nomes.add("Abilio");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println("ArrayList -- Ordenada");
        System.out.println(nomes);

        nomes.remove(nomes.remove(0));
        System.out.println("ArrayList -- Removendo elemento da lista");
        System.out.println(nomes);


        /*  O boolean returna true ou false sobre se há ou não um certo elemento dentro da lista  */
        boolean verificar = nomes.contains("Joana");
        System.out.println(verificar);
        boolean verificar2 = nomes.contains("Joaquim");
        System.out.println(verificar2);

        //forma de consultar sem precisar criar um tipo booleano
        System.out.println(nomes.contains("Xico"));
    }
}