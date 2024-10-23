package Game;

class Cavaleiro extends Personagem {
    int armadura;

    public Cavaleiro(String nome, int nivel, int armadura) {
        super(nome, nivel);
        this.armadura = armadura;
    }

    @Override
    public void tipoPersonagem() {
        System.out.println("Este é um Cavaleiro.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Armadura: " + armadura;
    }
}

