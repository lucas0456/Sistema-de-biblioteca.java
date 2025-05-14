package model;

public class ItemBiblioteca {
    protected String titulo;
    protected String codigo;

    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public void avaliar() {
        System.out.println("Item avaliado.");
    }
}
