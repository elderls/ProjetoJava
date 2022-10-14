package Exercicios;

import java.util.Scanner;

public class Numpositivo {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    double verval = 0;
    int total = 0;
    
    while(verval == 1.0) {
        System.out.println( "Informe um numero positivo ");
        System.out.printf( "ATENÇÃO : Para sair, infome um numero negativo : ");
        String val = entrada.next();

        int tot = Integer.parseInt(val);        
        int validador = tot;

        verval = Math.signum(validador);

        if (tot > 0) {
            total = total + tot;
        }




    }

    System.out.println("valor total " + total);
    entrada.close();

    }
}
