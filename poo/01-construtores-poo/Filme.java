public class Filme {

    String titulo;
    String diretor;
    int duracao; // em minutos

    // Construtor que inicializa todos os atributos
    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    // Sobrecarga: inicializa apenas o título; diretor e duração recebem valores padrão
    public Filme(String titulo) {
        this.titulo = titulo;
        this.diretor = "Diretor Desconhecido";
        this.duracao = 120;
    }

    public void exibir() {
        System.out.println("Filme: " + titulo + " - " + diretor + " (" + duracao + " min)");
    }
}
