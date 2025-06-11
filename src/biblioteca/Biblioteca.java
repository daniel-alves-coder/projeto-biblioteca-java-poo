package biblioteca;

import javax.swing.plaf.PanelUI;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Biblioteca {
    HashSet<Material> lista = new HashSet<Material>();

    public void adicionarLivro(String titulo, String autor, String editora, Genero genero) {
        for (Material livro : lista) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)) {
                System.out.println("livro ja existe");
                return;
            }
        }
        Livro addLivro = new Livro(titulo, autor, editora, genero);
        lista.add(addLivro);
        System.out.println("livro adicionado com sucesso");

    }

    public void adicionarRevista(String titulo, String autor, String editora, int numero) {
        for (Material revista : lista) {
            if (revista.getTitulo().equals(titulo) && revista.getAutor().equals(autor)) {
                System.out.println("Revista ja existe");
                return;
            }
        }
        Revista addRevista = new Revista(titulo, autor, editora, numero);
        lista.add(addRevista);
        System.out.println("Revista adicionada com sucesso");

    }

    public void listarLivros() {
        if (lista.isEmpty()) {
            System.out.println("A biblioteca não possui nenhum titulo ainda");
        } else {
            System.out.println("TITULOS PRESENTES NA BIBLIOTECA:");
            for (Material livro : lista) {
                System.out.println(livro);
            }
        }
    }

    public void pesquisarMaterial (String titulo, String autor){
        boolean encontrado = false;
        for (Material livro : lista) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)) {
                System.out.println(livro);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Livro encontrado!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public void remover (String titulo, String autor){
        boolean removido = false;
        for (Material livro : lista) {
            removido = lista.removeIf(Material -> livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor));
        }

        if (removido) {
            System.out.println("Removido com sucesso!");
        } else {
            System.out.println("Não encontrado!");
        }
    }
}
