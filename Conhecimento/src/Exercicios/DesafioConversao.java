package Exercicios;

import java.util.Locale;
import java.util.Scanner;


public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Informe os ultimos 3 salarios ---");
        System.out.print("Informe antipenultimo salarios : ");
        String sl1 = entrada.nextLine().replace(",", ".");

        System.out.print("Informe penultimo salarios : ");
        String sl2 = entrada.nextLine().replace(",", ".");

        System.out.print("Informe ultimo salarios : ");
        String sl3 = entrada.nextLine().replace(",", ".");

        double val1 = Double.parseDouble(sl1);
        double val2 = Double.parseDouble(sl2);
        double val3 = Double.parseDouble(sl3);

        double soma = val1 + val2 + val3;

        double media = soma / 3;
//        System.out.printf(
 //          "Salarios recebidos %d %d %d " , val1 ,val2 , val3);
        System.out.println("Soma dos salarios " + soma);
        System.out.println(media);

        entrada.close();
    }
}
