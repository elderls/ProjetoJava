package OrientadoObj.Lambdas;

import java.util.function.Predicate;

public class PredicadoComposto {
    public static void main(String[] args) {
        // verifica se e par 
        Predicate<Integer> isPar = num -> num % 2 == 0;
        // verifica se  tem 3 digitos
        Predicate<Integer> isTresDig = num -> num >= 100 && num <= 999;

        // verifica se e par e tem 3 digitos
        System.out.println(isPar.and(isTresDig).test(22));
        System.out.println(isPar.and(isTresDig).test(222));
    }
}
