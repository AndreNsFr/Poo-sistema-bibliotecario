import classes.Biblioteca;
import classes.Livro;
import classes.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // se pode utilizar a mesma instancia de scanner para input, não sabia.
        System.out.println("Olá! Digite nome de livro");
        String nome_livro = scanner.nextLine();
        System.out.println("Agora o autor dele");
        String autor_livro = scanner.nextLine();
        System.out.println("Digite o ISBN:");
        String isbn_livro = scanner.nextLine();
        System.out.println("Por ultimo, a quantidade disponivel");
        int qtd_livro = scanner.nextInt();
        scanner.close();

        Livro livro_criado = biblioteca.adicionarLivro(
                nome_livro,
                autor_livro,
                isbn_livro,
                qtd_livro
        );

        livro_criado.exibirInformacoes();




    }
}
