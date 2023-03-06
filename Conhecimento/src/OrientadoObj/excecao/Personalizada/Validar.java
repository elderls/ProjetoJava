package OrientadoObj.excecao.Personalizada;

public class Validar {
    
    private Validar() {}
    

    public static void aluno(Aluno aluno) {

        if (aluno == null) {
            throw new IllegalArgumentException("O aluno esta nulo!");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaExcption("nome");
        } 

        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloException("nota");
        }
    }


}
