package com.loiane.cursojava.aula24.labs;

public class TesteLampada {
    public static void main(String[] args) {
    /*
    01 - Escreva uma classe para representar uma lâmpada está à venda em um supermercado.
     */

        Lampada fluorescente = new Lampada();

        fluorescente.cor = "Branca";
        fluorescente.preco = 8.14;
        fluorescente.consumoEnergia = 14.4;
        fluorescente.watts = 80;
    }
}