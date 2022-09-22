package Exercicios;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        System.out.printf("Mega Sena: %d %d %d %d \n", 1, 2, 3, 4);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Type your name: ");
        String nome = entrada.nextLine();

        System.out.print("type your last name: ");
        String sobrenome = entrada.nextLine();

        System.out.print("type your age : ");
        int idade = entrada.nextInt();

        System.out.printf("his name is %s %s, your age %d. %n", nome, sobrenome, idade);
        entrada.close();
    }
}
