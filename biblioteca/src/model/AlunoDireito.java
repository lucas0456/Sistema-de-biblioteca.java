package model;

public class AlunoDireito extends AlunoGraduacao {
    public AlunoDireito(String nome, String matricula, int semestre) {
        super(nome, matricula, "Direito", semestre);
    }

    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno de Direito solicitou o livro: " + titulo + ". Tem prioridade em obras jurídicas.");
    }
}
