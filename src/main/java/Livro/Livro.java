package Livro;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int quantidade_disponivel;

    public void cadastrarLivro(
            String newTitulo,
            String newAutor,
            String newIsnb,
            int newQuantidadeDisponivel
    ){
        this.autor = newAutor;
        this.titulo = newTitulo;
        this.isbn = newIsnb;
        this.quantidade_disponivel = newQuantidadeDisponivel;
    }

    public void emprestar(int qtd){
        this.quantidade_disponivel -= qtd;
    };

    public void devolver(int qtd){
        this.quantidade_disponivel +=qtd;
    }

    public void exibirInformacoes(){
        System.out.println("titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("isbn: " + this.isbn);
        System.out.println("quantidade disponivel: " + this.quantidade_disponivel);

    }

}
