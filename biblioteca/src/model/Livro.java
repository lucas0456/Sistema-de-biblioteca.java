package model;

public class Livro extends ItemBiblioteca {
    public Livro(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void avaliar() {
        System.out.println("Livro "" + titulo + "" avaliado com sucesso. Obrigado pela contribuição!");
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " (Código: " + codigo + ")";
    }
}
