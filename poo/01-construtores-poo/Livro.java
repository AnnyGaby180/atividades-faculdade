public class Livro {

    String titulo;
    String autor;
    int paginas;

    // Construtor que inicializa todos os atributos
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Sobrecarga: inicializa apenas o título, demais atributos com valor padrão
    public Livro(String titulo) {
        this.titulo = titulo;
        this.autor = "Autor Desconhecido";
        this.paginas = 0;
    }

    public void exibir() {
        System.out.println("Livro: " + titulo + " - " + autor + " (" + paginas + " páginas)");
    }
}
