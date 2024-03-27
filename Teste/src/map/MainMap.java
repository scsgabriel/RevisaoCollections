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
        //Set é uma interface genérica
        System.out.println("Iteração com forEach stream: "); //existem mais 3 formas usando stream de iterar com forEach (avançado)
        Set<Map.Entry<Integer, String>> listaEntry = lista.entrySet(); //entrySet é como se fosse uma implementação, mas não é, ele é um método.
        for (Map.Entry<Integer, String> iterar : listaEntry ){ //o tipo Map.Entry pede os parâmetros
            System.out.println(iterar.getKey()); //geyKey é propriedade do Map.Entry / entrySet
            System.out.println(iterar.getValue()); //getValue é propriedade do Map.Entry / entrySet
        }

        System.out.println("\nIteração com Iterator e While: ");
        Iterator<Map.Entry<Integer, String>> iterator = lista.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> variavel = iterator.next();
            System.out.println("Chave: " + variavel.getKey());
            System.out.println("Valor: " + variavel.getValue());
        }

        //forEach --> itera sobre elementos em coleções (listas, conjuntos, mapas, arrays)
        //pois forEach é um laço restrito ao uso dentro da interface Iterable e suas subordinadas
        //"elementoDaLista" representa a própria lista
        System.out.println("\nIterando com forEach: ");
        lista.entrySet().forEach( elementoDaLista ->{
            System.out.println(elementoDaLista.getKey());
            System.out.print(elementoDaLista.getValue());
        });
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
