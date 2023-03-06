package OrientadoObj.excecao.Personalizada;

public class Aluno {
    public final String nome;
    public final double nota; 
    public final boolean bomComportamento; 


    
    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }


    public Aluno(String nome, double nota, boolean b) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = b;
    }
    
    public String toString() {
        return nome + " tem nota " + nota;
    }
}
