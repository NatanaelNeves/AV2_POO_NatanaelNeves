package Game;

class Mago extends Personagem {
    int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    @Override
    public void tipoPersonagem() {
        System.out.println("Este é um Mago.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana: " + mana;
    }
}
