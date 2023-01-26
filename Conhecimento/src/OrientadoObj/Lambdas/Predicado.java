package OrientadoObj.Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        boolean b;

        Predicate<Produto> ehCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("notebook", 3895.35, 80);
        b = ehCaro.test(produto);

        if (b == true)  {
            System.out.println("O valor do produto " + produto.nome + " é caro");
        } else {
            System.out.println("O valor do produto " + produto.nome + " é barato");
        }
        
    }
}
