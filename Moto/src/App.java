public class App {
    public static class Pneu {
        int aro;
        String modelo_aro;
    }

    public static class Automovel {
        int velocidades;
        String modelos;
        int quantidade_pneu;

        Pneu pneu;

        public Automovel() { 
            pneu = new Pneu();
        }
        
        public Automovel(int velocidade, String modelo, int quantidade_pneu) {
            this.velocidades = velocidade;
            this.modelos = modelo;
            this.quantidade_pneu = quantidade_pneu;

            pneu = new Pneu();
        }

        public void Imprimir() {
            System.out.println("Até aqui tudo bem :D");
        }

        public void definePneu(int aro, String modelo_aro) {
            pneu.aro = aro;
            pneu.modelo_aro = modelo_aro;
        }
    }

    public static class Carro extends Automovel {
        String marca;
        Boolean escada;

        public Carro(String marca, int velocidade, String modelo, int quantidade_pneu, boolean escada) {
            super(velocidade, modelo, quantidade_pneu);
            this.marca = marca;
            this.escada = escada;
        }

        @Override public void Imprimir() {
            System.out.printf("\nMarca: %s\nVelocidade: %d\nModelo: %s\nQuantos Pneus: %d\nTamanho Aro: %d\nModelo Aro: %s\n", this.marca, this.velocidades, this.modelos, this.quantidade_pneu, pneu.aro, pneu.modelo_aro);
        }
    }

    public static class Moto extends Automovel {
        int cilindradas;
        String tipo_moto;

        public Moto(int cilindradas, int velocidade, String modelo, int quantidade_pneu, String tipo_moto) {
            super(velocidade, modelo, quantidade_pneu);
            this.cilindradas = cilindradas;
            this.tipo_moto = tipo_moto;
        }

        @Override public void Imprimir() {
            System.out.printf("\nCilindrada: %d\nVelocidade: %d\nModelo: %s\nQuantos Pneus: %d\nTamanho Aro: %d\nModelo Aro: %s\n", this.cilindradas, this.velocidades, this.modelos, this.quantidade_pneu, pneu.aro, pneu.modelo_aro);
        }
    }


    public static void main(String[] args) throws Exception {
        Automovel auto = new Automovel();
        auto.Imprimir();

        Moto moto = new Moto(600, 299, "Honda", 2, "Naked");

        moto.definePneu(17, "Raiado");

        moto.Imprimir();

        Carro carro = new Carro("Fiat", 399,"Uno",4, true);

        carro.definePneu(19, "Liga Leve");
        
        carro.Imprimir();
    }
}