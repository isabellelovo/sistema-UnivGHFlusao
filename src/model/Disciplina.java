package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private float cargaHoraria;
    
    private List<Turma> conjTurmas;

    private static List<Disciplina> armazenaDisciplinas = new ArrayList<>();

    public Disciplina(int id, String nome, float cargaHoraria) {
        super();
        this.setId(id);
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.conjTurmas = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Turma> getConjTurmas() {
        return new ArrayList<>(this.conjTurmas);
    }

    public void setConjTurmas(List<Turma> conjTurmas) {
        this.conjTurmas = conjTurmas;
    }

    public void adicionarTurma(Turma novaTurma) {
        this.conjTurmas.add(novaTurma);
    }

    public void removerTurma(Turma exTurma) {
        this.conjTurmas.remove(exTurma);
    }

    public static void guardarDisciplina(Disciplina novaDisciplina) {
        Disciplina.armazenaDisciplinas.add(novaDisciplina);
    }

    public static void retirarDisciplina(Disciplina exDisciplina) {
        Disciplina.armazenaDisciplinas.remove(exDisciplina);
    }

    public static Disciplina selecionarDisciplina(int idDisciplina) {
        for (Disciplina objDisciplina : armazenaDisciplinas)
            if (objDisciplina.getId() == idDisciplina)
                return objDisciplina;

        return null;
    }
}