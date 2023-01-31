package OrientadoObj.Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio1 {
    public static void main(String[] args) {




        // calcular preco com desconto
        Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);

        // retorna imposto 
        UnaryOperator<Double> impostoMunicipal = imposto -> imposto >= 2500 ? imposto * 1.085 : imposto;

        // calcular frete
        UnaryOperator<Double> freteFinal = frete -> frete >= 3000 ? frete + 100 : frete + 50 ;

        //Arredondar valor em 2 casa decimais
        UnaryOperator<Double> arrendondar = preco -> Double.parseDouble(String.format("%.2f", preco));

        //Formatar valor em R$1234,26
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("Notebook", 3595.15, 0.15);

        String preco = precoFinal.andThen(impostoMunicipal).andThen(freteFinal).andThen(arrendondar).andThen(formatar).apply(p);

        System.out.println("O valor final com desconto é : " + preco);
    }
}
