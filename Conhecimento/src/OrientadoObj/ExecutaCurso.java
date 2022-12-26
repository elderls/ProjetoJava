package OrientadoObj;

public class ExecutaCurso {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno ("Luana");
        Aluno aluno2 = new Aluno ("Maria");
        Aluno aluno3 = new Aluno ("Larissa");
        Aluno aluno4 = new Aluno ("Luan");

        Curso curso1 = new Curso("java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("rubi");

        curso1.adicionarAluno(aluno4);
        curso1.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno1);

        Curso  EncontraNomeCurso = aluno4.obterCursoNome("java");

        if(EncontraNomeCurso != null){
            System.out.println("Alunos do Curso " +  EncontraNomeCurso.alunos);
        }

        for(Aluno aluno: curso1.alunos) {
            System.out.println("Aluno(a) matriculado(a) " + aluno.nome + " no curso " + curso1.nome);
        }
        
        System.out.println(aluno1.cursos.get(0).alunos);


    }
}
