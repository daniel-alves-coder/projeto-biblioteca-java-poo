package biblioteca;

import javax.swing.plaf.PanelUI;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Biblioteca {
    HashSet<Livro> listaLivros = new HashSet<Livro>();
    HashSet<Revista> listaRevistas = new HashSet<Revista>();

    public void adicionarLivro(String titulo, String autor, String editora, Genero genero) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)) {
                System.out.println("livro ja existe");
                return;
            }
        }
        Livro addLivro = new Livro(titulo, autor, editora, genero);
        listaLivros.add(addLivro);
        System.out.println("livro adicionado com sucesso");

    }

    public void adicionarRevista(String titulo, String autor, String editora, int numero) {
        for (Revista revista : listaRevistas) {
            if (revista.getTitulo().equals(titulo) && revista.getAutor().equals(autor)) {
                System.out.println("Revista ja existe");
                return;
            }
        }
        Revista addRevista = new Revista(titulo, autor, editora, numero);
        listaRevistas.add(addRevista);
        System.out.println("Revista adicionada com sucesso");

    }

    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("A biblioteca não possui nenhum Livro ainda");
        } else {
            System.out.println("TITULOS PRESENTES NA BIBLIOTECA:");
            for (Livro livro : listaLivros) {
                System.out.println(livro);
            }
        }
    }

    public void listarRevistas() {
        if (listaRevistas.isEmpty()) {
            System.out.println("A biblioteca não possui nenhuma revista ainda");
        } else {
            System.out.println("TITULOS PRESENTES NA BIBLIOTECA:");
            for (Revista revista : listaRevistas) {
                System.out.println(revista);
            }
        }
    }


    public void pesquisarLivro(String titulo) {
        boolean encontrado = false;
        for (Material livro : listaLivros) {
            if (livro.getTitulo().equals(titulo)) {
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

    public void pesquisarRevista(String titulo) {
        boolean encontrado = false;
        for (Revista revista : listaRevistas) {
            if (revista.getTitulo().equals(titulo)) {
                System.out.println(revista);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Revista encontrada!");
        } else {
            System.out.println("Revista não encontrada!");
        }
    }

    public void removerLivro(String titulo, String autor) {
        boolean livroRemovido = false;
        for (Livro livro : listaLivros) {
            livroRemovido = listaLivros.removeIf(Livro -> livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor));
        }

        if (livroRemovido) {
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Operação falhou: livro não encontrado.");
        }
    }

    public void removerRevista(String titulo, String autor) {
        boolean revistaRemovida = false;
        for (Revista revista : listaRevistas) {
            revistaRemovida = listaRevistas.removeIf(Revistas -> revista.getTitulo().equals(titulo) && revista.getAutor().equals(autor));
        }

        if (revistaRemovida) {
            System.out.println("Revista removida com sucesso!");
        } else {
            System.out.println("Operação falhou: revista não encontrada.");
        }
    }

    public int pegarTipoMaterial(Scanner scanner) {
        int tipoMaterial;
        do {
            System.out.println("ESCOLHA O TIPO DE MATERIAL A SER ADICIONADO");
            System.out.println("1 - LIVRO");
            System.out.println("2 - REVISTA");
            System.out.print("DIGITE A OPÇÃO: ");
            tipoMaterial = scanner.nextInt();
            scanner.nextLine();
            System.out.println("--------------------------");
        } while (tipoMaterial != 1 && tipoMaterial != 2);

        return tipoMaterial;
    }
}
