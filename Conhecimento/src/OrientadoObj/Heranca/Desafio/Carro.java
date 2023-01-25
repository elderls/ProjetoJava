package OrientadoObj.Heranca.Desafio;

public class Carro {
    
    public final int VELMAXIMA;
    int velatual;
    private int giro = 0;

    public int getGiro() {
        return giro;
    }


    public void setGiro(int giro) {
        this.giro = giro;
    }


    protected Carro(int velocidadeMaxima) {
        VELMAXIMA = velocidadeMaxima;
    }


    public void acelerar() {

        if (velatual + getGiro() > VELMAXIMA) {
            velatual = VELMAXIMA;
        } else {
            velatual += getGiro();
        }

    }


    public void frear() {
        if(velatual >=5) {
            velatual -= 5;
        } else {
            velatual = 0;
        }
    }

    @Override
    public String toString() {          
        return "A velocidade atual da FERRARI é " + velatual + " km/h";
    }
    
}
