package com.loiane.cursojava.aula56.labs;
/**
 * 01 - Escreva um Enum que represente as quatro operações matemáticas: somar, subtrair, multiplicar e dividir.
 * O Enum deve ter um construtor que receba o símbolo da operação ('+', '-', '*' e '/'). Sobrescreva o metodo
 * toString() que retorne somente o símbolo da operação. Implemente um metodo abstrato com a seguinte assinatura
 * double executarOperacao(double x, double y). Cada opção do Enum deve implementar esse metodo realizando a
 * operação de acordo com a descrição. Escreva um metodo main para teste que realize todas as operações do Enum.
 * Dica: você pode usar o metodo values para iterar o Enum e executar todas as operações.
 */
public class Exercicio01 {

    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {

        double x = 2.0;
        double y = 3.0;

        for (Operacao op : Operacao.values()) {
            System.out.println(x + " " + op + " " + y + " = " + op.executarOperacao(x, y));
        }
    }
}
