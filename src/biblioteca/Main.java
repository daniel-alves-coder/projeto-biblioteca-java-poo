package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String titulo;
        String autor;
        String editora;
        Genero generoLivro = null;
        int numeroRevista;
        int tipoMaterial;

        do {
            System.out.println("--------------------------");
            System.out.println("      MENU PRINCIPAL");
            System.out.println("--------------------------");
            System.out.println("1 - ADICIONAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - PESQUISAR");
            System.out.println("4 - REMOVER");
            System.out.println("5 - SAIR");
            System.out.println("--------------------------");
            System.out.print("DIGITE A OPÇÃO: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("--------------------------");

            switch (opcao) {
                case 1: //ADICIONAR
                    do {
                        System.out.print("DIGITE O TITULO: ");
                        titulo = scanner.nextLine();
                        System.out.print("DIGITE O NOME DO AUTOR: ");
                        autor = scanner.nextLine();
                        System.out.print("DIGITE O NOME DA EDITORA: ");
                        editora = scanner.nextLine();
                        System.out.println("--------------------------");

                        if (titulo.isEmpty() || autor.isEmpty() || editora.isEmpty()){
                            System.out.println("Você esqueceu de preencher todos os campos! \nPor favor tente de novo.");
                            System.out.println("--------------------------");
                        }
                    } while (titulo.isEmpty() || autor.isEmpty() || editora.isEmpty());

                    tipoMaterial = biblioteca.pegarTipoMaterial(scanner);

                    switch (tipoMaterial) {
                        case 1:
                            System.out.println("ESCOLHA O GENERO DO LIVRO");
                            System.out.println("1 - ROMANCE");
                            System.out.println("2 - FANTASIA");
                            System.out.println("3 - TERROR");
                            System.out.println("4 - MISTERIO");
                            System.out.print("DIGITE O CODIGO DO GENERO: ");
                            int genero = scanner.nextInt();
                            System.out.println("--------------------------");

                            generoLivro = switch (genero) {
                                case 1 -> Genero.ROMANCE;
                                case 2 -> Genero.FANTASIA;
                                case 3 -> Genero.TERROR;
                                case 4 -> Genero.MISTERIO;
                                default -> generoLivro;
                            };

                            biblioteca.adicionarLivro(titulo, autor, editora, generoLivro);
                            break;
                        case 2:
                            System.out.print("DIGITE O NUMERO DA REVISTA: ");
                            int numero = scanner.nextInt();
                            System.out.println("--------------------------");

                            biblioteca.adicionarRevista(titulo,autor,editora,numero);
                            break;
                    }
                    break;
                case 2: //LISTAR
                    tipoMaterial = biblioteca.pegarTipoMaterial(scanner);

                    switch (tipoMaterial) {
                        case 1:
                            biblioteca.listarLivros();
                            break;
                        case 2:
                            biblioteca.listarRevistas();
                            break;
                    }
                    break;
                case 3: //PESQUISAR

                    do {
                        System.out.print("DIGITE O TITULO: ");
                        titulo = scanner.nextLine();
                        System.out.println("--------------------------");

                        if (titulo.isEmpty()){
                            System.out.println("Você esqueceu de preencher todos os campos! \npor favor tente de novo.");
                            System.out.println("--------------------------");
                        }
                    } while (titulo.isEmpty());

                    tipoMaterial = biblioteca.pegarTipoMaterial(scanner);

                    switch (tipoMaterial) {
                        case 1:
                            System.out.println("--------------------------");
                            biblioteca.pesquisarLivro(titulo);
                            System.out.println("--------------------------");
                            break;
                        case 2:
                            System.out.println("--------------------------");
                            biblioteca.pesquisarRevista(titulo);
                            System.out.println("--------------------------");
                            break;
                    }
                    break;
                case 4: //REMOVER
                    do {
                        System.out.print("DIGITE O TITULO: ");
                        titulo = scanner.nextLine();
                        System.out.print("DIGITE O NOME DO AUTOR: ");
                        autor = scanner.nextLine();
                        System.out.println("--------------------------");

                        if (titulo.isEmpty() || autor.isEmpty()){
                            System.out.println("Você esqueceu de preencher todos os campos! \npor favor tente de novo.");
                            System.out.println("--------------------------");
                        }
                    } while (titulo.isEmpty() || autor.isEmpty());

                    tipoMaterial = biblioteca.pegarTipoMaterial(scanner);

                    switch (tipoMaterial) {
                        case 1:
                            System.out.println("--------------------------");
                            biblioteca.removerLivro(titulo,autor);
                            System.out.println("--------------------------");
                            break;
                        case 2:
                            System.out.println("--------------------------");
                            biblioteca.removerRevista(titulo,autor);
                            System.out.println("--------------------------");
                            break;
                    }
                    break;
                case 5: //SAIR
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!!");
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }
}