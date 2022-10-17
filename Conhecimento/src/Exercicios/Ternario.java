package Exercicios;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Ternario {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);
        System.out.println("Informe nota final ");
        String notafinal = nota.nextLine();
        Double num1 = Double.parseDouble(notafinal);
        String resultarecuper = num1 >= 5 ? " em recuperação. " : "reprovado.";
        String resultadoFinal = num1 >= 7 ? "aprovado." : resultarecuper ;
        System.out.println("O aluno esta " + resultadoFinal);
    }
}
