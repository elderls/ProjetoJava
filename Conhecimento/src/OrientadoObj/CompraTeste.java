package OrientadoObj;

public class CompraTeste {
    public static void main(String[] args) {
        
        Comprar C1 = new Comprar();
        
        C1.cliente = "João";
        C1.adicionarItem("Caneta", 10, 17.15);
        C1.adicionarItem("Borracha", 20, 13.99);
        C1.itens.add(new Item("Caderno", 5, 10.15));

        System.out.println(C1.itens.size());
        System.out.println(C1.getValorTotal());
    }
    }
