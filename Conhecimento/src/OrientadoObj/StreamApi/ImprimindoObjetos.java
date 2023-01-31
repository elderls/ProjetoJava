package OrientadoObj.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Duda", "Lari", "Lulu", "Luan" );

        System.out.println("Usando o foreach.....");
        for (String nome : aprovados) {
            System.out.println(nome);
        }


        System.out.println("Usando o Iterator.....");
        Iterator<String> interador = aprovados.iterator();
        while (interador.hasNext()) {
            System.out.println(interador.next());
        }

        System.out.println("Usando o Stream.....");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
