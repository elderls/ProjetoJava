package OrientadoObj.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafios {
    public static void main(String[] args) {
        
        CriptoMoeda v1 = new CriptoMoeda("BNB", 1.123);
        CriptoMoeda v2 = new CriptoMoeda("ETH", 0.093);
        CriptoMoeda v3 = new CriptoMoeda("BCT", 0.123);
        CriptoMoeda v4 = new CriptoMoeda("BNC", 5.123);
        CriptoMoeda v5 = new CriptoMoeda("ATH", 0.00123);
        CriptoMoeda v6 = new CriptoMoeda("ZHZ", 0.00001);

        List<CriptoMoeda> Crypto = Arrays.asList(v1, v2, v3, v4, v5, v6);

        Predicate<CriptoMoeda> CryptoAlta = a -> a.valorCripto >= 1;

        Predicate<CriptoMoeda> CryptoBnb = a -> a.nomeCripto.equalsIgnoreCase("BNC");

        Function<CriptoMoeda, String> imprimeSaida = a -> "A Cryptomoeda selecionada é " + 
                                                          a.nomeCripto + ", o valor da moeda hoje é: " + 
                                                          a.valorCripto;

        Crypto.stream()
              .filter(CryptoAlta)
              .filter(CryptoBnb)
              .map(imprimeSaida)
              .forEach(System.out::println);

    }
}
