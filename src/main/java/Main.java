import Livro.Livro;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.cadastrarLivro(
                "O programador Pragmático",
                "David Thomas & Andrew Hunt" ,
                "9788582606872",
                10);
        livro.exibirInformacoes();
    }
}
