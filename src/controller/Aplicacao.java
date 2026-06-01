package controller;

import model.*;

public class Aplicacao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Anna Clara", "29/08/2005", 'F', 'R', "Rio de Janeiro", "Rua A", 10);
        Aluno a2 = new Aluno(2, "Isabelle", "21/06/2006", 'F', 'R', "Rio de Janeiro", "Rua B", 20);
        Aluno a3 = new Aluno(3, "João Pedro", "16/12/1900", 'M', 'R', "Rio de Janeiro", "Rua C", 30);
        Aluno a4 = new Aluno(4, "Laura", "14/02/2004", 'F', 'R', "Rio de Janeiro", "Rua D", 40);
        Aluno a5 = new Aluno(5, "Nivaldo", "19/01/1988", 'M', 'R', "Rio de Janeiro", "Rua E", 50);

        Professor p1 = new Professor(101, "Claudia", "01/01/1980", 'F', "Matemática", "RJ", "Rio de Janeiro", "Rua X", 100);
        Professor p2 = new Professor(102, "Thereza", "01/01/1981", 'F', "História", "RJ", "Rio de Janeiro", "Rua Y", 200);
        Professor p3 = new Professor(103, "George", "01/01/1982", 'M', "Física", "RJ", "Rio de Janeiro", "Rua Z", 300);
        Professor p4 = new Professor(104, "Ricardo", "01/01/1983", 'M', "Química", "RJ", "Rio de Janeiro", "Rua W", 400);
        Professor p5 = new Professor(105, "Sonia", "01/01/1984", 'F', "Biologia", "RJ", "Rio de Janeiro", "Rua V", 500);

        Disciplina d1 = new Disciplina(1, "Banco de Dados", 80);
        Disciplina d2 = new Disciplina(2, "Desenvolvimento Web", 60);
        Disciplina d3 = new Disciplina(3, "Engenharia de Software", 80);
        Disciplina d4 = new Disciplina(4, "Empreendedorismo", 80);
        Disciplina d5 = new Disciplina(5, "Gestão da Informação", 60);

        Turma t1 = new Turma(1, 30, "Manhã", d1, p1);
        Turma t2 = new Turma(2, 30, "Tarde", d2, p2);
        Turma t3 = new Turma(3, 30, "Manhã", d3, p3);
        Turma t4 = new Turma(4, 30, "Noite", d4, p4);
        Turma t5 = new Turma(5, 30, "Manhã", d5, p5);

        Cursa c1 = new Cursa(1, 2026, 1, 1, "01/02/2026", "30/06/2026", a1, t1);
        Cursa c2 = new Cursa(2, 2026, 1, 1, "01/02/2026", "30/06/2026", a2, t2);
        Cursa c3 = new Cursa(3, 2026, 1, 1, "01/02/2026", "30/06/2026", a3, t3);
        Cursa c4 = new Cursa(4, 2026, 1, 1, "01/02/2026", "30/06/2026", a4, t4);
        Cursa c5 = new Cursa(5, 2026, 1, 1, "01/02/2026", "30/06/2026", a5, t5);

        Prova pr1 = new Prova(1, "15/04/2026", 10, 10.0, 1.0, t1);
        Prova pr2 = new Prova(2, "16/04/2026", 10, 10.0, 1.0, t2);
        Prova pr3 = new Prova(3, "17/04/2026", 10, 10.0, 1.0, t3);
        Prova pr4 = new Prova(4, "18/04/2026", 10, 10.0, 1.0, t4);
        Prova pr5 = new Prova(5, "19/04/2026", 10, 10.0, 1.0, t5);

        Realiza r1 = new Realiza(1, 9.5, 9, 1, c1, pr1);
        Realiza r2 = new Realiza(2, 8.0, 8, 2, c2, pr2);
        Realiza r3 = new Realiza(3, 7.5, 7, 3, c3, pr3);
        Realiza r4 = new Realiza(4, 6.0, 6, 4, c4, pr4);
        Realiza r5 = new Realiza(5, 10.0, 10, 0, c5, pr5);

        System.out.println("--- ALUNOS ---");
        for (int i = 1; i <= 5; i++) {
            Aluno aluno = Aluno.selecionarAluno(i);
            if (aluno != null) {
                System.out.println("Matrícula: " + aluno.getMatricula() + " | Nome: " + aluno.getNome() + " | Situação: " + aluno.getSituacao());
            }
        }

        System.out.println("\n--- PROFESSORES ---");
        // Professores começam do ID 101
        for (int i = 101; i <= 105; i++) {
            Professor prof = Professor.selecionarProfessor(i);
            if (prof != null) {
                System.out.println("Matrícula: " + prof.getMatricula() + " | Nome: " + prof.getNome() + " | Especialidade: " + prof.getEspecialidade());
            }
        }

        System.out.println("\n--- DISCIPLINAS ---");
        for (int i = 1; i <= 5; i++) {
            Disciplina disc = Disciplina.selecionarDisciplina(i);
            if (disc != null) {
                System.out.println("ID: " + disc.getId() + " | Nome: " + disc.getNome() + " | Carga Horária: " + disc.getCargaHoraria() + "h");
            }
        }

        System.out.println("\n--- TURMAS ---");
        for (int i = 1; i <= 5; i++) {
            Turma turma = Turma.selecionarTurma(i);
            if (turma != null) {
                System.out.println("Turma ID: " + turma.getId() + " | Turno: " + turma.getTurno() + " | Disciplina: " + turma.getDisciplina().getNome() + " | Professor: " + turma.getProfessor().getNome());
            }
        }

        System.out.println("\n--- MATRÍCULAS EM TURMAS (CURSA) ---");
        for (int i = 1; i <= 5; i++) {
            Cursa cursa = Cursa.selecionarCursa(i);
            if (cursa != null) {
                System.out.println("ID: " + cursa.getId() + " | Aluno: " + cursa.getAluno().getNome() + " | Turma ID: " + cursa.getTurma().getId() + " | Período: " + cursa.getPeriodo());
            }
        }

        System.out.println("\n--- PROVAS ---");
        for (int i = 1; i <= 5; i++) {
            Prova prova = Prova.selecionarProva(i);
            if (prova != null) {
                System.out.println("Prova ID: " + prova.getId() + " | Data: " + prova.getData() + " | Turma ID: " + prova.getTurma().getId() + " | Situação: " + prova.getSituacao());
            }
        }

        System.out.println("\n--- NOTAS DE PROVAS (REALIZA) ---");
        for (int i = 1; i <= 5; i++) {
            Realiza realiza = Realiza.selecionarRealiza(i);
            if (realiza != null) {
                System.out.println("Realiza ID: " + realiza.getId() + " | Aluno: " + realiza.getCursa().getAluno().getNome() + " | Prova ID: " + realiza.getProva().getId() + " | Nota: " + realiza.getNota() + " | Acertos: " + realiza.getQtdAcerto());
            }
        }
    }
}