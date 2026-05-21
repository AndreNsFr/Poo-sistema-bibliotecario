package classes;

import java.util.ArrayList;
import java.util.HashSet;

public class Biblioteca {

    // verificar se o hashset é a estrutura de dados correta para a classe!
    private HashSet<Usuario> usuarios;
    private HashSet<Livro> livros;

    public void adicionarLivro( String newTitulo, String newAutor, String newIsnb, int newQuantidadeDisponivel){
        Livro livro = new Livro( newTitulo, newAutor, newIsnb, newQuantidadeDisponivel);
        this.livros.add(livro);
    }

    public void cadastrarUsuario(String newNome){
        Usuario usuario = new Usuario(newNome);
        this.usuarios.add(usuario);
    }

    public void removerLivro(Livro livro){
        this.livros.remove(livro);
    }



}
