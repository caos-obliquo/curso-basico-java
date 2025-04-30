package com.loiane.cursojava.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    private double consumoCombustivel;

    public void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel * this.consumoCombustivel + "km");
    }

    public double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel (double km) {

        return km/this.consumoCombustivel;
    }

    public double calculaCombustivel(double km) {

        return this.divideKMPorConsumoCombustivel(km);

    }
}
