package model;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private int id;
    private String data;
    private int qtdQuestao;
    private double notaMax;
    private double peso;
    private String situacao;
    
    private Turma turma;
    private List<Realiza> conjRealizas;

    private static List<Prova> armazenaProvas = new ArrayList<>();

    public Prova(int id, String data, int qtdQuestao, double notaMax, double peso, Turma turma) {
        super();
        this.setId(id);
        this.setData(data);
        this.setQtdQuestao(qtdQuestao);
        this.setNotaMax(notaMax);
        this.setPeso(peso);
        this.setTurma(turma);
        this.conjRealizas = new ArrayList<>();
        this.cadastrar();
        Prova.guardarProva(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtdQuestao() {
        return qtdQuestao;
    }

    public void setQtdQuestao(int qtdQuestao) {
        this.qtdQuestao = qtdQuestao;
    }

    public double getNotaMax() {
        return notaMax;
    }

    public void setNotaMax(double notaMax) {
        this.notaMax = notaMax;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public static void guardarProva(Prova novaProva) {
        Prova.armazenaProvas.add(novaProva);
    }

    public static void retirarProva(Prova exProva) {
        Prova.armazenaProvas.remove(exProva);
    }

    public static Prova selecionarProva(int idProva) {
        for (Prova objProva : armazenaProvas)
            if (objProva.getId() == idProva)
                return objProva;

        return null;
    }

    public void cadastrar() {
        this.setSituacao("Análise");
    }

    public void reprovar() {
        this.setSituacao("Reprovada");
    }

    public void aprovar() {
        this.setSituacao("Aprovada");
    }

    public void aplicar() {
        this.setSituacao("Aplicada");
    }

    public void corrigir() {
        this.setSituacao("Corrigida");
    }

    public void rever() {
        this.setSituacao("Revista");
    }

    public static void finalizar(Prova objProva) {
        Prova.retirarProva(objProva);
    }
}