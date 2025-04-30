package com.loiane.cursojava.aula32;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.setMarca("Fiat"); // set para setar o valor

        System.out.println(van.getMarca()); // get para obter o valor
    }
}
