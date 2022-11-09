package Exercicios.Desafios;

public class Pessoa {
    
    String nome ;
    double peso ;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;   
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.pscmda;
        }
    }

    String apresentar() {
        return "Ola, meu nome é " + nome  + " é tenho " + peso; 
    }

}
