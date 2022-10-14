package Exercicios;

import java.util.Scanner;

public class CoverFemC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
            "informe a escala a ser convertida F = Fahrenheit ou C = Celsius. "
            );

        String escala = input.next().replace("f", "F").replace("c", "C");

        String termica = escala.equals("F") ? "Celsius" : "Fahrenheit";
        String termica2 = escala.equals("C") ? "Celsius" : "Fahrenheit";
        
        System.out.println(
            "Informe o valor da temperatura em " + termica + " para converter em " + termica2) ;

        double Far = input.nextDouble();

        // converter Fahrenheit em celsius
        double celsius = (Far - 32) / 1.8;

        // converter celsius em Fahrenheit
        double Fahrenheit = (Far * 1.8) + 32;

        double calc = escala.equals("C") ? celsius : 0;
        calc = escala.equals("F") ? Fahrenheit : calc;

        System.out.println(
            "A converção de " + Far + " graus " + termica + " " + "para " + termica2 + " é igual a " + calc + " graus " + termica2);

        input.close();
    }
}
