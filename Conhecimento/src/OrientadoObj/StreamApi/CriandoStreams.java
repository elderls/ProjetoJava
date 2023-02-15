package OrientadoObj.StreamApi;

import java.time.format.SignStyle;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<Object> println = System.out::println;

        Stream<String> langs = Stream.of("Java", "Lua", "JS");

        langs.forEach(println);


        String[] maisLans = {"Python", "Lisp", "Perl", "Go"};
        Stream.of(maisLans).forEach(println); 
        Arrays.stream(maisLans).forEach(println);
        Arrays.stream(maisLans, 1, 3).forEach(println);


        List<String> outrasLangs = Arrays.asList("c", "PHP", "KOTLIN");
        outrasLangs.stream().forEach(println);
        outrasLangs.parallelStream().forEach(println);


    }
}
