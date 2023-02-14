package OrientadoObj.StreamApi;
import java.util.function.UnaryOperator;

public class Utilitario {

    // Tratamento por lambda
    public final static UnaryOperator<String> maiusculo = n -> n.toUpperCase();

    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    // tratamento por função
    public final static String grito(String n) {
        return n + "!!! ";
    }

    public final static String converter(String ent) {

        return Integer.valueOf(ent).toString();

    }
   

    public static String saidaBase (int a, int base) {
        return Integer.toString(a);
    }


}