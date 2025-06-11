package biblioteca;

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
                case 1:
                    System.out.print("DIGITE O TITULO DO LIVRO: ");
                    titulo = scanner.nextLine();
                    System.out.print("DIGITE O NOME DO AUTOR: ");
                    autor = scanner.nextLine();
                    System.out.print("DIGITE O NOME DA EDITORA: ");
                    editora = scanner.nextLine();
                    System.out.println("--------------------------");

                    int tipoAdicionado;
                    do {
                        System.out.println("DIGITE O TIPO A SER ADICIONADO");
                        System.out.println("1 - LIVRO");
                        System.out.println("2 - REVISTA");
                        System.out.print("DIGITE A OPÇÃO: ");
                        tipoAdicionado = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("--------------------------");
                    } while (tipoAdicionado != 1 && tipoAdicionado != 2);

                    switch (tipoAdicionado) {
                        case 1:
                            System.out.println("ESCOLHA O GENERO DO LIVRO");
                            System.out.println("1 - ROMANCE");
                            System.out.println("2 - FANTASIA");
                            System.out.println("3 - TERROR");
                            System.out.println("4 - MISTERIO");
                            System.out.println("5 - AVENTURA");
                            System.out.println("6 - SUSPENSE");
                            System.out.print("DIGITE O CODIGO DO GENERO: ");
                            int genero = scanner.nextInt();
                            System.out.println("--------------------------");

                            generoLivro = switch (genero) {
                                case 1 -> Genero.ROMANCE;
                                case 2 -> Genero.FANTASIA;
                                case 3 -> Genero.TERROR;
                                case 4 -> Genero.MISTERIO;
                                case 5 -> Genero.AVENTURA;
                                case 6 -> Genero.SUSPENSE;
                                default -> generoLivro;
                            };

                            biblioteca.adicionarLivro(titulo, autor, editora, generoLivro);
                            break;
                        case 2:
                            System.out.print("Digite o numero da Revista: ");
                            int numero = scanner.nextInt();
                            System.out.println("--------------------------");

                            biblioteca.adicionarRevista(titulo,autor,editora,numero);
                            break;
                    }
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("DIGITE O TITULO DO LIVRO: ");
                    titulo = scanner.nextLine();
                    System.out.print("DIGITE O NOME DO AUTOR: ");
                    autor = scanner.nextLine();
                    System.out.println("--------------------------");
                    biblioteca.pesquisarMaterial(titulo,autor);
                    System.out.println("--------------------------");
                    break;
                case 4:
                    System.out.print("DIGITE O TITULO DO LIVRO: ");
                    titulo = scanner.nextLine();
                    System.out.print("DIGITE O NOME DO AUTOR: ");
                    autor = scanner.nextLine();
                    System.out.println("--------------------------");
                    biblioteca.remover(titulo,autor);
                    System.out.println("--------------------------");
                    break;
                case 5:
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