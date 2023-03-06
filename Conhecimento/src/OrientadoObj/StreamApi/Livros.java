package OrientadoObj.StreamApi;

public class Livros {
    String nomeLivro;
    double valorLivro;
    double descontoLivro;
    double frete;

    public Livros(String nomeLivro, double valorLivro, double descontoLivro, double frete) {
        this.nomeLivro = nomeLivro;
        this.valorLivro = valorLivro;
        this.descontoLivro = descontoLivro;
        this.frete = frete;
    }  
    

    public static double desconto(double valorLivro2, double descontoLivro2) {

        double descontou = valorLivro2 - descontoLivro2;
        return descontou;


    }
}
