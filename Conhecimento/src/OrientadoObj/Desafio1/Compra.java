package OrientadoObj.Desafio1;

import java.util.ArrayList;

public class Compra {
    
    final ArrayList<Item> itens = new ArrayList<>();


    void adicionarItem(Produto p, int qtd){
        this.itens.add(new Item(p, qtd));
    }

    void adicionarItem(String nome, double preco, int qtd){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtd));
    }


    double ObterValorTotal() {
        double TotalCompra = 0;

        for(Item item: itens) {
            TotalCompra += item.QtdItem * item.produto.preco;
        }
        return TotalCompra;
    }

    
}
