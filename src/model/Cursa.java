package model;

import java.util.ArrayList;
import java.util.List;

public class Cursa {
    private int id;
    private int ano;
    private int semestre;
    private int periodo;
    private String dtInicio;
    private String dtFim;
    
    private Aluno aluno;
    private Turma turma;
    private List<Realiza> conjRealizas;

    private static List<Cursa> armazenaCursas = new ArrayList<>();

    public Cursa(int id, int ano, int semestre, int periodo, String dtInicio, String dtFim, Aluno aluno, Turma turma) {
        super();
        this.setId(id);
        this.setAno(ano);
        this.setSemestre(semestre);
        this.setPeriodo(periodo);
        this.setDtInicio(dtInicio);
        this.setDtFim(dtFim);
        this.setAluno(aluno);
        this.setTurma(turma);
        this.conjRealizas = new ArrayList<>();
        Cursa.guardarCursa(this);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List<Realiza> getConjRealizas() {
        return new ArrayList<>(this.conjRealizas);
    }

    public void setConjRealizas(List<Realiza> conjRealizas) {
        this.conjRealizas = conjRealizas;
    }

    public void adicionarRealiza(Realiza novaRealiza) {
        this.conjRealizas.add(novaRealiza);
    }

    public void removerRealiza(Realiza exRealiza) {
        this.conjRealizas.remove(exRealiza);
    }

    public static void guardarCursa(Cursa novaCursa) {
        Cursa.armazenaCursas.add(novaCursa);
    }

    public static void retirarCursa(Cursa exCursa) {
        Cursa.armazenaCursas.remove(exCursa);
    }

    public static Cursa selecionarCursa(int idCursa) {
        for (Cursa objCursa : armazenaCursas)
            if (objCursa.getId() == idCursa)
                return objCursa;

        return null;
    }
}