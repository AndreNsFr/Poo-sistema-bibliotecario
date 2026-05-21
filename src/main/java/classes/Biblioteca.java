package classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Biblioteca {

    // verificar se o hashset é a estrutura de dados correta para a classe!
    private HashSet<Usuario> usuarios;
    private HashSet<Livro> livros;

    public Biblioteca (){
        this.livros = new HashSet<>();
        this.usuarios = new HashSet<>();
    }

    public Livro adicionarLivro( String newTitulo, String newAutor, String newIsnb, int newQuantidadeDisponivel){
        Livro livro = new Livro( newTitulo, newAutor, newIsnb, newQuantidadeDisponivel);
        this.livros.add(livro);
        return  livro;
    }

    public Usuario cadastrarUsuario(String newNome){
        Usuario usuario = new Usuario(newNome);
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

    public void mostrarTudo(){
        for (Livro livro : livros){
            livro.exibirInformacoes();
        }
        for (Usuario usuario : usuarios){
            usuario.informacoesUsuario();
        }
    }

}
