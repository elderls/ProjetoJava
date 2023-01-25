package OrientadoObj.MetodosMain;

import OrientadoObj.Carro;
import OrientadoObj.Heranca.Desafio.CarroPopular;
import OrientadoObj.Heranca.Desafio.Ferrari;


public class AceleraCarro {
    public static void main(String[] args) {

 
        Ferrari ferrari = new Ferrari(300);
        CarroPopular civic = new CarroPopular(190);

        ferrari.acelerar();
        ferrari.ligaTurbo();
//        ferrari.ligaTurbo();
//        ferrari.acelerar(TipoCarro.SUPERCARRO);
//        ferrari.acelerar(TipoCarro.SUPERCARRO);

//        ferrari.desligarAr();
//        System.out.println("A velocidade maxima da FERRARI é " + ferrari.velatual + " km/h");
//        ferrari.ligarAr();
//        ferrari.desligarAr();
//        ferrari.desligaTurbo();
//        System.out.println("reduzindo velocidade da FERRARI " + ferrari.velatual + " km/h");


        civic.acelerar( );
        civic.acelerar( );
        civic.acelerar( );
        civic.acelerar( );

//        civic.Freiar(TipoCarro.CARROPOPULAR);
//        civic.Freiar(TipoCarro.CARROPOPULAR);

        
       System.out.println(ferrari);
    }
}
