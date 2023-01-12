package OrientadoObj.MetodosMain;

import OrientadoObj.Heranca.Desafio.CarroPopular;
import OrientadoObj.Heranca.Desafio.Ferrari;
import OrientadoObj.Heranca.Desafio.TipoCarro;

public class AceleraCarro {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(30);
        CarroPopular civic = new CarroPopular(25);

        ferrari.acelerar(TipoCarro.SUPERCARRO);
        ferrari.acelerar(TipoCarro.SUPERCARRO);
        ferrari.acelerar(TipoCarro.SUPERCARRO);

        civic.acelerar(TipoCarro.CARROPOPULAR);
        civic.acelerar(TipoCarro.CARROPOPULAR);
        civic.acelerar(TipoCarro.CARROPOPULAR);
        civic.acelerar(TipoCarro.CARROPOPULAR);

        civic.Freiar(TipoCarro.CARROPOPULAR);
        civic.Freiar(TipoCarro.CARROPOPULAR);

        System.out.println("A velocidade atual da FERRARI é " + ferrari.velatual + " km/h");
        System.out.println("A velocidade atual da CIVIC é " + civic.velatual + " km/h");
    }
}
