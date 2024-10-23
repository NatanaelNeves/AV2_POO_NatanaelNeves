package Streaming;

class Filme extends Streaming {
    int duracao; 

    public Filme(String titulo, String genero, int duracao) {
        super(titulo, genero);
        this.duracao = duracao;
    }

    @Override
    public void tipoStreaming() {
        System.out.println("Este é um filme.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Duração: " + duracao + " minutos";
    }
}

