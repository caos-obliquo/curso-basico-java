package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula54.DiaSemana;
// Classe demonstrando como iterar sobre os valores de um enum.
// * Mostra duas formas de percorrer todos os valores de um enum.

// Pontos chaves:
// Metodo valuesof() é estático, que retorna um array com todas as constantes do outro.
// Ambos os loops produzem o mesmo resultado, mas o for-each(melhorado) é mais legível.
public class TesteEnum {
    public static void main(String[] args) {

        // Obtém um array com todos os elementos do enum DiaSemana.
        DiaSemana[] dias = DiaSemana.values();

        // Forma 1: Loop tradicional com índice.
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        // Forma 2: Loop for-each (recomendado)
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}
