package biblioteca;

import java.util.Objects;

public class Material {
    private String titulo;
    private String autor;
    private String editora;

    public Material(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(titulo, material.titulo) && Objects.equals(autor, material.autor) && Objects.equals(editora, material.editora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, editora);
    }

    @Override
    public String toString() {
        return "Material{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }
}
