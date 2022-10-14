package Exercicios;

import java.util.Scanner;

import javax.swing.plaf.ComponentInputMapUIResource;

public class VerificaValor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("informe um valor entre 0 a 10 ");
        double val = entrada.nextDouble();

        if (val >=0 && val <=10) {
            System.out.println("O valor digitado valido " + val);
        } else {
            System.out.println("O valor digitado invalido, informe entre 0 a 10 " + val);
        }

        entrada.close();
    }

}



