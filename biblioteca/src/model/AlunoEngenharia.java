package model;

public class AlunoEngenharia extends AlunoGraduacao {
    public AlunoEngenharia(String nome, String matricula, int semestre) {
        super(nome, matricula, "Engenharia", semestre);
    }

    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno de Engenharia solicitou o livro: " + titulo + ". Tem prioridade em materiais técnicos.");
    }
}
