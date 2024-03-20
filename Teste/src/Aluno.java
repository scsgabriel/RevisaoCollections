public class Aluno implements Comparable <Aluno> {
    //Atributos da classe
    private String nome;
    private String curso;
    private Double nota;

    //Construtores
    public Aluno(String nome, String curso, Double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
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

    //ToString
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }

    //compareTo

    /*  O compareTo compara o nome do atributo da classe Aluno com o nome que
     * tá vindo dentro do parâmemtro lá do objeto criado I(getNome)  */
    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }




}

