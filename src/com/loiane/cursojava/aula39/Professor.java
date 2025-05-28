package com.loiane.cursojava.aula39;

public class Professor extends Pessoa {

    private String salario;
    private String nomeCurso;

    public void verificarAcesso() {

        this.nomeVisibilidade = "Jesse";
        super.nomeVisibilidade = "Jesse";

        this.setNomeVisibilidade("Jesse");

    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}
