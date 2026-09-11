public class Carro {

    String marca;
    String modelo;
    int ano;

    // ---------------------------------------------------------------------
    // Passo 0 (exploração): antes de existir QUALQUER construtor nesta
    // classe, o Java gera sozinho um "construtor default" (sem parâmetros).
    // É por isso que, se você comentar o construtor abaixo, ainda é possível
    // fazer "new Carro()" e o programa compila normalmente — os atributos
    // simplesmente ficam com os valores padrão (null, null, 0).
    //
    // Assim que declaramos o construtor customizado abaixo, o Java deixa de
    // fornecer o construtor default automaticamente.
    // ---------------------------------------------------------------------

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
    }
}
