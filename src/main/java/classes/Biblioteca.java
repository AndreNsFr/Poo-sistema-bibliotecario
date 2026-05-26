package classes;

import exceptions.ValorNaoEncontrado;

import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {

    // verificar se o hashset é a estrutura de dados correta para a classe!
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public Biblioteca (){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
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

        if(nome_livro.isEmpty() || autor_livro.isEmpty() || isbn_livro.isEmpty() || qtd_livro == 0){
            throw new NullPointerException("Falta informações, tente novamente");
        }

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
        if(nome_usuario.isEmpty()){
            throw new NullPointerException("Nome em branco.");
        }

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

        System.out.println("Digite o nome do livro para buscar:");
        String nome = scanner.nextLine();


        ///////////////////////////////////////////////////////


        if(!nome.isEmpty()){
            for(Livro livro : livros){
                if(livro.getTitulo().contains(nome)){
                    return  livro;
                }
            }
        }

        throw new ValorNaoEncontrado("Não existe este livro");
    }

    public Usuario buscarUsuario(){

        /////////////////////insesao dados usuarios////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário para buscar:");
        String nome = scanner.nextLine();


        ///////////////////////////////////////////////////////

        if(!nome.isEmpty()){
            for(Usuario usuario : usuarios){
                if(usuario.getNome().contains(nome)){
                    return usuario;
                }
            }
        }

        throw new ValorNaoEncontrado("Não existe este usuário");
    }

}
