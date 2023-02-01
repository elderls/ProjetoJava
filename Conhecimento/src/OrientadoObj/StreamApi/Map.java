package OrientadoObj.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        
        // Buid da Stream ou criação da entradas
        List<String> marcas = Arrays.asList("Bmw ", "audi ", "HonDa ");

        // intermediario da Stream
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        // intermediario lambda unario
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

        System.out.println("\n\nUsando composição...");

        marcas.stream()
            .map(Utilitario.maiusculo)
            .map(primeiraLetra)
            .map(Utilitario::grito)
            .forEach(print);


    }
}
