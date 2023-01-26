package OrientadoObj.Lambdas;

 
import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "bia" , "lia", "gia" );

        System.out.println("forma tradicional");
        for(String nome: aprovados) {
            System.out.println(nome);
        }


        System.out.print("\nforma lambda");
        aprovados.forEach(nome -> Imprimir(nome));

        System.out.println("\nforma de metodo referenciado");
        aprovados.forEach(Foreach::Imprimir);       

    }

    static void Imprimir(String nome) {
        System.out.println(" Meu nome é " + nome);
    }
}
