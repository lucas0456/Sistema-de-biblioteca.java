package model;

public class Aluno {
    protected String nome;
    protected String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void solicitarLivro(String titulo) {
        System.out.println("Aluno solicitou o livro: " + titulo);
    }

    public void avaliarItem(ItemBiblioteca item) {
        item.avaliar();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return matricula.equals(aluno.matricula);
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula;
    }
}
