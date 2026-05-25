package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int id;
    private int qtdAluno;
    private String turno;
    private String situacao;
    
    private Disciplina disciplina;
    private Professor professor;
    private List<Cursa> conjCursas;
    private List<Prova> conjProvas;

    private static List<Turma> armazenaTurmas = new ArrayList<>();

    public Turma(int id, int qtdAluno, String turno, String situacao, Disciplina disciplina, Professor professor) {
        super();
        this.setId(id);
        this.setQtdAluno(qtdAluno);
        this.setTurno(turno);
        this.setDisciplina(disciplina);
        this.setProfessor(professor);
        this.conjCursas = new ArrayList<>();
        this.conjProvas = new ArrayList<>();
        this.cadastrar();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdAluno() {
        return qtdAluno;
    }

    public void setQtdAluno(int qtdAluno) {
        this.qtdAluno = qtdAluno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Cursa> getConjCursas() {
        return new ArrayList<>(this.conjCursas);
    }

    public void setConjCursas(List<Cursa> conjCursas) {
        this.conjCursas = conjCursas;
    }

    public void adicionarCursa(Cursa novoCursa) {
        this.conjCursas.add(novoCursa);
    }

    public void removerCursa(Cursa exCursa) {
        this.conjCursas.remove(exCursa);
    }

    public List<Prova> getConjProvas() {
        return new ArrayList<>(this.conjProvas);
    }

    public void setConjProvas(List<Prova> conjProvas) {
        this.conjProvas = conjProvas;
    }

    public void adicionarProva(Prova novaProva) {
        this.conjProvas.add(novaProva);
    }

    public void removerProva(Prova exProva) {
        this.conjProvas.remove(exProva);
    }

    public static void guardarTurma(Turma novaTurma) {
        Turma.armazenaTurmas.add(novaTurma);
    }

    public static void retirarTurma(Turma exTurma) {
        Turma.armazenaTurmas.remove(exTurma);
    }

    public static Turma selecionarTurma(int idTurma) {
        for (Turma objTurma : armazenaTurmas)
            if (objTurma.getId() == idTurma)
                return objTurma;

        return null;
    }

    public void cadastrar() {
        this.setSituacao("Ativa");
    }

    public void abrirVagas() {
        this.setSituacao("Disponível");
    }

    public void PreencherVagas() {
        this.setSituacao("Completa");
    }

    public static void finalizar(Turma objTurma) {
        Turma.retirarTurma(objTurma);
    }
}