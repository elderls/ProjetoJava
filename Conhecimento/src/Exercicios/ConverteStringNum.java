package Exercicios;


import javax.swing.JOptionPane;

public class ConverteStringNum {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Informe o primeiro numero :");
        String valor2 = JOptionPane.showInputDialog("Informe o Segundo numero :");
        String valor3 = JOptionPane.showInputDialog("Informe o Terceiro numero :");
        String valor4 = JOptionPane.showInputDialog("Informe o Quarto numero :");

        System.out.println(
            valor1 + ' ' + valor2 + ' ' + valor3 + ' ' + valor4);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double num4 = Double.parseDouble(valor4);

        double soma  = (num1 + num2 + num3 + num4 );
        double media = (soma / 4);

        System.out.println("A soma dos valores " + soma);
        System.out.println("A media final " + media);

    }

}
