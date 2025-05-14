package model;

public class AlunoEnsinoMedio extends Aluno {
    private int serie;
    private String turno;

    public AlunoEnsinoMedio(String nome, String matricula, int serie, String turno) {
        super(nome, matricula);
        this.serie = serie;
        this.turno = turno;
    }

    @Override
    public void solicitarLivro(String titulo) {
        System.out.println("Aluno do Ensino Médio solicitou o livro: " + titulo);
    }
}
