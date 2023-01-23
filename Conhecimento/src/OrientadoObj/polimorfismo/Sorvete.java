package OrientadoObj.polimorfismo;

public class Sorvete {
    
    private double peso;

    // construtor
    public Sorvete( double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso >= 0) {
        this.peso = peso;
        }

    }
}
