package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int matricula;
    private String situacao;
    private String nome;
    private String dtNascimento;
    private char sexo;
    private char endEstado;
    private String endCidade;
    private String endLogradouro;
    private int endNumero;
    
    private List<Cursa> conjCursas;

    private static List<Aluno> armazenaAlunos = new ArrayList<>();

    public Aluno(int matricula, String nome, String dtNascimento, char sexo, char endEstado, String endCidade, String endLogradouro, int endNumero) {
        super();
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setDtNascimento(dtNascimento);
        this.setSexo(sexo);
        this.setEndEstado(endEstado);
        this.setEndCidade(endCidade);
        this.setEndLogradouro(endLogradouro);
        this.setEndNumero(endNumero);
        this.conjCursas = new ArrayList<>();
        this.cadastrar();
        Aluno.guardarAluno(this);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public char getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(char endEstado) {
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

    public List<Cursa> getConjCursas() {
		return new ArrayList<>(this.conjCursas);
	}

    public void setConjCursas(List<Cursa> conjCursas) {
        this.conjCursas = conjCursas;
    }

    public void adicionarCursa(Cursa novaCursa) {
		this.conjCursas.add(novaCursa);
	}

	public void removerCursa(Cursa exCursa) {
		this.conjCursas.remove(exCursa);
	}

    public static void guardarAluno(Aluno novoAluno) {
		Aluno.armazenaAlunos.add(novoAluno);
	}

	public static void retirarAluno(Aluno exAluno) {
		Aluno.armazenaAlunos.remove(exAluno);
	}

	public static Aluno selecionarAluno(int matrAluno) {
	    for (Aluno aluno : armazenaAlunos)
            if (aluno.getMatricula() == matrAluno)
                return aluno;

        return null;
    }

    public void cadastrar() {
        this.setSituacao("Ativo");
    }

    public void matricular() {
        this.setSituacao("Matriculado");
    }

    public void suspender() {
        this.setSituacao("Suspenso");
    }

    public void reabilitar() {
        this.setSituacao("Matriculado");
    }

    public void formar() {
        this.setSituacao("Formado");
    }

    public static void finalizar(Aluno objAluno) {
        Aluno.retirarAluno(objAluno);
    }
}