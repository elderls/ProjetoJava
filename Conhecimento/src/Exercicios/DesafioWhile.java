package Exercicios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vlrconvert = 0;
        int contador = 0;
        int total = 0;
        int media = 0;

        while  (vlrconvert != -1) {
            
          System.out.println("Informe o valor de 1 a 10 ou -1 p/ sair ");
          vlrconvert = entrada.nextInt();

          if ((vlrconvert >= 0) && (vlrconvert <= 10))  {
              total += vlrconvert;
              contador++;
          } else if (vlrconvert != -1) {
            System.out.println("Valor invalido informe de 1 a 10 ou -1 p/ sair ");
          }        

        }

        if (contador != 0) {
            media = total / contador;
        }

        System.out.println("Total : " + total);
        System.out.println("Media : " + media);
        System.out.println("contador : " + contador);

        entrada.close();
    }
}
