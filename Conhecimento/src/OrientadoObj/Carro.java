package OrientadoObj;

public class Carro {
    Motor motor = new Motor();
// teste git
    void acelerar() {
        if(motor.fatorinj < 2.6) {
        motor.fatorinj += 0.4;
        }
    }

    void frear() {
        if(motor.fatorinj > 0.5) {
            motor.fatorinj -= 0.4;
        } 
        
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean ligado() {
        return motor.ligado;
    }
}
