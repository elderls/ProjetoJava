package OrientadoObj.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("ELDER", "SOUZA", -30);

        // alterar = setters
        p1.setIdade(-150);
    
        // ler = getters
        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.print(p1.getNomeCompleto());
    }
}
