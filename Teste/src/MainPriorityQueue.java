import java.util.PriorityQueue;
import java.util.Queue;

public class MainPriorityQueue {
    public static void main(String[] args){
        /* Deque é uma interface de fila
         * A implementação ArrayDeque possibilita inserção e aquisição dos dados tanto do lado direito
         * quanto do lado esquerdo dessa fila  */
        Queue<Aluno> listaQueue = new PriorityQueue<>();
        Aluno a = new Aluno("Gab", "Backend", 9d);
        Aluno b = new Aluno("Joseph", "Enginer", 8d);
        Aluno c = new Aluno("Charles", "Jornalismo", 10d);

        /* A ordenação dos dados é acontece naturalmente  */
        listaQueue.add(a);
        listaQueue.add(b);
        listaQueue.add(c);
        System.out.println(listaQueue);

        System.out.println("Impressão de Fila PriorityQueue");
        for(Aluno iterar : listaQueue){
            System.out.println(iterar);
        }

        Queue<String> listaQueue2 = new PriorityQueue();
        listaQueue2.add("Xavier");
        listaQueue2.add("Lohan");
        listaQueue2.add("Abner");
        while (listaQueue2.size() != 0){
            System.out.println(listaQueue2.remove());
        }
        /* A impressão com o "remove' funciona assim:
        * Ele imprime um dado e, em seguida, remove esse mesmo dado
        * Por isso a condição do "while" é ser diferenter de zero
        * Porque a fila ficará zerada por causa do "remove" e o laço se encerrará
        * Porque será igual a zero  */

        System.out.println("A fila contém " + listaQueue2.size() + " dados.");


    }


}
