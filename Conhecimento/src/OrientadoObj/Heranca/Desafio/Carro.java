package OrientadoObj.Heranca.Desafio;

public class Carro {
    
    public int velatual;
    final int VELMAXIMA;

   protected Carro(int velocidadeMaxima) {
        VELMAXIMA = velocidadeMaxima;
    }


    public Boolean acelerar(TipoCarro tp) {

        switch(tp) {
            case SUPERCARRO:            
            velatual = velatual + 15;
            if (velatual > VELMAXIMA) {
                velatual = VELMAXIMA;
                break;
            }
            break;
            case CARROPOPULAR:
            velatual = velatual + 5;
            if (velatual > VELMAXIMA) {
                velatual = VELMAXIMA;
                break;
            }
            break;
        }
        return false;


    }


    public Boolean Freiar(TipoCarro tp) {
        switch(tp) {
            case SUPERCARRO:
            velatual = velatual - 15;
            if (velatual < 0) {
                velatual = 0;
                break;
            }
            break;
            case CARROPOPULAR:
            velatual = velatual - 5;
            if (velatual < 0) {
                velatual = 0;
                break;
             }
            break;
        }

        return false;
         
    }
}
