import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma("Turma 1");

        int opcao;
        do {
            System.out.println("SISTEMA ESCOLAR");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Buscar aluno por matrícula");
            System.out.println("4. Remover aluno");
            System.out.println("5. Calcular média da turma");
            System.out.println("6. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    turma.adicionarAluno(new Aluno(nome, matricula, nota));
                    System.out.println("Aluno adicionado!");
                    break;

                case 2:
                    turma.listarAlunos();
                    break;

                case 3:
                    System.out.print("Digite a matrícula: ");
                    int matBusca = sc.nextInt();
                    Aluno encontrado = turma.buscarAlunoPorMatricula(matBusca);
                    if (encontrado != null) {
                        encontrado.exibirInfo();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a matrícula do aluno a remover: ");
                    int matRemove = sc.nextInt();
                    turma.removerAluno(matRemove);
                    break;

                case 5:
                    System.out.println("Média da turma: " + turma.calcularMediaTurma());
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 6);

        sc.close();
    }
}