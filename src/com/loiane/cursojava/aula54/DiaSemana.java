package com.loiane.cursojava.aula54;

public enum DiaSemana {
    //  Enum que representa os dias da semana com valores inteiros associados.
    // * Cada constante tem um valor numérico (ex: SEGUNDA = 1).
    // * Construtor privado (padrão para enums).

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor; // Valor associado a cada dia da semana respectivamente.

    public int getValor() {
        return valor;
    }

    // Construtor do enum, sempre privado.
    DiaSemana(int valor) {
        this.valor = valor;
    }
}
