package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) throws Exception {
        // throws: declara que um method pode lançar exceções.
        // Quem chama o method, deve tratrar ou delegar a exceção.
        // Muito útil em APIs e métodos utilitários.

        // Boas práticas:
        // Exceptions unchecked (RuntimeException), não precisam de throws.
        // Em produção, evite printStackStrace(), use logs apropriados.
        // Sempre passar uma mensagem mais amigável ao usuário final.
        // Não expor detalhes internos do erro.

        System.out.println("Ente com um número decimal: ");
        try {
            double num = lerNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
