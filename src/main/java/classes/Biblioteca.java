package classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Biblioteca {

    // verificar se o hashset é a estrutura de dados correta para a classe!
    private HashSet<Usuario> usuarios;
    private HashSet<Livro> livros;

    public Biblioteca (){
        this.livros = new HashSet<>();
        this.usuarios = new HashSet<>();
    }

    public Livro adicionarLivro(){

        //////////////////Insersão de dados pelo operador/////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Digite nome de livro");
        String nome_livro = scanner.nextLine();

        System.out.println("Agora o autor dele");
        String autor_livro = scanner.nextLine();

        System.out.println("Digite o ISBN:");
        String isbn_livro = scanner.nextLine();

        System.out.println("Por ultimo, a quantidade disponivel");
        int qtd_livro = scanner.nextInt();


        ////////////////////////////////////////////////////////////////


        Livro livro = new Livro( nome_livro, autor_livro, isbn_livro, qtd_livro);
        this.livros.add(livro);
        return  livro;

    }

    public Usuario cadastrarUsuario(){

        ////////////////////////insersão de dados pelo usuario////////////////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Digite nome do usuário");
        String nome_usuario = scanner.nextLine();


        //////////////////////////////////////////////////////////////////////////////

        Usuario usuario = new Usuario(nome_usuario);
        this.usuarios.add(usuario);
        return usuario;
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public void realizarEmprestimo(Usuario usr, Livro livro){
        usr.pegarLivro(livro);
    }

    public void realizarDevolucao(Usuario usr, Livro livro){
        usr.devolverLivro(livro);
    }

    public void mostrarLivro(){
        for (Livro livro : livros){
            livro.exibirInformacoes();
        }
    }

    public void mostrarUsuarios(){
        for (Usuario usuario : usuarios){
            usuario.informacoesUsuario();
        }
    }

    public Livro buscarLivro(){

        /////////////////////insesao dados usuarios////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome para buscar:");
        String nome = scanner.nextLine();


        ///////////////////////////////////////////////////////


        if(!nome.isEmpty()){
            for(Livro livro : livros){
                if(livro.getTitulo().contains(nome)){
                    return  livro;
                }
            }
        }

        return null;
    }

    public Usuario buscarUsuario(){

        /////////////////////insesao dados usuarios////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome para buscar:");
        String nome = scanner.nextLine();


        ///////////////////////////////////////////////////////

        if(!nome.isEmpty()){
            for(Usuario usuario : usuarios){
                if(usuario.getNome().contains(nome)){
                    return usuario;
                }
            }
        }

        return null;
    }

}
