package OrientadoObj.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filters {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Luana", 7.5);
        Aluno a2 = new Aluno("Lari", 6.5);
        Aluno a3 = new Aluno("Duda", 5.5);
        Aluno a4 = new Aluno("Luan", 9.5);
        Aluno a5 = new Aluno("Valentina", 8.5);
        Aluno a6 = new Aluno("Fernada", 6.5);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabens " + a.nome + " voce fui aprovado, com a media: " + a.nota;

        alunos.stream()
              .filter(aprovado)
              .map(saudacaoAprovado)
              .forEach(System.out::println);
    }
}
