package classeObjeto;

import java.util.Objects;

public class Aluno implements Comparable <Aluno> {
    //Atributos da classe
    private String nome;
    private String curso;
    private Double nota;
    private  String sala;

    //Construtor - Aluno
    public Aluno(String nome, String curso, Double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    //Construtor
    public Aluno(String nome, String curso, Double nota, String sala) {
        this(nome, curso, nota);  //essa é a forma de utilizar o construtor acima pra não criar outro igual só pra acrescentar a "sala"
        this.sala = sala;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    //ToString
    @Override
    public String toString() {
        return "classeObjeto.Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota + '\'' + sala +
                '}';
    }

    //compareTo

    /*  O compareTo compara o nome do atributo da classe classeObjeto.Aluno com o nome que
     * tá vindo dentro do parâmemtro lá do objeto criado I(getNome)
     * O compareTo vem com o parâmetro errado e o return errado.. é necesário alterar o parâmetro
     * com os objetos, e o return comparando objeto 1 com o objeto 2 */

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    //Equals e hashCode --> comparam objetos na interface Set
    //não é necessário alterar nada depois que o IntellijIDEA gera automaticamente o euals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso) && Objects.equals(nota, aluno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso, nota);
    }
}

