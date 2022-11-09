package Exercicios;

import javax.naming.spi.DirStateFactory.Result;

public class ChamadorProduto {
    public static void main(String[] args) {
        
        Produto prod = new Produto();
        prod.nome = "sapato";
        prod.preço = 15.00;

        System.out.println(prod.nome);
        System.out.println("Desconto padrão " + prod.descontoPadrao());
        System.out.println("Desconto especial " + prod.descontoPadrao(0.35));
    }
}
