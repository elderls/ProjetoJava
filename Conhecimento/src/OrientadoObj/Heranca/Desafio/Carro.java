package OrientadoObj.Heranca.Desafio;

public class Carro {
    
    int velatual;
    final int VELMAXIMA;

    Carro(int velocidadeMaxima) {
        VELMAXIMA = velocidadeMaxima;
    }


    Boolean acelerar(TipoCarro tp) {

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


    Boolean Freiar(TipoCarro tp) {
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
