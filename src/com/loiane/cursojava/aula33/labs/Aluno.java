package com.loiane.cursojava.aula33.labs;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][]notasDisciplinas;

    public Aluno() {

        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,
                 double[][] notasDisciplinas) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNomeCurso(nomeCurso);
        this.setNomeDisciplinas(nomeDisciplinas);
        this.setNotasDisciplinas(notasDisciplinas);
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    void mostrarInfo() {

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        }

        return false;
    }

    private double obterMedia(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }

    public void setNomeDiscplinaPosicao(int posicao, String nomeDisciplina) {
        this.nomeDisciplinas[posicao] = nomeDisciplina;
    }

    public void setNomePosicaoIJ(int posicaoI, int posicaoJ, double nota) {
        this.notasDisciplinas[posicaoI][posicaoJ] = nota;
    }
}
