package array;

public class MainArrayBidimensional {
    public static void main(String[] args){

        /* O array bidimensional é criado com uma chave principal
        * e dentro dela temos linhas e colunas.
        * Linhas = dentro de chaves e separados por vírgulas;
        * Colunas; os valores dentro dessas chaves
        * e as colunas também são separadas por vírgula.
        * No exemplo abaixo temos 3 linhas e 3 colunas, com valores variados */
        int[][] array1 = {{150, 80, 97}, {5, 9, 50}, {100, 200, 300}};
        int[][] array2 = {{1, 5, 5}, {8, 9, 2}, {5, 6, 8}};

        /*  Pra percorrer o array bidimensional é necessário usar um for duplo
        * Primeiro for: percorre a linha;
        * Segundo for: percorre a coluna  */
        System.out.println("Percorrendo o Array 1 | Sem método:");
        for(int linha = 0; linha < array1.length; linha++){
            for (int coluna = 0; coluna < array1.length; coluna++){
                System.out.printf("%d ", array1[linha][coluna]);
            }
            System.out.println();
        }

        outputArray(array2);
    }
    private static void outputArray(int[][] array2) {
        /*  Percorrendo o array por meio da criação de um método..
        * passando o array2 como parâmetro  */
        System.out.println("Percorrendo o Array 2 | Método output:");
        for(int linha = 0; linha < array2.length; linha++){
            for (int coluna = 0; coluna < array2.length; coluna++){
                System.out.printf("%d ", array2[linha][coluna]);
            }
            System.out.println("");
        }
    }


}
