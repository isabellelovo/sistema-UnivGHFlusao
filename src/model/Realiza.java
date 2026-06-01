package model;

import java.util.ArrayList;
import java.util.List;

public class Realiza {
    private int id;
    private double nota;
    private int qtdAcerto;
    private int qtdErro;
    
    private Cursa cursa;
    private Prova prova;

    private static List<Realiza> armazenaRealizas = new ArrayList<>();

    public Realiza(int id, double nota, int qtdAcerto, int qtdErro, Cursa cursa, Prova prova) {
        super();
        this.setId(id);
        this.setNota(nota);
        this.setQtdAcerto(qtdAcerto);
        this.setQtdErro(qtdErro);
        this.setCursa(cursa);
        this.setProva(prova);
        Realiza.guardarRealiza(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getQtdAcerto() {
        return qtdAcerto;
    }

    public void setQtdAcerto(int qtdAcerto) {
        this.qtdAcerto = qtdAcerto;
    }

    public int getQtdErro() {
        return qtdErro;
    }

    public void setQtdErro(int qtdErro) {
        this.qtdErro = qtdErro;
    }

    public Cursa getCursa() {
        return cursa;
    }

    public void setCursa(Cursa cursa) {
        this.cursa = cursa;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public static void guardarRealiza(Realiza novaRealiza) {
        Realiza.armazenaRealizas.add(novaRealiza);
    }

    public static void retirarRealiza(Realiza exRealiza) {
        Realiza.armazenaRealizas.remove(exRealiza);
    }

    public static Realiza selecionarRealiza(int idRealiza) {
        for (Realiza objRealiza : armazenaRealizas)
            if (objRealiza.getId() == idRealiza)
                return objRealiza;

        return null;
    }
}