package classeObjeto;

import java.util.Comparator;

public class ComparadorNotas implements Comparator<Aluno> {

    /* O Comparator pega 2 parâmetros de comparação dentro do método "compare"..
    *  E retorna um tipo Wrapper fazendo comparação entre os elementos do tipo desse Wrapper
    * Que no caso são 2 números do tipo Double
    * --> o1 e o2 é o mesmo que "objeto 1 e objeto 2
    * E se eu quiser fazer a ordenação de forma decrescente, basta inverter os objetos no return */
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
