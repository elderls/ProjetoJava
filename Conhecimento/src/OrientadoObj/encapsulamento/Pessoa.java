package OrientadoObj.encapsulamento;


public class Pessoa {
    private String nome;
    private String sobrenome;



    private int idade;

    // Construtor da classe
    public Pessoa(String nome , String sobrenome, int idade){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    // metodos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        // valor absoluto
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120 ) {
            this.idade = novaIdade;
        }
    }

    public String toString() {
        return "Meu nome é " + getNome() + " e minha idade é " + getIdade() + " anos.";
    }
}
