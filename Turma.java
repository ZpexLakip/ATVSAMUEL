import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno a : alunos) {
                a.exibirInfo();
            }
        }
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                return a;
            }
        }
        return null; 
    }

    public void removerAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public double calcularMediaTurma() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma / alunos.size();
    }
}