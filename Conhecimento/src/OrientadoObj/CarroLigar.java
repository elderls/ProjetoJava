package OrientadoObj;

public class CarroLigar {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.ligado());

        c1.ligar();
        System.out.println(c1.ligado());

        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.frear();
        System.out.println(c1.motor.giros());

    }
}
