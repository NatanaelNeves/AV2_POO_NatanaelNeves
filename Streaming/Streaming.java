package Streaming;

abstract class Streaming {
    String titulo;
    String genero;

    public Streaming(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public abstract void tipoStreaming(); 

    @Override
    public String toString() {
        return "Título: " + titulo + ", Gênero: " + genero;
    }
}

