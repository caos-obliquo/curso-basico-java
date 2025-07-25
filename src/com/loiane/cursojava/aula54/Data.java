package com.loiane.cursojava.aula54;

public class Data {
    // Classe que representa uma data com dia, mês, ano e dia da semana.
    //  Demonstra o uso de um enum (DiaSemana) como atributo.
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana; // Atributo do tipo enum.

    public Data() {
    }

    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
}
