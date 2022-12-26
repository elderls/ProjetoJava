package OrientadoObj;

import java.util.ArrayList;

public class Comprar {
    public static final String Comprar = null;

    String cliente;

    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem( String nome, int qtd, double preco) {
        this.adicionarItem(nome, qtd, preco);
    }

    void adicionarItem (Item, item) {
        this.itens.add(item);
        item.Comprar= this;
    }

    double getValorTotal() {
        double total = 0;
        for(Item item: itens) {
            total += item.qtd * item.preço;
        }

        return total;
    }
}
