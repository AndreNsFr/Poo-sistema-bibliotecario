import classes.Biblioteca;
import classes.Livro;
import classes.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem vindo à biblioteca java!");

        while (true){

            System.out.println("/////////////////////////////////////////////////");
            System.out.println("Digite a sua opção:");
            System.out.println("1 - Criar usuário");
            System.out.println("2 - Criar livro");
            System.out.println("3 - Exibir lista de livros cadastrados");
            System.out.println("4 - Exibir lista de usuários");
            System.out.println("5 - Pesquisar livro pelo nome");
            System.out.println("6 - Pesquisar usuário pelo nome");
            System.out.println("7 - Cadastrar emprestimo");
            System.out.println("8 - Cadastrar devolução");
            System.out.println("9 - sair");
            System.out.println("/////////////////////////////////////////////////");

            String escolha = scanner.nextLine();


            if(escolha.equals("1")){
                try {
                    Usuario newUsr = biblioteca.cadastrarUsuario();
                    newUsr.informacoesUsuario();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }else if(escolha.equals("2")){
                try {
                    Livro newLivro = biblioteca.adicionarLivro();
                    newLivro.exibirInformacoes();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }else if(escolha.equals("3")){

                biblioteca.mostrarLivro();

            }else if(escolha.equals("4")){

                biblioteca.mostrarUsuarios();

            }else if(escolha.equals("5")){

                try {
                    Livro livro = biblioteca.buscarLivro();
                    livro.exibirInformacoes();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(escolha.equals("6")){

                try {
                    Usuario usuario = biblioteca.buscarUsuario();
                    usuario.informacoesUsuario();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(escolha.equals("7")){

                try {
                    Usuario usuario = biblioteca.buscarUsuario();
                    Livro livro = biblioteca.buscarLivro();
                    biblioteca.realizarEmprestimo(usuario,livro);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(escolha.equals("8")){

                try {
                    Usuario usuario = biblioteca.buscarUsuario();
                    Livro livro = biblioteca.buscarLivro();
                    biblioteca.realizarDevolucao(usuario,livro);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(escolha.equals("9")){

                break;

            }else{
                System.out.println("Escolha inválida, tente novamente!");
            }
        }

        scanner.close();
        System.out.println("Obrigado por usar o programa!");
    }
}
