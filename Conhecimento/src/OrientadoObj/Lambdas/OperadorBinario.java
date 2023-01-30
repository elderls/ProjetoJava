package OrientadoObj.Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(5.1, 4.9));
        // junção entre dois "metodos" media que envia o resultado para conceito q traduz resultado em texto(string)
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado":"Reprovado";
        System.out.println(media.andThen(conceito).apply(5.1, 9.1));
        
    }
}
