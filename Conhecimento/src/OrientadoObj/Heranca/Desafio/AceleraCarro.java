package OrientadoObj.Heranca.Desafio;

public class AceleraCarro {
    public static void main(String[] args) {

        Ferrari supercar = new Ferrari();
        CarroPopular carropopular = new CarroPopular();

        supercar.acelerar(TipoCarro.SUPERCARRO);

        carropopular.acelerar(TipoCarro.CARROPOPULAR);
        carropopular.acelerar(TipoCarro.CARROPOPULAR);
        carropopular.acelerar(TipoCarro.CARROPOPULAR);
        carropopular.acelerar(TipoCarro.CARROPOPULAR);


        supercar.Freiar(TipoCarro.SUPERCARRO);
        supercar.Freiar(TipoCarro.SUPERCARRO);
        supercar.Freiar(TipoCarro.SUPERCARRO);

        carropopular.Freiar(TipoCarro.CARROPOPULAR);
        carropopular.Freiar(TipoCarro.CARROPOPULAR);

        System.out.println(supercar.velatual);
        System.out.println(carropopular.velatual);
    }
}
