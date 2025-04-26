package com.loiane.cursojava.aula24.labs;

public class Exercicio01 {
    public static void main(String[] args) {
    /*
    01 - Escreva uma classe para representar uma lâmpada está à venda em um supermercado.
     */

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.preco = 8.14;
        lampada.consumoEnergia = 14.4;

        lampada.tipos = new String[2];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

    }
}