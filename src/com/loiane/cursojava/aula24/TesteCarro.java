package com.loiane.cursojava.aula24;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroDePassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double quantidadeCombustivel10 = van.calculaCombustivel(10);
        double quantidadeCombustivel15 = van.calculaCombustivel(15);
        System.out.println("quantidadeCombustivel10 = " + quantidadeCombustivel10);
        System.out.println("quantidadeCombustivel15 = " + quantidadeCombustivel15);
    }
}
