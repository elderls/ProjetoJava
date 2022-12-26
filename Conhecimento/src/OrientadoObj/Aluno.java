package OrientadoObj;

import java.util.ArrayList;

public class Aluno {
    final String nome;

    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);

    }

    Curso obterCursoNome(String nome) {
        for(Curso curso: this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    // Para mostrar apenas o nome do aluno, e n e endereço de memoria

    public String toString() {
        return nome;
    }
}
