package com.loiane.cursojava.aula53;

public class Teste {
    // Classes de teste para demonstrar:
    // 1 - Uso de constantes (int) vs enums.
    // 2 - Sobrecarga de métodos (overloading) com tipos diferentes.
    // 3 - Switch statements com enums e inteiros.

    // Boa prática:
    // Use enums para representar conjuntos fixos de valores (como dias da semana, estados e etc).
    // Evite constantes "solutas" quando possível.
    public static void main(String[] args) {

        usandoConstantes();

        System.out.println();

        usandoEnum();
    }

    public static void usandoConstantes() {

        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(int dia) {
        // Demonstra uso de constantes para representar os dias da semana.
        // O problema é que os números são "mágicos" (não há garantia de que 1 sempre será segunda-feira).
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum() {
        // Demonstra o uso de enums para representar os dias da semana.
        // A vantagem é que o compilador garante que apenas valores válidos estão sendo usados.
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Teste utilizando enum no Java");
        imprimeDiaSemana(segunda); // Chama métodos para enum (overloading).
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }

    private static void imprimeDiaSemana(DiaSemana dia) {

        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}
