package Game;

class Arqueiro extends Personagem {
    int flechas;

    public Arqueiro(String nome, int nivel, int flechas) {
        super(nome, nivel);
        this.flechas = flechas;
    }

    @Override
    public void tipoPersonagem() {
        System.out.println("Este é um Arqueiro.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Flechas: " + flechas;
    }
}
