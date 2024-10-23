class Apartamento extends Moradia {
    int andar;

    public Apartamento(String endereco, int quartos, int andar) {
        super(endereco, quartos);
        this.andar = andar;
    }

    @Override
    public void tipoMoradia() {
        System.out.println("Este é um apartamento.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Andar: " + andar;
    }
}

