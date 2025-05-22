package com.loiane.cursojava.aula34;

public class TesteCalculadora {
    // variáveis e methods estáticos

    static int resultadoSoma;

    public static void main(String[] args) {

        resultadoSoma = MinhaCalculadora.soma(1, 2);

        // MinhaCalculadora calculadora = new MinhaCalculadora();

        // calculadora.somar(1, 2);

        soma2Valores(1, 2);

        MinhaCalculadora.soma(1, 2);
    }

    static int soma2Valores(int numero1, int numero2){
        return MinhaCalculadora.soma(1, 2);
    }
}
