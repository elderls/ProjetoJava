package OrientadoObj.Heranca;

public class Jogar {
    public static void main(String[] args) {
        Mostro mostro = new Mostro();
        mostro.x = 10;
        mostro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;      

        Jogador j3 = new Jogador();
        j3.x = 10;
        j3.y = 12;             

        System.out.println("atacate mostro >>> " + mostro.vida);
        System.out.println("atacate super heroi >>> " + heroi.vida);
        System.out.println("atacate jogador >>> " + j3.vida);

//      j1.andar(Direcao.NORTE);
//      j1.andar(Direcao.NORTE);
//      j1.andar(Direcao.SUL);

        mostro.atacar(heroi);
        heroi.atacar(mostro);
        j3.atacar(heroi);

        System.out.println("atacado mostro >>> " + mostro.vida);
        System.out.println("atacado super heroi >>> " + heroi.vida);
        System.out.println("atacado jogador >>> " + j3.vida);
    }
}
