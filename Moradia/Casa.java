public class Casa extends Moradia {
    
        boolean temQuintal;
    
        public Casa(String endereco, int quartos, boolean temQuintal) {
            super(endereco, quartos);
            this.temQuintal = temQuintal;
        }
    
        @Override
        public void tipoMoradia() {
            System.out.println("Esta é uma casa.");
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Quintal: " + (temQuintal ? "Sim" : "Não");
        }
    }
    
