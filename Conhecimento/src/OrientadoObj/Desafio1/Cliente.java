package OrientadoObj.Desafio1;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double ObterValorTotal() {
        double total = 0 ;

        for(Compra comp: compras) {
            total += comp.ObterValorTotal();
        }

        return total;
    }

    


}
