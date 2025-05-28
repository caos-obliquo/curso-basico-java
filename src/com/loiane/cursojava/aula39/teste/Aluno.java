package com.loiane.cursojava.aula39.teste;

import com.loiane.cursojava.aula39.Pessoa;

public class Aluno  extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {

        this.nomeVisibilidade = "Jesse";
        super.nomeVisibilidade = "Jesse";

        super.setNomeVisibilidade("Jesse");
    }

    public Aluno() {
        super();
    }

    // Inserindo 'String curso' manualmente
    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("99999999999");

        this.setCpf("99999999999");
    }
}
