package Exercicios;

public class Produto {
    String nome;
    double preço;
    static double desconto = 0.25;

    double descontoPadrao() {
        return preço * (1 - desconto);

    }

    double descontoPadrao(double desc) {
        return preço * (1 - desc);

    }





}
