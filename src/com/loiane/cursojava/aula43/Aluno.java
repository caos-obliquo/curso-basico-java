package com.loiane.cursojava.aula43;

public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    // Inserindo 'String curso' manualmente
    public Aluno(String nome, String endereco, String telefone, String curso) {
        // super(nome, endereco, telefone);
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
        // super.setCpf("99999999999");

        // this.setCpf("99999999999");
    }

    // Sobrescrevendo/sobrepondo métodos (overrides).
    public String obterEtiquetaEndereco() {

        String s = "Endereço do Aluno: ";
        // s += super.getEndereco();

        return s;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println(this.obterEtiquetaEndereco());
    }

    /* public String toString(){
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }

        return s;
    } */

    // Comando Alt + Insert.
    /* @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}'; */

    // Comando Alt + Insert.
    // Alterando a formatação do construtor generado 'equals'.
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        Aluno other = (Aluno) o;

        if (curso.equalsIgnoreCase(other.getCurso())) {

        }
        return true;
    }
}
