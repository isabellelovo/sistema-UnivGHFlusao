package model;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int matricula;
    private String nome;
    private String dtNascimento;
    private char sexo;
    private String especialidade;
    private String endEstado;
    private String endCidade;
    private String endLogradouro;
    private int endNumero;
    
    private List<Turma> conjTurmas;

    private static List<Professor> armazenaProfessores = new ArrayList<>();

    public Professor(int matricula, String nome, String dtNascimento, char sexo, String especialidade, String endEstado, String endCidade, String endLogradouro, int endNumero) {
        super();
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setDtNascimento(dtNascimento);
        this.setSexo(sexo);
        this.setEspecialidade(especialidade);
        this.setEndEstado(endEstado);
        this.setEndCidade(endCidade);
        this.setEndLogradouro(endLogradouro);
        this.setEndNumero(endNumero);
        this.conjTurmas = new ArrayList<>();
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public String getEndLogradouro() {
        return endLogradouro;
    }

    public void setEndLogradouro(String endLogradouro) {
        this.endLogradouro = endLogradouro;
    }

    public int getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(int endNumero) {
        this.endNumero = endNumero;
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

    public static void guardarProfessor(Professor novoProfessor) {
        Professor.armazenaProfessores.add(novoProfessor);
    }

    public static void retirarProfessor(Professor exProfessor) {
        Professor.armazenaProfessores.remove(exProfessor);
    }

    public static Professor selecionarProfessor(int matrProfessor) {
        for (Professor objProfessor : armazenaProfessores)
            if (objProfessor.getMatricula() == matrProfessor)
                return objProfessor;

        return null;
    }
}