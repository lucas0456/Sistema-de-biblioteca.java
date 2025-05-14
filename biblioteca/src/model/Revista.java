package model;

public class Revista extends ItemBiblioteca {
    public Revista(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void avaliar() {
        System.out.println("Revista "" + titulo + "" recebeu sua avaliação. Obrigado!");
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + " (Código: " + codigo + ")";
    }
}
