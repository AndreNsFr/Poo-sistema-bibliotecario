package classes;

public class SaidaTerminal {

    public void exibirMenu(){
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("Digite a sua opção:");
        System.out.println("1 - Criar usuário");
        System.out.println("2 - Criar livro");
        System.out.println("3 - Exibir lista de livros cadastrados");
        System.out.println("4 - Exibir lista de usuários");
        System.out.println("5 - Pesquisar livro pelo nome");
        System.out.println("6 - Pesquisar usuário pelo nome");
        System.out.println("7 - Cadastrar emprestimo");
        System.out.println("8 - Cadastrar devolução");
        System.out.println("9 - sair");
        System.out.println("/////////////////////////////////////////////////");
    }

    public void pesquisaUsuario(){
        System.out.println("Digite o nome do usuário para pesquisa:");
    }

    public void pesquisaLivro(){
        System.out.println("Digite o nome do livro para pesquisa:");
    }



}
