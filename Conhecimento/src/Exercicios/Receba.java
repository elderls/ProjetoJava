package Exercicios;

import java.util.Scanner;

public class Receba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra ");

        String valor = entrada.nextLine();

        int tamanho = valor.length();
        char[] letras = valor.toCharArray();

        for (int i = 0; i < tamanho; i++) {
            System.out.println(letras[i]);
        }

        entrada.close();
    }
}
