import classes.Biblioteca;
import classes.Livro;
import classes.Usuario;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("O programador Pragmático",
                "David Thomas & Andrew Hunt" ,
                "9788582606872",
                10);


        Usuario usuario = new Usuario("André");
        usuario.informacoesUsuario();
        usuario.pegarLivro(livro);
        usuario.listarLivros();

    }
}
