package com.loiane.cursojava.aula30;

public class Carro {

    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;


    public Carro(String marca, String modelo, int numeroDePassageiros, double capacidadeCombustivel,
                 double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    public Carro(String marca, int numeroDePassageiros, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDePassageiros = numeroDePassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");

    }

    public Carro(String marca, String modelo) {
        this(marca, 10, modelo);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel * this.consumoCombustivel + "km");
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    double calculaCombustivel(double km) {

        double quantidadeCombustivel = km / this.consumoCombustivel;

        return quantidadeCombustivel;

    }
}
