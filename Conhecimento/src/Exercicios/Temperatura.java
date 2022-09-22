package Exercicios;

public class Temperatura {
    public static void main(String[] args) {
        int f = 86;
        final int vlr = 32;
        final double cinco = 5.0;
        final double nove = 9.0;

        double celcius = (( f - vlr ) * cinco / nove);

        System.out.println("O valor convertido de fahrenheit para celcios  " +
                            "é de " + celcius + " C. ");
        
        
    }
}