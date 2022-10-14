package Exercicios;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
            System.out.print("Informe o ano para verificar se ele e Bissexto : ");
            String ano = entrada.next();
            
            String val = ano.substring(2,4);
            String val2 = ano.substring(0,2);

            
            int anoint = Integer.parseInt(ano);
            int anozero = Integer.parseInt(val2);

            int resto = 0;

            if (val.equals(00)) {
                resto = anozero % 4;
            } else {
                resto = anoint % 4;
            }

            if (resto == 0) {
                System.out.println("O ano informado é Bissexto " + ano);
            }else {
                System.out.println("O ano informado não é Bissexto " + ano);
            }

        entrada.close();
    }
}
