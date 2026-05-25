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
            System.out.println("1 - criar usuário");
            System.out.println("2 - criar livro");
            System.out.println("3 - exibir lista de livros cadastrados");
            System.out.println("4 - exibir lista de usuários");
            System.out.println("5 - pesquisar livro pelo nome");
            System.out.println("6 - pesquisar usuário pelo nome");
            System.out.println("7 - Cadastrar emprestimo");
            System.out.println("8 - Cadastrar devolução");
            System.out.println("9 - sair");

            int escolha = scanner.nextInt();

            if(escolha == 1){
                Usuario newUsr = biblioteca.cadastrarUsuario();
                newUsr.informacoesUsuario();
            }else if(escolha == 2){
                Livro newLivro = biblioteca.adicionarLivro();
                newLivro.exibirInformacoes();
            }else if(escolha == 3){
                biblioteca.mostrarLivro();
            }else if(escolha == 4){
                biblioteca.mostrarUsuarios();
            }else if(escolha == 5){
                Livro livro = biblioteca.buscarLivro();
                livro.exibirInformacoes();
            }else if(escolha == 6){
                Usuario usuario = biblioteca.buscarUsuario();
                usuario.informacoesUsuario();
            }else if(escolha == 7){
                Usuario usuario = biblioteca.buscarUsuario();
                Livro livro = biblioteca.buscarLivro();
                biblioteca.realizarEmprestimo(usuario,livro);

            }else if(escolha == 8){
                Usuario usuario = biblioteca.buscarUsuario();
                Livro livro = biblioteca.buscarLivro();
                biblioteca.realizarDevolucao(usuario,livro);
            }else if(escolha == 9){
                break;
            }
        }

        scanner.close();
        System.out.println("Obrigado por usuar o programa!");
    }
}
