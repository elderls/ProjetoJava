package Exercicios.Arrays;

import java.util.Scanner;

public class ExecArrays {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quatidade de notas : ");
        int ent =  entrada.nextInt();

        double [] notas = new double[ent];

        for (int i=0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i]  =  entrada.nextDouble();
        }

        double soma = 0;

        for (double N:notas) {
            soma += N;
        }
        
        double media = soma / notas.length;
        System.out.println("a media final é " + media);
        entrada.close();


    }
}
