public class Main {

    public static void main(String[] args) {

        System.out.println("=== Exercício 1 - Carro (Construtor Básico) ===");
        // Passo 0: se a classe Carro não tivesse nenhum construtor declarado,
        // a linha abaixo funcionaria mesmo assim, usando o construtor default do Java:
        // Carro carroDefault = new Carro();
        Carro carro = new Carro("Fiat", "Uno", 2020);
        carro.exibir();

        System.out.println("\n=== Exercício 2 - Livro (Sobrecarga de Construtores) ===");
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 208);
        Livro livro2 = new Livro("1984");
        livro1.exibir();
        livro2.exibir();

        System.out.println("\n=== Exercício 3 - Filme (Sobrecarga de Construtores) ===");
        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", 169);
        Filme filme2 = new Filme("Filme Sem Diretor Definido");
        filme1.exibir();
        filme2.exibir();

        System.out.println("\n=== Exercício 4 - Produto (Chamada Encadeada de Construtores) ===");
        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse", 45.00);
        produto1.exibir();
        produto2.exibir();

        System.out.println("\n=== Exercício 5 - Animal e Cachorro (Construtores e Herança) ===");
        Cachorro cachorro = new Cachorro("Rex", 12.5, "Labrador");
        cachorro.exibir();
    }
}
