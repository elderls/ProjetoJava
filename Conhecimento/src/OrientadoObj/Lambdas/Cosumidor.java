package OrientadoObj.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cosumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto( "Caneta", 1.50, 0.05);

        imprimirNome.accept(p1);

        Produto p2 = new Produto( "lapis", 1.20, 0.01);
        Produto p3 = new Produto( "borracha", 0.50, 0.0);
        Produto p4 = new Produto( "apontador", 2.50, 0.05);
        Produto p5 = new Produto( "regua", 3.50, 0.05);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4 ,p5);
        System.out.println("-----------------  Consumer ---------------------");
        produtos.forEach(imprimirNome);

        System.out.println("-----------------   Lambda  ---------------------");
        produtos.forEach(p -> System.out.println(p.preco));

        System.out.println("-----------   Metodo de referencia   ------------");

        produtos.forEach(System.out::println);





    }
}
