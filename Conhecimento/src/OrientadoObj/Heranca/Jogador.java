package OrientadoObj.Heranca;

public class Jogador {
    public int x;
    public int y;
    public int vida = 100;

    public boolean Fugir(Jogador oponente) {

        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if (deltax == 0 && deltay == 1 ) {
            oponente.vida -= 10;
            return true;
        } else if ( deltax == 1 && deltay == 0) {
            oponente.vida -= 10;
            return true;
        } else  {
            return false;
        }
        
    }
    public boolean Fugir(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }

        return true;
    }
}
