package com.loiane.cursojava.aula33.labs;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        01 - Escreva uma classe para representar uma lâmpada. Desenvolva métods para ligar e desligar a lâmpada.
        */

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();

        // complemento para ter uma visualização melhor
        System.out.println("Estado inicial: " + lampada.isLigada());
        lampada.ligar();
        System.out.println("Após ligar: " + lampada.isLigada());
        lampada.mudarEstado();
        System.out.println("Após mudar estado: " + lampada.isLigada());
    }
}
