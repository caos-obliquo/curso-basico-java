package com.loiane.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        // Polimorfismo em tempo de compilação.

        MinhaCalculadora calculadora = new MinhaCalculadora();

        calculadora.soma(1, 2);
        calculadora.soma(1.0, 2.0);
    }
}
