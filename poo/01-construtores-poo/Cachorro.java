public class Cachorro extends Animal {

    String raca;

    // Chama o construtor da classe Animal (super) para inicializar nome e peso
    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public void exibir() {
        System.out.println("Cachorro: " + nome + ", " + peso + "kg, raça " + raca);
    }
}
