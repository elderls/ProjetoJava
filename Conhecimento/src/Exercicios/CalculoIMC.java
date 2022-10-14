package Exercicios;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;

public class CalculoIMC {
    public static void main(String[] args) {


        String peso = JOptionPane.showInputDialog(" Informe o seu peso : ");
        String altura = JOptionPane.showInputDialog(" Informe o seu altura : ");

        double ps = Double.parseDouble(peso);
        double alt = Double.parseDouble(altura);
        
        double altelev = Math.pow(alt, 2);
        double IMC = ps / altelev;

        String clasf = IMC < 18.5 ? "Magreza." : " ";
        clasf = IMC > 18.5 ? "Normal." : clasf;
        clasf = IMC > 24.9 ? "SobrePeso." : clasf;
        clasf = IMC > 29.9 ? "Obesidade." : clasf;
        clasf = IMC > 40 ? "Obesidade Grave." : clasf;

        String imc = Double.toString(IMC);

        JOptionPane.showMessageDialog(null, "O valor da sua massa IMC é " + imc + " e voce esta com a classificação " + clasf );
    }
}
