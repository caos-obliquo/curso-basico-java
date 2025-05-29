package com.loiane.cursojava.aula40;

public class Professor extends Pessoa {

    private String salario;
    private String nomeCurso;

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

    // Sobrescrevendo/sobrepondo métodos (overrides).
    public String obterEtiquetaEndereco() {

        String s = "Endereço do Professor: ";
        s += super.getEndereco();

        return s;
    }
}
