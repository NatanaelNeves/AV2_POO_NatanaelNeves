abstract class Moradia {
    String endereco;
    int quartos;
    
    public Moradia(String endereco, int quartos) {
        this.endereco = endereco;
        this.quartos = quartos;
    }

    public abstract void tipoMoradia(); // Método abstrato

    @Override
    public String toString() {
        return "Endereço: " + endereco + ", Quartos: " + quartos;
    }
}
