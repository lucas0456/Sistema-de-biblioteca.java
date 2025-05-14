package model;

public class AlunoGraduacao extends Aluno {
    protected String curso;
    protected int semestre;

    public AlunoGraduacao(String nome, String matricula, String curso, int semestre) {
        super(nome, matricula);
        this.curso = curso;
        this.semestre = semestre;
    }

    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno de Graduação solicitou o livro: " + titulo);
    }
}
