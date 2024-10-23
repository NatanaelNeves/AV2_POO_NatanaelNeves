package Game;

abstract class Personagem {
    String nome;
    int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public abstract void tipoPersonagem(); 

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nível: " + nivel;
    }
}

