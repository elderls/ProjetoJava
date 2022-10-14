package Exercicios;

import javax.swing.JOptionPane;

public class MediaFinal {
    
    public static void main(String[] args) {
           
    double media = 0;

    String nota1 = JOptionPane.showInputDialog("Informe primeira nota : ");
    String nota2 = JOptionPane.showInputDialog("Informe segunda nota : ");
    String nota3 = JOptionPane.showInputDialog("Informe terceira nota : ");
    String nota4 = JOptionPane.showInputDialog("Informe quarta nota : ");

    double n1 = Double.parseDouble(nota1);
    double n2 = Double.parseDouble(nota2);
    double n3 = Double.parseDouble(nota3);
    double n4 = Double.parseDouble(nota4);

    media = (n1 + n2 + n3 + n4) / 4 ;

    if (media >= 7.0) {
        System.out.println("Parabens voce foi Aprovado, com a media : " + media);
        JOptionPane.showMessageDialog(null, "Parabens voce foi Aprovado, com a media : " + media);            
    } else if (media >= 4.0 && media < 7.0) {
        JOptionPane.showMessageDialog(null, "Ops, voce precisa estudar mais, recuperação com a media : " + media);         
    }else {
        JOptionPane.showMessageDialog(null, "Atenção infelizemente voce foi reprovado : " + media);      
    }
  }
}
