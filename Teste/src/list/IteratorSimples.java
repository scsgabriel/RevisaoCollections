package list;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorSimples {

    //O iterator funciona com o laço "While"
    //Primeiro é implementado o iterator
    //Segundo é implementado o laço while chamando o iterator
    //hasNext --> "enquanto houver um item da próxima lista"
    //next --> próximo da lista
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        lista.add("Gabriel");
        lista.add("Joaum");
        lista.add("Yvissomm");
        lista.add("Nath");

        Iterator<String> iterar = lista.iterator();
        while (iterar.hasNext()){  //o laço funciona enquanto houver um próximo elemento na lista
            System.out.println(iterar.next()); //ele imprime o próximo elemento da lista
        }
    }
}
