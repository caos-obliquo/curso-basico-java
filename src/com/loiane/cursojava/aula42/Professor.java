package com.loiane.cursojava.aula42;

public class Professor {

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
        // s += super.getEndereco();

        return s;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endereço do professor: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
