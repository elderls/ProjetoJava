package Exercicios;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("<<<<<<<< Calculadora >>>>>>>");
        System.out.print("Informe a operação : ");
        String sinal = entrada.next();
        System.out.print("Informe o Primeiro numero : ");
        double num1 = entrada.nextDouble();
        System.out.print("Informe o Segundo numero : ");
        Double num2 = entrada.nextDouble();


        double soma = "+".equals(sinal) ? num1 + num2 : 0;
        soma = "-".equals(sinal) ? num1 - num2 : soma;
        soma = "*".equals(sinal) ? num1 * num2 : soma;
        soma = "/".equals(sinal) ? num1 / num2 : soma;

        String oper = "+".equals(sinal) ? " Soma "   : " Operação não informada ";
        oper = "-".equals(sinal) ? " Subtração "     : oper;
        oper = "*".equals(sinal) ? " Multiplicação " : oper;
        oper = "/".equals(sinal) ? " Divisão "       : oper;

        System.out.printf(" A " + oper + " dos valores " + num1 + " e " + num2 + " = " + soma);

        entrada.close();


    }
}
