package OrientadoObj.StreamApi;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.Arrays;
import java.util.List;

import OrientadoObj.Lambdas.Predicado;

public class SiteLivros {
    public static void main(String[] args) {


        Livros livros1 = new Livros("A arte da guerra", 53.15, 0.30, 0);
        Livros livros2 = new Livros("Codigo Limpo", 65.15, 0.10 , 0);
        Livros livros3 = new Livros("O poder do silencio", 22.70, 0.20 , 10);
        Livros livros4 = new Livros("Poder do hábito", 42.90, 0.20 , 10);
        Livros livros5 = new Livros("Não ha dias facil", 35.50, 0.30 , 10);

        List<Livros> book = Arrays.asList(livros1, livros2, livros3, livros4, livros5);

        Predicate<Livros> filtroDesconto = a -> a.valorLivro >= 50.00 ;
        Predicate<Livros> freteGratis = a -> a.frete == 0.00 ;

        Function<Livros, String> imprimirSaida = a -> "O desconto para livro acima de R$50,00 é de 30 %, o desconto será para o livro " + a.nomeLivro ;

        book.stream()
              .filter(filtroDesconto)
              .filter(freteGratis)
              .map(imprimirSaida)
              .forEach(System.out::println);

    }



}
