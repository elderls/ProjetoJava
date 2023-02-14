package OrientadoObj.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, String> conceito = m -> Integer.toString(m,2);

        UnaryOperator<String> reverso = m -> new StringBuilder(m).reverse().toString();

        Function<String, Integer> binarioParaInter = m -> Integer.parseInt(m, 2);
        
       
        nums.stream()
        // metodo do professor .map(Interger::toBinaryString)
        .map(conceito)
        //.map(Utilitario::converter)
        .map(reverso)
        .map(binarioParaInter)
        .forEach(System.out::println);

    }
}
