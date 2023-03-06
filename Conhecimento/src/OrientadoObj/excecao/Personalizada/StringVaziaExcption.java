package OrientadoObj.excecao.Personalizada;

public class StringVaziaExcption extends RuntimeException{
 
    private String nomeDoAtributo;

    public StringVaziaExcption(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' esta vazio ", nomeDoAtributo);
    }
}
