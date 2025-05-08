package com.loiane.cursojava.aula33.labs;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        02 - Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa
        se ela é especial ou não, um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode
        realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou
        não. Desenvolvaum programa para testar essa classe.
        */
        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais.");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }

        System.out.println("Depósito de 500 reais.");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }
    }
}
