package OrientadoObj.MetodosMain;

import OrientadoObj.Heranca.Direcao;
import OrientadoObj.Heranca.Heroi;
import OrientadoObj.Heranca.Jogador;
import OrientadoObj.Heranca.Mostro;

public class Jogar {
    public static void main(String[] args) {
        Mostro mostro = new Mostro();
        mostro.x = 10;
        mostro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;      

        Jogador jogador = new Jogador();
        jogador.x = 10;
        jogador.y = 12;             

        System.out.println("atacate mostro >>> " + mostro.vida);
        System.out.println("posição mostro >>> " + mostro.x + mostro.y);

        System.out.println("atacate super heroi >>> " + heroi.vida);
        System.out.println("posição super heroi >>> " + heroi.x + heroi.y);

        System.out.println("atacate jogador >>> " + jogador.vida);
        System.out.println("posição jogador >>> " + jogador.x + jogador.y);
        System.out.println("------------------------------------------");

//      j1.andar(Direcao.NORTE);
//      j1.andar(Direcao.NORTE);
//      j1.andar(Direcao.SUL);

        mostro.Fugir(heroi);
        heroi.Fugir(mostro);
        jogador.Fugir(heroi);

        heroi.Fugir(Direcao.NORTE); // fugir 
        jogador.Fugir(heroi);

        System.out.println("atacado mostro >>> " + mostro.vida);
        System.out.println("posição mostro >>> " + mostro.x + mostro.y);
        System.out.println("  " );

        System.out.println("atacado super heroi >>> " + heroi.vida);
        System.out.println("posição super heroi >>> " + heroi.x + heroi.y);
        System.out.println("  " );

        System.out.println("atacado jogador >>> " + jogador.vida);
        System.out.println("posição jogador >>> " + jogador.x + jogador.y);
    }
}
