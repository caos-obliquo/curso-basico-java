package com.loiane.cursojava.aula29;

public class Carro {
    // classes - Aula 24
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    // método_simples - Aula 25
    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");
    }

    // método_com_retorno - Aula 26
    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capacidadeCombustivel * consumoCombustivel;
    }

    // método_com_parâmetros - Aula 27
    double calculaCombustivel(double km) {

        double quantidadeCombustivel = km / consumoCombustivel;

        return quantidadeCombustivel;

    }
}

