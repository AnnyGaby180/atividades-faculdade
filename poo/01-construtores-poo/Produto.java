public class Produto {

    String nome;
    double preco;
    int quantidade;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor encadeado: inicializa nome e preco, e chama o construtor
    // completo passando uma quantidade padrão de 1 (uso de this(...))
    public Produto(String nome, double preco) {
        this(nome, preco, 1);
    }

    public void exibir() {
        System.out.println("Produto: " + nome + " - R$" + preco + " (quantidade: " + quantidade + ")");
    }
}
