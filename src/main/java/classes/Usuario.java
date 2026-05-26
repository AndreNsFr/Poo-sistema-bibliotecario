package classes;

import java.util.HashSet;
import java.util.UUID;

public class Usuario {
    private String nome;
    private UUID id;
    private HashSet<Livro> livrosEmprestados;


    public String getNome() {
        return nome;
    }

    public UUID getId() {
        return id;
    }

    public HashSet<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public  Usuario(String newNome){
        this.nome = newNome;
        this.id = UUID.randomUUID();
        this.livrosEmprestados = new HashSet<>();
    }

    public void informacoesUsuario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        if(!this.livrosEmprestados.isEmpty()){
            this.listarLivros();
        }
    }

    public void pegarLivro(Livro livro){
        livro.emprestar();
        this.livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro){
        if(this.livrosEmprestados.contains(livro)){
            livro.devolver();
            livrosEmprestados.remove(livro);
        }else{
            // seria interessante lançar uma exeption em vez de um output padrão do console
            System.out.println("Esse livro não foi emprestado!");
        }
    }

    public void listarLivros(){
        System.out.println("Livros emprestados:");

        for (Livro livro : livrosEmprestados){
            System.out.println("/////////////////////////////////////////////////////");
            livro.exibirInformacoes();
            System.out.println("/////////////////////////////////////////////////////");

        }
    }
}
