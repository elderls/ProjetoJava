package OrientadoObj.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno n1 = new Aluno("Luana", 7.1);
        Aluno n2 = new Aluno("Larissa", 6.1);
        Aluno n3 = new Aluno("Duda", 8.1);
        Aluno n4 = new Aluno("Luan", 10);

        List<Aluno> alunos = Arrays.asList(n1,n2,n3,n4);

        Predicate<Aluno> aprovado = n -> n.nota >= 7.0;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream()
        .filter(aprovado)
        .map(apenasNota)
        .reduce(somatorio)
        .ifPresent(System.out::println);

    }
}
