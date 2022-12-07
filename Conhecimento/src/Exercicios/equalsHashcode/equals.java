package Exercicios.equalsHashcode;
 

public class equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Elder Lima";
        u1.email = "elder.lima@spfc.com";

        Usuario u2 = new Usuario();
        u2.nome = "Elder Lima";
        u2.email = "elder.lima@spfc.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        // tratamento de valores diferente da tipagem da class

    }
}
