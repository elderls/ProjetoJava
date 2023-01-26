package OrientadoObj.Lambdas;

import java.util.function.UnaryOperator;

public class OperacaoUnaria {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        // andthen segue na seguencia >>>>
        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));

        // compose e o inverso da sequencia <<<<<
        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(0));

    }
}
