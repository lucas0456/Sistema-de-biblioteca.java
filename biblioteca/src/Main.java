import model.*;

public class Main {
    public static void main(String[] args) {
        AlunoEnsinoMedio alunoEM = new AlunoEnsinoMedio("Lucas", "123", 2, "Manhã");
        AlunoEngenharia alunoEng = new AlunoEngenharia("João", "456", 4);
        AlunoDireito alunoDir = new AlunoDireito("Maria", "789", 6);
        AlunoGraduacao alunoGrad = new AlunoGraduacao("Pedro", "321", "Administração", 3);

        alunoEM.solicitarLivro("Matemática Básica");
        alunoEng.solicitarLivro("Mecânica dos Fluidos");
        alunoDir.solicitarLivro("Direito Constitucional");
        alunoGrad.solicitarLivro("Gestão de Projetos");

        Livro livro = new Livro("Java para Iniciantes", "L001");
        Revista revista = new Revista("Ciência Hoje", "R101");

        alunoEM.avaliarItem(livro);
        alunoEng.avaliarItem(revista);

        Aluno a1 = new Aluno("Carlos", "111");
        Aluno a2 = new Aluno("Carlos", "111");
        Aluno a3 = new Aluno("Ana", "222");

        System.out.println(a1.equals(a2)); // true
        System.out.println(a1.equals(a3)); // false

        System.out.println(a1.toString());
        System.out.println(livro.toString());
        System.out.println(revista.toString());
    }
}
