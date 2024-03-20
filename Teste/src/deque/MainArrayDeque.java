package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainArrayDeque {
    public static void main(String[] args){
        Deque<String> listaDeque = new ArrayDeque<>();
        listaDeque.add("Jumento");
        listaDeque.add("Abelha");
        listaDeque.add("Elefante");
        listaDeque.add("Zebra");
        listaDeque.add("Macaco");
        listaDeque.add("Cabra");

        System.out.println(listaDeque);

        /*  adicionado uma fila dentro de outra (fusão de filas) */
        Deque<String> lista2 = new ArrayDeque<>();
        lista2.add("Abutre");
        lista2.add("Preá");
        lista2.addAll(listaDeque);
        System.out.println(lista2);

        System.out.println("Elementos de consulta do primeiro e último elemento da fila");
        //element(príximo da fila), getFirst, peek(primeiro da fila) e peekFirts pegam o primeiro elemento da fila
        //getLast e peekLast pegam o último elemento;

        /*  o element é mais usado no Queue, já que no Queue não existe get
        * Porque os elementos só saem por uma entrada.. o primeiro a entrar é o primeiro a sair  */

        System.out.println(lista2.element()); //não retorna nada, o programa da erro
        System.out.println(lista2.peekFirst()); //retorna null quando não há elementos na fila
        System.out.println(lista2.peek()); //retorna null quando não há elementos na fila
        System.out.println(lista2.peekLast()); //retorna null quando não há elementos na fila
        System.out.println(lista2.getFirst()); //não retorna nada, o programa da erro
        System.out.println(lista2.getLast()); //não retorna nada, o programa da erro

        /*  Remoção de elementos da fila
        * O primeiro elemento também pode ser removido apenas com "remove"  */
        String exemplo = lista2.removeFirst();
        System.out.println("Removido --> " + exemplo);
        String exemplo2 = lista2.removeLast();
        System.out.println("Removido --> " + exemplo2);
        System.out.println(lista2);

        /*  Pra remover qualquer item, ignorando a ordem da fila, basta:   */
        System.out.println("\nRemoção de qualquer elemento: ");
        lista2.remove("Jumento");
        System.out.println(lista2);






    }
}
