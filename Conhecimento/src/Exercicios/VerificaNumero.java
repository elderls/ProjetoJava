package Exercicios;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();

        if (valor >= 0 && valor <= 0) {
            System.out.print("Valor Valido " + valor);
        } else {
            System.out.print("Valor Invalido " + valor);    
        }

        entrada.close();
    }
}
