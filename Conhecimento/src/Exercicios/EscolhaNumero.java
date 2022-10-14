package Exercicios;

import java.util.Random;
import java.util.Scanner;


public class EscolhaNumero {
    public static void main(String[] args) {
        Random gerador = new Random();
         
        int r = gerador.nextInt(100);
        System.out.println(r);

        Scanner entrada = new Scanner(System.in);

        System.out.printf( "Adivinhe o numero de 1 a 100, voce tem 10 chances: ");
        String ent = entrada.next();

        int comp = Integer.parseInt(ent);
        int compaux = 0;
        
        for (int i = 10; i > 0; i--) {
            if (comp >= 0 && comp <= 100) {
                if (comp > r) {
                    System.out.println ("Informe um numero menor que " + comp + ", voce tem mais " + i + " chance.");
                    ent = entrada.next();
                    comp = Integer.parseInt(ent);
                    if (compaux == comp) {
                        System.out.println ("ATENÇÃO, este numero ja foi informado, tente outro. "); 
                        compaux = comp;
                        continue;
                    }else {
                        compaux = comp;
                        continue;
                    }
                    
                } else if (comp < r) {
                    System.out.println ("Informe um numero maior que " + comp + ", voce tem mais " + i + " chance.");
                    ent = entrada.next();
                    comp = Integer.parseInt(ent);
                    if (compaux == comp) {
                        System.out.println ("ATENÇÃO, este numero ja foi informado, tente outro. ");
                        compaux = comp; 
                        continue;
                    }else {
                        compaux = comp;
                        continue;
                    }
                }else if (comp == r) {
                    System.out.println("Parabens voce acertou na mosca, " + "numero" + " aleatório é "  + comp );    
                    break;            
                }
            } else {
                System.out.println("Por favor informe um numero de 1 a 100 :");  
                break;
            }
        }





        entrada.close();
    }
}
