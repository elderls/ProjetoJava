package OrientadoObj.Desafio1;


public class ClienteTeste {


    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 5,15);
        compra1.adicionarItem(new Produto("Celular", 1850.78), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem(  "borracha", 2.36, 30);
        compra2.adicionarItem(new Produto("fone de ouvido", 18.15), 5);


        Cliente cliente = new Cliente("Luana");
        // add compra forma "tradicional"
        cliente.compras.add(compra1);
        // add compra por uma função
        cliente.adicionarCompra(compra2);
    
        // System.out.println(cliente.ObterValorTotal());

    }
}
