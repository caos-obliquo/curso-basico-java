package com.loiane.cursojava.aula29;

public class Carro {
    // classes - Aula 24
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    // construtores
    Carro() {

        System.out.println("Classe carro foi instanciada.");
        numeroDePassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numeroDePassageiros_, double capacidadeCombustivel_,
          double consumoCombustivel_) {

        marca = marca_;
        modelo = modelo_;
        numeroDePassageiros = numeroDePassageiros_;
        capacidadeCombustivel = capacidadeCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capacidadeCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {

        double quantidadeCombustivel = km / consumoCombustivel;

        return quantidadeCombustivel;

    }
}

