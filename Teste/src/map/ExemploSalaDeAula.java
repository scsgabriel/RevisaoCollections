package map;
import classeObjeto.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaDeAula {
    public static void main(String[] args){
        Map<Integer, List<Aluno>> listaDeSalas = new HashMap<>();
        List<Aluno> alunoSala1 = criarTurma("Sala", 3 ); //sala e quantidade é de informação obrigatóra por causa do método abaixo "criarTurma"
        listaDeSalas.put(1, alunoSala1);
        System.out.println("\nImpressão de Lista de Alunos com MAP: ");
        impressaoDasSalas(listaDeSalas.get(1));
    }

    private static void impressaoDasSalas(List<Aluno> listaDeSalas) {
        for (Aluno iterar : listaDeSalas){
            System.out.println("Aluno: " + iterar.getNome());
            System.out.println("Sala: " + iterar.getSala());
            System.out.println("Curso: " + iterar.getCurso());
        }
    }

    private static List<Aluno> criarTurma(String sala, int quantidadeDeSalas) {
        List<Aluno> listaDeAlunos = new ArrayList<>();
        for (int i = 0; i < quantidadeDeSalas; i++){
            Aluno aluno = new Aluno("Nome do aluno: " + i, "Curso: " + i, (double) i, "Sala: " + i );
            listaDeAlunos.add(aluno);
        }
        return listaDeAlunos;
    }

}
