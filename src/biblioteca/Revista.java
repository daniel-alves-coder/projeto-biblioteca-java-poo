package biblioteca;

public class Revista extends Material{
    private int numero;

    public Revista(String titulo, String autor, String editora, int numero) {
        super(titulo, autor, editora);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Revista - TITULO: " + getTitulo() + " ,AUTOR: " + getAutor() + ", EDITORA: " + getEditora() + ", NUMERO: " + numero;
    }
}