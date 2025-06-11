package biblioteca;

import java.util.Objects;

public class Livro extends Material{
    private Genero genero;

    public Livro(String titulo, String autor, String editora, Genero genero) {
        super(titulo, autor, editora);
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Livro - TITULO: " + getTitulo() + " ,AUTOR: " + getAutor() + ", EDITORA: " + getEditora() + ", GENERO: " + genero;
    }

    public Genero getGenero() {
        return genero;
    }
}
