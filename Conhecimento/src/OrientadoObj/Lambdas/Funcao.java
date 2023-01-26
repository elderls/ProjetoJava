package OrientadoObj.Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "impar";

        Function<String, String> Descricao = valor1 -> "O Resultado é " + valor1;

        Function<String, String> afirmativo = valor2 -> "!!!";

        Function<String, String> interroga = valor3 -> "???";

        // resultado nao foi esperado, depois refer o codigo
        String ResultadoFinal = parOuImpar.andThen(Descricao).andThen(afirmativo).apply(32);
        System.out.println(ResultadoFinal);
        
        String ResultadoFinal2 = parOuImpar.andThen(Descricao).andThen(interroga).apply(33);
        System.out.println(ResultadoFinal2);

 //       System.out.println(parOuImpar.apply(12));
    }
}
