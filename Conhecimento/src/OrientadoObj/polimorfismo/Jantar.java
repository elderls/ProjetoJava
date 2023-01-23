package OrientadoObj.polimorfismo;

 

public class Jantar {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(99.00);

        Arroz  item1 = new  Arroz(0);
        Feijao item2 = new Feijao(0);

        System.out.print(p1.getPeso());
        p1.comer(item1);
        p1.comer(item2);
        System.out.print(p1.getPeso());



    }
}
