package Exercicios;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ent1 = 0;
        int maiorValor = 0;

        System.out.println("informe 10 numero "); 

        for (int i=1; i<=10; i++) {

            String val1 = entrada.nextLine();
            ent1 = Integer.parseInt(val1);  
            
            if (ent1 > maiorValor) {
                maiorValor = ent1;
            }
                     
        }

        System.out.println("O maior valor da lista é " + maiorValor);

        entrada.close();
    }
}
