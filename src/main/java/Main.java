import classes.Biblioteca;
import classes.Livro;
import classes.Usuario;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Livro livro_criado = biblioteca.adicionarLivro(
                "O programador Pragmático",
                "David Thomas & Andrew Hunt" ,
                "9788582606872",
                10
        );
        Usuario usuario_criado = biblioteca.cadastrarUsuario("André");
        biblioteca.realizarEmprestimo(usuario_criado, livro_criado);


        Livro busca = biblioteca.buscarLivro("programador");
        if(busca != null){
            busca.exibirInformacoes();
        }else{
            System.out.println("Livro não encontrado :(");
        }

    }
}
