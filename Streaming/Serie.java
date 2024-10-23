package Streaming;

class Serie extends Streaming {
    int temporadas;

    public Serie(String titulo, String genero, int temporadas) {
        super(titulo, genero);
        this.temporadas = temporadas;
    }

    @Override
    public void tipoStreaming() {
        System.out.println("Esta é uma série.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Temporadas: " + temporadas;
    }
}
