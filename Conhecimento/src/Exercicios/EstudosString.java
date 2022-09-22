package Exercicios;

import java.io.PrintStream;

public class EstudosString {
    private static PrintStream printf;
    /**
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "olá";
        String s2 = "TCHAU";
        String s3 = " espaços ";
        
        System.out.println("s1 = "+ s1 + "\n" + "s2 = "+ s2 + "\n" + "s3 = "+s3);
        
        //MÉTODO REPLACE
        System.out.printf("Replace 'l' por 'L' no s1: %s\n\n", s1.replace('l', 'L'));
        
        //MÉTODO UPPER E LOWERCASE
        System.out.printf("s1.toUpperCase() = %s\n", s1.toUpperCase());
        System.out.printf("s1.toUpperCase() = %s\n", s1.toLowerCase());
        
        //MÉTODO TRIM - REMOVE OS ESPAÇOS
        System.out.printf("s3 depois do trim = \"%s\"\n\n", s3.trim());
        
        //CONVERTEU O olá PARA CHAR
        char[] charArray = s1.toCharArray();
        System.out.printf("s1 como um caracter array = ");
        
        for(char caracter : charArray) {
            System.out.print(caracter);
            
        }        
    }
}
