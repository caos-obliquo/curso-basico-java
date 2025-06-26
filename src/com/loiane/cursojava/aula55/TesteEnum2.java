package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula53.DiaSemana;
// Classe demonstrando como converter uma String para um enum.
// * Útil quando recebemos dados externos (ex: input do usuário).

// Pontos chave:
// Enum.valueOf(): Metodo estático que converte uma String no enum correspondente.
// Importante: A String deve corresponder exatamente ao nome da constante (case-sensitive).
// Se a String não existir no enum, lança IllegalArgumentException.
public class TesteEnum2 {
    public static void main(String[] args) {

        // Converte a String "DOMINGO" para o enum DiaSemana.DOMINGO
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        // Armazena o valor convertido em uma variável
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}
