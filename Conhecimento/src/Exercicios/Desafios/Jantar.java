package Exercicios.Desafios;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Feijoda", 0.320);
        Comida c2 = new Comida("Macarrão", 0.620);
        Pessoa psa = new Pessoa("Elder", 85.8);

        System.out.println(psa.apresentar());
        psa.comer(c1);
        System.out.println(psa.apresentar());
        psa.comer(c2);
        System.out.println(psa.apresentar());


    }
}
