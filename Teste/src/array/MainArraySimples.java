package array;
public class MainArraySimples {
    public static void main(String[] args){

        /* Essa é uma das formas de declarar um array
         * o tipo --> o nome --> instanciação --> e a quantiodade dos espaços que o array terá   */
        int[] exemploSintaxe = new int[12];

        /*  Outra forma de declarar, pensando em trabalahr com classes e objetos, é:  */
        int[] exemplo2;
        exemplo2 = new int[8]; //quando se trabalha com construtores

        /*  Outra forma de declarar é já inicializando com os valores definidos entre chaves  */
        int[] exemplo3 = {102, 48, 27, 38, 9, 580};
        int total = 0;
        for (int iterar : exemplo3){
            System.out.println(iterar);
            total += iterar;
        }
        System.out.println("Total da soma no exemplo3: " + total);

        //o tipo e a quantidade de memória do array não pode ser alterado

        //Outra forma é declarar de forma dinâmica
        int[] exemplo4;
        exemplo4 = new int[5];
        exemplo4[0] = 5; //índice 0 = valor 5
        exemplo4[1] = 3;
        exemplo4[2] = 4;
        exemplo4[3] = 1;
        exemplo4[4] = 2;
        for(int iterar : exemplo4){
            System.out.println(iterar);
        }

        /* É dinâmico porque esse valores podem ser alocados no array vindos de
        * bancos de dados, integração com outros sistemas, etc.  */

        //Tamanho do array
        System.out.println("Esse array tem tamanho " + exemploSintaxe.length);
        System.out.println("Esse array tem tamanho " + exemplo2.length);
        System.out.println("Esse array tem tamanho " + exemplo3.length);
        System.out.println("Esse array tem tamanho " + exemplo4.length);

        if (exemplo4.length > exemplo3.length){
            System.out.println("O array é maior");
        } else System.out.println("O array é menor");



    }
}