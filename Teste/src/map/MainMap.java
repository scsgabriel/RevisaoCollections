package map;

import java.util.*;

public class MainMap {
    /*  Pra ordenação com objetos é necessário implementação do equals e hashCode  */
    public static void main(String[] args){
        exemploMap();
        iterandoComEntrySet();
    }

    private static void iterandoComEntrySet() {
        //Impressão com o entreySet --> pega os 2, key e values e adiciona em um variável
        //entrySet é uma forma de pegar chave e valor separadamente
        Map<Integer, String> lista = new HashMap<>();
        lista.put(3, "Matemática Financeira");
        lista.put(1, "Direito Administrativo");
        lista.put(2, "Legislação");
        System.out.println("\nValores com entrySet: ");

        Set<Map.Entry<Integer, String>> listaEntry = lista.entrySet(); //entrySet é como se fosse uma implementação, mas não é, ele é um método.
        for (Map.Entry<Integer, String> iterar : listaEntry ){
            System.out.println(iterar.getKey()); //geyKey é propriedade do entrySet
            System.out.println(iterar.getValue()); //getValue é propriedade do entrySet
        }
    }

    private static void exemploMap() {
        Map<Integer, String> lista = new HashMap<>(); //a ordenação dos dados pode acontecer, mas não é garantida
        lista.put(3, "Gabriel");
        lista.put(1, "Jenny");
        lista.put(2, "Felícia");
        System.out.println(lista); //impressão de todos os dados
        System.out.println(lista.keySet()); //impressão apenas das chaves --> "keySet"
        System.out.println(lista.values()); //impressão apenas dos valores --> "values"

        System.out.println("Impressão pela Iteração FOR:");
        System.out.println("Chaves:");
        for(int keys : lista.keySet()) {
            System.out.println(keys);
            }
        System.out.println("\nValores:");
        for (String values : lista.values()) {
            System.out.println(values
            );
        }


    }
}
