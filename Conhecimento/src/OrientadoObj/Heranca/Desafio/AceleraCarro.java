package OrientadoObj.Heranca.Desafio;

public class AceleraCarro {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        CarroPopular civic = new CarroPopular();

        ferrari.acelerar(TipoCarro.SUPERCARRO);

        civic.acelerar(TipoCarro.CARROPOPULAR);
        civic.acelerar(TipoCarro.CARROPOPULAR);
        civic.acelerar(TipoCarro.CARROPOPULAR);
        civic.acelerar(TipoCarro.CARROPOPULAR);


        ferrari.Freiar(TipoCarro.SUPERCARRO);
        ferrari.Freiar(TipoCarro.SUPERCARRO);
        ferrari.Freiar(TipoCarro.SUPERCARRO);

        civic.Freiar(TipoCarro.CARROPOPULAR);
        civic.Freiar(TipoCarro.CARROPOPULAR);

        System.out.println(ferrari.velatual);
        System.out.println(civic.velatual);
    }
}
